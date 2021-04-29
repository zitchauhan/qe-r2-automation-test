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

public class OrderDetailPage {
	private AppiumDriver<MobileElement> driver;
	
	private static final Logger logger = Logger.getLogger(OrderDetailPage.class.getName());
	
	
	public OrderDetailPage(AppiumDriver<MobileElement> driver) {
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
		MobileElement  buttonCancelOrder = driver.findElement(Locators.OrderDetail.buttonCancelOrder);
		return GlobalMobileHelper.isElementDisplayed(buttonCancelOrder);
	}
	public void tapOnCancelOrderButton() {
		isCancelOrderButtonDisplayed();
		GlobalMobileHelper.tapOnElement(Locators.OrderDetail.buttonCancelOrder);
		
	}
	
	public boolean isCancelOrderChevronDisplayed() {
		MobileElement  buttonChevron = driver.findElement(Locators.OrderDetail.buttonChevronCancelOrder);
		return GlobalMobileHelper.isElementDisplayed(buttonChevron);
	}
	
	public boolean isCancelOrderAlertScreenDisplay() {
		MobileElement  alertScreenCancelOrder = driver.findElement(Locators.OrderDetail.alertMessageOrderScreen);
		return GlobalMobileHelper.isElementDisplayed(alertScreenCancelOrder);
	}
	
	public boolean isYesButtonDisplay() {
		MobileElement  buttonYes = driver.findElement(Locators.OrderDetail.buttonYesAlertMessage);
		return GlobalMobileHelper.isElementDisplayed(buttonYes);
	}
	public boolean isNoButtonDisplay() {
		MobileElement  buttonNo = driver.findElement(Locators.OrderDetail.buttonNoAlertMessage);
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
		MobileElement  alertMsgTxt = driver.findElement(Locators.OrderDetail.alertMessageText);
		return GlobalMobileHelper.isElementDisplayed(alertMsgTxt);
	}
	
	public String getAlertMsgText() {
		isAlertMsgDisplayed();
		return GlobalMobileHelper.getElementText(Locators.OrderDetail.alertMessageText);
	}
	
	public boolean isSucessCancelOrderMessageDisplayed() {
		MobileElement  sucessCancelMsg = driver.findElement(Locators.OrderDetail.labelSucessOrderCancellationMesage);
		return GlobalMobileHelper.isElementDisplayed(sucessCancelMsg);
	}
	public String getSucessOrderCancelMessage() {
		isSucessCancelOrderMessageDisplayed();
		return GlobalMobileHelper.getElementText(Locators.OrderDetail.labelSucessOrderCancellationMesage);
	}
	
	public boolean isConfirmationCancellationScreenDisplay() {
		MobileElement  ConfirmationCancelScreen = driver.findElement(Locators.OrderDetail.OrderCancelConfirmationScreen);
		return GlobalMobileHelper.isElementDisplayed(ConfirmationCancelScreen);
	}
	
	public boolean isBackButtonDisplay() {
		MobileElement  backButton = driver.findElement(Locators.OrderDetail.buttonBackOrderCancel);
		return GlobalMobileHelper.isElementDisplayed(backButton);
	}
	public void tapOnBackButton() {
		isBackButtonDisplay();
		GlobalMobileHelper.tapOnElement(Locators.OrderDetail.buttonBackOrderCancel);
	}
	
	public boolean isErroMessageCancelOrderDisplay() {
		MobileElement  errorMessage = driver.findElement(Locators.OrderDetail.ErrorMesageOrderCancel);
		return GlobalMobileHelper.isElementDisplayed(errorMessage);
	}
	
	public String getErrorMessageCancelOrder() {
		isErroMessageCancelOrderDisplay();
		return GlobalMobileHelper.getElementText(Locators.OrderDetail.ErrorMesageOrderCancel);
	}
	

	}