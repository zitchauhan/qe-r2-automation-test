@TC-OMNI-20656
Feature: Verify that promo codes can be applied and applied savings can be seen on the Cart

  Scenario: User sees the promo code field
    Given User launches the application
<<<<<<< HEAD
<<<<<<< HEAD
    And User continues as guest user
    When User navigates to pdp
    And User sees Product title
    And User taps on add to cart button
    And User taps on view cart button
    Then User is navigated To Cart Screen
    And User sees the promo code field
  
  
  Scenario Outline: Verify promocode error messages based on nature of promo code on the Cart 
  	Given User launches the application
    And User continues as guest user
    When User navigates to pdp
    And User sees Product title
    And User taps on add to cart button
    And User taps on view cart button
=======
    And User Logs into the application
=======
    And User continues as guest user
>>>>>>> 40f229aa... complete OMNI-20656 execution script
    When User navigates to pdp
    And User sees Product title
    And User taps on add to cart button
    And User taps on view cart button
    Then User is navigated To Cart Screen
    And User sees the promo code field
  
  
  Scenario Outline: Verify promocode error messages based on nature of promo code on the Cart 
  	Given User launches the application
    And User continues as guest user
    When User navigates to pdp
    And User sees Product title
    And User taps on add to cart button
<<<<<<< HEAD
>>>>>>> 6466c968... update script for new locators and steps for error messages
=======
    And User taps on view cart button
>>>>>>> 40f229aa... complete OMNI-20656 execution script
    Then User is navigated To Cart Screen
    And User sees the promo code field
    When User applies the given "<promo_code>"
    Then User sees the promo code error "<error_message>"
    
    Examples:
    | promo_code | error_message |
<<<<<<< HEAD
<<<<<<< HEAD
    | INVLALID	   | Please enter a valid Promo code |
=======
    | GET100OFF	   | Please enter a valid Promo code |
>>>>>>> 6466c968... update script for new locators and steps for error messages
=======
    | INVLALID	   | Please enter a valid Promo code |
>>>>>>> 40f229aa... complete OMNI-20656 execution script
    
    
  
  Scenario Outline: Verify valid promo code effects to the related fields and on the Cart
  	Given User launches the application
<<<<<<< HEAD
<<<<<<< HEAD
    And User continues as guest user
    When User navigates to pdp
    And User sees Product title
    And User taps on add to cart button
    And User taps on view cart button
=======
    And User Logs into the application
    When User navigates to pdp
    And User sees Product title
    And User taps on add to cart button
>>>>>>> 6466c968... update script for new locators and steps for error messages
=======
    And User continues as guest user
    When User navigates to pdp
    And User sees Product title
    And User taps on add to cart button
    And User taps on view cart button
>>>>>>> 40f229aa... complete OMNI-20656 execution script
    Then User is navigated To Cart Screen
    When User applies the given "<promo_code>"
    Then User sees that Promo code field is disabled
    And User sees the applied promocode below promo code field
    And User sees the applied discount on the order summary field
    And User sees the updated order total
    And User sees the remove promo code button
  	# cover additional verifications from point no 5
  	When User taps the remove promo code button
  	Then User sees that promotion discount is removed
  	And User sees the updated order total
  	And User sees that Promo code field is enabled
  	
  	Examples:
  	| promo_code |
  	| GET10OFF |
  	| get10off |
<<<<<<< HEAD
<<<<<<< HEAD
=======
  	
  	  
  
    
    
    
    
    
>>>>>>> 6466c968... update script for new locators and steps for error messages
=======
>>>>>>> 40f229aa... complete OMNI-20656 execution script
