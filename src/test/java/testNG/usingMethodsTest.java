package testNG;
import org.testng.annotations.Test;

public class usingMethodsTest {
  @Test(groups = {"smoke"})
  public void smoke() {
	  System.out.println("Hi, Smoke Suite");
  }
  @Test(groups = {"regression "})
  public void regression() {
	  System.out.println("Hi, Regression Suite");
  }

  @Test(groups = {"sanity","smoke"})
  public void sanity() {
	  System.out.println("Hi, Sanity Suite");
  }
  @Test(groups = {"healthCheck"})
  public void healthCheck() {
	  System.out.println("Hi, HealthCheck Suite");
  }

  

}