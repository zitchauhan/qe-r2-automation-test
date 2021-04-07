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
		public static By emailEditBox = By.id("tf_email");
		public static By passwordEditBox = By.id("tf_password");
		public static By loginButton = By.id("btn_login");
		public static By continueAsGuestButton = By.id("guest_label_test_id");
		public static By passwordShowButton = By.id("btn_show_hide");
		public static By passwordHideButton = By.id("btn_show_hide");
		public static By createAccountButton = By.id("btn_create_account");
		public static By forgotPasswordLink = By.id("btn_forgot");
		public static By screenEmailError = By.id("lbl_email_error");
		public static By screenPasswordError = By.id("lbl_password_error");
		public static By cancelButton = By.id("btn_header_cancel");
	}
	
	public static class HomePage{
		public static By buttonGoToPDP = By.xpath("//*[contains(@label,\"Adidas Men's Designed2Move Polo Shirt\")]");
		public static By buttonPdp = By.xpath("(//XCUIElementTypeOther[@name=\"product_list_item\"])[11]");
		public static By homeBtn = By.id("lbl_home");
		//public static By golfBall =By.xpath("//*[contains(@label,\"Golf Balls\")]");
		public static By golfBall = By.xpath("(//XCUIElementTypeOther[@name=\"product_list_item\"])[15]");
		public static By searchBox = By.id("btn_Search");
		public static By shopNewLabel = By.xpath("//*[contains(@label,'Shop New')]");
		
		
	}

	public static class PLPPage{
		public static By productTitle = By.id("lbl_product_title");
		public static By PLPHeader = By.id("lbl_product_listing_header_title");
		public static By shopByCategoryLabel = By.id("lbl_shop_by_category_title");
		public static By subCategoryButton = By.id("btn_category");
		public static By textChangeZipCode = By.id("lbl_change_zipcode_input");
		public static By buttonSubmit = By.xpath("//*[contains(@label, 'SUBMIT')]");
		public static By labelEstimatedShipping = By.xpath("//*[contains(@label, 'Estimated Shipping to')]");
		public static By lableChangeZipCodeModal = By.id("lbl_change_zipcode_text");
		public static By cartSizeVariant = By.id("lbl_product_attribute_value_Size");
		public static By buttonShippingPolicy = By.id("btn_shipping_policy");
		public static By buttonReturnPolicy = By.id("btn_return_policy");
		public static By labelFreeStoreReturn = By.id("lbl_header");
		public static By pageTitleShippingPolicy = By.xpath("//*[contains(@name,'lbl_page_title') and contains(@label,'Shipping Policy')]");
		public static By pageTitleReturnPolicy = By.xpath("//*[contains(@name,'lbl_page_title') and contains(@label,'Return Policy')]");
		public static By securityReassuranceMessage = By.id("lbl_shop_with_confidence_subheading");
	
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
		public static By changeStoreLink = By.xpath("/*[contains(@label,'Change Store')]");

	}

	public static class ShopPage{
		public static By shopPageTitle = By.id("lbl_shop");
		public static By categoryTitle = By.id("lbl_category_title");
		public static By categoriesList = By.id("lbl_category_list_item");
		public static By categoryBackBtn = By.id("btn_back");
		public static By categorytitle = By.id("lbl_category_title");
		public static By shopAllLink = By.id("btn_shop_all");
	}
	
	public static class WishlistPage{
		public static By wishlistTitle = By.id("lbl_wish_list");
	}
	
	public static class AccountPage{
		public static By accountTitle = By.id("lbl_account");
		public static By loginLink = By.xpath("//XCUIElementTypeButton[@name=\"LOGIN\"]");
		public static By findStoreLink = By.xpath("//XCUIElementTypeButton[@name=\"FIND STORE\"]");
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
		public static By userIcon = By.id("icon_user");
		public static By guestCheckoutLabel = By.id("lbl_guest_checkout");
		public static By signInLabel = By.id("lbl_sign_in_guest_checkout");
		public static By signInButton = By.id("btn_sign_in");
		public static By labelShopWithConfidence = By.id("lbl_shop_with_confidence_label");
		public static By labelWeAccept = By.id("lbl_we_accept");
		public static By securityReassuranceMessage = By.id("lbl_security_reassurance_message");
		public static By paymentModeImages = By.id("img_payment_modes");
		
		public static By productDisclaimerLabel = By.id("disclaimer_messages_label"); // Can be _0 for one product
		public static By productDisclaimerReadMore = By.xpath("//*[contains(@label, 'Read More')]");
		
		public static By textChangeZipCode = By.id("lbl_change_zipcode_input");
		public static By buttonSubmit = By.xpath("//*[contains(@label, 'SUBMIT')]");
		public static By labelEstimatedShipping = By.xpath("//*[contains(@label, 'Estimated Shipping to')]");
		public static By lableChangeZipCodeModal = By.id("lbl_change_zipcode_text");
		public static By cartSizeVariant = By.id("lbl_product_attribute_value_Size");
		public static By buttonShippingPolicy = By.id("btn_shipping_policy");
		public static By buttonReturnPolicy = By.id("btn_return_policy");
		public static By labelFreeSStoreReturn = By.id("lbl_header");
		public static By pageTitleShippingPolicy = By.xpath("//*[contains(@name,'lbl_page_title') and contains(@label,'Shipping Policy')]");
		public static By pageTitleReturnPolicy = By.xpath("//*[contains(@name,'lbl_page_title') and contains(@label,'Return Policy')]");
		
	}
	
	
	
	public static class CheckoutPage{
		public static By productThumbNail = By.xpath("(//XCUIElementTypeOther[@name=\"Product Image\"])[2]/XCUIElementTypeOther");
		public static By productTitle = By.id("lbl_product_title");
		public static By productSKU= By.xpath("//*[contains(@name,'S K U')]");
		public static By productPrice = By.id("lbl_product_price");
		public static By buttonCheckout = By.name("CHECKOUT");
		public static By addNewAddress =By.xpath("//XCUIElementTypeButton[@name=\"Add New Address\"]");
		public static By addYourShippingInformation =By.xpath("//XCUIElementTypeOther[contains(@name,'Location Icon')]");
		public static By shippingMessage = By.id("lbl_list_zip_code0");
		public static By savedAddress = By.xpath("//XCUIElementTypeStaticText[contains(@name,'lbl_list_address')]");
		public static By saveAddressBtn= By.xpath("//*[contains(@label,'Save address']");
		public static By defaultAddressLabel = By.id("lbl_list_default0");
		public static By editAddressLink=By.xpath("//XCUIElementTypeOther[@name='Edit']");
	}
	
	public static class AddAddress{

		 public static By addAddressHeader = By.id("header_add_address");
		 public static By inputFirstName = By.id("tf_first_name");
		 public static By inputLastName = By.id("tf_last_name");
		 public static By inputAddress = By.id("tf_address");
		 public static By inputAptNumber = By.id("tf_additional_address");
		 public static By inputZipCode = By.id("tf_zip_code");
		 public static By inputCity = By.id("tf_city");
		 public static By inputPhone = By.id("tf_phone_no");

		}
	public static class storePickup{
		public static By findYourStoreMessage = By.xpath("//*[contains(@label, 'Find Your nearest stores')]");
		public static By allowLocationService = By.id("btn_allow_location");
		public static By enterCityOrZipcode = By.id("btn_enter_city");
		public static By maybeLater = By.id("btn_maybe_later");
		public static By allowOnce = By.id("Allow Once");
		public static By allowWhileUsingApp = By.id("Allow While Using App");
		public static By doNotAllow = By.id("Don’t Allow");
		public static By storeNameFindStore = By.xpath("//XCUIElementTypeStaticText[contains(@name,'lbl_check_box_find_store')]");
		public static By storeRadioBtn = By.xpath("//XCUIElementTypeOther[contains(@name,'check_box_find_store')]");
		public static By storeDetailsLink = By.xpath("//XCUIElementTypeOther[contains(@name,'lbl_details_find_store')]");
		public static By availibilityMessage;
		public static By errorMessage = By.xpath("//XCUIElementTypeStaticText[contains(@name,'no stores')]");
		public static By addressOnDetailsPage=By.id("lbl_store_detail_address");
		public static By phoneNumOnDetailsPage=By.id("lbl_store_detail_phone");
		public static By storeHoursOnDetailsPage=By.id("lbl_store_detail_timing");
		public static By makeMyStoreOnDetailsPage=By.id("lbl_store_detail_make_my_store");
		public static By copyAddressLink=By.xpath("//XCUIElementTypeButton[@name='Copy address']");
		public static By openInGoogleMap=By.xpath("//XCUIElementTypeButton[@name='Open in google Maps']");;
		public static By openInMaps=By.xpath("//XCUIElementTypeButton[@name='Open in Maps']");
		public static By cancelBtn=By.id("cancel_btn_find_store");
		public static By defaultStoreName=By.id("lbl_details_find_store");
	}
}
