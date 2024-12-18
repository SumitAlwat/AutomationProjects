//W.a. junit program to perform test with webdriver to login process of facebook

package jUnit_Assignmnet;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

@RunWith(Parameterized.class)
public class P002 {

	String email;
	String password;

	public P002(String email, String password) {
		this.email = email;
		this.password = password;
	}

	static WebDriver driver = null;

	@Before
	public void openBrowser() {
		String url = "https://www.facebook.com/";
		driver = DriverConnection.driverConnection(url);
	}

	@Test
	public void loginTest() throws InterruptedException {
		WebElement emailEle = driver.findElement(By.name("email"));
		emailEle.clear();
		emailEle.sendKeys(email);
		WebElement passEle = driver.findElement(By.name("pass"));
		passEle.clear();
		passEle.sendKeys(password);
		Thread.sleep(3000);
	}

	@Parameters
	public static List<Object[]> data() {
		Object obj[][] = new Object[4][2];
		obj[0][0] = "incorrect@gmail.com";
		obj[0][1] = "incorrect@123";
		
		obj[1][0] = "correct@gmail.com";
		obj[1][1] = "correct@123";
		
		obj[2][0] = "incorrect@gmail.com";
		obj[2][1] = "correct@123";
		
		obj[3][0] = "correct@gmail.com";
		obj[3][1] = "incorrect@123";
		
		return Arrays.asList(obj);
	}
}