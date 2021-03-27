package com.aso.qe.test.runner;

import org.junit.runner.RunWith;


//import cucumber.api.testng.AbstractTestNGCucumberTests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/ios/",
		glue="com.aso.qe.test.stepdefinition.ios",
<<<<<<< HEAD
		tags= {"@ST-22047"},
		monochrome=true, 
=======
		tags= {"@TC-OMNI-20627"},
		monochrome=true,
		//dryRun=true,
>>>>>>> origin/Feature_Mamta_MobileApp
				
//		plugin = {"pretty",
//			   	"html:target/cucumber-report/runapiat",
//		        "json:target/cucumber-report/runapiat/ios.json",
//                "rerun:target/cucumber-report/runapiat/rerun.txt"}
		
				format =	{"pretty","html:target/Destination", "json:target/cucumber.json"}
		)

public class IOSTestRunner {
	
}