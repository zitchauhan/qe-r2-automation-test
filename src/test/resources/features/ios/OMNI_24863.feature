Feature: Verify Details of PDP for product badging

  @Sprint1 @TC-OMNI-24863
  Scenario: User Selects a product without any variants
  	Given User launches the application
  	And User Logs into the application
  	When User taps on go to pdp button
  	When user search product with
  	
    Then User sees product image
    And User sees Product title
    And User sees Product Price
    
    