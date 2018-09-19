package com.aso.qe.test.pageobject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;

public class R2_CheckOut_PO extends CommonActionHelper 
{
		private static final Logger logger = Logger.getLogger(R2_CheckOut_PO.class);

	/**************** START LOCAL OBJETCS AND DECLARATIONS***********************/
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
	@FindBy(xpath = "//*[text()='Gift Cards']/..")
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

	@FindBy(xpath = "//div[contains(text(), 'has been applied')]")
	public WebElement txtGiftCardAppliedSuccessMessage;

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
	@FindBy(xpath = "//h4[text()='CHECKOUT']")
	public WebElement checkout_CheckoutHeader_txt;
	
	@FindBy(xpath = "//*[contains(text(), 'Forgot your password')]")
	public WebElement checkout_SignIn_ForgotYourPassword_lnk;
	
	@FindBy(xpath = "//*[@data-auid='btnemail-signin-button']")
	public WebElement checkout_SignIn_SignIn_btn;
	
	@FindBy(xpath = "//*[text()='SHIPPING INFORMATION']")
	public WebElement checkout_ShippingInformation_Header_txt;
	
	@FindBy(xpath = "//*[text()='SHIPPING ADDRESS']/..")
	public WebElement checkout_ShippingAddress_txt;
	
	@FindBy(xpath = "//*[@data-auid='checkout_unauth_description_signin_link']//a")
	public WebElement checkout_SignIn_lnk;
	
	@FindBy(xpath = "//h6[text()='SHIPPING ADDRESS']")
	public WebElement checkout_ShippingAddress_ShippingAddressHeader_txt;
		
	@FindBy(xpath = "//*[text()='SHIPPING METHOD']")
	public WebElement checkout_ShippingMethod_ShippingMethodHeader_txt;
	
	@FindBy(xpath = "//*[@data-auid='checkout_edit_shipping_method']")
	public WebElement checkout_ShippingMethod_Edit_lnk;
	
	@FindBy(xpath = "//*[@data-auid='shipping_method_shipment_item_1_container']//*[contains(text(), 'Shipment')]")
	public WebElement checkout_ShippingMethod_Shipment_txt;
	
	@FindBy(xpath = "//*[@data-auid='shipping_method_shipment_item_1_container']//*[contains(text(), 'Shipment')]/following-sibling::p")
	public WebElement checkout_ShippingMethod_Items_txt;
	
	@FindBy(xpath = "//*[contains(@data-auid,'shipping_method_shipment_item_image')]")
	public WebElement checkout_ShippingMethod_ItemImage_img;
	
	@FindBy(xpath = "//*[@data-auid='shipping_method_shipment_item_1_container']//button")
	public WebElement checkout_ShippingMethod_ShippingMethodType_btn;
	
	@FindBy(xpath = "//*[@data-auid='btncheckout_goto_payment button-1']")
	public WebElement checkout_ShippingMethod_GoToPayment_btn;
	
	@FindBy(xpath = "//*[@data-auid='checkout_shipping_method_shipment_itemSG']")
	public WebElement checkout_ShippingMethod_ShippingDetails;
		
////Ends Checkout Page Verification CR - SK
	
	//Shipping information
	
	//*****Start Modify Pickup Location*********//
	   //Start KER-4271 AKK
	   @FindBy(xpath="//a[@data-auid='checkout_edit_in_store_pickup']")
	   public WebElement EditStorPickUp_Btn;
	   @FindBy(xpath="(//button[@type='button'])[1]/div/div[1]")
	   public WebElement MePickUp_Drpdwn;
	   
	   @FindBy(xpath="//input[@data-auid=\"checkout_in_store_pickup_input_Alternate's First Name\"]")
	   public WebElement PickupAltrFirstname_input;
	   
	   @FindBy(xpath="//input[@data-auid=\"checkout_in_store_pickup_input_Alternate's Last Name\"]")
	   public WebElement PickupAltrLatstname_input;
	   
	   @FindBy(xpath="//input[@data-auid=\"checkout_in_store_pickup_input_Alternate's Email Address\"]")
	   public WebElement PickupAltrEmail_input;
	   
	   @FindBy(xpath="//input[@data-auid=\"checkout_in_store_pickup_input_Alternate's Phone Number\"]")
	   public WebElement PickupAltrPhone_input;
	   
	   @FindBy(xpath="//button[@data-auid='btncheckout_goto_shipping_payment_btn']")
	   public WebElement ShippingConfirm_btn;
	   
	   @FindBy(xpath="//span[text()='Required']")
	   public WebElement errorMsgRequired;
	   
	   
	   @FindBy(xpath="//*[text()='PICKUP LOCATION']")
	   public WebElement PickupLocation_Lbl;
	   
	   @FindBy(xpath="//*[text()='PICKUP LOCATION']/../div")
	   public WebElement StoreNameandAddress_Txt;
	   
	   @FindBy(xpath="//*[@data-auid='checkout_in_store_pickup_change_location']")
	   public WebElement ChangeLocation_Lnk;
	   
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
	  
	   @FindBy(xpath="//*[contains(text(),'See In-Store Pickup Instructions')]/../div[3]/ol")
	   public WebElement SeeInStorePickupInstructions_Msg; 
	   
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
		@FindBy(xpath = "//*[text()='Subtotal']/..")public WebElement txtSubTotal;//subtotal_txt
		@FindBy(xpath="//*[text()='Subtotal']/../*[2]")public WebElement SubTotalPrice_Txt;//subtotal_price
		
		@FindBy(xpath="//*[@data-auid='checkout_order_summary_section']//*[contains(text(),'Shipping')]")public WebElement Shipping_Txt;
		@FindBy(xpath="//*[@data-auid='checkout_order_summary_section']//*[contains(text(),'Shipping')]/following-sibling::*[1]")public WebElement ShippingPrice_Txt;
		@FindBy(xpath = "//*[text()='Estimated Shipping']/..")public WebElement txtEsitmatedShipping;//estimatedshippint_txt
		@FindBy(xpath="//*[text()='Estimated Shipping']/../*[2]")public WebElement EstimatedShippingPrice_txt;//estimatedshipping_price
		
		@FindBy(xpath="(//*[contains(text(),'147.50')])[1]")public WebElement shippingPriceInShippingMethod_txt;
		
		
		@FindBy(xpath="//*[contains(text(),'Taxes')]")public WebElement Taxes_Txt;//taxprice_txt
		@FindBy(xpath="//*[contains(text(),'Taxes')]/following-sibling::*[1]")public WebElement TaxesPrice_Txt;//taxprice
		@FindBy(xpath="//*[contains(text(),'Estimated Taxes')]")public WebElement EstimatedTax_Txt;
		@FindBy(xpath = "//*[@data-auid='checkout_order_summary_section']//*[contains(text(),'Taxes')]/following-sibling::*[1]")public WebElement txtEstimatedTax;//estimatedPrice_Txt

		
		
		@FindBy(xpath ="//*[text()='Total Discount']")public WebElement txtTotalDiscount;
		@FindBy(xpath="//*[text()='Total Discount']/following-sibling::*[1]")public WebElement TotalDiscountPrice_Txt;
		
		@FindBy(xpath = "//*[text()= 'Total']/following-sibling::div[1]")public WebElement txtTotal;//Total_price
		@FindBy(xpath="//*[@data-auid='checkout_order_summary_section']//*[text()='Total']")public WebElement Total_txt;
		
		@FindBy(xpath = "//*[@data-auid='checkout_order_summary_section']//*[contains(text(),'Gift Card')]")public WebElement giftCards_txt;
		@FindBy(xpath="//*[@data-auid='checkout_order_summary_section']//*[contains(text(),'Gift Card')]/following-sibling::*")public WebElement giftCardsPrice_txt;
		
		
		
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
		@FindBy(xpath = "(//*[@data-auid='checkout_order_summary_edit_cart_link'])[2]/*")public WebElement btnEditCart;//EditMyCart_Link
		@FindBy(xpath = "(//*[@data-auid='checkout_order_summary_edit_cart_link'])[1]")
		public WebElement btnEditCart_m;
		
		@FindBy(xpath="//*[@data-auid='facetdrawerundefined']/button")
		public WebElement ExpandIcon_Link;
		    
		       //**********ITems under Order Summary (End)
		//Order Summary(End)
		
		//*********************************************************************************************************************************************
		 //Payment(Start)
		 
		//******************Payment Method(Start)
		@FindBy(xpath="//*[@data-auid='checkout_payment']/preceding::*[1]")public WebElement PaymentHeader_Txt;
		@FindBy(xpath="//*[@data-auid='checkout_payment']//*[contains(text(),'PAYMENT METHOD')]")public WebElement PaymentMethodHeader_Txt;
		@FindBy(xpath="//*[text()='Credit Card']")public WebElement CreditCard_radioBtn;
		@FindBy(xpath="//*[text()='PayPal']")public WebElement PayPal_radioBtn;
		@FindBy(xpath="//*[text()='Credit Card Number']/following::*[1]")public WebElement CreditCardNumber_Input;
		@FindBy(xpath="//*[text()='Expiration Date']/following::*[1]")public WebElement ExpirationDate_Input;
		@FindBy(xpath="//*[text()='CVV']/following::*[3]")public WebElement Cvv_Input;
		@FindBy(xpath="//*[@data-auid='tooltipcheckout_payment_creditCard_cvv_tooltip']")public WebElement CvvToolTip;
		@FindBy(xpath="//*[text()='Unrecognized card number']")public WebElement UnrecognizedCardNumber_Txt; 
		@FindBy(xpath="//*[text()='Past expiration date']")public WebElement PastExpirationDate_Txt;
		@FindBy(xpath="//*[text()='Please enter a valid security code']")public WebElement PleaseEnteRaValidSecurityCode_Txt; 
		@FindBy(xpath="//*[contains(text(),'Visa ending in')]")public WebElement chooseCreditcard_Dd; 
        @FindBy(xpath="//*[@data-auid='undefined_listOption_1']")public WebElement AddNewCreditCard_Txt;
		//*****************Payment Method (END)
		
		//****************Gift Card(Start)
		
		@FindBy(xpath = "//*[@data-auid='checkout_payment_add_gift_card_icon']")public WebElement plusIconGiftCard;	//Plus_GiftCard
		@FindBy(xpath = "//*[@data-auid='checkout_payment_hide_gift_card_icon']")public WebElement minusIconGiftCard;//Hide_GiftCard
		@FindBy(xpath = "//*[text()='Gift Card Number']")public WebElement txtGiftcardNumber;//GiftCardNumber_Txt
		@FindBy(xpath = "//*[@name='cardId']")	public WebElement inputGiftcardNumber;//GiftCardNumber_Input	
		@FindBy(xpath="(//*[@data-auid='tooltipcheckout_payment_gift_card_tooltip'])[1]")public WebElement toolTip_giftCard;//GiftCardNumber_Tooltip
		@FindBy(xpath = "//*[text()='Invalid GiftCard Number']")public WebElement txtInvalidGiftcard;//InvalidGiftCardNumber_Txt
		@FindBy(xpath = "//*[text()='Pin']")public WebElement txtPin;//Pin_Txt
		@FindBy(xpath = "//*[@name='cardPin']")public WebElement inputPinNumber;//Pin_Input
		@FindBy(xpath="(//*[@data-auid='tooltipcheckout_payment_gift_card_tooltip'])[2]")public WebElement toolTip_pin;
		@FindBy(xpath = "//*[text()='Invalid GiftCard Pin']")public WebElement txtInvalidPin;//InvalidGiftCardPin_Txt
		@FindBy(xpath = "//*[@data-auid='btncheckout_payment_apply_gift_card_btn']")public WebElement btnCheckoutApply; //Apply_Btn
		@FindBy(xpath="//*[@data-auid='checkout_payment_add_another_gift_card_icon']")public WebElement AddAnotherGiftCard_Txt;
		@FindBy(xpath = "//div[contains(text(),'Choose Gift Card')]/../div/div/div/button")public WebElement checkOutGiftCardDropDown; 
		
		//****************Gift Card(End)
		
		//*************** Billing Information(Start)
	   @FindBy(xpath="//*[text()='BILLING INFORMATION']")public WebElement BillingInformation_Txt;
	   @FindBy(xpath="//*[text()='Same As Shipping Address']/following::*[3]")public WebElement SameAsShippingAddress_Txt;
	   @FindBy(xpath="//*[text()='Same As Shipping Address']/preceding::*[1]")public WebElement SameAsShippingAddress_checkBox;
	   
	   @FindBy(xpath="//*[@data-auid='checkout_payment']//*[contains(text(),'First Name')]/following::*[2]")public WebElement FirstName_Input;
	   @FindBy(xpath="//*[@data-auid='checkout_payment']//*[contains(text(),'Last Name')]/following::*[2]")public WebElement LastName_Input;
	   @FindBy(xpath="//*[@data-auid='checkout_payment']//*[contains(text(),'Phone Number')]/following::*[2]")public WebElement PhoneNumber_Input;
	   
	   @FindBy(xpath=" //*[contains(text(),'Send SMS text updates about my order')]/preceding::*[1]")public WebElement SendSMSTextUpdatesAboutMyOrder_checkbox;
	   @FindBy(xpath="//*[@name='billingAddress1']")public WebElement Adderss_Input;
	   @FindBy(xpath="//*[contains(text(),'Add Company Name, Apt. Number, etc. (Optional)')]")public WebElement AddCompanyNameAptNumberEtcOptional_Txt;
	   @FindBy(xpath="//*[contains(text(),'Add Company Name, Apt. Number, etc. (Optional)')]/following::*[2]")public WebElement AddCompanyNameAptNumberEtcOptional_Input;
	   
	   
	   
	   @FindBy(xpath="//*[@data-auid='checkout_payment']//*[contains(text(),'ZIP Code')]/following::*[2]")public WebElement ZipCode_Input;
	   @FindBy(xpath="//*[@data-auid='checkout_payment']//*[contains(text(),'City')]/following::*[2]")public WebElement city_Input;
	   @FindBy(xpath="//*[text()='State']/following::*[1]")public WebElement State_DD;
	   
	   
	   @FindBy(xpath="//*[@data-auid='checkout_payment']\r\n" + 
	   		"//*[contains(text(),'Email Address for Order Confirmation')]/following::*[2]/input")public WebElement EmailAddressforOrderConfirmation_Input;
	   
	   @FindBy(xpath="//*[contains(text(),'Sign up to get Hot Deals')]/preceding::*[1]")public WebElement SignuptogetHotDeals_checkBox;
	   
	   @FindBy(xpath="//*[@data-auid='btnundefined']")public WebElement ReviewOrder_Btn;
	   @FindBy(xpath="//*[@data-auid='checkout_edit_payment']")public WebElement EditPayment_Link;
	   @FindBy(xpath="//*[text()='Change Billing Information']")public WebElement ChangeBillingInformation_Txt;
	   
	   @FindBy(xpath="//input[@id='paypal']/..")public WebElement rdPaypal;// PayPal_radioBtm;
	   @FindBy(xpath="//*[text()=' Checkout']/..")public WebElement PayPalCheckOut_Btn;
	@FindBy(xpath = "//*[contains(text(),'Save Payment Info for Later')]")
	public WebElement savePaymentInfoForLater_checkBox;
	 
	   
	   
	 //*************** Billing Information(End)
	   
	   //Payment(End)
	   
	//Footer Start
	@FindBy(xpath ="//*[@data-auid='checkout_footer_component']")public WebElement checkOut_CheckOutFooter; 
	//Footer End
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
	@FindBy(xpath="//*[text()='Add a New Shipping Address']")public WebElement Checkout_ShippingAddressAfterEdit_AddaNewShippingAddress;
//Sep7 CR-RK KER-3151
	
	//Start Sep10 KER-6576 CR-RK
		 @FindBy(xpath = "//*[@data-auid='checkout_footer_legal_link_Privacy Policy']")	public WebElement checkoutFooterLegalLinkPrivacyPolicy; // 10-September
		   @FindBy(xpath = "//*[@data-auid='checkout_footer_chat_now_link']")	public WebElement checkoutFooterChatNowLink; // 10-September
		   @FindBy(xpath = "//*[@data-auid='checkout_footer_contact_number_link_m']")	public WebElement checkoutFooterContactNumberLink_mobile; // 10-September
		   @FindBy(xpath = "//*[@data-auid='checkout_footer_legal_link_Terms & Conditions']")	public WebElement checkoutFooterLegalLinkTermsConditions; // 10-September
		   @FindBy(xpath = "//*[@data-auid='checkout_footer_legal_link_California Proposition 65 California Transparency in Supply Chains Act (SB 657)']")	public WebElement checkoutFooterLegalLinkCaliforniaProposition65; // 10-September
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
	   @FindBy(xpath = "//*[@data-auid='checkout_shipping_method_shipment_itemWHITEGLOVE']/p[2]")	public WebElement textBasicDeliverMessage; //SID 5-September
	   @FindBy(xpath="   (//*[@data-auid='btnc_btnCheckout'])[2]")public WebElement btnCheckOut_M; //SID 5-September
	   @FindBy(xpath="//*[contains(text(),'Basic Delivery')]/ancestor::button")public WebElement clickShippingWGDropDown; //SID 6-September
	   @FindBy(xpath="//*[contains(text(),'Basic Delivery')]/ancestor::button/parent::div//ul/li")public List<WebElement> WGServicesList; //SID 6-September
	   @FindBy(xpath="//*[contains(text(),'Basic Delivery')]/ancestor::button/parent::div//ul/li/*[contains(text(),'Scheduled')]")public WebElement WGScheduleService; //SID 5-September
	   @FindBy(xpath = "//*[@data-auid='checkout_shipping_method_shipment_itemWHITEGLOVETHRESHOLD']/p[1]")	public WebElement textScheduleDelivery; //SID 6-September
	   @FindBy(xpath = "//*[@data-auid='checkout_shipping_method_shipment_itemWHITEGLOVETHRESHOLD']/p[2]")	public WebElement textSchedukeDeliverMessage; //SID 6-September
	   @FindBy(xpath="//*[contains(text(),'Basic Delivery')]/ancestor::button/parent::div//ul/li/*[contains(text(),'Room')]")public WebElement WGRoomOfChoiceService; //SID 5-September
	   @FindBy(xpath = "//*[@data-auid='checkout_shipping_method_shipment_itemWHITEGLOVEROC']/p[1]")	public WebElement textRoomOfChoiceDelivery; //SID 6-September
	   @FindBy(xpath = "//*[@data-auid='checkout_shipping_method_shipment_itemWHITEGLOVEROC']/p[2]")	public WebElement textRoomOfChoiceDeliverMessage; //SID 6-September
	   @FindBy(xpath="(//*[@data-component='cart']//*[text()='Employee Discount applied'])[1]")public WebElement employeeDiscountItemLevel_CartPage; //SID 13-September
	   @FindBy(xpath="//*[@data-auid='checkout_order_summary_section']//*[contains(text(),'Employee Discount')]")public WebElement employeeDiscountOrderSummerPage; //SID 13-September
	   @FindBy(xpath="(//*[contains(@data-auid,'level3Category')])[1]//img")public WebElement dealTabProduct; //SID 5-September
	   
	  
	 
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
		   System.err.println(textSchedukeDeliverMessage.getText());
			assertTrue(isDisplayed(textScheduleDelivery));
			assertTrue(isDisplayed(textSchedukeDeliverMessage));	
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
       @FindBy(xpath = "//*[@id='creditCard']") public WebElement rdbtnCreditCard;
       @FindBy(xpath = "//*[text()='Credit Card']") public WebElement txtCreditCard;
       @FindBy(xpath = "//*[@id='PayPal']") public WebElement rdbtnPayPal;
       @FindBy(xpath = "//*[text()='PayPal']") public WebElement txtPaypal;
       @FindBy(xpath = "//*[@id='gpay'] | //*[@id='GooglePay']") public WebElement rdbtnGooglePay;
       @FindBy(xpath = "//*[text()='Google Pay']") public WebElement txtGooglePay;
       @FindBy(xpath = "//*[text()='Credit Card Number']") public WebElement txtCreditCardHeading;
       @FindBy(xpath = "//*[@id='creditcardField']") public WebElement txtCreditCardInput;
       @FindBy(xpath = "//*[@id='creditcardField']//following-sibling::span/img[contains(@src,'visa')]") public WebElement imgVisaCreditCardInput;
       @FindBy(xpath = "//*[text()='Expiration Date']") public WebElement txtExpirationDate;
       @FindBy(xpath = "//*[@id='expirationDate']") public WebElement txtExpirationDateInput;
       @FindBy(xpath = "//*[@placeholder='MM/YY']") public WebElement txtExpirationPlaceholders;
       @FindBy(xpath = "//*[@id='expirationDate']//parent::label//following-sibling::div/span[contains(text(),'Past expiration date')]") public WebElement txtErrorMsgForPastDates;
       @FindBy(xpath = "//*[@id='cvv']") public WebElement txtCVVInput;
       @FindBy(xpath = "//*[@data-auid='tooltipcheckout_payment_creditCard_cvv_tooltip']") public WebElement btnCVVToolTip;
       @FindBy(xpath = "//*[text()='The 3 digit code found on far right of signature box']") public WebElement txtCVVToolTipMsg;
      
       /**AG KER-3138 Ends**************************************/


	public void validatePaymentPage() {
		assertTrue(isDisplayed(secPayment));
		assertTrue(isDisplayed(secPaymentHeading));
		assertTrue(isEnabled(rdbtnCreditCard));
		assertTrue(isDisplayed(txtCreditCard));
		assertTrue(isEnabled(rdbtnPayPal));
		assertTrue(isDisplayed(txtPaypal));
		assertTrue(isEnabled(rdbtnGooglePay));
		assertTrue(isDisplayed(txtGooglePay));
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

	public void verifyCVVTooltip() {
		assertTrue(isDisplayed(btnCVVToolTip));
		moveHover(btnCVVToolTip);
		txtCVVToolTipMsg.isDisplayed();
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
	
	public void enterVisaCardDetails() {
		setInputText(txtCreditCardInput, webPropHelper.getTestDataProperty("CardVISA"));
		setInputText(txtExpirationDateInput, webPropHelper.getTestDataProperty("ExpDate"));
		setInputText(txtCVVInput,webPropHelper.getTestDataProperty("ThreeDigitCVV"));
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
	
	 // To be updated by Anuj
	   /**AG KER-3130 Starts**************************************/
    
	@FindBy(xpath="//*[text()='Unrecognized expiration date']")public WebElement unrecognizedExpirationDate_Txt; 
    
    
    /**AG KER-3130 Ends**************************************/
		 // To be updated by Anuj
	   /**AG KER-3130 Starts**************************************/
    
    @FindBy(xpath = "//*[@id='billingFirstName']//following-sibling::*[contains(text(),'Please')]") public WebElement txtBillingFirstNameErrorMsg;
    @FindBy(xpath = "//*[@id='billingLastName']//following-sibling::*[contains(text(),'Please')]") public WebElement txtBillingLastNameErrorMsg;
    @FindBy(xpath = "//*[@id='billingPhoneNumber']//following-sibling::*[contains(text(),'Please')]") public WebElement txtBillingPhoneNumberErrorMsg;
    @FindBy(xpath = "//*[@id='billingZipCode']//following-sibling::*[contains(text(),'Please')]") public WebElement txtBillingZipCodeErrorMsg;
    @FindBy(xpath = "//*[@id='billingCity']//following-sibling::*[contains(text(),'Required')]") public WebElement txtBillingCityErrorMsg;
    @FindBy(xpath = "//*[@id='email']//parent::div//following-sibling::*[contains(text(),'Please')]") public WebElement txtBillingEmailAddressForOrderConfirmationErrorMsg;
    @FindBy(xpath = "//*[@id='billingAddress1']//following-sibling::*[contains(text(),'Please')]") public WebElement txtBillingAddressErrorMsg;
    @FindBy(xpath = "//*[@id='billingState']//following-sibling::*[contains(text(),'Required')]") public WebElement txtBillingStateErrorMsg;
    @FindBy(xpath="//*[@id='billingAddress1']")public WebElement txtEmailAddressforOrderConfirmationInput;
    @FindBy(xpath="//*[@data-auid='btnPlace_Order']")public WebElement btnPlaceOrderPaymentPage;
    @FindBy(xpath = "//*[@id='billingZipCode']//following-sibling::*[contains(text(),'Invalid')]") public WebElement txtBillingZipCodeInvalidErrorMsg;
    @FindBy(xpath = "//*[@id='email']//parent::div//following-sibling::*[contains(text(),'Enter a valid email')]") public WebElement txtBillingEmailAddressForOrderConfirmationInvalidErrorMsg;
    //Only for SOF Item--Start KER-KER-7033 & KER-7031
    @FindBy(xpath="//*[contains(text(),'SPECIAL ORDER SHIP TO STORE')]")public WebElement ShipToStoreforSOF_Txt;
    @FindBy(xpath="//*[contains(text(),'You must be at least 18 years')]")public WebElement ShipToStoreforSOF_compliance_Txt;
    @FindBy(xpath="//*[@data-auid='btncheckout_ship_to_store_submit_button']")public WebElement ShipToStoreforSOF_Payment_Btn;
  //Only for SOF Item--Start KER-KER-7033 & KER-7031
    
    /**AG KER-3130 Ends**************************************/
    
  //****Start PayPal****//
    @FindBy(xpath = "//*[@id='closeCart']")
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
    @FindBy(xpath ="//*[@id='button']/*")
    public WebElement PayPalContinue_Btn;
    
    
    //****End PayPal****//


    public void billingAddressErrorMsgValidation() {
    	
    	assertTrue(isDisplayed(txtBillingFirstNameErrorMsg));
    	assertTrue(isDisplayed(txtBillingLastNameErrorMsg));
    	assertTrue(isDisplayed(txtBillingPhoneNumberErrorMsg));
    	assertTrue(isDisplayed(txtBillingZipCodeErrorMsg));
    	assertTrue(isDisplayed(txtBillingCityErrorMsg));
    	assertTrue(isDisplayed(txtBillingEmailAddressForOrderConfirmationErrorMsg));
    	assertTrue(isDisplayed(txtBillingAddressErrorMsg));
    	assertTrue(isDisplayed(txtBillingStateErrorMsg));
    	
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
 
    
}
