package org.experimental.schema.core;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Show how to construct and access objects of the class {@link org.experimental.schema.core.Animal}
 */
public class AnimalTest {

    private static org.experimental.schema.core.OntologyClass mouseTaxon;
    private static org.experimental.schema.core.Animal mouse;
    private final static String animalId = "F148-1-dob2015-01-09";
    private final static String animalProjectId = "519";
    private final static String projectSymbol =  "JaxCC1";
    private final static int stockNumber = 42;
    private final static String strain = "CC002/UncJ";
    private final static String strainIdentifier = "1502";

    @BeforeAll
    public static void init() {
        mouseTaxon =  org.experimental.schema.core.OntologyClass.newBuilder()
                .setId("NCBITaxon:10090")
                .setLabel("Mus musculus")
                .build();
        mouse = org.experimental.schema.core.Animal.newBuilder()
                .setAnimalId(animalId)
                .setAnimalProjectId(animalProjectId)
                .setProjectSymbol(projectSymbol)
                .setSex(org.experimental.schema.core.Sex.MALE)
                .setStockNumber(stockNumber)
                .setTaxonomy(mouseTaxon)
                .setStrain(strain)
                .setStrainIdentifier(strainIdentifier)
                .build();
    }


    @Test
    public void testTaxonomyClass() {
        assertEquals("Mus musculus", mouseTaxon.getLabel());
        assertEquals("NCBITaxon:10090", mouseTaxon.getId());
    }

    @Test
    public void testGetters() {
        assertEquals(animalId, mouse.getAnimalId());
        assertEquals(animalProjectId, mouse.getAnimalProjectId());
        assertEquals(projectSymbol, mouse.getProjectSymbol());
        assertEquals(org.experimental.schema.core.Sex.MALE, mouse.getSex());
        assertEquals(stockNumber, mouse.getStockNumber());
        assertEquals(strain, mouse.getStrain());
        assertEquals(strainIdentifier, mouse.getStrainIdentifier());
    }
    /*
    -- formatting error
    @Test
    public void testConvertToJson() throws InvalidProtocolBufferException {
        String json = JsonFormat.printer().print(mouse);
        System.out.println(json);
        org.experimental.schema.core.Animal.Builder animalBuilder = org.experimental.schema.core.Animal.newBuilder();
        JsonFormat.parser().merge(json, animalBuilder);
        org.experimental.schema.core.Animal fromJson = animalBuilder.build();
        //Ta-da!
        assertThat(fromJson, equalTo(json));
    }

     */
}
