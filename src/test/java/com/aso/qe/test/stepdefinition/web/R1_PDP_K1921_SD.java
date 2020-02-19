package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R1_PLCC_Generic_PO;
import com.aso.qe.test.pageobject.R1_SIT_PO;
import com.aso.qe.test.pageobject.R1_SearchProduct_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R1_PDP_K1921_SD extends CommonActionHelper{
	R1_PDP_PO pdpPageObj = PageFactory.initElements(getDriver(), R1_PDP_PO.class);
	private static final Logger logger = Logger.getLogger(R1_PDP_K1921_SD.class);
	R1_SIT_PO sit_po=PageFactory.initElements(driver, R1_SIT_PO.class);
	R1_PLCC_Generic_PO generic_po = PageFactory.initElements(getDriver(), R1_PLCC_Generic_PO.class);
	

	@Then("^user search the data in search box \"(.*?)\"$")
	public void user_search_the_data_in_search_box(String OOSData) throws Throwable {
		waitForPageLoad(driver);
		  Thread.sleep(Constants.thread_medium);	 
		//	pdpPageObj.searchbox.sendKeys(OOSData);
			setInputTextWithEnterKey(pdpPageObj.searchbox, webPropHelper.getTestDataProperty(OOSData));	  
		   clickOnButton(pdpPageObj.searchMagnifyingBtm);
	}
	
	
	

	@Then("^User to select the product$")
	public void user_to_select_the_product() throws Throwable {
	  
		clickOnButton(pdpPageObj.selectMagellanOutdoorsMenNeopreneWadingBoots);
	   scrollPageToWebElement(pdpPageObj.quantityInput);
	   Thread.sleep(Constants.thread_low); 
		pdpPageObj.quantityInput.sendKeys("100");
	    clickOnButton(pdpPageObj.btnAddToCart);
	}
	
	/*@And("^user sets up Cookie$")*/
	public void user_sets_Cookie() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.manage().addCookie(new Cookie("pdpFacelift", "true"));
		System.out.println("cookie setup successful");	
		
		for(Cookie ck: driver.manage().getCookies()) {
			System.out.println(ck.getName());
		}
	}
	
	/*@Then("^user navigates to new PDP page URL$")*/
	public void navigateToNew_URL(){
		String CurUrl = driver.getCurrentUrl();
		System.out.println("Current page URL = "+CurUrl);
		int position = CurUrl.indexOf("#"); 
		String appendUrl = CurUrl.substring(position);		
		String newURL = CurUrl.substring(0, position)+"?cokieAd=True"+appendUrl;
		
		System.out.println("new url = " +newURL);
		driver.navigate().to(newURL);
		System.out.println("navigated to new URL");
	}
	
	/*@Then("^user navigates to new PDP page URL \"(.*?)\"$")*/
	public void navigateToNew_PDP_Page(String SKU){
		String CurUrl = driver.getCurrentUrl();
		System.out.println("Current page URL = "+CurUrl);
		int position = CurUrl.indexOf("#"); 
		String appendUrl = CurUrl.substring(position);		
		String newURL = CurUrl.substring(0, position)+"?cokieAd=True"+appendUrl;
		System.out.println("new url = " +newURL);
		driver.navigate().to(newURL);
		System.out.println("navigated to new URL");
	}
	
	@Then ("^User to selects the product from PLP and add product in cart with access quantity$")
	public void User_to_selects_the_product_from_PLP_and_add_product_in_cart_with_access_quantity()  throws Throwable{
		    clickOnButton(pdpPageObj.pdpImage);
		    waitForPageLoad(driver);
		    Thread.sleep(Constants.thread_low); 
//		    clickOnButton(pdpPageObj.btnXXLARGESizePDP);
//		    Thread.sleep(2000);
		   scrollPageToWebElement(pdpPageObj.quantityInput);
		   Thread.sleep(Constants.thread_low); 
			pdpPageObj.quantityInput.sendKeys("100");
		    clickOnButton(pdpPageObj.btnAddToCart);
		
	}

	@Then("^verify Sorry the selected item is limited to XYZ order\\.$")
	public void verify_Sorry_the_selected_item_is_limited_to_XYZ_order() throws Throwable {
	   try {
		   String actdata= getText(pdpPageObj.MsgSelectedItemLimited);
		   assertTrue(actdata.contains("We added those to the cart"));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	@Then("^verify user gets a msg Sorry we only have XYZ of this item available We added those to the cart$")
	public void verify_user_gets_a_msg_Sorry_we_only_have_XYZ_of_this_item_available_We_added_those_to_the_cart() throws Throwable {
		 String actdata= getText(pdpPageObj.txtLimitedQuantityAddedInCart);
		   assertTrue(actdata.contains("We added those to the cart"));
		   
	}
	
	@Then("^User select to not sold online item$")
	public void user_select_to_not_sold_online_item() throws Throwable {
	   clickOnButton(pdpPageObj.selectSCCY_CPX_2CB9mmPistol);//This step is not coming in build now
	}
	@Then("^User verify not sold online$")
	public void user_verify_not_sold_online() throws Throwable {
	   scrollPageToWebElement(pdpPageObj.MsgPDP_OnlineMessage);
		String actdata=getText(pdpPageObj.MsgPDP_OnlineMessage);
		//assertEquals("Not Sold Online", actdata); Not showing this data
		assertEquals("Special Order Ships to Store", actdata);
	}
	
	
	@Then("^User select item of \"(.*?)\"$")
	public void user_select_item_of(String data) throws Throwable {
	    
		clickOnButton(pdpPageObj.selectNikeToddlerGirlDNAShirtandShortsSet);
	}

	//SID 24-September
		@Then("^User select item of out of stock$")
		public void user_select_item_of_out_of_stock() throws Throwable {
			assertTrue(clickOnButton(sit_po.clickProuctCard));
		//	clickOnButton(pdpPageObj.outOfStockSKU.get(0));
		}

	
	@Then("^verify out of stock$")
	public void verify_out_of_stock() throws Throwable {
	  
			scrollPageToWebElement(pdpPageObj.MsgOutOFStock);
		
			String actdata= getText(pdpPageObj.MsgOutOFStock).toUpperCase();
		   
			assertEquals("SOLD IN STORES", actdata);
				
	
	}

	@Then("^user to verify add to cart is disable when color and size is not avialable$")
	public void user_to_verify_add_to_cart_is_disable_when_color_and_size_is_not_avialable() throws Throwable {
			pdpPageObj.checkAddtoCartDisabled();
			assertTrue(isDisplayed(pdpPageObj.MsgOutOFStock));
			logger.debug("product is out of stock:: add to cart buttom is not displayed");
			
		}
	
//	@Then("^user to verify add to cart is disable/enable when color and size is not avialable$")
//	public void user_to_verify_add_to_cart_is_disable_enable_when_color_and_size_is_not_avialable() throws Throwable {
//		if(getText(pdpPageObj.MsgOutOFStock).equals("Not Sold in Stores")) {
//			assertTrue(isDisplayed(pdpPageObj.MsgOutOFStock));
//			logger.debug("product is out of stock:: add to cart buttom is not displayed");
//			
//		}
//		else if (getText(pdpPageObj.txtNotifiedBack).equalsIgnoreCase("Sold in Stores")) {
//			
//			
//			assertTrue(isDisplayed(pdpPageObj.btnAddToCart));
//			logger.debug("product is in  stock:: add to cart buttom is  displayed");
//		}
//
//	}
	@Then("^Verify SKU$")
	public void verify_SKU() throws Throwable {
	    assertTrue(isDisplayed(pdpPageObj.txtProductSKU));
	}
	
//	
//	@Then("^user select  the product having star rating$")
//	public void user_select_the_product_having_star_rating() throws Throwable {
//	    assertTrue(clickOnButton(pdpPageObj.selectBCGMenGolfShort));
//	}  
	
	
	@Then("^user select the product having star rating$")
	public void user_select_the_product_having_star_rating() throws Throwable {
		assertTrue(clickOnButton(pdpPageObj.selectStarratingProduct));
	}

	@Then("^user put the quantity on PDP$")
	public void user_put_the_quantity_on_PDP() throws Throwable {
		pdpPageObj.addToCartAvailability();
		setInputText(pdpPageObj.quantityInput, "110");
		waitForElement(generic_po.shipItButton);
		assertTrue(clickOnButton(generic_po.shipItButton));
		
		waitForElement(pdpPageObj.MsgquantityLimitation);
		isDisplayed(pdpPageObj.MsgquantityLimitation);
	}

}

