Feature: To Verify API Profile Order Details

  @All-R2 @C1-MyAccount  @C2-MyAccount_ProfileOrder @ZYP-MyAccount_ProfileOrder_1235 @api  @CR-VK
  Scenario: TC_1 - Verify Login Authentication Token Details
    Given "loginurl" with "LoginRequest" endpoint for login authentication
    Then Verify response status code as 201
 
 @All-R2 @C1-MyAccount   @api  @CR-RT @C2-MyAccount_UpdateProfile @ZYP-MyAccount_UpdateProfile_12803
  Scenario: TC_2 - Verify WCS-MyAccount Edit Profile - Profile Names update
 Given "Addurl" endpoint with "PUT/" and "UpdateProfile-NamesRequest" for MyAccount Edit Profile
 Then Verify response status code as 200
 
 @All-R2 @C1-MyAccount   @api  @CR-RT @C2-MyAccount_UpdateProfile @ZYP-MyAccount_UpdateProfile_12804
  Scenario: TC_2 - Verify WCS-MyAccount Edit Profile - Profile Names update JSON Schema Validate
 Given "Addurl" endpoint with "PUT/" and "UpdateProfile-NamesRequest" for MyAccount Edit Profile
 And validate jsonSchema "UpdateProfileNamesSchema"
 
 @All-R2 @C1-MyAccount   @api  @CR-RT @C2-MyAccount_UpdateProfile @ZYP-MyAccount_UpdateProfile_12806
  Scenario: TC_2 - Verify WCS-MyAccount Edit Profile - Profile Names update JSON response validate
 Given "Addurl" endpoint with "PUT/" and "UpdateProfile-NamesRequest" for MyAccount Edit Profile
 Then Validated response details of "userId"