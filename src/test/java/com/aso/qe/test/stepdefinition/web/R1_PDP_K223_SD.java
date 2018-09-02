package com.aso.qe.test.stepdefinition.web;

import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.PDP_PO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R1_PDP_K223_SD extends CommonActionHelper{
	
	PDP_PO pdpPageObj = PageFactory.initElements(getDriver(), PDP_PO.class);
	public GlobalElementHeader_HomePO globalElementHeader= PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);

	@And("^User verifies the alternative available colors$")
	public void User_verifies_the_alternative_available_color() throws InterruptedException{
		pdpPageObj.altColorMatch();
	}

	@Then("^User update the color manually$")
	public void User_update_the_color_manually(){
		pdpPageObj.updateRepresentativeColor();
	}
	
	@Then("^User sees color options to be notated near the product image$")
	public void User_sees_color_options_to_be_notated_near_the_product_image(){
		pdpPageObj.checkSelectedSwatchColor();
	}
	
}

