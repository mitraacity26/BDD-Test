package com.org.cucumber.TestNG.runner;


import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class) -->this is for junit and this can be executed directly from pom.xml but not from textng.xml

@CucumberOptions(features = "Feature_Cucumber",glue={"com.org.cucumber.steps","com.org.cucumber.hooks"},dryRun = false,monochrome = false,plugin = {"pretty", "html:target/cucumber-reports"})
public class RunnerWithTestNGTest extends AbstractTestNGCucumberTests {
	
	

}

//We have linked this to testng.xml-->then testng.xml to pom.xml, so finally we are executing pom.xml
//This also can be directly executed from pom.xml (with minor change in pom file) or testng.xml
//This also can be executed from here by selecting run as testng

//If we use junit RunWith, then we can directly execute this from pom.xml (with minor change in pom file)
//If we use junit RunWith, then this  also can be executed from here by selecting run as Junit