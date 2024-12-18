//W.a. junit program to check gmail login using with @before,@after,@Test.


package jUnit_Assignment;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import connection.DriverConnection;

public class P003{
	static WebDriver driver = null;
	
	@Before
	public static void openBrowser() {
		
		String url = "https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&ifkv=AcMMx-dIb2nvR6aPIES5Gbfzo2BUH5Xn_I_n2Cioc76wLo8PEzPqgDuBGL7wZpF5UIpOEOCekPalXA&ddm=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
		driver = DriverConnection.driverConnection(url);
	
	}
	
	@Test
	public void titleCheck() throws InterruptedException {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "Gmail";
		assertEquals(expectedTitle, actualTitle);
		Thread.sleep(3000);
	}
	
	@After
	public static void closeBrowser() {
		driver.quit();
	}
}
