package com.aso.qe.test.pageobject.ios;

import static org.junit.Assert.assertTrue;

import java.util.List;

import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.GlobalMobileHelper.Direction;
import com.aso.qe.test.common.Locators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HomePage {

	private AppiumDriver<MobileElement> driver;
	private static final Logger logger = Logger.getLogger(HomePage.class.getName());

	public HomePage(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public void tapOnShopButton() {
		MobileElement shopHomePage = driver.findElement(Locators.HomePage.shopHomePage);
		GlobalMobileHelper.tapOnElement(shopHomePage);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean isOnHomePage() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return GlobalMobileHelper.isElementDisplayed(Locators.HomePage.shopNewLabel);
	}

	public void tapOnProduct() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MobileElement btnGoToPDP = driver.findElement(Locators.HomePage.buttonGoToPDP);
		GlobalMobileHelper.tapOnElement(btnGoToPDP);
	}

	public void tapOnAdidasTshirt() {

		try {

			Thread.sleep(2000);

		} catch (InterruptedException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

		MobileElement btnToclickOnAdidasTshirt = driver.findElement(Locators.HomePage.buttonPdp);

		btnToclickOnAdidasTshirt.click();

		// GlobalMobileHelper.tapOnElement(btnToclickOnAdidasTshirt);

	}

	public void tapOnHomeBtn() {
		if (GlobalMobileHelper.isElementDisplayed(Locators.HomePage.homeBtn))
			GlobalMobileHelper.tapOnElement(Locators.HomePage.homeBtn);

	}

	public void taponGolfBallProduct() {

		GlobalMobileHelper.tapOnElement(Locators.HomePage.golfBall);

	}

	public boolean isSearchBoxDisplayed() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return GlobalMobileHelper.isElementDisplayed(Locators.HomePage.searchBox);
	}

	public void tapOnSearchBox() {
		GlobalMobileHelper.tapOnElement(Locators.HomePage.searchBox);
	}

	public boolean isShopNewSectionDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.HomePage.shopNewImage);
	}

	public void tapOnShopNewSection() {

		GlobalMobileHelper.tapOnElement(Locators.HomePage.shopNewBar);
	}

	public boolean isAcademyExclusiveDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.HomePage.academyExclusiveBanner);
	}

	public void tapOnAcademyExcusiveBanner() {
		GlobalMobileHelper.tapOnElement(Locators.HomePage.academyExclusiveBanner);
	}

	public void tapOnMayBelater() {
		if (GlobalMobileHelper.isElementDisplayed(Locators.HomePage.maybeLaterBtn)) {
			GlobalMobileHelper.tapOnElement(Locators.HomePage.maybeLaterBtn);
		}
	}

	public boolean isHeroBannerDisplayed() {

		MobileElement me = driver.findElement(Locators.HomePage.heroBanner);
		boolean flag = false;
		if (me.isDisplayed() && me.isEnabled()) {

			flag = true;
		}
		return flag;
	}

	public void moveToHomePage() {
		MobileElement homeBtn = driver.findElement(Locators.HomePage.homeBtn);
		if (homeBtn.isDisplayed()) {
			GlobalMobileHelper.tapOnElement(homeBtn);
		}
	}

	public boolean isInstructionBannerTitleDisplayed() {
		MobileElement GlobalMobileHelper = driver.findElement(Locators.HomePage.bannerTitle);
		return GlobalMobileHelper.isDisplayed();
	}

	public boolean isInstructionBannerSubtitleDisplayed() {
		MobileElement GlobalMobileHelper = driver.findElement(Locators.HomePage.bannerSubtitle);
		return GlobalMobileHelper.isDisplayed();
	}

	public void tapOnInstructionBanner(String arg2) {
		if (GlobalMobileHelper.isElementDisplayed(Locators.HomePage.bannerCta)) {
			GlobalMobileHelper.tapOnElement(Locators.HomePage.bannerCta);
		}
	}

	public boolean varifyElementPresenseOnHomePage(String elementName) {
		if (elementName.equalsIgnoreCase("Instruction banner")) {

			return GlobalMobileHelper.isElementDisplayed(Locators.HomePage.bannerTitle);

		} else if (elementName.equalsIgnoreCase("Instruction Banner subtitle")) {

			return GlobalMobileHelper.isElementDisplayed(Locators.HomePage.bannerSubtitle);

		}else if (elementName.toLowerCase().contains("information message")) {

			return isInformationMessageElementsDisplayed(elementName);

		} else {

			throw new UnsupportedOperationException("Given Element type not defined");
		}
	}
	
	public boolean isOnInstructionBanner() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return GlobalMobileHelper.isElementDisplayed(Locators.HomePage.instructionBanner);
	}

	public boolean isOnInformationMessagePage(){
		MobileElement informationElement = driver.findElement(Locators.HomePage.labelInfoMessagetitle);
		return GlobalMobileHelper.isElementDisplayed(informationElement);
	}

	private boolean isInformationMessageElementsDisplayed(String informationMessageElementKeyword){
		boolean result = false;
		List<MobileElement> informationElements=null;

		try {
			String subTitleText = GlobalMobileHelper.getElementText(Locators.HomePage.labelInfoMessageSubtitle);
			// make the element visible
			int iteration=1;
			while (!(subTitleText.toLowerCase().contains("conditions, exclusions, and restrictions") ||
					subTitleText.toLowerCase().contains("exclusions") ||
					subTitleText.toLowerCase().contains("restrictions") ||
					subTitleText.toLowerCase().contains("conditions")
					)) {
					if (iteration >= 5) {
						break; // exit after trying 5 times
					}
				iteration += 1;
				GlobalMobileHelper.swipeScreen(Direction.LEFT, 10);
			}

		}catch (ElementNotVisibleException e){
			logger.warn("Information message component is not visible on the screen: Failure to be analyzed based on what is configured in CMS");
			return false;
		}catch (Exception e){
			logger.warn(e.getLocalizedMessage() + "\n cause : " + e.getCause());
			return false;
		}

		return true;
	}

}