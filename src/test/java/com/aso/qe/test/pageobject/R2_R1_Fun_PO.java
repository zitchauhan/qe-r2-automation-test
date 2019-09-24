package com.aso.qe.test.pageobject;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;

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
	@FindBy(xpath = "//*[@data-auid='level2Category-OUTDOORS_m'] | //*[@data-auid='level2Category-Outdoors_m']") public WebElement btnOutdoorCategory_M ; //SID 4-December

	@FindBy(xpath = "//*[@data-auid='shopByCategory_tiles']| //*[@data-auid='level3Category-Shooting']")
	public WebElement secCategory_CLP;//Area L2
	@FindBy(xpath = "//*[@data-auid='level3Category-Shooting_m']")
	public WebElement secCategory_CLPMobile;//Area L2 // 5 sept CR-DPK
	
	@FindBy(xpath = "(//*[text()='Ships to Store']/..)[1]")
	public WebElement AS_productPLP1_m; //5 sept CR-DPK --- Area  SOF PL

	@FindBy(xpath = "//*[@data-auid='shopByCategory_tiles']//*[@data-auid='shopByCategory_3']")
	public WebElement productPLP;// Area L3
	@FindBy(xpath = "//*[@data-auid='go-to-Shooting_m']")
	public WebElement productPLP_m;// Area L3 // 5 sept CR-DPK

	@FindBy(xpath = "//*[@data-auid='PDP_FindAStore']")
	public WebElement lnkPickupLocation;// Area PDP //CR-Rk Oct8 KER-2869

	// End KER-3613 CR-RK
	/********SID ********************************************************************/
	 @FindBy(xpath="//*[@data-auid='level2Category-Home & Backyard_m']")public WebElement tabHomeBackyard_M; //SID 5-September
	   @FindBy(xpath="//*[@data-auid='level3Category-Grills & Outdoor Cooking_m']")public WebElement tabGrillOutdoor_M; //SID 5-September
	   @FindBy(xpath=" //*[@data-auid='go-to-Grills & Outdoor Cooking_m']")public WebElement clickGrillsOutdoorTab; //SID 5-September
	@FindBy(xpath="//*[@data-auid='level2Category-Home & Backyard']")public WebElement tabHomeBackyard; //SID 5-September
	   @FindBy(xpath="//*[@data-auid='level3Category-Grills & Outdoor Cooking']/a")public WebElement tabGrillOutdoor; //SID 5-September, modify CR-DPK 19-sept
	   @FindBy(xpath="//*[@data-auid='shopByCategory_0'] | //*[@data-auid='level4Category-Grills']")public WebElement clickGrills; //SID 5-September, modify CR-DPK 19-sept
	   @FindBy(xpath = "(//*[contains(@data-auid,'productCard_')])[5]")	public WebElement selectGrill; //SID 5-September, modify CR-DPK 19-sept
	
	 //SID 5-September
	   public void navigateToL2GrillOutdoor() throws InterruptedException {
		   if("mobile".equalsIgnoreCase(testtype)){
			    waitForElement(tabHomeBackyard_M);
				assertTrue(clickOnButton(tabHomeBackyard_M));
				waitForElement(tabGrillOutdoor_M);
				assertTrue(clickOnButton(tabGrillOutdoor_M));
				waitForElement(clickGrillsOutdoorTab);
				assertTrue(clickOnButton(clickGrillsOutdoorTab));
				Thread.sleep(Constants.thread_low);

			} else{
				
				assertTrue(clickOnButton(globalElementHeader.btnShopCategory));
				Thread.sleep(Constants.thread_low);
				Actions hover = new Actions(getDriver());
				hover.moveToElement(tabHomeBackyard).build().perform();
				Thread.sleep(Constants.thread_low);
				assertTrue(clickOnButton(tabGrillOutdoor));
				Thread.sleep(Constants.thread_low);
			}

	   }
	   /********SID ENDS ********************************************************************/
	
	
	//KER-4058 CR-RKA
	@FindBy(xpath="//*[@data-auid='shopByCategory_0']")public WebElement btnShootingCategory;
	@FindBy(xpath="//*[@data-auid='shopByCategory_0']")public WebElement ProductgunStorageSafty;
   @FindBy(xpath="(//*[contains(@data-auid,'productCard_')])[1] | //*[@data-auid='level3Category-Clothing Deals_m']")public WebElement productSelection;  //SID modified 4-December
//   @FindBy(xpath="//*[@data-auid='level3Category-Shooting_m']")public WebElement shooting_M;
   @FindBy(xpath="//*[@data-auid='level4Category-Firearms_m']")public WebElement firearms_M;
   @FindBy(xpath="//*[@data-auid='level3Category-Boating']/*[1]")public WebElement boating_txt;
   @FindBy(xpath="//*[@data-auid='shopByCategory_tiles']|//*[contains(text(),'Kayaks & Canoes')]")public WebElement kayakCanoes_txt;
   @FindBy(xpath="//*[@data-auid='productCard_1296205']|(//*[starts-with(@data-auid,'productCard_')])[1]")public WebElement intexKayak_txt;
   @FindBy(xpath="//*[@data-auid='level3Category-Boating']")public WebElement boating_txt_M;
   @FindBy(xpath="//*[@data-auid='level4Category-Kayaks & Canoes']")public WebElement kayakCanoes_txt_M;
   @FindBy(xpath="//*[@data-auid='productCard_242901']|//*[starts-with(@data-auid,'productCard_')]")public WebElement pelican_txt_M;
   
   
   
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
   @FindBy(xpath="//*[@data-auid='level3Category-Electronics_m']")public WebElement clickElectronic_M; //DPK 19-September
   @FindBy(xpath="//*[contains(@data-auid,'shopByCategory_')]//*[text()='Watches'] | //*[text()='Watches']")public WebElement tabWatches; //DPK 11-September, 19 sept
   @FindBy(xpath="//*[@data-auid=\"drawer_Men's Watches\"]")public WebElement lnkMensWatches; //DPK 11-September
   @FindBy(xpath="(//*[contains(@data-auid,'productCard_')])[5]")public WebElement selectMensWatch; //DPK 11-September, 19-sept
   
   
   
   public void navigateToL3Watches() throws InterruptedException {
	   if("mobile".equalsIgnoreCase(testtype)){
		    waitForElement(tabAccessoriesMore);
			assertTrue(clickOnButton(tabAccessoriesMore));
			waitForElement(clickElectronic_M);
			assertTrue(clickOnButton(clickElectronic_M));
			waitForElement(tabWatches);
			assertTrue(clickOnButton(tabWatches));
			waitForElement(selectMensWatch);
			assertTrue(clickOnButton(selectMensWatch));
			Thread.sleep(Constants.thread_low);

		} else{
			
			assertTrue(clickOnButton(globalElementHeader.btnShopCategory));
			waitForElement(tabAccessoriesMore);
			moveHover(tabAccessoriesMore);// CR-DPK, 19-sept
			waitForElement(tabWatches);
			assertTrue(clickOnButton(tabWatches));
			waitForElement(lnkMensWatches);
			assertTrue(clickOnButton(lnkMensWatches));
			waitForElement(selectMensWatch);
			assertTrue(clickOnButton(selectMensWatch));
			Thread.sleep(Constants.thread_low);
		}

   }
 //End KER-3166 CR-DPK
   //KER-5892  CR-RKA
   @FindBy(xpath="//*[@data-auid='btncheckout'] | //*[@data-auid='btnCheckout']")public WebElement checkoutBtnATC; //Updated by VSN on 07-12-19
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
    
    //KER-4039 CR-RKA
    @FindBy(xpath="//*[@data-auid='checkout_payment']//iframe")
    public WebElement paypalCheckoutFrame;
    
    

@FindBy(xpath = "//*[text()='Change ZIP Code']")//CR-AKK 17-sept
       public WebElement ChangeZipCode_lnk; //CR-Rk Oct8 KER-2869

@FindBy(xpath ="//*[@data-auid='FOOTER_LINK_Check Order']")//CR-AKK 17-sept
public WebElement CheckOrder_Lnk;

@FindBy(xpath ="//*[text()='NEED HELP?']/..")//CR-AKK 17-sept
public WebElement NeddHelp_M;

@FindBy(xpath ="(//*[contains(@data-auid,'productCard_')])[1]//img")//CR-AKK 25-sept
public WebElement ProdutCard_img;

@FindBy(xpath ="(//*[contains(@data-auid,'btnproductCard_')])[1]")//CR-AKK 25-sept
public WebElement QuickView_Btn;

@FindBy(xpath ="//*[@data-auid='btnAddToCart']")//CR-AKK 25-sept
public WebElement AddToCart_btn; 

//Start KER-2872 CR-DPK
@FindBy(xpath ="//*[@data-auid='filtersTitle_m']")//CR-DPK 26-sept
public WebElement DdFilter_M;

@FindBy(xpath ="//*[@data-auid='facetdrawer_drawer_Shipping & Pickup'] | //*[@data-auid='facetdrawer_drawer_Shipping & Pickup_m']")//CR-DPK 26-sept
public WebElement txtShippingPickupFilterDrawer; 

@FindBy(xpath ="//*[@data-auid='facetdrawer_drawer_Shipping & Pickup']")
public WebElement txtShippingPickupFilterDrawerPLP;   //SID 10-Jan

@FindBy(xpath = "(//*[@data-auid='PDP_FindAStore'])[2]")
public WebElement lnkPickupLocationPDP;

@FindBy(xpath ="//*[@data-auid='facetdrawer_drawer_Shipping & Pickup_m']")
public WebElement txtShippingPickupFilterDrawer_M;   //SID 10-Jan

@FindBy(xpath ="//*[@data-auid='facetdrawer_drawer_Shipping & Pickup']//i")//CR-DPK 26-sept
public WebElement txtShippingPickupFilterDrawerExpandIcon;   //SID 10-Jan


@FindBy(xpath ="//*[@data-auid='facetdrawer_drawer_Shipping & Pickup_m']//i")//CR-DPK 26-sept
public WebElement txtShippingPickupFilterDrawerExpandIcon_M;   //SID 10-Jan


@FindBy(xpath ="//*[@data-auid='drawer_Store Pickup']/input")//CR-DPK 26-sept
public WebElement selectStorePickUp;   //SID 10-Jan

@FindBy(xpath ="//*[@data-auid='drawer_Shipping']/input")//CR-DPK 26-sept
public WebElement selectShipping;   //SID 10-Jan

@FindBy(xpath ="//*[@data-auid='drawer_Store Pickup']//*[text()='Store Pickup']")//CR-DPK 26-sept
public WebElement txtStorePickUp;   //SID 10-Jan

@FindBy(xpath ="//*[@data-auid='drawer_Shipping']//*[text()='Shipping']")//CR-DPK 26-sept
public WebElement txtShipping;   //SID 10-Jan


@FindBy(xpath ="//*[@data-auid='clearAll']/parent::div//span[text()='Shipping']")//CR-DPK 26-sept
public WebElement shippingFilterApplied;   //SID 10-Jan


@FindBy(xpath ="//*[@data-auid='clearAll']/parent::div//span[text()='Store Pickup']")//CR-DPK 26-sept
public WebElement storePickUpFilterApplied;   //SID 10-Jan



@FindBy(xpath ="//*[@data-auid='drawer_Store Pickup']//a")//CR-DPK 26-sept
public WebElement changePickUpLocationPLP;   //SID 10-Jan

@FindBy(xpath ="//*[@data-auid='drawer_Store Pickup']//following-sibling::span[1]")//CR-DPK 26-sept//updated by MJR on 16/7/19
public WebElement bopisStoreNamePLP;   //SID 10-Jan

@FindBy(xpath ="(//*[@data-auid='facetdrawerundefined']/button/*/*/*[1])[2]")//CR-DPK 26-sept
public WebElement storeNameStoreModalPLP;   //SID 10-Jan


@FindBy(xpath ="//*[@id='productCardListing']/*")//CR-DPK 26-sept
public WebElement bopisNoInventoryMesssagePLP;   //SID 10-Jan




@FindBy(xpath ="//*[text()='Change Pickup Location']")//CR-DPK 26-sept
public WebElement lnkPLPChangePickupLocation;
//End KER-2872 CR-DPK

//@FindBy(xpath ="(//*[@data-auid='PDP_IventoryMessage'])[2]/following-sibling::button") 
@FindBy(xpath ="//*[@data-auid='PDP_FindAStore']")
public WebElement ChooseLocation_Lnk;  //Rishi

@FindBy(xpath ="(//*[@data-auid='PDP_IventoryMessage'])[2]")
public WebElement pdpInventoryMessage;  //SID 12-Jan

@FindBy(xpath ="(//*[@data-auid='PDP_IventoryMessage'])[2]/following-sibling::div/a")
public WebElement pdpStoreName;  //SID 12-Jan

@FindBy(xpath ="//*[@data-auid='facetdrawerundefined']//*[contains(text(),'Not Available')]")
public WebElement notAvailableMessageFindAStore;  //SID 12-Jan

@FindBy(xpath ="//*[@data-auid='btnundefined']")
public WebElement BuyNow_btn;
}
