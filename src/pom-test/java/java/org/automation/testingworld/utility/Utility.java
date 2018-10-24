package java.org.automation.testingworld.utility;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {

	static WebDriver driver;

	public Utility(WebDriver driver)

	{
		Utility.driver = driver;

	}

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

	public static void highlight(WebElement ele) throws Exception {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// use executeScript() method and pass the arguments
		// Here i pass values based on css style. Yellow background color with solid red
		// color border.
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);

	}

	public static void explicit_wait(By ele, int wait_time) throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, wait_time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ele));

	}

	public static void ScrolltoView(WebElement ele) throws Exception {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);

	}

}
