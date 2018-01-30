package org.myProj;

import java.util.Arrays;

import org.algo.sort.Bubble;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testApp()
    {
        assertTrue( true );
    }
    
	public void testPrintHelloWorld() {

		assertEquals(App.getHelloWorld(), "Hello World");

	}
	
	public void testBubble() {
		int[] arr = {5,9,3,1,2,8,4,7,6};
		Bubble.sort(arr);
		int []result ={1,2,3,4,5,6,7,8,8};
		assertTrue( Arrays.equals(arr, result) );
//		Assert.assertArrayEquals(arr,result);
	}
    
}
