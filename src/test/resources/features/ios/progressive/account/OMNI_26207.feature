Feature: Save Academy Credit Card or Credit Card as Default

	@Sprint5 @ST-OMNI-26207 @TC-OMNI-35741
  Scenario: Set as default checkbox not visble to user without CC & ACC card
    Given User launches the application
    And User continues as guest user
		And User is on Log In screen
		Then User sees email address field
		And User sees passwordd field
    Then User enters valid email "nocreditcards@yopmail.com"
 		And User enters valid password "Testing@123"
 		And User taps on Login
 		When User taps on account in bottom nav
    Then User sees the account page
    Then user taps on "payment button" on my account page 
		And user see "payment header" on my account payment page
		When user clicks on "Add new Academy card tile" on my account payment page
		Then Set as default checkbox is not visible to the user
		
	@Sprint5 @ST-OMNI-26207 @TC-OMNI-35742
  Scenario: Set as default is unchecked when user has prior saved cards
    Given User launches the application
    And User continues as guest user
		And User is on Log In screen
		Then User sees email address field
		And User sees passwordd field
    Then User enters valid email "priorsavaedcreditcards@yopmail.com"
 		And User enters valid password "Testing@123"
 		And User taps on Login
 		When User taps on account in bottom nav
    Then User sees the account page
    Then user taps on "payment button" on my account page 
		And user see "payment header" on my account payment page
		When user clicks on "Add new Academy card tile" on my account payment page
		Then Set as default checkbox is visible to the user
		And Default checkbox is unchecked
	
	@Sprint5 @ST-OMNI-26207 @TC-OMNI-35743
  Scenario: Set as default checkbox not visble to user when is is editing a single saved card
    Given User launches the application
    And User continues as guest user
		And User is on Log In screen
		Then User sees email address field
		And User sees passwordd field
    Then User enters valid email "onesavaedcreditcards@yopmail.com"
 		And User enters valid password "Testing@123"
 		And User taps on Login
 		When User taps on account in bottom nav
    Then User sees the account page
    Then user taps on "payment button" on my account page 
		And user see "payment header" on my account payment page
		When user clicks on "4444" on my account payment page
		Then Set as default checkbox is not visible to the user
	
	@Sprint5 @ST-OMNI-26207 @TC-OMNI-35744
  Scenario: Set as default checkbox is disabled to user when is is editing a default saved card
    Given User launches the application
    And User continues as guest user
		And User is on Log In screen
		Then User sees email address field
		And User sees passwordd field
    Then User enters valid email "priorsavaedcreditcards@yopmail.com"
 		And User enters valid password "Testing@123"
 		And User taps on Login
 		When User taps on account in bottom nav
    Then User sees the account page
    Then user taps on "payment button" on my account page 
		And user see "payment header" on my account payment page
		When user clicks on "4444" on my account payment page
		Then Set as default checkbox is disabled for the user	
	
	@Sprint5 @ST-OMNI-26207 @TC-OMNI-35745
	Scenario: Set as default checkbox is unchecked for user when is is editing a non-default saved card
    Given User launches the application
    And User continues as guest user
		And User is on Log In screen
		Then User sees email address field
		And User sees passwordd field
    Then User enters valid email "priorsavaedcreditcards@yopmail.com"
 		And User enters valid password "Testing@123"
 		And User taps on Login
 		When User taps on account in bottom nav
    Then User sees the account page
    Then user taps on "payment button" on my account page 
		And user see "payment header" on my account payment page
		When user clicks on "4444" on my account payment page
		Then Set as default checkbox is visible to the user
		And Default checkbox is unchecked