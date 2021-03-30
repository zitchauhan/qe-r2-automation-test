 Feature: Select/Edit Saved Shipping Address 
 
    
     @Sprint2 @ST-OMNI-28571
    Scenario: Verify registered user is able to edit the shipping information and the edited address is getting updated
    Given User launches the application
    And User continues as guest user
    #Then User taps on account in bottom nav
	And User is on Log In screen
	Then User sees email address field
	And User sees passwordd field
    Then User enters valid email "verifiedAddressList@yopmail.com"
 	And User enters valid password "Password@123"
 	And User taps on Login
 	And User taps on cart in bottom nav
 	Then User verifies guest user sign in section "is not present" on cart page
    And User sees the checkout button
    When User taps on checkout button
    #Then User taps on chevron icon in shipping section
    Then User verifies existing address are "displayed" on shipping information screen
    Then User taps on edit link of "first" address
    Then User navigated to edit shipping address screen
    Then User edit the "First Name"
    Then User verifies information is updated in "first" address
    