package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.SIT_AddressBookPageObject;
import com.aso.qe.test.pageobject.SIT_GuestuserShippingAddressPageObject;

import cucumber.api.java.en.Then;

public class SD_SIT_AddressBookPage extends CommonActionHelper {
	
	SIT_AddressBookPageObject addressbook= PageFactory.initElements(driver, SIT_AddressBookPageObject.class);
	SIT_GuestuserShippingAddressPageObject guestshippingpo= PageFactory.initElements(driver, SIT_GuestuserShippingAddressPageObject.class);
	GlobalElementHeader_HomePO globalElementHeader= PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
	
	
	@Then("^user click on Address Book link$")
	public void user_click_on_Address_Book_link() throws Throwable {
		globalElementHeader.clickAddressBookLink();   
	}
	
	
	@Then("^user should verify the Address Book page$")
	public void should_verify_the_Address_Book_page() throws Throwable {
		assertTrue(isDisplayed(addressbook.btnNewAddress));
		assertTrue(isDisplayed(addressbook.verifybtnedit));
		
	}

	@Then("^user click on Add New Address button$")
	public void user_click_on_Add_New_Address_button() throws Throwable {
		Thread.sleep(2000);
		clickOnButton(addressbook.btnNewAddress);
	}

	@Then("^user enter new address details and click on save button$")
	public void user_enter_new_address_details_and_click_on_save_button() throws Throwable {
		assertTrue(isDisplayed(addressbook.txtNewAddress));
		guestshippingpo.enterFirstName();
		guestshippingpo.enterLastName();
		guestshippingpo.enterPhoneNumber();
		guestshippingpo.enterAddress();
		guestshippingpo.enterZipCode();
		//guestshippingpo.enterCity();
		//guestshippingpo.SelectState();
		assertTrue(clickOnButton(addressbook.btnsavebutton));
		
	}

	@Then("^user verify the address and click on continue button and ok button$")
	public void user_verify_the_address_and_click_on_continue_button_and_ok_button() throws Throwable {
		assertTrue(isDisplayed(addressbook.txtAddressverification));
		clickOnButton(addressbook.btncontinue);
		assertTrue(isDisplayed(addressbook.txtAddresssuccessmsg));
		Thread.sleep(2000);
		clickOnButton(addressbook.btnok);
		
	}

	@Then("^user click on edit button$")
	public void user_click_on_edit_button() throws Throwable {
		Thread.sleep(2000);
		clickOnButton(addressbook.btnedit);
		Thread.sleep(2000);
	}

	@Then("^user modify the address and click on continue button and ok button$")
	public void user_modify_the_address_and_click_on_continue_button_and_ok_button() throws Throwable {
		Thread.sleep(2000);
		guestshippingpo.cleartext();
		Thread.sleep(2000);
		//guestshippingpo.enterPhoneNumber();
		guestshippingpo.txtclearphonenumber.sendKeys("1234567890");
		assertTrue(clickOnButton(addressbook.btneditsavebutton));
		assertTrue(isDisplayed(addressbook.txtAddressverification));
		assertTrue(clickOnButton(addressbook.btncontinue));
		assertTrue(isDisplayed(addressbook.txteditAddresssuccessmsg));
		assertTrue(clickOnButton(addressbook.btneditok));
		System.out.println("123");
		Thread.sleep(2000);
		
	}

	@Then("^user click on delete address button$")
	public void user_click_on_delete_address_button() throws Throwable {
		assertTrue(clickOnButton(addressbook.btndelete));
	}

	@Then("^user verify the delete address page and click on yes button$")
	public void user_verify_the_delete_address_page_and_click_on_yes_button() throws Throwable {
		assertTrue(isDisplayed(addressbook.txtDeletesmsg));
		assertTrue(clickOnButton(addressbook.btnyes));
	}

	
}
