package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_PDP_PO;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import freemarker.template.utility.NullArgumentException;

public class R2_VERIFICATION_PDP_SD extends CommonActionHelper {
	
	R2_PDP_PO r2PdpPo = PageFactory.initElements(driver, R2_PDP_PO.class);
	private static final Logger logger = Logger.getLogger(R2_VERIFICATION_MYACCOUNT_SD.class);

	
	@Then("^Verify below Sub/Main Module of PDP$")
	public void Verify_below_Sub_Main_Module_of_My_Account(DataTable arg1) throws Throwable {

		try {
			List<List<String>> elements = arg1.raw();
			for (int i = 1; i < elements.size(); i++) {
				String currentElement = elements.get(i).get(0);
				// ===============================================================================
				//// PDP
				// ===============================================================================
				if (currentElement.equalsIgnoreCase("EnableBuyNow_btn"))
					assertTrue(isDisplayed(r2PdpPo.EnableBuyNow_btn));
				else if (currentElement.equalsIgnoreCase("Shipping_First_Name_txt"))
					assertTrue(isDisplayed(r2PdpPo.Shipping_First_Name_txt));
				else if (currentElement.equalsIgnoreCase("Shipping_Last_Name_txt"))
					assertTrue(isDisplayed(r2PdpPo.Shipping_Last_Name_txt));
				else if (currentElement.equalsIgnoreCase("Shipping_Address_txt"))
					assertTrue(isDisplayed(r2PdpPo.Shipping_Address_txt));
				else if (currentElement.equalsIgnoreCase("Shipping_ZipCode_txt"))
					assertTrue(isDisplayed(r2PdpPo.Shipping_ZipCode_txt));
				else if (currentElement.equalsIgnoreCase("Shipping_City_txt"))
					assertTrue(isDisplayed(r2PdpPo.Shipping_City_txt));
				else if (currentElement.equalsIgnoreCase("Shipping_State_txt"))
					assertTrue(isDisplayed(r2PdpPo.Shipping_State_txt));
				else if (currentElement.equalsIgnoreCase("Default_Payment_Option_btn"))
					assertTrue(isDisplayed(r2PdpPo.Default_Payment_Option_btn));
				else if (currentElement.equalsIgnoreCase("Signup_Cbx"))
					assertTrue(isDisplayed(r2PdpPo.Signup_Cbx));
				else if (currentElement.equalsIgnoreCase("WishList_Pop_Item_Lnk"))
					assertTrue(isDisplayed(r2PdpPo.WishList_Pop_Item_Lnk));
				else if (currentElement.equalsIgnoreCase("Shipping_Phone_txt"))
					assertTrue(isDisplayed(r2PdpPo.Shipping_Phone_txt));
				else if (currentElement.equalsIgnoreCase("Add_Default_Payment_Option_btn"))
					assertTrue(isDisplayed(r2PdpPo.Add_Default_Payment_Option_btn));
				
				else if (currentElement.equalsIgnoreCase("PaymentFormSubmit_btn"))
					assertTrue(isDisplayed(r2PdpPo.PaymentFormSubmit_btn));
				else if (currentElement.equalsIgnoreCase("EnableBuyNow_btn"))
					assertTrue(isDisplayed(r2PdpPo.EnableBuyNow_btn));				
				else if (currentElement.equalsIgnoreCase("Credit_CardNumber_txt"))
					assertTrue(isDisplayed(r2PdpPo.Credit_CardNumber_txt));
				else if (currentElement.equalsIgnoreCase("Credit_Card_Expriration_txt"))
					assertTrue(isDisplayed(r2PdpPo.Credit_Card_Expriration_txt));
				else if (currentElement.equalsIgnoreCase("Credit_Card_Cvv_txt"))
					assertTrue(isDisplayed(r2PdpPo.Credit_Card_Cvv_txt));
				else if (currentElement.equalsIgnoreCase("BillingState_txt"))
					assertTrue(isDisplayed(r2PdpPo.BillingState_txt));
				else if (currentElement.equalsIgnoreCase("BillingFirstName_txt"))
					assertTrue(isDisplayed(r2PdpPo.BillingFirstName_txt));
				else if (currentElement.equalsIgnoreCase("BillingLastName_txt"))
					assertTrue(isDisplayed(r2PdpPo.BillingLastName_txt));
				else if (currentElement.equalsIgnoreCase("BllingAddress_txt"))
					assertTrue(isDisplayed(r2PdpPo.BllingAddress_txt));
				else if (currentElement.equalsIgnoreCase("BillingZipCode_txt"))
					assertTrue(isDisplayed(r2PdpPo.BillingZipCode_txt));
				
				else if (currentElement.equalsIgnoreCase("BillingCity_txt"))
					assertTrue(isDisplayed(r2PdpPo.BillingCity_txt));
				else if (currentElement.equalsIgnoreCase("BillingPhone_txt"))
					assertTrue(isDisplayed(r2PdpPo.BillingPhone_txt));
				else if (currentElement.equalsIgnoreCase("BillingEmail_txt"))
					assertTrue(isDisplayed(r2PdpPo.BillingEmail_txt));
				else if (currentElement.equalsIgnoreCase("PaymentFormSubmit_btn"))
					assertTrue(isDisplayed(r2PdpPo.PaymentFormSubmit_btn));
				else if (currentElement.equalsIgnoreCase("EstArrival_txt"))
					assertTrue(isDisplayed(r2PdpPo.txtEstArrival));//CR-RK Oct 8 KER-2912
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
