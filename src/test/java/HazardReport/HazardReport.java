package HazardReport;

import java.awt.AWTException;
import java.time.Duration;
//import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import APK_Config.Config;
import APK_Config.TestConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HazardReport {

	@Test
	public  void HazardReport() {
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
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
				WebElement HazardReport = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"accordion\"]/div[21]/div/ul/li")));
				HazardReport.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// ................................clinic..................................
		// ............................ 1
		// 1)
		WebElement inputField = driver.findElement(By.xpath("//*[@id=\"NOTE12440\"]"));
		inputField.sendKeys("sdgkj111");

		driver.findElement(By.id("status12440")).click();
		driver.findElement(By.xpath("//*[@id=\"status12440\"]/option[4]")).click();

		WebElement inputField11 = driver.findElement(By.id("mobile12440"));
		inputField11.sendKeys("9684478785");

		driver.findElement(By.xpath("//*[@id=\"addStatusForm12440\"]/div/div[4]/div/a")).click();

		// 2)
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement inputField1 = driver.findElement(By.xpath("//*[@id=\"NOTE12440\"]"));
		inputField1.sendKeys("sdgkj222");

		driver.findElement(By.id("status12440")).click();
		driver.findElement(By.xpath("//*[@id=\"status12440\"]/option[3]")).click();

		WebElement inputField12 = driver.findElement(By.id("mobile12440"));
		inputField12.sendKeys("7784478785");

		driver.findElement(By.xpath("//*[@id=\"addStatusForm12440\"]/div/div[4]/div/a")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// cross button
		driver.findElement(By.xpath("//*[@id=\"12440\"]")).click();
		try {
			TimeUnit.SECONDS.sleep(4);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// ..........................patient......................................

		driver.findElement(By.id("appDataSessionId")).click();
		WebElement patientApp = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appDataSessionId\"]/option[3]")));
		patientApp.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// ............................ 1
		// 1)
		WebElement patientinputField = driver.findElement(By.xpath("//*[@id=\"NOTE12440\"]"));
		patientinputField.sendKeys("sdgkj111");

		driver.findElement(By.id("status12440")).click();
		driver.findElement(By.xpath("//*[@id=\"status12440\"]/option[4]")).click();

		WebElement patientinputField11 = driver.findElement(By.id("mobile12440"));
		patientinputField11.sendKeys("9684478785");

		driver.findElement(By.xpath("//*[@id=\"addStatusForm12440\"]/div/div[4]/div/a")).click();

		// 2)
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement patientinputField1 = driver.findElement(By.xpath("//*[@id=\"NOTE12440\"]"));
		patientinputField1.sendKeys("sdgkj222");

		driver.findElement(By.id("status12440")).click();
		driver.findElement(By.xpath("//*[@id=\"status12440\"]/option[3]")).click();

		WebElement patientinputField12 = driver.findElement(By.id("mobile12440"));
		patientinputField12.sendKeys("7784478785");

		driver.findElement(By.xpath("//*[@id=\"addStatusForm12440\"]/div/div[4]/div/a")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// cross button
		driver.findElement(By.xpath("//*[@id=\"12440\"]")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// .....................both..............................................

		driver.findElement(By.id("appDataSessionId")).click();
		WebElement both = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"appDataSessionId\"]/option[1]")));
		both.click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// ............................ 1
		// 1)
		WebElement bothinputField = driver.findElement(By.xpath("//*[@id=\"NOTE12440\"]"));
		bothinputField.sendKeys("sdgkj111");

		driver.findElement(By.id("status12440")).click();
		driver.findElement(By.xpath("//*[@id=\"status12440\"]/option[4]")).click();

		WebElement bothinputField11 = driver.findElement(By.id("mobile12440"));
		bothinputField11.sendKeys("9684478785");

		driver.findElement(By.xpath("//*[@id=\"addStatusForm12440\"]/div/div[4]/div/a")).click();

		// 2)
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement bothinputField1 = driver.findElement(By.xpath("//*[@id=\"NOTE12440\"]"));
		bothinputField1.sendKeys("sdgkj222");

		driver.findElement(By.id("status12440")).click();
		driver.findElement(By.xpath("//*[@id=\"status12440\"]/option[3]")).click();

		WebElement bothinputField12 = driver.findElement(By.id("mobile12440"));
		bothinputField12.sendKeys("7784478785");

		driver.findElement(By.xpath("//*[@id=\"addStatusForm12440\"]/div/div[4]/div/a")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// cross button
		driver.findElement(By.xpath("//*[@id=\"12440\"]")).click();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
			
			
		}
		driver.quit();

	}

}
