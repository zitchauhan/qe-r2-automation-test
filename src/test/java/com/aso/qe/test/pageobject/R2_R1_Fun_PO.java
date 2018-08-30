package com.aso.qe.test.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aso.qe.framework.common.CommonActionHelper;

public class R2_R1_Fun_PO extends CommonActionHelper{
	
	/***************************** START XPAHTS **********************************/
	// Start KER-4249 CR-RK
	@FindBy(xpath = "//a[text()='Sign In']") //CR-SK 29 Aug
	public WebElement lnkSignInMobile;
	
	

}
