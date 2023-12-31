package com.aso.qe.test.common;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators {

	public static class BottomNav {
		public static By home = By.id("lbl_home");
		public static By shop = By.id("lbl_shop");
		// This is rewuest change. wish list button is changing
		public static By wishlist = By.id("lbl_profile");

		// public static By wishlist = By.id("lbl_wishlist");
		public static By cart = By.id("lbl_cart");
		public static By account = By.id("lbl_account");
		public static By Login = By.xpath("//XCUIElementTypeButton[@name=\"LOGIN\"]");
	}

	public static class Onboarding {
		public static By Continueasguest = By.id("btn_continue_as_guest");

	}

	public static class LoginPage {
		public static By HomeLogin = By.xpath("//XCUIElementTypeButton[@name=\"Home\"]");
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

	public static class ChangePassword {
		public static By tapOnProfile = By.id("");
		public static By taponPassword = By.id("");
		public static By emailEditBox = By.id("TODO by dev ");
		public static By changeyourpassword = By.id("TODO by dev ");
		public static By currentpassword = By.id("TODO by dev ");
		public static By newpassword = By.id("TODO by dev ");
		public static By updatebutton = By.id("TODO by dev ");
		public static By backnavigation = By.id("TODO by dev ");
		public static By Changeyourpasswordtitle = By.id("TODO by dev ");
		public static By errormsg = By.id("TODO by dev ");

	}

	public static class SignUpForDeals {

		public static By SingUpButton = By.id("");
		public static By inputZipCode = By.id("TODO by dev ");
		public static By emailTextBox = By.id("TODO by dev ");
		public static By ConformationMsg = By.id("TODO by dev ");
		public static By backNavigation = By.id("TODO by dev ");
		public static By errorMsg = By.id("TODO by dev ");
		public static By getMoreDeals = By.id("TODO by dev ");
		public static By errorMsgOninvalid = By.id("TODO by dev");

	}
	
	public static class ManageNotificaiton{

		public static By orderstatus = By.id("TODO by dev ");
		public static By hotMarket = By.id("TODO by dev ");
		public static By openSetting = By.id("TODO by dev ");
		public static By  notificationPref= By.id("TODO by dev ");
		public static By backNavigation = By.id("TODO by dev ");
		public static By  switchOn= By.id("TODO by dev ");
		public static By switchOff = By.id("TODO by dev ");
		public static By notificationSetting = By.id("TODO by dev ");
		
					
	} 

	public static class HomePage {
		public static By buttonGoToPDP = By.xpath("//*[contains(@label,\"Adidas Men's Designed2Move Polo Shirt\")]");
		public static By buttonPdp = By.xpath("(//XCUIElementTypeOther[@name=\"product_list_item\"])[11]");
		// public static By homeBtn = By.id("lbl_home");
		// public static By golfBall =By.xpath("//*[contains(@label,\"Golf Balls\")]");
		public static By golfBall = By.xpath("(//XCUIElementTypeOther[@name=\"product_list_item\"])[15]");
		//public static By searchBox = By.id("search_bar");this is frquent change b/dev
		public static By searchBox = By.id("btn_Search");
		public static By searchbar = By.id("search_bar");
		
		public static By shopNewLabel = By.xpath("//*[contains(@label,'Shop New')]");
		public static By shopHomePage = By.id("lbl_shop");
		public static By shopNewTitle = By.id("lbl_shopNew_title");
		public static By shopNewImage = By.id("img_shopNew");
		public static By shopNewBar = By.xpath("//*[contains(@label,'Shop New Banner')]");
		public static By shopNewBanner2 = By.xpath("//*[@label='Shop New Banner 2']");
		public static By academyExclusiveText = By.id("lbl_image_banner_title");
		public static By academyExclusiveBanner = By.id("img_image_banner");
		public static By maybeLaterBtn = By.id("btn_maybe_later");
		public static By HomePage_Instore_CurbSideBaner = By.id("lbl_banner_title");
		public static By HomePage_FreeShippingBaner = By.id("lbl_banner_title");
		public static By HomePage_Instore_CurbSideBaner_SeeDeatil = By.id("btn_banner_button");
		public static By HomePage_FreeShippingBanerSeeDeatil = By.id("btn_banner_button");
		public static By homeButton = By.xpath("//*[contains(@label,'Home')]");
		public static By homeBtn = By.xpath("//*[contains(@label,'Home')]");
		public static By heroBanner = By.xpath("//*[contains(@label,'Hero Image')]");

		public static By bannerTitle = By.id("lbl_info_banner_title");
		public static By bannerSubtitle = By.id("lbl_info_banner_sub_title");
		public static By bannerCta = By.id("btn_info_banner_cta");
		public static By instructionBanner = By.id("lbl_page_title");
		public static By labelInfoMessagetitle = By.id("lbl_info_message_title");
		public static By labelInfoMessageSubtitle = By.id("lbl_info_message_sub_title");
		public static By buttonInfoMessageCTA = By.id("btn_info_message_cta");
		public static By searchsuggestionkeyword = By.id("lbl_searchsuggestionkeyword");
		public static By searchsuggestionkeywordbutton = By.id("btn_searchsuggestionkeywordbutton");
		public static By titleOferDetails = By.id("TODO by dev");
		public static By offerDetailsBanner = By.id("TODO by dev");
		

	}

	public static class PLPPage {
		// product title xpast was removed so added product title as image
		//public static By productTitle = By.id("lbl_product_title");
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
		public static By pageTitleShippingPolicy = By
				.xpath("//*[contains(@name,'lbl_page_title') and contains(@label,'Shipping Policy')]");
		public static By pageTitleReturnPolicy = By
				.xpath("//*[contains(@name,'lbl_page_title') and contains(@label,'Return Policy')]");
		public static By securityReassuranceMessage = By.id("lbl_shop_with_confidence_subheading");
		public static By labelFreeSStoreReturn = By.id("lbl_header");
		public static By PLP_Page__Instore_CurbSideBaner = By.id("lbl_banner_title");
		public static By PLP_Page_FreeShippingBaner = By.id("btn_banner_button");
		public static By PLP_Page_Instore_CurbSideBaner_SeeDeatil = By.id("btn_banner_button");
		public static By PLP_Page_FreeShippingBanerSeeDeatil = By.id("btn_banner_button");
		public static By WebViewBannerTitleFreeShipping = By.id("lbl_page_title");
		public static By WebViewBannerTitle_Instore_CurbSideBaner = By.id("lbl_page_title");
		public static By rating = By.xpath("//XCUIElementTypeOther[contains(@label,'4')]");
		public static By toggleOOS = By.id("switch_out_of_stock");
		public static By sortAndFilterOutOfStockTitle = By.id("lbl_out_of_stock");
		public static By sortAndFilterFilterIcon = By.id("icon_filter");
		public static By editSearch = By.id("edit_search");
		// OMNI-20323 15.04.2021
		public static By FilterButton = By.id("filter_button");
		public static By FilterScreenText = By.id("filter_Screen_text");
		public static By FilterApplyButton = By.id("filter_apply_button");
		public static By FilterCancel = By.id("filter_cancel");
		public static By pickupDeliveryFilter = By.id("fitler_delivery_pickup");
		public static By categoryFilter = By.id("filter_Category");
		public static By brandFilter = By.id("filter_brand");
		public static By sizeFilter = By.id("filter_size");
		public static By styleFilter = By.id("fitler_style");
		public static By colorFilter = By.id("filter_color");
		public static By priceFilter = By.id("filter_price");
		public static By ratingFilter = By.id("filter_rating");
		public static By dealsFilter = By.id("filter_deals");
		public static By promoAdImage = By.id("img_promo_ad_0");
		public static By promotionaltooltip = By.id("btn-promotionaltoolti");
		public static By promotionalmessage =By.id("lbl-promotionalmessage");
		
		
	}

	public static class SearchPage {
		// public static By searchBar = By.id("btn_Search");
		public static By searchBar = By.id("search_bar");
		public static By cancelBtn = By.id("btn_cancel");
		public static By scanBarCode = By.id("btn_scan_barcode");
		public static By goBtn = By.id("Go");
		public static By searchErrormsg = By.id("txt_empty_result_body");

		public static By searchCount = By.id("search_count");
		public static By sortOption = By.id("sort_option");
		public static By filterOption = By.id("filter_option");
		public static By nullSearchPage = By.id("null_search_page");

		public static By navigateBack = By.id("btn_Back");
		public static By recentSearchesTitle = By.id("lbl_shop_by_category_title");
		public static By clearAll = By.xpath("//XCUIElementTypeOther[@name='Clear All']");

		// labels for did u mean
		public static By showingresultforlabel = By.id("lbl_show_result_for");
		public static By showingresultforlabelvalue = By.id("lbl_show_result_forvalue");
		public static By searchinsteedof = By.id("lbl_search_instead_for");
		public static By searchinsteedofvalue = By.id("btn_search_instead_forvalue");
		public static By searchsuggestionkeyword = By.id("lbl_searchsuggestionkeyword");

		public static By searchsuggestionkeywordbutton = By.id("btn_searchsuggestionkeywordbutton");
		// public static By navigateBack = By.id("btn_back");
		// public static By recentSearchesTitle=By.id("TODO by dev");;
		// public static By clearAll=By.id("TODO by dev");;
		// public static By recentSearches=By.id("TODO by dev");;

		// public static By searchsuggestionkeywordbutton =
		// By.id("btn_searchsuggestionkeywordbutton");
		public static By recentSearches = By.id("lbl_shop_by_category_title");;

		public static By popularSearchesTitle = By.id("TODO by dev");;
		public static By popularsearchesItem = By.id("TODO by dev");;
		public static By noresultlabel = By.id("txt_empty_result_title");;

	}

	public static class OnBoardingScreen {
		public static By maybeLaterButton = By.id("btn_maybe_later");
	}

	public static class PDPPage {
		public static By GreyColor = By.id("color_list_item_Color_2");
		public static By imageHero = By.id("img_hero");
		public static By labelProductTitle = By.id("lbl_product_title");
		public static By labelProductPrice = By.id("lbl_product_price");
		public static By buttonAddToCart = By.id("btn_add_to_cart");
		public static By buttonViewCart = By.id("btn_cart");
//		public static By qtyIncrementStepper = By.id("btn_quantity_increment");
		public static By qtyIncrementStepper = By.id("plus_btn_id");
//		public static By qtyDecrementStepper = By.id("btn_quantity_decrement");
		public static By qtyDecrementStepper = By.id("minus_btn_id");
//		public static By qtyEditBox = By.id("txt_quantity_box");
		public static By qtyEditBox = By.id("input_field_id");
		public static By lbl_badge_text = By.id("lbl_badge_text");
		public static By colorVariant = By.id("lbl_color_title_Color");
		public static By shoeSizeVariant = By.id("lbl_size_title_Shoe_Size");
		public static By colorValueWhite = By.id("lbl_color_value_White");
		public static By colorValueGrey = By.id("lbl_color_value_Gray_Six");
		public static By firstColor = By.id("color_list_item_0");
		public static By sizeVariant = By.id("lbl_size_title_Size");
		public static By sizeValue = By.id("lbl_size_value");
		public static By sizeValueLarge = By.id("lbl_size_value_Large");
		public static By xSmallSize = By.id("size_list_item_0");
		public static By smallSize = By.id("size_list_item_1");
		public static By mediumSize = By.id("size_list_item_Size_2");
		public static By largeSize = By.id("size_list_item_3");
		public static By xLargeSize = By.id("size_list_item_4");
		public static By btnSizeChart = By.id("btn_size_chart");
		public static By buttonaddtowishlist = By.id("btn_buttonaddtowishlist");
		// public static By sizeChartTitle =By.id("lbl_size_chart");
		public static By sizeChartTitle = By.id("lbl_page_title");
		public static By btnCancelSizeChart = By.id("btn_back");
		// public static By btnCancelSizeChart = By.id("btn_cancel");
		public static By cancelBtn = By.id("cancel_btn_find_store");
		public static By homeDeliveryRadioBtn = By.id("rd_home_delivery");
		public static By pickUpAndDeliveryTitle = By.id("lbl_p_and_d_options");
		public static By homeDeliveryTitle = By.id("lbl_home_delivery");
		public static By subLabel = By.id("lbl_order_by");
		public static By whiteColor = By.id("color_list_item_Color_1");
		public static By shoeSize = By.id("size_list_item_Shoe_Size_2");
		public static By AppStoreGuidelines = By.id("lbl_fire_arm");
		public static By ProductSafetyInformation = By.id("lbl_detail_spec_important_product_and_safety_information");
		public static By ProductSafetyInformationPara1 = By
				.id("lbl_detail_spec_important_product_and_safety_information_value 0");
		public static By ProductSafetyInformationPara2 = By
				.id("lbl_detail_spec_important_product_and_safety_information_value 1");
		public static By ProductSafetyInformationPara3 = By
				.id("lbl_detail_spec_important_product_and_safety_information_value 2");
		public static By ProductSafetyInformationPara4 = By
				.id("lbl_detail_spec_important_product_and_safety_information_value 3");
		// labls of store section
		public static By homeDeliveryRadioButton = By.id("rd_home_delivery");
		public static By buttonChangeStore = By.id("btn_change_store");
		public static By storeAddress = By.id("lbl_store_address");
		public static By storetime = By.id("lbl_store_timing");
		public static By storePhone = By.id("lbl_store_phone");
		public static By freeStorePickUp = By.id("lbl_free_store_pickup");
		public static By freeStorePickUpRadioBtn = By.id("rd_free_store_pickup");
		public static By btnRadioDeliveryOption = By.id("rd_free_store_pickup");
		public static By label = By.id("lbl_free_store_pickup");
		public static By selectStore = By.id("btn_select_store");
		public static By changeStore = By.id("btn_change_store");
		public static By changeStoreLink = By.xpath("/*[contains(@label,'Change Store')]");
		public static By StoreDeliveryHeading = By.id("lbl_StoreDeliveryHeading");
		public static By AvalabilityGeeenlabel = By.id("lbl_AvalabilityGeeenlabel");
		public static By OOSredlabel = By.id("lbl_OOSlabel");
		public static By NotAvailable = By.id("lbl_NotAvailable");
		public static By FreeStorepickupHeading = By.id("lbl_FreeStorepickupHeading");
		public static By FindAvailabilityonotherStoreCTA = By.id("btn_FindAvailabilityonotherStoreCTA");
		public static By Notifymewhenavailablelabel = By.id("lbl_Notifymewhenavailablelabel");
		public static By limitedstocklabel = By.id("lbl_limitedstocklabel");
		public static By getnotifiedBOPIS = By.id("btn_get_notified");
		public static By getnotifiedheading = By.id("lbl_page_title");
		public static By Producttitle = By.id("lbl_product_title");
		public static By Productprice = By.id("lbl_product_price");
		public static By Productimage = By.id("img_product");
		public static By emailtextbox = By.id("input_email");
		public static By Selectedstorename = By.id("lbl_store_selected");
		public static By submitgetnotifiedbutton = By.id("btn_submit_email");
		public static By BOPISdeliverymethode = By.id("lbl_delivery_title");
		public static By PICKUPanddeliveryheading = By.id("lbl_p_and_d_options");
		public static By userisnotifiedmessage = By.id("lbl_register");
		public static By ChangeStorebutton = By.id("btn_change_store");
		public static By SelectStorebutton = By.id("btn_select_store");
		
		
		
		

		// store label section
		public static By OverLayCartSKU = By.id("lbl_product_sku_value");
		public static By OverLayCartPrice = By.id("lbl_product_price");
		public static By OverLayCartQty = By.id("lbl_product_qty_value");
		public static By OverLayCartSize = By.id("lbl_product_attribute_value_Size");
		public static By WebViewBannerPDP = By
				.xpath("//XCUIElementTypeStaticText[@name=\"Glock G27 Gen3 40 S&W Sub-Compact 9-Round Pistol\"]");
		public static By OverLayCartcolour = By.id("lbl_product_attribute_value_Color");

		// OMNI-22048 - Gift card locators -11.04.2021- Nirmal
		public static By GiftCardDesc = By.id("lbl_product_description");
		public static By GiftCardTitle = By.id("lbl_gc_title");
		public static By GiftCardDetails = By.id("lbl_detail_spec_title");
		public static By GiftCardHeroImage = By.id("lbl_gc_heroImage");

		// OMNI-29409 - GC ATC & OOS -12.04.2021-Nirmal

		public static By overLayAddedToCartText = By.id("lbl_added_to_cart");
		public static By overLayShippingInformation = By.id("lbl_shipping_infomation");
		public static By overLayProductImage = By.id("img_product_thumbnail _OverLayCart");
		public static By buttonContinueShopping = By.id("btn_continue_shopping");
		public static By OutofStock = By.id("");

		// OMNI-29377 - GC Cart Component -13.04.2021 -Nirmal
		public static By labelcardAmount = By.id("lbl_card_price");
		public static By listCardAmount = By.id("price_list_item_Card_Amount_0");
		public static By labelDefaultCardAmount = By.id("");
		public static By btncardOptionAsAmount = By.id("");
		public static By btncartOptionOther = By.id("");
		public static By labelInstructionMsg = By.id("lbl_input_title");
		public static By inputEnterAmount = By.id("input_price");
		public static By inputEnterAmountDefaultValue = By.id("");
		public static By labelErrorMessage = By.id("");

		public static By freeStrorePickupRadioButton = By.id("rd_free_store_pickup");

		public static By searchStoreBox = By.id("search_btn_find_store");
		public static By searchBtn = By.id("Search");
		public static By widthSizeD = By.id("size_list_item_Shoe_Width_0");
		public static By widthVariant = By.id("lbl_size_title_Shoe_Width");
		public static By continueShopping = By.xpath("//XCUIElementTypeOther[@name='btn_continue_shopping']");

		public static By freeStorePickUpTitle = By.id("lbl_free_store_pickup");
		public static By deailsSpecTitle = By.id("lbl_detail_spec_title");
		public static By skuDetailTitle = By.xpath("//*[contains(@label,'SKU')]");
		public static By itemTitle = By.xpath("//*[contains(@label,'ITEM')]");
		public static By productDetails = By.id("lbl_detail_spec_description");

		public static By OverLayCartDileveryMethoD = By.id("lbl_shipping_infomation");
		public static By OverLayCartTitle = By.id("lbl_product_title");
		public static By OverLayCartImage = By.id("img_product_thumbnail _OverLayCart");
		public static By OverLayCartview_cart = By.id("btn_view_cart");
		public static By OverLayCartcontinue_shopping = By.id("btn_continue_shopping");
		public static By OverLayCartdded_to_cart = By.id("lbl_added_to_cart");
		public static By alertGiftCardError;
		public static By liveChatBtn=By.xpath("//*[contains(@label,'Open Live Chat')]");
		public static By liveChatUrlTitle;
		public static By bulkGiftCardBtnAlert=By.xpath("//*[contains(@label,'Open Bulk Gift Card')]");
		public static By purchaseBtn = By.id("lbl_purchase_btn");

		// alert modal on pdp
		public static By STDGIFTCARDModal = By.id("popup_StdGiftCard");
		public static By STDGIFTCARDModalGenericContent = By.id("lbl_StdGiftCardgenericlabel");
		public static By OpenSTDGiftcardbutton = By.id("btn_OpenSTDGiftcard");
		public static By CloseAlertmodal = By.id("btn_CloseAlertmodal");
		// bulk GC alert modal
		public static By BulkGIFTCARDModal = By.id("popup_bulkGiftCard");
		public static By bulkGIFTCARDModalGenericContent = By.id("lbl_bulkGiftCardgenericlabel");
		public static By OpenbulkGiftcardbutton = By.id("btn_OpenbulkGiftcard");

		public static By cartBadge = By.id("lbl_cart_badge");
		public static By productTite = By.id("lbl_product_title");
		public static By backBtn = By.id("btn_back");

		public static By labelItemCount  = By.id("lbl_cart");
		public static By CounterBadgeOnCartIcon  = By.id("TODO dev");
		public static By ratingAndReviewBtn=  By.id("TODO dev");

		public static By outOfStockMsg =  By.id("TODO dev");
	

		public static By cardAmountList = By.xpath("//XCUIElementTypeButton[contains(@name,'price_list_item_Card_Amount')]");
		public static By shareIcon=By.id("btn_share");
		public static By doneBtn= By.xpath("//*[contains(@label, 'Done')]");
		public static By amountErrormsg= By.id("ere_input_price");
		public static By cancelAlertBtn= By.xpath("//*[contains(@label, 'Cancel')]");
		



	}

	public static class ShopPage {
		public static By shopPageTitle = By.id("lbl_shop");
		public static By subcat = By.id("lbl_category_list_item");
		public static By shopAll = By.id("btn_shop_all");
		public static By categoryTitle = By.id("lbl_category_title");
		public static By categoriesList = By.id("lbl_category_list_item");
		public static By categoryBackBtn = By.id("btn_back");
		public static By categorytitle = By.id("lbl_category_title");
		public static By shopAllLink = By.id("btn_shop_all");
	}

	public static class WishlistPage {
		public static By wishlistTitle = By.id("lbl_wish_list");
		public static By editBtn = By.id("btn_edit");
		public static By renameWishlistTitle = By.id("text_rename_wishlist");
		public static By updateButton = By.id("update_button");
		public static By deleteWishlistButton = By.id("text_delete_wishlist");
		public static By deleteBtn = By.id("");
		public static By cancelbtn = By.id("");
		public static By textInputWishlist = By.id("textinput_wishlist");
		// public static By wishlist = By.id("lbl_wishlist"); frequent changeby dev
		public static By wishlist = By.xpath("//*[contains(@label, 'Wish List')]");
		public static By wishlistIcon = By.id("btn_add_to_wishlist");
		// public static By addWishlist = By.id("");
		public static By wishlistTextInput = By.id("textinput_wishlist");
		public static By wishlistAddButton = By.id("btn_add_wishlist");
		public static By wishlistTileTitle = By.id("txt_wishlist_name");
		public static By backBtn = By.id("btn_back");

		public static By productTitle = By.id("lbl_product_title");
		public static By productImage = By.id("img_product_image");
		public static By productPrice = By.id("lbl_product_price");
		public static By removeButton = By.id("btn_remove");
		public static By moveToCartButton = By.id("btn_move_to_cart");
		public static By itemCount = By.id("lbl_item_count");
		public static By wishListName = By.xpath("//*[contains(@label,'{0}')]");
		public static By wishListHeader = By.xpath("//*[contains(@label,'{0}')]");
		public static By emptyWishListLabel = By.id("lbl_wishlist_empty");
		public static By confirmationPopup = By.xpath("//*[contains(@label,'Remove')]");
		public static By createdWishlist = By.id("lbl_created_wishlist");
		public static By bannerTitle = By.id("lbl_banner_title");
		public static By bannerSubTitle = By.id("lbl_banner_sub_title");
		public static By bannerCTA = By.id("lbl_banner_cta");
		public static By webViewBanner = By.id("lbl_web_view_banner");
		public static By itemcountinwishlist = By.id("lbl_item_count");
		public static By producttitlewishlist = By.id("lbl_product_title");
		public static By Removefromwishlistbutton = By.id("btn_remove");
		public static By conformationmessage = By.xpath("//*[contains(@label,'Are you sure you want to remove this')]");
		public static By wishlistempty = By.id("lbl_wishlist_empty");

	}

	public static class ShopNewPage {
		public static By shopNewTitle = By.id("lbl_page_title");
		public static By oKBtnLocation = By.xpath("//*[contains(@label,'OK')]");
		public static By allowOnceBtn = By.xpath("//*[contains(@label,'Allow Once')]");
		public static By backBtn = By.id("btn_back");
		public static By defaultAddressCheckbox = By.id("check_box_message");
		public static By addNewAddressBtn = By.xpath("//XCUIElementTypeButton[@name=\"Add New Address\"]");

	}

	public static class AccountPage {
		public static By accountTitle = By.id("lbl_account");
		public static By loginLink = By.id("btn_sign_in");
		public static By findStoreLink = By.xpath("//XCUIElementTypeButton[@name=\"FIND STORE\"]");
		public static By buttonAddressBook = By.xpath("//XCUIElementTypeButton[@name='ADDRESS BOOK']");
		public static By buttonCreateAccount = By.xpath("//XCUIElementTypeButton[@name='CREATE AN ACCOUNT']");
		public static By createAnAccountButton = By.id("btn_create_an_account");
		public static By addressBookButton = By.id("btn_address_book");
		public static By addressBookHeader = By.xpath("//*[@label='Address Book']");
		public static By buttonProfile = By.xpath("//XCUIElementTypeButton[@name=\"PROFILE\"]");
		public static By ordersLabel = By.id("btn_orders");
		public static By orderIdInput = By.id("input_order_number");
		public static By billingZipCode = By.id("input_blling_zip_code");
		public static By buttonCheck = By.id("btn_check");
		public static By buttonLogOut = By.xpath("//XCUIElementTypeButton[@label=\"Log Out\"]");
		public static By creditCardHOlderName = By.id("TODO by dev");
		public static By creditCardNumber = By.id("TODO by dev");
		public static By creditCardExpiry = By.id("TODO by dev");
		public static By creditCardCvvNumber = By.id("TODO by dev");
		public static By creditCardPageTitle = By.id("TODO by dev");
		public static By alertPopUPCreditCard = By.id("TODO by dev");
		public static By billingAddressTitle = By.id("lbl_billing_address");
		public static By greetingMessage = By.id("lbl_greeting_message");
		public static By setAsDefaultCheckBox = By.id("Checkbox_Setasdefault");
		public static By defaultAddressCheckbox = By.id("TODO by dev");
		public static By asoCardInforMationTile = By.id("TODO by dev");
		public static By cardNoEditBox = By.id("TODO by dev");
	}

	public static class CartPage {
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
		public static By pageTitleShippingPolicy = By
				.xpath("//*[contains(@name,'lbl_page_title') and contains(@label,'Shipping Policy')]");
		public static By pageTitleReturnPolicy = By
				.xpath("//*[contains(@name,'lbl_page_title') and contains(@label,'Return Policy')]");
		public static By widthVariant = By.id("lbl_product_attribute_value_Shoe");
		public static By FreeWithPurchageHeading = By.id("lbl_freeWithPurchageHeading");
		public static By ToolTipFreeWithPurchageInfo = By.id("tooltip_toolTipFreeWithPurchageInfo");
		// Free gift promotion locators
		public static By freeItemTitleId = By.id("lbl_free_item_title");
		public static By freeGiftProductTitleId = By.id("lbl_free_Product_title");
		public static By orderItemPriceId = By.id("lbl_free_Product_price");
		public static By orderItemDiscountPriceId = By.id("lbl_free_Product_discount_price");
		public static By freeGiftToolTipIcon = By.id("img_free_Gift_Tool_Tip");
		public static By freeGiftToolTipIconmodal = By.id("lbl_free_Gift_Tool_Tip_modal");
		public static By freeGiftProductImage = By.id("img_free_Product");
		public static By Addtowishlist = By.id("btn_add_to_wishlist");
		public static By wishlisticon = By.id("icon_wishlist");
		public static By loginoncartwishlist = By.id("btn_login");
		public static By existingwishlist = By.id("btn_list_Item");
		public static By sucessmessageitemaddedtowishlist = By.xpath("//*[contains(@label, 'item added to')]");

	}

	public static class AcademyExclusivePage {
		public static By academyExclusiveTitle = By.id("lbl_page_title");

	}

	public static class CheckoutPage {
		public static By productThumbNail = By
				.xpath("(//XCUIElementTypeOther[@name=\"Product Image\"])[2]/XCUIElementTypeOther");
		public static By productTitle = By.id("lbl_product_title");
		public static By productSKU = By.xpath("//*[contains(@name,'S K U')]");
		public static By productPrice = By.id("lbl_product_price");
		public static By buttonCheckout = By.name("CHECKOUT");
		public static By addNewAddress = By.xpath("//XCUIElementTypeButton[@name=\"Add New Address\"]");
		public static By addYourShippingInformation = By
				.xpath("//XCUIElementTypeOther[contains(@name,'Location Icon')]");
		public static By shippingMessage = By.id("lbl_list_zip_code0");
		public static By savedAddress = By.xpath("//XCUIElementTypeStaticText[contains(@name,'lbl_list_address')]");
		public static By saveAddressBtn = By.xpath("//*[contains(@label,'Save address']");
		public static By defaultAddressLabel = By.id("shipping_container");
		public static By editAddressLink = By.xpath("//XCUIElementTypeOther[@name='Edit']");
		public static By labelTitle = By.id("lbl_checkout");
		public static By contactInformation = By.id("lbl_checkout_information_header");
		public static By emailField = By.id("tf_email");
		public static By saveEmailButton = By.id("btn_save_email");
		public static By createAnAccountButton = By.id("btn_create_account");
		public static By signInButton = By.id("btn_sign_in");
		public static By continueAsGuestButton = By.id("btn_guest_checkout");
		public static By emailFieldLabel = By.id("lbl_email_field");
		public static By productQuantity = By.xpath("//XCUIElementTypeOther[contains(@name,'Q t y')]");
		public static By orderProcesssingMessage = By.id("shipping_method_desc_id");
		public static By shippingMethod = By
				.xpath("//XCUIElementTypeStaticText[contains(@name,'shipping_method_title_id')]");
		public static By labelShippingHeader = By.id("lbl_delivery_option_name0");
		public static By labelShippingMethod = By.id("lbl_shipping_method");
		public static By labelShippingMethodDisclaimer = By.id("lbl_service_desciption");
		public static By labelShippingMethods = By
				.xpath("//XCUIElementTypeStaticText[contains(@name,'shipping_method_title_id')]");
		public static By radioButtonShippingMethods = By.xpath(
				"//XCUIElementTypeOther[contains(@value,'checkbox') and contains(@id,'shipping_method_check_box_id')]");
		public static By buttonPlaceOrder = By.id("btn_place_order");
		public static By paypal = By.id("btn_pay_withPaypal");
		public static By paypalEmail = By.xpath("//*[contains(@value,'Email or mobile number')]");
		public static By paypalNext = By.xpath("//*[contains(@label,'Next')]");
		public static By paypalPassword = By.xpath("//*[contains(@label,'Password')]");
		public static By paypalLoginButton = By.xpath("//*[contains(@label,'Log In')]");
		public static By paypalPayNowButton = By.xpath("//*[contains(@label,'Pay Now')]");
		public static By paypalCancelButton = By.xpath("//*[contains(@label,'Cancel')]");
	}

	public static class storePickup {
		public static By findYourStoreMessage = By.xpath("//*[contains(@label, 'Find Your nearest stores')]");
		public static By allowLocationService = By.id("btn_allow_location");
		public static By enterCityOrZipcode = By.id("btn_enter_city");
		public static By maybeLater = By.id("btn_maybe_later");
		public static By allowOnce = By.id("Allow Once");
		public static By allowWhileUsingApp = By.id("Allow While Using App");
		public static By doNotAllow = By.id("Don�t Allow");
		public static By storeNameFindStore = By
				.xpath("//XCUIElementTypeStaticText[contains(@name,'lbl_check_box_find_store')]");
		public static By storeRadioBtn = By.xpath("//XCUIElementTypeOther[contains(@name,'check_box_find_store')]");
		public static By storeDetailsLink = By
				.xpath("//XCUIElementTypeOther[contains(@name,'lbl_details_find_store')]");
		public static By availibilityMessage;
		public static By errorMessage = By.xpath("//XCUIElementTypeStaticText[contains(@name,'no stores')]");
		public static By addressOnDetailsPage = By.id("lbl_store_detail_address");
		public static By phoneNumOnDetailsPage = By.id("lbl_store_detail_phone");
		public static By storeHoursOnDetailsPage = By.id("lbl_store_detail_timing");
		public static By makeMyStoreOnDetailsPage = By.id("lbl_store_detail_make_my_store");
		public static By copyAddressLink = By.xpath("//XCUIElementTypeButton[@name='Copy address']");
		public static By openInGoogleMap = By.xpath("//XCUIElementTypeButton[@name='Open in google Maps']");;
		public static By openInMaps = By.xpath("//XCUIElementTypeButton[@name='Open in Maps']");
		public static By cancelBtn = By.id("cancel_btn_find_store");
		public static By defaultStoreName = By.id("lbl_details_find_store");
		public static By searchstoretextbox = By.id("search_btn_find_store");
		public static By Store1 = By.id("lbl_check_box_find_store1");
		
		
	}

	public static class AddAddressPage {
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

	public static class AddAddress {
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
		public static By errorPopUp = By.xpath("//*[contains(@label,'OK')]");
		// Errors
		public static By lblFirstNameError = By.id("lbl_first_name_error");
		public static By lblLastNameError = By.id("lbl_last_name_error");
		public static By lblAddressError = By.id("lbl_address_error");
		public static By lblAdditionalAddressError = By.id("lbl_additional_address_error");
		public static By lblZipCodeError = By.id("lbl_zip_code_error");
		public static By lblStateError = By.id("lbl_state_error");
		public static By lblCityError = By.id("lbl_city_error");
		public static By lblPhoneNoError = By.id("lbl_phone_no_error");

		public static By buttonUpdateAddress = By.id("btn_add_new_address");
		public static By buttonAlertOK = By.name("OK");

		public static By savedAddresses = By.id("");
	}

	public static class FindStore {
		public static By findStoreHeader = By.id("title_find_store");
		public static By searchBox = By.id("search_btn_find_store");
		public static By noStoreAvailableMessage = By.id("lbl_no_store_available");
		public static By cancelButton = By.id("cancel_btn_find_store");
	}

	public static class Category {
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
		// public static By labelratingsReviews = By.id("lbl_category_list_item");
		public static By labelImage = By.id("RNE__Image");
		public static By labelProductCoLourVariantSwatch = By.id("view_color_swatch_0");
		public static By label_PLPbadge = By.id("lbl_badge_text");
		public static By lbl_cart_msg = By.id("lbl_cart_msg");
		public static By lbl_cart_msg_toolTipIcon = By.id("");
		public static By lbl_cart_msg_toolTipIconMsg = By.id("");
		public static By isPLP_PPU_MSG = By.id("lbl_ppu_msg");
		public static By SpecialPricingMessage = By.id("lbl_special_price_msg");
		public static By PLP_PromotionMessage = By.id("lbl_promotional_msg");
		public static By Clearance_Styles_AvailableDisplayed = By.id("lbl_badge_text");
		public static By PLP_Some_Styles_Available = By.id("");
		public static By CLP_Page__Instore_CurbSideBaner = By.id("lbl_banner_title");
		public static By CLP_Page_FreeShippingBaner = By.id("lbl_banner_title");
		public static By CLP_Page_Instore_CurbSideBaner_SeeDeatil = By.id("btn_banner_button");
		public static By CLP_Page_FreeShippingBanerSeeDeatil = By.id("btn_banner_button");
	}

	public static class SignUp {
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

	public static class AddressBook {
		public static By buttonAddNewAddress = By.name("Add New Address");
		public static By labelSavedAddresses = By.id("lbl_saved_address");
		public static By addressBookButton = By.id("btn_address_book");
		public static By addressBookHeader = By.xpath("//*[@label='Address Book']");
		public static By savedAddresses = By.id("lbl_saved_address");;
	}

	public static class AddressVerification {
		public static By titleAddressVerification = By.id("title_address_verification");
		public static By warningAddressVerification = By
				.xpath("//*[contains(@label,'We were unable to verify your address']");
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

	// Use this for my account welcome page after login
	public static class MyAccountwelcomePage {
		public static By MyAcademy = By.id("lbl_my_academy");
		public static By buttonOrders = By.id("btn_orders");
		public static By buttonProfile = By.id("btn_Myaccount_profile");
		public static By buttonAddressbook = By.id("btn_Myaccount_addressbook");
		// dev are changing this wish list button name
		// public static By buttonWishlist = By.id("lbl_profile");
		public static By buttonWishlist = By.xpath("//*[contains(@label, 'Wish List')]");
		public static By buttonPayment = By.id("btn_Myaccount_Payment");
		public static By buttoncontactus = By.id("btn_contact_us");
		public static By CSMobilenumber = By.xpath("//XCUIElementTypeButton[@name=\"1888-922-2336\"]");
		public static By CallCancelbutton = By.xpath("//XCUIElementTypeButton[@name=\"Cancel\"]");

	}

	// Use this for my account Payment section
	public static class MyAccountPayment {
		public static By buttonback = By.id("btn_payment_back");
		public static By Paymenttitle = By.id("lbl_payment_title");
		public static By SavedCardslabel = By.id("lbl_SavedCard");
		public static By savedCards = By.id("btn_saved_card");
		public static By SavedCardsDefault = By.id("btn_saved_card_default");
		public static By existingasocard = By.id("btn_existingaso_card");
		public static By buttonaddacacemycard = By.id("btn_addaso_card");
		public static By buttonaddcreditcard = By.id("btn_adddredit_card");
		public static By setAsDefaultCheckbox = By.id("chk_set_as_default");
	}

	// Use this for my account add new cc section
	public static class Addnewcreditcard {
		public static By buttonAddNewCreditCard = By.id("button_add_new_credit_card");
		public static By buttonback = By.id("btn_payment_back");
		public static By AddnewcrerditCardlabel = By.id("lbl_addnewcreditcard");
		public static By imgVisa = By.id("img_visa");
		public static By imgDisover = By.id("img_Discover");
		public static By imgAmex = By.id("img_Amex");
		public static By imgMasterCard = By.id("img_MasterCard");
		public static By inputCardHolderName = By.id("input_cardholder_name");
		public static By inputCardNumberField = By.id("input_card_number");
		public static By inputCVV = By.id("input_cvv");
		public static By inputExpiryDate = By.id("input_expiry_date");
		public static By checkboxSaveForFutureAddress = By.id("checkbox_save_future_address");

		public static By labelBillingAddress = By.id("label_billing_address");
		public static By radioSameAsShippingAddress = By.id("radio_same_as_shipping_address");
		public static By radioAddBillingAddress = By.id("radio_add_billing_address");
		public static By buttonSaveCreditCard = By.id("button_save_credit_card");
		public static By listSavedAddress = By.id("list_saved_address");
		public static By listSavedAddressFirst = By.id("list_saved_address_first");

		public static By popupWarning = By.id("popup_warning");
		public static By buttonContinueWarning = By.id("button_continue_warning");
		public static By buttonCancelWarning = By.id("button_cancel_warning");
		public static By msgAlertPopupHeading = By.id("msg_alert_popup_heading");
		public static By msgAlertPopupSubHeading = By.id("msg_alert_popup_subheading");

		public static By errorMsgInvalidCard = By.id("invalid_card_error");
	}


	// Use this for my account Billing address
	public static class MyAccountBillingAddress {
		public static By BilingFirstName = By.id("tf_first_name");
		public static By BilingLastName = By.id("tf_last_name");
		public static By BilingAddressText = By.id("tf_address");
		public static By BilingAptName = By.id("tf_additional_address");
		public static By BilingZipCode = By.id("tf_zip_code");
		public static By BilingCity = By.id("tf_city");
		public static By BilingPhoneNumber = By.id("tf_phone_no");
		public static By SaveCreditcardbutton = By.id("btn_savecreditcard");
		public static By LabelBillingAddress = By.id("lbl_billing_address");

	}

		

				//Use this for my account add new ASO cc section
				public static class Addnewasocreditcard{
					public static By buttonbackN = By.id("btn_payment_back");
					public static By AddnewAsocrerditCardlabelN = By.id("lbl_addnewasocreditcard");
					public static By AsocardtextboxN = By.id("textbox_asocreditcard");
					public static By SetasdefaultcheckboxN = By.id("Checkbox_Setasdefault");
					public static By ErrorModalN = By.id("popup_errormodal");
					public static By AreYousurewanttoleavelabelN = By.id("lbl_SureWantToLeave");
					public static By AreYousurewanttoleaveMsglabelN = By.id("lbl_SureWantToLeaveMsg");
					public static By CancelalertbuttonN = By.id("btn_cancelaleartbutton");
					public static By ContinuealertbuttonN = By.id("btn_continuealeartbutton");
					public static By DeleteCardbuttonN = By.id("btn_deletecardbutton");
					public static By Invalidcvverror = By.id("lbl_Invalidcvverror");
					public static By Invalidccerror = By.id("lbl_Invalidccerror");
					public static By Invalidexpiryerror = By.id("lbl_Invalidexpiryerror");
					public static By buttonback = By.id("btn_payment_back");
					public static By AddnewAsocrerditCardlabel = By.id("lbl_addnewasocreditcard");
					public static By Asocardtextbox = By.id("textbox_asocreditcard");
					public static By Setasdefaultcheckbox = By.id("Checkbox_Setasdefault");
					public static By ErrorModal = By.id("popup_errormodal");
					public static By AreYousurewanttoleavelabel = By.id("lbl_SureWantToLeave");
					public static By AreYousurewanttoleaveMsglabel = By.id("lbl_SureWantToLeaveMsg");
					public static By Cancelalertbutton = By.id("btn_cancelaleartbutton");
					public static By Continuealertbutton = By.id("btn_continuealeartbutton");
					public static By DeleteCardbutton = By.id("btn_deletecardbutton");
					

				}

				
	public static class WelcomeScreen {
		public static By HomeButton = By.xpath("//XCUIElementTypeButton[@name=\"Home\"]");
	}

	public static class OrderSummary {
		public static By orderSummaryHeading = By.id("lbl_order_summary");
		public static By subTotalLabel = By.id("lbl_subtotal_price");
		public static By orderTotalLabel = By.id("lbl_order_total_price");
		public static By shippingLabel = By.id("lbl_shipping_price");
		public static By shippingToLabel = By.id("lbl_shipping_price");
		public static By shippingToZip = By.id("lbl_ShippingToZip");
		public static By storepickup = By.id("lbl_Storepickup");
		public static By changezipcodecta = By.id("cta_Changezipcodecta");
		public static By changestorecta = By.id("cta_Changestorecta");
		public static By eDeliveryLabel = By.id("lbl_eDelivery");
		public static By taxesLabel = By.id("lbl_taxes_price");
		public static By discountsLabel = By.id("lbl_Discounts");
		public static By promocodeLabel = By.id("lbl_Promocode");
		public static By restrictionmessage = By.id("lbl_Restrictionmessage");
		// Value of each label of order summary y

		public static By subTotalPrice = By.id("lbl_subtotal_price");
		public static By orderTotalPrice = By.id("lbl_order_total_price");
		public static By shippingPrice = By.id("lbl_shipping_price");
		public static By eDeliveryPrice = By.id("lbl_eDeliveryValue");
		public static By taxesPrice = By.id("lbl_taxes_price");
		public static By discountsPrice = By.id("lbl_DiscountsValue");
		public static By promocodePrice = By.id("lbl_PromocodeValue");
		public static By storepickupatstorename = By.id("lbl_Storepickupatstorename");
		public static By storepickupPrice = By.id("lbl_StorepickupPrice");

	}

	// created by Nirmal Jain - 06.05.2021 OMNI-28637
	public static class UserProfile {
		public static By switchSubscribeToEmailsFromAcademy = By.id("switch_subscribe_email");
		public static By labelSubscribeToEmailsFromAcademy = By.id("lbl_subscribe_email_title");
		public static By labelSubscribeMessage = By.id("lbl_subscribe_email_subtitle");
		public static By labelPeronalInformation = By.id("perfonal_informaiton_label");
		public static By labelEditName = By.id("edit_name_label");
		public static By labelChangeEmail = By.id("edit_change_email");
		public static By msgChangeEmail = By.id("msg_change_email");
		public static By inputEmail = By.id("input_email");
		public static By inputConfirmEmail = By.id("input_confirmEmail");
		public static By inputFirstName = By.id("input_firstName");
		public static By inputLastName = By.id("input_lastName");
		public static By buttonUpdate = By.id("button_update");
		public static By buttonBack = By.id("button_back");
		public static By buttonName = By.id("profile_name_button");
		public static By buttonEmail = By.id("profile_email_button");
		public static By buttonPassword = By.id("profile_password_button");
		public static By txtCurrentName = By.id("profile_current_name");
		public static By txtCurrentEmail = By.id("profile_current_email");
		public static By msgErrorEmail = By.id("msg_error_email");
		public static By msgErrorFirstName = By.id("msg_error_FirstName");
		public static By msgErrorLastName = By.id("msg_error_LastName");

	}

	public static class OrderDetail {

		public static By buttonOrder = By.id("button_Order");
		public static By listOrder = By.id("list_Order");
		public static By buttonOrderId = By.id("order_id");
		public static By lookupOrder = By.id("TODO by dev");;
		public static By labelOrderDetailPage = By.id("label_order_detail_page");
		public static By buttonCancelOrder = By.id("button_cancel_order");
		public static By buttonChevronCancelOrder = By.id("button_chevron_cancel_order");
		public static By alertMessageOrderScreen = By.id("alert_order_screen");
		public static By alertMessageText = By.id("alert_message_txt");
		public static By buttonYesAlertMessage = By.id("button_Yes_alert");
		public static By labelSucessOrderCancellationMesage = By.id("label_sucess_cancel_message");
		public static By buttonNoAlertMessage = By.id("button_No_alert");
		public static By OrderCancelConfirmationScreen = By.id("cancel_confirmation_screen");
		public static By buttonBackOrderCancel = By.id("back_orderCancel");
		public static By ErrorMesageOrderCancel = By.id("error_msg_order_cancel");
		public static By labelOrderPage = By.id("label_order_page");
		public static By Orderdetailheading = By.xpath("//*[contains(@label,'Order Detail')]");
		public static By Ordernumber = By.id("lbl_order_number");
		public static By orderdate = By.id("lbl_order_date");
		public static By ordertotal = By.id("Orderdetail_label_order_total");
		public static By cancelorderbutton = By.id("Orderdetail_btncancelorder");
		public static By homedelivery = By.id("Orderdetail_label_homedelivery");
		public static By customername = By.id("Orderdetail_label_customername");
		public static By shippingaddress = By.id("Orderdetail_label_shipping_address");
		public static By orderstatus = By.id("Orderdetail_label_shipping_status");
		public static By inprocessing = By.id("Orderdetail_label_shippinginprocessing");
		public static By shippingmethode = By.id("Orderdetail_label_shippingmethode");
		public static By producttitle = By.id("lbl_product_title");
		public static By productqty = By.id("lbl_productqty");
		public static By productprice = By.id("lbl_product_price");
		public static By skunumber = By.id("lbl_product_sku");
		
		public static By msgOrderCancel=By.id("TODO by dev");
		public static By msgConfirmationEmail=By.id("TODO by dev");
		public static By labelcancelOrderDate=By.id("TODO by dev");	

		/* created by Nirmal - OMNI-33184 07/06/2021 */
		public static By buttonTrackDelivery = By.id("button_track_delivery");
		public static By narvarScreen = By.id("narvar_screen");
		public static By inputOrderId = By.id("input_orderId");
		public static By inputZipCode = By.id("input_zipcode");
		public static By buttonCheck = By.id("button_check");
		public static By labelOrderLookupOrder = By.id("label_orderlookup");

		/* created by Nirmal - OMNI-28213 - 5/7/2021 */
		public static By labelFindYourorderwithChevron = By.id("label_can_not_find_order");
		public static By LabelAddStoreReceiptwithChevron = By.id("label_addstore_receipt");

		public static By filterAllOrder = By.id("filter_allOrder");
		public static By filterOnline = By.id("filter_online");
		public static By filterInStore = By.id("filter_insore");

		public static By labelOrderCount = By.id("label_orderCount");
		public static By SortedOrder = By.id("button_sortOrder");
		public static By OrderStatus = By.id("label_orderstatus");
		public static By labelOrderNumber = By.id("label_order_number");
		public static By labelOrderDate = By.id("label_orderDate");
		public static By labelOrderTotal = By.id("label_order_total");
		public static By OrderList = By.id("list_Order");

		public static By labelAddstoreReceiptScreen = By.id("label_add_store_receipt_Screen");
		public static By NoExistingOrderMsg = By.id("no_order_message");

	}
	// Order history page for logged in user where all order will list

	public static class OrderHistoryloggedInuser {
		public static By orderheading = By.id("lbl_ordersheading");
		public static By orderlabel = By.id("lbl_order");
		public static By lookupyourorderbutton = By.id("btn_lookup_your_order");
		public static By addastorereciptbutton = By.id("btn_addastorereciptbutton");
		public static By orderpurchagetype = By.id("lbl_orderpurchagetype");
		public static By orderstatusprocessing = By.id("lbl_orderstatusprocessing");
		public static By orderstatusdelivered = By.id("lbl_orderstatusdelivered");
		public static By ordernumberlabel = By.id("lbl_ordernumberlabel");
		public static By ordernumber = By.id("lbl_ordernumber");
		public static By orderdate = By.id("lbl_orderdate");
		public static By orderdatelabel = By.id("lbl_orderdatelabel");
		public static By ordertotallabel = By.id("lbl_ordertotallabel");
		public static By ordertotal = By.id("lbl_ordertotal");

	}

	public static class OrdersPage {
		public static By orderSummarylabel = By.id("lbl_order_summary");
		public static By paymentDetailsScreenHeader = By.xpath("//*[contains(@label,'Payment Details')]");
		public static By orderTotalbutton = By.id("btn_order_total");
		public static By labelSubtotal = By.id("lbl_subtotal");
		public static By labelStorePickup = By.id("lbl_store_pickup");
		public static By labeledelivery = By.id("lbl_edelivery");
		public static By labelTaxes = By.id("lbl_taxes");
		public static By labelDiscount = By.id("lbl_discount");
		public static By paymentMethodLabel = By.id("lbl_payment_header");
		public static By labelCard = By.id("lbl_last_four_digit_id");
		public static By labelGiftCard = By.id("lbl_gift_card_text");
		public static By labelGiftCardDigits = By.id("lbl_gift_card");
		public static By labelGiftCardAmount = By.id("lbl_gift_card_amount");
		public static By createAccountButton = By.id("btn_create_account");
		public static By continueShopping = By.xpath("//XCUIElementTypeOther[@name='btn_continue_shopping']");
		public static By orderHistoryButton = By.id("TODO:fromDev");

		public static By cancellationMessage = By.id("lbl_cancellation_message");
		public static By confirmationEmail = By.id("labl_confirmation_email");
		public static By cancellationDate = By.id("lbl_cancellation_date");
		public static By productImage = By.id("lbl_product_image");
		public static By productName = By.id("lbl_product_name");
		public static By skuID = By.id("lbl_sku_id");
		public static By quantity = By.id("lbl_quantity");
		public static By price = By.id("lbl_price");
		public static By refundMessage = By.id("lbl_refund_message");
		public static By refundDisclaimer = By.id("lbl_refund_disclaimer");
		public static By subtotal = By.id("lbl_subtotal");
		public static By taxes = By.id("lbl_taxes");
		public static By shippingCharges = By.id("lbl_shipping_charges");
		public static By refundAmount = By.id("lbl_refund_amount");
		public static By refundedTo = By.id("lbl_refunded_to");
		public static By senderInformationLabel = By.id("TODO by dev");
		public static By senderFirstName = By.id("TODO by dev");
		public static By senderLastName = By.id("TODO by dev");
		public static By senderEmailId = By.id("TODO by dev");
		public static By recipientInformationLabel = By.id("TODO by dev");
		public static By recipientFistName = By.id("TODO by dev");
		public static By recipientLastName = By.id("TODO by dev");
		public static By recipientEmailId = By.id("TODO by dev");
		public static By prefilledUserMessage = By.id("TODO by dev");
		public static By eGiftCardDeliveryMessage2hrs = By.id("TODO by dev");
		public static By eGiftCardName = By.id("TODO by dev");
		public static By labelColorAttribute = By.id("TODO by dev");
		public static By eGiftQty = By.id("TODO by dev");
		public static By eGiftCardMoreRecipientMessage = By.id("TODO by dev");
		public static By shippingAddressTile = By.id("lbl_shippingAddressTile");
		public static By homeDeliveryTile = By.id("lbl_homeDeliveryTile");
		public static By storePickUpTile = By.id("lbl_storePickUpTile");
		public static By firstName = By.id("TODO by dev");
		public static By lastName = By.id("TODO by dev");
		public static By shippingAddress = By.id("TODO by dev");
		public static By slaMessage = By.id("TODO by dev");
		public static By packageLabel = By.id("TODO by dev");
		public static By itemsCount = By.id("TODO by dev");
		public static By getNotificationLink = By.id("TODO by dev");
		public static By creditCardimage=By.id("img_creditCard");
		public static By giftCardImage=By.id("img_giftCard");
		public static By paypalImage=By.id("img_paypal");
		public static By applePayImage=By.id("img_applePay");
		public static By giftCardAmount=By.id("text_giftCard_amount");
		public static By giftCardLabel=By.id("lbl_giftCard");
		public static By paypalLabel=By.id("lbl_paypal");
		public static By applePayLabel=By.id("lbl_applePay");
		public static By orderListItem=By.id("TODO by dev");
		public static By orderDetailPageTitle=By.id("TODO by dev");
		public static By orderLabel=By.id("TODO by dev");
		public static By dateOrderPlacedLabel=By.id("TODO by dev");
		public static By orderTotalLabel=By.id("TODO by dev");
		public static By homeDeliveryTitle=By.id("TODO by dev");
		public static By userName=By.id("TODO by dev");
		public static By orderStatus=By.id("TODO by dev");
		public static By deliveryServiceType=By.id("TODO by dev");
		public static By trackPackageLabel=By.id("TODO by dev");
		public static By orderNumberEditbox=By.id("TODO by dev");
		public static By billingZipcodeEditbox=By.id("TODO by dev");
		public static By checkBtn=By.id("TODO by dev");
	}

	public static class SavedAddresses {
		public static By addressesTile = By.xpath("//XCUIElementTypeStaticText[contains(@name,'lbl_list_title')]");
		public static By radioButtonAddress = By.xpath("//XCUIElementTypeOther[contains(@name,'CheckBox')]");
		public static By labelAddressUsername = By
				.xpath("//XCUIElementTypeStaticText[contains(@name,'lbl_list_address')]");
		public static By editAddressLink = By.xpath("//XCUIElementTypeOther[@name='Edit']");
	}
	
	public static class BazzarVoice{
		public static By buttonQuestionAndAnswer=By.id("TODO by dev");
		public static By labelReview=By.id("TODO by dev");
		public static By buttonSort=By.id("TODO by dev");
		public static By labelQuestion=By.id("TODO by dev");
		public static By buttonAskQuestion=By.id("TODO by dev");
		public static By buttonBack=By.id("TODO by dev");
		public static By buttonAnswerThisQuestion=By.id("TODO by dev");
		public static By linkQA=By.id("TODO by dev");
		
		public static By labelAskQuestion=By.id("TODO by dev");
		public static By productImage=By.id("TODO by dev");
		public static By productName=By.id("TODO by dev");
		public static By labelQuestions=By.id("TODO by dev");
		public static By labelNickname=By.id("TODO by dev");
		public static By labelLocation=By.id("TODO by dev");
		public static By labelEmail=By.id("TODO by dev");
		public static By chkBoxTermsCondition=By.id("TODO by dev");
		public static By buttonPostQuestion=By.id("TODO by dev");		
		public static By inputBoxQuestion=By.id("TODO by dev");
		public static By inputBoxNickName=By.id("TODO by dev");
		public static By inputBoxLocation=By.id("TODO by dev");
		public static By inputBoxEmail=By.id("TODO by dev");
		
		public static By posterUsername=By.id("TODO by dev");
		public static By labelQuestionDescription=By.id("TODO by dev");
		public static By answerUsername=By.id("TODO by dev");
		public static By labelAnswerDescription=By.id("TODO by dev");
		public static By buttonYes=By.id("TODO by dev");
		public static By buttonNo=By.id("TODO by dev");
		public static By buttonReport=By.id("TODO by dev");
		public static By inputBoxPostAnswer=By.id("TODO by dev");
		public static By buttonPostAnswer=By.id("TODO by dev");
		public static By labelPostAnswer=By.id("TODO by dev");
		
		
	}

	public static class Phone{
		public static By phoneNotification= By.id("TODO by dev");
	}

	public static class ReviewPage {

		public static By LocationEditBox = By.id("TODO by dev");
		public static By ratingsAndReview= By.id("TODO by dev");
		public static By writeReviewBtn= By.id("TODO by dev");
		public static By ReviewPageTitle=By.id("TODO by dev");
		public static By ratingValue = By.id("TODO by dev");
		public static By reviewTitleEditBox= By.id("TODO by dev");
		public static By reviewDetailsEditBox=By.id("TODO by dev");
		public static By nickNameEditBox=By.id("TODO by dev");
		public static By emailEditBox=By.id("TODO by dev");
		public static By sweepstackDropdown= By.id("TODO by dev");
		public static By dropdownOptionYes= By.id("TODO by dev");
		public static By fitValue= By.id("TODO by dev");
		public static By yesOption= By.id("TODO by dev");
		public static By NoOption= By.id("TODO by dev");
		public static By sweepstackTermCondCheckbox= By.id("TODO by dev");
		public static By termCondCheckbox= By.id("TODO by dev");
		public static By postReviewBtn= By.id("TODO by dev");
		public static By reviewDetailsPageTitle= By.id("TODO by dev");
		public static By sortOption= By.id("TODO by dev");
		public static By reviewerName= By.id("TODO by dev");
		public static By postedTimeText= By.id("TODO by dev");
		public static By starRatingValue= By.id("TODO by dev");
		public static By reviewTitle= By.id("TODO by dev");
		public static By verifiedPurchaserMark= By.id("TODO by dev");
		public static By yesIRecommend= By.id("TODO by dev");
		public static By helpfullquestion= By.id("TODO by dev");
		
		
	}
	

}
