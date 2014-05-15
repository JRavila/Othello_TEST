package model;
import model.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
//import othello.Othello.Turn;

/**
 *
 * @author formando
 */
public class TurnTest {
    
    public TurnTest() {
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
     * Test of getTurn method, of class Turn.
     */
    @Test
    public void testGetTurn() {
        System.out.println("getTurn");
        Turn instance = new Turn();
        int expResult1 = 0;
        int expResult2 = 1;
        int result = instance.getTurn();
       
        if(result==0)
        {
            assertEquals(expResult1, result);
        }
        else if(result==1)
        {
            assertEquals(expResult2, result);
        }

    }

    /**
     * Test of change method, of class Turn.
     */
    @Test
    public void testChange() {
        System.out.println("change");
        Turn instance = new Turn();
        instance.change();

    }
}