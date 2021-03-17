Feature: Verify Details of PDP for product without any variants

  @Sprint1 @TC-OMNI-24466 @ST-21749
  Scenario: User sees product title and price for a product
  	Given User launches the application
  	#And User Logs into the application
  	And User continues as guest user
  	When User navigates to pdp
    Then User sees product image
    And User sees Product title
    And User sees Product Price

