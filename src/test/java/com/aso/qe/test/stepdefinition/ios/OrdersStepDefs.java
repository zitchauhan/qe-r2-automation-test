package com.aso.qe.test.stepdefinition.ios;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.pageobject.ios.Context;
import com.aso.qe.test.pageobject.ios.OrdersPage;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
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
}
