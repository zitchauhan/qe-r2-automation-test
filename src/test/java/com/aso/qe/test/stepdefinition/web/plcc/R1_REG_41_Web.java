package com.aso.qe.test.stepdefinition.web.plcc;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PLCC_Mobile_PO;
import com.aso.qe.test.pageobject.R1_PLCC_Registration_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R1_REG_41_Web extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver,
			R1_GlobalElementHeader_Home_PO.class);
	R1_PLCC_Registration_PO plccPageObjects = PageFactory.initElements(driver, R1_PLCC_Registration_PO.class);
	R2_MyAccount_PO myAccount_po= PageFactory.initElements(driver, R2_MyAccount_PO.class);
	R1_PLCC_Mobile_PO plccMobile_po= PageFactory.initElements(driver, R1_PLCC_Mobile_PO.class);

	@Then("^user click on Add Company name, Apt\\. Number, etc\\. \\(Optional\\) link$")
	public void user_click_on_Add_Company_name_Apt_Number_etc_Optional_link() throws Throwable {
		plccPageObjects.clickOnAddMoreAddressDetails();
	}

	@Then("^user expect element Add company name, Apt\\.Number, etc\\. \\(Optional\\) to be present$")
	public void user_expect_element_Add_company_name_Apt_Number_etc_Optional_to_be_present() throws Throwable {
		plccPageObjects.verifyPresenceOfAddMoreAddressDetails();
	}

	@Then("^user expect element Phone number to be present$")
	public void user_expect_element_Phone_number_to_be_present() throws Throwable {
		plccPageObjects.verifyPresenceOfPhoneNumberTxtField();
	}

	@Then("^user expect element SIGN UP to be present$")
	public void user_expect_element_SIGN_UP_to_be_present() throws Throwable {
		plccPageObjects.verifyPresenceOfSignUpBtnRegistrationPage();
	}

	@Then("^user expect element User Select Address to be present$")
	public void user_expect_element_User_Select_Address_to_be_present() throws Throwable {
		try {
			plccPageObjects.verifyPresenceOfUserSelectedAddressBtn();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@When("^user click on burger menu$")
	public void user_click_on_burger_menu() throws Throwable {
		globalElementHeader.clickOnBurgerMenu();
	}
	//validatePresenceOfMyAccountLink
	@Given("^user click on expand all Academy services$")
	public void user_click_on_expand_all_Academy_services() throws Throwable {
		globalElementHeader.clickOnExpandAllAcademyServices();
	}
	@When("^user unselect Add Address for Faster Checkout checkbox$")
	public void user_unselect_Add_Address_for_Faster_Checkout_checkbox() throws Throwable {
		plccPageObjects.addAddressCheckBox.click();   
	}

	/**
	 * 
	 * Added new methods for Registration
	 */
	@Then("^user expect element Add company name, Apt\\.Number, etc\\. \\(Optional\\) to not be present$")
	public void user_expect_element_Add_company_name_Apt_Number_etc_Optional_to_not_be_present() throws Throwable {
		plccPageObjects.verifyAbsenceOfAddCompanyAptNumber(); 
	}
	@Then("^user expect element Address to not be present$")
	public void user_expect_element_Address_to_not_be_present() throws Throwable {
		plccPageObjects.verifyAbsenceOfAddress(); 
	    
	}

	@Then("^user expect element Zip Code to not be present$")
	public void user_expect_element_Zip_Code_to_not_be_present() throws Throwable {
		plccPageObjects.verifyAbsenceOfZipcode();   
	    
	}

	@Then("^user expect element City to not be present$")
	public void user_expect_element_City_to_not_be_present() throws Throwable {
		plccPageObjects.verifyAbsenceOfCity(); 
	}

	@Then("^user expect element State to not be present$")
	public void user_expect_element_State_to_not_be_present() throws Throwable {
		plccPageObjects.verifyAbsenceOfState(); 
	}

	@Then("^user expect element Phone number to not be present$")
	public void user_expect_element_Phone_number_to_not_be_present() throws Throwable {
		plccPageObjects.verifyAbsenceOfPhoneNumber(); 
	}
	
	
	
	@When("^user click on My Account link of mobile$")
	public void user_click_on_My_Account_link_of_mobile() throws Throwable {
		plccMobile_po.verifyPresenceOfMyAccountLinkOnMobile();
		myAccount_po.myAccount_txt_Mobile.click();
	}

}
