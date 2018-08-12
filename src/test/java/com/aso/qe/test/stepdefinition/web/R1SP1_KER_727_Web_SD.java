package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.HomePagePOM;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R1SP1_KER_727_Web_SD extends CommonActionHelper{
	
	

	public GlobalElementHeader_HomePO globalElementHeader= PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
	HomePagePOM hp_p=PageFactory.initElements(getDriver(), HomePagePOM.class);
	
	
	@When("^user to click on sing in and navigate to sign in page$")
	public void user_to_click_on_sing_in_and_navigate_to_sign_in_page() throws Throwable {
		         
		if("mobile".equalsIgnoreCase(testtype)){	
			scrollPageToWebElement(hp_p.linkSignIn_M);
		   Thread.sleep(5000);
			assertTrue(clickOnButton(hp_p.linkSignIn_M));
			
		}else {
		Thread.sleep(3000);
					assertTrue(clickOnButton(hp_p.linkSignIn));					
		}
		
	}
	
	
	
	@Then("^user to fill username \"(.*?)\" and password \"(.*?)\"$")
	public void user_to_fill_username_and_password(String username, String password) throws Throwable {
		setInputText(hp_p.inputEmail , username);
		setInputText(hp_p.inputPassword, password);
	}

	


	@When("^click sign in$")
	public void click_sign_in() throws Throwable {
	  assertTrue(isClickable(hp_p.buttonSignIn));
		clickOnButton(hp_p.buttonSignIn);
		Thread.sleep(4000);
	}
	
	
	@Then("^verify user to navigate to account summary page$")
	public void verify_user_to_navigate_to_account_summary_page() throws Throwable {
	    assertTrue(isDisplayed(hp_p.txtAccountSummary));
	    
	}
	
	@Then("^verify the validation message as incorrect$")
	public void verify_the_validation_message_as_incorrect() throws Throwable {
	    Thread.sleep(3000);
		assertTrue(isDisplayed(hp_p.msgVerifyIncorrect));
	}
	
	@Then("^verify enter email and password message to come$")
	public void verify_enter_email_and_password_message_to_come() throws Throwable {
		  Thread.sleep(3000);
	    assertTrue(isDisplayed(hp_p.msgVerifyEmail));
	    assertTrue(isDisplayed(hp_p.msgVerifyPassword));
	}
	
	@Then("^verify , WishList form My Account$")
	public void verify_WishList_form_My_Account() throws Throwable {
				
		if("mobile".equalsIgnoreCase(testtype)){	
			clickOnButton(hp_p.btnMyaccountMenu_M)	;
			assertTrue(isDisplayed(hp_p.tabWishList));						
			}else {
				assertTrue(isDisplayed(hp_p.tabWishList));	
			}
	}
	
	@Then("^verify personal information form My Account$")
	public void verify_personal_information_form_My_Account() throws Throwable {
	
		if("mobile".equalsIgnoreCase(testtype)){			
		clickOnButton(hp_p.btnMyaccountMenu_M)	;
		assertTrue(isDisplayed(hp_p.tabPersonalInformation));
		}else {
			assertTrue(isDisplayed(hp_p.tabPersonalInformation));					
	}
		}

	@Then("^verify Address book form My Account$")
	public void verify_Address_book_form_My_Account() throws Throwable {
			
		if("mobile".equalsIgnoreCase(testtype)){			
				clickOnButton(hp_p.btnMyaccountMenu_M)	;
			assertTrue(isDisplayed(hp_p.tabAddressBook));
				
			}else {
				assertTrue(isDisplayed(hp_p.tabAddressBook));				
			}
	}

		


	@When("^user to be able to click forget password$")
	public void user_to_be_able_to_click_forget_password() throws Throwable {
	   clickOnButton(hp_p.textForgotPasword);
	}

	@When("^user to enter email$")
	public void user_to_enter_email() throws Throwable {
	    setInputText(hp_p.inputForgetEmail, "   ");
	}

	@Then("^verify user to click submit button$")
	public void verify_user_to_click_submit_button() throws Throwable {
	   hp_p.btnSubmit.submit();
	}

	@Then("^click on singout$")
	public void click_on_singout() throws Throwable {
		
		if("mobile".equalsIgnoreCase(testtype)){	
			Thread.sleep(3000);
			scrollPageToWebElement(hp_p.signout_M);
			clickOnButton(hp_p.signout_M);
			
		}else {
			globalElementHeader.signOut();					
		}
	}





}
