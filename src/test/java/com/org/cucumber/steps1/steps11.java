package com.org.cucumber.steps1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.org.automation.testingworld.utility.Utility;
import com.org.cucumber.hooks.Hooks;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class steps11 {

	public static WebDriver driver = null;
	// Scenario s;

	public steps11() {

		driver = Hooks.driver;
		// s=Hooks.s;
		// steps11.s=s;

	}

	@Given("^I am on the toolsqa Site$")
	public void i_am_on_the_toolsqa_Site() throws Exception {
		Utility.Implicit_wait(driver, 30);
		System.out.println("Given1");

	}

	@When("^I click on Contact us option under About$")
	public void i_click_on_Contact_us_option_under_About() throws Exception {

		// highlight
		Utility.highlight(driver, driver.findElement(By.xpath("//span[@class='menu-text' and text()='ABOUT']")));
		// Action class used to perform mouse hover
		Actions builder = new Actions(driver);
		// Fetch property values from ElementRepository file using fetchOR function
		builder.moveToElement(driver.findElement(By.xpath("//span[@class='menu-text' and text()='ABOUT']"))).perform();

		builder.moveToElement(driver.findElement(By.xpath("//span[@class='menu-text' and text()='Contact Us']")))
				.click().perform();

		System.out.println("When1");
	}

	@Then("^I should be navigated to Contact us page$")
	public void i_should_be_navigated_to_Contact_us_page() throws Throwable {
		System.out.println("Then1");
		// String ss=Utility.getScreenshot(driver, "abv");
		// System.out.println(ss);
		// Reporter.addScreenCaptureFromPath(ss.toString());
		// Reporter.addScreenCastFromPath(ss.toString());
		// test.addScreenCapture(ss);
		// test.log(LogStatus.PASS, "testing...",ss);
		// report.endTest(test);
		// report.flush();
		// test.log(LogStatus.FAIL,test.addScreenCapture(Utility.getScreenshot(driver,
		// "abv"))+ "Test Failed");

	}

	@Given("^I am on Contact us page of toolsqa Site$")
	public void i_am_on_Contact_us_page_of_toolsqa_Site() {
		System.out.println("I'm on Contact us page");
		System.out.println("Given2");
	}

	@When("^I enter following information in the page$")
	public void i_enter_following_information_in_the_page(DataTable data1) throws Exception {
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<List<String>> data = data1.raw();

		Utility.highlight(driver, driver.findElement(
				By.xpath("(//input[@class='wpcf7-form-control wpcf7-text wpcf7-validates-as-required'])[1]")));
		driver.findElement(By.xpath("(//input[@class='wpcf7-form-control wpcf7-text wpcf7-validates-as-required'])[1]"))
				.sendKeys(data.get(0).get(1));
		Utility.highlight(driver, driver.findElement(By.xpath(
				"//*[@class='wpcf7-form-control wpcf7-text wpcf7-email wpcf7-validates-as-required wpcf7-validates-as-email']")));
		driver.findElement(By.xpath(
				"//*[@class='wpcf7-form-control wpcf7-text wpcf7-email wpcf7-validates-as-required wpcf7-validates-as-email']"))
				.sendKeys(data.get(1).get(1));
		Utility.highlight(driver, driver.findElement(By.xpath("//*[@class='wpcf7-form-control wpcf7-textarea']")));
		driver.findElement(By.xpath("//*[@class='wpcf7-form-control wpcf7-textarea']")).sendKeys(data.get(2).get(1));
		System.out.println("When2");
	}

	@When("^Click on Send button$")
	public void click_on_Send_button() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("(//input[@type='submit'])[3]")).click();
		System.out.println("When2");
	}

	@Then("^I should get an error message$")
	public void i_should_get_an_error_message() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String value = driver.findElement(By.xpath(
				"(//div[text()='Validation errors occurred. Please confirm the fields and submit it again.'])[2]"))
				.getText();
		System.out.println(value);
		
		System.out.println("Then2");
		//driver.quit();
	}

}
