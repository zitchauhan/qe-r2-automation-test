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
	public WebElement orderConfirmation_SignUp_SignInNow_btn;
	
	@FindBy(xpath = "//*[text()='THANKS FOR SUBMITTING YOUR ORDER']")
	public WebElement orderConfirmation_ThanksForSubmittingOrder_txt;
	
	@FindBy(xpath = "(//*[text()='For a faster checkout, use Email id to create account']/following-sibling::p)[1]")
	public WebElement orderConfirmation_FullName_txt;
	
	@FindBy(xpath = "(//*[text()='For a faster checkout, use Email id to create account']/following-sibling::p)[2]")
	public WebElement orderConfirmation_EmailAddress_txt;
	
	@FindBy(xpath = "//*[text()='Choose Password']/following-sibling::*//*[@type='password']")
	public WebElement orderConfirmation_ChoosePassword_txt;
	
	@FindBy(xpath = "//*[@labeltext='Sign UP to get Hot deals, Weekly Adds, Local Events and more']")
	public WebElement orderConfirmation_SigUpToGetHotDeals_checkbox;
	
	
//@

}
