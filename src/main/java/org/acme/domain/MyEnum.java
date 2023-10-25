package org.acme.domain;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema(description = "A special Enum")
public enum MyEnum {
    VALUE_ONE,
    VALUE_TWO,
    VALUE_THREE;
}
