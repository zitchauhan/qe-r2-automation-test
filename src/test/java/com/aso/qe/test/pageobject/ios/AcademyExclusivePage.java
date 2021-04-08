package com.aso.qe.test.pageobject.ios;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AcademyExclusivePage {
	private AppiumDriver<MobileElement> driver;

	public AcademyExclusivePage(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	public boolean isAcademyPageDisplayed() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		GlobalMobileHelper.tapOnElement(Locators.ShopNewPage.allowOnceBtn);
		GlobalMobileHelper.tapOnElement(Locators.ShopNewPage.oKBtnLocation);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return GlobalMobileHelper.isElementDisplayed(Locators.AcademyExclusivePage.academyExclusiveTitle);
	}
}
