package com.aso.qe.test.pageobject;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.stepdefinition.web.plcc.Common_Web_SD_PLCC;

public class R1_PLCC_Generic_PO extends Common_Web_SD_PLCC {
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_SIT_PO sit_po = PageFactory.initElements(driver, R1_SIT_PO.class);
	R1_PDP_PO pdp_po = PageFactory.initElements(driver, R1_PDP_PO.class);
	R2_CheckOut_PO checkout_po = PageFactory.initElements(driver, R2_CheckOut_PO.class);

	private WebElement objElement;
	Common_Web_SD_PLCC timer = new Common_Web_SD_PLCC();
	R2_CheckOut_PO r2CheckOutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	@FindBy(xpath = "//*[text()='Credit Card Number']/following::*[1]")
	public WebElement CreditCardNumber_Input;
	// Checkout
	@FindBy(xpath = "//*[@data-auid='btncheckout']")
	public WebElement btncheckoutOnNotificationPopup;
	@FindBy(xpath = "//*[text()='Credit Card']")
	public WebElement CreditCard_radioBtn;
	// data au-ids or ids are there but not identifying that element so, using
	// text().
	@FindBy(xpath = "//*[@data-auid='btncheckout']")
	public WebElement checkoutBtnATC;

	@FindBy(xpath = "//*[text()='PayPal']")
	public WebElement payPalPaymentOption;

	@FindBy(xpath = "//*[@class='loadcardInfo']")
	public WebElement plccCardOnCreditCardTxtField;
	@FindBy(xpath = "//*[text()='Unrecognized card number']")
	public WebElement invalidCardNumberErrorMsg;
	// Footer
	@FindBy(xpath = "//*[@data-auid='checkout_footer_accepted_card_PLCC_icon']")
	public WebElement plccCreditCardImageFooter;

//Payment Page Card Images
	@FindBy(xpath = "//*[@src='/content/dam/academysports/cart-and-checkout/cards-accepted/plcc.png']")
	public WebElement plccCardImageOnCCField;
	@FindBy(xpath = "//*[@src='/content/dam/academysports/cart-and-checkout/cards-accepted/visa.png']")
	public WebElement visaCardImageOnCCField;
	@FindBy(xpath = "//*[@src='/content/dam/academysports/cart-and-checkout/cards-accepted/amex.png']")
	public WebElement amexCardImageOnCCField;
	@FindBy(xpath = "//*[@src='/content/dam/academysports/cart-and-checkout/cards-accepted/discover.png']")
	public WebElement discoverPalPaymentOption;
	@FindBy(xpath = "//*[@src='/content/dam/academysports/cart-and-checkout/cards-accepted/mastercard.png']")
	public WebElement masterPalPaymentOption;

	// Confirmation Page
	@FindBy(xpath = "//*[text()='a confirmation email is on its way']")
	public WebElement emailOnItsWayTxt;
	@FindBy(xpath = "//*[@data-auid='checkout_order_confirmation_print_orderDetails_link']")
	public WebElement printLinkOnOrderConfirmationPage;
	@FindBy(xpath = "//*[@data-auid='checkout_order_confirmation_create_account_link']")
	public WebElement myAccountLinkOnOrderConfirmationPage;
	@FindBy(xpath = "//*[@data-component='orderConfirmation']")
	public WebElement orderConfirmationPage;
	
	@FindBy(xpath = "//*[text()='Save Payment Info for Later']")
	public WebElement savePaymentInfoForLaterCheckBox;

	public void verifyPresenceOfCheckoutPage() throws Exception {
		String currentURL = getCurrentPageURL();
		if (currentURL.contains("/checkout?orderId=")) {
			logger.debug("User is successfully navigated to Checkout page with URL :: " + currentURL);
		} else {
			logger.debug("User is not able to navigate to Checkout Page instead navigated to URL :: " + currentURL);
		}
	}
	public void verifyPresenceOfSaveForLaterCheckBox() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(savePaymentInfoForLaterCheckBox);
			logger.debug("Save Payment Info for Later CheckBox is displayed++++++++++++++++++++++++");
		} else {
			isDisplayed(savePaymentInfoForLaterCheckBox);
			logger.debug("Save Payment Info for Later CheckBox is displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfCreditCardRadioButton() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(CreditCard_radioBtn);
			logger.debug("Credit Card  Radio button is displayed");
		} else {
			isDisplayed(CreditCard_radioBtn);
			logger.debug("Credit Card Radio button is displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfInvalidCardNumberErrorMsg() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(invalidCardNumberErrorMsg);
			logger.debug("Unrecognized card number is displayed");
		} else {
			isDisplayed(invalidCardNumberErrorMsg);
			logger.debug("Unrecognized card number is displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfPlccCardOnCreditCardTxtField() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(plccCardOnCreditCardTxtField);
			logger.debug("PLCC Card on Credit Card Text Field is displayed");
		} else {
			isDisplayed(plccCardOnCreditCardTxtField);
			logger.debug("PLCC Card on Credit Card Text Field is displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfCreditCardTextField() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(CreditCardNumber_Input);
			logger.debug("Credit Card Text Field is displayed");
		} else {
			isDisplayed(CreditCardNumber_Input);
			logger.debug("Credit Card Text Field is displayed++++++++++++++++++++++++==");
		}

	}

	public void clickOnCheckoutButton() throws Exception {

		{
			assertTrue(isDisplayed(checkoutBtnATC));
			isClickable(checkoutBtnATC);
			if (isDisplayed(checkoutBtnATC)) {
				Common_Web_SD_PLCC.waitUntilElePresent(driver, checkoutBtnATC, ELEMWAITTIME_MEDIUM);
				assertTrue(clickOnButton(checkoutBtnATC));
			} else {
				Common_Web_SD_PLCC.waitUntilElePresent(driver, checkoutBtnATC, ELEMWAITTIME_MEDIUM);
			}
		}

	}

	public void enterCardBinNumber(String arg) throws Exception {
		setInputText(CreditCardNumber_Input, webPropHelper.getTestDataProperty(arg));
	}

	// Payment Page Card Images reusable methods
	public void verifyPresenceOfPlccCardImageOnCCField() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(plccCardImageOnCCField);
			logger.debug("PLCC Card Image on Credit Card Text Field is displayed++++++++++++++++++++++++==");
		} else {
			isDisplayed(plccCardImageOnCCField);
			logger.debug("PLCC Card Image on Credit Card Text Field is displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfVisaCardImageOnCCField() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(visaCardImageOnCCField);
			logger.debug("VISA Card Image on Credit Card Text Field is displayed++++++++++++++++++++++++==");
		} else {
			isDisplayed(visaCardImageOnCCField);
			logger.debug("VISA Card Image on Credit Card Text Field is displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfMasterCardImageOnCCField() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(masterPalPaymentOption);
			logger.debug("Master Card Image on Credit Card Text Field is displayed++++++++++++++++++++++++==");
		} else {
			isDisplayed(masterPalPaymentOption);
			logger.debug("Master Card Image on Credit Card Text Field is displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfDiscoveCardImageOnCCField() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(discoverPalPaymentOption);
			logger.debug("Discover Card Image on Credit Card Text Field is displayed++++++++++++++++++++++++==");
		} else {
			isDisplayed(discoverPalPaymentOption);
			logger.debug("Discover Card Image on Credit Card Text Field is displayed++++++++++++++++++++++++==");
		}
	}

	public void verifyPresenceOfAmexCardImageOnCCField() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(amexCardImageOnCCField);
			logger.debug("Amex Card Image on Credit Card Text Field is displayed++++++++++++++++++++++++==");
		} else {
			isDisplayed(amexCardImageOnCCField);
			logger.debug("Amex Card Image on Credit Card Text Field is displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfInvalidErrorMessageOnCCField() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(r2CheckOutPo.UnrecognizedCardNumber_Txt);
			logger.debug("Unrecognized card number error message is displayed++++++++++++++++++++++++==");
		} else {
			isDisplayed(r2CheckOutPo.UnrecognizedCardNumber_Txt);
			logger.debug("Unrecognized card number error message is displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfCreditCardImageOnCCField() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(r2CheckOutPo.Checkout_CreditCardPay_ImgLogo);
			logger.debug("Credit Card Image on credit card Text Field is displayed++++++++++++++++++++++++==");
		} else {
			isDisplayed(r2CheckOutPo.Checkout_CreditCardPay_ImgLogo);
			logger.debug("Credit Card Image on credit card Text Field is displayed++++++++++++++++++++++++==");
		}
	}

	public void verifyPresenceOfEditMyCartLink() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(r2CheckOutPo.btnEditCart);
			logger.debug("Edit My Cart Link is displayed++++++++++++++++++++++++==");
		} else {
			isDisplayed(r2CheckOutPo.btnEditCart);
			logger.debug("Edit My Cart Link  is displayed++++++++++++++++++++++++==");
		}
	}

	public void verifyPresenceOfRemoveFromCartLink() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(r2CheckOutPo.AS_btnRemoveFromCart);
			logger.debug("Remove from Cart Link is displayed++++++++++++++++++++++++==");
		} else {
			isDisplayed(r2CheckOutPo.AS_btnRemoveFromCart);
			logger.debug("Remove from cart Link is displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfExpiryTextField() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(r2CheckOutPo.txtExpirationDate);
			isDisplayed(r2CheckOutPo.txtExpirationDateInput);
			logger.debug("Expiry Date Text Field is displayed++++++++++++++++++++++++==");
		} else {
			isDisplayed(r2CheckOutPo.txtExpirationDate);
			isDisplayed(r2CheckOutPo.txtExpirationDateInput);
			logger.debug("Expiry Date Text Field is displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfCvvTextField() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(r2CheckOutPo.txtCVVInput);
			logger.debug("CVV Text Field is displayed++++++++++++++++++++++++==");
		} else {
			isDisplayed(r2CheckOutPo.txtCVVInput);
			logger.debug("CVV Text Field is displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyAbsenceOfExpiryTextField() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {

			isNotDisplayed(r2CheckOutPo.txtExpirationDate);
			isNotDisplayed(r2CheckOutPo.txtExpirationDateInput);
			logger.debug("Expiry Date Text Field is not displayed++++++++++++++++++++++++==");
		} else {
			isNotDisplayed(r2CheckOutPo.txtExpirationDate);
			isNotDisplayed(r2CheckOutPo.txtExpirationDateInput);
			logger.debug("Expiry Date Text Field is not displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyAbsenceOfCvvTextField() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isNotDisplayed(r2CheckOutPo.txtCVVInput);
			logger.debug("CVV Text Field is not displayed++++++++++++++++++++++++==");
		} else {
			isNotDisplayed(r2CheckOutPo.txtCVVInput);
			logger.debug("CVV Text Field is not displayed++++++++++++++++++++++++==");
		}

	}

	protected boolean isNotDisplayed(WebElement element) {
		logger.info("Check if the Webelement is displayed");
		boolean flag = true;
		try {
			this.objElement = waitForElement(element);
			if (flag = this.objElement.isDisplayed())
				flag = false;
			if (flag) {
				captureScreenShot(Constants.PASS);
			} else {
				captureScreenShot(Constants.FAIL);
			}
		} catch (Exception e) {
			logger.error("Exception in  isDisplay msg::" + e.getMessage());
		}
		return flag;
	}

	public void verifyPresenceOfPlccCreditCardInFooter() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(plccCreditCardImageFooter);
			logger.debug("PLCC Credit Card Image in fooer is displayed++++++++++++++++++++++++==");
		} else {
			isDisplayed(plccCreditCardImageFooter);
			logger.debug("PLCC Credit Card Image in fooer is displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfEmailOnItsWayTxt() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(emailOnItsWayTxt);
			logger.debug("Email is on its way text is displayed");
		} else {
			isDisplayed(emailOnItsWayTxt);
			logger.debug("Email is on its way text is displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfEditPayment_Link() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(checkout_po.EditPayment_Link);
			logger.debug("Edit link of payment section on checkout page is displayed");
		} else {
			isDisplayed(checkout_po.EditPayment_Link);
			logger.debug("Edit link of payment section on checkout page is displayed");
		}

	}

	public void verifyPresenceOfReviewOrderButton() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(checkout_po.ReviewOrder_Btn);
			logger.debug("Edit link of payment section on checkout page is displayed");
		} else {
			isDisplayed(checkout_po.ReviewOrder_Btn);
			logger.debug("Edit link of payment section on checkout page is displayed");
		}
	}

	public void verifyPresenceOfPlaceOrderButton() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(checkout_po.btnPlaceOrderPaymentPage);
			logger.debug("PLACE ORDER Button is displayed");
		} else {
			isDisplayed(checkout_po.btnPlaceOrderPaymentPage);
			logger.debug("PLACE ORDER Button is displayed");
		}
	}

	public void verifyPresenceOfOrderConfirmationPage() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(orderConfirmationPage);
			logger.debug("Order Confirmation Page is displayed");
		} else {
			isDisplayed(orderConfirmationPage);
			logger.debug("Order Confirmtion Page is displayed");
		}
	}

	public void verifyPresenceOfOrderSuccesfullStatus() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(checkout_po.txtOrderSuccesfullStatus);
			logger.debug("THANKS FOR SUBMITTING YOUR ORDER! is displayed");
		} else {
			isDisplayed(checkout_po.txtOrderSuccesfullStatus);
			logger.debug("THANKS FOR SUBMITTING YOUR ORDER! is displayed");
		}
	}

	public void verifyPresenceOfOrderNumber() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(checkout_po.orderSubmitted_OrderNumber);
			logger.debug("Order Number is displayed");
		} else {
			isDisplayed(checkout_po.orderSubmitted_OrderNumber);
			logger.debug("Order Number is displayed");
		}
	}

	public void verifyPresenceOfEmailOnItsWayText() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(emailOnItsWayTxt);
			logger.debug("a confirmation email is on its way Text is displayed");
		} else {
			isDisplayed(emailOnItsWayTxt);
			logger.debug("a confirmation email is on its way Text is displayed");
		}
	}

	public void verifyPresenceOfPrintLinkOnOrderConfirmationPage() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(printLinkOnOrderConfirmationPage);
			logger.debug("Print Link on order confirmation Page is displayed");
		} else {
			isDisplayed(printLinkOnOrderConfirmationPage);
			logger.debug("Print Link on order confirmation Page is displayed");
		}
	}

	public void verifyPresenceOfMyAccountLinkOnOrderConfirmationPage() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			isDisplayed(myAccountLinkOnOrderConfirmationPage);
			logger.debug("My Account Link on order confirmation Page is displayed");
		} else {
			isDisplayed(myAccountLinkOnOrderConfirmationPage);
			logger.debug("My Account Link on order confirmation Page is displayed");
		}
	}

	public void enterExpiryDateField(String arg) throws Exception {
		setInputText(r2CheckOutPo.txtExpirationDateInput, webPropHelper.getTestDataProperty(arg));
	}

	public void enterCVVField(String arg) throws Exception {
		setInputText(r2CheckOutPo.txtCVVInput, webPropHelper.getTestDataProperty(arg));
	}
}
