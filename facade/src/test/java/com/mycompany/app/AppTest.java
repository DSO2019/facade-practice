package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Test for facade.
 */
public class AppTest extends TestCase {

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * AppTest
     * @param testMePLS name of the test case
     */
    public AppTest( String testMePLS )
    {
        super( testMePLS );
    }


    /**
     * Start test
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
