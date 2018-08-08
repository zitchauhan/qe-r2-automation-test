package com.aso.qe.test.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.aso.qe.framework.common.CommonActionHelper;

public class PLP_PO extends CommonActionHelper{
	//private   final Logger logger = Logger.getLogger(PLP_PO.class);

	@FindBy(xpath="//*[@data-auid='sort_by']")public   WebElement drpdwnSortBy;
	@FindBy(xpath="//*[@data-auid='sort_by']")public   WebElement searchdrpdwnSortBy;
	@FindBy(xpath="//*[@data-auid='sort_by_m']//i")public   WebElement drpdwnSortByMobile;
	@FindBy(xpath="//*[@data-auid='sort_by_m']")public   WebElement drpdwnSortByScrollMobile;
	@FindBy(xpath="//div[@class='Select-menu-outer']//div[@aria-label='SORT_OPTIONS") public   WebElement optnSortBy;
	@FindBy(xpath="//*[@data-auid='facetdrawer_drawer_Related Categories']") public   WebElement lnkRelatedCategories;
	@FindBy(xpath="//*[@data-auid='facetdrawer_drawer_Related Categories_m']") public   WebElement lnkRelatedCategories_Mobile;
	@FindBy(xpath="//*[@data-auid=\"drawer_Men's Gloves\"]/a")public   WebElement lnkCategories_RelatedCategories;
	@FindBy(xpath="(//*[@data-auid='facetdrawer_drawer_Related Categories_m']//a)[2]") public   WebElement lnkCategories_RelatedCategories_Mobile;
	@FindBy(xpath="//*[contains(@data-component,'sectionTitle')]") public   WebElement txtSectionTitle;
	@FindBy(xpath="//*[@data-auid='shopbycategorysection']//*[@data-auid='shopByCategory_1']") public WebElement secCategory_CLP;
	@FindBy(xpath="(//*[contains(@data-auid,'productCard_')]/parent::div)[1]") 	public   WebElement productPLP1;
	@FindBy(xpath="(//*[contains(@data-auid,'productCard_')]//img)[1]") 	public   WebElement productPLP1_Mobile;

	
	//KER-224
	@FindBy(xpath="(//*[contains(@data-auid,'productCard_')])[1]/*/*/img") public WebElement productImage;
	@FindBy(xpath="(//*[contains(@data-auid,'productCard_')])[1]//*[contains(@class,'c-product__colors')]") public WebElement productColourAvailable;
	@FindBy(xpath="(//*[contains(@data-auid,'productCard_')])[1]//section")public WebElement productPrice;
	@FindBy(xpath="(//*[contains(@data-auid,'productCard_')])[1]//*[contains(@class,'c-product__title')]")public WebElement productName;
	@FindBy(xpath="(//*[contains(@aria-label,'stars out of 5')])[1]")public WebElement productRating;
	@FindBy(xpath="//*[@data-auid='facetdrawer_drawer_Ad Feature']/*[1]/*/*")public WebElement adFeaturePlus;
	@FindBy(xpath="//*[@data-auid='drawer_Hot Deal']/*[2]/*")public WebElement hotDealOption;
	@FindBy(xpath="//*[@data-auid='drawer_Clearance']/*[2]/*")public WebElement clearanceOption;
	@FindBy(xpath="//*[@data-auid='FOOTER_LINK_Gift Cards']")public WebElement giftCardLink;
	@FindBy(xpath="//*[@data-auid='btnHP_GC_BUTTON_0']")public WebElement shopGiftCardBtm;
	@FindBy(xpath="//*[@data-auid='breadCrumb_link_1_Shops']/following-sibling::*[2]")public WebElement giftCardShopBreadCrum;
	
	
	//KER-224 Mobile
	@FindBy(xpath="(//*[@class='academyicon icon-plus'])[3]")public WebElement servicesPlus_M;
	@FindBy(xpath="//*[contains(text(),'THIS IS ACADEMY')]")public WebElement footer_M;
	@FindBy(xpath="(//*[contains(@aria-label,'out of 5')])[1]")public WebElement productRating_M;
	@FindBy(xpath="//*[@data-auid='filtersTitle_m']") public WebElement filter_M;
	@FindBy(xpath="//*[@data-auid='facetdrawer_drawer_Ad Feature_m']/*[1]/*/*")public WebElement adFeaturePlus_M;
	@FindBy(xpath="//*[@data-auid='drawer_Hot Deal_m']/*[2]/*")public WebElement hotDealOption_M;
	@FindBy(xpath="//*[@data-auid='drawer_Clearance_m']/*[2]/*")public WebElement clearanceOption_M;

	
	//KER-737 start CR-AKK
	@FindBy(xpath="//a[text()='See Full Product Details']") public WebElement lnkSeeProdcutDetails;
	//KER-737 End CR-AKK
	
	public PLP_PO(WebDriver webDriver) {
		super();
	}
}
