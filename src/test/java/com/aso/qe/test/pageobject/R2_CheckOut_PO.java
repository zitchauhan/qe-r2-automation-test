package com.aso.qe.test.pageobject;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;

public class R2_CheckOut_PO extends CommonActionHelper 
{
	
	/**************** START LOCAL OBJETCS AND DECLARATIONS***********************/
	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);
	public String nullvalue = "";
	/*************** END LOCAL OBJETCS AND DECLARATIONS ************************/

	/***************************** START XPAHTS**********************************/
	// start KER-3392 CR-RK
	@FindBy(xpath = "//*[@data-auid='checkout_unauth_description_signin_link']")
	public WebElement txtSignInDescription;

	@FindBy(xpath = "//*[contains(text(),'Sign In')]")
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
	@FindBy(xpath = "//*[@data-auid='checkout_header_goto_cart_link']")
	public WebElement btnMiniCart;

	@FindBy(xpath = "//*[@data-auid='checkout_header_logo_target_link']")
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
	   @FindBy(xpath="(//button[@type='button'])[1]/..")
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
	   
	 //*****Start Modify Pickup Location*********//
//
	   
	
//*************************CR-RKA********************************************
		 //Order Summary(Start)
		
		
		@FindBy(xpath="//*[@data-auid='checkout_order_summary_section']//*[contains(text(),'Order Summary')]")public WebElement OrderSummary_Txt;
		@FindBy(xpath = "//*[text()='Subtotal']/..")public WebElement txtSubTotal;//subtotal_txt
		@FindBy(xpath="//*[text()='Subtotal']/../*[2]")public WebElement SubTotalPrice_Txt;//subtotal_price
		
		@FindBy(xpath="//*[@data-auid='checkout_order_summary_section']//*[contains(text(),'Shipping')]")public WebElement Shipping_Txt;
		@FindBy(xpath="//*[@data-auid='checkout_order_summary_section']//*[contains(text(),'Shipping')]/following-sibling::*[1]")public WebElement ShippingPrice_Txt;
		@FindBy(xpath = "//*[text()='Estimated Shipping']/..")public WebElement txtEsitmatedShipping;//estimatedshippint_txt
		@FindBy(xpath="//*[text()='Estimated Shipping']/../*[2]")public WebElement EstimatedShippingPrice_txt;//estimatedshipping_price
		
		
		@FindBy(xpath="//*[contains(text(),'Taxes')]")public WebElement Taxes_Txt;//taxprice_txt
		@FindBy(xpath="//*[contains(text(),'Taxes')]/following-sibling::*[1]")public WebElement TaxesPrice_Txt;//taxprice
		@FindBy(xpath="//*[contains(text(),'Estimated Taxes')]")public WebElement EstimatedTax_Txt;
		@FindBy(xpath = "//*[contains(text(),'Estimated Taxes')]/following-sibling::*[1]")public WebElement txtEstimatedTax;//estimatedPrice_Txt
		
		
		@FindBy(xpath ="//*[text()='Total Discount']")public WebElement txtTotalDiscount;
		@FindBy(xpath="//*[text()='Total Discount']/following-sibling::*[1]")public WebElement TotalDiscountPrice_Txt;
		
		@FindBy(xpath = "//*[text()= 'Total']/following-sibling::div[1]")public WebElement txtTotal;//Total_price
		@FindBy(xpath="//*[@data-auid='checkout_order_summary_section']//*[text()='Total']")public WebElement Total_txt;
		
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
		    
		       //**********ITems under Order Summary (End)
		//Order Summary(End)
		
		//*********************************************************************************************************************************************
		 //Payment(Start)
		 
		//******************Payment Method(Start)
		@FindBy(xpath="//*[@data-auid='checkout_payment']/preceding::*[1]")public WebElement PaymentHeader_Txt;
		@FindBy(xpath="//*[@data-auid='checkout_payment']//*[contains(text(),'PAYMENT METHOD')]")public WebElement PaymentMethodHeader_Txt;
		@FindBy(xpath="//*[text()='Credit Card']/preceding::*[2]")public WebElement CreditCard_radioBtn;
		@FindBy(xpath="//*[text()='PayPal']/preceding::*[2]")public WebElement PayPal_radioBtn;
		@FindBy(xpath="//*[text()='Credit Card Number']/following::*[1]")public WebElement CreditCardNumber_Input;
		@FindBy(xpath="//*[text()='Expiration Date']/following::*[1]")public WebElement ExpirationDate_Input;
		@FindBy(xpath="//*[text()='CVV']/following::*[3]")public WebElement Cvv_Input;
		@FindBy(xpath="//*[@data-auid='tooltipcheckout_payment_creditCard_cvv_tooltip']")public WebElement CvvToolTip;
		@FindBy(xpath="//*[text()='Unrecognized card number']")public WebElement UnrecognizedCardNumber_Txt; 
		@FindBy(xpath="//*[text()='Past expiration date']")public WebElement PastExpirationDate_Txt;
		@FindBy(xpath="//*[text()='Please enter a valid security code']")public WebElement PleaseEnteRaValidSecurityCode_Txt; 
		@FindBy(xpath="//*[contains(text(),'Visa Ending In')]")public WebElement chooseCreditcard_Dd; 

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
	   
	   
	 //*************** Billing Information(End)
	   
	   //Payment(End)
	   
	//************************  MOBILE***********************
	   @FindBy(xpath="(//*[@data-auid='checkout_order_summary_edit_cart_link'])[1]/*")public WebElement EditMyCart_Link_M;
	
	   //*********************MOBILE END********************
	   
	   /***************************** END XPAHTS********************************/
	
	/***************************** START METHODS********************************/
	// Start KER-2927 CR-SK
	public float getEstimatedTaxOnCheckoutPage() {
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
	
	public void verifyShippingAndBillingAddressAreSame() throws InterruptedException {
		
		Thread.sleep(10000);
		waitForElement(shippingAddressFirst_LastName);
		assertEquals(getText(shippingAddressFirst_LastName), getText(billingAddressFirst_LastName));
		assertEquals(getText(shippingAddressphoneNumber).substring(0, 8), getText(billingZip_Phone).substring(7, 15));
		assertEquals(getText(shippingCityCountryName).subSequence(0, 15), getText(billingCityCountryName).substring(0, 15));
	}
	
	
	
	/***************************** END METHODS*********************************/
}
