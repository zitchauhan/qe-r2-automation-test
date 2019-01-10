package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import freemarker.template.utility.NullArgumentException;

public class R2_CART_K4230_SD extends CommonActionHelper {
	R2_MyAccount_PO r2MyAccountPo = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	public R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver,
			R1_GlobalElementHeader_Home_PO.class);
	public R2_Cart_PO cartR2PageObj = PageFactory.initElements(driver, R2_Cart_PO.class);
	public String defaultPassword = "DefaultPassword";
	public String changedPassword = "ChangedPassword";
	private final String newRandomEmail = r2MyAccountPo.generateRandomEmailId();

	@Given("^user click on my account link$")
	public void user_click_on_my_account_link() throws Throwable {
		assertTrue(clickOnButton(r2MyAccountPo.lnkMyAccount));
	}

	@Given("^user click on profile link$")
	public void user_click_on_profile_link() throws Throwable {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(r2MyAccountPo.lnkProfile_Mobile));
		} else {
			assertTrue(clickOnButton(r2MyAccountPo.myAccount_MyAccountList_Profile_lnk));
		}
	}

	@Given("^user is not logged out$")
	public void user_is_not_logged_out() throws Throwable {
		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(r2MyAccountPo.myAccount_txt_Mobile));
		} else {
			assertTrue(isDisplayed(r2MyAccountPo.lnkMyAccount));
		}
	}

	@Given("^user logs in as \"(.*?)\"$")
	public void user_logs_in_as(String emailID) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		if (emailID.contains("EmailAddressForChangePassword")) {
			setInputText(r2MyAccountPo.inputEmailAddress_SignIn,webPropHelper.getTestDataProperty("EmailAddressForChangePassword"));
			setInputText(r2MyAccountPo.inputPassword, webPropHelper.getTestDataProperty("DefaultPassword"));
			clickOnButton(r2MyAccountPo.btnSignIn);
			if (isDisplayed(r2MyAccountPo.txtIncorrectCombinationError)) {
				setInputText(r2MyAccountPo.inputPassword, webPropHelper.getTestDataProperty("ChangedPassword"));
				clickOnButton(r2MyAccountPo.btnSignIn);
				defaultPassword = "ChangedPassword";
				changedPassword = "DefaultPassword";
			}

		}else if(emailID.contains("Bopis_Email")) {
			setInputText(r2MyAccountPo.txtEmailAddress,
					webPropHelper.getTestDataProperty("Bopis_Email"));
			setInputText(r2MyAccountPo.inputPassword, webPropHelper.getTestDataProperty("Password"));
			assertTrue(clickOnButton(r2MyAccountPo.btnSignIn));
			cartR2PageObj.navigateAndDeleteAllProductsInCart();
		}

		else if (emailID.contains("UserWithZeroProductsInCart")) {
			setInputText(r2MyAccountPo.txtEmailAddress,
					webPropHelper.getTestDataProperty("EmailAddressForZeroProductsInCart"));
			setInputText(r2MyAccountPo.inputPassword, webPropHelper.getTestDataProperty("Password"));
			assertTrue(clickOnButton(r2MyAccountPo.btnSignIn));
			cartR2PageObj.navigateAndDeleteAllProductsInCart();
		}

		else if (emailID.contains("RawUser") | emailID.contains("UserWithDefaultCaliforniaAddress")
				| emailID.contains("EmailAddress") | emailID.contains("UserWithTaxableAddress")
				| emailID.contains("UserWithSavedAddressAndPayment") | emailID.contains("UserForOrderPlacement")) {
			setInputText(r2MyAccountPo.txtEmailAddress, webPropHelper.getTestDataProperty(emailID));
			setInputText(r2MyAccountPo.inputPassword, webPropHelper.getTestDataProperty("Password"));
			assertTrue(clickOnButton(r2MyAccountPo.btnSignIn));
		}

		else {
			throw new NullArgumentException("Please validate arguement.");
		}
		Thread.sleep(Constants.thread_high);
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
		if ("mobile".equalsIgnoreCase(testtype)) {
			clickOnButton(r2MyAccountPo.myAccount_txt_Mobile);
		} else {
			clickOnButton(r2MyAccountPo.lnkMyAccount);

		}
	}

	@Then("^user click on edit button of default address$")
	public void user_click_on_edit_button_of_default_address() throws Throwable {
		assertTrue(clickOnButton(r2MyAccountPo.lnkEdit));
	}

	@Then("^user enter new email field \"(.*?)\"$")
	public void user_enter_new_email_field(String arg1) throws Throwable {
		if ("mobile".equalsIgnoreCase(testtype)) {
			setInputText(r2MyAccountPo.txtNewEmail, webPropHelper.getTestDataProperty(arg1));
			r2MyAccountPo.txtNewEmail.sendKeys(Keys.TAB);
		} else {
			setInputText(r2MyAccountPo.txtNewEmail, webPropHelper.getTestDataProperty(arg1));
			r2MyAccountPo.txtNewEmail.sendKeys(Keys.TAB);
		}
	}

	@Then("^user enter confirm email field \"(.*?)\"$")
	public void user_enter_confirm_email_field(String arg1) throws Throwable {
		if ("mobile".equalsIgnoreCase(testtype)) {
			setInputText(r2MyAccountPo.txtConfirmEmail, webPropHelper.getTestDataProperty(arg1));
			r2MyAccountPo.txtConfirmEmail.sendKeys(Keys.TAB);
		} else {
			setInputText(r2MyAccountPo.txtConfirmEmail, webPropHelper.getTestDataProperty(arg1));
			r2MyAccountPo.txtConfirmEmail.sendKeys(Keys.TAB);

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

	@Then("^user clicks on Update button in edit profile$")
	public void user_clicks_on_Update_button_in_edit_profile() throws Throwable {
		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(r2MyAccountPo.btnSubmit));
		} else {

			assertTrue(clickOnButton(r2MyAccountPo.btnSubmit));
		}
	}

	@Then("^user enter the old password as new password$")
	public void user_enter_the_old_password_as_new_password() throws Throwable {
		setInputText(r2MyAccountPo.txtNewPassword, webPropHelper.getTestDataProperty(defaultPassword));
	}

	@Then("^Verify First Name field should not accept more than fifty character$")
	public void verify_First_Name_field_should_not_accept_more_than_fifty_character() throws Throwable {
		String maxlength = r2MyAccountPo.txtFirstNameInAddCreditCard.getAttribute("maxlength");
		System.out.println(maxlength);
		assertTrue(maxlength.equals("50"));
	}

	@Then("^Verify Last Name field should not accept more than fifty character$")
	public void verify_Last_Name_field_should_not_accept_more_than_fifty_character() throws Throwable {
		String maxlength = r2MyAccountPo.txtLastNameInAddCreditCard.getAttribute("maxlength");
		System.out.println(maxlength);
		assertTrue(maxlength.equals("50"));
	}

	@Then("^user enter new email in new email field$")
	public void user_enter_new_email_in_new_email_field() throws Throwable {
		if ("mobile".equalsIgnoreCase(testtype)) {
			setInputText(r2MyAccountPo.txtNewEmail, newRandomEmail);
			r2MyAccountPo.txtNewEmail.sendKeys(Keys.TAB);
		} else {
			setInputText(r2MyAccountPo.txtNewEmail, newRandomEmail);
			r2MyAccountPo.txtNewEmail.sendKeys(Keys.TAB);
		}
	}

	@Then("^user enter new email in confirm email field$")
	public void user_enter_new_email_in_confirm_email_field() throws Throwable {
		if ("mobile".equalsIgnoreCase(testtype)) {
			setInputText(r2MyAccountPo.txtConfirmEmail, newRandomEmail);
			r2MyAccountPo.txtConfirmEmail.sendKeys(Keys.TAB);
		} else {
			setInputText(r2MyAccountPo.txtConfirmEmail, newRandomEmail);
			r2MyAccountPo.txtConfirmEmail.sendKeys(Keys.TAB);

		}
	}

}
