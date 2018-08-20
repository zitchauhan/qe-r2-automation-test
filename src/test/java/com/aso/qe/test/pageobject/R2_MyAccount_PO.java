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

	@FindBy(xpath = "//input[@type='password']")
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

	@FindBy(xpath = "//a[text()='Forgot Your Password']")
	public WebElement txtForgotYourPasswordDescription;

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

	// End KER-4011 CR-SK
}
