package com.aso.qe.test.pageobject;

import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aso.qe.framework.common.CommonActionHelper;

public class SIT_ShippingMethodPageObject extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(SIT_ShippingAddressPageObject.class);
	
//	@FindBy(xpath="//*[@id='shipMeth']") public WebElement Shippingaddress;   //Commented by  SID 9-August-18
	@FindBy(xpath="(//*[@id='coSelectAddress']//*[@name='addressId']/parent::label)[1]") public WebElement Shippingaddress; //SID 9-August-18
	@FindBy(xpath="//*[@id='rwdGuestShippingContinue_Btn']") public WebElement clickContinueShippingMethod;
	@FindBy(xpath="//h1[contains(text(),'Shipping Method')]") public WebElement Shippingmethod;
//	@FindBy(xpath="//button[text()='Continue To Payment']") public WebElement btncontinuepayment;  //Commented by SID 9-August-18
	@FindBy(xpath="//*[@id='continuePaymentButton']//*[text()='Continue To Payment']") public WebElement btncontinuepayment; //SID 9-August-18
	
//	public void verifyShippingaddress() throws Exception{
//		if("mobile".equalsIgnoreCase(testtype)){
//			waitForElement(Shippingaddress);
//			assertTrue(isDisplayed(Shippingaddress));
//			logger.debug("Shippingaddress is displayed");
//		}else {
//			waitForElement(Shippingaddress);
//			assertTrue(isDisplayed(Shippingaddress));
//			logger.debug("Shippingaddress is displayed");
//		}		
//	}	
//	public void verifyShippingmethod() throws Exception{
//		if("mobile".equalsIgnoreCase(testtype)){
//			scrollPageToWebElement(Shippingmethod);
//			waitForElement(Shippingmethod);
//			assertTrue(isDisplayed(Shippingmethod));
//			logger.debug("Shippingmethod is displayed");
//		}else {
//			scrollPageToWebElement(Shippingmethod);
//			waitForElement(Shippingmethod);
//			assertTrue(isDisplayed(Shippingmethod));
//			logger.debug("Shippingmethod is displayed");
//		}		
//	}
	
	
//	 SID 11-August-18
	public void verifyShippingaddress() throws InterruptedException {
		waitForElement(Shippingaddress);
		isDisplayed(Shippingaddress);
		clickOnLink(Shippingaddress);
//		waitForPageLoad(driver);
	}

	// SID 11-August-18
	public void verifyShippingmethod() {
		waitForElement(Shippingmethod);
		isDisplayed(Shippingmethod);
	}

}
