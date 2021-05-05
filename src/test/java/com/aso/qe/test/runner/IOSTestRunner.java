
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
		tags= {"@Sprint1,@Sprint2,@Sprint3,@Sprint4,@Sprint5,@Regression"},
		monochrome=true,
		//dryRun=true,
		plugin = "com.cucumber.listener.ExtentCucumberFormatter:"
)
public class IOSTestRunner {

}