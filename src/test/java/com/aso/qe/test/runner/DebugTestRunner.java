package com.aso.qe.test.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features="src/test/resources/features/Debug/",
		glue="com.aso.qe.test.stepdefinition.web",
		monochrome=true, 
		format={"pretty","html:target/cucumber-reports/cucumber-html-reports", "json:target/cucumber-reports/cucumber-html-reports/common.json"}
		) 
public class DebugTestRunner{	
	
}

/*@CucumberOptions(features = "src/test/resources/features/web/",
plugin = {"html:target/automation-report/cucumber-pretty","json:target/cucumber.json"},
strict = true,monochrome = true,
glue = "com.aso.qe.test.stepdefinition.web")*/