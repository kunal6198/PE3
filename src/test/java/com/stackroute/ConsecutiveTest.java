package com.stackroute;

import org.junit.*;

import static org.junit.Assert.*;

public class ConsecutiveTest {
    private static Consecutive consecutive;

    @BeforeClass
    public static void setUp() throws Exception {
        consecutive=new Consecutive();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        consecutive=null;
    }

    @Test
    public void getTest(){
       assertEquals( "Yes",consecutive.checkConsecutive("34,35,36,37,38,39"));

       assertEquals("Yes",consecutive.checkConsecutive("54,53,52,51"));

       assertEquals("No",consecutive.checkConsecutive("32,34,36,38"));

    }
}