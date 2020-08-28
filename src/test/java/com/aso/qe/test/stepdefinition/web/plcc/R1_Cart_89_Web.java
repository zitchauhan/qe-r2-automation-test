package com.aso.qe.test.stepdefinition.web.plcc;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_PLCC_Generic_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R1_Cart_89_Web extends CommonActionHelper{
	R1_PLCC_Generic_PO genericPO = PageFactory.initElements(driver, R1_PLCC_Generic_PO.class);
	WebDriverWait wait = new WebDriverWait(driver, 20);
	R2_CheckOut_PO r2CheckoutPo=PageFactory.initElements(driver, R2_CheckOut_PO.class);
	@Then("^user navigates to Cart Page$")
	public void user_navigates_to_Cart_Page() throws Throwable {
		genericPO.verifyPresenceOfCartPage();
		//Thread.sleep(5000);
	}

	@Then("^user expect element We Accept Label to be present$")
	public void user_expect_element_We_Accept_Label_to_be_present() throws Throwable {
		genericPO.verifyPresenceOfWeAcceptLabel();
	}
	@Then("^user expect element plcc card image to be present in footer$")
	public void user_expect_element_plcc_card_image_to_be_present_in_footer() throws Throwable {
		genericPO.verifyPresenceOfPlccCardImageFooter();
	}
	/*Modified by Rahul on 22.07.19*/
	@When("^user click on viewcart button$")
	public void user_click_on_viewcart_button() throws Throwable {
		genericPO.verifyPresenceOfViewCartButton();
		clickOnButton(genericPO.viewCartButton);
		
		/**Modified from here***/
		Thread.sleep(6000);
		/*Temp commented out by HP 07/26/19*/
		/*WebElement el=driver.findElementByXPath("//h1[contains(@class,\"css-gi6fx0 mt-1 mb-0\")]");
		System.out.println(el.getText());
		assertTrue(isDisplayed(el));*/
		}
	
	@And("user validate the WG bulk message is visible on cart page$")
	public void user_validate_the_WG_bulk_message_is_visible_on_cart_page() throws Throwable {
		Thread.sleep(Constants.thread_low);
		String actualBulkMessage = (r2CheckoutPo.WGBulkMessage).getText();		
		String expectedBulkMessage = webPropHelper.getTestDataProperty("WGBulkMsgCart");
		assertEquals(expectedBulkMessage, actualBulkMessage);
		System.out.println("Correct bulk message is displayed");
	}
}
