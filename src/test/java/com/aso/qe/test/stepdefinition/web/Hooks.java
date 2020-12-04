package com.aso.qe.test.stepdefinition.web;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.framework.common.PropertiesHelper;
import com.aso.qe.framework.web.helpers.BrowserProxyHelper;
import com.aso.qe.framework.web.helpers.WebDriverHelper;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	private static final Logger logger = Logger.getLogger(Hooks.class);
	public static Scenario scenario;
	public String testType;
	public String screenshortName;
	public PropertiesHelper loadProps;

	public Hooks() {
	}

	@Before(order = 0) // , value="@StartBrowserMobProxy")
	public void StartBrowserProxy(Scenario scenario) {
		logger.debug("StartBrowserProxy is Comentted");
		/*
		 * Constants.enableBrowserProxy = System.getProperty("EnableBrowserProxy");
		 * logger.debug("enableBrowserProxy Val::"+Constants.enableBrowserProxy);
		 * 
		 * if(Constants.enableBrowserProxy != null &&
		 * "yes".equalsIgnoreCase(Constants.enableBrowserProxy)){ logger.
		 * debug("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& Starting Browser MobProxy"
		 * ); BrowserProxyHelper.getInstance().initiateBrowserMobProxy();
		 * Constants.isBrowserProxyEnabled = true; //Constants.isEnabled = false; }
		 */
	}

	@Before
	public void BeforeSteps(Scenario scenario) {
		this.scenario = scenario;
		loadProps = PropertiesHelper.getInstance();
		Constants.screenShortTagNames = "";

		logger.debug("exection Start Scenario Name: " + scenario.getName());
		testType = getTestType();
		screenshortName = testType + "_" + getTagName("KER-") + "_" + getTagName("ZYP-");
		screenshortName = screenshortName.replaceAll("[^A-Za-z0-9-_]", "");
		Constants.screenShortTagNames = screenshortName;
		logger.debug("screenshortName Name::" + screenshortName);
	}

	@After
	public void AfterSteps() {
		logger.debug("exection End Scenario Name: " + scenario.getName() + "  :: Status:" + scenario.getStatus());
		embedScreenshot(scenario);
		logger.debug("Closing Webdriver or sessions.........");
		WebDriverHelper.quitDriver();
		logger.debug("Scenarion Execution End.");

	}

	@After(order = 0) // , value="@ZZZZZxy")
	public void stopProxyServer() {
		logger.debug("EndBrowserProxy is Comentted");
		/*
		 * logger.
		 * debug("--------------------  after9999Class inside process ----------------------"
		 * +Constants.enableBrowserProxy); if(Constants.enableBrowserProxy != null &&
		 * "yes".equalsIgnoreCase(Constants.enableBrowserProxy)){
		 * BrowserProxyHelper.getInstance().generateHarFile("BrowserProxy_"+
		 * screenshortName+new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss").format(new
		 * Date())+".har"); }
		 */
	}

	private String getTagName(String name) {
		String tName = "";
		for (String tag : scenario.getSourceTagNames()) {
			if (tag != null && tag.contains(name)) {
				tName = tag;
				break;
			}
		}
		return tName;
	}

	private String getTestType() {
		String testType = "";
		for (String tag : scenario.getSourceTagNames()) {
			if (tag != null) {
				tag = tag.toLowerCase();
				if (tag.contains("api") || tag.contains("web") || tag.contains("mobile")) {
					testType = tag.replaceAll("[^A-Za-z0-9-_]", "");
					break;
				}

			}
		}
		return testType;
	}

	private boolean embedScreenshot(Scenario scenario) {
		boolean flag = false;
		logger.debug(scenario.getStatus() + " :Scenario isFailed::" + scenario.isFailed());
		logger.debug("Test Type::" + testType);
		if (/*scenario.isFailed() && */!testType.contains("api")) {
			flag = new CommonActionHelper().embedScreenshot(scenario);
		}
		return flag;
	}

	public boolean embedScreenshotForPassScenario() {

		return new CommonActionHelper().embedScreenshot(scenario);
	}
}
