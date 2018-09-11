package com.aso.qe.test.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aso.qe.framework.common.CommonActionHelper;

public class R2_PDP_PO extends CommonActionHelper {
	
	/***************************** START XPAHTS **********************************/
	
	//Start KER-6655 CR-MS
	 @FindBy(xpath="//*[@data-auid='btnbtnEnableBuyNow']") 
	 public WebElement EnableBuyNow_btn;
	
	@FindBy(xpath = "//*[@name='shippingFirstName']")
	public WebElement Shipping_First_Name_txt;
	
	@FindBy(xpath = "//*[@name='shippingLastName']")
	public WebElement Shipping_Last_Name_txt;
	
	@FindBy(xpath = "//*[@name='shippingAddress']")
	public WebElement Shipping_Address_txt;
	
	@FindBy(xpath = "//*[@name='shippingZipCode']")
	public WebElement Shipping_ZipCode_txt;
	
	@FindBy(xpath = "//*[@name='shippingCity']")
	public WebElement Shipping_City_txt;
	
	@FindBy(xpath = "//*[@name='shippingState']")
	public WebElement Shipping_State_txt;
	
	@FindBy(xpath = "//*[@data-auid='btnundefined']")
	public WebElement Default_Payment_Option_btn;
	
	@FindBy(xpath = "//*[contains(text(),'Sign up to get Hot Deals')]/preceding::*[1]")
	public WebElement Signup_Cbx;
	
	//End KER-6655 CR-MS	 
	
	/***************************** END XPAHTS **********************************/

}
