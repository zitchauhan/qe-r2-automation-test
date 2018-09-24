Feature: To Verify Get Cart Details API service without sign-in

  @All-R2 @C1-Cart @C2-Login @api @R2_AAST-01 @CR-VK @ZYP_Cart_12218
  Scenario: TC_1 - Verify Login Authentication Token Details
    Given "loginurl" with "LoginRequest" endpoint for login authentication
    Then Verify response status code as 201

  @All-R2 @C1-Cart @C2-AddCart @api @R2_AAST-02 @CR-RT @ZYP_Cart_13776
  Scenario: TC_2 - Verify Add to Cart Item with sign-in details
    Given "AddToCartSummaryUrl" and post request "addtocartRequestJson" endpoint for Add to Cart with Sign user
    Then Verify response status code as 200
    And validate jsonSchema "KER-3524-AddtoCartSchema"
    Then Validated response details of "addToCart.itemCount"
    Then Validated response details of "addToCart.message"
    Then Validated response details of "addToCart.totalQuantityAdded"
    Then Validated response details of "addToCart.totalCartQuantity"
    Then Validated response details of "addToCart.orderTotal"

  @All-R2 @C1-Cart @C2-AddCart @api @R2_AAST-02 @CR-RT @ZYP_Cart_12219
  Scenario: TC_2 - Verify Add to Cart without sign-in details
    Given "AddToCartSummaryUrl" and post request "addtocartRequestJson" endpoint for Add to Cart with Guest user
    Then Verify response status code as 200

  @All-R2 @C1-Cart @C2-AddCart @api @R2_AAST-03 @CR-RT @ZYP_Cart_12220
  Scenario: TC_3 -  Verify Add to Cart json schema
    Given "AddToCartSummaryUrl" and post request "addtocartRequestJson" endpoint for Add to Cart with Guest user
    And validate jsonSchema "KER-3524-AddtoCartSchema"

  @All-R2 @C1-Cart @C2-AddCart @api @R2_AAST-04 @CR-RT @ZYP_Cart_12221
  Scenario: TC_4 - Verify Add to Cart required property values
    Given "AddToCartSummaryUrl" and post request "addtocartRequestJson" endpoint for Add to Cart with Guest user
    Then Validated response details of "addToCart.itemCount"
    Then Validated response details of "addToCart.message"
    Then Validated response details of "addToCart.totalQuantityAdded"
    Then Validated response details of "addToCart.totalCartQuantity"
    Then Validated response details of "addToCart.orderTotal"

  @All-R2 @C1-Cart @C2-GetCart @api @R2_AAST-05 @CR-VK @ZYP_Cart_12222
  Scenario: TC_5 - verify Get Cart without sign-in details
    Given "GetCartUrl" endpoint for getting cart
    Then Verify response status code as 200

  @All-R2 @C1-Cart @C2-GetCart @api @R2_AAST-05 @CR-VK @ZYP_Cart_12223
  Scenario: TC_5 - verify Get Cart without sign-in details
    Given "GetCartUrl" endpoint for getting cart
    And validate jsonSchema "KER-725-MinicartSchema"

  @All-R2 @C1-Cart @C2-GetCart @api @R2_AAST-05 @CR-VK @ZYP_Cart_12866
  Scenario: TC_5 - verify Get Cart without sign-in details
    Given "GetCartUrl" endpoint for getting cart
    Then Validated response details of "orderId"
    Then Validated response details of "orderTotal"
    Then Validated response details of "totalProductPrice"
    Then Validated response details of "currency"
    Then Validated response details of "totalOrderItem"

  @All-R2 @C1-Cart @C2-UpdateCart @api @R2_AAST-05 @CR-RT @ZYP_InitiateCheckout_13803
  Scenario: TC_5 - verify the Cart Items Initiate Checkout
    Given "GetCartUrl" by "/initiate" with "InitiateCheckoutRequest" endpoint for Cart Items Initiate Checkout
    Then Verify response status code as 204

  @All-R2 @C1-Cart @C2-GetCart @api @R2_AAST-07 @CR-RT @ZYP_AvailableShippingMethods_13786
  Scenario: TC_7 - verify the Cart Items Available Shipping Methods for status code
    Given "GetCartUrl" by "/getAvailableShippingMethods/?profile=getshipppingmodeswithestimate&orderId=" endpoint for Get Available Shipping Methods for Cart Items
    Then Verify response status code as 200

  @All-R2 @C1-Cart @C2-GetCart @api @R2_AAST-07 @CR-RT @ZYP_AvailableShippingMethods_13787
  Scenario: TC_7 - verify the Cart Items Available Shipping Methods for Json Schema
    Given "GetCartUrl" by "/getAvailableShippingMethods/?profile=getshipppingmodeswithestimate&orderId=" endpoint for Get Available Shipping Methods for Cart Items
    And validate jsonSchema "R2-CartAvailableShippingModeSchema"

  @All-R2 @C1-Cart @C2-GetCart @api @R2_AAST-07 @CR-RT @ZYP_AvailableShippingMethods_13788
  Scenario: TC_7 - verify the Cart Items Available Shipping Methods for Json requried details
    Given "GetCartUrl" by "/getAvailableShippingMethods/?profile=getshipppingmodeswithestimate&orderId=" endpoint for Get Available Shipping Methods for Cart Items
    Then Validated response details of "availableshippingmode.results.orderId"

  # I did not get the API details for below feature file. Help Needed
  @All-R2 @C1-Cart @C2-ChangeStore @api @R2_AAST-05 @CR-VK @ZYP_Cart_12577
  Scenario: TC_5 - verify the change store id with guest user
    Given "OrderUrl" with "changeStoreid" endpoint for Change Store
    Then Verify response status code as 200

  @All-R2 @C1-Cart @C2-GetCart @api @R2_AAST-06 @CR-VK @ZYP_Cart_12224
  Scenario: TC_6 - verify Get Cart Summary without sign-in details
    Given "GetCartUrl" endpoint for getting cart summary
    Then Verify response status code as 200

  @All-R2 @C1-Cart @C2-GetCart @api @R2_AAST-07 @CR-VK @ZYP_Cart_12225
  Scenario: TC_7 - verify View Cart details without sign-in details
    Given "GetCartUrl" endpoint for viewing cart details
    Then Verify response status code as 200

  @All-R2 @C1-Cart @C2-UpdateCart @api @R2_AAST-07 @CR-RT @ZYP_BopisUpdate_13908
  Scenario: TC_7 - verify the Cart Bopis Update Shipping Mode details
    Given "GetCartUrl" by "PUT/updateshippingmode" with "CartBopisUpdateShippingModeRequest" endpoint for Cart-Bopis-Update-Shipping-Mode
    Then Verify response status code as 200

  @All-R2 @C1-Cart @C2-UpdateCart @api @R2_AAST-07 @CR-RT @ZYP_BopisUpdate_13909
  Scenario: TC_7 - Validate the Cart Bopis Update Shipping Mode Json Schema
    Given "GetCartUrl" by "PUT/updateshippingmode" with "CartBopisUpdateShippingModeRequest" endpoint for Cart-Bopis-Update-Shipping-Mode
    And validate jsonSchema "R2-CartBopisUpdateShippingModeSchema"

  @All-R2 @C1-Cart @C2-UpdateCart @api @R2_AAST-07 @CR-RT @ZYP_BopisUpdate_13910
  Scenario: TC_7 - verify the Cart Bopis Update Shipping Mode Json Response details
    Given "GetCartUrl" by "PUT/updateshippingmode" with "CartBopisUpdateShippingModeRequest" endpoint for Cart-Bopis-Update-Shipping-Mode
    Then Validated response details of "orderId"
    Then Validated response details of "orderItem.orderItemId"

  @All-R2 @C1-Cart @C2-GetCart @api @R2_AAST-07 @CR-RT @ZYP_EstimatedTax_14238
  Scenario: TC_7 - verify the Cart Estimated Tax and Shipping Charge Response status code details
    Given "GetCartUrl" by "?deliveryZipCode=72201&storeZipCode=" for Taxes Cart Estimated Tax and Shipping Charge
    Then Verify response status code as 200

  @All-R2 @C1-Cart @C2-GetCart @api @R2_AAST-07 @CR-RT @ZYP_EstimatedTax_14239
  Scenario: TC_7 - Validate the Cart Estimated Tax and Shipping Charge Json Schema details
    Given "GetCartUrl" by "?deliveryZipCode=72201&storeZipCode=" for Taxes Cart Estimated Tax and Shipping Charge
    And validate jsonSchema "R2-CartEstimatedTaxShippingChargeSchema"

  @All-R2 @C1-Cart @C2-GetCart @api @R2_AAST-07 @CR-RT @ZYP_EstimatedTax_14240
  Scenario: TC_7 - verify the Cart Estimated Tax and Shipping Charge Json Response details
    Given "GetCartUrl" by "?deliveryZipCode=72201&storeZipCode=" for Taxes Cart Estimated Tax and Shipping Charge
    Then Validated response details of "orders[0].orderId"
    
     @All-R2 @C1-Cart @C2-UpdateCart @api @R2_AAST-07 @CR-RT @ZYP_UpdateRemove_13546
  Scenario: TC_7 - verify the Cart-Item-Update-Quantity and validate the Schema and response details
    Given "GetCartUrl" by "/updateItemQuantity" with "CartItemUpdateRemoveRequest" endpoint for Cart-Update-Quantity
    Then Verify response status code as 204

  @All-R2 @C1-Cart @C2-GetCart @api @R2_AAST-07 @CR-RT @ZYP_UpdateRemove_13778
  Scenario: TC_7 - verify the Cart-Item-Remove and validate the Schema and response details
    Given "GetCartUrl" by "undefined/updateItemQuantity" with "CartItemUpdateRemoveRequest" endpoint for Remove Item from Cart
    Then Verify response status code as 204
    Given "AddToCartSummaryUrl" and post request "addtocartRequestJson" endpoint for Add to Cart with Guest user
