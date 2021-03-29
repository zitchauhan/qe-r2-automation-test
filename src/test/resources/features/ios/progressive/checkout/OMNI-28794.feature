Feature: Checkout

  @Sprint2 @ST-OMNI-28794 @TC-OMNI-1
 Scenario: Verify the following scenarios when user is a registered user with no address in their address book
   1. User is able to see “Add New Address” button
   2. There are no existing addresses displayed on Shipping Information screen 
    
    Given User launches the application
    And User continues as guest user
	 When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword"
    And user click on Product
    And user click on Home Delivery
    When User taps on add to cart button
    And User taps on View Cart button
    Then User is navigated To Cart Screen
    Then User verifies guest user sign in section "is present" on cart page
    Then User taps on Sign in button on cart page
    Then User enters valid email "noaddress@yopmail.com"
 	And User enters valid password "Password@123"
 	And User taps on Login
 	Then User verifies guest user sign in section "is not present" on cart page
    And User sees the checkout button
    When User taps on checkout button
    Then User taps on chevron icon in shipping section
    Then User verifies existing address are "not displayed" on shipping information screen
    Then User sees "Add New Address" on shipping information screen
    
    @Sprint2 @ST-OMNI-28794 
 Scenario: Verify the following scenarios when user is a registered user with existing addresses in their address book
   1. Existing shipping addresses are displaying on Shipping Information screen
   2. First address is the default address
   3. “Add New Address” button is displaying
   
    Given User launches the application
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
    Then User taps on Sign in button on cart page
    Then User enters valid email "verifiedAddressList@yopmail.com"
 	And User enters valid password "Password@123"
 	And User taps on Login
 	Then User verifies guest user sign in section "is not present" on cart page
    And User sees the checkout button
    When User taps on checkout button
    Then User taps on chevron icon in shipping section
    Then User sees "Add New Address" on shipping information screen
    Then User verifies existing address are "displayed" on shipping information screen
    Then User sees first address as default address 
    
    @Sprint2 @ST-OMNI-28794 
 Scenario: Verify when a registered user is having an address which is not an AVS validated then a message 
     is displayed below the address on shipping information screen   
    Given User launches the application
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
    Then User taps on Sign in button on cart page
    Then User enters valid email "nonVerifiedAddress@yopmail.com"
 	And User enters valid password "Password@123"
 	And User taps on Login
 	Then User verifies guest user sign in section "is not present" on cart page
    And User sees the checkout button
    When User taps on checkout button
    Then User taps on chevron icon in shipping section
    Then User sees address not verified message on shipping information screen
     
     @Sprint2 @ST-OMNI-28794 
  Scenario: Verify guest user is able to see “Add New Address” button on checkout page 
    Given User launches the application
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
    Then User sees "Add New Address" on shipping information screen
    