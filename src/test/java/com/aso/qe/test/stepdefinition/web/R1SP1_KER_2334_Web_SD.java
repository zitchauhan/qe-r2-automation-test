package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.PDP_PO;
import com.aso.qe.test.pageobject.SIT_PO;

import cucumber.api.java.en.Then;

public class R1SP1_KER_2334_Web_SD extends CommonActionHelper{
	
   PDP_PO pd_po=PageFactory.initElements(driver, PDP_PO.class);
   SIT_PO sit_po=PageFactory.initElements(driver, SIT_PO.class);
 GlobalElementHeader_HomePO globalElementHeader=PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
	
	@Then("^User navigate to PLPGrid page Toddler clothing$")
	public void user_navigate_to_PLPGrid_page_Toddler_clothing() throws Throwable {
		assertTrue(clickOnButton(globalElementHeader.btnShopCategory));
		moveHover(globalElementHeader.btnShopCategory);
		assertTrue(clickOnButton(pd_po.btnToddlerClothing));
			
	}

	@Then("^User click on item with No stock$")
	public void user_click_on_item_with_No_stock() throws Throwable {
	   assertTrue(clickOnButton(pd_po.itemWithnoStock));
	}
	
	@Then("^User select out of stock PDP$")
	public void User_select_out_of_stock_PDP   () {
		assertTrue(clickOnButton(sit_po.clickProuctCard));
	}
	@Then("^User verify and click on get notified$")
	public void user_verify_and_click_on_get_notified() throws Throwable {
	   
		assertTrue(isDisplayed(pd_po.lnkGetNotified));
	 
	}
	@Then("^Verify customer is able to enter email after clicking on get notified$")
	public void verify_customer_is_able_to_enter_email_after_clicking_on_get_notified() throws Throwable {
	  assertTrue(clickOnButton(pd_po.lnkGetNotified));
	  setInputText(pd_po.emailOFgetNotified, "xyz@gmail.com");
	  assertTrue(clickOnButton(pd_po.btnSubmitGetNotification));
	  assertEquals(getText(pd_po.txtYouAreAllSet), "YOU'RE ALL SET");
	}

	
	@Then("^User verify get notified for other out of stock item in same PDP$")
	public void user_verify_get_notified_for_other_out_of_stock_item_in_same_PDP() throws Throwable {
	   assertTrue(clickOnButton(pd_po.clickOtherSize));
	}
	
}
