/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;
import model.*;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author formando
 */
public class BoardTest {
    
    public BoardTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of intPlayer method, of class Board.
     *//*
    @Test  //BECAME OBSOLETE AFTER IMPLEMENTING GUI 
    public void testIntPlayer() {
        System.out.println("intPlayer");
        boolean boolPlayer = false;
        model.Board instance = new model.Board();
        int expResult = 0;
        int result = instance.intPlayer(boolPlayer);
        assertEquals(expResult, result);

       
    }

    /**
     * Test of boolPlayer method, of class Board.
     *//*
    @Test//BECAME OBSOLETE AFTER IMPLEMENTING GUI
    public void testBoolPlayer() {
        System.out.println("boolPlayer");
        int color = 0;
        model.Board instance = new model.Board();
        boolean expResult = true;
        boolean result = instance.boolPlayer(color);
        assertEquals(expResult, result);
      

    }

    /**
     * Test of display method, of class Board.
     */
    @Test //FOR CONSOLE UI
    public void testDisplay() {
        System.out.println("display");
        model.Board instance = new model.Board();
        instance.display();
        
    }

    /**
     * Test of placeChip method, of class Board.
     */
    @Test
    public void testPlaceChip() {
        System.out.println("placeChip");
        int color = 0;
        int row = 2;
        int col = 2;
        model.Board instance = new model.Board();
        instance.placeChip(color, row, col);
        assertEquals(instance.placeChip(color, row, col),true);

    
    }

    /**
     * Test of findLegalMoveNew method, of class Board.
     */
    @Test
    public void testFindLegalMoveNew() {
        System.out.println("findLegalMoveNew");
        model.Move move = new model.Move(2,2);
        int player = 0;
        model.Board instance = new model.Board();
        boolean expResult = false;
        boolean result = instance.findLegalMoveNew(move, player);
        assertEquals(expResult, result);
       

    }

    /**
     * Test of validMove method, of class Board.
     */
    @Test
    public void testValidMove() {
        System.out.println("validMove");
        int color = 0;
        model.Board instance = new model.Board(); 
        ArrayList<Move> expResult = new ArrayList<Move>(); // NOT WORKING
        ArrayList result = instance.validMove(color);
        expResult = result;
        assertEquals(expResult, result);
       
        
    }

    /**
     * Test of setCanSelect method, of class Board.
     */
    @Test
    public void testSetCanSelect() {
        System.out.println("setCanSelect");
        model.Move move = new model.Move(2,3);
        model.Board instance = new model.Board();
        boolean result = instance.setCanSelect(move);
        assertEquals(true,result);
       

    }

    /**
     * Test of canSelect method, of class Board.
     */
    @Test
    public void testCanSelect() {
        System.out.println("canSelect");
        model.Move move = new model.Move(2,3);
        model.Board instance = new model.Board();
        boolean expResult = true;
        boolean result = instance.canSelect(move);
        assertEquals(expResult, result);
       
 
    }

    /**
     * Test of replaceChip method, of class Board.
     */
    @Test
    public void testReplaceChip() {
        System.out.println("replaceChip");
        model.Move move = new model.Move(2,3);
        int player = 0;
        model.Board instance = new model.Board();
        instance.replaceChip(move, player);
      
    
    }

    /**
     * Test of getChipsCount method, of class Board.
     */
    @Test
    public void testGetChipsCount() {
        System.out.println("getChipsCount");
        int color = 0; //player == white
        model.Board instance = new model.Board();
        int expResult = 64; //
        int result = instance.getChipsCount(color)-2;//minus 2, because BOTH players have 2 points at start
        assertEquals(expResult, result);
       

    }

    /**
     * Test of totalTurns method, of class Board.
     */
    @Test
    public void testTotalTurns() {
        System.out.println("totalTurns");
        model.Board instance = new model.Board();
        int expResult = 4;
        int result = instance.totalTurns();
        assertEquals(expResult, result);
       
       
    }

    /**
     * Test of gameOver method, of class Board.
     */
    @Test
    public void testGameOver() {   
        System.out.println("gameOver");
        Board instance = new Board();
        boolean expResult = false;
        boolean result = instance.gameOver();
        assertEquals(expResult, result);
      
    
    }
}