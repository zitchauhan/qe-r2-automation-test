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
