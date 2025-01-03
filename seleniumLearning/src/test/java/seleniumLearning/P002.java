
// W.A.J.Script for Selecting multiple items in a drop-down.

package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

public class P002 {
	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://demoqa.com/select-menu";
		WebDriver driver = DriverConnection.driverConnection(url);
		
		WebElement Ddrop = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/div[1]/div[1]/div[2]/div[1]/*[name()='svg'][1]"));
		Ddrop.click();
		Thread.sleep(2000);
		
		WebElement Sel1 = driver.findElement(By.linkText("Green"));
		Sel1.click();
		
		WebElement Sel2 = driver.findElement(By.linkText("Blue"));
		Sel2.click();
		
		WebElement Sel3 = driver.findElement(By.linkText("Black"));
		Sel3.click();
		
		WebElement Sel4 = driver.findElement(By.linkText("Red"));
		Sel4.click();
		
	}
}
