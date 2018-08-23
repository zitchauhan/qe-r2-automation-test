Feature: Verify Order API endpoint services

  @All-R2 @C1-Order @C2-Login @api @R2_AAST-01 @CR-VK
  Scenario: TC_1 - Verify Login Authentication Token Details
    Given "loginurl" with "LoginRequest" endpoint for login authentication
    Then Verify response status code as 200

  @All-R2 @C1-Order @C2-AddPromo @api @R2_AAST-02 @CR-VK
  Scenario: TC_2 - Add Promo Code to an order
    Given "GetCartUrl" endpoint for getting cart
    Then "OrderUrl" endpoint with "AddPromoCodeToOrder" request and "/promocode/" extension
    And Verify response status code as 201

  @All-R2 @C1-Order @C2-GetPromo @api @R2_AAST-03 @CR-VK
  Scenario: TC_3 - Get Promo Code of an order
    Given "GetCartUrl" endpoint for getting cart
    Then "OrderUrl" endpoint with "/promocode" for getting promocode of an order
    And Verify response status code as 200

  @All-R2 @C1-Order @C2-GetPromo @api @R2_AAST-04 @CR-VK
  Scenario: TC_4 - Get Promo Code schema validation of an order
    Given "GetCartUrl" endpoint for getting cart
    Then "OrderUrl" endpoint with "/promocode" for getting promocode of an order
    And Verify response status code as 200
    Then validate jsonSchema "GetOrderPromoCode"
    And Verify response status code as 200

  @All-R2 @C1-Order @C2-RemovePromoCode @api @R2_AAST-05 @CR-VK
  Scenario: TC_5 - Remove a PromoCode from an Order
    Given "OrderUrl" endpoint for removing "/promocode/" from an Order
    Then Verify response status code as 204
