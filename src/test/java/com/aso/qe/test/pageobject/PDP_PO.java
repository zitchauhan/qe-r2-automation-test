package com.aso.qe.test.pageobject;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.aso.qe.framework.common.CommonActionHelper;

public class PDP_PO extends CommonActionHelper{


	private static final Logger logger = Logger.getLogger(PDP_PO.class);
	@FindBy(xpath="//*[@data-auid='PDP_MediaClick']|//ul[@class='slider animated']") public WebElement imgProductMainMixedMedia;
	@FindBy(xpath="//*[@data-auid='PDP_ProductName']") public WebElement txtProductTitle;
	@FindBy(xpath="//div[@class='css-1u05fs2 e5lk8y40']") public WebElement secProductAttributeSizes;
	@FindBy(xpath="//*[@data-auid='btnAddToCart']") public WebElement btnAddToCart;
	@FindBy(xpath="//*[@data-auid='PDP_QC_DEC']") public WebElement btnQuantityDec;
	@FindBy(xpath="//*[@data-auid='PDP_QC_INC']") public   WebElement btnQuantityInc;
	@FindBy(xpath="//input[@aria-label='Enter Desired Quantity' and @value='1']") public   WebElement txtDesiredQtyValue_1;
	@FindBy(xpath="//*[@data-auid='PDP_getNotifiedBackInStock']") public   WebElement txtNotifiedBack;
	@FindBy(xpath="//*[@data-auid='PDP_DetailsAndSpecs']") public   WebElement tabDetailsSpecs;
	@FindBy(xpath="//*[@data-auid='PDP_Reviews']")	public   WebElement tabReviews;
	@FindBy(xpath="//*[@data-auid='PDP_Q&A']")	public   WebElement tabQA;
	@FindBy(xpath="//*[@id='react-tabs-1']")	public   WebElement secLongDescription;
	@FindBy(xpath="//p[contains(text(),'Features and Benefits')]") 	public   WebElement textFeatureBenefits;
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
	@FindBy(xpath="(//*[contains(@data-auid,'swatchButton-image-')])[6]") public WebElement btnDifferentColor;
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

	@FindBy(xpath="//div[text()='Not Sold Online']") 
	public WebElement txtNotsoldonline;
	//Start 28July2018
	@FindBy(xpath="(//*[contains(@data-auid, 'productCard_')]/div)[1]")  public  WebElement pdpImage;
	@FindBy(xpath="(//*[contains(@data-auid, 'btnproductCard_')])[1]")  public  WebElement btnQuickView;
	@FindBy(xpath="//*[@data-auid='btnundefined']") public  WebElement btnSeeDetails;

	//KER-714 Start CR-AKK
	@FindBy(xpath="(//div[@class='col-4 sc-product-card']//img)[1]") public WebElement btnProdctimage;

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
	@FindBy(xpath="//*[@data-auid='PDP_close_Addtocart_Modal']/following-sibling::section")public WebElement MsgSelectedItemLimited;
	@FindBy(xpath="//*[@data-auid='productCard_3486078']")public WebElement selectSCCY_CPX_2CB9mmPistol;
	@FindBy(xpath="//*[@data-auid='PDP_OnlineMessage']")public WebElement MsgPDP_OnlineMessage;
	@FindBy(xpath="//*[@data-auid='productCard_5242504']")public WebElement selectNikeToddlerGirlDNAShirtandShortsSet;
	@FindBy(xpath="//*[@data-auid='PDP_getNotifiedBackInStock']/../../*[1]")public WebElement  MsgOutOFStock;
	@FindBy(xpath="//*[@data-auid='productCard_3730178']")public WebElement selectBCGMenGolfShort;



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
	
	//KER-3455 END
	public void clickShritImage() throws Exception {
		assertTrue(clickOnButton(btnShritImage));
	}
	@FindBy(xpath="(//*[contains(@data-auid, 'productCard_')])[2]")  public WebElement btnPlpImage;
	public void clickPlpImage() throws Exception {
		assertTrue(clickOnButton(btnPlpImage));
	}

	@FindBy(xpath="(//*[contains(@data-auid, 'productCard_')])[2]//span[contains(text(), '14')]")
	public WebElement txtPlpPrice;

	@FindBy(xpath="//*[@data-auid='PDP_ProductPrice']//span[contains(text(), '14')]")
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
	
	@FindBy(xpath = "//*[contains(@data-auid,'productCard_')]//span[contains(@class,'c-product__colors-available')]")	public List<WebElement> colorsAvailablePLP;
	@FindBy(xpath = "//*[@data-auid='PDP_Color_Attribute']")	public WebElement visibilityAltColorPDP;
	@FindBy(xpath = "//*[@data-auid='PDP_Color_Attribute']//button[contains(@data-auid,'swatchButton-image-')]//img")	public List<WebElement> altColorsPDP;
	@FindBy(xpath = "//*[@data-auid='PDP_MediaClick']//img | //*[@data-auid='PDP_ProductImage_m']//img")	public WebElement selectedSwatchRepresentative;
	@FindBy(xpath = "//*[@data-auid='PDP_Color_heading']//*[2]")	public WebElement selectedSwatchColor;
	

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
	@FindBy(xpath ="//input[@id='bv-email-field-hostedauthentication_authenticationemail']") public WebElement inputEmail;
	@FindBy(xpath ="//input[@id='bv-checkbox-questions-termsAndConditions']") public WebElement btnChecbox;
	@FindBy(xpath ="//button[text()='Post Question']") public WebElement btnPostQuesdtion;
	@FindBy(xpath ="//button[@aria-label='Yes, answer by Anonymous is helpful.']") public WebElement btnYes;
	@FindBy(xpath ="//button[@aria-label='No, answer by Anonymous is not helpful.']") public WebElement btnNo;
	//KER-1937 Start CR-AKK
	
	//KER-737 Start CR-AKK
	@FindBy(xpath ="(//*[contains(@data-auid, 'productCard_')]/div)[3]") public WebElement pdpImage1;
	
	public void moveToPdpImage1() throws Exception {
		Actions hover=new Actions(getDriver());
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

}
