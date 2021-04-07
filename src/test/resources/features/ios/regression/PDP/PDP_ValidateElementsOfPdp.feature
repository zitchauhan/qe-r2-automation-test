@Regression
Feature: Validate functionality of PDP page

 @Sprint1 @TC-OMNI-24950
  Scenario Outline: User Selects a product without any variants
  Given User launches the application
    And User continues as guest user
 #   Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "<product>" 
    And I choose to navigate to PDP
    Then User sees product image
    And User sees Product title
    And User sees Product Price
    Then User sees quantity stepper
 Examples: 
     |    product            |	
     |    SearchKeyword           | 