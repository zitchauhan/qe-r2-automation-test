package com.aso.qe.test.pageobject.ios;

import static org.junit.Assert.assertTrue;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.stepdefinition.ios.Hooks;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class OrderConfirmationPage {
	private static final Logger logger = Logger.getLogger(Hooks.class);
	private AppiumDriver<MobileElement> driver;
	
	public OrderConfirmationPage(AppiumDriver<MobileElement> driver) {
	  this.driver = driver;
	  PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	Context context = new Context();

	public void verifyPaymentMethodLabel() {
		assertTrue("Payment method label is not present !", GlobalMobileHelper.isElementDisplayed(Locators.OrderConfPage.paymentMethodLabel));
	}

	public void verifyPaymentImage(String paymentType) {
		switch(paymentType){
			case "Credit Card":
				assertTrue("Credit card image is not present !", GlobalMobileHelper.isElementDisplayed(Locators.OrderConfPage.creditCardimage));
			case "Gift Card":
				assertTrue("Gift card image is not present !", GlobalMobileHelper.isElementDisplayed(Locators.OrderConfPage.giftCardImage));
			case "PayPal":
				assertTrue("PayPal image is not present !", GlobalMobileHelper.isElementDisplayed(Locators.OrderConfPage.paypalImage));
			case "ApplePay":
				assertTrue("ApplePay image is not present !", GlobalMobileHelper.isElementDisplayed(Locators.OrderConfPage.applePayImage));
			default:
				throw new IllegalStateException("Payment method didn't match"); }
	}

	public void verifyCardNumber(String paymentType) {
		// TODO Auto-generated method stub
		
	}

	public void isGiftCardAmountDisplayed() {
		assertTrue("Gift card amount is not displayed !", GlobalMobileHelper.isElementDisplayed(Locators.OrderConfPage.giftCardAmount));
	}

	public void isPayementMethodDisplayed(String paymentType) {
		switch(paymentType){
		case "Gift Card":
			assertTrue("Gift label is not present !", GlobalMobileHelper.isElementDisplayed(Locators.OrderConfPage.giftCardLabel));
		case "PayPal":
			assertTrue("PayPal label is not present !", GlobalMobileHelper.isElementDisplayed(Locators.OrderConfPage.paypalLabel));
		case "ApplePay":
			assertTrue("ApplePay label is not present !", GlobalMobileHelper.isElementDisplayed(Locators.OrderConfPage.applePayLabel));
		default:
			throw new IllegalStateException("Payment method didn't match"); }
	}
}
