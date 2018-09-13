package com.aso.qe.test.pageobject;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;

public class R2_R1_Fun_PO extends CommonActionHelper 
{

	R1_GlobalElementHeader_Home_PO globalElementHeader= PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	/***************************** START XPAHTS **********************************/
	// Start KER-4249 CR-RK
	@FindBy(xpath = "//a[text()='Sign In'] | //*[@data-auid='signInCta_m']") // CR-AAK 6 sept
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
	/********SID ********************************************************************/
	 @FindBy(xpath="//*[@data-auid='level2Category-Home & Backyard_m']")public WebElement tabHomeBackyard_M; //SID 5-September
	   @FindBy(xpath="//*[@data-auid='level3Category-Grills & Outdoor Cooking_m']")public WebElement tabGrillOutdoor_M; //SID 5-September
	   @FindBy(xpath=" //*[@data-auid='go-to-Grills & Outdoor Cooking_m']")public WebElement clickGrillsOutdoorTab; //SID 5-September
	@FindBy(xpath="//*[@data-auid='level2Category-Home & Backyard']")public WebElement tabHomeBackyard; //SID 5-September
	   @FindBy(xpath=" //*[@data-auid='level3Category-Grills & Outdoor Cooking']")public WebElement tabGrillOutdoor; //SID 5-September
	   @FindBy(xpath=" //*[@data-auid='shopByCategory_1']")public WebElement clickGrills; //SID 5-September
	   @FindBy(xpath = "(//*[contains(@data-auid,'productCard_')])[2]")	public WebElement selectGrill; //SID 5-September
	
	 //SID 5-September
	   public void navigateToL2GrillOutdoor() throws InterruptedException {
		   if("mobile".equalsIgnoreCase(testtype)){
			    waitForElement(tabHomeBackyard_M);
				assertTrue(clickOnButton(tabHomeBackyard_M));
				waitForElement(tabGrillOutdoor_M);
				assertTrue(clickOnButton(tabGrillOutdoor_M));
				waitForElement(clickGrillsOutdoorTab);
				assertTrue(clickOnButton(clickGrillsOutdoorTab));
				Thread.sleep(2000);

			} else{
				
				assertTrue(clickOnButton(globalElementHeader.btnShopCategory));
				Thread.sleep(2000);
				Actions hover = new Actions(getDriver());
				hover.moveToElement(tabHomeBackyard).build().perform();
				Thread.sleep(2000);
				assertTrue(clickOnButton(tabGrillOutdoor));
				Thread.sleep(2000);
			}

	   }
	   /********SID ENDS ********************************************************************/
	
	
	//KER-4058 CR-RKA
	@FindBy(xpath="//*[@data-auid='shopByCategory_9']")public WebElement btnShootingCategory;
	@FindBy(xpath="//*[@data-auid='shopByCategory_4']")public WebElement ProductgunStorageSafty;
   @FindBy(xpath="(//*[contains(@data-auid,'productCard_')])[1]")public WebElement productSelection;
   
   
 //KER-3093 CR-RKA
   @FindBy(xpath="//*[@data-auid='Payments']")public WebElement payment_Txt; // CR-DPK 12-sept
   @FindBy(xpath="//*[@data-auid='Payments_m']")public WebElement payment_M_Txt; // CR-DPK 12-sept
   //KER-3093 CR-RKA
   
   //KER-2939 CR-AKK
   @FindBy(xpath="//div[@id='PMC']") public WebElement Disclaimer_Txt;
   @FindBy(xpath="//span[text()='See more']") public WebElement SeeMore_lnk;
   @FindBy(xpath="//div[@id='PMC']/p") public WebElement Disclaimer_Full_Txt;
   
   
    
   @FindBy(xpath="//*[@data-auid='level3Category-Soccer']/a") public WebElement Soccer_lnk;
   @FindBy(xpath="//*[@data-auid='level3Category-Soccer_m']") public WebElement Soccer_lnk_m;
   @FindBy(xpath="//*[@data-auid='go-to-Soccer_m']/a") public WebElement Soccer_to_lnk;
   @FindBy(xpath="(//*[contains(@data-auid,'shopByCategory_')])[6]") public WebElement Socceritem_lnk;
   @FindBy(xpath="(//*[contains(@data-auid,'productCard_')])[2]") public WebElement Socceritem_Pdp_lnk;
   @FindBy(xpath="(//*[contains(@data-auid,'swatchButton-image-')])[1]") public WebElement Soccersize_btn; 
	   
 //Start KER-6655 CR-MS
   @FindBy(xpath="//*[@data-auid='btnbtnEnableBuyNow']") public WebElement EnableBuyNow_btn;
   //End KER-6655 CR-MS	
   
   
   
 //Start KER-3166 CR-DPK 
   @FindBy(xpath="//*[@data-auid='level2Category-Accessories & More'] | //*[@data-auid='level2Category-Accessories & More_m']")public WebElement tabAccessoriesMore; //DPK 11-September
   @FindBy(xpath="//*[@data-auid='go-to-Accessories & More_m']")public WebElement clickAccessoriesMore_M; //DPK 11-September
   @FindBy(xpath="//*[contains(@data-auid,'shopByCategory_')]//*[text()='Watches']")public WebElement tabWatches; //DPK 11-September
   @FindBy(xpath="//*[@data-auid=\"drawer_Men's Watches\"]")public WebElement lnkMensWatches; //DPK 11-September
   @FindBy(xpath="(//*[contains(@data-auid,'productCard_')])[6]")public WebElement selectMensWatch; //DPK 11-September
   
   
   
   public void navigateToL3Watches() throws InterruptedException {
	   if("mobile".equalsIgnoreCase(testtype)){
		    waitForElement(tabAccessoriesMore);
			assertTrue(clickOnButton(tabAccessoriesMore));
			waitForElement(clickAccessoriesMore_M);
			assertTrue(clickOnButton(clickAccessoriesMore_M));
			waitForElement(tabWatches);
			assertTrue(clickOnButton(tabWatches));
			waitForElement(selectMensWatch);
			assertTrue(clickOnButton(selectMensWatch));
			Thread.sleep(2000);

		} else{
			
			assertTrue(clickOnButton(globalElementHeader.btnShopCategory));
			waitForElement(tabAccessoriesMore);
			assertTrue(clickOnButton(tabAccessoriesMore));
			waitForElement(tabWatches);
			assertTrue(clickOnButton(tabWatches));
			waitForElement(lnkMensWatches);
			assertTrue(clickOnButton(lnkMensWatches));
			waitForElement(selectMensWatch);
			assertTrue(clickOnButton(selectMensWatch));
			Thread.sleep(2000);
		}

   }
 //End KER-3166 CR-DPK
   //KER-5892  CR-RKA
   @FindBy(xpath="//*[@data-auid='btncheckout']")public WebElement checkoutBtnATC;
   //KER-5892  CR-RKA end
   
   // Start KER-6655-MS
   @FindBy(xpath = "//*[@data-auid='shopByCategory_tiles']//*[@data-auid='shopByCategory_2']")
	public WebElement Baits_secCategory_CLP;//Area L2
   
   @FindBy(xpath = "//*[@data-auid='shopByCategory_tiles']//*[@data-auid='shopByCategory_6']")
	public WebElement Baits_productPLP;// Area L3
   
   @FindBy(xpath = "//*[@data-auid='level3Category-Fishing_m']")
  	public WebElement Baits_secCategory_CLP_m;//Area L2
   
    @FindBy(xpath = "//*[@data-auid='go-to-Fishing_m']")
  	public WebElement Baits_productPLP_m;// Area L3
    
    @FindBy(xpath = "//*[contains(text(),'Baits')]")
  	public WebElement Baits_productPLP1_m;
     
   // End KER-6655-MS
}
