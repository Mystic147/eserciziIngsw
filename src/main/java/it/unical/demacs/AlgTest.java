package it.unical.demacs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void checkIsNull(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            algorithms.checkAcronym(null, null);
        });

        assertEquals("Acronym and phrase cannot be null", exception.getMessage());
    }


}
