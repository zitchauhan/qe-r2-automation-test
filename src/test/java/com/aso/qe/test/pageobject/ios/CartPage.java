package com.aso.qe.test.pageobject.ios;

import com.aso.qe.framework.common.PropertiesHelper;
import org.apache.log4j.Logger;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.util.List;
import java.util.Locale;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.*;

public class CartPage {

	private static final Logger logger = Logger.getLogger(CartPage.class.getName());
	protected float currentSubTotalValue;
	protected float currentTaxValue;
	protected float currentTotalValue;
	protected float shippingChargesToZipCode;
	private AppiumDriver<MobileElement> driver;

	public CartPage(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@iOSXCUITFindBy(id = "lbl_your_cart")
	public MobileElement labelYourCart;

	@iOSXCUITFindBy(id = "lbl_cart")
	public MobileElement labelItemCount;

	@iOSXCUITFindBy(id = "lbl_subtotal_header")
	public MobileElement labelSubtotalHeader;

	@iOSXCUITFindBy(id = "lbl_product_title")
	public MobileElement labelProductTitle;

	@iOSXCUITFindBy(id = "lbl_product_price")
	public MobileElement labelProductPrice;

	@iOSXCUITFindBy(id = "lbl_sku")
	public MobileElement labelSku;

	@iOSXCUITFindBy(id = "lbl_sku_value")
	public MobileElement labelSkuValue;

	@iOSXCUITFindBy(id = "btn_minus_id")
	public MobileElement quantitySelectorDecrement;

	@iOSXCUITFindBy(id = "btn_plus_id")
	public MobileElement quantitySelectorIncrement;

	@iOSXCUITFindBy(id = "input_field_id")
	public MobileElement quantityEditBox;

	@iOSXCUITFindBy(id = "btn_remove_from_cart")
	public MobileElement removeFromCartButton;

	@iOSXCUITFindBy(id = "btn_add_to_wishlist")
	public MobileElement addToWishListButton;

	@iOSXCUITFindBy(id = "lbl_promocode_header")
	public MobileElement promoCodeHeader;

	@iOSXCUITFindBy(id = "input_field_promocode")
	public MobileElement promoCodeInputField;

	@iOSXCUITFindBy(id = "lbl_promocode")
	public MobileElement promoCodeName;

	@iOSXCUITFindBy(id = "btn_remove_promocode")
	public MobileElement promoCodeRemoveBbutton;

	@iOSXCUITFindBy(id = "lbl_discount_amount")
	public MobileElement promoCodeDiscountAmount;

	@iOSXCUITFindBy(id = "lbl_promocode_error_message")
	public MobileElement promoCodeErrorMessage;

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
		if (isProductTitleDisplayed())
			return labelProductTitle.getText();
		else
			return null;
	}

	public boolean isProductPriceDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.CartPage.labelProductPrice);
	}

	public String getProductPriceText() {
		if (isProductPriceDisplayed())
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
		if (isProductSkuDisplayed())
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
	@iOSXCUITFindBy(id = "lbl_free_store_pickup")
	public MobileElement bopisDeliveryOption;

	public boolean bopisDeliveryOptionDisplayed() {
		return bopisDeliveryOption.isDisplayed();
	}

	//OMNI-22009  locator needs to updated
	@iOSXCUITFindBy(id = "locator needs to be updated")
	public MobileElement bopisDeliveryMessageCart;

	public boolean bopisDeliveryMessageCartDisplayed() {
		return bopisDeliveryMessageCart.isDisplayed();
	}

	//OMNI-22009  locator needs to updated
	@iOSXCUITFindBy(id = "locator needs to be updated")
	public MobileElement arrowIconDeliveryOptionCart;

	public boolean arrowIconDeliveryOptionCartDisplayed() {
		return arrowIconDeliveryOptionCart.isDisplayed();
	}

	//OMNI-22009  locator needs to updated
	@iOSXCUITFindBy(id = "locator needs to be updated")
	public MobileElement clickChevronButtonCartPage;

	public void clickChevronButtonCart() throws Throwable {
		clickChevronButtonCartPage.click();
	}


	@iOSXCUITFindBy(id = "lbl_free_store_pickup")
	public MobileElement storePickUpDeliveryOptionFulfillmentPage;

	public boolean isBopisOptionsFulfillmentDisplayed() {
		return storePickUpDeliveryOptionFulfillmentPage.isDisplayed();
	}

	@iOSXCUITFindBy(id = "lbl_home_delivery")
	public MobileElement homeDeliveryOptionFulfillmentPage;

	public boolean isSthFulfillmentDisplayed() {
		return homeDeliveryOptionFulfillmentPage.isDisplayed();
	}

	@iOSXCUITFindBy(id = "rd_free_store_pickup")
	public MobileElement freeStorePickUpRadioButton;

	public void clickFreeStorePickUp() throws Throwable {
		freeStorePickUpRadioButton.click();
	}

	@iOSXCUITFindBy(id = "rd_home_delivery")
	public MobileElement homeDeliveryRadioButton;

	public void clickHomeDelivery() throws Throwable {
		homeDeliveryRadioButton.click();
	}

	//OMNI-20661 locator needs to be updated
	@iOSXCUITFindBy(id = "locator needs to be updated")
	public MobileElement noCounterBadgeOnCartIcon;

	public boolean noCounterBadgeCartIconDisplayed() {
		return noCounterBadgeOnCartIcon.isDisplayed();
	}

	//OMNI-20661 locator needs to be updated
	@iOSXCUITFindBy(id = "locator needs to be updated")
	public MobileElement CounterBadgeOnCartIcon;

	public void matchItemsCountOnCartBadge() throws Throwable {
		//getting the total number of items/qty in the cart via the total label in the cart page
		String qtyCartPage = labelItemCount.getText();
		int qtyCartPageCount = Integer.parseInt(qtyCartPage);
		String countOnCartBadge = CounterBadgeOnCartIcon.getText();
		if (qtyCartPageCount < 100) {
			//validating the counter badge should be equal to the total qty/items in the cart
			assertTrue(qtyCartPage.equalsIgnoreCase(countOnCartBadge));

		} else {
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

	public void editQtyCartPage(String newqty) throws Throwable {
		assertTrue(quantityEditBox.isDisplayed());
		quantityEditBox.click();
		quantityEditBox.sendKeys(newqty);
	}

	//OMNI-20661
	@iOSXCUITFindBy(id = "btn_cart_icon_bottomnav")
	public MobileElement cartIconBottomNav;

	public boolean iscartIconBottomNavDisplayed() {
		return cartIconBottomNav.isDisplayed();
	}

	public void clickCartIconBottomNav() {
		cartIconBottomNav.click();
	}

	public void validateGuestSignInSection(String isPresent) {
		GlobalMobileHelper.setImplicitWaitTo(driver, 3);
		if (isPresent.equalsIgnoreCase("is present")) {
			assertTrue("User icon is not present", GlobalMobileHelper.isElementDisplayed(Locators.CartPage.userIcon));
			assertTrue("Guest checkout label is not present", GlobalMobileHelper.isElementDisplayed(Locators.CartPage.guestCheckoutLabel));
			assertTrue("Sign in label is not present", GlobalMobileHelper.isElementDisplayed(Locators.CartPage.signInLabel));
			assertTrue("Sign in button is not displayed", GlobalMobileHelper.isElementDisplayed(Locators.CartPage.signInButton));
		} else if (isPresent.equalsIgnoreCase("is not present")) {
			assertFalse("User icon is present", GlobalMobileHelper.isElementDisplayed(Locators.CartPage.userIcon));
			assertFalse("Guest checkout label is present", GlobalMobileHelper.isElementDisplayed(Locators.CartPage.guestCheckoutLabel));
			assertFalse("Sign in label is present", GlobalMobileHelper.isElementDisplayed(Locators.CartPage.signInLabel));
			assertFalse("Sign in button is displayed", GlobalMobileHelper.isElementDisplayed(Locators.CartPage.signInButton));
		}

	}

	public void tapOnSignInButton() {
		// TODO Auto-generated method stub
		GlobalMobileHelper.setImplicitWaitTo(driver, 3);
		assertTrue("Sign in button is not displayed", GlobalMobileHelper.isElementDisplayed(Locators.CartPage.signInButton));
		GlobalMobileHelper.tapOnElement(Locators.CartPage.signInButton);
	}

	public boolean validateCartVariant() {
		MobileElement cartVariantValue = driver.findElement(Locators.CartPage.cartSizeVariant);
		return cartVariantValue.getText().contains(driver.findElement(Locators.PDPPage.sizeValue).getText());
	}
	/*public boolean validateCartVariantGolfBall() {
		MobileElement cartVariantValueOfGolfBall = driver.findElement(Locators.CartPage.)
	}*/

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
		assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.CartPage.securityReassuranceMessage));
		logger.debug("Security Reassurance Message is displayed on View Cart page");
	}

	public void isPaymentModeImagesDisplayed() {
		assertTrue(driver.findElement(Locators.CartPage.paymentModeImages).isDisplayed());
		logger.debug("Payment code images component is displayed on View Cart page");
		logger.warn("Only images component is verified with automation. Need to verify individualy images with manual testing.");
	}
	//OMNI-22070 - end


	public void isOrderTotalValueUpdated(String reason) {
		MobileElement orderTotalValueElement = driver.findElement(Locators.CartPage.orderTotalValue);
		String orderTotalValue = orderTotalValueElement.getText().replace("$", "");
		try {
			if (reason.toLowerCase().equals("shipping")) { // can be updated for other reasons later
				if (shippingChargesToZipCode > 0) {
					assertNotEquals(currentTotalValue, Float.parseFloat(orderTotalValue), 0.00);
				} else {
					assertEquals(currentTotalValue, Float.parseFloat(orderTotalValue), 0.00);
				}
			}

			logger.debug("Order total value has been updated : " + orderTotalValue);
		} catch (Exception e) {
			logger.error(e.getLocalizedMessage());
		}
	}


	public void applyPromoCode(String promoCode) {

		promoCodeInputField.sendKeys(promoCode);
		promoCodeHeader.click();
		logger.debug("Applied the promoCode on the cart screen");

	}


	public void tapOnPolicyLink(String arg) {
		if (arg.equalsIgnoreCase("Shipping policy")) {
			GlobalMobileHelper.tapOnElement(Locators.CartPage.buttonShippingPolicy);
		} else if (arg.equalsIgnoreCase("Return policy")) {
			GlobalMobileHelper.tapOnElement(Locators.CartPage.buttonReturnPolicy);
		}
	}

	public void isPolicyPageDisplayed(String arg) {
		GlobalMobileHelper.setImplicitWaitTo(driver, 5);
		if (arg.equalsIgnoreCase("Shipping policy"))
			assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.CartPage.pageTitleShippingPolicy));
		else if (arg.equalsIgnoreCase("Return policy"))
			assertTrue(GlobalMobileHelper.isElementDisplayed(Locators.CartPage.pageTitleReturnPolicy));
	}


	public void noteDownCurrentSubtotal() {
		try {
			MobileElement orderSubTotalValueElement = driver.findElement(Locators.CartPage.orderSubtotalValue);
			String orderSubTotalValue = orderSubTotalValueElement.getText().replace("$", "");
			currentSubTotalValue = Float.parseFloat(orderSubTotalValue);
			logger.debug("Current Sub total value has been saved : " + orderSubTotalValue);
		} catch (Exception e) {
			logger.error(e.getLocalizedMessage());
		}

	}

	public void noteDownCurrentTaxValue() {
		try {
			MobileElement taxValueElement = driver.findElement(Locators.CartPage.taxesValue);
			String taxesValue = taxValueElement.getText().replace("$", "");
			currentTaxValue = Float.parseFloat(taxesValue);
			logger.debug("Current taxes value has been saved : " + taxesValue);
		} catch (Exception e) {
			logger.error(e.getLocalizedMessage());
		}

	}

	public void noteDownCurrentTotalValue() {
		try {
			MobileElement orderTotalValueElement = driver.findElement(Locators.CartPage.orderTotalValue);
			String orderTotalValue = orderTotalValueElement.getText().replace("$", "");
			currentTotalValue = Float.parseFloat(orderTotalValue);
			logger.debug("Current order total value has been saved : " + orderTotalValue);
		} catch (Exception e) {
			logger.error(e.getLocalizedMessage());
		}
	}

	public void isOrderSubtotalValueUpdated() {
		try {
			MobileElement orderSubTotalValueElement = driver.findElement(Locators.CartPage.orderSubtotalValue);
			String orderSubTotalValue = orderSubTotalValueElement.getText().replace("$", "");
			assertNotEquals(currentSubTotalValue, Float.parseFloat(orderSubTotalValue), 0.00);
			logger.debug("The order value is updated : " + orderSubTotalValue);
		} catch (Exception e) {
			logger.error(e.getLocalizedMessage());
		}
	}
	public void isOrderTaxValueUpdated() {
		try {
			MobileElement taxValueElement = driver.findElement(Locators.CartPage.taxesValue);
			String taxesValue = taxValueElement.getText().replace("$", "");
			assertNotEquals(currentTaxValue, Float.parseFloat(taxesValue), 0.00);
			logger.debug("Taxes value has been updated : " + taxesValue);
		} catch (Exception e) {
			logger.error(e.getLocalizedMessage());
		}

	}

	public void isOrderTotalValueUpdated() {
		MobileElement orderTotalValueElement = driver.findElement(Locators.CartPage.orderTotalValue);
		try {
			String orderTotalValue = orderTotalValueElement.getText().replace("$", "");
			assertNotEquals(currentTotalValue, Float.parseFloat(orderTotalValue), 0.00);
			logger.debug("Order total value has been updated : " + orderTotalValue);
		} catch (Exception e) {
			logger.error(e.getLocalizedMessage());
		}
	}


	public void isPromoCodeFieldDisplayed() {
		
		assertTrue(promoCodeInputField.isDisplayed());
		logger.debug("Promocode field is displayed on the cart screen");
	}
		
	public void isPromoCodeDisplayed() {
		assertTrue(promoCodeName.isDisplayed());
		logger.debug("Promo Code is displayed on the cart screen");
	}
	
	public void isRemovePromoCodeButtonDisplayed() {
		assertTrue(promoCodeRemoveBbutton.isDisplayed());
		logger.debug("Promo code remove button is displayed on the cart screen");
	}
		
	public void tapOnRemovePromoButton() {
		promoCodeRemoveBbutton.click();
		logger.debug("Tapped on promo code remove button on the cart screen");
	}
	
	public void isPromoCodeFieldEnabled() {
		String enabledAttribute = promoCodeInputField.getAttribute("enabled");
		assertEquals(enabledAttribute, "True");
		logger.debug("Promo code field is enabled on the cart screen");
	}
	
	public void isPromoCodeFieldDisabled() {
		assertFalse(GlobalMobileHelper.isElementDisplayed(promoCodeInputField));
		logger.debug("Promo code field is disabled on the cart screen");
	}
	
	public void ispromoCodeAmountDisplayed() {
		assertTrue(GlobalMobileHelper.isElementDisplayed(promoCodeDiscountAmount));
		logger.debug("Promo code amount is displayed on the cart screen");
	}

	
	public void ispromoCodeAmountNotDisplayed() {
		assertFalse(GlobalMobileHelper.isElementDisplayed(promoCodeDiscountAmount));
		logger.debug("Promo code amount is not displayed on the cart screen");
	}

	public void verifyPromoCodeErrorMessage(String expectedMessage) {
		assertEquals(expectedMessage, promoCodeErrorMessage.getText().trim());
		logger.debug("Promo code error message " + expectedMessage +" is verified");
	}	

	public void verifyPromoErroMessage(String expectedErrorMessage) {
		assertEquals(promoCodeErrorMessage.getText().trim(), expectedErrorMessage);
		logger.debug("Error message for promo code is verified : " + expectedErrorMessage);
	}

	/**
	 * Verify the disclaimer for the current product in context
	 *
	 * @param productDisclaimer
	 */
	public void verifyProductDisclaimer(String productDisclaimer) {
		/*
		 * get all product tiles and and look for the product tile
		 * once the product tile is found , look for the disclaimer message of that product
		 * and assert if the the match found by regexp is > than 0
		 * */
		MobileElement productParent;
		String currentProductTitle = Context.getCurrentProductTitle();
		boolean found=false;
		if (currentProductTitle.isBlank() || currentProductTitle.isEmpty()){
			// assert the first disclaimer on screen
			assertEquals(productDisclaimer, driver.findElement(Locators.CartPage.productDisclaimerLabel).getText().trim());
		}else {
			String disclaimerXpathTemplate = "(//XCUIElementTypeStaticText[@name='disclaimer_messages_label'])[%d]";
			int ix=1;
			List<MobileElement> productTitles = driver.findElementsByXPath("//XCUIElementTypeStaticText[@name='lbl_product_title']");
			for (MobileElement productTitle: productTitles){
				if (productTitle.getText().trim().toLowerCase().contains(currentProductTitle.toLowerCase())){
					MobileElement prodDisclaimerElement = driver.findElementByXPath(String.format(disclaimerXpathTemplate,ix));
					found=true;
					//assertEquals(productDisclaimer, prodDisclaimerElement.getText().trim());
					assertThat(prodDisclaimerElement.getText().trim(), containsString(productDisclaimer));
					break;
				}
				ix+=1;
			}
			if (!found){
				assertEquals(productDisclaimer,"Disclaimer Not found");
			}
		}

		// Search for a product based on Unique id and check the product disclaimer when multiple products are in the cart
		logger.debug("Product disclaimer for product " + currentProductTitle + " is displayed");

	}

	public void verifyLongerProductDisclaimer(String productDisclaimer) {
		assertTrue(driver.findElement(Locators.CartPage.productDisclaimerLabel).getText().contains("..."));
		GlobalMobileHelper.isElementDisplayed(Locators.CartPage.productDisclaimerReadMore);
		logger.debug("Product disclaimer Read more and ellipses are displayed on the Cart screen");
	}
	
	public void noteDownCurrentShippingCharges() {
		MobileElement estimatedShipping = driver.findElement(Locators.CartPage.labelEstimatedShipping);
		try {
				String estimatedShippingCharges = estimatedShipping.getText()
						.split("-")[1].trim()
						.split(" ")[0];
				if (estimatedShippingCharges.trim().equals("Free")) {
					shippingChargesToZipCode=0.00F;
				} else {
					shippingChargesToZipCode = Float.parseFloat(estimatedShippingCharges);
				}
			}catch(Exception e) {
			
				e.getLocalizedMessage();
		}
		
	}
	
	
	public void isShippingChargeUpdated(boolean NotFree) {
		// NotFree to be passed as False if shipping charges for a zip code is NIL
		MobileElement estimatedShipping = driver.findElement(Locators.CartPage.labelEstimatedShipping);
		try {
				String estimatedShippingCharges = estimatedShipping.getText()
						.split("-")[1].trim().split(" ")[0].replace("$", "");
				if(NotFree) {
					assertNotEquals(
							shippingChargesToZipCode, 
							Float.parseFloat(estimatedShippingCharges), 
							0.00);
				}else {
					assertEquals("Free",estimatedShippingCharges );
				}
				
			}catch(Exception e) {
			
				e.getLocalizedMessage();
		}
	}
	

	public void tapOnProductTitle() {
		GlobalMobileHelper.tapOnElement(Locators.CartPage.labelProductTitle);

	}

	public boolean isCheckoutPageDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.CartPage.buttonCheckout);
	}

	public void tapOnCheckoutButton() {
		GlobalMobileHelper.tapOnElement(Locators.CartPage.buttonCheckout);
	}

	public boolean isvariantDisplayedOnCart(String expactedSizeVariant, String expactedColorVariant , String variantType) {
		if(variantType.contains("SizeAndColor")) {
		boolean stat = driver.findElement(Locators.CartPage.cartColorVariant).getText().contains(expactedColorVariant);
		boolean stat1 = driver.findElement(Locators.CartPage.cartSizeVariant).getText().contains(expactedSizeVariant);
		if(stat&&stat1==true) {
			return true;
		}else {
			return false;
		}
		}else {
			String s =driver.findElement(Locators.CartPage.cartColorVariant).getText();
			if(s.contains(expactedColorVariant)) {
				return true;
			}else {
				return false;
			}
	}
	}


	/**
	 * method to verify that the cart of the registered user has a WhiteGlove bulky product in the cart
	 * @return true or false based matching criteria
	 */
    public boolean hasWhiteGloveBulkyItem() {
		boolean result = false;
		// Get product title from the properties file
		String WhiteGloveBulky = PropertiesHelper.getInstance().getMobileTestDataProperty("WhiteGloveBulky");
		return productOnCartExistsByTitle(WhiteGloveBulky);
	}

	/**
	 * A method to check the existence of any product on the cart page by ProductTitle
	 * @param productTitle
	 * @return true or false based on search result
	 */

	private boolean productOnCartExistsByTitle(String productTitle) {
    	boolean result = false;
    	List<MobileElement> productTiles = driver.findElements(Locators.CartPage.labelProductTitle);
    	for (MobileElement product: productTiles){
    		if (product.getText().contains(productTitle)){
    			result=true;
    			break;
			}
		}
    	return result;
	}

	public void noteDownTotalQty() {
	// storing the total quantity on cart page to a variable, which we can utilize further for the validation.
		try {
			MobileElement totalQtyOnCartIcon = driver.findElement(Locators.BottomNav.cart);
			String totalQty = totalQtyOnCartIcon.getText().split("Q T Y")[1];
			Context.setTotalQtyOnCart(totalQty);
			logger.debug("Total quantity has been saved : " + totalQty);
		} catch (Exception e) {
			logger.error(e.getLocalizedMessage());
		}

	}
}
