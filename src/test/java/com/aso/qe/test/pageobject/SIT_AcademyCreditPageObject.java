package com.aso.qe.test.pageobject;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aso.qe.framework.common.CommonActionHelper;

public class SIT_AcademyCreditPageObject extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(SIT_AcademyCreditPageObject.class);
	
	@FindBy(xpath="//a[text()='Academy Credit Card']") public static WebElement lnkacademycredit;
	@FindBy(xpath="//strong[text()='Limited time offer.']") public static WebElement txtLimitedoffer;
	
	
	
	public void clickAcademycreditLink() throws Exception {

		assertTrue(clickOnButton(lnkacademycredit));

	}
	
	public void verifyTheAcademyCreditPage() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(isDisplayed(txtLimitedoffer));
			logger.debug("Description is displayed");
		}else {
			
			assertTrue(isDisplayed(txtLimitedoffer));
			logger.debug("Description is displayed");
		}
}
}
