package com.aso.qe.test.pageobject.ios;

import java.util.List;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;

import io.appium.java_client.MobileElement;

public class ProductlistingPage extends GlobalMobileHelper {
	public boolean verifyRatingsAndReview() {
		String ratingsAndReviewCount=driver.findElement(Locators.PLPPage.rating).getText();
		boolean stat =ratingsAndReviewCount.contains("Product rating 4 and reviews 7");
		return stat;	
	}

	public void isOosProductsVisible() {
		List<MobileElement> el = driver.findElements(Locators.PLPPage.productTitle);
		for(MobileElement pTitle: el) {
			String s =pTitle.getText();
			if(s.contains("Dickies")) {
				pTitle.click();
			}else if(s.contains("Tiempo Legend")){
				pTitle.click();
			}
		}
		
		
	}

	public boolean verifyOos() {
		// TODO Auto-generated method stub
		isOosProductsVisible();
	String title =driver.findElement(Locators.PLPPage.productTitle).getText();
	if(title.contains("Tiempo Legend")) {
		GlobalMobileHelper.tapOnElement(Locators.PDPPage.xSmallSize);
	}else if(title.contains("Dickies")){
		GlobalMobileHelper.tapOnElement(Locators.PDPPage.colorVariant);
	}
		boolean stat =driver.findElement(Locators.PDPPage.buttonAddToCart).isEnabled();
		if (stat==true) {
			return false;
		}else {
			return true;
		}
	}

	
public boolean verifyInstock() {
	isOosProductsVisible();
	String title =driver.findElement(Locators.PLPPage.productTitle).getText();
	if(title.contains("Tiempo Legend")) {
		GlobalMobileHelper.tapOnElement(Locators.PDPPage.xSmallSize);
	}else if(title.contains("Dickies")){
		GlobalMobileHelper.tapOnElement(Locators.PDPPage.colorVariant);
	}
		boolean stat =driver.findElement(Locators.PDPPage.buttonAddToCart).isEnabled();
		if (stat==true) {
			return true;
		}else {
			return false;
		}
	}


    public boolean verifyUserCanSeePromoAdImage() {
		return GlobalMobileHelper.isElementDisplayed(Locators.PLPPage.promoAdImage);
    }
}
