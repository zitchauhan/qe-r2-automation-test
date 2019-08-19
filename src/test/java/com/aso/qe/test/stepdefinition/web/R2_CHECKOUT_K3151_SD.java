package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_CHECKOUT_K3151_SD extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R2_CHECKOUT_K3151_SD.class);
	R2_CheckOut_PO r2CheckOutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);

	@When("^user should see the order summary page with the default address$")
	public void user_should_see_the_order_summary_page_with_the_default_address() throws Throwable {
		WebElement defaultaddress = r2CheckOutPo.Checkout_ShippingAddress_Default;
		assertTrue(isDisplayed(r2CheckOutPo.Checkout_ShippingAddress_Default));
		System.out.println("**************" + defaultaddress.getText());

	}

	@When("^user is navigated to order summary page$")
	public void user_is_navigated_to_order_summary_page() throws Throwable {
		String currentURL = getCurrentPageURL();
		if (currentURL.contains("checkout")) {
			logger.debug("User is successfully navigated to Checkout page with URL :: " + currentURL);
		} else {
			logger.debug("User is not able to navigate to Checkout instead navigated to URL :: " + currentURL);
		}
	}

	@Then("^user verifies the default shipping address in the drop down$")
	public void user_verifies_the_default_shipping_address_in_the_drop_down() throws Throwable {
		assertTrue(isDisplayed(r2CheckOutPo.Checkout_ShippingAddressAfterEdit_ShippingAddress_Dd));
	}

	@Then("^user verifies all the saved addresses in my account should be displayed in the dropdown$")
	public void user_verifies_all_the_saved_addresses_in_my_account_should_be_displayed_in_the_dropdown()
			throws Throwable {
		WebElement shippingaddressdropdown = r2CheckOutPo.Checkout_ShippingAddressAfterEdit_ShippingAddress_Dd;
		System.out.println("**********" + shippingaddressdropdown.getText());
		assertTrue(isDisplayed(shippingaddressdropdown));

	}

	@Given("^user click on edit button in shipping address section$")
	public void user_click_on_edit_button_in_shipping_address_section() throws Throwable {
		if (isDisplayed(r2CheckOutPo.Checkout_ShippingAddress_Edit)) {
			assertTrue(clickOnButton(r2CheckOutPo.Checkout_ShippingAddress_Edit));
		}
		Thread.sleep(Constants.thread_low);
	}

	@Given("^user click on Add a new Shipping Address button in the shipping address drop down$")
	public void user_click_on_Add_a_new_Shipping_Address_button_in_the_shipping_address_drop_down() throws Throwable {
		assertTrue(clickOnButton(r2CheckOutPo.Checkout_ShippingAddressAfterEdit_ShippingAddress_Dd));
		Thread.sleep(Constants.thread_high);
		Actions hover = new Actions(getDriver());
		hover.sendKeys(Keys.UP, Keys.ENTER).build().perform(); //Added by Rishi
	//	hover.clickAndHold(r2CheckOutPo.Checkout_ShippingAddressAfterEdit_AddaNewShippingAddress).build().perform();
	//	hover.sendKeys(r2CheckOutPo.Checkout_ShippingAddressAfterEdit_AddaNewShippingAddress, Keys.DOWN, Keys.ENTER).build().perform(); //Updated by MJR - 17/7/19
	}

	@Then("^user click on confirm button in shipping address$")
	public void user_click_on_confirm_button() throws Throwable {
		assertTrue(clickOnButton(r2CheckOutPo.btnGoToShippingMethod));
	}

	@Then("^user select the shipping address in the drop down$")
	public void user_select_the_shipping_address_in_the_drop_down() throws Throwable {
		Actions hover = new Actions(getDriver());
		hover.click(r2CheckOutPo.Checkout_ShippingAddressAfterEdit_ShippingAddress_Dd).build().perform();
		hover.click(r2CheckOutPo.Checkout_ShippingAddressAfterEdit_ShippingAddress_Dd).build().perform();
		hover.sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER).build().perform();

		// hover.sendKeys(r2CheckOutPo.Checkout_ShippingAddressAfterEdit_SelectShippingAddress,
		// Keys.DOWN,Keys.ENTER).build().perform();
	}

	@Then("^user verifies the selected address is displayed in address section$")
	public void user_verifies_the_selected_address_is_displayed_in_address_section() throws Throwable {
		assertTrue(isDisplayed(r2CheckOutPo.Checkout_ShippingAddress_Default));
	}

}
