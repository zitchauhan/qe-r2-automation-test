Feature: Verfiy Gift Card - Unauthenticated User Applying Gift Card at Checkout 


@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6824 @ZYP_CHECKOUT_K6821-8628 @CR-DPK
	Scenario: Verify Gift Card applied is reflected on Order summary
	Given user launches the browser and navigates to "ASO_HOME" page  
	And User navigates to L2 Mens clothing
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
	And user enter Gift card Number "GiftcardNumber"
	And user enter Pin Number "PinNumber" 
	And user click on Apply button
	Then verify Gift Card in order summary page
	Then verify + Add another Gift Card
	And verify Hide Gift Card
	
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6824 @ZYP_CHECKOUT_K6821-8629 @CR-DPK
	Scenario: Verify Gift Card applied is reflected on Order summary
	Given user launches the browser and navigates to "ASO_HOME" page  
	And User navigates to L2 Mens clothing
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
	And user enter Gift card Number "GiftcardNumber"
	And user enter Pin Number "PinNumber" 
	And user click on Apply button
	Then verify Gift Card in order summary page	
	
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6824 @ZYP_CHECKOUT_K6821-8630 @CR-DPK
	Scenario: Verify the gift card fields displayed on addition of extra card
	Given user launches the browser and navigates to "ASO_HOME" page  
	And User navigates to L2 Mens clothing
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
	And user enter Gift card Number "GiftcardNumber"
	And user enter Pin Number "PinNumber" 
	And user click on Apply button
	Then verify Gift Card in order summary page
	Then verify + Add another Gift Card
	Then verify GiftCard and Pin field
	
	
@R2_Web @R2_Regression @R2_All @P-Highest @C-Checkout @KER-6824 @ZYP_CHECKOUT_K6821-8631 @CR-DPK
	Scenario: Verify +Add Another Gift card link is Suppressed in non-availability of remaining order amount
	Given user launches the browser and navigates to "ASO_HOME" page  
	And User navigates to L2 Mens clothing
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
	And user enter Gift card Number "GiftcardNumber_Amt_Bal_Full"
	And user enter Pin Number "PinNumber_Amt_Bal_Full" 
	And user click on Apply button
	Then verify Gift Card in order summary page
	Then +Add Another Gift Card should be suppressed	



@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6824 @ZYP_CHECKOUT_K6821-8632 @CR-DPK 
Scenario: Verify the Hide Gift Card CTA behavior
	Given user launches the browser and navigates to "ASO_HOME" page  
	And User navigates to L2 Mens clothing
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
	And verify GiftCard and Pin field
	Then user click on GiftCard Minus icon in Checkout page