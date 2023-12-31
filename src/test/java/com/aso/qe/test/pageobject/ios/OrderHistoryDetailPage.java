package com.aso.qe.test.pageobject.ios;

import com.aso.qe.framework.common.PropertiesHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;

import com.aso.qe.framework.common.PropertiesHelper;
import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;

public class OrderHistoryDetailPage {
	private AppiumDriver<MobileElement> driver;

	private static final Logger logger = Logger.getLogger(OrderHistoryDetailPage.class.getName());

	public OrderHistoryDetailPage(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}

	public void tapOnOrderButton() {
		GlobalMobileHelper.setImplicitWaitTo(driver, 5);
		GlobalMobileHelper.tapOnElement(Locators.OrderDetail.buttonOrder);

	}

	public void isOrderPageDisplay() {

		assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.OrderDetail.labelOrderPage));
		logger.debug("Order page is displayed");
	}

	public void isOrderListDisplay() {

		assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.OrderDetail.listOrder));
		logger.debug("Order list is displayed");
	}

	public void isOrderDetailPageDisplay() {

		assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.OrderDetail.labelOrderDetailPage));
		logger.debug("Order list is displayed");
	}

	public void tapOnOrderId() {
		GlobalMobileHelper.tapOnElement(Locators.OrderDetail.buttonOrderId);

	}

	public boolean isCancelOrderButtonDisplayed() {
		MobileElement buttonCancelOrder = driver.findElement(Locators.OrderDetail.buttonCancelOrder);
		return GlobalMobileHelper.isElementDisplayed(buttonCancelOrder);
	}

	public void tapOnCancelOrderButton() {
		isCancelOrderButtonDisplayed();
		GlobalMobileHelper.tapOnElement(Locators.OrderDetail.buttonCancelOrder);

	}

	public boolean isCancelOrderChevronDisplayed() {
		MobileElement buttonChevron = driver.findElement(Locators.OrderDetail.buttonChevronCancelOrder);
		return GlobalMobileHelper.isElementDisplayed(buttonChevron);
	}

	public boolean isCancelOrderAlertScreenDisplay() {
		MobileElement alertScreenCancelOrder = driver.findElement(Locators.OrderDetail.alertMessageOrderScreen);
		return GlobalMobileHelper.isElementDisplayed(alertScreenCancelOrder);
	}

	public boolean isYesButtonDisplay() {
		MobileElement buttonYes = driver.findElement(Locators.OrderDetail.buttonYesAlertMessage);
		return GlobalMobileHelper.isElementDisplayed(buttonYes);
	}

	public boolean isNoButtonDisplay() {
		MobileElement buttonNo = driver.findElement(Locators.OrderDetail.buttonNoAlertMessage);
		return GlobalMobileHelper.isElementDisplayed(buttonNo);
	}

	public void tapOnYesButton() {
		isYesButtonDisplay();
		GlobalMobileHelper.tapOnElement(Locators.OrderDetail.buttonYesAlertMessage);
	}

	public void tapOnNoButton() {
		isNoButtonDisplay();
		GlobalMobileHelper.tapOnElement(Locators.OrderDetail.buttonNoAlertMessage);
	}

	public boolean isAlertMsgDisplayed() {
		MobileElement alertMsgTxt = driver.findElement(Locators.OrderDetail.alertMessageText);
		return GlobalMobileHelper.isElementDisplayed(alertMsgTxt);
	}

	public String getAlertMsgText() {
		isAlertMsgDisplayed();
		return GlobalMobileHelper.getElementText(Locators.OrderDetail.alertMessageText);
	}

	public boolean isSucessCancelOrderMessageDisplayed() {
		MobileElement sucessCancelMsg = driver.findElement(Locators.OrderDetail.labelSucessOrderCancellationMesage);
		return GlobalMobileHelper.isElementDisplayed(sucessCancelMsg);
	}

	public String getSucessOrderCancelMessage() {
		isSucessCancelOrderMessageDisplayed();
		return GlobalMobileHelper.getElementText(Locators.OrderDetail.labelSucessOrderCancellationMesage);
	}

	public boolean isConfirmationCancellationScreenDisplay() {
		MobileElement ConfirmationCancelScreen = driver.findElement(Locators.OrderDetail.OrderCancelConfirmationScreen);
		return GlobalMobileHelper.isElementDisplayed(ConfirmationCancelScreen);
	}

	public boolean isBackButtonDisplay() {
		MobileElement backButton = driver.findElement(Locators.OrderDetail.buttonBackOrderCancel);
		return GlobalMobileHelper.isElementDisplayed(backButton);
	}

	public void tapOnBackButton() {
		isBackButtonDisplay();
		GlobalMobileHelper.tapOnElement(Locators.OrderDetail.buttonBackOrderCancel);
	}

	public boolean isErroMessageCancelOrderDisplay() {
		MobileElement errorMessage = driver.findElement(Locators.OrderDetail.ErrorMesageOrderCancel);
		return GlobalMobileHelper.isElementDisplayed(errorMessage);
	}

	public String getErrorMessageCancelOrder() {
		isErroMessageCancelOrderDisplay();
		return GlobalMobileHelper.getElementText(Locators.OrderDetail.ErrorMesageOrderCancel);
	}

	/* created by Nirmal - 06.05.2021 OMNI-33836 */
	public boolean isOrderCancelMessageDisplay() {
		MobileElement orderCancelMsg = driver.findElement(Locators.OrderDetail.msgOrderCancel);
		return GlobalMobileHelper.isElementDisplayed(orderCancelMsg);
	}

	public boolean isConfirmationEmailMessageDisplay() {
		MobileElement confirmationEmailSentmessage = driver.findElement(Locators.OrderDetail.msgConfirmationEmail);
		return GlobalMobileHelper.isElementDisplayed(confirmationEmailSentmessage);
	}

	public boolean isOrderCancelDateDisplay() {
		MobileElement orderCancelDateDisplay = driver.findElement(Locators.OrderDetail.labelcancelOrderDate);
		return GlobalMobileHelper.isElementDisplayed(orderCancelDateDisplay);
	}

	/* created by - Nirmal Jain OMNI-33184 07/05/2021 */

	public boolean isTrackButtonDisplay() {
		MobileElement buttonTrackDelivery = driver.findElement(Locators.OrderDetail.buttonTrackDelivery);
		return GlobalMobileHelper.isElementDisplayed(buttonTrackDelivery);
	}

	public void tapOnTrackDeliveryButton() {
		isTrackButtonDisplay();
		GlobalMobileHelper.tapOnElement(Locators.OrderDetail.narvarScreen);
	}

	public boolean isNarvarScreenDisplay() {
		MobileElement narvarScreen = driver.findElement(Locators.OrderDetail.narvarScreen);
		return GlobalMobileHelper.isElementDisplayed(narvarScreen);
	}

	public void enterOrderId(String OrderId) {
		GlobalMobileHelper.setText(Locators.OrderDetail.inputOrderId, OrderId);
	}

	public void enterZipCode(String zipCode) {
		GlobalMobileHelper.setText(Locators.OrderDetail.inputZipCode, zipCode);
	}

	public void tapOnCheckButton() {
		GlobalMobileHelper.tapOnElement(Locators.OrderDetail.buttonCheck);
	}

	public boolean isLookupOrderDisplay() {
		MobileElement lookupOrderDisplay = driver.findElement(Locators.OrderDetail.labelOrderLookupOrder);
		return GlobalMobileHelper.isElementDisplayed(lookupOrderDisplay);
	}

	/* created by Nirmal - OMNI-28213 -07.05.2021 */

	public boolean isOrderTileElementsDisplayed(String element) {
		switch (element) {
		case "Can’t find your order":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrderDetail.labelFindYourorderwithChevron);
		case "Add a store receipt":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrderDetail.LabelAddStoreReceiptwithChevron);
		case "No order existing":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrderDetail.NoExistingOrderMsg);
		case "OrderLookup":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrderDetail.lookupOrder);
		default:
			throw new IllegalStateException("Invalid Element");
		}
	}

	public boolean isOrderListingTileElementDisplay(String element) {
		switch (element) {
		case "All Order":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrderDetail.filterAllOrder);
		case "In Store":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrderDetail.filterInStore);
		case "On line":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrderDetail.filterOnline);
		case "Order count":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrderDetail.labelOrderCount);
		case "Sorted By Most Recent":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrderDetail.SortedOrder);
		case "Order List":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrderDetail.OrderList);

		default:
			throw new IllegalStateException("Invalid Element");
		}
	}

	public boolean isOrderProductTileElementDisplay(String element) {
		switch (element) {
		case "Order Status":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrderDetail.OrderStatus);
		case "Order detail":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrderDetail.buttonOrderId);
		case "Order Number":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrderDetail.labelOrderNumber);
		case "Order Date":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrderDetail.labelOrderDate);
		case "Order Total":
			return GlobalMobileHelper.isElementDisplayed(Locators.OrderDetail.labelOrderTotal);

		default:
			throw new IllegalStateException("Invalid Element");
		}
	}

	public void tapOnElement(String element) {
		switch (element) {
		case "Can’t find your order":
			GlobalMobileHelper.tapOnElement(Locators.OrderDetail.labelFindYourorderwithChevron);
		case "Add a store receipt":
			GlobalMobileHelper.tapOnElement(Locators.OrderDetail.LabelAddStoreReceiptwithChevron);
		case "All Order":
			GlobalMobileHelper.tapOnElement(Locators.OrderDetail.filterAllOrder);
		case "In Store":
			GlobalMobileHelper.tapOnElement(Locators.OrderDetail.filterInStore);
		case "On line":
			GlobalMobileHelper.tapOnElement(Locators.OrderDetail.filterOnline);
		case "Order Number":
			GlobalMobileHelper.tapOnElement(Locators.OrderDetail.buttonOrderId);
		case "Sort":
			GlobalMobileHelper.tapOnElement(Locators.OrderDetail.SortedOrder);
		default:
			throw new IllegalStateException("Invalid Element");
		}
	}

}
