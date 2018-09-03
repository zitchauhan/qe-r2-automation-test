Feature: Verify Order API endpoint services

  @All-R2 @C1-Order @C2-Login @api @R2_AAST-01 @CR-VK @ZYP_Order_Login_12273
  Scenario: TC_1 - Verify Login Authentication Token Details
    Given "loginurl" with "LoginRequest" endpoint for login authentication
    Then Verify response status code as 200

  @All-R2 @C1-Order @C2-AddPromo @api @R2_AAST-02 @CR-VK @ZYP_Order_AddPromo_12275
  Scenario: TC_2 - Add Promo Code to an order
    Given "GetCartUrl" endpoint for getting cart
    Then "OrderUrl" endpoint with "AddPromoCodeToOrder" request and "/promocode/" extension
    And Verify response status code as 201

  @All-R2 @C1-Order @C2-GetPromo @api @R2_AAST-03 @CR-VK @ZYP_Order_GetPromo_12276
  Scenario: TC_3 - Get Promo Code of an order
    Given "GetCartUrl" endpoint for getting cart
    Then "OrderUrl" endpoint with "/promocode" for getting promocode of an order
    And Verify response status code as 200

  @All-R2 @C1-Order @C2-GetPromo @api @R2_AAST-04 @CR-VK @ZYP_Order_GetPromo_12277
  Scenario: TC_4 - Get Promo Code schema validation of an order
    Given "GetCartUrl" endpoint for getting cart
    Then "OrderUrl" endpoint with "/promocode" for getting promocode of an order
    And Verify response status code as 200

  @All-R2 @C1-Order @C2-GetPromo @api @R2_AAST-04 @CR-VK @ZYP_Order_GetPromo_12279
  Scenario: TC_4 - Get Promo Code schema validation of an order
    Given "GetCartUrl" endpoint for getting cart
    Then "OrderUrl" endpoint with "/promocode" for getting promocode of an order
    Then validate jsonSchema "GetOrderPromoCode"

  @All-R2 @C1-Order @C2-GetOrder @api @R2_AAST-04 @CR-RT @ZYP_Order_GetPromo_12587
  Scenario: TC_1 -Verify the Order details with SignIn user
    Given "OrderUrl" endpoint for order details
    And Verify response status code as 200

  @All-R2 @C1-Order @C2-GetOrder @api @R2_AAST-04 @CR-RT @ZYP_Order_GetPromo_12588
  Scenario: TC_1 -Verify the Order details with SignIn user Json Schema
    Given "OrderUrl" endpoint for order details
    Then validate jsonSchema "R2-OrderDetailsSchema"

  @All-R2 @C1-Order @C2-GetOrder @api @R2_AAST-04 @CR-RT @ZYP_Order_GetPromo_12589
  Scenario: TC_1 -Verify the Order details with SignIn user Json Response Details
    Given "OrderUrl" endpoint for order details
    Then read the API json response

  @All-R2 @C1-Order @C2-RemovePromoCode @api @R2_AAST-05 @CR-VK @ZYP_Order_RemovePromoCode_12280
  Scenario: TC_5 - Remove a PromoCode from an Order
    Given "OrderUrl" endpoint for removing "/promocode/" from an Order
    Then Verify response status code as 204
