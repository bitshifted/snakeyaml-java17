module org.yaml.snakeyaml {
    requires java.logging;
    requires java.sql;

    requires transitive java.desktop;

    exports org.yaml.snakeyaml;
    exports org.yaml.snakeyaml.comments;
    exports org.yaml.snakeyaml.composer;
    exports org.yaml.snakeyaml.constructor;
    exports org.yaml.snakeyaml.emitter;
    exports org.yaml.snakeyaml.env;
    exports org.yaml.snakeyaml.error;
    exports org.yaml.snakeyaml.events;
    exports org.yaml.snakeyaml.extensions.compactnotation;
    exports org.yaml.snakeyaml.external.biz.base64Coder;
    exports org.yaml.snakeyaml.external.com.google.gdata.util.common.base;
    exports org.yaml.snakeyaml.introspector;
    exports org.yaml.snakeyaml.nodes;
    exports org.yaml.snakeyaml.parser;
    exports org.yaml.snakeyaml.reader;
    exports org.yaml.snakeyaml.representer;
    exports org.yaml.snakeyaml.resolver;
    exports org.yaml.snakeyaml.scanner;
    exports org.yaml.snakeyaml.serializer;
    exports org.yaml.snakeyaml.tokens;
    exports org.yaml.snakeyaml.util;

}
