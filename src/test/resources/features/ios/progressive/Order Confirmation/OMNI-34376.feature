Feature: Order Confirmation Screen - Payment Section
  
  @Sprint5 @ST-OMNI-34376 @TC-OMNI-35467
  Scenario: Verify Payment details on order confirmation page when payment was done using credit card		
    Given User launches the application
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
    #need to update the steps for order placement
    When User taps on checkout button
    Then User sees payment method label
    Then User sees "Credit Card" image
    Then User sees last four digits of "credit card"
    
    @Sprint5 @ST-OMNI-34376 @TC-OMNI-35472
  Scenario: Verify Payment details on order confirmation page when split payment was done using credit card	and gift card	
    Given User launches the application
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