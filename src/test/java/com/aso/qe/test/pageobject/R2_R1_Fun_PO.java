package com.aso.qe.test.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aso.qe.framework.common.CommonActionHelper;

public class R2_R1_Fun_PO extends CommonActionHelper 
{

	/***************************** START XPAHTS **********************************/
	// Start KER-4249 CR-RK
	@FindBy(xpath = "//a[text()='Sign In']") // CR-SK 29 Aug
	public WebElement lnkSignInMobile;

	// Start KER-3613 CR-RK
	@FindBy(xpath = "//*[@data-auid='level2Category-CLOTHING_m'] | //*[@data-auid='level2Category-OUTDOORS']")
	public WebElement btnOutdoorCategory;//Area L1

	@FindBy(xpath = "//*[@data-auid='shopByCategory_tiles']//*[@data-auid='shopByCategory_9']")
	public WebElement secCategory_CLP;//Area L2

	@FindBy(xpath = "//*[@data-auid='shopByCategory_tiles']//*[@data-auid='shopByCategory_3']")
	public WebElement productPLP;// Area L3

	@FindBy(xpath = "//*[text()='Choose Pickup Location']")
	public WebElement lnkPickupLocation;// Area PDP

	// End KER-3613 CR-RK

}
