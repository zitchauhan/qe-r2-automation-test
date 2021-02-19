package com.aso.qe.test.common;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Locators {
	
	public static class BottomNav{
		public static By home = By.id("lbl_home");
		public static By shop = By.id("lbl_shop");
		public static By wishlist = By.id("lbl_wishlist");
		public static By cart = By.id("lbl_cart");
		public static By account = By.id("lbl_account");
	}
	
	public static class LoginPage{
		public static By emailEditBox = By.xpath("//*[contains(@value,'Email')]");
		public static By passwordEditBox = By.xpath("//*[contains(@value,'Password')]");
		public static By loginButton = By.xpath("//XCUIElementTypeButton[contains(@label,'LOG IN')]");
	}
	
	public static class HomePage{
		public static By buttonGoToPDP = By.xpath("//*[contains(@label,\"Adidas Men's Designed2Move Polo Shirt\")]");
	}
	
	public static class PDPPage{
		public static By imageHero = By.id("img_hero");
		public static By labelProductTitle = By.id("lbl_product_title");
		public static By labelProductPrice = By.id("lbl_product_price");
	}
	
	public static class ShopPage{
		public static By shopPageTitle = By.id("");
	}
	
	public static class WishlistPage{
		public static By wishlistTitle = By.id("");
	}
	
	public static class AccountPage{
		public static By accountTitle = By.id("");
	}
	
	public static class CartPage{
		public static By labelYourCart = By.id("lbl_your_cart");
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
		public static By imageEmptyCartIcon = By.id("icon_Cart");
		public static By labelYourCartIsEmpty = By.id("lbl_your_cart_is_empty");
		public static By labelEmptyCartInfo = By.id("lbl_user_specific_message");
		public static By buttonLogIn = By.id("btn_login");
		public static By buttonCreateAnAccount = By.id("btn_create_an_account");
	}
}
