package com.aso.qe.test.pageobject;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aso.qe.framework.common.CommonActionHelper;

import cucumber.api.java.en.Then;

public class R2_PDP_PO extends CommonActionHelper {
	
	/***************************** START XPAHTS **********************************/
	
	//Start KER-6655 CR-MS
	 @FindBy(xpath="//*[@data-auid='btnbtnEnableBuyNow']|//*[@data-auid='btnundefined']") 
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
	
	@FindBy(xpath = "//*[@name='shippingPhone']")
	public WebElement Shipping_Phone_txt;
	
	@FindBy(xpath = "//*[@data-auid='btnundefined']")
	public WebElement Default_Payment_Option_btn;
	
	@FindBy(xpath = "//*[contains(text(),'Sign up to get Hot Deals')]/preceding::*[1]")
	public WebElement Signup_Cbx;
	
	@FindBy(xpath = "//*[@data-auid='wishListPopover_add_to_wishList_0']")
	public WebElement WishList_Pop_Item_Lnk;
	
	@FindBy(xpath="//*[@data-auid='plccCardNumber']")
	public WebElement Academy_Credit_CardNumber_txt;
	
	@FindBy(xpath="//*[text()='Cardholder Name']/following::*[1]")public WebElement CreditCardHolder_txt;
	@FindBy(xpath="//*[text()='Credit Card Number']/following::*[1]")public WebElement CreditCardNumber_txt;
	@FindBy(xpath="//*[text()='Expiration Date']/following::*[1]")public WebElement ExpirationDate_txt;
	@FindBy(xpath="//*[text()='CVV']/following::*[3]")public WebElement Cvv_txt;
	
	@FindBy(xpath="//*[@data-auid='creditCardNumber']")
	public WebElement Credit_CardNumber_txt;
	
	@FindBy(xpath="//*[@data-auid='creditCardExpiration']")
	public WebElement Credit_Card_Expriration_txt;
	
	@FindBy(xpath="//*[@data-auid='creditCardCVV']")
	public WebElement Credit_Card_Cvv_txt;
	
	@FindBy(xpath="//*[@data-auid='billingState']")
	public WebElement BillingState_txt;
	
	@FindBy(xpath="//*[@data-auid='billingFirstName']")
	public WebElement BillingFirstName_txt;
	
	@FindBy(xpath="//*[@data-auid='billingLastName']")
	public WebElement BillingLastName_txt;
	
	@FindBy(xpath="//*[@data-auid='billingAddress']")
	public WebElement BllingAddress_txt;
	
	@FindBy(xpath="//*[@data-auid='billingZipCode']")
	public WebElement BillingZipCode_txt;
	
	@FindBy(xpath="//*[@data-auid='billingCity']")
	public WebElement BillingCity_txt;
	
	@FindBy(xpath="//*[@data-auid='billingPhone']")
	public WebElement BillingPhone_txt;
	
	@FindBy(xpath="//*[@data-auid='billingEmail']")
	public WebElement BillingEmail_txt;
	
	@FindBy(xpath="//*[@data-auid='btndefaultPaymentFormSubmit']")
	public WebElement PaymentFormSubmit_btn;
	
	@FindBy(xpath = "(//*[@data-auid='btnundefined'])[2]")
	public WebElement Add_Default_Payment_Option_btn;
	
	//@FindBy(xpath = "(//*[contains(text(),'Est. Arrival')])")public WebElement txtEstArrival;//CR-RK Oct 8 KER-2912
	@FindBy(xpath = "(//*[contains(text(),'Estimated arrival')])")public WebElement txtEstArrival;//Vidya
	

	@FindBy(xpath = "(//*[@data-auid='PDP_IventoryMessage'])[2]")
	public WebElement storePickUpAvailableMessage;   //SID 10-Jan
	
	@FindBy(xpath = "(//*[@data-auid='PDP_IventoryMessage'])[1]")
	public WebElement shippingMessage;//SID 10-Jan
	
	@FindBy(xpath = "//div[@data-auid='PDP_AdBug']")//RS-currently not in use
	public WebElement shipToStoreLabel; 
	

	
	
	
	//End KER-6655 CR-MS	 
	
	/***************************** END XPAHTS **********************************/
	
	
	public boolean shippingProducts(String product) {
		boolean flag=false;
		flag = isDisplayed(getfindElementByXPath("//*[contains(@data-auid,'productCard_')]//*[text()='"+product+"']"));
		if(flag) {
		assertTrue(clickOnButton(getfindElementByXPath("//*[contains(@data-auid,'productCard_')]//*[text()='"+product+"']")));
		}else {
			System.err.println("*************PRODUCT IS NOT AVAILABLE ON 1st PAGE*************");
			flag=false;
		}
		return flag;
	}
	

}
