package com.aso.qe.test.stepdefinition.web;

import org.openqa.selenium.support.PageFactory;
import static org.testng.Assert.assertTrue;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.And;

public class R2_CHECKOUT_K3135_SD extends CommonActionHelper {

	R2_CheckOut_PO r2CheckOutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);

	@And("^user enters new billing address information \"(.*?)\" , \"(.*?)\" , \"(.*?)\" , \"(.*?)\" , \"(.*?)\" , \"(.*?)\"$")
	public void user_enters_new_billing_address_information(String arg1, String arg2, String arg3, String arg4,
			String arg5, String arg6) throws Throwable {
		clearText(r2CheckOutPo.FirstName_Input);
		clearText(r2CheckOutPo.LastName_Input);
		clearText(r2CheckOutPo.PhoneNumber_Input);
		clearText(r2CheckOutPo.Adderss_Input);
		clearText(r2CheckOutPo.ZipCode_Input);
		// clearText(r2CheckOutPo.EmailAddressforOrderConfirmation_Input);
		setInputText(r2CheckOutPo.FirstName_Input, webPropHelper.getTestDataProperty(arg1));
		setInputText(r2CheckOutPo.LastName_Input, webPropHelper.getTestDataProperty(arg2));
		setInputText(r2CheckOutPo.PhoneNumber_Input, webPropHelper.getTestDataProperty(arg3));
		setInputText(r2CheckOutPo.Adderss_Input, webPropHelper.getTestDataProperty(arg4));
		setInputText(r2CheckOutPo.ZipCode_Input, webPropHelper.getTestDataProperty(arg5));
		// setInputText(r2CheckOutPo.EmailAddressforOrderConfirmation_Input,
		// webPropHelper.getTestDataProperty(arg6));
	}

	@And("^user click on confirm billing address button$")
	public void user_click_on_confirm_billing_address_button() throws Throwable {
		if (isDisplayed(r2CheckOutPo.ReviewOrder_Btn)) {
			assertTrue(clickOnButton(r2CheckOutPo.ReviewOrder_Btn));
		}
	}

	@And("^user click on Add Company Name, Apt Name, Number etc link$")
	public void user_click_on_Add_Company_Name_Apt_Name_Number_etc_link() throws Throwable {
		assertTrue(clickOnButton(r2CheckOutPo.AddCompanyNameAptNumberEtcOptional_Txt));
	}

	@And("^user enters extra address information \"(.*?)\"$")
	public void user_enters_extra_address_information(String arg1) throws Throwable {
		clearText(r2CheckOutPo.AddCompanyNameAptNumberEtcOptional_Input);
		setInputText(r2CheckOutPo.AddCompanyNameAptNumberEtcOptional_Input, webPropHelper.getTestDataProperty(arg1));
	}
}