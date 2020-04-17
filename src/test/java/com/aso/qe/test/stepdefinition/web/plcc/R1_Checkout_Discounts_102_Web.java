package com.aso.qe.test.stepdefinition.web.plcc;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xbill.DNS.ISDNRecord;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PLCC_Generic_PO;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.openqa.selenium.JavascriptExecutor;

public class R1_Checkout_Discounts_102_Web extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_PLCC_Generic_PO genericPO = PageFactory.initElements(driver, R1_PLCC_Generic_PO.class);
		
	@When("^user click on ship it button$")
	public void user_click_on_ship_it_button() throws Throwable {
		waitForPageLoad(driver);
		Thread.sleep(Constants.thread_highest);
		//assertTrue(isDisplayed(genericPO.shipItButton));
		////assertTrue(clickOnButton(genericPO.shipItButton));
		//clickOnButton(genericPO.shipItButton);
		
		//changes done in order resolve failure of uat6 automation running on gcp -- Sachin
		System.out.println("size of the CTA " + driver.findElements(By.xpath("//*[@class='large']//*[text()='Home delivery'] | (//*[text()='Home delivery'])[3] | (//*[contains(text(),'Ship to Store')])[1]")).size());
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", genericPO.shipItButton);
		Thread.sleep(Constants.thread_high);	
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", genericPO.shipItButton);
		Thread.sleep(Constants.thread_high);
		

	}

}