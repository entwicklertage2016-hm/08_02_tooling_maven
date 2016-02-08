package com.example.maven;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class BirthdayDayCalculaterTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public BirthdayDayCalculaterTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( BirthdayDayCalculaterTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	BirthdayDayCalculater calc = new BirthdayDayCalculater();
    	String aDate = "01/01/2016";
    	int days = calc.calcTime(aDate);
    	assertEquals(38, days);
    }
}
