package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.apache.log4j.Logger;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class New_PDP_Web_SD extends CommonActionHelper
{
	private static final Logger logger = Logger.getLogger(New_PDP_Web_SD.class);
	R1_PDP_PO pdp_po = PageFactory.initElements(getDriver(), R1_PDP_PO.class);

	
		@Then("^user increase the quantity of item in PDP$")
		public void user_decrease_the_quantity_of_item_in_PDP() throws Throwable {
			 assertTrue(clickOnButton(pdp_po.btnQuantityInc));
			 assertTrue(clickOnButton(pdp_po.btnQuantityDec));
		}
		
		@And("^user should be able to see the increased quantity$")
		public void user_should_be_able_to_see_the_increased_quantity() throws Throwable {
			String quantity = pdp_po.quantityInput.getText();
			logger.info("Modified Quantity:"+quantity);
			
			if(!quantity.equals("1")) {
				logger.debug("Quantity is increased");
			} else
			{
				logger.debug("Quantity is not increased");
			}    
		}
		

		@And("^user should be able to see the decreased quantity$")
		public void user_should_be_able_to_see_the_decreased_quantity() throws Throwable {
			String quantity = pdp_po.quantityInput.getText();
			logger.info("Modified Quantity:"+quantity);
			
			if(!quantity.equals("0")) {
				logger.debug("Quantity is decreased");
			} else
			{
				logger.debug("Quantity is not decreased");
			}    
		}
		
		@And("^user change the quantity of item to \"(.*?)\" in PDP$")
		public void user_change_the_quantity_of_item_in_PDP(String arg) throws Throwable {
			String quantity = webPropHelper.getTestDataProperty(arg);
			setInputText(pdp_po.quantityInput,quantity);
		}

		
		@And("^user validate \"(.*?)\" is disabled in PDP$")
		public void user_validate_disabled_in_PDP(String arg) throws Throwable {
			String quantity = webPropHelper.getTestDataProperty(arg);
			
		}
		
		
		@And("^user validate if qty box accepts \"(.*?)\"$")
		public void user_validate_if_qty_box_accepts_string(String arg) throws Throwable {
			String arg1 = webPropHelper.getTestDataProperty(arg);
			String quantitytxt = pdp_po.quantityInput.getText();
			if(arg1.equalsIgnoreCase("texts and special chars")) 
			{
			setInputText(pdp_po.quantityInput,"abc");
			assertTrue(quantitytxt.isEmpty());
			setInputText(pdp_po.quantityInput,"!@#");
			assertTrue(quantitytxt.isEmpty());
		}else 
		{
			setInputText(pdp_po.quantityInput,"1111");
			assertTrue(quantitytxt.isEmpty());
		}
		}
}






	

