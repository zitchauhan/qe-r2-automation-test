package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import cucumber.api.java.en.And;

public class R2_CART_K7034_SD extends CommonActionHelper {

	R2_Cart_PO r2CcartPo = PageFactory.initElements(driver, R2_Cart_PO.class);
	
	@And("^user should be able to see the item available message for BOPIS poroduct in store modal$")
	public void user_should_be_able_to_see_the_item_available_message_for_BOPIS_poroduct_in_store_modal() throws InterruptedException {
			Thread.sleep(2000);
			System.err.println(r2CcartPo.txtBopisAvailablityStoreModal.getText());
			assertTrue(isDisplayed(r2CcartPo.txtBopisAvailablityStoreModal));
		}
	}

