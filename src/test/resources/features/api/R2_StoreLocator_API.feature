Feature: To Verify Get City adn State of store Locator without sign-in

  @All-R2 @CR-AG @api @C-MyAccount @C-MyAccount-Profile-Details @ZYP_MyAccount_ProfileDetailed_XXXXX
  Scenario Outline: TC_1 - verify Get City and State of Store Locator without Sign-in
    Given "<GetCity&State>" validating with "<ZipCode>"
    Then Verify response status code as 200
    And validate jsonSchema "StoreLocator_FindCityAndState"

    Examples: 
      | GetCity&State      |  | ZipCode |
      | /api/address/city/ |  |   76001 |

  @All-R2 @CR-AG @api @C-MyAccount @C-MyAccount-Inventory @ZYP_MyAccount_Inventory_XXXXX
  Scenario Outline: TC_2 - verify store pickup inventory for the given Skus for particular store
    Given "<StorePickupInventory>" validating with "<skus/store/source>"
    Then Verify response status code as 200

    Examples: 
      | StorePickupInventory   |  | skus/store/source      |
      | /api/inventory/pickup/ |  | 3534505/10151/realtime |
