Feature: To Verify Get City adn State of store Locator without sign-in

  @All-R2 @CR-AG @api @C-MyAccount @C-MyAccount-Profile-Details @ZYP_MyAccount_ProfileDetailed_12282
  Scenario: TC_1 - verify Get City and State of Store Locator without Sign-in
    Given "AddressCity" validating with "zipCode"
    Then Verify response status code as 200

  @All-R2 @CR-AG @api @C-MyAccount @C-MyAccount-Profile-Details @ZYP_MyAccount_ProfileDetailed_12283
  Scenario: TC_1 - verify Get City and State of Store Locator without Sign-in
    Given "AddressCity" validating with "zipCode"
    And validate jsonSchema "StoreLocator_FindCityAndState"

  @All-R2 @CR-AG @api @C-MyAccount @C-MyAccount-Profile-Details @ZYP_MyAccount_ProfileDetailed_12869
  Scenario: TC_1 - verify Get City and State of Store Locator without Sign-in
    Given "AddressCity" validating with "zipCode"
    Then Validated response details of "state"
    Then Validated response details of "city"

@All-R2 @CR-RT @api @C-MyAccount @C-MyAccount-Inventory @ZYP_MyAccount_Inventory_13164
  Scenario: TC_2 - verify Create store pickup inventory for the given Skus for particular store
   Given "StorePickupInventory" with "StorePickupInventoryRequest" for Create store pickup inventory with skus and store
    Then Verify response status code as 200
     And validate jsonSchema "StorePickupInventorySchema"
     Then Validated response details of "pickupResponse[0].storeId"
    Then Validated response details of "pickupResponse[0].skus[0].skuId"

  @All-R2 @CR-RT @api @C-MyAccount @C-MyAccount-Inventory @ZYP_MyAccount_Inventory_12285
  Scenario: TC_2 - verify Get store pickup inventory for the given Skus for particular store
    Given "StorePickupInventory" validating with "skus-store-source_details"
    Then Verify response status code as 200

  @All-R2 @CR-RT @api @C-MyAccount @C-MyAccount-Inventory @ZYP_MyAccount_Inventory_12870
  Scenario: TC_2 - verify Get store pickup inventory for the given Skus for particular store JSON Schema validation
    Given "StorePickupInventory" validating with "skus-store-source_details"
    And validate jsonSchema "StorePickupInventorySchema"

  @All-R2 @CR-RT @api @C-MyAccount @C-MyAccount-Inventory @ZYP_MyAccount_Inventory_12871
  Scenario: TC_2 - verify Get store pickup inventory for the given Skus for particular store JSON Response validation
    Given "StorePickupInventory" validating with "skus-store-source_details"
    Then Validated response details of "pickupResponse[0].storeId"
    Then Validated response details of "pickupResponse[0].skus[0].skuId"
