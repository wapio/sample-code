package spring.doma.sample.dao;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.Generated(value = { "Doma", "2.19.3" }, date = "2019-08-14T22:48:24.097+0900")
public class DocumentDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements spring.doma.sample.dao.DocumentDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.19.3");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(spring.doma.sample.dao.DocumentDao.class, "selectById", java.math.BigDecimal.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(spring.doma.sample.dao.DocumentDao.class, "insert", spring.doma.sample.entity.Document.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(spring.doma.sample.dao.DocumentDao.class, "update", spring.doma.sample.entity.Document.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(spring.doma.sample.dao.DocumentDao.class, "delete", spring.doma.sample.entity.Document.class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(spring.doma.sample.dao.DocumentDao.class, "createClob");

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public DocumentDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public spring.doma.sample.entity.Document selectById(java.math.BigDecimal id) {
        entering("spring.doma.sample.dao.DocumentDaoImpl", "selectById", id);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/spring/doma/sample/dao/DocumentDao/selectById.sql");
            __query.setEntityType(spring.doma.sample.entity._Document.getSingletonInternal());
            __query.addParameter("id", java.math.BigDecimal.class, id);
            __query.setCallerClassName("spring.doma.sample.dao.DocumentDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<spring.doma.sample.entity.Document> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<spring.doma.sample.entity.Document>(spring.doma.sample.entity._Document.getSingletonInternal()));
            spring.doma.sample.entity.Document __result = __command.execute();
            __query.complete();
            exiting("spring.doma.sample.dao.DocumentDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("spring.doma.sample.dao.DocumentDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public int insert(spring.doma.sample.entity.Document entity) {
        entering("spring.doma.sample.dao.DocumentDaoImpl", "insert", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<spring.doma.sample.entity.Document> __query = getQueryImplementors().createAutoInsertQuery(__method1, spring.doma.sample.entity._Document.getSingletonInternal());
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("spring.doma.sample.dao.DocumentDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = getCommandImplementors().createInsertCommand(__method1, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("spring.doma.sample.dao.DocumentDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("spring.doma.sample.dao.DocumentDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int update(spring.doma.sample.entity.Document entity) {
        entering("spring.doma.sample.dao.DocumentDaoImpl", "update", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoUpdateQuery<spring.doma.sample.entity.Document> __query = getQueryImplementors().createAutoUpdateQuery(__method2, spring.doma.sample.entity._Document.getSingletonInternal());
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("spring.doma.sample.dao.DocumentDaoImpl");
            __query.setCallerMethodName("update");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.UpdateCommand __command = getCommandImplementors().createUpdateCommand(__method2, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("spring.doma.sample.dao.DocumentDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("spring.doma.sample.dao.DocumentDaoImpl", "update", __e);
            throw __e;
        }
    }

    @Override
    public int delete(spring.doma.sample.entity.Document entity) {
        entering("spring.doma.sample.dao.DocumentDaoImpl", "delete", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoDeleteQuery<spring.doma.sample.entity.Document> __query = getQueryImplementors().createAutoDeleteQuery(__method3, spring.doma.sample.entity._Document.getSingletonInternal());
            __query.setMethod(__method3);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("spring.doma.sample.dao.DocumentDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.DeleteCommand __command = getCommandImplementors().createDeleteCommand(__method3, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("spring.doma.sample.dao.DocumentDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("spring.doma.sample.dao.DocumentDaoImpl", "delete", __e);
            throw __e;
        }
    }

    @Override
    public java.sql.Clob createClob() {
        entering("spring.doma.sample.dao.DocumentDaoImpl", "createClob");
        try {
            org.seasar.doma.jdbc.query.ClobCreateQuery __query = getQueryImplementors().createClobCreateQuery(__method4);
            __query.setMethod(__method4);
            __query.setConfig(__config);
            __query.setCallerClassName("spring.doma.sample.dao.DocumentDaoImpl");
            __query.setCallerMethodName("createClob");
            __query.prepare();
            org.seasar.doma.jdbc.command.CreateCommand<java.sql.Clob> __command = getCommandImplementors().createCreateCommand(__method4, __query);
            java.sql.Clob __result = __command.execute();
            __query.complete();
            exiting("spring.doma.sample.dao.DocumentDaoImpl", "createClob", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("spring.doma.sample.dao.DocumentDaoImpl", "createClob", __e);
            throw __e;
        }
    }

}
