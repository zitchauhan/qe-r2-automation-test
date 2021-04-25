package com.aso.qe.test.pageobject.ios;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;

public class UserProfilePage {
    /*
    Create by jitsingh7 on 15/04/21
    */
    private AppiumDriver<MobileElement> driver;
    private static final Logger logger = Logger.getLogger(UserProfilePage.class.getName());

    public UserProfilePage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public void subscribeForPromotionalEmails(){
        MobileElement switchEmailSubscription = driver.findElement(Locators.UserProfile.switchSubscribeToEmailsFromAcademy);
        if (switchEmailSubscription.getAttribute("value").trim().equals("0")){
            logger.debug("user is not in the subscriptions list");
            GlobalMobileHelper.tapOnElement(Locators.UserProfile.switchSubscribeToEmailsFromAcademy);
        }else{
            logger.debug("user is already in the subscriptions list");
        }
    }

    public void unSubscribeFromPromotionalEmails(){
        MobileElement switchEmailSubscription = driver.findElement(Locators.UserProfile.switchSubscribeToEmailsFromAcademy);
        if (switchEmailSubscription.getAttribute("value").trim().equals("1")){
            logger.debug("user is not in the subscriptions list");
            GlobalMobileHelper.tapOnElement(Locators.UserProfile.labelSubscribeToEmailsFromAcademy);
        }else{
            logger.debug("user is already not in the subscriptions list");
        }
    }
}
