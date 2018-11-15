package com.aso.qe.test.pageobject;

import static org.junit.Assert.assertTrue;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.stepdefinition.web.Common_Web_SD;

public class R1_GlobalElementHeader_Home_PO extends CommonActionHelper 
{
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_SIT_PO sit_po= PageFactory.initElements(driver, R1_SIT_PO.class);
	R1_PDP_PO pdp_po= PageFactory.initElements(driver, R1_PDP_PO.class);
	
	String timeStamp = new SimpleDateFormat("MM.dd.HH.mm.ss").format(new Date());
	@FindBy(xpath="//*[@data-auid=\"level3Category-Men's Clothing\"]|//*[@data-auid=\"level3Category-Men's Clothing_m\"] | //*[@data-auid='level3Category-Mens_m'] | //*[@data-auid='level3Category-Mens']/a ") public WebElement btnMens_Clothing_Shop;
	@FindBy(xpath="//*[@data-auid='logo']//img")public WebElement imgAcademyLogo;
	@FindBy(xpath="//*[@data-auid='logo_m']//img")public WebElement imgAcademyLogo_m;//danush
	@FindBy(xpath="//*[@data-auid='search-clear-button_m']|//*[@data-auid='search-clear-button']") public  WebElement btnSearchLens;
	@FindBy(xpath="//*[@data-auid='expand-search_m']") public WebElement btnExpandSearchLensInSearchPage;
	@FindBy(xpath="//*[@data-auid='weeklyAds_m']") public  WebElement txtWeeklyADBurgerMenu;
	@FindBy(xpath="(//*[text()='Select Circulars from Academy Sports + Outdoors'])[1]") public  WebElement txtWeeklyADPopUp_D; //SID 7-September
	@FindBy(xpath="(//*[text()='Select Circulars from Academy Sports + Outdoors'])[1]/parent::*//tr[1]") public  WebElement txtWeeklyADPopUpClick_D; //SID 7-September
	@FindBy(xpath="//*[@id='flyer-runs-container'] | //*[@id='other_flyer_runs']") public  WebElement txtWeeklyADPopUp_M; //SID Modified 14-Nov
	@FindBy(xpath="//*[@id='flyer-runs-container']/div[1] | //*[@id='other_flyer_runs']//tr[1]") public  WebElement txtWeeklyADPopUpClick_M; //SID Modified 14-Nov
	@FindBy(xpath="//*[@data-auid='show_wish_list_btn']")public WebElement selectWishlist;  //SID 14-Nov
	
	


	@FindBy(xpath="//*[@data-auid='hamburgerMenuToggleBtn_m']") public WebElement btnBurgerMenu;
	@FindBy(xpath="//*[@data-auid='hamburgerMenuToggleBtn_m']")  public WebElement btnXBurgerMenu;
	@FindBy(xpath="//*[@data-auid='level1Category-SHOP']") public WebElement btnShopCategory;
	@FindBy(xpath="//*[@data-auid='level2Category-Clothing_m']/span | //*[@data-auid='level2Category-CLOTHING_m']/span | //*[@data-auid='level2Category-CLOTHING']")public WebElement btnClothingCategory; //SID Modified 14-Nov
	@FindBy(xpath="//*[@data-auid=\"level3Category-Boys' Clothing\"]/a | //*[@data-auid=\"level3Category-Boys' Clothing_m\"]")public WebElement btnMen_Clothing_Shop;//UAT9
	@FindBy(xpath="//*[@data-auid=\"level3Category-Boys' Clothing_m\"]")public WebElement btnMen_Clothing_Shop_M; //SID 14-Nov
	@FindBy(xpath="//*[@data-auid=\"level3Category-Boys' Clothing\"]//*[@data-auid='level4Category-Shirts']|//*[@data-auid=\"level3Category-Boys' Clothing\"]//*[@data-auid='level4Category-Shorts']|//*[@data-auid=\"level4Category-Shirts_m\"] |//*[@data-auid=\"level4Category-Shorts_m\"]")public WebElement btnMensShirt_Men_Clothing_Shop;
	@FindBy(xpath="//*[@data-auid=\"level4Category-Shirts_m\"] |//*[@data-auid=\"level4Category-Shorts_m\"]")public WebElement btnMensShirt_Men_Clothing_Shop_M;  //SID 14-Nov
	@FindBy(xpath="//*[@data-auid='go-to-Womens_m']/a | //*[@data-auid=\"go-to-Women's Clothing_m\"]/a")public WebElement burgerMenu_GoToWomen_btn; //CR-SK, 11 Sep
	@FindBy(xpath="//*[@data-auid='go-to-School Uniforms_m']/a")public WebElement burgerMenu_GoToSchoolUniform_btn; //CR-SK, 12 Sep
	@FindBy(xpath="//*[@data-auid=\"level3Category-Men's Clothing_m\"]")public WebElement btnMenClothingShop_M; //SID modified 14-Nov
	@FindBy(xpath="//*[@data-auid=\"level3Category-Men's Clothing_m\"] | //*[@data-auid=\"level3Category-Men's Clothing\"]/a | //*[@data-auid='level3Category-Mens']/a")public WebElement btnMenClothingShop; //3Sep
	@FindBy(xpath="//*[@data-auid='level3Category-Womens']/a | //*[@data-auid=\"level3Category-Women's Clothing\"]/a")public WebElement btnWommenClothingShop; //3Sep
//	@FindBy(xpath="//*[@data-auid=\"level3Category-Men's Clothing_m\"]| //*[@data-auid=\"level3Category-Men's Clothing\"]/a ")public WebElement btnMenClothingShop;
	@FindBy(xpath="(//*[contains(@data-auid,'productCard_')]//*[contains(@class,'c-product__description')])[2]")public WebElement imgMensShortShirt; 
	@FindBy(xpath="//div[contains(@class,'breadCrumbComponent')]//span[@class='line-separator']//following-sibling::span//preceding-sibling::a") public WebElement lnkMensShirts;
	@FindBy(xpath="((//span[@class='line-separator'])[3]/following::span)[1]") public WebElement lnkMensShirtsnotclickable;
	//@FindBy(xpath="//*[@data-auid='breadcrumb_m'] | //a[text()=\"Father's Day Gifts\"]") public WebElement lnkMensClothing;
	@FindBy(xpath="//*[@data-auid='BreadCrumb_Academy']//a | //span[text()=\"Father's Day Gifts\"]") public WebElement lnkMensClothing; 

	@FindBy(xpath="//span[@class='facet-trigger']")public WebElement btnFilterFacet;
	@FindBy(xpath="//*[@data-auid='findAStore_m']")public WebElement btnFindAStoreBurgerMenu;
	@FindBy(xpath="//*[@data-auid='signInCta_m']") public  WebElement btnMyAccountBurgerMenu;
	@FindBy(xpath="//*[@data-auid='level1Category-SHOP_m']")public WebElement btnSHOPBurgerMenu;
	@FindBy(xpath="//*[@data-auid='level1Category-TRENDING_m'] | //*[@data-auid='level1Category-EXPERT ADVICE_m']") public  WebElement btnTRENDINGBurgerMenu; // SID Modified 14-Nov
	@FindBy(xpath="//*[@data-auid='level1Category-DEALS_m']") public  WebElement btnDEALSBurgerMenu;
	@FindBy(xpath="//*[@data-auid='logo_m']//img") public WebElement imgAcademyLogoMobile;
	//	@FindBy(xpath="//*[@data-auid='logo_m']/*/*/*") public WebElement imgAcademyLogoMobile;

	@FindBys( {
		@FindBy(linkText="Academy Sports Outdoors Brand Logo") 
	} )
	public List<WebElement> academyLogoList;
	@FindBy(xpath="//*[@id='newUserSubmit']")public WebElement btnSignUp;
	@FindBy(xpath="//div[contains(@class,'mobile-search')]") public WebElement ovlySearchTextBarMobile;
	@FindBy(xpath="//*[@data-auid='go-to-CLOTHING_m']/a | //*[@data-auid='go-to-Clothing_m']/a") public WebElement txtToNavigateClothingBurgerMenuMobile;
	@FindBy(xpath="//*[contains(@data-auid,'go-to-Men')]/a | //*[@data-auid=\"go-to-Boys' Clothing_m\"]/a" ) public WebElement txtToNavigateMensBurgerMenuMobile;
	@FindBy(xpath="//*[@data-auid=\"level3Category-Men's Clothing_m\"]" ) public WebElement txtToNavigateMensCategoryMobile;
	@FindBy(xpath="//*[@data-auid=\"level3Category-Women's Clothing_m\"]" ) public WebElement txtToNavigateWoensCategoryMobile;
	@FindBy(xpath="//*[@data-auid=\"logo\"]") public WebElement academyLogo;
	@FindBy(xpath="//*[text()='THIS IS ACADEMY']") public WebElement txtFooterACADEMY;	
	@FindBy(xpath="//*[@data-auid='FOOTER_LINK_4https://www.instagram.com/academy/']") public WebElement iconinstagram;
	@FindBy(xpath="//*[@data-auid='FOOTER_LINK_3https://www.youtube.com/user/academydotcom']") public WebElement iconyoutube;
	@FindBy(xpath="//*[@data-auid='FOOTER_LINK_2https://www.pinterest.com/academy/m']") public WebElement iconpinterest;
	@FindBy(xpath="//*[@data-auid='FOOTER_LINK_1https://twitter.com/academy']") public WebElement icontwitter;
	@FindBy(xpath="//*[@data-auid='FOOTER_LINK_0https://www.facebook.com/Academy/']") public WebElement iconfacebook;
	@FindBy(xpath="//*[@data-auid='FOOTER_LINK_Chat Now'] | //*[@data-auid='FOOTER_LINK_CHAT NOW']") public WebElement lnkchatnow;
	@FindBy(xpath="//*[@data-auid='FOOTER_LINK_Sign Up For More Deals']| //*[@data-auid='FOOTER_LINK_SIGN UP FOR MORE DEALS']") public WebElement lnkSIGNUPFORMOREDEALS;
	@FindBy(xpath="//*[@data-auid='FOOTER_LINK_Find A Store'] | //*[@data-auid='FOOTER_LINK_FIND A STORE']") public WebElement lnkfindastore;
	@FindBy(xpath="//*[@data-auid='FOOTER_LINK_Store Services']") public WebElement lnkStoreServices;
	@FindBy(xpath="(//*[contains(@data-auid,'FOOTER_LINK_C')])") public WebElement lnkchatnow_m;//danush 31st july
	@FindBy(xpath="//*[@data-auid='FOOTER_LINK_Check Gift Card Balance") public WebElement lnkCheckGiftCardBalance;//Anuj 09-Aug
	@FindBy(xpath="//*[@data-auid='FOOTER_LINK_Academy Credit Card']") public WebElement lnkAcademyCreditCards;
	@FindBy(xpath="//*[@data-auid='FOOTER_LINK_Shop Gift Cards']") public WebElement lnkgiftcards;
	@FindBy(xpath="//*[@data-auid='FOOTER_LINK_Customer Care']") public WebElement lnkcustomercare;
	@FindBy(xpath="//*[@data-auid='FOOTER_LINK_Contact Us']") public WebElement lnkcontactus;
	@FindBy(xpath="//*[@data-auid='FOOTER_LINK_Rebates']") public WebElement lnkrebates;
	@FindBy(xpath="//*[@data-auid='FOOTER_LINK_Product Recalls']") public WebElement lnkproductrecall;
	@FindBy(xpath="//*[@data-auid='FOOTER_LINK_Return Policy']") public WebElement lnkreturnpolicy;
	@FindBy(xpath="//*[@data-auid='FOOTER_LINK_Check Order']") public WebElement lnkcheckorder;
	@FindBy(xpath="//*[@data-auid='FOOTER_LINK_Giving Back']") public WebElement lnkgivingback;
	@FindBy(xpath="//*[@data-auid='FOOTER_LINK_Investors']") public WebElement lnkInvestors;//Anuj 09-Aug
	@FindBy(xpath="//*[@data-auid='FOOTER_LINK_Press Releases']") public WebElement lnkPressReleases;
	@FindBy(xpath="//*[@data-auid='FOOTER_LINK_Careers']") public WebElement lnkcareers;
	@FindBy(xpath="//*[@data-auid='FOOTER_LINK_Our History']") public WebElement lnkourhistory;
	@FindBy(xpath="//*[@data-auid='miniCart']") public WebElement iconcart;//danush
	@FindBy(xpath="//*[@data-auid='miniCart_m']") public WebElement iconcart_m;//danush
	@FindBy(xpath="//*[@data-auid='search-container']//input") public WebElement txtSearchBox;
	@FindBy(xpath="//*[@data-auid='level1Category-DEALS']") public  WebElement btnDEALS;
	@FindBy(xpath="//*[@data-auid='level1Category-DEALS_m']") public  WebElement btnDEALS_m;
	@FindBy(xpath="//*[@data-auid='level1Category-TRENDING']") public  WebElement btnTRENDING;
	@FindBy(xpath="//*[@data-auid='findAStore']")public WebElement btnFindAStore;
	@FindBy(xpath="//*[@data-auid='WeeklyAds']")  public WebElement txtWeeklyAD;
	@FindBy(xpath="//*[@id='react-tabs-0']") public WebElement tabdetailsandspecs;
	@FindBy(xpath="//*[@id='react-tabs-2']") public WebElement tabreviews;
	@FindBy(xpath="//*[@id='react-tabs-4']") public WebElement tabQandA;
	@FindBy(xpath="//html//div[@class='product-details-content']/div[1]/div[1]") public WebElement expandall_details_specs;
	@FindBy(xpath="//html//div[@class='product-details-content']/div[2]/div[1]") public WebElement expandall_reviews;
	@FindBy(xpath="//html//div[@class='product-details-content']/div[3]/div[1]") public WebElement expandall_QA;
	@FindBy(xpath="//div[@class='drawerContainer']/div[2]/div[1]") public WebElement expandall_Academy;	
	@FindBy(xpath ="//input[@type='email'][@class='fields email required z-form-control m-b1 m-rauto m-lauto show-block']") public WebElement enteremail;
	@FindBy(xpath ="//input[@name='postal_code']") public WebElement enterpostal;
	@FindBy(xpath ="//input[@value='SUBMIT'][@class='z-btn z-btn-ghost-white m-rauto m-lauto show-block']") public WebElement clicksubmit;
	@FindBy(xpath ="//div[@class='leftNav leftColumn']")public WebElement myAccountMenu;
	@FindBy(xpath="//*[@id='rh-signin-link-xs-signout']")public WebElement btnsignout_mobile;
	@FindBy(xpath="//*[@id='rh-signin-inout-btn']")public WebElement btnsignout;
	@FindBy(xpath="//*[@id='myAccountQuickLink']")	public WebElement accountSummaryFromMyAccount;
	@FindBy(xpath="//*[@id='rh-signin-link-xs']")public WebElement accountSummaryFromMyAccount_Mobile;
	@FindBy(xpath="//*[@data-auid='Wish List']")public WebElement wishListFromMyAccount;// SID 22-August
	@FindBy(xpath = "//*[@data-auid='Wish List_m']")public WebElement wishListFromMyAccount_Mobile;
	@FindBy(xpath ="//*[@id ='rh-signin-link-in'] | //*[contains(text(),'MY ACCOUNT MENU')]")public WebElement myAccountDropDown;//danush
	@FindBy(xpath="//*[@id='btnForgotPassword']")public WebElement btnForgotPasswordSubmit;
	@FindBy(xpath="//*[@id='forgot-email']")public WebElement txtForgotEmail;
	@FindBy(xpath = "//a[@class='z-link btnforgot-pw-container']")public WebElement lnkForgotYourPassword;
	@FindBy(xpath="//*[@id='newUserSubmit']")public WebElement btnSignupbutton;
	@FindBy(xpath="//*[@id='passwordRegisterField']")public WebElement txtPasswordForSignUp;
	@FindBy(xpath="//*[@id='emailRegisterField']")public WebElement txtEmail;
	@FindBy(xpath = "//input[@name='logonPasswordVerify']")public WebElement txtConfirmPassword;
	@FindBy(xpath = "//input[@name='lastName']")public WebElement txtLastName;
	@FindBy(xpath = "//input[@name='firstName']")public WebElement txtFirstName;
	@FindBy(xpath="//*[@id='signup-link-from-login']")public WebElement lnkSignUp;
	@FindBy(xpath = "//*[@id='logonSubmit'] |//*[@data-auid='btnemail-signin-button']")public WebElement btnSubmit;
	@FindBy(xpath = "//input[@type='password']")	public WebElement txtPassword;
	@FindBy(xpath = "//input[@type='email']")	public WebElement txtEmailAddress;
	@FindBy(xpath = "//*[@data-auid='signInCta']") public WebElement btnSignIn;
	@FindBy(xpath="//*[@id='rh-signin-link-xs']")public WebElement btnSignIn_Mobile;
	@FindBy(xpath="//*[@id='logonErrorMessage']")public WebElement errormessage;
	@FindBy(xpath="//*[@id='logonIdError']")public WebElement errormessage_email;
	@FindBy(xpath="//*[@id='logonPasswordError']")public WebElement errormessage_password;
	@FindBy(xpath = "//h1[@id='landingTitle']")	public WebElement accountSummaryTxt;
	@FindBy(xpath = "//h1[@id='landingTitle']")public WebElement personalInformationTxt;
	@FindBy(xpath = "//h1[@id='landingTitle']")public WebElement addressBookTxt;
	@FindBy(xpath = "//h1[@id='landingTitle']")public WebElement wishlistsTxt;
	@FindBy(xpath = "//a[@id='personalInformation']")public WebElement lnkPersonalInformation;
	@FindBy(xpath = "//a[@id='addressBook']")public WebElement lnkAddressBookInformation;
	@FindBy(xpath = "//a[@id='wishLists']")public WebElement lnkwishlistsInformation;

	//KER-3964
	@FindBy(xpath="//a[@tabindex='0'][contains(text(),'Next >')]") public WebElement btnNext;
	@FindBy(xpath="//*[contains(text(),'Clear All')]") public WebElement btnClearAll;
	@FindBy(xpath="//*[@data-auid='search-container']//*[@class='search-button search-submit']") public WebElement btnGO;	
	@FindBy(xpath="//*[@data-auid='search-clear-button_m']/span") public WebElement btnGO_mobile;
	@FindBy(xpath="(//*[@data-component='searchResult']//span)[1]") public WebElement nulldescription;
	@FindBy(xpath="//*[@data-auid='shopbycategorysection']") public WebElement categorydescription;
	@FindBy(xpath="//h1") public WebElement description;//30th july danush
	@FindBy(xpath="//span[text()=\"Magellan Outdoors Men's  Eagle Pass Deluxe  Long Sleeve Shirt\"]") public WebElement productnotclickable;;
	@FindBy(xpath="//div[@aria-label='breadcrumb navigation region']//span//span/span[not(contains(@class,'line-separator'))]") public WebElement txtproductselected; //SID 20-August
	@FindBy(xpath="//*[@data-auid='search-input_m'] | //*[@data-auid='search_m']") public WebElement txtSearchBox_mobile;//danush
	@FindBy(xpath=" //*[@data-auid='FOOTER_LINK_0_Privacy Policy']") public WebElement lnkprivatepolicy;
	@FindBy(xpath="//*[@data-auid='FOOTER_LINK_1_Terms & Conditions']") public WebElement lnktermsandconditions;
	@FindBy(xpath="//*[contains(@data-auid,'FOOTER_LINK_2_California Proposition 65')]") public WebElement lnklegalpolicy;
	@FindBy(xpath="//*[text()='SERVICES']//parent::div//span") public WebElement expandall_Academy_services;	
	@FindBy(xpath="//*[text()='NEED HELP?']//parent::div//span") public WebElement expandall_Academy_needhelp;
	@FindBy(xpath="//*[text()='THIS IS ACADEMY']//parent::div//span") public WebElement expandall_Academy_academy;
	@FindBy(xpath="(//*[@data-component='heroImage'])[4]") public WebElement scrollingForFooterExpanding;
   @FindBy(xpath="//*[@data-auid='expand-search_m']/*|//*[@data-auid='search-clear-button_m']/span")public WebElement  magnify_M;
	//KER-3274
	@FindBy(xpath="(//*[text()='You might try:'])[1]") public WebElement labelforsearchMobile;
	@FindBy(xpath="(//*[text()='You might try:'])[2]") public WebElement labelforsearch;
	@FindBy(xpath="//*[text()='112766238']") public WebElement skuID;
	@FindBy(xpath="(//*[contains(text(),'You might try:')])[2]| //*[@data-component='searchResult']//span") public WebElement txtPleaseTryAnotherSearchDesktop;//Anuj 09 Aug
	@FindBy(xpath="(//*[contains(text(),'You might try:')])[1]| //*[@data-component='searchResult']//span") public WebElement txtPleaseTryAnotherSearchMobile;//Anuj 09 Aug

	@FindBy(xpath="//div[@data-component='searchResult']//span/b") public WebElement characterSearchLimitTitle;
	@FindBy(xpath="//div[contains(text(),'Top Results for')]") public WebElement characterSearhTitle;
	@FindBy(xpath="(//strong[contains(text(),'sh')])[1]") WebElement listsuggestion_productcard;

	//Rashmi created below elements for sanity script related
	@FindBy(xpath="//*[@data-auid='shopbycategorysection']") public WebElement ContainerL1;
	@FindBy(xpath="//div[@data-component='productGrid']") public WebElement ContainerL2;
	@FindBy(xpath="//div[@data-component='productGrid']") public WebElement ContainerL3;
	@FindBy(xpath="//*[@data-auid='product-listing']") public WebElement txtSearchResults;
	@FindBy(xpath="//*[@data-auid='shopByCategory_tiles']//*[@data-auid='shopByCategory_0']") public WebElement CategoryL1; //Anuj 3 Aug
	//	@FindBy(xpath="//*[@data-auid='shopByCategory_tiles']//*[@data-auid='shopByCategory_0']") public WebElement CategoryL2; //Anuj 3 Aug
	@FindBy(xpath="(//*[contains(@data-auid,'productCard_')]//img)[1]")  public WebElement PLPProduct;
	@FindBy(xpath="//div[@data-component='searchResult']") public WebElement txtSearchPage;
	@FindBy(linkText="Academy") public WebElement lnkbreadcrumbtext;
	@FindBy(xpath="//div[@class='breadCrumbComponent offset-sm-1 px-4']") public WebElement lnkbreadcrumb;
	@FindBy(xpath="//*[text()='< Prev']") public WebElement lnkL2Pagination;
	@FindBy(xpath="//*[text()='Next >']") public WebElement lnkNextPagePagination;
	@FindBy(xpath="//*[@aria-label='Page 2']") public WebElement lnkPagination2;
	@FindBy(xpath="//*[@aria-label='Page 3']") public WebElement lnkPagination3;
	@FindBy(xpath="//*[@data-auid='search-container']//*[@class='search-button search-submit']") public WebElement btnSearch_Desktop;

	//Rashmi changed end.

	//KER-3270 Ak start
	@FindBy(xpath="//div[@class='container']//b[1]") public WebElement searchTitle;
	@FindBy(xpath="//span[text()='Skechers']") public WebElement specificSearchTitle;
	@FindBy(xpath="//div[@class='container css-tnijvs']/h2[text()='Skechers']") public WebElement specificSearchTitle_M;
	@FindBy(xpath="//span[text()='Water Parks & Slides']") public WebElement productName;
	@FindBy(xpath="//div[@class='container css-tnijvs']//h2") public WebElement productName_M;
	@FindBy(xpath="(//*[contains(text(),'Frisbee')])[1]")	public WebElement txtSearchFrisbeeProduct;

	//KER-3238 Ak start
	@FindBy(xpath="//*[@data-auid='level3Category-Shooting']/a") public WebElement txtShooting;
	@FindBy(xpath="//*[@data-auid='level2Category-Outdoors_m']") public WebElement txtOutDoor_M;
	@FindBy(xpath="//*[@data-auid='level2Category-Outdoors']") public WebElement txtOutDoor;
	@FindBy(xpath="//*[@data-auid='level3Category-Shooting_m']") public WebElement txtShooting_M;
	@FindBy(xpath="//*[@data-auid='go-to-Shooting_m']/a") public WebElement txtShootingNavg_M;
	@FindBy(xpath="//h1[contains(text(),'Sightmark Ultra Shot Plus and 3x Tactical Magnifier Set')]") public WebElement txtimageShooting;
	//KER-3238 Ak end

	//KER-2339
	@FindBy(xpath="//*[text()='Clothing']") public WebElement titleclothing;
	@FindBy(xpath="//*[text()='Mens Clothing']") public WebElement titleMensclothing;
	@FindBy(xpath="//*[text()='Mens Shirts']") public WebElement titleMensShirtclothing;

	//SID ADDED ********************************************************************************************************//
	@FindBy(xpath="//*[@data-auid='level3Category-Carhartt Brand Shop']/span[contains(text(),'Carhartt Brand Shop')] | (//*[contains(@data-auid,'level3Category')])[1] ") public WebElement lnkBrandNike;
	@FindBy(xpath="//*[@data-auid='level3Category-Carhartt Brand Shop_m'] ") public WebElement btnBrand; 
	@FindBy(xpath="//*[@data-auid='breadcrumb_m']") public WebElement mobileBreadcrumb; 
	@FindBy(xpath="//*[@data-component='sectionTitle']//h1") public WebElement mobileBreadcrumbpreviousTitle;
	@FindBy(xpath="//*[@data-auid='level2Category-Brands']") public WebElement btnBrandCategory;
	@FindBy(xpath="//*[@data-auid='level2Category-Brands_m']/parent::li") public WebElement btnBrandCategoryTab;
	@FindBy(xpath="//*[@data-auid='breadCrumb_link_0_Academy']") public WebElement anchorAcademy; 
	@FindBy(xpath="//*[@id='headerForScroll']//span[contains(text(),'Find a Store')]") public WebElement txtFindAStore; 
	@FindBy(xpath="//*[@data-auid='findAStore_m']//span[contains(text(),'Find a Store')]") public WebElement txtFindAStoreMobile;
	@FindBy(xpath="//*[@tabindex='-1']/div[@data-auid='find-a-store-modal']") public WebElement findaStoreModal;
	@FindBy(xpath="//*[@data-auid='find-a-store']/input[@placeholder='Enter Zip Code or City, State']") public WebElement enterPincode; 
	@FindBy(xpath="//*[@data-auid='submit-zip-code']/span") public WebElement clickSearchIcon;
	@FindBy(xpath="//*[@tabindex='-1']/div[@data-auid='find-a-store-modal']//a[contains(text(),'Store Details')]") public List<WebElement> storeResults; 
	@FindBy(xpath="//div[@id='selectedStoreDetails']//a[@id='storeAddress']/span[@itemprop='addressLocality']") public WebElement storeAddressLocality;
	@FindBy(xpath="//div[@id='selectedStoreDetails']//a[@id='storeAddress']/span[@itemprop='addressRegion']") public WebElement storeAddressRegion; 
	@FindBy(xpath="//div[@id='selectedStoreDetails']//h1") public WebElement storeName; 
	@FindBy(xpath="//ol[@class='storeLocatorBreadcrumb z-list-inline']/li[4]//span") public WebElement storeAddressLocalityBreadcrumb;
	@FindBy(xpath="//ol[@class='storeLocatorBreadcrumb z-list-inline']/li[3]//span") public WebElement storeAddressRegionBreadcrumb; 
	@FindBy(xpath="//ol[@class='storeLocatorBreadcrumb z-list-inline']/li[5]//span[@itemprop='name']") public WebElement storeNameBreadcrumb; 
	@FindBy(xpath="//ol[@class='storeLocatorBreadcrumb z-list-inline']/li[1]//span") public WebElement academyBreadcrumb;
	@FindBy(xpath="//ol[@class='storeLocatorBreadcrumb z-list-inline']/li[2]//span") public WebElement storeLocatorBreadcrumb;
	@FindBy(xpath="(//*[@data-auid='breadCrumb_link_0_Academy']//ancestor::span/span)[2]") public WebElement productNameBreadcrumb; //updated by Anuj 08 oct
	@FindBy(xpath="//*[@data-auid='search-clear-button_m']") public WebElement clickSearchbtn;
	@FindBy(xpath="((//span[@class='line-separator'])[2]/following::span)[1]") public WebElement lnkL2PageNotClickable;
	@FindBy(xpath="((//span[@class='line-separator'])[3]/following::span)[1]") public WebElement lnkL3PageNotClickable;
	@FindBy(xpath="((//span[@class='line-separator'])[1]/following::span)[1]") public WebElement lnkL1PageNotClickable;
	@FindBy(xpath="//div[contains(@class,'breadCrumbComponent')]//span[@class='line-separator']//following-sibling::span//preceding-sibling::a") public WebElement lnkBreadcrumbClickable;
	//SID --KER-1400 9-August-18
	@FindBy(xpath="//*[contains(text(),'GET MORE DEALS')]") public WebElement lnkSIGNUPFORMOREDEALSMODAL;
	@FindBy(xpath="//*[@id='email-address']") public WebElement lnkSIGNUPFORMOREDEALSEMAIL;
	@FindBy(xpath="//*[@id='zip-code']") public WebElement lnkSIGNUPFORMOREDEALSZIPCODE;
	@FindBy(xpath="//*[@data-auid='btnemail-signup-button']") public WebElement lnkSIGNUPFORMOREDEALSSUBMIT;
	@FindBy(xpath="(//*[@data-auid='email-signup-sucess-modal']//*[local-name()='svg'])[2]") public WebElement lnkSIGNUPFORMOREDEALSSUCCESSMESSAGE_D;
	@FindBy(xpath="(//*[@data-auid='email-signup-sucess-modal']//*[local-name()='svg'])[1]") public WebElement lnkSIGNUPFORMOREDEALSSUCCESSMESSAGE_M;
	@FindBy(xpath="//*[@data-component='footer']//a") public List<WebElement> footerLinks; //10 Aug 
	@FindBy(xpath="//*[@data-auid='email-signup-sucess-modal']//span") public WebElement btnCloseCrossSuccess;//Anuj 13Aug
	
	//Automation Sanity  SID 20-August
	@FindBy(xpath="//*[contains(text(),'Welcome,')]") public WebElement txtWelcome;
	// SID 20-August Breadcrumb update
	@FindBy(xpath="(//div[contains(@class,'breadCrumbComponent')]//*[4]//a)[1]") public WebElement pdpLastActiveBraedcrumb;
	@FindBy(xpath="(//div[contains(@class,'breadCrumbComponent')]//*[3]//a)[1]") public WebElement l3LastActiveBreadcrumb;
	@FindBy(xpath="(//div[contains(@class,'breadCrumbComponent')]//*[2]//a)[1]") public WebElement l2LastActiveBreadcrumb;
	@FindBy(xpath="(//div[contains(@class,'breadCrumbComponent')]//*[1]//a)[1]") public WebElement l1LastActiveBreadcrumb;
	@FindBy(xpath="//*[@data-auid='level2Category-Outdoors']") public WebElement btnOutdoorsCategory;
	@FindBy(xpath="//*[@data-auid='level3Category-Automotive & Towing']/a ")public WebElement btnAutomotiveTowing_Shop;//UAT9
	@FindBy(xpath="(//*[contains(@data-auid,'level3Category')])[1] ")public WebElement clickDealItem;//SID 13-September
	
	
	//**SID END*********************************************************************************************************************************************
	//@FindBy(xpath="//*[(text()=\"Men's Shirts\")]") public WebElement txtMensShrit;/RKA 22 aug
	@FindBy(xpath="//*[@data-auid='sectionTitle']")public WebElement txtMensShrit;
	@FindBy(xpath="//div[contains(@class,'row')]//following-sibling::div[@class='mb-3']") public WebElement lnkL2PaginationMobile;
	@FindBy(xpath="//*[@data-auid='myAccountCta']") public WebElement btnMyAccount;
	@FindBy(xpath="//*[@data-auid='myAccountCta_m']") public WebElement btnMyAccountMobile;
	@FindBy(xpath="//*[@data-auid='Sign Out']") public WebElement btnSignOut;
	@FindBy(xpath="//*[@area-role='breadcrumb']") public WebElement lnkBreadcrumbLast;
	@FindBy(xpath = "//*[@data-auid='signInCta_m']") public WebElement btnSignIn_mobile;
	@FindBy(xpath = "//*[@data-auid='Sign Out_m']") public WebElement btnSignOut_M;
	@FindBy(xpath="//*[@data-auid='level1Category-SHOP_m']//span[contains(@class,'minus')]") public WebElement btnSHOPBurgerMenuMinusIcon;
	//KER-262 Start 

	@FindBy(xpath="//*[@data-auid='findAStore']/*[2]")public WebElement hourOfOperationATHeader;
	@FindBy(xpath="//*[@data-auid='find-a-store-modal']//*[contains(text(),'Find a Store')]") public WebElement txtFindAsTorePopUP;  //SID 24-August
    @FindBy(xpath="//*[@data-auid='find-a-store-modal']//*[@data-auid='find-a-store']")public WebElement searchboxFindAsTorePopUp; //SID 24-August
	@FindBy(xpath="//*[@data-auid='findAStore']/*[1]/*[2]")public WebElement verifyFindStoreAfteLogin;
	@FindBy(xpath="//*[@data-auid='findAStore']//*[contains(text(),'change')]/parent::*/child::*[contains(@class,'icon-pencil')]")public WebElement changeicon;// SID 30-August
	@FindBy(xpath="//*[@data-auid='myAccountCta_m']")public WebElement btnMyAccountInWeeklyAds;

	@FindBy(xpath="//*[contains(text(),'THIS IS ACADEMY')]")public WebElement expandAcademyPlus_M;
	@FindBy(xpath="//*[@data-auid='FOOTER_LINK_Press Releases']")public WebElement pressRelease_M;
	@FindBy(xpath="//*[@data-auid='FOOTER_LINK_Investors']")public WebElement inventors_M;
	@FindBy(xpath="//*[@data-auid='FOOTER_LINK_Shop Gift Cards']")public WebElement shopGiftCards_M;
	@FindBy(xpath="//*[@data-auid='FOOTER_LINK_Product Recalls']")public WebElement productRecalls_M;

	@FindBy(xpath="//*[@id='logonSubmit'] | //*[@data-auid='btnemail-signin-button']")public WebElement btmSignIn;  //SID modified 14-Nov
	@FindBy(xpath="//*[@id='signup-link-from-login'] | //*[@data-auid='signUp_btn']")public WebElement linkSignUP; //SID modified 14-Nov

	//@FindBy(xpath="(//*[contains(text(),'Account Summary')])[3]")public WebElement btmkAccountSummary;/RKA 17 aug
	@FindBy(xpath="//h1[contains(text(),'Account Summary')]")public WebElement btmkAccountSummary;
	@FindBy(xpath="(//*[contains(text(),'Account Summary')])[3]")public WebElement btmkAccountSummary_M;
	//@FindBy(xpath="//*[@data-auid='myAccountCta_m']")public WebElement myAccountLink;
	@FindBy(xpath="//*[@id='logonSubmit']") public WebElement signInBtm_M;
	@FindBy(xpath="//*[@id='signup-link-from-login']")public WebElement signUpText_M;
	@FindBy(xpath="//*[@data-auid='search-input_m']")public WebElement searchBox_M;
	//@FindBy(xpath="//*[@data-auid='search-container_m']")public WebElement searchBox;

	@FindBy(xpath="//*[@data-auid='autoSuggestions_pant']/*") public WebElement verifyPantInSearch_M;
	@FindBy(xpath="//*[@data-auid='search-clear-button_m']") public WebElement searchbtn_M;
	@FindBy(xpath="//*[contains(text(),'Results for ')]/*")public WebElement searchResultText_M;
	@FindBy(xpath="//*[@data-auid='expand-search_m']")public WebElement magnifying_M;

	//KER-4041
	@FindBy(xpath="//*[@id='scrollTopBtn']") public WebElement autoscroll;
	@FindBy(xpath="//*[text()='Featured Categories'] | (//*[@data-component='heroImage'])[2]") public WebElement preFooterScroll; //4 Aug Anuj

	//KER-1915 Start CR-AKK
	@FindBy(xpath="//button[@data-auid='btnwishListPopover_createList']")  public WebElement btnCreateList;
	@FindBy(xpath="//*[@id='createWishListInputError']") public WebElement addWishListError;
	//KER-1915 End CR-AKK
	//KER-1401 RKA Start
	
	@FindBy(xpath="//*[contains(@data-auid,'level3Category-Men')]/*[1]")public WebElement TxtMenShoeL2;
	@FindBy(xpath="//*[@data-auid='sectionTitle']")public WebElement txtPageHeaderAsMenShoe;
	//@FindBy(xpath="//*[contains(@data-auid,'breadCrumb_link_1_')]//ancestor::span//following-sibling::span[@itemprop='itemListElement']//span[@itemprop='name']")public WebElement txtBreadCrumbMenShoe;?RKA 21 aug
	
	@FindBy(xpath="//*[contains(@data-auid,'breadCrumb_link_1_')]/../../following::*[contains(text(),'Shoes')]")public WebElement txtBreadCrumbMenShoe;
	
	//KER-1401 END
	
	//KER-2993 Anuj 14 Aug
	@FindBy(xpath="//*[@data-component='rebates']|//*[contains(@class,'rebate-item')]")public WebElement secRebatesDetails;
	@FindBy(xpath="//*[contains(@data-auid,\"level3Category-Men's Clothing\")]//*[@data-auid='level4Category-Shirts']") public WebElement lnkPromoAvailable;
	@FindBy(xpath="//*[@data-auid=\"level4Category-Shirts_m\"]") public WebElement  btnNavigateToShirtMobile; 
	@FindBy(xpath="//*[@data-auid=\"level3Category-Men's Clothing_m\"]") public WebElement  btnMensClothingMobile; 
			
	
	
	//KER-3276 Start
	@FindBy(xpath="(//*[contains(@data-auid,'visual_guided_')])[1]//img")public WebElement imgAutosuggest_HomePage;
	@FindBy(xpath="(//*[contains(@data-auid,'visual_guided_')])[1]//figcaption[1]")public WebElement productNameAutoSuggest_HomePage;
	@FindBy(xpath="(//*[contains(@data-auid,'visual_guided_')])[1]//figcaption[2]/*")public WebElement productPriceAutoSuggest_HomePage;
	@FindBy(xpath="//*[@data-auid='PDP_ProductName']")public WebElement txtProductNameOnPDP;
	@FindBy(xpath="//*[@data-auid='shopByCategory_tiles']/*//*[contains(@class,'o-copy__')]")public List<WebElement> txtProductCatagoryinPLP;
	//KER-3276 END
	public void accountSummaryDeatils(String exceptedAccountSummaryTxt) throws Exception {
		String actualAccountSummaryTxt = getText(accountSummaryTxt);
		logger.debug("accountSummaryTxt:: " + actualAccountSummaryTxt);
		Assert.assertEquals(actualAccountSummaryTxt, exceptedAccountSummaryTxt);
	}

	public void validationmessage(String exceptederrormessage) throws Exception {
		String actualexceptederrormessageTxt = getText(errormessage);
		logger.debug("errormessage:: " + actualexceptederrormessageTxt);
		Assert.assertEquals(actualexceptederrormessageTxt, exceptederrormessage);
	}

	public void validationmessage_email(String exceptederrormessage) throws Exception {
		String actualexceptederrormessageTxt = getText(errormessage_email);
		logger.debug("errormessage:: " + actualexceptederrormessageTxt);
		Assert.assertEquals(actualexceptederrormessageTxt, exceptederrormessage);
	}
	public void validationmessage_password(String exceptederrormessage) throws Exception {
		String actualexceptederrormessageTxt = getText(errormessage_password);
		logger.debug("errormessage:: " + actualexceptederrormessageTxt);
		Assert.assertEquals(actualexceptederrormessageTxt, exceptederrormessage);
	}

	public void personalInformationDeatils(String exceptedPersonalInformationTxt) throws Exception {
		String actualPersonalInformationTxt = getText(personalInformationTxt);
		logger.debug("personalInformationTxt:: " + actualPersonalInformationTxt);
		Assert.assertEquals(actualPersonalInformationTxt, exceptedPersonalInformationTxt);
	}

	public void addressBookDeatils(String exceptedAddressBookTxt) throws Exception {
		String actualAddressBookTxt = getText(addressBookTxt);
		logger.debug("addressbookTxt:: " + actualAddressBookTxt);
		Assert.assertEquals(actualAddressBookTxt, exceptedAddressBookTxt);
	}

	public void wishlistsDeatils(String exceptedWishlistsTxt) throws Exception {
		String actualWishlistsTxt = getText(wishlistsTxt);
		logger.debug("WishListsTxt:: " + actualWishlistsTxt);
		Assert.assertEquals(actualWishlistsTxt, exceptedWishlistsTxt);
	}

	public void clickMyAccountDropDown() throws Exception {

		assertTrue(clickOnButton(myAccountDropDown));

	}
	public void clickSignoutFromMyAccount() throws Exception {

		assertTrue(clickOnButton(btnsignout));

	}

	public void clickSignoutFromMyAccount_Mobile() throws Exception {

		assertTrue(clickOnButton(btnsignout_mobile));

	}
	public void clickOnWishListsFromMyAccount() throws Exception {

		assertTrue(clickOnButton(wishListFromMyAccount));

	}
	public void clickOnWishListsFromMyAccount_Mobile() throws Exception {

		assertTrue(clickOnButton(wishListFromMyAccount_Mobile));

	}
	public void clickOnAccountSummaryFromMyAccount() throws Exception {

		assertTrue(clickOnButton(accountSummaryFromMyAccount));

	}
	public void clickOnAccountSummaryFromMyAccount_mobile() throws Exception {

		assertTrue(clickOnButton(accountSummaryFromMyAccount_Mobile));

	}
	public void clickSignInLink() throws Exception {

		assertTrue(clickOnButton(btnSignIn));


	}

	public void clickSignInLink_mobile() throws Exception {


		assertTrue(clickOnButton(btnSignIn_Mobile));
		/*setInputText(enteremail, "rashika.kowtikwar@gmail.com");
			setInputText(enterpostal, "560035");
			WebElement webElement = driver.findElementByXPath("//input[@type='submit']");
			webElement.sendKeys(Keys.TAB);
			//assertTrue(clickOnButton(clicksubmit));
			assertTrue(clickOnButton(btnBurgerMenu));
			assertTrue(clickOnButton(btnSignIn_Mobile));*/

	}


	public void clickForgotYourPassword() throws Exception {

		assertTrue(clickOnButton(lnkForgotYourPassword));

	}

	public void clickSignupLink() throws Exception {

		assertTrue(clickOnButton(lnkSignUp));

	}

	public void enterInvalidEmailAddressandPassword() throws Exception {

		setInputText(txtEmailAddress, "rashika@gmail.com");
		setInputText(txtPassword, "rashika@123");

	}

	public void enterEmptyEmailAddress() throws Exception {
		System.out.println("before88888888888888888888888");
		setInputText(txtEmailAddress, "");
		//setInputText(txtPassword, "");
		System.out.println("after88888888");
	}

	public void enterEmailAddressandPassword(String arg1, String arg2) throws Exception 
	{

		setInputText(txtEmailAddress, webPropHelper.getTestDataProperty(arg1));
		setInputText(txtPassword, webPropHelper.getTestDataProperty(arg2));

		} 
	/*public void enterEmailAddressandPassword() throws Exception {

		setInputText(txtEmailAddress,"mondayacademy@mailinator.com");
		setInputText(txtPassword, "pass1234");

	}*/

	public void enterEmailAddress() throws Exception {

		setInputText(txtEmailAddress, "mondayacademy@academy.com");
		//setInputText(txtPassword, "rashika@123");

	}
	public void enterEmailAddress_signup() throws Exception {

		UUID uuid = UUID.randomUUID();
		String randomUUIDString = uuid.toString();

		String txtemailaddress_random="abc"+randomUUIDString+"@gmail.com";

		setInputText(txtEmail, txtemailaddress_random);

	}
	public void enterForgotEmail() throws Exception {

		setInputText(txtForgotEmail, "qaz2@gmail.com");

	}

	public void enterEmail() throws Exception {

		setInputText(txtEmail, timeStamp+"@gmail.com");

	}

	public void enterFirstName() throws Exception {

		setInputText(txtFirstName, timeStamp);


	}

	public void enterLastName() throws Exception {

		setInputText(txtLastName, timeStamp);


	}

	public void enterPassword() throws Exception {

		setInputText(txtPassword, "rashika@123");


	}

	public void enterPasswordForSignUp() throws Exception {

		setInputText(txtPasswordForSignUp, "abcd@123");


	}

	public void enterConfirmPassword() throws Exception {

		setInputText(txtConfirmPassword, "abcd@123");

	}

	public void enterInvalidPassword() throws Exception {

		setInputText(txtPassword, "123456");


	}

	public void enterEmptyPassword() throws Exception {

		setInputText(txtPassword, "");


	}

	public void clickSubmitButton() throws Exception 
	{

		assertTrue(clickOnButton(btnSubmit));
		//waitForElement(txtWelcome);

	}

	public void clickPersonalInformationLink() throws Exception {


		assertTrue(clickOnButton(lnkPersonalInformation));

	}
	public void clickPersonalInformationLink_Mobile() throws Exception {

		assertTrue(clickOnButton(myAccountMenu));
		assertTrue(clickOnButton(lnkPersonalInformation));

	}
	public void clickAddressBookLink() throws Exception {

		assertTrue(clickOnButton(lnkAddressBookInformation));

	}
	public void clickAddressBookLink_Mobile() throws Exception {
		assertTrue(clickOnButton(myAccountMenu));
		assertTrue(clickOnButton(lnkAddressBookInformation));

	}
	public void clickWishlistsLink() throws Exception {

		assertTrue(clickOnButton(lnkwishlistsInformation));

	}

	public void clickWishlistsLink_Mobile() throws Exception {
		assertTrue(clickOnButton(myAccountMenu));
		assertTrue(clickOnButton(lnkwishlistsInformation));

	}

	public void clickForgotPasswordSubmitButton() throws Exception {


		assertTrue(clickOnButton(btnForgotPasswordSubmit));

	}

	public void clickOnSignUpButton() throws Exception {


		assertTrue(clickOnButton(btnSignupbutton));

	}

	public void verifypresenceofsigninlink() throws Exception {
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(btnSignIn);
			assertTrue(isClickable(btnSignIn_Mobile));
			logger.debug("our history link is not displayed");
		}else {
			isDisplayed(btnSignIn);
			assertTrue(isClickable(btnSignIn));
			logger.debug("our history link is displayed++++++++++++++++++++++++==");
		}
	}
	public void clickASO_LOGO() throws Exception{

		if("mobile".equalsIgnoreCase(testtype)){	
			isDisplayed(imgAcademyLogoMobile);
			assertTrue(isClickable(imgAcademyLogoMobile));
		}else {
			isDisplayed(imgAcademyLogo);
			assertTrue(isClickable(imgAcademyLogo));
		}
	}

	public void verifypresenceoffacebookicon() throws Exception {
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(iconfacebook);
			assertTrue(isClickable(iconfacebook));
			logger.debug("our history link is not displayed");
		}else {
			isDisplayed(iconfacebook);
			assertTrue(isClickable(iconfacebook));
			logger.debug("our history link is displayed++++++++++++++++++++++++==");
		}
	}
	public void verifypresenceofpinteresticon() throws Exception {
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(iconpinterest);
			assertTrue(isClickable(iconpinterest));
			logger.debug("our history link is not displayed");
		}else {
			isDisplayed(iconpinterest);
			assertTrue(isClickable(iconpinterest));
			logger.debug("our history link is displayed++++++++++++++++++++++++==");
		}
	}

	public void verifypresenceoftwittericon() throws Exception {
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(icontwitter);
			assertTrue(isClickable(icontwitter));
			logger.debug("our history link is not displayed");
		}else {
			isDisplayed(icontwitter);
			assertTrue(isClickable(icontwitter));
			logger.debug("our history link is displayed++++++++++++++++++++++++==");
		}
	}
	public void verifypresenceofyoutubeicon() throws Exception {
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(iconinstagram);
			assertTrue(isClickable(iconinstagram));
			logger.debug("our history link is not displayed");
		}else {
			isDisplayed(iconinstagram);
			assertTrue(isClickable(iconinstagram));
			logger.debug("our history link is displayed++++++++++++++++++++++++==");
		}
	}
	public void verifypresenceofinstagramicon() throws Exception {
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(iconinstagram);
			assertTrue(isClickable(iconinstagram));
			logger.debug("our history link is not displayed");
		}else {
			isDisplayed(iconinstagram);
			assertTrue(isClickable(iconinstagram));
			logger.debug("our history link is displayed++++++++++++++++++++++++==");
		}
	}
	/*public GlobalElementHeader_HomePO(WebDriver driver) {

	}*/
	//		PageFactory.initElements(driver, this);


	public void navigateToPLPFromHomePageViaSearch() throws Exception{

		setInputText(txtSearchBox, "Men's Shoes");
		assertTrue(clickOnButton(btnGO));
		//Assert.assertEquals("validating the PLP PAGE","Men's Shoes");//Framework Method need to be used
	}

	public void navigateToPLPViaClick_Desktop() throws Exception
	{
		{
			Thread.sleep(Constants.thread_low);
			assertTrue(clickOnButton(btnShopCategory));
			Thread.sleep(Constants.thread_low);
			//Actions hover = new Actions(getDriver());
			//moveHover(btnClothingCategory);
			Thread.sleep(Constants.thread_low);
			assertTrue(clickOnButton(btnMensShirt_Men_Clothing_Shop));
			Thread.sleep(Constants.thread_low);
			//assertTrue(clickOnButton(r2SanityPo.AS_productPLP1));
		
		}
	}

	public void navigateToL2ViaClick_Desktop() throws Exception{

		assertTrue(clickOnButton(btnShopCategory));
		Actions hover = new Actions(getDriver());
		hover.moveToElement(btnClothingCategory).build().perform();
		assertTrue(clickOnButton(btnMensShirt_Men_Clothing_Shop));
	}

	public void navigateToPLPViaClick_Mobile() throws Exception
	{
		/*clickOnBurgerMenu();
		Thread.sleep(Constants.thread_low);
		assertTrue(clickOnButton(btnClothingCategory));
		Thread.sleep(Constants.thread_low);
		assertTrue(clickOnButton(btnMen_Clothing_Shop));
		Thread.sleep(Constants.thread_low);
		assertTrue(clickOnButton(btnMensShirt_Men_Clothing_Shop));
		Thread.sleep(Constants.thread_low);*/
		
		
		if("mobile".equalsIgnoreCase(testtype))
		{
			assertTrue(clickOnButton(btnBurgerMenu));
			Thread.sleep(Constants.thread_low);
			assertTrue(clickOnButton(btnClothingCategory)); //4Sep
			Thread.sleep(Constants.thread_low);
			assertTrue(clickOnButton(btnMenClothingShop_M)); //SID 14-Nov
			Thread.sleep(Constants.thread_low);
			assertTrue(clickOnButton(Common_Web_SD.globalElementHeader.txtToNavigateMensBurgerMenuMobile));
			Thread.sleep(Constants.thread_low);
			
		}
		else
		{
			Thread.sleep(Constants.thread_low);
			assertTrue(clickOnButton(btnShopCategory));
			Thread.sleep(Constants.thread_low);
			//Actions hover = new Actions(getDriver());
			moveHover(btnClothingCategory);
			Thread.sleep(Constants.thread_low);
			assertTrue(clickOnButton(btnMenClothingShop));
			Thread.sleep(Constants.thread_low);
			//assertTrue(clickOnButton(r2SanityPo.AS_productPLP1));
		
		}
	}

	public void navigateToL2PageViaClick_Mobile() throws Exception
	{
		if("mobile".equalsIgnoreCase(testtype))
		{
			assertTrue(clickOnButton(btnBurgerMenu));
			Thread.sleep(Constants.thread_low);
			assertTrue(clickOnButton(btnClothingCategory)); //4Sep
			Thread.sleep(Constants.thread_low);
			assertTrue(clickOnButton(btnMenClothingShop));
			Thread.sleep(Constants.thread_low);
			assertTrue(clickOnButton(Common_Web_SD.globalElementHeader.txtToNavigateMensBurgerMenuMobile));
			Thread.sleep(Constants.thread_low);
			
		}
		else
		{
			Thread.sleep(Constants.thread_low);
			assertTrue(clickOnButton(btnShopCategory));
			Thread.sleep(Constants.thread_low);
			//Actions hover = new Actions(getDriver());
			moveHover(btnClothingCategory);
			Thread.sleep(Constants.thread_low);
			assertTrue(clickOnButton(btnMenClothingShop));
			Thread.sleep(Constants.thread_low);
			//assertTrue(clickOnButton(r2SanityPo.AS_productPLP1));
		
		}
	}

	public void validateASO_LOGOPresence() throws Exception{
		//scrollPageToWebElement(imgAcademyLogo);
		if(isDisplayed(imgAcademyLogo))
			logger.debug("Academy logo is displayed");	
		else
			logger.debug("Academy logo is NOT displayed");	


	}
	public void clickASO_LOGOAndValidateHomePage() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(clickOnButton(imgAcademyLogo_m));
			logger.debug("Logo is clicked");
		}else {

			assertTrue(clickOnButton(imgAcademyLogo));
			logger.debug("Logo is clicked");
			//assertEquals("http://35.202.244.154/", getCurrentPageURL());//30th july danush
		}


	}

	public void validatingWeeklyAdAndFindStore() throws Exception{

		//	Assert.assertEquals("Validating the presence for txt Weekly Ad");//Framework Method need to be used
		//	Assert.assertEquals("Validating the presence for txt Find A Store");//Framework Method need to be used
	}

	public void validatingTxtSearchBox(){
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(isDisplayed(txtSearchBox_mobile));
			logger.debug("txtSearchBox is displayed");
		}else {
			assertTrue(isDisplayed(txtSearchBox));
			logger.debug("txtSearchBox is displayed");
		}
		//	Assert.assertEquals("Validating the presence for txtSearch Box Open");//Framework Method need to be used

	}

	
	public void entertheSearchData() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			Actions actions = new Actions(driver);
			actions.moveToElement(txtSearchBox_mobile);
			Thread.sleep(Constants.thread_medium);
			actions.click();
			actions.sendKeys("Columbia Sportswear Men's Dorado CVO PFG Boat Shoes");
			actions.build().perform();
		}else {

			Actions actions = new Actions(driver);
			actions.moveToElement(txtSearchBox);
			Thread.sleep(Constants.thread_medium);
			actions.click();
			//actions.sendKeys("Magellan Outdoors Men's Eagle Pass Deluxe Long Sleeve Shirt");
			actions.sendKeys("Columbia Sportswear Men's Dorado CVO PFG Boat Shoes");
			actions.build().perform();

		}

	}



	public void entertheData() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			//			Actions actions = new Actions(driver);
			//			actions.moveToElement(txtSearchBox_mobile);
			//			actions.click();
			//			actions.sendKeys("Clothing");
			//			Thread.sleep(2000);
			//			actions.build().perform();
			Thread.sleep(Constants.thread_medium);
			txtSearchBox_mobile.sendKeys("Clothing");

		}else {

			Actions actions = new Actions(driver);
			actions.moveToElement(txtSearchBox);
			Thread.sleep(Constants.thread_medium);
			actions.click();
			actions.sendKeys("Clothing");
			actions.build().perform();

		}

	}
	public void entertheSearchDataForPagination() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			Actions actions = new Actions(driver);
			actions.moveToElement(txtSearchBox_mobile);
			actions.click();
			actions.sendKeys("Running Shoes");
			Thread.sleep(Constants.thread_low);
			actions.build().perform();
			assertTrue(clickOnButton(btnGO_mobile));
			//scrollPageToWebElement(btnNext);
			assertTrue(clickOnButton(btnNext));
			//scrollPageToWebElement(btnNext);
			assertTrue(clickOnButton(btnNext));
		}else {

			Actions actions = new Actions(driver);
			actions.moveToElement(txtSearchBox);
			Thread.sleep(Constants.thread_medium);
			actions.click();
			actions.sendKeys("Running Shoes");
			actions.build().perform();
			assertTrue(clickOnButton(btnGO));
			scrollPageToWebElement(btnNext);
			assertTrue(clickOnButton(btnNext));
			scrollPageToWebElement(btnNext);
			assertTrue(clickOnButton(btnNext));
		}

	}
	public void entertheNullData() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			Actions actions = new Actions(driver);
			actions.moveToElement(txtSearchBox_mobile);
			actions.click();
			Thread.sleep(Constants.thread_medium);
			actions.sendKeys("null");
			actions.build().perform();
		}else {

			Actions actions = new Actions(driver);
			actions.moveToElement(txtSearchBox);
			Thread.sleep(Constants.thread_medium);
			actions.click();
			actions.sendKeys("null");
			actions.build().perform();

		}

	}
	public void entertheColor() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			Actions actions = new Actions(driver);
			actions.moveToElement(txtSearchBox_mobile);
			Thread.sleep(Constants.thread_medium);
			actions.click();
			actions.sendKeys("red");
			actions.build().perform();
		}else {

			Actions actions = new Actions(driver);
			actions.moveToElement(txtSearchBox);
			Thread.sleep(Constants.thread_medium);
			actions.click();
			actions.sendKeys("red");
			actions.build().perform();

		}

	}
	public void clickOnButton() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			Thread.sleep(Constants.thread_low);
			assertTrue(clickOnButton(btnGO_mobile));
			logger.debug("btnGO is clicked");
		}else {

			assertTrue(clickOnButton(btnGO));
			logger.debug("btnGO is clicked");
		}

	}

	public void clickClearAllButton() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			clickOnButton(txtSearchBox_mobile);
			waitForElement(btnClearAll);
			assertTrue(clickOnButton(btnClearAll));
			logger.debug("btnClearAll is clicked");
		}else {
			clickOnButton(txtSearchBox);
			waitForElement(btnClearAll);
			assertTrue(clickOnButton(btnClearAll));
			logger.debug("btnClearAll is clicked");
		}

	}
	
	//SID 10-September
	public void verifyThePDPPage() throws Exception{
		String currentURL = getCurrentPageURL();
		if(currentURL.contains("pdp")) 
		{
			logger.debug("User is successfully navigated to PDP page with URL :: " + currentURL  );
		}
		else 
		{
			logger.debug("User is not able to navigate to PDP instead navigated to URL :: " + currentURL  );
		}
		if ("mobile".equalsIgnoreCase(testtype)) 
		{
			assertTrue(isDisplayed(pdp_po.imgProductMainMixedMedia_m));
		} 
		else 
		{
			assertTrue(isDisplayed(pdp_po.imgProductMainMixedMedia));
		}

	}



	public void clickOnSuggestion(String searchItemTxt) throws Exception{


		String searchItemXpath = "//a[contains(@data-auid,'autoSuggestions_"+searchItemTxt+"')]";
		System.out.println("&&&&&&&&&&**********************searchItemXpath:: "+searchItemXpath);
		assertTrue(clickOnButton(getfindElementByXPath(searchItemXpath)));
		logger.debug("searchitem is clicked");
	}


	@FindBy(xpath="//*[contains(@class,'w-100 search-term-wrap row no-gutter')]//li//a")  List<WebElement> listsuggestion;  
	@FindBy(xpath="//*[contains(@class,'position-absolute search-flyout search-mega-flyout')]")  WebElement suggestionFlyout; 
	

//SID MODIFIED 14-August
	public boolean verifySuggestionPage(String inputSearchTxt) throws Exception{
		boolean flag = false;
		if("mobile".equalsIgnoreCase(testtype))
		{
			Thread.sleep(Constants.thread_low); //danush
			txtSearchBox_mobile.clear();
			Actions actions = new Actions(driver);
			actions.moveToElement(txtSearchBox_mobile);
			actions.click();
			actions.sendKeys(inputSearchTxt);
			actions.build().perform();
			flag = isDisplayed(suggestionFlyout);
			if(flag==true) {
				for(WebElement txt: listsuggestion){
					waitForElement(txt);
					if(txt != null && txt.getText().toLowerCase().contains(inputSearchTxt.toLowerCase())){
						flag=txt.getText().toLowerCase().contains(inputSearchTxt.toLowerCase());
					}
				}
				}
				else {
					flag=false;
				}
		}else {
			txtSearchBox.clear();//anil
			Actions actions = new Actions(driver);
			actions.moveToElement(txtSearchBox);
			actions.click();
			actions.sendKeys(inputSearchTxt);
			Thread.sleep(Constants.thread_low); //anil
			actions.build().perform();
			flag = isDisplayed(suggestionFlyout);
			if(flag==true) {
			for(WebElement txt: listsuggestion){
				waitForElement(txt);
				if(txt != null && txt.getText().toLowerCase().contains(inputSearchTxt.toLowerCase())){
					flag=txt.getText().toLowerCase().contains(inputSearchTxt.toLowerCase());
				}
			}
		
			}
			else {
				flag=false;
			}
		}
		
		return flag;
	}

	public boolean verifyDuplicateSuggestion(String inputSearchTxt) throws Exception{
		boolean flag = false;
		if("mobile".equalsIgnoreCase(testtype)){
			HashMap<String, String> seachMap = new HashMap<String, String>();
			Actions actions = new Actions(driver);
			actions.moveToElement(txtSearchBox_mobile);
			actions.click();
			actions.sendKeys(inputSearchTxt);
			Thread.sleep(Constants.thread_low); 
			actions.build().perform();
			Thread.sleep(Constants.thread_low); 
			flag = isDisplayed(suggestionFlyout);
			if(flag==true) {
			for(WebElement txt: listsuggestion){
				if(txt != null ){
					if(seachMap.containsKey(txt.getText())) {
						flag = false;
						break;
					}else {
						seachMap.put(txt.getText(), txt.getText());
						flag = true;
					}

				}
			}
			}
		}else {
			HashMap<String, String> seachMap = new HashMap<String, String>();
			Actions actions = new Actions(driver);
			actions.moveToElement(txtSearchBox);
			Thread.sleep(Constants.thread_medium);
			actions.click();
			actions.sendKeys(inputSearchTxt);
			actions.build().perform();
			flag = isDisplayed(suggestionFlyout);
			if(flag==true) {
			for(WebElement txt: listsuggestion){
				if(txt != null ){
					if(seachMap.containsKey(txt.getText())) {
						flag = false;
						break;
					}else {
						seachMap.put(txt.getText(), txt.getText());
						flag = true;
					}

				}
			}
			}
		}
		return flag;	
	}
	public void verifyTheCLPPage() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(isDisplayed(categorydescription));
			logger.debug("categorydescription is displayed");
		}else {

			assertTrue(isDisplayed(categorydescription));
			logger.debug("categorydescription is displayed");
		}

	}
	public void verifyTheNullPage() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(nulldescription.getText().contains("We couldn't find anything for"));
			logger.debug("Description is displayed");
		}else {

			assertTrue(nulldescription.getText().contains("We couldn't find anything for"));
			logger.debug("Description is displayed");
		}
	}
	
	public void verifyTheColorPage() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(isDisplayed(nulldescription));
			logger.debug("Description is displayed");
		}else {

			assertTrue(isDisplayed(nulldescription));
			logger.debug("Description is displayed");
		}

	}
	public void validatingAddtoCartIcon() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(iconcart);
			logger.debug("iconcart is not displayed");
		}else {
			isDisplayed(iconcart);
			logger.debug("iconcart is displayed");
		}}

	public void clickexpandall_academy() throws Exception{
		Thread.sleep(Constants.thread_low);
		assertTrue(clickOnButton(expandall_Academy_academy));
		Thread.sleep(Constants.thread_low);

	}
	public void validatingOurhistory() throws Exception{

		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(lnkourhistory);
			assertTrue(isClickable(lnkourhistory));
			logger.debug("our history link is not displayed");
		}else {
			isDisplayed(lnkourhistory);
			assertTrue(isClickable(lnkourhistory));
			logger.debug("our history link is displayed");
		}

	}
	public void validatingCareers() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(lnkcareers);
			assertTrue(isClickable(lnkcareers));
			logger.debug("our history link is not displayed");
		}else {
			isDisplayed(lnkcareers);
			assertTrue(isClickable(lnkcareers));
			logger.debug("our history link is displayed++++++++++++++++++++++++==");
		}


	}

	public void validatingPressRoom() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(lnkPressReleases);
			assertTrue(isClickable(lnkPressReleases));
			logger.debug("pressroom is not displayed");
		}else {
			isDisplayed(lnkPressReleases);
			assertTrue(isClickable(lnkPressReleases));
			logger.debug("press room  link is displayed");
		}
		//	Assert.assertEquals("Validating the presence for txtSearch Box Open");//Framework Method need to be used

	}
	public void validatingInvestors() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(lnkInvestors);
			assertTrue(isClickable(lnkInvestors));
			logger.debug("our history link is not displayed");
		}else {
			isDisplayed(lnkInvestors);
			isClickable(lnkInvestors);
			logger.debug("our history link is displayed++++++++++++++++++++++++==");
		}
		//	Assert.assertEquals("Validating the presence for txtSearch Box Open");//Framework Method need to be used

	}
	public void validatingCheckOrder() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(lnkcheckorder);
			assertTrue(isClickable(lnkcheckorder));
			logger.debug("CheckOrder link is not displayed");
		}else {
			isDisplayed(lnkcheckorder);
			isClickable(lnkcheckorder);
			logger.debug("CheckOrder link is displayed++++++++++++++++++++++++==");
		}
	}
	public void validatingReturnPolicy() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(lnkreturnpolicy);
			assertTrue(isClickable(lnkreturnpolicy));
			logger.debug("CheckOrder link is not displayed");
		}else {
			isDisplayed(lnkreturnpolicy);
			isClickable(lnkreturnpolicy);
			logger.debug("CheckOrder link is displayed++++++++++++++++++++++++==");
		}
		//	Assert.assertEquals("Validating the presence for txtSearch Box Open");//Framework Method need to be used

	}

	public void validatingProductRecall() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(lnkproductrecall);
			assertTrue(isClickable(lnkproductrecall));
			logger.debug("lnkproductrecall link is not displayed");
		}else {
			isDisplayed(lnkproductrecall);
			isClickable(lnkproductrecall);
			logger.debug("lnkproductrecall link is displayed++++++++++++++++++++++++==");
		}
		//	Assert.assertEquals("Validating the presence for txtSearch Box Open");//Framework Method need to be used

	}
	public void validatingRebates() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(lnkrebates);
			assertTrue(isClickable(lnkrebates));
			logger.debug("lnkproductrecall link is not displayed");
		}else {
			isDisplayed(lnkrebates);
			isClickable(lnkrebates);
			logger.debug("lnkproductrecall link is displayed++++++++++++++++++++++++==");
		}
		//	Assert.assertEquals("Validating the presence for txtSearch Box Open");//Framework Method need to be used

	}
	public void validatingContactUs() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(lnkcontactus);
			assertTrue(isClickable(lnkcontactus));
			logger.debug("lnkproductrecall link is not displayed");
		}else {
			isDisplayed(lnkcontactus);
			isClickable(lnkcontactus);
			logger.debug("lnkproductrecall link is displayed++++++++++++++++++++++++==");
		}


	}
	public void validatingCustomercare() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(lnkcustomercare);
			assertTrue(isClickable(lnkcustomercare));
			logger.debug("lnkcustomercare link is not displayed");
		}else {
			isDisplayed(lnkcustomercare);
			isClickable(lnkcustomercare);
			logger.debug("lnkcustomercare link is displayed++++++++++++++++++++++++==");
		}


	}

	public void validatingGiftcards() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(lnkgiftcards);
			assertTrue(isClickable(lnkgiftcards));
			logger.debug("lnkcustomercare link is not displayed");
		}else {
			isDisplayed(lnkgiftcards);
			isClickable(lnkgiftcards);
			logger.debug("lnkcustomercare link is displayed++++++++++++++++++++++++==");
		}


	}

	public void validatingAcademyCreditCard() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(lnkAcademyCreditCards);
			assertTrue(isClickable(lnkAcademyCreditCards));
			logger.debug("lnkcustomercare link is not displayed");
		}else {
			isDisplayed(lnkAcademyCreditCards);
			isClickable(lnkAcademyCreditCards);
			logger.debug("lnkcustomercare link is displayed++++++++++++++++++++++++==");
		}


	}
	public void validatingStoreServices() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(lnkStoreServices);
			assertTrue(isClickable(lnkStoreServices));
			logger.debug("lnkcustomercare link is not displayed");
		}else {
			isDisplayed(lnkStoreServices);
			isClickable(lnkStoreServices);
			logger.debug("lnkcustomercare link is displayed++++++++++++++++++++++++==");
		}


	}

	public void validatingFindaStore() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(lnkfindastore);
			assertTrue(isClickable(lnkfindastore));
			logger.debug("lnkcustomercare link is not displayed");
		}else {
			isDisplayed(lnkfindastore);
			isClickable(lnkfindastore);
			logger.debug("lnkcustomercare link is displayed++++++++++++++++++++++++==");
		}


	}

	public void validatingsignupformoredeals() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			scrollPageToWebElement(lnkSIGNUPFORMOREDEALS);
			Thread.sleep(Constants.thread_low);   //waiting for the search to disappear
			isDisplayed(lnkSIGNUPFORMOREDEALS);
			assertTrue(isClickable(lnkSIGNUPFORMOREDEALS));
			logger.debug("lnkcustomercare link is not displayed");
		}else {
			scrollPageToWebElement(lnkSIGNUPFORMOREDEALS);
			isDisplayed(lnkSIGNUPFORMOREDEALS);
			isClickable(lnkSIGNUPFORMOREDEALS);
			logger.debug("lnkcustomercare link is displayed++++++++++++++++++++++++==");
		}


	}

	public void validatingchatnow() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(lnkchatnow_m);
			assertTrue(isClickable(lnkchatnow_m));
			logger.debug("lnkcustomercare link is displayed");
		}else {
			isDisplayed(lnkchatnow);
			isClickable(lnkchatnow);
			logger.debug("lnkcustomercare link is displayed++++++++++++++++++++++++==");
		}
	}
	
	public void validatingchatnowFunctioanlity() throws Exception{
		
			isDisplayed(lnkchatnow);
			assertTrue(clickOnButton(lnkchatnow));
			logger.debug("lnkcustomercare link popup is displayed");
	
	}
	
	
	
	public void validatingShopCategory() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(btnShopCategory);
			logger.debug("shop is not displayed");
		}else {
			isDisplayed(btnShopCategory);
			logger.debug("shop is displayed");
		}
		//	Assert.assertEquals("Validating the presence for txtSearch Box Open");//Framework Method need to be used

	}
	public void validatingTrendingCategory() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(btnTRENDINGBurgerMenu);
			logger.debug("trending is not displayed");
		}else {
			isDisplayed(btnTRENDING);
			logger.debug("trending is displayed");
		}
		//	Assert.assertEquals("Validating the presence for txtSearch Box Open");//Framework Method need to be used

	}

	public void validatingDealsCategory() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(btnDEALSBurgerMenu);
			logger.debug("deals is not displayed");
		}else {
			isDisplayed(btnDEALS);
			logger.debug("deals is displayed");
		}
		//	Assert.assertEquals("Validating the presence for txtSearch Box Open");//Framework Method need to be used

	}
	public void validatingShopByDepartmentSlide_BurgerMenu() throws Exception{

		//	Assert.assertEquals("Validating the presence for available Categories ");//Framework Method need to be used
		//	Assert.assertEquals("Validating the presence for MyAccount ");//Framework Method need to be used
		//	Assert.assertEquals("Validating the presence for SignIn");//Framework Method need to be used
	}

	public void validitingClickingOnSearchLens() throws Exception{
		clickOnButton(btnExpandSearchLensInSearchPage);
		//	Assert.assertEquals("Validating the presence for serach text box should display ");//Framework Method need to be used

	}

	public void findAndClickStoreinGH() throws Exception{
		waitForPageLoad(driver);
		Thread.sleep(Constants.thread_low); 

		if(isDisplayed(txtFindAStore)) {

			assertTrue(clickOnButton(txtFindAStore));
		}else
			logger.debug("Find A store link is not displayed ");	

	}
	
	public void findAndClickStoreinFooter() throws Exception{

		if(isDisplayed(lnkfindastore)) {

			assertTrue(clickOnButton(lnkfindastore));
		}else
			logger.debug("Find A store link is not displayed ");	

	}
	
	public void findAndClickStoreinMobile() throws InterruptedException {
		if(isDisplayed(txtFindAStoreMobile)) {	
			scrollPageToWebElement(txtFindAStoreMobile);
			waitForElement(txtFindAStoreMobile);
			Thread.sleep(Constants.thread_low); 
           
			moveHover(txtFindAStoreMobile);
			clickOnLink(txtFindAStoreMobile);
           
		}else
			logger.debug("Find A store link is not displayed ");	
	}


	public void validateStoreNameExist(String expectedStoreName) throws Exception{
		String actualStoreName = getText(txtFindAStore);

		if(actualStoreName.equals(expectedStoreName))
			logger.debug("User is selected the store succesfully");	
		else
			logger.debug("User is NOT selected the store succesfully");	


	}


	public void validateWeeklyAdLinkPresence() {
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(isDisplayed(txtWeeklyADBurgerMenu));
		}else {
			assertTrue(isDisplayed(txtWeeklyAD));
		}
	}


	public void validatingPresenceOfTextSearchBox() {

		if(isDisplayed(txtSearchBox_mobile)) {
			System.out.println("Search Icon is displayed");
			logger.debug("Search Icon is displayed");	

			//	assertTrue(clickOnButton(btnSearchLens));

			if(isDisplayed(txtSearchBox_mobile)) {
				System.out.println("Fluid Search text bar is displayed");
				logger.debug("Fluid Search text bar is displayed");	
			}    else 
				logger.debug("Fluid Search text bar is NOT displayed");	
		}

	}


	public void validatePreseneceOfFindStore() {
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(btnFindAStoreBurgerMenu);
			logger.debug("Find A Store link is displayed in Mobile BurgerMenu");
		}else {
			isDisplayed(btnFindAStore);
			logger.debug("Find A Store link is displayed");
		}
	}


	public void validatePresenceOfNavigationCategories() {
		if(isDisplayed(btnDEALSBurgerMenu)&&isDisplayed(btnSHOPBurgerMenu)&&isDisplayed(btnTRENDINGBurgerMenu))
			logger.debug("Category links for navigation are displayed");	
		else
			logger.debug("Category links for navigation are NOT displayed");	
	}


	public void validatePresenceOfMyAccountLink() {

		if(isDisplayed(btnMyAccountBurgerMenu))
			logger.debug("My Account link is displayed in Mobile BurgerMenu");	
		else
			logger.debug("My Account link is NOT displayed in Mobile BurgerMenu");	

	}
	public void validatingPrivatPolicy() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(lnkprivatepolicy);
			assertTrue(isClickable(lnkprivatepolicy));
			logger.debug("lnkcustomercare link is not displayed");
		}else {
			isDisplayed(lnkprivatepolicy);
			isClickable(lnkprivatepolicy);
			logger.debug("lnkcustomercare link is displayed++++++++++++++++++++++++==");
		}


	}
	public void validatingTermsAndConditions() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(lnktermsandconditions);
			assertTrue(isClickable(lnktermsandconditions));
			logger.debug("lnkcustomercare link is not displayed");
		}else {
			isDisplayed(lnktermsandconditions);
			isClickable(lnktermsandconditions);
			logger.debug("lnkcustomercare link is displayed++++++++++++++++++++++++==");
		}


	}
	public void validatingLegalPolicy() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(lnklegalpolicy);
			assertTrue(isClickable(lnklegalpolicy));
			logger.debug("lnkcustomercare link is not displayed");
		}else {
			isDisplayed(lnklegalpolicy);
			isClickable(lnklegalpolicy);
			logger.debug("lnkcustomercare link is displayed++++++++++++++++++++++++==");
		}


	}

	//Anuj changes on 26/06/2018 KER-721 
	public void validatingPresenceOfTextSearchBoxHomePage() {

		if(isDisplayed(btnSearchLens)) {
			System.out.println("Search Icon is displayed");
			logger.debug("Search Icon is displayed");

			if(isDisplayed(ovlySearchTextBarMobile)) {
				logger.debug("Fluid Search text bar is displayed");	
			}    else 
				logger.debug("Fluid Search text bar is NOT displayed");	
		}

	}
	//Rashika's changes for 720 footer 
	public void clickexpandall_services() throws Exception{
		assertTrue(clickOnButton(expandall_Academy_services));
	}
	public void clickexpandall_needhelp() throws Exception{
		assertTrue(clickOnButton(expandall_Academy_needhelp));
	}

	//KER-3274	
	public void verifyTheLabelForSearch() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(isDisplayed(labelforsearchMobile));
			logger.debug("label is displayed");

		}else {

			assertTrue(isDisplayed(labelforsearch));
			logger.debug("label is displayed");
		}

	}

	public void verifySuggestionPage_Productcard(String inputSearchTxt) throws Exception{
		//		Actions actions = new Actions(driver);
		//		actions.click();
		//		actions.sendKeys(Keys.BACK_SPACE);
		//		actions.sendKeys(Keys.BACK_SPACE);
		//		actions.sendKeys(inputSearchTxt);
		//		Thread.sleep(Constants.thread_low); 
		//		actions.build().perform();
		//		Thread.sleep(Constants.thread_low); 
		assertTrue(isDisplayed(listsuggestion_productcard));
		assertTrue(clickOnButton(listsuggestion_productcard));

	}

	//SID 4-September Santosh code merge
	public void entertheSearchData(String str) throws Exception{
        if(str.contentEquals("SKUNumber"))
               str = webPropHelper.getTestDataProperty(str); //Modified by SK to  
        if("mobile".equalsIgnoreCase(testtype)){
               Actions actions = new Actions(driver);
               actions.moveToElement(txtSearchBox_mobile);
               Thread.sleep(Constants.thread_medium);  
               actions.click();
               actions.sendKeys(str);
               actions.build().perform();
        }else {
               Actions actions = new Actions(driver);
               actions.moveToElement(txtSearchBox);
               Thread.sleep(Constants.thread_medium);  
               actions.click();
               actions.sendKeys(str);
               actions.build().perform();
        }
 }
	
	
	
	//Rashmi Sanity changes
	public void verifypresenceofL1Page() throws Exception {
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(isDisplayed(ContainerL1));
			logger.debug("L1 Page is not displayed");
		}else {
			assertTrue(isDisplayed(ContainerL1));
			logger.debug("L1 Page is not displayed");
		}
	}


	public void verifypresenceofL2Page() throws Exception {
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(isDisplayed(ContainerL2));
			logger.debug("L2 Page is not displayed");
		}else {
			assertTrue(isDisplayed(ContainerL2));
			logger.debug("L2 Page is not displayed");
		}
	}

	public void verifypresenceofL3Page() throws Exception {
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(isDisplayed(ContainerL3));
			logger.debug("L3 Page is not displayed");
		}else {
			assertTrue(isDisplayed(ContainerL3));
			logger.debug("L3 Page is not displayed");
		}
	}

	public void navigateToL2ViaClick_DesktopHomepage() throws Exception{
		Thread.sleep(Constants.thread_medium);  
		clickOnButton(btnShopCategory);
		Thread.sleep(Constants.thread_medium);  
		Actions hover = new Actions(getDriver());
		hover.moveToElement(btnClothingCategory).build().perform();
		Thread.sleep(Constants.thread_medium);  
		clickOnButton(btnMens_Clothing_Shop);
		Thread.sleep(Constants.thread_medium);  
	}	
	
	
	public void navigateL2HeaderToPLP() throws Exception
	{

		//////////////////////-hitain-CR----------->
		
		if("mobile".equalsIgnoreCase(testtype))
		{
			Thread.sleep(Constants.thread_low);
			clickOnButton(btnClothingCategory); //4Sep
			Thread.sleep(Constants.thread_low); 
			clickOnButton(btnMenClothingShop);
			Thread.sleep(Constants.thread_low); 
			clickOnButton(Common_Web_SD.globalElementHeader.txtToNavigateMensBurgerMenuMobile);
			Thread.sleep(Constants.thread_low); 
			
		}
		else
		{
			Thread.sleep(Constants.thread_low); 
			clickOnButton(btnShopCategory);
			Thread.sleep(Constants.thread_low); 
			//Actions hover = new Actions(getDriver());
			moveHover(btnClothingCategory);
			Thread.sleep(Constants.thread_low); 
			clickOnButton(btnMenClothingShop);
			Thread.sleep(Constants.thread_low); 
			//assertTrue(clickOnButton(r2SanityPo.AS_productPLP1));
			
			
		}
	}	


	public void navigateToL3ViaClick_DesktopHomepage() throws Exception{
		Thread.sleep(Constants.thread_low); 
		assertTrue(clickOnButton(btnShopCategory));
		Actions hover = new Actions(getDriver());
		hover.moveToElement(btnClothingCategory).build().perform();
		Thread.sleep(Constants.thread_low); 
		assertTrue(clickOnButton(btnMenClothingShop));
		Thread.sleep(Constants.thread_low); 
	}	

	public void enterthePDPSearchData() throws Exception{
		txtSearchBox.sendKeys("Nike Women's Nike Cheer Scorpion Cheerleading Shoes");
		assertTrue(clickOnButton(btnSearch_Desktop));
	}


	public void entertheSearchDataForResultsPage() throws Exception{
		txtSearchBox.sendKeys("Pants");
		assertTrue(clickOnButton(btnSearch_Desktop));
	}	


	public void verifypresenceofSearchResultsPage() throws Exception {
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(isDisplayed(txtSearchPage));
			logger.debug("Search Page is not displayed");
		}else {
			assertTrue(isDisplayed(txtSearchPage));
			logger.debug("Search Page is not displayed");
		}
	}


	public void verifypresenceofPDPPage() throws Exception {
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(isDisplayed(pdp_po.btnAddToCart));
			logger.debug("PDP Page is not displayed");
		}else {
			assertTrue(isDisplayed(pdp_po.btnAddToCart));
			logger.debug("PDP Page is not displayed");
		}
	}

	public void verifypresenceofPDPComponents() throws Exception {
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(isDisplayed(pdp_po.btnAddToCart));
			logger.debug("PDP Page is not displayed");
		}else {
			assertTrue(isDisplayed(pdp_po.btnAddToCart));
			logger.debug("PDP Page is not displayed");
		}
	}

	public void verifypresenceofSearchResultsage() throws Exception {
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(isDisplayed(txtSearchResults));
			logger.debug("Search Results Page is not displayed");
		}else {
			assertTrue(isDisplayed(txtSearchResults));
			logger.debug("Search Results Page is not displayed");
		}
	}

	//SID 10-September
	public void signOut() throws Exception {
		if("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(btnSHOPBurgerMenuMinusIcon));
			scrollPageToWebElement(btnMyAccountMobile);
			Thread.sleep(Constants.thread_low); 
			assertTrue(clickOnButton(btnMyAccountMobile));
			Thread.sleep(Constants.thread_low); 
			assertTrue(clickOnButton(btnSignOut_M));
//			waitForElement(btnBurgerMenu);
//			assertTrue(isDisplayed(btnBurgerMenu));
//			Thread.sleep(Constants.thread_medium);
//			assertTrue(clickOnButton(btnBurgerMenu));
//			assertTrue(isDisplayed(btnMyAccountBurgerMenu));

		}else {
			assertTrue(clickOnButton(btnMyAccount));
			Thread.sleep(Constants.thread_low);
			assertTrue(clickOnButton(btnSignOut));
			Thread.sleep(Constants.thread_low);
//			assertTrue(isDisplayed(btnSignIn));
//			sit_po.verifySigninpage();
		}
	}	

	public void clickSignupButton() throws Exception {
		assertTrue(clickOnButton(btnSignUp));
	}
	//SID 8-August-18
	public void softAssertFotterLink() {
		int count=0;
		SoftAssert softAssert = new SoftAssert();
		try {
			int sizeOfList = footerLinks.size();
			scrollPageToWebElement(lnkourhistory);
			for (int loop = 0; loop < sizeOfList; loop++) {
				try {
					System.out.println(footerLinks.get(loop).getText());
					softAssert.assertTrue(isClickable(footerLinks.get(loop)),
							"Fail: Expected link is click able but link " + footerLinks.get(loop).getText()
							+ " is not clickable");
					softAssert.assertAll();
				} catch (Exception e) {

					logger.debug("********************INSIDE CATCH******************");
					logger.debug("Fail: Expected link is click able but link " + footerLinks.get(loop).getText()
							+ " is not clickable");
					count++;
				}
			}
		} catch (Exception e) {
			logger.debug("*****************************Method Fail***************************");
		}
		if(count>0) {
			Assert.fail();
		}
	}

	public void clickOnBurgerMenu() throws InterruptedException {
		isClickable(btnBurgerMenu);
		if(isDisplayed(btnBurgerMenu)) {
			Thread.sleep(3000);
			assertTrue(clickOnButton(btnBurgerMenu));
			Thread.sleep(Constants.thread_low);
			}
			else {
				driver.navigate().refresh();
				Thread.sleep(Constants.thread_low);
			}
	}
	//SID UserJourney 22-August

	public void verifyMyAccount()
	 {
		assertTrue(clickOnButton(wishListFromMyAccount));
		assertTrue(isDisplayed(sit_po.lnkAccountSummary));
		assertTrue(isDisplayed(sit_po.personalInformation));
		assertTrue(isDisplayed(sit_po.wishLists));
		assertTrue(isDisplayed(sit_po.addressBook));
	}
	//RKA 21 aug
	public void getProductName() {
		
		for(WebElement productName:txtProductCatagoryinPLP)
		{
			String product_Name=getText(productName);	
			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&PRODUCT NAME::"+product_Name);
			if(product_Name !=null && product_Name.contains("GOLF")) {
				logger.debug("GOLF IS DISPLAYING IN ::"+product_Name);
			}
			else {
				logger.debug("GOLF IS NOT DISPLAYING IN ::"+product_Name);
			}
		}
	}
	
	
	
	
	
	
	
	
}
