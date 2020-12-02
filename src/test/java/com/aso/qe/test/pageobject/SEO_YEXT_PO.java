package com.aso.qe.test.pageobject;

import org.apache.log4j.Logger;
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
		waitUntilLoadingFinishes(loader);
		Thread.sleep(5000);  //Mandatory wait time
		String entityText = "//strong[text()='"+entity+"']";
		clickOnButton(getfindElementByXPath(entityText));
		logger.debug("Selected the entity "+entity);
	}
	
}
