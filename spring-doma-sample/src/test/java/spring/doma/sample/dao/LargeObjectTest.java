package spring.doma.sample.dao;

import java.math.BigDecimal;
import java.sql.Clob;
import java.sql.SQLException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import lombok.NoArgsConstructor;
import spring.doma.sample.entity.Document;

@SpringBootTest
@RunWith(SpringRunner.class)
@NoArgsConstructor
public class LargeObjectTest {

  @Autowired
  private DocumentDao dao;
  
  @Transactional
  @Test
  public void test_largetObjectTest() throws SQLException {

    Document document = dao.selectById(new BigDecimal(0));
    System.out.println(document.toString());
    
    Document putData = new Document();
    BigDecimal one = new BigDecimal(1);
    putData.setId(one);

    Clob clob = dao.createClob();
    assert 10 == clob.setString(1, "ok google.") : clob.getCharacterStream().toString();
    putData.setContent(clob);
    dao.insert(putData);

    Document rs = dao.selectById(one);
    System.out.println(rs.toString());
    System.out.println(rs.getContent().getSubString(1L, Integer.parseInt(String.valueOf(rs.getContent().length()))));
  }
}
