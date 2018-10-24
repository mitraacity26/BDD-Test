package com.org.cucumber.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps1 {

	@Given("^I am on the toolsqa Site$")
	public void i_am_on_the_toolsqa_Site() throws Throwable {

	}

	@When("^I click on Contact us option under About$")
	public void i_click_on_Contact_us_option_under_About() throws Throwable {

	}

	@Then("^I should be navigated to Contact us page$")
	public void i_should_be_navigated_to_Contact_us_page() throws Throwable {

	}

	@Given("^I am on Contact us page of toolsqa Site$")
	public void i_am_on_Contact_us_page_of_toolsqa_Site() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^I enter following information in the page$")
	public void i_enter_following_information_in_the_page(DataTable arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)

	}

	@When("^Click on Send button$")
	public void click_on_Send_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^I should get an error message$")
	public void i_should_get_an_error_message() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

}
