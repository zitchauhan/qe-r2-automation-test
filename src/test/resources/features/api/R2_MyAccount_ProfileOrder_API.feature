Feature: To Verify API Profile Order Details

  @All-R2 @C1-MyAccount  @C2-MyAccount_ProfileOrder @ZYP-MyAccount_ProfileOrder_1235 @api  @CR-VK
  Scenario: TC_1 - Verify Login Authentication Token Details
    Given "loginurl" with "LoginRequest" endpoint for login authentication
    Then Verify response status code as 200
 