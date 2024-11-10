package TestNGLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class P002 {
	 WebDriver driver;

	    @BeforeTest
	    public void setUp() {
	        
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sumit\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");  
	       
	        driver = new ChromeDriver();

	        driver.get("https://mail.google.com/");
	    }

	    @Test
	    public void testLogin() {
	       
	        WebElement emailField = driver.findElement(By.id("identifierId"));
	        WebElement nextButton1 = driver.findElement(By.id("identifierNext"));
	       
	        emailField.sendKeys("MyMail@gmail.com");

	        nextButton1.click();

	        try {
	            Thread.sleep(2000);  
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        WebElement passwordField = driver.findElement(By.name("password"));
	        WebElement nextButton2 = driver.findElement(By.id("passwordNext"));

	        passwordField.sendKeys("password");  

	        nextButton2.click();

	        try {
	            Thread.sleep(5000); 
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	       
	        WebElement composeButton = driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']"));
	        Assert.assertTrue(composeButton.isDisplayed(), "Login failed or inbox not loaded");
	    }

	    @AfterTest
	    public void tearDown() {
	        driver.quit();
	    }
}
