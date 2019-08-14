package spring.doma.sample.entity;

import java.math.BigDecimal;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = RankingListener.class)
@Table(name = "RANKING")
public class Ranking {

    /** */
    @Id
    @Column(name = "ID")
    BigDecimal id;

    /** */
    @Column(name = "RANK")
    BigDecimal rank;

    /** */
    @Column(name = "STUDENT_ID")
    BigDecimal studentId;

    /** 
     * Returns the id.
     * 
     * @return the id
     */
    public BigDecimal getId() {
        return id;
    }

    /** 
     * Sets the id.
     * 
     * @param id the id
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /** 
     * Returns the rank.
     * 
     * @return the rank
     */
    public BigDecimal getRank() {
        return rank;
    }

    /** 
     * Sets the rank.
     * 
     * @param rank the rank
     */
    public void setRank(BigDecimal rank) {
        this.rank = rank;
    }

    /** 
     * Returns the studentId.
     * 
     * @return the studentId
     */
    public BigDecimal getStudentId() {
        return studentId;
    }

    /** 
     * Sets the studentId.
     * 
     * @param studentId the studentId
     */
    public void setStudentId(BigDecimal studentId) {
        this.studentId = studentId;
    }
}