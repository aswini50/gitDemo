package selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstTestSelenium {

	
	@Test
	public void startWebDriver(){

	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    System.out.println("Step3");
    driver.navigate().to("https://testpages.herokuapp.com");
    System.out.println("Step4");
    Assert.assertTrue(
                        driver.getTitle().startsWith("Selenium"),"title should start with Selenium");
    System.out.println("Step5"); 
    driver.close();
    driver.quit();
}

}