package com.aso.qe.test.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aso.qe.framework.common.CommonActionHelper;

public class R2_OrderConfirmation_Po extends CommonActionHelper {
	
	@FindBy(xpath="//*[@data-auid='checkout_order_confirmation_create_account_link']")
	public WebElement orderConfirmation_CreateAcount_lnk;
	
	@FindBy(xpath = "//*[@data-auid='firstname_input']")
	public WebElement orderConfirmation_SignUp_FirstName_txt;

	@FindBy(xpath = "//*[@data-auid='lastname_input']")
	public WebElement orderConfirmation_SignUp_LastName_txt;

	@FindBy(xpath = "//*[@data-auid='email_input']")
	public WebElement orderConfirmation_SignUp_EmailAddress_txt;

	@FindBy(xpath = "(//div[.='Create Password']/following-sibling::div/input)[1]")
	public WebElement orderConfirmation_SignUp_CreatePassword_txt;

	@FindBy(xpath = "//*[contains(text(), 'I would like to receive promotion & special offers ')]/preceding-sibling::input[@type='checkbox']")
	public WebElement orderConfirmation_SignUp_ReceiveNotification_checkBox;

	@FindBy(xpath = "//button[@data-auid='btnsignup_btn']")
	public WebElement orderConfirmation_SignUp_SignUp_btn;

	@FindBy(xpath = "//*[@data-auid='redirect_signin_btn']")
	public WebElement orderConfirmation_SignUp_SignInNow;
	
//	@FindBy(xpath = "//*[contains(text(), 'Already have an Account')]")
//	public WebElement txtAlreadyHaveAnAccountSignInNow;
//
//	@FindBy(xpath = "//div[text()='Password Must Contain Label']")
//	public WebElement txtPasswordMustContainLabel;

}
