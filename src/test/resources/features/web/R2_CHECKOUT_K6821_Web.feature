Feature: Verfiy Gift Card - Payment Validation in Checkout 

@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6821 @ZYP_CHECKOUT_K6821-7957 @CR-DPK 
Scenario: Verify the error message when user enters the invalid Gift card number
	Given user launches the browser and navigates to "ASO_HOME" page  
	When user clicks on one of the category and navigates to LOne
    Then user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button
	Then user is navigated to Add to cart Notification popup  
	And user will click on View Cart button 
	And user navigate to Cart page
	Then user click on checkout button in Cart page
	When user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	Then user click on Go To Shipping Method button in Checkout page
	Then user click on GiftCard Plus icon in Checkout page
	And user enter Gift card Number "WrongGiftcardNumber"
	And user enter Pin Number "WrongPinNumber" 
	And user click on Apply button
	Then user verify the inline error message stating: Invalid Gift Card Number/Insufficient Funds
	


@R2_Web @R2_Regression @R2_All @P-Highest @C-Checkout @KER-6821 @ZYP_CHECKOUT_K6821-10203 @CR-AKK 
Scenario: Verify the error message when user enters the invalid Gift card number
	Given user launches the browser and navigates to "ASO_HOME" page  
	When user clicks on one of the category and navigates to LOne
    Then user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button
	Then user is navigated to Add to cart Notification popup  
	And user will click on View Cart button 
	And user navigate to Cart page 
	Then user click on checkout button in Cart page
	When user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	Then user click on Go To Shipping Method button in Checkout page
	When user clicks on Add Gift Card link
	And enter valid Gift Card Number "GiftCardNumber"
	And enters an alphanumeric PIN "PIN"
	Then user should NOT be allowed to input any non-numeric value to the gift card PIN field
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-6821 @ZYP_CHECKOUT_K6821-10194 @CR-AKK 
Scenario: Verify the error message when user enters valid old Gift card with valid new PIN in Checkout for payment
	Given user launches the browser and navigates to "ASO_HOME" page  
	When user clicks on one of the category and navigates to LOne
    Then user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button
	Then user is navigated to Add to cart Notification popup  
	And user will click on View Cart button 
	And user navigate to Cart page 
	Then user click on checkout button in Cart page
	When user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	Then user click on Go To Shipping Method button in Checkout page
	When user clicks on Add Gift Card link
	And enter valid Gift Card Number "GiftCardNumber"
	And user enter Pin Number "NewPinNumber" 
	And user click on Apply button
	Then user verify the inline error message stating: Invalid Gift Card Number/Insufficient Funds
	