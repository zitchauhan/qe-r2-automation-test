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

  @All-R2 @C1-Order @C2-OrderAddress @api @R2_AAST-04 @CR-RT @ZYP_AddShippingAddress_13550
  Scenario: TC_7 - Add the Shipping Address and validate the Schema and response details
    Given "OrderUrl" by "/shipping" endpoint with "AddShippingAddressRequest" for Add shipping Address of Order profile
    Then Verify response status code as 201
    Then validate jsonSchema "R2-AddShippingAddressSchema"
    Then Validated response details of "addShippingAddress.orderId"
    Then Validated response details of "addShippingAddress.addressId"

  @All-R2 @C1-Order @C2-OrderAddress @api @R2_AAST-04 @CR-RT @ZYP_UpdateShippingAddress_14260
  Scenario: TC_7 - Update the Shipping Address and validate the Schema and response details
    Given "Addurl" endpoint with "/address" for get the shipping address of a profile
    Given "OrderUrl" by "/shipping" endpoint with "UpdateOrderShippingAddressRequest" for update the shipping address of a order
    Then Verify response status code as 201
    Then validate jsonSchema "R2-UpdateShippingAddressSchema"
    Then Validated response details of "updateShippingAddress.orderId"
    Then Validated response details of "updateShippingAddress.addressId"

  @All-R2 @C1-Order @C2-OrderAddress @api @R2_AAST-04 @CR-RT @ZYP_AddBillingAddress_14256
  Scenario: TC_7 - Add the Order-Billing Address Credit Card Payment Instructions and validate the Schema and response details
    Given "OrderUrl" by "/creditCard" endpoint with "AddOrderBillingPaymentRequest" for add Order Billing Address and PaymentMethod details
    Then Verify response status code as 201
    Then validate jsonSchema "R2-AddBillingAddressSchema"
    Then Validated response details of "addBillingAddress.orderId"
    Then Validated response details of "addBillingAddress.billAddressId"

  @All-R2 @C1-Order @C2-OrderCart @api @R2_AAST-07 @CR-RT @ZYP_EstimatedTax_14257
  Scenario: TC_7 - verify the Order Cart Estimated Tax and Shipping Charge Response status code details
    Given "OrderUrl" by "?deliveryZipCode=72201&storeZipCode=" for Taxes Cart Estimated Tax and Shipping Charge
    Then Verify response status code as 200

  @All-R2 @C1-Order @C2-OrderCart @api @R2_AAST-07 @CR-RT @ZYP_EstimatedTax_14258
  Scenario: TC_7 - Validate the Order Cart Estimated Tax and Shipping Charge Json Schema details
    Given "OrderUrl" by "?deliveryZipCode=72201&storeZipCode=" for Taxes Cart Estimated Tax and Shipping Charge
    And validate jsonSchema "R2-CartEstimatedTaxShippingChargeSchema"

  @All-R2 @C1-Order @C2-OrderCart @api @R2_AAST-07 @CR-RT @ZYP_EstimatedTax_14259
  Scenario: TC_7 - verify the Order Cart Estimated Tax and Shipping Charge Json Response details
    Given "OrderUrl" by "?deliveryZipCode=72201&storeZipCode=" for Taxes Cart Estimated Tax and Shipping Charge
    Then Validated response details of "orders[0].orderId"

  @All-R2 @C1-Order @C2-RemovePromoCode @api @R2_AAST-05 @CR-VK @ZYP_Order_RemovePromoCode_12280
  Scenario: TC_5 - Remove a PromoCode from an Order
    Given "OrderUrl" endpoint for removing "/promocode/" from an Order
    Then Verify response status code as 201

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

  @All-R2 @C1-Order @C2-OrderDetails @api @R2_AAST-06 @CR-RT @ZYP_OrderDetails_14034
  Scenario: TC_1 -Verify the Place order with SignIn user
    Given "OrderUrl" with "PlaceOrderRequest" endpoint for Place Order
    And Verify response status code as 201
