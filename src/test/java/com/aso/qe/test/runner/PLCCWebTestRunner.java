
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
		features="src/test/resources/features/web/plcc/", //R1_HP_KER_1915_Web.feature",//R1_PDP_KER_2334_Web.feature",
		glue="com.aso.qe.test.stepdefinition.web.plcc",
		//tags= {"@Regression", "~@ignoreUAT7 "},
		monochrome=true, 
				plugin = "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/cucumber-html-reports/Report/report1.html",
		format={"pretty","html:target/cucumber-reports/cucumber-html-reports", "json:target/cucumber-reports/cucumber-html-reports/common.json"}
		) 
public class PLCCWebTestRunner{	
	
}

