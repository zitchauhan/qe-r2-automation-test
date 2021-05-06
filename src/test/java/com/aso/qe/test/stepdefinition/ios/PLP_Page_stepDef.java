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

@Then("^User Sees the Products list which included OOS product$")
public void verifyOos() {
	assertTrue(plPage.verifyOos());
}
@Then("^User sees the Product which are in stock$")
public void verifyInStock() {
	assertTrue(plPage.verifyInstock());
	
}

    @Then("User sees the Promo ad image on PLP")
    public void userSeesThePromoAdImageOnPLP() {
        /* Created By jitsing7 on 04/05/2021 */
        assertTrue(plPage.verifyUserCanSeePromoAdImage());
    }
}