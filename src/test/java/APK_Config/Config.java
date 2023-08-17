package APK_Config;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell; // Update import statement for Cell
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Config {
    public static String USERNAME = "psisodia@axiphyl.com";
    public static String PASSWORD = "Shaktiman@123";
    
    
    
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

}


