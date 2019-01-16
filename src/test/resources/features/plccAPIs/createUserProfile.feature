Feature: Create User Profile with address information 

@C-Smeetha @PLCC41 @P-High @All @Api @PLCC-Regression @R1_Api @C-Registration 
Scenario Outline: Verify create profile API for success status code 200 
	#Given "RegistrationPageURI" endpoint for new user registration 
	#Then Verify response status code 200 with request body "createUserProfile" 
	Given "RegistrationPageURI" and post request "createUserProfileRequest" endpoint for create user profile
    Then Verify response status code as 200 after user profile created succefully 
    
	
	
	Examples: 
		|RegistrationPageURI     | 
		| /api/identity/profile  | 