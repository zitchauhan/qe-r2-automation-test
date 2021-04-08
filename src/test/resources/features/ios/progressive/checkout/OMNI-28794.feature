Feature: Checkout

  @Sprint2 @ST-OMNI-28794 @TC-OMNI-31926
 Scenario: Verify the following scenarios when user is a registered user with no address in their address book
   1. User is able to see “Add New Address” button
   2. There are no existing addresses displayed on Shipping Information screen 
    
    Given User launches the application
    Then User taps on "ALLOW LOCATION SERVICES" option
    And User verifies location service popup is displayed
    And User taps on "Allow while using app" option
    And User continues as guest user
	And User is on Log In screen
	Then User sees email address field
	And User sees passwordd field
    Then User enters valid email "nosavedaddress@yopmail.com"
 	And User enters valid password "Password@123"
 	And User taps on Login
 	And User taps on cart in bottom nav
    And User sees the checkout button
    When User taps on checkout button
    Then User taps on chevron icon in shipping section
    Then User verifies existing address are "not displayed" on shipping information screen
    Then User sees "Add New Address" on shipping information screen
    
    @Sprint2 @ST-OMNI-28794 @TC-OMNI-31927
 Scenario: Verify the following scenarios when user is a registered user with existing addresses in their address book
   1. Existing shipping addresses are displaying on Shipping Information screen
   2. First address is the default address
   3. “Add New Address” button is displaying
   
    Given User launches the application
    Then User taps on "ALLOW LOCATION SERVICES" option
    And User verifies location service popup is displayed
    And User taps on "Allow while using app" option
    And User continues as guest user
	And User is on Log In screen
	Then User sees email address field
	And User sees passwordd field
    Then User enters valid email "verifiedAddressList@yopmail.com"
 	And User enters valid password "Password@123"
 	And User taps on Login
 	And User taps on cart in bottom nav
    And User sees the checkout button
    When User taps on checkout button
    Then User taps on chevron icon in shipping section
    Then User sees "Add New Address" on shipping information screen
    Then User verifies existing address are "displayed" on shipping information screen
    Then User sees first address as default address 
    
    @Sprint2 @ST-OMNI-28794 @TC-OMNI-31928
 Scenario: Verify when a registered user is having an address which is not an AVS validated then a message 
     is displayed below the address on shipping information screen   
    Given User launches the application
    Then User taps on "ALLOW LOCATION SERVICES" option
    And User verifies location service popup is displayed
    And User taps on "Allow while using app" option
    And User continues as guest user
	And User is on Log In screen
	Then User sees email address field
	And User sees passwordd field
    Then User enters valid email "nonVerifiedAddress@yopmail.com"
 	And User enters valid password "Password@123"
 	And User taps on Login
 	And User taps on cart in bottom nav
    And User sees the checkout button
    When User taps on checkout button
    Then User taps on chevron icon in shipping section
    Then User sees address not verified message on shipping information screen
     
     @Sprint2 @ST-OMNI-28794 @TC-OMNI-31929
  Scenario: Verify guest user is able to see “Add New Address” button on checkout page 
    Given User launches the application
    Then User taps on "ALLOW LOCATION SERVICES" option
    And User verifies location service popup is displayed
    And User taps on "Allow while using app" option
    And User continues as guest user
   Then User sees the homepage
	 When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword"
    And user click on Product
    And user click on Home Delivery
    When User taps on add to cart button
    And User taps on View Cart button
    Then User is navigated To Cart Screen
    Then User verifies guest user sign in section "is present" on cart page
    And User sees the checkout button
    When User taps on checkout button
    Then User taps on chevron icon in shipping section
    
    