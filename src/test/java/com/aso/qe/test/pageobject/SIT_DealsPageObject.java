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
	@FindBy(xpath="//a[@data-auid='level2Category-Daily Deals']") public  WebElement btnDailyDeals;
	@FindBy(xpath="//a[@data-auid='level2Category-Daily Deals_m']") public  WebElement btnDailyDeals_m;
	
	@FindBy(xpath="(//p[@class='m-0 pl-1'])[1]") public  WebElement lnkProductDeals;
	@FindBy(xpath="(//*[contains(@data-auid,'level3Category-')])[1]") public  WebElement lnkProductDeals_m;
	
	
	
public void navigateToDealsandclickonproduct() throws Exception{
		
	if("mobile".equalsIgnoreCase(testtype)){
		assertTrue(clickOnButton(btnDailyDeals_m));
		assertTrue(clickOnButton(lnkProductDeals_m));
	}else{
		Actions hover = new Actions(getDriver());
		hover.moveToElement(btnDailyDeals).build().perform();
		assertTrue(clickOnButton(lnkProductDeals));
	}
		
	}

}
