package com.stackroute;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DateWeekTest {

    private static DateWeek dateWeek;

    @BeforeClass
    public static void setUp() throws Exception {
        dateWeek = new DateWeek();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        dateWeek=null;
    }

    @Test
    public void testDate(){
        List<String> a = new ArrayList<>();
        a.add("Mon 09/09/2019");
        a.add("Sun 15/09/2019");
        assertEquals(a,dateWeek.getDate());
    }
}