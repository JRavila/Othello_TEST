/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import controller.*;
import java.awt.event.MouseEvent;
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
public class MyClickListenerTest {
    
    public MyClickListenerTest() {
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
     * Test of mouseClicked method, of class MyClickListener.
     */
    @Test
    public void testMouseClicked() { //WORK IN PROGRESS
        System.out.println("mouseClicked");
        MouseEvent mouseEvent = null;
        MyClickListener instance = null;
        instance.mouseClicked(mouseEvent);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}