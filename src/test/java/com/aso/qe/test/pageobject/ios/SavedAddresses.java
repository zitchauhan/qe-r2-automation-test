package com.aso.qe.test.pageobject.ios;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SavedAddresses {
    /*
    Created by jitsingh7 on 18/04/21
    */
    private int selectedAddressCount=0;

    private AppiumDriver<MobileElement> driver;
    public SavedAddresses(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    public void selectAddress(String address) {
        int ix=0;
        try {
            List<MobileElement> mobileElementList = driver.findElements(Locators.SavedAddresses.labelAddressUsername);
            List<MobileElement> addressRadioButtons = driver.findElements(Locators.SavedAddresses.radioButtonAddress);
            String runTimeText="";
            for(MobileElement mobileElement: mobileElementList) {
                runTimeText = mobileElement.getText().replaceAll("(\\d)\\s+","$1").trim();
                if (runTimeText.contains(address.replaceAll("(\\d)\\s+","$1").trim())) {
                    if(ix==3){
                        GlobalMobileHelper.swipeScreen(GlobalMobileHelper.Direction.UP);
                        ix=0; // reset the count to 0
                    }
                    addressRadioButtons.get(selectedAddressCount).click();
                    break;
                }
                ix+=1; // track when swipe required
                selectedAddressCount+=1; // keep track of addresses searched
            }

        }catch(Exception e){
            System.out.println(e.getLocalizedMessage());
        }

    }

    public void tapOnEditAddressLink(String address){
        if(selectedAddressCount==0){
            selectAddress(address);
        }
        try{
            List<MobileElement> mobileElementList = driver.findElements(Locators.SavedAddresses.editAddressLink);
            mobileElementList.get(selectedAddressCount).click();
        }catch(Exception e){
            System.out.println(e.getLocalizedMessage());
        }

    }
}
