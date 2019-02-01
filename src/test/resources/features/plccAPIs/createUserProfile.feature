Feature: Create User Profile with address information 
    
 @All-R2 @C1-MyAccount @C2-Login @api @R2_AAST-02 @CR-VK @ZYP_MyAccount_Login_12255
  Scenario: Verify user profile creation with PLCC Changes
    Given "PLCCRegistrationUrl" endpoint with "PLCCRegistrationPostRequest" for user registration with plcc changes
    Then Verify response status code as 201 for plcc
    And validate jsonSchema "createUserProfileSchema" for plcc
    Then Validated response details of "identity.userId" for plcc
    
#  @All-R2 @C1-MyAccount @C2-Login @api @R2_AAST-02 @CR-VK @ZYP_MyAccount_Login_12255
#  Scenario: Verify user profile creation with PLCC Changes
#    Given "PLCCRegistrationUrl" endpoint with "PLCCRegistrationPostRequest" for user registration with invalid data
#    Then Verify Error response status code as 400 for plcc
#    And validate jsonSchema "createUserProfileSchema" for plcc
#    Then Validated response details of "identity.userId" for plcc
	