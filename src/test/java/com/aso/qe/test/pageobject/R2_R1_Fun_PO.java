package com.aso.qe.test.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aso.qe.framework.common.CommonActionHelper;

public class R2_R1_Fun_PO extends CommonActionHelper 
{

	/***************************** START XPAHTS **********************************/
	// Start KER-4249 CR-RK
	@FindBy(xpath = "//a[text()='Sign In'] | //*[@data-auid='signInCta_m']") // CR-AAK 4 sept
	public WebElement lnkSignInMobile;

	// Start KER-3613 CR-RK
	@FindBy(xpath = "//*[@data-auid='level2Category-OUTDOORS_m'] | //*[@data-auid='level2Category-OUTDOORS'] | //*[@data-auid='level2Category-Outdoors'] | //*[@data-auid='level2Category-Outdoors_m']")
	public WebElement btnOutdoorCategory;//Area L1 // 5 sept CR-DPK

	@FindBy(xpath = "//*[@data-auid='shopByCategory_tiles']//*[@data-auid='shopByCategory_9']")
	public WebElement secCategory_CLP;//Area L2
	
	@FindBy(xpath = "//*[@data-auid='level3Category-Shooting_m']")
	public WebElement secCategory_CLPMobile;//Area L2 // 5 sept CR-DPK
	
	@FindBy(xpath = "(//*[text()='Ships to Store']/..)[1]")
	public WebElement AS_productPLP1_m; //5 sept CR-DPK --- Area  SOF PL
	
	

	@FindBy(xpath = "//*[@data-auid='shopByCategory_tiles']//*[@data-auid='shopByCategory_3']")
	public WebElement productPLP;// Area L3  
	
	@FindBy(xpath = "//*[@data-auid='go-to-Shooting_m']")
	public WebElement productPLP_m;// Area L3 // 5 sept CR-DPK

	@FindBy(xpath = "//*[text()='Choose Pickup Location']")
	public WebElement lnkPickupLocation;// Area PDP

	// End KER-3613 CR-RK
	
	
	

}
