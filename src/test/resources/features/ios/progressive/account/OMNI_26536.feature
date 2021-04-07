Feature: Verify User is able to Add the address

  @ST-OMNI-26536 @TC-OMNI-33066
  Scenario: User is able to successfully add the address
  	Given User launches the application
  	And User taps on Maybe later in Onboarding Screen
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SizeVariantProduct"
    And user click on Product
    Then User sees product image
    And User sees Product title
    And User selects Home Delivery checkbox
    And User taps on add to cart button
    And User taps on View Cart button
    Then User is navigated To Cart Screen
    Then User sees the checkout button
    When User taps on the checkout button
    Then User sees the checkout screen
    Then User enters "Test" in "First Name" field on add address screen
    Then User enters "User" in "Last Name" field on add address screen
    Then User enters "1501 Gaylord Trail" in "Address" field on add address screen
    Then User enters "2507" in "Apt Number" field on add address screen
    Then User enters "76501" in "ZIP Code" field on add address screen
    Then User sees "TX" in state field on add address screen
    Then User enters "Grapevine" in "City" field on add address screen
    Then User enters "7646564657" in "Phone" field on add address screen
    Then User taps on Add New address button
   
   @ST-OMNI-26536 @TC-OMNI-33068
   Scenario: User adds an undeliverable state as an address
  	Given User launches the application
  	And User taps on Maybe later in Onboarding Screen
    And User continues as guest user
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SizeVariantProduct"
    And user click on Product
    Then User sees product image
    And User selects Home Delivery checkbox
	  And User taps on add to cart button
    And User taps on View Cart button
    Then User is navigated To Cart Screen
    Then User sees the checkout button
    When User taps on the checkout button
    Then User sees the checkout screen
    Then User enters "Test" in "First Name" field on add address screen
    Then User enters "User" in "Last Name" field on add address screen
    Then User enters "1501 Gaylord Trail" in "Address" field on add address screen
    Then User enters "2507" in "Apt Number" field on add address screen
    Then User enters "76501" in "ZIP Code" field on add address screen
    Then User sees "TX" in state field on add address screen
    Then User enters "Grapevine" in "City" field on add address screen
    Then User enters "7646564657" in "Phone" field on add address screen
    Then User taps on Add New address button
    Then User sees the error pop up