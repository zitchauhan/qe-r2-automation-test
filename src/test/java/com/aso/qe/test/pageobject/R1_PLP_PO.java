package com.aso.qe.test.pageobject;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;

public class R1_PLP_PO extends CommonActionHelper{

	private static final Logger logger = Logger.getLogger(R1_PLP_PO.class);
	public R1_GlobalElementHeader_Home_PO globalElementHeader= PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	
	@FindBy(xpath="//*[@data-auid='sort_by']")public   WebElement drpdwnSortBy;
	@FindBy(xpath="//*[@data-auid='sort_by']")public   WebElement searchdrpdwnSortBy;
	@FindBy(xpath="//*[@data-auid='sort_by_m']//i")public   WebElement drpdwnSortByMobile;
	@FindBy(xpath="//*[@data-auid='sort_by_m']")public   WebElement drpdwnSortByScrollMobile;
	@FindBy(xpath="//div[@class='Select-menu-outer']//div[@aria-label='SORT_OPTIONS") public   WebElement optnSortBy;
	@FindBy(xpath="//*[@data-auid='facetdrawer_drawer_Related Categories']") public   WebElement lnkRelatedCategories;
	@FindBy(xpath="//*[@data-auid='facetdrawer_drawer_Related Categories_m']") public   WebElement lnkRelatedCategories_Mobile;
	@FindBy(xpath="//*[@data-auid='facetdrawer_drawer_Related Categories']//li[1]//a")public   WebElement lnkCategories_RelatedCategories;  //SID 27-August
	@FindBy(xpath="(//*[@data-auid='facetdrawer_drawer_Related Categories_m']//a)[2]") public   WebElement lnkCategories_RelatedCategories_Mobile;
	@FindBy(xpath="//*[@data-auid='sectionTitle']") public   WebElement txtSectionTitle; //SID 27-August
	@FindBy(xpath="//*[@data-auid='shopbycategorysection']//*[@data-auid='shopByCategory_0']") public WebElement secCategory_CLP;//9aug danush
	//@FindBy(xpath="(//*[contains(@data-auid,'productCard_')]/parent::div)[3]") 	public   WebElement productPLP1;/RKA 16 aug
	@FindBy(xpath="(//*[@id='productCardListing']/*/a)[2]")public   WebElement productPLP1;
	
	@FindBy(xpath="(//*[contains(@data-auid,'productCard_')]//img)[1]") 	public   WebElement productPLP1_Mobile;

	//KER-608
	@FindBy(xpath="//*[@class='price_range']") public WebElement productPriceNotVisible;  //SID 29-December
	@FindBy(xpath="(//*[@class='price_range']//*[contains(text(),'-')])[1]") public WebElement priceRange;  //SID 29-December
	
	
	
	//KER-224
	@FindBy(xpath="(//*[contains(@data-auid,'productCard_')])[1]/*/*/img") public WebElement productImage;
	@FindBy(xpath="(//*[contains(@data-auid,'productCard_')])[1]//*[contains(@class,'c-product__colors')]") public WebElement productColourAvailable;
	@FindBy(xpath="(//*[contains(@data-auid,'productCard_')])[1]//section")public WebElement productPrice;
	@FindBy(xpath="(//*[contains(@data-auid,'productCard_')])[1]//*[contains(@class,'c-product__title')]")public WebElement productName;
	@FindBy(xpath="(//*[contains(@aria-label,'stars out of 5')])[1]")public WebElement productRating;
	@FindBy(xpath="//*[@data-auid='facetdrawer_drawer_Ad Feature']/*[1]/*/*")public WebElement adFeaturePlus;
	@FindBy(xpath="//*[@data-auid='drawer_Hot Deal']/*[2]/*")public WebElement hotDealOption;
	@FindBy(xpath="//*[@data-auid='drawer_Clearance']/*[2]/*")public WebElement clearanceOption;

	@FindBy(xpath="//*[@data-auid='FOOTER_LINK_Shop Gift Cards']")public WebElement giftCardLink;

	@FindBy(xpath="(//*[@data-auid='btnHP_GC_BUTTON_0'])[1]")public WebElement shopGiftCardBtm;

	@FindBy(xpath="//span[contains(text(),'Gift Card Shop')]")public WebElement giftCardShopBreadCrum;
	@FindBy(xpath="//div[@class='css-1jc6cii']")public WebElement reviewRatingStars;
	
	
	
	@FindBy(xpath="//*[@class='col-12 col-md-4 d-flex']")public List<WebElement> totalNumberOfItemInGrid;
	@FindBy(xpath="//*[@class='col-12 col-md-4 d-flex']//*[contains(@aria-label,'stars out of 5')]/*/*[2]")public List<WebElement> totalNumberOFItemHAving_Star;
	@FindBy(xpath="(//*[@class='col-12 col-md-4 d-flex']//*[contains(@aria-label,'stars out of 5')])[1]")public WebElement firstStarRatingAvailiblity;
	
	
	
	
	//KER-224 Mobile
	@FindBy(xpath="(//*[@class='academyicon icon-plus'])[3]")public WebElement servicesPlus_M;
	@FindBy(xpath="//*[contains(text(),'THIS IS ACADEMY')]")public WebElement footer_M;
	@FindBy(xpath="(//*[contains(@aria-label,'out of 5')])[1]")public WebElement productRating_M;
	@FindBy(xpath="//*[@data-auid='filtersTitle_m']") public WebElement filter_M;
	@FindBy(xpath="//*[@data-auid='facetdrawer_drawer_Ad Feature_m']/*[1]/*/*")public WebElement adFeaturePlus_M;
	@FindBy(xpath="//*[@data-auid='drawer_Hot Deal_m']/*[2]/*")public WebElement hotDealOption_M;
	@FindBy(xpath="//*[@data-auid='drawer_Clearance_m']/*[2]/*")public WebElement clearanceOption_M;
	@FindBy(xpath="(//*[@data-auid='btnHP_GC_BUTTON_0'])[2]")public WebElement shopGiftCardBtm_M;
	
	//KER-737 start CR-AKK
	@FindBy(xpath="//a[text()='See Full Product Details']") public WebElement lnkSeeProdcutDetails;
	//KER-737 End CR-AKK
	
	//KER-5271 Start CR-AKK
//	String expctedSearchDexLinkL1="https://uat9www.academy.com/categories/mens-clothes.jsp";
//	String expctedSearchDexLinkL2="https://uat9www.academy.com/categories/mens-pants.jsp";
	@FindBy(xpath="//*[text()='Featured Categories']/parent::nav//li[1]") public WebElement clickFeaturedCategoryLink;  //SID 30-November
	
	@FindBy(xpath="//*[text()='Featured Categories']") public WebElement txtFeaturedCategories;
	@FindBy(xpath="//a[text()='Mens Clothes']") public WebElement lnkMensClothes;
	@FindBy(xpath="//a[contains(text(),'Pants')]") public WebElement lnkMensPants;
	
	
	/////////////////////////////////////Anuj//////////////////////////////////////////////
	@FindBy(xpath="//*[@data-auid='clearAll']") public WebElement lnkClearAll;
	@FindBy(xpath="//*[@data-auid='facetsModalCTAS_M']/*[text()='Clear All']") public WebElement lnkClearAllMobile;
	
	//**SID*************************************************************************//
	@FindBy(xpath="//*[@data-auid='drawer_Football Helmets_m']/a") public WebElement linkFootballHelmets;  //SID 28-August
	@FindBy(xpath="//*[@data-auid='drawer_Football Helmets']/a") public WebElement linkFootballHelmets_Desktop;  //SID 28-August
	
	//KER-621 9-August-18
		@FindBy(xpath="//*[@data-auid='facetdrawer_drawer_Ad Feature']") public WebElement clickAdFeature;
		@FindBy(xpath="//*[@data-auid='drawer_Clearance']") public WebElement btnClearance;
		@FindBy(xpath="//*[@data-auid='drawer_Online Only']") public WebElement btnOnline;
		@FindBy(xpath="//*[@data-auid='drawer_Price Drop']") public WebElement btnPriceDrop;
		//@FindBy(xpath="(//*[@id='productCardListing']//*[contains(text(),'Clearance')])[1]") public WebElement colorClearance;/RKA 17 aug
		@FindBy(xpath="(//*[@id='productCardListing']//*[contains(text(),'Clearance') and contains(@class,'badge css-10lliur eggjmyf0')])[1]") public WebElement colorClearance;
		@FindBy(xpath="(//*[@id='productCardListing']//*[contains(text(),'Online Only')])[1]") public WebElement colorOnline;
		@FindBy(xpath="(//*[@id='productCardListing']//*[contains(text(),'Price Drop')])[1]") public WebElement colorPriceDrop;
		@FindBy(xpath="(//*[@id='productCardListing']//*[contains(text(),'Ships to Store')])[1]") public WebElement colorShipToStore;
		
		
		//KER-615
		@FindBy(xpath="(//*[@data-auid='product-sort-dropdown'])[1]/*[2]/*/*/*[1]")public WebElement sortby_bestSelling;
		
	//KER-615 end
		
		
		//KER-564
				@FindBy(xpath="//*[@data-auid='facetdrawer_drawer_Color']")public WebElement colorFacet;
				@FindBy(xpath="//*[@data-auid='drawer_Black']")public WebElement blackColorFacet;
				@FindBy(xpath="//*[@data-auid='clearAll']/preceding-sibling::*")public WebElement verifyBlackFromClearAll;
				@FindBy(xpath="//*[@data-auid='listingPagination']/*/*[3]")public WebElement paginationForPage_2;
				
				@FindBy(xpath="//*[@data-auid='facetdrawer_drawer_Color_m']")public WebElement colorFacet_M;
				@FindBy(xpath="//*[@data-auid='drawer_Black_m']")public WebElement blackColorFacet_M;
			
		//KER-564
		
		//KER-2728 Anuj 14 Aug
		@FindBy(xpath="(//*[contains(@data-auid,'productCard')]//*[text()='Buy 1 Get 1 Free'])[1]")public WebElement prdctWithPromoOffer;
				
		//KER-3101 Anuj 15 Aug
		
		@FindBy(xpath="//*[@id='BVSpotlightsContainer']")public WebElement secBazaarVoiceSpotlight;
		@FindBy(xpath="//*[@id='BVSpotlightsContainer']//*[contains(@class,'chevron-right')]")public WebElement btnScrollRightBVCarousel;
		@FindBy(xpath="//*[@id='BVSpotlightsContainer']//*[contains(@class,'bv-animated bv-fadeIn')]")public WebElement secBVFadedReviews;
		
		
					
	//*****************************************************************************//
	
		//KER-4120 Start
		@FindBy(xpath="//*[@class='c-product_promomsg']")public WebElement textPromotionMsg;
		
//KER-4120 end
//*****************************************************************************//
	
	public void verifyFeaturedCategoriesText() throws Exception {
		if("mobile".equalsIgnoreCase(testtype)){
			Actions hover=new Actions(getDriver());
			hover.moveToElement(txtFeaturedCategories);
			Thread.sleep(Constants.thread_low);
		}
		else
		{
			scrollPageToWebElement(txtFeaturedCategories);
			Thread.sleep(Constants.thread_low);
		}	
	}
	
	public void clickSearchDexLink() throws Exception {
		String searchDexLinkName = clickFeaturedCategoryLink.getText();
		assertTrue(clickOnButton(clickFeaturedCategoryLink));
		System.err.println("**********Actual :: "+globalElementHeader.mobileBreadcrumbpreviousTitle.getText()+" *********Expected :: "+ searchDexLinkName+" **********" );
		assertEquals(globalElementHeader.mobileBreadcrumbpreviousTitle.getText(),searchDexLinkName);

//		assertTrue(expctedSearchDexLinkL1.equals(actualSearchDexLinkL1));
	}
	
//	public void clickMensPants() throws Exception {
//		assertTrue(clickOnButton(lnkMensPants));
//		String actualSearchDexLinkL2=getDriver().getCurrentUrl();
//		assertTrue(expctedSearchDexLinkL2.equals(actualSearchDexLinkL2));
//	}
	//KER-5271 End CR-AKK
	
	public R1_PLP_PO(WebDriver webDriver) {
		super();
		
	}
	
	//KER-3455 END
	public void clickShirtImage() throws Exception {
		assertTrue(clickOnButton(productImage));
	}
	
	//SID 9-August-18  KER-621
	public String colorHashToRGB(WebElement adFeature) {
		String[] rgb = new String[3];
		String hexCode = adFeature.getCssValue("background-color");
		logger.debug("RGB COLOR " + hexCode);
		if (hexCode.contains("rgba")) {
			rgb = hexCode.replace("rgba(", "").replace(")", "").split(",");
		} else if (hexCode.contains("rgb")) {
			rgb = hexCode.replace("rgb(", "").replace(")", "").split(",");
		} else {
			logger.debug("not either 'RGB' nor 'RGBA'");
		}
		rgb[0] = rgb[0].trim();
		int redValue = Integer.parseInt(rgb[0]);
		rgb[1] = rgb[1].trim();
		int greenValue = Integer.parseInt(rgb[1]);
		rgb[2] = rgb[2].trim();
		int blueValue = Integer.parseInt(rgb[2]);
		logger.debug("*******RED******" + redValue + "*****GREEN*******" + greenValue + "******BLUE******" + blueValue);
		if (redValue > greenValue && redValue > blueValue) {
			return "red";
		} else if (blueValue > greenValue && blueValue > redValue) {
			return "blue";
		} else {
			return "not either blue nor red";
		}
	}
	
	
	
	public void segregateTheProductHaving_Rating_and_NoRating() {
		
		int totalnumberOfGridInPLP=totalNumberOfItemInGrid.size();
		
		System.out.println(totalnumberOfGridInPLP);
	
		if(isDisplayed(firstStarRatingAvailiblity)) {
		
			int i= totalNumberOFItemHAving_Star.size();
			
			System.out.println("Total number of item having star"+i);
		
		
			int z=totalnumberOfGridInPLP -i;
	System.out.println("Total number of item NOT having star"+ z);
			
		}
	
		
	}
	
}
