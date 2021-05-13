Feature: My Account - Save Address as Default

  @Sprint3 @Regression_1
  Scenario:	Verify set as default checkbox is not present when registered user doesn't has any existing address and user adds a new address
    Given User launches the application 
    And User continues as "guest user" on onboarding page
    When User Clicks On MaY Be Later
    When User Clicks On MaY Be Later
    Then User sees the homepage
	And User is on Log In screen
	Then User sees email address field
	And User sees passwordd field
    Then User enters valid email "nosavedaddress@yopmail.com"
 	And User enters valid password "Password@123"
 	And User taps on Login
 	When User taps on the address book placeholder
    Then User is taken to add address screen
    Then User taps on add new address button
    Then User verifies set as default address checkbox is "not present"
    
    
    @Sprint3 @Regression
  Scenario:	Verify set as default checkbox is not selected when registered user has an existing addresses and user adds a new address
     Given User launches the application 
    And User continues as "guest user" on onboarding page
    When User Clicks On MaY Be Later
    When User Clicks On MaY Be Later
    Then User sees the homepage
	Then User sees email address field
	And User sees passwordd field
    Then User enters valid email "verifiedAddressList@yopmail.com"
 	And User enters valid password "Password@123"
 	And User taps on Login
 	When User taps on the address book placeholder
    Then User is taken to add address screen
    Then User taps on add new address button
    Then User verifies set as default address checkbox is "not selected"
    
    @Sprint3 @Regression
  Scenario:	Verify set as default checkbox is not present when registered user has only one existing address and user edits that address
    Given User launches the application 
    And User continues as "guest user" on onboarding page
    When User Clicks On MaY Be Later
    When User Clicks On MaY Be Later
    Then User sees the homepage
	And User is on Log In screen
	Then User sees email address field
	And User sees passwordd field
    Then User enters valid email "singleAddress@yopmail.com"
 	And User enters valid password "Password@123"
 	And User taps on Login
 	When User taps on the address book placeholder
    When User selects "default" address to edit
 #   Then User sees the edit address screen
    Then User verifies set as default address checkbox is "not present"
    
    @Sprint3 @Regression
    Scenario: Verify set as default checkbox is disabled when registered user has some existing addresses and user edits the default address
    Given User launches the application 
    And User continues as "guest user" on onboarding page
    When User Clicks On MaY Be Later
    When User Clicks On MaY Be Later
    Then User sees the homepage
	And User is on Log In screen
	Then User sees email address field
	And User sees passwordd field
    Then User enters valid email "verifiedAddressList@yopmail.com"
 	And User enters valid password "Password@123"
 	And User taps on Login
 	When User taps on the address book placeholder
  #  When User selects "default" address to edit
 #   Then User sees the edit address screen
    Then User verifies set as default address checkbox is "selected and disabled"
    
     @Sprint3 @Regression
     Scenario: Verify set as default checkbox is not selected when registered user has some existing addresses and user edits a non default address
    Given User launches the application 
    And User continues as "guest user" on onboarding page
    When User Clicks On MaY Be Later
    When User Clicks On MaY Be Later
    Then User sees the homepage
	And User is on Log In screen
	Then User sees email address field
	And User sees passwordd field
    Then User enters valid email "verifiedAddressList@yopmail.com"
 	And User enters valid password "Password@123"
 	And User taps on Login
 	When User taps on the address book placeholder
    #  When User selects "second" address to edit
 #   Then User sees the edit address screen
    Then User verifies set as default address checkbox is "not selected"