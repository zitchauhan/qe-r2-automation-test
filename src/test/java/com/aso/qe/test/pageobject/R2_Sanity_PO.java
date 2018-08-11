package com.aso.qe.test.pageobject;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aso.qe.framework.common.CommonActionHelper;

public class R2_Sanity_PO extends CommonActionHelper {

	@FindBy(xpath = "//*[@data-auid='btnAddToCart']")
	public WebElement AS_btnAddToCart;
	@FindBy(xpath = "//*[@data-auid='crt_btnCheckoutTop']")
	public WebElement AS_btnCheckOutTop;
	@FindBy(xpath = "//*[@data-auid='crt_inputQty']")
	public WebElement AS_inputQty;
	@FindBy(xpath = "//*[@data-auid='crt_inputQty_m']")
	public WebElement AS_inputQty_m;
	@FindBy(xpath = "//*[@data-auid='crt_btnAddPromo']")
	public WebElement AS_btnAddPromo;
	@FindBy(xpath = "//*[@data-auid='crt_btnHidePromo']")
	public WebElement AS_btnHidePromo;
	@FindBy(xpath = "//*[@data-auid='crt_inputPromo']")
	public WebElement AS_inputPromo;
	@FindBy(xpath = "//*[@data-auid='crt_btnPromoSbmt']")
	public WebElement AS_btnPromoSbmt;
	@FindBy(xpath = "//*[text()='Remove from Cart'] | //*[@data-auid='crt_btnRmvFromCart_${1}']")
	public WebElement AS_btnRemoveFromCart;

	public void clickAddToCart() throws Exception {
		assertTrue(clickOnButton(AS_btnAddToCart));
	}

}
