package org.experimental.schema.core;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AnimalOriginTest {




    public static AnimalOrigin createAnimalOrigin() {

        AnimalOriginIdentifier animalOriginIdentifier = AnimalOriginIdentifier.newBuilder()
                .setIdType("jr_number")
                .setIdValue("424242")
                .build();
        AnimalOrigin animalOrigin = AnimalOrigin.newBuilder()
                .addOriginIdentifierList(animalOriginIdentifier)
                .setVendor("anonynmous_vendor")
                .setExternalIdentifier("arbitrary.external.id")
                .build();
        return animalOrigin;
    }

    @Test
    public void testConvertToJson() throws InvalidProtocolBufferException {
        AnimalOrigin animalOrigin = createAnimalOrigin();
        String json = JsonFormat.printer().print(animalOrigin);
        System.out.println(json);
        assertNotNull(json);
    }




}
