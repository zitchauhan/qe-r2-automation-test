package com.aso.qe.test.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aso.qe.framework.common.CommonActionHelper;

public class R2_MyAccount_PO extends CommonActionHelper {

	// Start KER-4249 CR-RK
	@FindBy(xpath = "//li[@data-auid='MyAccount']")
	public WebElement lnkSignIn;

	@FindBy(xpath = "//button[text()='Sign Up']")
	public WebElement lnkSignUp;

	@FindBy(xpath = "//h4")
	public WebElement txtdescription;

	@FindBy(xpath = "(//input[@type='text'])[1]")
	public WebElement inputFirstName;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	public WebElement inputLastName;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	public WebElement inputEmailAddress;

	@FindBy(xpath = "(//div[.='Create Password']/following-sibling::div/input)[1]") // modified by CR- SK
																					// "//input[@type='password']")
	public WebElement inputCreatePassword;

	@FindBy(xpath = "//input[@type='checkbox']")
	public WebElement inputOptIn;

	@FindBy(xpath = "//button[@data-auid='btnbutton-3']")
	public WebElement btnSignUp;

	@FindBy(xpath = "//button[text()='Sign In Now']")
	public WebElement lnkSignInNow;

	@FindBy(xpath = "//div[text()='Already have an Account? Sign In Now']")
	public WebElement txtAlreadyHaveAnAccountSignInNow;

	@FindBy(xpath = "//div[text()='Password Must Contain Label']")
	public WebElement txtPasswordMustContainLabel;

	@FindBy(xpath = "//div[text()='8 Characters Min']")
	public WebElement txtCharactersMin;

	@FindBy(xpath = "//i[@class='academyicon icon-close pr-1']")
	public WebElement iconCross;

	@FindBy(xpath = "//div[text()='Password Strength']")
	public WebElement txtPasswordStrength;

	@FindBy(xpath = "//div[text()='Weak']")
	public WebElement txtWeak;

	@FindBy(xpath = "//div[text()='Strong']")
	public WebElement txtStrong;

	@FindBy(xpath = "//div[text()='']")
	public WebElement txtsuccessMessage;

	@FindBy(xpath = "//button[@data-auid='btnemail-signin-button']")
	public WebElement btnSignIn;

	@FindBy(xpath = "//input[@type='text']")
	public WebElement inputEmailAddress_SignIn;

	@FindBy(xpath = "//span[text()='Myaccount']")
	public WebElement txtMyAccountDescription;
	// End KER-4249 CR-RK

	// Start KER-4232 CR-MS
	@FindBy(xpath = "//*[@data-auid='signInCta']")
	public WebElement signIn;

	@FindBy(xpath = "//*[@data-auid='btnemail-signin-button']")
	public WebElement logIn;

	@FindBy(xpath = "//*[@class='css-ikqzer undefined']")
	public WebElement emailAddress;

	@FindBy(xpath = "//*[@class='css-1duid1i']")
	public WebElement password;

	@FindBy(xpath = "//*[text()='address']")
	public WebElement addressBook;

	@FindBy(xpath = "//*[@data-auid='btnundefined']")
	public WebElement addNewAddressBtn;

	@FindBy(xpath = "//*[@name='firstName']")
	public WebElement adr_inpFirstName;

	@FindBy(xpath = "//*[@name='lastName']")
	public WebElement adr_inpLastName;

	@FindBy(xpath = "//*[@name='addressLine1']")
	public WebElement adr_inpAddress1;

	@FindBy(xpath = "//*[@name='zipCode']")
	public WebElement adr_inpzipCode;

	@FindBy(xpath = "//*[@name='city']")
	public WebElement adr_inpCity;

	@FindBy(xpath = "//*[@name='phone1']")
	public WebElement adr_inpPhoneNumber;
	// End KER-4232 CR-MS

	// Start KER-3392 CR-RK
	@FindBy(xpath = "//h5")
	public WebElement txtWelcomeDescription;

	@FindBy(xpath = "//span[text()='Email Address']")
	public WebElement txtEmailAddressDescription;

	@FindBy(xpath = "//span[text()='Password']")
	public WebElement txtPasswordDescription;

	@FindBy(xpath = "//a[contains(text(),'Forgot Your Password')]")
	public WebElement txtForgotYourPasswordDescription;
	
	@FindBy(xpath = "//button[text()='Forgot Your Password']")
	public WebElement lnkForgotYourPassword;


	@FindBy(xpath = "//*[contains(text(),'Create Account')]")
	public WebElement txtCreateAccountDescription;

	@FindBy(xpath = "//*[contains(text(),'Create Account')]")
	public WebElement lnkCreateAccount;
	// End KER-3392 CR-RK

	// Start KER-4011 CR-SK
	@FindBy(xpath = "//h5[.='Sign in']")
	public WebElement headerSignIn;

	@FindBy(xpath = "//div[contains(text(), 'Hello')]")
	public WebElement txtHelloMessage;

	@FindBy(xpath = "//p[.='The combination of Email Address and Password is incorrect. Please try again.']")
	public WebElement txtIncorrectCombinationError;

	@FindBy(xpath = "//p[contains(text(), 'Sorry, we do not have an account registered with this email address. Please enter a registered email address or create a new account')]")
	public WebElement txtUnregisteredEmailAddressError; // 23 Aug

	@FindBy(xpath = "//span[.='Please enter the Email Address in a valid format (ex. abc@xyz.com)']")
	public WebElement txtInvalidEmailAddressError;
	
	@FindBy(xpath = "//span[.='Please enter an Email address and/or Password']")
	public WebElement txtInvalidPasswordError;
	
	@FindBy(xpath = "//div[@class='css-yg98kr mb-half px-3']")
	public WebElement address;
	// End KER-4011 CR-SK
	
	
	// Start KER-4023 CR-SK
	@FindBy(xpath = "//h4[.='FORGOT PASSWORD']")
	public WebElement headerForgotYourPassword;

	@FindBy(xpath = "//button[@data-auid='btnbutton-1']")
	public WebElement btnSubmit; 
	
	@FindBy(xpath = "//button[.='Forgot your password?']")
	public WebElement btnForgotYourPassword; 
	// End KER-4023 CR-SK
	
	// Start KER-4230 CR-SK
	@FindBy(xpath = "//a[.='profile']")
	public WebElement lnkProfile;
	
	@FindBy(xpath = "//*[@data-auid='myAccountCta']")
	public WebElement lnkMyAccount;
	
	@FindBy(xpath = "//button/i[@class='academyicon icon-lock pr-half']")
	public WebElement btnChangePassword;
	
	@FindBy(xpath = "//div[.='New Password']/preceding-sibling::input[@type='password']")
	public WebElement txtCurrentPassword;
	
	@FindBy(xpath = "//div[.='New Password']/following-sibling::input[@type='password']")
	public WebElement txtNewPassword;
	
	@FindBy(xpath = "//*[@data-auid='btnundefined']")
	public WebElement btnUpdate;
	// End KER-4230 CR-SK

	// Start KER-4249 CR-SK 23-Aug
	@FindBy(xpath = "//button[.='Show']")
	public WebElement btnShow;

	@FindBy(xpath = "//button[.='Hide']")
	public WebElement btnHide;
	// End KER-4249 CR-SK 23-Aug

	// Start KER-3152 CR-AKK
		@FindBy(xpath = "//input[@type='text']")
		public WebElement inputEmail;

		@FindBy(xpath = "//input[@type='password']")
		public WebElement inputPassword;

		@FindBy(xpath = "(//*[@data-auid='btnc_btnCheckout'])[3]")
		public WebElement checkoutBtn;

		@FindBy(xpath = "//*[@data-auid='checkout_shipping_methods_collapsed']")
		public WebElement shippingMethodSection;

		@FindBy(xpath = "//*[@data-auid='checkout_edit_shipping_address']")
		public WebElement checkoutEditShippingBtn;

		@FindBy(xpath = "//input[@type='text'][@name='companyName']")
		public WebElement inputAdditionalAddress;

		@FindBy(xpath = "//input[@name='address']")
		public WebElement inputAddress;

		@FindBy(xpath = "//*[@data-auid='btncheckout_goto_shipping_method_btn']")
		public WebElement goToShippingMethod;

		@FindBy(xpath = "//*[@data-auid='myAccountCta']")
		public WebElement myAccount;

		@FindBy(xpath = "//*[@data-auid='Wish List']")
		public WebElement wishList;

		@FindBy(xpath = "//*[@name='phoneNumber']")
		public WebElement inputPhone;

		@FindBy(xpath = "//*[@data-auid='checkout_shipping_address_add_more_details_link']")
		public WebElement addMoreDetailsAddress;

		@FindBy(xpath = "//input[@name='companyName']")
		public WebElement inputCompanyName;

		@FindBy(xpath = "//a[text()='address']")
		public WebElement clickAddress;

		@FindBy(xpath = "(//div[@class='col-12 col-md-8'])[2]/div[1]/div[2]/div[1]")
		public WebElement checkAddress;

		@FindBy(xpath = "(//div[@class='col-12 col-md-8'])[2]/div[1]/div[2]/div[4]")
		public WebElement checkPhone;

		// End KER-3152 CR-AKK
	


}
