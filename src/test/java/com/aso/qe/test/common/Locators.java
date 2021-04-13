package com.aso.qe.test.common;

import io.appium.java_client.MobileElement;
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
		public static By HomeLogin = By.xpath("//XCUIElementTypeButton[@name='Home']");
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
		public static By shopHomePage = By.id("lbl_shop");
		public static By shopNewTitle = By.id("lbl_shopNew_title");
		public static By shopNewImage = By.id("img_shopNew");
		public static By shopNewBar = By.xpath("//*[contains(@label,'Shop New Banner')]");
		public static By shopNewBanner2 = By.xpath("//*[@label='Shop New Banner 2']");
		public static By academyExclusiveText = By.id("lbl_image_banner_title");
		public static By academyExclusiveBanner = By.id("img_image_banner");
		public static By maybeLaterBtn = By.id("btn_maybe_later");
		public static By shopNewLabel = By.xpath("//*[contains(@label,'Shop New')]");
		public static By HomePage_Instore_CurbSideBaner = By.id("lbl_banner_title");
		public static By HomePage_FreeShippingBaner = By.id("lbl_banner_title");
		public static By HomePage_Instore_CurbSideBaner_SeeDeatil = By.id("btn_banner_button");
		public static By HomePage_FreeShippingBanerSeeDeatil = By.id("btn_banner_button");
	}
	public static class ShopNewPage{
		public static By shopNewTitle = By.id("lbl_page_title");
		public static By oKBtnLocation = By.xpath("//*[contains(@label,'OK')]");
		public static By allowOnceBtn = By.xpath("//*[contains(@label,'Allow Once')]");
		public static By backBtn = By.id("btn_back");
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
		public static By labelFreeSStoreReturn = By.id("lbl_header");
		public static By PLP_Page__Instore_CurbSideBaner = By.id("lbl_banner_title");
		public static By PLP_Page_FreeShippingBaner = By.id("lbl_banner_title");
		public static By PLP_Page_Instore_CurbSideBaner_SeeDeatil = By.id("btn_banner_button");
		public static By PLP_Page_FreeShippingBanerSeeDeatil = By.id("btn_banner_button");
		public static By WebViewBannerTitleFreeShipping = By.id("lbl_page_title");
		public static By WebViewBannerTitle_Instore_CurbSideBaner = By.id("lbl_page_title");
        public static By rating= By.xpath("//XCUIElementTypeOther[contains(@label,'4')]");
		public static By toggleOOS = By.id("switch_out_of_stock");
		public static By sortAndFilterOutOfStockTitle = By.id("lbl_out_of_stock");
		public static By sortAndFilterFilterIcon = By.id("icon_filter");
	}

	public static class SearchPage{
		public static By searchBar = By.id("search_bar");
		public static By cancelBtn = By.id("btn_cancel");
		public static By scanBarCode = By.id("btn_scan_barcode");
		public static By goBtn = By.id("Go");
		public static By searchErrormsg =  By.id("txt_empty_result_body");
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
		public static By lbl_badge_text = By.id("lbl_badge_text");
		public static By colorVariant = By.id("lbl_color_title");
		public static By colorValue = By.id("lbl_color_value");
		public static By firstColor= By.id("color_list_item_0");
		public static By sizeVariant =By.id("lbl_size_title");
		public static By sizeValue = By.id("lbl_size_value");
		public static By xSmallSize = By.id("size_list_item_0");
		public static By smallSize = By.id("size_list_item_1");
		public static By mediumSize = By.id("size_list_item_2");
		public static By largeSize = By.id("size_list_item_3");
		public static By xLargeSize= By.id("size_list_item_4");
		public static By btnSizeChart = By.id("btn_size_chart");
		//public static By sizeChartTitle =By.id("lbl_size_chart");
		public static By sizeChartTitle =By.id("lbl_page_title");
		//public static By btnCancelSizeChart = By.id("btn_cancel");
		public static By btnCancelSizeChart = By.id("btn_back");
		public static By homeDeliveryRadioBtn = By.id("rd_home_delivery");
		public static By pickUpAndDeliveryTitle = By.id("lbl_p_and_d_options");
		public static By freeStorePickUp = By.id("lbl_free_store_pickup");
		public static By freeStorePickUpRadioBtn = By.id("rd_free_store_pickup");
		public static By homeDeliveryTitle = By.id("lbl_home_delivery");
		public static By btnRadioDeliveryOption = By.id("rd_free_store_pickup");
		public static By label = By.id("lbl_free_store_pickup");
		public static By subLabel =By.id("");
		public static By changeStore = By.id("");
		public static By whiteColor = By.id("color_list_item_1");
		public static By shoeSize = By.id("size_list_item_0");
		public static By changeStoreLink = By.xpath("/*[contains(@label,'Change Store')]");
		public static By AppStoreGuidelines = By.id("lbl_fire_arm");
		public static By ProductSafetyInformation = By.id("lbl_detail_spec_important_product_and_safety_information");
		public static By ProductSafetyInformationPara1 = By.id("");
		public static By ProductSafetyInformationPara2 = By.id("");
		public static By ProductSafetyInformationPara3 = By.id("");
		public static By ProductSafetyInformationPara4 = By.id("");
		public static By homeDeliveryRadioButton = By.id("rd_home_delivery");
		public static By buttonChangeStore = By.id("btn_change_store");		
	    public static By storeAddress = By.id("lbl_store_address");
		public static By storetime = By.id("lbl_time");
		public static By storePhone = By.id("lbl_phone");
		public static By OverLayCartSKU = By.id("lbl_product_sku_value");
		public static By OverLayCartPrice = By.id("lbl_product_price");
		public static By OverLayCartQty = By.id("lbl_product_qty_value");
		public static By OverLayCartSize = By.id("lbl_product_attribute_value_Size");
		public static By WebViewBannerPDP = By.id("");		
		public static By OverLayCartcolour = By.id("lbl_product_attribute_value_Color");
		public static By freeStrorePickupRadioButton = By.id("rd_free_store_pickup");
		public static By continueShopping = By.xpath("//XCUIElementTypeOther[@name='btn_continue_shopping']");
	}

	public static class ShopPage{
		public static By shopPageTitle = By.id("lbl_shop");
		public static By subcat = By.id("lbl_category_list_item");
		public static By shopAll = By.id("btn_shop_all");
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
		public static By buttonAddressBook = By.xpath("//XCUIElementTypeButton[@name='ADDRESS BOOK']");
		public static By buttonCreateAccount = By.xpath("//XCUIElementTypeButton[@name='CREATE AN ACCOUNT']");
		public static By createAnAccountButton = By.id("btn_create_an_account");
		public static By addressBookButton = By.id("btn_address_book");
		public static By addressBookHeader = By.xpath("//*[@label='Address Book']");
	}
	
	public static class CartPage{
		public static By qtyIncrementStepper = By.id("plus_btn_id");
		public static By qtyDecrementStepper = By.id("minus_btn_id");
		public static By labelYourCart = By.id("lbl_your_cart");
		public static By labelItems = By.id("lbl_item_count");
		public static By labelSubtotalHeader = By.id("lbl_subtotal_header");
		public static By labelProductTitle = By.name("lbl_product_title");
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
		public static By userIcon = By.id("icon_user");
		public static By guestCheckoutLabel = By.id("lbl_guest_checkout");
		public static By signInLabel = By.id("lbl_sign_in_guest_checkout");
		public static By signInButton = By.id("btn_sign_in");
		public static By labelShopWithConfidence = By.id("lbl_shop_with_confidence_label");
		public static By labelWeAccept = By.id("lbl_we_accept");
		public static By securityReassuranceMessage = By.id("lbl_security_reassurance_message");
		public static By paymentModeImages = By.id("img_payment_modes");
		public static By buttonCheckout = By.id("btn_checkout");
		public static By productDisclaimerLabel = By.id("disclaimer_messages_label"); // Can be _0 for one product
		public static By productDisclaimerReadMore = By.xpath("//*[contains(@label, 'Read More')]");
		public static By textChangeZipCode = By.id("lbl_change_zipcode_input");
		public static By buttonSubmit = By.xpath("//*[contains(@label, 'SUBMIT')]");
		public static By labelEstimatedShipping = By.xpath("//*[contains(@label, 'Estimated Shipping to')]");
		public static By lableChangeZipCodeModal = By.id("lbl_change_zipcode_text");
		public static By buttonShippingPolicy = By.id("btn_shipping_policy");
		public static By buttonReturnPolicy = By.id("btn_return_policy");
		public static By labelFreeStoreReturn = By.id("lbl_header");
		public static By pageTitleShippingPolicy = By.xpath("//*[contains(@name,'lbl_page_title') and contains(@label,'Shipping Policy')]");
		public static By pageTitleReturnPolicy = By.xpath("//*[contains(@name,'lbl_page_title') and contains(@label,'Return Policy')]");
	}
	public static class AcademyExclusivePage{
		public static By academyExclusiveTitle = By.id("lbl_page_title");

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
		public static By labelTitle = By.id("lbl_checkout");
		public static By contactInformation = By.id("lbl_checkout_information_header");
		public static By emailField = By.id("tf_email");
		public static By saveEmailButton = By.id("btn_save_email");
		public static By createAnAccountButton = By.id("btn_create_account");
		public static By signInButton = By.id("btn_sign_in");
		public static By continueAsGuestButton = By.id("btn_guest_checkout");
		public static By emailFieldLabel = By.id("lbl_email_field");
		public static By productQuantity=By.xpath("//XCUIElementTypeOther[contains(@name,'Q t y')]");
		public static By orderProcesssingMessage=By.id("shipping_method_desc_id");
		public static By shippingMethod=By.xpath("//XCUIElementTypeStaticText[contains(@name,'shipping_method_title_id')]");
		public static By labelShippingHeader = By.id("shipping_header");
		public static By labelShippingMethod = By.id("lbl_shipping_method");
		public static By labelShippingMethodDisclaimer = By.id("lbl_service_desciption");
		public static By labelShippingMethods = By.xpath("//XCUIElementTypeStaticText[contains(@name,'shipping_method_title_id')]");
		public static By radioButtonShippingMethods = By.xpath("//XCUIElementTypeOther[contains(@value,'checkbox') and contains(@id,'shipping_method_check_box_id')]");
	}

	public static class storePickup{
		public static By findYourStoreMessage = By.xpath("//*[contains(@label, 'Find Your nearest stores')]");
		public static By allowLocationService = By.id("btn_allow_location");
		public static By enterCityOrZipcode = By.id("btn_enter_city");
		public static By maybeLater = By.id("btn_maybe_later");
		public static By allowOnce = By.id("Allow Once");
		public static By allowWhileUsingApp = By.id("Allow While Using App");
		public static By doNotAllow = By.id("Don�t Allow");
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

	public static class AddAddressPage{
		public static By addAddressHeader = By.id("header_add_address");
		public static By textFirstName = By.id("tf_first_name");
		public static By textLastName = By.id("tf_last_name");
		public static By textAddress = By.id("tf_address");
		public static By textAdditionalAddress = By.id("tf_additional_address");
		public static By textZipCode = By.id("tf_zip_code");
		public static By textState = By.id("tf_state");
		public static By textCity = By.id("tf_city");
		public static By textPhoneNumber = By.id("tf_phone_no");
		public static By checkboxSetAsDefault = By.id("check_box_message");
		public static By buttonSaveAddress = By.id("btn_add_new_address");
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
		public static By errorPopUp= By.xpath("//*[contains(@label,'OK')]");
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
	public static class Category{
		public static By l1_catgoryElelnt = By.id("lbl_category_list_item");
		public static By l2_catgoryElelnt = By.id("lbl_category_list_item");
		public static By l3_catgoryElelnt = By.id("lbl_category_list_item");
		public static By shopAll_ShopBycategory = By.id("shopAll_ShopBycategory");
		public static By shopAll_ShopByBrand = By.id("shopAll_ShopBycategory");
		public static By shopAll_ShopBycategoryTxt = By.id("lbl_shop_by_category_title");
		public static By shopAll_ShopByBrandTxt = By.id("TxtshopAll_ShopBycategory");
		public static By Pick_Up_in_Store_Banner = By.id("Pick_Up_in_Store_Banner");
		public static By Free_Shipping_with_Sign_in_Banner = By.id("Free_Shipping_with_Sign_in_Banner");
		public static By Hero_Banner = By.id("Hero_Banner");
		public static By Shop_by_Category_Component = By.id("Shop_by_Category_Component");
		public static By Sort_By_Option = By.id("Sort_By_Option");
		public static By Filter_Option = By.id("Filter_Option");
		public static By Product_Grid = By.id("Product_Grid");
		public static By Promo_ad_Card = By.id("Promo_ad_Card");
		public static By ShopByBrandyTxt = By.id("ShopByBrandyTxt");
		public static By clp_catgoryElelnt = By.id("clp_catgoryElelnt");

 // locators for PLP
		public static By labelLProductPrice = By.id("lbl_list_price");
		public static By lbl_clearance_price_range = By.id("lbl_clearance_price_range");
		public static By labelProductTitle = By.id("lbl_product_title");
	//	 public static By labelratingsReviews = By.id("lbl_category_list_item");
		public static By labelImage = By.id("RNE__Image");
		public static By labelProductCoLourVariantSwatch = By.id("labelProductCoLourVariantSwatch");
		public static By label_PLPbadge = By.id("lbl_badge_text");
		public static By lbl_cart_msg = By.id("lbl_cart_msg");
		public static By lbl_cart_msg_toolTipIcon = By.id("");
		public static By lbl_cart_msg_toolTipIconMsg = By.id("");
		public static By isPLP_PPU_MSG = By.id("lbl_ppu_msg");
		public static By SpecialPricingMessage = By.id("lbl_special_price_msg");
		public static By PLP_PromotionMessage = By.id("lbl_promotional_msg");
		public static By Clearance_Styles_AvailableDisplayed = By.id("");
		public static By PLP_Some_Styles_Available = By.id("");
		public static By CLP_Page__Instore_CurbSideBaner = By.id("lbl_banner_title");
		public static By CLP_Page_FreeShippingBaner = By.id("lbl_banner_title");
		public static By CLP_Page_Instore_CurbSideBaner_SeeDeatil = By.id("btn_banner_button");
		public static By CLP_Page_FreeShippingBanerSeeDeatil = By.id("btn_banner_button");
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
	public static class AddressBook{
		public static By buttonAddNewAddress = By.name("Add New Address");
		public static By labelSavedAddresses = By.id("lbl_saved_address");
		public static By addressBookButton = By.id("btn_address_book");
		public static By addressBookHeader = By.xpath("//*[@label='Address Book']");
	}

	public static class AddressVerification {
		public static By titleAddressVerification = By.id("title_address_verification");
		public static By warningAddressVerification = By.xpath("//*[contains(@label,'We were unable to verify your address']");
		public static By labelSuggestedAddress = By.id("address_option_name_id0");
		public static By labelYouEntered = By.id("address_option_name_id1");
		public static By buttonUseSelectedAddress = By.id("btn_use_selected_address");
		public static By labelEditAddress = By.id("lbl_edit");
	}

	public static class CreateAccount {
		public static By buttonCancel = By.id("btn_header_cancel");
		public static By labelCreateAccount = By.id("lbl_header_title");
		public static By textFirstName = By.id("input_first_name");
		public static By textLastName = By.id("input_last_name");
		public static By textEmailAddress = By.id("input_email");
		public static By textPassword = By.id("input_password");
		public static By checkboxPromotion = By.id("check_box_promotions_in_email");
		public static By buttonCreateAccount = By.id("btn_create_an_account");
		public static By passwordMeterHeader = By.id("PASSWORD MUST CONTAIN AT LEAST:");

	}

	public static class WelcomeScreen {
		public static By HomeButton = By.xpath("//XCUIElementTypeButton[@name=\"Home\"]");
	}
}
