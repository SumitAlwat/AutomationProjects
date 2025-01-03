//W.A.J. Script To perform the radio button to select one by one in loop http://demo.guru99.com/test/radio.html.

package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import connection.DriverConnection;

public class P005 {
	public static void main(String[] args) throws InterruptedException {
		
		String url = "http://demo.guru99.com/test/radio.html";
		WebDriver driver = DriverConnection.driverConnection(url);
		
		WebElement radio1 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/input[1]"));
		radio1.click();
		Thread.sleep(1000);

		WebElement radio2 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/input[2]"));
		radio2.click();
		Thread.sleep(1000);
		
		WebElement radio3 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/input[3]"));
		radio3.click();
		Thread.sleep(1000);
		
		driver.close();
	}
}
