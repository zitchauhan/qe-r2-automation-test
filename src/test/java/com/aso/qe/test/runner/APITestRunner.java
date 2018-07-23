package com.aso.qe.test.runner;

//import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
/*@CucumberOptions(features = "src/test/resources/features/api/", strict = true,monochrome = true, 
plugin = {"html:target/automation-report/cucumber-pretty","json:target/cucumber.json",
        "rerun:target/cucumber-report/runapiat/rerun.txt"},
        glue = "com.aso.qe.test.stepdefinition.api")*/
/*@CucumberOptions(features = "src/test/resources/features/api/", monochrome = true, plugin = {
        "pretty", "html:target/cucumber-report/runapiat",
        "json:target/cucumber-report/runapiat/api.json",
        "rerun:target/cucumber-report/runapiat/rerun.txt"},
        glue = "com.aso.qe.test.stepdefinition.api")*/

/*@CucumberOptions(
		features="src/test/resources/features/api/",
		glue="com.aso.qe.test.stepdefinition.api",
		monochrome=true, 
				
		plugin = {"pretty",
			   	"html:target/cucumber-report/runapiat",
		        "json:target/cucumber-report/runapiat/api.json",
                "rerun:target/cucumber-report/runapiat/rerun.txt"}
		)*/

@CucumberOptions(
		features="src/test/resources/features/api/",
		glue="com.aso.qe.test.stepdefinition.api",
		monochrome=true, 
		format={"pretty","html:target/cucumber-reports/cucumber-html-reports", "json:target/cucumber-reports/cucumber-html-reports/common.json"}
		) 

/*@CucumberOptions(features = "src/test/resources/features/api/",
plugin = {"html:target/automation-report/cucumber-pretty","json:target/cucumber.json"},
strict = true,monochrome = true,
glue = "com.aso.qe.test.stepdefinition.api")*/
public class APITestRunner {

}

/**/