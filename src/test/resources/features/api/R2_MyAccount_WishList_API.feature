Feature: Verify MyAccount WishList API endpoint services

  @All-R2 @C1-MyAccount @C2-WishList @api @R2_AAST-01 @CR-VK
  Scenario: TC_1 - Verify Login Authentication Token Details
    Given "loginurl" with "LoginRequest" endpoint for login authentication
    Then Verify response status code as 200

  @All-R2 @C1-MyAccount @C2-WishList @api @R2_AAST-02 @CR-VK
  Scenario: TC_2 - Create a wishlist for a profile
    Given "Addurl" endpoint with "CreateWishListRequest" request and "/wishlist"
    And Verify response status code as 201

  @All-R2 @C1-MyAccount @C2-WishList @api @R2_AAST-03 @CR-VK
  Scenario: TC_3 - Retrieve the wishlist details  of a Profile
    Given "Addurl" endpoint with "/wishlist/" for getting Wishlist of a profile
    Then Verify response status code as 200
    And validate jsonSchema "GetWishListSchema"
    Then Verify response status code as 200

  @All-R2 @C1-MyAccount @C2-WishList @api @R2_AAST-04 @CR-VK
  Scenario: TC_4 - Retrieve the wishlist details by wishlist Id of a Profile
    Given "Addurl" endpoint for getting "/wishlist/" by "WishListId"
    Then Verify response status code as 200
    And validate jsonSchema "GetWishListByIdSchema"
    Then Verify response status code as 200

  @All-R2 @C1-MyAccount @C2-WishList @api @R2_AAST-05 @CR-VK
  Scenario: TC_5 - Remove wishlist details of a Profile
    Given "Addurl" endpoint for removing "/wishlist/" by "WishListId"
    Then Verify response status code as 200
