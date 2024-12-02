package Project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import connection.DriverConnection;

public class P01 {

	public static void main(String[] args) throws InterruptedException{

		String url = "https://only-testing-blog.blogspot.com/?fname=&lname=";
		WebDriver driver = DriverConnection.driverConnection(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement GP1 = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]"));
		GP1.sendKeys("GP1");
		
		WebElement P1 = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]"));
		P1.sendKeys("P1");
		
		WebElement C1 = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		C1.sendKeys("C1");
		
		Thread.sleep(1000);
		
		
		WebElement GP2 = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/input[1]"));
		GP2.sendKeys("GP2");
		
		WebElement P2 = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/input[1]"));
		P2.sendKeys("P2");
		
		WebElement C2 = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		C2.sendKeys("C2");
		
		Thread.sleep(1000);
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ChBox = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]"));
		js.executeScript("arguments[0].scrollIntoView();", ChBox);
		Thread.sleep(2000);
		
		
		WebElement OP1 = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]"));
		OP1.click();
		
		WebElement OP2 = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]"));
		OP2.click();
		
		WebElement OP3 = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/input[1]"));
		OP3.click();
		
		WebElement OP4 = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/input[1]"));
		OP4.click();
		
		WebElement OP5 = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[5]/td[1]/input[1]"));
		OP5.click();
		
		Thread.sleep(2000);
		
		WebElement OP05 = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[5]/td[1]/input[1]"));
		OP05.click();
		
		WebElement OP04 = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/input[1]"));
		OP04.click();
		
		WebElement OP03 = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/input[1]"));
		OP03.click();
		
		WebElement OP02 = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]"));
		OP02.click();
		
		WebElement OP01 = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]"));
		OP01.click();
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		WebElement Alt1 = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]"));
		act.doubleClick(Alt1).perform();
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert1.accept();
		Thread.sleep(2000);
		
		
		
		WebElement TeBox = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[13]/div[1]/div[1]/div[1]/h3[1]/a[1]"));
		js.executeScript("arguments[0].scrollIntoView();", TeBox); 
		Thread.sleep(2000);
		
		WebElement FName = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[13]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]"));
		FName.sendKeys("Sumit");

		WebElement Vehicle = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[13]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[5]"));
		act.doubleClick(Vehicle).perform();
		
		WebElement Xender = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[13]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[8]"));
		act.doubleClick(Xender).perform();
		
		WebElement VBox = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[13]/div[1]/div[1]/div[1]/div[2]/div[1]/select[1]"));
		Select Car = new Select(VBox);
		Car.selectByIndex(1);
		
		Thread.sleep(2000);
		
		WebElement Country = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[13]/div[1]/div[1]/div[1]/div[2]/div[1]/form[2]/table[1]/tbody[1]/tr[1]/td[1]/select[1]/option[6]"));
		Country.click();
		
		WebElement Take = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[13]/div[1]/div[1]/div[1]/div[2]/div[1]/form[2]/table[1]/tbody[1]/tr[1]/td[2]/input[1]"));
		Take.click();

		WebElement Alt2 = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[13]/div[1]/div[1]/div[1]/div[2]/div[1]/button[2]"));
		Alt2.click();
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert2.accept();
		Thread.sleep(2000);
		
		
		driver.close();
		}

}