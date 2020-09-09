package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_MYACCOUNT_K4232_SD extends CommonActionHelper {

	R2_MyAccount_PO myAccountPo = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver,
			R1_GlobalElementHeader_Home_PO.class);
	R2_MyAccount_PO r2MyAccountPo = PageFactory.initElements(driver, R2_MyAccount_PO.class);  //-venkat

	
	String newFirstName = "";

	@Given("^clicks on SignIn button in home page$")
	public void clicks_on_SignIn_button_in_home_page() throws Throwable {
		assertTrue(clickOnButton(myAccountPo.signIn));

	}

	@Then("^user lands on My Account page and click on adress$")
	public void user_lands_on_My_Account_page_and_click_on_adress() throws Throwable {
		if ("mobile".equalsIgnoreCase(testtype)) {
			scrollPageToWebElement(myAccountPo.myAccount_txt_Mobile);
			clickOnButton(myAccountPo.myAccount_txt_Mobile);
			Thread.sleep(Constants.thread_low);
			scrollPageToWebElement(myAccountPo.addressBook_M);
			clickOnButton(myAccountPo.addressBook_M);
		} else {
			// clickOnButton(myAccountPo.lnkMyAccount);
			waitForElement(myAccountPo.myAccount_MyAccountList_AddressBook_lnk);
			assertTrue(clickOnButton(myAccountPo.myAccount_MyAccountList_AddressBook_lnk));
			Thread.sleep(Constants.thread_medium);
		}

	}

	@Then("^user Clicks on Add New Address link$")
	public void user_Clicks_on_Add_New_Address_link() throws Throwable {

		if (isDisplayed(myAccountPo.myAccountPage_AddNewAddressPluIcon_btn)) {
			assertTrue(clickOnButton(myAccountPo.myAccountPage_AddNewAddressPluIcon_btn));
		} else {
			assertTrue(clickOnButton(myAccountPo.addNewAddressBtn));
		}

	}

	@When("^user clicks Remove button$")
	public void user_clicks_Remove_button() throws Throwable {
		// for(WebElement removeAddress: myAccountPo.addresRemove_Btn) {
		//
		// clickOnButton(removeAddress);
		// }

		myAccountPo.deleteAllNonDefaultSavedAddressFromProfile();
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
		Thread.sleep(Constants.thread_low);
	}

	@Given("^clicks on Add New Address button$")
	public void clicks_on_Add_New_Address_button() throws Throwable {

		assertTrue(clickOnButton(myAccountPo.btnAdd));
		Thread.sleep(Constants.thread_low);
	}

	@Given("^user views validation message on all fields$")
	public void user_views_validation_message_on_all_fields() throws Throwable {

		for (WebElement buttonStore : myAccountPo.txtAllAddress) {
			assertTrue(isDisplayed(buttonStore));
			// System.out.println("*****"+buttonStore.getText()+"###############");
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

	@Then("^user verifies that remove button is not available$")
	public void user_verifies_that_remove_button_is_not_available() throws Throwable {
		if (isDisplayed(myAccountPo.btnRemove)) {
			for (WebElement removeAddress : myAccountPo.addresRemove_Btn) {

				clickOnButton(removeAddress);
				Thread.sleep(Constants.thread_low);

			}
		} else {
			assertFalse(isDisplayed(myAccountPo.btnRemove));
		}
	}
	
	@And("^user click on edit default address link$")
	public void user_click_on_edit_default_address_link() throws Throwable {
		assertTrue(clickOnButton(myAccountPo.btnEditDefaultAddress));	   
	}
	
	@And("^user enter new First name in address book$")
	public void user_enter_new_First_name_in_address_book() throws Throwable {
		String firstName = myAccountPo.generateRandomString();
		setInputText(myAccountPo.adr_inpFirstName, firstName);
		newFirstName = firstName;
		
	}

	@And("^user should see the new First name$")
	public void user_should_see_the_new_First_name() throws Throwable {
		Thread.sleep(Constants.thread_medium);
		String firstLastName = myAccountPo.adr_inpFirstNameLastName.getText();
		assertTrue(firstLastName.contains(newFirstName));	   
	}
	
	@Then ("^user edits non default shipping Address and verify  \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void user_edits_non_default_shipping_Address_and_verify(String FName,String LName,String Address,String zip,String PhNumber) throws Throwable {
		r2MyAccountPo.editNonDefaultShippingAddressAndVerify(FName,LName,Address,zip,PhNumber);
	}
	
	@Then ("^user verify SignUp Address in MyAccount$") 
	public void user_verify_SignUp_Address_in_MyAccount() throws Throwable {
		r2MyAccountPo.verifySignUpAddressinMyAccount();
	}
	
	@Then ("^user verify PLCC Credit card details in Payments$")
	public void user_verify_PLCC_Credit_card_details_in_Payments() throws Throwable {
		r2MyAccountPo.verifyPLCCCardDetailOnMyAccount();
	}
}
