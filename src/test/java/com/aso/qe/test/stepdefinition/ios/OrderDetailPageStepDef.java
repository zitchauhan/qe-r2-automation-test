package com.aso.qe.test.stepdefinition.ios;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.pageobject.ios.BottomNav;
import com.aso.qe.test.pageobject.ios.HomePage;
import com.aso.qe.test.pageobject.ios.LoginPage;
import com.aso.qe.test.pageobject.ios.OrderDetailPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;

public class OrderDetailPageStepDef extends GlobalMobileHelper{
	private static final Logger logger = Logger.getLogger(OrderDetailPageStepDef.class.getName());
	LoginPage loginPage = new LoginPage(driver);
	HomePage homePage = new HomePage(driver);
	BottomNav bottomNav = new BottomNav(driver);
	OrderDetailPage  orderDetailPage =  new OrderDetailPage(driver);
	

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
	assertEquals(orderDetailPage.getAlertMsgText(),alertTxtMsg);
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
    assertEquals(orderDetailPage.getSucessOrderCancelMessage(),sucessMesage);
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


@Then("^User see an error message as \"([^\"]*)\"$")
public void user_see_an_error_message_as(String errorMessage) throws Throwable {
   assertTrue(orderDetailPage.isErroMessageCancelOrderDisplay());
   assertEquals(orderDetailPage.getErrorMessageCancelOrder(),errorMessage);
}








}