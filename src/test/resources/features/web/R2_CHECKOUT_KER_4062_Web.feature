Feature: Gift Card application 

@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-4061 @ZYP_CART_K4062-10300 @CR-SK 
Scenario: Verify if user gets proper validation message for password less than 8 characters
	Given user launches the browser and navigates to "ASO_HOME" page
	And user enters "SKUForBopisProduct" in the search box
	And user click on Add to Cart Button 
	And user will click on View Cart button 
	And user navigate to Cart page
	And user click on checkout button in Cart page
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	And user click on Go To Shipping Method button in Checkout page