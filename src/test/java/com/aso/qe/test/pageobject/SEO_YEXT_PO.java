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

	@FindBy(xpath="//button[text()='Cancel']")
	public WebElement cancelBtn;
	
	@FindBy(xpath="//a[text()='Find A Store']")
	public WebElement storeLocator;

	@FindBy(xpath="//ul[(@class='selectbox-action-menu-dropdown' and not(contains(@style,'none')))]//button[text()='Closed']")
	public WebElement storeClosed;

	@FindBy(xpath="//ul[(@class='selectbox-action-menu-dropdown' and not(contains(@style,'none')))]//button[text()='24 Hours']")
	public WebElement store24Hours;

	@FindBy(xpath="//div[text()='Provided hours are invalid']")
	public WebElement invalidHoursMessage;

	@FindBy(xpath="//div[text()='Mon']/..//button")
	public WebElement firstOptionExistingStatus;

	@FindBy(xpath="//div[text()='Apply to all']")
	public WebElement applyToAll;

	@FindBy(xpath="//button[@type='button']/span[text()='Continue']")
	public WebElement continuePopUp;

	@FindBy(xpath="//div[@data-auid='PDP_StoreInfo']/div[2]/div")
	public WebElement storeHoursPDP;

	@FindBy(xpath="//div[text()='Neighborhood']")
	public WebElement storeNameNeighborhoodSection;

	@FindBy(xpath="//div[text()='Neighborhood']/ancestor::node()[3]//input")
	public WebElement storeNameNeighborhoodUpdate;

	@FindBy(xpath="//div[text()='This field is required for entities of this type.']")
	public WebElement storeNameRequiredErrorMsg;

	@FindBy(xpath="//div[text()='Address']")
	public WebElement addressSection;

	@FindBy(xpath="(//div[text()='Address']/ancestor::node()[3]//input)[1]")
	public WebElement addressLine1;

	@FindBy(xpath="(//div[text()='Address']/ancestor::node()[3]//input)[2]")
	public WebElement addressLine2;

	@FindBy(xpath="(//div[text()='Address']/ancestor::node()[3]//input)[3]")
	public WebElement addressCity;

	@FindBy(xpath="//div[text()='State']/..//span[contains(@class,'dropdown')]")
	public WebElement addressStateDropdown;

	@FindBy(xpath="//input[@placeholder='Search']")
	public WebElement addressStateSearch;

	@FindBy(xpath="(//div[text()='Address']/ancestor::node()[3]//input)[5]")
	public WebElement addressZipcode;

	@FindBy(xpath="//div[text()='Main Phone']")
	public WebElement mainPhoneSection;

	@FindBy(xpath="//div[text()='Main Phone']/../../..//button")
	public WebElement mainPhoneCodeDropDown;

	@FindBy(xpath="//div[text()='Main Phone']/../../..//input")
	public WebElement mainPhoneNumberText;

	@FindBy(xpath="//div[text()='Description']")
	public WebElement storeDescriptionSection;

	@FindBy(xpath="//div[text()='Description']/../../..//textarea")
	public WebElement storeDescriptionText;

	@FindBy(xpath="//div[@data-auid='PDP_StoreInfo_Address']/div[1]")
	public WebElement storeNameUI;

	@FindBy(xpath="//div[@data-auid='PDP_StoreInfo_Address']/div[2]")
	public WebElement storeAddressLinesUI;

	@FindBy(xpath="//div[@data-auid='PDP_StoreInfo_Address']/div[3]")
	public WebElement storeCityStateUI;

	@FindBy(xpath="//div[@data-auid='PDP_StoreInfo_Address']/div[4]")
	public WebElement storeMainPhoneUI;

	@FindBy(xpath="//div[@data-auid='PDP_StoreInfo_Hours']/div")
	public WebElement storeOpenHoursUI;

	@FindBy(xpath="//span[text()='Add Location']")
	public WebElement addLocation;

	@FindBy(xpath="//button[text()='Add Single Entity']")
	public WebElement singleEntity;

	@FindBy(xpath="(//div[@class='entity-field-content-edit']//span)[1]")
	public WebElement countryDropdown;

	@FindBy(xpath="//div[text()='Name']/ancestor::node()[3]//input")
	public WebElement nameInput;

	@FindBy(xpath="//button[text()='Select primary category']")
	public WebElement primaryCategory;

	@FindBy(xpath="//div[@tid='entity-edit-primary-category']//input")
	public WebElement primaryCategoryInput;

	@FindBy(xpath="(//div[@tid='category-result'])[1]")
	public WebElement selectCategory;

	@FindBy(xpath="//button[text()='+ Add a category']")
	public WebElement addCategory;

	@FindBy(xpath="//div[@tid='entity-edit-additional-categories']//input")
	public WebElement addAdditionalCategoryInput;

	@FindBy(xpath="//input[@tid='address-line1-input']")
	public WebElement newAddressLine1;

	@FindBy(xpath="//input[@tid='address-line2-input']")
	public WebElement newAddressLine2;

	@FindBy(xpath="//input[@tid='address-line2-input']")
	public WebElement addressFloor;

	@FindBy(xpath="//input[@tid='address-postalCode-input']")
	public WebElement pinCode;

	@FindBy(xpath="//input[@tid='address-city-input']")
	public WebElement city;

	@FindBy(xpath="//input[@tid='address-region-input']")
	public WebElement state;

	@FindBy(xpath="(//div[@class='featured-message-edit-row']//input[@tid='entity-edit-text-field-input'])[1]")
	public WebElement featuredMessageTxt;

	@FindBy(xpath="//div[text()='Entity ID']/../../..//input[@tid='entity-edit-text-field-input']")
	public WebElement entityIDTxt;

	@FindBy(xpath="//button[text()='Continue']")
	public WebElement continueBtn;

	@FindBy(xpath="//div[text()='Please provide a unique value for the Entity ID']")
	public WebElement entityErrorMsg;

	@FindBy(xpath="//div[@class='folder-display']")
	public WebElement folder;
	
	@FindBy(xpath="//div[@class='folder-row-name']")
	public WebElement folderRow;
	
	@FindBy(xpath="//div[text()='ASO_Auto_Test']")
	public WebElement folderName;

	@FindBy(xpath="//button[text()='Select']")
	public WebElement selectButton;

	@FindBy(xpath="//div[text()='Description']")
	public WebElement descriptionSection;

	@FindBy(xpath="//textarea[@tid='entity-edit-text-field-input']")
	public WebElement descriptionInput;
	
	@FindBy(xpath="//div[text()='Neighborhood']")
	public WebElement neighborhoodSection;
	
	@FindBy(xpath="//input[@tid='entity-edit-text-field-input']")
	public WebElement neighborhoodInput;
	
	@FindBy(xpath="//div[text()='Services']")
	public WebElement servicesSection;

	@FindBy(xpath="//input[@tid='entity-edit-text-field-input']")
	public WebElement secvicesInput;
	
	@FindBy(xpath="//div[text()='Brands']")
	public WebElement brandsSection;

	@FindBy(xpath="//input[@tid='entity-edit-text-field-input']")
	public WebElement brandsInput;
	
	@FindBy(xpath="//div[text()='Pickup and Delivery Services']")
	public WebElement pickUpDeliverySection;


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

	
	public void selectNextArrow(String entity) {
		if(driver.findElements(By.xpath("(//a[@role='button' and @class='page-next page-next-disabled'])[1]")).size()==0) {
			clickOnButton(getfindElementByXPath("(//a[@role='button' and @class='page-next'])[1]")); 
			waitForPageLoad(driver);
			if(driver.findElements(By.xpath("//strong[text()='"+entity+"']")).size()>0) {
				clickOnButton(getfindElementByXPath("//strong[text()='"+entity+"']"));
				waitForPageLoad(driver);
				logger.info("Selected the entity "+entity);
			}
			else {
				selectNextArrow(entity);
			}
		}
		else if(driver.findElements(By.xpath("//strong[text()='"+entity+"']")).size()==0 & 
				driver.findElements(By.xpath("(//a[@role='button' and @class='page-next page-next-disabled'])[1]")).size()>0){
			Assert.fail("No Entity with name "+entity+" is present");
		}
		
	}
	
	
	/**
	 * Selects an entity
	 * @author mans5
	 * @throws Exception
	 */
	public String[] selectExistingEntity(String entityFolder, String entity) throws InterruptedException {

		logger.debug("Selecting the entity");
		String entityFolderText = "//span[text()='"+entityFolder+"']";
		clickOnButton(getfindElementByXPath(entityFolderText));
		waitForPageLoad(driver);
		Thread.sleep(5000);  //Mandatory wait time
		
		if(driver.findElements(By.xpath("//strong[text()='"+entity+"']")).size()>0){
			clickOnButton(getfindElementByXPath("//strong[text()='"+entity+"']"));
			waitForPageLoad(driver);
			logger.info("Selected the entity "+entity);
		}
		else {
			selectNextArrow(entity);
		}
		
		
		/*if(driver.findElements(By.xpath("//strong[text()='"+entity+"']")).size()>0) {
			clickOnButton(getfindElementByXPath("//strong[text()='"+entity+"']"));
			waitForPageLoad(driver);
			logger.debug("Selected the entity "+entity);
		}
		else if(driver.findElement(By.xpath("(//a[@role='button' and @class='page-next'])[1]")).isEnabled()) {
			clickOnButton(getfindElementByXPath("(//a[@role='button' and @class='page-next'])[1]"));
			if(driver.findElements(By.xpath("//strong[text()='"+entity+"']")).size()>0) {
				clickOnButton(getfindElementByXPath("//strong[text()='"+entity+"']"));
				waitForPageLoad(driver);
				logger.debug("Selected the entity "+entity);
			}
		}
		else {
			Assert.fail("No Entity is displayed");
		}*/
		
		clickOnButton(addressSection); //To retrieve the existing zipcode and search in ASO page
		String zipCode = driver.findElement(By.xpath("//input[@tid='address-postalCode-input']")).getAttribute("value");
		logger.info("Zipcode retrieved is: "+zipCode);
		
		String addressLine1 = driver.findElement(By.xpath("(//input[@class='address-property-input'])[1]")).getAttribute("value");
		String addressLine2 = driver.findElement(By.xpath("(//input[@class='address-property-input'])[2]")).getAttribute("value");
		String city = driver.findElement(By.xpath("(//input[@class='address-property-input'])[3]")).getAttribute("value");
		String zip = driver.findElement(By.xpath("(//input[@class='address-property-input'])[4]")).getAttribute("value");
		String state = driver.findElement(By.xpath("(//button[@tid='dropdown-trigger']/span)[1]")).getText();
		
		state = stateCodes(state);
		logger.info("State retrieved is: "+state);
		clickOnButton(cancelBtn);
		waitForPageLoad(driver);
		
		String storeName = driver.findElement(By.xpath("//div[text()='Neighborhood']/../../..//div[@tid='entity-edit-field-display']//span")).getText();
		
		String mainPhone = driver.findElement(By.xpath("//div[@class='entity-phone-field']")).getText();
		mainPhone = mainPhone.substring(8);
		
		String[] data = {addressLine1,addressLine2,city,zip,zipCode,mainPhone,storeName,state};
		
		return data;
	}

	
	public String stateCodes(String stateCode) {
		String state = "";
		
		switch(stateCode) {
		case "AL":
			state= "Alabama";
			break;
		case "AK":
			state= "Alaska";
			break;
		case "AR":
			state= "Arkansas";
			break;
		case "CA":
			state= "California";
			break;
		case "DC":
			state= "District Of Columbia";
			break;
		case "FL":
			state= "Florida";
			break;
		case "GA":
			state= "Georgia";
			break;
		case "HI":
			state= "Hawaii";
			break;
		case "IL":
			state= "Illinois";
			break;
		case "ID":
			state= "Indiana";
			break;
		case "KS":
			state= "Kansas";
			break;
		case "KY":
			state= "Kentucky";
			break;
		case "LA":
			state= "Louisiana";
			break;
		case "MI":
			state= "Mississippi";
			break;
		case "MS":
			state= "Missouri";
			break;
		case "NM":
			state= "New Mexico";
			break;
		case "NY":
			state= "Newyork";
			break;
		case "NC":
			state= "North Carolina";
			break;
		case "OH":
			state= "Ohio";
			break;
		case "OK":
			state= "Oklahoma";
			break;
		case "PA":
			state= "Pennsylvania";
			break;	
		case "SA":
			state= "South Carolina";
			break;	
		case "TN":
			state= "Tennessee";
			break;	
		case "TX":
			state= "Texas";
			break;	
		case "UT":
			state= "Utah";
			break;	
		case "WA":
			state= "Washington";
			break;	
		}
		logger.info("State returned is: "+state);
		return state;
		
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

	public String todayDay() {
		String formatter = new SimpleDateFormat("EEE").format(new Date()); //Returns in "Mon" format
		logger.info("Today's day is: "+formatter);
		return formatter;
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
		
		if(day.equals("")) {
			day=todayDay();
		}
		
		String txt = driver.findElement(By.xpath("//div[text()='"+day+"']/..//button")).getText();
		switch(dayStatus) {

		case "Open":
			clickOnButton(getfindElementByXPath("//div[text()='"+day+"']/..//button"));
			if(txt.equalsIgnoreCase("Open")) {

				//Below line is to ensure the From and To will get successfully updated. If status is changed from Closed, From and To textboxes will be cleared.
				clickOnButton(storeClosed); 
				clickSaveButton();

				if(continuePopUp.isDisplayed()) {
					clickOnButton(continuePopUp);
					waitForPageLoad(driver);
				}

				clickOnButton(hoursSection);
				clickOnButton(getfindElementByXPath("//div[text()='"+day+"']/..//button"));
				clickOnButton(getfindElementByXPath("//ul[(@class='selectbox-action-menu-dropdown' and not(contains(@style,'none')))]//button[text()='"+dayStatus+"']"));
				driver.findElement(By.xpath("(//div[text()='"+day+"']/../..//input)[1]")).sendKeys(from);
				driver.findElement(By.xpath("(//div[text()='"+day+"']/../..//input)[2]")).sendKeys(to);
				clickSaveButton();
			}
			else {
				clickOnButton(getfindElementByXPath("//ul[(@class='selectbox-action-menu-dropdown' and not(contains(@style,'none')))]//button[text()='"+dayStatus+"']"));
				driver.findElement(By.xpath("(//div[text()='"+day+"']/../..//input)[1]")).sendKeys(from);
				driver.findElement(By.xpath("(//div[text()='"+day+"']/../..//input)[2]")).sendKeys(to);
				clickSaveButton();
			}
			break;
		case "Split":
			clickOnButton(getfindElementByXPath("//div[text()='"+day+"']/..//button"));
			if(txt.equalsIgnoreCase("Split")) {
				//Below line is to ensure the From and To will get successfully updated. If status is changed from Closed, From and To textboxes will be cleared.
				clickOnButton(storeClosed); 
				clickSaveButton();
				if(continuePopUp.isDisplayed()) {
					clickOnButton(continuePopUp);
					waitForPageLoad(driver);
				}

				clickOnButton(hoursSection);
				clickOnButton(getfindElementByXPath("//div[text()='"+day+"']/..//button"));
				clickOnButton(getfindElementByXPath("//ul[(@class='selectbox-action-menu-dropdown' and not(contains(@style,'none')))]//button[text()='"+dayStatus+"']"));
				driver.findElement(By.xpath("(//div[text()='"+day+"']/../..//input)[1]")).sendKeys(from);
				driver.findElement(By.xpath("(//div[text()='"+day+"']/../..//input)[2]")).sendKeys(to);
				driver.findElement(By.xpath("(//div[text()='"+day+"']/../..//input)[3]")).sendKeys(splitFrom);
				driver.findElement(By.xpath("(//div[text()='"+day+"']/../..//input)[4]")).sendKeys(splitTo);
				clickSaveButton();
			}
			else {
				clickOnButton(getfindElementByXPath("//ul[(@class='selectbox-action-menu-dropdown' and not(contains(@style,'none')))]//button[text()='"+dayStatus+"']"));
				driver.findElement(By.xpath("(//div[text()='"+day+"']/../..//input)[1]")).sendKeys(from);
				driver.findElement(By.xpath("(//div[text()='"+day+"']/../..//input)[2]")).sendKeys(to);
				driver.findElement(By.xpath("(//div[text()='"+day+"']/../..//input)[3]")).sendKeys(splitFrom);
				driver.findElement(By.xpath("(//div[text()='"+day+"']/../..//input)[4]")).sendKeys(splitTo);
				clickSaveButton();
			}
			break;
		case "Closed":
			clickOnButton(getfindElementByXPath("//div[text()='"+day+"']/..//button"));

			if(txt.equalsIgnoreCase("Closed")) {
				//Below line is to ensure the From and To will get successfully updated. If status is changed from Closed, From and To textboxes will be cleared.
				clickOnButton(store24Hours); 

				clickSaveButton();
				clickOnButton(hoursSection);
				clickOnButton(getfindElementByXPath("//div[text()='"+day+"']/..//button"));
				clickOnButton(getfindElementByXPath("//ul[(@class='selectbox-action-menu-dropdown' and not(contains(@style,'none')))]//button[text()='"+dayStatus+"']"));
				clickSaveButton();
			}
			else {
				clickOnButton(getfindElementByXPath("//ul[(@class='selectbox-action-menu-dropdown' and not(contains(@style,'none')))]//button[text()='"+dayStatus+"']"));
				clickSaveButton();
			}
			break;
		case "24 Hours":
			clickOnButton(getfindElementByXPath("//div[text()='"+day+"']/..//button"));
			if(txt.equalsIgnoreCase("24 Hours")) {
				//Below line is to ensure the From and To will get successfully updated. If status is changed from Closed, From and To textboxes will be cleared.
				clickOnButton(storeClosed); 
				clickSaveButton(); 
				waitForPageLoad(driver);
				if(continuePopUp.isDisplayed()) {
				clickOnButton(continuePopUp);
				waitForPageLoad(driver);
				}
				
				clickOnButton(hoursSection);
				clickOnButton(getfindElementByXPath("//div[text()='"+day+"']/..//button"));
				clickOnButton(getfindElementByXPath("//ul[(@class='selectbox-action-menu-dropdown' and not(contains(@style,'none')))]//button[text()='"+dayStatus+"']"));
				clickSaveButton();
			}
			else {
				clickOnButton(getfindElementByXPath("//ul[(@class='selectbox-action-menu-dropdown' and not(contains(@style,'none')))]//button[text()='"+dayStatus+"']"));
				clickSaveButton();
			}
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
		driver.findElement(By.xpath("//a[text()='Find A Store']")).click();
		//clickOnButton(storeLocator);
		waitForPageLoad(driver);
		logger.info("Navigated to Store Locator page");
	}

	public void selectStateFromStorePage(String cityName) {
		cityName=cityName.toLowerCase();
		logger.info("Selecting State");
		driver.findElement(By.xpath("//a[text()='"+cityName+"']")).click();
		//clickOnButton(getfindElementByXPath("//a[text()='"+cityName+"']"));
		waitForPageLoad(driver);
		logger.info("Selected State");
	}

	public void selectCity(String cityName) {
		String cityLowerCase=cityName.toLowerCase();
		logger.info("Selecting City");
		//driver.findElement(By.xpath("//strong[text()='"+cityName+"'] | //strong[text()='"+cityLowerCase+"']")).click();
		clickOnButton(getfindElementByXPath("//strong[text()='"+cityName+"'] | //strong[text()='"+cityLowerCase+"']"));
		waitForPageLoad(driver);
		logger.info("Selected City");
	}

	public void selectStore(String storeName) throws InterruptedException {
		logger.info("Selecting Store");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//strong[text()='"+storeName+"']")).click();
		//clickOnButton(getfindElementByXPath("//strong[text()='"+storeName+"']"));
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
		String firstOptionExistingStatusText=firstOptionExistingStatus.getText();
		if(firstOptionExistingStatusText.equalsIgnoreCase("Closed")) {
			clickOnButton(firstOptionExistingStatus);
			clickOnButton(store24Hours);
			clickOnButton(applyToAll);
			clickSaveButton();
			waitForPageLoad(driver);
			clickOnButton(hoursSection);
		}
		clickOnButton(firstOptionExistingStatus);
		clickOnButton(storeClosed);
		clickOnButton(applyToAll);
		clickSaveButton();
		clickOnButton(continuePopUp);
		waitForPageLoad(driver);
		logger.info("Deleted the store");
	}

	public void printStoreHoursInPDP() {
		logger.info("Checking the store hours in PDP page");
		String storeOpenUI = driver.findElement(By.xpath("//div[@data-auid='PDP_StoreInfo_Hours']/div")).getText();
		logger.info("Store hours in PDP page is: "+storeOpenUI);
	}

	public String generateRandomString() {
		String randomGeneratedString = RandomStringUtils.randomAlphabetic(5);
		logger.debug("The new random generated string is " + randomGeneratedString);
		return randomGeneratedString;
	}

	public String updateStoreName(String name) {
		logger.info("Updating store name(Neighborhood)");
		clickOnButton(storeNameNeighborhoodSection);
		String randomeName = "Yext Store "+generateRandomString();
		if(name.equals("")) {
			name=randomeName;
			storeNameNeighborhoodUpdate.clear();
			storeNameNeighborhoodUpdate.sendKeys(name);
		}
		else {
			storeNameNeighborhoodUpdate.clear();
			storeNameNeighborhoodUpdate.sendKeys(name);
		}
		clickSaveButton();
		Assert.assertFalse(driver.findElements(By.xpath("//div[text()='This field is required for entities of this type.']")).size()>0); //verify error message when saved
		logger.info("Updated store name(Neighborhood) to: " +name);
		return name;
	}

	public void updateStoreAddress(ArrayList<String> address) {
		logger.info("Updating store address");

		//Address - Address Line1, Line 2, City, State and Zipcode to be passed sequentially in an array
		clickOnButton(addressSection);
		addressLine1.clear();  //Line 1
		addressLine1.sendKeys(address.get(0));  //Line 1
		addressLine2.clear();  //Line 2
		addressLine2.sendKeys(address.get(1));  //Line 2
		addressCity.clear();  //City
		addressCity.sendKeys(address.get(2));  //City
		String state = address.get(3); //State
		clickOnButton(addressStateDropdown); //State dropdown
		addressStateSearch.sendKeys(state); //State
		clickOnButton(getfindElementByXPath("//span[@class='ui-select-label' and text()='"+state+"']"));
		addressZipcode.clear();  //Zipcode
		addressZipcode.sendKeys(address.get(4));  //Zipcode
		clickSaveButton();
		Assert.assertFalse(driver.findElements(By.xpath("//div[text()='Invalid Address']")).size()>0); //Verify if address invalid error message is displayed
		logger.info("Updated store address");
	}

	public String updateStoreMainPhone(String mainPhoneCode, String mainPhoneNumber) {
		logger.info("Updating store Main Phone");
		clickOnButton(mainPhoneSection);
		clickOnButton(mainPhoneCodeDropDown);
		switch(mainPhoneCode) {
		case "US":
			clickOnButton(getfindElementByXPath("//ul[@class='selectbox-action-menu-dropdown']//button[contains(text(),'"+mainPhoneCode+"')]"));
			mainPhoneNumberText.clear();
			if(mainPhoneNumber.equals("")) {
				String randomUSNumber = "415".concat(RandomStringUtils.randomNumeric(7));
				mainPhoneNumber=randomUSNumber;
				mainPhoneNumberText.sendKeys(mainPhoneNumber);
			}
			else {
				mainPhoneNumberText.sendKeys(mainPhoneNumber);
			}
			break;

		case "IN":
			clickOnButton(getfindElementByXPath("//ul[@class='selectbox-action-menu-dropdown']//button[contains(text(),'"+mainPhoneCode+"')]"));
			mainPhoneNumberText.clear();
			if(mainPhoneNumber.equals("")) {
				String randomINNumber = RandomStringUtils.randomNumeric(10);
				mainPhoneNumber=randomINNumber;
				mainPhoneNumberText.sendKeys(mainPhoneNumber);
			}
			else {
				mainPhoneNumberText.sendKeys(mainPhoneNumber);
			}
			break;
		}
		clickSaveButton();
		Assert.assertFalse(driver.findElements(By.xpath("//div[text()='Value must be a valid phone number']")).size()>0); //verify error message when saved
		logger.info("Updated store Main Phone");

		return mainPhoneNumber;
	}

	public String updateStoreDescription(String descriptionText) {
		logger.info("Updating store description");
		clickOnButton(storeDescriptionSection);
		storeDescriptionText.clear();
		String randomDescription = "";
		if(descriptionText.equals("")) {
			randomDescription = "New store in town ".concat(RandomStringUtils.randomAlphabetic(5));
			storeDescriptionText.sendKeys(randomDescription);
		}
		else {
			randomDescription=descriptionText;
			storeDescriptionText.sendKeys(randomDescription);
		}
		clickSaveButton();
		Assert.assertFalse(driver.findElements(By.xpath("//div[text()='Length must be at least 10 characters']")).size()>0); //verify error message when saved
		logger.info("Updated store description");
		
		return randomDescription;
	}

	public void verifyStoreDetails(String storeName,ArrayList<String> address,String yextMainPhoneValidation) {
		logger.info("Verifying store details in PDP page");

		printStoreHoursInPDP();

		Assert.assertEquals(storeName, driver.findElement(By.xpath("//div[@data-auid='PDP_StoreInfo_Address']/div[1]")).getText());

		String addressLines = driver.findElement(By.xpath("//div[@data-auid='PDP_StoreInfo_Address']/div[2]")).getText();
		Assert.assertTrue(addressLines.contains(address.get(0)));
		if(!address.get(1).equals(""))
			Assert.assertTrue(addressLines.contains(address.get(1)));

		String cityState = driver.findElement(By.xpath("//div[@data-auid='PDP_StoreInfo_Address']/div[3]")).getText();
		Assert.assertTrue(cityState.contains(address.get(2)));
		Assert.assertTrue(cityState.contains(address.get(3)));
		Assert.assertTrue(cityState.contains(address.get(4)));

		String mainPhone = driver.findElement(By.xpath("//div[@data-auid='PDP_StoreInfo_Address']/div[4]")).getText();
		mainPhone=mainPhone.replaceAll("[^a-zA-Z0-9]", "");
		yextMainPhoneValidation=yextMainPhoneValidation.replaceAll("[^a-zA-Z0-9]", "");
		Assert.assertTrue(mainPhone.contains(yextMainPhoneValidation));
		logger.info("Verified store details in PDP page");
	}

	public void verifyStoreCloseInPDP() {
		logger.info("Verifying store hours in PDP page");
		Assert.assertEquals("Closed Today", driver.findElement(By.xpath("//div[@data-auid='PDP_StoreInfo']/div[2]/div")).getText());
		logger.info("Verified store hours in PDP page");
	}

	public void selectAddSingleEntity() throws InterruptedException {
		logger.info("Selecting Single Entity option");
		clickOnButton(addLocation);
		Thread.sleep(2000);
		clickOnButton(singleEntity);
		waitForPageLoad(driver);
		logger.info("Selected Single Entity option");
	}

	public String[] createEntity(String country,String category,String addressLine1,String addressLine2,String floorTxt,
			String cityTxt,String stateTxt,String stateCodeTxt,String pinTxt, String mainPhoneCode,String mainPhoneNumber) {

		//Select Country
		clickOnButton(countryDropdown);
		clickOnButton(getfindElementByXPath("//span[text()='"+country+"']")); 
		waitForPageLoad(driver);

		//Place the newly create location in the below hard-coded folder for testing
		clickOnButton(folder);
		clickOnButton(folderRow);
		clickOnButton(folderName);
		clickOnButton(selectButton);

		String storeEntityName = "ASO_Test_"+RandomStringUtils.randomAlphabetic(5);
		nameInput.sendKeys(storeEntityName);

		//Primary Category
		clickOnButton(primaryCategory);
		primaryCategoryInput.sendKeys(category);
		clickOnButton(selectCategory);

		switch(country) {
		case "India":
			//Address
			newAddressLine1.sendKeys(addressLine1); //Address line 1
			newAddressLine2.sendKeys(addressLine2); //Address Line 2
			pinCode.sendKeys(pinTxt); //Pin Code
			city.sendKeys(cityTxt); //City
			state.sendKeys(stateTxt); //State/Region
			clickOnButton(mainPhoneCodeDropDown);
			clickOnButton(getfindElementByXPath("//ul[@class='selectbox-action-menu-dropdown']//button[contains(text(),'"+mainPhoneCode+"')]"));
			break;

		case "United States":
			//Address
			newAddressLine1.sendKeys(addressLine1); //Address line 1
			if(!(floorTxt.equals(""))) {
				addressFloor.sendKeys(floorTxt); //Floor
			}
			city.sendKeys(cityTxt); //City
			clickOnButton(addressStateDropdown);
			addressStateSearch.sendKeys(stateCodeTxt); //State
			clickOnButton(getfindElementByXPath("//span[@class='ui-select-label' and text()='"+stateCodeTxt+"']"));
			pinCode.sendKeys(pinTxt); //Pin Code
			clickOnButton(mainPhoneCodeDropDown);
			clickOnButton(getfindElementByXPath("//ul[@class='selectbox-action-menu-dropdown']//button[contains(text(),'"+mainPhoneCode+"')]"));
			break;
		}
		
		if(mainPhoneNumber.equals("")) {
			String randomINNumber = RandomStringUtils.randomNumeric(10);
			mainPhoneNumber=randomINNumber;
			mainPhoneNumberText.sendKeys(mainPhoneNumber);
		}
		else {
			mainPhoneNumberText.sendKeys(mainPhoneNumber);
		}

		featuredMessageTxt.sendKeys("This is a new feature");
		entityIDTxt.sendKeys(RandomStringUtils.randomNumeric(4));
		clickOnButton(continueBtn); 
		waitForPageLoad(driver);
		
		/*ArrayList<String> arr = new ArrayList<>();
		arr.add("505");
		arr.add("639");
		arr.add("126");
		arr.add("924");*/
		/*String num = null;
		for(int i=0;i<10;i++) {
			num = RandomStringUtils.randomNumeric(3);
			arr.add(num);
		}
*/
		/*for(int i=0;i<arr.size();i++) {
			entityIDTxt.sendKeys(arr.get(i));
			clickOnButton(continueBtn); 
			waitForPageLoad(driver);
			if(driver.findElements(By.xpath("//div[text()='Please provide a unique value for the Entity ID']")).size()>0) {
				i=i+1;
				recursion(arr.get(i));
			}
			else {
				break;
			}
		}*/

		/*Assert.assertFalse(driver.findElements(By.xpath("//div[text()='Please provide valid field values']")).size()>0); //verify all fields error message when saved
		Assert.assertFalse(driver.findElements(By.xpath("//div[text()='Value must be a valid phone number']")).size()>0); //verify phone number error message when saved
		Assert.assertFalse(driver.findElements(By.xpath("//div[text()='Invalid Address']")).size()>0);*/ //verify address error message when saved
		Assert.assertFalse(driver.findElements(By.xpath("//div[text()='Please provide a unique value for the Entity ID']")).size()>0);
		Assert.assertTrue(driver.findElements(By.xpath("//div[@class='breadcrumb-element']/..//div[text()='"+storeEntityName+"']")).size()>0); //Ensure user is navigated to next page after saving
		logger.info("Created a new store: " +storeEntityName);
		String[] data = {storeEntityName}; //Add in this array anything as per the need to return back the data 
		return data;
		
	}

	public int validateEntityErrorMessage(ArrayList<String> entityIDs) {
		int i=0;
		for(i=0;i<entityIDs.size();++i) {  //505,639,126,924
			//i+=1;
			if(driver.findElements(By.xpath("//div[text()='Please provide a unique value for the Entity ID']")).size()>0) {
				entityIDTxt.clear();
				entityIDTxt.sendKeys(entityIDs.get(i)); //639
				clickOnButton(continueBtn);   waitForPageLoad(driver);
 				validateEntityErrorMessage(entityIDs);
			}
		}
		return i;
	}
	
	
	public void recursion(int i,String entityID) {
		if(driver.findElements(By.xpath("//div[text()='Please provide a unique value for the Entity ID']")).size()>0) {
			entityIDTxt.clear();
			entityIDTxt.sendKeys(entityID);
			clickOnButton(continueBtn);   
			waitForPageLoad(driver);
			recursion(i,entityID);
		}
	}

	public String fillMandatoryFields(String from,String to) {
		logger.info("Filling mandatory fields");

		//Description section
		clickOnButton(descriptionSection);
		descriptionInput.sendKeys("New Store In Town "+RandomStringUtils.randomAlphabetic(5));
		clickSaveButton(); waitForPageLoad(driver);
		
		//Hours section
		clickOnButton(hoursSection);
		clickOnButton(firstOptionExistingStatus);
		clickOnButton(getfindElementByXPath("//ul[(@class='selectbox-action-menu-dropdown' and not(contains(@style,'none')))]//button[text()='Open']"));

		driver.findElement(By.xpath("(//div[text()='Mon']/../..//input)[1]")).sendKeys(from);
		driver.findElement(By.xpath("(//div[text()='Mon']/../..//input)[2]")).sendKeys(to);
		clickOnButton(applyToAll);
 		clickSaveButton(); waitForPageLoad(driver);
		
		//Neighborhood section
		String neighbourhoodName = "Store "+RandomStringUtils.randomAlphabetic(5);
		logger.info("Neighborhood store name is: "+neighbourhoodName);
		clickOnButton(neighborhoodSection); waitForPageLoad(driver);
		neighborhoodInput.sendKeys(neighbourhoodName);
		clickSaveButton();  waitForPageLoad(driver);
		
		//Services section
		clickOnButton(servicesSection);
		secvicesInput.sendKeys("Clothing");
		clickSaveButton();  waitForPageLoad(driver);
		
		//Brands section
		clickOnButton(brandsSection);
		brandsInput.sendKeys("Nike");
		clickSaveButton();  
		waitForPageLoad(driver);
		
		//Pickup and Delivery Services section
		clickOnButton(pickUpDeliverySection);
		waitForPageLoad(driver);
		for(int i=0;i<6;i++) {
			i=i+1;
			clickOnButton(getfindElementByXPath("//div[@class='option-list']//label["+i+"]"));
			waitForPageLoad(driver);
		}
		clickSaveButton();
		logger.info("Filled mandatory fields");
		return neighbourhoodName;
	}

	public void validateStoreInASO(String storeName) throws InterruptedException {
		logger.info("Validating Store in ASO Store Locator page");
		//Assert.assertEquals(storeName,driver.findElement(By.xpath("//h1[@id='neighborhoodLabel']")).getText()); 
		Assert.assertEquals(storeName.toUpperCase(), driver.findElement(By.xpath("//h1[@id='neighborhoodLabel']")).getText());  //verify Store Name in Store Locator page
		logger.info("Validted Store in ASO Store Locator page");
		Thread.sleep(5000);
	}
	
	public void verifyStoreDetailsInStoreLocator(String storeName,ArrayList<String> address,String yextMainPhoneValidation) {
		logger.info("Verifying store details in PDP page");

		Assert.assertEquals(storeName.toUpperCase(), driver.findElement(By.xpath("//h1[@id='neighborhoodLabel']")).getText());

		String addressLines = driver.findElement(By.xpath("(//a[@id='storeAddress']/span)[1]")).getText();
		Assert.assertTrue(addressLines.contains(address.get(0)));
		if(!address.get(1).equals(""))
			Assert.assertTrue(addressLines.contains(address.get(1)));

		String city = driver.findElement(By.xpath("(//a[@id='storeAddress']/span)[2]")).getText();
		String state = driver.findElement(By.xpath("(//a[@id='storeAddress']/span)[3]")).getText();
		String zip = driver.findElement(By.xpath("(//a[@id='storeAddress']/span)[4]")).getText();
		Assert.assertTrue(city.contains(address.get(2)));
		/*Assert.assertTrue(state.contains(address.get(3)));
		Assert.assertTrue(zip.contains(address.get(4)));*/

		String mainPhone = driver.findElement(By.xpath("//a[@id='storePhone']")).getText();
		mainPhone=mainPhone.replaceAll("[^a-zA-Z0-9]", "");
		yextMainPhoneValidation=yextMainPhoneValidation.replaceAll("[^a-zA-Z0-9]", "");
		Assert.assertTrue(mainPhone.contains(yextMainPhoneValidation));
		logger.info("Verified store details in PDP page");
	}

}
