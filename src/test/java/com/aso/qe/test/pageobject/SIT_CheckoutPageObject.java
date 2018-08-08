package com.aso.qe.test.pageobject;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.aso.qe.framework.common.CommonActionHelper;


public class SIT_CheckoutPageObject extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(SIT_CheckoutPageObject.class);
	
	@FindBy(xpath="//*[@id=\"orginalAddrChecked\"]/div/label/span[2]") public static WebElement txtAddressVerification;
	@FindBy(xpath="//*[@id='continuePaymentButton'] | //*[text()='Continue To Payment'] | //*[@id='continueChkPop']") public WebElement btnContinueCheckout ;
	
	
	
	
	public void verifyAddress(String exceptedAddTxt) throws Exception{
		String actualAddTxt = getText(txtAddressVerification);
		logger.debug("continueShoppingLinkText:: "+actualAddTxt);
		Assert.assertEquals(actualAddTxt,exceptedAddTxt );
	}

}
