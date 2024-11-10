//W.A.J.script to register your self in Gmail.

package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import connection.DriverConnection;

public class P004 {

	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AcMMx-eVRvmGbo1T-dbVJARCo7ERU5yVYlJ0NWL4Zkp10R8ADPYwv1RMiZqTPr6M19JphY30VAbxJQ&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-1996301114%3A1730803059614143&ddm=1";
		WebDriver driver = DriverConnection.driverConnection(url);
		Thread.sleep(2000);
		
		WebElement CrAccount = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/c-wiz[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]"));
		CrAccount.click();
		
		WebElement sel1 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/c-wiz[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/span[3]"));
		sel1.click();
		
		WebElement fill1 = driver.findElement(By.name("firstName"));
		fill1.sendKeys("Sumit");
		
		WebElement Next = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/c-wiz[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]"));
		Next.click();
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/c-wiz[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/select[1]"));
		Select Month = new Select(month);
		Month.selectByIndex(9);
		
		WebElement day = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/c-wiz[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		day.sendKeys("12");
		
		WebElement year = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/c-wiz[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		year.sendKeys("2000");
	
		WebElement xender = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/c-wiz[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/select[1]"));
		Select Xender = new Select(xender);
		Xender.selectByIndex(2);
		
		WebElement Next1 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/c-wiz[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]"));
		Next1.click();
		Thread.sleep(2000);
		
		WebElement Gmail = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/c-wiz[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		Gmail.sendKeys("Sumit505@");
		Thread.sleep(2000);
		
		driver.quit();
	}

}
