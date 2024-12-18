//W.A.J. Script How to handled Alert in selenium "http://demo.guru99.com/test/delete_customer.php "

package seleniumLearning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

public class P008 {

	public static void main(String[] args) {
		
		String url = "http://demo.guru99.com/test/delete_customer.php";
		WebDriver driver = DriverConnection.driverConnection(url);
		
		WebElement Cid = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]"));
		Cid.sendKeys("C1");
		
		WebElement Submit = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/table[1]/tbody[1]/tr[3]/td[2]/input[1]"));
		Submit.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();

		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		
		driver.close();
	}

}
