Feature: This service would return inventory status for all 2 inventory sources (WCS and OMS)

  @All-R2 @CR-AG @api @C1-MyAccount @C-MyAccount-Profile-Details @ZYP_MyAccount_ProfileDetailed_12249
  Scenario: TC_1 - Returns store pickup inventory
    Given "InventoryPickUpSkus" validate with "InventoryPickUpStores" entering "SkuID" and "StoreID"
    Then Verify response status code as 200

  @All-R2 @CR-AG @api @C1-MyAccount @C-MyAccount-Profile-Details @ZYP_MyAccount_ProfileDetailed_12252
  Scenario: TC_1 - Returns store pickup inventory
    Given "InventoryPickUpSkus" validate with "InventoryPickUpStores" entering "SkuID" and "StoreID"
    And validate jsonSchema "Schema"

  @All-R2 @CR-RT @api @C1-MyAccount @C-Storelocator-Find-Stores-makemystore @ZYP_MyAccount_stores-makemystore_12509
  Scenario: TC_1 - Retrieve the Storelocator-Find stores-makemystore
    Given "loginurl" with "LoginRequest" endpoint for login authentication
    Given "MakeMyStore" and post request "MakeMyStoreRequest" endpoint for Storelocator Find stores makemystore with SignIn user
    Then Verify response status code as 200

  @All-R2 @CR-RT @api @C1-MyAccount @C-Storelocator-Find-Stores-makemystore @ZYP_MyAccount_stores-makemystore_12510
  Scenario: TC_1 - Retrieve the Storelocator-Find stores-makemystore-Validate Json Schema
    Given "MakeMyStore" and post request "MakeMyStoreRequest" endpoint for Storelocator Find stores makemystore with SignIn user
    And validate jsonSchema "R2-MakemystoreSchema"

  @All-R2 @CR-RT @api @C1-MyAccount @C-Storelocator-Find-Stores-makemystore @ZYP_MyAccount_stores-makemystore_12511
  Scenario: TC_1 - Retrieve the Storelocator-Find stores-makemystore-Validate response data
    Given "MakeMyStore" and post request "MakeMyStoreRequest" endpoint for Storelocator Find stores makemystore with SignIn user
    And verify the Storelocator-Find stores-makemystore response data

  @All-R2 @CR-RT @api @C1-MyAccount @C-Storelocator-Find-Stores-findbyLatNLong @ZYP_MyAccount_findbyLatNLong_12512
  Scenario: TC_3 - Retrieve the Storelocator Find stores findbyLatNLong andStoreLocId
    Given "FindStoreUrl" endpoint for Storelocator Find stores and findbyLatNLong StoreLocId
    Then Verify response status code as 200

  @All-R2 @CR-RT @api @C1-MyAccount @C-Storelocator-Find-Stores-findbyLatNLong @ZYP_MyAccount_findbyLatNLong_12513
  Scenario: TC_3 - Retrieve the Storelocator Find stores findbyLatNLong andStoreLocId-Validate Json Schema
    Given "FindStoreUrl" endpoint for Storelocator Find stores and findbyLatNLong StoreLocId
    And validate jsonSchema "R2-FindbyLatNLongSchema"

  @All-R2 @CR-RT @api @C1-MyAccount @C-Storelocator-Find-Stores-findbyLatNLong @ZYP_MyAccount_findbyLatNLong_12514
  Scenario: TC_3 - Retrieve the Storelocator Find stores findbyLatNLong andStoreLocId-Validate response data
    Given "FindStoreUrl" endpoint for Storelocator Find stores and findbyLatNLong StoreLocId
    And verify the Storelocator Find stores findbyLatNLong response data

    @All-R2 @CR-RT @api @C1-MyAccount @C-Storelocator-Find-Stores-findbyLatNLong @ZYP_MyAccount_GetStore_13077
  Scenario: TC_3 - get the Store Details and verify the status code
    Given "GetStoreDetailsUrl" endpoint for get Store Details
    Then Verify response status code as 200
    
      @All-R2 @CR-RT @api @C1-MyAccount @C-Storelocator-Find-Stores-findbyLatNLong @ZYP_MyAccount_GetStore_13078
  Scenario: TC_3 - get the Store Details and validate the JSON schema
    Given "GetStoreDetailsUrl" endpoint for get Store Details
    And validate jsonSchema "GetStoreDetailsSchema"
    
     @All-R2 @CR-RT @api @C1-MyAccount @C-Storelocator-Find-Stores-findbyLatNLong @ZYP_MyAccount_GetStore_13079
  Scenario: TC_3 - get the Store Details and validate the JSON response details
    Given "GetStoreDetailsUrl" endpoint for get Store Details
     Then Validated response details of "stores[0].storeId"
    Then Validated response details of "stores[0].type"