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

	@FindBy(xpath = "(//input[@class=\"css-ikqzer undefined\"][@type='text'])[1]")
	public WebElement inputfirstname;

	@FindBy(xpath = "(//input[@class=\"css-ikqzer undefined\"][@type='text'])[2]")
	public WebElement inputlastname;

	@FindBy(xpath = "(//input[@class=\"css-ikqzer undefined\"][@type='text'])[3]")
	public WebElement inputemailaddress;

	@FindBy(xpath = "//input[@type='password']")
	public WebElement inputCreatepassword;

	@FindBy(xpath = "//input[@type='checkbox']")
	public WebElement inputoptin;

	@FindBy(xpath = "//button[@data-auid='btnbutton-3']")
	public WebElement btnSignUp;

	@FindBy(xpath = "//button[text()='Sign In Now']")
	public WebElement lnkSignInNow;

	@FindBy(xpath = "//div[text()='Already have an Account? Sign In Now']")
	public WebElement txtAlreadyhaveanAccountSignInNow;

	@FindBy(xpath = "//div[text()='Password Must Contain Label']")
	public WebElement txtPasswordMustContainLabel;

	@FindBy(xpath = "//div[text()='8 Characters Min']")
	public WebElement txtCharactersMin;

	@FindBy(xpath = "//i[@class='academyicon icon-close pr-1']")
	public WebElement iconcross;

	@FindBy(xpath = "//div[text()='Password Strength']")
	public WebElement txtPasswordStrength;

	@FindBy(xpath = "//div[text()='Weak']")
	public WebElement txtWeak;

	@FindBy(xpath = "//div[text()='Strong']")
	public WebElement txtStrong;

	@FindBy(xpath = "//div[text()='']")
	public WebElement txtsuccessmessage;

	@FindBy(xpath = "//button[@data-auid='btnemail-signin-button']")
	public WebElement btnSignIn;

	@FindBy(xpath = "//input[@class=\"css-ikqzer undefined\"][@type='text']")
	public WebElement inputemailaddress_signin;

	@FindBy(xpath = "//span[text()='Myaccount']")
	public WebElement txtMyaccountDescription;
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
}
