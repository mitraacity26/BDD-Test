package com.org.automation.testingworld.utility;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {

	// static WebDriver driver;
	//public static Scenario s;
	// public Utility(WebDriver driver)

	// {
	// Utility.driver = driver;

	// }

//	public Utility(Scenario s)
//
//	{
//		Utility.s = s;
//
//	}

	public static Object fetchPropertyValue(String key) throws Exception {

		FileInputStream file = new FileInputStream("./Config/config.properties");
		Properties property = new Properties();
		property.load(file);
		return property.get(key);

	}

	public static Object fetchOR(String key) throws Exception {

		FileInputStream file = new FileInputStream("./Config/ElementRepository.properties");
		Properties property = new Properties();
		property.load(file);
		return property.get(key);

	}

	public static void highlight(WebDriver driver, WebElement ele) throws Exception {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// use executeScript() method and pass the arguments
		// Here i pass values based on css style. Yellow background color with solid red
		// color border.
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);

	}

	public static void explicit_wait(WebDriver driver, By ele, int wait_time) throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, wait_time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ele));

	}

	public static void Implicit_wait(WebDriver driver, int timeinsec) throws Exception {
		driver.manage().timeouts().implicitlyWait(timeinsec, TimeUnit.SECONDS);

	}

	public static void ScrolltoView(WebDriver driver, WebElement ele) throws Exception {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);

	}

	// Screenshot
	public static String getScreenshot(WebDriver driver, String screenshotName) throws Exception {
		// below line is just to append the date format with the screenshot name to
		// avoid duplicate names
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		// after execution, you could see a folder "FailedTestsScreenshots" under src
		// folder
		String destination = System.getProperty("user.dir") + "/Screenshots/" + screenshotName + dateName + ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		// Returns the captured file path
		return destination;
	}


	// upload n download to be implemented

}
