package webDriverAndSelenium;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;



public class P002 {
	private WebDriver driver;

	    @BeforeEach
	    public void setUp() {
	        // Set path to your ChromeDriver
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sumit\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    }

	    @AfterEach
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }

	    @Test
	    public void testKeywordDriven() throws IOException {
	        // Load the test data from the Excel file
	        String filePath = "C:\\Users\\Sumit\\OneDrive\\Documents\\Ecxeldatasheet1.xlsx";
	        FileInputStream fis = new FileInputStream(new File(filePath));
	        Workbook workbook = new XSSFWorkbook(fis);
	        Sheet sheet = workbook.getSheetAt(0);
	        Iterator<Row> rowIterator = sheet.iterator();

	        // Skip header row
	        rowIterator.next();

	        // Loop through each row in the Excel sheet
	        while (rowIterator.hasNext()) {
	            Row row = rowIterator.next();
	            String keyword = row.getCell(0).getStringCellValue();
	            String element = row.getCell(1).getStringCellValue();
	            String data = row.getCell(2) != null ? row.getCell(2).getStringCellValue() : "";

	            // Perform the corresponding action based on the keyword
	            performAction(keyword, element, data);
	        }

	        workbook.close();
	        fis.close();
	    }

	    private void performAction(String keyword, String element, String data) {
	        try {
	            WebElement webElement;
	            switch (keyword.toLowerCase()) {
	                case "open_url":
	                    driver.get(element);
	                    break;

	                case "click":
	                    webElement = driver.findElement(By.xpath(element));
	                    webElement.click();
	                    break;

	                case "send_keys":
	                    webElement = driver.findElement(By.xpath(element));
	                    webElement.sendKeys(data);
	                    break;

	                case "clear":
	                    webElement = driver.findElement(By.xpath(element));
	                    webElement.clear();
	                    break;


	                default:
	                    System.out.println("Unknown keyword: " + keyword);
	                    break;
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	            System.out.println("Error performing action: " + e.getMessage());
	        }
	    }
	    
}


