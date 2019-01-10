package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_R1_Fun_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R2_CART_K3178_SD extends CommonActionHelper {

	R2_CheckOut_PO r2CheckoutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R2_R1_Fun_PO r2R1FunPO = PageFactory.initElements(driver, R2_R1_Fun_PO.class);
	R2_Cart_PO cartPO = PageFactory.initElements(driver, R2_Cart_PO.class);
	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);
	
	@Then("^user click on change location button$")
	public void user_click_on_change_location_button() {
		assertTrue(clickOnButton(r2CheckoutPo.ChangeLocation_Lnk));
	}
	
	@Then("^user select in store pickup option$")
	public void user_select_in_store_pickup__option() {
		assertTrue(clickOnButton(cartPO.clickInStorePickUp));
	}
	
//	@And("^user enter new bopis eligible store \"(.*?)\"$")
//	public void user_enter_new_bopis_eligible_store(String zipcode) {
//		
//	}
	

}
