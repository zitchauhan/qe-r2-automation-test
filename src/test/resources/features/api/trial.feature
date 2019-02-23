Feature: Verify MyAccount Address API endpoint services

#  @All-R2 @C1-MyAccount @C2-Address @api @R2_AAST-03 @CR-VK @ZYP_MyAccount_Address_12228
#  Scenario: TC_3 - Retrieve the address details of a Profile
#    Given "Addurlr2" endpoint with "/address/" for getting address of a profile
#    Then Verify response status code as 200
    
    @All-R2 @C1-MyAccount @C2-Address @api @R2_AAST-02 @CR-VK @ZYP_MyAccount_Address_12227
  Scenario: TC_2 - Add Address to User Profile
    Given "Addurlr2" endpoint with "AddAddressRequest" request and "/address/"
    Then Verify response status code as 201

  