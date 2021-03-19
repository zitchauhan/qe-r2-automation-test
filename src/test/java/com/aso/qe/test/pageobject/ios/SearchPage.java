package com.aso.qe.test.pageobject.ios;

import java.util.List;

import org.openqa.selenium.By;

import com.aso.qe.framework.common.PropertiesHelper;
import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import com.sun.tools.sjavac.Log;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SearchPage {
	
	private AppiumDriver<MobileElement> driver;
	public SearchPage(AppiumDriver<MobileElement> driver) {
	  this.driver = driver;
	 }
	public void tapOnSearchKeyword(String keyword) 
	{   try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		GlobalMobileHelper.searchByKeyword(keyword);
		driver.findElement(Locators.SearchPage.goBtn).click();
	}
	
	public boolean validateSearchResults(String keyword) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MobileElement pname = driver.findElement(By.id("lbl_product_title"));
		return pname.getText().contains(PropertiesHelper.getInstance().getMobileTestDataProperty(keyword));
		}
	public boolean isSearchErrorDisplayed(String msg) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MobileElement searchError = driver.findElement(Locators.SearchPage.searchErrormsg);
		return searchError.getText().contains(msg);
		}
	public void tapOnProduct() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MobileElement productListed = driver.findElement(Locators.PLPPage.productTitle);
		GlobalMobileHelper.tapOnElement(productListed);
	}
		
	}


