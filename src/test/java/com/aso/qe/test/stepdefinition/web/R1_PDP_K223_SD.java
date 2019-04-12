package com.aso.qe.test.stepdefinition.web;

import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R1_PDP_K223_SD extends CommonActionHelper{
	
	R1_PDP_PO pdpPageObj = PageFactory.initElements(getDriver(), R1_PDP_PO.class);
	public R1_GlobalElementHeader_Home_PO globalElementHeader= PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);

	@And("^User verifies the alternative available colors$")
	public void User_verifies_the_alternative_available_color() throws InterruptedException{
		try {
			pdpPageObj.altColorMatch();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("^User update the color manually$")
	public void User_update_the_color_manually(){
		try {
			pdpPageObj.updateRepresentativeColor();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Then("^User sees color options to be notated near the product image$")
	public void User_sees_color_options_to_be_notated_near_the_product_image(){
		try {
			pdpPageObj.checkSelectedSwatchColor();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

