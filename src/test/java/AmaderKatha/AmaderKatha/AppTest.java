package AmaderKatha.AmaderKatha;

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

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    //fixed the conflict
    public void myAppTest() {
    	System.out.println("Writing this code in subh's machine!");

    }
    
    //fixed the conflict
    public void soumiTestAPP() {
    	System.out.println("Soumi writing code from soumi's machine");
    }
    
}
