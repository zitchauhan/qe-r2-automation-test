package com.aso.qe.test.pageobject;


import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;

public class SIT_PaymentPageObject extends CommonActionHelper{
private static final Logger logger = Logger.getLogger(SIT_PaymentPageObject.class);
GlobalElementHeader_HomePO globalElementHeader= PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
	
	@FindBy(xpath="//h2[text()='Payment Method']") public WebElement payment;
	@FindBy(xpath="//*[@id=\"coPaymentMethodCC\"]") public WebElement rdbntcreditcard;
	@FindBy(xpath="//*[@id='applyGCToggle']") public WebElement bntApplyGiftcard;
	@FindBy(xpath="//*[@id='coPaymentMethodPayPal']") public WebElement rdbntpaypal;
	@FindBy(xpath="//input[@id='creditCardInput']") public WebElement cardnumber;
	@FindBy(xpath="//input[@id='expInput']") public WebElement expiration;
	@FindBy(xpath="//input[@id='CVVInput']") public WebElement cvv;
	@FindBy(xpath="//button[@id='rwdBillingContinue_Btn']") public WebElement btncontinuetoreview;
	@FindBy(xpath="//font[text()='test1']") public WebElement txtusername;
	@FindBy(xpath="//input[@type='password']") public WebElement txtpwd;
	@FindBy(xpath="//input[@name='UsernamePasswordEntry']") public WebElement btnsubmit;
	
	
	public void verifyPaymentmethodPage() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(isDisplayed(payment));
			logger.debug("Payment Method is displayed");
		}else {
			
			assertTrue(isDisplayed(payment));
			logger.debug("Payment Method is displayed");
		}
	}
	public void validatecreditcarddetails() throws Exception {
			assertTrue(isDisplayed(bntApplyGiftcard));
			assertTrue(isDisplayed(rdbntpaypal));
			assertTrue(isSelected(rdbntcreditcard));
			//assertTrue(clickOnRadioButton(rdbntcreditcard));
						
			cardnumber.sendKeys("4111  1111  1111  1111");
			expiration.sendKeys("1123");
			cvv.sendKeys("345");
						
		}
	
	public void verifyVisapwd() throws Exception {
		Thread.sleep(20000);
		driver.switchTo().frame("Cardinal-CCA-IFrame");
		driver.switchTo().frame("authWindow");
		Thread.sleep(5000);
		getDriver().findElement(By.xpath("//tr/td/img")).isDisplayed();
		txtpwd.sendKeys("1234");
		assertTrue(clickOnButton(btnsubmit));
		Thread.sleep(3000);
		getDriver().switchTo().defaultContent();
		Thread.sleep(3000);
		
	}
		
		
	

}
