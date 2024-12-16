package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class P001 {
	
	 WebDriver driver;

	    // Before each test, we set up the WebDriver and open the site
	    @BeforeClass
	    public void setUp() {
	        // Set the system property for ChromeDriver (adjust the path to your system)
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sumit\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");  // Replace with your path

	        // Open the PhpTravels demo website
	        driver.get("https://phptravels.com/demo/");
	    }

	    // Test 1: Verify if the title of the page contains "PHPTRAVELS"
	    @Test
	    public void testPageTitle() {
	        String title = driver.getTitle();
	        Assert.assertTrue(title.contains("PHPTRAVELS"), "Page title does not contain 'PHPTRAVELS'");
	    }

	    // Test 2: Verify if the 'Home' link is displayed and clickable
	    @Test
	    public void testHomeLink() {
	        WebElement homeLink = driver.findElement(By.linkText("Home"));
	        Assert.assertTrue(homeLink.isDisplayed(), "Home link is not displayed");
	        homeLink.click();

	        // Assert that we are on the home page (after clicking "Home")
	        Assert.assertTrue(driver.getTitle().contains("PHPTRAVELS"), "Home link did not navigate to the correct page");
	    }

	    // Test 3: Test the search functionality on the demo page
	    @Test
	    public void testSearchFunctionality() {
	        WebElement searchBox = driver.findElement(By.id("autocomplete"));
	        WebElement searchButton = driver.findElement(By.id("search"));
	        
	        // Enter some search text (e.g., "Dubai")
	        searchBox.sendKeys("Dubai");

	        // Click the search button
	        searchButton.click();

	        // Wait for results to load (simple wait, could be improved with WebDriverWait)
	        try {
	            Thread.sleep(2000);  // Ideally, use WebDriverWait instead of Thread.sleep
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Verify that results are shown (this can be refined further based on actual page behavior)
	        WebElement results = driver.findElement(By.xpath("//h3[contains(text(), 'Dubai')]"));
	        Assert.assertTrue(results.isDisplayed(), "Search results are not displayed for 'Dubai'");
	    }

	    // Test 4: Test the contact form (fill in the form and submit)
	    @Test
	    public void testContactForm() {
	        WebElement contactUsLink = driver.findElement(By.linkText("Contact Us"));
	        contactUsLink.click();

	        // Wait for the Contact Us page to load
	        try {
	            Thread.sleep(2000);  // Ideally, use WebDriverWait here
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Fill out the contact form (name, email, message)
	        WebElement nameField = driver.findElement(By.name("name"));
	        WebElement emailField = driver.findElement(By.name("email"));
	        WebElement messageField = driver.findElement(By.name("message"));
	        WebElement submitButton = driver.findElement(By.xpath("//button[text()='Send Message']"));

	        nameField.sendKeys("John Doe");
	        emailField.sendKeys("johndoe@example.com");
	        messageField.sendKeys("This is a test message.");
	        submitButton.click();

	        // Verify that the form submission was successful
	        WebElement successMessage = driver.findElement(By.xpath("//div[@class='alert alert-success']"));
	        Assert.assertTrue(successMessage.isDisplayed(), "Success message is not displayed after form submission");
	    }

	    // After each test, we close the browser
	    @AfterClass
	    public void tearDown() {
	        // Close the browser
	        driver.quit();
	    }
}
