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
        assertTrue(algorithms.checkAcronym("ONU", "Organizzazione Nazioni Unite"));
    }

    @Test
    void checkAcronymFalse(){
        assertFalse(algorithms.checkAcronym("CDL", "Mate E Informatica"));
    }

    @Test
    void checkIsNull(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            algorithms.checkAcronym(null, null);
        });

        assertEquals("Acronym and phrase cannot be null", exception.getMessage());
    }
    @Test
    void checkIsSorted(){
        int[] maybeWillBeSorted = {10, 8, 5, 3, 1};
        int[] sorted = {1, 3, 5, 8, 10};
        algorithms.sort(maybeWillBeSorted);
        assertArrayEquals(sorted, maybeWillBeSorted);
    }

    @Test
    void checkArrayIsNull(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            algorithms.sort(null);
        });

        assertEquals("Array cannot be null", exception.getMessage());
    }
}
