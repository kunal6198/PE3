package com.stackroute;

import org.junit.*;

import static org.junit.Assert.*;

public class DirectoryTest {
    private static Directory directory;
    @BeforeClass
    public static void setUp() throws Exception {
        directory = new Directory();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        directory=null;
    }

    @Test
    public void testFileDir(){
        assertEquals("File Read Successfully",directory.readFileWithExt("/home/cgi/directory",".txt"));
    }
}