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
public class DocumentListener implements EntityListener<Document> {

    @Override
    public void preInsert(Document entity, PreInsertContext<Document> context) {
    }

    @Override
    public void preUpdate(Document entity, PreUpdateContext<Document> context) {
    }

    @Override
    public void preDelete(Document entity, PreDeleteContext<Document> context) {
    }

    @Override
    public void postInsert(Document entity, PostInsertContext<Document> context) {
    }

    @Override
    public void postUpdate(Document entity, PostUpdateContext<Document> context) {
    }

    @Override
    public void postDelete(Document entity, PostDeleteContext<Document> context) {
    }
}