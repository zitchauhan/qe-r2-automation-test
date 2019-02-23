Feature: Remove all products from cart 

@R2_Web @R2_RemoveAllProductsInCart 
Scenario Outline: Remove all existing products from cart 
	Given user launches the browser and navigates to "ASO_HOME" page
	And user should able to click on Signin button 
	And user enter the valid emailaddress "<EmailID>" 
	And user enter the valid password "<Password>" 
	And user click on signin button 
	And user navigate and deletes existing items in cart
	Examples: 
		|EmailID							|Password|
		|emailWithOutPhonenumber			|Password|
		|emailWithOutPhonenumber			|Password|
 		|UserWithSavedAddressAndPayment		|Password|
 		|UserWithDefaultCaliforniaAddress	|Password|
 		|UserForOrderPlacement				|Password|
 		|EmailAddress						|Password|
 		