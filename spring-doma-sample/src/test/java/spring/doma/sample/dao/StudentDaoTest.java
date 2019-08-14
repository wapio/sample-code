package spring.doma.sample.dao;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.NoArgsConstructor;

@RunWith(SpringRunner.class)
@SpringBootTest
@NoArgsConstructor
public class StudentDaoTest {

  @Autowired(required = false)
  private StudentDao dao;

  @Test
  public void test_connect() {

    dao.selectById(BigDecimal.ZERO);
  }
}
