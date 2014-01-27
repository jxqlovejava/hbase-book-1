/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hi.hbase.book;

import java.util.UUID;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mark
 */
public class UtilTest {
    
    public UtilTest() {
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
     * Test of generateName method, of class Util.
     */
    @Test
    public void testGenerateName() {
        System.out.println("generateName");
        Util instance = new Util();
        String expResult = "";
        String result = instance.generateName();
    }
}