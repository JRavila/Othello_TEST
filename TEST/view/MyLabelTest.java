/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import view.*;
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
public class MyLabelTest { //WORK IN PROGRESS
    
    public MyLabelTest() {
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
     * Test of getRow method, of class MyLabel.
     */
    @Test
    public void testGetRow() { //WORK IN PROGRESS
        System.out.println("getRow");
        view.MyLabel instance = null;
        boolean expResult = true;
        int result = instance.getRow();
        if(result==(int)result)
        {
            assertEquals(expResult, true);
        }else fail("NOT INTEGER");

    }

    /**
     * Test of getColumn method, of class MyLabel.
     */
    @Test
    public void testGetColumn() {
        System.out.println("getColumn");
        MyLabel instance = null;
        int expResult = 0;
        int result = instance.getColumn();
        assertEquals(expResult, result);

    }
}