package Project;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

class Assesment2 {

	public static void main(String[] args) throws InterruptedException {


		String url = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
		WebDriver driver = DriverConnection.driverConnection(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement TBL = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/h5[1]"));
		js.executeScript("arguments[0].scrollIntoView();", TBL);
		Thread.sleep(2000);
		
		        try {
	
		            driver.get("/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]");

	
		            WebElement table = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]")); // Use the correct XPath for your table


		            List<WebElement> rows = table.findElements(By.tagName("tr"));


		            int actualRowCount = rows.size() - 1; // Assuming the first row is the header


		            if (actualRowCount == 4) {
		                System.out.println("Test Passed: There are exactly 4 rows in the table.");
		            } else {
		                System.out.println("Test Failed: Expected 4 rows, but found " + actualRowCount + " rows.");
		            }

		        } catch (Exception e) {
		            e.printStackTrace();
		        } finally {

		            driver.quit();
		        }
		    }


	}
