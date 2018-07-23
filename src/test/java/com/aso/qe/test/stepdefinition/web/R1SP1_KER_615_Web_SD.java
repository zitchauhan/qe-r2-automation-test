package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;
import java.util.List;
import org.openqa.selenium.interactions.Actions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.PLP_PO;
import com.aso.qe.test.pageobject.SearchProductPO;

import cucumber.api.java.en.Then;

public class R1SP1_KER_615_Web_SD extends CommonActionHelper{
	private static final Logger logger = Logger.getLogger(R1SP1_KER_615_Web_SD.class);
	SearchProductPO searchProductPO = PageFactory.initElements(getDriver(), SearchProductPO.class);
	PLP_PO PLP_PO = PageFactory.initElements(getDriver(), PLP_PO.class);

	@Then("^user is able to Best selling as a default sort option$")
	public void user_is_able_to_Best_selling_as_a_default_sort_option() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)) {
			scrollPageToWebElement(PLP_PO.drpdwnSortByScrollMobile);
			clickOnButton(PLP_PO.drpdwnSortByScrollMobile);
			String byDefaultValue = getText(PLP_PO.drpdwnSortByScrollMobile);
			logger.debug("By default value in sort by option is ::"+ byDefaultValue );
			
		}else {
		scrollPageToWebElement(PLP_PO.drpdwnSortBy);
		clickOnButton(PLP_PO.drpdwnSortBy);
		String byDefaultValue = getText(PLP_PO.drpdwnSortBy);
		logger.debug("By default value in sort by option is ::"+ byDefaultValue );
		}
	}

	@Then("^user able to see all sorting options after clicking on sort by filter$")
	public void user_able_to_see_all_sorting_options_after_clicking_on_sort_by_filter(List<String> object) throws Throwable {
		assertTrue(clickOnButton(PLP_PO.drpdwnSortBy));
		Thread.sleep(3000);
		Actions hover = new Actions(getDriver());
		 hover.moveToElement(PLP_PO.drpdwnSortBy).build().perform();
		for(String str: object) {
			Thread.sleep(300);
			String xpath ="//div[@class='Select-menu-outer']//div[text()='"+str+"']"; 
			assertTrue(isDisplayed(getfindElementByXPath(xpath)));
		}

	}

	@Then ("^user is able to Most Relevant as a default sort option$")
	public void user_is_able_to_Most_Relevant_as_a_default_sort_option() throws Throwable{
		if("mobile".equalsIgnoreCase(testtype)) {
			scrollPageToWebElement(PLP_PO.drpdwnSortByScrollMobile);
			clickOnButton(PLP_PO.drpdwnSortByScrollMobile);
			String byDefaultValue = getText(PLP_PO.drpdwnSortByMobile);
			logger.debug("By default value in sort by option is ::"+ byDefaultValue );
			
		}else {
		scrollPageToWebElement(PLP_PO.searchdrpdwnSortBy);
		clickOnButton(PLP_PO.searchdrpdwnSortBy);
		String byDefaultValue = getText(PLP_PO.searchdrpdwnSortBy);
		logger.debug("By default value in sort by option is ::"+ byDefaultValue );
		}
	}
	
}