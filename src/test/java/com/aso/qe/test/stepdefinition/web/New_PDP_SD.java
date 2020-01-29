package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
//import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import static org.testng.Assert.assertTrue;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.New_PDP_PO;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R2_Cart_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class New_PDP_SD extends CommonActionHelper {
	
	R2_Cart_PO r2CartPo = PageFactory.initElements(driver, R2_Cart_PO.class);
	New_PDP_PO newPDP = PageFactory.initElements(getDriver(), New_PDP_PO.class);
	R1_PDP_PO pdp_po = PageFactory.initElements(getDriver(), R1_PDP_PO.class);
	
	WebDriverWait wait=new WebDriverWait(driver, 30);
	 
	
	
	
	@And("^user sets up cookie$")
	public void user_sets_Cookie() throws Throwable{
		Thread.sleep(2000);
		driver.manage().addCookie(new Cookie("pdpFacelift", "true"));
		System.out.println("cookie setup successful");	
		
		for(Cookie ck: driver.manage().getCookies()) {
			System.out.println(ck.getName());
		}
	}

	
	@Then("^verify discount is displayed Test$")
	public void verify_discount_is_applied() throws Throwable {
		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(r2CartPo.orderCnfDiscount_Txt));// txtPromocode
			}
		else {
			assertTrue(isDisplayed(r2CartPo.orderCnfDiscount_Txt));// txtPromocode
		}
	} 
	
	@Then("^user navigates to new PDP page URL$")
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
	
	@Then("^user navigates to new pdp page url \"(.*?)\"$")
	public void navigateToNew_PDP_Page(String SKU) throws InterruptedException{
		String CurUrl = driver.getCurrentUrl();
		String newURL="";
		System.out.println("Current page URL = "+CurUrl);
		if(CurUrl.indexOf("#") >0) {
			int position = CurUrl.indexOf("#"); 
			String appendUrl = CurUrl.substring(position);		
			newURL = CurUrl.substring(0, position)+"?cokieAd=True"+appendUrl;
		}else {
			newURL=CurUrl+"?CookieAd=true#repChildCatSku="+SKU;
		}
		
		
		System.out.println("new url = " +newURL);
		driver.navigate().to(newURL);
		System.out.println("navigated to new URL");
		Thread.sleep(3000);
		try {
		driver.switchTo().alert().accept();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//--------------------Ammo Firearm and product container-----------------
	@And("^user verify the ammo disclaimer on new PDP$")
	public void user_verify_ammo_disclaimer_new_PDP() {
		if ("mobile".equalsIgnoreCase(testtype)) {
		assertTrue(isDisplayed(newPDP.ammoDisclaimer));
		}else {
			assertTrue(isDisplayed(newPDP.ammoDisclaimer));
		}
	}
	
	@And("^user verify I agree Button is present$")
	public void user_verify_I_agree_button() {
		if("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(newPDP.Btn_IAgree));
		}else {
			assertTrue(isDisplayed(newPDP.Btn_IAgree));
		}
		
	}
	
	@Then("^user clicks on I Agree$")
	public void user_clicks_I_Agree() {
		if("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(newPDP.Btn_IAgree));
		}else {
			assertTrue(clickOnButton(newPDP.Btn_IAgree));
		}
		
	}
	
	@And("^user verify I agree Button disappear$")
	public void user_verify_I_agree_button_disappear() throws InterruptedException {
		Thread.sleep(Constants.thread_medium);
		if("mobile".equalsIgnoreCase(testtype)) {
			assertFalse(isDisplayed(newPDP.Btn_IAgree));
		}else {
			assertFalse(isDisplayed(newPDP.Btn_IAgree));
		}
		
	}
	
	@And("^user verifies disclaimer along with restocking msg$")
	public void user_verifies_restocking_msg() throws InterruptedException {
		Thread.sleep(Constants.thread_medium);
		if("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(newPDP.ammoDisclaimer));
		}else {
			assertTrue(isDisplayed(newPDP.ammoDisclaimer));
		}
		
	}
	
	@And("^user verifies star rating is present$")
	public void user_verifies_star_rating() {
		if("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(newPDP.starRating));
		}else {
			assertTrue(isDisplayed(newPDP.starRating));
		}
		
	}
	
	@Then("^user should be able to see price of the product$")
	public void user_sees_price() {
		if("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(newPDP.price));
		}else {
			assertTrue(isDisplayed(newPDP.price));
		}
	}
	
	@And("^user should be able to see add to cart buttons$")
	public void user_is_able_to_see_AddToCart_Buttons() {
		if("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isClickable(newPDP.addToCartButton));
			assertTrue(isDisplayed(pdp_po.btnQuantityDec));
			assertTrue(isDisplayed(pdp_po.btnQuantityInc));
			assertTrue(isDisplayed(pdp_po.txtDesiredQtyValue_1));
		}else {
			assertTrue(isClickable(newPDP.addToCartButton));
			assertTrue(isDisplayed(pdp_po.btnQuantityDec));
			assertTrue(isDisplayed(pdp_po.btnQuantityInc));
			assertTrue(isDisplayed(pdp_po.txtDesiredQtyValue_1));
		}
		
	}
	
	@And("^user is able to see Add to cart button$")
	public void user_verify_AddToCart_button_present() {
		if("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(newPDP.addToCartButton));
		}else {
			assertTrue(isDisplayed(newPDP.addToCartButton));
		}
		
	}
	
	@And("^user verifies page navigated to cart page$")
	public void user_navigates_to_cart_page() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)) {
			String url = driver.getCurrentUrl();
			assertTrue(url.contains("cart"));
			assertTrue(isDisplayed(newPDP.cartPage));
			System.out.println("successfully navigated to cart page");
		}else {
			String url = driver.getCurrentUrl();
			assertTrue(url.contains("cart"));
			assertTrue(isDisplayed(newPDP.cartPage));
			System.out.println("successfully navigated to cart page");
		}
		
	}
	
	
	@And("^user scrolls down to verify sticky behavior$")
	public void user_scrolls_down() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	@Then("^user verify sticky behavior for title price and star rating$")
	public void user_verify_sticky_behavior() {
		if("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(newPDP.productTitle));
			assertTrue(isDisplayed(newPDP.productprice));
			assertTrue(isDisplayed(newPDP.starRating));
		}else {
			assertTrue(isDisplayed(newPDP.productTitle));
			assertTrue(isDisplayed(newPDP.productprice));
			assertTrue(isDisplayed(newPDP.starRating));
		}
	}
	
	@Then ("^user verify save and clearance badge disappears on scrolldown$")
	public void user_verify_savBadge_disappear() {
		if("mobile".equalsIgnoreCase(testtype)) {
			//assertTrue(isDisplayed(newPDP.saveBadge));
			assertTrue(isDisplayed(newPDP.clearanceBadge));
		}else {
			//assertTrue(isDisplayed(newPDP.saveBadge));
			assertTrue(isDisplayed(newPDP.clearanceBadge));
		}
		
	}
	
	@Then("^user should see prmotional message \"(.*?)\"$")
	public void user_verify_promotional_msg(String promoMsg) {
		if("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(newPDP.promotionalMsg));
			System.out.println(newPDP.promotionalMsg.getText());
			System.out.println("promo msg = "+promoMsg);
			assertTrue(newPDP.promotionalMsg.getText().contains(promoMsg));
		}else {
			assertTrue(isDisplayed(newPDP.promotionalMsg));
			System.out.println(newPDP.promotionalMsg.getText());
			assertTrue(newPDP.promotionalMsg.getText().contains(promoMsg));
		}
		
	}
	
	
	@And("^user should see ToolTip near promotional msg$")
	public void user_validate_tooltip() {
		if("mobile".equalsIgnoreCase(testtype)) {
			   
			assertTrue(isDisplayed(newPDP.promoMsgToolTip));
		}else {
			assertTrue(isDisplayed(newPDP.promoMsgToolTip));
		}
	}
	
	@And("^user verifies promotional message stacking$")
	public void user_verify_promotional_msg_stacking() {
		if("mobile".equalsIgnoreCase(testtype)) {
			newPDP.verifypromotionalMsgStacking();
			}
			else {
				newPDP.verifypromotionalMsgStacking();
			}
		}
	
	
	@Then("^user verifies fulfilment message present for bullk items$")
	public void user_verify_fulfilment_msg() throws InterruptedException {
		String bulkFulfilMessage = "Ships via Academy's Bulk Carrier Service. Additionally, Bulk orders are not eligible for PO Box or APO/FPO/DPO delivery.";
		String doorshipFulfilMessage = "This item may ship from a different location and therefore is only eligible for ground shipping.";
		if("mobile".equalsIgnoreCase(testtype)) {
			Thread.sleep(2000);
			System.out.println(newPDP.bulkFulfilMsg.getText());
			System.out.println(bulkFulfilMessage);
			if(newPDP.bulkFulfilMsg.getText().contains(bulkFulfilMessage)) {
				assertTrue(newPDP.bulkFulfilMsg.getText().contains(bulkFulfilMessage));
			}else if((newPDP.bulkFulfilMsg.getText().contains(doorshipFulfilMessage))) {
				assertTrue(newPDP.bulkFulfilMsg.getText().contains(doorshipFulfilMessage));
			}
			
		}else {
			Thread.sleep(2000);
			System.out.println(newPDP.bulkFulfilMsg.getText());
			System.out.println(bulkFulfilMessage);
			if(newPDP.bulkFulfilMsg.getText().contains(bulkFulfilMessage)) {
				assertTrue(newPDP.bulkFulfilMsg.getText().contains(bulkFulfilMessage));
			}else if((newPDP.bulkFulfilMsg.getText().contains(doorshipFulfilMessage))) {
				assertTrue(newPDP.bulkFulfilMsg.getText().contains(doorshipFulfilMessage));
			}
		}
	}
	
	@Then("^user verifies fulfilment message present for DoorshipItems items$")
	public void user_verify_fulfilment_msg_doorShiItem() throws InterruptedException {
		String doorshipFulfilMessage = "This item may ship from a different location and therefore is only eligible for ground shipping.";
		if("mobile".equalsIgnoreCase(testtype)) {
			Thread.sleep(2000);
			System.out.println(newPDP.bulkFulfilMsg.getText());
			System.out.println(doorshipFulfilMessage);
			assertTrue(newPDP.bulkFulfilMsg.getText().contains(doorshipFulfilMessage));
		}else {
			assertTrue(newPDP.bulkFulfilMsg.getText().contains(doorshipFulfilMessage));
		}
	}
	
	
	@Then("^User verifies breadcrumb is present for the product$")
	public void user_verify_breadcrumb() throws InterruptedException {
		if("mobile".equalsIgnoreCase(testtype)) {
			Thread.sleep(2000);
			assertTrue(isDisplayed(newPDP.breadcrumb_m));
		}else {
			assertTrue(isDisplayed(newPDP.breadcrumb));
		}
	}
	
	
	
	@Then("^User verifies breadcrumb starts with root node and click on root$")
	public void user_verify_breadcrumb_start_with_root() throws InterruptedException {
		Thread.sleep(Constants.thread_medium);
		if("mobile".equalsIgnoreCase(testtype)) {
			Thread.sleep(3000);
			System.out.println("displaying root node");
			System.out.println(newPDP.BreadcrumbRootNode.getText());
			assertTrue(newPDP.BreadcrumbRootNode.getText().equalsIgnoreCase("Academy"));
			//assertTrue(clickOnButton(newPDP.BreadcrumbRootNode));
		}else {
			assertTrue(newPDP.BreadcrumbRootNode.getText().equalsIgnoreCase("Academy"));
		}
	
	}
	
	@And("^user verifies can navigate to subcategory on breadcrumb$")
	public void user_click_on_subcategory() throws InterruptedException {
		String curURL = driver.getCurrentUrl();
		String newURL = "";
		if("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isClickable(newPDP.breadcrumbSubCategory));
			assertTrue(clickOnButton(newPDP.breadcrumbSubCategory));
			Thread.sleep(Constants.thread_medium);
			newURL = driver.getCurrentUrl();
			assertFalse(newURL.equalsIgnoreCase(curURL));
		}else {
			assertTrue(isClickable(newPDP.breadcrumbSubCategory));
			assertTrue(clickOnButton(newPDP.breadcrumbSubCategory));
			Thread.sleep(Constants.thread_medium);
			newURL = driver.getCurrentUrl();
			assertFalse(newURL.equalsIgnoreCase(curURL));
		}
		
	}
	
	
	@And ("^user clicks on Size-chart and expects chart in new Tab$")
	public void user_clicks_on_size_chart() throws InterruptedException {
		Thread.sleep(Constants.thread_medium);
		if("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isClickable(newPDP.sizechart));
			assertTrue(clickOnButton(newPDP.sizechart));
			List<String> browserTabs = new ArrayList<String> (driver.getWindowHandles());
			
			driver.switchTo().window(browserTabs .get(1));
			System.out.println("opened size chart in new Tab");
			System.out.println(driver.getTitle());
			driver.switchTo().window(browserTabs.get(0));
		}else {
			assertTrue(isClickable(newPDP.sizechart));
			assertTrue(clickOnButton(newPDP.sizechart));
			List<String> browserTabs = new ArrayList<String> (driver.getWindowHandles());
			
			driver.switchTo().window(browserTabs .get(1));
			System.out.println("opened size chart in new Tab");
			System.out.println(driver.getTitle());
			driver.switchTo().window(browserTabs.get(0));
		}
		
		
		
	}
	
	@And("^user verifies size text available for single size item$")
	public void user_verifies_size_text() {
		if("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(newPDP.size));
			assertFalse(isDisplayed(newPDP.sizeButton));
		}else {
			assertTrue(isDisplayed(newPDP.size));
			assertFalse(isDisplayed(newPDP.sizeButton));
		}
	}
	
	@And("^user verifies label present is displayed as per selection$")
	public void user_verifies_label() {
		if("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(newPDP.colorLabel_m));
			assertTrue(isDisplayed(newPDP.sizeLabel_m));
		}else {
			assertTrue(isDisplayed(newPDP.colorLabel_m));
			assertTrue(isDisplayed(newPDP.sizeLabel_m));
		}
	}
	
	
	@And("^user verifies only colour text is present for single color item$")
	public void user_verifies_color() {
		if("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(newPDP.colorText));
		}else {
			assertTrue(isDisplayed(newPDP.colorText));
		}
	}
	
	
	@Then("^user verifies product recommendations are present$")
	public void user_verifies_prod_recommendations() {
		if("mobile".equalsIgnoreCase(testtype)) {


			assertTrue(isClickable(newPDP.prod_recommendation));
			String curURL = driver.getCurrentUrl();
			assertTrue(clickOnButton(newPDP.prod_recommendation));
			wait.until(ExpectedConditions.urlContains("pdp"));
			String newURL = driver.getCurrentUrl();
			if(!(curURL.equalsIgnoreCase(newURL))){
				if(newURL.indexOf("pdp")>=0) {
					assertTrue(true);
				}
				else {
					System.out.println("couldnot navigate to pdp page");
				}
			}
		}
			else {
				assertTrue(isDisplayed(newPDP.prod_recommendation));
				assertTrue(isClickable(newPDP.prod_recommendation));
				String curURL1 = driver.getCurrentUrl();
				assertTrue(clickOnButton(newPDP.prod_recommendation));
				wait.until(ExpectedConditions.urlContains("pdp"));
				String newURL1 = driver.getCurrentUrl();
				if(!(curURL1.equalsIgnoreCase(newURL1))){
					if(newURL1.indexOf("pdp")>=0) {
						assertTrue(true);
					}
					else {
						System.out.println("couldnot navigate to pdp page");
					}
			}
		
			}
	}
		
		
		@Then("^user verifies product recommendations are not present$")
		public void user_verifies_prod_recommendations_not_present() {
			if("mobile".equalsIgnoreCase(testtype)) {
				assertFalse(isDisplayed(newPDP.prod_recommendation));
				assertFalse(isClickable(newPDP.prod_recommendation));
			}else {
				assertFalse(isDisplayed(newPDP.prod_recommendation));
				assertFalse(isClickable(newPDP.prod_recommendation));
			}
			
	}
	//	----------------------Regular and Bulk GC--------------------
		@Then("^user verifies title present$")
		public void user_veifies_title() throws InterruptedException {
			Thread.sleep(3000);
			if("mobile".equalsIgnoreCase(testtype)) {
				assertTrue(isDisplayed(newPDP.productTitle));
			}else {
				assertTrue(isDisplayed(newPDP.productTitle));
			}
			
		}
		
		@Then("^user verifies product summary$")
		public void user_veifies_summary() throws InterruptedException {
			Thread.sleep(2000);
			if("mobile".equalsIgnoreCase(testtype)){
				assertTrue(isDisplayed(newPDP.prodSummary));
			}else {
				assertTrue(isDisplayed(newPDP.prodSummary));
			}
			
		}
		
		@And("^user verifies product Image$")
		public void user_veifies_product_image() throws InterruptedException {
			Thread.sleep(2000);
			if("mobile".equalsIgnoreCase(testtype)) {
				assertTrue(isDisplayed(newPDP.prod_Image_m));
			}else {
				assertTrue(isDisplayed(newPDP.prodImage));
			}
			
		}
		
		@And("^verify user is able to verify color attribute present$")
		public void ver_verifiy_color() {
			if("mobile".equalsIgnoreCase(testtype)) {
				assertTrue(isDisplayed(newPDP.color));
			}else {
				assertTrue(isDisplayed(newPDP.color));
			}
			
		}
		
		@And("^user verifies product price is not available for GC$")
		public void price_unavailable() {
			if("mobile".equalsIgnoreCase(testtype)) {
				assertFalse(isDisplayed(pdp_po.productprice));
			}else {
				assertFalse(isDisplayed(pdp_po.productprice));
			}
		}
		
		@And("^user verifies max quantity msg and link to bulk GC present$")
		public void maxQty_Bulk_GC_Link() {
			if("mobile".equalsIgnoreCase(testtype)) {
				assertTrue(isDisplayed(newPDP.max_qty_msg));
				assertTrue(isClickable(newPDP.BulkGc_link));
			}else {
				assertTrue(isDisplayed(newPDP.max_qty_msg));
				assertTrue(isClickable(newPDP.BulkGc_link));
			}
			
		}
		
		@And("^user verifies min quantity msg and link to regular GC present$")
		public void minQty_regular_GC_Link() {
			if("mobile".equalsIgnoreCase(testtype)) {
				assertTrue(isDisplayed(newPDP.max_qty_msg));
				assertTrue(isClickable(newPDP.BulkGc_link));
			}else {
				assertTrue(isDisplayed(newPDP.max_qty_msg));
				assertTrue(isClickable(newPDP.BulkGc_link));
			}
			
		}
		
		/*@And("^user verifies min quantity msg and link to regular GC present$")*/
		@And("^user verifies min quantity message and link to regular GC resent$")
		public void minQty_Regular_GC_Link() {
			if("mobile".equalsIgnoreCase(testtype)) {
				assertTrue(isDisplayed(newPDP.max_qty_msg));
				assertTrue(isClickable(newPDP.BulkGc_link));
			}else {
				assertTrue(isDisplayed(newPDP.max_qty_msg));
				assertTrue(isClickable(newPDP.BulkGc_link));
			}
			
		}
		
		@And("^user verifies can select premade card amount$")
		public void verify_premade_card_amt() {
			if("mobile".equalsIgnoreCase(testtype)) {
				assertTrue(isDisplayed(newPDP.premadeCardAmt));
				assertTrue(isClickable(newPDP.premadeCardAmt));
			}else {
				assertTrue(isDisplayed(newPDP.premadeCardAmt));
				assertTrue(isClickable(newPDP.premadeCardAmt));
			}
			
		}
		
		@And("^user verifies can select premade card amount for customizable amount$")
		public void verify_premade_card_amt_other() {
			if("mobile".equalsIgnoreCase(testtype)) {
				assertTrue(isDisplayed(newPDP.premadeCardAmt_other));
				assertTrue(isClickable(newPDP.premadeCardAmt_other));
			}else {
				assertTrue(isDisplayed(newPDP.premadeCardAmt_other));
				assertTrue(isClickable(newPDP.premadeCardAmt_other));
			}
			
		}
		
		@And("^user verifies can enter custom amount \"(.*?)\" on clicking custom amt button$")
		public void verify_enter_custom_Amt(String amount) {
			if("mobile".equalsIgnoreCase(testtype)) {
				WebElement amount_txtBox = newPDP.gc_customAmt;
				assertTrue(isDisplayed(newPDP.premadeCardAmt_other));
				assertTrue(isClickable(newPDP.premadeCardAmt_other));
				clickOnButton(newPDP.premadeCardAmt_other);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				setInputText(amount_txtBox, amount);
				assertTrue(isDisplayed(newPDP.GC_Custom_amtError));
			}else {
				WebElement amount_txtBox = newPDP.gc_customAmt;
				assertTrue(isDisplayed(newPDP.premadeCardAmt_other));
				assertTrue(isClickable(newPDP.premadeCardAmt_other));
				clickOnButton(newPDP.premadeCardAmt_other);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				setInputText(amount_txtBox, amount);
				assertFalse(isDisplayed(newPDP.GC_Custom_amtError));
			}
			
		}
		
		
		@Then("^user Inputs quatity \"(.*?)\" and verifies error message$")
		public void user_enters_max_qty(String qty) throws InterruptedException, AWTException {
			WebElement qtyTxtBox = pdp_po.quantityInput;
			if("mobile".equalsIgnoreCase(testtype)) {
				setInputText(qtyTxtBox, qty);
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_ENTER);
				Thread.sleep(Constants.thread_high);
				
			//	assertTrue(isDisplayed(newPDP.maxQty_ErrPopUp));
				clickOnButton(newPDP.errCanc_Btn);
			}else {
				setInputText(qtyTxtBox, qty);
				
				Thread.sleep(Constants.thread_high);
				
				//assertTrue(isDisplayed(newPDP.maxQty_ErrPopUp));
				clickOnButton(newPDP.errCanc_Btn);
			}
			
		}
		
		@And("^user verifies default quantity for Bulk GC$")
		public void Verify_default_qty() {
			//WebElement qtyTxtBox = pdp_po.quantityInput;
			if("mobile".equalsIgnoreCase(testtype)) {
				assertTrue(isDisplayed(pdp_po.quantityInput));
				/*String qty=(pdp_po.quantityInput.getAttribute("value"));
				System.out.println("default quantity = "+qty);
				if(qty.equalsIgnoreCase("51")) {
					assertTrue(qty.equalsIgnoreCase("51"));
				}
				else {
					assertTrue(qty.equals("51"));
				}*/
			}else {
				assertTrue(isDisplayed(pdp_po.quantityInput));
				/*String qty=getText(pdp_po.quantityInput);
				if(qty.equalsIgnoreCase("51")) {
					assertTrue(qty.equalsIgnoreCase("51"));
				}
				else {
					assertTrue(qty.equals("51"));
				}*/
				
			}
		}
			
	@And("^user should be able to see Alternate images$")
	public void user_verify_thumbnail_img() {
		if("mobile".equalsIgnoreCase(testtype)) {
			//assertTrue(isDisplayed(newPDP.thumbNailImg));
		}else {
			assertTrue(isDisplayed(newPDP.thumbNailImg));
		}
	}
	
	//@When("^user clicks on alternate image thumbnail$")
	public void user_clicks_atlernateImg() {
		
	}
	
	
	
	@Then("^user should see image is updated on selecting alternate image$")
		public void user_verifies_imgChange() throws InterruptedException {		
		if("mobile".equalsIgnoreCase(testtype)) {
			/*String imgsrc= newPDP.imageLink.getAttribute("src");
			clickOnButton(newPDP.thumbNailImg);
			Thread.sleep(2000);
			String imgsrc1 = newPDP.imageLink.getAttribute("src");
			assertFalse(imgsrc.equalsIgnoreCase(imgsrc1));*/
		}else {
			Thread.sleep(2000);
			String imgsrc= newPDP.imageLink.getAttribute("src");
			System.out.println("IMG SRC = "+imgsrc);
			clickOnButton(newPDP.thumbNailImg);
			Thread.sleep(2000);
			String imgsrc1 = newPDP.imageLink.getAttribute("src");
			System.out.println("NEW IMG src= "+imgsrc1);
			assertTrue(imgsrc.equalsIgnoreCase(imgsrc1));
		}
	}
	
	@And("^user verifies video plays in full screen mode$")
	public void verify_video_play() throws InterruptedException {
		if("mobile".equalsIgnoreCase(testtype)) {
			clickOnButton(newPDP.videoComponent_m);
			Thread.sleep(Constants.thread_high);
			assertTrue(isDisplayed(newPDP.videoPlayer));
		}else {
			clickOnButton(newPDP.videoComponent);
			Thread.sleep(Constants.thread_high);
			assertTrue(isDisplayed(newPDP.videoPlayer));
		}
	}
	
	@And("^user verifies pickup button is already selected$")
	public void pickup_selected() throws InterruptedException {
		if("mobile".equalsIgnoreCase(testtype)) {
			for (WebElement clickInStorePickUp : r2CartPo.clickAllInStorePickUp) {
			
				assertTrue(isSelected(clickInStorePickUp));
				Thread.sleep(Constants.thread_high);
		}
		}else {
			for (WebElement clickInStorePickUp : r2CartPo.clickAllInStorePickUp) {
				assertTrue(isSelected(clickInStorePickUp));
				Thread.sleep(Constants.thread_high);
			}
		}	
	}
	
	@And("^user verifies not elegible for online msg$")
	public void not_eligible_for_online() throws InterruptedException {
		if("mobile".equalsIgnoreCase(testtype)) {
			Thread.sleep(2000);
			assertTrue(isDisplayed(newPDP.notEligibleFrPickup));
		}
		else{
			Thread.sleep(2000);
			assertTrue(isDisplayed(newPDP.notEligibleFrPickup));
		}
	}
	
	@Then("^user verifies OOS msg$")
	public void user_verify_OOS_msg() throws InterruptedException {
		if("mobile".equalsIgnoreCase(testtype)) {
			Thread.sleep(2000);
			assertTrue(isDisplayed(newPDP.OOSmsg));
		}else {
			Thread.sleep(2000);
			assertTrue(isDisplayed(newPDP.OOSmsg));
		}
	}
	
	@And("user expects max qty error$")
	public void max_qty_error() {
		if("mobile".equalsIgnoreCase(testtype)) {
			//assertTrue(isDisplayed(newPDP.maxQtyError));
		}else {
			//assertTrue(isDisplayed(newPDP.maxQtyError));
		}
	}
	
	@And("^user should see product level message on PDP$")
	public void productLevel_message() {
		if("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(newPDP.productMessage));
		}else {
			assertTrue(isDisplayed(newPDP.productMessage));
		}
	}
	
	@And("^user should see product level message on PDP Start ship on MM-dd$")
	public void productLevel_message_mm_dd() {
		if("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(newPDP.productMessage));
		}else {
			assertTrue(isDisplayed(newPDP.productMessage));
		}
	}
	
	@And("^user should see product level message on PDP will not arrive by xmas$")
	public void productLevel_message_not_arrive() {
		if("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(newPDP.productMessage));
		}else {
			assertTrue(isDisplayed(newPDP.productMessage));
		}
	}
	
	@And("^user verifies image is updated on selecting different colour$")
	public void verify_diff_color() {
		if("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(newPDP.alt_color));
			assertTrue(clickOnButton(newPDP.alt_color));
		}else {
			assertTrue(isDisplayed(newPDP.alt_color));
			assertTrue(clickOnButton(newPDP.alt_color));
		}
	}

}
