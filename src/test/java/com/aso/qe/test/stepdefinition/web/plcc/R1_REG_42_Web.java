package com.aso.qe.test.stepdefinition.web.plcc;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PLCC_Registration_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R1_REG_42_Web extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver,
			R1_GlobalElementHeader_Home_PO.class);
	R1_PLCC_Registration_PO plccPageObjects = PageFactory.initElements(driver, R1_PLCC_Registration_PO.class);

	@Then("^user click on entered address$")
	public void user_click_on_entered_address() throws Throwable {
		plccPageObjects.clickOnUserEnteredAddressBtn();
	}

	@Then("^user click on suggested address$")
	public void user_click_on_suggested_address() throws Throwable {
		try {
			plccPageObjects.clickOnUserSuggestedAddressBtn();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("^user enters Phone Number \"(.*?)\"$")
	public void user_enters_Phone_Number(String arg1) throws Throwable {
		plccPageObjects.enterPhoneNumberTxtField(arg1);
		assertTrue(isDisplayed(plccPageObjects.addressPhoneField));
		waitForElement(plccPageObjects.addressPhoneField);
	}

	@Then("^user click on SIGN UP$")
	public void user_click_on_SIGN_UP() throws Throwable {
		plccPageObjects.clickOnSignUpBtnRegistrationPage();

	}

	@When("^user click on User Select Address$")
	public void user_click_on_User_Select_Address() throws Throwable {
		try {
			plccPageObjects.clickOnUserSelectedAddressBtn();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("^user navigates to registration confirmation page$")
	public void user_navigates_to_registration_confirmation_page() throws Throwable {
		plccPageObjects.verifyPresenceOfRegistrationConfirmation();
	}
	@When("^user expect element entered address to be present$")
	public void user_expect_element_entered_address_to_be_present() throws Throwable {
		try {
			plccPageObjects.verifyPresenceOfUserEnteredAddressBtn();
		} catch (Exception e) {
			e.getMessage();
			
		}
	}

	@Then("^user expect element suggested address to be present$")
	public void user_expect_element_suggested_address_to_be_present() throws Throwable {
		try {
			plccPageObjects.verifyPresenceOfUserSuggestedAddressBtn();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@When("^user expect element LET'S SHOP button to be present$")
	public void user_expect_element_LET_S_SHOP_button_to_be_present() throws Throwable {
		plccPageObjects.verifyPresenceOfLetsShopButton();
	}

	@When("^click on LET'S SHOP button$")
	public void click_on_LET_S_SHOP_button() throws Throwable {
		plccPageObjects.letsShopBtn.click();
	}
	
	@Given("^user click on Address Book in MyAccount link$")
	public void user_click_on_Address_Book_in_MyAccount_link() throws Throwable {
		plccPageObjects.addressBookOnMyaccountLink.click();
		
	}
	
	@Given("^user expect element Address Book to be present$")
	public void user_expect_element_Address_Book_to_be_present() throws Throwable {
		plccPageObjects.verifyPresenceOfAddressBookText();
	}

	@Given("^user expect element Add New Address link to be present$")
	public void user_expect_element_Add_New_Address_link_to_be_present() throws Throwable {
		plccPageObjects.verifyPresenceOfAddNewAddressLink();
	}
	
	@Given("^user expect element for first name and Last name text$")
	public void user_expect_element_for_first_name_and_Last_name_text() throws Throwable {
	    
	}


}
