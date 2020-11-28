

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class junitPractise {
	private String iSetThisBefore = "set as field";
	private static String iSetThisBeforeClass = "default";
	

	@Test
	public void usingAssertTrue() {
		assertTrue("True is true",true);
		assertTrue("I know what 3+3 is",(3+3)==6);
		String theAnswer = "The Answer";
		assertTrue("The answer is true" ,"the answer".equalsIgnoreCase(theAnswer));
		
	}
	
	@Test
	public void usingAssertFalse() {
		assertFalse("False is not true",!true);
		assertFalse("I always forget hald of seven" , (7/2)==4);
		String 	anAnswer = "An Answer";
		assertFalse("An Answer does not contain The Answer",anAnswer.contains("The"));
	}
	
	@Test
	public void usingAssertEquals() {
		// syntax : Message,Expected,Actual
		
		assertEquals("true== true",true , true);
		String myAnswer="My Answer";
		assertEquals("String Compare",myAnswer,"My Answer");
		assertEquals("3+3",6,3+3);
	}
	
	@Before
	public void setSomethingBeforeToUseLater(){
		iSetThisBefore = "set before";
		
	}
	
	@Test
	public void checkIsSomethingBefore() {
		assertFalse("iSetThisBefore should not equal default value", "set as field".equals(iSetThisBefore));
		assertEquals("iSetThisBefore Should have charged","set before",iSetThisBefore);
		
	}
	
	@BeforeClass
	public static void setSomethingBeforeClass() {
		iSetThisBeforeClass = "for all class methods";
	}
	
	@Test
	public void CheckBeforeClassRan() {
		assertFalse("iSetThisBeforeClass should not equal default value","default".equals(iSetThisBeforeClass));
		assertEquals("iSetThisBeforeClass should have changed","for all class methods",iSetThisBeforeClass);
 	
	
	}
	
	

}