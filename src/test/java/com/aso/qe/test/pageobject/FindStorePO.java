package com.aso.qe.test.pageobject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aso.qe.framework.common.CommonActionHelper;

public class FindStorePO extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(FindStorePO.class);


	@FindBy(xpath = "//*[contains(text(), 'Find a Store')]")public WebElement ovly_FindStore;
	@FindBy(xpath = "//input[@placeholder='Enter Zip Code or City, State']")public WebElement ovly_searchTextBox;
	@FindBy(xpath = "//*[@data-auid='find-a-store-modal-close']/span")public WebElement ovly_btnCloseCross;
	@FindBy(xpath = "//*[@data-auid='submit-zip-code']/span")public WebElement ovly_btnGO;
    @FindBy(xpath = "(//button[@aria-label='Make My Store'])[1]")public WebElement ovly_btnMakeMyStore_1;
	@FindBy(xpath = "//input[@placeholder='Enter Zip Code or City, State']/../../../../following-sibling::div[1]/div/div/h6")	public WebElement ovly_secStore;
	@FindBy(xpath = "(//div[@data-auid='find-a-store-modal'])[2]/div[3]/div/div[text()='0 Stores were found within 250 miles of your search']")public WebElement txtNoStoreText;
    @FindBy(xpath = "//*[@data-auid='find-a-store-modal-close']")public WebElement ovly_btnCloseContainer;
	@FindBy(xpath = "//*[@data-auid='findAStore']/span[2]")public WebElement txtStroeText;
	@FindBy(xpath = "//*[@data-auid='findAStore_m']/span[2]")public WebElement txtStroeText_m;

	public FindStorePO(WebDriver webDriver) {
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
		clickOnButton(ovly_btnMakeMyStore_1);
		clickOnButton(ovly_btnCloseContainer);
		// Expected change the title should happen in the title
		return selectedStoreTitle;

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
			Thread.sleep(2000);
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

}
