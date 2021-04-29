Feature: Verify Order Summary in Cart

	@Regression
	Scenario: User sees the necessary Order Summary elements with label
    Given User launches the application
    And User continues as guest user
    Then User sees the homepage
	 	When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword"
    And user click on Product
    When User taps on add to cart button
    And User taps on View Cart button
    Then User is navigated To Cart Screen
    And User sees the order summary label
    And User sees taxes label
    And User sees the order total label