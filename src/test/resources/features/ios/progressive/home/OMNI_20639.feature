Feature: Sign In

	@Sprint1 @ST-OMNI-20639 @TC-OMNI-30524
	Scenario: User sees fields for logging in the application
	  Given User launches the application
	  And User continues as guest user
	  And User is on Log In screen
	  Then User sees email address field
	  And User sees passwordd field
	  And User sees login button
	  And User sees Create Account button
	  And User sees forgot password link

	@Sprint1 @ST-OMNI-20639 @TC-OMNI-30525
	Scenario: User sees soft keyboard while interacting with the fields
	  Given User launches the application
	  And User continues as guest user
	  And User is on Log In screen
	  When User taps on email address field
	  Then User sees the soft keyboard on the screen

	@Sprint1 @ST-OMNI-20639 @TC-OMNI-30526
	Scenario: User sees various field level features on Log In screen
	  Given User launches the application
	  And User continues as guest user
	  And User is on Log In screen
	  When User enters incorrect email ".testuser1@yopmail.com"
	  Then User sees the error message "Please enter the Email Address in a valid format (ex. abc@xyz.com)"
	  When User enters password
	  Then password field is masked
	  When User taps Show button
	  Then User sees the password
	  And User sees Hide button
	  When User taps Hide button
	  Then password field is masked
	  And User sees the Show button

	@Sprint1 @ST-OMNI-20639 @TC-OMNI-30527
	Scenario Outline: Users sees field level errors for incorrect values on email address field
	  Given User launches the application
	  And User continues as guest user
	  And User is on Log In screen
	  When User enters incorrect email "<incorrect_email>"
	  Then User sees the error message "Please enter the Email Address in a valid format (ex. abc@xyz.com)"
  
	  Examples:
	  	| incorrect_email |
	  	| incorrect@			|
	  	| @yopmail.com    |
	  	| testuser1       |
	  	| testuser1@yopmailcom |
	  	| testuser1@yopmail    |
	  	| testuser1@yopmail123.com |
	  	| testuser1@yo$mail.com    |
	  	| -testuser1@yopmail.com   |
	  	| testuser1.@yopmail.com   |
	  	| test$ser1@yopmail.com    |
	  	| testuser1@yopmail.i			 |

	@Sprint1 @ST-OMNI-20639 @TC-OMNI-30528
	Scenario: User sees error due to non existing email
	  Given User launches the application
	  And User continues as guest user
	  And User is on Log In screen
	  When User enters incorrect email "nonexistingemail@yopmail.com"
	  And User enters password
	  And User taps on LogIn button
	  Then User sees the password error message "The combination of Email Address and Password is incorrect. Please try again."

	@Sprint1 @ST-OMNI-20639 @TC-OMNI-30529
	Scenario: User sees error due to wrong password
	  Given User launches the application
	  And User continues as guest user
	  And User is on Log In screen
	  When User enters incorrect email "testuser1@yopmail.com"
	  And User enters incorrect password "notapassword"
	  And User taps on LogIn button
	  Then User sees the password error message "The combination of Email Address and Password is incorrect. Please try again."

	@Sprint1 @ST-OMNI-20639 @TC-OMNI-30530
	Scenario: User successfully logs into the application
		Given User launches the application
		And User continues as guest user
		And User is on Log In screen
		When User enters email address
		And User enters password
		And User taps on LogIn button
		Then User Logs into the application
  
  
  