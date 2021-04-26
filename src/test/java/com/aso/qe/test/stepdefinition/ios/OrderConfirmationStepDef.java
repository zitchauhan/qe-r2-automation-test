package com.aso.qe.test.stepdefinition.ios;

import org.apache.log4j.Logger;
import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.pageobject.ios.OrderConfirmationPage;

import cucumber.api.java.en.Then;

public class OrderConfirmationStepDef extends GlobalMobileHelper{
	private static final Logger logger = Logger.getLogger(LoginStepDef.class.getName());
	OrderConfirmationPage orderConfrimationPage = new OrderConfirmationPage(driver);
	
	
	@Then("^User sees payment method label$")
	public void user_sees_payment_method_label() throws Throwable {
		orderConfrimationPage.verifyPaymentMethodLabel();
	}

	@Then("^User sees \"([^\"]*)\" image$")
	public void user_sees_image(String paymentType) throws Throwable {
		orderConfrimationPage.verifyPaymentImage(paymentType);
	}

	@Then("^User sees last four digits of \"([^\"]*)\"$")
	public void user_sees_last_four_digits_of(String paymentType) throws Throwable {
		orderConfrimationPage.verifyCardNumber(paymentType);
	}
	
	@Then("^User sees the amount debited from the Gift Card$")
	public void user_sees_the_amount_debited_from_the_Gift_Card() throws Throwable {
		orderConfrimationPage.isGiftCardAmountDisplayed();
	}
	
	@Then("^User sees \"([^\"]*)\" payment method$")
	public void user_sees_payment_method(String paymentType) throws Throwable {
		orderConfrimationPage.isPayementMethodDisplayed(paymentType);
	}
}
