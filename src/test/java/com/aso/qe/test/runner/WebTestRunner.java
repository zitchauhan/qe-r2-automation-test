package com.aso.qe.test.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

/*@CucumberOptions(
		features="src/test/resources/features/web/",
		glue="com.aso.qe.test.stepdefinition.web",
		monochrome=true, 
//				
//		plugin = {"pretty",
//			   	"html:target/cucumber-report/runapiat",
//		        "json:target/cucumber-report/runapiat/web.json",
//                "rerun:target/cucumber-report/runapiat/rerun.txt"}
				format =	{"pretty","html:target/Destination", "json:target/cucumber.json"}
		)*/

@CucumberOptions(
		features="src/test/resources/features/web",
		glue="com.aso.qe.test.stepdefinition.web",
				//tags ="@AutomationSanityR2",
		monochrome=true, 
		format={"pretty","html:target/cucumber-reports/cucumber-html-reports", "json:target/cucumber-reports/cucumber-html-reports/common.json"}
		) 
public class WebTestRunner{	
	
}

/*@CucumberOptions(features = "src/test/resources/features/web/",
plugin = {"html:target/automation-report/cucumber-pretty","json:target/cucumber.json"},
strict = true,monochrome = true,
glue = "com.aso.qe.test.stepdefinition.web")*/