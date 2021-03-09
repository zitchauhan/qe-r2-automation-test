package com.aso.qe.test.pageobject.ios;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class CategoryPage {
	
	private AppiumDriver<MobileElement> driver;
	public CategoryPage(AppiumDriver<MobileElement> driver) {
	  this.driver = driver;
	 
	 }
	
	

	public  boolean navigateL1_category() {
		    
			MobileElement l1_catgoryElelnt = driver.findElement(Locators.Category.l1_catgoryElelnt);
			
			return l1_catgoryElelnt.isDisplayed();
		}
	
	public boolean navigateL2_category() {
		
		MobileElement l1_catgoryElelnt = driver.findElement(Locators.Category.l1_catgoryElelnt);
		GlobalMobileHelper.tapOnElement(l1_catgoryElelnt);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MobileElement l2_catgoryElelnt = driver.findElement(Locators.Category.l2_catgoryElelnt);
		
		return l2_catgoryElelnt.isDisplayed();
		
	}
	public boolean navigateL3_category() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MobileElement l2_catgoryElelnt = driver.findElement(Locators.Category.l2_catgoryElelnt);
		GlobalMobileHelper.tapOnElement(l2_catgoryElelnt);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MobileElement l3_catgoryElelnt = driver.findElement(Locators.Category.l3_catgoryElelnt);
		
		return l3_catgoryElelnt.isDisplayed();
	}
	
public boolean navigateLToCLP() {
		
		MobileElement l3_catgoryElelnt = driver.findElement(Locators.Category.l3_catgoryElelnt);
		GlobalMobileHelper.tapOnElement(l3_catgoryElelnt);
		MobileElement clp_catgoryElelnt = driver.findElement(Locators.Category.clp_catgoryElelnt);
		return clp_catgoryElelnt.isDisplayed();
}	
	
	public  void ShopBycategory() {
		MobileElement l3_catgoryElelnt = driver.findElement(Locators.Category.l3_catgoryElelnt);
		GlobalMobileHelper.tapOnElement(l3_catgoryElelnt);
		
		//MobileElement shopAll_ShopBycategory = driver.findElement(Locators.Category.shopAll_ShopBycategory);
		
		//GlobalMobileHelper.tapOnElement(shopAll_ShopBycategory);
	}
	public  void ShopByBrand() {
		
		MobileElement shopAll_ShopByBrand = driver.findElement(Locators.Category.shopAll_ShopByBrand);
		
		GlobalMobileHelper.tapOnElement(shopAll_ShopByBrand);
	}
   public  boolean verifyShopBycategoryLandingPage() {
		
		MobileElement ShopBycategoryTxt = driver.findElement(Locators.Category.shopAll_ShopBycategoryTxt);
		return ShopBycategoryTxt.isDisplayed();
		
	}
	
   public  boolean verifyShopByShopByBrandPage() {
		
		MobileElement ShopByBrandTxt = driver.findElement(Locators.Category.shopAll_ShopByBrandTxt);
		return ShopByBrandTxt.isDisplayed();
		
	}
   public  void verifyShopBycategoryLandingPageComponents() throws Exception {
	   List<Object> list = new ArrayList<Object>();
		
		MobileElement Pick_Up_in_Store_Banner = driver.findElement(Locators.Category.Pick_Up_in_Store_Banner);
		MobileElement Free_Shipping_with_Sign_in_Banner = driver.findElement(Locators.Category.Free_Shipping_with_Sign_in_Banner);
		MobileElement Hero_Banner = driver.findElement(Locators.Category.Hero_Banner);
		MobileElement ShopBycategoryTxt = driver.findElement(Locators.Category.Shop_by_Category_Component);
		MobileElement Sort_By_Option = driver.findElement(Locators.Category.Sort_By_Option);
		MobileElement Filter_Option = driver.findElement(Locators.Category.Filter_Option);
		MobileElement Product_Grid = driver.findElement(Locators.Category.Product_Grid);
		MobileElement Promo_ad_Card = driver.findElement(Locators.Category.Promo_ad_Card);
		
		 if(!Pick_Up_in_Store_Banner.isDisplayed()) {
			list.add ( new Exception("Pick Up in Store Banner not present"));	
		 }
		 if(!Free_Shipping_with_Sign_in_Banner.isDisplayed()) {
				list.add ( new Exception("Free Shipping with Sign-in Banner not present"));	
			 } 
		 if(!Hero_Banner.isDisplayed()) {
				list.add ( new Exception("Hero Banner not present"));	
			 }
		 if(!ShopBycategoryTxt.isDisplayed()) {
				list.add ( new Exception("Shop by Category Component not present"));	
			 }
		 if(!Sort_By_Option.isDisplayed()) {
				list.add ( new Exception("Sort By Option not present"));	
			 }
		 if(!Filter_Option.isDisplayed()) {
				list.add ( new Exception("Filter Option not present"));	
			 }
		 if(!Product_Grid.isDisplayed()) {
				list.add ( new Exception("Product_Grid not present"));	
			 }
		 if(!Promo_ad_Card.isDisplayed()) {
				list.add ( new Exception("Promo-ad Card not present"));	
			 }
		 
		if(!list.isEmpty()) {
			String s=null;
			for (Object object : list) {
			 s =s+object.toString();
			}
			throw new Exception(s);
		
	    }
	
		
	}
   public  void verifyShopByBrandLandingPageComponents() throws Exception {
	   List<Object> list = new ArrayList<Object>();
		
		MobileElement Pick_Up_in_Store_Banner = driver.findElement(Locators.Category.Pick_Up_in_Store_Banner);
		MobileElement Free_Shipping_with_Sign_in_Banner = driver.findElement(Locators.Category.Free_Shipping_with_Sign_in_Banner);
		MobileElement Hero_Banner = driver.findElement(Locators.Category.Hero_Banner);
		MobileElement ShopByBrandyTxt = driver.findElement(Locators.Category.ShopByBrandyTxt);
		MobileElement Sort_By_Option = driver.findElement(Locators.Category.Sort_By_Option);
		MobileElement Filter_Option = driver.findElement(Locators.Category.Filter_Option);
		MobileElement Product_Grid = driver.findElement(Locators.Category.Product_Grid);
		MobileElement Promo_ad_Card = driver.findElement(Locators.Category.Promo_ad_Card);
		
		 if(!Pick_Up_in_Store_Banner.isDisplayed()) {
			list.add ( new Exception("Pick Up in Store Banner not present"));	
		 }
		 if(!Free_Shipping_with_Sign_in_Banner.isDisplayed()) {
				list.add ( new Exception("Free Shipping with Sign-in Banner not present"));	
			 } 
		 if(!Hero_Banner.isDisplayed()) {
				list.add ( new Exception("Hero Banner not present"));	
			 }
		 if(!ShopByBrandyTxt.isDisplayed()) {
				list.add ( new Exception("Shop by Brnad Component not present"));	
			 }
		 if(!Sort_By_Option.isDisplayed()) {
				list.add ( new Exception("Sort By Option not present"));	
			 }
		 if(!Filter_Option.isDisplayed()) {
				list.add ( new Exception("Filter Option not present"));	
			 }
		 if(!Product_Grid.isDisplayed()) {
				list.add ( new Exception("Product_Grid not present"));	
			 }
		 if(!Promo_ad_Card.isDisplayed()) {
				list.add ( new Exception("Promo-ad Card not present"));	
			 }
		 
		if(!list.isEmpty()) {
			String s=null;
			for (Object object : list) {
			 s =s+object.toString();
			}
			throw new Exception(s);
		
	    }
	
		
	}   
   
	
	}
	
	