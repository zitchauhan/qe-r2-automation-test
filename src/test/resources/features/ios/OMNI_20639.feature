@TC-OMNI-20639
Feature: Verify fields and their related features on Sign In screen

  Scenario: User sees fields for logging in the application
	  Given User launches the application
	  And User is on Log In screen
	  Then User sees email address field
	  And User sees passwordd field
	  And User sees login button
	  And User sees Create Account button
	  And User sees forgot password link
  
  Scenario: User sees soft keyboard while interacting with the fields
	  Given User launches the application
	  And User is on Log In screen
	  When User taps on email address field
	  Then User sees the soft keyboard on the screen
  
  
  Scenario: User sees various field level features on Log In screen
	  Given User launches the application
	  And User is on Log In screen
	  When User enters incorrect email ".testuser1@yopmail.com"
	  Then User sees the error message "Invalid email entry. Your username must begin and end with a letter or a number"
	  When User enters password
	  Then password field is masked
	  When User taps Show button
	  Then User sees the password
	  And User sees Hide button
	  When User taps Hide button
	  Then password field is masked
	  And User sees the Show button
  
  Scenario Outline: Users sees field level errors for incorrect values on email address field
	  Given User launches the application
	  And User is on Log In screen
	  When User enters incorrect email "<incorrect_email>"
	  Then User sees the error message "<error_message>"
  
	  Examples:
	  	| incorrect_email | error_message |
	  	| incorrect@			| Invalid email entry. Please follow the proper email formatting	|
	  	| @yopmail.com    | Invalid email entry. Your email address must include a username |
	  	| testuser1       | Invalid email entry. Your email address must include an @ symbol |
	  	| testuser1@yopmailcom | Invalid email entry. You must include a period after the domain name |
	  	| testuser1@yopmail    | Invalid email entry. You must include a domain extension after the period |
	  	| testuser1@yopmail123.com | Invalid email entry. Numbers are not allowed in the domain section |
	  	| testuser1@yo$mail.com    | Invalid email entry. Special characters are not allowed in the domain section |
	  	| -testuser1@yopmail.com   | Invalid email entry. Your username must begin and end with a letter or a number |
	  	| testuser1.@yopmail.com   | Invalid email entry. Your username must begin and end with a letter or a number |
	  	| test$ser1@yopmail.com    | $ are not allowed in the username |
	  	| testuser1@yopmail.i			 | Invalid email entry. You must have a minimum of 2 alpha characters in your domain extension|
	  	
  
  Scenario: User sees error due to non existing email
	  Given User launches the application
	  And User is on Log In sreen
	  When User enters incorrect email "nonexistingemail@yopmail.com"
	  And User enters password
	  And User taps on LogIn button
	  Then User sees the error message "The combination of Email Address and Password is incorrect. Please try again."
  
  Scenario: User sees error due to wrong password
	  Given User launches the application
	  And User is on Log In sreen
	  When User enters incorrect email "testuser1@yopmail.com"
	  And User enters incorrect password "notapassword"
	  And User taps on LogIn button
	  Then User sees the error message "The combination of Email Address and Password is incorrect. Please try again."
	  

	Scenario: User sucessfully logs into the application
		Given User launches the application
	  And User is on Log In sreen	
	  When User enters email address
	  And User enters password
	  And User taps on LogIn button
	  Then User Logs into the application
  
  
  