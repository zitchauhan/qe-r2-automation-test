Feature: Validate Cart shows necessary information for a prdouct

	@Regression
  Scenario: User Selects a product without any variants
  	Given User launches the application
    When User taps on go to pdp button
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