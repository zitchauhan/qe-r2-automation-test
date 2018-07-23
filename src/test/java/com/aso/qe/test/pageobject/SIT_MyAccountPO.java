package com.aso.qe.test.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aso.qe.framework.common.CommonActionHelper;

public class SIT_MyAccountPO extends CommonActionHelper {

		
	@FindBy(xpath="//a[@data-auid='My Account CTA']") public WebElement lnkmyaccount;
	@FindBy(xpath="//h1[text()='My Account']") public WebElement txtmyaccount;
	@FindBy(xpath="//p[@id='welcomeText']") public WebElement txtwelcome;
	@FindBy(xpath="//a[@id='accountSummary']") public WebElement lnkaccountsummary;
	@FindBy(xpath="//a[@id='personalInformation']") public WebElement lnkpersonalInformation;
	@FindBy(xpath="//a[@id='addressBook']") public WebElement lnkaddressBook;
	@FindBy(xpath="//a[@id='wishLists']") public WebElement lnkwishLists;
	
	
	
	
	public void validateAccountSummaryLinkPresence() throws InterruptedException {
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(lnkaccountsummary);
		}else {
			isDisplayed(lnkaccountsummary);
		}
	}
	public void validatePersonalInformationLinkPresence() throws InterruptedException {
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(lnkpersonalInformation);
		}else {
			isDisplayed(lnkpersonalInformation);
		}
	}
	public void validateAddressBookLinkPresence() throws InterruptedException {
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(lnkaddressBook);
		}else {
			isDisplayed(lnkaddressBook);
		}
	}
	public void validateWishListLinkPresence() throws InterruptedException {
		if("mobile".equalsIgnoreCase(testtype)){
			isDisplayed(lnkwishLists);
		}else {
			isDisplayed(lnkwishLists);
		}
	}
	

}
