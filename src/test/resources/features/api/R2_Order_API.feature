Feature: Verify Order API endpoint services

  @All-R2 @C1-Order @C2-Login @api @R2_AAST-01 @CR-VK @ZYP_Order_Login_12273
  Scenario: TC_1 - Verify Login Authentication Token Details
    Given "loginurl" with "LoginRequest" endpoint for login authentication
    Then Verify response status code as 201

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

  @All-R2 @C1-Order @C2-GetOrder @api @R2_AAST-04 @CR-RT @ZYP_Order_Details_12587
  Scenario: TC_1 -Verify the Order details with SignIn user
    Given "OrderUrl" endpoint for order details
    And Verify response status code as 200

  @All-R2 @C1-Order @C2-GetOrder @api @R2_AAST-04 @CR-RT @ZYP_Order_Details_12588
  Scenario: TC_1 -Verify the Order details with SignIn user Json Schema
    Given "OrderUrl" endpoint for order details
    Then validate jsonSchema "R2-OrderDetailsSchema"

  @All-R2 @C1-Order @C2-GetOrder @api @R2_AAST-04 @CR-RT @ZYP_Order_Details_12589
  Scenario: TC_1 -Verify the Order details with SignIn user Json Response Details
    Given "OrderUrl" endpoint for order details
     Then Validated response details of "orders[0].orderId"

  @All-R2 @C1-Order @C2-AddShippingAddres @api @R2_AAST-04 @CR-RT @ZYP_AddShippingAddress_13550
  Scenario: TC_7 - Add the Shipping Address and validate the Schema and response details
    Given "OrderUrl" by "/shipping" endpoint with "AddShippingAddressRequest" for Add shipping Address of Order profile
    Then Verify response status code as 201
    Then validate jsonSchema "R2-AddShippingAddressSchema"
    Then Validated response details of "addShippingAddress.orderId"
    Then Validated response details of "addShippingAddress.addressId"

  @All-R2 @C1-Order @C2-RemovePromoCode @api @R2_AAST-05 @CR-VK @ZYP_Order_RemovePromoCode_12280
  Scenario: TC_5 - Remove a PromoCode from an Order
    Given "OrderUrl" endpoint for removing "/promocode/" from an Order
    Then Verify response status code as 204

  # for delete their is no schema and if there is no schema no required field
  @All-R2 @C1-Order @C2-ProfileOrder @api @R2_AAST-06 @CR-RT @ZYP_Get_Placed_Orders_13731
  Scenario: TC_1 -Verify the profile placed orders details with SignIn user
    Given "profileorders" by "orderPagedetails" endpoint for get profile placed orders details
    And Verify response status code as 200

  @All-R2 @C1-Order @C2-ProfileOrder @api @R2_AAST-06 @CR-RT @ZYP_Get_Placed_Orders_13732
  Scenario: TC_1 -Validate the profile placed orders details Json Schema with SignIn user
    Given "profileorders" by "orderPagedetails" endpoint for get profile placed orders details
    Then validate jsonSchema "R2-PlacedOrderDetailsSchema"

  @All-R2 @C1-Order @C2-ProfileOrder @api @R2_AAST-06 @CR-RT @ZYP_Get_Placed_Orders_13733
  Scenario: TC_1 -Verify the profile placed orders JSON response details with SignIn user
    Given "profileorders" by "orderPagedetails" endpoint for get profile placed orders details
    Then Validated response details of "totalOrders"

  @All-R2 @C1-Order @C2-ProfileOrder @api @R2_AAST-06 @CR-RT @ZYP_Get_ByOrderId_13734
  Scenario: TC_1 -Verify the profile placed orders get by orderId details with SignIn user
    Given "profileorders" endpoint for get profile order by id details
    And Verify response status code as 200

  @All-R2 @C1-Order @C2-ProfileOrder @api @R2_AAST-06 @CR-RT @ZYP_Get_ByOrderId_13735
  Scenario: TC_1 -Validate the profile placed orders get by orderId details Json Schema with SignIn user
    Given "profileorders" endpoint for get profile order by id details
    Then validate jsonSchema "R2-PlacedOrderDetailsSchema"

  @All-R2 @C1-Order @C2-ProfileOrder @api @R2_AAST-06 @CR-RT @ZYP_Get_ByOrderId_13736
  Scenario: TC_1 -Verify the profile placed orders get by orderId Json Response details with SignIn user
    Given "profileorders" endpoint for get profile order by id details
    Then Validated response details of "orders[0].orderNumber"

  @All-R2 @C1-Order @C2-ProfileOrder @api @R2_AAST-06 @CR-RT @ZYP_Search_ByOrderIdAndZipCode_13737
  Scenario: TC_1 -Verify the profile placed orders Search by orderId and Zip code with SignIn user
    Given "profileorders" by "PlacedOrderZipCode" endpoint for Search profile placed orders with order id and zip code
    And Verify response status code as 200

  @All-R2 @C1-Order @C2-ProfileOrder @api @R2_AAST-06 @CR-RT @ZYP_Search_ByOrderIdAndZipCode_13738
  Scenario: TC_1 -Validate the profile placed orders Search by orderId and Zip code Json Schema with SignIn user
    Given "profileorders" by "PlacedOrderZipCode" endpoint for Search profile placed orders with order id and zip code
    Then validate jsonSchema "R2-PlacedOrderDetailsSchema"

  @All-R2 @C1-Order @C2-ProfileOrder @api @R2_AAST-06 @CR-RT @ZYP_Search_ByOrderIdAndZipCode_13739
  Scenario: TC_1 -Verify the profile placed orders Search by orderId and Zip code JSON Response with SignIn user
    Given "profileorders" by "PlacedOrderZipCode" endpoint for Search profile placed orders with order id and zip code
    Then Validated response details of "orders[0].orderNumber"
