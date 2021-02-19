
Feature: Verify Details of PDP for product without any variants

  @Sprint1 @TC_OMNI_24466
  Scenario: User Selects a product without any variants
  	Given User launches the application
  	And User Logs into the application
  	When User taps on go to pdp button
    Then User sees product image
    And User sees Product title
    And User sees Product Price