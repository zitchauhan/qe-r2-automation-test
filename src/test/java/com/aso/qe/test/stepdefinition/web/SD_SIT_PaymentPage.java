package com.aso.qe.test.stepdefinition.web;


import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.SIT_PaymentPageObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SD_SIT_PaymentPage extends CommonActionHelper {
	
	public SIT_PaymentPageObject PayPo= PageFactory.initElements(driver, SIT_PaymentPageObject.class);
	

	
	
	@When("^user should be able see the the payment method page and enter the creditcard details$")
	public void user_should_be_able_see_the_the_payment_method_page_and_enter_the_creditcard_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PayPo.validatecreditcarddetails();
	}
	
	@Then("^user should click on continue to review button$")
	public void user_should_click_on_continue_to_review_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(clickOnButton(PayPo.btncontinuetoreview));
		Thread.sleep(2000);
	}
	
	@And("^user enter verified by visa password and click on submit button$")
	public void user_enter_verified_by_visa_password_and_click_on_submit_button() throws Throwable {
		//getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		
		
		Thread.sleep(20000);
		System.out.println("1111"); 
		driver.switchTo().frame("Cardinal-CCA-IFrame");
		System.out.println("2222");
		driver.switchTo().frame("authWindow");
		System.out.println("3333");
		Thread.sleep(5000);
		getDriver().findElement(By.xpath("//tr/td/img")).isDisplayed();
		PayPo.txtpwd.sendKeys("1234");
		//((JavascriptExecutor) driver).executeScript("document.getElementsById('PayPo.txtpwd')[0].innerHTML=arguments[0];",1234,"");
		//PayPo.verifyVisapwd();
		System.out.println("4444");
		assertTrue(clickOnButton(PayPo.btnsubmit));
		System.out.println("555");
		Thread.sleep(3000);
		getDriver().switchTo().defaultContent();
		Thread.sleep(3000);
	}
	
	

}
