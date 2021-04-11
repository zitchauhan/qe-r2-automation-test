package com.aso.qe.test.runner;

import org.junit.runner.RunWith;


//import cucumber.api.testng.AbstractTestNGCucumberTests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/ios/",
		glue="com.aso.qe.test.stepdefinition.ios",
		tags= {"@TC-OMNI-30524"},
		monochrome=true,
		//dryRun=true,
		plugin = "com.cucumber.listener.ExtentCucumberFormatter:"
		//format={"pretty","html:target/cucumber-reports/cucumber-html-reports", "json:target/cucumber-reports/cucumber-html-reports/common.json"}
		)

public class IOSTestRunner {

}