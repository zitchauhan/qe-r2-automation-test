package com.aso.qe.test.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aso.qe.framework.common.CommonActionHelper;

public class SIT_GuestCheckoutPageObject extends CommonActionHelper {
	
	@FindBy(xpath="//*[@id='checkoutGuestButton']") public WebElement btncheckoutguest;
	@FindBy(xpath=" //i[@class='paypal-button']") public WebElement btnpaypalguest;
	@FindBy(xpath="//*[@id='checkoutSignInToggle']") public WebElement btnsigninguest;
	

}
