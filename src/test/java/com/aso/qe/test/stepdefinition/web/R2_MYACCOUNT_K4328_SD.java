package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;
import com.aso.qe.test.pageobject.R2_OrderConfirmation_Po;
import cucumber.api.java.en.Then;

public class R2_MYACCOUNT_K4328_SD extends CommonActionHelper {

	R2_MyAccount_PO r2MyAccountPo = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	public R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver,R1_GlobalElementHeader_Home_PO.class);
	public R2_OrderConfirmation_Po orderConfirmationPO = PageFactory.initElements(driver,R2_OrderConfirmation_Po.class);

	@Then("^user click on order history$")
	public void user_click_on_order_history() throws InterruptedException {
		assertTrue(clickOnButton(orderConfirmationPO.orderHistoryOrderConfirmationPage));
		Thread.sleep(Constants.thread_high);
	}
	
	
}