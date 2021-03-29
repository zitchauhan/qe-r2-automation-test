 Feature: Select/Edit Saved Shipping Address 
 
    
     @Sprint2 @ST-OMNI-28571 @test
    Scenario: Verify registered user is able to edit the shipping information and the edited address is getting updated
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
    Then User enters valid email "verifiedAddressList@yopmail.com"
 	And User enters valid password "Password@123"
 	And User taps on Login
 	Then User verifies guest user sign in section "is not present" on cart page
    And User sees the checkout button
    When User taps on checkout button
    Then User taps on chevron icon in shipping section
    Then User verifies existing address are "displayed" on shipping information screen
    Then User taps on edit link of "first" address
    Then User navigated to edit shipping address screen
    Then User edit the "First Name"
    Then User verifies information is updated in "first" address
    