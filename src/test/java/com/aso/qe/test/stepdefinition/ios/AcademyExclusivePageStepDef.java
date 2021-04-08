package com.aso.qe.test.stepdefinition.ios;

import static org.junit.Assert.assertTrue;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.pageobject.ios.AcademyExclusivePage;

import cucumber.api.java.en.And;

public class AcademyExclusivePageStepDef extends GlobalMobileHelper {
	AcademyExclusivePage academyExclusivePage = new AcademyExclusivePage(driver);
	
	@And("^user sees the Academy Exclusive Page$")
	public void isAcademyExclusivePageDisplayed() {
		assertTrue(academyExclusivePage.isAcademyPageDisplayed());
	}

}
