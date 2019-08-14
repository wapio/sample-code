package spring.doma.sample.entity;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PostDeleteContext;
import org.seasar.doma.jdbc.entity.PostInsertContext;
import org.seasar.doma.jdbc.entity.PostUpdateContext;
import org.seasar.doma.jdbc.entity.PreDeleteContext;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;

/**
 * 
 */
public class StudentListener implements EntityListener<Student> {

    @Override
    public void preInsert(Student entity, PreInsertContext<Student> context) {
    }

    @Override
    public void preUpdate(Student entity, PreUpdateContext<Student> context) {
    }

    @Override
    public void preDelete(Student entity, PreDeleteContext<Student> context) {
    }

    @Override
    public void postInsert(Student entity, PostInsertContext<Student> context) {
    }

    @Override
    public void postUpdate(Student entity, PostUpdateContext<Student> context) {
    }

    @Override
    public void postDelete(Student entity, PostDeleteContext<Student> context) {
    }
}