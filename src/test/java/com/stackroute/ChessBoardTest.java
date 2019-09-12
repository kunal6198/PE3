package com.stackroute;

import org.junit.*;

import static org.junit.Assert.*;

public class ChessBoardTest {

    private static ChessBoard chessBoard;


    @BeforeClass
    public static void setUp() throws Exception {
        chessBoard = new ChessBoard();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        chessBoard=null;
    }

    @Test
    public void testBoard(){
        chessBoard.setRow(3);
        chessBoard.setCol(3);
        int n=chessBoard.getRow();
        int m=chessBoard.getCol();
        String [][] b={
                {"WW|","WW|","BB|"},
                {"BB","BB","WW|"},
                {"WW|","WW","BB|"}
        };
        assertEquals(b,chessBoard.makeBoard());



    }
}