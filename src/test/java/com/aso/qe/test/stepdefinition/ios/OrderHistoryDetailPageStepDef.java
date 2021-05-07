package com.aso.qe.test.stepdefinition.ios;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.pageobject.ios.BottomNav;
import com.aso.qe.test.pageobject.ios.HomePage;
import com.aso.qe.test.pageobject.ios.LoginPage;
import com.aso.qe.test.pageobject.ios.OrderHistoryDetailPage;
import com.aso.qe.test.pageobject.ios.OrdersPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;

public class OrderHistoryDetailPageStepDef extends GlobalMobileHelper {
	private static final Logger logger = Logger.getLogger(OrderHistoryDetailPageStepDef.class.getName());
	LoginPage loginPage = new LoginPage(driver);
	HomePage homePage = new HomePage(driver);
	BottomNav bottomNav = new BottomNav(driver);
	OrderHistoryDetailPage orderDetailPage = new OrderHistoryDetailPage(driver);
	OrdersPage orderPage = new OrdersPage(driver);

	@When("^User taps on Order button$")
	public void user_taps_on_Order_button() throws Throwable {

		orderDetailPage.tapOnOrderButton();

	}

	@Then("^User sees Order page with order list$")
	public void user_sees_Order_page_with_order_list() throws Throwable {
		orderDetailPage.isOrderPageDisplay();
		orderDetailPage.isOrderListDisplay();
	}

	@When("^User taps on OrderId$")
	public void user_taps_on_OrderId() throws Throwable {
		orderDetailPage.tapOnOrderId();
	}

	@Then("^User sees order detail page$")
	public void user_sees_order_detail_page() throws Throwable {
		orderDetailPage.isOrderDetailPageDisplay();
	}

	@Then("^User sees CancelOrder Button with chevron$")
	public void user_sees_CancelOrder_Button_with_chevron() throws Throwable {
		assertTrue(orderDetailPage.isCancelOrderButtonDisplayed());
		assertTrue(orderDetailPage.isCancelOrderChevronDisplayed());

	}

	@When("^User taps on cancel Order button$")
	public void user_taps_on_cancel_Order_button() throws Throwable {
		orderDetailPage.tapOnCancelOrderButton();

	}

	@Then("^User sees the alert confirmation screen$")
	public void user_sees_the_alert_confirmation_screen() throws Throwable {
		assertTrue(orderDetailPage.isCancelOrderAlertScreenDisplay());
	}

	@Then("^User sees the alert message as \"([^\"]*)\"$")
	public void user_sees_the_alert_message_as(String alertTxtMsg) throws Throwable {

		assertTrue(orderDetailPage.isAlertMsgDisplayed());
		assertEquals(orderDetailPage.getAlertMsgText(), alertTxtMsg);
	}

	@Then("^User sees Yes button on alert confrimation screen$")
	public void user_sees_Yes_button_on_alert_confrimation_screen() throws Throwable {
		assertTrue(orderDetailPage.isYesButtonDisplay());
	}

	@Then("^User sees No button on alert confirmation screen$")
	public void user_sees_No_button_on_alert_confirmation_screen() throws Throwable {
		assertTrue(orderDetailPage.isNoButtonDisplay());
	}

	@Then("^User sees Cancelled sucessfull message as \"([^\"]*)\"$")
	public void user_sees_Cancelled_sucessfull_message_as(String sucessMesage) throws Throwable {
		assertTrue(orderDetailPage.isSucessCancelOrderMessageDisplayed());
		assertEquals(orderDetailPage.getSucessOrderCancelMessage(), sucessMesage);
	}

	@When("^User taps on Yes Order button$")
	public void user_taps_on_Yes_Order_button() throws Throwable {
		orderDetailPage.tapOnYesButton();

	}

	@When("^User taps on No Order button$")
	public void user_taps_on_No_Order_button() throws Throwable {
		orderDetailPage.tapOnNoButton();
	}

	@Then("^User sees Order cancellation confirmation screen$")
	public void user_sees_Order_cancellation_confirmation_screen() throws Throwable {
		assertTrue(orderDetailPage.isConfirmationCancellationScreenDisplay());
	}

	@Then("^User sees the back button$")
	public void user_sees_the_back_button() throws Throwable {
		assertTrue(orderDetailPage.isBackButtonDisplay());
	}

	@When("^User taps on back button from Order cancellation confirmation screen$")
	public void user_taps_on_back_button_from_Order_cancellation_confirmation_screen() throws Throwable {
		orderDetailPage.tapOnBackButton();
	}

	@Then("^User see an error message with \"([^\"]*)\"$")
	public void user_see_an_error_message_as(String errorMessage) throws Throwable {
		assertTrue(orderDetailPage.isErroMessageCancelOrderDisplay());
		assertEquals(orderDetailPage.getErrorMessageCancelOrder(), errorMessage);
	}
	

@Then("^User sees order cancellation confirmation screen$")
public void user_sees_order_cancellation_confirmation_screen() throws Throwable {
     assertTrue(orderDetailPage.isConfirmationCancellationScreenDisplay());
}


@Then("^User sees order cancellation message as \"([^\"]*)\"$")
public void user_sees_order_cancellation_message_as(String arg1) throws Throwable {
	assertTrue(orderDetailPage.isOrderCancelMessageDisplay());
	
}

@Then("^User sees order cancellation date$")
public void user_sees_order_cancellation_date() throws Throwable {
	assertTrue(orderDetailPage.isOrderCancelDateDisplay());
}


@Then("^User sees product name on cancellation confirmation screen$")
public void user_sees_product_name_on_cancellation_confirmation_screen() throws Throwable {
	assertTrue(orderPage.isCancellationScreenElementDisplayed("Product name"));
}
         

@Then("^User sees prodcut image  on cancellationconfirmation screen$")
public void user_sees_prodcut_image_on_cancellationconfirmation_screen() throws Throwable {
	assertTrue(orderPage.isCancellationScreenElementDisplayed("Product Image"));
}

@Then("^User sese product SKU on cancellation confirmation screen$")
public void user_sese_product_SKU_on_cancellation_confirmation_screen() throws Throwable {
	assertTrue(orderPage.isCancellationScreenElementDisplayed("Sku id"));
}

@Then("^User sees prodcut qty  on cancellationconfirmation screen$")
public void user_sees_prodcut_qty_on_cancellationconfirmation_screen() throws Throwable {
	assertTrue(orderPage.isCancellationScreenElementDisplayed("Quantity"));
}

@Then("^User sese product price on cancellation confirmation screen$")
public void user_sese_product_price_on_cancellation_confirmation_screen() throws Throwable {
	assertTrue(orderPage.isCancellationScreenElementDisplayed("Price"));
}



@Then("^User sees \"([^\"]*)\" on cancellation screen$")
public void user_sees_on_cancellation_screen(String element) throws Throwable {
	assertTrue(orderPage.isCancellationScreenElementDisplayed(element));
}

/* created by Nirmal Jain - OMNI-33184 - 07/05/2021 */


@Then("^User sees track Delivery button$")
public void user_sees_track_Delivery_button() throws Throwable {
  assertTrue(orderDetailPage.isTrackButtonDisplay());
}

@When("^User taps on track Delivery button$")
public void user_taps_on_track_Delivery_button() throws Throwable {
 orderDetailPage.tapOnTrackDeliveryButton();   
}

@Then("^User navigated to Narvar Tracking screen$")
public void user_navigated_to_Narvar_Tracking_screen() throws Throwable {
	
	assertTrue(orderDetailPage.isNarvarScreenDisplay());
}

@Then("^User sees order lookup$")
public void user_sees_order_lookup() throws Throwable {
	
	assertTrue(orderDetailPage.isLookupOrderDisplay());
   
}

@When("^User enter Order id as \"([^\"]*)\"$")
public void user_enter_Order_id_as(String arg1) throws Throwable {
   orderDetailPage.enterOrderId(arg1);
}

@When("^User enter zip code  as \"([^\"]*)\"$")
public void user_enter_zip_code_as(String arg1) throws Throwable {
	 orderDetailPage.enterZipCode(arg1);
}

@When("^User tap on check button$")
public void user_tap_on_check_button() throws Throwable {
   orderDetailPage.tapOnCheckButton();
}



}