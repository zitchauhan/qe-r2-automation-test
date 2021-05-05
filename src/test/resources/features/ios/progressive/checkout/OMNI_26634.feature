Feature: Order Shipping Restrictions and Warnings

  @Sprint5 @ST-OMNI-26634 @TC-OMNI-
  Scenario Outline: Verify that restricted state warning is shown to user on checkout
    Given User launches the application
    And User logs into the application as "<user_name>"
    And User has an empty cart
    And User taps on home in bottom nav

    And User clicks on the Search Box
    And User search for the "<product_type>"
    And I choose to navigate to PDP

    And User selects home delivery option
    And User taps on add to cart button
    And User taps on view cart button
    And User is on the cart screen
    And User taps on checkout button
    And User sees Shipping Method label

    When User taps on default shipping address
    Then User sees list of saved addresses
    When User selects an address "<address>" to edit
    Then User sees the edit address screen
    When User updates the address details on edit address screen
    And User taps on update address button
    Then User sees the edit screen alert with text "<error_Message>"
    And user taps on OK button on Alert
#    Then User sees the AVS screen "no"
#    When User taps on use selected address button

    Examples:
    | user_name | product_type    | address       | error_Message |
    | jitsingh7 | WhiteGloveBulky | Unit 2050 Box | The item can not be shipped to PO/APO/FPO address |


