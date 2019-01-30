package com.aso.qe.test.pageobject;

import java.util.List;

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
	
	@FindBy(xpath = "//*[contains(text(),'THANKS FOR SUBMITTING YOUR ORDER!')]")
	public WebElement orderConfirmation_ThanksForSubmittingOrder_txt;
	
	@FindBy(xpath = "(//*[text()='For a faster checkout next time, create your account below']/following-sibling::p)[1]")
	public WebElement orderConfirmation_FullName_txt;
	
	@FindBy(xpath = "(//*[text()='For a faster checkout next time, create your account below']/following-sibling::p)[2]")
	public WebElement orderConfirmation_EmailAddress_txt;
	
	@FindBy(xpath = "//*[text()='Choose Password']/following-sibling::*//*[@type='password'] | //*[text()='Create a Password']/following-sibling::*//*[@type='password']")
	public WebElement orderConfirmation_ChoosePassword_txt;
	
	@FindBy(xpath = "//*[@labeltext='Yes, notify me about the latest hot deals, ads, local events & more!']/following-sibling::* | //*[@labeltext='Sign up to get Hot Deals, Weekly Ads, Local Events, and more delivered straight to your inbox. You can unsubscribe at anytime.']/following-sibling::*")
	public WebElement orderConfirmation_NotifyMe_checkbox;
	
	@FindBy(xpath = "//*[@data-auid='btnbutton-1']")
	public WebElement orderConfirmation_Submit_btn;
	
	@FindBy(xpath= "//*[contains(text(),'account has been created')]")
	public WebElement orderConfirmation_AccountCreatedMessage_txt;
	
	@FindBy(xpath= "//*[contains(text(),'PICKUP INSTRUCTIONS')]/parent::*/parent::*/*[2]")
	public WebElement storePickUpInstructionOrderConfirmationPage;  //SID 23-Jan
	
	@FindBy(xpath= "//*[text()='ORDER SUMMARY']/parent::*/parent::*/*[2]")
	public WebElement itemCountOrderSummary;  //SID 23-Jan

	@FindBy(xpath= "//*[text()='ORDER SUMMARY']/parent::*/parent::*/*[3]//strong")
	public List<WebElement> productAttributes;  //SID 23-Jan
	
	@FindBy(xpath= "//*[text()='ORDER SUMMARY']/parent::*/parent::*/*[4]/*/*")
	public List<WebElement> otherDetailsOfOrderSummary;  //SID 23-Jan
	
	@FindBy(xpath= "//*[text()='IN-STORE PICKUP']/parent::*/parent::*/*[2]/*[2]/*/*[1]/*[2]")
	public WebElement pickupDate;  //SID 23-Jan
	
	@FindBy(xpath= "//*[text()='IN-STORE PICKUP']/parent::*/parent::*/*[2]/*[3]")
	public WebElement pickupStore;  //SID 23-Jan
	
	@FindBy(xpath= "//*[text()='IN-STORE PICKUP']/parent::*/parent::*/*[2]/*[3]/*[4]/*")
	public WebElement pickupStoreHourDropDown;  //SID 23-Jan
	
	@FindBy(xpath= "//*[text()='IN-STORE PICKUP']/parent::*/parent::*/*[2]/*[3]/*[4]/*[2]")
	public WebElement pickupStoreHourTiming;  //SID 23-Jan
	
	@FindBy(xpath= "//*[text()='IN-STORE PICKUP']/parent::*/parent::*/*[2]/*[4]/*[1]")
	public WebElement pickupPerson;  //SID 23-Jan
	
	@FindBy(xpath= "//*[text()='For a faster checkout next time, create your account below']/parent::*/*/p")
	public WebElement createAnAccountOrderConfirmation;  //SID 26-Jan
	
	@FindBy(xpath= "//*[text()='IN-STORE PICKUP']")
	public WebElement inStorePickUpOrderConfirmation;  //SID 26-Jan
	
	@FindBy(xpath= "//*[text()='PAYMENT']")
	public WebElement paymentOrderConfirmation;  //SID 26-Jan
	
	@FindBy(xpath= "//*[text()='View Order History']")
	public WebElement orderHistoryOrderConfirmationPage;  //SID 28-Jan
	
	


}
