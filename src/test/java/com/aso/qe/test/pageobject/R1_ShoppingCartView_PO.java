package com.aso.qe.test.pageobject;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aso.qe.framework.common.CommonActionHelper;

public class R1_ShoppingCartView_PO extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R1_ShoppingCartView_PO.class);
	//@FindBy(xpath="//div[@class='col-1 a-pad-right0 a-text-right a-pos-inherit']//a[@data_auid='mini_cart']") WebElement cartIcon;/RKA 25 JuLY
	@FindBy(xpath="//*[@data-auid='miniCart']//a |//*[@data-auid='miniCart']|//*[@data-auid='checkout_header_miniCart']//a") public WebElement cartIcon;
	
	@FindBy(xpath="//*[contains(text(),'YOUR CART IS EMPTY')]") WebElement cartEmptyTxt;
	@FindBy(xpath="//.[@class='cont-shop-link']") WebElement continueShoppingLink;
	@FindBy(xpath="//div[@class='cartitem-row-outer']") public WebElement secProductInCart;
	//@FindBy(xpath="//span[@id='rh-cart-count']")	public WebElement txtMinicartCount;/RKA 25 July
    @FindBy(xpath="//*[@data-auid='miniCart']/*/following-sibling::*")public WebElement txtMinicartCount;

   //KER 725
	@FindBy(xpath="//*[@data-auid='miniCart_m']")public WebElement cartIcon_M;
	
	@FindBy(xpath = "(//span[contains(text(),'SKU')]//parent::div/span[2])[1]")
	public WebElement childskucartfirst;
	
	@FindBy(xpath = "//span[contains(text(),'20% off Test Promotion')]")
	public WebElement CMCPromotion;
	
	@FindBy(xpath = "(//div[@data-auid='discount'])[1]")
	public WebElement DiscountOrderSummary;
	
	@FindBy(xpath = "(//div[@data-auid='discount'])[2]")
	public WebElement DiscountPromotionOrderSummary;
	
	@FindBy(xpath = "(//span[contains(text(),'SKU')]//parent::div/span[2])[2]")
	public WebElement childskucartsecond;
	
	
	@FindBy(xpath = "//p[@id='disclaimerMessaging']/div[starts-with(text(),'Ships')]")
	public WebElement whiteglovemessage;
	
	
	@FindBy(xpath = "//p[@id='disclaimerMessaging']/div[starts-with(text(),'This item may ship')]")
	public WebElement DSVmessage;
	
	@FindBy(xpath = "//button[@data-auid='PDP_close_Addtocart_Modal']")
	public WebElement closepopup;
	
	public void clickOnCartIcon() throws Exception{

		if(isDisplayed(cartIcon)) {
			clickOnLink(cartIcon);

		}else
			logger.debug("can't displayed Cart Icon");	

	}

	public void compareCartEmptyTxt(String exceptedTxt) throws Exception{
		String actualCartTxt = getText(cartEmptyTxt);
		logger.debug("actualCartTxt:: "+actualCartTxt);
		Assert.assertEquals(actualCartTxt, exceptedTxt);
	}

	public void compareContinueShoppingLinkTxt(String exceptedTxt) throws Exception{
		String actualCartTxt = getText(continueShoppingLink);
		logger.debug("continueShoppingLinkText:: "+actualCartTxt);
		Assert.assertEquals(actualCartTxt, exceptedTxt);
	}
}
