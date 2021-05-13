
package com.aso.qe.test.runner;

import org.junit.runner.RunWith;



import org.junit.runner.RunWith;


//import cucumber.api.testng.AbstractTestNGCucumberTests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/ios/",
		glue="com.aso.qe.test.stepdefinition.ios",
		tags= {"@Regression_1"},
		monochrome=true,
		//dryRun=true,
		plugin = "com.cucumber.listener.ExtentCucumberFormatter:"
)
public class IOSTestRunner {

}