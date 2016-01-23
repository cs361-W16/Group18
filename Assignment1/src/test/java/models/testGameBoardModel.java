package models;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.*;

/**
 * Created by Charles Siebert on 1/22/2016.
 */
public class testGameBoardModel {

    @Test
    public void testBoardState() {
        // validates that the model is created
        GameBoard col1 = new GameBoard();
        assertNotNull(col1);
    }
    @Test
    public void testColumnVal() {
        //Validates LinkedLists have values.
        GameBoard board1 = new GameBoard();
        board1.addtoBoard("1d");
        assertEquals("1d", board1.getlastitem());
    }
    @Test
    public void testBoardFill() {
        //Validates and tests multiple values in linked lists that are initialized
        GameBoard col1 = new GameBoard();
        GameBoard col2 = new GameBoard();
        col2.addtoBoard("1h");
        col2.addtoBoard("1d");
        assertEquals("1d", col2.getlastitem());
        col2.addtoBoard("1s");
        col2.addtoBoard("1c");
        assertEquals(4, col2.getSize());
        col1.addtoBoard("1h");
        col1.addtoBoard("1d");
        assertEquals("1d", col1.getlastitem());
        col1.addtoBoard("1s");
        assertEquals(3, col1.getSize());


    }
}
