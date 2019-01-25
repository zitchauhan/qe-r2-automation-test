 Feature: Registration
@Regression @Sanity @All @api @KER-1603 @ZYP-3053 @C-CLP
  Scenario: Verify for status code 400 for Bad Request
    Given "CategoryDetailFor400" endpoint for Category
    Then Verify Error response status code as 400 for Category
    
    
    
@All-R2 @C1-MyAccount @C2-Login @api @R2_AAST-02 @CR-VK @ZYP_MyAccount_Login_12255
  Scenario: Verify user profile creation with PLCC Changes
    Given "PLCCRegistrationUrl" endpoint with "PLCCRegistrationPostRequest" for user registration with invalid data
    Then Verify Error response status code as 400 for plcc

