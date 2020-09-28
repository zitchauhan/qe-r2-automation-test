package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R1_PLP_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class RegressionP2Scenarios_SD extends CommonActionHelper {

	private static final Logger logger = Logger.getLogger(RegressionP2Scenarios_SD.class);
	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver,
			R1_GlobalElementHeader_Home_PO.class);
	R1_PLP_PO r1plppo = PageFactory.initElements(driver, R1_PLP_PO.class);
	R2_Sanity_PO r2sanitypo = PageFactory.initElements(driver, R2_Sanity_PO.class);
	// public R1_SearchProduct_PO searchProductPO = PageFactory.initElements(driver,
	// R1_SearchProduct_PO.class);

	@And("user click on Hot Deals menu and navigate to Hot Deals page")
	public void user_click_on_Hot_Deals_menu_and_navigate_to_Hot_Deals_page() throws Throwable {
		assertTrue(clickOnButton(globalElementHeader.btnHotDeals));
		
		String currentURL = getCurrentPageURL();
		if (currentURL.contains("hot-deals")) {
			logger.debug("User is successfully navigated to Hot Deals page with URL :: " + currentURL);
		} else {
			logger.debug("User is not able to navigate to Hot Deals page instead navigated to URL :: " + currentURL);
		}
	}

	@And("^user click on Deals menu$")
	public void user_click_on_Deals_menu() throws Throwable {
		assertTrue(clickOnButton(globalElementHeader.btnDEALS));

	}

//	@And("^user click on Hot Deals menu$")
//	public void user_click_on_Hot_Deals_menu() throws Throwable {
//		assertTrue(clickOnButton(globalElementHeader.btnHotDeals));
//	
//	}
	
	@And("^user clicks on Shop menu$")
	public void user_clicks_on_Shop_menu() throws Throwable{
		assertTrue(clickOnButton(r2sanitypo.AS_btnShopCategory));
		
	}

	@And("^Shop By Category section is displayed$")
	public void Shopy_By_Category_section_is_displayed() throws Throwable {
		assertTrue(isDisplayed(globalElementHeader.shopByCategory));

	}
	
	@Then("^user clicks on See All > button$")
	public void user_clicks_on_See_All_button() throws Throwable {
		assertTrue(clickOnButton(globalElementHeader.linkSeeAll));
		Thread.sleep(3000);
		
	}

	@And("^user should be able to see the listed products$")
	public void user_should_be_able_to_see_the_listed_products() throws Throwable {
		assertTrue(isDisplayed(r1plppo.productList));
	
	}
	
   @And("^user hover on the \\\"([^\\\"]*)\\\" category$")
    public void user_hover_on_the_specific_category(String category) throws Throwable{
        String categoryX = "//a[@data-auid='level2Category-"+category+"']";
        System.out.println(categoryX);      
        WebElement option = driver.findElement(By.xpath(categoryX));
        moveHover(option);
        System.out.println("*****************************************");
        System.out.println("============== Xpath is: "+categoryX+"===============");
        System.out.println("============== Webelement is: "+option.getText()+"===============");
    }

	@And("^user should be navigated to \\\"([^\\\"]*)\\\" PLP$")
	public void user_should_be_navigated_to_specific_PLP(String plpPage) throws Throwable{
		Thread.sleep(Constants.thread_high);
		r1plppo.validateTheSectionTitle(plpPage);
		r1plppo.validateBreadCrumbs(plpPage);
	}

}