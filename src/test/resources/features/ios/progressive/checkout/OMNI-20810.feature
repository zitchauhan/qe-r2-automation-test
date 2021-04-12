Feature: Ship To Home Order Details - Guest User

@ST-OMNI-20810
Scenario: verify the followings when user has opted Ship to home (STH) as fulfillment option
1. shipping label is displayed
2. order processing message is displayed
3. Add You Shipping Instruction label is displayed with Chevron icon

	Given User launches the application
	Then User Clicks On MaY Be Later
	And User continues as guest user
	When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "Boot"
    And user click on Product
    And user click on Home Delivery
    When User taps on add to cart button
    And User taps on View Cart button
    Then User is navigated To Cart Screen
    Then User note down the total quantity on cart page
    And User sees the checkout button
    When User taps on checkout button
    And User sees order processing message
    And User sees "Standard" shipping service
    And User sees "2 day" shipping service
    And User sees "Overnight" shipping service
    