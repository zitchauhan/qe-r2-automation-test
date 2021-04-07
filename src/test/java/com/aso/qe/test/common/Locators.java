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
		public static By continueAsGuestButton = By.id("guest_label_test_id");
	}
	
	public static class HomePage{
		public static By buttonGoToPDP = By.xpath("//*[contains(@label,\"Adidas Men's Designed2Move Polo Shirt\")]");
	}
	
	public static class OnBoardingScreen{
		public static By maybeLaterButton = By.id("btn_maybe_later");
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
		public static By homeDeliveryRadioButton = By.id("rd_home_delivery");
		public static By buttonChangeStore = By.id("btn_change_store");
	}
	
	public static class ShopPage{
		public static By shopPageTitle = By.id("lbl_shop");
	}
	
	public static class WishlistPage{
		public static By wishlistTitle = By.id("lbl_wish_list");
	}
	
	public static class AccountPage{
		public static By accountTitle = By.id("lbl_account");
		public static By createAnAccountButton = By.xpath("//*[@label='CREATE AN ACCOUNT']");
		public static By addressBookButton = By.id("btn_address_book");
		public static By addressBookHeader = By.xpath("//*[@label='Address Book']");
	}
	
	public static class CartPage{
		public static By qtyIncrementStepper = By.id("plus_btn_id");
		public static By qtyDecrementStepper = By.id("minus_btn_id");
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
		public static By buttonCheckout = By.id("btn_checkout");
	}
	
	public static class SignUp{
		public static By signUpHeader = By.id("lbl_header_title");
		public static By firstName = By.id("input_first_name");
		public static By lastName = By.id("input_last_name");
		public static By email = By.id("input_email");
		public static By password = By.id("input_password");
		public static By promotion = By.id("check_box_promotions_in_email");
		public static By termsAndConditions = By.id("txt_by_continuing_agree");
		public static By createAnAccountButton = By.id("btn_create_an_account");
		public static By labelErrorEmptyFirstName = By.id("lbl_error_first_name");
		public static By labelErrorEmptyLastName = By.id("lbl_error_last_name");
		public static By labelErrorEmptyEmail = By.id("lbl_error_email");
		public static By labelErrorEmptyPassword = By.id("lbl_error_password");
		public static By inputFirstName = By.id("input_first_name");
		public static By inputLastName = By.id("input_last_name");
		public static By inputEmail = By.id("input_email");
		public static By inputPassword = By.id("input_passowrd");
		public static By labelAccountAlreadyRegistered = By.id("");
	}

	public static class CheckoutPage{
		public static By labelTitle = By.id("lbl_checkout");
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
		public static By inputState = By.id("tf_state");
		public static By buttonAddNewAddress = By.id("btn_add_new_address");
		
		//Errors
		public static By lblFirstNameError = By.id("lbl_first_name_error");
		public static By lblLastNameError = By.id("lbl_last_name_error");
		public static By lblAddressError = By.id("lbl_address_error");
		public static By lblAdditionalAddressError = By.id("lbl_additional_address_error");
		public static By lblZipCodeError = By.id("lbl_zip_code_error");
		public static By lblStateError = By.id("lbl_state_error");
		public static By lblCityError = By.id("lbl_city_error");
		public static By lblPhoneNoError = By.id("lbl_phone_no_error");
	}

	public static class FindStore{
		public static By findStoreHeader = By.id("title_find_store");
		public static By searchBox = By.id("search_btn_find_store");
		public static By noStoreAvailableMessage = By.id("lbl_no_store_available");
		public static By cancelButton = By.id("cancel_btn_find_store");
	}
}