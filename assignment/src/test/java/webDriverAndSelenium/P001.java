package webDriverAndSelenium;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class P001 {

	    // Set up WebDriver (assuming ChromeDriver is used here)
	    WebDriver driver = new ChromeDriver();
	   
	    // DataProvider annotation used for feeding data from Excel to the test
	    @DataProvider(name = "ExcelDataSheet")
	    public Object[][] getData() throws Exception {
	    	return ExcelUtil.readExcelData("C:\\Users\\Sumit\\OneDrive\\Documents\\ExcelDataSheet.xlsx", "Sheet1");
	    }

	    @Test(dataProvider = "ExcelDataSheet")
	    public void testWebsite(String Username, String Password) {
	        // Launch the website
	        driver.get("https://www.saucedemo.com/");
	        driver.manage().window().maximize();
	       
	        // Locate the elements and perform actions (this is an example for a login page)
	        driver.findElement(By.id("user-name")).sendKeys(Username);  // Replace with your field IDs
	        driver.findElement(By.id("password")).sendKeys(Password);
	        driver.findElement(By.id("login-button")).click();  // Replace with your button ID
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	        try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        try {
				Alert alert = driver.switchTo().alert();
				alert.accept();
			} catch (Exception e) {
				// TODO: handle exception
			}

	        // Add your assertions here to check whether the login is successful
	        // Example: Check for an element that appears after successful login
	        boolean loginSuccessful = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")).isDisplayed();
	        assert loginSuccessful : "Login failed with username: " + Username + " and password: " + Password;
	        

	        // Close the browser after the test
	        driver.close();
	    }
	}


