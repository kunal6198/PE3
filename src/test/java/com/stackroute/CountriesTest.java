package com.stackroute;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CountriesTest {

    private static Countries countries;

    @BeforeClass
    public static void setUp() throws Exception {
        countries=new Countries();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        countries=null;
    }

    @Test
    public void testCountries(){
        List<String> a= new ArrayList<>();
        a.add("India");
        a.add("United States");
        a.add("Germany");
        a.add("Egypt");
        a.add("czechoslovakia");

        List<String> actual= new ArrayList<>();
        actual.add("Ind");
        actual.add("Untd Stts");
        actual.add("Grmny");
        actual.add("Egypt");
        actual.add("czchslvk");

        assertEquals(actual,countries.removeVowels(a));


    }
}