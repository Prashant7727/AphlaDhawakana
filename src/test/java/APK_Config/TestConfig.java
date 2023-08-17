package APK_Config;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestConfig {
	//public static final String FILE_PATH = "D:\\Book2.xlsx";
	//public static final String SHEET_NAME = "Sheet1"; // Change this to the name of your sheet

	public static String USERNAME="psisodia@axiphyl.com";
	public static String PASSWORD="Shaktiman@123";

	/*static {
		readCredentialsFromExcel();
	}*/
	// Test URL
	private static final String BASE_URL = "https://testserver.medongo.com:8443/admin/control/cclogin";

	public static WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	private static Wait<WebDriver> createFluentWait(WebDriver driver) {
		return new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(500))
				.ignoring(org.openqa.selenium.NoSuchElementException.class);
	}

	// selecting
	public static void performCommonActions(WebDriver driver) {
		// Wait for the error message to be displayed
		Wait<WebDriver> wait = createFluentWait(driver);

		// select radio
		// button.........................................................................
		WebElement radioButton = wait.until(ExpectedConditions.elementToBeClickable(
				By.cssSelector("#measurementsList > div:nth-child(3) > div > div.col-sm-4 > div > label")));
		radioButton.click();

		// Click on the "Continue" button
		WebElement continueButton = wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector("body > aside > div > div > div.card-body > div > a")));
		continueButton.click();

		WebElement hamburgerElement = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"nav\"]/div/label")));
		hamburgerElement.click();
	}

	// User datasend using exceal sheet
	/*private static void readCredentialsFromExcel() {
		try {
			FileInputStream fis = new FileInputStream(FILE_PATH);
			Workbook workbook = new XSSFWorkbook(fis);
			Sheet sheet = workbook.getSheet(SHEET_NAME);

			Row row = sheet.getRow(1); // Assuming the first row contains headers, and data starts from the second row

			Cell cellUsername = row.getCell(0);
			USERNAME = cellUsername.getStringCellValue();

			Cell cellPassword = row.getCell(1);
			PASSWORD = cellPassword.getStringCellValue();

			workbook.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	} */

	public static String getBaseUrl() {
		return BASE_URL;
	}

}
