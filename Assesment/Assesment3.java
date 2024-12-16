package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Assesment3 {
	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://demoqa.com/webtables";
		WebDriver driver = DriverConnection.driverConnection(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement web = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/h1[1]"));
		js.executeScript("arguments[0].scrollIntoView();", web);
		Thread.sleep(1000);
		
		WebElement delete = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/span[2]/*[name()='svg'][1]"));
		delete.click();
		
		WebElement edit = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/span[1]/*[name()='svg'][1]/*[name()='path'][1]"));
		edit.click();
		Thread.sleep(1500);
		
		driver.close();
		
	}
}
