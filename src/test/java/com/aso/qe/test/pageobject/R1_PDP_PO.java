package com.aso.qe.test.pageobject;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import com.aso.qe.framework.common.CommonActionHelper;

public class R1_PDP_PO extends CommonActionHelper
{
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	String timeStamp = new SimpleDateFormat("MM.dd.HH.mm.ss").format(new Date());  //Sid
	private String sku;   //Sid

	@FindBy(xpath="//*[@data-auid='PDP_MediaClick']|//ul[@class='slider animated']") public WebElement imgProductMainMixedMedia;
	@FindBy(xpath="(//*[@data-auid='PDP_MediaClick']|//ul[@class='slider animated'])[2]") public WebElement imgProductMainMixedMedia_m;//9aug danush
	@FindBy(xpath="//*[@data-auid='PDP_ProductName']") public WebElement txtProductTitle;
	@FindBy(xpath="//*[contains(@data-auid,'Size_Attribute')]") public WebElement secProductAttributeSizes;
	@FindBy(xpath="//*[@data-auid='btnAddToCart']") public WebElement btnAddToCart;
	@FindBy(xpath="//*[@data-auid='PDP_QC_DEC']") public WebElement btnQuantityDec;
	@FindBy(xpath="//*[@data-auid='PDP_QC_INC']") public   WebElement btnQuantityInc;
	@FindBy(xpath="//input[@aria-label='Enter Desired Quantity' and @value='1']") public   WebElement txtDesiredQtyValue_1;
	//@FindBy(xpath="//*[@data-auid='PDP_getNotifiedBackInStock']") public   WebElement txtNotifiedBack;/RKA 18 aug
	@FindBy(xpath="//*[@data-auid='PDP_IventoryMessage']") public   WebElement txtNotifiedBack;
	@FindBy(xpath="//*[@data-auid='PDP_DetailsAndSpecs']") public   WebElement tabDetailsSpecs;
	@FindBy(xpath="//*[@data-auid='Detais and Specs_m']") public   WebElement tabDetailsSpecsMobile;
	@FindBy(xpath="//*[@data-auid='PDP_Reviews']")	public   WebElement tabReviews;
	@FindBy(xpath="//*[@data-auid='Reviews_m']")	public   WebElement tabReviewsMobile;
	@FindBy(xpath="//*[@data-auid='PDP_Q&A']")	public   WebElement tabQA;
	@FindBy(xpath="//*[@data-auid='qa_m']")	public   WebElement tabQAMobile;
	@FindBy(xpath="//*[contains(@id,'react-tabs-7')]")	public   WebElement secLongDescription;
	//@FindBy(xpath="//p[contains(text(),'Features and Benefits')]") 	public   WebElement textFeatureBenefits;/RKA august 7
	@FindBy(xpath="//*[@data-auid='Features and Benefits']/*[1]") 	public   WebElement textFeatureBenefits;
	@FindBy(xpath="//*[@data-auid='btnundefined' and text()='Read More']") 	public   WebElement btnReadMore;
	@FindBy(xpath="//*[@data-auid='btnundefined' and text()='Read Less']") 	public   WebElement btnReadLess;
	@FindBy(xpath="//img[@class='bv-trustmarkIcon-image']") 	public   WebElement ImgHallmark;
	@FindBy(xpath="//*[text()='Reviews']") 	public   WebElement textReviews;
	@FindBy(xpath="//*[text()='Questions']")	public   WebElement textQuestions;
	@FindBy(xpath="//*[contains(@data-auid,'sku_')]")	public   WebElement txtProductSKU;
	@FindBy(xpath="//*[contains(@data-auid,'item_')]")	public   WebElement txtProductItemNumber;
	@FindBy(xpath="//*[@data-auid='PDP_Size_heading']//following-sibling::div//button[@aria-label='Medium']|//*[@data-auid='PDP_Shoe Size_Attribute']//span[text()='10']") 	public   WebElement secSize1;
	@FindBy(xpath="//*[@data-auid='swatchButton-image-4286']|//*[@data-auid='swatchButton-image-4076']") 	public   WebElement secSize2;
	@FindBy(xpath="//*[@data-auid='btnviewCart']") 	public WebElement btnViewCart;
	@FindBy(xpath="//*[@data-auid='btncheckout']") 	public WebElement btnCheckout;
	@FindBy(xpath="//*[@data-auid='PDP_AddToWishList']") 	public WebElement btnAddToWishList; //Anuj Added for KER-1953
	@FindBy(xpath="(//*[@data-auid='PDP_Color_Attribute']//*[contains(@data-auid,'swatchButton-image-')])[1]") public WebElement btnDifferentColor;
	@FindBy(xpath="//*[contains(@data-auid,'swatchButton-image-')]/span[text()='Medium']") public WebElement btnMediumSize;
	@FindBy(xpath="//*[contains(@class,'ReactModal__Content ReactModal__Content--after-open')]") public WebElement secAddToCartPopup;
	@FindBy(xpath="(//*[@class='cartitem-title'])[1]") public WebElement secCheckoutPageProductTitle;
	//KER-1920
	@FindBy(xpath="//a[text()='Continue Shopping']") 	public  WebElement lnkconitnueshopping;
	@FindBy(xpath="//*[@data-auid='close-addtocart-modal']") public  WebElement closeicon;
	@FindBy(xpath="//img[@class='css-14pbatb e908uih3'][contains(@src,'')]") public  WebElement productimage;
	@FindBy(xpath="//div[@class='css-sgomgw e908uih6']") public  WebElement productprice;
	@FindBy(xpath="//div[contains(text(),\"Magellan Outdoors\")]") public  WebElement productname;
	@FindBy(xpath="//*[contains(text(),'Item Added Successfully')]") public  WebElement addtocarttitle;
	@FindBy(xpath="//h1[text()='Shopping Cart']") public  WebElement viewcarttitle;
	@FindBy(xpath="//div[@class='message'][contains(text(),'Sorry')]") public  WebElement checkouttitle;

	@FindBy(xpath="//div[text()='Not Sold Online'] | //*[@data-auid='PDP_IventoryMessage']") 
	public WebElement txtNotsoldonline;//9aug danush
	//Start 28July2018
	@FindBy(xpath="(//*[contains(@data-auid, 'quickview')]//preceding-sibling::img)[1]")  public  WebElement pdpImage; //SID 27-August
//	@FindBy(xpath="(//*[contains(@class,'c-price__sub')])[1]/../parent::*/preceding-sibling::*")public  WebElement pdpImage;  //SID 27-August
	
	@FindBy(xpath="(//*[contains(@data-auid, 'quickview')])[1]")  public  WebElement btnQuickView; //SID 27-August
//	@FindBy(xpath="(//*[contains(@class,'c-price__sub')])[1]/../parent::*/preceding-sibling::*//button") public  WebElement btnQuickView; //SID 27-August
	@FindBy(xpath="//*[@data-auid='btnundefined']") public  WebElement btnSeeDetails;

	//KER-714 Start CR-AKK
	//@FindBy(xpath="(//*[@data-auid='HP_PC_A_1']//img)[2]") public WebElement btnProdctimage;/RKA 17 aug
	@FindBy(xpath="(//*[contains(@class,'d-none d-md-block')]/*[3]//*[@class='c-price__sub'])[1]")public WebElement btnProdctimage;

	public void clickProdcutCardimage() throws Exception {
		assertTrue(clickOnButton(btnProdctimage));
	}
	//KER-714 End CR-AKK

	//KER-3412 Start CR-AKK
	
	@FindBy(xpath="//*[@data-auid='shopByCategory_0']" ) public WebElement clickOnFirstIMG;
	
	
	@FindBy(xpath="(//*[contains(@data-auid, 'productCard_')])[19]") public WebElement btnProductCardimage;
	//@FindBy(xpath="(//*[contains(@data-auid, 'productCard_')])[19]//div[contains(text(), 'Online Only')]")/RKA 15 aug
	@FindBy(xpath="(//*[@class='badge css-6l2zn6 eggjmyf0'])[1]")
	public WebElement txtPromotional;
	//@FindBy(xpath="(//*[contains(@data-auid, 'productCard_')])[19]//div[contains(text(), 'Coleman')]")
	@FindBy(xpath="(//*[contains(@class,'c-product__description')])[1]")
	public WebElement txtProdctText;

	//@FindBy(xpath="(//*[contains(@data-auid, 'productCard_')])[19]//span[contains(text(), '119')]")
	@FindBy(xpath="(//*[contains(@class,'c-price__sub')])[1]")
	public WebElement txtProdctPrice;

	//@FindBy(xpath="(//*[contains(@data-auid, 'productCard_')])[19]//div[@class='c-product__ratings-reviews my-quarter d-flex align-items-center']")/RKA 15 aug
	@FindBy(xpath="(//*[@class='css-1jc6cii'])[1]")
	public WebElement bthStars;

	@FindBy(xpath="//*[@data-auid='PDP_AdBug']") public WebElement txtPromotionalmsg;
	//KER-3412 End CR-AKK

	//KER-1925 Start CR-AKK
	@FindBy(xpath="//*[@data-auid='shopByCategory_0']//img") public WebElement btnShritImage;

	//KER-1991 Start

	@FindBy(xpath="//*[@data-auid='search-input']") public WebElement searchbox;
	@FindBy(xpath="//*[@data-auid='search-clear-button']")public WebElement searchMagnifyingBtm;
	@FindBy(xpath="//*[@data-auid='productCard_14402']") public WebElement selectMagellanOutdoorsMenNeopreneWadingBoots ;
	@FindBy(xpath="//*[@data-auid='PDP_QC_INC']/preceding-sibling::*[1]/*")public WebElement quantityInput;
	@FindBy(xpath="//*[contains(text(),'limited to 4 per order')]")public WebElement MsgSelectedItemLimited;
	@FindBy(xpath="(//*[contains(@data-auid,'productCard_')])[1]")public WebElement selectSCCY_CPX_2CB9mmPistol;
	//@FindBy(xpath="//*[@data-auid='PDP_OnlineMessage']")public WebElement MsgPDP_OnlineMessage;/RKA 15 aug
	@FindBy(xpath="//*[@data-auid='PDP_IventoryMessage']")public WebElement MsgPDP_OnlineMessage;
	@FindBy(xpath="//*[@data-auid='productCard_5242504']")public WebElement selectNikeToddlerGirlDNAShirtandShortsSet;
	//@FindBy(xpath="//*[@data-auid='PDP_getNotifiedBackInStock']/../../*[1]")public WebElement  MsgOutOFStock;/RKA 18 aug
		@FindBy(xpath="//*[@data-auid='PDP_IventoryMessage']")public WebElement  MsgOutOFStock;
	@FindBy(xpath="(//*[contains(@aria-label,'stars out of 5')])[1]")public WebElement selectStarratingProduct;
	@FindBy(xpath="//*[@data-auid='PDP_close_Addtocart_Modal']") public WebElement btnCloseCrossAddToCartModel; //Anuj 7 Aug
	@FindBy(xpath="//*[contains(text(),'We added those to the cart')]") public WebElement txtLimitedQuantityAddedInCart; //Anuj 11 Aug
@FindBy(xpath="//*[@data-auid='ContinueShopping']/../following-sibling::*[1]/*")public WebElement MsgquantityLimitation;


	//@FindBy(xpath="//*[@data-auid='PDP_getNotifiedBackInStock']") public   WebElement txtNotifiedBack;
	//KER-3455 @RKA
	@FindBy(xpath="(//*[contains(@data-auid,'productCard_')])[1]") public WebElement selectFirstItem;
	@FindBy(xpath="//*[@data-auid='PDP_Size_heading']/following-sibling::*/*[2]") public WebElement Btm3Toddler;
	@FindBy(xpath="//*[@data-auid='ContinueShopping']/../following-sibling::*[1]/*[1]/*[2]/*[1]")public WebElement msgItemAddedSuccessfully;
	@FindBy(xpath="//*[@data-auid='ContinueShopping']/../following-sibling::*[1]/*[1]/*[2]/*[1]/following-sibling::*[3]/*")public WebElement msgBundleProductPRice;
	@FindBy(xpath="//*[@data-auid='ContinueShopping']/../following-sibling::*[1]/*[1]/*[2]/*[1]/following-sibling::*[3]/following-sibling::*/*[2]") public WebElement btmViewcartATCnotificcation;
	@FindBy(xpath="//*[@data-auid='ContinueShopping']/../following-sibling::*[1]/*[1]/*[2]/*[1]/following-sibling::*[3]/following-sibling::*/*[1]") public WebElement btmCheckOutATCnotification;
	@FindBy(xpath="//*[@data-auid='ContinueShopping']/../following-sibling::*[1]/*[1]/*[1]")public WebElement  imgproductATCnotification;
	@FindBy(xpath="//*[@data-auid='ContinueShopping']/../following-sibling::*[1]/*[1]/*[1]/following-sibling::*/*[2]") public WebElement producrNameATCnotification;



	//KER-3455Mobile @RKA
	@FindBy(xpath="//*[@data-auid='ContinueShopping']/../following-sibling::*[2]")public WebElement msgItemAddedSuccessfully_M;
	@FindBy(xpath="//*[@data-auid='ContinueShopping']/../following-sibling::*[3]/*[1]/*[2]/*")public WebElement msgBundleProductPRice_M;
	@FindBy(xpath="//*[@data-auid='btncheckout']")public WebElement  btmCheckOutATCnotification_M;
	@FindBy(xpath="//*[@data-auid='btnviewCart']")public WebElement btmViewcartATCnotificcation_M;
	@FindBy(xpath="//*[@data-auid='ContinueShopping']/../following-sibling::*[3]/*[1]/*[3]/*")public WebElement  imgproductATCnotification_M;
	@FindBy(xpath="//*[@data-auid='ContinueShopping']/../following-sibling::*[3]/*[1]/*[1]")public WebElement  producrNameATCnotification_M;


	@FindBy(xpath="(//*[contains(@data-auid, 'productCard_')])[2]")  public WebElement btnPlpImage;
	public void clickPlpImage() throws Exception {
		assertTrue(clickOnButton(btnPlpImage));
	}

	//KER-1925 REdesign By RKA 14 AUg
	@FindBy(xpath="(//*[@class='c-price__sub css-1f28zyy e1xaasfo1'])[1]")public WebElement imgWithoutPRomotion_PRice;
    @FindBy(xpath="//*[@data-auid='facetdrawer_drawer_Ad Feature']")public WebElement filterADfeature; 
	@FindBy(xpath="//*[@data-auid='drawer_Clearance']")public WebElement filterClearence;
	@FindBy(xpath="(//*[contains(@class,'badge css-')])[1]")public WebElement firstClearanceItem;
	@FindBy(xpath="(//*[contains(@class,'badge css-')])[1]/../following-sibling::*/section/*/*[1]/*[2]")public WebElement PriceOFfirstClearenceITem;
	@FindBy(xpath="//*[@class='css-115kh7q e1xidll61']")public WebElement txtPriceofPDP;
	@FindBy(xpath="//*[contains(text(),'  Be the first to ask a question')]")public WebElement linkBetheFirstTOAskQuestion;
	
	@FindBy(xpath="(//*[contains(@class,'c-price_')]/span)[1]")
	public WebElement txtPlpPrice;

	@FindBy(xpath="(//*[@data-auid='PDP_ProductPrice']//span)[2]")
	public WebElement txtPdpprice;

	@FindBy(xpath="(//*[contains(@data-auid, 'productCard_')])[16]") public WebElement txtClearanceImage;
	public void clickClearanceImage() throws Exception {
		scrollPageToWebElement(txtClearanceImage);
		assertTrue(clickOnButton(txtClearanceImage));
	}

	@FindBy(xpath="//*[@data-auid='PDP_ProductPrice']//span[contains(text(), '19')]")
	public WebElement txtPdpClearnacePrice;	
	//KER-1925 End CR-AKK
	// **SID*************************************************************************************************//
	@FindBy(xpath="(//*[@data-auid='PDP_MediaClick']//img)[1]") public WebElement imgSrcSKUAttribute ;
	@FindBy(xpath="(//*[contains(@class,'ReactModal__Overlay ReactModal__Overlay')]//img)[1]") public WebElement imgAddToCartPopup ;
	@FindBy(xpath="(//*[@data-auid='PDP_ProductImage_m']//img)[4]") public WebElement imgproductPDPSRCMobile;  //SID 28-August


	@FindBy(xpath="(//*[@data-auid='PDP_MediaClick']//*[@alt='Hover/Click to enlarge'])[1]") public WebElement imgClickToZoom;
	@FindBy(xpath="(//*[@data-auid='PDP_ProductImage_m']//*[@alt='Hover/Click to enlarge'] )[3]") public WebElement imgClickToZoomMobile;
	@FindBy(xpath="//*[@data-auid='PDP_Modal_closeIcon']/* | //*[@data-auid='PDP_ProductImage_m']//ancestor::div[@aria-modal='true']//button[contains(text(),'X')]") public WebElement btnCloseCrossZoom;
	@FindBy(xpath="(//*[contains(text(),'Pick Up in 3-4 business days')])[1]") public WebElement txtShippingRelatedMsg; 

	@FindBy(xpath = "//*[contains(@data-auid,'productCard_')]//span[contains(@class,'c-product__colors-available')]")	public List<WebElement> colorsAvailablePLP;
	@FindBy(xpath = "//*[@data-auid='PDP_Color_Attribute']")	public WebElement visibilityAltColorPDP;
	@FindBy(xpath = "//*[@data-auid='PDP_Color_Attribute']//button[contains(@data-auid,'swatchButton-image-')]//img")	public List<WebElement> altColorsPDP;
	@FindBy(xpath = "//*[@data-auid='PDP_MediaClick']//img | //*[@data-auid='PDP_ProductImage_m']//img")	public WebElement selectedSwatchRepresentative;
	@FindBy(xpath = "//*[@data-auid='PDP_Color_heading']//*[2]")	public WebElement selectedSwatchColor;
	@FindBy(xpath = "//*[@data-auid='PDP_close_wishList']")	public WebElement closeWishlistModal;
	@FindBy(xpath = "//*[@data-auid='input_newWishListName']")	public WebElement txtWishlist;
	@FindBy(xpath = "//*[@data-auid='btnwishListPopover_createList'] | //*[@data-auid='btnwishListPopover_createList_m']")	public WebElement createWishlist;
	@FindBy(xpath = "//h6[text()='This item has been added to']")	public WebElement successWishlistModal;
	@FindBy(xpath = "//*[contains(@data-auid,'sku_')]/parent::div/span[2]")	public WebElement itemAddedSKU;
	@FindBy(xpath = "//*[@data-auid=\"Wish List\"]")	public WebElement headerWishList;
	@FindBy(xpath = "//*[@id='wishListSelect']")	public WebElement selectWishList;
	@FindBy(xpath = "//*[@id='wishListItemsContainer']//*[contains(text(),'SKU#')]")public WebElement wishListSKU;	
	//sid 16-August KER-2725
	@FindBy(xpath = "//*[@data-auid='PDP_AdBug']")public WebElement pdpEybrow;	
	@FindBy(xpath = "//*[@data-auid='Rating Stars']")public WebElement pdpRating;	
	@FindBy(xpath = "//*[@data-auid='PDP_PromoMessage']")public WebElement pdpPromoMessage;	
	@FindBy(xpath = "//div[contains(@class,'breadCrumbComponent')]//span[4]//a")public WebElement navigateToPLP;	
	@FindBy(xpath = "//*[@id='productCardListing']//*[contains(text(),'Online Only')]")public List<WebElement> checkOnlineBadges;
	@FindBy(xpath = "//*[@data-bv-show='inline_rating']/parent::div")public WebElement checkRating;
	
	
	//***********************************************************************************************************//


	//KER-1952 Start CR-AKK
	@FindBy(xpath = "//button[contains(text(), 'Ask a question')]") public WebElement btnAskQuestion;
	@FindBy(xpath = "//button[contains(text(), ' Answer this Question')]") public WebElement btnAnswerQuestion;
	@FindBy(xpath = "//button[@name='Cancel']") public WebElement btnCancel;
	
	//KER-2728 Anuj 14 Aug
	@FindBy(xpath = "//*[contains(@data-auid,'PDP_PromoMessage')]") public WebElement txtPromoCodePDP;
	@FindBys({ @FindBy(xpath="//*[@data-auid='PDP_Color_Attribute']//button [not(*[local-name()='svg'])]")}) public List<WebElement> colorsAvailable;
	@FindBys({ @FindBy(xpath="(//*[@data-auid='PDP_Size_Attribute']//button[@role] [not(*[local-name()='svg'])])")}) public List<WebElement> sizeAvailable;
	

	public void cilckAnswerThisQuestion() throws Exception {
		assertTrue(clickOnButton(btnAnswerQuestion));
		Thread.sleep(2000);
	}

	public void cilckOnCancel() throws Exception {
		assertTrue(clickOnButton(btnCancel));
		Thread.sleep(2000);
	}
	//KER-1952 End CR-AKK

	//KER-1937 Start CR-AKK
	@FindBy(xpath ="//*[@id='bv-textarea-field-questionsummary']") public WebElement inputQuestionSummary;
	@FindBy(xpath ="//input[@id='bv-text-field-usernickname']") public WebElement inputNickname;
	//@FindBy(xpath ="//input[@id='bv-email-field-hostedauthentication_authenticationemail']") public WebElement inputEmail;
	@FindBy(xpath ="//input[@name='agreedtotermsandconditions']") public WebElement btnChecbox; //SID 24-August
	@FindBy(xpath ="//button[text()='Post Question']") public WebElement btnPostQuesdtion;
	@FindBy(xpath ="//button[@aria-label='Yes, answer by Anonymous is helpful.']") public WebElement btnYes;
	@FindBy(xpath ="//button[@aria-label='No, answer by Anonymous is not helpful.']") public WebElement btnNo;
	//KER-1937 Start CR-AKK

	//KER-737 Start CR-AKK
	@FindBy(xpath ="(//*[contains(@data-auid, 'productCard_')]/div)[3]") public WebElement pdpImage1;


	//KER-1954 RKA
	@FindBy(xpath="//*[contains(text(),'you recommend this product to a friend')]/../../following-sibling::*[2]/*/*/*[1]")public WebElement btnRecommendToAFriend;
	@FindBy(xpath="//*[contains(text(),'Write a review')]")public WebElement btnWriteAReview;
	@FindBy(xpath="//*[contains(text(),'Overall Rating')]/../../following-sibling::*[2]/*[1]/*[1]/*[5]")public WebElement btnExcellentStar;
	@FindBy(xpath="//*[contains(text(),'Review Title* ')]/../../following-sibling::*[2]")public WebElement inputReviewTitle;
	@FindBy(xpath="//*[contains(text(),'Review*')]/../../following-sibling::*[2]/*[1]")public WebElement inputReview;
	@FindBy(xpath="//*[contains(text(),'Nickname')]/../../following-sibling::*[2]")public WebElement inputNickName;
	@FindBy(xpath="//*[contains(text(),'Email')]/../../following-sibling::*[2]")public WebElement inputEmail;
	@FindBy(xpath="//*[contains(text(),'Phone Number')]/../../following-sibling::*[2]")public WebElement inputPhoneNumber;
	@FindBy(xpath="//*[contains(text(),'Post Review')]")public WebElement btnPostReview;
	@FindBy(xpath="//*[contains(text(),'terms & conditions')]/../preceding-sibling::*")public WebElement btnTerms_conditions;
	@FindBy(xpath="//*[contains(text(),'Your review was submitted')]/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/*[1]")public WebElement x_yourReviewSubmited;
	//@FindBy(xpath="(//*[contains(@data-auid,'productCard_')])[3]")public WebElement itemWithNoReview;/RKA 10 aug
	//@FindBy(xpath="(//*[@class='c-product__colors-available m-noratings'])[1]")public WebElement itemWithNoReview;
@FindBy(xpath="(//*[contains(@class,'c-product__colors')])[1]")public WebElement itemWithNoReview;

	@FindBy(xpath="(//*[contains(text(),'Reviews')])[2]/../../following-sibling::*[1]/*[2]")public WebElement linkBeTheFirstTOReviewThisPRoduct;
	@FindBy(xpath="(//*[contains(@data-auid,'productCard_')])[*]/*[1]/*[2]/*[3]/*[1]/*/*[2]")public WebElement atLeastOneReview;


	//KER-1954Mob RKA
	@FindBy(xpath="//*[@data-auid='Reviews_m']/*")public WebElement btnPlusReviews_M;
	@FindBy(xpath="(//*[@class='css-1jc6cii'])[1]") public WebElement selectproductWithReview;
	@FindBy(xpath="(//*[contains(text(),'Sort by')])[1]/../following-sibling::*") public WebElement selectSortby;
	
	@FindBy(xpath="//*[contains(text(),' Highest to Lowest Rating ')]")public WebElement higestTOLowest;
	
	@FindBy(xpath="(//*[contains(text(),'Reviews')])[4]/../following-sibling::*/*[1]")public WebElement reviewPaginationBackward;
	@FindBy(xpath="(//*[contains(text(),'Reviews')])[4]/../following-sibling::*/*[2]")public WebElement reviewPaginationForward;

	//KER-1950
	@FindBy(xpath="((//*[contains(text(),'Reviews')])[3]/parent::*/parent::*/parent::*/following-sibling::*[2]/*/*[2]/*[1]/*/*[1]/*[2]/*[1]/*[2]/*/*/*[1]/*/*)[1]") public WebElement mouseHoverOnReviewName;
	@FindBy(xpath = "//*[@role='tooltip']")	public WebElement reviewFlyout;  //SID 28-August
	
	// KER-3728 Start CR-AKK
	@FindBy(xpath = "//*[@data-auid='level1Category-SHOP']")
	public WebElement btnShopCategory1;
	@FindBy(xpath = "//a[@data-auid='level2Category-Sports']")
	public WebElement btnSportsCategory;
	@FindBy(xpath = "//*[@data-auid='level3Category-Baseball']//*[@data-auid='level4Category-Helmets']")
	public WebElement btnHelmetsCategory;
	@FindBy(xpath = "//*[@data-auid='level3Category-Football']//*[@data-auid='level4Category-Helmets & Masks']")
	public WebElement btnFootballHelmetsCategory;
	@FindBy(xpath = "//*[text()='Schutt Youth DNA Recruit Hybrid Football Helmet with ROPO Facemask']")
	public WebElement imgHelmetSKUCategory;  //SID 28-August
	@FindBy(xpath = "//h2[text()='Schutt Youth DNA Recruit Hybrid Football Helmet with ROPO Facemask']")
	public WebElement txtProdcutDetails;
	@FindBy(xpath = "(//*[contains(text(),'DETAILS & SPECS')])[1]")
	public WebElement txtDetails;
	@FindBy(xpath = "//button[@data-auid='Detais and Specs_m']")
	public WebElement txtDetails_M;
	@FindBy(xpath = "//button[@data-auid='btnstep']")
	public WebElement btnNextStep;
	@FindBy(xpath = "//button[@data-auid='add-to-cart']")
	public WebElement btnAddToCart1;
	@FindBy(xpath = "//a[@data-auid='level2Category-Sports_m']")
	public WebElement btnSportsCategory_M;
	@FindBy(xpath = "//a[@data-auid='level3Category-Football_m']")
	public WebElement btnFootballCategory_M;
	@FindBy(xpath = "//*[@data-auid='level4Category-Hoops_m']")
	public WebElement plp_BasketballHoopsCategory_M;  //SID 28-August
	@FindBy(xpath = "//*[@data-auid='level3Category-Basketball_m']")
	public WebElement btnBasketballCategory_M;  //SID 28-August
	@FindBy(xpath = "//*[@data-auid='drawer_Inground Basketball Hoops_m']")
	public WebElement btnIngroundHoops_M; //SID 28-August
	@FindBy(xpath = "//*[text()='48-in Spalding Arena Series Glass In-Ground Basketball Hoop']")
	public WebElement clickNoDiffProduct; //SID 28-August
	
	
	
	
	@FindBy(xpath = "//a[@data-auid='level4Category-Helmets & Masks_m']")
	public WebElement HelmetsCategory_M;
	@FindBy(xpath = "(//button[contains(@data-auid, 'swatchButton-image-')])[1]")
	public WebElement imgSubHelmetsCategory;

	//KER-3344 Start CR-AKK
	//Commented by SID 28-August
	//@FindBy(xpath="//*[@data-auid='PDP_ProductName']") 
	@FindBy(xpath = "//div[contains(text(), 'Schutt Youth Recruit Hybrid Helmet - Shell Only')]")
	public WebElement txtBundle;
	@FindBy(xpath ="//div//button[contains(@data-auid, 'swatchButton-image-')][2]")
	public WebElement imgBundleColor;
	@FindBy(xpath ="//span[text()='Edit']")
	public WebElement btnEdit;
	//KER-3344 End CR-AKK
	//KER-652 Start 
	@FindBy(xpath="//*[@data-auid='Rating Stars']")public WebElement starRatingOnPDPtop;
	//@FindBy(xpath="//*[@data-auid='Rating Stars']/*/*/*[2]/*[2]/*|//*[@data-auid='Rating Stars']/*/*/*[3]/*[2]/*")public WebElement starRatingOnPDPtop_Zero;/RKA 16 aug
	@FindBy(xpath="//*[contains(@class,'bv_numReviews_text')]")public WebElement starRatingOnPDPtop_Zero;
	@FindBy(xpath="//*[contains(@class,'bv_numReviews_text')]")public WebElement StarratingequalsZero;
    @FindBy(xpath="(//*[@name='Cancel'])[2]")public WebElement click_XyourQuestionSubmitted;


	//Anuj
	@FindBy(xpath="//*[@data-auid='PDP_Size_heading']//following-sibling::div//*[contains(@data-auid,'swatchButton-image-')]/*[contains(text(),'XX')]")public WebElement btnXXLARGESizePDP;
	
	
	//KER-2334 Start
	@FindBy(xpath="//*[@data-auid='level3Category-Toddler Clothing']/*[1]")public WebElement btnToddlerClothing;
	@FindBy(xpath="//*[@data-auid='productCard_5242504']") public WebElement itemWithnoStock;
	@FindBy(xpath="//*[@data-auid='PDP_getNotifiedBackInStock']")public WebElement lnkGetNotified;
	@FindBy(xpath="//*[@name='emailId']")public WebElement emailOFgetNotified;
	@FindBy(xpath="//*[@data-auid='btnemail-signup-button']")public WebElement btnSubmitGetNotification;
	@FindBy(xpath="//*[contains(text(),'RE ALL SET')]")public WebElement txtYouAreAllSet;
	@FindBy(xpath="(//*[contains(@data-auid,'Size')]//*[contains(@data-auid,'swatchButton')])[3]")public WebElement clickOtherSize; //SID 28-August
	//KER-2334 End
	
	// KER-1934 Start
	@FindBy(xpath="//*[contains(@data-auid,'PDP_Size_heading')]/following-sibling::*/*/*[1]")public List<WebElement> txtSizeList;
	@FindBy(xpath="//*[contains(@data-auid,'PDP_Size_heading')]/*[1]/*[2]")public WebElement textSize;
	@FindBy(xpath="//*[@data-auid='PDP_Clearance_heading']/*/*[1]")public WebElement textclearance;
	@FindBy(xpath="//*[@id='productCardListing']/*//*[@class='badge css-10lliur eggjmyf0']")public WebElement checkClearanceCondition;
//	@FindBy(xpath="//*[contains(@class,'col-12 col-md-4 d-flex')]")public WebElement checkItemInGrid;
	@FindBy(xpath="//*[@id='productCardListing']/*")public List<WebElement> itemInGrid;
//	@FindBy(xpath="//*[contains(@class,'badge css-')]")public WebElement clearenctText;
	@FindBy(xpath="//*[@data-auid='PDP_Color_heading']/./following-sibling::*/*")public List<WebElement> clickSwatchColor;	
	
	
	//KER-1934 END
	
	//KER-2717 Start
	@FindBy(xpath="//*[@data-auid='PDP_IventoryMessage']")public WebElement txtNotSoldInStore;
	
	
	
	
	
	
	
	//SID 28-August
	public void navigateToMultipleSKU() throws Exception {
		Thread.sleep(2000);
		assertTrue(clickOnButton(btnShopCategory1));
		Thread.sleep(1000);
		Actions hover = new Actions(getDriver());
		hover.moveToElement(btnSportsCategory).build().perform();
		Thread.sleep(1000);
		hover.moveToElement(btnFootballHelmetsCategory).build().perform();
		clickOnLink(btnFootballHelmetsCategory);
		Thread.sleep(3000);
	}

	//SID 28-AUgust
	public void clickOnImgSkuItem() throws Exception {
		scrollPageToWebElement(imgHelmetSKUCategory);
		Actions hover = new Actions(getDriver());
		hover.moveToElement(imgHelmetSKUCategory).build().perform();
		assertTrue(clickOnButton(imgHelmetSKUCategory));
		Thread.sleep(2000);
	}

	public void navigateToMultipleSKU_Mobile() throws Exception {
		Thread.sleep(2000);
		assertTrue(clickOnButton(btnSportsCategory_M));
		Thread.sleep(2000);
		assertTrue(clickOnButton(btnFootballCategory_M));
		Thread.sleep(2000);
		assertTrue(clickOnButton(HelmetsCategory_M));
		Thread.sleep(3000);
	}
	// KER-3728 End CR-AKK

	public void moveToPdpImage1() throws Exception {
		Actions hover = new Actions(getDriver());
		hover.moveToElement(pdpImage1).build().perform();
		Thread.sleep(2000);
	}
	//KER-737 End CR-AKK

	public void moveToPdpImage() throws Exception {
//		Actions hover=new Actions(getDriver());
//		hover.moveToElement(pdpImage).build().perform();
//		Thread.sleep(2000);
		moveHover(pdpImage);
	}

	public void cilckQuickViewbutton() throws Exception {

		//assertTrue(clickOnButton(btnQuickView));
		clickOnButton(btnQuickView);
	
		//Thread.sleep(5000);
	}

	//Commented by SID 27-August
//	public void verifyAddcartOrSeeDetailsButton() throws Exception {
//		if(isDisplayed(btnSeeDetails))
//		{
//			logger.debug("our history link is not displayed");
//		}
//		else
//		{
//			isDisplayed(btnAddToCart);
//		}
//	}
	//End 28July2018
	public R1_PDP_PO(WebDriver webDriver) 
	{
		super();
	}


	public boolean addToCartAvailability() throws InterruptedException
	{
		boolean isAddtoCart= false;
		try
		{
			waitForElement(selectedSwatchRepresentative);
			isDisplayed(selectedSwatchRepresentative);

			if (btnAddToCart.isDisplayed()) 
			{
				isAddtoCart=true;
				
			}
			else
			{
				
				for(WebElement colorElement: colorsAvailable)
				{
					clickOnButton(colorElement);
					for(WebElement sizeElement:sizeAvailable)
					{
						logger.debug("Product Size Txt::"+sizeElement.getText());
						clickOnButton(sizeElement);
						if(isDisplayed(btnAddToCart))
						{
							isAddtoCart=true;
							break;
						}
					}
					if(isAddtoCart)
					{
						break;
					}
				}
				
			}
		}
		catch (NoSuchElementException e) 
		{
			for(WebElement colorElement: colorsAvailable)
			{
				clickOnButton(colorElement);
				for(WebElement sizeElement:sizeAvailable)
				{
					logger.debug("Product Size Txt::"+sizeElement.getText());
					clickOnButton(sizeElement);
					if(isDisplayed(btnAddToCart))
					{
						isAddtoCart=true;
						break;
					}
				}
				if(isAddtoCart)
				{
					break;
				}
			}
			//logger.error("addToCartAvailability exception msg::"+e.getMessage());
		}
		catch (Exception e) 
		{
			logger.error("addToCartAvailability exception msg::"+e.getMessage());
		}
		logger.debug("Add to Cart buttion is visable::"+isAddtoCart);
		return isAddtoCart;
	}


	// SID 05-August-2018
	public void altColorMatch() throws InterruptedException 
	{
		int colorCount = 0;
		for (WebElement colorAvailablePLP : colorsAvailablePLP) 
		{
			String altcolorAvailable = colorAvailablePLP.getText();
			String[] altColorNumber = altcolorAvailable.split(" ");
			try {
				colorCount = Integer.parseInt(altColorNumber[0]);
			} catch (Exception e) {
				logger.debug("Color Count Exception");
			}
			logger.debug("Click on the Product card having alternative color");
			assertTrue(clickOnButton(colorAvailablePLP));
			logger.debug("Redirect the User to PDP");
			break;
		}
		waitForElement(visibilityAltColorPDP);
		assertEquals(altColorsPDP.size(), colorCount);
	}

	// SID 05-August-2018
	public void updateRepresentativeColor(){
		for(WebElement altColorPDP : altColorsPDP){
			waitForElement(altColorPDP);
			assertTrue(clickOnButton(altColorPDP));
			String[] modifiedselectedSwatchRepresentative = selectedSwatchRepresentative.getAttribute("src").split("\\?");
			String[] modifiedaltColorPDP = altColorPDP.getAttribute("src").split("\\?");
			assertEquals(modifiedselectedSwatchRepresentative[0],modifiedaltColorPDP[0]);
		}
	}

	// SID 05-August-2018
	public void checkSelectedSwatchColor(){
		for(WebElement altColorPDP : altColorsPDP){
			waitForElement(altColorPDP);
			assertTrue(clickOnButton(altColorPDP));
			assertEquals(selectedSwatchColor.getText(),altColorPDP.getAttribute("alt"));
		}

	}

	//08-Aug Anuj  KER-1920 //Modified SID 28-August
	public void addToCartProductValidationDesktop() throws InterruptedException {
	
		addToCartAvailability();
		String productImage = imgSrcSKUAttribute.getAttribute("src");
		String[] productImageLink = productImage.split("\\?");  //SID
		String productPrice = getText( txtPdpprice);
		String productTitle = getText( txtProductTitle);
		String filterProductTitle= productTitle.replace("'", "");//SID
		String[] breakName = filterProductTitle.split(" ");//SID
		assertTrue(clickOnButton(btnAddToCart));
		Thread.sleep(3000);
		List<WebElement> countWebelement = driver.findElements(By.xpath("(//*[contains(text(),'"+breakName[0]+"')])")); //SID
		int size =countWebelement.size();//SID
		WebElement actualTitleInAddToCart = driver.findElement(By.xpath("(//*[contains(text(),'"+breakName[0]+"')])["+size+"]"));//SID
		String filterActualTitleInAddToCart = actualTitleInAddToCart.getText().replace("'", "");//SID
		WebElement actualPriceInAddToCart = driver.findElement(By.xpath("//*[contains(@class,'ReactModal__Content ReactModa')]//*[contains(text(),'"+productPrice+"')]"));
		String productImageAddToCartPopup = imgAddToCartPopup.getAttribute("src");
		String[] productImageAddToCartPopupLink = productImageAddToCartPopup.split("\\?");//SID
		assertEquals(filterProductTitle, filterActualTitleInAddToCart);//SID
		assertEquals(productPrice, actualPriceInAddToCart.getText());//SID
		assertTrue(productImageLink[0].contains(productImageAddToCartPopupLink[0])); //SID
	}

	//08-Aug Anuj  KER-1920  //Modified SID 28-August
	public void addToCartProductValidationMobile() throws InterruptedException {

		addToCartAvailability();
		String productImage = imgproductPDPSRCMobile.getAttribute("src");
		String[] productImageLink = productImage.split("\\?");  //SID
		String productPrice = getText( txtPdpprice);
		String productTitle = getText( txtProductTitle);
		String filterProductTitle= productTitle.replace("'", "");//SID
		String[] breakName = filterProductTitle.split(" ");//SID
		assertTrue(clickOnButton(btnAddToCart));
		Thread.sleep(3000);
		List<WebElement> countWebelement = driver.findElements(By.xpath("(//*[contains(text(),'"+breakName[0]+"')])")); //SID
		int size =countWebelement.size();//SID
		WebElement actualTitleInAddToCart = driver.findElement(By.xpath("(//*[contains(text(),'"+breakName[0]+"')])["+size+"]"));//SID
		String filterActualTitleInAddToCart = actualTitleInAddToCart.getText().replace("'", "");//SID
		WebElement actualPriceInAddToCart = driver.findElement(By.xpath("//*[contains(@class,'ReactModal__Content ReactModa')]//*[contains(text(),'"+productPrice+"')]"));
		String productImageAddToCartPopup = imgAddToCartPopup.getAttribute("src");
		String[] productImageAddToCartPopupLink = productImageAddToCartPopup.split("\\?");//SID
		assertEquals(filterProductTitle, filterActualTitleInAddToCart);//SID
		assertEquals(productPrice, actualPriceInAddToCart.getText());//SID
		assertTrue(productImageLink[0].contains(productImageAddToCartPopupLink[0])); //SID
	}

	// SID 7-August-18
	public void createWishList() throws InterruptedException {
		setInputText(txtWishlist, timeStamp);
		assertTrue(clickOnButton(createWishlist));

	}

	// SID 7-August-18
	public void skuPDP() {
		assertTrue(isDisplayed(itemAddedSKU));
		sku = itemAddedSKU.getText();
	}

	// SID 7-August-18
	public void matchWishlistSKU() {
		logger.debug("**********************             **************       SKU#: " + sku + "*****************"
				+ wishListSKU.getText());
		assertEquals("SKU#: " + sku, wishListSKU.getText());
	}

	// SID 7-August-18
	public void clickWishlist() {
		WebElement wishListName = driver
				.findElement(By.xpath("//*[@id='wishListSelect']//*[text()='" + timeStamp + "']"));
		assertTrue(clickOnButton(wishListName));
	}


	//RKA 10 aug
	public void checkAndClickProductWithNoReview() throws InterruptedException {

		clickOnButton(itemWithNoReview);
		waitForPageLoad(driver);
		int num=2;
		while(!starRatingOnPDPtop_Zero.equals(0)) {

			driver.navigate().back();
			waitForPageLoad(driver);


			driver.findElement(By.xpath("(//*[contains(@class,'c-product__colors')])["+num+"]")).click();

			num++;
			waitForPageLoad(driver);

			System.out.println("555");
			waitForElement(starRatingOnPDPtop_Zero);

			if(StarratingequalsZero.getText().equals("(0)")) {

				break ;

			}

		}


	}
//SID 16-August KER-2725
	public boolean checkPresence() {
		boolean flag=false;
		if(isDisplayed(pdpRating) && isDisplayed(pdpPromoMessage) && isDisplayed(pdpEybrow)) {
			flag=true;
		}
		else if(isDisplayed(pdpRating) && isDisplayed(pdpEybrow)) {
			logger.debug("*************Promo Message not Found***************");
			flag=false;
		}
		else {
			Assert.fail();
//			clickOnButton(navigateToPLP);
//			boolean rating=false;
//			for(WebElement checkOnlineBadge : checkOnlineBadges) {
//				rating = isDisplayed(checkRating);
//				if(rating==true) {
//					flag=true;
//					break;
//				}
//				else {
//					flag=false;
//				}
//			}
//			logger.debug("*************Promo Message not Found1***************");
		}
//		System.err.println(flag);
		return flag;
	}
	
	// SID 18-August
	public void checkModal() {
		boolean flag = isDisplayed(closeWishlistModal);
		if (flag == false) {
			assertTrue(clickOnButton(btnAddToWishList));
		}
	}
	
	//RKA 20 aug
	 public boolean sizeTextname() {
		 boolean flag = false;
		 for(WebElement sizeElement:sizeAvailable){
			 clickOnButton(sizeElement);
			String sizeElementTxt = sizeElement.getText();
			String sizeName=getText(textSize);
			 logger.debug(sizeName+"::SIZE TXT::"+sizeElementTxt);
			 
			 if(sizeElementTxt !=null && sizeElementTxt.equals(sizeName)) {
				 flag = true;
			 }else {
				 flag=false;
				 break;
			 }
				
		 }
		 return flag;
		 
			
			
		}

	 
	 
	 public void clickOnNonClearanceItem() {
		 for(WebElement gridItem: itemInGrid) {
			 System.out.println("000");
			 if(isDisplayed(checkClearanceCondition)) {
				System.out.println("11");
			 String itemWithNoClearance =driver.findElement(By.xpath("//*[@class='col-12 col-md-4 d-flex']/*")).getAttribute("data-auid");
			System.out.println("2222");
			 System.out.println("%%%%%%%%%%%%%%%%"+itemWithNoClearance);
			System.out.println("3333");
			 WebElement item=driver.findElement(By.xpath("//*[@data-auid='"+itemWithNoClearance+"']"));
		System.out.println("444");//*[@data-auid='btnproductCard_4705544_quickview']
			 clickOnButton(item);
			 System.out.println("555");
			 }
			 
		 }
	 }
	 
	 //RKA 20 AUG
	 public void verifySKUforallItem() {
		 
	for(WebElement clickSwatchColor :clickSwatchColor ) {
		
		clickOnButton(clickSwatchColor);
		assertTrue(isDisplayed(txtProductSKU));
	}
		 
		 
	 }
	 
	 
	 
	 //SID 28-August
	 public void navigateToNoDiffPLP() {
		 assertTrue(clickOnButton(btnSportsCategory_M));
		 waitForElement(btnBasketballCategory_M).isDisplayed();
			assertTrue(clickOnButton(btnBasketballCategory_M));
			waitForElement(plp_BasketballHoopsCategory_M).isDisplayed();
			assertTrue(clickOnButton(plp_BasketballHoopsCategory_M));
			
	 }
	 
	 
}
