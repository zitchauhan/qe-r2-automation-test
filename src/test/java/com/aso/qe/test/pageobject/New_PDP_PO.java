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
import com.aso.qe.test.pageobject.R1_PLCC_Generic_PO; 
import org.openqa.selenium.support.PageFactory; 

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;

public class New_PDP_PO extends CommonActionHelper
{
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	String timeStamp = new SimpleDateFormat("MM.dd.HH.mm.ss").format(new Date());  //Sid
	//R1_PLCC_Generic_PO generic_po = PageFactory.initElements(getDriver(), R1_PLCC_Generic_PO.class);
	//R1_PLCC_Generic_PO generic_po = PageFactory.initElements(getDriver(), R1_PLCC_Generic_PO.class);
	private String sku;   //Sid
	
	public New_PDP_PO(WebDriver webDriver) 
	{
		super();
	}			
	
	/*--------------------Ammo,Firerems and Product container scenarios*/
@FindBy(xpath="(//li[@data-auid='disclaimer-listing'])[1] |//div[@data-auid='PDP_Disclaimer']") public WebElement ammoDisclaimer;
	
	@FindBy(xpath="//div[@data-auid='PDP_Disclaimer']/div/div/span[text()='I Agree'] | //span[text()='I Agree']") public WebElement Btn_IAgree;
	
	@FindBy(xpath="//div[@data-auid='Rating Stars']") public WebElement starRating;
	
	@FindBy(xpath="//div/span[@data-auid='regPrice']") public WebElement price;
	
	@FindBy(xpath="//*[contains(@data-auid,'PDP_OnlineMessage')] | //div[@id='renderShipItAtc']") public WebElement addToCartButton;
	
	@FindBy(xpath="(//*[contains(@data-auid,'PDP_OnlineMessage')] | //div[@id='renderShipItAtc'])[2]") public WebElement addToCartButton_m;
	
	
	@FindBy(xpath="//h1[@data-auid='PDP_ProductName']") public WebElement productTitle;
	
	@FindBy(xpath="//div[@data-auid='PDP_SaveBadge']") public WebElement saveBadge;
	
	@FindBy(xpath="//*[@data-auid='PDP_AdBug']|//div[@class='css-1mm7z3k']") public WebElement clearanceBadge;
	
	@FindBy(xpath="//*[@data-auid='promotional-message']") public WebElement shipforfree;
	
	@FindBy(xpath="//*[@data-auid='promotional-message']") public WebElement promotionalMsg;
	
	@FindBy(xpath="//*[@data-auid='promotional-icon' and @class='toolTip']") public WebElement promoMsgToolTip;
	
	@FindBy(xpath="//div/span[@data-auid='regPrice']") public  WebElement productprice;

		/*----------------------breadcrumb scenarios-------------------*/		
		@FindBy(xpath="//div[@data-auid='breadcrumb']")	public WebElement breadcrumb;
		@FindBy(xpath="(//div[@data-auid='breadcrumb'])[2]") public WebElement breadcrumb_m;
				
		//@FindBy(xpath="(//div[@data-auid='breadcrumb']//li[1])[1]/a") public WebElement BreadcrumbRootNode;
		@FindBy(xpath="(//div[@data-auid='breadcrumb']/nav/ol/li/a)[1]") public WebElement BreadcrumbRootNode;
				
		@FindBy(xpath="//div[@data-auid='breadcrumb']//li[2]") public WebElement breadcrumbSubCategory;

		/*--------------------Product attribute components---------------*/
				
		@FindBy(xpath="//a[@data-auid='sizeChart']") public WebElement sizechart;
				
		@FindBy(xpath="//div[@data-auid='PDP_Size_Attribute']/header[@data-auid='PDP_Size_heading']") public WebElement size;
				
		@FindBy(xpath="(//div[contains(@data-auid,'swatchButton')]/button[@class='btn btn-primary'])[1]") public WebElement sizeButton;
		
		@FindBy(xpath="//header[@data-auid='PDP_Color_heading']") public WebElement colorLabel_m;
		
		@FindBy(xpath="//header[@data-auid='PDP_Size_heading']") public WebElement sizeLabel_m;
				
		/*-----------------------------------------Product Attribute Circle Component-------------------------*/
		@FindBy(xpath="//header[contains(@data-auid,'PDP_Color_heading')]/div") public WebElement colorText; 
		
		@FindBy(xpath="//div[contains(@data-auid,'swatchButton-image')]/button/img[@class='rounded-circle']") public WebElement colorBtn;	
		
		/*----------------------------------Product recommendations--------------------------------------------*/
		@FindBy(xpath="//div[@data-component='footer']/div/div[@class='container']/div/a[1]") public WebElement prod_recommendation;
		
		/*-----------------------------------Regular and Bulk GC-----------------------------------------------*/
		@ FindBy(xpath="//div[@aria-label='Product_Detail_Content']/div[2]") public WebElement prodSummary;
		
		@FindBy(xpath="//div[@data-auid='PDP_MediaClick']|//img[@class='h-100 w-100 swiper-lazy css-19iuff6']") public WebElement prodImage;
		
		@FindBy(xpath="//div[@class='swiper-container swiper-container-initialized swiper-container-horizontal']//img[contains(@src,'https')]") public WebElement pdpImage;
		
		@FindBy(xpath="(//div[@data-auid='PDP_ProductImage_m'])[2]") public WebElement prod_Image_m;
		
		@FindBy(xpath="//div[@data-auid='PDP_Color_Attribute']") public WebElement color;
		
		@FindBy(xpath="//div[@class='css-1non6wy e5lk8y40']") public WebElement max_qty_msg;
		
		@FindBy(xpath="//div[@class='css-1non6wy e5lk8y40']/div/p/a[text()='Academy Gift Card']") public WebElement BulkGc_link;
		
		@FindBy(xpath="//button[@data-auid='swatchButton-image-$50']") public WebElement premadeCardAmt;
		
		@FindBy(xpath="//button[@data-auid='swatchButton-image-Other']") public WebElement premadeCardAmt_other;
		
		 @FindBy(xpath="//input[@data-auid='PDP_giftCardAmount']") public WebElement gc_customAmt;
		
		@FindBy(xpath="//span[text()='Gift Card Amount should be between  1 and 1500']") public WebElement GC_Custom_amtError;
		
		@FindBy(xpath="//div[contains(@class,'d-flex justify-content-center')][1]") public WebElement maxQty_ErrPopUp;
		
		@FindBy(xpath="//button[@data-auid='btnHP_GC_BUTTON_CANCEL']") public WebElement errCanc_Btn;
		
		
		/*--------------------------------Gallery components-----------------------------*/
		//@FindBy(xpath="//button[contains(@data-auid,'swatchButton-image') and @role='radio'][2]") public WebElement thumbNailImg;
		@FindBy(xpath="//button[contains(@class,'swiper-slide btn')][2]/img") public WebElement thumbNailImg;
		//button[contains(@class,'swiper-slide btn')][2]/img
		
		@FindBy(xpath="(//div[contains(@class,'swiper-wrapper')])[1]") public WebElement galleryList;
		
		//@FindBy(xpath="//div[@data-auid='PDP_MediaClick']/div/img") public WebElement imageLink;
		@FindBy(xpath="(//div[contains(@class,'swiper-slide swiper-slide-active')]//img)[2]") public WebElement imageLink;
				
		@FindBy(xpath="//div[@data-auid='HVB_heroVideoComponent']") public WebElement videoComponent;
		@FindBy(xpath="//div[contains(@class,'swiper-slide')][6]") public WebElement videoComponent_m;
		
		
		@FindBy(xpath="//div[@data-component='VideoPlayer']") public WebElement videoPlayer;
		
		@FindBy(xpath="//div[@data-component='cart']") public WebElement cartPage;
		
		
		@FindBy(xpath="(//*[@data-auid='PDP_Color_Attribute'][1])[2]") public WebElement color_attr;
		@FindBy(xpath="(//*[@data-auid='PDP_Color_Attribute'][2])[1]") public WebElement alt_color;
		
		@FindBy(xpath="(//div[@data-auid='PDP_Color_Attribute'][2])[2]") public WebElement alt_color_m;
		
				
		//@FindBy(xpath="//*[@data-auid='PDP_Color_Attribute' and contains(@class,'swiper-slide position-relative')][2]") public WebElement color_attr;
		
		
		@FindBy(xpath="//*[@data-auid='cart_radio_button_div']/div[contains(@class,'notEligible')]") public WebElement notEligibleFrPickup;
		
		@FindBy(xpath="//*[text()='There are not enough items in stock to fulfill your order']") public WebElement OOSmsg;
		
		@FindBy(xpath="//*[@id='errorBlock']") public WebElement maxQtyError;
		
	
		
		/*-------------------------------Fulfilment messaging-------------------------*/
		@FindBy(xpath="//div[contains(@class,'css-f24gfl')]") public WebElement bulkFulfilMsg;
		
		
		@FindBy(xpath="//div[@class='css-mc7ga7']") public WebElement productMessage;
		
		
		public void verifypromotionalMsgStacking() {
			//String ele="//*[@data-auid='promotional-message']("+i+"")";
			By selector = By.xpath("//*[@data-auid='promotional-message']");
			List<WebElement>promoMsgs =driver.findElements(selector);
			
			for(int i=1;i<=promoMsgs.size();i++) {
				WebElement elemnt = driver.findElement(By.xpath("(//*[@data-auid='promotional-message'])["+i+"]"));
				assertTrue(isDisplayed(elemnt));
				System.out.println("promo messages present = "+elemnt.getText());
			}
			
		}
		
		//@FindBy(xpath="//*[contains(text(),'Estimated Pick Up:')]") public WebElement EstimatePickUpPDP;
		@FindBy(xpath="//*[contains(text(),'Estimated Pick Up :')]/span") public WebElement EstimatePickUpCart;
		@FindBy(xpath="//*[@data-auid=\"PDP_PickupInfo_BOPIS\"]/div/div[3] | (//*[contains(text(),'Pick Up Today')])[1]") public WebElement PickUpTodayPDP;
		@FindBy(xpath="//*[contains(text(),'Pick Up today')]") public WebElement PickUpTodayCart;
		@FindBy(xpath="//*[contains(text(),'Pick Up Today Instead')]") public WebElement PickUpTodayCartModal;
		@FindBy(xpath="//*[contains(text(),'Estimated Pick Up: ')]/span") public WebElement EstimatePickUpDateCartModal;
	    @FindBy(xpath="//*[contains(text(),'Pick Up today if ordered by')]") public WebElement PickUpTodayOrderby2PM;
		@FindBy(xpath="//*[contains(text(),'Store Hours')]") public WebElement ClickStoreHours;
		@FindBy(xpath="//p[@class='o-copy__14reg mb-0']']") public WebElement VerifyStoreHours;
		@FindBy(xpath="//*[contains(text(),'View Order History')]") public WebElement OrderHistoryLink;
		@FindBy(xpath="//p[@class='o-copy__14reg mb-0']") public WebElement VerifyStoreHoursOnOrderConfirmation;
		@FindBy(xpath="//*[@data-auid='btncheckout_goto_order_review_submit_button']") public WebElement ReviewbtnOnCheckOutpg;
		
		

		@FindBy(xpath="//a[contains(text(),'Pick Up Today') or contains(text(),'Estimated Pick Up:')]")
		public WebElement EstimatePickUpPDP;	
		
		
		public void verifyProductImage() throws InterruptedException {
			
			logger.info("Verify Product Image is displayed");
			if("mobile".equalsIgnoreCase(testtype)) {
				assertTrue(isDisplayed(prod_Image_m));
				logger.info("Verified Product Image is displayed");
			}else {
				assertTrue(isDisplayed(pdpImage));
				logger.info("Verified Product Image is displayed");
			}
		}
		
		public void verifyImgChanges() throws InterruptedException {		
			String imgsrc= imageLink.getAttribute("src");
			logger.info("IMG SRC = "+imgsrc);
			int size = driver.findElements(By.xpath("//button[contains(@class,'swiper-slide btn')]/img")).size();
			logger.info("Number of thumbnail Images: "+size);
			for(int i=1;i<=size;i++) {
				logger.info("Clicking on thumbail: "+i);
				clickOnButton(getfindElementByXPath("(//button[contains(@class,'swiper-slide btn')]/img)["+i+"]"));
				String thumbnail=driver.findElement(By.xpath("(//button[contains(@class,'swiper-slide btn')]/img)["+i+"]")).getAttribute("src");
				thumbnail=thumbnail.replace("thumbnails", "gallery");
				logger.info(thumbnail);
				String loc = "//img[@src=\""+thumbnail+"\"]";
				logger.info(loc);
				assertTrue(isDisplayed(driver.findElement(By.xpath(loc))));
				logger.info("Verified thumbnail and image are working as expected");
			}
		}

}
