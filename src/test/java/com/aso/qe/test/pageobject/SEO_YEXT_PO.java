package com.aso.qe.test.pageobject;

import static org.junit.Assert.fail;

import java.util.ArrayList;

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
		String txt = driver.findElement(By.xpath("//div[text()='"+day+"']/..//button")).getText();
		switch(dayStatus) {

		case "Open":
			clickOnButton(getfindElementByXPath("//div[text()='"+day+"']/..//button"));
			if(txt.equalsIgnoreCase("Open")) {

				//Below line is to ensure the From and To will get successfully updated. If status is changed from Closed, From and To textboxes will be cleared.
				clickOnButton(storeClosed); 
				clickSaveButton();

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
			if(txt.equalsIgnoreCase("Closed")) {
				//Below line is to ensure the From and To will get successfully updated. If status is changed from Closed, From and To textboxes will be cleared.
				clickOnButton(storeClosed); 

				clickSaveButton();
				clickOnButton(hoursSection);
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

	public void selectCityFromStorePage(String cityName) {
		cityName=cityName.toLowerCase();
		logger.info("Selecting City");
		driver.findElement(By.xpath("//a[text()='"+cityName+"']")).click();
		//clickOnButton(getfindElementByXPath("//a[text()='"+cityName+"']"));
		waitForPageLoad(driver);
		logger.info("Selected City");
	}

	public void selectLocation(String locationName) {
		locationName=locationName.toLowerCase();
		logger.info("Selecting location");
		driver.findElement(By.xpath("//strong[text()='"+locationName+"']")).click();
		//clickOnButton(getfindElementByXPath("//strong[text()='"+locationName+"']"));
		waitForPageLoad(driver);
		logger.info("Selected location");
	}

	public void selectStore(String storeName) {
		logger.info("Selecting Store");
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
		String storeOpenUI = storeOpenHoursUI.getText();
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

	public void updateStoreDescription(String descriptionText) {
		logger.info("Updating store description");
		clickOnButton(storeDescriptionSection);
		storeDescriptionText.clear();
		if(descriptionText.equals("")) {
			String randomDescription = "New store in town ".concat(RandomStringUtils.randomAlphabetic(5));
			storeDescriptionText.sendKeys(randomDescription);
		}
		else {
			storeDescriptionText.sendKeys(descriptionText);
		}
		clickSaveButton();
		Assert.assertFalse(driver.findElements(By.xpath("//div[text()='Length must be at least 10 characters']")).size()>0); //verify error message when saved
		logger.info("Updated store description");
	}

	public void verifyStoreDetails(String storeName,ArrayList<String> address,String yextMainPhoneValidation) {
		logger.info("Verifying store details in PDP page");

		printStoreHoursInPDP();

		Assert.assertEquals(storeName, storeNameUI.getText());

		String addressLines = storeAddressLinesUI.getText();
		Assert.assertTrue(addressLines.contains(address.get(0)));
		Assert.assertTrue(addressLines.contains(address.get(1)));

		String cityState = storeCityStateUI.getText();
		Assert.assertTrue(cityState.contains(address.get(2)));
		Assert.assertTrue(cityState.contains(address.get(3)));
		Assert.assertTrue(cityState.contains(address.get(4)));

		String mainPhone = storeMainPhoneUI.getText();
		mainPhone=mainPhone.replaceAll("[^a-zA-Z0-9]", "");
		Assert.assertTrue(mainPhone.contains(yextMainPhoneValidation));
		logger.info("Verified store details in PDP page");
	}

	public void verifyStoreCloseInPDP() {
		logger.info("Verifying store hours in PDP page");
		Assert.assertEquals("Closed Today", storeHoursPDP.getText());
		logger.info("Verified store hours in PDP page");
	}

	public void selectSingleEntity() {
		logger.info("Selecting Single Entity option");
		clickOnButton(addLocation);
		clickOnButton(singleEntity);
		waitForPageLoad(driver);
		logger.info("Selected Single Entity option");
	}



	public void createEntity(String country,String category,String addressLine1,String addressLine2,String floorTxt,
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

		String storeName = "ASO_Test_"+RandomStringUtils.randomAlphabetic(5);
		nameInput.sendKeys(storeName);

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

		ArrayList<String> arr = new ArrayList<>();
		String num = null;
		for(int i=0;i<10;i++) {
			num = RandomStringUtils.randomNumeric(3);
			arr.add(num);
		}

		for(int i=0;i<arr.size();i++) {
			entityIDTxt.sendKeys(arr.get(i));
			clickOnButton(continueBtn); waitForPageLoad(driver);
			validateEntityErrorMessage(arr.get(i));
			if(driver.findElements(By.xpath("//div[text()='Please provide a unique value for the Entity ID']")).size()>0) {
				i++;
				validateEntityErrorMessage(arr.get(i));
			}
			else {
				break;
			}
		}

		Assert.assertFalse(driver.findElements(By.xpath("//div[text()='Please provide valid field values']")).size()>0); //verify all fields error message when saved
		Assert.assertFalse(driver.findElements(By.xpath("//div[text()='Value must be a valid phone number']")).size()>0); //verify phone number error message when saved
		Assert.assertFalse(driver.findElements(By.xpath("//div[text()='Invalid Address']")).size()>0); //verify address error message when saved
		Assert.assertTrue(driver.findElements(By.xpath("//div[@class='breadcrumb-element']/..//div[text()='"+storeName+"']")).size()>0); //Ensure user is navigated to next page after saving
		logger.info("Created a new store: " +storeName);
	}

	public void validateEntityErrorMessage(String entityID) {
		if(driver.findElements(By.xpath("//div[text()='Please provide a unique value for the Entity ID']")).size()>0) {
			entityIDTxt.clear();
			entityIDTxt.sendKeys(entityID);
			clickOnButton(continueBtn);
			validateEntityErrorMessage(entityID);
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
		clickOnButton(neighborhoodSection);
		neighborhoodInput.sendKeys(neighbourhoodName);
		clickSaveButton();  waitForPageLoad(driver);
		
		//Services section
		clickOnButton(servicesSection);
		secvicesInput.sendKeys("Clothing");
		clickSaveButton();  waitForPageLoad(driver);
		
		//Brands section
		clickOnButton(brandsSection);
		brandsInput.sendKeys("Nike");
		clickSaveButton();  waitForPageLoad(driver);
		
		//Pickup and Delivery Services section
		clickOnButton(pickUpDeliverySection);
		for(int i=0;i<6;i++) {
			i=i+1;
			clickOnButton(getfindElementByXPath("//div[@class='option-list']//label["+i+"]"));
			
		}
		clickSaveButton();
		logger.info("Filled mandatory fields");
		return neighbourhoodName;
	}

	public void validateStoreInASO(String storeName) {
		logger.info("Validating Store in ASO Store Locator page");
		Assert.assertTrue(driver.findElements(By.xpath("//h1[text()='"+storeName+"']")).size()>0); //verify Store Name in Store Locator page
		logger.info("Validted Store in ASO Store Locator page");
	}
}
