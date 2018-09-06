package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import freemarker.template.utility.NullArgumentException;

import org.apache.log4j.Logger;

public class R2_VERIFICATION_CHECKOUT_SD extends CommonActionHelper {

	R2_CheckOut_PO r2CheckoutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	private static final Logger logger = Logger.getLogger(R2_VERIFICATION_MYACCOUNT_SD.class);

	@Then("^Verify below Sub/Main Module of Checkout Page$")
	public void verify_below_Sub_Main_Module_of_Checkout_Page(DataTable arg1) throws Throwable {
		try {
			List<List<String>> elements = arg1.raw();
			for (int i = 1; i < elements.size(); i++) {
				String currentElement = elements.get(i).get(0);
				//////////////////////////// Starts CR-SK
				// ===============================================================================
				//// Checkout page
				// ===============================================================================
				if (currentElement.equalsIgnoreCase("checkOut_SignIn_lnk"))
					assertTrue(isDisplayed(r2CheckoutPo.checkout_SignIn_lnk));
				else if (currentElement.equalsIgnoreCase("checkout_CheckoutHeader_txt"))
					assertTrue(isDisplayed(r2CheckoutPo.checkout_CheckoutHeader_txt));
				else if (currentElement.equalsIgnoreCase("checkout_YouAreCheckingOutAsGuest_txt"))
					assertTrue(isDisplayed(r2CheckoutPo.txtSignInDescription));
				// ===============================================================================
				//// Check out > Shipping Address
				// ===============================================================================
				else if (currentElement.equalsIgnoreCase("checkout_ShippingAddress_ShippingAddressHeader_txt"))
					assertTrue(isDisplayed(r2CheckoutPo.checkout_ShippingAddress_ShippingAddressHeader_txt));
				else if (currentElement.equalsIgnoreCase("checkout_ShippingInformation_Header_txt"))
					assertTrue(isDisplayed(r2CheckoutPo.checkout_ShippingInformation_Header_txt));
				else if (currentElement.equalsIgnoreCase("checkOut_ShippingAddress_FirstName_txt"))
					assertTrue(isDisplayed(r2CheckoutPo.inputCheckoutFirstName));
				else if (currentElement.equalsIgnoreCase("checkOut_ShippingAddress_LastName_txt"))
					assertTrue(isDisplayed(r2CheckoutPo.inputCheckoutLasttName));
				else if (currentElement.equalsIgnoreCase("checkOut_ShippingAddress_PhoneNumber_txt"))
					assertTrue(isDisplayed(r2CheckoutPo.inputCheckoutPhoneNumber));
				else if (currentElement.equalsIgnoreCase("checkOut_ShippingAddress_Address_txt"))
					assertTrue(isDisplayed(r2CheckoutPo.inputCheckoutAddress));
				else if (currentElement.equalsIgnoreCase("checkOut_ShippingAddress_AddCompanyName_lnk"))
					assertTrue(isDisplayed(r2CheckoutPo.checkout_ShippingAddress_AddCompanyName_lnk));
				else if (currentElement.equalsIgnoreCase("checkOut_ShippingAddress_AddCompanyName_txt"))
					assertTrue(isDisplayed(r2CheckoutPo.checkout_ShippingAddress_AddCompanyName_txt));
				else if (currentElement.equalsIgnoreCase("checkOut_ShippingAddress_ZipCode_txt"))
					assertTrue(isDisplayed(r2CheckoutPo.inputCheckoutZipCode));
				else if (currentElement.equalsIgnoreCase("checkOut_ShippingAddress_City_txt"))
					assertTrue(isDisplayed(r2CheckoutPo.inputCheckoutCity));
				else if (currentElement.equalsIgnoreCase("checkOut_ShippingAddress_State_btn"))
					assertTrue(isDisplayed(r2CheckoutPo.checkout_ShippingAddress_State_btn));
				else if (currentElement.equalsIgnoreCase("checkOut_ShippingAddress_GoToShippingMethod_btn"))
					assertTrue(isDisplayed(r2CheckoutPo.btnGoToShippingMethod));
				else if (currentElement.equalsIgnoreCase("Checkout_ShippingAddress_Edit_lnk"))
					assertTrue(isDisplayed(r2CheckoutPo.btnEditShippingAddress));
				else if (currentElement.equalsIgnoreCase("checkout_ShippingAddress_txt"))
					assertTrue(isDisplayed(r2CheckoutPo.checkout_ShippingAddress_txt));
				
				//======================================
				// In-Store Pickup(Start)
				else if (currentElement.equalsIgnoreCase("MePickUp_Drpdwn"))
					assertTrue(isDisplayed(r2CheckoutPo.MePickUp_Drpdwn));
				else if (currentElement.equalsIgnoreCase("StorePickupAlternatesFirstName_input"))
					assertTrue(isDisplayed(r2CheckoutPo.PickupAltrFirstname_input));
				else if (currentElement.equalsIgnoreCase("StorePickupAlternatesLastName_input"))
					assertTrue(isDisplayed(r2CheckoutPo.PickupAltrLatstname_input));
				else if (currentElement.equalsIgnoreCase("StorePickupAlternatesEmail_input"))
					assertTrue(isDisplayed(r2CheckoutPo.PickupAltrEmail_input));
				else if (currentElement.equalsIgnoreCase("StorePickupAlternatesPhoneNumber_input"))
					assertTrue(isDisplayed(r2CheckoutPo.PickupAltrPhone_input));
				else if (currentElement.equalsIgnoreCase("ErrorMsgRequired"))
					assertTrue(isDisplayed(r2CheckoutPo.errorMsgRequired));
				
				else if (currentElement.equalsIgnoreCase("PickupLocation_Lbl"))
					assertTrue(isDisplayed(r2CheckoutPo.PickupLocation_Lbl));
				else if (currentElement.equalsIgnoreCase("StoreNameandAddress_Txt"))
					assertTrue(isDisplayed(r2CheckoutPo.StoreNameandAddress_Txt));
				else if (currentElement.equalsIgnoreCase("ChangeLocation_Lnk"))
					assertTrue(isDisplayed(r2CheckoutPo.ChangeLocation_Lnk));
				else if (currentElement.equalsIgnoreCase("ItemsForPickup_Itemcount_Txt"))
					assertTrue(isDisplayed(r2CheckoutPo.ItemsForPickup_Itemcount_Txt));
				else if (currentElement.equalsIgnoreCase("ItemsForPickup_Itemthumbnail_Txt"))
					assertTrue(isDisplayed(r2CheckoutPo.ItemsForPickup_thumbnail_Txt));
				else if (currentElement.equalsIgnoreCase("SeeInStorePickupInstructions_Dd"))
					assertTrue(isDisplayed(r2CheckoutPo.SeeInStorePickupInstructionsl_Dd));
				else if (currentElement.equalsIgnoreCase("AlternatePhoneNumberErrorMsg_Txt"))
					assertTrue(isDisplayed(r2CheckoutPo.AlternatePhoneNumberErrorMsg_Txt));

				else if (currentElement.equalsIgnoreCase("SeeInStorePickupInstructions_Msg"))
					assertTrue(isDisplayed(r2CheckoutPo.SeeInStorePickupInstructions_Msg));
				// In-Store Pickup(End)
				
	//==============================================
				// ===============================================================================
				//// Check out > Shipping Method
				// ===============================================================================
				else if (currentElement.equalsIgnoreCase("checkout_ShippingMethod_ShippingMethodHeader_txt"))
					assertTrue(isDisplayed(r2CheckoutPo.checkout_ShippingMethod_ShippingMethodHeader_txt));
				else if (currentElement.equalsIgnoreCase("checkout_ShippingMethod_Edit_lnk"))
					assertTrue(isDisplayed(r2CheckoutPo.checkout_ShippingMethod_Edit_lnk));
				else if (currentElement.equalsIgnoreCase("checkout_ShippingMethod_Shipment_txt"))
					assertTrue(isDisplayed(r2CheckoutPo.checkout_ShippingMethod_Shipment_txt));
				else if (currentElement.equalsIgnoreCase("checkout_ShippingMethod_Items_txt"))
					assertTrue(isDisplayed(r2CheckoutPo.checkout_ShippingMethod_Items_txt));
				else if (currentElement.equalsIgnoreCase("checkout_ShippingMethod_ItemImage_img"))
					assertTrue(isDisplayed(r2CheckoutPo.checkout_ShippingMethod_ItemImage_img));
				else if (currentElement.equalsIgnoreCase("checkout_ShippingMethod_ShippingMethodType_btn"))
					assertTrue(isDisplayed(r2CheckoutPo.checkout_ShippingMethod_ShippingMethodType_btn));
				else if (currentElement.equalsIgnoreCase("checkout_ShippingMethod_GoToPayment_btn"))
					assertTrue(isDisplayed(r2CheckoutPo.checkout_ShippingMethod_GoToPayment_btn));
				else if (currentElement.equalsIgnoreCase("checkout_ShippingMethod_ShippingDetails"))
					assertTrue(isDisplayed(r2CheckoutPo.checkout_ShippingMethod_ShippingDetails));

				// ===============================================================================
				//// Check out > Sign In page
				// ===============================================================================
				else if (currentElement.equalsIgnoreCase("Checkout_SignIn_EmailAddress_txt"))
					assertTrue(isDisplayed(r2CheckoutPo.inputEmailCheckOut));
				else if (currentElement.equalsIgnoreCase("Checkout_SignIn_ForgotYourPassword_lnk"))
					assertTrue(isDisplayed(r2CheckoutPo.checkout_SignIn_ForgotYourPassword_lnk));
				else if (currentElement.equalsIgnoreCase("Checkout_SignIn_SignIn_btn"))
					assertTrue(isDisplayed(r2CheckoutPo.checkout_SignIn_SignIn_btn));
				else if (currentElement.equalsIgnoreCase("Checkout_SignIn_Password_txt"))
					assertTrue(isDisplayed(r2CheckoutPo.inputPasswordCheckOut));
				//////////////////////////// Ends CR-SK

				//////////////////////////// Starts CR-RKA
				else if (currentElement.equalsIgnoreCase("OrderSummary_Txt"))
					assertTrue(isDisplayed(r2CheckoutPo.OrderSummary_Txt));
				else if (currentElement.equalsIgnoreCase("Subtotal_txt"))
					assertTrue(isDisplayed(r2CheckoutPo.txtSubTotal));
				else if (currentElement.equalsIgnoreCase("Subtotal_price"))
					assertTrue(isDisplayed(r2CheckoutPo.SubTotalPrice_Txt));
				else if (currentElement.equalsIgnoreCase("Shipping_Txt"))
					assertTrue(isDisplayed(r2CheckoutPo.Shipping_Txt));
				else if (currentElement.equalsIgnoreCase("ShippingPrice_Txt"))
					assertTrue(isDisplayed(r2CheckoutPo.ShippingPrice_Txt));
				else if (currentElement.equalsIgnoreCase("Estimatedshippint_txt"))
					assertTrue(isDisplayed(r2CheckoutPo.txtEsitmatedShipping));
				else if (currentElement.equalsIgnoreCase("EstimatedShippingPrice_txt"))
					assertTrue(isDisplayed(r2CheckoutPo.EstimatedShippingPrice_txt));
				else if (currentElement.equalsIgnoreCase("Taxes_Txt"))
					assertTrue(isDisplayed(r2CheckoutPo.Taxes_Txt));
				else if (currentElement.equalsIgnoreCase("TaxesPrice_Txt"))
					assertTrue(isDisplayed(r2CheckoutPo.TaxesPrice_Txt));
				else if (currentElement.equalsIgnoreCase("EstimatedTax_Txt"))
					assertTrue(isDisplayed(r2CheckoutPo.EstimatedTax_Txt));
				else if (currentElement.equalsIgnoreCase("EstimatedPrice_Txt"))
					assertTrue(isDisplayed(r2CheckoutPo.txtEstimatedTax));
				else if (currentElement.equalsIgnoreCase("TotalDiscount_Txt"))
					assertTrue(isDisplayed(r2CheckoutPo.txtTotalDiscount));
				else if (currentElement.equalsIgnoreCase("TotalDiscountPrice_Txt"))
					assertTrue(isDisplayed(r2CheckoutPo.TotalDiscountPrice_Txt));
				else if (currentElement.equalsIgnoreCase("Total_price"))
					assertTrue(isDisplayed(r2CheckoutPo.txtTotal));
				else if (currentElement.equalsIgnoreCase("Total_txt"))
					assertTrue(isDisplayed(r2CheckoutPo.Total_txt));
				
				//*****ITems under Order Summary (Start)
				
				else if (currentElement.equalsIgnoreCase("Item_Txt"))
					assertTrue(isDisplayed(r2CheckoutPo.txtItems));
				else if (currentElement.equalsIgnoreCase("ShippingItemAvailable_Txt"))
					assertTrue(isDisplayed(r2CheckoutPo.ShippingItemAvailable_Txt));
				else if (currentElement.equalsIgnoreCase("ImageShippingItemAvailable"))
					assertTrue(isDisplayed(r2CheckoutPo.ImageShippingItemAvailable));
				else if (currentElement.equalsIgnoreCase("NameShippingItemAvailable_Txt"))
					assertTrue(isDisplayed(r2CheckoutPo.NameShippingItemAvailable_Txt));
				else if (currentElement.equalsIgnoreCase("Color_Txt"))
					assertTrue(isDisplayed(r2CheckoutPo.Color_Txt));
				else if (currentElement.equalsIgnoreCase("ColorInput_Txt"))
					assertTrue(isDisplayed(r2CheckoutPo.ColorInput_Txt));
				else if (currentElement.equalsIgnoreCase("Size_Txt"))
					assertTrue(isDisplayed(r2CheckoutPo.Size_Txt));
				else if (currentElement.equalsIgnoreCase("SizeInput_Txt"))
					assertTrue(isDisplayed(r2CheckoutPo.SizeInput_Txt));
				else if (currentElement.equalsIgnoreCase("Quantity_Txt"))
					assertTrue(isDisplayed(r2CheckoutPo.Quantity_Txt));
				else if (currentElement.equalsIgnoreCase("QuantityInput_Txt"))
					assertTrue(isDisplayed(r2CheckoutPo.QuantityInput_Txt));
				else if (currentElement.equalsIgnoreCase("PriceShippingItemAvailable_Txt"))
					assertTrue(isDisplayed(r2CheckoutPo.PriceShippingItemAvailable_Txt));
				else if (currentElement.equalsIgnoreCase("EditMyCart_Link"))
					assertTrue(isDisplayed(r2CheckoutPo.btnEditCart));
                else if (currentElement.equalsIgnoreCase("DetailOrderSummary_txt"))
                    assertTrue(isDisplayed(r2CheckoutPo.DetailOrderSummary_txt));

				//**********ITems under Order Summary (End)
				//Order Summary(End)
				
				//******************************************************************************************************************************************
				//Payment(Start)
				 
				//******************Payment Method(Start)
				
				
				else if (currentElement.equalsIgnoreCase("PaymentHeader_Txt"))
					assertTrue(isDisplayed(r2CheckoutPo.PaymentHeader_Txt));
				else if (currentElement.equalsIgnoreCase("PaymentMethodHeader_Txt"))
					assertTrue(isDisplayed(r2CheckoutPo.PaymentMethodHeader_Txt));
				else if (currentElement.equalsIgnoreCase("CreditCard_radioBtn"))
						assertTrue(isDisplayed(r2CheckoutPo.CreditCard_radioBtn));
					else if (currentElement.equalsIgnoreCase("PayPal_radioBtn"))
						assertTrue(isDisplayed(r2CheckoutPo.PayPal_radioBtn));
					else if (currentElement.equalsIgnoreCase("CreditCardNumber_Input"))
						assertTrue(isDisplayed(r2CheckoutPo.CreditCardNumber_Input));
					else if (currentElement.equalsIgnoreCase("ExpirationDate_Input"))
						assertTrue(isDisplayed(r2CheckoutPo.ExpirationDate_Input));
					else if (currentElement.equalsIgnoreCase("Cvv_Input"))
						assertTrue(isDisplayed(r2CheckoutPo.Cvv_Input));
					else if (currentElement.equalsIgnoreCase("CvvToolTip"))
						assertTrue(isDisplayed(r2CheckoutPo.CvvToolTip));
					else if (currentElement.equalsIgnoreCase("UnrecognizedCardNumber_Txt"))
						assertTrue(isDisplayed(r2CheckoutPo.UnrecognizedCardNumber_Txt));
					else if (currentElement.equalsIgnoreCase("PastExpirationDate_Txt"))
						assertTrue(isDisplayed(r2CheckoutPo.PastExpirationDate_Txt));
					else if (currentElement.equalsIgnoreCase("PleaseEnteRaValidSecurityCode_Txt"))
						assertTrue(isDisplayed(r2CheckoutPo.PleaseEnteRaValidSecurityCode_Txt));
					else if (currentElement.equalsIgnoreCase("ChooseCreditcard_Dd"))
						assertTrue(isDisplayed(r2CheckoutPo.chooseCreditcard_Dd));
				//*****************Payment Method (END)
					
				//****************Gift Card(Start)	
					
					else if (currentElement.equalsIgnoreCase("Plus_GiftCard"))
						assertTrue(isDisplayed(r2CheckoutPo.plusIconGiftCard));
					else if (currentElement.equalsIgnoreCase("Hide_GiftCard"))
						assertTrue(isDisplayed(r2CheckoutPo.minusIconGiftCard));
					else if (currentElement.equalsIgnoreCase("GiftCardNumber_Txt"))
						assertTrue(isDisplayed(r2CheckoutPo.txtGiftcardNumber));
					else if (currentElement.equalsIgnoreCase("GiftCardNumber_Input"))
						assertTrue(isDisplayed(r2CheckoutPo.inputGiftcardNumber));
					else if (currentElement.equalsIgnoreCase("GiftCardNumber_Tooltip"))
						assertTrue(isDisplayed(r2CheckoutPo.toolTip_giftCard));
					else if (currentElement.equalsIgnoreCase("InvalidGiftCardNumber_Txt"))
						assertTrue(isDisplayed(r2CheckoutPo.txtInvalidGiftcard));
					else if (currentElement.equalsIgnoreCase("Pin_Txt"))
						assertTrue(isDisplayed(r2CheckoutPo.txtPin));
					else if (currentElement.equalsIgnoreCase("Pin_Input"))
						assertTrue(isDisplayed(r2CheckoutPo.inputPinNumber));
					else if (currentElement.equalsIgnoreCase("toolTip_pin"))
						assertTrue(isDisplayed(r2CheckoutPo.toolTip_pin));
					else if (currentElement.equalsIgnoreCase("InvalidGiftCardPin_Txt"))
						assertTrue(isDisplayed(r2CheckoutPo.txtInvalidPin));
					else if (currentElement.equalsIgnoreCase("Apply_Btn"))
						assertTrue(isDisplayed(r2CheckoutPo.btnCheckoutApply));
				//****************Gift Card(End)
				
				//*************** Billing Information(Start)
				
					else if (currentElement.equalsIgnoreCase("BillingInformation_Txt"))
						assertTrue(isDisplayed(r2CheckoutPo.BillingInformation_Txt));
					else if (currentElement.equalsIgnoreCase("SameAsShippingAddress_Txt"))
						assertTrue(isDisplayed(r2CheckoutPo.SameAsShippingAddress_Txt));
					else if (currentElement.equalsIgnoreCase("SameAsShippingAddress_checkBox"))
						assertTrue(isDisplayed(r2CheckoutPo.SameAsShippingAddress_checkBox));
					else if (currentElement.equalsIgnoreCase("FirstName_Input"))
						assertTrue(isDisplayed(r2CheckoutPo.FirstName_Input));
					else if (currentElement.equalsIgnoreCase("LastName_Input"))
						assertTrue(isDisplayed(r2CheckoutPo.LastName_Input));
					else if (currentElement.equalsIgnoreCase("PhoneNumber_Input"))
						assertTrue(isDisplayed(r2CheckoutPo.PhoneNumber_Input));
					else if (currentElement.equalsIgnoreCase("SendSMSTextUpdatesAboutMyOrder_checkbox"))
						assertTrue(isDisplayed(r2CheckoutPo.SendSMSTextUpdatesAboutMyOrder_checkbox));
					else if (currentElement.equalsIgnoreCase("Adderss_Input"))
						assertTrue(isDisplayed(r2CheckoutPo.Adderss_Input));
					else if (currentElement.equalsIgnoreCase("AddCompanyNameAptNumberEtcOptional_Txt"))
						assertTrue(isDisplayed(r2CheckoutPo.AddCompanyNameAptNumberEtcOptional_Txt));
					else if (currentElement.equalsIgnoreCase("AddCompanyNameAptNumberEtcOptional_Input"))
						assertTrue(isDisplayed(r2CheckoutPo.AddCompanyNameAptNumberEtcOptional_Input));
					else if (currentElement.equalsIgnoreCase("ZipCode_Input"))
						assertTrue(isDisplayed(r2CheckoutPo.ZipCode_Input));
					else if (currentElement.equalsIgnoreCase("City_Input"))
						assertTrue(isDisplayed(r2CheckoutPo.city_Input));
					else if (currentElement.equalsIgnoreCase("State_DD"))
						assertTrue(isDisplayed(r2CheckoutPo.State_DD));
					else if (currentElement.equalsIgnoreCase("EmailAddressforOrderConfirmation_Input"))
						assertTrue(isDisplayed(r2CheckoutPo.EmailAddressforOrderConfirmation_Input));
					else if (currentElement.equalsIgnoreCase("SignuptogetHotDeals_checkBox"))
						assertTrue(isDisplayed(r2CheckoutPo.SignuptogetHotDeals_checkBox));
					else if (currentElement.equalsIgnoreCase("ReviewOrder_Btn"))
						assertTrue(isDisplayed(r2CheckoutPo.ReviewOrder_Btn));
						else if (currentElement.equalsIgnoreCase("EditPayment_Link"))
							assertTrue(isDisplayed(r2CheckoutPo.EditPayment_Link));
						else if (currentElement.equalsIgnoreCase("ChangeBillingInformation_Txt"))
							assertTrue(isDisplayed(r2CheckoutPo.ChangeBillingInformation_Txt));
						else if (currentElement.equalsIgnoreCase("rdPaypal"))
						assertTrue(isDisplayed(r2CheckoutPo.rdPaypal));
					else if (currentElement.equalsIgnoreCase("PayPalCheckOut_Btn"))
						assertTrue(isDisplayed(r2CheckoutPo.PayPalCheckOut_Btn));
		
				//*************** Billing Information(End)
				//Payment(End)
				
				//**********************************************************************************************************************************
                    //*********************MOBILE START ***************************
					else if (currentElement.equalsIgnoreCase("EditMyCart_Link_M"))
						assertTrue(isDisplayed(r2CheckoutPo.EditMyCart_Link_M));
				
				//*********************MOBILE END*************************
				
				
				
				// else if (currentElement.equalsIgnoreCase("temp"))
				// assertTrue(isDisplayed(r2CheckoutPo.temp));

				else {
					logger.error("Element <" + currentElement + "> is not found in the SD list.");
					throw new NullArgumentException("Element <" + currentElement + "> is not found in the SD list.");
				}

			}
		} catch (NullPointerException e) {
			logger.error("This test-step has been failed");
		}
	}

}
