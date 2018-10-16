Feature: Verify MyAccount Credit Card API endpoint services

  @All-R2 @C1-MyAccount @C2-CreditCard @api @R2_AAST-01 @CR-VK  @ZYP_MyAccount_CreditCard_12235
  Scenario: TC_1 - Verify Login Authentication Token Details
    Given "loginurl" with "LoginRequest" endpoint for login authentication
    Then Verify response status code as 201

  @All-R2 @C1-MyAccount @C2-CreditCard @api @R2_AAST-02 @CR-VK @ZYP_MyAccount_CreditCard_12236
  Scenario: TC_2 - Add Gift Card to User Profile
    Given "Addurlr2" endpoint with "AddCreditCardRequest" request and "/creditCard/"
    And Verify response status code as 201

  @All-R2 @C1-MyAccount @C2-CreditCard @api @R2_AAST-03 @CR-VK @ZYP_MyAccount_CreditCard_12237
  Scenario: TC_3 - Retrieve the Credit Card details of a Profile
    Given "Addurlr2" endpoint with "/creditCards/" for getting credit card details of a profile
    Then Verify response status code as 200
   
  @All-R2 @C1-MyAccount @C2-CreditCard @api @R2_AAST-03 @CR-VK  @ZYP_MyAccount_CreditCard_12238
  Scenario: TC_3 - Retrieve the Credit Card details of a Profile
    Given "Addurlr2" endpoint with "/creditCards/" for getting credit card details of a profile
    And validate jsonSchema "RetrieveCreditCardDtlsSchema"
    
  @All-R2 @C1-MyAccount @C2-CreditCard @api @R2_AAST-04 @CR-VK @ZYP_MyAccount_CreditCard_12239
  Scenario: TC_4 - Retrieve the Credit Card details By Id of a Profile
    Given "Addurlr2" endpoint for getting "/creditCards/" by "WalletId"
    Then Verify response status code as 200
    
  @All-R2 @C1-MyAccount @C2-CreditCard @api @R2_AAST-04 @CR-VK @ZYP_MyAccount_CreditCard_12240
  Scenario: TC_4 - Retrieve the Credit Card details By Id of a Profile
    Given "Addurlr2" endpoint for getting "/creditCards/" by "WalletId"
    And validate jsonSchema "RetrieveCreditCardDtlsByIdSchema"
  
  @All-R2 @C1-MyAccount @C2-CreditCard @api @R2_AAST-05 @CR-VK @ZYP_MyAccount_CreditCard_12241
  Scenario: TC_5 - Remove Credit Card detail from a Profile
    Given "Addurlr2" endpoint with "/creditCards/" for getting credit card details of a profile
    Then "Addurlr2" endpoint for removing "/creditCards/DELETE/" by "WalletId"
    And Verify response status code as 204
