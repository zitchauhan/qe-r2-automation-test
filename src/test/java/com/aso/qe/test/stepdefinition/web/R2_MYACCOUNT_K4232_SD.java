package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;

import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_MYACCOUNT_K4232_SD extends CommonActionHelper {
	
	R2_MyAccount_PO myAccountPo= PageFactory.initElements(driver, R2_MyAccount_PO.class);
	
	
	@Given("^clicks on SignIn button in home page$")
	public void clicks_on_SignIn_button_in_home_page() throws Throwable {
		assertTrue(clickOnButton(myAccountPo.signIn));
		
	}

	@Then("^user lands on My Account page and click on adress$")
	public void user_lands_on_My_Account_page_and_click_on_adress() throws Throwable {
		waitForElement(myAccountPo.addressBook);
		assertTrue(clickOnButton(myAccountPo.addressBook));
	}

	@Then("^user Clicks on Add New Address link$")
	public void user_Clicks_on_Add_New_Address_link() throws Throwable {
		assertTrue(clickOnButton(myAccountPo.addNewAddressBtn));
	}

	@Then("^user views First Name field is displayed$")
	public void user_views_First_Name_field_is_displayed() throws Throwable {
		assertTrue(isDisplayed(myAccountPo.adr_inpFirstName));
	}

	@Then("^user views Last Name field is displayed$")
	public void user_views_Last_Name_field_is_displayed() throws Throwable {
		assertTrue(isDisplayed(myAccountPo.adr_inpLastName));
	}

	@Then("^user views Phone Number field is displayed$")
	public void user_views_Phone_Number_field_is_displayed() throws Throwable {
		assertTrue(isDisplayed(myAccountPo.adr_inpPhoneNumber));
	}

	@Then("^user views Address field is displayed$")
	public void user_views_Address_field_is_displayed() throws Throwable {
		assertTrue(isDisplayed(myAccountPo.adr_inpAddress1));
	}

	@Then("^user views Zip Code field is displayed$")
	public void user_views_Zip_Code_field_is_displayed() throws Throwable {
		assertTrue(isDisplayed(myAccountPo.adr_inpzipCode));
	}

	@Then("^user views City field is displayed$")
	public void user_views_City_field_is_displayed() throws Throwable {
		assertTrue(isDisplayed(myAccountPo.adr_inpCity));
	}

	@Then("^user views State field is displayed$")
	public void user_views_State_field_is_displayed() throws Throwable {
		//assertTrue(isDisplayed(myAccountPo.sta));
	}
	
	@Given("^user makes a note of addresses displayed$")
	public void user_makes_a_note_of_addresses_displayed() throws Throwable {
		
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
	}
	
	@When("^user clicks Remove button$")
	public void user_clicks_Remove_button() throws Throwable {
		
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
	}

	@Then("^user should see delete notification$")
	public void user_should_see_delete_notification() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
	}

	@When("^user clicks on undo link$")
	public void user_clicks_on_undo_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
	}

	@Then("^undo deletion action is performed$")
	public void undo_deletion_action_is_performed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
	}
	
		

}
