Feature: Verify MyAccount Address API endpoint services

  @All-R2 @C1-MyAccount @C2-Address @api @R2_AAST-01 @CR-VK @ZYP_MyAccount_Address_12226
  Scenario: TC_1 - Verify Login Authentication Token Details
    Given "loginurl" with "LoginRequest" endpoint for login authentication
    Then Verify response status code as 200

  @All-R2 @C1-MyAccount @C2-Address @api @R2_AAST-02 @CR-VK @ZYP_MyAccount_Address_12227
  Scenario: TC_2 - Add Address to User Profile
    Given "Addurl" endpoint with "AddAddressRequest" request and "/address/"
    Then Verify response status code as 201

  @All-R2 @C1-MyAccount @C2-Address @api @R2_AAST-03 @CR-VK @ZYP_MyAccount_Address_12228
  Scenario: TC_3 - Retrieve the address details of a Profile
    Given "Addurl" endpoint with "/address/" for getting address of a profile
    Then Verify response status code as 200

  @All-R2 @C1-MyAccount @C2-Address @api @R2_AAST-03 @CR-VK @ZYP_MyAccount_Address_12229
  Scenario: TC_3 - Retrieve the address details of a Profile
    Given "Addurl" endpoint with "/address/" for getting address of a profile
    And validate jsonSchema "RetrieveAddressSchema"

  @All-R2 @C1-MyAccount @C2-Address @api @R2_AAST-04 @CR-VK @ZYP_MyAccount_Address_12230
  Scenario: TC_4 - Retrieve shipping address details from a Profile
    Given "Addurl" endpoint with "/shippingAddress" for getting address of a profile
    Then Verify response status code as 200

  #And validate jsonSchema "RetrieveAddressSchema"
  #Then Verify response status code as 200
  @All-R2 @C1-MyAccount @C2-Address @api @R2_AAST-05 @CR-VK @ZYP_MyAccount_Address_12231
  Scenario: TC_5 - Retrieve billing address details from a Profile
    Given "Addurl" endpoint with "/billingAddress" for getting address of a profile
    Then Verify response status code as 200

  #And validate jsonSchema "RetrieveAddressSchema"
  #Then Verify response status code as 200
  @All-R2 @C1-MyAccount @C2-Address @api @R2_AAST-06 @CR-VK @ZYP_MyAccount_Address_12232
  Scenario: TC_6 - Retrieve  address details by address Id for a Profile
    Given "Addurl" endpoint for getting "/address/" by "AddressId" for a user profile
    Then Verify response status code as 200

  @All-R2 @C1-MyAccount @C2-Address @api @R2_AAST-06 @CR-VK @ZYP_MyAccount_Address_12233
  Scenario: TC_6 - Retrieve  address details by address Id for a Profile
    Given "Addurl" endpoint for getting "/address/" by "AddressId" for a user profile
    And validate jsonSchema "RetrieveAddressByIdSchema"

  @All-R2 @C1-MyAccount @C2-Address @api @R2_AAST-07 @CR-VK @ZYP_MyAccount_Address_12234
  Scenario: TC_7 - Remove an address from a Profile
    Given "Addurl" endpoint for removing "/address/" by "AddressId"
    Then Verify response status code as 204
