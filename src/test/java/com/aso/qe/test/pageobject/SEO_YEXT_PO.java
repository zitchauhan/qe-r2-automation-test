package com.aso.qe.test.pageobject;

import static org.junit.Assert.fail;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aso.qe.framework.common.CommonActionHelper;

public class SEO_YEXT_PO extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(SEO_YEXT_PO.class);

	@FindBy(xpath="(//a[contains(text(),'Sign In')])[1]")
	public WebElement yextSignIn;

	@FindBy(xpath="//input[@id='username']")
	public WebElement username;

	@FindBy(xpath="//input[@id='password']")
	public WebElement password;

	@FindBy(xpath="//span[text()='Sign In']")
	public WebElement signInButton;

	@FindBy(xpath="//div[contains(text(),'Loading')]")
	public WebElement loader;

	@FindBy(xpath="//div[text()='Hours']")
	public WebElement hoursSection;

	@FindBy(xpath="//div[text()='Mon']/..//button")
	public WebElement dayStatusSelection;

	@FindBy(xpath="//button[text()='Save']")
	public WebElement save;
	

	/**
	 * Logs into YEXT.com
	 * @author mans5
	 * @throws Exception
	 */
	public void signIn() throws InterruptedException {
		logger.debug("Signing into Yext");
		clickOnButton(yextSignIn);
		setInputText(username, webPropHelper.getTestDataProperty("yextUsername"));
		setInputText(password, webPropHelper.getTestDataProperty("yextpassword"));
		clickOnButton(signInButton);
		logger.debug("Signed into Yext");
	}

	/**
	 * Selects an entity
	 * @author mans5
	 * @throws Exception
	 */
	public void selectExistingEntity(String entityFolder, String entity) throws InterruptedException {

		logger.debug("Selecting the entity");
		String entityFolderText = "//span[text()='"+entityFolder+"']";
		clickOnButton(getfindElementByXPath(entityFolderText));
		waitForPageLoad(driver);
		Thread.sleep(5000);  //Mandatory wait time
		String entityText = "//strong[text()='"+entity+"']";
		clickOnButton(getfindElementByXPath(entityText));
		waitForPageLoad(driver);
		captureScreenShot("Pass");
		logger.debug("Selected the entity "+entity);
	}

	/**
	 * Modifies hours for the Store
	 * @author mans5
	 * @param day - Mon, Tue, Wed etc.
	 * @param dayStatus - Open, Split, 24 Hours, Closed
	 * @param from - Time in format HH:MM AM format. Example 08:35 AM
	 * @param to - Time in format HH:MM AM format. Example 12.51 PM
	 * @param splitFrom - Time in format HH:MM AM format. Example 08:35 AM. Pass "" if not used.
	 * @param splitTo - Time in format HH:MM AM format. Example 12.51 PM. Pass "" if not used.
	 * @throws InterruptedException 
	 * @throws Exception
	 */
	public void modifyHours(String day,String dayStatus, String from, String to,String splitFrom,String splitTo) throws InterruptedException {
		
		logger.info("Modifying hours and store open status for a Store");
		clickOnButton(hoursSection);
		clickOnButton(dayStatusSelection);
		
		switch(dayStatus) {
		
		case "Open":
			clickOnButton(getfindElementByXPath("//ul[(@class='selectbox-action-menu-dropdown' and not(contains(@style,'none')))]//button[text()='"+dayStatus+"']"));
			driver.findElement(By.xpath("(//div[text()='"+day+"']/../..//input)[1]")).sendKeys(from);
			driver.findElement(By.xpath("(//div[text()='"+day+"']/../..//input)[2]")).sendKeys(to);
			clickOnButton(save);
			break;
		case "Split":
			clickOnButton(getfindElementByXPath("//ul[(@class='selectbox-action-menu-dropdown' and not(contains(@style,'none')))]//button[text()='"+dayStatus+"']"));
			driver.findElement(By.xpath("(//div[text()='"+day+"']/../..//input)[1]")).sendKeys(from);
			driver.findElement(By.xpath("(//div[text()='"+day+"']/../..//input)[2]")).sendKeys(to);
			driver.findElement(By.xpath("(//div[text()='"+day+"']/../..//input)[3]")).sendKeys(splitFrom);
			driver.findElement(By.xpath("(//div[text()='"+day+"']/../..//input)[4]")).sendKeys(splitTo);
			clickOnButton(save);
			break;
		case "Closed":
		case "24 Hours":
			clickOnButton(getfindElementByXPath("(//button[text()='"+dayStatus+"'])[1]"));
			clickOnButton(save);
			break;
			
		}
		waitForPageLoad(driver);
		if(driver.findElements(By.xpath("//div[text()='Provided hours are invalid']")).size()>0) {
			fail("Error message displayed. Could not save");
		}
		else {
			logger.info("Modifed hours and store open status for a Store");
		}
		
	}
}
