package com.aso.qe.test.pageobject.ios;

import java.util.List;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
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
		MobileElement btnGoToPDP = driver.findElement(Locators.HomePage.shopNewLabel);
		return btnGoToPDP.isDisplayed();
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

        //GlobalMobileHelper.tapOnElement(btnToclickOnAdidasTshirt);

    }

    public void tapOnHomeBtn() {

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
		GlobalMobileHelper.tapOnElement(Locators.HomePage.maybeLaterBtn);
		
	}
	public void moveToHomePage() {
	MobileElement homeBtn = driver.findElement(Locators.HomePage.homeButton);
	if(homeBtn.isDisplayed()) {
	GlobalMobileHelper.tapOnElement(homeBtn);
		}

		}
	
	
	
}