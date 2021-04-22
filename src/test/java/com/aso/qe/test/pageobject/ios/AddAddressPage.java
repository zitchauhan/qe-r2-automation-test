package com.aso.qe.test.pageobject.ios;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class AddAddressPage {
    /*
    Create by jitsingh7 on 18/04/21
    */
    private AppiumDriver<MobileElement> driver;
    public AddAddressPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


}
