package com.aso.qe.test.stepdefinition.ios;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.pageobject.ios.BazzarVoicePage;
import com.aso.qe.test.pageobject.ios.BottomNav;
import com.aso.qe.test.pageobject.ios.HomePage;
import com.aso.qe.test.pageobject.ios.LoginPage;
import com.aso.qe.test.pageobject.ios.OrderHistoryDetailPage;
import com.aso.qe.test.pageobject.ios.OrdersPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;

public class BazarVoiceStepDef extends GlobalMobileHelper {
	private static final Logger logger = Logger.getLogger(BazarVoiceStepDef.class.getName());

	
	BazzarVoicePage bazarvoice = new BazzarVoicePage(driver);

	

@Then("^User sees \"([^\"]*)\" on PDP page$")
public void user_sees_on_PDP_page(String element) throws Throwable {
	assertTrue(bazarvoice.isReviewElementDisplay(element));
    
}

@Then("^User sees \"([^\"]*)\" label on Bazar voice page$")
public void user_sees_label_on_Bazar_voice_page(String element) throws Throwable {
	assertTrue(bazarvoice.isReviewElementDisplay(element));
}


@Then("^User sees \"([^\"]*)\" button on Bazar voice page$")
public void user_sees_button_on_Bazar_voice_page(String element) throws Throwable {
	assertTrue(bazarvoice.isReviewElementDisplay(element));
}


@Then("^User sees \"([^\"]*)\" button on screen$")
public void user_sees_button_on_screen(String element) throws Throwable {
	assertTrue(bazarvoice.isAskAQuestionElementDisplay(element));
    
}

@When("^User taps on \"([^\"]*)\" button on screen$")
public void user_taps_on_button_on_screen(String element) throws Throwable {
    bazarvoice.tapOnButton(element);
}

@Then("^User sees \"([^\"]*)\" label on screen$")
public void user_sees_label_on_screen(String element) throws Throwable {
	assertTrue(bazarvoice.isAskAQuestionElementDisplay(element));
   
}

@Then("^User sees \"([^\"]*)\" field on screen$")
public void user_sees_field_on_screen(String element) throws Throwable {
	assertTrue(bazarvoice.isAskAQuestionElementDisplay(element));
    
}


@When("^User enter \"([^\"]*)\" in \"([^\"]*)\"  on screen$")
public void user_enter_in_on_screen(String element, String text) throws Throwable {
   
}

@When("^User select Terms and condition checkbox$")
public void user_select_Terms_and_condition_checkbox() throws Throwable {
	
   
}


@Then("^User scroll down the screen$")
public void user_scroll_down_the_screen() throws Throwable {
	
 bazarvoice.screenDownTillPostAnswer();
}





	


}