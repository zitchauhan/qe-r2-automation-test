package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.UpdateGC_Balance_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class UpdateGC_Balance_SD  extends CommonActionHelper {
	public UpdateGC_Balance_PO updateGCObj = PageFactory.initElements(driver, UpdateGC_Balance_PO.class);

    
    @And("^user clicks on logs in with valid user$")
    public void user_clicks_on_logs_in_with_valid_user() throws Throwable {
    	waitForPageLoad(driver);
    	driver.findElement(By.xpath("//div[@id='loginForm']//input[contains(@id,'username')]")).sendKeys("begnavaz");
		driver.findElement(By.xpath("//div[@id='loginForm']//input[contains(@id,'password')]")).clear();
		driver.findElement(By.xpath("//div[@id='loginForm']//input[contains(@id,'password')]")).sendKeys("Academy1");
		System.out.println(driver.findElement(By.xpath("//div[@id='loginForm']//input[contains(@id,'password')]")).getAttribute("value"));
		
		
		driver.findElement(By.xpath("//div[contains(@id,'loginButton')]")).click();
    }
	
    
    @And("^user clicks on Account tab$")
    public void user_adds_balabce_for_GC() throws Throwable{
    	Thread.sleep(Constants.thread_highest);
    	waitForElement(updateGCObj.FD_Account);
    	Thread.sleep(Constants.thread_medium);
    	updateGCObj.FD_Account.click();
    }
    	
    @Then("^user clicks on Account text box and enters \"(.*?)\" number$")
    public void user_clicks_on_account_text_box(String arg1) throws Throwable {
		//enter on account icon
    	if(arg1.contains("GC_One"))
    	{
    		arg1 = webPropHelper.getTestDataProperty("Valid16DigitGiftCardNumber");
    	}
    	else if(arg1.contains("GC_Two"))
    	{
    		arg1 = webPropHelper.getTestDataProperty("GiftCardwithLessBalanceThenCart");
    	}
    	else if(arg1.contains("GC_Three"))
    	{
    		arg1 = webPropHelper.getTestDataProperty("ValidGiftCard");
    	}
    	else if(arg1.contains("GC_Four"))
    	{
    		arg1 = webPropHelper.getTestDataProperty("GiftCardNumberForOrderPlacement");
    	}
    	else if(arg1.contains("GC_Five"))
    	{
    		arg1 = webPropHelper.getTestDataProperty("GiftCardNumber");
    	}
    	else if(arg1.contains("GC_Six"))
    	{
    		arg1 = webPropHelper.getTestDataProperty("validGiftCardNumber");
    	}
    	else if(arg1.contains("GC_Seven"))
    	{
    		arg1 = webPropHelper.getTestDataProperty("LowBalanceGiftCard");
    	}
    	
		updateGCObj.FD_ACCNo.click();
		
		//enter Gift Card no
		setInputText(updateGCObj.FD_ACCNo, arg1);
		//driver.findElement(By.xpath("//*[@id='accNo']")).
		
		Thread.sleep(Constants.thread_medium);
    }	
    
    @Then("^user clicks on default merchant checbox and clicks submit$")
    public void user_clicks_on_default_merchant_checbox() throws Throwable{
		//clicking on the checkbox
    	Thread.sleep(Constants.thread_low);
		driver.findElement(By.xpath("//input[@id='defaultMerchant']")).click();
		
		Thread.sleep(Constants.thread_medium);
		driver.findElement(By.xpath("//*[@id='accSubmit']")).click();
	
    }
    
		//using explicit wait
	
    @Then("^verify whether the lock icon is visible and unlock all$")
    public void verify_lock_icon_displayed() throws Throwable{
    	waitForPageLoad(driver);
		//verifying the lock history link is visible or not
    	waitForElement(updateGCObj.FD_Status);
	
    	try {
    	if(updateGCObj.FD_Lock.isDisplayed())
		{
			
				System.out.println("Lock History is present for this GC");
				Thread.sleep(4000);
				updateGCObj.FD_Lock.click();	
				Thread.sleep(4000);

				//click on drop down to display 50 count
				driver.findElement(By.xpath("//div[@class='displaySec']//select[1]//option[5]")).click();
				Thread.sleep(3000);
				System.out.println("50 display count is selected");
				
				
				//calculating the number of rows
				int rownnnum = driver.findElements(By.xpath("//*[contains(@id,'historyGridLockRow')]")).size();
				System.out.println("Total row count is " +rownnnum);
				Thread.sleep(2000);
				
				//looping through the table
				for(int i = 1; i <= rownnnum; i++) {
					
					//identifying the lock icon
					if(updateGCObj.FD_Lock_Icon.isDisplayed())
					{
					//if(Selenium_Functions.isElementPresent(driver, By.xpath("//span[@class='lockHisSpan']//div[@class='masterGrid']//div[contains(@id,'hdScrolltbl')]/table/tbody/tr["+ i +"]//td[2]//img[@title='Unlock']"))) {
						System.out.println("Lock icon in the lock history table is present");
						Thread.sleep(3000);
						
						//finding the lock icon on the row and clicking it
						WebElement element = driver.findElement(By.xpath("//img[@title='Unlock']"));
						System.out.println("lock icon found in the row");
						JavascriptExecutor executor = (JavascriptExecutor)driver;
						executor.executeScript("arguments[0].click();", element);
						System.out.println("lock icon clicked in the row");
						
						Thread.sleep(3000);

						//from the popup click on unlock Ok button
						WebElement elementa = driver.findElement(By.xpath("//input[@class='inptBtn clickEvent306']"));
						System.out.println("lock icon unlock success popup is open");
						JavascriptExecutor executorA = (JavascriptExecutor)driver;
						executorA.executeScript("arguments[0].click();", elementa);
						System.out.println("ok is clicked on lock icon unlock success popup modal");
						Thread.sleep(3000);
						
//						if(updateGCObj.FD_AccessDenied.isDisplayed())
//						{
//							WebElement elementb = driver.findElement(By.xpath("//input[@class='inptBtn clickEvent306']"));
//							System.out.println("lock icon unlock success popup is open");
//							JavascriptExecutor executorB = (JavascriptExecutor)driver;
//							executorA.executeScript("arguments[0].click();", elementb);
//							System.out.println("Access Denied received so quitting browser");
//							driver.quit();
//						}
					}
					else {
						System.out.println("no lock icon present in the lock row no. " +i);
					}
				}
				
				
			} 			
    	}
    	catch(Exception e)
    	{
    		System.out.println("Lock History not present for this GC");
    	}
    	
    }}
