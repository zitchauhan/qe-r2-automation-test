package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_MYACCOUNT_K4232_SD extends CommonActionHelper {
	
	R2_MyAccount_PO myAccountPo= PageFactory.initElements(driver, R2_MyAccount_PO.class);
	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	
	@Given("^clicks on SignIn button in home page$")
	public void clicks_on_SignIn_button_in_home_page() throws Throwable {
		assertTrue(clickOnButton(myAccountPo.signIn));
		
	}

	@Then("^user lands on My Account page and click on adress$")
	public void user_lands_on_My_Account_page_and_click_on_adress() throws Throwable 
	{
		if("mobile".equalsIgnoreCase(testtype)){	
			scrollPageToWebElement(myAccountPo.myAccount_txt_Mobile);
			clickOnButton(myAccountPo.myAccount_txt_Mobile);
			Thread.sleep(2000);
			scrollPageToWebElement(myAccountPo.addressBook_M);
			clickOnButton(myAccountPo.addressBook_M);
		}else {
			waitForElement(myAccountPo.addressBook);
			assertTrue(clickOnButton(myAccountPo.addressBook));
		}
		
	}

	@Then("^user Clicks on Add New Address link$")
	public void user_Clicks_on_Add_New_Address_link() throws Throwable {
		assertTrue(clickOnButton(myAccountPo.addNewAddressBtn));
	}

//	@Then("^user views First Name field is displayed$")
//	public void user_views_First_Name_field_is_displayed() throws Throwable {
//		assertTrue(isDisplayed(myAccountPo.adr_inpFirstName));
//	}
//
//	@Then("^user views Last Name field is displayed$")
//	public void user_views_Last_Name_field_is_displayed() throws Throwable {
//		assertTrue(isDisplayed(myAccountPo.adr_inpLastName));
//	}
//
//	@Then("^user views Phone Number field is displayed$")
//	public void user_views_Phone_Number_field_is_displayed() throws Throwable {
//		assertTrue(isDisplayed(myAccountPo.adr_inpPhoneNumber));
//	}
//
//	@Then("^user views Address field is displayed$")
//	public void user_views_Address_field_is_displayed() throws Throwable {
//		assertTrue(isDisplayed(myAccountPo.adr_inpAddress1));
//	}
//
//	@Then("^user views Zip Code field is displayed$")
//	public void user_views_Zip_Code_field_is_displayed() throws Throwable {
//		assertTrue(isDisplayed(myAccountPo.adr_inpzipCode));
//	}
//
//	@Then("^user views City field is displayed$")
//	public void user_views_City_field_is_displayed() throws Throwable {
//		assertTrue(isDisplayed(myAccountPo.adr_inpCity));
//	}
//
//	@Then("^user views State field is displayed$")
//	public void user_views_State_field_is_displayed() throws Throwable {
//		//assertTrue(isDisplayed(myAccountPo.sta));
//	}
	
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
	
	@Then("^user enter First name \"(.*?)\" in address book$")
	public void user_enter_First_name_in_address_book(String arg1) throws Throwable {
		setInputText(myAccountPo.adr_inpFirstName, webPropHelper.getTestDataProperty(arg1));
	}

	@Then("^user enter Last name \"(.*?)\" in address book$")
	public void user_enter_Last_name_in_address_book(String arg1) throws Throwable {
		setInputText(myAccountPo.adr_inpLastName, webPropHelper.getTestDataProperty(arg1));
	}

	@Then("^user enter Phone number \"(.*?)\" in address book$")
	public void user_enter_Phone_number_in_address_book(String arg1) throws Throwable {
		setInputText(myAccountPo.adr_inpPhoneNumber, webPropHelper.getTestDataProperty(arg1));
	}

	@Then("^user enter Address \"(.*?)\" in address book$")
	public void user_enter_Address_in_address_book(String arg1) throws Throwable {
		setInputText(myAccountPo.adr_inpAddress1, webPropHelper.getTestDataProperty(arg1));
	}

	@Then("^user enter Zipcode \"(.*?)\" in address book$")
	public void user_enter_Zipcode_in_address_book(String arg1) throws Throwable {
		setInputText(myAccountPo.adr_inpzipCode, webPropHelper.getTestDataProperty(arg1));
	}

	@Given("^clicks on Add New Address button$")
	public void clicks_on_Add_New_Address_button() throws Throwable {
		
		assertTrue(clickOnButton(myAccountPo.btnAdd));
	}

	@Given("^user views validation message on all fields$")
	public void user_views_validation_message_on_all_fields() throws Throwable {
		
		for ( WebElement buttonStore : myAccountPo.txtAllAddress) {
			assertTrue(isDisplayed(buttonStore));
	    	//System.out.println("*****"+buttonStore.getText()+"###############");
	    }
	}
	
	@Then("^user click on set as default button$")
	public void user_click_on_set_as_default_button() throws Throwable {
		assertTrue(clickOnButton(myAccountPo.btnSetAsDefault));    
	}
	@Then("^user verifies the First address provided is set as default$")
	public void user_verifies_the_First_address_provided_is_set_as_default() throws Throwable {
		
		assertTrue(isDisplayed(myAccountPo.txtDefaultDescription));
	}
	
	@Given("^user click on edit button in address book$")
	public void user_click_on_edit_button_in_address_book() throws Throwable {
		assertTrue(clickOnButton(myAccountPo.btnEdit));
	    }

	@Given("^user clicks on update button$")
	public void user_clicks_on_update_button(String arg1) throws Throwable {
		assertTrue(clickOnButton(myAccountPo.btnUpdate));   
	}

		
	@Given("^user verifies the \"(.*?)\" in address$")
	public void user_verifies_the_in_address(String arg1) throws Throwable {
		
		assertTrue(isDisplayed(myAccountPo.txtAddressDescription));
		
	}

		

}
