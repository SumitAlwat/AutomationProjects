package paraBank;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnit{
	
	public static WebDriver driver;

	@BeforeClass
	public static void setup(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sumit\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public static  void close() {
		driver.quit();
		}
	
	@Test

	public void testA() throws InterruptedException {
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		Thread.sleep(1000);
		}
	
	@Test
	public void testB()  {
		WebElement register = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/p[2]/a[1]"));
		register.click();
    	}

	@Test
   
	public void testC() throws InterruptedException  {
		WebElement fname = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]"));
		fname.sendKeys("Sumit");
		
		WebElement lname = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]"));
		lname.sendKeys("Alwat");
		
		WebElement adress = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/form[1]/table[1]/tbody[1]/tr[3]/td[2]/input[1]"));
		adress.sendKeys(".");
		
		WebElement city = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/form[1]/table[1]/tbody[1]/tr[4]/td[2]/input[1]"));
		city.sendKeys("Ahmedabad");
		
		WebElement state = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/form[1]/table[1]/tbody[1]/tr[5]/td[2]/input[1]"));
		state.sendKeys("Gujarat");
		
		WebElement zcode = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/form[1]/table[1]/tbody[1]/tr[6]/td[2]/input[1]"));
		zcode.sendKeys("380026");
		
		WebElement phone = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/form[1]/table[1]/tbody[1]/tr[7]/td[2]/input[1]"));
		phone.sendKeys("9909513656");
		
		WebElement ssn = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/form[1]/table[1]/tbody[1]/tr[8]/td[2]/input[1]"));
		ssn.sendKeys("00");

		WebElement username = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/form[1]/table[1]/tbody[1]/tr[10]/td[2]/input[1]"));
		username.sendKeys("Sumit");
		
		WebElement password = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/form[1]/table[1]/tbody[1]/tr[11]/td[2]/input[1]"));
		password.sendKeys("Sumit505");
		
		WebElement confirm = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/form[1]/table[1]/tbody[1]/tr[12]/td[2]/input[1]"));
		confirm.sendKeys("Sumit505");
		
		WebElement btn = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/form[1]/table[1]/tbody[1]/tr[13]/td[2]/input[1]"));
		btn.click();
		
		Thread.sleep(1000);
	}
	
	@Test 
	
	public void testD() throws InterruptedException {
		WebElement username1 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/input[1]"));
		username1.sendKeys("Sumit");
		
		WebElement pass = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[2]/input[1]"));
	    pass.sendKeys("Sumit505");
	    
	    WebElement login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[3]/input[1]"));
		login.click();
		
		Thread.sleep(1000);
	}
	
	@Test
	
	public void testE() throws InterruptedException {

		WebElement tFund = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/ul[1]/li[3]/a[1]"));
		tFund.click();
	
		WebElement amount = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/p[1]/input[1]"));
		amount.sendKeys("150");
		
		WebElement transfer = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]"));
		transfer.click();
		 
		Thread.sleep(1000);
	}
	
	@Test
	
	public void testF() throws InterruptedException {
		WebElement bill = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/ul[1]/li[4]/a[1]"));
		bill.click();
		
		WebElement pName = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]"));
		pName.sendKeys("Harsh");
		
		WebElement Add = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]"));
		Add.sendKeys(".");
		
		WebElement city1 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[3]/td[2]/input[1]"));
		city1.sendKeys("Vadodara");
		
		WebElement state1 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[4]/td[2]/input[1]"));
		state1.sendKeys("Gujarat");
		
		WebElement zip = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[5]/td[2]/input[1]"));
		zip.sendKeys(".");
		
		WebElement phone1 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[6]/td[2]/input[1]"));
		phone1.sendKeys(".");
		
		WebElement Account = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[8]/td[2]/input[1]"));
		Account.sendKeys("1515");
		
		WebElement vAccount = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[9]/td[2]/input[1]"));
		vAccount.sendKeys("1515");
		
		WebElement Amount = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[11]/td[2]/input[1]"));
		Amount.sendKeys("500");
		
		WebElement transfer1 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[14]/td[2]/input[1]"));
		transfer1.click();
		
		Thread.sleep(1000);
	}
	
	@Test
	
	public void testG() throws InterruptedException {
		WebElement find = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/ul[1]/li[5]/a[1]"));
		find.click();
		
		WebElement byAccount = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[8]/input[1]"));
		byAccount.sendKeys("1515");
		
		WebElement findBtn = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[9]/button[1]"));
		findBtn.click();
		
		Thread.sleep(1000);
	}
	
	@Test
	
	public void testH() {
		WebElement change = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/ul[1]/li[6]/a[1]"));
		change.click();
		
		WebElement change1 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[3]/td[2]/input[1]"));
		change1.clear();
		
		WebElement change2 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[3]/td[2]/input[1]"));
		change2.sendKeys("..");
		
		WebElement Update = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[8]/td[2]/input[1]"));
		Update.click();
	}
	
	@Test
	
	public void testI() throws InterruptedException {
		WebElement loan = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/ul[1]/li[7]/a[1]"));
		loan.click();
				
		WebElement loanAm = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]"));
		loanAm.sendKeys("500");
		
		WebElement DP = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]"));
		DP.sendKeys("200");
		
		WebElement Apply = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[4]/td[2]/input[1]"));
		Apply.click();
		
		Thread.sleep(1000);
	}
	
	@Test
	
	public void testJ() throws InterruptedException {
		WebElement logout = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/ul[1]/li[8]/a[1]"));
		logout.click();
		
		Thread.sleep(2000);

	}
	
	
	

}
