/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

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
public class OthelloTest { //WORK IN PROGRESS
    
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
     * Test of main method, of class Othello.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Othello.main(args);

    }

    /**
     * Test of refreshOthello method, of class Othello.
     */
    @Test
    public void testRefreshOthello() {
        System.out.println("refreshOthello");
        Othello instance = new Othello();
        instance.refreshOthello();

    }
}