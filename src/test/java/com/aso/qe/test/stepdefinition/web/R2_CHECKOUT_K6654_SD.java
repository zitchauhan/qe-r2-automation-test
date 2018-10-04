package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;
import com.aso.qe.test.pageobject.R2_PDP_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_CHECKOUT_K6654_SD extends CommonActionHelper {

	R2_MyAccount_PO myAccount = PageFactory.initElements(driver, R2_MyAccount_PO.class);

	@Then("^user click on anywhere in change password$")
	public void user_click_on_anywhere_in_change_password() throws Throwable {

		clickOnButton(myAccount.txtNewPassword);

	}

	@Then("^user enter password of four digit$")
	public void user_enter_password_of_four_digit() throws Throwable {
		setInputText(myAccount.txtCurrentPassword, webPropHelper.getTestDataProperty("FOURDIGITPASSWORD"));
	}

	@Then("^user enter the wrong current password$")
	public void user_enter_the_wrong_current_password() throws Throwable {
		setInputText(myAccount.txtCurrentPassword, webPropHelper.getTestDataProperty("IncorrectPassword"));
	}

	@Then("^user enter the six digit password$")
	public void user_enter_the_six_digit_password() throws Throwable {
		setInputText(myAccount.txtNewPassword, webPropHelper.getTestDataProperty("SIXDIGITPASSWORD"));
	}

	@Then("^user click on the show lable$")
	public void user_click_on_the_show_lable() throws Throwable {
		clickOnButton(myAccount.btnShow);
	}

	@Then("^user enters current password \"(.*?)\"$")
	public void user_enters_current_password(String arg1) throws Throwable {
		setInputText(myAccount.txtCurrentPassword, webPropHelper.getTestDataProperty(arg1));
	}

	@Then("^user enter the new password \"(.*?)\"$")
	public void user_enter_the_new_password(String arg1) throws Throwable {
		setInputText(myAccount.txtNewPassword, webPropHelper.getTestDataProperty(arg1));
	}

}
