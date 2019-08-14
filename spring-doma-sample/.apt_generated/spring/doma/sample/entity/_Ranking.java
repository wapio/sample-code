package spring.doma.sample.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.19.3" }, date = "2019-08-14T22:48:23.952+0900")
public final class _Ranking extends org.seasar.doma.jdbc.entity.AbstractEntityType<spring.doma.sample.entity.Ranking> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.19.3");
    }

    private static final _Ranking __singleton = new _Ranking();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    /** the id */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, spring.doma.sample.entity.Ranking, java.math.BigDecimal, Object> $id = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<>(spring.doma.sample.entity.Ranking.class, java.math.BigDecimal.class, java.math.BigDecimal.class, () -> new org.seasar.doma.wrapper.BigDecimalWrapper(), null, null, "id", "ID", __namingType, false);

    /** the rank */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, spring.doma.sample.entity.Ranking, java.math.BigDecimal, Object> $rank = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(spring.doma.sample.entity.Ranking.class, java.math.BigDecimal.class, java.math.BigDecimal.class, () -> new org.seasar.doma.wrapper.BigDecimalWrapper(), null, null, "rank", "RANK", __namingType, true, true, false);

    /** the studentId */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, spring.doma.sample.entity.Ranking, java.math.BigDecimal, Object> $studentId = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(spring.doma.sample.entity.Ranking.class, java.math.BigDecimal.class, java.math.BigDecimal.class, () -> new org.seasar.doma.wrapper.BigDecimalWrapper(), null, null, "studentId", "STUDENT_ID", __namingType, true, true, false);

    private final java.util.function.Supplier<spring.doma.sample.entity.RankingListener> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<spring.doma.sample.entity.Ranking, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<spring.doma.sample.entity.Ranking, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<spring.doma.sample.entity.Ranking, ?>> __entityPropertyTypeMap;

    private _Ranking() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "Ranking";
        __catalogName = "";
        __schemaName = "";
        __tableName = "RANKING";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<spring.doma.sample.entity.Ranking, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<spring.doma.sample.entity.Ranking, ?>> __list = new java.util.ArrayList<>(3);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<spring.doma.sample.entity.Ranking, ?>> __map = new java.util.HashMap<>(3);
        __idList.add($id);
        __list.add($id);
        __map.put("id", $id);
        __list.add($rank);
        __map.put("rank", $rank);
        __list.add($studentId);
        __map.put("studentId", $studentId);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return getTableName(org.seasar.doma.jdbc.Naming.DEFAULT::apply);
    }

    @Override
    public String getTableName(java.util.function.BiFunction<org.seasar.doma.jdbc.entity.NamingType, String, String> namingFunction) {
        if (__tableName.isEmpty()) {
            return namingFunction.apply(__namingType, __name);
        }
        return __tableName;
    }

    @Override
    public boolean isQuoteRequired() {
        return __isQuoteRequired;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preInsert(spring.doma.sample.entity.Ranking entity, org.seasar.doma.jdbc.entity.PreInsertContext<spring.doma.sample.entity.Ranking> context) {
        Class __listenerClass = spring.doma.sample.entity.RankingListener.class;
        spring.doma.sample.entity.RankingListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(spring.doma.sample.entity.Ranking entity, org.seasar.doma.jdbc.entity.PreUpdateContext<spring.doma.sample.entity.Ranking> context) {
        Class __listenerClass = spring.doma.sample.entity.RankingListener.class;
        spring.doma.sample.entity.RankingListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(spring.doma.sample.entity.Ranking entity, org.seasar.doma.jdbc.entity.PreDeleteContext<spring.doma.sample.entity.Ranking> context) {
        Class __listenerClass = spring.doma.sample.entity.RankingListener.class;
        spring.doma.sample.entity.RankingListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(spring.doma.sample.entity.Ranking entity, org.seasar.doma.jdbc.entity.PostInsertContext<spring.doma.sample.entity.Ranking> context) {
        Class __listenerClass = spring.doma.sample.entity.RankingListener.class;
        spring.doma.sample.entity.RankingListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(spring.doma.sample.entity.Ranking entity, org.seasar.doma.jdbc.entity.PostUpdateContext<spring.doma.sample.entity.Ranking> context) {
        Class __listenerClass = spring.doma.sample.entity.RankingListener.class;
        spring.doma.sample.entity.RankingListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(spring.doma.sample.entity.Ranking entity, org.seasar.doma.jdbc.entity.PostDeleteContext<spring.doma.sample.entity.Ranking> context) {
        Class __listenerClass = spring.doma.sample.entity.RankingListener.class;
        spring.doma.sample.entity.RankingListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<spring.doma.sample.entity.Ranking, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<spring.doma.sample.entity.Ranking, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<spring.doma.sample.entity.Ranking, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, spring.doma.sample.entity.Ranking, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, spring.doma.sample.entity.Ranking, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<java.lang.Object, spring.doma.sample.entity.Ranking, ?, ?> getTenantIdPropertyType() {
        return null;
    }

    @Override
    public spring.doma.sample.entity.Ranking newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<spring.doma.sample.entity.Ranking, ?>> __args) {
        spring.doma.sample.entity.Ranking entity = new spring.doma.sample.entity.Ranking();
        if (__args.get("id") != null) __args.get("id").save(entity);
        if (__args.get("rank") != null) __args.get("rank").save(entity);
        if (__args.get("studentId") != null) __args.get("studentId").save(entity);
        return entity;
    }

    @Override
    public Class<spring.doma.sample.entity.Ranking> getEntityClass() {
        return spring.doma.sample.entity.Ranking.class;
    }

    @Override
    public spring.doma.sample.entity.Ranking getOriginalStates(spring.doma.sample.entity.Ranking __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(spring.doma.sample.entity.Ranking __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Ranking getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Ranking newInstance() {
        return new _Ranking();
    }

    private static class ListenerHolder {
        private static spring.doma.sample.entity.RankingListener listener = new spring.doma.sample.entity.RankingListener();
    }

}
