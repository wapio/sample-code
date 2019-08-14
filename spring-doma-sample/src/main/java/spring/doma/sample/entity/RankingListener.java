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
public class RankingListener implements EntityListener<Ranking> {

    @Override
    public void preInsert(Ranking entity, PreInsertContext<Ranking> context) {
    }

    @Override
    public void preUpdate(Ranking entity, PreUpdateContext<Ranking> context) {
    }

    @Override
    public void preDelete(Ranking entity, PreDeleteContext<Ranking> context) {
    }

    @Override
    public void postInsert(Ranking entity, PostInsertContext<Ranking> context) {
    }

    @Override
    public void postUpdate(Ranking entity, PostUpdateContext<Ranking> context) {
    }

    @Override
    public void postDelete(Ranking entity, PostDeleteContext<Ranking> context) {
    }
}