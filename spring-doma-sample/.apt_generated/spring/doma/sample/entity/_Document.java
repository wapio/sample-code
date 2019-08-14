package spring.doma.sample.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.19.3" }, date = "2019-08-14T22:48:23.970+0900")
public final class _Document extends org.seasar.doma.jdbc.entity.AbstractEntityType<spring.doma.sample.entity.Document> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.19.3");
    }

    private static final _Document __singleton = new _Document();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    /** the id */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, spring.doma.sample.entity.Document, java.math.BigDecimal, Object> $id = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<>(spring.doma.sample.entity.Document.class, java.math.BigDecimal.class, java.math.BigDecimal.class, () -> new org.seasar.doma.wrapper.BigDecimalWrapper(), null, null, "id", "ID", __namingType, false);

    /** the content */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, spring.doma.sample.entity.Document, java.sql.Clob, Object> $content = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(spring.doma.sample.entity.Document.class, java.sql.Clob.class, java.sql.Clob.class, () -> new org.seasar.doma.wrapper.ClobWrapper(), null, null, "content", "CONTENT", __namingType, true, true, false);

    private final java.util.function.Supplier<spring.doma.sample.entity.DocumentListener> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<spring.doma.sample.entity.Document, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<spring.doma.sample.entity.Document, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<spring.doma.sample.entity.Document, ?>> __entityPropertyTypeMap;

    private _Document() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "Document";
        __catalogName = "";
        __schemaName = "";
        __tableName = "DOCUMENT";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<spring.doma.sample.entity.Document, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<spring.doma.sample.entity.Document, ?>> __list = new java.util.ArrayList<>(2);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<spring.doma.sample.entity.Document, ?>> __map = new java.util.HashMap<>(2);
        __idList.add($id);
        __list.add($id);
        __map.put("id", $id);
        __list.add($content);
        __map.put("content", $content);
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
    public void preInsert(spring.doma.sample.entity.Document entity, org.seasar.doma.jdbc.entity.PreInsertContext<spring.doma.sample.entity.Document> context) {
        Class __listenerClass = spring.doma.sample.entity.DocumentListener.class;
        spring.doma.sample.entity.DocumentListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(spring.doma.sample.entity.Document entity, org.seasar.doma.jdbc.entity.PreUpdateContext<spring.doma.sample.entity.Document> context) {
        Class __listenerClass = spring.doma.sample.entity.DocumentListener.class;
        spring.doma.sample.entity.DocumentListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(spring.doma.sample.entity.Document entity, org.seasar.doma.jdbc.entity.PreDeleteContext<spring.doma.sample.entity.Document> context) {
        Class __listenerClass = spring.doma.sample.entity.DocumentListener.class;
        spring.doma.sample.entity.DocumentListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(spring.doma.sample.entity.Document entity, org.seasar.doma.jdbc.entity.PostInsertContext<spring.doma.sample.entity.Document> context) {
        Class __listenerClass = spring.doma.sample.entity.DocumentListener.class;
        spring.doma.sample.entity.DocumentListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(spring.doma.sample.entity.Document entity, org.seasar.doma.jdbc.entity.PostUpdateContext<spring.doma.sample.entity.Document> context) {
        Class __listenerClass = spring.doma.sample.entity.DocumentListener.class;
        spring.doma.sample.entity.DocumentListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(spring.doma.sample.entity.Document entity, org.seasar.doma.jdbc.entity.PostDeleteContext<spring.doma.sample.entity.Document> context) {
        Class __listenerClass = spring.doma.sample.entity.DocumentListener.class;
        spring.doma.sample.entity.DocumentListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<spring.doma.sample.entity.Document, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<spring.doma.sample.entity.Document, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<spring.doma.sample.entity.Document, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, spring.doma.sample.entity.Document, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, spring.doma.sample.entity.Document, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<java.lang.Object, spring.doma.sample.entity.Document, ?, ?> getTenantIdPropertyType() {
        return null;
    }

    @Override
    public spring.doma.sample.entity.Document newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<spring.doma.sample.entity.Document, ?>> __args) {
        spring.doma.sample.entity.Document entity = new spring.doma.sample.entity.Document();
        if (__args.get("id") != null) __args.get("id").save(entity);
        if (__args.get("content") != null) __args.get("content").save(entity);
        return entity;
    }

    @Override
    public Class<spring.doma.sample.entity.Document> getEntityClass() {
        return spring.doma.sample.entity.Document.class;
    }

    @Override
    public spring.doma.sample.entity.Document getOriginalStates(spring.doma.sample.entity.Document __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(spring.doma.sample.entity.Document __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Document getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Document newInstance() {
        return new _Document();
    }

    private static class ListenerHolder {
        private static spring.doma.sample.entity.DocumentListener listener = new spring.doma.sample.entity.DocumentListener();
    }

}
