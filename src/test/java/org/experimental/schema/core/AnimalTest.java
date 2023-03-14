package org.experimental.schema.core;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.experimental.schema.core.StrainTest.c57bl_a;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Show how to construct and access objects of the class {@link org.experimental.schema.core.Animal}
 */
public class AnimalTest {

    private static org.experimental.schema.core.OntologyClass mouseTaxon;
    private static org.experimental.schema.core.Animal mouse;


    @BeforeAll
    public static void init() {
        mouseTaxon =  org.experimental.schema.core.OntologyClass.newBuilder()
                .setId("NCBITaxon:10090")
                .setLabel("Mus musculus")
                .build();
        mouse = org.experimental.schema.core.Animal.newBuilder()
                .setAnimalOrigin(AnimalOriginTest.createAnimalOrigin())
                .setSex(org.experimental.schema.core.Sex.MALE)
                .setTaxonomy(mouseTaxon)
                .setStrain(c57bl_a())
                .addAnimalIdentificationMethodList(AnimalIdentifierTest.createAnimalIdentifier())
                .build();
    }


    @Test
    public void testTaxonomyClass() {
        assertEquals("Mus musculus", mouseTaxon.getLabel());
        assertEquals("NCBITaxon:10090", mouseTaxon.getId());
    }

    @Test
    public void testGetters() {
      //  assertEquals(animalId, mouse.getAnimalId());
      //  assertEquals(animalProjectId, mouse.getAnimalProjectId());
       // assertEquals(projectSymbol, mouse.getProjectSymbol());
        assertEquals(org.experimental.schema.core.Sex.MALE, mouse.getSex());
      //  assertEquals(stockNumber, mouse.getStockNumber());
        //assertEquals(strain, mouse.getStrain());
      //  assertEquals(strainIdentifier, mouse.getStrainIdentifier());
    }


    @Test
    public void testConvertToJson() throws InvalidProtocolBufferException {
        String json = JsonFormat.printer().print(mouse);
        System.out.println(json);
        org.experimental.schema.core.Animal.Builder animalBuilder = org.experimental.schema.core.Animal.newBuilder();
        JsonFormat.parser().merge(json, animalBuilder);
        org.experimental.schema.core.Animal fromJson = animalBuilder.build();
        //Ta-da!
        assertNotNull(fromJson);
      //  assertThat(fromJson, equalTo(json));
    }


}
