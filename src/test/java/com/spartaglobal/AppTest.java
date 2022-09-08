package com.spartaglobal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {

    private final static int PLANET_COUNT = 8;

    private final static Planet[] PLANETS = Planet.values();

    @Test
    public void testCount() {
        assertEquals(PLANETS.length, PLANET_COUNT);
    }

    @Test
    public void testName() {
        for (Planet planet : PLANETS) {
            assertTrue(planet.name().equalsIgnoreCase(planet.getName()));
        }
    }

    @Test
    public void testAverageDistance() {
        for (Planet planet : PLANETS) {
            assertTrue(planet.getAverageDistance() > 0);
        }
    }

    @Test
    public void testMass() {
        for (Planet planet : PLANETS) {
            assertTrue(planet.getMass() > 0);
        }
    }

    @Test
    public void testRelativeWeightIndex() {
        assertTrue(((Double) Planet.EARTH.getRelativeWeightIndex()).equals(1.0));

        for (Planet planet : PLANETS) {
            assertTrue(planet.getRelativeWeightIndex() > 0);
        }
    }

}
