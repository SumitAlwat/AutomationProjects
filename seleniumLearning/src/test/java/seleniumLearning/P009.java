//W.A.J. Script To find the total hyperlink from this web page http://demo.guru99.com/test/web-table-element.php.

package seleniumLearning;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

public class P009 {

	public static void main(String[] args) {
	
		String url = "http://demo.guru99.com/test/web-table-element.php";
		WebDriver driver = DriverConnection.driverConnection(url);
		
		try {
            // Open the target webpage
            driver.get("http://demo.guru99.com/test/web-table-element.php");

            // Find all <a> elements (hyperlinks) on the page
            List<WebElement> hyperlinks = driver.findElements(By.tagName("a"));

            // Print the total number of hyperlinks
            System.out.println("Total number of hyperlinks: " + hyperlinks.size());

            // Optionally, print each hyperlink URL (for debugging purposes)
            for (WebElement link : hyperlinks) {
                System.out.println(link.getAttribute("href"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
	}

}
