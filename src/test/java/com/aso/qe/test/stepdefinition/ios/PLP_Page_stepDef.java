package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertTrue;

import com.aso.qe.test.pageobject.ios.ProductlistingPage;

import cucumber.api.java.en.Then;

public class PLP_Page_stepDef {
ProductlistingPage plPage = new ProductlistingPage();
@Then("^user sees the ratings and review count$")
public void isRatingsDisplayed() {
	assertTrue(plPage.verifyRatingsAndReview());
}
}