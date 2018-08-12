package com.aso.qe.test.pageobject;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import com.aso.qe.framework.common.CommonActionHelper;

public class PDP_PO extends CommonActionHelper
{
	private static final Logger logger = Logger.getLogger(GlobalElementHeader_HomePO.class);
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
	@FindBy(xpath="//*[@data-auid='PDP_getNotifiedBackInStock']") public   WebElement txtNotifiedBack;
	@FindBy(xpath="//*[@data-auid='PDP_DetailsAndSpecs']") public   WebElement tabDetailsSpecs;
	@FindBy(xpath="//*[@data-auid='PDP_Reviews']")	public   WebElement tabReviews;
	@FindBy(xpath="//*[@data-auid='PDP_Q&A']")	public   WebElement tabQA;
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
	@FindBy(xpath="//*[@data-auid='swatchButton-image-4299']|//*[@data-auid='swatchButton-image-4060']") 	public   WebElement secSize1;
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
	@FindBy(xpath="//h2[@class='css-mhoryu e908uih2'][text()='Item Added Successfully']") public  WebElement addtocarttitle;
	@FindBy(xpath="//h1[text()='Shopping Cart']") public  WebElement viewcarttitle;
	@FindBy(xpath="//div[@class='message'][contains(text(),'Sorry')]") public  WebElement checkouttitle;

	@FindBy(xpath="//div[text()='Not Sold Online'] | //*[@data-auid='PDP_IventoryMessage']") 
	public WebElement txtNotsoldonline;//9aug danush
	//Start 28July2018
	@FindBy(xpath="(//*[contains(@data-auid, 'quickview')]//preceding-sibling::img)[1]")  public  WebElement pdpImage;
	@FindBy(xpath="(//*[contains(@data-auid, 'quickview')])[1]")  public  WebElement btnQuickView;
	@FindBy(xpath="//*[@data-auid='btnundefined']") public  WebElement btnSeeDetails;

	//KER-714 Start CR-AKK
	@FindBy(xpath="(//*[@data-auid='HP_PC_A_1']//img)[2]") public WebElement btnProdctimage;

	public void clickProdcutCardimage() throws Exception {
		assertTrue(clickOnButton(btnProdctimage));
	}
	//KER-714 End CR-AKK

	//KER-3412 Start CR-AKK
	@FindBy(xpath="(//*[contains(@data-auid, 'productCard_')])[19]") public WebElement btnProductCardimage;
	@FindBy(xpath="(//*[contains(@data-auid, 'productCard_')])[19]//div[contains(text(), 'Online Only')]")
	public WebElement txtPromotional;
	@FindBy(xpath="(//*[contains(@data-auid, 'productCard_')])[19]//div[contains(text(), 'Coleman')]")
	public WebElement txtProdctText;

	@FindBy(xpath="(//*[contains(@data-auid, 'productCard_')])[19]//span[contains(text(), '119')]")
	public WebElement txtProdctPrice;

	@FindBy(xpath="(//*[contains(@data-auid, 'productCard_')])[19]//div[@class='c-product__ratings-reviews my-quarter d-flex align-items-center']")
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
	@FindBy(xpath="//*[@data-auid='productCard_3486078']")public WebElement selectSCCY_CPX_2CB9mmPistol;
	@FindBy(xpath="//*[@data-auid='PDP_OnlineMessage']")public WebElement MsgPDP_OnlineMessage;
	@FindBy(xpath="//*[@data-auid='productCard_5242504']")public WebElement selectNikeToddlerGirlDNAShirtandShortsSet;
	@FindBy(xpath="//*[@data-auid='PDP_getNotifiedBackInStock']/../../*[1]")public WebElement  MsgOutOFStock;
	@FindBy(xpath="//*[@data-auid='productCard_3730178']")public WebElement selectBCGMenGolfShort;
	@FindBy(xpath="//*[@data-auid='PDP_close_Addtocart_Modal']") public WebElement btnCloseCrossAddToCartModel; //Anuj 7 Aug
	@FindBy(xpath="//*[contains(text(),'We added those to the cart')]") public WebElement txtLimitedQuantityAddedInCart; //Anuj 11 Aug



	//@FindBy(xpath="//*[@data-auid='PDP_getNotifiedBackInStock']") public   WebElement txtNotifiedBack;
	//KER-3455 @RKA
	@FindBy(xpath="(//*[contains(@data-auid,'productCard_')])[1]") public WebElement selectFirstItem;
	@FindBy(xpath="//*[@data-auid='PDP_Size_heading']/following-sibling::*/*[2]") public WebElement Btm3Toddler;
	@FindBy(xpath="//*[@data-auid='ContinueShopping']/../following-sibling::*[2]/*[1]/*[2]/*[1]")public WebElement msgItemAddedSuccessfully;
	@FindBy(xpath="//*[@data-auid='ContinueShopping']/../following-sibling::*[2]/*[1]/*[2]/*[1]/following-sibling::*[3]/*")public WebElement msgBundleProductPRice;
	@FindBy(xpath="//*[@data-auid='ContinueShopping']/../following-sibling::*[2]/*[1]/*[2]/*[1]/following-sibling::*[3]/following-sibling::*/*[2]") public WebElement btmViewcartATCnotificcation;
	@FindBy(xpath="//*[@data-auid='ContinueShopping']/../following-sibling::*[2]/*[1]/*[2]/*[1]/following-sibling::*[3]/following-sibling::*/*[1]") public WebElement btmCheckOutATCnotification;
	@FindBy(xpath="//*[@data-auid='ContinueShopping']/../following-sibling::*[2]/*[1]/*[1]")public WebElement  imgproductATCnotification;
	@FindBy(xpath="//*[@data-auid='ContinueShopping']/../following-sibling::*[2]/*[1]/*[1]/following-sibling::*/*[2]") public WebElement producrNameATCnotification;



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
	@FindBy(xpath="(//*[@data-auid='PDP_ProductImage_m']//img)[1]") public WebElement imgproductPDPSRCMobile;
	
	
	@FindBy(xpath="//*[@data-auid='PDP_MediaClick']//*[@alt='Hover/Click to enlarge'] | //*[@data-auid='PDP_ProductImage_m']//*[@alt='Hover/Click to enlarge'] ") public WebElement imgClickToZoom;
	@FindBy(xpath="//*[@data-auid='PDP_Modal_closeIcon']/* | //*[@data-auid='PDP_ProductImage_m']//ancestor::div[@aria-modal='true']//button[contains(text(),'X')]") public WebElement btnCloseCrossZoom;
	@FindBy(xpath="(//*[contains(text(),'Standard delivery of 10-14 days')])[1]") public WebElement txtShippingRelatedMsg; 
	
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
	
	//***********************************************************************************************************//


	//KER-1952 Start CR-AKK
	@FindBy(xpath = "//button[contains(text(), 'Ask a question')]") public WebElement btnAskQuestion;
	@FindBy(xpath = "//button[contains(text(), ' Answer this Question')]") public WebElement btnAnswerQuestion;
	@FindBy(xpath = "//button[@name='Cancel']") public WebElement btnCancel;
	
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
	@FindBy(xpath ="//input[@id='bv-checkbox-questions-termsAndConditions']") public WebElement btnChecbox;
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
			@FindBy(xpath="(//*[@class='c-product__colors-available m-noratings'])[1]")public WebElement itemWithNoReview;
			
			
			@FindBy(xpath="(//*[contains(text(),'Reviews')])[2]/../../following-sibling::*[1]/*[2]")public WebElement linkBeTheFirstTOReviewThisPRoduct;
			@FindBy(xpath="(//*[contains(@data-auid,'productCard_')])[*]/*[1]/*[2]/*[3]/*[1]/*/*[2]")public WebElement atLeastOneReview;
			
			
			//KER-1954Mob RKA
			@FindBy(xpath="//*[@data-auid='Reviews_m']/*")public WebElement btnPlusReviews_M;
			@FindBy(xpath="//*[@data-auid='productCard_3730178']") public WebElement selectproductWithReview;
			@FindBy(xpath="(//*[contains(text(),'Sort by')])[1]/../following-sibling::*") public WebElement selectSortby;
			@FindBy(xpath="(//*[contains(text(),'Reviews')])[4]/../following-sibling::*/*[1]")public WebElement reviewPaginationBackward;
			@FindBy(xpath="(//*[contains(text(),'Reviews')])[4]/../following-sibling::*/*[2]")public WebElement reviewPaginationForward;
			
			//KER-1950
			@FindBy(xpath="(//*[contains(text(),'Reviews')])[3]/parent::*/parent::*/parent::*/following-sibling::*[2]/*/*[2]/*[1]/*/*[1]/*[2]/*[1]/*[2]/*/*/*[1]/*/*") public WebElement mouseHoverOnReviewName;
			
	// KER-3728 Start CR-AKK
	@FindBy(xpath = "//*[@data-auid='level1Category-SHOP']")
	public WebElement btnShopCategory1;
	@FindBy(xpath = "//a[@data-auid='level2Category-Sports']")
	public WebElement btnSportsCategory;
	@FindBy(xpath = "//*[@data-auid='level4Category-Helmets']")
	public WebElement btnHelmetsCategory;
	@FindBy(xpath = "(//a[contains(@data-auid, 'productCard_')])[15]")
	public WebElement imgHelmetSKUCategory;
	@FindBy(xpath = "//h2[text()='Schutt Youth DNA Recruit Hybrid Football Helmet with ROPO Facemask']")
	public WebElement txtProdcutDetails;
	@FindBy(xpath = "//span[text()='DETAILS & SPECS']")
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
	@FindBy(xpath = "//a[@data-auid='level4Category-Helmets_m']")
	public WebElement HelmetsCategory_M;
	@FindBy(xpath = "(//button[contains(@data-auid, 'swatchButton-image-')])[1]")
	public WebElement imgSubHelmetsCategory;
	
	//KER-652 Start 
	@FindBy(xpath="//*[@data-auid='Rating Stars']")public WebElement starRatingOnPDPtop;
	@FindBy(xpath="//*[@data-auid='Rating Stars']/*/*/*[2]/*[2]/*|//*[@data-auid='Rating Stars']/*/*/*[3]/*[2]/*")public WebElement starRatingOnPDPtop_Zero;
	@FindBy(xpath="//*[@data-auid='Rating Stars']/*/*/*[2]/*[2]/*")public WebElement StarratingequalsZero;
			
	
	
	//Anuj
	@FindBy(xpath="//*[@data-auid='PDP_Size_heading']//following-sibling::div//*[contains(@data-auid,'swatchButton-image-')]/*[contains(text(),'XX')]")public WebElement btnXXLARGESizePDP;
	
	public void navigateToMultipleSKU() throws Exception {
		Thread.sleep(2000);
		assertTrue(clickOnButton(btnShopCategory1));
		Thread.sleep(3000);
		Actions hover = new Actions(getDriver());
		hover.moveToElement(btnSportsCategory).build().perform();
		assertTrue(clickOnButton(btnHelmetsCategory));
		Thread.sleep(3000);
	}

	public void clickOnImgSkuItem() throws Exception {
		Thread.sleep(3000);
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
		Actions hover=new Actions(getDriver());
		hover.moveToElement(pdpImage).build().perform();
		Thread.sleep(2000);
	}

	public void cilckQuickViewbutton() throws Exception {

		assertTrue(clickOnButton(btnQuickView));
		Thread.sleep(2000);
	}

	public void verifyAddcartOrSeeDetailsButton() throws Exception {
		if(isDisplayed(btnSeeDetails))
		{
			logger.debug("our history link is not displayed");
		}
		else
		{
			isDisplayed(btnAddToCart);
		}
	}
	//End 28July2018
	public PDP_PO(WebDriver webDriver) {
		super();
	}

	public void addToCartAvailability(){

		//String stockstatus = getText(txtNotifiedBack);
		if(isDisplayed(txtNotifiedBack))
		{
			logger.debug("errormessage:: Product is not available in stock");
			int nextImage=1;

			while(isEnabled(txtNotifiedBack)) {

				WebElement diffImage = driver.findElementByXPath("(//*[@data-auid='PDP_Color_Attribute']//button)["+nextImage+"]");

				clickOnButton(diffImage);

				nextImage++;

				System.out.println("************************ "+diffImage);

				boolean flag = isEnabled(txtNotifiedBack);

				System.out.println("************************addcart BTN "+flag);

				if(!flag) {

					logger.debug("break the loop");

					break;

				}
			}

		}
	}

	// SID 05-August-2018
	public void altColorMatch() throws InterruptedException {
		int colorCount = 0;
		for (WebElement colorAvailablePLP : colorsAvailablePLP) {
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

	//08-Aug Anuj  KER-1920
	public void addToCartProductValidationDesktop() throws InterruptedException {
		String productImage = imgSrcSKUAttribute.getAttribute("src");
		String productPrice = getText( txtPdpprice);
		String productTitle = getText( txtProductTitle);

		assertTrue(clickOnButton(btnAddToCart));
		Thread.sleep(3000);
		WebElement actualTitleInAddToCart = driver.findElement(By.xpath("(//*[text()=\""+productTitle+"\"])[4]"));
		WebElement actualPriceInAddToCart = driver.findElement(By.xpath("(//*[contains(text(),'"+productPrice+"')])[4]"));
		String productImageAddToCartPopup = imgAddToCartPopup.getAttribute("src");
		
		assertTrue(isDisplayed(actualTitleInAddToCart));
		assertTrue(isDisplayed(actualPriceInAddToCart));
		assertTrue(productImage.contains(productImageAddToCartPopup)); 
	}

	//08-Aug Anuj  KER-1920
	public void addToCartProductValidationMobile() {
		String productImage = imgproductPDPSRCMobile.getAttribute("src");
		String productPrice = getText( txtPdpprice);
		String productTitle = getText( txtProductTitle);

		assertTrue(clickOnButton(btnAddToCart));

		WebElement actualTitleInAddToCart = driver.findElement(By.xpath("(//*[contains(text(),\""+productTitle+"\")])[5]"));
		WebElement actualPriceInAddToCart = driver.findElement(By.xpath("//*[contains(@class,'ReactModal__Content ReactModa')]//*[contains(text(),"+productPrice+")]"));
		String productImageAddToCartPopup = imgAddToCartPopup.getAttribute("src");

		assertTrue(isDisplayed(actualTitleInAddToCart));
		assertTrue(isDisplayed(actualPriceInAddToCart));
		assertTrue(productImage.contains(productImageAddToCartPopup)); 
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
				
			
			driver.findElement(By.xpath("(//*[@class='c-product__colors-available m-noratings'])["+num+"]")).click();
			
			num++;
			waitForPageLoad(driver);
			
			System.out.println("555");
			waitForElement(starRatingOnPDPtop_Zero);
			
			if(StarratingequalsZero.getText().equals("(0)")) {
				
				break ;
			
			}
					
			}
			
			
		}
		
		

}
