package com.aso.qe.test.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aso.qe.framework.common.CommonActionHelper;

public class SIT_AddressBookPageObject extends CommonActionHelper{
	
	@FindBy(xpath="//button[@id='newAddressBtn']") public WebElement btnNewAddress;
	@FindBy(xpath="(//div[@class='addressControls']/button[1])") public WebElement verifybtnedit;
	@FindBy(xpath="(//div[@class='addressControls']/following::button[1])[1]") public WebElement btnedit;
	@FindBy(xpath="//h2[@id='addAddressModalTitle']") public WebElement txtNewAddress;
	@FindBy(xpath="//button[contains(text(),'SAVE')]") public WebElement btnsavebutton;
	@FindBy(xpath="(//button[contains(text(),'SAVE')])[2]") public WebElement btneditsavebutton;
	@FindBy(xpath="//h2[contains(text(),'Address Verification')]") public WebElement txtAddressverification;
	@FindBy(xpath="//button[@id='continueMyAccAVS']") public WebElement btncontinue;
	@FindBy(xpath="//p[@id='addConfirmMessage']") public WebElement txtAddresssuccessmsg;
	@FindBy(xpath="//p[@id='editConfirmMessage']") public WebElement txteditAddresssuccessmsg;
	@FindBy(xpath="//button[@id='footerAddConfirmationClose']") public WebElement btnok;
	@FindBy(xpath="//button[@id='footerEditConfirmationClose']") public WebElement btneditok;
	@FindBy(xpath="//button[text()='Delete Address']") public WebElement btndelete;
	@FindBy(xpath="//p[@id='deleteQuestionMessage']") public WebElement txtDeletesmsg;
	@FindBy(xpath="//button[@id='confirmDelete']") public WebElement btnyes;
	
	
	

}
