package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;

import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_MY_ACCOUNT_KER_4232_Web_SD extends CommonActionHelper {
	
	R2_MyAccount_PO myAccountPo= PageFactory.initElements(driver, R2_MyAccount_PO.class);
	
	
	@Given("^clicks on SignIn button in home page$")
	public void clicks_on_SignIn_button_in_home_page() throws Throwable {
		assertTrue(clickOnButton(myAccountPo.signIn));
		
	}

	@When("^user enters valid \"(.*?)\" and \"(.*?)\" clicks on Login$")
	public void user_enters_valid_and_clicks_on_Login(String email, String password) throws Throwable {
		setInputText(myAccountPo.emailAddress, email);
		setInputText(myAccountPo.password, password);
		assertTrue(clickOnButton(myAccountPo.logIn));
				
		
	}

	@Then("^user lands on My Account page and click on adress$")
	public void user_lands_on_My_Account_page_and_click_on_adress() throws Throwable {
		waitForElement(myAccountPo.addressBook);
		assertTrue(clickOnButton(myAccountPo.addressBook));
		Thread.sleep(10000);
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
	
	@Given("^user enters addressfields firstName \"(.*?)\" lastName \"(.*?)\" PhoneNumber \"(.*?)\" Address \"(.*?)\" ZipCode \"(.*?)\"$")
	public void user_enters_addressfields_firstName_LastName_PhoneNumber_Address_ZipCode(String firstName, String lastName, String PhoneNumber, String Address, String ZipCode) throws Throwable {
		setInputText(myAccountPo.adr_inpFirstName, firstName);
		setInputText(myAccountPo.adr_inpLastName, lastName);
		setInputText(myAccountPo.adr_inpPhoneNumber, PhoneNumber);
		setInputText(myAccountPo.adr_inpAddress1, Address);
		setInputText(myAccountPo.adr_inpzipCode, ZipCode);
		
	}	

	@Given("^user selects state$")
	public void user_selects_state() throws Throwable {
	}

	@Given("^clicks on Add New Address button$")
	public void clicks_on_Add_New_Address_button() throws Throwable {
	}

	@Then("^the new address gets saved$")
	public void the_new_address_gets_saved() throws Throwable {
	}
		

}
