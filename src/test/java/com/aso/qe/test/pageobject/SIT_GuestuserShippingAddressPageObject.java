package com.aso.qe.test.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aso.qe.framework.common.CommonActionHelper;

public class SIT_GuestuserShippingAddressPageObject extends CommonActionHelper {
	
	
	@FindBy(xpath = "//input[@name='lastName']")
	public WebElement txtLastName;
	@FindBy(xpath = "//input[@name='firstName']")
	public WebElement txtFirstName;
	@FindBy(xpath = "//input[@name='address1']")
	public WebElement txtAddress1;
	@FindBy(xpath = "//input[@name='address2']")
	public WebElement txtAddress2;
	@FindBy(xpath = "//input[@name='zipCode']")
	public WebElement txtZipCode;
	@FindBy(xpath = "//input[@name='city']")
	public WebElement txtCity;
	@FindBy(xpath = "//select[@name='state']")
	public WebElement txtState;
	
	@FindBy(xpath = "(//input[@name='phone1'])[3]")
	public WebElement txteditphonenumber;
		@FindBy(xpath = "(//input[@name='phone1'])[2]")
	public WebElement txtclearphonenumber;
	@FindBy(xpath = "(//input[@name='phone1'])[1]")
	public WebElement txtphonenumber;
	@FindBy(xpath = "//input[@name='logonId']")
	public WebElement txtEmail;
	
	
	
	
	public void enterFirstName() throws Exception {

		setInputText(txtFirstName, "Danush");
		
	}
	
	public void enterLastName() throws Exception {

		setInputText(txtLastName, "Prasanna Kumar");
	
	}
	
	public void enterAddress() throws Exception {

		setInputText(txtAddress1, "4735  Glen Falls Road");
		setInputText(txtAddress2, "Bensalem");

	}
	public void enterZipCode() throws Exception {

		setInputText(txtZipCode, "19020");
		
	}
	
	public void enterCity() throws Exception {

		setInputText(txtCity, "Bensalem");
		
	}
	
	public void SelectState() throws Exception {
		
		selectByText(txtState, "Pennsylvania");
		
	}
	public void enterPhoneNumber() throws Exception {

		setInputText(txtphonenumber, "9426012345");
		
	}
	public void enterEmail() throws Exception {

		setInputText(txtEmail, "dan33.text@gmail.com");
	
	}
	
    public void cleartext() throws Exception{
    	txtclearphonenumber.clear();
		
	}
	
	

}
