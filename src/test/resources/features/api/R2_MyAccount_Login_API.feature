Feature: Verify MyAccount Login API endpoint service

  @All-R2 @C1-MyAccount @C2-Login @api @R2_AAST-01 @CR-VK @ZYP_MyAccount_Login_12253
  Scenario: TC_1 - Verify Guest Authentication Token Details
    Given "Guestloginurl" endpoint for guest identity
    Then Verify response status code as 200

  @All-R2 @C1-MyAccount @C2-Login @api @R2_AAST-02 @CR-VK @ZYP_MyAccount_Login_12255
  Scenario: TC_2 - Verify User Profile Registration
    Given "RegistrationUrl" endpoint with "RegistrationPostRequest" for user registration
    Then Verify response status code as 201

  @All-R2 @C1-MyAccount @C2-Login @api @R2_AAST-02 @CR-VK @ZYP_MyAccount_Login_12256
  Scenario: TC_2 - Verify User Profile Registration
    Given "RegistrationUrl" endpoint with "RegistrationPostRequest" for user registration
    And validate jsonSchema "RegistrationSchema"

  @All-R2 @C1-MyAccount @C2-Login @api @R2_AAST-03 @CR-VK @ZYP_MyAccount_Login_12257
  Scenario: TC_3 - Verify Login Authentication Token Details
    Given "loginurl" with "LoginRequest" endpoint for login authentication
    Then Verify response status code as 200

  @All-R2 @C1-MyAccount @C2-Login @api @R2_AAST-04 @CR-VK  @ZYP_MyAccount_Login_12259
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
    Then Verify response status code as 204
