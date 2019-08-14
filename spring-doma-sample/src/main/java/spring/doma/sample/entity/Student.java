package spring.doma.sample.entity;

import java.math.BigDecimal;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = StudentListener.class)
@Table(name = "STUDENT")
public class Student {

    /** */
    @Id
    @Column(name = "STUDENT_ID")
    BigDecimal studentId;

    /** */
    @Column(name = "NAME")
    String name;

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

    /** 
     * Returns the name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /** 
     * Sets the name.
     * 
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }
}