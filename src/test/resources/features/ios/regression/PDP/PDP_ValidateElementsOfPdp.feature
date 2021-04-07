@Regression
Feature: Validate functionality of PDP page

 @Sprint1 @TC-OMNI-24950
  Scenario: User Selects a product without any variants
  	Given User launches the application
  	And User Logs into the application
  	When User taps on go to pdp button
    Then User sees product image
    And User sees Product title
    And User sees Product Price
    Then User sees quantity stepper
