package com.org.cucumber.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	/**
	 * Java Doc
	 */

	// driver object
	public static WebDriver driver = null;

	// @Before
	// public void int_log() {
	// System.out.println("-----------------Start of Scenario-----------------");
	//
	// }
	@Before("@scenario1")
	public void setupt() {
		// System.out.println("-----------------Start of Scenario-----------------");
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://toolsqa.com/");
		driver.manage().window().maximize();
	}

	@After
	public void screenshot1(Scenario s) {

		try {

			byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

			s.embed(screenshot, "image/png");

		} catch (

		WebDriverException wde) {
			System.err.println(wde.getMessage());
		} catch (ClassCastException cce) {
			cce.printStackTrace();
		}
//		finally {
//			driver.quit();
//		}

	}

	// @After(order=0)
	// public void teardown() {
	//
	// System.out.println("-----------------End of Scenario-----------------");
	// driver.quit;
}
