package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
//import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_FindStore_PO;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_SearchProduct_PO;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import freemarker.template.utility.NullArgumentException;

import org.apache.log4j.Logger;

public class R2_VERIFICATION_CART_SD extends CommonActionHelper {
	public R1_FindStore_PO findStorePO;
	public static R1_SearchProduct_PO searchProductPO;
	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);

	R2_Cart_PO r2CartPo = PageFactory.initElements(driver, R2_Cart_PO.class);
	R2_MyAccount_PO r2MyAccountPo = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	private static final Logger logger = Logger.getLogger(R2_VERIFICATION_CART_SD.class);

	// @When("^User searches a product \"(.*?)\" and navigates to PDP$")
	// public void user_searches_a_product_and_navigates_to_PDP(String arg1) throws
	// Throwable
	// {
	// //////////////////////-hitain-CR----------->
	//
	// Common_Web_SD.globalElementHeader.navigateL2HeaderToPLP();
	// assertTrue(clickOnButton(r2SanityPo.AS_productPLP1_Mobile));
	// Common_Web_SD.globalElementHeader.verifyThePDPPage();
	//
	// /*if("mobile".equalsIgnoreCase(testtype))
	// {
	// //Common_Web_SD.globalElementHeader.clickOnBurgerMenu();
	// Thread.sleep(2000);
	// assertTrue(clickOnButton(Common_Web_SD.globalElementHeader.btnClothingCategory));
	// //4Sep
	// Thread.sleep(2000);
	// assertTrue(clickOnButton(r2SanityPo.AS_btnMen_Clothing_Shop));
	// Thread.sleep(2000);
	// assertTrue(clickOnButton(Common_Web_SD.globalElementHeader.txtToNavigateMensBurgerMenuMobile));
	// Thread.sleep(4000);
	// assertTrue(clickOnButton(r2SanityPo.AS_productPLP1_Mobile));
	// }
	// else
	// {
	// Thread.sleep(2000);
	// assertTrue(clickOnButton(Common_Web_SD.globalElementHeader.btnShopCategory));
	// Thread.sleep(2000);
	// Actions hover = new Actions(getDriver());
	// hover.moveToElement(Common_Web_SD.globalElementHeader.btnClothingCategory).build().perform();
	// Thread.sleep(2000);
	// assertTrue(clickOnButton(Common_Web_SD.globalElementHeader.btnMenClothingShop));
	// Thread.sleep(2000);
	// waitForElement(r2SanityPo.AS_secCategory_CLP);
	// assertTrue(clickOnButton(r2SanityPo.AS_secCategory_CLP));
	// Thread.sleep(3000);
	// waitForElement(r2SanityPo.AS_productPLP1);
	// assertTrue(clickOnButton(r2SanityPo.AS_productPLP1));
	// Thread.sleep(3000);
	// Common_Web_SD.globalElementHeader.verifyThePDPPage();
	// }
	// */
	// }

	@Then("Verify below Sub/Main Module of Cart Page$")
	public void verify_below_Sub_Main_Module_of_Cart_Page(DataTable arg1) throws Throwable {
		String currentElement = null;

		try {
			List<List<String>> elements = arg1.raw();
			for (int i = 1; i < elements.size(); i++) {
				currentElement = elements.get(i).get(0);

				// **************************************%%% WEB %%%%**************************
				// //Your Cart (Start)

				if (currentElement.equalsIgnoreCase("ContinueShopping_Link"))
					assertTrue(isDisplayed(r2CartPo.link_ContinueShopping));

				else if (currentElement.equalsIgnoreCase("YourCart_Header"))
					assertTrue(isDisplayed(r2CartPo.txt_YourCart));
				else if (currentElement.equalsIgnoreCase("Items_txt"))
					assertTrue(isDisplayed(r2CartPo.txt_items));
				else if (currentElement.equalsIgnoreCase("TotalYourCart_txt"))
					assertTrue(isDisplayed(r2CartPo.txt_totalYourCart));
				else if (currentElement.equalsIgnoreCase("totalYourCart"))
					assertTrue(isDisplayed(r2CartPo.txt_totalYourCart));
				else if (currentElement.equalsIgnoreCase("checkOutYourCart_Btn"))
					assertTrue(isDisplayed(r2CartPo.btnCartCheckout));
				// Your Cart (End)
				// *****************************************************************************************************
				// Your Cart item details (Start)
				else if (currentElement.equalsIgnoreCase("Image_ITemInCart"))
					assertTrue(isDisplayed(r2CartPo.img_ProductInCart));
				else if (currentElement.equalsIgnoreCase("CartProductName_Link"))
					assertTrue(isDisplayed(r2CartPo.lnkProducttext));
				else if (currentElement.equalsIgnoreCase("color_input_txt"))
					assertTrue(isDisplayed(r2CartPo.txtPrdColor));
				else if (currentElement.equalsIgnoreCase("Size_input_txt"))
					assertTrue(isDisplayed(r2CartPo.txtPrdSize));
				else if (currentElement.equalsIgnoreCase("ShipToMe_radioBtn"))
					assertTrue(isDisplayed(r2CartPo.rbShipToMe));
				else if (currentElement.equalsIgnoreCase("InStorePickup_FREE_radioBtn"))
					assertTrue(isDisplayed(r2CartPo.rbInStorePickUp));
				else if (currentElement.equalsIgnoreCase("ShipToStore_radioBtn"))
					assertTrue(isDisplayed(r2CartPo.ShipToStore_radioBtn));
				else if (currentElement.equalsIgnoreCase("Quantity_input_txt"))
					assertTrue(isDisplayed(r2CartPo.input_Quantity));
				else if (currentElement.equalsIgnoreCase("Quantity_txt"))
					assertTrue(isDisplayed(r2CartPo.txt_Quantity));
				else if (currentElement.equalsIgnoreCase("toolTip_icon"))
					assertTrue(isDisplayed(r2CartPo.iconTolltip));
				else if (currentElement.equalsIgnoreCase("AddToWishList_btn"))
					assertTrue(isDisplayed(r2CartPo.btn_AddToWishList));
				else if (currentElement.equalsIgnoreCase("RemoveFromCart_Btn"))
					assertTrue(isDisplayed(r2CartPo.btnRemoveCart));
				else if (currentElement.equalsIgnoreCase("CartItemAmount_txt"))
					assertTrue(isDisplayed(r2CartPo.txt_CartItemAmount));
				else if (currentElement.equalsIgnoreCase("Color_txt"))
					assertTrue(isDisplayed(r2CartPo.txtColor));
				else if (currentElement.equalsIgnoreCase("Size_txt"))
					assertTrue(isDisplayed(r2CartPo.txtSize));
				else if (currentElement.equalsIgnoreCase("EstArrival_txt"))
					assertTrue(isDisplayed(r2CartPo.txtEstArrival));

				// Your Cart item details Finish
				// ****************************************************************************************************
				// Order Summary (Start)
				else if (currentElement.equalsIgnoreCase("OrderSummary_Header"))
					assertTrue(isDisplayed(r2CartPo.txt_OrderSummary));
				else if (currentElement.equalsIgnoreCase("Plus_AddPromoCode_btn"))
					assertTrue(isDisplayed(r2CartPo.btn_Plus_AddPromoCode));
				else if (currentElement.equalsIgnoreCase("Minus_HidePromo_btn"))
					assertTrue(isDisplayed(r2CartPo.btn_Minus_HidePromo));

				else if (currentElement.equalsIgnoreCase("EnterPromoCode_input"))
					assertTrue(isDisplayed(r2CartPo.input_EnterPromoCode));
				else if (currentElement.equalsIgnoreCase("Submit_PromoCode_btn"))
					assertTrue(isDisplayed(r2CartPo.btn_Submit_PromoCode));
				else if (currentElement.equalsIgnoreCase("checkOut_OrderSummary_btn"))
					assertTrue(isDisplayed(r2CartPo.btn_checkOut_OrderSummary));
				else if (currentElement.equalsIgnoreCase("Total_txt"))
					assertTrue(isDisplayed(r2CartPo.txtTotal));
				else if (currentElement.equalsIgnoreCase("SubTotal_txt"))
					assertTrue(isDisplayed(r2CartPo.txtSubtotalCart));

				else if (currentElement.equalsIgnoreCase("EstimatedTaxes_txt"))
					assertTrue(isDisplayed(r2CartPo.txtEstimatedTaxesCart));

				else if (currentElement.equalsIgnoreCase("EstimatedShipping_txt"))
					assertTrue(isDisplayed(r2CartPo.txtEstimatedShippingCart));
				else if (currentElement.equalsIgnoreCase("EstimatedShippingPrice_Txt"))
					assertTrue(isDisplayed(r2CartPo.txt_EstimatedShipping));
				else if (currentElement.equalsIgnoreCase("ZipCode_txt"))
					assertTrue(isDisplayed(r2CartPo.lnkChangeZipCode));
				else if (currentElement.equalsIgnoreCase("ErrorMsgLimitedStack"))
					assertTrue(isDisplayed(r2CartPo.ErrorMsgLimitedStack));
				else if (currentElement.equalsIgnoreCase("Discount_Txt"))
					assertTrue(isDisplayed(r2CartPo.discount_Txt));
				else if (currentElement.equalsIgnoreCase("RemovePromocode_Btn"))
					assertTrue(isDisplayed(r2CartPo.RemovePromocode_Btn));

				else if (currentElement.equalsIgnoreCase("FirstQuantityPrice_Txt"))
					assertTrue(isDisplayed(r2CartPo.FirstQuantityPrice_Txt));
				else if (currentElement.equalsIgnoreCase("SecondQuantityPrice_Txt"))
					assertTrue(isDisplayed(r2CartPo.SecondQuantityPrice_Txt));

				// Order Summary Finish
				// ************************************************************************************************
				// Calculate Shipping (Start)
				else if (currentElement.equalsIgnoreCase("ZipCode_input_txt"))
					assertTrue(isDisplayed(r2CartPo.inputZipCode));
				else if (currentElement.equalsIgnoreCase("Submit_CalculateShipping_btn"))
					assertTrue(isDisplayed(r2CartPo.btnCartSubmit));
				else if (currentElement.equalsIgnoreCase("CalculateShipping_txt"))
					assertTrue(isDisplayed(r2CartPo.txt_CalculateShipping));
				else if (currentElement.equalsIgnoreCase("EnterYourZIPcodeforShippingCost_txt"))
					assertTrue(isDisplayed(r2CartPo.txt_EnterYourZIPcodeforShippingCost));
				else if (currentElement.equalsIgnoreCase("X_btn"))
					assertTrue(isDisplayed(r2CartPo.btn_x));

				// Calculate Shipping Finish
				// **********************************************************************************************
				// Shop With Confidance (Start)
				else if (currentElement.equalsIgnoreCase("ShopWithConfidance_txt"))
					assertTrue(isDisplayed(r2CartPo.txt_ShopWithConfidance));

				// Shop With Confidance Finish
				// *******************************************************************************************
				// Free In Store Return (Start)
				else if (currentElement.equalsIgnoreCase("FreeInStoreReturns_txt"))
					assertTrue(isDisplayed(r2CartPo.txt_FreeInStoreReturns));
				else if (currentElement.equalsIgnoreCase("ShippingPolicy_link"))
					assertTrue(isDisplayed(r2CartPo.lnkShippingPolicy));
				else if (currentElement.equalsIgnoreCase("ReturnPolicy_link"))
					assertTrue(isDisplayed(r2CartPo.lnkReturnPolicy));
				// Free In Store Return Finish
				// ****************************************************************************
				// We Accept (Start)
				else if (currentElement.equalsIgnoreCase("Visa_img"))
					assertTrue(isDisplayed(r2CartPo.iconVisa));
				else if (currentElement.equalsIgnoreCase("MasterCard_img"))
					assertTrue(isDisplayed(r2CartPo.iconMasterCard));
				else if (currentElement.equalsIgnoreCase("Paypal_img"))
					assertTrue(isDisplayed(r2CartPo.iconPaypal));
				// else if (currentElement.equalsIgnoreCase("GooglePay_img"))/De-scoped BY CR-
				// RK
				// assertTrue(isDisplayed(r2CartPo.iconGooglePay));
				else if (currentElement.equalsIgnoreCase("ApplePay_img"))
					assertTrue(isDisplayed(r2CartPo.iconApplePay));
				else if (currentElement.equalsIgnoreCase("AmericanExpress_img"))
					assertTrue(isDisplayed(r2CartPo.iconAmericanExpress));
				else if (currentElement.equalsIgnoreCase("Discover_img"))
					assertTrue(isDisplayed(r2CartPo.iconDiscover));
				// We Accept Finish
				// *******************************************************************************************************

				// Promo Code (Start)

				else if (currentElement.equalsIgnoreCase("Promocode_Price_txt"))
					assertTrue(isDisplayed(r2CartPo.txtPromoPrice));
				else if (currentElement.equalsIgnoreCase("InvalidPromocode_txt"))
					assertTrue(isDisplayed(r2CartPo.txtInvalidPromo));
				else if (currentElement.equalsIgnoreCase("Promocode_Txt"))
					assertTrue(isDisplayed(r2CartPo.txtPromocodeCart));

				// Promo Code end
				// *********************************************************************************************************
				// When cart is empty (Start)
				else if (currentElement.equalsIgnoreCase("YourCartIsEmpty_Txt"))
					assertTrue(isDisplayed(r2CartPo.cartEmptyTxt));
				else if (currentElement.equalsIgnoreCase("SignIn_btn"))
					assertTrue(isDisplayed(r2CartPo.btnCrtSignIn));
				else if (currentElement.equalsIgnoreCase("ContinueShopping_btn"))
					assertTrue(isDisplayed(r2CartPo.continueShopping_btn));
				else if (currentElement.equalsIgnoreCase("ContinueShopping_forEmptyCart_Link"))
					assertTrue(isDisplayed(r2CartPo.continueShoppingForEmptyCart_link));
				else if (currentElement.equalsIgnoreCase("WelcomeBackEmailAddress_Input"))
					assertTrue(isDisplayed(r2CartPo.WelcomeBackEmailAddress_Input));
				else if (currentElement.equalsIgnoreCase("WelcomeBackPassword_Input"))
					assertTrue(isDisplayed(r2CartPo.WelcomeBackPassword_Input));
				else if (currentElement.equalsIgnoreCase("WelcomeBackSignIN_Btn"))
					assertTrue(isDisplayed(r2CartPo.WelcomeBackSignIN_Btn));

				// When cart is empty(Finish)

				// ***************************************************************************************************
				// After clicking Shiping Policy(Start)
				else if (currentElement.equalsIgnoreCase("ShippingCharges_header"))
					assertTrue(isDisplayed(r2CartPo.txtShippingCharges));
				// After clicking Shiping Policy(End)
				// *************************************************************************************************

				// footer (Start)
				else if (currentElement.equalsIgnoreCase("ReturnPolicy_txt"))
					assertTrue(isDisplayed(r2CartPo.ReturnPolicy_txt));

				// footer (End)

				// ********************************%%%% Mobile
				// %%%%***********************************
				// For Mobile

				else if (currentElement.equalsIgnoreCase("Quantity_M_input_txt"))
					assertTrue(isDisplayed(r2CartPo.input_Quantity_M));

				else if (currentElement.equalsIgnoreCase("CheckOut_FirstBTN_M_btn"))
					assertTrue(isDisplayed(r2CartPo.checkOut_M_Btn));
				// For Mobile End

				else {
					logger.error("Element " + currentElement + " is not found.");
					throw new NullArgumentException("Element <" + currentElement + "> is not found.");
				}

			}
		} catch (AssertionError a) {
			logger.error("Element " + currentElement + " is not present on screen.");
			throw new AssertionError("Element <" + currentElement + "> is not present on application page .");
		}

		catch (NullPointerException e) {
			logger.error("This test-step has been failed");
		}
	}

}
