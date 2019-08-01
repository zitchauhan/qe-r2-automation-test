package com.aso.qe.test.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

<<<<<<< HEAD
@CucumberOptions(features = "src/test/resources/features/web/R2_CHECKOUT_KER_2856_Web.feature",
		glue = "com.aso.qe.test.stepdefinition.web", 
		monochrome = true,
		//tags = "@Rahul",
=======

@CucumberOptions(features = "src/test/resources/features/web/R2_CART_KER_2927_Web.feature",
		glue = "com.aso.qe.test.stepdefinition.web", 
		monochrome = true,
	    tags = "@Rishikesh",

>>>>>>> 36bd92a94d76926191e23a2cc49653dba24c2d53
		plugin = "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/cucumber-html-reports/Report/report1.html", 
		format = {"pretty", "html:target/cucumber-reports/cucumber-html-reports",
        "json:target/cucumber-reports/cucumber-html-reports/common.json" })


				
public class PLCCWebTestRunner {
}


 