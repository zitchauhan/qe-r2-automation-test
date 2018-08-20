package com.aso.qe.test.pageobject;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;

public class R2_Cart_PO extends CommonActionHelper {

	private static final Logger logger = Logger.getLogger(R2_Cart_PO.class);
	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);

	// Start KER-2911 CR-DPK
	@FindBy(xpath = "//button[@id='rh-icon-clicker']")
	public static WebElement cartIcon;
	@FindBy(xpath = "//h1[contains(text(),'Your Shopping Cart is Empty')]")
	WebElement cartEmptyTxt;
	@FindBy(xpath = "//.[@class='cont-shop-link']")
	WebElement continueShoppingLink;
	@FindBy(xpath = "//a[@id='checkoutGuestButton']")
	public WebElement btnBeginCheckout;

	@FindBy(xpath = "//div[text()='Subtotal']/../div[2]")
	public WebElement txtSubtotalCart;
	

	@FindBy(xpath = "//div[text()='Estimated Shipping']/..")
	public WebElement txtEstimatedShippingCart;

	@FindBy(xpath = "//div[text()='Estimated Taxes']/../div[2]")
	public WebElement txtEstimatedTaxesCart;
	
	@FindBy(xpath = "//div[text()='Promocode']/../div[2]")
	public WebElement txtPromocodeCart;

	@FindBy(xpath = "//div[text()='Total']/../div[2]")
	public WebElement txtTotalCart;

	@FindBy(xpath = "//div[@class='col-12 col-md-5 px-0 pl-md-1']")
	public WebElement txtOrdersummaryCart;
	// End KER-2911 CR-DPK

	// Start KER-2927 CR-SK
	@FindBy(xpath = "//div[contains(text(), 'Estimated Taxes')]/following-sibling::div[1]")
	public WebElement txtEstimatedTax;

	@FindBy(xpath = "//input[@data-auid='crt_inputQty']")
	public WebElement txtQuantity;

	@FindBy(xpath = "//input[@data-auid='crt_rdOpt_0']")
	public WebElement rbShipToMe;

	@FindBy(xpath = "//input[@data-auid='crt_rdOpt_1']")
	public WebElement rbInStorePickUp;

	@FindBy(xpath = "(//*[@data-auid='btnc_btnCheckout'])[1]")
	public WebElement btnCheckout;

	// End KER-2927 CR-SK

	// start KER-2939 CR-RK
	@FindBy(xpath = "//button[contains(@data-auid,'crt_btnWlist')]")
	public WebElement btnWlist;

	@FindBy(xpath = "//button[text()='Change ZIP code']")
	public WebElement changeZIPCode;

	@FindBy(xpath = "//input[@data-auid='crt_inputZip']")
	public WebElement inputZIPCode;

	@FindBy(xpath = "//input[@data-auid='btncrt_btnCalcShippingModal']")
	public WebElement submitZIPCode;

	@FindBy(xpath = "//a[contains(@data-auid,'crt_lnkImgContainer')]")
	public WebElement productName;

	@FindBy(xpath = "//span[text()='Color']")
	public WebElement txtColor;

	@FindBy(xpath = "//span[contains(text(),'Size')]")
	public WebElement txtSize;
	// End KER-2939 CR-RK

	// Start KER-2939 CR-AKK
	@FindBy(xpath = "//a[contains(@data-auid, 'crt_lnkProdName_')]")
	public WebElement lnkProducttext;

	@FindBy(xpath = "(//*[contains(@data-auid, 'crt_lnkProdName_')]/../div/span[2])[1]")
	public WebElement txtPrdColor;

	@FindBy(xpath = "(//*[contains(@data-auid, 'crt_lnkProdName_')]/../div/span[2])[2]")
	public WebElement txtPrdSize;

	@FindBy(xpath = "//*[contains(@data-auid,'crt_btnRmvFromCart_')]")
	public WebElement btnRemoveCart;

	@FindBy(xpath = "(//*[contains(text(),'Promocode')]/.")
	public WebElement txtPromoCode1;

	// End KER-2939 CR-AKK
	public void clickOnCartIcon() throws Exception {

		if (isDisplayed(cartIcon)) {
			clickOnLink(cartIcon);

		} else
			logger.debug("can't displayed Cart Icon");

	}

	public void compareCartEmptyTxt(String exceptedTxt) throws Exception {
		String actualCartTxt = getText(cartEmptyTxt);
		logger.debug("actualCartTxt:: " + actualCartTxt);
		Assert.assertEquals(actualCartTxt, exceptedTxt);
	}

	public void compareContinueShoppingLinkTxt(String exceptedTxt) throws Exception {
		String actualCartTxt = getText(continueShoppingLink);
		logger.debug("continueShoppingLinkText:: " + actualCartTxt);
		Assert.assertEquals(actualCartTxt, exceptedTxt);
	}

	// Start KER-2911 CR-DPK
	public void verifyShippingPriceOnCartPage() {
		assertTrue(isDisplayed(txtSubtotalCart));
		assertTrue(isDisplayed(txtEstimatedShippingCart));
		assertTrue(isDisplayed(txtEstimatedTaxesCart));
		assertTrue(isDisplayed(txtTotalCart));
	}
	// End KER-2911 CR-DPK

	// Start KER-2940 CR-DPK
	@FindBy(xpath = "//*[contains(text(),'Promocode')]/..")
	public WebElement txtPromocode;

	@FindBy(xpath = "//*[text()='$']/following::div")
	public WebElement txtActualPrice;

	@FindBy(xpath = "(//*[text()='$'])[1]")
	public WebElement txtPromoPrice;

	@FindBy(xpath = "(//*[text()='$'])[2]")
	public WebElement txtActualPrice2;

	@SuppressWarnings("unlikely-arg-type")
	public void verifySubtotal() {
		int priceItem1 = 0;
		int priceItem2 = 0;
		try {
			if (txtActualPrice.isDisplayed()) {
				String itemPrice1 = txtActualPrice.getText();
				String price1 = "";

				for (int i = 0; i < itemPrice1.length(); i++) {
					char priceCheck = itemPrice1.charAt(i);
					if (Character.isDigit(priceCheck)) {
						price1 += priceCheck;
					}
					priceItem1 = Integer.parseInt(price1);
					System.out.println(priceItem1);

				}

			} else {
				String itemPrice1 = txtPromoPrice.getText();
				String price1 = "";

				for (int i = 0; i < itemPrice1.length(); i++) {
					char priceCheck = itemPrice1.charAt(i);
					if (Character.isDigit(priceCheck)) {
						price1 += priceCheck;
					}
					priceItem2 = Integer.parseInt(price1);
					System.out.println(priceItem1);

				}

			}
		} catch (NumberFormatException ex) {

		}

		try {
			String itemPrice2 = txtActualPrice2.getText();
			String price2 = "";

			for (int i = 0; i < itemPrice2.length(); i++) {
				char priceCheck1 = itemPrice2.charAt(i);
				if (Character.isDigit(priceCheck1)) {
					price2 += priceCheck1;
				}
				priceItem2 = Integer.parseInt(price2);
				System.out.println(priceItem2);
			}
		} catch (NumberFormatException ex) {

		}

		int Subtotal = priceItem1 + priceItem2;

		if (txtSubtotalCart.equals("$" + Subtotal)) {
			System.out.println("Pass");
			logger.info("Itemized subtotal for each item in cart is displayed properly");
		} else {
			System.out.println("Fail");
			logger.info("Itemized subtotal for each item in cart is not displayed properly");
		}

	}
	// End KER-2940 CR-DPK

	// Start KER-2927 CR-SK
	public float getEstimatedTaxOnCartPage() {
		String taxDisplayed = getText(txtEstimatedTax);
		taxDisplayed = taxDisplayed.replace("$", "");
		return Float.parseFloat(taxDisplayed);
	}

	public void increaseQuantityOnCartPage(int differencValue) {
		assertTrue(isDisplayed(txtQuantity));
		String quantityDisplayed = txtQuantity.getAttribute("value").toString();
		// String quantityDisplayed = getText(txtQuantity);
		int increasedQuantity = Integer.parseInt(quantityDisplayed) + differencValue;
		setInputText(txtQuantity, Integer.toString(increasedQuantity));
		tabInputBox(txtQuantity);

		// clickOnButton(txtQuantity);
		getDriver().navigate().refresh();
		waitForElement(txtQuantity);
	}

	public void selectShipToMe() {
		clickOnRadioButton(rbShipToMe);
	}

	public void selectInStorPickUp() {
		clickOnRadioButton(rbInStorePickUp);
	}

	public boolean clickOnCheckoutButton() {
		return clickOnButton(btnCheckout);

	}
	// End KER-2927 CR-SK

	// start KER-2939 CR-RK
	public void verifyDetailsOnCartPage() throws InterruptedException {
		assertTrue(isDisplayed(r2SanityPo.AS_productImage));
		assertTrue(isDisplayed(productName));
		assertTrue(isDisplayed(txtColor));
		assertTrue(isDisplayed(txtSize));
		assertTrue(isDisplayed(r2SanityPo.AS_inputQty));
		assertTrue(isDisplayed(r2SanityPo.AS_txtQuantityPrice));
		assertTrue(isDisplayed(r2SanityPo.AS_btnRemoveFromCart));
		assertTrue(isDisplayed(btnWlist));
		assertTrue(isDisplayed(r2SanityPo.AS_txtSubtotalCart));
		assertTrue(isDisplayed(r2SanityPo.AS_txtEstimatedShippingCart));
		assertTrue(isDisplayed(r2SanityPo.AS_txtEstimatedTaxesCart));
		assertTrue(isDisplayed(r2SanityPo.AS_txtTotalCart));
	}
	// End KER-2939 CR-RK
}
