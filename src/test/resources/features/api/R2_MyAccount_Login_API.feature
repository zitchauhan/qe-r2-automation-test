Feature: Verify MyAccount Login API endpoint service

  @All-R2 @C1-MyAccount @C2-Login @api @R2_AAST-01 @CR-RT @ZYP_MyAccount_Login_12253
  Scenario: TC_1 - Verify Guest Authentication Token Details
    Given "Guestloginurl" endpoint for guest identity
    Then Verify response status code as 201

  @All-R2 @C1-MyAccount @C2-Login @api @R2_AAST-02 @CR-RT @ZYP_MyAccount_Login_12256
  Scenario: TC_1 - Validate Guest Authentication Token Details JSON Schema
    Given "Guestloginurl" endpoint for guest identity
    And validate jsonSchema "RegistrationSchema"

  @All-R2 @C1-MyAccount @C2-Login @api @R2_AAST-02 @CR-RT @ZYP_MyAccount_Login_13053
  Scenario: TC_1 - Verify Guest Authentication Token Details JSON response details
    Given "Guestloginurl" endpoint for guest identity
    Then Validated response details of "identity.userId"

  @All-R2 @C1-MyAccount @C2-Login @api @R2_AAST-02 @CR-VK @ZYP_MyAccount_Login_12255
  Scenario: TC_2 - Verify User Profile Registration
    Given "RegistrationUrl" endpoint with "RegistrationPostRequest" for user registration
    Then Verify response status code as 201
    And validate jsonSchema "RegistrationSchema"
    Then Validated response details of "identity.userId"
    
    @All-R2 @C1-MyAccount @C2-ChangePassword @api @R2_AAST-07 @CR-RT @ZYP_MyAccount_ChangePassword_13111
  Scenario: TC_8 - Verify -Profile Change Password status code, JSON response validation and JSON schema validation
    Given "loginurl" with "ChangePasswordLoginRequest" endpoint for Change Password login authentication
    Given "ChangePasswordUrl" with "ChangePasswordRequest-FirstTime" endpoint for change password of profile
    Then Verify response status code as 201
    And validate jsonSchema "RegistrationSchema"
    Then Validated response details of "identity.userId"

  @All-R2 @C1-MyAccount @C2-Login @api @R2_AAST-03 @CR-VK @ZYP_MyAccount_Login_12257
  Scenario: TC_3 - Verify Login Authentication Token Details
    Given "loginurl" with "LoginRequest" endpoint for login authentication
    Then Verify response status code as 201

  @All-R2 @C1-MyAccount @C2-Login @api @R2_AAST-04 @CR-VK @ZYP_MyAccount_Login_12259
  Scenario: TC_4 - Retrieve the Profile details of a Profile
    Given "Addurl" endpoint for getting profile details of a profile
    And Verify response status code as 200

  @All-R2 @C1-MyAccount @C2-Login @api @R2_AAST-04 @CR-VK @ZYP_MyAccount_Login_12261
  Scenario: TC_4 - Retrieve the Profile details of a Profile
    Given "Addurl" endpoint for getting profile details of a profile
    Then validate jsonSchema "RetrieveProfileSchema"

  @All-R2 @C1-MyAccount @C2-Login @api @R2_AAST-05 @CR-VK @ZYP_MyAccount_Login_12262
  Scenario: TC_5 - User Profile Logout
    Given "logouturl" endpoint for profile logout
    Then Verify response status code as 200
    
    @All-R2 @C1-MyAccount @C2-Login @api @R2_AAST-05 @CR-RT @ZYP_MyAccount_ResetPassword_13199
     Scenario: TC_5 - Reset the Profile Password for verify the status code, schema validation and response details
    Given "ResetPasswordUrl" with "RestPasswordRequest" endpoint for change password of profile
    Then Verify response status code as 201
    And validate jsonSchema "RegistrationSchema"
    Then Validated response details of "identity.userId"
