package com.aso.qe.test.pageobject;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.common.Common_Web_PLCC;
//import com.aso.qe.test.stepdefinition.web.plcc.Common_Web_SD_PLCC;

public class R1_PLCC_Generic_PO extends Common_Web_PLCC {
	
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_SIT_PO sit_po = PageFactory.initElements(driver, R1_SIT_PO.class);
	R1_PDP_PO pdp_po = PageFactory.initElements(driver, R1_PDP_PO.class);
	R2_CheckOut_PO checkout_po = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	
	private WebElement objElement;
	R2_CheckOut_PO r2CheckOutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	
	/*@FindBy(xpath = "//*[@data-auid='checkout_payment_add_gift_card_icon']")
	public WebElement gitCardLink;*/
	
	

	//@FindBy(xpath = "//*[@data-auid='btnShipIt']|//*[text()='Ship It']|//*[starts-with(@data-auid,'btnShipIt')]")
	//@FindBy(xpath="//section[@class='css-b7k0vt']//button[contains(@class,'d-flex flex-row css-m')]")
	@FindBy(xpath="//div[@class='large']//*[text()='Home delivery']")

	public WebElement shipItButton; 
	
	@FindBy(xpath = "//*[@data-auid='btnShipIt']|//*[text()='Ship It']|//*[starts-with(@data-auid,'btnShipIt')]|//*[@data-auid='PDP_OnlineMessage']")
	public WebElement shipItButton_m; 
	
	@FindBy(xpath = "(//*[@data-auid='PDP_OnlineMessage' and @id='renderShipItAtc'])[2]")
	public WebElement shipToHome_m; 
	
	@FindBy(xpath = "//*[@data-auid='btnPickUpATC']")
			public WebElement PICKUPButtonPDP; 
	
	

	@FindBy(xpath = "//*[contains(text(),'Enter a Gift Card')]")
	public WebElement gitCardLink;
	
	@FindBy(xpath = "//*[@id='paymentGiftCardForm']/div/div[1]/div[1]")
	public WebElement giftCardPaymentAppliedMessage;
	
	@FindBy(xpath = "//*[@data-auid='checkout_payment_gift_card_number_field']")
	public WebElement GiftCardNumber_Input;
	
	@FindBy(xpath = "//*[@data-auid='checkout_payment_gift_card_pin_field']")
	public WebElement CVVNumber_Input;
	
	@FindBy(xpath = "//*[@data-auid='btncheckout_payment_apply_gift_card_btn']")
	public WebElement giftCardApplyButton;
	
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
	@FindBy(xpath = "//*[@data-auid='btnCheckout']")
	public WebElement checkoutBtnATCCartPage;
	

	@FindBy(xpath = "//*[text()='PayPal']")
	public WebElement payPalPaymentOption;

	@FindBy(xpath = "//*[@class='loadcardInfo']")
	public WebElement plccCardOnCreditCardTxtField;
	@FindBy(xpath = "//*[text()='Unrecognized card number']")
	public WebElement invalidCardNumberErrorMsg;
	// Footer
	@FindBy(xpath = "//*[@data-auid='checkout_footer_accepted_card_PLCC_icon']")
	public WebElement plccCreditCardImageFooter;
	@FindBy(xpath="//*[@data-auid='checkout_payment_collapsed']")
	public WebElement paymentScetionCheckoutPage;
	@FindBy(xpath="//*[contains(text(),'Academy Sports + Outdoors Credit Card ending in - ')]")
	public WebElement savedCardCheckoutPage;
	@FindBy(xpath="//*[@id='checkout-payment-drawer']//div[3]/div[1]//button")
	public WebElement savedCardDropDown;
	@FindBy(xpath="//*[contains(text(),'Gift Card Ending In - ')]")
	public WebElement savedGiftCardDropDown;
	
	
	//Buy Now
	@FindBy(xpath = "//*[text()='Same As Shipping Address']")
	public WebElement selctsameAsShippingcheckbox;
	@FindBy(xpath = "//*[@data-auid='btndefaultPaymentFormSubmit']")
	public WebElement btndefaultPaymentFormSubmit;
	
	@FindBy(xpath = "//button[@class='mini-cart'] | //*[@class='academyicon icon-cart']") //MJR 11/15/19
	public WebElement cartIcon;
	@FindBy(xpath = "//*[text()='Add a New Credit Card']")
	public WebElement addNewCardOption;
	@FindBy(xpath = "//*[text()='Add a New Gift Card']")
	public WebElement addNewGiftCardOption;
	
	
	@FindBy(xpath = "//*[text()='Remove from Cart'] | //*[@data-auid='crt_btnRmvFromCart_710320043']")
	public WebElement RemoveFromCartBtn;
	
	@FindBy(xpath = "//img[@src='/content/dam/academysports/Logo.png']")
	public WebElement academyLogoIcon; 
	

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
	@FindBy(xpath = "//*[@data-auid='btnAddToCart']")
	public WebElement addToCartButton;
	
	
	//BuyNow:
	
	@FindBy(xpath = "//*[@data-auid='btnundefined']")
	public WebElement buyNowButton;

	//Saved Card:
	@FindBy(xpath = "//li[3]//div[1]/a")
	public WebElement editLinkPaymentSection;
	@FindBy(xpath = "//*[text()='Add a New Credit Card']")
	public WebElement addNewCreditCardOption;
	@FindBy(xpath = "//*[text()='Confirm']")
	public WebElement confirmButton;
	
	
	@FindBy(xpath = "//*[@data-auid='btnundefined']")
	//@FindBy(xpath = "//form/button[@data-auid='btnundefined']")
	//@FindBy(xpath = "//form/button[@class='css-1aboma9 em811yu0']")
	public WebElement clickBuynowBtnInPopupModal; 
	
	

	// Confirmation Page
	@FindBy(xpath = "//*[text()='a confirmation email is on its way']")
	public WebElement emailOnItsWayTxt;
	@FindBy(xpath = "//*[@data-auid='checkout_order_confirmation_print_orderDetails_link']")
	public WebElement printLinkOnOrderConfirmationPage;
	@FindBy(xpath = "//*[@data-auid='checkout_order_confirmation_create_account_link']")
	public WebElement myAccountLinkOnOrderConfirmationPage;
	//@FindBy(xpath = "//*[@data-component='orderConfirmation']") commented by HP 05_27_19
	@FindBy(xpath = "//*[@class=contains(text(),'orderConfirmation')] //*[@data-component='orderConfirmation']")
	public WebElement orderConfirmationPage;
	
	@FindBy(xpath = "//*[text()='Save Payment Info for Later']")
	public WebElement savePaymentInfoForLaterCheckBox;
	@FindBy(xpath="//*[text()='WE ACCEPT']")
	public WebElement weAcceptLabel;
	@FindBy(xpath="//*[@src='/content/dam/academysports/cart-and-checkout/cards-accepted/plcc.png']")
	public WebElement plccCardImageFooter;
	@FindBy(xpath = "//*[@data-auid='btnviewCart']")
	public WebElement viewCartButton;
	@FindBy(xpath = "//*[@class='justify-content-end academyicon icon-chevron-down css-1zd88g']")
	public WebElement creditCardDropDown;
	
	
	//Promotions:
	@FindBy(xpath = "//*[text()='Add Promo code']")
	public WebElement addPromoCodeLink;
	@FindBy(xpath = "//*[@data-auid='crt_inputPromo']")
	public WebElement promoCodeInputField;
	@FindBy(xpath = "//*[@data-auid='btncrt_btnPromoSbmt']")
	public WebElement submitPromoCode;	
	@FindBy(xpath = "//*[text()='Remove']")
	public WebElement removepromo;
	@FindBy(xpath = "//*[text()='Discount']")
	public WebElement discountTxt;
	@FindBy(xpath = "//*[text()='-$15.00']")
	public WebElement fifteenPercentOff;
	@FindBy(xpath = "//*[@data-auid='checkout_order_summary_section']")
	public WebElement orderSummarySection;
	@FindBy(xpath = "//*[@data-auid='checkout_unauth_description_signin_link']")
	public WebElement SingInLinkForGuestuser;
	@FindBy(xpath = "//*[@data-auid='btnviewCart']")
	public WebElement viewCartBtn;
	@FindBy(xpath = "//*[@class='container p-0 css-g2tac']")
	public WebElement addPromoSection;
	@FindBy(xpath = "//*[@data-auid='crt_btnRmPromo_0']")
	public WebElement removePromoCodeLink;
	@FindBy(xpath = "//*[@data-auid='crt_inputQty']")
	public WebElement quantityInputField;
	
	
	//Error -Invalid PreScreen Code
	
	@FindBy(xpath = "//*[@data-auid='prescreen_error'] | //*[text()='Your Prescreen ID was not found. You may complete a credit application.']" )
	public WebElement errorInvalidPreScreenCode;
	
	
	
	// Order Summary:
		@FindBy(xpath = "//*[@data-auid='checkout_order_summary_section']//div[4]/div[2]")
		public WebElement discountValue;
		
	//Checkout - Save card
		@FindBy(xpath = "//*[@data-auid='payment_type_with_card']")
		public WebElement paymentCardTypeLabel;
		
	
	//Free Shipping:
	@FindBy(xpath = "//*[@data-auid='freeShip']")
	public WebElement freeShippingTxt;
	@FindBy(xpath = "//*[@data-auid='freeShipValue']")
	public WebElement freeShipValue;
	
	@FindBy(xpath="//*[contains(text(),' Free Shipping on footwear and orders over')]")
	public WebElement standardFreeShipValue;
	
	//Invalid PreScreen Code:
	public void verifyPresenceOfErrorInvalidPreScreenCode() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			Assert.assertTrue(isDisplayed(errorInvalidPreScreenCode));
			logger.debug("Error messgage when user enter invalid Pre-screen is displayed++++++++++++++++++++++++");
		} else {
			Assert.assertTrue(isDisplayed(errorInvalidPreScreenCode));
			logger.debug("Error messgage when user enter invalid Pre-screen is displayed++++++++++++++++++++++++");
		}

	}
	
	//enter Prmo Code
	public void enterPromoCode(String arg) throws Exception {
		setInputText(promoCodeInputField, webPropHelper.getTestDataProperty(arg));
	}
	public void verifyPresenceOfFreeShipping() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			Assert.assertTrue(isDisplayed(freeShippingTxt));
			logger.debug("Free Shipping is displayed++++++++++++++++++++++++");
		} else {
			Assert.assertTrue(isDisplayed(freeShippingTxt));
			logger.debug("Free Shipping is displayed++++++++++++++++++++++++==");
		}

	}
	public void verifyPresenceOfStandardFreeShipping() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			Assert.assertTrue(isDisplayed(standardFreeShipValue));
			logger.debug("Free Shipping is displayed++++++++++++++++++++++++");
		} else {
			Assert.assertTrue(isDisplayed(standardFreeShipValue));
			logger.debug("Free Shipping is displayed++++++++++++++++++++++++==");
		}

	}
	public void verifyPresenceOfPaymentCardTypeLabel() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			Assert.assertTrue(isDisplayed(paymentCardTypeLabel));
			logger.debug("Saved Card Type is dispalyed++++++++++++++++++++++++");
		} else {
			Assert.assertTrue(isDisplayed(paymentCardTypeLabel));
			logger.debug("Saved Card Type is dispalyed++++++++++++++++++++++++");
		}

	}
	public void verifyPresenceOfCartIcon() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			Assert.assertTrue(isDisplayed(cartIcon));
			logger.debug("Cart Icon is dispalyed++++++++++++++++++++++++");
		} else {
			Assert.assertTrue(isDisplayed(cartIcon));
			logger.debug("Cart Icon is dispalyed++++++++++++++++++++++++");
		}

	}
	
	public boolean  verifyFreeShippingisNotApplied() throws Exception {

		try {
			Assert.assertTrue(isDisplayed(freeShippingTxt));
	        return true;
	    } catch (org.openqa.selenium.NoSuchElementException e)
		{
	        return false;
	    }

	}
	
	public void verifyPresenceOfDiscountValue() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(discountValue));
			logger.debug("Discount Value is displayed++++++++++++++++++++++++");
		} else {
			assertTrue(isDisplayed(discountValue));
			logger.debug("Discount Value is displayed++++++++++++++++++++++++==");
		}

	}
	public void verifyPresenceOfRemovePromoCard() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(removePromoCodeLink));
			logger.debug("Remove Promo Card is displayed++++++++++++++++++++++++");
		} else {
			assertTrue(isDisplayed(removePromoCodeLink));
			logger.debug("Remove Promo Card is displayed++++++++++++++++++++++++==");
		}

	}
	
	public void verifyPresenceOfCheckoutLinkOnCartPage() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			Assert.assertTrue(isDisplayed(checkoutBtnATCCartPage));
			
			logger.debug("Checkout Link is displayed++++++++++++++++++++++++");
		} else {
			Assert.assertTrue(isDisplayed(checkoutBtnATCCartPage));
			logger.debug("Checkout Link is displayed++++++++++++++++++++++++==");
		}

	}
	public void verifyPresenceOfQuantityInput() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(quantityInputField));
			logger.debug("Quantity Input field is displayed++++++++++++++++++++++++");
		} else {
			assertTrue(isDisplayed(quantityInputField));
			logger.debug("Quantity Input field is displayed++++++++++++++++++++++++==");
		}

	}
	

	public void enterItemQuantity(String arg) throws Exception {
		setInputText(quantityInputField, webPropHelper.getTestDataProperty(arg));
	}
	
	public void verifyPresenceOfViewCartBtn() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(viewCartBtn));
			logger.debug("View Cart button is displayed++++++++++++++++++++++++");
		} else {
			assertTrue(isDisplayed(viewCartBtn));
			logger.debug("View Cart button is displayed++++++++++++++++++++++++==");
		}

	}
	public void verifyPresenceOfPromoCodeSection() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			Assert.assertTrue(isDisplayed(addPromoSection));
			logger.debug("Promo code section is displayed++++++++++++++++++++++++");
		} else {
			Assert.assertTrue(isDisplayed(addPromoSection));
			logger.debug("Promo code section is displayed++++++++++++++++++++++++==");
		}

	}
	

	
	
	public void verifyPresenceOfDiscountText() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(discountTxt));
			logger.debug("Discount Text is displayed++++++++++++++++++++++++");
		} else {
			assertTrue(isDisplayed(discountTxt));
			logger.debug("Discount Text is displayed++++++++++++++++++++++++==");
		}

	}
	public boolean  verifyAbsenceOfDiscountText() throws Exception {

		try {
			isDisplayed(discountTxt);
	        return true;
	    } catch (org.openqa.selenium.NoSuchElementException e)
		{
	        return false;
	    }

	}

	public void verifyPresenceOfFiftennDollarsOff() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(fifteenPercentOff));
			logger.debug("15% Discount is applied++++++++++++++++++++++++");
		} else {
			assertTrue(isDisplayed(fifteenPercentOff));
			logger.debug("15% Discount is applied++++++++++++++++++++++++==");
		}

	}
	
		public void verifyPresenceOfAddPromoCodeButton() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(addPromoCodeLink));
			logger.debug("Add Promo Code Link is displayed++++++++++++++++++++++++");
		} else {
			assertTrue(isDisplayed(addPromoCodeLink));
			logger.debug("Add Promo Code Link is displayed++++++++++++++++++++++++==");
		}

	}
	public void verifyPresenceOfPromoCodeInputField() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(promoCodeInputField));
			logger.debug("Promo Card Input Field is displayed++++++++++++++++++++++++");
		} else {
			assertTrue(isDisplayed(promoCodeInputField));
			logger.debug("Promo Card Input Field is displayed++++++++++++++++++++++++==");
		}

	}
	public void verifyPresenceOfSubmitPromoCard() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			Assert.assertTrue(isDisplayed(submitPromoCode));
			logger.debug("Submit Promo Code Button is displayed++++++++++++++++++++++++");
		} else {
			Assert.assertTrue(isDisplayed(submitPromoCode));
			logger.debug("Submit Promo Code Button is displayed++++++++++++++++++++++++==");
		}

	}
	
	public void verifyPresenceOfOrderSummary() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			Assert.assertTrue(isDisplayed(orderSummarySection));
			logger.debug("Order Summary is displayed++++++++++++++++++++++++");
		} else {
			Assert.assertTrue(isDisplayed(orderSummarySection));
			logger.debug("Order Summary is displayed++++++++++++++++++++++++==");
		}

	}
	
	public void verifyPresenceOfSignInLinkForGuestUser() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			Assert.assertTrue(isDisplayed(SingInLinkForGuestuser));
			logger.debug("Signin Link displayed for Guest User++++++++++++++++++++++++");
		} else {
			Assert.assertTrue(isDisplayed(SingInLinkForGuestuser));
			logger.debug("Signin Link displayed for Guest User++++++++++++++++++++++++==");
		}

	}
			
		
	
	public void verifyPresenceOfViewCartButton() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(viewCartButton));
			logger.debug("View Cart Button is displayed++++++++++++++++++++++++");
		} else {
			assertTrue(isDisplayed(viewCartButton));
			logger.debug("View Cart Button is displayed++++++++++++++++++++++++==");
		}

	}
	
	public void verifyPresenceOfPlccCardImageFooter() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(plccCardImageFooter));
			logger.debug("plcc Card Image in footer of Cart Page is displayed++++++++++++++++++++++++");
		} else {
			assertTrue(isDisplayed(plccCardImageFooter));
			logger.debug("plcc card Image in footer of Cart Page is displayed++++++++++++++++++++++++==");
		}

	}
	public void verifyPresenceOfWeAcceptLabel() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			Assert.assertTrue(isDisplayed(weAcceptLabel));
			logger.debug("We Accept Label in footer of Cart Page is displayed++++++++++++++++++++++++");
		} else {
			Assert.assertTrue(isDisplayed(weAcceptLabel));
			logger.debug("We Accept Label in footer of Cart Page is displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfCartPage() throws Exception {
		String currentURL = getCurrentPageURL();
		try {
			Assert.assertTrue(currentURL.contains("/shop/cart"));
				} catch (Exception e) {
			logger.debug("User is not able to navigate to Cart Page instead navigated to URL :: " + currentURL);
			logger.error(">>>>>>>>>>>>>>>>>>>>"+ e.getMessage());
		}
	}
	

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
			assertTrue(isDisplayed(savePaymentInfoForLaterCheckBox));
			logger.debug("Save Payment Info for Later CheckBox is displayed++++++++++++++++++++++++");
		} else {
			assertTrue(isDisplayed(savePaymentInfoForLaterCheckBox));
			logger.debug("Save Payment Info for Later CheckBox is displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfCreditCardRadioButton() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(CreditCard_radioBtn));
			logger.debug("Credit Card  Radio button is displayed");
		} else {
			assertTrue(isDisplayed(CreditCard_radioBtn));
			logger.debug("Credit Card Radio button is displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfInvalidCardNumberErrorMsg() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(invalidCardNumberErrorMsg));
			logger.debug("Unrecognized card number is displayed");
		} else {
			assertTrue(isDisplayed(invalidCardNumberErrorMsg));
			logger.debug("Unrecognized card number is displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfPlccCardOnCreditCardTxtField() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(plccCardOnCreditCardTxtField));
			logger.debug("PLCC Card on Credit Card Text Field is displayed");
		} else {
			assertTrue(isDisplayed(plccCardOnCreditCardTxtField));
			logger.debug("PLCC Card on Credit Card Text Field is displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfCreditCardTextField() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(CreditCardNumber_Input));
			logger.debug("Credit Card Text Field is displayed");
		} else {
			assertTrue(isDisplayed(CreditCardNumber_Input));
			logger.debug("Credit Card Text Field is displayed++++++++++++++++++++++++==");
		}

	}
	public void verifyPresenceOfAddNewCreditCardOption() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(addNewCreditCardOption));
			logger.debug("Add New Credit Card Option is displayed");
		} else {
			assertTrue(isDisplayed(addNewCreditCardOption));
			logger.debug("Add New Credit Card Option is displayed");
		}

	}
	

	public void clickOnCheckoutButton() throws Exception {

		{
			assertTrue(isDisplayed(checkoutBtnATC));
			assertTrue(isClickable(checkoutBtnATC));
			assertTrue(clickOnButton(checkoutBtnATC));
		}

	}

	public void enterCardBinNumber(String arg) throws Exception {
		setInputText(CreditCardNumber_Input, webPropHelper.getTestDataProperty(arg));
	}

	// Payment Page Card Images reusable methods
	public void verifyPresenceOfPlccCardImageOnCCField() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(plccCardImageOnCCField));
			logger.debug("PLCC Card Image on Credit Card Text Field is displayed++++++++++++++++++++++++==");
		} else {
			assertTrue(isDisplayed(plccCardImageOnCCField));
			logger.debug("PLCC Card Image on Credit Card Text Field is displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfVisaCardImageOnCCField() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(visaCardImageOnCCField));
			logger.debug("VISA Card Image on Credit Card Text Field is displayed++++++++++++++++++++++++==");
		} else {
			assertTrue(isDisplayed(visaCardImageOnCCField));
			logger.debug("VISA Card Image on Credit Card Text Field is displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfMasterCardImageOnCCField() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(masterPalPaymentOption));
			logger.debug("Master Card Image on Credit Card Text Field is displayed++++++++++++++++++++++++==");
		} else {
			assertTrue(isDisplayed(masterPalPaymentOption));
			logger.debug("Master Card Image on Credit Card Text Field is displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfDiscoveCardImageOnCCField() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(discoverPalPaymentOption));
			logger.debug("Discover Card Image on Credit Card Text Field is displayed++++++++++++++++++++++++==");
		} else {
			assertTrue(isDisplayed(discoverPalPaymentOption));
			logger.debug("Discover Card Image on Credit Card Text Field is displayed++++++++++++++++++++++++==");
		}
	}

	public void verifyPresenceOfAmexCardImageOnCCField() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(amexCardImageOnCCField));
			logger.debug("Amex Card Image on Credit Card Text Field is displayed++++++++++++++++++++++++==");
		} else {
			assertTrue(isDisplayed(amexCardImageOnCCField));
			logger.debug("Amex Card Image on Credit Card Text Field is displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfInvalidErrorMessageOnCCField() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(r2CheckOutPo.UnrecognizedCardNumber_Txt));
			logger.debug("Unrecognized card number error message is displayed++++++++++++++++++++++++==");
		} else {
			assertTrue(isDisplayed(r2CheckOutPo.UnrecognizedCardNumber_Txt));
			logger.debug("Unrecognized card number error message is displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfCreditCardImageOnCCField() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(r2CheckOutPo.Checkout_CreditCardPay_ImgLogo));
			logger.debug("Credit Card Image on credit card Text Field is displayed++++++++++++++++++++++++==");
		} else {
			assertTrue(isDisplayed(r2CheckOutPo.Checkout_CreditCardPay_ImgLogo));
			logger.debug("Credit Card Image on credit card Text Field is displayed++++++++++++++++++++++++==");
		}
	}

	public void verifyPresenceOfEditMyCartLink() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(r2CheckOutPo.btnEditCart));
			logger.debug("Edit My Cart Link is displayed++++++++++++++++++++++++==");
		} else {
			assertTrue(isDisplayed(r2CheckOutPo.btnEditCart));
			logger.debug("Edit My Cart Link  is displayed++++++++++++++++++++++++==");
		}
	}

	public void verifyPresenceOfRemoveFromCartLink() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(r2CheckOutPo.AS_btnRemoveFromCart));
			logger.debug("Remove from Cart Link is displayed++++++++++++++++++++++++==");
		} else {
			assertTrue(isDisplayed(r2CheckOutPo.AS_btnRemoveFromCart));
			logger.debug("Remove from cart Link is displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfExpiryTextField() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(r2CheckOutPo.txtExpirationDate));
			assertTrue(isDisplayed(r2CheckOutPo.txtExpirationDateInput));
			logger.debug("Expiry Date Text Field is displayed++++++++++++++++++++++++==");
		} else {
			assertTrue(isDisplayed(r2CheckOutPo.txtExpirationDate));
			assertTrue(isDisplayed(r2CheckOutPo.txtExpirationDateInput));
			logger.debug("Expiry Date Text Field is displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfCvvTextField() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(r2CheckOutPo.txtCVVInput));
			logger.debug("CVV Text Field is displayed++++++++++++++++++++++++==");
		} else {
			assertTrue(isDisplayed(r2CheckOutPo.txtCVVInput));
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
			assertTrue(isDisplayed(plccCreditCardImageFooter));
			logger.debug("PLCC Credit Card Image in fooer is displayed++++++++++++++++++++++++==");
		} else {
			assertTrue(isDisplayed(plccCreditCardImageFooter));
			logger.debug("PLCC Credit Card Image in fooer is displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfEmailOnItsWayTxt() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(emailOnItsWayTxt));
			logger.debug("Email is on its way text is displayed");
		} else {
			assertTrue(isDisplayed(emailOnItsWayTxt));
			logger.debug("Email is on its way text is displayed++++++++++++++++++++++++==");
		}

	}

	public void verifyPresenceOfEditPayment_Link() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(checkout_po.EditPayment_Link));
			logger.debug("Edit link of payment section on checkout page is displayed");
		} else {
			assertTrue(isDisplayed(checkout_po.EditPayment_Link));
			logger.debug("Edit link of payment section on checkout page is displayed");
		}

	}

	public void verifyPresenceOfReviewOrderButton() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(checkout_po.ReviewOrder_Btn));
			logger.debug("Edit link of payment section on checkout page is displayed");
		} else {
			assertTrue(isDisplayed(checkout_po.ReviewOrder_Btn));
			logger.debug("Edit link of payment section on checkout page is displayed");
		}
	}

	public void verifyPresenceOfPlaceOrderButton() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(checkout_po.btnPlaceOrderPaymentPage));
			logger.debug("PLACE ORDER Button is displayed");
		} else {
			assertTrue(isDisplayed(checkout_po.btnPlaceOrderPaymentPage));
			logger.debug("PLACE ORDER Button is displayed");
		}
	}

	public void verifyPresenceOfOrderConfirmationPage() throws Exception {
		Thread.sleep(10000);
		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(orderConfirmationPage));
			logger.debug("Order Confirmation Page is displayed");
		} else {
			assertTrue(isDisplayed(orderConfirmationPage));
			logger.debug("Order Confirmtion Page is displayed");
		}
	}

	public void verifyPresenceOfOrderSuccesfullStatus() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(checkout_po.txtOrderSuccesfullStatus));
			logger.debug("THANKS FOR SUBMITTING YOUR ORDER! is displayed");
		} else {
			assertTrue(isDisplayed(checkout_po.txtOrderSuccesfullStatus));
			logger.debug("THANKS FOR SUBMITTING YOUR ORDER! is displayed");
		}
	}

	public void verifyPresenceOfOrderNumber() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(checkout_po.orderSubmitted_OrderNumber));
			logger.debug("Order Number is displayed");
		} else {
			assertTrue(isDisplayed(checkout_po.orderSubmitted_OrderNumber));
			logger.debug("Order Number is displayed");
		}
	}

	public void verifyPresenceOfEmailOnItsWayText() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(emailOnItsWayTxt));
			logger.debug("a confirmation email is on its way Text is displayed");
		} else {
			assertTrue(isDisplayed(emailOnItsWayTxt));
			logger.debug("a confirmation email is on its way Text is displayed");
		}
	}
	public void verifyPresenceOfEditLinkPaymentSectionCheckoutPage() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(editLinkPaymentSection));
			logger.debug("Edit Link Payment Scetion on Checkout Page is displayed");
		} else {
			assertTrue(isDisplayed(editLinkPaymentSection));
			logger.debug("Edit Link Payment Scetion on Checkout Page is displayed");
		}
	}
	

	public void verifyPresenceOfPrintLinkOnOrderConfirmationPage() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(printLinkOnOrderConfirmationPage));
			logger.debug("Print Link on order confirmation Page is displayed");
		} else {
			assertTrue(isDisplayed(printLinkOnOrderConfirmationPage));
			logger.debug("Print Link on order confirmation Page is displayed");
		}
	}

	public void verifyPresenceOfMyAccountLinkOnOrderConfirmationPage() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(myAccountLinkOnOrderConfirmationPage));
			logger.debug("My Account Link on order confirmation Page is displayed");
		} else {
			assertTrue(isDisplayed(myAccountLinkOnOrderConfirmationPage));
			logger.debug("My Account Link on order confirmation Page is displayed");
		}
	}
	public void verifyPresenceOfPaymentSectionOnCheckoutPage() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(paymentScetionCheckoutPage));
			logger.debug("Payment Scetion of Checkout Page is displayed");
		} else {
			assertTrue(isDisplayed(paymentScetionCheckoutPage));
			logger.debug("Payment Scetion of Checkout Page is displayed");
		}
	}
	public void verifyPresenceOfSavedCardCheckoutPage() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(savedCardCheckoutPage));
			logger.debug("Academy Sports + Outdoors Credit Card ending in - is displayed");
		} else {
			assertTrue(isDisplayed(savedCardCheckoutPage));
			logger.debug("Academy Sports + Outdoors Credit Card ending in - is displayed");
		}
	}
	public void verifyPresenceOfConfirmButton() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(confirmButton));
			logger.debug("Confirm button on checkout page is displayed");
		} else {
			assertTrue(isDisplayed(confirmButton));
			logger.debug("Confirm button on checkout page is displayed");
		}
	}
	
	public void verifyPresenceOfBuyNowButton() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(buyNowButton));
			logger.debug("Buy Now Button is displayed");
		} else {
			assertTrue(isDisplayed(buyNowButton));
			logger.debug("Buy Now button is displayed");
		}
	}
	public void verifyGiftCardPaymentAppliedMessageCheckoutPage() throws Exception {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(giftCardPaymentAppliedMessage));
			logger.debug("Gift Card XXXX - XXXX - XXXX - XXXX added - is displayed");
		} else {
			assertTrue(isDisplayed(giftCardPaymentAppliedMessage));
			try {
				System.out.println("Giftcard Payment Applied Message: "+ giftCardPaymentAppliedMessage);
			} catch (Exception e) {
				System.out.println("Exception Message: "+e.getMessage());
			}
			logger.debug("Gift Card XXXX - XXXX - XXXX - XXXX added - is displayed");
		}
	}
	
	public void enterGiftCardNumber(String arg) throws Exception {
		setInputText(GiftCardNumber_Input, webPropHelper.getTestDataProperty(arg));
	}
	
	public void enterCVVNumber(String arg) throws Exception {
		setInputText(CVVNumber_Input, webPropHelper.getTestDataProperty(arg));
	}
	

	public void enterExpiryDateField(String arg) throws Exception {
		setInputText(r2CheckOutPo.txtExpirationDateInput, webPropHelper.getTestDataProperty(arg));
	}

	public void enterCVVField(String arg) throws Exception {
		setInputText(r2CheckOutPo.txtCVVInput, webPropHelper.getTestDataProperty(arg));
	}
	
	public void verifyPresenceOfCaliforniaRestrictionDisclaimer() {
		String actualCaliforniaDisclaimer = getText(californiaDisclaimerMessage);
		String expectedDisclaimerMessage = webPropHelper.getTestDataProperty("CaliforniaRestrictionDisclaimerMessage");
		assertTrue(actualCaliforniaDisclaimer.equals(expectedDisclaimerMessage));
	}
	
	public void verifyPresenceOfCaliforniaRestrictionDisclaimerOnPrescreenForm() {
		String actualCaliforniaDisclaimer = getText(californiaDisclaimerMessagePreScreen);
		String expectedDisclaimerMessage = webPropHelper.getTestDataProperty("CaliforniaRestrictionDisclaimerMessage");
		assertTrue(actualCaliforniaDisclaimer.equals(expectedDisclaimerMessage));
	}
	
	@FindBy(xpath="(//form[@name='creditApplicationModal']//p[contains(@text(),'')])[4]")
	public WebElement californiaDisclaimerMessage;
	@FindBy(xpath="(//form[@name='creditApplicationModal']//p[contains(@text(),'')])[2]") public WebElement californiaDisclaimerMessagePreScreen;
	@FindBy(xpath="//div[@name='state']//button") public WebElement accmodal_statedropdownbtn;
	@FindBy(xpath="//div[@name='state']//li[@class='dp_list_options ']//span") public List<WebElement> acc_modal_stateDropDownList;
	@FindBy(xpath="//*[@data-auid='credit_application_zipcode']//..//..//..//p") public WebElement caZIPRestrictionError;
	
	
	public void verifyCaliforniaStateCodeIsNotPresentInStateDropdown() {
		String californiaStateCode = webPropHelper.getTestDataProperty("californiaStateCode");
		assertTrue(isDisplayed(accmodal_statedropdownbtn));
		clickOnButton(accmodal_statedropdownbtn);
		System.out.println(acc_modal_stateDropDownList.size());
		for (WebElement stateCodes : acc_modal_stateDropDownList) {
			assertFalse(getText(stateCodes).equalsIgnoreCase(californiaStateCode));
		}
	}
	
	public void verifyCaliforniaRestrictionErrorMessageIsDisplayedBelowZIPTextBox() {
		assertTrue(isDisplayed(caZIPRestrictionError));
		assertTrue(getText(caZIPRestrictionError).equals(webPropHelper.getTestDataProperty("ErrorMessageOncaliforniaZIPCode")));
	}
}