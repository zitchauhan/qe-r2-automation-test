package com.aso.qe.test.pageobject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.CommonGenericUtils;
import com.aso.qe.framework.common.Constants;

public class R2_CheckOut_PO extends CommonActionHelper
{
		private static final Logger logger = Logger.getLogger(R2_CheckOut_PO.class);
		CommonGenericUtils commonUtils = new CommonGenericUtils();

	/**************** START LOCAL OBJETCS AND DECLARATIONS***********************/
	R2_MyAccount_PO myAccountPo= PageFactory.initElements(driver, R2_MyAccount_PO.class);	
	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);
	public String nullvalue = "";
	/*************** END LOCAL OBJETCS AND DECLARATIONS ************************/

	/***************************** START XPAHTS**********************************/
	// start KER-3392 CR-RK
	@FindBy(xpath = "//*[@data-auid='checkout_unauth_description_signin_link']")
	public WebElement txtSignInDescription;

	@FindBy(xpath = "//*[contains(text(),'Sign in')]")//KER-6941 Updated Sep4 CR-RK 
	public WebElement lnkSignIn_CheckOut;

	@FindBy(xpath = "//*[@data-auid='email-signup-main-modal-close']")
	public WebElement iconClose;
	
	@FindBy(xpath = "//*[@id='logonId']")
	public WebElement inputEmailCheckOut;//27Aug
	
	@FindBy(xpath = "//*[@id='logonPassword']")
	public WebElement inputPasswordCheckOut;//27Aug 
	
	@FindBy(xpath = "//*[contains(text(),'Forgot')]")// CR-DPK sept-21
	public WebElement btnForgotYourPasswordCheckOut; 
	
	
	// End KER-3392 CR-RK
	
	// Start KER-2927 CR-SK
//	@FindBy(xpath = "//div[contains(text(), 'Estimated Taxes')]/following-sibling::div[1]")
//	public WebElement txtEstimatedTax;

//	@FindBy(xpath = "//div[contains(text(), 'Total')]/following-sibling::div[1]")
//	public WebElement txtTotal;
	// End KER-2927 CR-SK

	// start KER-6575 CR-MS
	@FindBy(xpath = "//*[@data-auid='checkout_header_miniCart']//a")
	public WebElement btnMiniCart;

	@FindBy(xpath = "//*[@data-auid='checkout_header_logo']")
	public WebElement logoHeader;
	// End KER-6575 CR-RK

	// Start KER-6821 CR-DPK
	@FindBy(xpath = "//*[@name='firstName']")
	public WebElement inputCheckoutFirstName;

	@FindBy(xpath = "//*[@name='lastName']")
	public WebElement inputCheckoutLasttName;

	@FindBy(xpath = "//*[@name='phoneNumber']")
	public WebElement inputCheckoutPhoneNumber;

	@FindBy(xpath = "//*[@name='address']")
	public WebElement inputCheckoutAddress;

	@FindBy(xpath = "//*[@name='zipCode']")
	public WebElement inputCheckoutZipCode;
	

	@FindBy(xpath = "//*[@name='city']")
	public WebElement inputCheckoutCity;
	
	
    @FindBy(xpath = "//*[@id='shippingAddressRequired']//div[1]//section[1]")
    public WebElement shippingerrormessage;

	@FindBy(xpath = "//*[@data-auid='btncheckout_goto_shipping_method_btn']")
	public WebElement btnGoToShippingMethod;

//	@FindBy(xpath = "//*[@data-auid='checkout_payment_add_gift_card_icon']")
//	public WebElement plusIconGiftCard;
//
//	@FindBy(xpath = "//*[@data-auid='checkout_payment_hide_gift_card_icon']")
//	public WebElement minusIconGiftCard;
	
	@FindBy(xpath = "//*[@data-auid='checkout_payment_add_another_gift_card_icon']")
	public WebElement plusAnotherIconGiftCard;//27Aug danush

//	@FindBy(xpath = "//*[text()='Gift Card Number']")
//	public WebElement txtGiftcardNumber;
//
//	@FindBy(xpath = "//*[@name='cardId']")
//	public WebElement inputGiftcardNumber;

//	@FindBy(xpath = "//*[text()='Pin']")
//	public WebElement txtPin;
//
//	@FindBy(xpath = "//*[@name='cardPin']")
//	public WebElement inputPinNumber;
//
//	@FindBy(xpath = "//*[@data-auid='btncheckout_payment_apply_gift_card_btn']")
//	public WebElement btnCheckoutApply;
//
//	@FindBy(xpath = "//*[text()='Invalid GiftCard Number']")
//	public WebElement txtInvalidGiftcard;
//
//	@FindBy(xpath = "//*[text()='Invalid GiftCard Pin']")
//	public WebElement txtInvalidPin;
	// End KER-6821 CR-DPK

	// Start KER-3152 CR-DPK
	@FindBy(xpath = "//*[@data-auid='checkout_edit_shipping_address']")
	public WebElement btnEditShippingAddress;
	// End KER-3152 CR-DPK

	// Start KER-6824 CR-DPK
	@FindBy(xpath = "//*[text()='GIFT CARDS']/.. | //*[@data-auid='checkout_order_summary_section']/div[2]/div[4]") //modified 25/9/18 Anuj
	public WebElement txtGiftCardOrderSummaryPage;
	// End KER-6824 CR-DPK

	// Start KER-2934 CR-DPK
	@FindBy(xpath = "//*[@name='zipCode']/../span")
	public WebElement txtZipcodeerrormsg;

	@FindBy(xpath = "//input[@type='text']")
	public List<WebElement> inputShippingAddressfield;
	
	@FindBy(xpath = "//*[contains(text(),'unable to verify your address')]") //CR-DPK 14-sept
	public WebElement errorMsgShippingAddress_txt;
		@FindBy(xpath = "//*[contains(@data-auid,'checkout_select_suggested_address')]/div/div | //*[text()='Suggested Address']/..") //CR-DPK 14-sept
	public WebElement selectSuggestedAddress;
	
	@FindBy(xpath = "//*[@data-auid='btncheckout_use_selected_address_btn'] | //*[@data-auid='btnsuggest_btn']")//CR-DPK 14-sept
	public WebElement btnSelectedAddress;
	
	@FindBy(xpath = "//*[contains(@data-auid,'checkout_select_suggested_address')]/div/div/div//div") 
	public List<WebElement> suggestedAddressName;  //SID 5-December
	
	@FindBy(xpath = "//*[text()='BILLING INFORMATION']/following-sibling::div/div/div") 
	public List<WebElement> billingAddressCheck;  //SID 5-December
	
	@FindBy(xpath = "//*[@data-auid='checkout_modify_shipping_address_link']")//CR-DPK 19-sept
	public WebElement lnkModifyAddress;
	
	@FindBy(xpath = "//*[@data-auid='checkout_save_shipping_address']")//CR-SK 22-sept
	public WebElement Checkout_ShippingAddress_SaveShipping_chekbox;
	
	
	// End KER-2934 CR-DPK

	// start KER-2926 CR-MS
	@FindBy(xpath = "//*[text()='Remove from Cart'] | //*[@data-auid='crt_btnRmvFromCart_710320043']")
	public WebElement AS_btnRemoveFromCart;
	
	// CR-AKK 25Aug
//	@FindBy(xpath = "//div[text()='Subtotal']/..")
//	public WebElement txtSubTotal;
	
//	@FindBy(xpath = "//div[text()='Estimated Shipping']/..")
//	public WebElement txtEsitmatedShipping;
//	

	@FindBy(xpath = "//div[text()='Estimated Taxes']/..")
	public WebElement txtExtimatedTax;
	
//	@FindBy(xpath ="//div[text()='Total Discount']/..")
//	public WebElement txtTotalDiscount;
	
	@FindBy(xpath ="//*[@data-auid='checkout_order_summary_shipping_items']")
	public WebElement DetailOrderSummary_txt;
	
//	@FindBy(xpath ="//*[@data-auid='facetdrawerundefined']//button//div[2]")
//	public WebElement txtItems;
	
	@FindBy(xpath ="//*[text()='Quantity']/../div[2]")
	public WebElement txtQuantity;
	
	//CR-AKK 25Aug
	
	// End KER-2926 CR-MS

	// Start KER-6575 CR-SK
	@FindBy(xpath = "//*[@data-auid='checkout_header_logo_target_link']")
	public WebElement R2_imgAcademyLogo;
	
	@FindBy(xpath = "//*[@data-auid='checkout_header_goto_cart_link']")
	public WebElement R2_iconMiniCartCheckout;//28Aug danush
	
	@FindBy(xpath = "//*[@class='mini-cart-count']")
	public WebElement R2_miniCartCountCheckout;//28Aug danush
	// End KER-6575 CR-DPK

	// Start KER-2940 CR-AKK
//	@FindBy(xpath = "(//*[@data-auid='checkout_order_summary_edit_cart_link'])[2]")
//	public WebElement btnEditCart;

	@FindBy(xpath = "(//*[@data-auid='btnc_btnCheckout'])[1]")
	public WebElement btnChekOut;
	// End KER-2940 CR-AKK

	@FindBy(xpath = "//div[contains(text(), 'has been applied')] | //div[contains(text(), 'Ending In')]") //MJR 8/5/19
	public WebElement txtGiftCardAppliedSuccessMessage;
	
	@FindBy(xpath = "(//div[contains(text(), 'has been applied')])[2]")
	public WebElement txtGiftCardAppliedSuccessMessageSecond;

	// Start KER-3163 CR-AKK
	@FindBy(xpath = "//input[@name='zipCode']/../span")
	public WebElement msgZipCode;
	// End KER-3163 CR-AKK

	// Start KER-3167 CR-AKK
	@FindBy(xpath = "//*[text()='Promocode']/../div[2]")
	public WebElement discountAmt;

	@FindBy(xpath = "//*[text()='Promocode']/..")
	public WebElement promotxt;

	@FindBy(xpath = "//button[@data-auid='crt_btnRmPromo_0']")
	public WebElement removeCpnBtn;

	@FindBy(xpath = "//*[@data-auid='crt_btnRmPromo_0']/../../div[1]")
	public WebElement promoAddedTxt;

	@FindBy(xpath = "//*[@data-auid='miniCart']/div")
	public WebElement clickMiniCart;
	// End KER-3167 CR-AKK

	@FindBy(xpath = "//*[@data-auid='checkout_payment_remove_gift_card_icon']")
	public WebElement btnRemoveGiftCard;

	// Start KER-6821 CR-AKK
	@FindBy(xpath = "//a[@data-auid='checkout_payment_add_gift_card_icon']")
	public WebElement lnkGiftCard;

	@FindBy(xpath = "//input[@data-auid='checkout_payment_gift_card_number_field']")
	public WebElement inputGiftCard;

	@FindBy(xpath = "//input[@data-auid='checkout_payment_gift_card_pin_field']")
	public WebElement inputPin;
	// End KER-6821 CR-AKK
	
	// Start KER-3127 CR-RK 
//	@FindBy(xpath="//input[@id='paypal']/..")
//	public WebElement rdPaypal;
	// End KER-3127 CR-RK
	
	
	////Starts Checkout Page Verification CR - SK
	@FindBy(xpath="//*[@data-auid='checkout_shipping_address_add_more_details_link']")
	public WebElement checkout_ShippingAddress_AddCompanyName_lnk;
	
	@FindBy(xpath="//*[@name='companyName']")
	public WebElement checkout_ShippingAddress_AddCompanyName_txt;
	
	@FindBy(xpath="//*[@name ='state']/button")
	public WebElement checkout_ShippingAddress_State_btn;
//	
	@FindBy(xpath = "//*[@data-auid='checkout_page']//div/div/div/div/h1 | //*[text()='CHECKOUT']") //Updated by VSN on 07-12-19
	public WebElement checkout_CheckoutHeader_txt;//CR_HP 29-May_19

	
	@FindBy(xpath = "//*[contains(text(), 'Forgot your password')]")
	public WebElement checkout_SignIn_ForgotYourPassword_lnk;
	
	@FindBy(xpath = "//*[@data-auid='btnemail-signin-button']")
	public WebElement checkout_SignIn_SignIn_btn;
	
	@FindBy(xpath = "//*[text()='SHIPPING INFORMATION']")
	public WebElement checkout_ShippingInformation_Header_txt;
	
	@FindBy(xpath = "//*[contains(text(),'SHIPPING ADDRESS')]/../div[2]/..") //CR-AG 04-10
	public WebElement checkout_ShippingAddress_txt;
	
	@FindBy(xpath = "//*[@data-auid='checkout_unauth_description_signin_link']//a")
	public WebElement checkout_SignIn_lnk;
	
	@FindBy(xpath = "//h6[text()='SHIPPING ADDRESS']")
	public WebElement checkout_ShippingAddress_ShippingAddressHeader_txt;
		
	@FindBy(xpath = "//*[text()='SHIPPING METHOD']")
	public WebElement checkout_ShippingMethod_ShippingMethodHeader_txt;
	
	@FindBy(xpath = "//*[@data-auid='checkout_edit_shipping_method']")
	public WebElement checkout_ShippingMethod_Edit_lnk;
	
	@FindBy(xpath = "//*[@data-auid='shipping_method_shipment_item_1_container']|//*[@data-auid='undefined_dropdownList']") //Updated by VSN on 07-12-19
	public WebElement checkout_ShippingMethod_List_dd;
	
	@FindBy(xpath = "//*[@data-auid='checkout_payment'] | //*[@data-auid='undefined_dropdownList']") //Updated by VSN on 07-12-19
	public WebElement checkout_PaymentMethod_List_dd;
	
	@FindBy(xpath = "//*[@data-auid='checkout_shipping_address'] | //*[@data-auid='undefined_dropdownList']") //Updated by VSN on 07-12-19
	public WebElement checkout_ShippingAddress_List_dd;
	
	@FindBy(xpath = "//*[@data-auid='checkout_payment'] | //*[@data-auid='undefined_dropdownList']") //Updated by VSN on 07-12-19
	public WebElement checkout_GiftCard_List_dd;
	
	
	@FindBy(xpath = "//*[@data-auid='shipping_method_shipment_item_1_container'] | //*[contains(text(), 'Shipment')]")//updated by MJR on 16/7/19
	public WebElement checkout_ShippingMethod_Shipment_txt;
	
	@FindBy(xpath = "//*[@data-auid='shipping_method_shipment_item_1_container'] | //*[contains(text(), 'Shipment')]/following-sibling::p")//updated by MJR on 16/7/19
	public WebElement checkout_ShippingMethod_Items_txt;
	
	@FindBy(xpath = "//*[contains(@data-auid,'shipping_method_shipment_item_image')]")
	public WebElement checkout_ShippingMethod_ItemImage_img;
	
	@FindBy(xpath = "//*[@data-auid='shipping_method_shipment_item_1_container']//button")
	public WebElement checkout_ShippingMethod_ShippingMethodType_btn;
	
	@FindBy(xpath = "//*[@data-auid='btncheckout_goto_payment button-1'] | //*[@data-auid='btncheckout_ship_to_store_submit_button']")
	public WebElement checkout_ShippingMethod_GoToPayment_btn;
	
	@FindBy(xpath = "//*[@data-auid='checkout_shipping_method_shipment_itemSG']")
	public WebElement checkout_ShippingMethod_ShippingDetails;
	
	@FindBy(xpath = "//*[@data-auid='checkout_payment_options_radio_button_PayPal']")
	public WebElement checkout_PaymentMethod_PayPal_Disabled_rb;
	
	
	//****Start PayPal****//
    @FindBy(xpath = "(//*[contains(@class,'paypal-checkout')]/a)[1] | //*[@id='cancelLink'] | //*[@class='cancelUrl']/a")
    public WebElement PaypalClose_icon;
    @FindBy(xpath = "//*[text()='Shipping discount']")
    public WebElement PaypalShippigDiscount_txt;
    @FindBy(xpath ="//*[@id='loginSection']/*/*[2]/*")
    public WebElement PaypalScreenLogin_Btn;
    @FindBy(xpath ="//*[@id='email']")
    public WebElement PaypalEmail_Input;
    @FindBy(xpath ="//*[@id='btnNext']")
    public WebElement PaypalNext_Btn;
    @FindBy(xpath ="//*[@id='password']")
    public WebElement PaypalPassWord_Input;
    @FindBy(xpath ="//*[@id='btnLogin']")
    public WebElement PaypalLogin_Btn;
    @FindBy(xpath ="//*[@id='payment-submit-btn']") //Updated by Sachin on 06-15-20
    public WebElement PayPalContinue_Btn;
    @FindBy(xpath ="//*[text()='Tax']//following::span[2]") 
    public WebElement PayPaltaxprice;
    @FindBy(xpath ="//*[text()='Shipping']//following::span[2]") //Updated by VSN on 07-11-19
    public WebElement PayPalshippingprice;
    
    
    //****End PayPal****//

		
////Ends Checkout Page Verification CR - SK
	
	//Shipping information
	
	//*****Start Modify Pickup Location*********//
	   //Start KER-4271 AKK
	   @FindBy(xpath="//a[@data-auid='checkout_edit_in_store_pickup']")
	   public WebElement EditStorPickUp_Btn;
	   @FindBy(xpath="//*[@data-auid='ul_dropdownList']//*[contains(text(),'Me+Alternate')]")
	   public WebElement mePlusAlternatePickUp_Drpdwn;  //SID Modified 29-Jan
	   
	   @FindBy(xpath=" (//button[@type='button'])[1]/div/div[1]")
	   public WebElement clickOnDropDown;  //SID Modified 29-Jan
	  
	   
	   @FindBy(xpath="//input[@data-auid=\"checkout_in_store_pickup_input_Alternate's First Name\"]")
	   public WebElement PickupAltrFirstname_input;
	   
	   @FindBy(xpath="//input[@data-auid=\"checkout_in_store_pickup_input_Alternate's Last Name\"]")
	   public WebElement PickupAltrLatstname_input;
	   
	   @FindBy(xpath="//input[@data-auid=\"checkout_in_store_pickup_input_Alternate's Email Address\"] | //*[@type='email']")
	   public WebElement PickupAltrEmail_input;
	   
	   @FindBy(xpath="//input[@data-auid=\"checkout_in_store_pickup_input_Alternate's Phone Number\"]")
	   public WebElement PickupAltrPhone_input;
	   
	   @FindBy(xpath="//button[@data-auid='btncheckout_goto_shipping_payment_btn']|//button[@data-auid='btncheckout_ship_to_store_submit_button']|//button[@data-auid='btncheckout_goto_payment button-1']")
	   public WebElement ShippingConfirm_btn;
	   
	   @FindBy(xpath="//span[text()='Required']")
	   public WebElement errorMsgRequired;
	   
	   
	   @FindBy(xpath="//*[text()='PICKUP LOCATION']")
	   public WebElement PickupLocation_Lbl;
	   
	   @FindBy(xpath="//*[text()='PICKUP LOCATION']/../div")
	   public WebElement StoreNameandAddress_Txt;
	  
	   /** Older x-path to click on chenge link on CHECKOUT PAGE*/
	   @FindBy(xpath="//*[text()='Change Location']")
	   public WebElement ChangeLocation_Lnk;  //Rishi
	   
	  
	   @FindBy(xpath="//*[@data-auid='cart_radio_button_div']//*[text()='Find a Store']")
	   public WebElement findAStoreCart;  //SID 8-Jan
	   
	   @FindBy(xpath="//*[text()='Change Location']/parent::*/*[1]")//MJR-10/10/19
	   public WebElement selectedBOPISStore;  //SID 21-Jan
	   
	   @FindBy(xpath="//*[@data-auid='checkout_edit_in_store_pickup']")//MJR-10/10/19
	   public WebElement clickEditlink;  //SID 21-Jan
	 
	   @FindBy(xpath="(//*[@data-auid='find-a-store-modal']//*[@data-auid='facetdrawerundefined'])[1]/button/span/div/div[1]")
	   public WebElement selectedBOPISStoreNameFAS;  //SID 21-Jan
	   
	   
	   @FindBy(xpath="((//*[@data-auid='find-a-store-modal']//*[@data-auid='facetdrawerundefined'])[1]/button/span/div/div[2]//span)[1]")
	   public WebElement productsAvailabelOnSelectedStore;  //SID 21-Jan
	   
	   @FindBy(xpath=" (//*[@data-auid='find-a-store-modal']//*[@data-auid='facetdrawerundefined'])[1]/div/*/*[2]/*/*/*")
	   public WebElement productsNotAvailabelOnSelectedStore;  //SID 21-Jan
	   
	   @FindBy(xpath=" //*[@data-auid='checkout_payment_add_gift_card_icon']")
	   public WebElement expandGiftCardOptionOnCheckOutPage;  //SID 23-Jan
	   
	   @FindBy(xpath="//div[@class='paypal-button paypal-button-context-iframe paypal-button-label-checkout paypal-button-size-responsive paypal-button-layout-horizontal'] | //div[contains(@id,'zoid-paypal-button')]") //Uves RegressionP1 28-Aug
	   public WebElement paypalButton;  //SID 23-Jan
	   
	   @FindBy(xpath="//*[@data-auid='checkout_order_summary_section']//*[text()='Gift Card']")
	   public WebElement giftCardApplyOrderSummary;  //SID 23-Jan
	 
	   @FindBy(xpath="//*[@data-auid='checkout_payment']//*[contains(text(),'ending in')]")
	   public WebElement cardLast4Digit;  //SID 24-Jan
	   
	   @FindBy(xpath="//*[@data-auid='li_listOption_1']/a")
	   public WebElement selectAnotherCard;  //SID 24-Jan
	 
	   @FindBy(xpath="//*[contains(text(),'PICKUP PERSON')]/following-sibling::*/*")
	   public List<WebElement> alternatePersonDetails;  //SID 26-Jan
	   
	   
	   @FindBy(xpath="//*[@data-auid='checkout_page']//h2[text()='IN-STORE PICKUP']")
	   public WebElement inStorePickUpCheckOut;  //SID 26-Jan
	   
	   @FindBy(xpath="//*[@data-auid='checkout_order_summary_section']/*[3]/*[2]")
	   public WebElement totalAmountCheckout;  //SID 26-Jan
	   
	   @FindBy(xpath="//*[@data-auid='checkout_order_summary_section']/*[2]/*[3]/*[2]")
	   public WebElement taxAmountCheckout;  //SID 26-Jan
	 
	 
	 
	   @FindBy(xpath="//*[text()='PICKUP PERSON']/following-sibling::*")
	   public WebElement pickupCurrentUser;  //SID 26-Jan
	 
	   
	   @FindBy(xpath = "//*[@class='academyicon icon-minus']")
		public WebElement collapse;  //SID 21-Jan
	   
	   @FindBy(xpath="//*[contains(text(),'Items for Pickup')]/..")
	   public WebElement ItemsForPickup_Itemcount_Txt;
	   
	   @FindBy(xpath="//*[contains(text(),'Items for Pickup')]/../..//img")
	   public WebElement ItemsForPickup_thumbnail_Txt;
	   
	   @FindBy(xpath="//*[contains(text(),'See In-Store Pickup Instructions')]")
	   public WebElement SeeInStorePickupInstructions_Dd;
	   
	   
	   @FindBy(xpath="(//*[text()='Me+Alternate Person Pick Up'])[2]")
	   public WebElement SeeInStorePickupInstructions_Select_Dd; 
	
	   @FindBy(xpath="//*[text()='Please enter a valid 10 digit phone number']")
	   public WebElement AlternatePhoneNumberErrorMsg_Txt;
	  
	   @FindBy(xpath="//*[contains(text(),'See In-Store Pickup Instructions')]/parent::*/following-sibling::*/ol")
	   public WebElement SeeInStorePickupInstructions_Msg;   //SID Modified 29-Jan
	   
	   @FindBy(xpath="//*[@for='in-store-pickup-check']")
	   public WebElement Pickup_Term_Checkbox;
	   //*****Start Modify Pickup Location*********//
//
	   
	
//*************************CR-RKA********************************************
		//Sign in Check out (Start)
	   @FindBy(xpath="//*[text()='Email Address']/following::*[3]")public WebElement WelcomeBackEmailAddress_Input;
		@FindBy(xpath="//*[text()='Password']/following::*[2]")public WebElement WelcomeBackPassword_Input;
		@FindBy(xpath="//*[@data-auid='btnemail-signin-button']")public WebElement WelcomeBackSignIN_Btn;
	   
		//Sign in Check out (End)
	   //Order Summary(Start)
		
		
		@FindBy(xpath="//*[@data-auid='checkout_order_summary_section']//*[contains(text(),'Order Summary')]")public WebElement OrderSummary_Txt;
		//@FindBy(xpath = "//*[text()='Subtotal']/.. | //*[@data-auid='subtotal']")public WebElement txtSubTotal;//subtotal_txt
		@FindBy(xpath = "//*[@data-auid='checkout_order_summary_section']/*[3]/*[2]")public WebElement txtSubTotal;//subtotal_txt
		@FindBy(xpath="//*[text()='Subtotal']/../*[2] | //*[@data-auid='subtotalValue']")public WebElement SubTotalPrice_Txt;//subtotal_price
		
		@FindBy(xpath="//*[@data-auid='checkout_order_summary_section']//*[contains(text(),'Shipping')]")public WebElement Shipping_Txt;
		@FindBy(xpath="//*[@data-auid='checkout_order_summary_section']//*[contains(text(),'Shipping')]/following-sibling::*[1]")public WebElement ShippingPrice_Txt;
		@FindBy(xpath = "//*[text()='Estimated Shipping']/..")public WebElement txtEsitmatedShipping;//estimatedshippint_txt
		@FindBy(xpath="//*[text()='Estimated Shipping']/../*[2]")public WebElement EstimatedShippingPrice_txt;//estimatedshipping_price
		
		@FindBy(xpath="//*[contains(text(),'Day shipping')]")public WebElement shippingPriceInShippingMethod_txt; //CR-DPK sept-25
		
		
		@FindBy(xpath="//*[contains(text(),'Taxes')]")public WebElement Taxes_Txt;//taxprice_txt
		@FindBy(xpath="//*[contains(text(),'Taxes')]/following-sibling::*[1]")public WebElement TaxesPrice_Txt;//taxprice
		@FindBy(xpath="//*[contains(text(),'Estimated Taxes')]")public WebElement EstimatedTax_Txt;
		@FindBy(xpath = "//*[@data-auid='checkout_order_summary_section']//*[contains(text(),'Taxes')]/following-sibling::*[1]")public WebElement txtEstimatedTax;//estimatedPrice_Txt

		
		
		@FindBy(xpath ="//*[text()='Total Discount'] | //div[text()='Discount']")public WebElement txtTotalDiscount;
		@FindBy(xpath="//*[text()='Total Discount']/following-sibling::*[1]")public WebElement TotalDiscountPrice_Txt;
		
		@FindBy(xpath = "//*[text()= 'Total']/following-sibling::div[1]")public WebElement txtTotal;//Total_price
		@FindBy(xpath="//*[@data-auid='checkout_order_summary_section']//*[text()='Total']")public WebElement Total_txt;
		
		@FindBy(xpath = "//*[@data-auid='checkout_order_summary_section']//*[contains(text(),'Gift Card')] | //*[contains(text(),'GIFT CARDS')]")public WebElement giftCards_txt; //CR-DPK 25-sept
		@FindBy(xpath="//*[@data-auid='checkout_order_summary_section']//*[contains(text(),'Gift Card')]/following-sibling::* | //*[contains(text(),'GIFT CARDS')]/following-sibling::*")public WebElement giftCardsPrice_txt; //CR-DPK 25-sept
		
		
		
		      //*****ITems under Order Summary (Start)
		
		@FindBy(xpath="//*[@data-auid='facetdrawerundefined']//*[contains(text(),'Items')]")public WebElement txtItems;//Item_Txt
		
		@FindBy(xpath="//*[@data-auid='checkout_order_summary_shipping_items']/preceding-sibling::*[1]")public WebElement ShippingItemAvailable_Txt;
		@FindBy(xpath="//*[@data-auid='checkout_order_summary_shipping_items']/*[1]")public WebElement ImageShippingItemAvailable ;
		@FindBy(xpath="//*[@data-auid='checkout_order_summary_shipping_items']/*[2]/*[1]")public WebElement NameShippingItemAvailable_Txt;
		
		@FindBy(xpath="//*[@data-auid='checkout_order_summary_shipping_items']//*[contains(text(),'Color')]")public WebElement Color_Txt;
		@FindBy(xpath="//*[@data-auid='checkout_order_summary_shipping_items']//*[contains(text(),'Color')]/following-sibling::*[1]")public WebElement ColorInput_Txt;
	    
		@FindBy(xpath="//*[@data-auid='checkout_order_summary_shipping_items']//*[contains(text(),'Size')]")public WebElement Size_Txt;
		@FindBy(xpath="//*[@data-auid='checkout_order_summary_shipping_items']//*[contains(text(),'Size')]/following-sibling::*[1]")public WebElement SizeInput_Txt;
		
		@FindBy(xpath="//*[@data-auid='checkout_order_summary_shipping_items']//*[contains(text(),'Quantity')]")public WebElement Quantity_Txt;
		@FindBy(xpath="//*[@data-auid='checkout_order_summary_shipping_items']//*[contains(text(),'Quantity')]/following-sibling::*[1]")public WebElement QuantityInput_Txt;
		
		@FindBy(xpath="//*[@data-auid='checkout_order_summary_shipping_items']//*[contains(text(),'$')]")public WebElement  PriceShippingItemAvailable_Txt;
		@FindBy(xpath = "(//*[@data-auid='checkout_order_summary_edit_cart_link'])[2]")public WebElement btnEditCart;//EditMyCart_Link
		@FindBy(xpath = "(//*[@data-auid='checkout_order_summary_edit_cart_link'])[1]")
		public WebElement btnEditCart_m;
		
		@FindBy(xpath="//*[@data-auid='facetdrawerundefined']/button")
		public WebElement ExpandIcon_Link;
		
		@FindBy(xpath="//*[@data-auid='btnbutton-1']")
		public WebElement OrderConfirmation_GuestUser_PasswordSubmitBtn; 
		    
		       //**********ITems under Order Summary (End)
		//Order Summary(End)
		
		//*********************************************************************************************************************************************
		 //Payment(Start)
		 
		//******************Payment Method(Start)
		@FindBy(xpath="//*[@data-auid='checkout_payment']/preceding::*[1] | //*[@data-auid='checkout_edit_payment']/preceding::*[1]")public WebElement PaymentHeader_Txt;
		@FindBy(xpath="//*[@data-auid='checkout_payment']//*[contains(text(),'PAYMENT METHOD')] | //*[contains(text(),'PAYMENT')]")public WebElement PaymentMethodHeader_Txt; //CR-GK 9-Oct
		@FindBy(xpath="//div[@class='mb-1']")public WebElement Bopisbillingaddres;
		@FindBy(xpath="//*[text()='Academy Credit Card']")public WebElement Academy_CreditCard_radioBtn;
		@FindBy(xpath="//*[text()='Credit Card']")public WebElement CreditCard_radioBtn;
		@FindBy(xpath="(//*[text()='PayPal'])[1]")public WebElement PayPal_radioBtn; //Updated by VSN on 07-22-19 for smoke test fix //updated by MJR on 15/7/19


		@FindBy(xpath="//*[text()='Credit Card Number']/following::*[1] | //*[@id='card']")public WebElement CreditCardNumber_Input;
		@FindBy(xpath="//*[@id='card']")public WebElement CreditCardDetails_Input;
		//@FindBy(xpath="//*[@id='name']") public WebElement CardholderName_Input;
		@FindBy(xpath="//input[@id='name']") public WebElement CardholderName_Input; //KG
		@FindBy(xpath="//*[text()='Exp Date']/following::*[1] | //*[@id='exp']")public WebElement ExpirationDate_Input;//CR-Rk Sep28
		@FindBy(xpath="//*[@id='exp']")public WebElement ExpDate_Input;//CR-Rk Sep28
		@FindBy(xpath="//*[text()='CVV']/following::*[3] | //*[@id='cvv']")public WebElement Cvv_Input;
		@FindBy(xpath="//*[@id='cvv'] | //*[@id='cvvField']")public WebElement PassCvv_Input;
		@FindBy(xpath="//*[@data-auid='tooltipcheckout_payment_creditCard_cvv_tooltip']")public WebElement CvvToolTip;
		@FindBy(xpath="//*[text()='Unrecognized card number']")public WebElement UnrecognizedCardNumber_Txt; 
		@FindBy(xpath="//*[text()='Please enter an expiration date']")public WebElement PastExpirationDate_Txt;//CR-RK Oct11 KER-3139
		@FindBy(xpath="//*[text()='Please enter a valid security code']")public WebElement PleaseEnteRaValidSecurityCode_Txt; 
		@FindBy(xpath="//*[text()='Choose Card']/..//button | //*[@data-auid='payment_type_with_card']")public WebElement chooseCreditcard_Dd; //modified SK 22 Sep //MJR-10/10/19
		@FindBy(xpath="//*[@data-auid='checkout_shipping_address']/..//button")public WebElement chooseShippingAddress_Dd; //CR-SK 22 Sep //updated by MJR on 15/7/19
		@FindBy(xpath="//*[@name='Dropdown']")public WebElement chooseShippingAddress_Dd_Mob; //CR-GK 13Oct
        @FindBy(xpath="//*[@data-auid='undefined_listOption_1']")public WebElement AddNewCreditCard_Txt;
        //@FindBy(xpath="//*[@name='creditcardField']/../span[2]/img")public WebElement Checkout_CreditCardPay_ImgLogo;
        @FindBy(xpath="//*[@name='creditcardField']/../span[2]/img | //img[@class='loadcardInfo'] | //span[@class='creditCardImage']/img")public WebElement Checkout_CreditCardPay_ImgLogo;
        @FindBy(xpath="//*[contains(text(),'Choose Card')]/following::*[2]")public WebElement Checkout_CreditCard_DropDown; 
        
        @FindBy(xpath="//*[@data-auid='btncheckout_goto_order_review_from_paypal_modal']")public WebElement OkButtonReturnFromPaypal;

        //*****************Payment Method (END)
		
		//****************Gift Card(Start)
		
		@FindBy(xpath = "//*[@data-auid='checkout_payment_add_gift_card_icon'] | //*[@data-auid='checkout_payment_add_another_gift_card_icon']")public WebElement plusIconGiftCard;	//Plus_GiftCard
		@FindBy(xpath = "//*[@data-auid='checkout_payment_hide_gift_card_icon']")public WebElement minusIconGiftCard;//Hide_GiftCard
		@FindBy(xpath = "//*[text()='Gift Card Number']")public WebElement txtGiftcardNumber;//GiftCardNumber_Txt
		@FindBy(xpath = "//*[@name='cardId'] | //*[@data-auid='checkout_payment_gift_card_number_field']")	public WebElement inputGiftcardNumber;//GiftCardNumber_Input	
		@FindBy(xpath="(//*[@data-auid='tooltipcheckout_payment_gift_card_tooltip'])[1]")public WebElement toolTip_giftCard;//GiftCardNumber_Tooltip
		@FindBy(xpath = "//*[text()='Invalid GiftCard Number'] | //*[contains(text(),'Invalid Gift Card Number')]")public WebElement txtInvalidGiftcard;//InvalidGiftCardNumber_Txt
		@FindBy(xpath = "//*[text()='Pin'] | //*[text()='PIN']")public WebElement txtPin;//Pin_Txt//Modified CR-SK 3 Oct
		@FindBy(xpath = "//*[@name='cardPin'] | //*[@data-auid='checkout_payment_gift_card_pin_field']")public WebElement inputPinNumber;//Pin_Input
		@FindBy(xpath="(//*[@data-auid='tooltipcheckout_payment_gift_card_tooltip'])[2]")public WebElement toolTip_pin;
		@FindBy(xpath = "//*[text()='Invalid GiftCard Pin']")public WebElement txtInvalidPin;//InvalidGiftCardPin_Txt
		@FindBy(xpath = "//*[@data-auid='btncheckout_payment_apply_gift_card_btn'] | //*[contains(text(),'APPLY')]")public WebElement btnCheckoutApply; //Apply_Btn
		@FindBy(xpath="//*[@data-auid='checkout_payment_add_another_gift_card_icon']")public WebElement AddAnotherGiftCard_Txt;
		@FindBy(xpath = "//button[@class='css-zim4bb']")public WebElement checkOutGiftCardDropDown; 
		@FindBy(xpath="//*[contains(text(),'Add a New Gift Card')]")public WebElement AddAnewGiftCard_Txt;
		@FindBy(xpath="//*[contains(text(),'APPLY')]")public WebElement apply_btn;
		
		//****************Gift Card(End)
		
		//*************** Billing Information(Start)
	   @FindBy(xpath="//*[text()='BILLING INFORMATION']")public WebElement BillingInformation_Txt;
	   @FindBy(xpath="//*[text()='Same As Shipping Address']/following::*[3]")public WebElement SameAsShippingAddress_Txt;
	   @FindBy(xpath="//*[text()='Same As Shipping Address']/preceding::*[1]")public WebElement SameAsShippingAddress_checkBox;
	   @FindBy(xpath="//*[@id='ship-to-store-check']")public WebElement selectShipToStore; //SID 5-December
	   
	   
	   @FindBy(xpath="//*[@data-auid='checkout_payment']//*[contains(text(),'First Name')]/following::*[2]")public WebElement FirstName_Input;
	   @FindBy(xpath="//*[@data-auid='checkout_payment']//*[contains(text(),'Last Name')]/following::*[2]")public WebElement LastName_Input;
	   @FindBy(xpath="//*[@data-auid='checkout_payment']//*[contains(text(),'Phone Number')]/following::*[2] | //*[contains(@id,'billingPhone')]")public WebElement PhoneNumber_Input;
	   
	   @FindBy(xpath=" //*[contains(text(),'Send SMS text updates about my order')]/preceding::*[1]")public WebElement SendSMSTextUpdatesAboutMyOrder_checkbox;
	   @FindBy(xpath="//*[@name='billingAddress1']")public WebElement Adderss_Input;
	   
	   //CR-GK 11-Oct
	   @FindBy(xpath="//*[contains(text(),'Add Company Name, Apt. Number, etc. (Optional)')] | //a[@id='optionalAddressField']")public WebElement AddCompanyNameAptNumberEtcOptional_Txt;
	   @FindBy(xpath="//*[contains(text(),'Add Company Name, Apt. Number, etc. (Optional)')]/following::*[2]")public WebElement AddCompanyNameAptNumberEtcOptional_Input;
	   
	   
	   
	   @FindBy(xpath="//*[@data-auid='checkout_payment']//*[contains(text(),'ZIP Code')]/following::*[2]")public WebElement ZipCode_Input;
	   @FindBy(xpath="//*[@data-auid='checkout_payment']//*[contains(text(),'City')]/following::*[2]")public WebElement city_Input;
	   @FindBy(xpath="//*[text()='State']/following::*[1]")public WebElement State_DD;
	   
	   
	   @FindBy(xpath="//*[contains(text(),'Email Address for Order Confirmation')]/following::*[2]/input")public WebElement EmailAddressforOrderConfirmation_Input;
	   
	   @FindBy(xpath="//*[contains(text(),'Sign up to get Hot Deals')]/preceding::*[1]")public WebElement SignuptogetHotDeals_checkBox;
	   
	   @FindBy(xpath="//*[@data-auid='btncheckout_goto_order_review_submit_button'] | //*[contains(text(),'Review Order')]")public WebElement ReviewOrder_Btn;
	   @FindBy(xpath="//*[@data-auid='checkout_edit_payment']")public WebElement EditPayment_Link;
	   @FindBy(xpath="//*[text()='Change Billing Information']")public WebElement ChangeBillingInformation_Txt;
	   
	   @FindBy(xpath="//input[@id='paypal']/..")public WebElement rdPaypal;// PayPal_radioBtm;
	   @FindBy(xpath="//*[text()=' Checkout']/.. | //*[contains(@class,'paypal-button')]")public WebElement PayPalCheckOut_Btn;
	   //@FindBy(xpath="//span[@class='paypal-button-text']")public WebElement PayPalCheckOut_Btn;
	   
	@FindBy(xpath = "//*[contains(text(),'Save Payment Info for Later')]")public WebElement savePaymentInfoForLater_checkBox;
	 
	@FindBy(xpath = "//*[text()='Order Number']/../p[3]")public WebElement orderConfirmationPage_OrderNumber;
	 
	@FindBy(xpath = "//*[text()='Order Number']")public WebElement orderConfirmationPage_OrderNumber_txt; 
	@FindBy(xpath = "//*[text()='BILLING INFORMATION']/following-sibling::div/div[1]/div[4]")public WebElement orderConfirmationPage_PaymentDrawer_BillingEmail; 
	 
	@FindBy(xpath = "//*[contains(text(), 'See In-Store Pickup Instructions')]/../..//input[@type='checkbox']")
	public WebElement termsAndConditions_checkBox;
	//*[contains(text(), 'See In-Store Pickup Instructions')]/../..//input[@type='checkbox']


	   
	 //*************** Billing Information(End)
	   
	   //Payment(End)
	   
	//Footer Start
	@FindBy(xpath ="//*[@data-auid='checkout_footer_component']")public WebElement checkOut_CheckOutFooter; 
	//Footer End
	
	//CR-GK 10-Oct
	@FindBy(xpath ="//*[contains(text(),'New Credit Card')]")public WebElement checkOut_SelectAddNewCreditCard;
	
	//************************  MOBILE***********************
	   @FindBy(xpath="(//*[@data-auid='checkout_order_summary_edit_cart_link'])[1]/*")public WebElement EditMyCart_Link_M;
	
	  @FindBy(xpath="//*[@data-auid='facetdrawerundefined']")
		public WebElement itemExpand_icon_M;
		@FindBy(xpath ="((//*[@data-auid='checkout_order_summary_edit_cart_link'])/div)[1]")
		public WebElement EditCart_btn_M;
	   //*********************MOBILE END********************
	   
	   /***************************** END XPAHTS********************************/
	
	/***************************** START METHODS********************************/
	// Start KER-2927 CR-SK
	
    public float getEstimatedTaxOnCheckoutPage() {
        waitForElement(txtEstimatedTax);
        String taxDisplayed = getText(txtEstimatedTax);
        taxDisplayed = taxDisplayed.replace("$", "");
        return Float.parseFloat(taxDisplayed);
}

	// End KER-2927 CR-SK
	
	//Start KER-3132 CR-RKA
	@FindBy(xpath="//*[text()='SHIPPING ADDRESS']/following::*[1]")public WebElement shippingAddressFirst_LastName;
	@FindBy(xpath="//*[text()='Same As Shipping Address']/ancestor::div[1]/following::*[3]")public WebElement billingAddressFirst_LastName;
	
	@FindBy(xpath="//*[text()='SHIPPING ADDRESS']/following::*[3]")public WebElement shippingAddressphoneNumber;
	@FindBy(xpath="//*[text()='Same As Shipping Address']/ancestor::div[1]/following::*[5]")public WebElement billingZip_Phone;
	
	@FindBy(xpath="//*[text()='SHIPPING ADDRESS']/following::*[2]")public WebElement shippingCityCountryName;
	@FindBy(xpath="//*[text()='Same As Shipping Address']/ancestor::div[1]/following::*[4]")public WebElement billingCityCountryName;
   //KER-CR-4058 RKA
	@FindBy(xpath="//*[text()='ADDRESS VERIFICATION']")public WebElement AddressVerification_MSG;//For restricted item after clicking on go to shipMethod
	
	
	//Sep7 CR-RK KER-3151
	
	
	//Start CR-DPK KER-2911
	@FindBy(xpath="//*[text()='Special Order Ship To Store']/../div[2]")public WebElement SpecialOrderShipToStore_txt;
	
	//End CR-DPK KER-2911
	
	
	
	@FindBy(xpath="//*[@data-auid='checkout_edit_shipping_address']")public WebElement Checkout_ShippingAddress_Edit;
	@FindBy(xpath="//*[@data-auid='checkout_edit_shipping_address']/../../div[2]")public WebElement Checkout_ShippingAddress_Default;
	@FindBy(xpath="//*[@name='Dropdown']/button")public WebElement Checkout_ShippingAddressAfterEdit_ShippingAddress_Dd;
	@FindBy(xpath="//*[@id='customDropdownList']")public WebElement Checkout_ShippingAddressAfterEditdropdownelement;
	@FindBy(xpath="//*[text()='Add a New Shipping Address']")public WebElement Checkout_ShippingAddressAfterEdit_AddaNewShippingAddress;
//Sep7 CR-RK KER-3151
	
	//Start Sep10 KER-6576 CR-RK
		  @FindBy(xpath = "//*[@data-auid='checkout_footer_legal_link_Privacy Policy']")	public WebElement checkoutFooterLegalLinkPrivacyPolicy; // 10-September
		  @FindBy(xpath = "//*[@data-auid='checkout_footer_chat_now_link']")	public WebElement checkoutFooterChatNowLink; // 10-September
		   @FindBy(xpath = "//*[@data-auid='checkout_footer_contact_number_link_m']")	public WebElement checkoutFooterContactNumberLink_mobile; // 10-September
		   @FindBy(xpath = "//*[@data-auid='checkout_footer_legal_link_Terms & Conditions']")	public WebElement checkoutFooterLegalLinkTermsConditions; // 10-September
		   @FindBy(xpath = "//*[@data-auid='checkout_footer_legal_link_California Proposition 65 California Transparency in Supply Chains Act (SB 657)'] | //*[@data-auid='checkout_footer_legal_link_California Disclosures']")	public WebElement checkoutFooterLegalLinkCaliforniaProposition65; // 10-September
		   @FindBy(xpath="//*[@data-auid='checkout_footer_accepted_card_Visa_icon']") public WebElement iconVisa;
			@FindBy(xpath="//*[@data-auid='checkout_footer_accepted_card_Master Card_icon']") public WebElement iconMasterCard;
			@FindBy(xpath="//*[@data-auid='checkout_footer_accepted_card_Paypal_icon']") public WebElement iconPaypal;
			@FindBy(xpath="//*[@data-auid='checkout_footer_accepted_card_GooglePay_icon']") public WebElement iconGooglePay;
			@FindBy(xpath="//*[@data-auid='checkout_footer_accepted_card_ApplePay_icon']") public WebElement iconApplePay;
			@FindBy(xpath="//*[@data-auid='checkout_footer_accepted_card_Amex Card_icon']") public WebElement iconAmericanExpress;
			@FindBy(xpath="//*[@data-auid='checkout_footer_accepted_card_Discover_icon']") public WebElement iconDiscover;
		   	 @FindBy(xpath = "//*[text()='Privacy']")	public WebElement checkoutFooterLegalLinkPrivacyPolicy_txt; // 10-September
			 @FindBy(xpath = "//*[text()='Terms and ']")	public WebElement checkoutFooterLegalLinkTermsConditions_txt; // 10-September
			 @FindBy(xpath = "//*[text()='California Transparency in Supply Chains Act (SB 657)']")	public WebElement checkoutFooterLegalLinkCaliforniaProposition65_txt; // 10-September
			//End Sep10 KER-6576 CR-RK	
	
	public void verifyShippingAndBillingAddressAreSame() throws InterruptedException {
		
		Thread.sleep(10000);
		waitForElement(shippingAddressFirst_LastName);
		assertEquals(getText(shippingAddressFirst_LastName), getText(billingAddressFirst_LastName));
		assertEquals(getText(shippingAddressphoneNumber).substring(0, 8), getText(billingZip_Phone).substring(7, 15));
		assertEquals(getText(shippingCityCountryName).subSequence(0, 15), getText(billingCityCountryName).substring(0, 15));
	}
	
	
	
	/***************************** END METHODS*********************************/
	/**SID**************************************/
	   
	   @FindBy(xpath = "//*[@data-auid='checkout_shipping_method_shipment_itemWHITEGLOVE']/p[1]")	public WebElement textBasicDelivery; //SID 5-September
	   @FindBy(xpath = "//*[@data-auid='checkout_shipping_method_shipment_itemWHITEGLOVE']/p[2] | //*[@data-auid='checkout_shipping_method_shipment_itemWHITEGLOVE']/div")	public WebElement textBasicDeliverMessage; //SID 5-September
	   @FindBy(xpath="   (//*[@data-auid='btnc_btnCheckout'])[2] | (//*[@data-auid='btnCheckout'])[2]")public WebElement btnCheckOut_M; //SID 5-September //CR-GK 16Oct
	   @FindBy(xpath="//*[contains(text(),'Basic Delivery')]/ancestor::button")public WebElement clickShippingWGDropDown; //SID 6-September
	   @FindBy(xpath="//*[contains(text(),'Basic Delivery')]/ancestor::button/parent::div//ul/li")public List<WebElement> WGServicesList; //SID 6-September
	   @FindBy(xpath="//*[contains(text(),'Basic Delivery')]/ancestor::button/parent::div//ul/li/*[contains(text(),'Scheduled')]")public WebElement WGScheduleService; //SID 5-September
	   @FindBy(xpath = "//*[@data-auid='checkout_shipping_method_shipment_itemWHITEGLOVETHRESHOLD']/p[1]")	public WebElement textScheduleDelivery; //SID 6-September
	   @FindBy(xpath = "//*[@data-auid='checkout_shipping_method_shipment_itemWHITEGLOVETHRESHOLD']/p[2] | //*[@data-auid='checkout_shipping_method_shipment_itemWHITEGLOVETHRESHOLD']/p//following-sibling::div")	public WebElement textScheduleDeliverMessage; //SID modified 4-December
	   @FindBy(xpath="//*[contains(text(),'Basic Delivery')]/ancestor::button/parent::div//ul/li/*[contains(text(),'Room')]")public WebElement WGRoomOfChoiceService; //SID 5-September
	   @FindBy(xpath = "//*[@data-auid='checkout_shipping_method_shipment_itemWHITEGLOVEROC']/p[1]")	public WebElement textRoomOfChoiceDelivery; //SID 6-September
	   @FindBy(xpath = "//*[@data-auid='checkout_shipping_method_shipment_itemWHITEGLOVEROC']/p[2] | //*[@data-auid='checkout_shipping_method_shipment_itemWHITEGLOVEROC']/div")	public WebElement textRoomOfChoiceDeliverMessage; //SID 6-September
	   @FindBy(xpath="(//*[@data-component='cart']//*[text()='Employee Discount Applied'])[2] | (//div[contains(text(),' Academy Employee Discount Applied')])[2]") public WebElement employeeDiscountItemLevel_CartPage; //SID 13-September
	   @FindBy(xpath="//*[@data-auid='checkout_order_summary_section']//*[contains(text(),'Employee Discount')]")public WebElement employeeDiscountOrderSummerPage; //SID 13-September
	   @FindBy(xpath="//*[contains(@data-auid,'level2Category-Hot Deals')]")public WebElement dealTabProduct; //SID 5-September//MJR-20/08
	   
	  
		//*************KER-2915*********************//
		@FindBy(xpath = "//*[@data-component='orderConfirmation']//*[text()='THANKS FOR SUBMITTING YOUR ORDER!']")
		public WebElement txtOrderSuccesfullStatus;
		
		@FindBy(xpath = "(//*[@data-component='orderConfirmation']//*)[6]")
		public WebElement txtOrderID;
	   //SID 5-September
	   public void checkWGDefault() {
		   waitForElement(checkout_ShippingMethod_ShippingMethodHeader_txt);
			assertTrue(isDisplayed(textBasicDelivery));
			assertTrue(isDisplayed(textBasicDeliverMessage));	
	   }
	   
	   //SID 6-September
	   public void checkWGservicesAvailable() {
		 assertTrue(clickOnButton(clickShippingWGDropDown));
		   ArrayList<String> WGServices =new ArrayList<String>();
		   WGServices.add("Basic Delivery");
		   Boolean flag =false;
		   WGServices.add("Scheduled Delivery");
		   WGServices.add("Room of Choice");
		   int size = WGServicesList.size();
		  for(int i=1;i<=size;i++) {
			  System.err.println(WGServices.get(i-1));
			 flag =isDisplayed(driver.findElement(By.xpath("//*[contains(text(),'Basic Delivery')]/ancestor::button/parent::div//ul/li["+i+"]/*[contains(text(),'"+WGServices.get(i-1)+"')]")));
			 logger.debug("Expected :: " +WGServices.get(i-1)+" but not found" );
			 assertTrue(flag);
		  }
	   }
	   
	   //SID 6-September
	   public void checkWGSchedule() {
		   waitForElement(textScheduleDelivery);
		   isDisplayed(textScheduleDelivery);
		   System.err.println(textScheduleDelivery.getText());
		   System.err.println(textScheduleDeliverMessage.getText());
			assertTrue(isDisplayed(textScheduleDelivery));
			assertTrue(isDisplayed(textScheduleDeliverMessage));	
	   }
	   
	 //SID 6-September
	   public void checkWGRoomOFChoice() {
		   waitForElement(textRoomOfChoiceDelivery);
		   isDisplayed(textRoomOfChoiceDelivery);
		   System.err.println(textRoomOfChoiceDelivery.getText());
		   System.err.println(textRoomOfChoiceDeliverMessage.getText());
			assertTrue(isDisplayed(textRoomOfChoiceDelivery));
			assertTrue(isDisplayed(textRoomOfChoiceDeliverMessage));	
	   }
	
	   /**SID ENDS**************************************/
	
	   // To be updated by Anuj
	   /**AG KER-3138 Starts**************************************/
       
       @FindBy(xpath = "//*[@data-auid='checkout_payment']") public WebElement secPayment;
       @FindBy(xpath = "//*[text()='PAYMENT METHOD']") public WebElement secPaymentHeading;
       @FindBy(xpath = "//*[@id='creditCard'] | //*[@data-auid='checkout_payment_options_radio_button_Credit Card']") public WebElement rdbtnCreditCard;
       @FindBy(xpath = "//*[text()='Credit Card']") public WebElement txtCreditCard;
       @FindBy(xpath = "//*[@id='PayPal'] | //*[@data-auid='checkout_payment_options_radio_button_PayPal']") public WebElement rdbtnPayPal;
       @FindBy(xpath = "//*[text()='PayPal']") public WebElement txtPaypal;
       @FindBy(xpath = "//*[@id='gpay'] | //*[@id='GooglePay']") public WebElement rdbtnGooglePay;
       @FindBy(xpath = "//*[text()='Google Pay']") public WebElement txtGooglePay;
       @FindBy(xpath = "//*[text()='Credit Card Number']") public WebElement txtCreditCardHeading;
       @FindBy(xpath = "//*[@id='creditcardField'] | //*[text()='Credit Card Number']/following::*[1]") public WebElement txtCreditCardInput; //CR-RKA 10-Oct
       @FindBy(xpath = "//*[@id='name']") public WebElement creditCardHolderInput;
       @FindBy(xpath = "//*[@id='card']") public WebElement creditCardNumInput;
       @FindBy(xpath = "//*[@id='creditcardField']//following-sibling::span/img[contains(@src,'visa')]") public WebElement imgVisaCreditCardInput;
       @FindBy(xpath = "//*[text()='Expiration Date'] | //*[text()='Exp Date']") public WebElement txtExpirationDate;
       @FindBy(xpath = "//*[@id='expirationDate'] | //*[@id='expiryField']") public WebElement txtExpirationDateInput;
       @FindBy(xpath = "//*[@id='exp']") public WebElement creditCardExpInput;
       @FindBy(xpath = "//*[@placeholder='MM/YY']") public WebElement txtExpirationPlaceholders;
       @FindBy(xpath = "//*[@id='expirationDate']//parent::label//following-sibling::div/span[contains(text(),'Past expiration date')]") public WebElement txtErrorMsgForPastDates;
       @FindBy(xpath = "//*[@data-auid='tooltipcheckout_payment_creditCard_cvv_tooltip']/following::*[1]") public WebElement txtCVVInput;
       @FindBy(xpath = "//*[@id='cvv']") public WebElement creditCardCVVInput;
       @FindBy(xpath="//*[@data-auid='creditCardCVV']")public WebElement Cvv_BuyNow_Modal;
       @FindBy(xpath = "//*[@data-auid='tooltipcheckout_payment_creditCard_cvv_tooltip']") public WebElement btnCVVToolTip;
       @FindBy(xpath = "//*[text()='The 3 digit code found on far right of signature box']") public WebElement txtCVVToolTipMsg;
       @FindBy(xpath ="//*[@data-auid=\"btnundefined\"][@class=contains(text(),'BUY NOW')]")public WebElement BuyNow_Modal;//Added by HP for @KER-4332
       
      
       /**AG KER-3138 Ends**************************************/


	public void validatePaymentPage() {
		assertTrue(isDisplayed(secPayment));
		assertTrue(isDisplayed(secPaymentHeading));
		assertTrue(isEnabled(rdbtnCreditCard));
		assertTrue(isDisplayed(txtCreditCard));
		assertTrue(isEnabled(rdbtnPayPal));
		assertTrue(isDisplayed(txtPaypal));
//		assertTrue(isEnabled(rdbtnGooglePay));
//		assertTrue(isDisplayed(txtGooglePay));
		assertTrue(isDisplayed(txtCreditCardHeading));
		assertTrue(isDisplayed(txtCreditCardInput));
		assertTrue(isDisplayed(txtExpirationDate));
		assertTrue(isDisplayed(txtExpirationDateInput));
		assertTrue(isDisplayed(txtExpirationPlaceholders));
		assertTrue(isDisplayed(txtCVVInput));
		assertTrue(isDisplayed(btnCVVToolTip));
	}

	public void enterCardDetails(String cardNumber) {

		setInputText(txtCreditCardInput, cardNumber);
	}


	public void verifyEnterdCardNumber(String cardNumber) {

		String cvv = txtCreditCardInput.getAttribute("value");
		assertFalse(cvv.isEmpty());
		logger.debug("Credit card number entered in the Field "+cvv);
	}


	public void enterExpirationValue(String expirationValue) {
		setInputText(txtExpirationDateInput, expirationValue);
	}

	public void enterCVVValue(String cvv) {
		setInputText(txtCVVInput,cvv);
	}
	
	/*Added assert for element to be displayed on 18.07.19*/
	public void enterCVVBuyNowModal(String cvv) {
		assertTrue(isDisplayed(Cvv_BuyNow_Modal));
		setInputText(Cvv_BuyNow_Modal,cvv);
	}

	public void verifyCVVTooltip() {
		assertTrue(isDisplayed(btnCVVToolTip));
		moveHover(btnCVVToolTip);
		assertTrue(clickOnButton(btnCVVToolTip));
		assertTrue(isDisplayed(txtCVVToolTipMsg));
	}
	
	public void verifyCardImage() {
		setInputText(txtCreditCardInput, "41");
		assertTrue(isDisplayed(imgVisaCreditCardInput));
	}
	
	public void verifyErrorMsgInCVVSpecialCaharacterInput() {
		setInputText(txtCVVInput,"!@#$%");
		String cvv = txtCVVInput.getAttribute("value");
		assertTrue(cvv.isEmpty());
	}

	
	public void enterMasterCardDetails() {
		setInputText(txtCreditCardInput, webPropHelper.getTestDataProperty("CardMaster"));
		setInputText(txtExpirationDateInput, webPropHelper.getTestDataProperty("ExpDate"));
		setInputText(txtCVVInput,webPropHelper.getTestDataProperty("ThreeDigitCVV"));
	}
	
	public void enterVisaCardDetails() throws Throwable {
		Thread.sleep(Constants.thread_medium);
		driver.switchTo().frame("first-data-payment-field-name");
		setInputText(creditCardHolderInput, webPropHelper.getTestDataProperty("CardholderName"));
		driver.switchTo().defaultContent();
		driver.switchTo().frame("first-data-payment-field-card");
		setInputText(creditCardNumInput, webPropHelper.getTestDataProperty("CardVISA"));
		driver.switchTo().defaultContent();
		driver.switchTo().frame("first-data-payment-field-exp");
		setInputText(creditCardExpInput, webPropHelper.getTestDataProperty("ExpDate"));
		driver.switchTo().defaultContent();
		driver.switchTo().frame("first-data-payment-field-cvv");
		setInputText(creditCardCVVInput,webPropHelper.getTestDataProperty("ThreeDigitCVV"));
		driver.switchTo().defaultContent();
	}
	public void enterAmexCardDetails() {
		setInputText(txtCreditCardInput, webPropHelper.getTestDataProperty("CardAmex"));
		setInputText(txtExpirationDateInput, webPropHelper.getTestDataProperty("ExpDate"));
		setInputText(txtCVVInput,webPropHelper.getTestDataProperty("FourDigitCVV"));
	}
	
	public void enterDiscoverCardDetails() {
		setInputText(txtCreditCardInput, webPropHelper.getTestDataProperty("CardDiscover"));
		setInputText(txtExpirationDateInput, webPropHelper.getTestDataProperty("ExpDate"));
		setInputText(txtCVVInput,webPropHelper.getTestDataProperty("ThreeDigitCVV"));
	}
	
	
	public void enterWrongCardDetails() {
		setInputText(txtCreditCardInput, "4123131246519411"); //yet to get correct data to externalise 
		setInputText(txtExpirationDateInput, webPropHelper.getTestDataProperty("ExpDate"));
		setInputText(txtCVVInput,webPropHelper.getTestDataProperty("ThreeDigitCVV"));
	}
	
	 // To be updated by Anuj
	   /**AG KER-3130 Starts**************************************/
    
	@FindBy(xpath="//*[text()='Unrecognized expiration date']")public WebElement unrecognizedExpirationDate_Txt; 
    
    
    /**AG KER-3130 Ends**************************************/
		 // To be updated by Anuj
	   /**AG KER-3130 Starts**************************************/
    
    @FindBy(xpath = "//*[@id='billingFirstName']//following-sibling::div//span[contains(text(),'Please')]") public WebElement txtBillingFirstNameErrorMsg;
    @FindBy(xpath = "//*[@id='billingLastName']//following-sibling::div//span[contains(text(),'Please')]") public WebElement txtBillingLastNameErrorMsg;
    @FindBy(xpath = "//*[@id='billingPhoneNumber']//following-sibling::div//span[contains(text(),'Please')]") public WebElement txtBillingPhoneNumberErrorMsg;
    @FindBy(xpath = "//*[@id='billingZipCode']//following-sibling::div//span[contains(text(),'Please')]") public WebElement txtBillingZipCodeErrorMsg;
    @FindBy(xpath = "//*[@id='billingZipCode']") public WebElement billingZzipCode;  //SID 4-December
  
    @FindBy(xpath = "//*[@id='billingCity']//following-sibling::div//span[contains(text(),'Required')]") public WebElement txtBillingCityErrorMsg;
    @FindBy(xpath = "//*[@id='email']//parent::div//following-sibling::div//span[contains(text(),'Please')]") public WebElement txtBillingEmailAddressForOrderConfirmationErrorMsg;
    @FindBy(xpath = "//*[@id='billingAddress1']//following-sibling::div//span[contains(text(),'Please')]") public WebElement txtBillingAddressErrorMsg;
    @FindBy(xpath = "//*[@id='billingState']//following-sibling::div//span[contains(text(),'Required')]") public WebElement txtBillingStateErrorMsg;
    @FindBy(xpath="//*[@id='billingAddress1']")public WebElement txtEmailAddressforOrderConfirmationInput;
    @FindBy(xpath="//*[@data-auid='btnPlace_Order'] | //*[text()='Place Order']")public WebElement btnPlaceOrderPaymentPage;
    @FindBy(xpath = "//*[@id='billingZipCode']//following-sibling::*[contains(text(),'Invalid')]") public WebElement txtBillingZipCodeInvalidErrorMsg;
    @FindBy(xpath = "//*[@id='email']//parent::div//following-sibling::*[contains(text(),'Enter a valid email')]") public WebElement txtBillingEmailAddressForOrderConfirmationInvalidErrorMsg;
    //Only for SOF Item--Start KER-KER-7033 & KER-7031
    @FindBy(xpath="//*[contains(text(),'SPECIAL ORDER SHIP TO STORE')]")public WebElement ShipToStoreforSOF_Txt;
    @FindBy(xpath="//*[contains(text(),'You must be at least 18 years')]")public WebElement ShipToStoreforSOF_compliance_Txt;
    @FindBy(xpath="//*[@data-auid='btncheckout_ship_to_store_submit_button']")public WebElement ShipToStoreforSOF_Payment_Btn;
    @FindBy(xpath="//*[@type='checkbox']")public WebElement selectCheckbox;  //Sid 22-Jan
    
    @FindBy (xpath="//*[contains(@data-auid,'shipping_method_shipment_item_')]//p[contains(text(),'$') or contains(text(),'FREE')] | //*[contains(@data-auid,'checkout_shipping_method_shipment_item') and not (contains(@data-auid,'image'))]/p")
    public List<WebElement> shippingMethodText;
  
  //Only for SOF Item--Start KER-KER-7033 & KER-7031

	 //Start KER-3174 CR-RK 19-Sep
	 @FindBy(xpath = "//*[@data-auid='checkout_edit_ship_to_store']")	public WebElement checkoutEditShipToStore_btn;
	 //End KER-3174 CR-RK 19-Sep
	 
	 //Start KER-2925 CR-AG 21-Sep
	  @FindBy(xpath="//*[contains(text(),'Terms and Conditions')]")public WebElement lnkTermsConditons;
	  @FindBy(xpath="//*[contains(text(),'Privacy Policy')]")public WebElement lnkPrivacyPolicy;
	  @FindBy(xpath="//*[@id='1' and @name='Dropdown']")public WebElement drpdownShippingAddress;
	  @FindBy(xpath= "//*[contains(text(),'Gift Card Ending In')]//ancestor::button")
		public WebElement drpdownGiftCard;
		
		@FindBy(xpath= "//*[contains(text(),'Gift Card Ending In')]//ancestor::div//following-sibling::div/p[contains(text(),'Remaining Balance')]")
		public WebElement txtEmptyGiftCard;
	  
	  
	  //End KER-2925 CR-AG 21-Sep
	 
		
		@FindBy(xpath="//*[@data-auid='checkout_review_order']//input") public WebElement ageRestrictionCheckBox;  //SID 7-Jan 
		
		
		
	 
    /**AG KER-3130 Ends**************************************/

 //
	 //K4237-HSP- 24-Sep Start---------------- 
	  @FindBy(xpath = "//*[contains(text(),'Order Number')]/following-sibling::p")public WebElement orderSubmitted_OrderNumber; 
	  @FindBy(xpath ="//*[contains(text(),'Order Number')]/following-sibling::input | //*[contains(text(),'Order Number')]/../../input")//CR-DPK 11-oct
	  public WebElement checkOutCheckOrderStatus_OrderNumberInput; 
	 
	//K4237-HSP- 24-Sep End---------------- 
	  
    public void billingAddressErrorMsgValidation() {
    	
    	assertTrue(isDisplayed(txtBillingFirstNameErrorMsg));
    	assertTrue(isDisplayed(txtBillingLastNameErrorMsg));
    	assertTrue(isDisplayed(txtBillingPhoneNumberErrorMsg));
    	//assertTrue(isDisplayed(txtBillingZipCodeErrorMsg));
    	//assertTrue(isDisplayed(txtBillingCityErrorMsg));
    	assertTrue(isDisplayed(txtBillingEmailAddressForOrderConfirmationErrorMsg));
    	assertTrue(isDisplayed(txtBillingAddressErrorMsg));
    	//assertTrue(isDisplayed(txtBillingStateErrorMsg));
    	
    }
	
    public void errormMsgValidationForInvalidZipPhoneEmail() {
    	assertTrue(isDisplayed(txtBillingZipCodeInvalidErrorMsg));
    	assertTrue(isDisplayed(txtBillingCityErrorMsg));
    	assertTrue(isDisplayed(txtBillingEmailAddressForOrderConfirmationInvalidErrorMsg));
    	assertTrue(isDisplayed(txtBillingZipCodeInvalidErrorMsg));
    	assertTrue(isDisplayed(txtBillingPhoneNumberErrorMsg));
    
    	
    }
    
	public float getTotalAmountOnCheckoutPage() {
		waitForElement(txtTotal);
		String taxDisplayed = getText(txtTotal);
		taxDisplayed = taxDisplayed.replace("$", "");
		return Float.parseFloat(taxDisplayed);
	}
	
	//Start  CR-DPK KER-2919
	public void verifyShippingAddress(String arg1) throws InterruptedException
	{
		
		if(isDisplayed(checkout_ShippingAddress_txt)) {
			
		}
		
		else {
			addAddressInCheckoutPage();
		}
	}
	
	public void addAddressInCheckoutPage() throws InterruptedException {
		setInputText(myAccountPo.txtFirstNameInAddCreditCard, webPropHelper.getTestDataProperty("UpdateFirstName"));
		setInputText(myAccountPo.txtLastNameInAddCreditCard, webPropHelper.getTestDataProperty("UpdateLastName"));
		setInputText(myAccountPo.txtAddressInAddCreditCard, webPropHelper.getTestDataProperty("UpdateAddress"));
		setInputText(inputCheckoutPhoneNumber, webPropHelper.getTestDataProperty("UpdatePhoneNumber"));
		setInputText(myAccountPo.txtZipCodeInAddCreditCard, webPropHelper.getTestDataProperty("UpdateZipcode"));
		Thread.sleep(3000);
		assertTrue(clickOnButton(btnGoToShippingMethod));
	}
	//End CR-DPK KER-2919
	
	public void userNavigateToTermsCondition() throws InterruptedException{
		assertTrue(clickOnButton(lnkTermsConditons));

		 ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		 
		    driver.switchTo().window(tabs.get(1));
		    String Title ="Terms and Conditions of Website Use";
		    assertTrue(Title.equalsIgnoreCase(getTitle()));
		    
	}
	
	public void userNavigateToPrivacyPolicy() throws InterruptedException{
		assertTrue(clickOnButton(lnkPrivacyPolicy));

		 ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		 
		    driver.switchTo().window(tabs.get(1));
		    String Title ="Privacy Policy";
		    assertTrue(Title.equalsIgnoreCase(getTitle()));	
	}
	
	public void verifymodifiedShippingAddress() throws InterruptedException{
	
		
		String modifiedFirstName= webPropHelper.getTestDataProperty("FirstName");
		String modifiedSecondName= webPropHelper.getTestDataProperty("LastName");
		String modifiedPhoneNumber= webPropHelper.getTestDataProperty("PhoneNumber");
		String modifiedAddress= webPropHelper.getTestDataProperty("PO_ADDRESS");
		String modifiedZipcode= webPropHelper.getTestDataProperty("PO_ZIPCODE");
		String phoneNumber = modifiedPhoneNumber.substring(0, 3)+"-"+modifiedPhoneNumber.substring(3, 6)+"-"+modifiedPhoneNumber.substring(6, 10);
		System.out.println("Assert Phone number = "+ phoneNumber);
		assertTrue(isDisplayed(driver.findElement(By.xpath("//*[text()='SHIPPING ADDRESS']//parent::div//*[contains(text(),'"+modifiedFirstName+"')]"))));
		//assertTrue(isDisplayed(driver.findElement(By.xpath("//*[text()='SHIPPING ADDRESS']//parent::div//*[contains(text(),'"+modifiedSecondName+"')]"))));
		assertTrue(isDisplayed(driver.findElement(By.xpath("//*[text()='SHIPPING ADDRESS']//parent::div//*[contains(text(),'"+phoneNumber+"')]"))));
		assertTrue(isDisplayed(driver.findElement(By.xpath("//*[text()='SHIPPING ADDRESS']//parent::div//*[contains(text(),'"+modifiedAddress+"')]"))));
		assertTrue(isDisplayed(driver.findElement(By.xpath("//*[text()='SHIPPING ADDRESS']//parent::div//*[contains(text(),'"+modifiedZipcode+"')]"))));

		
	}
	
	public void orderIDvalidationInMyAccount(String orderID) {
		Boolean flag =false;
		System.out.println(orderID);
		flag =isDisplayed(driver.findElement(By.xpath("//*[contains(text(),'"+orderID+"')]")));
		assertTrue(flag);
	}

	
	public void validGiftCardSelection() {
		
		String giftAmount = getText(txtEmptyGiftCard).substring(19);
		
		while(giftAmount == "00.00") {
			
		assertTrue(clickOnButton(drpdownGiftCard));
	
		List<WebElement> giftCardCount = driver.findElements(By.xpath("//*[@id='customDropdownList'and @data-auid='undefined_dropdownList']/li"));
	
		for (WebElement element : giftCardCount){
		
	        	clickOnButton(element);
	        	assertTrue(clickOnButton(drpdownGiftCard));
	        	
	           giftAmount = getText(txtEmptyGiftCard).substring(18);
	           
		}	
		
	        }
	    }
	
	public String getTheShippingMenthodSumValueOnCheckout() throws InterruptedException {
		String expectedShippingPrice ="" ;
		DecimalFormat df2 = new DecimalFormat("###.##");
		double shippingPrice=0.00;
		Thread.sleep(Constants.thread_medium);
		for (WebElement webElement : shippingMethodText) {
			expectedShippingPrice =getText(webElement);
			if(expectedShippingPrice.contains("FREE")) {
				shippingPrice = 0;
			}
			else {
				int i = expectedShippingPrice.indexOf('$');
				expectedShippingPrice = expectedShippingPrice.substring(i+1, expectedShippingPrice.length());
				System.out.println(expectedShippingPrice);
				if (expectedShippingPrice.matches("[A-Za-z]+")) {
					expectedShippingPrice = expectedShippingPrice.substring(0,expectedShippingPrice.indexOf('\n'));
				}	
				shippingPrice = shippingPrice + Double.parseDouble(expectedShippingPrice);
			}
		}
		if(shippingPrice == 0) {
			expectedShippingPrice = "FREE";
		}else {
			expectedShippingPrice= df2.format(shippingPrice);
		}
		
		return (expectedShippingPrice);
	}
	
	//Google Pay
		@FindBy(xpath="//*[@id='identifierId']")public WebElement googlePayEmail_Txtbox_gpmodal;;
		@FindBy(xpath="//*[@id='password']//input")public WebElement googlePayPassword_TxtBox_gpmodal;
		@FindBy(xpath="//*[@id='identifierNext']")public WebElement googlePay_nextBtn_gpmodal;
		@FindBy(xpath="//*[@id='passwordNext']") public WebElement googlePay_nextBtn_password_gpmodal;
		@FindBy(xpath="//*[contains(@class,'submit-button')]") public WebElement googlePayContinueBtn_gpmodal;
		@FindBy(xpath="//*[@data-auid='checkout_payment_options_radio_button_Google Pay']/../label") public WebElement googlePayRadiobtn;
		@FindBy(xpath="//*[@data-auid='checkout_payment_google_pay_btn']") public WebElement googlePayBtn;

	//added by Sachin
		@FindBy(xpath="//div[1]//div[6]//*[contains(@class,'css-')] | //*[@role='alert']")public WebElement Shipping_StateRestriction_Message;
		@FindBy(xpath="//span[@class='css-12w8fd6 text-danger']") public WebElement Payment_StateRestriction_Message;
		@FindBy(xpath="//span[contains(@class,'danger')]") public WebElement MyAccount_Address_RestrictionMsg;
		@FindBy(id="first-data-payment-field-name")public WebElement NameField_Frame;
		@FindBy(xpath="//span[@class='linkStyle'][text()='Edit']") public WebElement MyAccount_Address_Edit;
		@FindBy(xpath="//*[@name='billingZipCode']") public WebElement inputCheckoutBillingZipCode;
		@FindBy(xpath="//*[@id='signup-zipcode']") public WebElement inputFastCheckout_zipcode;
		@FindBy(xpath="//*[@data-auid='crt_inputQty']") public List <WebElement> cartQtyValue;
		@FindBy(xpath="(//*[@class='o-copy__20reg'])[2]") public WebElement estimateTax_Cart;
		@FindBy(xpath="//*[@data-auid='taxesvalue']") public WebElement estimateTax_Checkout;
		@FindBy(xpath = "(//*[@class='academyicon icon-plus '])[4]")public WebElement expandStoreFour;
		@FindBy(xpath = "//*[contains(text(),'Please enter an email address')]")public WebElement enterEmailAddressBillingForm;
		@FindBy(xpath = "//*[@data-auid='checkout_edit_in_store_pickup']")public WebElement checkoutStoreEdit;
		@FindBy(xpath = "//*[contains(@class,'pr-half css-17ijryf')]")public WebElement zeroItemAvailableFindStoreModal;
		@FindBy(xpath = "//*[@id='acceptAllButton']")public WebElement PayPalAcceptCookie;
		@FindBy(xpath = "//*[@id='closeCart']") public WebElement PayPal_PopUpClose;
		@FindBy(xpath = "//*[@class='span11 alignRight baslLoginButtonContainer']") public WebElement PayPal_Login;
		@FindBy(xpath="//div[@class='css-13o7eu2'][1]") public WebElement WGBulkMessage;
		@FindBy(xpath="//*[@data-auid='btnbuttonOneSixFour'][2]") public WebElement ContinueReviewCTA;
		@FindBy(xpath="//*[contains(text(),'You have already ordered the daily quantity limit for the below item(s)')]") public WebElement DailyQtyErrorMsg;
		@FindBy(xpath="//*[@data-testid='paywith-title']") public WebElement PayPalPayWithSection;
		@FindBy(xpath ="//*[@data-auid='discountValue']") public WebElement CheckoutDiscountValue;
		
		@FindBy(xpath="//input[@id='billingFirstName']") public WebElement Billing_FirstName;
		@FindBy(xpath="//input[@id='billingLastName']") public WebElement Billing_LastName;
		@FindBy(xpath="//input[@id='billingPhoneNumber']") public WebElement Billing_PhoneNumber;
		@FindBy(xpath="//input[@id='billingAddress1']") public WebElement Billing_Address1;
		@FindBy(xpath="//input[@id='billingZipCode']") public WebElement Billing_ZipCode;
		
		/***
		 * This Function clicks on Go To Shipping button at Pickup Store page
		 * @author kumgaura7
		 * @return Boolean 
		 */
		public boolean userClicksOnGotoPaymentCTA() throws InterruptedException 
		{
			isDisplayed(checkout_CheckoutHeader_txt);
			boolean flag = false;
			flag = isDisplayed(ShippingConfirm_btn);
			if(flag)
				assertTrue(clickOnButton(ShippingConfirm_btn));
			Thread.sleep(Constants.thread_medium);
			return true;
		}
				
		
		/**
		 * @author kumgaura7
		 * @param userWithoutExistingPaymentDetails, CCtype, userType
		 * @return String
		 * @throws InterruptedException		 * 
		 */
		public boolean paymentViaCreditCard(boolean userWithoutExistingPaymentDetails, String CCtype, String userType) throws InterruptedException
		{
			String creditCardProperty [] = new String [2];
			creditCardProperty = credeitCardPropertyName(CCtype);
			String creditCardNumber = creditCardProperty[0];
			String cvv = creditCardProperty[1];
			boolean chooseCreditCard = false;
			if (!(userWithoutExistingPaymentDetails)) {
				if (isNotDisplayed(chooseCreditcard_Dd))
					chooseCreditCard = true;
			}

			if (chooseCreditCard | userWithoutExistingPaymentDetails) {
				
				fillCreditCardDetailCheckoutPage(creditCardNumber,cvv);
				
				if (!(isDisplayed(btnEditShippingAddress))) {
					
					fillBillingSectionDetailCheckout();
					
				}

				if (userType.equalsIgnoreCase("guest") | userType.equalsIgnoreCase("unauthenticated")) {
					setInputText(EmailAddressforOrderConfirmation_Input,
							commonUtils.generateRandomEmailId());
				}

				assertTrue(clickOnButton(ReviewOrder_Btn));
				if(isDisplayed(ContinueReviewCTA))
				{
					assertTrue(clickOnButton(ContinueReviewCTA));
					Thread.sleep(Constants.thread_high);
				}
			}
			if (!(userWithoutExistingPaymentDetails)) {
				if (isDisplayed(ReviewOrder_Btn))
					assertTrue(clickOnButton(ReviewOrder_Btn));
			}
			Thread.sleep(Constants.thread_medium);
			return true;

		}
		
		/**
		 * This function return the Property Name info stored in Property file for selected credit card type
		 * @author kumgaura7
		 * @param sCCtype
		 * @return String[]
		 */
		public String[] credeitCardPropertyName(String sCCtype)
		{		
			String creditCardProperties[] = new String [2];
			creditCardProperties[0] = "CreditCardNumber";
			creditCardProperties[1] = "CVV";
			//String creditCardNumber = "";
			
			if (sCCtype.toLowerCase().contains(("visa")))
				creditCardProperties[0] = "CardVISA";
			else if (sCCtype.toLowerCase().contains(("master")))
				creditCardProperties[0] = "CardMaster";
			else if (sCCtype.toLowerCase().contains(("amex"))) {
				creditCardProperties[0] = "CardAmex";
				creditCardProperties[1] = "FourDigitCVV";
			} else if (sCCtype.toLowerCase().contains(("discover")))
				creditCardProperties[0] = "CardDiscover";
			else
				creditCardProperties[0] = "CreditCardNumber";
				creditCardProperties[1] = "CVV";
			return creditCardProperties;
		}
		
		/**
		 * @author kumgaura7
		 * @return
		 */
		public boolean fillCreditCardDetailCheckoutPage(String creditCardNumber, String cvv)
		{
			boolean flag = false;
			try {
				Thread.sleep(Constants.thread_low);
				waitForInnerFormElement(CardholderName_Input,"first-data-payment-field-name"); 
				setInputText(CardholderName_Input, webPropHelper.getTestDataProperty("CardholderName"));
				driver.switchTo().defaultContent();
				waitForInnerFormElement(CreditCardDetails_Input,"first-data-payment-field-card"); 
				setInputText(CreditCardDetails_Input, webPropHelper.getTestDataProperty(creditCardNumber));
				driver.switchTo().defaultContent();
				waitForInnerFormElement(ExpDate_Input,"first-data-payment-field-exp"); 				
				setInputText(ExpDate_Input, webPropHelper.getTestDataProperty("ExpDate"));
				driver.switchTo().defaultContent();
				waitForInnerFormElement(PassCvv_Input,"first-data-payment-field-cvv"); 				
				setInputText(PassCvv_Input, webPropHelper.getTestDataProperty(cvv));
				driver.switchTo().defaultContent();
				flag = true;
			}catch(Exception e) {
				e.printStackTrace();
				logger.error("Exception in  ClickonRadioBtn msg::"+e.getMessage());
			}
			return flag;
		}
		
		/**
		 * @author kumgaura7
		 * @param element
		 * @return
		 */
		public boolean JS_Click(WebElement element) {
			boolean flag = false;
			try {
				
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", element);
				Thread.sleep(3000);
				flag = true;
				logger.debug(element.toString()+" has been clicked using JS Executor.");
								
			} catch (Exception e) {
				//e.printStackTrace();
				logger.error("Exception in  ClickonRadioBtn msg::"+e.getMessage());
				flag = false;
				//wait.until(ExpectedConditions.visibilityOf(element));
				//clickOnButton(element);				
			}
			return flag;
		}
		
		/**
		 * @author kumgaura7
		 * @return
		 */
		public boolean fillBillingSectionDetailCheckout(){
			boolean flag = false;
			try {
				setInputText(Billing_FirstName, webPropHelper.getTestDataProperty("FirstName"));
				setInputText(Billing_LastName, webPropHelper.getTestDataProperty("LastName"));
				setInputText(Billing_PhoneNumber, webPropHelper.getTestDataProperty("PhoneNumber"));
				setInputText(Billing_Address1, webPropHelper.getTestDataProperty("Address"));
				setInputText(Billing_ZipCode, webPropHelper.getTestDataProperty("zipcode"));

				flag = true;

				logger.debug("Billing Section Detail has been filled successfully.");
			} catch (Exception e) {
				e.printStackTrace();
				logger.error("Exception in  ClickonRadioBtn msg::"+e.getMessage());
			}	
			return flag;		
		}
}