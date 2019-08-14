package spring.doma.sample.entity;

import java.math.BigDecimal;
import java.sql.Clob;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = DocumentListener.class)
@Table(name = "DOCUMENT")
public class Document {

    /** */
    @Id
    @Column(name = "ID")
    BigDecimal id;

    /** */
    @Column(name = "CONTENT")
    Clob content;

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
     * Returns the content.
     * 
     * @return the content
     */
    public Clob getContent() {
        return content;
    }

    /** 
     * Sets the content.
     * 
     * @param content the content
     */
    public void setContent(Clob content) {
        this.content = content;
    }

    @Override
    public String toString() {
      return "Document [id=" + id + ", content=" + content + "]";
    }
}