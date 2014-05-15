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
import static org.junit.Assert.*;

/**
 *
 * @author formando
 */
public class MoveTest {
    
    public MoveTest() {
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
     * Test of getI method, of class Move.
     */
    @Test//OBSOLETE AFTER IMPLEMENTING GUI
    public void testGetI() {
        System.out.println("getI");
        model.Move instance = new model.Move(1,1);
        int expResult = 1;
        int result = instance.getI();
        assertEquals(expResult, result);
        
      
    }

    /**
     * Test of getJ method, of class Move.
     */
    @Test //OBSOLETE AFTER IMPLEMENTING GUI
    public void testGetJ() {
        System.out.println("getJ");
        model.Move instance = new model.Move(1,1);
        int expResult = 1;
        int result = instance.getJ();
        assertEquals(expResult, result);
        
        
    }
}