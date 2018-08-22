package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class R2_CART_KER_4230_Web_SD extends CommonActionHelper {
	R2_MyAccount_PO r2MyAccountPo = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	public GlobalElementHeader_HomePO globalElementHeader = PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
	public R2_Cart_PO cartR2PageObj = PageFactory.initElements(driver, R2_Cart_PO.class);
	public String defaultPassword = "DefaultPassword";
	public String changedPassword = "ChangedPassword";

	@Given("^user click on my account link$")
	public void user_click_on_my_account_link() throws Throwable {
		assertTrue(clickOnButton(r2MyAccountPo.lnkMyAccount));
	}

	@Given("^user click on profile link$")
	public void user_click_on_profile_link() throws Throwable {
		clickOnLink(r2MyAccountPo.lnkProfile);
	}
	
	
	@Given("^user is not logged out$")
	public void user_is_not_logged_out() throws Throwable {
		assertTrue(isDisplayed(r2MyAccountPo.lnkMyAccount));
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
			setInputText(r2MyAccountPo.inputEmailAddress_SignIn, webPropHelper.getTestDataProperty("EmailAddressForZeroProductsInCart"));
			setInputText(r2MyAccountPo.inputCreatePassword, webPropHelper.getTestDataProperty("Password"));
			assertTrue(clickOnButton(r2MyAccountPo.btnSignIn));
			if(isDisplayed(cartR2PageObj.miniCartCount)) {
				assertTrue(clickOnButton(cartR2PageObj.miniCartCount));
				setInputText(cartR2PageObj.txtQuantity, "0");
				if(isDisplayed(cartR2PageObj.txtQuantity))
					tabInputBox(cartR2PageObj.txtQuantity);				
			}		
			
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
		assertFalse(isDisplayed(r2MyAccountPo.btnUpdate));
	}
}
