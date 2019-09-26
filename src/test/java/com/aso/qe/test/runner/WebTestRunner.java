package com.aso.qe.test.runner;

import org.junit.runner.RunWith;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)

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

@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(
    //   jsonReport = "target/cucumber-reports/cucumber-html-reports/common.json",
    //    usageReport = true,
   //     detailedReport = true,
   //     detailedAggregatedReport = true,
   //     overviewReport = true,
    //    overviewChartsReport = true,
        retryCount = 1)

@CucumberOptions(
		features="src/test/resources/features/web/", //R1_HP_KER_1915_Web.feature",//R1_PDP_KER_2334_Web.feature",
		glue="com.aso.qe.test.stepdefinition.web",
		//tags= {"@KER-2871"},
		monochrome=true,
				plugin = "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/cucumber-html-reports/Report/report1.html",
		format={"pretty","html:target/cucumber-reports/cucumber-html-reports", "json:target/cucumber-reports/cucumber-html-reports/common.json"}
		) 
public class WebTestRunner{	
	
}

/*@CucumberOptions(features = "src/test/resources/features/web/",
plugin = {"html:target/automation-report/cucumber-pretty","json:target/cucumber.json"},
strict = true,monochrome = true,
glue = "com.aso.qe.test.stepdefinition.web")*/