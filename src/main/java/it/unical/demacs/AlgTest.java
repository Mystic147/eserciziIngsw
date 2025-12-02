package it.unical.demacs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AlgTest {
    private Algorithms algorithms;

    @BeforeEach
    void setUp() {
        algorithms = new Algorithms();
    }

    @Test
    void checkAcronymTrue(){
        assertTrue(algorithms.checkAcronym("ONU", "Organizzazione delle Nazioni Unite"));
    }




}
