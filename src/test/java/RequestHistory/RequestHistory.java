package RequestHistory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import APK_Config.TestConfig;

public class RequestHistory {

	public static void main(String[] args) {
		WebDriver driver = TestConfig.getDriver();
		driver.get(TestConfig.getBaseUrl());
		driver.manage().window().maximize();

		driver.navigate().refresh();
		driver.navigate().refresh();
		System.out.println(driver.getTitle());

//        // Wait for the error message to be displayed
		Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(500)).ignoring(org.openqa.selenium.NoSuchElementException.class);

		String username = TestConfig.USERNAME;
		String password = TestConfig.PASSWORD;
		driver.findElement(By.id("userName")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);

		// Click on the submit button
		driver.findElement(By.cssSelector("button.btn.btn-primary.btn-lg.btn-block.submitbtn")).click();
		//
		TestConfig.performCommonActions(driver);
		//        driver.quit();
		WebElement RequestHistory = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#requestHistoryDetails")));
		RequestHistory.click();

		// upload stock-----------------------------------
		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]/option[6]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[5]")).click();

		driver.findElement(By.xpath("//*[@id=\"endDate\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[7]")).click();

		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[3]/label[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[5]/div[2]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[3]/label[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"instId\"]")).click();

		WebElement selectClinic = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-id-1 > li:nth-child(1)")));
		selectClinic.click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[5]/div[2]/input")).click();

		// @both-------------------------------------********************************
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]/option[1]")).click();
		// upload stock-----------------------------------
		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]/option[6]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[5]")).click();

		driver.findElement(By.xpath("//*[@id=\"endDate\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[7]")).click();

		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[3]/label[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[5]/div[2]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[3]/label[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"instId\"]")).click();

		WebElement selectClinic1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-id-1 > li:nth-child(1)")));
		selectClinic1.click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[5]/div[2]/input")).click();

		// patient************************
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"appDataSessionId\"]/option[3]")).click();
		// upload stock-----------------------------------
		driver.findElement(By.xpath("//*[@id=\"startDate\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]/option[6]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[5]")).click();

		driver.findElement(By.xpath("//*[@id=\"endDate\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[7]")).click();

		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[3]/label[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[5]/div[2]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[3]/label[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"instId\"]")).click();

		WebElement selectClinic2 = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-id-1 > li:nth-child(1)")));
		selectClinic2.click();
		driver.findElement(By.xpath("//*[@id=\"labReportForm\"]/div[5]/div[2]/input")).click();

	}

}
