package spring.doma.sample.dao;

import java.math.BigDecimal;
import java.sql.Clob;

import org.seasar.doma.ClobFactory;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

import spring.doma.sample.entity.Document;

/**
 */
@Dao
@ConfigAutowireable
public interface DocumentDao {

    /**
     * @param id
     * @return the Document entity
     */
    @Select
    Document selectById(BigDecimal id);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Document entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Document entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Document entity);
    
    @ClobFactory
    Clob createClob();
}