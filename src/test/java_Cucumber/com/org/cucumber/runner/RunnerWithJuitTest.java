package com.org.cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature_Cucumber",glue={"com.org.cucumber.steps"})
public class RunnerWithJuitTest {
	
	

}
