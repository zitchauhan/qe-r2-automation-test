package com.aso.qe.test.stepdefinition.web.plcc;
//import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.web.helpers.ASOBrokenURLsLinks;
import com.aso.qe.test.pageobject.R1_FindStore_PO;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_SearchProduct_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Common_Web_SD_PLCC extends CommonActionHelper
{
	private static final Logger logger = Logger.getLogger(Common_Web_SD_PLCC.class);
	public R1_FindStore_PO findStorePO;
	public static R1_GlobalElementHeader_Home_PO globalElementHeader;
	public static R1_SearchProduct_PO searchProductPO;
    /**
     * Converts WebElement to ByType element
     */
    
	
	
	//=================================================Browser back button============================//
	@Then("^user click on browser back button$")
	public void user_click_on_browser_back_button() throws Throwable {
	driver.navigate().back();
	Thread.sleep(2000);
	logger.debug("User navigates back to Previous Page.............");

	}
	
	//=================================================Switch to Window Handle============================//
	
	@Then("^user click and navigates to child window$")
	public void user_click_and_navigates_to_child_window() throws Throwable 
	{
		String parentwindowhandle = driver.getWindowHandle();
		String subWindowhandler= null;
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> itertor = 	handles.iterator();
		while(itertor.hasNext())
		{
			subWindowhandler = itertor.next();
			driver.switchTo().window(subWindowhandler);
			System.out.println(subWindowhandler);
		}
	}
	
	@Given("^user switchback to parent window$")
	public void user_switchback_to_parent_window(String parentwindowhandle) throws Throwable {
		driver.close();
		driver.switchTo().window(parentwindowhandle);
	}
	@Then("^user close the newly opened tab$")
	public void user_close_the_newly_opened_tab() throws Throwable {
		/*Set<String> winSet = driver.getWindowHandles();
		List<String> winList = new ArrayList<String>(winSet);
		String newTab = winList.get(winList.size());
		while(winList.contains(newTab))
		{
			subWindowhandler = itertor.next();
			driver.switchTo().window(subWindowhandler);
			System.out.println(subWindowhandler);
		}
		driver.close();*/
		Alert alert = (Alert) driver.switchTo().activeElement();
		alert.accept();
		
	}
}
