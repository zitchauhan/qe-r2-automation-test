package com.aso.qe.test.pageobject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;

public class R2_CheckOut_PO extends CommonActionHelper{
	
R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);

	// start KER-3392 CR-RK
	@FindBy(xpath = "//*[@data-auid='checkout_unauth_description_signin_link']")
	public WebElement txtSignInDescription;

	@FindBy(xpath = "//*[contains(text(),'Sign In')]")
	public WebElement lnkSignIn_CheckOut;

	// End KER-3392 CR-RK
//	 Start KER-2927 CR-SK
	@FindBy(xpath = "//div[contains(text(), 'Estimated Taxes')]/following-sibling::div[1]")
	public WebElement txtEstimatedTax;
//	 End KER-2927 CR-SK

	//start KER-6575 CR-MS
	@FindBy(xpath="//*[@data-auid='checkout_header_goto_cart_link']")
	public WebElement btnMiniCart;
	
	@FindBy(xpath="//*[@data-auid='checkout_header_logo_target_link']")
	public WebElement logoHeader;
	//End KER-6575 CR-RK
	
	// Start KER-6821 CR-DPK
		@FindBy(xpath = "//*[@name='firstName']")
		public WebElement inputCheckoutFirstName;
		
		@FindBy(xpath = "//*[@name='lastName']")
		public WebElement inputCheckoutLasttName;
		
		@FindBy(xpath = "//*[@name='phoneNumber']")
		public WebElement inputCheckoutPhoneNumber;
		
		@FindBy(xpath = "//*[@name='address']")
		public WebElement inputCheckoutAddress;
		
		@FindBy(xpath = "//*[@name='zipCode']")
		public WebElement inputCheckoutZipCode;
		
		@FindBy(xpath = "//*[@name='city']")
		public WebElement inputCheckoutCity;
		
		@FindBy(xpath = "//*[@data-auid='btncheckout_goto_shipping_method_btn']")
		public WebElement btnGoToShippingMethod;
		
		@FindBy(xpath = "//*[@data-auid='checkout_payment_add_gift_card_icon']")
		public WebElement plusIconGiftCard;
		
		@FindBy(xpath = "//*[@data-auid='checkout_payment_hide_gift_card_icon']")
		public WebElement minusIconGiftCard;
		
		
		@FindBy(xpath = "//*[text()='Gift Card Number']")
		public WebElement txtGiftcardNumber;
		
		@FindBy(xpath = "//*[@name='cardId']")
		public WebElement inputGiftcardNumber;
		
		@FindBy(xpath = "//*[text()='Pin']")
		public WebElement txtPin;
		
		@FindBy(xpath = "//*[@name='cardPin']")
		public WebElement inputPinNumber;
		
		@FindBy(xpath = "//*[@data-auid='btncheckout_payment_apply_gift_card_btn']")
		public WebElement btnCheckoutApply;
		
		@FindBy(xpath = "//*[text()='Invalid GiftCard Number']")
		public WebElement txtInvalidGiftcard;
		
		@FindBy(xpath = "//*[text()='Invalid GiftCard Pin']")
		public WebElement txtInvalidPin;
			
	// End KER-6821 CR-DPK	
		
		// Start KER-6824 CR-DPK
		
		@FindBy(xpath = "//*[text()='Gift Cards']/..")
		public WebElement txtGiftCardOrderSummaryPage;
		
		// End KER-6824 CR-DPK
		
		// Start KER-6575 CR-SK
		
		@FindBy(xpath="//*[@data-auid='checkout_header_logo_target_link']")
		public WebElement R2_imgAcademyLogo;
		
		// End KER-6575 CR-DPK

	// Start KER-2927 CR-SK
	public float getEstimatedTaxOnCheckoutPage() {
		String taxDisplayed = getText(txtEstimatedTax);
		taxDisplayed = taxDisplayed.replace("$", "");
		return Float.parseFloat(taxDisplayed);
	}
	// End KER-2927 CR-SK
}
