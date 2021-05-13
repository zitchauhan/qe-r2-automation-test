package com.aso.qe.test.pageobject.ios;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.PropertiesHelper;
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

	public void isGetNotificationToTrackOrderDisplayed() {
		assertTrue("Get notification to track order link isnot displayed",GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.getNotificationLink));
		
	}

	public void tapOnGetNotificationToTrackOrder() {
		GlobalMobileHelper.tapOnElement(Locators.OrdersPage.getNotificationLink);
		
	}
	public void verifyPaymentMethodLabel() {
		assertTrue("Payment method label is not present !", GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.paymentMethodLabel));
	}

	public void verifyPaymentImage(String paymentType) {
		switch(paymentType){
			case "Credit Card":
				assertTrue("Credit card image is not present !", GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.creditCardimage));
			case "Gift Card":
				assertTrue("Gift card image is not present !", GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.giftCardImage));
			case "PayPal":
				assertTrue("PayPal image is not present !", GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.paypalImage));
			case "ApplePay":
				assertTrue("ApplePay image is not present !", GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.applePayImage));
			default:
				throw new IllegalStateException("Payment method didn't match"); }
	}

	public void verifyCardNumber(String paymentType) {
		// TODO Auto-generated method stub
		
	}

	public void isGiftCardAmountDisplayed() {
		assertTrue("Gift card amount is not displayed !", GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.giftCardAmount));
	}

	public void isPayementMethodDisplayed(String paymentType) {
		switch(paymentType){
		case "Gift Card":
			assertTrue("Gift label is not present !", GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.giftCardLabel));
		case "PayPal":
			assertTrue("PayPal label is not present !", GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.paypalLabel));
		case "ApplePay":
			assertTrue("ApplePay label is not present !", GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.applePayLabel));
		default:
			throw new IllegalStateException("Payment method didn't match"); }
	}

	public void tapOnListedOrders(String order) {
		List<MobileElement> orderList = driver.findElements(Locators.OrdersPage.orderListItem);
		for(int i =1; i<=orderList.size();i++) {
			if(i==Integer.parseInt(order)) {
				orderList.get(i).click();
			}
		}
	}

	public void isFieldDisplayedOnOrderDetailsPage(String fieldtype) {
		switch(fieldtype){
		case "OrderDetailPageTitle":
			assertTrue("Order Details Page has not displayed", GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.orderDetailPageTitle));
		case "OrderLabel":
			assertTrue("Order label is not present !", GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.orderLabel));
		case "Date Order Placed":
			assertTrue("Date label is not present !", GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.dateOrderPlacedLabel));
		case "Order Total":
			assertTrue("Order Total label is not present !", GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.orderTotalLabel));
		case "Home Delivery Bucket":
			assertTrue("PayPal label is not present !", GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.homeDeliveryTitle));
		case "User Name":
			assertTrue("User Name label is not present !", GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.userName));
		case "Shipping Address":
			assertTrue("Shipping Address label is not present !", GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.shippingAddress));
		case "order status":
			assertTrue("order status label is not present !", GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.orderStatus));
		case "Delivery Service":
			assertTrue("Delivery Service label is not present !", GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.deliveryServiceType));
		case "Track Package":
			assertTrue("Track Package label is not present !", GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.trackPackageLabel));
		case "Product Thumbnail":
			assertTrue("Product Thumbnail is not present !", GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.productImage));
		case "SKU Id":
			assertTrue("SKU Id is not present !", GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.skuID));
		case "Quantity":
			assertTrue("Quantity label is not present !", GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.quantity));
		case "Product Name":
			assertTrue("Product Name is not present !", GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.productName));
		case "Price":
			assertTrue("Price label is not present !", GlobalMobileHelper.isElementDisplayed(Locators.OrdersPage.price));
		default:
			throw new IllegalStateException("field not displayed"); }
	}

	public void enterValuesOnOrdersPage(String value) {
		String valueText= PropertiesHelper.getInstance().getMobileTestDataProperty(value);
	
		switch(value){
		case "Order Number":
			GlobalMobileHelper.setText(Locators.OrdersPage.orderNumberEditbox, valueText);
		case "BillingZipcode":
			GlobalMobileHelper.setText(Locators.OrdersPage.billingZipcodeEditbox, valueText);	
		}
		
	}

	public void tapOnCheckBtn() {
		GlobalMobileHelper.tapOnElement(Locators.OrdersPage.checkBtn);
		
	}
	}


