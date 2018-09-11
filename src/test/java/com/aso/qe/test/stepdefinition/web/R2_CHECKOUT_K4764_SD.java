package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_CHECKOUT_K4764_SD extends CommonActionHelper {

	R2_CheckOut_PO r2CheckoutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);

	@When("^user click on edit shipping pickup$")
	public void user_click_on_edit_shipping_pickup() throws Throwable {
		assertTrue(clickOnButton(r2CheckoutPo.EditStorPickUp_Btn));
	}

	@Then("^user select me \\+ alternate pickup person$")
	public void user_select_me_alternate_pickup_person() throws Throwable {
		Thread.sleep(2000);
		Actions hover = new Actions(getDriver());
		hover.clickAndHold(r2CheckoutPo.MePickUp_Drpdwn).build().perform();
		hover.sendKeys(r2CheckoutPo.MePickUp_Drpdwn, Keys.DOWN, Keys.ENTER).build().perform();
		Thread.sleep(5000);
	}

	@Then("^user enter the Store Pickup Alternates FirstName \"(.*?)\"$")
	public void user_enter_the_Store_Pickup_Alternates_FirstName(String arg1) throws Throwable {
		setInputText(r2CheckoutPo.PickupAltrFirstname_input, webPropHelper.getTestDataProperty(arg1));
	}

	@Then("^user enter the Store Pickup Alternates LastName \"(.*?)\"$")
	public void user_enter_the_Store_Pickup_Alternates_LastName(String arg1) throws Throwable {
		setInputText(r2CheckoutPo.PickupAltrLatstname_input, webPropHelper.getTestDataProperty(arg1));
	}

	@Then("^user enter the Store Pickup Alternates Email \"(.*?)\"$")
	public void user_enter_the_Store_Pickup_Alternates_Email(String arg1) throws Throwable {
		setInputText(r2CheckoutPo.PickupAltrEmail_input, webPropHelper.getTestDataProperty(arg1));
	}

	@Then("^user enter the Store Pickup Alternates PhoneNumber \"(.*?)\"$")
	public void user_enter_the_Store_Pickup_Alternates_PhoneNumber(String arg1) throws Throwable {
		setInputText(r2CheckoutPo.PickupAltrPhone_input, webPropHelper.getTestDataProperty(arg1));
	}

	@Then("^user click on confirm button$")
	public void user_click_on_confirm_button() throws Throwable {
		assertTrue(clickOnButton(r2CheckoutPo.ShippingConfirm_btn));
		Thread.sleep(3000);
	}

	@Then("^Alternate pick person option should not be available$")
	public void alternate_pick_person_option_should_not_be_available() throws Throwable {

	}

}
