Feature: This service would return inventory status for all 2 inventory sources (WCS and OMS)

  @All-R2 @CR-AG @api @C-MyAccount @C-MyAccount-Profile-Details @ZYP_MyAccount_ProfileDetailed_12249
  Scenario: TC_1 - Returns store pickup inventory
    Given "InventoryPickUpSkus" validate with "InventoryPickUpStores" entering "SkuID" and "StoreID"
     Then Verify response status code as 200

       @All-R2 @CR-AG @api @C-MyAccount @C-MyAccount-Profile-Details @ZYP_MyAccount_ProfileDetailed_12252
  Scenario: TC_1 - Returns store pickup inventory
    Given "InventoryPickUpSkus" validate with "InventoryPickUpStores" entering "SkuID" and "StoreID"
     And validate jsonSchema "Schema"
     