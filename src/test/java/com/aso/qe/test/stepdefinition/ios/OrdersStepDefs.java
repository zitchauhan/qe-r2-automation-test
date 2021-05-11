package com.aso.qe.test.stepdefinition.ios;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.pageobject.ios.Context;
import com.aso.qe.test.pageobject.ios.OrdersPage;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import org.apache.log4j.Logger;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class OrdersStepDefs extends GlobalMobileHelper {
    /*
        Created by jitsingh7 on 30/04/21
    */

    OrdersPage ordersPage = new OrdersPage(driver);

    private static final Logger logger = Logger.getLogger(OrdersStepDefs.class.getName());

    @And("^User sees Order confirmation screen with \"([^\"]*)\" tile$")
    public void userSeesOrderConfirmationScreenWithTitle(String confirmationType) {
        /* Created By jitsingh7 on 30/04/21 */
        logger.debug("this is the default message");
        throw new PendingException();
    }

    @And("^User sees Order number message \"([^\"]*)\"$")
    public void userSeesOrderNumberMessage(String arg0) {
        /* Created By jitsingh7 on 30/04/21 */
        throw new PendingException();
    }


    @And("User sees Create Account button on Order Confirmation screen")
    public void userSeesCreateAccountButtonOnOrderConfirmationScreen() {
        /* Created By jitsingh7 on 30/04/21 */
        if (Context.getCurrentUserType().equalsIgnoreCase("guest"))
            assertTrue(isElementDisplayed(Locators.OrdersPage.createAccountButton));
    }


    @And("User sees Continue Shopping button on Order Confirmation screen")
    public void userSeesContinueShoppingButtonOnOrderConfirmationScreen() {
        /* Created By jitsingh7 on 30/04/21 */
        assertTrue(isElementDisplayed(Locators.OrdersPage.continueShopping));
    }

    @And("User sees Your Order History button on Order Confirmation screen")
    public void userSeesYourOrderHistoryButtonOnOrderConfirmationScreen() {
        /* Created By jitsingh7 on 30/04/21 */
        if (!Context.getCurrentUserType().equalsIgnoreCase("guest"))
            assertTrue(isElementDisplayed(Locators.OrdersPage.orderHistoryButton));
    }

    @And("User sees elements of e-delivery title")
    public void userSeesElementsOfEDeliveryTitle(DataTable dataTable) {
        /* Created By jitsingh7 on 01/05/2021 */
        List<List<String>> elementList  = dataTable.raw();
        ordersPage.verifyElementsEDeliveryTitle(elementList.get(0));
    }
    
    @Then("User sees elements on order confirmation screen")
    public void userSeesElementOnOrderConfirmationScreen(DataTable dataTable) {
    	List<List<String>> elementList = dataTable.raw();
    	ordersPage.verifyElementsOnOrderConfirmationPage(elementList.get(0));
    	
    }
    @Then("User sees Get notifications to track your order button$")
    	 public void userSeesGetNotificationToTrackOrder() {
    		 ordersPage.isGetNotificationToTrackOrderDisplayed();
    	 }
    @Then("User taps on Get notifications to track your order button$")
	 public void userTapsOnGetNotificationToTrackOrder() {
		 ordersPage.tapOnGetNotificationToTrackOrder();
	 }
    
    @Then("^User sees payment method label$")
	public void user_sees_payment_method_label() throws Throwable {
    	ordersPage.verifyPaymentMethodLabel();
	}

	@Then("^User sees \"([^\"]*)\" image$")
	public void user_sees_image(String paymentType) throws Throwable {
		ordersPage.verifyPaymentImage(paymentType);
	}

	@Then("^User sees last four digits of \"([^\"]*)\"$")
	public void user_sees_last_four_digits_of(String paymentType) throws Throwable {
		ordersPage.verifyCardNumber(paymentType);
	}
	
	@Then("^User sees the amount debited from the Gift Card$")
	public void user_sees_the_amount_debited_from_the_Gift_Card() throws Throwable {
		ordersPage.isGiftCardAmountDisplayed();
	}
	
	@Then("^User sees \"([^\"]*)\" payment method$")
	public void user_sees_payment_method(String paymentType) throws Throwable {
		ordersPage.isPayementMethodDisplayed(paymentType);
	}
	@Then("^user click on the listed order \"([^\"]*)\" at Orders Page$")
	public void user_click_on_the_listed_order_at_Orders_Page(String order) throws Throwable {
	   ordersPage.tapOnListedOrders(order);
	}
	@Then("^User sees the component \"([^\"]*)\" at order details page$")
	public void user_sees_the_component_at_order_details_page(String field) throws Throwable {
	    ordersPage.isFieldDisplayedOnOrderDetailsPage(field);
	}
	@Then("^User Enter the \"([^\"]*)\" at orders Page$")
	public void user_Enter_the_at_orders_Page(String value) throws Throwable {
	    ordersPage.enterValuesOnOrdersPage( value);
	}
	@Then("^User click on Check button at orders Page$")
	public void user_click_on_Check_button_at_orders_Page() throws Throwable {
	    ordersPage.tapOnCheckBtn();
	}

	
	

}
