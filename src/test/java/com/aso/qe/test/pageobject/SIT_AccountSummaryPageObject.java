package com.aso.qe.test.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aso.qe.framework.common.CommonActionHelper;

public class SIT_AccountSummaryPageObject extends CommonActionHelper{
	@FindBy(xpath="//a[@id='accountSummary']") public WebElement lnkAccountSummary;
	@FindBy(xpath="//h2[contains(text(),'Can')]") public WebElement txtcantfindorder;
	@FindBy(xpath="//label[@for='orderNumberField']") public WebElement labelordernumber;
	@FindBy(xpath="//input[@id='orderNumberField']") public WebElement txtordernumber;
	@FindBy(xpath="//label[@for='shippingZipField']") public WebElement labelshippingzip;
	@FindBy(xpath="//input[@id='shippingZipField']") public WebElement txtshippingzip;
	@FindBy(xpath="//input[@id='submitOrderInfo']") public WebElement btnsubmit;
	

}
