// Test to log in to Facebook
package testNG_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class TestNGP001 {
	
	 WebDriver driver;

	    @BeforeClass
	    public void setUp() {

	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sumit\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 

	        driver = new ChromeDriver();

	        driver.get("https://www.facebook.com/");
	    }

	    @Test
	    public void testLogin() {
	       
	        WebElement emailField = driver.findElement(By.id("email"));
	        WebElement passwordField = driver.findElement(By.id("pass"));
	        WebElement loginButton = driver.findElement(By.name("login"));

	        emailField.sendKeys("MyEmail.com");
	        passwordField.sendKeys("Password");
	        
	        loginButton.click();
	   
	        try {
	            Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }


	        String pageTitle = driver.getTitle();
	        Assert.assertTrue(pageTitle.contains("Facebook"), "Login failed or the page title does not contain 'Facebook'");
	    }

	    @AfterClass
	    public void tearDown() {
	       
	        driver.quit();
	    }
	
}
