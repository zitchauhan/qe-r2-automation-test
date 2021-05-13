package com.aso.qe.test.pageobject.ios;

import com.aso.qe.framework.common.PropertiesHelper;
import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class OrderSummary {
    /*
    Created by jitsingh7 on 12/05/21
    */
    private static final Logger logger = Logger.getLogger(OrderSummary.class.getName());
    private AppiumDriver<MobileElement> driver;
    private String amountPattern;
    public OrderSummary(AppiumDriver<MobileElement> driver) {
        amountPattern = PropertiesHelper.getInstance().getMobileTestDataProperty("amountPatternInOrderSummary");
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    public boolean IsShowingOnOrderSummary(String elementName) {
        if(elementName.equalsIgnoreCase("OrderSummaryHeading")) {

            return GlobalMobileHelper.isElementDisplayed(Locators.OrderSummary.orderSummaryHeading);
        }else if(elementName.equalsIgnoreCase("SubTotalLabel")){

            return GlobalMobileHelper.isElementDisplayed(Locators.OrderSummary.subTotalLabel);
        }else if(elementName.equalsIgnoreCase("OrderTotalLabel")){

            return GlobalMobileHelper.isElementDisplayed(Locators.OrderSummary.orderTotalLabel);
        }else if(elementName.equalsIgnoreCase("ShippingLabel")){

            return GlobalMobileHelper.isElementDisplayed(Locators.OrderSummary.shippingLabel);

        }else if(elementName.equalsIgnoreCase("ShippingToLabel")){
            String shippingToLabel = GlobalMobileHelper.getElementText(Locators.OrderSummary.shippingToLabel);
            return shippingToLabel.contains("Shipping to");

        }else if(elementName.equalsIgnoreCase("ShippingToZip")){

            return GlobalMobileHelper.isElementDisplayed(Locators.OrderSummary.shippingToZip);
        }else if(elementName.equalsIgnoreCase("Storepickup")){

            return GlobalMobileHelper.isElementDisplayed(Locators.OrderSummary.storepickup);
        }else if(elementName.equalsIgnoreCase("Changezipcodecta")){

            return GlobalMobileHelper.isElementDisplayed(Locators.OrderSummary.changezipcodecta);
        }else if(elementName.equalsIgnoreCase("Changestorecta")){

            return GlobalMobileHelper.isElementDisplayed(Locators.OrderSummary.changestorecta);
        }else if(elementName.equalsIgnoreCase("eDeliveryLabel")){

            return GlobalMobileHelper.isElementDisplayed(Locators.OrderSummary.eDeliveryLabel);
        }else if(elementName.equalsIgnoreCase("TaxesLabel")){

            return GlobalMobileHelper.isElementDisplayed(Locators.OrderSummary.taxesLabel);
        }else if(elementName.equalsIgnoreCase("DiscountsLabel")){

            return GlobalMobileHelper.isElementDisplayed(Locators.OrderSummary.discountsLabel);
        }else if(elementName.equalsIgnoreCase("PromocodeLabel")){

            return GlobalMobileHelper.isElementDisplayed(Locators.OrderSummary.promocodeLabel);
        }else if(elementName.equalsIgnoreCase("Restrictionmessage")){

            return GlobalMobileHelper.isElementDisplayed(Locators.OrderSummary.restrictionmessage);
        }else if(elementName.equalsIgnoreCase("SubTotalPrice")){

            return GlobalMobileHelper.isPatternExistInElementText(amountPattern, Locators.OrderSummary.subTotalPrice);
        }else if(elementName.equalsIgnoreCase("OrderTotalPrice")){

            return GlobalMobileHelper.isPatternExistInElementText(amountPattern, Locators.OrderSummary.orderTotalPrice);
        }else if(elementName.equalsIgnoreCase("ShippingPrice")){

            return GlobalMobileHelper.isPatternExistInElementText(amountPattern, Locators.OrderSummary.shippingPrice);
        }else if(elementName.equalsIgnoreCase("eDeliveryPrice")){

            return GlobalMobileHelper.isElementDisplayed(Locators.OrderSummary.eDeliveryPrice);
        }else if(elementName.equalsIgnoreCase("TaxesPrice")){

            return GlobalMobileHelper.isPatternExistInElementText(amountPattern, Locators.OrderSummary.taxesPrice);
        }else if(elementName.equalsIgnoreCase("DiscountsPrice")){

            return GlobalMobileHelper.isElementDisplayed(Locators.OrderSummary.discountsPrice);
        }else if(elementName.equalsIgnoreCase("PromocodePrice")){

            return GlobalMobileHelper.isElementDisplayed(Locators.OrderSummary.promocodePrice);
        }else if(elementName.equalsIgnoreCase("Storepickupatstorename")){

            return GlobalMobileHelper.isElementDisplayed(Locators.OrderSummary.storepickupatstorename);
        }else if(elementName.equalsIgnoreCase("StorepickupPrice")){

            return GlobalMobileHelper.isElementDisplayed(Locators.OrderSummary.storepickupPrice);


        }else {

            throw new UnsupportedOperationException("Given Element type not defined");

        }

    }

    public boolean isOrderSummaryLabelDisplayed() {
        return GlobalMobileHelper.swipeTillElementDisplayed(GlobalMobileHelper.Direction.UP, Locators.CartPage.orderSummaryLabel);
    }

}
