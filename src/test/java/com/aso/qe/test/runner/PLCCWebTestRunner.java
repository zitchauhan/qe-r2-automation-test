package com.aso.qe.test.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/features/plcc",

		glue = "com.aso.qe.test.stepdefinition.web.plcc",
		monochrome = true,
		//tags= {"@PLCC-112"},
		//tags= {"@PLCC-80,@PLCC-81,@PLCC-82,@PLCC-83,@PLCC-84,@PLCC-87"},
		//tags={"@PLCC-58,@PLCC-80,@PLCC-81,@PLCC-82,@PLCC-83,@PLCC-84,@PLCC-86,@PLCC-87,@PLCC-101,@PLCC-102,@PLCC-103,@PLCC-99"},
		plugin = "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/cucumber-html-reports/Report/report1.html", format = {
				"pretty", "html:target/cucumber-reports/cucumber-html-reports",
				"json:target/cucumber-reports/cucumber-html-reports/common.json" })
public class PLCCWebTestRunner {
}
