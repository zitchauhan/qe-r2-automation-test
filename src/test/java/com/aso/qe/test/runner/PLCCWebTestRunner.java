package com.aso.qe.test.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/features/plcc",
		glue = "com.aso.qe.test.stepdefinition.web.plcc", 
		//tags= {"@AutomationSanityR2"},
		monochrome = true,
		plugin = "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/cucumber-html-reports/Report/report1.html", 
		format = {"pretty", "html:target/cucumber-reports/cucumber-html-reports",
        "json:target/cucumber-reports/cucumber-html-reports/common.json" })
				

public class PLCCWebTestRunner {
}
