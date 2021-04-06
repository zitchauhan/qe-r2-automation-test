package com.aso.qe.test.pageobject.ios;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.PropertiesHelper;
import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CheckoutPage {
	private static final Logger logger = Logger.getLogger(CheckoutPage.class.getName());
	
	private AppiumDriver<MobileElement> driver;
	public CheckoutPage(AppiumDriver<MobileElement> driver) {
	  this.driver = driver;
	  PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	 }
	AccountPage accountPage = new AccountPage(driver);
	
	
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
		 		List<String> list = PropertiesHelper.getInstance().getMobileTestDataPropertyList(key);
		 		assertTrue("could not find the "+key+ " in property file", list.size()>=0);
		 		
		 		Random random = new Random();
		 		int max=4, min=0;
		 		int randomNum = random.nextInt(4);
		 		String updatedField = list.get(randomNum);
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
}

