package com.aso.qe.test.stepdefinition.web;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;

import cucumber.api.java.en.Then;

public class SD_SIT_FooterPage extends CommonActionHelper{
	//private static final Logger logger = Logger.getLogger(R1SP1_KER_728_Web_SD.class);

	GlobalElementHeader_HomePO globalElementHeader= PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
	//public ShoppingCartViewPO shoppingCartViewPO =  PageFactory.initElements(driver, ShoppingCartViewPO.class);

/*
	@Then("^User will click on expand button$")
	public void user_will_click_on_expand_button() throws Throwable {
		scrollPageToWebElement(globalElementHeader.expandall_Academy);
		globalElementHeader.clickexpandall_academy();


	}*/

	@Then("^User will verify the presence of Our history in Footer$")
	public void user_will_verify_the_presence_of_Our_history() throws Throwable {
		globalElementHeader.validatingOurhistory();


	}
	@Then("^User will verify the presence of Careers in Footer$")
	public void user_will_verify_the_presence_of_Careers() throws Throwable {
		globalElementHeader.validatingCareers();


	}
	@Then("^User will verify the presence of Press Room in Footer$")
	public void user_will_verify_the_presence_of_Press_Room() throws Throwable {
		globalElementHeader.validatingPressRoom();


	}

	@Then("^User will verify the presence of Giving Back in Footer$")
	public void user_will_verify_the_presence_of_Giving_Back() throws Throwable {
		globalElementHeader.validatingInvestors();


	}
	@Then("^User will verify the presence of Check Order in Footer$")
	public void user_will_verify_the_presence_of_Check_Order() throws Throwable {
		//scrollPageToWebElement(globalElementHeader.expandall_Academy);
		//globalElementHeader.clickexpandall_academy();
		globalElementHeader.validatingCheckOrder();


	}
	@Then("^User will verify the presence of Return Policy in Footer$")
	public void user_will_verify_the_presence_of_Return_Policy() throws Throwable {
		globalElementHeader.validatingReturnPolicy();


	}
	@Then("^User will verify the presence of Product Recall in Footer$")
	public void user_will_verify_the_presence_of_Product_Recall() throws Throwable {
		globalElementHeader.validatingProductRecall();


	}
	@Then("^User will verify the presence of Rebates in Footer$")
	public void user_will_verify_the_presence_of_Rebates() throws Throwable {
		globalElementHeader.validatingRebates();


	}
	@Then("^User will verify the presence of Contact Us in Footer$")
	public void user_will_verify_the_presence_of_Contact_Us() throws Throwable {
		globalElementHeader.validatingContactUs();


	}

	@Then("^User will verify the presence of Customer Care in Footer$")
	public void user_will_verify_the_presence_of_Customer_Care() throws Throwable {
		globalElementHeader.validatingCustomercare();


	}
	@Then("^User will verify the presence of Gift Cards in Footer$")
	public void user_will_verify_the_presence_of_Gift_Cards() throws Throwable {
		globalElementHeader.validatingGiftcards();


	}
	@Then("^User will verify the presence of Academy Credit Card in Footer$")
	public void user_will_verify_the_presence_of_Academy_Credit_Card() throws Throwable {
		globalElementHeader.validatingAcademyCreditCard();


	}

	@Then("^User will verify the presence of Store Services in Footer$")
	public void user_will_verify_the_presence_of_Store_Services() throws Throwable {
		globalElementHeader.validatingStoreServices();


	}

	@Then("^User will verify the presence of FIND A STORE in Footer$")
	public void user_will_verify_the_presence_of_FIND_A_STORE() throws Throwable {
		globalElementHeader.validatingFindaStore();


	}

	@Then("^User will verify the presence of sign up for more deals in Footer$")
	public void user_will_verify_the_presence_of_sign_up_for_more_deals() throws Throwable {
		globalElementHeader.validatingsignupformoredeals();


	}

	@Then("^User will verify the presence of chat now in Footer$")
	public void user_will_verify_the_presence_of_chat_now() throws Throwable {
		globalElementHeader.validatingchatnow();


	}
	
	@Then("^User will verify the presence of privacy policy in Footer$")
	public void user_will_verify_the_presence_of_privacy_policy() throws Throwable {
		globalElementHeader.validatingPrivatPolicy();


	}
	@Then("^User will verify the presence of Terms and Conditions in Footer$")
	public void user_will_verify_the_presence_of_Terms_and_conditions() throws Throwable {
		globalElementHeader.validatingTermsAndConditions();


	}
	@Then("^User will verify the presence of legal policy in Footer$")
	public void user_will_verify_the_presence_of_legal_policy() throws Throwable {
		globalElementHeader.validatingLegalPolicy();


	}
	}
