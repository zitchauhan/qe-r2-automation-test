package com.aso.qe.test.pageobject.ios;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class CartPage {
	
	private static final Logger logger = Logger.getLogger(CartPage.class.getName());
	
	private AppiumDriver<MobileElement> driver;
	public CartPage(AppiumDriver<MobileElement> driver) {
	  this.driver = driver;
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
	public static By orderSubtotalLabel = By.id("lbl_subtotal_summary");
	public static By orderSubtotalValue = By.id("lbl_subtotal_value");
	public static By zipCodeButton = By.id("btn_change_zipcode");
	public static By storePickUpLabel = By.id("");
	public static By changeStoreLabel = By.id("");
	public static By taxesLabel = By.id("lbl_taxes");
	public static By taxesValue = By.id("lbl_taxes_value");
	public static By discountLabel = By.id("lbl_discount");
	public static By promoCodeLabel = By.id("");
	public static By orderTotalLabel = By.id("lbl_order_total");
	public static By orderTotalValue = By.id("lbl_order_total_value");
	
	public boolean isYourCartLabelDisplayed() {
		MobileElement yourCartLabel = driver.findElement(Locators.CartPage.labelYourCart);
		return yourCartLabel.isDisplayed();
	}
	
	public boolean isEmptyCartIconDisplayed() {
		MobileElement emptyCartIcon = driver.findElement(Locators.CartPage.imageEmptyCartIcon);
		return emptyCartIcon.isDisplayed();
	}
	
	public boolean isYourCartIsEmptyLabelDisplayed() {
		MobileElement yourCartIsEmptyLabel = driver.findElement(Locators.CartPage.labelYourCartIsEmpty);
		return yourCartIsEmptyLabel.isDisplayed();
	}
	
	public boolean isUserSpecificMessageDisplayed() {
		MobileElement emptyCartInfoLabel = driver.findElement(Locators.CartPage.labelEmptyCartInfo);
		return emptyCartInfoLabel.isDisplayed();
	}
	
	public boolean isLogInButtonDisplayed() {
		MobileElement loginButton = driver.findElement(Locators.CartPage.buttonLogIn);
		return loginButton.isDisplayed();
	}
	
	public boolean isCreateAnAccountButtonDisplayed() {
		MobileElement createAnAccount = driver.findElement(Locators.CartPage.buttonCreateAnAccount);
		return createAnAccount.isDisplayed();
	}
	
	public boolean isItemCountLabelDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.CartPage.labelItems);
	}
	
	public String getItemContLabelText() {
		return labelItemCount.getText();
	}
	
	public boolean isSubtotalHeaderDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.CartPage.labelSubtotalHeader);
	}
	
	public boolean isProductTitleDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.CartPage.labelProductTitle);
	}
	
	public String getProductTitle() {
		if(isProductTitleDisplayed())
			return labelProductTitle.getText();
		else
			return null;
	}
	
	public boolean isProductPriceDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.CartPage.labelProductPrice);
	}
	
	public String getProductPriceText() {
		if(isProductPriceDisplayed())
			return labelProductPrice.getText();
		else
			return null;
	}
	
	public boolean isProductSkuDisplayed() {
		boolean skuLabel = GlobalMobileHelper.isElementDisplayed(Locators.CartPage.labelSku);
		boolean skuValue = GlobalMobileHelper.isElementDisplayed(Locators.CartPage.labelSkuValue);
		return skuLabel && skuValue;
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
		return GlobalMobileHelper.isElementDisplayed(Locators.CartPage.buttonRemoveFromCart);
	}
	
	public void tapOnRemoveFromCart() {
		removeFromCartButton.click();
	}
	
	public boolean isAddToWishlistButtonDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.CartPage.buttonAddToWishList);
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
	
	//OMNI-20661
	public void tapPlusActionCartPage() throws Throwable {
		quantitySelectorIncrement.click();
	}
	
	//OMNI-20661
	public void tapMinusActionCartPage() throws Throwable {
		quantitySelectorDecrement.click();
	}
	
	public void editQtyCartPage(String newqty) throws Throwable{
		assertTrue(quantityEditBox.isDisplayed());
		quantityEditBox.click();
		quantityEditBox.sendKeys(newqty);
	}
	
	//OMNI-20661
	@iOSXCUITFindBy(id="btn_cart_icon_bottomnav")
	public MobileElement cartIconBottomNav;
	
	public boolean iscartIconBottomNavDisplayed() {
		return cartIconBottomNav.isDisplayed();	}
	
	public void clickCartIconBottomNav() {
		cartIconBottomNav.click();
	}
	
	//OMNI-22070 - start
	public void isLabelShopWithConfidenceDisplayed() {
		assertTrue(driver.findElement(Locators.CartPage.labelShopWithConfidence).isDisplayed());
		logger.debug("Label Shop with Confidence is displayed on View Cart page");
	}
	
	public void isLabelWeAcceptDisplayed() {
		assertTrue(driver.findElement(Locators.CartPage.labelWeAccept).isDisplayed());
		logger.debug("Label We Accept is displayed on View Cart page");
	}
	
	public void isSecurityReassuranceMessageDisplayed() {
		assertTrue(driver.findElement(Locators.CartPage.securityReassuranceMessage).isDisplayed());
		logger.debug("Security Reassurance Message is displayed on View Cart page");
	}
	
	public void isPaymentModeImagesDisplayed() {
		assertTrue(driver.findElement(Locators.CartPage.paymentModeImages).isDisplayed());
		logger.debug("Payment code images component is displayed on View Cart page");
		// TODO : explore additional verifications that can be covered under automation
		logger.warn("Only images component is verified with automation. Need to verify individualy images with manual testing.");
	}
	//OMNI-22070 - end
}