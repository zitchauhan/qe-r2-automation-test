Feature: User is able to manage the profile
     
  @ST-OMNI-28637  @Sprint-6 @TC-OMNI-37135
	Scenario: Verify the profile screen component on for the logged-in user
		Given User launches the application
		When User Clicks On MaY Be Later
		And User continues as guest user
		Then User taps on "account" button on login screen 
		Then User taps on "gotologin" button on login screen 
		And User is on "LogIn" screen
		When User enters "email" on login screen 
		And User enters "password" on login screen 
		And User taps on "LogIn" button on login screen 
		Then User Logs into the application
		When User navigates to Profile Page
		Then User sees PersonalInformation as label
		Then User sees name button on profile screen
		Then User sees email button on profile Screen
		Then User sees Subscription section with toggle on profile screen
		
		
		
 @ST-OMNI-28637 @Sprint-6 @TC-OMNI-37136
		Scenario: Verify the name screen component in the profile section
		Given User launches the application
		When User Clicks On MaY Be Later
		And User continues as guest user
		Then User taps on "account" button on login screen 
		Then User taps on "gotologin" button on login screen 
		And User is on "LogIn" screen
		When User enters "email" on login screen 
		And User enters "password" on login screen 
		And User taps on "LogIn" button on login screen 
		Then User Logs into the application
		Then User taps on "account" button on login screen 
		When User navigates to Profile Page
		Then User sees PersonalInformation as label
		Then User sees name button on profile screen
		When User taps on name button
		Then User sees Edit name as label
		Then User Sees Firstname as input
		Then User sees Lastname as input
		Then User sees update button 
		
		
	 @ST-OMNI-28637 @Sprint-6 @TC-OMNI-37137
		Scenario: Verify that user is able to update the name from the profile section
		Given User launches the application
		When User Clicks On MaY Be Later
		And User continues as guest user
		Then User taps on "account" button on login screen 
		Then User taps on "gotologin" button on login screen 
		And User is on "LogIn" screen
		When User enters "email" on login screen 
		And User enters "password" on login screen 
		And User taps on "LogIn" button on login screen 
		Then User Logs into the application
		Then User taps on "account" button on login screen 
		When User navigates to Profile Page
		Then User sees PersonalInformation as label
		Then User sees name button on profile screen
		When User taps on name button
		Then User enter "Alexa" in Firstname input field
		Then User enter "Morgan" in lastname input field
		When User taps on update button
		Then User navigate to previous screen 
		Then user name is updated in name button 
		
		
		
		
		 @ST-OMNI-28637 @Sprint-6 @TC-OMNI-37138
		 Scenario: Verify that user is able to see the email address screen
		Given User launches the application
		When User Clicks On MaY Be Later
		And User continues as guest user
		Then User taps on "account" button on login screen 
		Then User taps on "gotologin" button on login screen 
		And User is on "LogIn" screen
		When User enters "email" on login screen 
		And User enters "password" on login screen 
		And User taps on "LogIn" button on login screen 
		Then User Logs into the application
		Then User taps on "account" button on login screen 
		When User navigates to Profile Page
		Then User sees PersonalInformation as label
		Then User sees email button on profile Screen
		When User taps on email button
		Then User sees change email as label
		Then User sees current email label with current email id
		Then User sees new email as input
		Then User sees confirm email as input
		Then User sees update button 
		
		 @ST-OMNI-28637 @Sprint-6 @TC-OMNI-37139
		 Scenario: Verify that user is able to update the email address
		Given User launches the application
		When User Clicks On MaY Be Later
		And User continues as guest user
		Then User taps on "account" button on login screen 
		Then User taps on "gotologin" button on login screen 
		And User is on "LogIn" screen
		When User enters "email" on login screen 
		And User enters "password" on login screen 
		And User taps on "LogIn" button on login screen 
		Then User Logs into the application
		Then User taps on "account" button on login screen 
		When User navigates to Profile Page
		Then User sees PersonalInformation as label
		Then User sees email button on profile Screen
		When User taps on email button
		Then User enter "test123@gmail.com" in new email input field
		Then User enter "test123@gmail.com" in confirm email input field
		When User taps on update button
		Then User navigate to previous screen 
		Then user emailid  is updated in email button 
		
		 @ST-OMNI-28637 @Sprint-6 @TC-OMNI-37140
		 Scenario: Verify that user is able to navigate back to previous screen
		Given User launches the application
		When User Clicks On MaY Be Later
		And User continues as guest user
		Then User taps on "account" button on login screen 
		Then User taps on "gotologin" button on login screen 
		And User is on "LogIn" screen
		When User enters "email" on login screen 
		And User enters "password" on login screen 
		And User taps on "LogIn" button on login screen 
		Then User Logs into the application
		Then User taps on "account" button on login screen 
		When User navigates to Profile Page
		Then User sees PersonalInformation as label
		Then User sees email button on profile Screen
		When User taps on email button
		Then User sees current email label with current email id
		Then User sees new email as input
		Then User sees confirm email as input
		When User taps on Back button
		Then User navigate to previous screen 
		
		
		 @ST-OMNI-28637 @Sprint-6 @TC-OMNI-37141
		 Scenario Outline: Verify the an error message when user enter invalid email
		 Given User launches the application
		When User Clicks On MaY Be Later
		And User continues as guest user
		Then User taps on "account" button on login screen 
		Then User taps on "gotologin" button on login screen 
		And User is on "LogIn" screen
		When User enters "email" on login screen 
		And User enters "password" on login screen 
		And User taps on "LogIn" button on login screen 
		Then User Logs into the application
		Then User taps on "account" button on login screen 
		When User navigates to Profile Page
		Then User sees PersonalInformation as label
		When User taps on email button
		Then User enter invalid email as "<inputEmail>"
		When User taps on update button
		Then User sees an error message as "<ErrorMessage>"
		
		Examples:
		|inputEmail|ErrorMessage|
		|  |Please enter an Email address|
		|abc.yahoo.com|Please enter the Email Address in a valid format|
		
		
		
		
		
		