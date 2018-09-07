Feature: Verify Order Checkout-GiftCard API endpoint services

  @All-R2 @C1-Order @C2-Login @api @R2_AAST-01 @CR-VK @ZYP_Order_Login_12273
  Scenario: TC_1 - Verify Login Authentication Token Details
    Given "loginurl" with "LoginRequest" endpoint for login authentication
    Given "GetCartUrl" endpoint for getting cart
    Then Verify response status code as 201


#Post call required instead of get call 

  @All-R2 @C1-Order @C2-Order-GiftCard @api @R2_AAST-05 @CR-VK @ZYP_Order-GiftCard_12754
  Scenario: TC_6 - Retrieve the Order - Get Giftcard Details
    Given "OrderUrl" with  "/giftCards" endpoint for Order Get GiftCard Details
    And Verify response status code as 200

  @All-R2 @C1-Order @C2-Order-GiftCard @api @R2_AAST-05 @CR-VK @ZYP_Order-GiftCard_12755
  Scenario: TC_6 - verify the Order - Get Giftcard Json Response Details
    Given "OrderUrl" with  "/giftCards" endpoint for Order Get GiftCard Details
    Then Validated response details of "getGiftCard.orderId"
    
      @All-R2 @C1-Order @C2-Order-GiftCard @api @R2_AAST-05 @CR-VK @ZYP_Order-GiftCard_12867
  Scenario: TC_6 - verify the Order - Get Giftcard Json Response Details
    Given "OrderUrl" with  "/giftCards" endpoint for Order Get GiftCard Details
    Then read the API json response
    And Validate the Add to Cart API Requried Property Value are not Null
      | orderId |
      | giftCardNumber |
      | giftCardPin|
      

  @All-R2 @C1-Checkout @C2-AvailableShippingModes @api @R2_AAST-05 @CR-VK @ZYP_Checkout_GetCheckout_12736
  Scenario: TC_6 - Retrieve the Checkout-Get Available Shipping Modes
    Given "OrderUrl" with  "shippingModes" endpoint for Available Shipping Modes
    And Verify response status code as 200

  @All-R2 @C1-Checkout @C2-AvailableShippingModes @api @R2_AAST-05 @CR-VK @ZYP_Checkout_GetCheckout_12737
  Scenario: TC_6 - Validate the Checkout-Get Available Shipping Modes Json Schema
    Given "OrderUrl" with  "shippingModes" endpoint for Available Shipping Modes
    Then validate jsonSchema "R2-AvailableShippingModeSchema"

  @All-R2 @C1-Checkout @C2-AvailableShippingModes @api @R2_AAST-05 @CR-VK @ZYP_Checkout_GetCheckout_12868
  Scenario: TC_6 - Validate the Checkout-Get Available Shipping Modes Json Schema
    Given "OrderUrl" with  "shippingModes" endpoint for Available Shipping Modes
    Then read the API json response
    And Validate the Add to Cart API Requried Property Value are not Null
      | orderId |
      | ShippingGroups |
      | groupSeqNum	|
      | shippingModes |
      | shipmodeId|
      | shipmodeDesc	|
      | shippingType |
      | saleShippingCharge |
      | eligibleItems	|
      | orderItemId |
      | partnumber |
      | catentryId|



#unable to find the API's for below feature file     
  @All-R2 @C1-Checkout @C2-AvailableShippingModes @api @R2_AAST-05 @CR-VK @ZYP_Checkout_GetCheckout_12738
  Scenario: TC_6 - Verify the Checkout-Get Available Shipping Modes Response Details
    Given "OrderUrl" with  "shippingModes" endpoint for Available Shipping Modes
   Then Validated response details of "fetchShipModesAndAssociatedItems.results.orderId"

  @All-R2 @C1-Checkout @C2-AvailableShippingModes @api @R2_AAST-05 @CR-VK @ZYP_Checkout_GetCheckout_12740
  Scenario: TC_6 - Retrieve the Checkout-Get Available Shipping Modes with storeId
    Given "OrderUrl" with "shippingModesStoreID" endpoint for Available Shipping Modes with StoreId
    And Verify response status code as 200

  @All-R2 @C1-Checkout @C2-AvailableShippingModes @api @R2_AAST-05 @CR-VK @ZYP_Checkout_GetCheckout_12741
  Scenario: TC_6 - Validate the Checkout-Get Available Shipping Modes with storeId Json Schema
    Given "OrderUrl" with "shippingModesStoreID" endpoint for Available Shipping Modes with StoreId
    Then validate jsonSchema "R2-AvailableShippingModeSchema"

  @All-R2 @C1-Checkout @C2-AvailableShippingModes @api @R2_AAST-05 @CR-VK @ZYP_Checkout_GetCheckout_12742
  Scenario: TC_6 - Verify the Checkout-Get Available Shipping Modes with storeId Response Details
    Given "OrderUrl" with "shippingModesStoreID" endpoint for Available Shipping Modes with StoreId
    Then read the API json response
    Then Validated response details of "fetchShipModesAndAssociatedItems.results.orderId"
