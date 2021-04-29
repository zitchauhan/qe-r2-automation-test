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
}
