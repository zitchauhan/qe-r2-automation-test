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
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;

public class R1_PDP_PO extends CommonActionHelper
{
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	String timeStamp = new SimpleDateFormat("MM.dd.HH.mm.ss").format(new Date());  //Sid
	R1_PLCC_Generic_PO generic_po = PageFactory.initElements(getDriver(), R1_PLCC_Generic_PO.class);
	R1_PLCC_Generic_PO genericPO = PageFactory.initElements(driver, R1_PLCC_Generic_PO.class);
	private String sku;   //Sid
	@FindBy(xpath="//*[@data-auid='btnAddToCart']") public WebElement AddToCartBtn;
	@FindBy(xpath="//*[@data-auid='btnbtnEnableBuyNow']")  public WebElement btnEnablebuynow;
	
	@FindBy(xpath="//*[@data-auid='PDP_MediaClick']|//ul[@class='slider animated']") public WebElement imgProductMainMixedMedia;
	@FindBy(xpath="(//*[@data-auid='PDP_MediaClick']|//ul[@class='slider animated'])[2]") public WebElement imgProductMainMixedMedia_m;//9aug danush
	@FindBy(xpath="//*[@data-auid='PDP_ProductName']") public WebElement txtProductTitle;
	@FindBy(xpath="//*[contains(@data-auid,'Size_Attribute')]") public WebElement secProductAttributeSizes;
	@FindBy(xpath="//*[@data-auid='btnAddToCart'] | //*[@data-auid='btnadd-to-cart']") public WebElement btnAddToCart;//modified SK - 24 Sep
	@FindBy(xpath = "//*[@data-auid='btnShipIt']")public WebElement shipItButton; //HP 03_23_19
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
	@FindBy(xpath="//*[@data-auid='PDP_Size_heading']//following-sibling::div//button[@aria-label='Small']|//*[@data-auid='PDP_Shoe Size_Attribute']//span[text()='10']") 	public   WebElement secSize1;
	@FindBy(xpath="//*[@data-auid='swatchButton-image-4286']|//*[@data-auid='swatchButton-image-4076']") 	public   WebElement secSize2;
	@FindBy(xpath="//*[@data-auid='btnviewCart']") 	public WebElement btnViewCart;
	@FindBy(xpath="//*[@data-auid='btncheckout'] | //*[@data-auid='crt_btnCheckoutTop']//*[@data-auid='btnCheckout']")   public WebElement btnCheckout;
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
	@FindBy(xpath="//*[@data-auid='ContinueShopping']/../following-sibling::*[1]/*[1]/*[2]/*[1] | //*[@data-auid='close-addtocart-modal']/parent::*//h4")public WebElement msgItemAddedSuccessfully;   //SID modified 12-December
	@FindBy(xpath="//*[@data-auid='ContinueShopping']/../following-sibling::*[1]/*[1]/*[2]/*[1]/following-sibling::*[3]/* | //*[@data-auid='close-addtocart-modal']/following-sibling::*/*[2]/*[1]/following-sibling::*[1]/*/*[1]/following-sibling::*[1]/*[2]")public WebElement msgBundleProductPRice;  //SID Modified 12-December
	@FindBy(xpath="//*[@data-auid='ContinueShopping']/../following-sibling::*[1]/*[1]/*[2]/*[1]/following-sibling::*[3]/following-sibling::*/*[2] | //*[@data-auid='btnviewCart']") public WebElement btmViewcartATCnotificcation;   //SID modified 12-December
	@FindBy(xpath="//*[@data-auid='ContinueShopping']/../following-sibling::*[1]/*[1]/*[2]/*[1]/following-sibling::*[3]/following-sibling::*/*[1] | //*[@data-auid='btncheckout']") public WebElement btmCheckOutATCnotification;    //SID modified 12-December
	@FindBy(xpath="//*[@data-auid='ContinueShopping']/../following-sibling::*[1]/*[1]/*[1] | //*[@data-auid='btncheckout']/parent::*[1]/parent::*[1]/parent::*[1]/*[2]/*[2]//img")public WebElement  imgproductATCnotification;   //SID modified 12-December
	@FindBy(xpath="//*[@data-auid='ContinueShopping']/../following-sibling::*[1]/*[1]/*[1]/following-sibling::*/*[2] | //*[@data-auid='btncheckout']/parent::*/parent::*/following-sibling::*[1]/*[1]/*[1]") public WebElement producrNameATCnotification;   //SID modified 12-December
	@FindBy(xpath = "//*[@data-auid='level3Category-Soccer']//*[@data-auid='level4Category-Youth Soccer Packages']" )
	public WebElement btnYouthSoccerPacakage;


	//KER-3455Mobile @RKA
	@FindBy(xpath="//*[@data-auid='ContinueShopping']/../following-sibling::*[2] | //*[@data-auid='close-addtocart-modal']/parent::*//h4")public WebElement msgItemAddedSuccessfully_M; //SID modified 12-December
	@FindBy(xpath="//*[@data-auid='ContinueShopping']/../following-sibling::*[3]/*[1]/*[2]/* | //*[@data-auid='close-addtocart-modal']/following-sibling::*/*[2]/*[1]/following-sibling::*[1]/*/*[1]/following-sibling::*[1]/*[2]")public WebElement msgBundleProductPRice_M;  //SID Modified 12-December
	@FindBy(xpath="//*[@data-auid='btncheckout'] | //*[@data-auid='btncheckout_m']")public WebElement  btmCheckOutATCnotification_M;  //Sid modified 12-December
	@FindBy(xpath="//*[@data-auid='btnviewCart'] |//*[@data-auid='btnviewCart_m']")public WebElement btmViewcartATCnotificcation_M; //Sid modified 12-December
	@FindBy(xpath="//*[@data-auid='ContinueShopping']/../following-sibling::*[3]/*[1]/*[3]/* | //*[@data-auid='btnviewCart_m']/parent::*[1]/parent::*[1]/parent::*[1]/*[2]/*[2]//img")public WebElement  imgproductATCnotification_M;   //SID modified 12-December
	@FindBy(xpath="//*[@data-auid='ContinueShopping']/../following-sibling::*[3]/*[1]/*[1] | //*[@data-auid='btncheckout_m']/parent::*/parent::*/following-sibling::*[1]/*[1]/*[1]")public WebElement  producrNameATCnotification_M;  //SID modified 12-December


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
	@FindBy(xpath="//*[@data-auid='PDP_MediaClick']//img") public List<WebElement> imgSrcSKUAttribute ; //SID modified 20-Nov
	@FindBy(xpath="(//*[contains(@class,'ReactModal__Overlay ReactModal__Overlay')]//img)[1]") public WebElement imgAddToCartPopup ;
	@FindBy(xpath="(//*[@data-auid='PDP_ProductImage_m']//img)") public List<WebElement> imgproductPDPSRCMobile;  //SID Modified 20-November


	@FindBy(xpath="(//*[@data-auid='PDP_MediaClick']//*[@alt='Hover/Click to enlarge'])[1]") public WebElement imgClickToZoom;
	@FindBy(xpath="(//*[@data-auid='PDP_ProductImage_m']//*[@alt='Hover/Click to enlarge'] )[3]") public WebElement imgClickToZoomMobile;
	@FindBy(xpath="//*[@data-auid='PDP_Modal_closeIcon']/* | //*[@data-auid='PDP_ProductImage_m']//ancestor::div[@aria-modal='true']//button[contains(text(),'X')]") public WebElement btnCloseCrossZoom;
	@FindBy(xpath="(//*[contains(text(),'days')])[1]") public WebElement txtShippingRelatedMsg;  //SID 7-September

	@FindBy(xpath = "//*[contains(@data-auid,'productCard_')]//span[contains(@class,'c-product__colors-available')and contains(text(),'colors')]")	public List<WebElement> colorsAvailablePLP; //SID 4-October
	@FindBy(xpath = "//*[@data-auid='PDP_Color_Attribute']")	public WebElement visibilityAltColorPDP;
	@FindBy(xpath = "//*[@data-auid='PDP_Color_Attribute']//button[contains(@data-auid,'swatchButton-image-')]//img")	public List<WebElement> altColorsPDP;
	@FindBy(xpath = "//*[@data-auid='PDP_MediaClick']//img | //*[@data-auid='PDP_ProductImage_m']//img | (//*[@data-component='productDetailsMultiSkuPackage']//img)[1] | (//*[@data-component='productDetailsMultiSku']//img)[1] | (//*[@data-auid='PDP_MediaClick']//img)[1]")	public WebElement selectedSwatchRepresentative; //SID modified 9-October
	@FindBy(xpath = "//*[@data-auid='PDP_Color_heading']//*[2]")	public WebElement selectedSwatchColor;
	@FindBy(xpath = "//*[@data-auid='PDP_close_wishList']")	public WebElement closeWishlistModal;
	@FindBy(xpath = "//*[@data-auid='input_newWishListName']")	public WebElement txtWishlist;
	@FindBy(xpath = "//*[@data-auid='btnwishListPopover_createList'] | //*[@data-auid='btnwishListPopover_createList_m']")	public WebElement createWishlist;
	@FindBy(xpath = "//*[@data-auid='btnwishListPopover_createList']")	public WebElement createWishlistPDP;  //SID 12-Jan
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
	@FindBy(xpath = "(//*[contains(text(),'Checkout')])[1]")public WebElement btnCheckoutReskin;
	@FindBy(xpath = "(//*[@data-auid='PDP_ProductImage_m']//img)[3]")public WebElement SLRPDPRepresentative;  //SID 19-October
	
	@FindBy(xpath ="//*[@data-component='productDetailsGeneric']//*[@id='PMC']/*") public WebElement legalMessageAmmoPDP;  //SID 7-Jan
	@FindBy(xpath ="//*[@data-auid='PDP_IventoryMessage']/following-sibling::div/a") public WebElement storeNameClick;  //SID 7-Jan
	@FindBy(xpath ="//*[@class='css-mf7uih css-17a3g4d'] | //*[contains(@class,'academyicon icon-store')]") public WebElement pickUpIconGreyedOut;  //SID 12-Jan
	
	
	//***********************************************************************************************************//
	//DELETE below Xpath when all Add to Cart has been cahnged to Ship It
	@FindBy(xpath="//*[contains(@class,'ReactModal__Content ReactModa')]//*[@data-auid='btnviewCart']") public WebElement btnAddToCartModal; //SID Modified 17-October
	@FindBy(xpath="//*[contains(@class,'ReactModal__Content ReactModa')]//*[@data-auid='btnviewCart']") public WebElement btnViewCartCheckout;
	//KER-1952 Start CR-AKK
	@FindBy(xpath = "//button[contains(text(), 'Ask a question')]") public WebElement btnAskQuestion;
	@FindBy(xpath = "//button[contains(text(), ' Answer this Question')]") public WebElement btnAnswerQuestion;
	@FindBy(xpath = "//button[@name='Cancel']") public WebElement btnCancel;
	
	//KER-2728 Anuj 14 Aug
	@FindBy(xpath = "//*[contains(@data-auid,'PDP_PromoMessage')]") public WebElement txtPromoCodePDP;
	@FindBys({ @FindBy(xpath="//*[@data-auid='PDP_Color_Attribute']//button [not(*[local-name()='svg'])]")}) public List<WebElement> colorsAvailable;
	@FindBys({ @FindBy(xpath="(//*[@data-auid='PDP_Size_Attribute']//button[@role] [not(*[local-name()='svg'])])")}) public List<WebElement> sizeAvailable;
	@FindBys({ @FindBy(xpath="(//*[@data-auid='PDP_Size_Attribute']//button[@role] [(*[local-name()='svg'])])")}) public List<WebElement> sizeNotAvailable; //SID 5-October
	
	@FindBy(xpath="//*[text()='Size']/../following-sibling::*//*[@data-auid='swatchButton-image-3782' and not(*[local-name()='svg'])]")
	public WebElement availableSizeForMultiSkuProduct;
	
		@FindBys({ @FindBy(xpath="//*[text()='Size']/parent::div/following-sibling::div//button[not(*[local-name()='svg'])]")}) public List<WebElement> sizeAvailableMultipleSKU;  //SID 2-October
	@FindBy(xpath="//*[text()='Size']/../preceding-sibling::*//*[@data-auid='swatchButton-image-3782' and not(*[local-name()='svg'])]")
	public WebElement availableColorForMultiSkuProduct;
	
	@FindBy(xpath="//*[text()='Shoe Size']/../following-sibling::*//*[@data-auid='swatchButton-image-3782' and not(*[local-name()='svg'])]")
	public WebElement availableSizeForBundleProduct;
	
	@FindBy(xpath="//*[text()='Shoe Size']/../preceding-sibling::*//*[@data-auid='swatchButton-image-3782' and not(*[local-name()='svg'])]")
	public WebElement availableColorForBundleProduct;
	
	
	@FindBys({ @FindBy(xpath="//*[text()='Color']/parent::div/following-sibling::div//button[not(*[local-name()='svg'])]")}) public List<WebElement> colorsAvailableMultipleSKU; //SID 2-October
	@FindBy(xpath="//*[text()='Shoe Width']/../following-sibling::*//*[@data-auid='swatchButton-image-3782' and not(*[local-name()='svg'])]")
	public WebElement availableBallSizesForBundleProduct;
	
	@FindBy(xpath="//*[text()='Shoe Width']/../following-sibling::*//*[@data-auid='swatchButton-image-3782' and not(*[local-name()='svg'])]")
	public WebElement availableWidthForBundleProduct;
	
	@FindBy(xpath = "//*[@data-auid='undefined_INC']")
	public WebElement increaseQuantityForBaitProduct;
	
	@FindBy(xpath = "//*[@data-auid='btnundefined']")
	public WebElement addSelectionsToCart;
	
	
	@FindBy(xpath = "//*[text()='Ball Size']/../preceding-sibling::*//*[@data-auid='swatchButton-image-3782' and not(*[local-name()='svg'])]")
	public WebElement availableBallColorForBundleProduct;
	
	@FindBy(xpath = "//*[text()='Ball Size']/../following-sibling::*//*[@data-auid='swatchButton-image-3782' and not(*[local-name()='svg'])]")
	public WebElement availableBallSizeForBundleProduct;
	

	public void cilckAnswerThisQuestion() throws Exception {
		assertTrue(clickOnButton(btnAnswerQuestion));
		Thread.sleep(Constants.thread_low);
	}

	public void cilckOnCancel() throws Exception {
		assertTrue(clickOnButton(btnCancel));
		Thread.sleep(Constants.thread_low);
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
	@FindBy(xpath = "//*[text()='adidas Green Soccer Package']")
	public WebElement imgSoccerSKUCategory;  //SDK 9-October

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
	public WebElement txtDetails_M;  //SID Modified 30-November
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
	@FindBy(xpath = "//a[@data-auid='level4Category-Youth Soccer Packages_m']")
	public WebElement YouthSoccerCategory_M;
	@FindBy(xpath = "//a[@data-auid='level3Category-Soccer_m']")
	public WebElement btnSoccerCategory_M;
	@FindBy(xpath = "//*[@data-auid='tooltipproductBopisMsg']/following-sibling::*") 	public WebElement storeTimingPDP;  //SID 2-Jan
	
	
	
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
		Thread.sleep(Constants.thread_low);
		assertTrue(clickOnButton(btnShopCategory1));
		Thread.sleep(Constants.thread_low);
		Actions hover = new Actions(getDriver());
		hover.moveToElement(btnSportsCategory).build().perform();
		Thread.sleep(Constants.thread_low);
		hover.moveToElement(btnFootballHelmetsCategory).build().perform();
		clickOnLink(btnFootballHelmetsCategory);
		Thread.sleep(Constants.thread_medium);
	}

	//SID 28-AUgust
	public void clickOnImgSkuItem() throws Exception {
		waitForElement(imgHelmetSKUCategory);
		scrollPageToWebElement(imgHelmetSKUCategory);
		Actions hover = new Actions(driver);
		hover.moveToElement(imgHelmetSKUCategory).click().build().perform();
//		assertTrue(clickOnButton(imgHelmetSKUCategory));
		Thread.sleep(Constants.thread_low); 
	}

	public void navigateToMultipleSKU_Mobile() throws Exception {
		Thread.sleep(Constants.thread_low); 
		assertTrue(clickOnButton(btnSportsCategory_M));
		Thread.sleep(Constants.thread_low); 
		assertTrue(clickOnButton(btnFootballCategory_M));
		Thread.sleep(Constants.thread_low); 
		assertTrue(clickOnButton(HelmetsCategory_M));
		Thread.sleep(Constants.thread_low); 
	}
	// KER-3728 End CR-AKK

	public void moveToPdpImage1() throws Exception {
		Actions hover = new Actions(getDriver());
		hover.moveToElement(pdpImage1).build().perform();
		Thread.sleep(Constants.thread_low); 
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

			if (shipItButton.isDisplayed()) 
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
					if(isDisplayed(shipItButton))
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
		logger.debug("Ship It buttion is visible::"+isAddtoCart);
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
			assertEquals(selectedSwatchColor.getText().trim(),altColorPDP.getAttribute("alt").trim());
		}

	}

	//08-Aug Anuj  KER-1920 //Modified SID 28-August
	public void addToCartProductValidationDesktop() throws InterruptedException {
		List<String> productImage = new ArrayList<String>();
		addToCartAvailability();
		for (WebElement imgSrcAttribute : imgSrcSKUAttribute) {
			productImage.add(imgSrcAttribute.getAttribute("src"));
		}
		String productPrice = getText( txtPdpprice);
		String productTitle = getText( txtProductTitle);
		assertTrue(clickOnButton(btnAddToCart));
		Thread.sleep(Constants.thread_medium); 
		WebElement actualTitleInAddToCart = driver.findElement(By.xpath("//*[contains(@class,'ReactModal__Content ReactModa')]//*[contains(text(),"+"\""+productTitle+"\""+")]"));//SID
		WebElement actualPriceInAddToCart = driver.findElement(By.xpath("//*[contains(@class,'ReactModal__Content ReactModa')]//*[contains(text(),'"+productPrice+"')]"));
		String productImageAddToCartPopup = imgAddToCartPopup.getAttribute("src");
		String[] productImageAddToCartPopupLink = productImageAddToCartPopup.split("\\?");//SID
		System.err.println(productTitle);
		System.err.println(actualTitleInAddToCart.getText());
		assertEquals(productTitle, actualTitleInAddToCart.getText());//SID
		assertEquals(productPrice, actualPriceInAddToCart.getText());//SID
		int numberImages = productImage.size();
		int calculateSize = 0;
		Boolean flag = false;
		while (calculateSize <= numberImages) {
			String[] productImageLink = productImage.get(calculateSize).split("\\?"); // SID
			System.err.println(productImageLink[0]);
			flag = productImageLink[0].contains(productImageAddToCartPopupLink[0]);
			if (flag == true) {
				assertTrue(productImageLink[0].contains(productImageAddToCartPopupLink[0])); // SID
				break;
			}
		}
	}

	// 08-Aug Anuj KER-1920 //Modified SID 28-August
	public void addToCartProductValidationMobile() throws InterruptedException {
		List<String> productImage = new ArrayList<String>();
		//addToCartAvailability(); -- PLCC Team
		for (WebElement imgproductPDPMobile : imgproductPDPSRCMobile) {
			productImage.add(imgproductPDPMobile.getAttribute("src"));
		}
		String productPrice = getText(txtPdpprice);
		String productTitle = getText(txtProductTitle);
		assertTrue(clickOnButton(generic_po.shipItButton));
		Thread.sleep(7000);
		logger.error("Add to cart modal is not coming");
		WebElement actualTitleInAddToCart = driver.findElement(By.xpath("//*[contains(@class,'ReactModal__Content ReactModa')]//*[contains(text(),"+"\""+productTitle+"\""+")]"));//SID
		WebElement actualPriceInAddToCart = driver.findElement(By.xpath("//*[contains(@class,'ReactModal__Content ReactModa')]//*[contains(text(),'"+productPrice+"')]"));
		String productImageAddToCartPopup = imgAddToCartPopup.getAttribute("src");
		String[] productImageAddToCartPopupLink = productImageAddToCartPopup.split("\\?");//SID
		assertEquals(productTitle, actualTitleInAddToCart.getText());// SID
		assertEquals(productPrice, actualPriceInAddToCart.getText());// SID
		int numberImages = productImage.size();
		int calculateSize = 0;
		Boolean flag = false;
		while (calculateSize <= numberImages) {
			String[] productImageLink = productImage.get(calculateSize).split("\\?"); // SID
			System.err.println(productImageLink[0]);
			System.err.println(productImageAddToCartPopupLink[0]);
			flag = productImageLink[0].contains(productImageAddToCartPopupLink[0]);
			if (flag == true) {
				assertTrue(productImageLink[0].contains(productImageAddToCartPopupLink[0])); // SID
				break;
			}
		}
	}

	// SID 7-August-18
	public void createWishList() throws InterruptedException {
		Thread.sleep(2000);
		txtWishlist.click();
		Thread.sleep(2000);
		txtWishlist.sendKeys(timeStamp);
		Thread.sleep(2000);
		assertTrue(clickOnButton(createWishlistPDP));

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
		if(isDisplayed(pdpRating) && isDisplayed(pdpPromoMessage)) {
			flag=true;
		}
		else if(isDisplayed(pdpRating)) {
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
		 if("mobile".equals(testtype)) {
		 assertTrue(clickOnButton(btnSportsCategory_M));
		 waitForElement(btnBasketballCategory_M).isDisplayed();
			assertTrue(clickOnButton(btnBasketballCategory_M));
			waitForElement(plp_BasketballHoopsCategory_M).isDisplayed();
			assertTrue(clickOnButton(plp_BasketballHoopsCategory_M));
		 }else {
			 assertTrue(clickOnButton(btnSportsCategory_M));
			 waitForElement(btnBasketballCategory_M).isDisplayed();
				assertTrue(clickOnButton(btnBasketballCategory_M));
				waitForElement(plp_BasketballHoopsCategory_M).isDisplayed();
				assertTrue(clickOnButton(plp_BasketballHoopsCategory_M));
		 }
	 }
	 
	 
	// SID 12-October
	public Boolean checkBtnaddToCartMultipleSKUPackage() {
		boolean isAddtoCart = false;
		boolean flag = false;
		try {
			waitForElement(selectedSwatchRepresentative);
			isDisplayed(selectedSwatchRepresentative);
			if (sizeAvailableMultipleSKU.size()>0) {
				isAddtoCart = true;
			} else {
				System.err.println("INSIDE ELSE");
				for (WebElement colorElement : colorsAvailableMultipleSKU) {
					clickOnButton(colorElement);
					flag = sizeAvailableMultipleSKU.size() > 0;
					if (flag) {
						for (WebElement sizeElement : sizeAvailableMultipleSKU) {
							logger.debug("Product Size Txt::" + sizeElement.getText());
							clickOnButton(sizeElement);
							if (sizeAvailableMultipleSKU.size()>0) {
								isAddtoCart = true;
								break;
							}
						}
						if (isAddtoCart) {
							break;
						}
					}
				}

			}
		} catch (NoSuchElementException e) {
			System.err.println("INSIDE EXCEPTION1");
			for (WebElement colorElement : colorsAvailableMultipleSKU) {
				clickOnButton(colorElement);
				try {
					flag = sizeAvailableMultipleSKU.size() > 0;
					if (flag) {
						for (WebElement sizeElement : sizeAvailableMultipleSKU) {
							logger.debug("Product Size Txt::" + sizeElement.getText());
							clickOnButton(sizeElement);
							if (sizeAvailableMultipleSKU.size()>0) {
								isAddtoCart = true;
								break;
							}
						}
						if (isAddtoCart) {
							break;
						}
					}
				} catch (Exception ex) {
					System.err.println("INSIDE EXCEPTION2");
					if (isAddtoCart) {
						System.err.println("NOT WORKING");
						break;
					}
				}
			}
		} catch (Exception e) {
			logger.error("checkBtnNext exception msg::" + e.getMessage());
		}
		logger.debug("Add to cart multiple sku package button is visable::" + isAddtoCart);
		return isAddtoCart;
	}
	 
	// SID 2-October
	public Boolean checkBtnNext() {
		boolean btnNext = false;
		boolean flag = false;
		try {
			waitForElement(selectedSwatchRepresentative);
			isDisplayed(selectedSwatchRepresentative);
			if (btnNextStep.isEnabled()) {
				btnNext = true;
			} else {
				for (WebElement colorElement : colorsAvailableMultipleSKU) {
					clickOnButton(colorElement);
					flag = sizeAvailableMultipleSKU.size() > 0;
					if (flag) {
						for (WebElement sizeElement : sizeAvailableMultipleSKU) {
							logger.debug("Product Size Txt::" + sizeElement.getText());
							clickOnButton(sizeElement);
							if (btnNextStep.isEnabled()) {
								btnNext = true;
								break;
							}
						}
						if (btnNext) {
							break;
						}
					}
				}

			}
		} catch (NoSuchElementException e) {
			for (WebElement colorElement : colorsAvailableMultipleSKU) {
				clickOnButton(colorElement);
				try {
				flag = sizeAvailableMultipleSKU.size() > 0;
				if (flag) {
					for (WebElement sizeElement : sizeAvailableMultipleSKU) {
						logger.debug("Product Size Txt::" + sizeElement.getText());
						clickOnButton(sizeElement);
						if (btnNextStep.isEnabled()) {
							btnNext = true;
							break;
						}
					}
					if (btnNext) {
						break;
					}
				}
			}
				catch(Exception ex) {
					if (btnNext) {
						System.err.println("NOT WORKING");
						break;
					}
				}
			}
		} catch (Exception e) {
			logger.error("checkBtnNext exception msg::" + e.getMessage());
		}
		logger.debug("Next button is visable::" + btnNext);
		return btnNext;
	}

	// SID 5-October
	public Boolean checkAddtoCartDisabled() {
		boolean isAddtoCart = false;
		System.err.println("ADD TO CART ENTER");
		try {
			waitForElement(selectedSwatchRepresentative);
			isDisplayed(selectedSwatchRepresentative);

			if (!genericPO.shipItButton.isDisplayed()) {
				isAddtoCart = true;

			} else {
				for (WebElement sizeElement : sizeNotAvailable) {
					logger.debug("Product Size Txt::" + sizeElement.getText());
					clickOnButton(sizeElement);
					if (!isDisplayed(genericPO.shipItButton)) {
						isAddtoCart = true;
						break;
					}
				}
			}
		} catch (NoSuchElementException e) {
			for (WebElement sizeElement : sizeNotAvailable) {
				logger.debug("Product Size Txt::" + sizeElement.getText());
				clickOnButton(sizeElement);
				if (!genericPO.shipItButton.isDisplayed()) {
					isAddtoCart = true;
					break;
				}
			}
		} catch (Exception e) {
			logger.error("checkAddtoCartDisabled exception msg::" + e.getMessage());
		}
		logger.debug("Add to Cart button is not visable::" + isAddtoCart);
		return isAddtoCart;
	}

	// SID 9-Oct
	public boolean giftCardColor() throws InterruptedException {
		boolean isAddtoCart = false;
		try {
			waitForElement(selectedSwatchRepresentative);
			isDisplayed(selectedSwatchRepresentative);

			if (btnAddToCart.isDisplayed()) {
				isAddtoCart = true;

			} else {

				for (WebElement colorElement : colorsAvailable) {
					clickOnButton(colorElement);
					if (isAddtoCart) {
						break;
					}
				}

			}
		} catch (NoSuchElementException e) {
			for (WebElement colorElement : colorsAvailable) {
				clickOnButton(colorElement);
				if (isAddtoCart) {
					break;
				}
			}
		} catch (Exception e) {
			logger.error("addToCartAvailability exception msg::" + e.getMessage());
		}
		logger.debug("Add to Cart buttion is visible::" + isAddtoCart);
		return isAddtoCart;
	}
	
	public void navigateToMultipleSKUSoccer_Mobile() throws Exception {
		Thread.sleep(2000);
		assertTrue(clickOnButton(btnSportsCategory_M));
		Thread.sleep(2000);
		assertTrue(clickOnButton(btnSoccerCategory_M));
		Thread.sleep(2000);
		assertTrue(clickOnButton(YouthSoccerCategory_M));
		Thread.sleep(3000);
	}
	//SDK 9-October
		public void navigateToMultipleSKUSoccer() throws Exception {
			Thread.sleep(2000);
			assertTrue(clickOnButton(btnShopCategory1));
			Thread.sleep(1000);
			Actions hover = new Actions(getDriver());
			hover.moveToElement(btnSportsCategory).build().perform();
			Thread.sleep(1000);
			hover.moveToElement(btnYouthSoccerPacakage).build().perform();
			clickOnLink(btnYouthSoccerPacakage);
			Thread.sleep(3000);
		}
		
		//SDK - 9-October
				public void clickOnImgSku() throws Exception {
					scrollPageToWebElement(imgSoccerSKUCategory);
					Actions hover = new Actions(getDriver());
					hover.moveToElement(imgSoccerSKUCategory).click().build().perform();
//					assertTrue(clickOnButton(imgHelmetSKUCategory));
					Thread.sleep(2000);
				}
}
