/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

//THIS TEST IS OBSOLETE AFTER IMPLEMENTING THE GUI

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
public class OthelloTest {
    
    public OthelloTest() {
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
     * Test of startGame method, of class Othello.
     */
    @Test
    public void testStartGame() throws Exception {
        System.out.println("startGame");
        model.Othello instance = new model.Othello();
        instance.startGame();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Othello.
     */
    /*
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        model.Othello.main(args);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
*/

    

}