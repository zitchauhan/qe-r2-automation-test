package com.aso.qe.test.pageobject;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aso.qe.framework.common.CommonActionHelper;

public class ShoppingCartViewPO extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(ShoppingCartViewPO.class);
	@FindBy(xpath="//div[@class='col-1 a-pad-right0 a-text-right a-pos-inherit']//a[@data_auid='mini_cart']") WebElement cartIcon;
	@FindBy(xpath="//h1[contains(text(),'Your Shopping Cart is Empty')]") WebElement cartEmptyTxt;
	@FindBy(xpath="//.[@class='cont-shop-link']") WebElement continueShoppingLink;
	@FindBy(xpath="//div[@class='cartitem-row-outer']") public WebElement secProductInCart;
	@FindBy(xpath="//span[@id='rh-cart-count']")
	public WebElement txtMinicartCount;

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
