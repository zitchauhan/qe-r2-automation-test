package com.aso.qe.test.pageobject.ios;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class UpdateAddressPage {
    /*
    Created by jitsingh7 on 10/04/21
    */
    private static final Logger logger = Logger.getLogger(CartPage.class.getName());
    private AppiumDriver<MobileElement> driver;

    public UpdateAddressPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    public void updatePhoneNumber() {
        // TODO: To be implemented
        logger.warn("to be implemented");
    }

    public void updateAptNumber() {
        GlobalMobileHelper.setText(Locators.AddAddress.inputAptNumber, "1");
    }
}
