Feature: Create User Profile with address information 

@C-PLCC @Regression @All @API @CR-Manju
  Scenario: Verify user profile creation with PLCC Changes
    Given "PLCCRegistrationUrl" endpoint with "PLCCRegistrationPostRequest" for user registration with plcc changes
	Then Validated response details of "identity.userId" for plcc 
	
@C-PLCC @Regression @All @API @CR-Manju
  Scenario: Verify user profile creation with PLCC Changes for invalid address
    Given "PLCCInvalidRegistrationUrl" endpoint with "PLCCInvalidRegistrationPostRequest" for user registration with plcc changes for invalid address
	Then user get the response status as 401
	
@C-PLCC @Regression @All @API @CR-Manju 
Scenario: Verify for status code 400 for Bad Request for CategoryDetail for User Profile
	Given "CategoryDetailFor400" endpoint for Category 
	Then Verify Error response status code as 400 for Category 
	
	
	
	
	
	