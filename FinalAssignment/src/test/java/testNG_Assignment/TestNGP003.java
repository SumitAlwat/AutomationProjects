//W.a. TestNG program to use parameterized demo with multiple parameter of Facebook login with TestNG.


package testNG_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGP003 {

    WebDriver driver;

 
    @BeforeClass
    public void setup() {
        // Set the path for your WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sumit\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
    }

 
    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        return new Object[][]{
            {"testuser1", "password1"},  
            {"testuser2", "password2"}, 
            {"testuser3", "password3"}  
        };
    }

 
    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password) {
        // Enter username and password in the login form
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.name("login")).click();

 
        if (driver.getTitle().contains("Facebook")) {
            System.out.println("Login successful for user: " + username);
        } else {
            System.out.println("Login failed for user: " + username);
        }
    }

 
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

