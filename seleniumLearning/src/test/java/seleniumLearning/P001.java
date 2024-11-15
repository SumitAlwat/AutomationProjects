//W.A.J.Script for Locating links by linkText() and partialLinkText().


package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import connection.DriverConnection;

public class P001 {

	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://the-internet.herokuapp.com/";
		WebDriver driver = DriverConnection.driverConnection(url);
		Thread.sleep(2000);
		
		WebElement ltext = driver.findElement(By.linkText("A/B Testing"));
		ltext.click();
		Thread.sleep(2000);
		
		driver.close();

		WebDriver driver1 = DriverConnection.driverConnection(url);
		Thread.sleep(2000);

		
		WebElement ptext = driver1.findElement(By.partialLinkText("Broken Images"));
		ptext.click();
		Thread.sleep(2000);
		driver1.close();
		
	}

}
