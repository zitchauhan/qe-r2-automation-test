package com.aso.qe.test.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/features/plccMobile",
		glue = "com.aso.qe.test.stepdefinition.web.plcc",
		monochrome = true,
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/cucumber-html-reports/Report/report1.html",
				"pretty", "html:target/cucumber-reports/cucumber-html-reports",
				"json:target/cucumber-reports/cucumber-html-reports/common.json" })

public class PLCCMobileTestRunner {

}
