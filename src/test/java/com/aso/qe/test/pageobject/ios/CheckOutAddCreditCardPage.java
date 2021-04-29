package com.aso.qe.test.pageobject.ios;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;

import com.aso.qe.framework.common.PropertiesHelper;
import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import net.bytebuddy.description.annotation.AnnotationDescription.Loadable;

public class CheckOutAddCreditCardPage {
	private static final Logger logger = Logger.getLogger(CheckOutAddCreditCardPage.class.getName());
	AppiumDriver<MobileElement> driver;
	public CheckOutAddCreditCardPage(AppiumDriver<MobileElement> driver) {
	  this.driver = driver;
	  PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	 }
	AccountPage accountPage = new AccountPage(driver);
	
	
	
	public void isAddCreditCardButtonDisplayed() {
		assertTrue("Add credit card button not displayed",GlobalMobileHelper.isElementDisplayed(Locators.Addnewcreditcard.buttonAddNewCreditCard));
	}
	
	
	public void isCreditCardInformationDisplayed() {
		assertTrue("Credit card information label not displayed",GlobalMobileHelper.isElementDisplayed(Locators.Addnewcreditcard.AddnewcrerditCardlabel));
	}
	
	public void isCardImageDisplayed() {
		assertTrue("Visa card image not displayed",GlobalMobileHelper.isElementDisplayed(Locators.Addnewcreditcard.imgVisa));
	}
	
	public void isVisaImageDisplayed() {
		assertTrue("Visa card image not displayed",GlobalMobileHelper.isElementDisplayed(Locators.Addnewcreditcard.imgVisa));
	}
	public void isAmexImageDisplayed() {
		assertTrue("Amex card image not displayed",GlobalMobileHelper.isElementDisplayed(Locators.Addnewcreditcard.imgAmex));
	}
	public void isMasterCardImageDisplayed() {
		assertTrue("MasterCard card image not displayed",GlobalMobileHelper.isElementDisplayed(Locators.Addnewcreditcard.imgMasterCard));
	}
	public void isDiscoverImageDisplayed() {
		assertTrue("Discover card image not displayed",GlobalMobileHelper.isElementDisplayed(Locators.Addnewcreditcard.imgDisover));
	}
	
	public void isCardHolderNameDisplayed() {
		assertTrue("Card holder input field not displayed",GlobalMobileHelper.isElementDisplayed(Locators.Addnewcreditcard.inputCardHolderName));
	}
	
	public void isCardNumberDisplayed() {
		assertTrue("Card number input field not displayed",GlobalMobileHelper.isElementDisplayed(Locators.Addnewcreditcard.inputCardNumberField));
	}

	public void isCardExpiryDisplayed() {
		assertTrue("Card Expiry input field not displayed",GlobalMobileHelper.isElementDisplayed(Locators.Addnewcreditcard.inputExpiryDate));
	}
	
	public void isCardCVVDisplayed() {
		assertTrue("Card CVV field not displayed",GlobalMobileHelper.isElementDisplayed(Locators.Addnewcreditcard.inputCVV));
	}
	public void isCheckboxSaveForFutureDisplayed() {
		assertTrue("Save for future checkbox not displayed",GlobalMobileHelper.isElementDisplayed(Locators.Addnewcreditcard.checkboxSaveForFutureAddress));
	}
	
	public boolean isSaveFutureCheckBoxSelected() {
		return GlobalMobileHelper.isCheckBoxElementSelected(Locators.Addnewcreditcard.checkboxSaveForFutureAddress);
		
		
	}
	public void isBillingAddressLabel() {
		assertTrue("Billing address label not displayed",GlobalMobileHelper.isElementDisplayed(Locators.Addnewcreditcard.labelBillingAddress));
		
	}
	
	public void isAddnewBillingAddressDisplayed() {
assertTrue("Option Add new Billing address not displayed",GlobalMobileHelper.isElementDisplayed(Locators.Addnewcreditcard.radioAddBillingAddress));
		
	}
	
	public void isSameAsShippingAddressDisplayed() {
		assertTrue("Option Same as shippng address not displayed",GlobalMobileHelper.isElementDisplayed(Locators.Addnewcreditcard.radioSameAsShippingAddress));
				
			}
	
	public void isSaveCreditCardButtonDisplayed() {
		assertTrue("Save credit card button not displayed",GlobalMobileHelper.isElementDisplayed(Locators.Addnewcreditcard.buttonSaveCreditCard));
				
			}
	
	public void isSaveCreditCardButtonDisabled() {
		isSaveCreditCardButtonDisplayed();
		assertFalse("Save credit card button is enabled",GlobalMobileHelper.isElementEnabled(Locators.Addnewcreditcard.buttonSaveCreditCard));
		
	}
	
	public void isSaveCreditCardButtonEnabled() {
		isSaveCreditCardButtonDisplayed();
		assertTrue("Save credit card button is disabled",GlobalMobileHelper.isElementEnabled(Locators.Addnewcreditcard.buttonSaveCreditCard));
		
	}
	
	public void tapOnSaveCreditCart() {
		isSaveCreditCardButtonDisplayed();
		isSaveCreditCardButtonEnabled();
		GlobalMobileHelper.tapOnElement(Locators.Addnewcreditcard.buttonSaveCreditCard);
		
	}
	
	public void enterCreditCardData(String value,String fieldName) {
		switch(fieldName) {
		case "CardHolderName":
			GlobalMobileHelper.setText(Locators.Addnewcreditcard.inputCardHolderName, value);
			break;
		case "CardNumber":
			GlobalMobileHelper.setText(Locators.Addnewcreditcard.inputCardNumberField, value);
			break;
		case "CardExpiry":
			GlobalMobileHelper.setText(Locators.Addnewcreditcard.inputExpiryDate, value);
			break;
		case "CVV":
			GlobalMobileHelper.setText(Locators.Addnewcreditcard.inputCVV, value);
			break;
		default:
			throw new IllegalStateException("Invalid field found");
	}
		
		
	}
	

	
	public void isWarningPopUpDisplayed() {
		assertTrue("Warning pop up not displayed",GlobalMobileHelper.isElementDisplayed(Locators.Addnewcreditcard.popupWarning));
				
			}
	
	public void isWarningYesButtonDisplayed() {
		assertTrue("Yes Button  not displayed",GlobalMobileHelper.isElementDisplayed(Locators.Addnewcreditcard.buttonContinueWarning));
				
			}
	public void isWarningNoButtonDisplayed() {
		assertTrue("No button not displayed",GlobalMobileHelper.isElementDisplayed(Locators.Addnewcreditcard.buttonCancelWarning));
				
			}
	
	public void isWarningPopupHeadingTextDisplayed() {
		assertTrue("Popup heading text not displayed",GlobalMobileHelper.isElementDisplayed(Locators.Addnewcreditcard.msgAlertPopupHeading));
				
			}
	public void isWarningPopupSubHeadingTextDisplayed() {
		assertTrue("Popup sub heading text not displayed",GlobalMobileHelper.isElementDisplayed(Locators.Addnewcreditcard.msgAlertPopupSubHeading));
				
			}
	public void tapOnWarningButtons(String buttonName) {
		switch(buttonName) {
		case "Continue":
			GlobalMobileHelper.tapOnElement(Locators.Addnewcreditcard.buttonContinueWarning);
			break;
		case "Cancel":
			GlobalMobileHelper.tapOnElement(Locators.Addnewcreditcard.buttonCancelWarning);
			break;
		default:
			throw new IllegalStateException("Invalid button found");
	}
	}
	
	public void tapOnBackButton() {
		GlobalMobileHelper.tapOnElement(Locators.Addnewcreditcard.buttonback);
	}
	public void tapOnAddCreditCard() {
		GlobalMobileHelper.tapOnElement(Locators.Addnewcreditcard.buttonAddNewCreditCard);
	}
	
	public void isBackButtonDisplayed() {
		assertTrue("Back Button not displayed",GlobalMobileHelper.isElementDisplayed(Locators.Addnewcreditcard.buttonback));
	}
	
	public void isInvalidCardErrorMessageDisplayed() {
		assertTrue("Card error not displayed",GlobalMobileHelper.isElementDisplayed(Locators.Addnewcreditcard.errorMsgInvalidCard));
	}
	
	public void tapOnAddBillingAddress() {
		GlobalMobileHelper.tapOnElement(Locators.Addnewcreditcard.radioAddBillingAddress);
	}
	
	public String getPopupHeadingTxt() {
		return GlobalMobileHelper.getElementText(Locators.Addnewcreditcard.msgAlertPopupHeading);
	}
	
	public String getPopupSubHeadingTxt() {
		return GlobalMobileHelper.getElementText(Locators.Addnewcreditcard.msgAlertPopupSubHeading);
	}
	
	public void isSavedAddressListDisplay() {
		assertTrue("Saved address list not displayed",GlobalMobileHelper.isElementDisplayed(Locators.Addnewcreditcard.listSavedAddress));
	}
	
	public void tapOnSavedAddress() {
		GlobalMobileHelper.tapOnElement(Locators.Addnewcreditcard.listSavedAddressFirst);
	}
	

	public void verifyDefaultAddress() {
	MobileElement defaultAddress = driver.findElement(Locators.CheckoutPage.defaultAddressLabel);
		assertTrue("First address is not default address",defaultAddress.getText().equalsIgnoreCase("Default Address"));
	}
	
	public void verifyMessage() {
		assertTrue("Shipping message is not displayed",GlobalMobileHelper.isElementDisplayed(Locators.CheckoutPage.shippingMessage));	
	}
	
	public void editFieldValue(String fieldName) {
		 		String key;
		 		switch (fieldName){
				case "First Name":
					key="FirstName";
					break;
				case "Last Name":
		 			key="LastName";
				    break;
				case "Address":
					key="Address";
					break;
				case "Apt Number":
					key="AptNumber";
					break;
				case "ZIP Code":
					key="ZipCode";
					break;
				case "City":
					key="city";
					break;
				case "Phone":
					key="Phone";
					break;
				default:
					throw new IllegalStateException("Wrong field");
					}
		 		String list = PropertiesHelper.getInstance().getMobileTestDataProperty(key);
		 		assertTrue("could not find the "+key+ " in property file", list.length()>=0);
		 		
		 		Random random = new Random();
		 		int max=4, min=0;
		 		int randomNum = random.nextInt(4);
		 		String updatedField = list;
		 		accountPage.enterFieldValuesOnAddAddress(updatedField,fieldName);	
		 		Context.setUpdatedAddressField(updatedField);
			 	}
	
	public void tapOnEditAddressLink(String arg) {
		List<MobileElement> editAddressLinkList = driver.findElements(Locators.CheckoutPage.editAddressLink);
		assertTrue("Saved address are not displaying", editAddressLinkList.size()>0);
		if(arg.equalsIgnoreCase("First"))
		GlobalMobileHelper.tapOnElement(editAddressLinkList.get(2));
		
	}
	
	public void verifyEditShippingAddressPage() {
		assertTrue("User is not on edit screen",GlobalMobileHelper.isElementDisplayed(Locators.AddAddress.inputFirstName));
		
	}
	
	public void isAddressDisplayed(String visibility) {
		GlobalMobileHelper.setImplicitWaitTo(driver, 5);
		List<MobileElement> addressLocatorsList = driver.findElements(Locators.CheckoutPage.savedAddress);
		if(visibility.equalsIgnoreCase("not displayed")) {
			assertTrue("Saved address are displaying", addressLocatorsList.size()==0);
		} 
		else if (visibility.equalsIgnoreCase("displayed")) {
			assertTrue("Saved address are not displaying", addressLocatorsList.size()>0);
			List<String> addressList = new ArrayList<String>();
			for(int i=0;i<addressLocatorsList.size();i++) {
				addressList.add(addressLocatorsList.get(i).getText());
			}
			Context.setSavedAddressesList(addressList);
		}
		
	}
	public void verifyUpdatedinformation(String field, String addressindex) {
		List<MobileElement> addressLocatorsList = driver.findElements(Locators.CheckoutPage.savedAddress);
			assertTrue("Saved address list is not displaying", addressLocatorsList.size()>0);
		
		if(addressindex.equalsIgnoreCase("first")) {
			if(field.contains("name"))
			{
				assertTrue("Updated field is not reflecting in saved address",GlobalMobileHelper.isElementDisplayed(By.xpath("//*[contains(@label,'"+ Context.getUpdatedAddressField()+"')]")));				
			}
			else
			assertTrue("Updated field is not reflecting in saved address",addressLocatorsList.get(0).getText().contains(Context.getUpdatedAddressField()));			
		}
	}
	public void verifyShippingAddressTitle() {
		
	}
	
	public boolean isCheckoutPageDisplayed() {
		return GlobalMobileHelper.isElementDisplayed(Locators.CheckoutPage.labelTitle);
	}

	public boolean verifyShippingMethod(String shippingService) {
	//storing all the shipping methods in a list
		List<MobileElement> shippingMethod = driver.findElements(Locators.CheckoutPage.shippingMethod);
		assertTrue("Shipping methods are not displayed",shippingMethod.size()>=0);
		String shippingMethodName;
		for(int i=0;i<shippingMethod.size();i++) {
		//verifying whether the expected shipping method mathes to any of the shipping method in the list. If YES then return TRUE else return FAlSE.
			 shippingMethodName=shippingMethod.get(i).getText();
				if(shippingMethodName.equalsIgnoreCase(shippingService)) {
					logger.info(shippingMethodName+" shipping method is displayed");
					return true;
				}
				}
		return false;
	}

	public void verifyOrderProcessingMessage() {
		try {
			GlobalMobileHelper.isElementDisplayed(Locators.CheckoutPage.orderProcesssingMessage);
		} catch (Exception e){
			logger.error(e.getLocalizedMessage());
		}
	}

	/**
	 * A Method to verify that the required shipping methods for WhiteGloveBulky items are present
	 * on the checkout page
	 */
    public void verifyDeliveryOptionsForWhiteProductBulkyItem() {
		/* Created By jitsingh7 on 11/04/21 */
	String WhiteGloveBulkyShippingMethods = PropertiesHelper.getInstance().getMobileTestDataProperty("WhiteGloveBulkyShippingMethods");
		List<MobileElement> shippingMethodsElements = driver
				.findElements(Locators.CheckoutPage.labelShippingMethods);

		List<String> shippingMethodElementsText = new ArrayList<String>();
		for (MobileElement shippingMethodElement: shippingMethodsElements){
			shippingMethodElementsText.add(shippingMethodElement.getText().trim());
		}

		//for(String shippingMethod: WhiteGloveBulkyShippingMethods){
			//assertTrue("Shipping method exists ", shippingMethodElementsText.contains(shippingMethod));
		//}
    }

    public void tapOnDefeaultShippingAddress() {
    	GlobalMobileHelper.tapOnElement(Locators.CheckoutPage.defaultAddressLabel);
		try {
			Thread.sleep(GlobalMobileHelper.DEFAULT_EXPLICIT_WAIT * 1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
}

