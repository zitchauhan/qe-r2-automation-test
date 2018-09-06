package com.aso.qe.test.stepdefinition.web;


import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import freemarker.template.utility.NullArgumentException;

public class R2_CART_K4230_SD extends CommonActionHelper {
	R2_MyAccount_PO r2MyAccountPo = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	public R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	public R2_Cart_PO cartR2PageObj = PageFactory.initElements(driver, R2_Cart_PO.class);
	public String defaultPassword = "DefaultPassword";
	public String changedPassword = "ChangedPassword";

	@Given("^user click on my account link$")
	public void user_click_on_my_account_link() throws Throwable {
		assertTrue(clickOnButton(r2MyAccountPo.lnkMyAccount));
	}

	@Given("^user click on profile link$")
	public void user_click_on_profile_link() throws Throwable {
		
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(clickOnButton(r2MyAccountPo.lnkProfile_Mobile));	
		}
		else
		{
			assertTrue(clickOnButton(r2MyAccountPo.lnkProfile));
		}
	}
	
	
	@Given("^user is not logged out$")
	public void user_is_not_logged_out() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype))
		{
			assertTrue(isDisplayed(r2MyAccountPo.myAccount_txt_Mobile));
		}
		else
		{
		assertTrue(isDisplayed(r2MyAccountPo.lnkMyAccount));
		}
	}

	@Given("^user logs in as \"(.*?)\"$")
	public void user_logs_in_as(String emailID) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		if (emailID.contains("EmailAddressForChangePassword")) {
			setInputText(r2MyAccountPo.inputEmailAddress_SignIn, webPropHelper.getTestDataProperty("EmailAddressForChangePassword"));
			setInputText(r2MyAccountPo.inputCreatePassword, webPropHelper.getTestDataProperty("DefaultPassword"));
			clickOnButton(r2MyAccountPo.btnSignIn);
			if (isDisplayed(r2MyAccountPo.txtIncorrectCombinationError)) {
				setInputText(r2MyAccountPo.inputCreatePassword, webPropHelper.getTestDataProperty("ChangedPassword"));
				clickOnButton(r2MyAccountPo.btnSignIn);
				defaultPassword = "ChangedPassword";
				changedPassword = "DefaultPassword";
			}

		}
		
		else if(emailID.contains("UserWithZeroProductsInCart")) {
			setInputText(r2MyAccountPo.txtEmailAddress, webPropHelper.getTestDataProperty("EmailAddressForZeroProductsInCart"));
			setInputText(r2MyAccountPo.inputPassword, webPropHelper.getTestDataProperty("Password"));
			assertTrue(clickOnButton(r2MyAccountPo.btnSignIn));
			if(isDisplayed(cartR2PageObj.miniCartCount)) {
				assertTrue(clickOnButton(cartR2PageObj.miniCartCount));
				setInputText(cartR2PageObj.input_Quantity, "0");//txtQuantity
				if(isDisplayed(cartR2PageObj.input_Quantity))//txtQuantity
					tabInputBox(cartR2PageObj.input_Quantity);	//txtQuantity			
			}	
		}
		
		else if(emailID.contains("RawUser")){
			setInputText(r2MyAccountPo.txtEmailAddress, webPropHelper.getTestDataProperty("RawUser"));
			setInputText(r2MyAccountPo.inputPassword, webPropHelper.getTestDataProperty("Password"));
			assertTrue(clickOnButton(r2MyAccountPo.btnSignIn));
		}
		
		else
		{
			throw new NullArgumentException("Please validate arguement.");
		}
	}

	@Given("^user click on change password icon$")
	public void user_click_on_change_password_icon() throws Throwable {
		assertTrue(clickOnButton(r2MyAccountPo.btnChangePassword));
	}

	@Given("^user enters current password$")
	public void user_enters_in_current_password() throws Throwable {
		setInputText(r2MyAccountPo.txtCurrentPassword, webPropHelper.getTestDataProperty(defaultPassword));
	}

	@Given("^user enters new password$")
	public void user_enters_in_new_password() throws Throwable {
		setInputText(r2MyAccountPo.txtNewPassword, webPropHelper.getTestDataProperty(changedPassword));
	}

	@Given("^user clicks on Update button$")
	public void user_clicks_on_Update_button() throws Throwable {
		assertTrue(clickOnButton(r2MyAccountPo.btnUpdate));
	}
	
	@Then("^user should be able to change password$")
	public void user_should_be_able_to_change_password() {
		assertTrue(isDisplayed(r2MyAccountPo.btnUpdate));
	}
	
	@Then("^user click on MyAccount$")
	public void user_click_on_MyAccount() {
		if("mobile".equalsIgnoreCase(testtype))
		{
		assertTrue(clickOnButton(r2MyAccountPo.myAccount_txt_Mobile));
		}else
		{
			assertTrue(clickOnButton(r2MyAccountPo.lnkMyAccount));
			
		}
	}
	
	@Then("^user click on edit button of default address$")
	public void user_click_on_edit_button_of_default_address() throws Throwable {
		assertTrue(clickOnButton(r2MyAccountPo.lnkEdit));   
	}
	
	@Then("^user enter new email field \"(.*?)\"$")
	public void user_enter_new_email_field(String arg1) throws Throwable {
		if("mobile".equalsIgnoreCase(testtype))
		{
			setInputText(r2MyAccountPo.txtNewEmail, webPropHelper.getTestDataProperty(arg1));
		}else
		{
			setInputText(r2MyAccountPo.txtNewEmail, webPropHelper.getTestDataProperty(arg1));
			
		}  
	}

	@Then("^user enter confirm email field \"(.*?)\"$")
	public void user_enter_confirm_email_field(String arg1) throws Throwable {
		if("mobile".equalsIgnoreCase(testtype))
		{
			setInputText(r2MyAccountPo.txtConfirmEmail, webPropHelper.getTestDataProperty(arg1));
		}else
		{
			setInputText(r2MyAccountPo.txtConfirmEmail, webPropHelper.getTestDataProperty(arg1));
			
		}
	}

	@Given("^user enters currentpassword \"(.*?)\"$")
	public void user_enters_currentpassword(String arg1) throws Throwable {
		setInputText(r2MyAccountPo.txtCurrentPassword, webPropHelper.getTestDataProperty(arg1)); 
	}

	@Given("^user enters newpassword \"(.*?)\"$")
	public void user_enters_newpassword(String arg1) throws Throwable {
		setInputText(r2MyAccountPo.txtNewPassword, webPropHelper.getTestDataProperty(arg1));
	}

}
