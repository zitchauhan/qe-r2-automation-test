package com.aso.qe.test.pageobject;

import static org.junit.Assert.fail;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

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
	
	@FindBy(xpath="//a[text()='Find A Store']")
	public WebElement storeLocator;
	

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
	
	public void clickSaveButton() {
		if (save.isEnabled()) {
			clickOnButton(save);
			waitForPageLoad(driver);
		}
		else {
			fail("Save button is disabled");
		}
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
		
		switch(dayStatus) {
		
		case "Open":
			clickOnButton(getfindElementByXPath("//div[text()='"+day+"']/..//button"));
			
			//Below line is to ensure the From and To will get successfully updated. If status is changed from Closed, From and To textboxes will be cleared.
			clickOnButton(getfindElementByXPath("//ul[(@class='selectbox-action-menu-dropdown' and not(contains(@style,'none')))]//button[text()='Closed']")); 
			
			clickSaveButton();
			clickOnButton(hoursSection);
			clickOnButton(getfindElementByXPath("//div[text()='"+day+"']/..//button"));
			clickOnButton(getfindElementByXPath("//ul[(@class='selectbox-action-menu-dropdown' and not(contains(@style,'none')))]//button[text()='"+dayStatus+"']"));
			driver.findElement(By.xpath("(//div[text()='"+day+"']/../..//input)[1]")).sendKeys(from);
			driver.findElement(By.xpath("(//div[text()='"+day+"']/../..//input)[2]")).sendKeys(to);
			clickSaveButton();
			break;
		case "Split":
			clickOnButton(getfindElementByXPath("//div[text()='"+day+"']/..//button"));
			
			//Below line is to ensure the From and To will get successfully updated. If status is changed from Closed, From and To textboxes will be cleared.
			clickOnButton(getfindElementByXPath("//ul[(@class='selectbox-action-menu-dropdown' and not(contains(@style,'none')))]//button[text()='Closed']")); 
			
			clickSaveButton();
			clickOnButton(hoursSection);
			clickOnButton(getfindElementByXPath("//div[text()='"+day+"']/..//button"));
			clickOnButton(getfindElementByXPath("//ul[(@class='selectbox-action-menu-dropdown' and not(contains(@style,'none')))]//button[text()='"+dayStatus+"']"));
			driver.findElement(By.xpath("(//div[text()='"+day+"']/../..//input)[1]")).sendKeys(from);
			driver.findElement(By.xpath("(//div[text()='"+day+"']/../..//input)[2]")).sendKeys(to);
			driver.findElement(By.xpath("(//div[text()='"+day+"']/../..//input)[3]")).sendKeys(splitFrom);
			driver.findElement(By.xpath("(//div[text()='"+day+"']/../..//input)[4]")).sendKeys(splitTo);
			clickSaveButton();
			break;
		case "Closed":
			clickOnButton(getfindElementByXPath("//div[text()='"+day+"']/..//button"));
			
			//Below line is to ensure the From and To will get successfully updated. If status is changed from Closed, From and To textboxes will be cleared.
			clickOnButton(getfindElementByXPath("//ul[(@class='selectbox-action-menu-dropdown' and not(contains(@style,'none')))]//button[text()='24 Hours']")); 
			
			clickSaveButton();
			clickOnButton(hoursSection);
			clickOnButton(getfindElementByXPath("//div[text()='"+day+"']/..//button"));
			clickOnButton(getfindElementByXPath("//ul[(@class='selectbox-action-menu-dropdown' and not(contains(@style,'none')))]//button[text()='"+dayStatus+"']"));
			clickSaveButton();
			break;
		case "24 Hours":
			clickOnButton(getfindElementByXPath("//div[text()='"+day+"']/..//button"));
			
			//Below line is to ensure the From and To will get successfully updated. If status is changed from Closed, From and To textboxes will be cleared.
			clickOnButton(getfindElementByXPath("//ul[(@class='selectbox-action-menu-dropdown' and not(contains(@style,'none')))]//button[text()='Closed']")); 
			
			clickSaveButton();
			clickOnButton(hoursSection);
			clickOnButton(getfindElementByXPath("//ul[(@class='selectbox-action-menu-dropdown' and not(contains(@style,'none')))]//button[text()='"+dayStatus+"']"));
			clickSaveButton();
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
	
	public void navigateStoreLocator() {
		logger.info("Navigating to Store Locator page");
		waitForPageLoad(driver);
		//scrollPageToWebElement(storeLocator);
		clickOnButton(storeLocator);
		waitForPageLoad(driver);
		logger.info("Navigated to Store Locator page");
	}
	
	public void selectCityFromStorePage(String cityName) {
		cityName=cityName.toLowerCase();
		logger.info("Selecting City");
		clickOnButton(getfindElementByXPath("//a[text()='"+cityName+"']"));
		waitForPageLoad(driver);
		logger.info("Selected City");
	}
	
	public void selectLocation(String locationName) {
		locationName=locationName.toLowerCase();
		logger.info("Selecting location");
		clickOnButton(getfindElementByXPath("//strong[text()='"+locationName+"']"));
		waitForPageLoad(driver);
		logger.info("Selected location");
	}
	
	public void selectStore(String storeName) {
		logger.info("Selecting Store");
		clickOnButton(getfindElementByXPath("//strong[text()='"+storeName+"']"));
		waitForPageLoad(driver);
		logger.info("Selected Store");
	}

	public void verifyStoreHoursInAcademy(String day,String status) {
		logger.info("Verifying store hours");
		switch(day) {
		case "Mon":
			day="Monday";
			break;
		case "Tue":
			day="Tuesday";
			break;
		case "Wed":
			day="Wednesday";
			break;
		case "Thu":
			day="Thursday";
			break;
		case "Fri":
			day="Friday";
			break;
		case "Sat":
			day="Saturday";
			break;
		case "Sun":
			day="Sunday";
			break;
		}
		WebElement ele = driver.findElement(By.xpath("//p[text()='"+day+"']/following-sibling::p"));
		scrollPageToWebElement(ele);
		String storeHour = ele.getText();
		Assert.assertEquals(status, storeHour);
		logger.info("Verifyied store hours");
	}
	
	
	public void closeStoreHoursAllDays() {
		logger.info("Deleting the store");
		clickOnButton(hoursSection);
		String existingStatus=driver.findElement(By.xpath("//div[text()='Mon']/..//button")).getText();
		if(existingStatus.equalsIgnoreCase("Closed")) {
			clickOnButton(getfindElementByXPath("//div[text()='Mon']/..//button"));
			clickOnButton(getfindElementByXPath("//ul[(@class='selectbox-action-menu-dropdown' and not(contains(@style,'none')))]//button[text()='24 Hours']"));
			clickOnButton(getfindElementByXPath("//div[text()='Apply to all']"));
			clickSaveButton();
			waitForPageLoad(driver);
			clickOnButton(hoursSection);
		}
		clickOnButton(getfindElementByXPath("//div[text()='Mon']/..//button"));
		clickOnButton(getfindElementByXPath("//ul[(@class='selectbox-action-menu-dropdown' and not(contains(@style,'none')))]//button[text()='Closed']"));
		clickOnButton(getfindElementByXPath("//div[text()='Apply to all']"));
		clickSaveButton();
		clickOnButton(getfindElementByXPath("//button[@type='button']/span[text()='Continue']"));
		waitForPageLoad(driver);
		logger.info("Deleted the store");
	}
	
	public void verifyStoreCloseInPDP() {
		logger.info("Verifying store hours in PDP page");
		Assert.assertEquals("Closed Today", driver.findElement(By.xpath("//div[@data-auid='PDP_StoreInfo_Hours']/div")).getText());
		logger.info("Verified store hours in PDP page");
	}
	
}
