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
	@Given("^user launches the browser and navigates to \"(.*?)\" page plcc$")
	public void user_launches_the_browser_and_navigates_to_page_plcc(String url) throws Throwable {
		initializeDriver();
//		if("mobile".equalsIgnoreCase(testtype)) {
//			logger.debug("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% Mobile Launched ");
//		}
//		else
//		{
//			getDriver().manage().window().setSize(new Dimension(1500,1700));	
//		}
		openBaseURL(url);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		waitForPageLoad(driver);
		findStorePO= PageFactory.initElements(driver, R1_FindStore_PO.class);
		globalElementHeader= PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
		searchProductPO = PageFactory.initElements(getDriver(), R1_SearchProduct_PO.class);
		System.err.println(webPropHelper.getConfigPropProperty(url));
		boolean flag = false;
		WebElement pop;
		try {
			Thread.sleep(200);
			pop = driver.findElement(By.xpath("//*[text()='Message text']/following-sibling::a"));
			flag = pop.isDisplayed();
			if (flag) {
				if (webPropHelper.getConfigPropProperty(url).contains("uat")) {
					pop = driver.findElement(By.xpath("//*[text()='Message text']/following-sibling::a"));
					waitForElement(pop);
					isDisplayed(pop);
					clickOnButton(pop);
				}
			}
		} catch (Exception e) {

		}
	}
    

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
	
	/*@Then("^user click and navigates to child test window$")
	public void user_click_and_navigates_to_child_TEst_window() throws Throwable 
	{
		
		String MainWindow=driver.getWindowHandle();	
		Set<String> s1=driver.getWindowHandles();		
        Iterator<String> i1=s1.iterator();		
        		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);
                    driver.findElement(by)
            }
        }
	}*/
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
