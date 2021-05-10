Feature:  credit card eroror senarios 
     
  @Sprint6 @ST-OMNI-29812 @TC-OMNI-37610
	Scenario: Validate that invalid CVV error shown on add new card page 
		Given User launches the application
		And User continues as "guest user" on onboarding page
		When User Clicks On MaY Be Later
		When User Clicks On MaY Be Later
		Then User taps on "account" button on login screen 
		Then User taps on "gotologin" button on login screen 
		When User enters "emailwithnocard" on login screen 
		And User enters "password" on login screen 
		Then User taps on "account" button on login screen 
		When user see "welcome section" on my account page  
		Then user taps on "payment button" on my account page 
		And user see "payment header" on my account payment page
		When user clicks on "Add new credit card tile" on my account payment page
			Then i choose to enter "validcardholdername" on credit card page 
			Then i choose to enter "validamexcard" on credit card page 
			Then i choose to enter "invalidamexcvv" on credit card page 
			Then i choose to enter "validexpiry" on credit card page 
		Then i choose to enter "ccfirstname" on credit card page 
		Then i choose to enter "ccLastname" on credit card page 
		Then i choose to enter "ccAddress" on credit card page
		Then i choose to enter "ccaprtname" on credit card page
		Then i choose to enter "cczipcode" on credit card page
		Then i choose to enter "entercccity" on credit card page
		Then i choose to enter "ccmobilenumber" on credit card page
		Then i choose to verify error "invalidcvv" on credit card page
		#Then i choose to verify error "Invalidccerror" on credit card page
		#Then i choose to verify error "Invalidexpiryerror" on credit card page
		
		
		
		
		@Sprint6 @ST-OMNI-29812 @TC-OMNI-37611
	Scenario: Validate that invalid card error shown on add new card page 
		Given User launches the application
		And User continues as "guest user" on onboarding page
		When User Clicks On MaY Be Later
		When User Clicks On MaY Be Later
		Then User taps on "account" button on login screen 
		Then User taps on "gotologin" button on login screen 
		When User enters "emailwithnocard" on login screen 
		And User enters "password" on login screen 
		Then User taps on "account" button on login screen 
		When user see "welcome section" on my account page  
		Then user taps on "payment button" on my account page 
		And user see "payment header" on my account payment page
		When user clicks on "Add new credit card tile" on my account payment page
			Then i choose to enter "validcardholdername" on credit card page 
			Then i choose to enter "invalidamexcard" on credit card page 
			Then i choose to enter "validamexcvv" on credit card page 
			Then i choose to enter "validexpiry" on credit card page 
		Then i choose to enter "ccfirstname" on credit card page 
		Then i choose to enter "ccLastname" on credit card page 
		Then i choose to enter "ccAddress" on credit card page
		Then i choose to enter "ccaprtname" on credit card page
		Then i choose to enter "cczipcode" on credit card page
		Then i choose to enter "entercccity" on credit card page
		Then i choose to enter "ccmobilenumber" on credit card page
		Then i choose to verify error "Invalidccerror" on credit card page
		
		
		
		
		@Sprint4 @ST-OMNI-29812 @TC-OMNI-37612
	Scenario: Validate that invalid expiry error shown on add new card page 
		Given User launches the application
		And User continues as "guest user" on onboarding page
		When User Clicks On MaY Be Later
		When User Clicks On MaY Be Later
		Then User taps on "account" button on login screen 
		Then User taps on "gotologin" button on login screen 
		When User enters "emailwithnocard" on login screen 
		And User enters "password" on login screen 
		Then User taps on "account" button on login screen 
		When user see "welcome section" on my account page  
		Then user taps on "payment button" on my account page 
		And user see "payment header" on my account payment page
		When user clicks on "Add new credit card tile" on my account payment page
			Then i choose to enter "validcardholdername" on credit card page 
			Then i choose to enter "validamexcard" on credit card page 
			Then i choose to enter "validamexcvv" on credit card page 
			Then i choose to enter "invalidexpiry" on credit card page 
		Then i choose to enter "ccfirstname" on credit card page 
		Then i choose to enter "ccLastname" on credit card page 
		Then i choose to enter "ccAddress" on credit card page
		Then i choose to enter "ccaprtname" on credit card page
		Then i choose to enter "cczipcode" on credit card page
		Then i choose to enter "entercccity" on credit card page
		Then i choose to enter "ccmobilenumber" on credit card page
		Then i choose to verify error "Invalidexpiryerror" on credit card page
