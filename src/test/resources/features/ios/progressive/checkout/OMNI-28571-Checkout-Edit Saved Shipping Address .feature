 Feature: Select/Edit Saved Shipping Address 
 
    
     @Sprint2 @ST-OMNI-28571 @TC-31612
    Scenario: Verify registered user is able to edit the shipping information and the edited address is getting updated
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
    Then User sees shipping Address title
    Then User taps on chevron icon in shipping section
    Then User verifies existing address are "displayed" on shipping information screen
    Then User sees first address as default address
    Then User taps on edit link of "first" address
    Then User navigated to edit shipping address screen
    Then User edit the "First Name"
    Then User verifies "First name" is updated in "first" address
    