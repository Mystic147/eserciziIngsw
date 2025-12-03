package it.unical.demacs;

import org.junit.jupiter.engine.*;
import org.junit.jupiter.api.*;
//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Testalg {

    Algorithms algoritmo;

    @BeforeEach
    public void setUp() {
        algoritmo = new Algorithms();
    }

    @Test
    public void checkAcronym() {
        String acronym = "CDL";
        String phrase = "Corso Di Laurea";
        Assertions.assertTrue(algoritmo.checkAcronym(acronym, phrase));
    }

    @Test
    public void checkWrongAcronym() {
        String acronym = "CD";
        String phrase = "Corso Di Laurea in Informatica";
        Assertions.assertFalse(algoritmo.checkAcronym(acronym, phrase));
    }

    @Test
    public void checkNullAcronym() {
        String acronym = null;
        String phrase = "Corso Di Laurea in Informatica";
        Assertions.assertThrows(IllegalArgumentException.class, () -> algoritmo.checkAcronym(acronym, phrase));

    }

    @Test
    public void checkNullPhrase() {
        String acronym = "CDL";
        String phrase = null;
        Exception exc = Assertions.assertThrows(IllegalArgumentException.class, () -> algoritmo.checkAcronym(acronym, phrase));
    }

    @Test
    public void checkLength() {
        String acronym = "CD";
        String phrase = "Corso Di Laurea in Informatica";
        Assertions.assertFalse(algoritmo.checkAcronym(acronym, phrase));
    }
    @Test
    public void checkwithHypen(){
        String acronym = "CLI";
        String phrase = "Corso Laurea - Informatica";
        Assertions.assertTrue(algoritmo.checkAcronym(acronym, phrase));
    }

    @Test
    void testSortNormalCase() {
        int[] array = {5, 2, 9, 1, 3};
        algoritmo.sort(array);
        assertArrayEquals(new int[]{1, 2, 3, 5, 9}, array);
    }

    @Test
    public void testSortedArray(){
        int[] array = {1,2,3,5,9};
        algoritmo.sort(array);
        assertArrayEquals(new int[]{1, 2, 3, 5, 9}, array);
    }

    @Test
    public void testArrayNull(){
        assertThrows(IllegalArgumentException.class, () -> algoritmo.sort(null));
    }
}
