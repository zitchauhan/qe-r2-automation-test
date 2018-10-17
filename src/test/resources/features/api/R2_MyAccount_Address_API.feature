Feature: Verify MyAccount Address API endpoint services

  @All-R2 @C1-MyAccount @C2-Address @api @R2_AAST-01 @CR-VK @ZYP_MyAccount_Address_12226
  Scenario: TC_1 - Verify Login Authentication Token Details
    Given "loginurl" with "LoginRequest" endpoint for login authentication
    Then Verify response status code as 201

  @All-R2 @C1-MyAccount @C2-Address @api @R2_AAST-01 @CR-RT @ZYP_MyAccount_Address_13054
  Scenario: TC_1 - Validate Login Authentication Token Details of JSON schema
    Given "loginurl" with "LoginRequest" endpoint for login authentication
    And validate jsonSchema "LoginSchema"

  @All-R2 @C1-MyAccount @C2-Address @api @R2_AAST-01 @CR-RT @ZYP_MyAccount_Address_13055
  Scenario: TC_1 - Verify Login Authentication Token Details of JSON Response
    Given "loginurl" with "LoginRequest" endpoint for login authentication
    Then Validated response details of "identity.userId"
    Then Validated response details of "identity.storeLocId"

  @All-R2 @C1-MyAccount @C2-Address @api @R2_AAST-02 @CR-VK @ZYP_MyAccount_Address_12227
  Scenario: TC_2 - Add Address to User Profile
    Given "Addurlr2" endpoint with "AddAddressRequest" request and "/address/"
    Then Verify response status code as 201

  @All-R2 @C1-MyAccount @C2-Address @api @R2_AAST-03 @CR-VK @ZYP_MyAccount_Address_12228
  Scenario: TC_3 - Retrieve the address details of a Profile
    Given "Addurlr2" endpoint with "/address/" for getting address of a profile
    Then Verify response status code as 200

  @All-R2 @C1-MyAccount @C2-Address @api @R2_AAST-03 @CR-VK @ZYP_MyAccount_Address_12229
  Scenario: TC_3 - Retrieve the address details of a Profile
    Given "Addurlr2" endpoint with "/address/" for getting address of a profile
    And validate jsonSchema "RetrieveAddressSchema"

  @All-R2 @C1-MyAccount @C2-Address @api @R2_AAST-04 @CR-RT @ZYP_MyAccount_Address_12230
  Scenario: TC_4 - Retrieve shipping address details from a Profile
    Given "Addurl" endpoint with "/address" for get the shipping address of a profile
    Then Verify response status code as 200

  @All-R2 @C1-MyAccount @C2-Address @api @R2_AAST-04 @CR-RT @ZYP_MyAccount_Address_14067
  Scenario: TC_4 - Retrieve shipping address details from a Profile and validate the json schema
    Given "Addurl" endpoint with "/address" for get the shipping address of a profile
    And validate jsonSchema "R2-GetShippingAddressSchema"

  @All-R2 @C1-MyAccount @C2-Address @api @R2_AAST-04 @CR-RT @ZYP_MyAccount_Address_14068
  Scenario: TC_4 - Retrieve shipping address details from a Profile and verify the JSON response details
    Given "Addurl" endpoint with "/address" for get the shipping address of a profile
    Then Validated response details of "profile.address[0].addressType"
    Then Validated response details of "profile.address[0].addressId"

#  #And validate jsonSchema "RetrieveAddressSchema"
#  #Then Verify response status code as 200
#  #@All-R2 @C1-MyAccount @C2-Address @api @R2_AAST-05 @CR-VK @ZYP_MyAccount_Address_12231
#  #Scenario: TC_5 - Retrieve billing address details from a Profile
#  #Given "Addurl" endpoint with "/billingAddress" for getting address of a profile
#  #Then Verify response status code as 200
#  #And validate jsonSchema "RetrieveAddressSchema"
#  #Then Verify response status code as 200

  @All-R2 @C1-MyAccount @C2-Address @api @R2_AAST-06 @CR-VK @ZYP_MyAccount_Address_12232
  Scenario: TC_6 - Retrieve  address details by address Id for a Profile
    Given "Addurlr2" endpoint for getting "/address/" by "AddressId" for a user profile
    Then Verify response status code as 200

  @All-R2 @C1-MyAccount @C2-Address @api @R2_AAST-06 @CR-VK @ZYP_MyAccount_Address_12233
  Scenario: TC_6 - Retrieve  address details by address Id for a Profile
    Given "Addurlr2" endpoint for getting "/address/" by "AddressId" for a user profile
    And validate jsonSchema "RetrieveAddressByIdSchema"

  @All-R2 @C1-MyAccount @C2-Address @api @R2_AAST-07 @CR-VK @ZYP_MyAccount_Address_12234
  Scenario: TC_7 - Remove an address from a Profile
    Given "Addurlr2" endpoint for removing "/address/DELETE/" by "AddressId"
    Then Verify response status code as 200

  @All-R2 @C1-MyAccount @C2-Address @api @R2_AAST-07 @CR-RT @ZYP_MyAccount_UpdateAddress_12794
  Scenario: TC_8 - Profile-Update an address of user phone number
    Given "loginurl" with "LoginRequest" endpoint for login authentication
    Given "Addurl" endpoint with "/address/" for getting address of a profile
    Given "Addurl" endpoint with "/address/PUT/" and "/?storeId=10151&makePrimary=false" for Profile address update of user
    Then Verify response status code as 200

  @All-R2 @C1-MyAccount @C2-Address @api @R2_AAST-07 @CR-RT @ZYP_MyAccount_UpdateAddress_12795
  Scenario: TC_8 - Profile-Update an address of user profile JSON schema validation
    # Given "loginurl" with "LoginRequest" endpoint for login authentication
    Given "Addurl" endpoint with "/address/" for getting address of a profile
    Given "Addurl" endpoint with "/address/PUT/" and "/?store Id=10151&makePrimary=false" for Profile address update of user
    And validate jsonSchema "UpdateAddressByIdSchema"

  @All-R2 @C1-MyAccount @C2-Address @api @R2_AAST-07 @CR-RT @ZYP_MyAccount_UpdateAddress_12796
  Scenario: TC_8 - Profile-Update an address of user profile JSON response validation
    # Given "loginurl" with "LoginRequest" endpoint for login authentication
    Given "Addurl" endpoint with "/address/" for getting address of a profile
    Given "Addurl" endpoint with "/address/PUT/" and "/?storeId=10151&makePrimary=false" for Profile address update of user
    Then Validated response details of "userId"
    Then Validated response details of "addressId"
