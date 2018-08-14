package com.aso.qe.test.pageobject;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aso.qe.framework.common.CommonActionHelper;

public class SIT_ShippingAddressPageObject extends CommonActionHelper{
	private static final Logger logger = Logger.getLogger(SIT_ShippingAddressPageObject.class);
	
	@FindBy(xpath="//*[@id='coShipAddr'] | //*[@id='editAddressModalLink']") public WebElement address;
	@FindBy(xpath="//button[@class='form-continue-btn btn z-btn-checkout btn-lg btn-block'] | //*[@id='rwdGuestShippingContinue_Btn']") public WebElement btnContiuneToMethod;
	@FindBy(xpath="//h3[text()='Order Summary']") public WebElement txtordersummary;
	@FindBy(xpath="//h3/../div/ol/li/dl/dd[2]/a/div") public WebElement tltproduct;
	@FindBy(xpath="//abbr[text()='SKU:']/..") public WebElement txtskuid;
	@FindBy(xpath="//abbr[text()='Item:']/..") public WebElement txtitem;
	
	
	public void verifyShippingAddressPage() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			waitForElement(address);
			assertTrue(isDisplayed(address));
			logger.debug("Shipping Address is displayed");
		}else {
			waitForElement(address);
			assertTrue(isDisplayed(address));
			logger.debug("Shipping Address is displayed");
		}
		
		
	}
	
	
//	public void verifyOrdersummarydetails() throws Exception{
//		if("mobile".equalsIgnoreCase(testtype)){
//			scrollPageToWebElement(txtordersummary);
//			waitForElement(txtordersummary);
//			assertTrue(isDisplayed(txtordersummary));
//			logger.debug("Shipping Address is displayed");
//		}else {
//			scrollPageToWebElement(txtordersummary);
//			waitForElement(txtordersummary);
//			assertTrue(isDisplayed(txtordersummary));
//			logger.debug("Order Summary is displayed");
//			scrollPageToWebElement(tltproduct);
//			assertTrue(isDisplayed(tltproduct));
//			scrollPageToWebElement(txtskuid);
//			assertTrue(isDisplayed(txtskuid));
//			scrollPageToWebElement(txtitem);
//			assertTrue(isDisplayed(txtitem));
//			scrollPageToWebElement(txtskuid);
//			assertTrue(isDisplayed(txtskuid));
//			}
		
	public void verifyOrdersummarydetails(){
		waitForElement(txtordersummary);
		assertTrue(isDisplayed(txtordersummary));
	}

}
