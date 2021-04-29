package com.aso.qe.test.pageobject.ios;

import static org.junit.Assert.assertTrue;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import org.openqa.selenium.*;

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
   
   public boolean isBadgeDisplayedInPLP(String args) {
		Boolean flag=false;
	

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MobileElement btnGoToPDP=null;
		/*
		if(args.equalsIgnoreCase("Online Only")) 
		{
			
			
			 List<MobileElement> elementtexts  = driver.findElements(Locators.Category.label_PLPbadge);
			for (Iterator iterator = elementtexts.iterator(); iterator.hasNext();) {
				MobileElement mobileElement = (MobileElement) iterator.next();
				if(mobileElement.getText().equalsIgnoreCase("Online Only")) {
					return true;
					
				}else {
					scrollDown();
					
				}
				
				
			} 
			
		}
	*/	
		if(args.equalsIgnoreCase("Ships_to_Store")) 
		{
			
			 String elementtext  = driver.findElement(Locators.PDPPage.lbl_badge_text).getText();
		      if(elementtext.equalsIgnoreCase("Ships to Store")) {
	           return true; 
		      
			}
		}
		
		if(args.equalsIgnoreCase("Clearance")) 
		{
			
			 String elementtext  = driver.findElement(Locators.PDPPage.lbl_badge_text).getText();
		      if(elementtext.equalsIgnoreCase("Clearance")) {
	           return true; 
		      
			}
		}
		
		if(args.equalsIgnoreCase("Hot Deal")) 
		{
			
			 String elementtext  = driver.findElement(Locators.PDPPage.lbl_badge_text).getText();
		      if(elementtext.equalsIgnoreCase("Hot Deal")) {
	           return true; 
		      
			}
		}
		
		if(args.equalsIgnoreCase("Price Drop")) 
		{
			
	      String elementtext  = driver.findElement(Locators.PDPPage.lbl_badge_text).getText();
	      if(elementtext.equalsIgnoreCase("Price Drop")) {
          return true; 
	      
		}
		}
		if(args.equalsIgnoreCase("New")) 
		{
			
			  String elementtext  = driver.findElement(Locators.PDPPage.lbl_badge_text).getText();
		      if(elementtext.equalsIgnoreCase("New")) {
	           return true; 
		      
			}
		}
		
		if(args.equalsIgnoreCase("Exclusive")) 
		{
			
			  String elementtext  = driver.findElement(Locators.PDPPage.lbl_badge_text).getText();
		      if(elementtext.equalsIgnoreCase("Exclusive")) {
	           return true; 
		      
			}
		}
		
		if(args.equalsIgnoreCase("Online_Only")) 
		{
			
			  String elementtext  = driver.findElement(Locators.PDPPage.lbl_badge_text).getText();
		      if(elementtext.equalsIgnoreCase("Online Only")) {
	           return true; 
		      
			}
		}

	//	GlobalMobileHelper.tapOnElement(btnGoToPDP);
		
	
		
		return false;
	}   
   
   public void scrollDown() {
	   
    Dimension dimension  = driver.manage().window().getSize();
    
    Double scrollHeightStart = dimension.getHeight() * 0.5;
    int scrollStart = scrollHeightStart.intValue();
    
    Double scrollHeightEnd = dimension.getHeight() * 0.2;
    int scrollEnd = scrollHeightEnd.intValue(); 
    
    new TouchAction((PerformsTouchActions)driver).press(PointOption.point(0,scrollStart)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(0,scrollEnd)).release().perform();                       
    
    
   } 
   
   public List<MobileElement> getItemWebView(){
	   
	   
	   return driver.findElements(By.xpath("//*[contains(@label,\"Bcg Men's Coaches Polo Shirt\")]"));
   }
   
   public void scrollTillWebView() {
	   while(getItemWebView().size()==0) {
		   scrollDown();
		   
	   }
	   if(getItemWebView().size()>=0) {}
	   
	  
	  // getItemWebView().get(0).click();
	   System.out.println( getItemWebView().get(0).getText());
   }



public boolean verifyColourVarientprod() throws Exception {
	boolean flag=true;
	 List<Object> list = new ArrayList<Object>();
	 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 if(!ProductPrice()) {
			list.add ( new Exception("Product Price not present"));	
		 }
	 if(!isPLP_ProductTitleDisplayed()) {
			list.add ( new Exception("ProductTitle not present"));	
		 }
/*
	 if(!isPLP_ImageDisplayed()) {
			list.add ( new Exception("Image  not present"));	
		 }
	 
*/	 	 
	 if(!isPLP_ProductColourVariantDisplayed()) {
			list.add ( new Exception("colour swatch  not present"));	
		 }
	 if(!list.isEmpty()) {
		 flag=false;
			String s=null;
			for (Object object : list) {
			 s =s+object.toString();
			}
			throw new Exception(s);
		
	    }
	return flag;
}
   
public boolean ProductPrice() {
	MobileElement labelProductPrice = driver.findElement(Locators.Category.labelLProductPrice);
	return labelProductPrice.isDisplayed();
}   
public boolean isPLP_ProductTitleDisplayed() {
	MobileElement labelProductTitle = driver.findElement(Locators.Category.labelProductTitle);
	return labelProductTitle.isDisplayed();
}/*
public boolean isPLP_ratingsReviewsDisplayed() {
	MobileElement labelratingsReviews = driver.findElement(Locators.Category.labelratingsReviews);
	return labelratingsReviews.isDisplayed();
}*/
public boolean isPLP_ImageDisplayed() {
	MobileElement labelImage = driver.findElement(Locators.Category.labelImage);
	return labelImage.isDisplayed();
}
public boolean isPLP_ProductColourVariantDisplayed() {
	MobileElement labelProductCoLourVariantSwatch = driver.findElement(Locators.Category.labelProductCoLourVariantSwatch);
	return labelProductCoLourVariantSwatch.isDisplayed();
}

public boolean isPLP_BadgeDisplayed() {
	MobileElement labelImage = driver.findElement(Locators.Category.label_PLPbadge);
	return labelImage.isDisplayed();
	}

public boolean is_PriceRangeDisplayed() {
	MobileElement lbl_price_range = driver.findElement(Locators.Category.lbl_clearance_price_range);
	return lbl_price_range.isDisplayed();
} 

public boolean isPLP_OurPriceInCartDisplayed() {
	MobileElement lbl_cart_msg = driver.findElement(Locators.Category.lbl_cart_msg);
	return lbl_cart_msg.isDisplayed();
} 

public boolean isPLP__PPU_MSGDisplayed() {
	MobileElement isPLP_PPU_MSG = driver.findElement(Locators.Category.isPLP_PPU_MSG);
	return isPLP_PPU_MSG.isDisplayed();
} 
public boolean isPLP_SpecialPricingMessageDisplayed() {
	MobileElement SpecialPricingMessage = driver.findElement(Locators.Category.SpecialPricingMessage);
	if(SpecialPricingMessage.isDisplayed()&& SpecialPricingMessage.getText()!= null) {
		return true;	
	}
	else {
		return false;
	}
	
	
}
public boolean isPLP_PromotionMessageDisplayed() {
	MobileElement SpecialPricingMessage = driver.findElement(Locators.Category.PLP_PromotionMessage);
	if(SpecialPricingMessage.isDisplayed()&& SpecialPricingMessage.getText()!= null) {
		return true;	
	}
	else {
		return false;
	}
	
	
}
public boolean isPLP_Clearance_Styles_AvailableDisplayed() {
	MobileElement Clearance_Styles_AvailableDisplayed = driver.findElement(Locators.Category.Clearance_Styles_AvailableDisplayed);
	if(Clearance_Styles_AvailableDisplayed.isDisplayed()&& Clearance_Styles_AvailableDisplayed.getText()!= null) {
		return true;	
	}
	else {
		return false;
	}
	
	
}

public boolean isPLP_Some_Styles_AvailableDisplayed() {
	MobileElement PLP_Some_Styles_Available = driver.findElement(Locators.Category.PLP_Some_Styles_Available);
	if(PLP_Some_Styles_Available.isDisplayed()&& PLP_Some_Styles_Available.getText()!= null) {
		return true;	
	}
	else {
		return false;
	}
	
	
}


public boolean isPLP_OurPriceInCartToolTipDisplayed() {
	boolean flag=true;
	
		if(driver.findElement(Locators.Category.lbl_cart_msg_toolTipIcon) != null) {
			driver.findElement(Locators.Category.lbl_cart_msg_toolTipIconMsg).click();
			  if(driver.findElement(Locators.Category.lbl_cart_msg_toolTipIconMsg).getText() != null) {
				  flag=true;
			  }else{
				flag=false;
			     }
			
		}
	else {
		flag=false;
	     }
		
	return flag;
} 


public boolean verifySingleprice_Prod() throws Exception {

	boolean flag=true;
	 List<Object> list = new ArrayList<Object>();
	 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 if(!ProductPrice()) {
			list.add ( new Exception("Product Price not present"));	
		 }
	 if(!isPLP_ProductTitleDisplayed()) {
			list.add ( new Exception("ProductTitle not present"));	
		 }
/*
	 if(!isPLP_ImageDisplayed()) {
			list.add ( new Exception("Image  not present"));	
		 }
	 
*/	 	 
	 if(!list.isEmpty()) {
		 flag=false;
			String s=null;
			for (Object object : list) {
			 s =s+object.toString();
			}
			throw new Exception(s);
		
	    }
	return flag;

	
}



public boolean clearence_Prod() throws Exception {


	boolean flag=true;
	 List<Object> list = new ArrayList<Object>();
	 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 if(!is_PriceRangeDisplayed()) {
			list.add ( new Exception("Product Price not present"));	
		 }
	 if(!isPLP_ProductTitleDisplayed()) {
			list.add ( new Exception("ProductTitle not present"));	
		 }
/*
	 if(!isPLP_ImageDisplayed()) {
			list.add ( new Exception("Image  not present"));	
		 }		 
	 
*/	 	 
	 if(!isPLP_BadgeDisplayed()) {
			list.add ( new Exception("Badge not present in PLP"));	
		 }
	 
	 if(!list.isEmpty()) {
		 flag=false;
			String s=null;
			for (Object object : list) {
			 s =s+object.toString();
			}
			throw new Exception(s);
		
	    }
	return flag;

	

	
}



public boolean OurPriceIncart() throws Exception {




	boolean flag=true;
	 List<Object> list = new ArrayList<Object>();
	 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	 if(!isPLP_ProductTitleDisplayed()) {
			list.add ( new Exception("ProductTitle not present"));	
		 }
/*
	 if(!isPLP_ImageDisplayed()) {
			list.add ( new Exception("Image  not present"));	
		 }		 
	 
*/	 	 
	 if(!isPLP_BadgeDisplayed()) {
			list.add ( new Exception("Badge not present in PLP"));	
		 }
	 
	 if(!isPLP_OurPriceInCartDisplayed()) {
			list.add ( new Exception("Our price in cart Text  not present in PLP"));	
		 }	 
	 if(!isPLP_OurPriceInCartToolTipDisplayed()) {
			list.add ( new Exception("PLP our price in cart tool tip msg  not present in PLP"));	
		 }
	 
	 if(!list.isEmpty()) {
		 flag=false;
			String s=null;
			for (Object object : list) {
			 s =s+object.toString();
			}
			throw new Exception(s);
		
	    }
	return flag;

	

	

	
	
	
	
	
}



public boolean verifyUnitPrice() throws Exception {

	boolean flag=true;
	 List<Object> list = new ArrayList<Object>();
	 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	 if(!isPLP_ProductTitleDisplayed()) {
			list.add ( new Exception("ProductTitle not present"));	
		 }
/*
	 if(!isPLP_ImageDisplayed()) {
			list.add ( new Exception("Image  not present"));	
		 }		 
	 
	 */
	 if(!ProductPrice()) {
			list.add ( new Exception("ProductPrice  not present"));	
		 }		 
	 if(!isPLP__PPU_MSGDisplayed()) {
			list.add ( new Exception("PPU MSg  not present"));	
			
		 }
	 
	 if(!list.isEmpty()) {
		 flag=false;
			String s=null;
			for (Object object : list) {
			 s =s+object.toString();
			}
			throw new Exception(s);
		
	    }
	return flag;

	
}



public boolean verifySpecialPrice() throws Exception {
	boolean flag=true;
	 List<Object> list = new ArrayList<Object>();
	 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	 if(!isPLP_ProductTitleDisplayed()) {
			list.add ( new Exception("ProductTitle not present"));	
		 }
/*
	 if(!isPLP_ImageDisplayed()) {
			list.add ( new Exception("Image  not present"));	
		 }		 
	 
	 */
	 if(!isPLP_SpecialPricingMessageDisplayed()) {
			list.add ( new Exception("Special pricing message not present"));	
		 }		 
	
	 
	 if(!list.isEmpty()) {
		 flag=false;
			String s=null;
			for (Object object : list) {
			 s =s+object.toString();
			}
			throw new Exception(s);
		
	    }
	return flag;

	
}

public boolean verifyPLPPromotion() throws Exception {
	

	boolean flag=true;
	 List<Object> list = new ArrayList<Object>();
	 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	 if(!isPLP_ProductTitleDisplayed()) {
			list.add ( new Exception("ProductTitle not present"));	
		 }
	 if(!ProductPrice()) {
			list.add ( new Exception("Product Price not present"));	
		 }
/*
	 if(!isPLP_ImageDisplayed()) {
			list.add ( new Exception("Image  not present"));	
		 }		 
	 
	 */
	 if(!isPLP_PromotionMessageDisplayed()) {
			list.add ( new Exception("promotion message not present"));	
		 }		 
	
	 
	 if(!list.isEmpty()) {
		 flag=false;
			String s=null;
			for (Object object : list) {
			 s =s+object.toString();
			}
			throw new Exception(s);
		
	    }
	return flag;
	
}



public boolean verifyClearanceStylesAvailable() throws Exception {

boolean flag=true;
	 List<Object> list = new ArrayList<Object>();
	 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	 if(!isPLP_ProductTitleDisplayed()) {
			list.add ( new Exception("ProductTitle not present"));	
		 }
	 if(!ProductPrice()) {
			list.add ( new Exception("Product Price not present"));	
		 }
/*
	 if(!isPLP_ImageDisplayed()) {
			list.add ( new Exception("Image  not present"));	
		 }		 
	 
	 */
	 if(!isPLP_PromotionMessageDisplayed()) {
			list.add ( new Exception("promotion message not present"));	
		 }		 
	
	 
	 if(!list.isEmpty()) {
		 flag=false;
			String s=null;
			for (Object object : list) {
			 s =s+object.toString();
			}
			throw new Exception(s);
		
	    }
	return flag;


}



public boolean verifySomeStyleAvailable() throws Exception {
	
	boolean flag=true;
	 List<Object> list = new ArrayList<Object>();
	 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	 if(!isPLP_ProductTitleDisplayed()) {
			list.add ( new Exception("ProductTitle not present"));	
		 }
	 if(!ProductPrice()) {
			list.add ( new Exception("Product Price not present"));	
		 }
/*
	 if(!isPLP_ImageDisplayed()) {
			list.add ( new Exception("Image  not present"));	
		 }		 
	 
	 */
	 if(!isPLP_Some_Styles_AvailableDisplayed()) {
			list.add ( new Exception("Some StyleAvailable not present"));	
		 }		 
	
	 
			if (!list.isEmpty()) {
				flag = false;
				String s = null;
				for (Object object : list) {
					s = s + object.toString();
				}
				throw new Exception(s);

			}
			return flag;

		}

		public void tapOnSearchedProduct() {

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			MobileElement btnGoToPDP = null;

			btnGoToPDP = driver.findElement(Locators.PDPPage.labelProductTitle);

			GlobalMobileHelper.tapOnElement(btnGoToPDP);
		}

	}
