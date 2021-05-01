package com.aso.qe.test.pageobject.ios;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class OrdersPage {
private AppiumDriver<MobileElement> driver;
	
	public OrdersPage(AppiumDriver<MobileElement> driver) {
	  this.driver = driver;
	}
	
	public boolean isOrderSummaryElementsDisplayed(String element) {
		switch(element) {
		case "Subtotal":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.labelSubtotal);
		case "Store Pick Up":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.labelStorePickup);
		case "e-Delivery":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.labeledelivery);
		case "Taxes":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.labelTaxes);
		case "Discount":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.labelDiscount);
		case "Card":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.labelCard);
		case "Gift card":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.labelGiftCard);
		case "Gift card digits":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.labelGiftCardDigits);
		case "Gift card amount":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.labelGiftCardAmount);
		default:
			throw new IllegalStateException("Invalid Element");
		}
	}

	public boolean isCancellationScreenElementDisplayed(String element) {
		switch(element) {
		case "Cancellation message":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.cancellationMessage);
		case "Confirmation email message":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.confirmationEmail);
		case "Cancellation Date":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.cancellationDate);
		case "Product Image":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.productImage);
		case "Product name":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.productName);
		case "Sku id":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.skuID);
		case "Quantity":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.quantity);
		case "Price":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.price);
		case "Refund message":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.refundMessage);
		case "Refund disclaimer":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.refundDisclaimer);
		case "Subtotal":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.subtotal);
		case "Taxes":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.taxes);
		case "Shipping charges":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.shippingCharges);
		case "Refund amount":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.refundAmount);
		case "Refunded to":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.refundedTo);
		default:
			throw new IllegalStateException("Invalid Element");
		}
	}
}
