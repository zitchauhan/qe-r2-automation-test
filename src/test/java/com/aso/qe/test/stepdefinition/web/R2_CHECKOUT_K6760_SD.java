package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R2_CHECKOUT_K6760_SD extends CommonActionHelper {

	R2_CheckOut_PO r2CheckOutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R2_R1_Fun_PO funPO = PageFactory.initElements(driver, R2_R1_Fun_PO.class);

	@And("^User navigates to L2 Grills Outdoor cooking$")
	public void User_navigates_to_L2_Grills_Outdoor_cooking() throws InterruptedException {
		funPO.navigateToL2GrillOutdoor();
	}

	@And("^user clicks on one of the subcategory of Grills Outdoor$")
	public void user_clicks_on_one_of_the_subcategory_of_Grills_Outdoor() {
		waitForElement(funPO.clickGrills);
		assertTrue(clickOnButton(funPO.clickGrills));
	}

	@And("^user select the product$")
	public void user_select_the_product() {
		waitForElement(funPO.selectGrill);
		assertTrue(clickOnButton(funPO.selectGrill));
	}

	@Then("^user verify the default service available for WG items$")
	public void user_verify_the_default_service_available_for_WG_items() {
		try {
			r2CheckOutPo.checkWGDefault();
		} catch (Exception e) {
			System.out.println("WG Default :"+e.getMessage());
		}
	}

	@Then("^User click on the edit button in Shipping method$")
	public void User_click_on_the_edit_button_in_Shipping_method() {
		waitForElement(r2CheckOutPo.checkout_ShippingMethod_Edit_lnk);
		assertTrue(clickOnButton(r2CheckOutPo.checkout_ShippingMethod_Edit_lnk));
	}

	@And("^user verify the WG services available$")
	public void user_verify_the_WG_services_available() {
		r2CheckOutPo.checkWGservicesAvailable();
	}

	@And("^user select the Scheduled Delivery WG service$")
	public void user_select_the_Scheduled_Delivery_WG_service() {
		assertTrue(clickOnButton(r2CheckOutPo.clickShippingWGDropDown));
		waitForElement(r2CheckOutPo.WGScheduleService);
		assertTrue(clickOnButton(r2CheckOutPo.WGScheduleService));
	}

	@And("^user select the Room of choice Delivery WG service$")
	public void user_select_the_Room_of_choice_Delivery_WG_service() {
		assertTrue(clickOnButton(r2CheckOutPo.clickShippingWGDropDown));
		waitForElement(r2CheckOutPo.WGRoomOfChoiceService);
		assertTrue(clickOnButton(r2CheckOutPo.WGRoomOfChoiceService));
	}

	@And("^user click on go to payment present in shipping method$")
	public void user_click_on_go_to_payment_present_in_shipping_method() throws InterruptedException {
		boolean flag=false;
		flag=isDisplayed(r2CheckOutPo.checkout_ShippingMethod_GoToPayment_btn);
		System.err.println(flag);
		if (flag)
			assertTrue(clickOnButton(r2CheckOutPo.checkout_ShippingMethod_GoToPayment_btn));
		     Thread.sleep(Constants.thread_low);
	}

	@Then("^user verify the Schedule service available for WG items$")
	public void user_verify_the_Schedule_service_available_for_WG_items() {
		r2CheckOutPo.checkWGSchedule();
	}

	@Then("^user verify the Room of choice service available for WG items$")
	public void user_verify_the_Room_of_choice_service_available_for_WG_items() {
		r2CheckOutPo.checkWGRoomOFChoice();
	}

}
