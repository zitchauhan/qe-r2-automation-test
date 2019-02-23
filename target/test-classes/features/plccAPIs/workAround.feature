Feature: API Address Validation Service of a profile

@C-PLCC @Regression @All @API @CR-Manju 
 Scenario: Verify API Address Validation Service of a profile
    Given "PLCCAddressURL" with "PLCCAddressPostRequest" endpoint for address validation of a profile
    #Then Verify response status code as 201 
       
    
	#  @All-R2 @C1-MyAccount @C2-Login @api @R2_AAST-02 @CR-VK @ZYP_MyAccount_Login_12255
	#  Scenario: Verify user profile creation with PLCC Changes
	#    Given "PLCCRegistrationUrl" endpoint with "PLCCRegistrationPostRequest" for user registration with invalid data
	#    Then Verify Error response status code as 400 for plcc
	#    And validate jsonSchema "createUserProfileSchema" for plcc
	#    Then Validated response details of "identity.userId" for plcc
	#    And validate jsonSchema "createUserProfileSchema" for plcc
	#    Then Validated response details of "identity.userId" for plcc