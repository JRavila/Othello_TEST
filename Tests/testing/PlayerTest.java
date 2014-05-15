/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;
import model.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.io.*;
import static org.junit.Assert.*;


/**
 *
 * @author formando
 */
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of setNames method, of class Player.
     */
    @Test
    public void testSetNames() throws Exception {
        System.out.println("setNames");
        String name = "testName";
        model.Board _board=new model.Board();
        Player instance = new Player(name,0,_board);
        instance.setNames();
        
        
        
        
        // TODO review the generated test code and remove the default call to fail.
       
               
    }

    /**
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        model.Board _board=new model.Board();
        Player instance = new Player("TESTNAME",0,_board);
        String expResult = "TESTNAME";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getColor method, of class Player.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        model.Board _board=new model.Board();
        Player instance = new Player("NAME",0,_board);
        int expResult = 0;
        int result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
 
    }

    /**
     * Test of placeChip method, of class Player.
     */
    @Test
    public void testPlaceChip() {
        System.out.println("placeChip");
        int row = 0;
        int col = 0;
 
        model.Board _board=new model.Board();
        Player instance = new Player("NAME",0,_board);
        instance.placeChip(row, col);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of findCanSelect method, of class Player.
     */
    @Test
    public void testFindCanSelect() {
        System.out.println("findCanSelect");
        model.Board _board=new model.Board();
        Player instance = new Player("NAME",0,_board);
        instance.findCanSelect();
        // TODO review the generated test code and remove the default call to fail.
       
    }
}