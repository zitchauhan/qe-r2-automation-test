Feature: Verify MyAccount Gift Card API endpoint services

  @All-R2 @C1-MyAccount @C2-GiftCard @api @R2_AAST-01 @CR-VK @ZYP_MyAccount_GiftCard_12242
  Scenario: TC_1 - Verify Login Authentication Token Details
    Given "loginurl" with "LoginRequest" endpoint for login authentication
    Then Verify response status code as 200

  @All-R2 @C1-MyAccount @C2-GiftCard @api @R2_AAST-02 @CR-VK @ZYP_MyAccount_GiftCard_12243
  Scenario: TC_2 - Add Gift Card to User Profile
    Given "Addurl" endpoint with "AddGiftCardRequest" request and "/giftCard/"
    And Verify response status code as 201

  @All-R2 @C1-MyAccount @C2-GiftCard @api @R2_AAST-03 @CR-VK @ZYP_MyAccount_GiftCard_12244
  Scenario: TC_3 - Retrieve the Gift Card details of a Profile
    Given "Addurl" endpoint with "/giftCards/" for getting gift card details of a profile
    Then Verify response status code as 200

      @All-R2 @C1-MyAccount @C2-GiftCard @api @R2_AAST-03 @CR-VK @ZYP_MyAccount_GiftCard_12245
  Scenario: TC_3 - Retrieve the Gift Card details of a Profile
    Given "Addurl" endpoint with "/giftCards/" for getting gift card details of a profile
    And validate jsonSchema "RetrieveGiftCardDtlsSchema"
  

  @All-R2 @C1-MyAccount @C2-GiftCard @api @R2_AAST-04 @CR-VK @ZYP_MyAccount_GiftCard_122456
  Scenario: TC_4 - Retrieve the Gift Card details By Id of a Profile
    Given "Addurl" endpoint for getting "/giftCards/" by "GiftWalletId"
    Then Verify response status code as 200
  
    
    @All-R2 @C1-MyAccount @C2-GiftCard @api @R2_AAST-04 @CR-VK @ZYP_MyAccount_GiftCard_12247
  Scenario: TC_4 - Retrieve the Gift Card details By Id of a Profile
    Given "Addurl" endpoint for getting "/giftCards/" by "GiftWalletId"
    And validate jsonSchema "RetrieveGiftCardDtlsByIdSchema"


  @All-R2 @C1-MyAccount @C2-GiftCard @api @R2_AAST-05 @CR-VK @ZYP_MyAccount_GiftCard_12248
  Scenario: TC_5 - Remove Gift Card detail from a Profile
    Given "Addurl" endpoint with "/giftCards/" for getting gift card details of a profile
    Then "Addurl" endpoint for removing "/giftCards/" by "GiftWalletId"
    And Verify response status code as 200
