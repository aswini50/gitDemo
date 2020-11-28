//import static org.junit.Assert.*;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import org.junit.Test;

public class testNGDemo {

			@BeforeClass
		    public static void beforeClass(){
		        System.out.println("Before class");
		    }

		    @BeforeTest
		    public void beforeTest(){
		        System.out.println("Before test");
		    }

		    @Test
		    public void this1Test(){
		        System.out.println("This is 1 test");
		    }

		    @Test
		    public void this2Test(){
		        System.out.println("This is 2 test");
		    }

		    @Test
		    public void this3Test(){
		        System.out.println("This is 3 test");
		    }

		    @AfterTest
		    public void afterTest(){
		        System.out.println("After Test");
		    }

		    @AfterClass
		    public static void afterClass(){
		        System.out.println("After class");
		    }
		    @BeforeMethod
		    public void beforeMethod() {
		    	System.out.println("Before Method");
		    }

		    @AfterMethod
		    public void afterMethod() {
		    	System.out.println("After Method");
		    }

		    

		}
	