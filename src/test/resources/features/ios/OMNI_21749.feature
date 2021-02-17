
Feature: Verify Details of PDP for product without any variants

  @Sprint1 @TC_OMNI_24466
  Scenario: User Selects a product without any variants
  	Given User has selected a product and is on PDP
    Then User sees product image
    And User sees Product title
    And User sees Product Price
    And User sees Quantity Stepper