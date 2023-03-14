package org.experimental.schema.core;


import org.experimental.schema.core.OntologyClass;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.experimental.schema.core.StrainAttribute.*;
import static org.junit.jupiter.api.Assertions.*;


public class StrainTest {

    private final static String mgi_id = "MGI:2670463";
    private final static String mgi_label = "C57BL/A";
    private final static OntologyClass strainTerm = OntologyClass.newBuilder()
            .setId(mgi_id).setLabel(mgi_label)
            .build();
    private final static Strain c57bl_a = Strain.newBuilder()
            .setStrainType(strainTerm)
            .addStrainAttribute(INBRED_STRAIN)
            .build();


    /*

    Strain Name

    Attributes
    congenic, mutant strain, transgenic
    MGI ID
    MGI:
     */

    private final static String tg_mgi_id = "MGI:4839003";
    private final static String tg_mgi_label = "B6.Cg-Tg(Myh6-Nox4)1Ams";
    private final static OntologyClass strainTermTg = OntologyClass.newBuilder()
            .setId(tg_mgi_id).setLabel(tg_mgi_label)
            .build();
    private final static Strain b6_tg = Strain.newBuilder()
            .setStrainType(strainTermTg)
            .addStrainAttribute(CONGENIC)
            .addStrainAttribute(MUTANT_STRAIN)
            .addStrainAttribute(TRANSGENIC)
            .build();


    @Test
    public void testId() {
        assertEquals(mgi_id, c57bl_a.getStrainType().getId());
    }

    @Test
    public void testStrainName() {
        assertEquals(mgi_label, c57bl_a.getStrainType().getLabel());
    }

    @Test
    public void testIsInbredStrain() {
        assertEquals(1, c57bl_a.getStrainAttributeList().size());
        StrainAttribute attribute = c57bl_a.getStrainAttributeList().get(0);
        assertEquals(INBRED_STRAIN, attribute);
    }

    @Test
    public void testTgIdLabel() {
        assertEquals(tg_mgi_id, b6_tg.getStrainType().getId());
        assertEquals(tg_mgi_label, b6_tg.getStrainType().getLabel());
    }


    @Test
    public void testTgStrainHasThreeAttributes() {
        assertEquals(3, b6_tg.getStrainAttributeList().size());
        List<StrainAttribute> attributeList = b6_tg.getStrainAttributeList();
        assertTrue(attributeList.contains(CONGENIC));
        assertTrue(attributeList.contains(MUTANT_STRAIN));
        assertTrue(attributeList.contains(TRANSGENIC));
        assertFalse(attributeList.contains(INBRED_STRAIN));
    }



}
