package com.aso.qe.test.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aso.qe.framework.common.CommonActionHelper;

public class PDP_PO extends CommonActionHelper{
	//private static final Logger logger = Logger.getLogger(PDP_PO.class);

	//@FindBy(xpath="//div[@class='product-mixed-media-wrapper']//img[contains(@src,'')]") 
	@FindBy(xpath="//li[@class='slide selected']//img")
	public WebElement imgProductMainMixedMedia_Mobile;
	
	@FindBy(xpath="//div[text()='Not Sold Online']") 
	public WebElement txtNotsoldonline;
	
	@FindBy(xpath="//div[@data-auid='PDP_MediaClick']") 
	public WebElement imgProductMainMixedMedia;

	@FindBy(xpath="//h1[@data-auid='PDP_ProductName']") 
	public WebElement txtProductTitle;

	@FindBy(xpath="//div[@class='css-1u05fs2 e5lk8y40']") 
	public WebElement secProductAttributeSizes;

	@FindBy(xpath="//button[@data-auid='btnAddToCart']") 
	public WebElement btnAddToCart;

	@FindBy(xpath="//button[@data-auid='PDP_QC_DEC']") 
	public WebElement btnQuantityDec;

	@FindBy(xpath="//button[@data-auid='PDP_QC_INC']") 
	public   WebElement btnQuantityInc;

	@FindBy(xpath="//input[@aria-label='Enter Desired Quantity' and @value='1']") 
	public   WebElement txtDesiredQtyValue_1;

	@FindBy(xpath="//div[@data-auid='PDP_OnlineMessage']") 
	public   WebElement txtInStock;

	@FindBy(xpath="//li[@data-auid='PDP_DetailsAndSpecs']") 
	public   WebElement tabDetailsSpecs;

	@FindBy(xpath="//li[@data-auid='PDP_Reviews']") 
	public   WebElement tabReviews;

	@FindBy(xpath="//li[@data-auid='PDP_Q&A']") 
	public   WebElement tabQA;

	@FindBy(xpath="//p[contains(@class,'css-8fkoyy')]") 
	public   WebElement secLongDescription;

	@FindBy(xpath="//p[contains(text(),'Features and Benefits')]") 
	public   WebElement textFeatureBenefits;

	@FindBy(xpath="//button[@data-auid='btnundefined' and text()='Read More']") 
	public   WebElement btnReadMore;

	@FindBy(xpath="//button[@data-auid='btnundefined' and text()='Read Less']") 
	public   WebElement btnReadLess;

	@FindBy(xpath="//img[@class='bv-trustmarkIcon-image']") 
	public   WebElement ImgHallmark;

	@FindBy(xpath="//h2[text()='Reviews']") 
	public   WebElement textReviews;

	@FindBy(xpath="//h2[text()='Questions']") 
	public   WebElement textQuestions;

	@FindBy(xpath="//span[contains(@data-auid,'sku_')]")
	public   WebElement txtProductSKU;

	@FindBy(xpath="//span[contains(@data-auid,'item_')]")
	public   WebElement txtProductItemNumber;

	@FindBy(xpath="//div[@data-auid='swatchButton-image-4299']|//div[@data-auid='swatchButton-image-4060']") 
	public   WebElement secSize1;

	@FindBy(xpath="//div[@data-auid='swatchButton-image-4286']|//div[@data-auid='swatchButton-image-4076']") 
	public   WebElement secSize2;

	@FindBy(xpath="//button[@data-auid='btnviewCart']") 
	public WebElement btnViewCart;
	
	@FindBy(xpath="//button[@data-auid='btncheckout']") 
	public WebElement btnCheckout;
	
	@FindBy(xpath="//div[@data-auid='PDP_AddToWishList']") 
	public WebElement btnAddToWishList; //Anuj Added for KER-1953
	
	@FindBy(xpath="(//div[contains(@data-auid,'swatchButton-image-')])[6]") public WebElement btnDifferentColor;
	
	@FindBy(xpath="//div[contains(@data-auid,'swatchButton-image-')]/span[text()='Medium']") public WebElement btnMediumSize;
	
	@FindBy(xpath="//div[contains(@class,'ReactModal__Content ReactModal__Content--after-open')]") public WebElement secAddToCartPopup;
	
	@FindBy(xpath="(//a[@class='cartitem-title'])[1]") public WebElement secCheckoutPageProductTitle;
	//div[@class='row cartitem-row-inner']//a[@class='cartitem-title']
		//KER-1920
	@FindBy(xpath="//a[text()='Continue Shopping']") 
	public  WebElement lnkconitnueshopping;

		@FindBy(xpath="//button[@data-auid='close-addtocart-modal']") 
		public  WebElement closeicon;
		
		@FindBy(xpath="//img[@class='css-14pbatb e908uih3'][contains(@src,'')]") 
		public  WebElement productimage;
		
		@FindBy(xpath="//div[@class='css-sgomgw e908uih6']") 
		public  WebElement productprice;
		@FindBy(xpath="//div[contains(text(),\"Magellan Outdoors\")]") 
		public  WebElement productname;
		@FindBy(xpath="//h2[@class='css-mhoryu e908uih2'][text()='Item Added Successfully']") 
		public  WebElement addtocarttitle;
		@FindBy(xpath="//h1[text()='Shopping Cart']") 
		public  WebElement viewcarttitle;
		@FindBy(xpath="//div[@class='message'][contains(text(),'Sorry')]") 
		public  WebElement checkouttitle;
	
		
		


	public PDP_PO(WebDriver webDriver) {
		super();
	}

}
