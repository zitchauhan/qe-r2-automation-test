Feature: Verify MyAccount Credit Card API endpoint services

  @All-R2 @C1-MyAccount @C2-CreditCard @api @R2_AAST-01 @CR-VK
  Scenario: TC_1 - Verify Login Authentication Token Details
    Given "loginurl" with "LoginRequest" endpoint for login authentication
    Then Verify response status code as 200

  @All-R2 @C1-MyAccount @C2-CreditCard @api @R2_AAST-02 @CR-VK
  Scenario: TC_2 - Add Gift Card to User Profile
    Given "Addurl" endpoint with "AddCreditCardRequest" request and "/creditCard/"
    And Verify response status code as 201

  @All-R2 @C1-MyAccount @C2-CreditCard @api @R2_AAST-03 @CR-VK
  Scenario: TC_3 - Retrieve the Credit Card details of a Profile
    Given "Addurl" endpoint with "/creditCards/" for getting credit card details of a profile
    Then Verify response status code as 200
    And validate jsonSchema "RetrieveCreditCardDtlsSchema"
    Then Verify response status code as 200

  @All-R2 @C1-MyAccount @C2-CreditCard @api @R2_AAST-04 @CR-VK
  Scenario: TC_4 - Retrieve the Credit Card details By Id of a Profile
    Given "Addurl" endpoint for getting "/creditCards/" by "WalletId"
    Then Verify response status code as 200
    And validate jsonSchema "RetrieveCreditCardDtlsByIdSchema"
    Then Verify response status code as 200

  @All-R2 @C1-MyAccount @C2-CreditCard @api @R2_AAST-05 @CR-VK
  Scenario: TC_5 - Remove Credit Card detail from a Profile
    Given "Addurl" endpoint with "/creditCards/" for getting credit card details of a profile
    Then "Addurl" endpoint for removing "/creditCards/" by "WalletId"
    And Verify response status code as 200
