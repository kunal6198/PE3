package com.stackroute;


import org.junit.*;


import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentMarksTest {

    private static StudentMarks studentMarks;

    @BeforeClass
    public static void setUp() throws Exception {
        studentMarks= new StudentMarks();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        studentMarks=null;
    }

    @Test
    public void testCheckMarks(){
        studentMarks.setStudents(5);

        int[] a= new int[studentMarks.getStudents()];
        a[0]=50;
        a[1]=64;
        a[2]=89;
        a[3]=101;
        a[4]=98;



        assertEquals("error message","Not correct",studentMarks.checkMarks(studentMarks.getStudents(),a));

    }

    @Test
    public void testCheckMarks1(){
        studentMarks.setStudents(4);

        int[] a= new int[studentMarks.getStudents()];
        a[0]=50;
        a[1]=64;
        a[2]=89;
        a[3]=98;



        assertEquals("error message","All correct",studentMarks.checkMarks(studentMarks.getStudents(),a));

    }

}