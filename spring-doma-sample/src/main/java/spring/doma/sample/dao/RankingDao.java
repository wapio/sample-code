package spring.doma.sample.dao;

import java.math.BigDecimal;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

import spring.doma.sample.entity.Ranking;

/**
 */
@Dao
@ConfigAutowireable
public interface RankingDao {

    /**
     * @param id
     * @return the Ranking entity
     */
    @Select
    Ranking selectById(BigDecimal id);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Ranking entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Ranking entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Ranking entity);
}