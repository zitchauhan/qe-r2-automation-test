Feature: Save Address as Default

  @ST-OMNI-26059 @test
  Scenario:	Verify set as default checkbox is not present when registered user doesn't has any existing address and user adds a new address
 		Given User launches the application
#    Then User taps on "ALLOW LOCATION SERVICES" option
#    And User verifies location service popup is displayed
#    And User taps on "Allow while using app" option
    And User continues as guest user
	And User is on Log In screen
	Then User sees email address field
	And User sees passwordd field
    Then User enters valid email "nosavedaddress@yopmail.com"
 	And User enters valid password "Password@123"
 	And User taps on Login
 	When User taps on the address book placeholder
    Then User is taken to add address screen
    Then User taps on the address book placeholder
    Then User taps on add new address button
    Then User verifies set as default address checkbox is "not present"
    
    
    @ST-OMNI-26059
  Scenario:	Verify set as default checkbox is not selected when registered user has an existing addresses and user adds a new address
 	Given User launches the application
#    Then User taps on "ALLOW LOCATION SERVICES" option
#    And User verifies location service popup is displayed
#    And User taps on "Allow while using app" option
    And User continues as guest user
	And User is on Log In screen
	Then User sees email address field
	And User sees passwordd field
    Then User enters valid email "verifiedAddressList@yopmail.com"
 	And User enters valid password "Password@123"
 	And User taps on Login
 	When User taps on the address book placeholder
    Then User is taken to add address screen
    Then User verifies set as default address checkbox is "not selected"
    
     @ST-OMNI-26059
  Scenario:	Verify set as default checkbox is not present when registered user has only one existing address and user edits that address
 	Given User launches the application
#    Then User taps on "ALLOW LOCATION SERVICES" option
#    And User verifies location service popup is displayed
#    And User taps on "Allow while using app" option
    And User continues as guest user
	And User is on Log In screen
	Then User sees email address field
	And User sees passwordd field
    Then User enters valid email "singleAddress@yopmail.com"
 	And User enters valid password "Password@123"
 	And User taps on Login
 	When User taps on the address book placeholder
    Then User verifies existing address are "displayed" on shipping information screen
    Then User sees first address as default address 
    Then User verifies set as default address checkbox is "not present"
    
    Scenario: Verify set as default checkbox is disabled when registered user has some existing addresses and user edits the default address
 	Given User launches the application
#    Then User taps on "ALLOW LOCATION SERVICES" option
#    And User verifies location service popup is displayed
#    And User taps on "Allow while using app" option
    And User continues as guest user
	And User is on Log In screen
	Then User sees email address field
	And User sees passwordd field
    Then User enters valid email "nosavedaddress@yopmail.com"
 	And User enters valid password "Password@123"
 	And User taps on Login
 	When User taps on the address book placeholder
    Then User verifies existing address are "displayed" on shipping information screen
    Then User sees first address as default address 
    Then User verifies set as default address checkbox is "disabled"
    
     Scenario: Verify set as default checkbox is not selected when registered user has some existing addresses and user edits a non default address
 	Given User launches the application
#    Then User taps on "ALLOW LOCATION SERVICES" option
#    And User verifies location service popup is displayed
#    And User taps on "Allow while using app" option
    And User continues as guest user
	And User is on Log In screen
	Then User sees email address field
	And User sees passwordd field
    Then User enters valid email "verifiedAddressList@yopmail.com"
 	And User enters valid password "Password@123"
 	And User taps on Login
 	When User taps on the address book placeholder
    Then User verifies existing address are "displayed" on shipping information screen
    Then User sees first address as default address 
    Then User verifies set as default address checkbox is "not selected	"	