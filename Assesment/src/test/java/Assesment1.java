package Project;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

class Assesment1 {

	public static void main(String[] args) throws InterruptedException {
		
				
				String url = "https://demoqa.com/automation-practice-form";
				WebDriver driver = DriverConnection.driverConnection(url);
				driver.manage().window().maximize();
				Thread.sleep(2000);
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				WebElement ChBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/h5[1]"));
				js.executeScript("arguments[0].scrollIntoView();", ChBox);
				Thread.sleep(2000);
				
				WebElement FName = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[2]/input[1]"));
				FName.sendKeys("Sumit");
				
				WebElement LName = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[4]/input[1]"));
				LName.sendKeys("Alwat");
				
				WebElement Email = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[2]/input[1]"));
				Email.sendKeys("MyEmail.com");
				
				WebElement Gender = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/div[2]/div[1]/label[1]"));
				Gender.click();
				
				WebElement Mobile = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/div[2]/input[1]"));
				Mobile.sendKeys("1111100000");
				
				WebElement Dob = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[5]/div[2]/div[1]/div[1]/input[1]"));
				Dob.click();
								
				WebElement month = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]"));
				Select Month = new Select(month);
				Month.selectByIndex(8);
								
				WebElement year = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]"));
				Select Year = new Select(year);
				Year.selectByContainsVisibleText("2000");
				
				WebElement Day = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[3]"));
				Day.click();
				
				WebElement Hobbies = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[7]/div[2]/div[3]"));
				Hobbies.click();
				
				WebElement Address = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[9]/div[2]/textarea[1]"));
				Address.sendKeys("///");
				
				WebElement Submit = driver.findElement(By.id("submit"));
				Submit.click();
				
				driver.close();
				
				
				
				
	}

}
