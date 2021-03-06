
Feature: Verify that promo codes can be applied and applied savings can be seen on the Cart

  Scenario: User sees the promo code field
    Given User launches the application
    And User Logs into the application
    When User taps on go to pdp button
    And User sees Product title
    And User taps on add to cart button
    Then User is navigated To Cart Screen
    And User sees the promo code field
    
  Scenario Outline: Verify promocode error messages based on nature of promo code on the Cart 
  	Given User launches the application
    And User Logs into the application
    When User taps on go to pdp button
    And User sees Product title
    And User taps on add to cart button
    Then User is navigated To Cart Screen
    And User sees the promo code field
    When User applies the given "<promo_code>"
    Then User sees the promo code "<error_message>"
    
    Examples:
    | promo_code | error_message |
    | INVALID	   | Please enter a valid Promo code |
    | INVALID	   | Please enter a valid Promo code |
    | INVALID	   | Please enter a valid Promo code |
    | INVALID	   | Please enter a valid Promo code |
    | INVALID	   | Please enter a valid Promo code |
    | INVALID	   | Please enter a valid Promo code |
    | INVALID	   | Please enter a valid Promo code |
    | INVALID	   | Please enter a valid Promo code |
    | INVALID	   | Please enter a valid Promo code |
    | INVALID	   | Please enter a valid Promo code |
    | INVALID	   | Please enter a valid Promo code |
    | INVALID	   | Please enter a valid Promo code |
    | INVALID	   | Please enter a valid Promo code |
    | INVALID	   | Please enter a valid Promo code |
    | INVALID	   | Please enter a valid Promo code |
    | INVALID	   | Please enter a valid Promo code |
    
  @TC-OMNI-20656
  Scenario Outline: Verify valid promo code effects to the related fields and on the Cart
  	Given User launches the application
    And User Logs into the application
    When User taps on go to pdp button
    And User sees Product title
    And User taps on add to cart button
    Then User is navigated To Cart Screen
    When User applies the given "<promo_code>"
    Then User sees that Promo code field is disabled
    And User sees the applied promocode below promo code field
    And User sees the applied discount on the order summary field
    And User sees the updated order total
    And User sees the remove promo code button
  	# cover additional verifications from point no 5
  	When User taps of remove promo code button
  	Then User sees that promotion discount is removed
  	And User sees the updated order total
  	And User sees that Promo code field is enabled
  	
  	Examples:
  	| promo_code |
  	| PROMOCODE |
  	| promocode |
  	
  	  
  
    
    
    
    
    