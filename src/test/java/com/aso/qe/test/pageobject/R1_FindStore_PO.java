package com.aso.qe.test.pageobject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;

public class R1_FindStore_PO extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R1_FindStore_PO.class);
	public R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(getDriver(),R1_GlobalElementHeader_Home_PO.class);
	String storeName="";
	
	//@FindBy(xpath = "//*[contains(text(), 'Find a Store')]")public WebElement ovly_FindStore;/RKA 17 aug
	@FindBy(xpath="(//*[contains(text(), 'Find A Store')])[2] | (//*[contains(text(), 'Find A Store')])[2]")public WebElement ovly_FindStore; //SID 14-Nov
	@FindBy(xpath = "//input[@name='zipcode'] | //*[@data-auid='find-a-store']/input")public WebElement ovly_searchTextBox; //Sid 19-Nov
	@FindBy(xpath = "//*[@data-auid='find-a-store-modal-close']/span")public WebElement ovly_btnCloseCross;
	@FindBy(xpath = "//*[@data-auid='submit-zip-code']/span")public WebElement ovly_btnGO;
	@FindBy(xpath = "//*[@class='academyicon icon-plus ']")public WebElement expandStore;
	@FindBy(xpath="//*[@data-auid='facetdrawerundefined']/button/following-sibling::*//a/p[1]") public WebElement clickStoreAddress;  //SID 30-November
    @FindBy(xpath = "(//button[@aria-label='Make My Store'])[1]")public WebElement ovly_btnMakeMyStore_1;
    @FindBy(xpath = "(//*[@data-auid='facetdrawerundefined']/button/*/*/*[1])[1]")public WebElement selectedStoreNameinModal;  //SID 28-December
    @FindBy(xpath = "//*[@data-auid='PDP_IventoryMessage']/parent::*//a")public WebElement selectedStoreNameinPDP;  //SID 28-December
  
	//@FindBy(xpath = "//input[@placeholder='Enter Zip Code or City, State']/../../../../following-sibling::div[1]/div/div/h6")	public WebElement ovly_secStore;/RKA 22 aug
	@FindBy(xpath="//input[@placeholder='Enter Zip Code or City, State']/preceding::*[1]/../following::*[1]//h6")public WebElement ovly_secStore;
	@FindBy(xpath = "(//div[@data-auid='find-a-store-modal'])[2]/div[3]/div/div[text()='0 Stores were found within 250 miles of your search'] | (//div[@data-auid='find-a-store-modal'])[2]//*[text()='Sorry! There are no stores within 250 miles. Please order online or try new ZIP code.']")public WebElement txtNoStoreText; //SID Modified 14-Nov
    @FindBy(xpath = "//*[@data-auid='find-a-store-modal-close']")public WebElement ovly_btnCloseContainer;
	@FindBy(xpath = "//*[@data-auid='findAStore']/span[2]")public WebElement txtStroeText;
	//@FindBy(xpath = "//*[@data-auid='findAStore_m']/span[2]")public WebElement txtStroeText_m;/RKA 17 aug
	@FindBy(xpath="//*[@data-auid='findAStore_m']/*/*[1]/*[2] | //*[@data-auid='facetdrawerundefined']")public WebElement txtStroeText_m;
	@FindBy(xpath="//*[@id='mainSearchText']") public WebElement txtStoreLocatorPage;
	@FindBy(xpath="//*[@id='mainLoadStores']") public WebElement btnGoSearchStore;
	@FindBy(xpath="//*[@class='myStoreLogo']//parent::div//following-sibling::ul//span[contains(@id,'screenReader')]") public WebElement imgMyStoreLogo;
	@FindBy(xpath="//*[@data-auid='find-a-store-modal-close']")public WebElement findAstoreXBTN_M;
	
	public R1_FindStore_PO(WebDriver webDriver) {
		super();
	}

	public boolean validatingFindStoreDisplayed() {

		boolean isDisplayed = isDisplayed(ovly_FindStore);
		return isDisplayed;

	}

	// Enter data
	// click on Go
	// search for link "Make my store"
	// get the store name
	// Click on close

	public String selectAStore(String value) {
		waitForElement(ovly_searchTextBox);
		setInputText(ovly_searchTextBox, value);
		clickOnButton(ovly_btnGO);
		String selectedStoreTitle = getText(ovly_secStore);
		System.err.println(selectedStoreTitle);
		clickOnButton(expandStore);
		storeName = selectedStoreNameinModal.getText();
		System.err.println(selectedStoreNameinModal.getText());
		clickOnButton(ovly_btnMakeMyStore_1);
		clickOnButton(ovly_btnCloseContainer);
		// Expected change the title should happen in the title
		return storeName;
	}

	// Ak 18july
	public void selectAStoreEmptyOrSpecialchars(String value) {
		setInputText(ovly_searchTextBox, value);
		waitForElement(ovly_btnGO);
		clickOnButton(ovly_btnGO);
	}

	public void selectedStore() throws InterruptedException {
		// String selectedStoreName= txtStroeText.getText();
		if ("mobile".equalsIgnoreCase(testtype)) {
			scrollPageToWebElement(txtStroeText_m);
			waitForElement(txtStroeText_m);
			Thread.sleep(Constants.thread_low);
			if (isDisplayed(txtStroeText_m))
				logger.debug("Store Name is displayed");
			else
				logger.debug("Store Name is not displayed");
		} else {
			if (isDisplayed(txtStroeText))
				logger.debug("Store Name is displayed");
			else
				logger.debug("Store Name is not displayed");
		}
	}
	// Ak 18july

	public void validateErrorMsg() {

		if (isDisplayed(txtNoStoreText))
			logger.debug("Error Message is displayed");
		else
			logger.debug("Error message is not displayed");
	}

	
	//Anuj 13 Aug
	
	public void verifyFindaStoreFucntionalityFromFooter(String str) {
		
		if(isDisplayed(txtStoreLocatorPage))
		{
			setInputText(txtStoreLocatorPage, str);
			clickOnButton(btnGoSearchStore);
			String selectedStoreTitle = getText(imgMyStoreLogo);
			logger.debug("Store selected :::::::::: "+selectedStoreTitle);
			clickOnButton(globalElementHeader.imgAcademyLogo);
			waitForPageLoad(driver);
			
		}
		
	}
	
	
	
	
	
	
	
}
