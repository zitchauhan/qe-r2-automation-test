package com.aso.qe.test.runner;

import org.junit.runner.RunWith;

//import cucumber.api.testng.AbstractTestNGCucumberTests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/ios/",
		glue="com.aso.qe.test.stepdefinition.iso",
		monochrome=true, 
				
//		plugin = {"pretty",
//			   	"html:target/cucumber-report/runapiat",
//		        "json:target/cucumber-report/runapiat/ios.json",
//                "rerun:target/cucumber-report/runapiat/rerun.txt"}
		
				plugin =	{"pretty","html:target/Destination", "json:target/cucumber.json"}
		)

public class IOSTestRunner {

}
