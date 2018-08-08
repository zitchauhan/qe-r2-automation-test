package com.aso.qe.test.pageobject;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aso.qe.framework.common.CommonActionHelper;

public class SIT_ShippingMethodPageObject extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(SIT_ShippingAddressPageObject.class);
	
	@FindBy(xpath="//*[@id='shipMeth']") public WebElement Shippingaddress;
	@FindBy(xpath="//h1[contains(text(),'Shipping Method')]") public WebElement Shippingmethod;
	@FindBy(xpath="//button[text()='Continue To Payment']") public WebElement btncontinuepayment;
	
	
	public void verifyShippingaddress() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(isDisplayed(Shippingaddress));
			logger.debug("Shippingaddress is displayed");
		}else {
			
			assertTrue(isDisplayed(Shippingaddress));
			logger.debug("Shippingaddress is displayed");
		}
		
		
	}
	
	public void verifyShippingmethod() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(isDisplayed(Shippingmethod));
			logger.debug("Shippingmethod is displayed");
		}else {
			
			assertTrue(isDisplayed(Shippingmethod));
			logger.debug("Shippingmethod is displayed");
		}
		
		
	}
	
	

}
