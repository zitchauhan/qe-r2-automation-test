Feature: [Web] Billing Address Verification

@R2_Web @R2_Regression @P-Medium @C-Checkout @KER-3130 @ZYP_CART_K3132-9552 @CR-AG 
Scenario: Verify user gets the form field validation error on leaving mandatory name/address fields blank
Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page
	And user click on checkout button in Cart page
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	And user click on Go To Shipping Method button in Checkout page
	Then user uncheck the checkbox for Billing address different from shipping address
	Then user clicks on the Review order button
	And user validates error msg displayed for all required fields
	
    
@R2_Web @R2_Regression @P-Highest @C-Checkout @KER-3130 @ZYP_CART_K3132-9554 @CR-AG 
Scenario: Verify user gets the form field validation error on leaving mandatory name/address fields blank
Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page
	And user click on checkout button in Cart page
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	And user click on Go To Shipping Method button in Checkout page
	And user verifies visa card entery in the card fields
	Then user uncheck the checkbox for Billing address different from shipping address
	And user enter alternative person FirstName "PickupFirstName"
	And user enter alternative person LastName "PickupLastName"
	And user can enter the alternative person phone number "PhoneNumber"
	And user enter Address field "UpdateAddress"
 	And user enter ZipCode field "UpdateZipcode"
 	And user enter alternative person Email "PickupEmail"
	Then user clicks on the Review order button
	And user able to see the button place order
	


@R2_Web @R2_Regression @P-High @C-Checkout @KER-3130 @ZYP_CART_K3132-9557 @CR-AG 
Scenario: Verify user gets the form field validation error on leaving mandatory name/address fields blank
Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page
	And user click on checkout button in Cart page
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	And user click on Go To Shipping Method button in Checkout page
	And user verifies master card entery in the card fields
	Then user uncheck the checkbox for Billing address different from shipping address
	And user enter alternative person FirstName "PickupFirstName"
	And user enter alternative person LastName "PickupLastName"
	And user can enter the alternative person phone number "PhoneNumber"
	And user enter Address field "Address1"
 	And user enter ZipCode field "UpdateZipcode"
 	And user enter alternative person Email "PickupEmail"
	Then user clicks on the Review order button
	And user able to see the button place order


@R2_Web @R2_Regression @P-Medium @C-Checkout @KER-3130 @ZYP_CART_K3132-9560 @CR-AG 
Scenario: Verify user gets the form field validation error on leaving mandatory name/address fields blank
Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page
	And user click on checkout button in Cart page
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	And user click on Go To Shipping Method button in Checkout page
	And user verifies master card entery in the card fields
	Then user uncheck the checkbox for Billing address different from shipping address
	And user enter alternative person FirstName "PickupFirstName"
	And user enter alternative person LastName "PickupLastName"
	And user can enter the alternative person phone number "PhoneNumber"
	And user enter Address field "Address1"
 	And user enter ZipCode field "UpdateZipcode"
 	And user enter alternative person Email "PickupEmail"
 	And User verifies that city and State are populated automatically


@R2_Web @R2_Regression @P-Medium @C-Checkout @KER-3130 @ZYP_CART_K3132-9564 @CR-AG 
Scenario: Verify user gets the form field validation error on leaving mandatory name/address fields blank
Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page
	And user click on checkout button in Cart page
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	And user click on Go To Shipping Method button in Checkout page
	And user verifies master card entery in the card fields
	Then user uncheck the checkbox for Billing address different from shipping address
	And user enter alternative person FirstName "PickupFirstName"
	And user enter alternative person LastName "PickupLastName"
	And user can enter the alternative person phone number "InvalidPhoneNumber"
	And user enter Address field "Address1"
 	And user enter ZipCode field "WrongzipCode"
 	And user enter alternative person Email "InvalidEmailAddresswithoutdomain"
    Then user clicks on the Review order button 
    And user able to see error msgs for Phone Email Zip Address fields
	