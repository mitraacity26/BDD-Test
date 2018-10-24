package com.org.cucumber.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	/**
	 * Java Doc
	 */

	// driver object

	@Before
	public void setupt() {
		System.out.println("-----------------Start of Scenario-----------------");
	}

	@After
	public void teardown() {
		System.out.println("-----------------End of Scenario-----------------");
	}
	



}
