package com.aso.qe.test.stepdefinition.web;



import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class R2_MYACCOUNT_K2919_SD extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R2_MYACCOUNT_K2919_SD.class);
	R2_MyAccount_PO myAccountPo= PageFactory.initElements(driver, R2_MyAccount_PO.class);
	R2_CheckOut_PO r2CheckOutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	
	Actions keyAction = new Actions(getDriver());
	@Given("^user deletes all existing credit card$") //CR-GK 9-Oct
	public void user_deletes_all_existing_credit_card() throws Throwable {
		/*for(WebElement removeElement: myAccountPo.PaymentPage_CreditCard_Remove_list) {
			removeElement.click();
			Thread.sleep(Constants.thread_highest);
		}*/
		myAccountPo.deleteAllCreditCardsFromMyAccount();
	}
	
	@Given("^user clicks on Add New Credit Card button$")
	public void user_clicks_on_Add_New_Credit_Card_button() throws Throwable {
		Thread.sleep(Constants.thread_low);
		if(isDisplayed(myAccountPo.addNewCardCta))
			assertTrue(clickOnButton(myAccountPo.addNewCardCta));
		else
			assertTrue(clickOnButton(myAccountPo.btnAddNewCreditCard));
	}
	
	@And("^user clicks the CVV Tool Tip$")
	public void user_clicks_the_CVV_Tool_Tip() throws Throwable {
		assertTrue(clickOnButton(myAccountPo.iconCVVToolTip));
	}

	@Then("^verify that a flyout with tool tip is opened$")
	public void verify_that_a_flyout_with_tool_tip_is_opened() throws Throwable {
	    moveHover(myAccountPo.iconCVVToolTip);
	    waitForElement(myAccountPo.iconCVVToolTipFlyout);
	    assertTrue(isDisplayed(myAccountPo.iconCVVToolTipFlyout));
	}
	
	@And("^User enters Credit Card number \"(.*?)\"$")
	public void user_enters_Credit_Card_number(String text) throws Throwable {
//		setInputText(myAccountPo.txtCreditCardNumber, webPropHelper.getTestDataProperty(text));
//		keyAction.sendKeys(Keys.TAB).build().perform();
//			}

		//changes done by Sachin for payeezyv2 switching to iframe on 11-2-2020
		Thread.sleep(Constants.thread_low);
		driver.switchTo().frame("first-data-payment-field-card");
		setInputText(r2CheckOutPo.CreditCardDetails_Input, webPropHelper.getTestDataProperty("CreditCardNumber"));
		System.out.println("CardNumber="+webPropHelper.getTestDataProperty("CreditCardNumber"));
		driver.switchTo().defaultContent();
	}	
		
	@And("^User enters expiration date \"(.*?)\"$")
	public void user_enters_expiration_date(String arg1) throws Throwable {
		//updated by Sachin
		Thread.sleep(Constants.thread_low);
		driver.switchTo().frame("first-data-payment-field-exp");	
		setInputText(r2CheckOutPo.ExpDate_Input, webPropHelper.getTestDataProperty("ExpDate"));
		driver.switchTo().defaultContent();
	}

		
	@Given("^User enters CVV number \"(.*?)\"$")
	public void user_enters_CVV_number(String arg1) throws Throwable {
		//updated by Sachin
		Thread.sleep(Constants.thread_low);
		driver.switchTo().frame("first-data-payment-field-cvv");
		setInputText(r2CheckOutPo.PassCvv_Input, webPropHelper.getTestDataProperty("cvv"));
		driver.switchTo().defaultContent();
	}

	
	@Then("^verify that the field population does not happen$")
	public void verify_that_the_field_population_does_not_happen() throws Throwable {
		//changes done by Sachin for payeezyv2 switching to iframe on 11-2-2020
		driver.switchTo().frame("first-data-payment-field-cvv");
	    String cvv = myAccountPo.txtCVV.getAttribute("Value");
		if(cvv.isEmpty()) {
			  logger.info("CVV field is Empty");
		   }else {
			  	  logger.info("CVV field is not Empty");
		   }
		driver.switchTo().defaultContent();
	}
	
	
	@And("^User clicks on Add CTA$")
	public void user_clicks_on_Add_CTA() throws Throwable {
		assertTrue(clickOnButton(myAccountPo.btnAddInAddCreditCard));
		
	}
	
	@Then("^verify that inline error messages are displayed prompting the user to enter all required fields$")
	public void verify_that_inline_error_messages_are_displayed_prompting_the_user_to_enter_all_required_fields() throws Throwable {
	    for(WebElement inlineError: myAccountPo.inlineErrorMsg) {
	    	assertTrue(isDisplayed(inlineError));
	    }
	}
	
	
	@And("^user enter First Name field \"(.*?)\"$")
	public void user_enter_First_Name_field(String arg1) throws Throwable {
		setInputText(myAccountPo.txtFirstNameInAddCreditCard, webPropHelper.getTestDataProperty(arg1));
		myAccountPo.txtFirstNameInAddCreditCard.sendKeys(Keys.TAB);
	}

	@And("^user enter Last Name field \"(.*?)\"$")
	public void user_enter_Last_Name_field(String arg1) throws Throwable {
		setInputText(myAccountPo.txtLastNameInAddCreditCard, webPropHelper.getTestDataProperty(arg1));
		myAccountPo.txtLastNameInAddCreditCard.sendKeys(Keys.TAB);
		
	}

	
	@And("^user enter Address field \"(.*?)\"$")
	public void user_enter_Address_field(String arg1) throws Throwable {
		setInputText(myAccountPo.txtAddressInAddCreditCard, webPropHelper.getTestDataProperty(arg1));
		myAccountPo.txtAddressInAddCreditCard.sendKeys(Keys.TAB);
	}

	@And("^user enter ZipCode field \"(.*?)\"$")
	public void user_enter_ZipCode_field(String arg1) throws Throwable {
		setInputText(myAccountPo.txtZipCodeInAddCreditCard, webPropHelper.getTestDataProperty(arg1));
		Thread.sleep(Constants.thread_medium);
	}
	
	@Given("^User clicks on cancel$")
	public void user_clicks_on_cancel() throws Throwable {
		assertTrue(clickOnButton(myAccountPo.btnCancelInAddCreditCard));
	}
	
	@Then("^User verifies that the form fields are closed$")
	public void user_verifies_that_the_form_fields_are_closed() throws Throwable {
		assertFalse(isDisplayed(myAccountPo.PaymentPage_AddCreditCard_Add_btn));
	}
	
	@Then("^User verifies that city and State are populated automatically$")
	public void user_verifies_that_city_and_State_are_populated_automatically() throws Throwable {
		String city = myAccountPo.txtCityInAddCreditCard.getAttribute("value");
	    String state = myAccountPo.btnState.getText();
	       
	    assertTrue(!city.isEmpty());
	    assertTrue(!state.isEmpty());
	    
	}
	

@Given("^user enter PhoneNumber field \"(.*?)\"$")
public void user_enter_PhoneNumber_field(String arg1) throws Throwable {
	setInputText(myAccountPo.adr_inpPhoneNumber, webPropHelper.getTestDataProperty(arg1));
}

@Then("^click on Add button$")
public void click_on_Add_button() throws Throwable {
	assertTrue(clickOnButton(myAccountPo.btnAddInAddressField));
	Thread.sleep(Constants.thread_medium);
}

@Then("^click on Add button on credit card page$")
public void click_on_Add_button_on_credit_card_page() throws Throwable {
	assertTrue(clickOnButton(myAccountPo.PaymentPage_AddCreditCard_Add_btn));
	Thread.sleep(Constants.thread_medium);
}

@Given("^click on Add another Credit Card button$")
public void click_on_Add_another_Credit_Card_button() throws Throwable {
	assertTrue(clickOnButton(myAccountPo.addNewCardCta));
}

@Then("^User verifies that in Payment section CCone credit card is pre-populated by default\\.$")
public void user_verifies_that_in_Payment_section_CCone_credit_card_is_pre_populated_by_default() throws Throwable {
	assertTrue(isDisplayed(r2CheckOutPo.chooseCreditcard_Dd));
	String cc= r2CheckOutPo.chooseCreditcard_Dd.getText();
	assertTrue(cc.contains("1111"));
}

@Then("^User verifies that in Payment section credit card \"(.*?)\" is pre-populated by default$")
public void user_verifies_that_in_Payment_section_credit_card_is_pre_populated_by_default(String arg1) throws Throwable {
	r2CheckOutPo.verifyShippingAddress(arg1);
	waitForElement(r2CheckOutPo.chooseCreditcard_Dd);
//	assertTrue(isDisplayed(r2CheckOutPo.chooseCreditcard_Dd));
	arg1 = webPropHelper.getTestDataProperty(arg1);
	String cc= r2CheckOutPo.chooseCreditcard_Dd.getText();
	arg1 = arg1.substring(arg1.length() - 4);
	assertTrue(cc.contains(arg1));
}

@And("^Verify that Credit Card details as entered are saved in User Profile\\.$")
public void verify_that_Credit_Card_details_as_entered_are_saved_in_User_Profile() throws Throwable {
	assertTrue(isDisplayed(myAccountPo.txtCreditCardDetails));
}

}
