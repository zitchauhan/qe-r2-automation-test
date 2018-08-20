package com.aso.qe.test.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;

public class R2_CheckOut_PO extends CommonActionHelper {

	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);

	// start KER-3392 CR-RK
	@FindBy(xpath = "//*[@data-auid='checkout_unauth_description_signin_link']")
	public WebElement txtSignInDescription;

	@FindBy(xpath = "//*[contains(text(),'Sign In')]")
	public WebElement lnkSignIn_CheckOut;

	// End KER-3392 CR-RK

	// Start KER-2927 CR-SK
	@FindBy(xpath = "//div[contains(text(), 'Estimated Taxes')]/following-sibling::div[1]")
	public WebElement txtEstimatedTax;
	// End KER-2927 CR-SK

	// Start KER-2927 CR-SK
	public float getEstimatedTaxOnCheckoutPage() {
		String taxDisplayed = getText(txtEstimatedTax);
		taxDisplayed = taxDisplayed.replace("$", "");
		return Float.parseFloat(taxDisplayed);
	}
	// End KER-2927 CR-SK
}
