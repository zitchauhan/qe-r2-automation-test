package com.aso.qe.test.pageobject;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;

public class R1_PLCC_Mobile_PO extends CommonActionHelper{
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_SIT_PO sit_po= PageFactory.initElements(driver, R1_SIT_PO.class);
	R1_PDP_PO pdp_po= PageFactory.initElements(driver, R1_PDP_PO.class);
	R2_MyAccount_PO myAccount_po= PageFactory.initElements(driver, R2_MyAccount_PO.class);
	
	
	public void verifyPresenceOfMyAccountLinkOnMobile() throws Exception {
		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(myAccount_po.myAccount_txt_Mobile);
			logger.debug("My Account link on mobile is displayed");
		} else {
			isDisplayed(myAccount_po.myAccount_txt_Mobile);
			logger.debug("My Account link on mobile is displayed");
		}
	}

	
}
