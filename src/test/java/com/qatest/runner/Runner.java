package com.qatest.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/resources/Test_01",
		glue = "com.qatest.glue",
		format = {"json:target/cucumber.json","html:target/LogIn"}
		)

public class Runner extends AbstractTestNGCucumberTests {

	
}
