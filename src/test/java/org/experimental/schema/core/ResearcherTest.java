package org.experimental.schema.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResearcherTest {


    /**
     * "address":"Madison, WI, USA",
     *     "affiliation":"University of Wisconsin",
     * @return
     */
    public static Institution createInstitution() {
        return org.experimental.schema.core.Institution.newBuilder()
                .setName("University of Wisconsin")
                .setCity("Madison")
                .setStateOrProvince("WI")
                .setCountry("USA")
                .build();
    }

    private final static Institution uWisc = createInstitution();


    @Test
    public void checkInstitution() {
        assertEquals("Madison", uWisc.getCity());
        assertEquals("University of Wisconsin", uWisc.getName());
        assertEquals("WI", uWisc.getStateOrProvince());
        assertEquals("USA", uWisc.getCountry());
    }



}
