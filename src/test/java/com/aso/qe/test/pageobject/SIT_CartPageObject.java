package com.aso.qe.test.pageobject;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SIT_CartPageObject {
	
	private static final Logger logger = Logger.getLogger(SIT_CartPageObject.class);
	@FindBy(xpath="//button[@id='rh-icon-clicker']")
	public static WebElement  cartIcon;
	@FindBy(xpath="//h1[contains(text(),'Your Shopping Cart is Empty')]") WebElement cartEmptyTxt;
	@FindBy(xpath="//.[@class='cont-shop-link']") WebElement continueShoppingLink;
	@FindBy(xpath="//a[@id='checkoutGuestButton']")
	public WebElement btnBeginCheckout;

	public void clickOnCartIcon() throws Exception{

		if(isDisplayed(cartIcon)) {
			clickOnLink(cartIcon);

		}else
			logger.debug("can't displayed Cart Icon");	

	}

	public static void clickOnLink(WebElement cartIcon2) {
		// TODO Auto-generated method stub
		
	}

	private boolean isDisplayed(WebElement cartIcon2) {
		// TODO Auto-generated method stub
		return false;
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

	private String getText(WebElement continueShoppingLink2) {
		// TODO Auto-generated method stub
		return null;
	}
}


