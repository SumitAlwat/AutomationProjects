package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class Assesment4 {

	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://demo.guru99.com/";
		WebDriver driver = DriverConnection.driverConnection(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/table[1]/tbody[1]/tr[5]/td[2]/input[1]"));
		email.sendKeys("myemail.com");
		
		WebElement submit = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/table[1]/tbody[1]/tr[6]/td[2]/input[1]"));
		submit.click();
		
		

	}

}
