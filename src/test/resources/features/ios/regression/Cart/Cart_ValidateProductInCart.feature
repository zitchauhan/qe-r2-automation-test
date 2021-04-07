Feature: Validate Cart shows necessary information for a prdouct

	@Regression
  Scenario Outline: User Selects a product without any variants
  	Given User launches the application
    And User continues as guest user
 #   Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "<product>" 
    And I choose to navigate to PDP
    And User sees Product title
    And User taps on add to cart button
    Then User is navigated To Cart Screen
    And User sees items label
    And User sees subtotal header
    And User sees product title
    And User sees SKU label
    And User sees Price label
    And User sees Quantity Selector
    And User sees Remove from cart button
    And User sees Add to wish list button
     Examples: 
     |    product            |	
     |    SearchKeyword           | 
    