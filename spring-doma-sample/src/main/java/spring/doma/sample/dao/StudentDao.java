package spring.doma.sample.dao;

import java.math.BigDecimal;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

import spring.doma.sample.entity.Student;

/**
 */
@Dao
@ConfigAutowireable
public interface StudentDao {

    /**
     * @param studentId
     * @return the Student entity
     */
    @Select
    Student selectById(BigDecimal studentId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Student entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Student entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Student entity);
}