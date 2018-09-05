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
    Then read the API json response
    And Validate the Add to Cart API Requried Property Value are not Null
      | state   |
      | city  |

  

  @All-R2 @CR-AG @api @C-MyAccount @C-MyAccount-Inventory @ZYP_MyAccount_Inventory_12285
  Scenario: TC_2 - verify store pickup inventory for the given Skus for particular store
    Given "StorePickupInventory" validating with "skus/store/source"
    Then Verify response status code as 200

  @All-R2 @CR-AG @api @C-MyAccount @C-MyAccount-Inventory @ZYP_MyAccount_Inventory_12870
  Scenario: TC_2 - verify store pickup inventory for the given Skus for particular store
    Given "StorePickupInventory" validating with "skus/store/source"
      And validate jsonSchema "StorepickupInventory"
      
      
       @All-R2 @CR-AG @api @C-MyAccount @C-MyAccount-Inventory @ZYP_MyAccount_Inventory_12871
  Scenario: TC_2 - verify store pickup inventory for the given Skus for particular store
    Given "StorePickupInventory" validating with "skus/store/source"
     Then read the API json response
    And Validate the Add to Cart API Requried Property Value are not Null
      | skus  |
      | stores  |
