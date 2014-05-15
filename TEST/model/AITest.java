/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
public class AITest { //WORK IN PROGRESS
    
    public AITest() {
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
     * Test of move_cpu_easy method, of class AI.
     */
    @Test
    public void testMove_cpu_easy() {
        System.out.println("move_cpu_easy");
        Board board = null;
        Player player = null;
        AI.move_cpu_easy(board, player);

    }

    /**
     * Test of move_cpu_medium method, of class AI.
     */
    @Test
    public void testMove_cpu_medium() {
        System.out.println("move_cpu_medium");
        Board board = null;
        Player player = null;
        AI.move_cpu_medium(board, player);

    }
}