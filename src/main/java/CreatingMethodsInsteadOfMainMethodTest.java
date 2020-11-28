import static org.junit.Assert.*;

import org.junit.Test;

public class CreatingMethodsInsteadOfMainMethodTest {

	int a = 10;
	int b =9 ;
	@Test // Annotation
	public void testSum() {
		//fail("Not yet implemented");
		if ( a>b)
		{
			System.out.println("Your test passed");
		}
		else 
		{
			System.out.println("Your test failed");
		}
	}

	@Test // Annotation
	public void testDifference() {
		//fail("Not yet implemented");
		System.out.println("This is a simple example of TDD ");
	}

}
