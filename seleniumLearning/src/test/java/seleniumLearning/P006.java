//W.A.J.Script To use Mouse and Keyboard event using Action class

package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import connection.DriverConnection;

public class P006 {

	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://demo.guru99.com/test/radio.html";
		WebDriver driver = DriverConnection.driverConnection(url);
		
		//1. Mouse Event
		WebElement box1 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/input[4]"));
		WebElement box2 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/input[5]"));
		WebElement box3 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/input[6]"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(box1).build().perform();
		Thread.sleep(2000);
		
		actions.moveToElement(box2).build().perform();
		Thread.sleep(2000);
		
		actions.moveToElement(box3).build().perform();
		Thread.sleep(2000);
		
		driver.close();
	}

}
