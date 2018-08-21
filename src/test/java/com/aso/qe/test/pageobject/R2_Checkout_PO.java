package com.aso.qe.test.pageobject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aso.qe.framework.common.CommonActionHelper;

public class R2_Checkout_PO extends CommonActionHelper{
	
//	 Start KER-2927 CR-SK
	@FindBy(xpath = "//div[contains(text(), 'Estimated Taxes')]/following-sibling::div[1]")
	public WebElement txtEstimatedTax;
//	 End KER-2927 CR-SK
	
	
	
	
//	 Start KER-2927 CR-SK
		public float getEstimatedTaxOnCheckoutPage() {
			String taxDisplayed = getText(txtEstimatedTax);
			taxDisplayed = taxDisplayed.replace("$", "");
			return Float.parseFloat(taxDisplayed);
		}
//		 End KER-2927 CR-SK

}
