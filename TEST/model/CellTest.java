/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import model.*;
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
public class CellTest {
    
    
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
     * Test of isEmpty method, of class Cell.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Cell instance = new Cell();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
 
    }

    /**
     * Test of placeChip method, of class Cell.
     */
    @Test
    public void testPlaceChip() {
        System.out.println("placeChip");
        int player = 0;
        model.Cell instance = new model.Cell();
        instance.placeChip(player);
      
    }

    /**
     * Test of changeChip method, of class Cell.
     */
    @Test
    public void testChangeChip() {
        System.out.println("changeChip");
        model.Cell instance = new model.Cell();
        instance.changeChip();
     
    }

    /**
     * Test of isWhite method, of class Cell.
     *//*
    @Test //OBSOLETE AFTER IMPLEMENTING GUI
    public void testIsWhite() {
        System.out.println("isWhite");
        model.Cell instance = new model.Cell();
        boolean expResult = false;
        boolean result = instance.isWhite();
        assertEquals(expResult, result);

    }

    /**
     * Test of isBlack method, of class Cell.
     *//*
    @Test //OBSOLETE AFTER IMPLEMENTING GUI
    public void testIsBlack() {
        System.out.println("isBlack");
        Cell instance = new Cell();
        boolean expResult = false;
        boolean result = instance.isBlack();
        assertEquals(expResult, result);
 
    }

    /**
     * Test of canSelect method, of class Cell.
     */
    @Test
    public void testCanSelect() {
        System.out.println("canSelect");
        model.Cell instance = new model.Cell();
        boolean expResult = false;
        boolean result = instance.canSelect();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of unselect method, of class Cell.
     */
    @Test
    public void testUnselect() {
        System.out.println("unselect");
        model.Cell instance = new model.Cell();
        instance.unselect();

    }

    /**
     * Test of getPlayer method, of class Cell.
     */
    @Test
    public void testGetPlayer() {
        System.out.println("getPlayer");
        model.Cell instance = new model.Cell();
        int expResult = -1;
        int result = instance.getPlayer();
        assertEquals(expResult, result);

    }

    /**
     * Test of setSelect method, of class Cell.
     */
    @Test
    public void testSetSelect() {
        System.out.println("setSelect");
        model.Cell instance = new model.Cell();
        instance.setSelect();

    }

    /**
     * Test of display method, of class Cell.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        model.Cell instance = new model.Cell();
        instance.display();
  
    }
}