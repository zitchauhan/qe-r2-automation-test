package com.aso.qe.test.pageobject;
import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R2_Paypal_initializeElements_PO extends CommonActionHelper{

	private static final Logger logger = Logger.getLogger(R2_Paypal_initializeElements_PO.class);

	//-------------------STARTS XPATH-----------------------//
	@FindBy(xpath = "//*[@data-auid='checkout_shipping_address_first_name']")
	public WebElement inputCheckoutFirstName;

	@FindBy(xpath = "//*[@data-auid='checkout_shipping_address_last_name']")
	public WebElement inputCheckoutLasttName;

	@FindBy(xpath = "//*[@data-auid='checkout_shipping_address_phone_number']")
	public WebElement inputCheckoutPhoneNumber;

	@FindBy(xpath = "//*[@data-auid='checkout_shipping_address_address']")
	public WebElement inputCheckoutAddress;

	@FindBy(xpath = "//*[@data-auid='checkout_shipping_address_zip_code']")
	public WebElement inputCheckoutZipCode;

	@FindBy(xpath = "//*[@data-auid='checkout_shipping_address_city']")
	public WebElement inputCheckoutCity;	
	
	@FindBy(xpath = "//*[@data-auid='btncheckout_goto_shipping_method_btn']")
	public WebElement btnGoToShippingMethod;
	@FindBy(xpath = "//*[@data-auid='btncheckout_goto_payment button-1'] | //*[@data-auid='btncheckout_ship_to_store_submit_button']")
	public WebElement checkout_ShippingMethod_GoToPayment_btn;
	
	//****Start PayPal****//
    @FindBy(xpath = "(//*[contains(@class,'paypal-checkout')]/a)[1]")
    public WebElement PaypalClose_icon;
    @FindBy(xpath = "//*[text()='Shipping discount']")
    public WebElement PaypalShippigDiscount_txt;
    @FindBy(xpath ="//*[@id='loginSection']/*/*[2]/*")
    public WebElement PaypalScreenLogin_Btn;
    @FindBy(xpath ="//*[@id='email']")
    public WebElement PaypalEmail_Input;
    @FindBy(xpath ="//*[@id='btnNext']")
    public WebElement PaypalNext_Btn;
    @FindBy(xpath ="//*[@id='password']")
    public WebElement PaypalPassWord_Input;
    @FindBy(xpath ="//*[@id='btnLogin']")
    public WebElement PaypalLogin_Btn;
    @FindBy(xpath ="//*[@id='button']/*")
    public WebElement PayPalContinue_Btn;
    @FindBy(xpath="//input[@id='paypal']/..")public WebElement rdPaypal;// PayPal_radioBtm;
	@FindBy(xpath="//*[text()=' Checkout']/..")public WebElement PayPalCheckOut_Btn;
    
    //****End PayPal****//
	

	@Then("^user enter First name \"(.*?)\" for paypal$")
	public void user_enter_First_name_for_paypal(String arg1) throws Throwable {
		setInputText(inputCheckoutFirstName, webPropHelper.getTestDataProperty(arg1));
	}
	@And("^user enter Last name \"(.*?)\" for paypal$")
	public void user_enter_Last_name_for_paypal(String arg1) throws Throwable {
		setInputText(inputCheckoutLasttName, webPropHelper.getTestDataProperty(arg1));
	}

	@And("^user enter Phone number \"(.*?)\" for paypal$")
	public void user_enter_Phone_number_for_paypal(String arg1) throws Throwable {
		setInputText(inputCheckoutPhoneNumber, webPropHelper.getTestDataProperty(arg1));
	}

	@And("^user enter Address \"(.*?)\" for paypal$")
	public void user_enter_Address_for_paypal(String arg1) throws Throwable {
		String addressToEnter = "";
		if(arg1.equalsIgnoreCase("Invalidaddress"))
			addressToEnter = "!!!!!";
		else
			addressToEnter = webPropHelper.getTestDataProperty(arg1);
		inputCheckoutAddress.clear();
		setInputText(inputCheckoutAddress, addressToEnter);
		Thread.sleep(Constants.thread_low);
	}

	@And("^user enter Zipcode \"(.*?)\" for paypal$")
	public void user_enter_Zipcode_for_paypal(String arg1) throws Throwable {
		String zipCodeToEnter = "";
		inputCheckoutZipCode.clear();
		setInputText(inputCheckoutZipCode, zipCodeToEnter);
		Thread.sleep(Constants.thread_low);
	}


	@And("^user click on Go To Shipping Method button in Checkout page$")
	public void user_click_on_Go_To_Shipping_Method_button_in_Checkout_page() throws Throwable {
		try {
			btnGoToShippingMethod.click();
			Thread.sleep(Constants.thread_medium);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	@Then("^user click on Go To Payment button in Checkout page$")
	public void user_click_on_Go_To_Payment_button_in_Checkout_page() throws Throwable {
		try {
			checkout_ShippingMethod_GoToPayment_btn.click();
			Thread.sleep(Constants.thread_medium);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	@Then("^user will click on Paypal radio button$")
	public void user_will_click_on_Paypal_radio_button() throws Throwable {
		Thread.sleep(Constants.thread_low);
		waitForElement(rdPaypal);
		rdPaypal.click();
	}

	@Then("^user will click on Paypal Checkout button$")
	public void user_will_click_on_Paypal_Checkout_button() throws Throwable {
		Thread.sleep(Constants.thread_low);
		waitForElement(PayPalCheckOut_Btn);
		PayPalCheckOut_Btn.click();
	}

	@When("^user enter Paypal Email \"(.*?)\"$")
	public void user_enter_Paypal_Email(String arg1) throws Throwable {
		setInputText(PaypalEmail_Input, webPropHelper.getTestDataProperty(arg1));
	}

	@When("^user enter Paypal Password \"(.*?)\"$")
	public void user_enter_Paypal_Password(String arg1) throws Throwable {
		setInputText(PaypalPassWord_Input, webPropHelper.getTestDataProperty(arg1));
	}

	@Then("^user will click on Paypal Login button$")
	public void user_will_click_on_Paypal_Login_button() throws Throwable {
		Thread.sleep(Constants.thread_low);
		waitForElement(PaypalLogin_Btn);
		PaypalLogin_Btn.click();
		Thread.sleep(Constants.thread_medium);
	}

	@Then("^user will click on Paypal Continue button$")
	public void user_will_click_on_Paypal_Continue_button() throws Throwable {
		Thread.sleep(Constants.thread_low);
		waitForElement(PayPalContinue_Btn);
		PayPalContinue_Btn.click();
		Thread.sleep(Constants.thread_medium);
	}
}
