package com.aso.qe.test.stepdefinition.ios;

import java.net.MalformedURLException;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import com.aso.qe.test.pageobject.ios.BottomNav;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CommonMobileStepDef extends GlobalMobileHelper{
	
	private static final Logger logger = Logger.getLogger(CommonMobileStepDef.class);
	private BottomNav bNav;
	
	@Given("^User launches the application$")
	public void launchApplication() {
		try {
			logger.debug("Going to launch mobile application");
			initializeDriver();
			logger.debug("Application successfully launched");
			Thread.sleep(3000);
			bNav = new BottomNav(driver);
		} catch (MalformedURLException e) {
			logger.debug("Error Launching mobile application");
			e.printStackTrace();
		}
		catch(InterruptedException e){
			
		}
	}
	
	@When("^User taps on home in bottom nav$")
	public void tapOnHome() {
		bNav.tapOnHome();
	}
	
	@When("^User taps on shop in bottom nav$")
	public void tapOnShop() {
		bNav.tapOnShop();
	}
	
	@When("^User taps on wishlist in bottom nav$")
	public void tapOnWishlist() {
		bNav.tapOnWishList();
	}
	
	@When("^User taps on cart in bottom nav$")
	public void tapOnCart() {
		bNav.tapOnCart();
	}
	
	@When("^User taps on account in bottom nav$")
	public void tapOnAccount() {
		bNav.tapOnAccount();
	}
	
	@And("^User taps on Maybe later in Onboarding Screen$")
	public void tapOnMaybeLater() {
		GlobalMobileHelper.tapOnElement(Locators.OnBoardingScreen.maybeLaterButton);
	}
}