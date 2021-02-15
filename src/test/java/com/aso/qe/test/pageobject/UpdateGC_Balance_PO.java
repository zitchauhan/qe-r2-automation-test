package com.aso.qe.test.pageobject;

import static org.junit.Assert.fail;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.aso.qe.framework.common.CommonActionHelper;


public class UpdateGC_Balance_PO extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(UpdateGC_Balance_PO.class);

	@FindBy(xpath="//*[@id='accNo']")
	public WebElement FD_ACCNo;

	@FindBy(xpath="//*[@id='lockHistory']")
	public WebElement FD_Lock;
	
	@FindBy(xpath="//span[@class='lockHisSpan']//div[@class='masterGrid']//div[contains(@id,'hdScrolltbl')]/table/tbody/tr[\"+ i +\"]//td[2]//img[@title='Unlock']")
	public WebElement FD_Lock_Icon;
	
	@FindBy(xpath="//span[@id='closedLoop']//*[text()='Account ']")
	public WebElement FD_Account;
	
	@FindBy(xpath="//*[contains(text(),\"Status :\")]")
	public WebElement FD_Status;
	
	@FindBy(xpath="//*[contains(text(),'Access denied.')]")
	public WebElement FD_AccessDenied;
	

}
