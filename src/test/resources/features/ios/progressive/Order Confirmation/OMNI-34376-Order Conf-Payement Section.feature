Feature: Order Confirmation Screen - Payment Section
  
  @Sprint5 @ST-OMNI-34376 @TC-OMNI-35467-1
  Scenario: Registered User - Verify Payment details on order confirmation page when payment was done using credit card		
    Given User launches the application
    And User taps on Maybe later in Onboarding Screen
    And User continues as guest user
    And User is on Log In scr		een
	Then User sees email address field
	And User sees passwordd field
    Then User enters valid email "aso_automation1@yopmail.com"
 	And User enters valid password "Password@123"
 	And User taps on Login
 	And User taps on home in bottom nav
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword" 
    When I choose to navigate to PDP
    Then User sees product image
    And User sees Product title
    And User taps on add to cart button
    And User taps on View Cart button
    Then User is navigated To Cart Screen
    And User sees the checkout button
    When User taps on checkout button
    #need to update the steps for order placement
    Then User sees payment method label
    Then User sees "Credit Card" image
    Then User sees last four digits of "credit card"
    
     @Sprint5 @ST-OMNI-34376 @TC-OMNI-35467
  Scenario: Guest User - Verify Payment details on order confirmation page when payment was done using credit card		
    Given User launches the application
    And User taps on Maybe later in Onboarding Screen
    And User continues as guest user		
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword" 
    When I choose to navigate to PDP
    Then User sees product image
    And User sees Product title
    And User taps on add to cart button
    And User taps on View Cart button
    Then User is navigated To Cart Screen	
    And User sees the checkout button
    When User taps on checkout button
    Then User enters "Test" in "First Name" field on add address screen
    Then User enters "User" in "Last Name" field on add address screen
    Then User enters "1501 Gaylord Trail" in "Address" field on add address screen
    Then User enters "2507" in "Apt Number" field on add address screen
    Then User enters "76501" in "ZIP Code" field on add address screen
    Then User enters "Grapevine" in "City" field on add address screen
    Then User enters "7646564657" in "Phone" field on add address screen
    Then User taps on Add New address button
    #need to update the steps for order placement
    When User taps on checkout button
    Then User sees payment method label
    Then User sees "Credit Card" image
    Then User sees last four digits of "credit card"
    
    @Sprint5 @ST-OMNI-34376 @TC-OMNI-35472
  Scenario: Verify Payment details on order confirmation page when split payment was done using credit card	and gift card	
    Given User launches the application
    And User taps on Maybe later in Onboarding Screen
    And User continues as guest user		
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword" 
    When I choose to navigate to PDP
    Then User sees product image
    And User sees Product title
    And User taps on add to cart button
    And User taps on View Cart button
    Then User is navigated To Cart Screen	
    And User sees the checkout button
    When User taps on checkout button
     #need to update the steps for order placement
    Then User sees payment method label
    Then User sees "Credit Card" image
    Then User sees last four digits of "credit card"			
    Then User sees "Gift Card" image
    Then User sees last four digits of "Gift Card"
    Then User sees the amount debited from the Gift Card
    
    @Sprint5 @ST-OMNI-34376 @TC-OMNI-35474
  Scenario: Verify Payment details on order confirmation page when payment was done using PayPal		
    Given User launches the application
    And User taps on Maybe later in Onboarding Screen
    And User continues as guest user
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword" 
    When I choose to navigate to PDP
    Then User sees product image
    And User sees Product title
    And User taps on add to cart button
    And User taps on View Cart button
    Then User is navigated To Cart Screen
    And User sees the checkout button
    When User taps on checkout button
     #need to update the steps for order placement
    Then User sees payment method label
    Then User sees "PayPal" image
    And User sees "PayPal" payment method
    
     @Sprint5 @ST-OMNI-34376 @TC-OMNI-35476
  Scenario: Verify Payment details on order confirmation page when payment was done using ApplePay		
    Given User launches the application
    And User taps on Maybe later in Onboarding Screen
    And User continues as guest user
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword" 
    When I choose to navigate to PDP
    Then User sees product image
    And User sees Product title
    And User taps on add to cart button
    And User taps on View Cart button
    Then User is navigated To Cart Screen
    And User sees the checkout button
    When User taps on checkout button
     #need to update the steps for order placement
    Then User sees payment method label
    Then User sees "ApplePay" image
    And User sees "ApplePay" payment method