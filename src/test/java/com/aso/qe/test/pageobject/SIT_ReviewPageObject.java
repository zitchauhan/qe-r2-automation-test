package com.aso.qe.test.pageobject;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aso.qe.framework.common.CommonActionHelper;

public class SIT_ReviewPageObject extends CommonActionHelper{
	private static final Logger logger = Logger.getLogger(SIT_ReviewPageObject.class);
	
	@FindBy(xpath="//h3[text()='Order Summary']") public WebElement ordersummary;
	@FindBy(xpath="//h2[contains(text(),'Shipping Address')]") public WebElement ReviewShippingaddress;
	@FindBy(xpath="//h2[contains(text(),'Shipping Method')]") public WebElement ReviewShippingmethod;
	@FindBy(xpath="//h2[contains(text(),'Billing Address')]") public WebElement billingaddress;
	@FindBy(xpath="//h2[contains(text(),'Payment Method')]") public WebElement paymentmethod;
	@FindBy(xpath="//button[@id='placeOrder']") public WebElement btnplaceordernow;
	
	
	
	
	public void verifyOrdersummaryPage() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(isDisplayed(ordersummary));
			logger.debug("Order Summary is displayed");
		}else {
			
			assertTrue(isDisplayed(ordersummary));
			logger.debug("Order Summary is displayed");
		}
		
		}
	
	public void verifyReviewShippingaddress() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(isDisplayed(ReviewShippingaddress));
			logger.debug("Shippingaddress is displayed");
		}else {
			
			assertTrue(isDisplayed(ReviewShippingaddress));
			logger.debug("Shippingaddress is displayed");
		}
		
		
	}
	
	public void verifyReviewShippingmethod() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(isDisplayed(ReviewShippingmethod));
			logger.debug("Shippingmethod is displayed");
		}else {
			
			assertTrue(isDisplayed(ReviewShippingmethod));
			logger.debug("Shippingmethod is displayed");
		}
	}
	
	public void verifyBillingaddress() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(isDisplayed(billingaddress));
			logger.debug("Billing address is displayed");
		}else {
			
			assertTrue(isDisplayed(billingaddress));
			logger.debug("Billing address is displayed");
		}
		
		}
	
	public void verifyPaymentmethod() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(isDisplayed(paymentmethod));
			logger.debug("Payment method is displayed");
		}else {
			
			assertTrue(isDisplayed(paymentmethod));
			logger.debug("Payment method is displayed");
		}
		
		}
}
