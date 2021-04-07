Feature: Verify that product quantity can be changed on View cart page for an order

  @Sprint1 @ST-OMNI-20609 @TC-OMNI-30556
  Scenario: User sees fields for logging in the application
    Given User launches the application
    And User continues as guest user
    When User navigates to pdp
    And User sees Product title
    And User taps on add to cart button
    Then User is navigated To Cart Screen
    And User sees the quantity stepper
    And User sees the correct item count on the cart badge counter on bottom navigation
    And User sees taxes label
    And User notes down tax before adding quantity
    And User notes down subtotal before adding quantity
    And User notes down order total before adding quantity
  	And User tap on "+" action for quantity
  	And User sees the correct item count on the cart badge counter on bottom navigation
  	And User sees updated tax value because of call to vertex after adding quantity
  	And User sees updated subtotal value after adding quantity
  	And User sees updated order total value after adding quantity
  	# Input fields and error messages are to be validated manually
  	# add more scenarios after addition of generic methods and keyboard api fix for appium
  	