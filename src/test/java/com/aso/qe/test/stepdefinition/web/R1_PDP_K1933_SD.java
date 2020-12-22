package com.aso.qe.test.stepdefinition.web;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import cucumber.api.java.en.Then;

public class R1_PDP_K1933_SD extends CommonActionHelper{

	R1_PDP_PO pdp_po = PageFactory.initElements(getDriver(), R1_PDP_PO.class);

	@Then("^user able to see shipping/delivery related message in product type BULK$")
	public void user_able_to_see_shipping_delivery_related_message_in_bulky_product() throws Throwable {

    assertTrue(isDisplayed(pdp_po.txtShippingRelatedMsg));
    
	}
	
	

}

