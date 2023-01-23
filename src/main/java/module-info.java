module org.experimental_model.schema {
    requires transitive com.google.protobuf;
    requires transitive org.phenopackets.schema;
    exports org.jax.experimental.schema;
    exports org.jax.experimental.schema.core;
}