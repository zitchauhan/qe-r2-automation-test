package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R2_CHECKOUT_K3164_SD extends CommonActionHelper {

	R2_R1_Fun_PO r2R1FunPO = PageFactory.initElements(driver, R2_R1_Fun_PO.class);
	R2_Cart_PO r2Cart_Po = PageFactory.initElements(driver, R2_Cart_PO.class);
	R2_CheckOut_PO r2CheckOut_po = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R2_MyAccount_PO r2MyAccount_po = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	private static final Logger logger = Logger.getLogger(R2_CHECKOUT_K3165_SD.class);

	private Actions hover = new Actions(getDriver());

	@And("^user select new address from the shipping address drop down$")
	public void user_select_new_address_from_the_shipping_address_drop_down() throws Throwable {
		Thread.sleep(Constants.thread_low);
		hover.click(r2CheckOut_po.Checkout_ShippingAddressAfterEdit_ShippingAddress_Dd).build().perform();
		hover.sendKeys(Keys.UP, Keys.UP, Keys.ENTER).build().perform();
	}

	@And("^User Clicks on shipping method dropwdown box and selects another shipping method$")
	public void user_Clicks_on_shipping_method_dropwdown_box_and_selects_another_shipping_method() throws Throwable {
		Thread.sleep(Constants.thread_low);
		hover.click(r2CheckOut_po.checkout_ShippingMethod_ShippingMethodType_btn).build().perform();
		hover.sendKeys(Keys.DOWN, Keys.ENTER).build().perform();
	}

	@And("^User Clicks on credit card dropwdown and selects another card$")
	public void user_Clicks_on_credit_card_dropwdown_and_selects_another_card() throws Throwable {
		Thread.sleep(Constants.thread_high);
		if (isDisplayed(r2CheckOut_po.EditPayment_Link)) {
			assertTrue(clickOnButton(r2CheckOut_po.EditPayment_Link));
		}
		assertTrue(clickOnButton(r2CheckOut_po.chooseCreditcard_Dd));
		String selectedPaymentMethod = getText(r2CheckOut_po.chooseCreditcard_Dd);
		List<WebElement> paymentMethodList = r2CheckOut_po.checkout_PaymentMethod_List_dd.findElements(By.tagName("li"));
		for (WebElement li : paymentMethodList) {
			if (!(li.getText().contains(selectedPaymentMethod))) {
				li.click();
				break;
			}
		}
		String newPaymentMethod = getText(r2CheckOut_po.chooseCreditcard_Dd);
		assertTrue(!(selectedPaymentMethod.equals(newPaymentMethod)));
//		hover.click(r2CheckOut_po.Checkout_CreditCard_DropDown).build().perform();
//		hover.sendKeys(Keys.DOWN, Keys.ENTER).build().perform();
	}

	@And("^user clicks on change billing info cta$")
	public void user_clicks_on_change_billing_info_cta() throws Throwable {
		assertTrue(clickOnButton(r2CheckOut_po.ChangeBillingInformation_Txt));
	}

	@And("^user enter the email id for order confirmation \"(.*?)\"$")
	public void user_enter_the_email_id_for_order_confirmation(String EmailAddress) throws Throwable {
		setInputText(r2CheckOut_po.EmailAddressforOrderConfirmation_Input,
				webPropHelper.getTestDataProperty(EmailAddress));
	}

	@Then("^user should be able to see the email \"(.*?)\" in payment drawer$")
	public void user_should_be_able_to_see_the_email_in_payment_drawer(String email) throws Throwable {
		Thread.sleep(Constants.thread_low);
		assertTrue(isDisplayed(r2CheckOut_po.orderConfirmationPage_PaymentDrawer_BillingEmail));
		String emailIdInPaymentDrawer = getText(r2CheckOut_po.orderConfirmationPage_PaymentDrawer_BillingEmail);
		String dataFromPropertyFile = webPropHelper.getTestDataProperty(email);
		assertTrue((emailIdInPaymentDrawer.trim()).equals(dataFromPropertyFile.trim()));
	}

}
