Feature: View Cart - GiftCard (Including Bulk)

  @Sprint3 @ST-OMNI-23481
  Scenario Outline: Verify details on the Academy gift card tile on the cart screen
    Given User launches the application
    And A registered user is logged in
    And User has Gift Card "<card_type>" in the cart
    When User is on the cart screen
    Then User sees product title
    And User sees SKU label
    And User sees Price label
    And User does not see arrow button for more delivery options
    And User sees default delivery option "Home Delivery"
    And User sees estimated arrival date
    And User sees Remove from cart button
    And User sees Add to wish list button
    # need to confirm about the above step
    # TODO : check DEV Comments - There are no promotions on the gift card,
    #  i.e. there won’t be any PROMO CODE which will give any discount on gift card

    Examples:
    | card_type |
    | AcademyGiftCard |
    | AcademyBulkGiftCard |

  @Sprint3 @ST-OMNI-23481
  Scenario Outline: Verify error messages with respect to card types on the cart
    Given User launches the application
    And A registered user is logged in
    And User has Gift Card "<card_type>" in the cart
    When User is on the cart screen
    And User updates quantity to "<quantity>"
    Then User sees quantity as "<expected_quantity>"
    And User sees the quantity stepper error message "<error_message>"

    Examples:
    | card_type | quantity  | expected_quantity | error_message |
    | AcademyGiftCard | 51  | 50                | Error message to be added |
    | AcademyBulkGiftCard | 50  | 51                | Error message to be added |
    | AcademyBulkGiftCard | 1001  | 1000                | Error message to be added |

  @Sprint3 @ST-OMNI-23481
  Scenario Outline: Verify error messages with respect to card types on the cart
    Given User launches the application
    And A registered user is logged in
    And User has Gift Card "<card_type>" in the cart
    When User is on the cart screen
    And User updates quantity to "<quantity>"
    When User taps on checkout button
    Then User sees the cart screen alert with text "<alert_text>"

    Examples:
      | card_type | quantity  | alert_text |
      | AcademyGiftCard | 21  | Error message to be added |
      | AcademyBulkGiftCard | 21  | Error message to be added |

  @Sprint3 @ST-OMNI-23481
  Scenario: Verify that a card can be removed from the cart page
    Given User launches the application
    And A registered user is logged in
    And User has Gift Card "<card_type>" in the cart
    When User is on the cart screen
    And User removes the card from the cart
    Then User does not see the product title



