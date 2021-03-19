package com.aso.qe.test.pageobject.ios;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;

import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import io.appium.java_client.pagefactory.iOSXCUITFindBy;


public class HomePage {
	 private AppiumDriver<MobileElement> driver;

	public HomePage(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	
	public boolean isOnHomePage() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MobileElement btnGoToPDP = driver.findElement(Locators.HomePage.buttonGoToPDP);
		return btnGoToPDP.isDisplayed();
	}
	
	public void tapOnProduct() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MobileElement btnGoToPDP = driver.findElement(Locators.HomePage.buttonGoToPDP);
		GlobalMobileHelper.tapOnElement(btnGoToPDP);
	}
	
	public void tapOnShopButton() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MobileElement shopHomePage = driver.findElement(Locators.HomePage.shopHomePage);
		GlobalMobileHelper.tapOnElement(shopHomePage);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void tapOnProductWithID(String args) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MobileElement btnGoToPDP =null;
		/*			
		if(args.equalsIgnoreCase("Ships to Store")) 
		{
			
	    btnGoToPDP=	  driver.findElement(By.xpath("//*[contains(@label,\"Adidas Men's Designed2Move Polo Shirt\")]"));
		}
	*/		
		if(args.equalsIgnoreCase("Clearance")) 
		{
				
	    btnGoToPDP=	  driver.findElement(By.xpath("//*[contains(@label,\"Bcg Men's Coaches Polo Shirt\")]"));
		}
		/*	
		if(args.equalsIgnoreCase("Hot Deal")) 
		{
			
	    btnGoToPDP=	  driver.findElement(Locators.HomePage.badgeHotDeal);
		}
		
		if(args.equalsIgnoreCase("Price Drop")) 
		{
			
	    btnGoToPDP=	  driver.findElement(Locators.HomePage.badgePriceDrop);
		}
		
		if(args.equalsIgnoreCase("New")) 
		{
			
	    btnGoToPDP=	  driver.findElement(Locators.badgeHomePage.New);
		}
		
		if(args.equalsIgnoreCase("Exclusive")) 
		{
			
	    btnGoToPDP=	  driver.findElement(Locators.HomePage.badgeExclusive);
		}
		
		if(args.equalsIgnoreCase("Online Only")) 
		{
			
	    btnGoToPDP=	  driver.findElement(Locators.HomePage.badgeOnlineOnly);
		}

	*/	
		GlobalMobileHelper.tapOnElement(btnGoToPDP);
		
	}
}