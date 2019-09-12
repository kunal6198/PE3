package com.stackroute;

import org.junit.*;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FrequencyTest {

    private static Frequency freq;

    @BeforeClass
    public static void setUp() throws Exception {
        freq = new Frequency();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        freq=null;
    }

    @Test
    public void testFrequency() throws Exception{
        FileWriter f = new FileWriter("/home/cgi/testF.txt");
        f.write("i am a man ,\n" +
                "i like to sleep ,\n" +
                "i have a home.");
        f.close();
        List<String> a= new ArrayList<>();
        a.add("i : 3");
        a.add("am : 1");
        a.add("a : 2");
        a.add("man : 1");
        a.add("like : 1");
        a.add("to : 1");
        a.add("sleep : 1");
        a.add("have : 1");
        a.add("home : 1");





        assertEquals(a,freq.countFreq("/home/cgi/testF.txt"));
    }
}