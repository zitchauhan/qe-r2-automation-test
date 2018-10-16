Feature: Verify MyAccount WishList API endpoint services

  @All-R2 @C1-MyAccount @C2-WishList @api @R2_AAST-01 @CR-VK @ZYP_MyAccount_WishList_12263
  Scenario: TC_1 - Verify Login Authentication Token Details
    Given "loginurl" with "LoginRequest" endpoint for login authentication
    Then Verify response status code as 201

  @All-R2 @C1-MyAccount @C2-WishList @api @R2_AAST-02 @CR-VK @ZYP_MyAccount_WishList_12264
  Scenario: TC_2 - Create a wishlist for a profile
    Given "Addurlr2" endpoint with "CreateWishListRequest" request and "/wishlist"
    And Verify response status code as 201

  @All-R2 @C1-MyAccount @C2-WishList @api @R2_AAST-03 @CR-VK @ZYP_MyAccount_WishList_12265
  Scenario: TC_3 - Retrieve the wishlist details  of a Profile
    Given "Addurlr2" endpoint with "/wishlist/" for getting Wishlist of a profile
    Then Verify response status code as 200

  @All-R2 @C1-MyAccount @C2-WishList @api @R2_AAST-03 @CR-VK @ZYP_MyAccount_WishList_12266
  Scenario: TC_3 - Retrieve the wishlist details  of a Profile
    Given "Addurlr2" endpoint with "/wishlist/" for getting Wishlist of a profile
    And validate jsonSchema "GetWishListSchema"

  @All-R2 @C1-MyAccount @C2-WishList @api @R2_AAST-04 @CR-VK @ZYP_MyAccount_WishList_12268
  Scenario: TC_4 - Retrieve the wishlist details by wishlist Id of a Profile
    Given "Addurlr2" endpoint for getting "/wishlist/" by "WishListId"
    Then Verify response status code as 200

  @All-R2 @C1-MyAccount @C2-WishList @api @R2_AAST-04 @CR-VK @ZYP_MyAccount_WishList_12269
  Scenario: TC_4 - Retrieve the wishlist details by wishlist Id of a Profile
    Given "Addurlr2" endpoint for getting "/wishlist/" by "WishListId"
    And validate jsonSchema "GetWishListByIdSchema"

  @All-R2 @C1-MyAccount @C2-WishList @api @R2_AAST-05 @CR-VK @ZYP_MyAccount_WishList_12270
  Scenario: TC_5 - Remove wishlist details of a Profile
    Given "Addurl" and "APIR2Extension" endpoint for Wishlist removing "/wishlist/DELETE/" by "WishListId"
    Then Verify response status code as 200
