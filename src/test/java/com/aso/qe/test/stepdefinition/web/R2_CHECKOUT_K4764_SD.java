package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_CHECKOUT_K4764_SD extends CommonActionHelper {

	R2_CheckOut_PO r2CheckoutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);

	String alternateFirstName,alternateLastName,alternateMobile,alternateEmail ="";
	
	@When("^user click on edit shipping pickup$")
	public void user_click_on_edit_shipping_pickup() throws Throwable {
		assertTrue(clickOnButton(r2CheckoutPo.EditStorPickUp_Btn));
	}

	@Then("^user select me \\+ alternate pickup person$")
	public void user_select_me_alternate_pickup_person() throws Throwable {
		isDisplayed(r2CheckoutPo.checkout_CheckoutHeader_txt);
		boolean flag=false;
		flag = isDisplayed(r2CheckoutPo.EditStorPickUp_Btn);
		if(flag) {
			assertTrue(clickOnButton(r2CheckoutPo.EditStorPickUp_Btn));
		}
		Thread.sleep(Constants.thread_highest);
		Actions hover=new Actions(getDriver());
		hover.click(r2CheckoutPo.clickOnDropDown).build().perform();
		hover.click(r2CheckoutPo.mePlusAlternatePickUp_Drpdwn).build().perform();
		Thread.sleep(Constants.thread_highest);
	}

	@Then("^user enter the Store Pickup Alternates FirstName \"(.*?)\"$")
	public void user_enter_the_Store_Pickup_Alternates_FirstName(String arg1) throws Throwable {
		setInputText(r2CheckoutPo.PickupAltrFirstname_input, webPropHelper.getTestDataProperty(arg1));
		alternateFirstName =webPropHelper.getTestDataProperty(arg1);
	}

	@Then("^user enter the Store Pickup Alternates LastName \"(.*?)\"$")
	public void user_enter_the_Store_Pickup_Alternates_LastName(String arg1) throws Throwable {
		setInputText(r2CheckoutPo.PickupAltrLatstname_input, webPropHelper.getTestDataProperty(arg1));
		alternateLastName =webPropHelper.getTestDataProperty(arg1);
	}

	@Then("^user enter the Store Pickup Alternates Email \"(.*?)\"$")
	public void user_enter_the_Store_Pickup_Alternates_Email(String arg1) throws Throwable {
		setInputText(r2CheckoutPo.PickupAltrEmail_input, webPropHelper.getTestDataProperty(arg1));
		alternateEmail = webPropHelper.getTestDataProperty(arg1);
	}

	@Then("^user enter the Store Pickup Alternates PhoneNumber \"(.*?)\"$")
	public void user_enter_the_Store_Pickup_Alternates_PhoneNumber(String arg1) throws Throwable {
		setInputText(r2CheckoutPo.PickupAltrPhone_input, webPropHelper.getTestDataProperty(arg1));
		alternateMobile =webPropHelper.getTestDataProperty(arg1);
	}

	@Then("^user click on confirm button$")
	public void user_click_on_confirm_button() throws Throwable {
		assertTrue(clickOnButton(r2CheckoutPo.btnGoToShippingMethod));
		Thread.sleep(Constants.thread_medium);
	}

	@And("^user verify the alternate address details$")
	public void user_verify_the_alternate_address_details() throws InterruptedException {
		boolean flag = false;
		for (WebElement alternatePersonDetail : r2CheckoutPo.alternatePersonDetails) {
			if (alternatePersonDetail.getText().equalsIgnoreCase("ME + " + alternateFirstName + " " + alternateLastName)) {
				System.err.println(alternatePersonDetail.getText().equalsIgnoreCase("ME + " + alternateFirstName + " " + alternateLastName));
				flag = true;
			}
			if (alternatePersonDetail.getText().equalsIgnoreCase(alternateEmail)) {
				System.err.println(alternatePersonDetail.getText().equalsIgnoreCase(alternateEmail));
				flag = true;
			}
			if (alternatePersonDetail.getText().equalsIgnoreCase(alternateMobile)) {
				System.err.println(alternatePersonDetail.getText().equalsIgnoreCase(alternateMobile));
				flag = true;
			}
			if(flag || !flag) {
				System.err.println("*********Scenario is failing for "+ alternatePersonDetail.getText()+"**********");
				assertTrue(flag);
			}
		}
	}

	@And("^user will see the required error Message$")
	public void user_will_see_the_required_error_Message() throws InterruptedException {
		Thread.sleep(Constants.thread_medium);
		assertTrue(isDisplayed(r2CheckoutPo.errorMsgRequired));
	}
	
	@And("^user should not be able to see me plus alternate$")
	public void user_should_not_be_able_to_see_plus_alternate(){
		boolean flag=true;
		flag = isDisplayed(r2CheckoutPo.selectAnotherCard);
		assertFalse(flag);
	}
	
}
