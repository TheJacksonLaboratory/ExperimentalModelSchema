@SuppressWarnings({ "requires-automatic", "requires-transitive-automatic" })
module org.experimental.schema {
    requires transitive com.google.protobuf;
   exports org.experimental.schema;
   exports org.experimental.schema.core;
}