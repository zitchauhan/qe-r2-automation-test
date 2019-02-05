package com.aso.qe.test.stepdefinition.web.plcc;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_PLCC_Generic_PO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R1_Cart_89_Web extends CommonActionHelper{
	R1_PLCC_Generic_PO genericPO = PageFactory.initElements(driver, R1_PLCC_Generic_PO.class);
	@Then("^user navigates to Cart Page$")
	public void user_navigates_to_Cart_Page() throws Throwable {
		genericPO.verifyPresenceOfCartPage();
	}

	@Then("^user expect element We Accept Label to be present$")
	public void user_expect_element_We_Accept_Label_to_be_present() throws Throwable {
		genericPO.verifyPresenceOfWeAcceptLabel();
	}

	@Then("^user expect element plcc card image to be present in footer$")
	public void user_expect_element_plcc_card_image_to_be_present_in_footer() throws Throwable {
		genericPO.verifyPresenceOfPlccCardImageFooter();
	}
	@When("^user click on viewcart button$")
	public void user_click_on_viewcart_button() throws Throwable {
		genericPO.verifyPresenceOfViewCartButton();
		genericPO.viewCartButton.click();
	}
}
