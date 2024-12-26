package paraBank;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JUnit {

	@BeforeClass
	public static WebDriver Driver(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sumit\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		url = "https://parabank.parasoft.com/parabank/index.htm";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	@Test
	public void test1() {
		
		WebElement register = driver.
	}
}
