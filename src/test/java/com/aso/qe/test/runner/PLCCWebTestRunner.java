
package com.aso.qe.test.runner;

import org.junit.runner.RunWith;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;


//package com.github.mkolisnyk.cucumber.reporting;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import com.github.mkolisnyk.cucumber.runner.ExtendedTestNGRunner;

import cucumber.api.CucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(ExtendedCucumber.class)

@ExtendedCucumberOptions(
  //    jsonReport = "target/cucumber-reports/cucumber-html-reports/common.json",
   //     usageReport = true,
  //      detailedReport = true,
   //     detailedAggregatedReport = true,
  //      overviewReport = true,
   //     overviewChartsReport = true,
        retryCount = 1)



@CucumberOptions(features="src/test/resources/features/web/", //R1_HP_KER_1915_Web.feature",//R1_PDP_KER_2334_Web.feature",
glue="com.aso.qe.test.stepdefinition.web",
//tags= {"@Rishikesh"},
monochrome=true,
plugin = "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/cucumber-html-reports/Report/report1.html",
format={"pretty",
		"html:target/cucumber-reports/cucumber-html-reports", 
		"json:target/cucumber-reports/cucumber-html-reports/common.json"})



public class PLCCWebTestRunner {
}

