package spring.doma.sample.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.19.3" }, date = "2019-08-14T22:48:23.932+0900")
public final class _Student extends org.seasar.doma.jdbc.entity.AbstractEntityType<spring.doma.sample.entity.Student> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.19.3");
    }

    private static final _Student __singleton = new _Student();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    /** the studentId */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, spring.doma.sample.entity.Student, java.math.BigDecimal, Object> $studentId = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<>(spring.doma.sample.entity.Student.class, java.math.BigDecimal.class, java.math.BigDecimal.class, () -> new org.seasar.doma.wrapper.BigDecimalWrapper(), null, null, "studentId", "STUDENT_ID", __namingType, false);

    /** the name */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, spring.doma.sample.entity.Student, java.lang.String, Object> $name = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(spring.doma.sample.entity.Student.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "name", "NAME", __namingType, true, true, false);

    private final java.util.function.Supplier<spring.doma.sample.entity.StudentListener> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<spring.doma.sample.entity.Student, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<spring.doma.sample.entity.Student, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<spring.doma.sample.entity.Student, ?>> __entityPropertyTypeMap;

    private _Student() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "Student";
        __catalogName = "";
        __schemaName = "";
        __tableName = "STUDENT";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<spring.doma.sample.entity.Student, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<spring.doma.sample.entity.Student, ?>> __list = new java.util.ArrayList<>(2);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<spring.doma.sample.entity.Student, ?>> __map = new java.util.HashMap<>(2);
        __idList.add($studentId);
        __list.add($studentId);
        __map.put("studentId", $studentId);
        __list.add($name);
        __map.put("name", $name);
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
    public void preInsert(spring.doma.sample.entity.Student entity, org.seasar.doma.jdbc.entity.PreInsertContext<spring.doma.sample.entity.Student> context) {
        Class __listenerClass = spring.doma.sample.entity.StudentListener.class;
        spring.doma.sample.entity.StudentListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(spring.doma.sample.entity.Student entity, org.seasar.doma.jdbc.entity.PreUpdateContext<spring.doma.sample.entity.Student> context) {
        Class __listenerClass = spring.doma.sample.entity.StudentListener.class;
        spring.doma.sample.entity.StudentListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(spring.doma.sample.entity.Student entity, org.seasar.doma.jdbc.entity.PreDeleteContext<spring.doma.sample.entity.Student> context) {
        Class __listenerClass = spring.doma.sample.entity.StudentListener.class;
        spring.doma.sample.entity.StudentListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(spring.doma.sample.entity.Student entity, org.seasar.doma.jdbc.entity.PostInsertContext<spring.doma.sample.entity.Student> context) {
        Class __listenerClass = spring.doma.sample.entity.StudentListener.class;
        spring.doma.sample.entity.StudentListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(spring.doma.sample.entity.Student entity, org.seasar.doma.jdbc.entity.PostUpdateContext<spring.doma.sample.entity.Student> context) {
        Class __listenerClass = spring.doma.sample.entity.StudentListener.class;
        spring.doma.sample.entity.StudentListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(spring.doma.sample.entity.Student entity, org.seasar.doma.jdbc.entity.PostDeleteContext<spring.doma.sample.entity.Student> context) {
        Class __listenerClass = spring.doma.sample.entity.StudentListener.class;
        spring.doma.sample.entity.StudentListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<spring.doma.sample.entity.Student, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<spring.doma.sample.entity.Student, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<spring.doma.sample.entity.Student, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, spring.doma.sample.entity.Student, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, spring.doma.sample.entity.Student, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<java.lang.Object, spring.doma.sample.entity.Student, ?, ?> getTenantIdPropertyType() {
        return null;
    }

    @Override
    public spring.doma.sample.entity.Student newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<spring.doma.sample.entity.Student, ?>> __args) {
        spring.doma.sample.entity.Student entity = new spring.doma.sample.entity.Student();
        if (__args.get("studentId") != null) __args.get("studentId").save(entity);
        if (__args.get("name") != null) __args.get("name").save(entity);
        return entity;
    }

    @Override
    public Class<spring.doma.sample.entity.Student> getEntityClass() {
        return spring.doma.sample.entity.Student.class;
    }

    @Override
    public spring.doma.sample.entity.Student getOriginalStates(spring.doma.sample.entity.Student __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(spring.doma.sample.entity.Student __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Student getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Student newInstance() {
        return new _Student();
    }

    private static class ListenerHolder {
        private static spring.doma.sample.entity.StudentListener listener = new spring.doma.sample.entity.StudentListener();
    }

}
