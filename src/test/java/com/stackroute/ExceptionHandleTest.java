package com.stackroute;

import org.junit.*;

import java.sql.SQLOutput;

import static org.junit.Assert.*;

public class ExceptionHandleTest {
    private static ExceptionHandle exception;

    @BeforeClass
    public static void setUp() throws Exception {
        exception = new ExceptionHandle();

    }

    @AfterClass
    public static void tearDown() throws Exception {
        exception=null;
    }

    @Test(expected = ArithmeticException.class)
    public void getArithmeticExceptionsTest(){
        System.out.println("Arithmetic Exception");
        exception.getArithmeticException();
    }


    @Test(expected = NullPointerException.class)
    public void getNullPointerExceptionsTest(){
        System.out.println("Null Pointer Exception");
        exception.getNullPointerException();
    }


    @Test(expected = IndexOutOfBoundsException.class)
    public void getIndexOutOfBoundsExceptionsTest(){
        System.out.println("Index out of bounds exception");
        exception.getIndexOutOfBoundsException();
    }


    @Test(expected = NegativeArraySizeException.class)
    public void getNegativeArraySizeExceptionsTest(){
        System.out.println("Negative Array size exception");
        exception.getNegativeArraySizeException();
    }
}