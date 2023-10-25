package org.acme.domain;

import java.util.Set;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema(description = "MyClass Description")
public class MyClass {
    
    @Schema(description = "My Enum Set")
    Set<MyEnum> myEnums;
    
}
