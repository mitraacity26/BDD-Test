package com.org.cucumber.TestNG.runner1;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//this is for junit and this can be executed directly from pom.xml but not from textng.xml

@RunWith(Cucumber.class)

@CucumberOptions(features = "Feature_Cucumber", glue = { "com.org.cucumber.steps1",
		"com.org.cucumber.hooks" }, dryRun = false, monochrome = true, plugin = { "pretty",
				"html:target/cucumber-reports",
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/extent_report.html" })
// ,"com.org.cucumber.hooks"

public class RunnerWithTestNGTest {

	

	@AfterClass
	public static void extentreport() {
		Reporter.loadXMLConfig(new File("./Config/ExtentConfig.xml"));
		// Set different properties for extent report (optional)
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Machine", "Windows 7 ," + "32 Bit");
		Reporter.setSystemInfo("Selenium", "3.4.0");
		Reporter.setSystemInfo("Maven", "need to check");
		Reporter.setSystemInfo("Java Version", "1.8");
		

	}

}

// extends AbstractTestNGCucumberTests -->for testng

// We have linked this to testng.xml-->then testng.xml to pom.xml, so finally we
// are executing pom.xml
// This also can be directly executed from pom.xml (with minor change in pom
// file) or testng.xml
// This also can be executed from here by selecting run as testng

// If we use junit RunWith, then we can directly execute this from pom.xml (with
// minor change in pom file)
// If we use junit RunWith, then this also can be executed from here by
// selecting run as Junit