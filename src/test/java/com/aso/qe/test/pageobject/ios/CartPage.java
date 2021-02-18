package com.aso.qe.test.pageobject.ios;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class CartPage {
	private AppiumDriver<MobileElement> driver;
    
	public CartPage(AppiumDriver<MobileElement> driver) {
	  this.driver = driver;
	  PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	 }
	
	@iOSXCUITFindBy(id="lbl_your_cart")
	public MobileElement labelYourCart;
	
	@iOSXCUITFindBy(id="lbl_item_count")
	public MobileElement labelItemCount;
	
	@iOSXCUITFindBy(id="lbl_subtotal_header")
	public MobileElement labelSubtotalHeader;
	
	@iOSXCUITFindBy(id="lbl_product_title")
	public MobileElement labelProductTitle;
	
	@iOSXCUITFindBy(id="lbl_product_price")
	public MobileElement labelProductPrice;
	
	@iOSXCUITFindBy(id="lbl_sku")
	public MobileElement labelSku;
	
	@iOSXCUITFindBy(id="lbl_sku_value")
	public MobileElement labelSkuValue;
	
	@iOSXCUITFindBy(id="btn_quantity_decrement")
	public MobileElement quantitySelectorDecrement;
	
	@iOSXCUITFindBy(id="btn_quantity_increment")
	public MobileElement quantitySelectorIncrement;
	
	@iOSXCUITFindBy(id="txt_quantity_box")
	public MobileElement quantityEditBox;
	
	@iOSXCUITFindBy(id="btn_remove_from_cart")
	public MobileElement removeFromCartButton;
	
	@iOSXCUITFindBy(id="btn_add_to_wishlist")
	public MobileElement addToWishListButton;
	
	public static By orderSummaryLabel = By.id("lbl_order_summary");
	public static By orderSubtotalLabel = By.id("");
	public static By zipCodeButton = By.id("");
	public static By storePickUpLabel = By.id("");
	public static By changeStoreLabel = By.id("");
	public static By taxesLabel = By.id("");
	public static By discountLabel = By.id("");
	public static By promoCodeLabel = By.id("");
	public static By orderTotalLabel = By.id("");
	
	public boolean isYourCartLabelDisplayed() {
		return labelYourCart.isDisplayed();
	}
	
	public boolean isItemCountLabelDisplayed() {
		return labelItemCount.isDisplayed();
	}
	
	public boolean isSubtotalHeaderDisplayed() {
		return labelSubtotalHeader.isDisplayed();
	}
	
	public boolean isProductTitleDisplayed() {
		return labelProductTitle.isDisplayed();
	}
	
	public String getProductTitle() {
		if(isProductTitleDisplayed())
			return labelProductTitle.getText();
		else
			return null;
	}
	
	public boolean isProductPriceDisplayed() {
		return labelProductPrice.isDisplayed();
	}
	
	public String getProductPriceText() {
		if(isProductPriceDisplayed())
			return labelProductPrice.getText();
		else
			return null;
	}
	
	public boolean isProductSkuDisplayed() {
		return labelSku.isDisplayed();
	}
	
	public String getSKUValue() {
		if(isProductSkuDisplayed())
			return labelSkuValue.getText();
		else
			return null;
	}
	
	public boolean isProductQuantitySelectorDisplayed() {
		return quantityEditBox.isDisplayed();
	}
	
	public String getProductQuantity() {
		return quantityEditBox.toString();
		
	}
	
	public void incrementQuantityByOne() {
		quantitySelectorIncrement.click();
	}
	
	public void decremenntQuantityByOne() {
		quantitySelectorDecrement.click();
	}
	
	public void enterQuantity(String qty) {
		quantityEditBox.sendKeys(qty);
	}
	
	public boolean isRemoveFromCartButtonDisplayed() {
		return removeFromCartButton.isDisplayed();
	}
	
	public void tapOnRemoveFromCart() {
		removeFromCartButton.click();
	}
	
	public boolean isAddToWishlistButtonDisplayed() {
		return addToWishListButton.isDisplayed();
	}
	
	public void tapOnAddToWishlistButton() {
		addToWishListButton.click();
	}
	
	//OMNI-22009
	@iOSXCUITFindBy(id="lbl_free_store_pickup")
	public MobileElement bopisDeliveryOption;
	
	public boolean bopisDeliveryOptionDisplayed() {
		return bopisDeliveryOption.isDisplayed();
	}
	
	//OMNI-22009  locator needs to updated
	@iOSXCUITFindBy(id="locator needs to be updated")
	public MobileElement bopisDeliveryMessageCart;
	
	public boolean bopisDeliveryMessageCartDisplayed() {
		return bopisDeliveryMessageCart.isDisplayed();
	}
	
	//OMNI-22009  locator needs to updated
	@iOSXCUITFindBy(id="locator needs to be updated")
	public MobileElement arrowIconDeliveryOptionCart;
		
	public boolean arrowIconDeliveryOptionCartDisplayed() {
	return arrowIconDeliveryOptionCart.isDisplayed();
	}
	
	//OMNI-22009  locator needs to updated
	@iOSXCUITFindBy(id="locator needs to be updated")
	public MobileElement clickChevronButtonCartPage;
			
	public void clickChevronButtonCart() throws Throwable {
	clickChevronButtonCartPage.click();
	}
	
	
	@iOSXCUITFindBy(id="lbl_free_store_pickup")
	public MobileElement storePickUpDeliveryOptionFulfillmentPage;
				
	public boolean isBopisOptionsFulfillmentDisplayed() {
	return storePickUpDeliveryOptionFulfillmentPage.isDisplayed();
	}
	
	@iOSXCUITFindBy(id="lbl_home_delivery")
	public MobileElement homeDeliveryOptionFulfillmentPage;
					
	public boolean isSthFulfillmentDisplayed() {
	return homeDeliveryOptionFulfillmentPage.isDisplayed();
	}
	
	@iOSXCUITFindBy(id="rd_free_store_pickup")
	public MobileElement freeStorePickUpRadioButton;
					
	public void clickFreeStorePickUp() throws Throwable {
	freeStorePickUpRadioButton.click();
	}
	
	@iOSXCUITFindBy(id="rd_home_delivery")
	public MobileElement homeDeliveryRadioButton;
	
	public void clickHomeDelivery() throws Throwable{
	homeDeliveryRadioButton.click();
	}
	
	//OMNI-20661 locator needs to be updated
	@iOSXCUITFindBy(id="locator needs to be updated")
	public MobileElement noCounterBadgeOnCartIcon;
	
	public boolean noCounterBadgeCartIconDisplayed(){
	return noCounterBadgeOnCartIcon.isDisplayed();
	}
	
	//OMNI-20661 locator needs to be updated
	@iOSXCUITFindBy(id="locator needs to be updated")
	public MobileElement CounterBadgeOnCartIcon;
	
	public void matchItemsCountOnCartBadge() throws Throwable {
		//getting the total number of items/qty in the cart via the total label in the cart page
		String qtyCartPage = labelItemCount.getText();
		int qtyCartPageCount = Integer.parseInt(qtyCartPage);
		String countOnCartBadge = CounterBadgeOnCartIcon.getText();
		if(qtyCartPageCount < 100)
		{
			//validating the counter badge should be equal to the total qty/items in the cart
			assertTrue(qtyCartPage.equalsIgnoreCase(countOnCartBadge));
			
		}
		else
		{
			assertTrue(countOnCartBadge.equalsIgnoreCase("99+"));
		}
	
	}
}