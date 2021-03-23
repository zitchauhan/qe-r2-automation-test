package com.aso.qe.test.common;

import org.openqa.selenium.By;

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
		public static By continueAsGuestButton = By.id("guest_label_test_id");
	}
	
	public static class HomePage{
		public static By buttonGoToPDP = By.xpath("//*[contains(@label,\"Adidas Men's Designed2Move Polo Shirt\")]");
		public static By buttonPdp = By.xpath("(//XCUIElementTypeOther[@name=\"product_list_item\"])[11]");
		public static By homeBtn = By.id("lbl_home");
		//public static By golfBall =By.xpath("//*[contains(@label,\"Golf Balls\")]");
		public static By golfBall = By.xpath("(//XCUIElementTypeOther[@name=\"product_list_item\"])[15]");
		public static By searchBox = By.id("btn_Search");
		
		
	}
	public static class PLPPage{
		public static By productTitle = By.id("lbl_product_title");
		public static By rating= By.xpath("//XCUIElementTypeOther[contains(@label,'4')]");
	}
	public static class SearchPage{
		public static By searchBar = By.id("search_bar");
		public static By cancelBtn = By.id("btn_cancel");
		public static By scanBarCode = By.id("btn_scan_barcode");
		public static By goBtn = By.id("Go");
		public static By searchErrormsg =  By.id("txt_empty_result_body");
	}
	
	public static class PDPPage{
		public static By imageHero = By.id("img_hero");
		public static By labelProductTitle = By.id("lbl_product_title");
		public static By labelProductPrice = By.id("lbl_product_price");
		public static By buttonAddToCart = By.id("btn_add_to_cart");
		public static By buttonViewCart = By.id("btn_view_cart");
//		public static By qtyIncrementStepper = By.id("btn_quantity_increment");
		public static By qtyIncrementStepper = By.id("plus_btn_id");
//		public static By qtyDecrementStepper = By.id("btn_quantity_decrement");
		public static By qtyDecrementStepper = By.id("minus_btn_id");
//		public static By qtyEditBox = By.id("txt_quantity_box");
		public static By qtyEditBox = By.id("input_field_id");
		public static By colorVariant = By.id("lbl_color_title");
		public static By colorValue = By.id("lbl_color_value");
		public static By sizeVariant =By.id("lbl_size_title");
		public static By sizeValue = By.id("lbl_size_value");
		public static By smallSize = By.id("size_list_item_0");
		public static By mediumSize = By.id("size_list_item_1");
		public static By largeSize = By.id("size_list_item_2");
		public static By xLargeSize = By.id("size_list_item_3");
		public static By xxLargeSize= By.id("size_list_item_4");
		public static By btnSizeChart = By.id("btn_size_chart");
		//public static By sizeChartTitle =By.id("lbl_size_chart");
		public static By sizeChartTitle =By.id("lbl_page_title");
		//public static By btnCancelSizeChart = By.id("btn_cancel");
		public static By btnCancelSizeChart = By.id("btn_back");
		public static By homeDeliveryRadioBtn = By.id("rd_home_delivery");	
	}
	
	public static class ShopPage{
		public static By shopPageTitle = By.id("lbl_shop");
		public static By subcat = By.id("lbl_category_list_item");
		public static By shopAll = By.id("btn_shop_all");
	}
	
	public static class WishlistPage{
		public static By wishlistTitle = By.id("lbl_wish_list");
	}
	
	public static class AccountPage{
		public static By accountTitle = By.id("lbl_account");
	}
	
	public static class CartPage{
		public static By labelYourCart = By.id("lbl_your_cart");
		public static By labelItems = By.id("lbl_item_count");
		public static By labelSubtotalHeader = By.id("lbl_subtotal_header");
		public static By labelProductTitle = By.id("lbl_product_title");
		public static By orderSummaryLabel = By.id("lbl_order_summary");
		public static By labelSku = By.id("lbl_sku");
		public static By labelSkuValue = By.id("lbl_sku_value");
		public static By labelProductPrice = By.id("lbl_product_price");
		public static By buttonRemoveFromCart = By.id("btn_remove_from_cart");
		public static By buttonAddToWishList = By.id("btn_add_to_wishlist");
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
		public static By cartSizeVariant = By.id("lbl_product_attribute_value_Size");
		public static By cartColorVariant = By.id("lbl_product_attribute_value_Color");
	}
}
