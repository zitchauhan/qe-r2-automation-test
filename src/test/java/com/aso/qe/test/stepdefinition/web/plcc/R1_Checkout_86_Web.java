package com.aso.qe.test.stepdefinition.web.plcc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.common.Common_Web_PLCC;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PLCC_CreditCardApplicationModal_PO;
import com.aso.qe.test.pageobject.R1_PLCC_Generic_PO;
import com.aso.qe.test.pageobject.R1_PLCC_LandingPage_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.stepdefinition.api.plcc.plccCardForGuestUser;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R1_Checkout_86_Web extends Common_Web_PLCC {
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_PLCC_Generic_PO genericPO = PageFactory.initElements(driver, R1_PLCC_Generic_PO.class);
	R1_PLCC_LandingPage_PO plccLandingPageObjects = PageFactory.initElements(driver, R1_PLCC_LandingPage_PO.class);
	R2_CheckOut_PO r2CheckoutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R1_PLCC_CreditCardApplicationModal_PO plccCCApplicationModalObjects = PageFactory.initElements(driver,
			R1_PLCC_CreditCardApplicationModal_PO.class);

	@Then("^user expect Landing page to be present$")
	public void user_expect_Landing_page_to_be_present() throws Throwable {
		plccLandingPageObjects.verifyPresenceOfLandingPage();
	}

	@When("^user click on APPLY NOW button$")
	public void user_click_on_APPLY_NOW_button() throws Throwable {
		plccLandingPageObjects.verifyPresenceOfApplyNowButton();
		clickOnButton(plccLandingPageObjects.applyNowButton);
	//	plccLandingPageObjects.applyNowButton.click();

	}

	@Then("^user navigates to Generic Credit Card Application Modal$")
	public void user_navigates_to_Generic_Credit_Card_Application_Modal() throws Throwable {
		plccCCApplicationModalObjects.verifyPresenceOfGenericCreditCardApplicationModal();
	}

	@When("^user enter Last four SSN \"(.*?)\"$")
	public void user_enter_Last_SSN(String arg2) throws Throwable {
		Thread.sleep(5000);
		clickOnButton(plccCCApplicationModalObjects.ssnCCModal);
		plccCCApplicationModalObjects.enterSSNCCModal(arg2);
		assertTrue(isDisplayed(plccCCApplicationModalObjects.ssnCCModal));
	}

	@When("^user enetr Date of Birth \"(.*?)\"$")
	public void user_enetr_Date_of_Birth(String arg1) throws Throwable {
		assertTrue(isDisplayed(plccCCApplicationModalObjects.dobCCModal));
		plccCCApplicationModalObjects.enterDOBCCModal(arg1);
	}

	@When("^user enter Annual Income \"(.*?)\"$")
	public void user_enter_Annual_Income(String arg1) throws Throwable {		
		assertTrue(isDisplayed(plccCCApplicationModalObjects.annualIncomeCCModal));
		plccCCApplicationModalObjects.enterAnnualIncomeCCModal(arg1);
	}

	@When("^user enter Street Address \"(.*?)\"$")
	public void user_enter_Street_Address(String arg1) throws Throwable {
		assertTrue(isDisplayed(plccCCApplicationModalObjects.streetAddressCCModal));
		plccCCApplicationModalObjects.enterStreetAddressCCModal(arg1);	
//	waitForElement(plccCCApplicationModalObjects.streetAddressCCModal);
	}

	@When("^user enter Suite or Apartment \"(.*?)\"$")
	public void user_enter_Suite_or_Apartment(String arg1) throws Throwable {
		assertTrue(isDisplayed(plccCCApplicationModalObjects.apartmentNameCCModal));
		plccCCApplicationModalObjects.enterApartmentNameCCModal(arg1);
		
		
	}

	@When("^user enter City \"(.*?)\"$")
	public void user_enter_City(String arg1) throws Throwable {
		assertTrue(isDisplayed(plccCCApplicationModalObjects.cityCModal));
		plccCCApplicationModalObjects.enterCityCCModal(arg1);
	//	waitForElement(plccCCApplicationModalObjects.cityCModal);
	}

	@When("^user select State \"(.*?)\"$")
	public void user_select_State(String arg1) throws Throwable {
		plccCCApplicationModalObjects.stateDropDownCCModal.click();
		String stateName = plccCCApplicationModalObjects.stateDropDownListCCModal.getText();
		Common_Web_PLCC.waitUntilElePresent(driver, plccCCApplicationModalObjects.stateDropDownPACCModal,
				ELEMWAITTIME_MEDIUM);
		plccCCApplicationModalObjects.stateDropDownPACCModal.click();
	}

	@When("^user enter Confirm Email Address \"(.*?)\"$")
	public void user_enter_Confirm_Email_Address(String arg1) throws Throwable {
		assertTrue(isDisplayed(plccCCApplicationModalObjects.confirmEmailIdCCModal));

		plccCCApplicationModalObjects.enterConfirmEmailIdCCModal(arg1);	
	//	waitForElement(plccCCApplicationModalObjects.confirmEmailIdCCModal);

	}

	@When("^user enter Mobile Phone \"(.*?)\"$")
	public void user_enter_Mobile_Phone(String arg1) throws Throwable {
		assertTrue(isDisplayed(plccCCApplicationModalObjects.mobilePhoneCCModal));
		plccCCApplicationModalObjects.enterMobilePhoneCCModal(arg1);	
	//	waitForElement(plccCCApplicationModalObjects.mobilePhoneCCModal);
	}

	@When("^user enter First Name on credit card Application Modal \"(.*?)\"$")
	public void user_enter_First_Name_on_credit_card_Application_Modal(String arg1) throws Throwable {
		assertTrue(isDisplayed(plccCCApplicationModalObjects.firstNameCCModal));
		plccCCApplicationModalObjects.enterFNCCModal(arg1);	
	//	waitForElement(plccCCApplicationModalObjects.firstNameCCModal);
	}

	@When("^user enter Last Name user_enter_Last_Name \"(.*?)\"$")
	public void user_enter_Last_Name_user_enter_Last_Name(String arg1) throws Throwable {
		assertTrue(isDisplayed(plccCCApplicationModalObjects.lastNameCCModal));
		plccCCApplicationModalObjects.enterLNCCModal(arg1);		
//		waitForElement(plccCCApplicationModalObjects.lastNameCCModal);
	}

	@When("^user enter Alternate Phone \"(.*?)\"$")
	public void user_enter_Alternate_Phone(String arg1) throws Throwable {
		plccCCApplicationModalObjects.enterAlternatePhoneCCModal(arg1);
		assertTrue(isDisplayed(plccCCApplicationModalObjects.alternatePhoneCCModal));
		waitForElement(plccCCApplicationModalObjects.alternatePhoneCCModal);
	}

	@When("^user click on CONTINUE button$")
	public void user_click_on_CONTINUE_button() throws Throwable {
		plccCCApplicationModalObjects.verifyPresenceOfContinueButtonCCModal();
		assertTrue(clickOnButton(plccCCApplicationModalObjects.continueButtonCCModal));
		Common_Web_PLCC.waitUntilElePresent(driver, plccCCApplicationModalObjects.continueButtonCCModal,
				ELEMWAITTIME_MEDIUM);
		//assertTrue(clickOnButton(plccCCApplicationModalObjects.continueButtonCCModal));
	}

	@When("^user select credit application modal agree message$")
	public void user_select_credit_application_modal_agree_message() throws Throwable {
		plccCCApplicationModalObjects.verifyPresenceOfAgreeApplicationModalCCModal();
		//Common_Web_PLCC.waitUntilElePresent(driver, plccCCApplicationModalObjects.TandCCheckBox,ELEMWAITTIME_MEDIUM);
		assertTrue(clickOnButton(plccCCApplicationModalObjects.TandCCheckBox));
	}

	@Then("^user navigates to credit card approval modal$")
	public void user_navigates_to_credit_card_approval_modal() throws Throwable {
		plccCCApplicationModalObjects.verifyPresenceOfSuccessModalCCModal();
		//plccCCApplicationModalObjects.successModal.click();
	}

	@When("^user click on continue to checkout$")
	public void user_click_on_continue_to_checkout() throws Throwable {
		try {
			plccCCApplicationModalObjects.verifyPresenceOfContinueToCheckoutCCModal();
			plccCCApplicationModalObjects.continueToCheckout.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().refresh();
		Thread.sleep(3000);
	}

	@Then("^user navigates to cart page$")
	public void user_navigates_to_cart_page() throws Throwable {
		try {
			plccCCApplicationModalObjects.verifyPresenceOfCartPage();
		} catch (Exception e) {
			System.out.println("Exception Message: "+e.getMessage());
		}
	}

	@When("^user click on continue shopping  button$")
	public void user_click_on_continue_shopping_button() throws Throwable {
		plccCCApplicationModalObjects.continueShoppingBtn.click();
	}

	@When("^user enter Zip Code on credit card Application Modal \"(.*?)\"$")
	public void user_enter_Zip_Code_on_credit_card_Application_Modal(String arg1) throws Throwable {
		plccCCApplicationModalObjects.enterZipCCModal(arg1);
		assertTrue(isDisplayed(plccCCApplicationModalObjects.zipCodeCCModal));
		waitForElement(plccCCApplicationModalObjects.zipCodeCCModal);
	}

	@When("^user enter Email Address on credit card Application Modal \"(.*?)\"$")
	public void user_enter_Email_Address_on_credit_card_Application_Modal(String arg1) throws Throwable {
		plccCCApplicationModalObjects.enterEmailIdCCModal(arg1);
		assertTrue(isDisplayed(plccCCApplicationModalObjects.emailIdCCModal));
		waitForElement(plccCCApplicationModalObjects.emailIdCCModal);
	}

	@When("^user click on SUBMIT button$")
	public void user_click_on_SUBMIT_button() throws Throwable {
		try {
			plccCCApplicationModalObjects.verifyPresenceOfSubmitButtonCCModal();
			assertTrue(isDisplayed(plccCCApplicationModalObjects.submitButton));
			plccCCApplicationModalObjects.submitButton.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Then("^user verify presence of STEP(\\d+): CONSENT$")
	public void user_verify_presence_of_STEP_CONSENT(int arg1) throws Throwable {
		try {
			plccCCApplicationModalObjects.verifyPresenceOfConsentModelPageLabel();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@When("^user clicks on edit link on payment section$")
	public void user_clicks_on_edit_link_on_payment_section() throws Throwable {
			/*genericPO.verifyPresenceOfEditLinkPaymentSectionCheckoutPage();
			genericPO.editLinkPaymentSection.click();*/
			try {
				genericPO.verifyPresenceOfEditLinkPaymentSectionCheckoutPage();
				wait.until(ExpectedConditions.visibilityOf(genericPO.editLinkPaymentSection));
				clickOnLink(genericPO.editLinkPaymentSection);
			} catch (Exception e) {
				assertTrue(isDisplayed(genericPO.editLinkPaymentSection));
				wait.until(ExpectedConditions.visibilityOf(genericPO.editLinkPaymentSection));
				WebElement element = driver.findElement(By.xpath("//*[@data-auid='checkout_edit_payment']"));
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", element);
			}
	}

	

	@When("^user select add new card option$")
	public void user_select_add_new_card_option() throws Throwable {
		try {
			genericPO.verifyPresenceOfAddNewCreditCardOption();
			assertTrue(clickOnButton(genericPO.addNewCreditCardOption));	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("^user click on confirm button plcc$")
	public void user_click_on_confirm_button_plcc() throws Throwable {
		try {
			genericPO.verifyPresenceOfConfirmButton();
			assertTrue(clickOnButton(genericPO.confirmButton));	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@When("^user click on credit card drop down$")
	public void user_click_on_credit_card_drop_down() throws Throwable {
		try {
			genericPO.verifyPresenceOfSavedCardCheckoutPage();
			assertTrue(clickOnButton(genericPO.savedCardCheckoutPage));			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Then("^user verify california restriction disclaimer is displayed$")
	public void user_verify_california_restriction_disclaimer_is_displayed() throws Throwable{
		try {
			genericPO.verifyPresenceOfCaliforniaRestrictionDisclaimer();
		
		}catch (Exception e){
			e.printStackTrace();
		}
	
	}
	
	@Then("^user verify california restriction disclaimer is displayed on Prescreen form$")
	public void user_verify_california_restriction_disclaimer_is_displayed_on_Prescreen_form() throws Throwable{
		try {
			genericPO.verifyPresenceOfCaliforniaRestrictionDisclaimerOnPrescreenForm();
		
		}catch (Exception e){
			e.printStackTrace();
		}
	
	}

	@And("^user verify California state code is not present in state dropdown$")
	public void user_verify_California_state_code_is_not_present_in_state_dropdown() throws Throwable{
		try {
			genericPO.verifyCaliforniaStateCodeIsNotPresentInStateDropdown();
		
		}catch (Exception e){
			e.printStackTrace();
	}
	}

	@And("^User verify california restriction error message is displayed below ZIP textbox$")
	public void User_verify_california_restriction_error_message_is_displayed_below_ZIP_textbox() throws Throwable{
		try {
			genericPO.verifyCaliforniaRestrictionErrorMessageIsDisplayedBelowZIPTextBox();
		
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	@Then("^user clicks on Continue to Checkout CTA on PLCC approval modal$")
	public void user_clicks_on_Continue_to_Checkout_CTA() {
		if(isDisplayed(plccCCApplicationModalObjects.errorTextErrorModal))
		{
			System.err.println("Error PLCC Modal Visible");
		}
		else if(isDisplayed(plccCCApplicationModalObjects.welcomeTxtSuccessModal))
			try {
				plccCCApplicationModalObjects.continueToCheckout.click();
			} catch (Exception e) {
				logger.debug("Exception Message: "+e.getMessage());
			}
	}
	
	@Then("^user should get first time promotion PLCC discount$")
	public void user_should_get_first_time_promotion_PLCC_discount() {
		String Subtotal = (r2CheckoutPo.SubTotalPrice_Txt).getText();
		String NSubtotal = Subtotal.substring(1);
		float NewSubtotal=Float.parseFloat(NSubtotal); 
		//Integer NewSubtotal = new Integer(NSubtotal);
		String Discount = (r2CheckoutPo.CheckoutDiscountValue).getText();
		String NDiscount = Discount.substring(2);
		float NewDiscount = Float.parseFloat(NDiscount);
		if(NewSubtotal > 15.00)
		{
			
			assertEquals(NewDiscount, "15.00");
		}
	else {
			assertTrue(isDisplayed(r2CheckoutPo.CheckoutDiscountValue));
			
		}
	}
	
}

