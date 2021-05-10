package com.aso.qe.test.pageobject.ios;

import java.util.List;

import static com.aso.qe.test.common.GlobalMobileHelper.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Random;

import org.codehaus.plexus.logging.Logger;

import org.openqa.selenium.By;

import com.aso.qe.framework.common.PropertiesHelper;
import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.GlobalMobileHelper.Direction;
import com.aso.qe.test.common.Locators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AccountPage {
	
	private final AppiumDriver<MobileElement> driver;

	public AccountPage(AppiumDriver<MobileElement> driver) {
	  this.driver = driver;
	}
	
	public boolean isAccountPageDisplayed() {
		MobileElement accountPageTitle = driver.findElement(Locators.AccountPage.accountTitle);
		return accountPageTitle.isDisplayed();
	}
	

	public void tapOnFindStoreLink() {
		tapOnElement(Locators.AccountPage.findStoreLink);
	}
	

	public void tapOnCreateAnAccount() {
		tapOnElement(Locators.AccountPage.createAnAccountButton);
	}

	public void tapOnCreateAnAccountOnSignUpPage() {
		tapOnElement(Locators.AccountPage.createAnAccountButton);
	}
	
	public void enterFieldValuesOnAddAddress(String value, String field) {
		switch(field) {
			case "First Name":
				setText(Locators.AddAddress.inputFirstName, value,Locators.AddAddress.addAddressHeader);
				break;
			case "Last Name":
				setText(Locators.AddAddress.inputLastName, value,Locators.AddAddress.addAddressHeader);
				break;
			case "Address":
				setText(Locators.AddAddress.inputAddress, value,Locators.AddAddress.addAddressHeader);
				break;
			case "Apt Number":
				setText(Locators.AddAddress.inputAptNumber, value,Locators.AddAddress.addAddressHeader);
				break;
			case "ZIP Code":
				setText(Locators.AddAddress.inputZipCode, value,Locators.AddAddress.addAddressHeader);
				break;
			case "City":
				setText(Locators.AddAddress.inputCity, value,Locators.AddAddress.addAddressHeader);
				break;
			case "Phone":
				setText(Locators.AddAddress.inputPhone, value,Locators.AddAddress.addAddressHeader);
				break;
			default:
				throw new IllegalStateException("Wrong field");
		}
	}

	public boolean validateState(String state) {
		String displayedState = getElementText(Locators.AddAddress.inputState);
		return displayedState.equals(state);
	}

	public void tapOnAddNewAddress() {
		setImplicitWaitTo(driver, 5);
		tapOnElement(Locators.AddressBook.buttonAddNewAddress);
	}

	public void validateError(String field) {
		switch(field) {
		case "First Name":
			isElementDisplayed(Locators.AddAddress.lblFirstNameError);
			break;
		case "Last Name":
			isElementDisplayed(Locators.AddAddress.lblLastNameError);
			break;
		case "Apt Number":
			isElementDisplayed(Locators.AddAddress.lblAdditionalAddressError);
			break;
		case "ZIP Code":
			isElementDisplayed(Locators.AddAddress.lblZipCodeError);
			break;
		case "State":
			isElementDisplayed(Locators.AddAddress.lblStateError);
			break;
		case "Phone":
			isElementDisplayed(Locators.AddAddress.lblPhoneNoError);
			break;
		default:
			throw new IllegalStateException("Wrong field");
		}
	}

	public boolean isAddressBookButtonDisplayed() {
		return isElementDisplayed(Locators.AccountPage.addressBookButton);
	}
	
	public void tapOnAddressBookButton() {
		tapOnElement(Locators.AccountPage.addressBookButton);
	}

	public boolean isAddAddressScreenDisplayed() {
		return isElementDisplayed(Locators.AccountPage.addressBookHeader);
	}

	public void selectAddress(String addressNum) {
		List<MobileElement>savedAddressesList = driver.findElements(Locators.AddressBook.savedAddresses);
		if(addressNum.equalsIgnoreCase("Default")||addressNum.equalsIgnoreCase("First"))
			tapOnElement(savedAddressesList.get(0));
		else if(addressNum.equalsIgnoreCase("second"))
			tapOnElement(savedAddressesList.get(1));
		else if(addressNum.equalsIgnoreCase("any")) {
			int randomNum= randomInteger(0,savedAddressesList.size()-1);
	 		tapOnElement(savedAddressesList.get(randomNum));
		}
	}

	public void verifydefaultAddress(String status) {
		swipeScreen(Direction.UP,2);
		switch (status) {
			case "not present":
				assertFalse("Default address is present",
						isElementDisplayed(Locators.AccountPage.defaultAddressCheckbox));
				break;
			case "not selected":
				assertFalse("Default address is selected",
						driver.findElement(Locators.AccountPage.defaultAddressCheckbox).isSelected());
				break;
			case "selected and disabled":
				assertTrue("Default address is not selected already",
						driver.findElement(Locators.AccountPage.defaultAddressCheckbox).isEnabled());

				tapOnElement(Locators.AccountPage.defaultAddressCheckbox);
				assertTrue("Default address is not disabled",
						driver.findElement(Locators.AccountPage.defaultAddressCheckbox).isEnabled());
				break;
			default:
				throw new IllegalStateException("Option did not matach");
		}
	}

	// Methode to Click on My account card page
	 public void tabOnButtonOnAccountCardsPage(String btnName) {
		if(btnName.equalsIgnoreCase("Add new Academy card tile")) {
			tapOnElement(Locators.MyAccountPayment.buttonaddacacemycard);
		}else if(btnName.equalsIgnoreCase("Add new credit card tile")){
			tapOnElement(Locators.MyAccountPayment.buttonaddcreditcard);
		}else if(btnName.equalsIgnoreCase("existing aso card button")){
			tapOnElement(Locators.MyAccountPayment.existingasocard);
		}else {
			
			throw new UnsupportedOperationException("Given button type not defined");
		}

	}
	 
	 // To Verify element on my account  welcome page 
	 public boolean VarifyElementPresenseOnAccountPage(String elementName) {
		if(elementName.equalsIgnoreCase("welcome section")) {
			
			return isElementDisplayed(Locators.MyAccountwelcomePage.MyAcademy);

		}else if(elementName.equalsIgnoreCase("buttonOrders")){
			
			return isElementDisplayed(Locators.MyAccountwelcomePage.buttonOrders);
			
        }else if(elementName.equalsIgnoreCase("buttonProfile")){
			
			return isElementDisplayed(Locators.MyAccountwelcomePage.buttonProfile);
			
        }else if(elementName.equalsIgnoreCase("buttonAddressbook")){
			
			return isElementDisplayed(Locators.MyAccountwelcomePage.buttonAddressbook);
			
        }else if(elementName.equalsIgnoreCase("buttonWishlist")){
			
			return isElementDisplayed(Locators.MyAccountwelcomePage.buttonWishlist);
			
        }else if(elementName.equalsIgnoreCase("buttonPayment")){
			
			return isElementDisplayed(Locators.MyAccountwelcomePage.buttonPayment);
}else if(elementName.equalsIgnoreCase("Mobilenumber")){
			
			return isElementDisplayed(Locators.MyAccountwelcomePage.CSMobilenumber);

		}else {
			
			throw new UnsupportedOperationException("Given Element type not defined");

		}

	}



	// To enter cards details on aso card page 
	public void enterCardDetails(String fieldName) {
 		String keywordValue = PropertiesHelper.getInstance().getMobileTestDataProperty(fieldName);
 		String element = null;
 		if(fieldName.equalsIgnoreCase("ASOCard")){
 			setText(Locators.Addnewasocreditcard.Asocardtextbox, keywordValue,Locators.Addnewasocreditcard.Setasdefaultcheckbox);
 		}else if(fieldName.equalsIgnoreCase("ccfirstname")){

 			setText(Locators.MyAccountBillingAddress.BilingFirstName, keywordValue,Locators.MyAccountBillingAddress.BilingLastName);
 		}else if(fieldName.equalsIgnoreCase("ccnewfirstname")){

 			setText(Locators.MyAccountBillingAddress.BilingFirstName, keywordValue,Locators.MyAccountBillingAddress.BilingLastName);
	
	 	}else if(fieldName.equalsIgnoreCase("ccLastname")){
	 		setText(Locators.MyAccountBillingAddress.BilingLastName, keywordValue,Locators.MyAccountBillingAddress.BilingAddressText);
	 	
	 	}else if(fieldName.equalsIgnoreCase("ccAddress")){

	 		setText(Locators.MyAccountBillingAddress.BilingAddressText, keywordValue,Locators.MyAccountBillingAddress.BilingAptName);
	 		
	 	}else if(fieldName.equalsIgnoreCase("ccaprtname")){
	 		setText(Locators.MyAccountBillingAddress.BilingAptName, keywordValue,Locators.MyAccountBillingAddress.BilingZipCode);

	 	}else if(fieldName.equalsIgnoreCase("cczipcode")){
	 		setText(Locators.MyAccountBillingAddress.BilingZipCode, keywordValue,Locators.MyAccountBillingAddress.BilingCity);
	 	
	 	}else if(fieldName.equalsIgnoreCase("entercccity")){
			setText(Locators.MyAccountBillingAddress.BilingCity, keywordValue,Locators.MyAccountBillingAddress.BilingPhoneNumber);
		
	 	}else if(fieldName.equalsIgnoreCase("ccmobilenumber")){
			setText(Locators.MyAccountBillingAddress.BilingPhoneNumber, keywordValue);

			tapOnElement(Locators.MyAccountBillingAddress.LabelBillingAddress);

		}else {
		
			throw new UnsupportedOperationException("Given Element type not defined");
		}
	}
	  

	public void tabOnButtonOnAccountPage(String btnName) {
			if(btnName.equalsIgnoreCase("payment button")) {
				
				tapOnElement(Locators.MyAccountwelcomePage.buttonPayment);

			}else if(btnName.equalsIgnoreCase("wishlist button")){
				
				tapOnElement(Locators.MyAccountwelcomePage.buttonWishlist);
				
			}else if(btnName.equalsIgnoreCase("orders button")){

				tapOnElement(Locators.MyAccountwelcomePage.buttonOrders);
			}else if(btnName.equalsIgnoreCase("address book")){

				tapOnElement(Locators.MyAccountwelcomePage.buttonAddressbook);
			}else if(btnName.equalsIgnoreCase("contact us button")){

				tapOnElement(Locators.MyAccountwelcomePage.buttoncontactus);
			}else if(btnName.equalsIgnoreCase("Mobilenumber")){
				
				tapOnElement(Locators.MyAccountwelcomePage.CSMobilenumber);
			}else if(btnName.equalsIgnoreCase("cancel")){

				tapOnElement(Locators.MyAccountwelcomePage.CallCancelbutton);

			}else {
				throw new UnsupportedOperationException("Given button type not defined");
			}
		
	}

	// to vefiry element on my account cards page 
	public boolean VarifyElementPresenseOnAccountCardsPage(String elementName) {
		if(elementName.equalsIgnoreCase("payment header")) {
			return isElementDisplayed(Locators.MyAccountPayment.Paymenttitle);
		}else if(elementName.equalsIgnoreCase("Saved Cards label")){
			return isElementDisplayed(Locators.MyAccountPayment.SavedCardslabel);
		}else if(elementName.equalsIgnoreCase("Aso card button")){
			
			return isElementDisplayed(Locators.MyAccountPayment.buttonaddacacemycard);
		}else if(elementName.equalsIgnoreCase("add credit card button")){
			
			return isElementDisplayed(Locators.MyAccountPayment.buttonaddcreditcard);
		}else if(elementName.equalsIgnoreCase("existing aso card")){
			
			return isElementDisplayed(Locators.MyAccountPayment.existingasocard);
		}else if(elementName.equalsIgnoreCase("savedCardsDefault")){
	
			return isElementDisplayed(Locators.MyAccountPayment.SavedCardsDefault);
			
		}else {
			
			throw new UnsupportedOperationException("Given Element type not defined");

		}
		
	}

	// to check element presence on my account card page
	public boolean VarifyElementPresenseOnAsoCardsPage(String elementName) {
		if(elementName.equalsIgnoreCase("add new Aso card")) {
			return isElementDisplayed(Locators.Addnewasocreditcard.AddnewAsocrerditCardlabel);
		}else {
			throw new UnsupportedOperationException("Given Element type not defined");
		}
	}

	// Click on Aso card page
	public void tabOnButtonOnAsoCardsPage(String btnName) {
		if(btnName.equalsIgnoreCase("save card button")) {
			tapOnElement(Locators.MyAccountBillingAddress.SaveCreditcardbutton);
			// add that element here on you want to click on add new aso card 
		}else if(btnName.equalsIgnoreCase("backbutton")){
			
			tapOnElement(Locators.Addnewasocreditcard.buttonback);
		}else if(btnName.equalsIgnoreCase("alertmodal")){
			
			tapOnElement(Locators.Addnewasocreditcard.ErrorModal);
		}else if(btnName.equalsIgnoreCase("cancell")){
			
			tapOnElement(Locators.Addnewasocreditcard.Cancelalertbutton);
		}else if(btnName.equalsIgnoreCase("continue")){
	
			tapOnElement(Locators.Addnewasocreditcard.Continuealertbutton);

		}else if(btnName.equalsIgnoreCase("deletecardbutton")){
			tapOnElement(Locators.Addnewasocreditcard.DeleteCardbutton);
		}else {
			throw new UnsupportedOperationException("Given button type not defined");
		}

	}
		
	

	public void tapOnOrderButton() {
		tapOnElement(Locators.AccountPage.ordersLabel);
	}

	public void enterOrderID(String args) {
		setText(Locators.AccountPage.orderIdInput, args);
	}

	public void enterOrderZipCode(String args) {
		setText(Locators.AccountPage.billingZipCode, args);
	}

	public void tapOnOrderCheckButton() {
		tapOnElement(Locators.AccountPage.buttonCheck);
	}

	public void tapOnOrderButtonInOrderScreen() {
		tapOnElement(Locators.OrdersPage.orderTotalbutton);
	}

	public boolean isPaymentDetailsScreenDisplayed() {
		return isElementDisplayed(Locators.OrdersPage.paymentDetailsScreenHeader);
	}

	public boolean isOrderSummaryLabelDisplayed() {
		return isElementDisplayed(Locators.OrdersPage.orderSummarylabel);
	}

	public boolean isPaymentMethodLabelDisplayed() {
		return isElementDisplayed(Locators.OrdersPage.paymentMethodLabel);
	}

	public void addCreditCardHolderName(String cardHolderName) {
		driver.findElement(Locators.AccountPage.creditCardHOlderName).sendKeys(cardHolderName);
		
	}

	public void addCreditCardNumber(String cardNumber) {
		driver.findElement(Locators.AccountPage.creditCardNumber).sendKeys(cardNumber);
		
	}

	public void addCreditCardExpiryDate(String expiryDate) {
		driver.findElement(Locators.AccountPage.creditCardExpiry).sendKeys(expiryDate);
		
	}

	public void addCreditCardCvv(String cvvNumber) {
		driver.findElement(Locators.AccountPage.creditCardCvvNumber).sendKeys(cvvNumber);
		
	}

	public boolean isCreditCardDetailspageDisplayed() {
	
		return isElementDisplayed(Locators.AccountPage.creditCardPageTitle);
		
	}

	public boolean isAlertPopUpDisplayed() {
		return isElementDisplayed(Locators.AccountPage.alertPopUPCreditCard);
		
	}

	public void enterCreditCardDetails(String fieldName) {
		
		String keywordValue = PropertiesHelper.getInstance().getMobileTestDataProperty(fieldName);
 		String element = null;
 		if(fieldName.equalsIgnoreCase("ASOCard")){
 			setText(Locators.Addnewasocreditcard.Asocardtextbox, keywordValue,Locators.Addnewasocreditcard.Setasdefaultcheckbox);

 			
 		}else if(fieldName.equalsIgnoreCase("ccfirstname")){

 			setText(Locators.MyAccountBillingAddress.BilingFirstName, keywordValue,Locators.MyAccountBillingAddress.BilingLastName);
 		}else if(fieldName.equalsIgnoreCase("ccnewfirstname")){

 			setText(Locators.MyAccountBillingAddress.BilingFirstName, keywordValue,Locators.MyAccountBillingAddress.BilingLastName);
	
	 	}else if(fieldName.equalsIgnoreCase("ccLastname")){
	 		setText(Locators.MyAccountBillingAddress.BilingLastName, keywordValue,Locators.MyAccountBillingAddress.BilingAddressText);
	 	
	 	}else if(fieldName.equalsIgnoreCase("ccAddress")){

	 		setText(Locators.MyAccountBillingAddress.BilingAddressText, keywordValue,Locators.MyAccountBillingAddress.BilingAptName);
	 		
	 	}else if(fieldName.equalsIgnoreCase("ccaprtname")){
	 		setText(Locators.MyAccountBillingAddress.BilingAptName, keywordValue,Locators.MyAccountBillingAddress.BilingZipCode);
	 		
	 		
	 	}else if(fieldName.equalsIgnoreCase("cczipcode")){
	 		setText(Locators.MyAccountBillingAddress.BilingZipCode, keywordValue,Locators.MyAccountBillingAddress.BilingCity);
	 	
	 	}else if(fieldName.equalsIgnoreCase("entercccity")){
		setText(Locators.MyAccountBillingAddress.BilingCity, keywordValue,Locators.MyAccountBillingAddress.BilingPhoneNumber);
		
	 	}else if(fieldName.equalsIgnoreCase("ccmobilenumber")){
		setText(Locators.MyAccountBillingAddress.BilingPhoneNumber, keywordValue);
		tapOnElement(Locators.MyAccountBillingAddress.LabelBillingAddress);
	}else {
		
		throw new UnsupportedOperationException("Given Element type not defined");
	}
	}

	public void tapOnLoginBtn() {
		tapOnElement(Locators.AccountPage.loginLink);
		
	}

	public void isBillingAddressSectionDisplayed() {
		isElementDisplayed(Locators.AccountPage.billingAddressTitle);
		
	}

	public boolean isCreditCardsDisplayed() {
		List<MobileElement> ls = driver.findElements(By.xpath(""));
		return ls.size() != 0;
		
	}

	public void tapOnSetDefaultCheckbox() {
		tapOnElement(Locators.AccountPage.setAsDefaultCheckBox);
		
	}

	public boolean verifyDefaultcreditCard() {
		List<MobileElement> ls = driver.findElements(By.xpath(""));
		boolean stat =false;
		for(int i = 1; i<=ls.size(); i++) {
			if(i==1) {
				 stat = ls.get(i).isDisplayed();
				
			}
		}
		return stat;
		
	}

	public void tapOnCreditCard(int creditCardPosition) {
		List<MobileElement> creditCards = driver.findElements(By.xpath(""));
		for(int i=1; i<=creditCards.size();i++) {
			if(i==creditCardPosition)
			creditCards.get(i).click();
		}
	}

	public boolean isSetAsDefaultNotDisplayed() {
		return !isElementDisplayed(Locators.MyAccountPayment.setAsDefaultCheckbox);
	}

	public boolean isDefaultCheckBoxChecked() {
		return isElementSelected(Locators.MyAccountPayment.setAsDefaultCheckbox);
	}

	public boolean isDefaultCheckBoxDisabled() {
		return !isElementEnabled(Locators.MyAccountPayment.setAsDefaultCheckbox);
	}

	public boolean isGreetingMessageDisplayed() {
		return isElementDisplayed(Locators.AccountPage.greetingMessage);
	}

	public void isComponenetDisplayedOnAsoCardPage(String field) {
		if (field.contains("CardInforMation")) {
			GlobalMobileHelper.isElementDisplayed(Locators.AccountPage.asoCardInforMationTile);
		} else if (field.contains("CardNumberEditBox")) {
			GlobalMobileHelper.isElementDisplayed(Locators.AccountPage.cardNoEditBox);
		}
	}

	public void tabOnButtonOnTrackorderPage(String btnName) {
		if(btnName.equalsIgnoreCase("Check button")) {
			
			tapOnElement(Locators.AccountPage.buttonCheck);
		}else {
			throw new UnsupportedOperationException("Given button type not defined");
		}
		
	}

	public boolean VarifyElementPresenseOnOrdersPage(String elementName) {
		if(elementName.equalsIgnoreCase("Order Details")) {
			
			return isElementDisplayed(Locators.OrderDetail.Orderdetailheading);
		} else if(elementName.equalsIgnoreCase("ordernumber")) {
			
			return isElementDisplayed(Locators.OrderDetail.Ordernumber);
} else if(elementName.equalsIgnoreCase("orderdate")) {
			
			return isElementDisplayed(Locators.OrderDetail.orderdate);
} else if(elementName.equalsIgnoreCase("ordertotalbutton")) {
	
	return isElementDisplayed(Locators.OrderDetail.ordertotal);
} else if(elementName.equalsIgnoreCase("cancelorder")) {
	
	return isElementDisplayed(Locators.OrderDetail.cancelorderbutton);
} else if(elementName.equalsIgnoreCase("deliveryheading")) {
	
	return isElementDisplayed(Locators.OrderDetail.homedelivery);
} else if(elementName.equalsIgnoreCase("customername")) {
	
	return isElementDisplayed(Locators.OrderDetail.customername);
} else if(elementName.equalsIgnoreCase("shippingaddress")) {
	
	return isElementDisplayed(Locators.OrderDetail.shippingaddress);
} else if(elementName.equalsIgnoreCase("orderstatus")) {
	
	return isElementDisplayed(Locators.OrderDetail.orderstatus);
	
} else if(elementName.equalsIgnoreCase("shippingmethode")) {
	
	return isElementDisplayed(Locators.OrderDetail.shippingmethode);
} else if(elementName.equalsIgnoreCase("producttitle")) {
	
	return isElementDisplayed(Locators.OrderDetail.producttitle);
} else if(elementName.equalsIgnoreCase("productqty")) {
	
	return isElementDisplayed(Locators.OrderDetail.productqty);
} else if(elementName.equalsIgnoreCase("productprice")) {
	
	return isElementDisplayed(Locators.OrderDetail.productprice);
} else if(elementName.equalsIgnoreCase("skunumber")) {
	
	return isElementDisplayed(Locators.OrderDetail.skunumber);
			
		}else {
			throw new UnsupportedOperationException("Given element not found on order details page");
	}

}

	public boolean VarifyElementPresenseOnOrdershistoryPage(String elementName) {
		if(elementName.equalsIgnoreCase("Order heading")) {
			
			return isElementDisplayed(Locators.OrderHistoryloggedInuser.orderheading);
		} else if(elementName.equalsIgnoreCase("Order label")) {
			
			return isElementDisplayed(Locators.OrderHistoryloggedInuser.orderlabel);
} else if(elementName.equalsIgnoreCase("lookupyourorderbutton")) {
			
			return isElementDisplayed(Locators.OrderHistoryloggedInuser.lookupyourorderbutton);
} else if(elementName.equalsIgnoreCase("addastorereciptbutton")) {
	
	return isElementDisplayed(Locators.OrderHistoryloggedInuser.addastorereciptbutton);
} else if(elementName.equalsIgnoreCase("orderpurchagetype")) {
	
	return isElementDisplayed(Locators.OrderHistoryloggedInuser.orderpurchagetype);
} else if(elementName.equalsIgnoreCase("orderstatusprocessing")) {
	
	return isElementDisplayed(Locators.OrderHistoryloggedInuser.orderstatusprocessing);
} else if(elementName.equalsIgnoreCase("orderstatusdelivered")) {
	
	return isElementDisplayed(Locators.OrderHistoryloggedInuser.orderstatusdelivered);
} else if(elementName.equalsIgnoreCase("ordernumberlabel")) {
	
	return isElementDisplayed(Locators.OrderHistoryloggedInuser.ordernumberlabel);
} else if(elementName.equalsIgnoreCase("ordernumber")) {
	
	return isElementDisplayed(Locators.OrderHistoryloggedInuser.ordernumber);
} else if(elementName.equalsIgnoreCase("orderdatelabel")) {
	
	return isElementDisplayed(Locators.OrderHistoryloggedInuser.orderdatelabel);
} else if(elementName.equalsIgnoreCase("orderdate")) {
	
	return isElementDisplayed(Locators.OrderHistoryloggedInuser.orderdate);
} else if(elementName.equalsIgnoreCase("ordertotallabel")) {
	
	return isElementDisplayed(Locators.OrderHistoryloggedInuser.ordertotallabel);
} else if(elementName.equalsIgnoreCase("ordertotal")) {
	
	return isElementDisplayed(Locators.OrderHistoryloggedInuser.ordertotal);
	
			
		}else {
			throw new UnsupportedOperationException("Given element not found on order details page");
		}
	}

	public void tabOnButtonOnorderhistoryPage(String btnName) {
		if(btnName.equalsIgnoreCase("lookupyourorderbutton")) {
			
			tapOnElement(Locators.OrderHistoryloggedInuser.lookupyourorderbutton);
			
		}else {
			throw new UnsupportedOperationException("Given button type not defined");
		}
		
	}
}
