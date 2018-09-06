Feature: B06-225 - BOPIS: SMS Capture

@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-4134 @ZYP_CHECKOUT_K4134-10888 @CR-MS
Scenario: Verify Phone number associated with BOPIS - Un Authenticated user
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	And user navigate to Cart page 
	And user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	And  user will click on Checkout button and navigates to Checkout page
	When user enter Phone number "PhoneNumber" in Billing address
	
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-4134 @ZYP_CHECKOUT_K4134-10884 @CR-MS	
Scenario: Verify Phone number associated with BOPIS
Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "emailWithOutPhonenumber" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User navigates to L2 Mens clothing
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	Then user clicks on one of the product category and navigates to LThree  
	Then User is navigated to pdp page 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	Then user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode"
	And  user will click on Checkout button and navigates to Checkout page
	When user enter Phone number "PhoneNumber" in Billing address
	
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-4134 @ZYP_CHECKOUT_K4134-10886 @CR-MS	
Scenario: Verify Phone number associated with BOPIS - Saved Billing address
Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User navigates to L2 Mens clothing
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	Then user clicks on one of the product category and navigates to LThree  
	Then User is navigated to pdp page 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	Then user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode"
	And  user will click on Checkout button and navigates to Checkout page
	And  user views the phone number given in the My account saved Billing address

@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-4134 @ZYP_CHECKOUT_K4134-10885 @CR-MS	
Scenario: Verify Phone number associated with BOPIS
Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "emailWithOutPhonenumber" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User navigates to L2 Mens clothing
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	Then user clicks on one of the product category and navigates to LThree  
	Then User is navigated to pdp page 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	Then user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode"
	And  user will click on Checkout button and navigates to Checkout page
	When user click on edit shipping pickup
	And user select me + alternate pickup person
	Then user can enter the alternative person phone number "PhoneNumber"
	And Verify below Sub/Main Module of Checkout Page
		|Alternate's Phone Number|

@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-4134 @ZYP_CHECKOUT_K4134-10891 @CR-MS
Scenario: Verify Phone number field validation
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	And user navigate to Cart page 
	And user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	And  user will click on Checkout button and navigates to Checkout page
	When user click on edit shipping pickup
	And user select me + alternate pickup person
	Then user can enter the alternative person phone number "PhoneNumber" 
	And checks for no form errors
	Then Verify below Sub/Main Module of Checkout Page
	|Alternate's Phone Number|
		
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-4134 @ZYP_CHECKOUT_K4134-10892 @CR-MS
Scenario: Verify Phone number associated with BOPIS - Un Authenticated user
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	And user navigate to Cart page 
	And user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	And  user will click on Checkout button and navigates to Checkout page
	When user click on edit shipping pickup
	And user select me + alternate pickup person
	Then user can enter the alternative person invalid phone number "InvalidPhoneNumber"
	And checks for form errors
	Then Verify below Sub/Main Module of Checkout Page
	|Alternate's Phone Number|

@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-4134 @ZYP_CHECKOUT_K4134-10893 @CR-MS
Scenario: Verify Phone number field validation
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	And user navigate to Cart page 
	And user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	And  user will click on Checkout button and navigates to Checkout page
	When user click on edit shipping pickup
	And user select me + alternate pickup person
	Then user can enter the alternative person invalid phone number "InvalidPhoneNumber"
	And checks for form errors
	Then Verify below Sub/Main Module of Checkout Page
		|Alternate's Phone Number|
		
@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-4134 @ZYP_CHECKOUT_K4134-10889 @CR-MS
Scenario: Verify Phone number associated with BOPIS - Alternative pick up Person
  Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	And user navigate to Cart page 
	And user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	And  user will click on Checkout button and navigates to Checkout page
	When user click on edit shipping pickup
	And user select me + alternate pickup person
	Then Verify below Sub/Main Module of Checkout Page
	And user enter alternative person FirstName "PickupFirstName"
	And user enter alternative person LastName "PickupLastName"
	And user enter alternative person Email "PickupEmail"
	And user can enter the alternative person phone number "PhoneNumber"
	Then user click on confirm button
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-4134 @ZYP_CHECKOUT_K4134-10890 @CR-MS
Scenario: Verify SMS check box display with Primary and Alternative Person
  Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	And user navigate to Cart page 
	And user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	And  user will click on Checkout button and navigates to Checkout page
	When user click on edit shipping pickup
	And user select me + alternate pickup person
    Then Verify below Sub/Main Module of Checkout Page
    |SendSMSTextUpdatesAboutMyOrder_checkbox|
    
@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-4134 @ZYP_CHECKOUT_K4134-10887 @CR-MS
Scenario: Verify Phone number associated with BOPIS - Saved Billing address
Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User navigates to L2 Mens clothing
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	Then user clicks on one of the product category and navigates to LThree  
	Then User is navigated to pdp page 
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button
	Then user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode"
	And  user will click on Checkout button and navigates to Checkout page
	

	
	




















	
	 

	