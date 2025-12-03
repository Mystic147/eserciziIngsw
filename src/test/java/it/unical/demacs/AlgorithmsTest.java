package it.unical.demacs;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlgorithmsTest {


    Algorithms algorithms;


    @BeforeEach
    public void setUp(){
        algorithms=new Algorithms();
    }

//test per verificare che l'acronimo sia corretto

    @Test
    public void testAcronymRight() {
        assertTrue(algorithms.checkAcronym("INPS" ,"Istituto Nazionale della Previdenza Sociale"));
        assertTrue(algorithms.checkAcronym("FBI", "Federal Bureau of Investigation"));
        assertTrue(algorithms.checkAcronym("ONU", "Organizzazione delle Nazioni Unite"));

    }

    //test per verificare che l'acronimo sia errato
    @Test
    public void testAcronymWrong() {
        assertFalse(algorithms.checkAcronym("NASA" ,"National Aeronautics and Space Administrationx"));
    }


    //test per verificare che l'array venga ordinato correttamente
    @Test
    public void testSortArray() {
        int[] array = new int[]{5, 2, 9, 1, 5, 6};
        algorithms.sort(array);
        int[] expected = new int[]{1, 2, 5, 5, 6, 9};
        assertArrayEquals(expected, array);
    }




}


