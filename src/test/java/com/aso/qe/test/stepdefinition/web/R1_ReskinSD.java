package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_ReskinPO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class R1_ReskinSD extends CommonActionHelper
{
	public R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver,R1_GlobalElementHeader_Home_PO.class);
	private static final Logger logger = Logger.getLogger(R1_ReskinSD.class);
	R1_ReskinPO rspo = PageFactory.initElements(getDriver(), R1_ReskinPO.class);
	
	@Then("^remove the product from cart$")
	public void remove_the_product_from_cart() throws Throwable {
		assertTrue(rspo.removeProductReskin());		
	}
	
	@Then("^remove the product added from cart$")
	public void remove_the_product_added_from_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(rspo.removeProduct());	
	}

	@Then("^user increase the qty by clicking plus button$")
	public void user_increase_the_qty_by_clicking_plus_button() throws Throwable {
		assertTrue(rspo.qtyIncreasePlusSignProductReskin());
	}

	@Then("^user increase the qty by inputing the value$")
	public void user_increase_the_qty_by_inputing_the_value() throws Throwable {
		assertTrue(rspo.qtyIncreaseInputProductReskin());  
	}
	
		
	@Then("^user decrease the qty by clicking minus button$")
	public void user_decrease_the_qty_by_clicking_minus_button() throws Throwable {
		assertTrue(rspo.qtyDecreaseMinusSignProductReskin()); 
	}

	@Then("^user decrease the qty by inputing the value$")
	public void user_decrease_the_qty_by_inputing_the_value() throws Throwable {
		assertTrue(rspo.qtyDecreaseInputProductReskin()); 
	}
	
	@Then("^verify wishlist Link on my account dropdown and click$")
	public void verify_wishlist_Link_on_my_account_dropdown_and_click() {
		clickOnLink(rspo.myAccount);
		if (isDisplayed(rspo.wishListFromMyAccount)) {
			clickOnLink(rspo.wishListFromMyAccount);

		} else {
			logger.error("wishlish not diplayed on MyAccount dropdown");
			assertTrue(false);

		}

	}

	@Then("^click wish list Link$")
	public void click_wish_list_Link() throws Throwable {
		waitForElement(rspo.tabWishList);
		if (rspo.validatingWishListDisplayed()) {
			rspo.clickOnwishListLink();

		} else {
			logger.error("wishlish not diplayed");
			assertTrue(false);

		}

	}

	@Then("^verify wishList header$")
	public void verify_wishList_header() throws Throwable {
		String wishListHeaderText = rspo.getWishlistHeaderText();
		assertEquals(wishListHeaderText.trim(), "WISH LISTS".trim());

	}

	@Then("^click wishList button$")
	public void verify_wishList_button_and_click() throws Throwable {
		rspo.clickOnNewwishListBtn();

	}

	@Then("^create a wishList and verify$")
	public void create_a_wishList_and_verify() throws Throwable {

		assertTrue(rspo.isWishListCreated());
	}

	@Then("^delete the wishList and verify$")
	public void delete_the_wishList_and_verify() throws InterruptedException {
		assertTrue(rspo.isWishListDeleted());

	}

	// Forget password functionality

	@Then("^click on Forgot your password link$")
	public void click_on_Forgot_your_password_link() {
		waitForElement(rspo.forgetPassLink);
		if (isDisplayed(rspo.forgetPassLink)) {
			clickOnLink(rspo.forgetPassLink);
			System.out.println("Actuall :: " + getText(rspo.forgetPassHeader).trim());
			if ("FORGOT PASSWORD".trim().equals(getText(rspo.forgetPassHeader).trim())) {
				assertTrue(true);
			} else {
				assertTrue(false);
			}
		} else {
			logger.debug("Forgot password link not present");
			assertTrue(false);
		}

	}

	@Then("^user to fill valid email \"(.*?)\"$")
	public void user_to_fill_valid_email(String email) {
		setInputText(rspo.forgetPassEmail, email);

	}

	@Then("^click on submit$")
	public void click_on_submit() {
		assertTrue(clickOnButton(rspo.btnForgotPassword));

	}

	@Then("^verify success message \"(.*?)\"$")
	public void verify_success_message(String success) {
		waitForElement(rspo.successMsgForgotPassword);
		assertEquals(getText(rspo.successMsgForgotPassword), success);
	}

	@Then("^user to fill invalid email \"(.*?)\"$")
	public void user_to_fill_invalid_email(String inValidEmail) {
		setInputText(rspo.forgetPassEmail, inValidEmail);

	}

	@Then("^verify error message \"(.*?)\"$")
	public void verify_error_message(String errorMessage) {
		waitForElement(rspo.passwordResetErrorMessage);
		assertEquals(getText(rspo.passwordResetErrorMessage), errorMessage);

	}
	// PERSONAL INFORMATION

	@Given("^click Personal Information Link$")
	public void click_Personal_Information_Link() {
		if (isDisplayed(rspo.personalInformation)) {
			clickOnLink(rspo.personalInformation);
			assertTrue(true);
		} else {
			assertTrue(false);
		}
	}

	@Then("^update the Personal Information form and verify updation message \"(.*?)\"$")
	public void update_the_Personal_Information_form_and_verify_updation_message(String actualMsg) {
		assertTrue(rspo.isPersonalInfoUpdated(actualMsg));

	}
	
}

