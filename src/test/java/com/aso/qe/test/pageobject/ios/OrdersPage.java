package com.aso.qe.test.pageobject.ios;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.util.List;
import java.util.Locale;

import static org.junit.Assert.assertTrue;

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

    public void verifyElementsEDeliveryTitle(List<String> elementsList) {
		for (String element: elementsList){
			switch (element.toLowerCase()){
				case "sender information label":
					assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.senderInformationLabel));
					break;
				case "sender first name":
					assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.senderFirstName));
					break;
				case "sender last name":
					assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.senderLastName));
					break;
				case "sender email id":
					assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.senderEmailId));
					break;
				case "recipient information label":
					assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.recipientInformationLabel));
					break;
				case "recipient first name":
					assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.recipientFistName));
					break;
				case "recipient last name":
					assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.recipientLastName));
					break;
				case "recipient email id":
					assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.recipientEmailId));
					break;
				case "prefilled user message":
					assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.prefilledUserMessage));
					break;
				case "message stating that egift card will be delivered within 2 hours":
					assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.eGiftCardDeliveryMessage2hrs));
					break;
				case "e-gift card name":
					assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.eGiftCardName));
					break;
				case "sku id":
					assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.skuID));
					break;
				case "color attribute":
					assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.labelColorAttribute));
					break;
				case "quantity":
					assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.eGiftQty));
					break;
				case "denomination":
					assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.labelGiftCardAmount));
					break;
				case "message stating that you have selected to send all <<x>> gift cards to the same recipient":
					assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.labelGiftCardDigits));
					assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.eGiftCardMoreRecipientMessage));
					break;
				default:
					throw new UnsupportedOperationException("Verification of this element is not supported");
			}
		}
    }
    
    public void verifyElementsOnOrderConfirmationPage(List<String> elementsList) {
		for (String element: elementsList){
			switch (element.toLowerCase()){
				case "shipping address tile":
					assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.shippingAddressTile));
					break;
				case "home delivery tile":
					assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.homeDeliveryTile));
					break;
				case "store pickup tile":
					assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.storePickUpTile));
					break;
				case "user first name":
					assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.firstName));
					break;
				case "user last name":
					assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.lastName));
					break;	
				case "sla message":
					assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.slaMessage));
					break;	
				case "packages label":
					assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.packageLabel));
					break;	
				case "items count":
					assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.itemsCount));
					break;	
				case "shipping address":
					assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.shippingAddress));
					break;	
				default:
					throw new UnsupportedOperationException("Element is not present");
			}
		}
    }
}
