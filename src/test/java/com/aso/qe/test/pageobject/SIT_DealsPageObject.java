package com.aso.qe.test.pageobject;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.aso.qe.framework.common.CommonActionHelper;

public class SIT_DealsPageObject extends CommonActionHelper{
	
	@FindBy(xpath="//a[@data-auid='deals category Women's Clothing']") public  WebElement btnWomensclothingDeals;
	@FindBy(xpath="//a[@data-auid='deals category Clothing']") public  WebElement btnClothingDeals;
	@FindBy(xpath="//a[@data-auid='deals category Boys' Clothing']") public  WebElement btnBoyslothingDeals;
	@FindBy(xpath="//a[@data-auid='deals category Daily Deals']") public  WebElement btnDailyDeals;
	@FindBy(xpath="//div[@class='d-flex flex-column daily-deals-container']") public  WebElement lnkProductDeals;
	
	
	
public void navigateToDealsandclickonproduct() throws Exception{
		
		
		Actions hover = new Actions(getDriver());
		hover.moveToElement(btnDailyDeals).build().perform();
		assertTrue(clickOnButton(lnkProductDeals));
	}

}
