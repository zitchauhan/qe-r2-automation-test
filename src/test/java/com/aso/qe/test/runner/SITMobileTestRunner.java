package com.aso.qe.test.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)


		@CucumberOptions(
		features="src/test/resources/features/sit_mobile/",
		glue="com.aso.qe.test.stepdefinition.web",
		monochrome=true, 
		plugin={"pretty","html:target/cucumber-reports/cucumber-html-reports", "json:target/cucumber-reports/cucumber-html-reports/common.json"}
		) 
public class SITMobileTestRunner {
	

}
