package org.experimental.schema.core;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AnimalIdentifierTest {


    public static AnimalIdentifier createAnimalIdentifier() {
        String id = "arbitrary.id";
        // identifier for the type of identifier, e.g. ear punch or tattoo
        OntologyClass identifier = OntologyClass.newBuilder()
                .setId("MGI:1234567")
                .setLabel("ear punch")
                .build();
        String earNotchPunchCode = "90";

        return AnimalIdentifier.newBuilder()
                .setId(id)
                .setIdentifier(identifier)
                .setIdentifierValue(earNotchPunchCode)
                .build();
    }

    @Test
    public void testGetId() {
        AnimalIdentifier animalIdentifier = createAnimalIdentifier();
        assertEquals("MGI:1234567", animalIdentifier.getIdentifier().getId());
    }

    @Test
    public void testConvertToJson() throws InvalidProtocolBufferException {
        AnimalIdentifier animalIdentifier = createAnimalIdentifier();
        String json = JsonFormat.printer().print(animalIdentifier);
        System.out.println(json);
        assertNotNull(json);
    }

}
