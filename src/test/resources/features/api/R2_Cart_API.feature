Feature: To Verify Get Cart Details API service without sign-in

  @All-R2 @C1-Cart @C2-Login @api @R2_AAST-01 @CR-VK
  Scenario: TC_1 - Verify Login Authentication Token Details
    Given "loginurl" with "LoginRequest" endpoint for login authentication
    Then Verify response status code as 200

  @All-R2 @C1-Cart @C2-AddCart @api @R2_AAST-02 @CR-VK
  Scenario: TC_2 - Verify Add to Cart without sign-in details
    Given "AddToCartSummaryUrl" and post request "addtocartRequestJson" endpoint for Add to Cart with Guest user
    Then Verify response status code as 200

  @All-R2 @C1-Cart @C2-AddCart @api @R2_AAST-03 @CR-VK
  Scenario: TC_3 -  Verify Add to Cart json schema
    Given "AddToCartSummaryUrl" and post request "addtocartRequestJson" endpoint for Add to Cart with Guest user
    And validate jsonSchema "KER-3524-AddtoCartSchema"

  @All-R2 @C1-Cart @C2-AddCart @api @R2_AAST-04 @CR-VK
  Scenario: TC_4 - Verify Add to Cart required property values
    Given "AddToCartSummaryUrl" and post request "addtocartRequestJson" endpoint for Add to Cart with Guest user
    Then read the API json response
    And Validate the Add to Cart API Requried Property Value are not Null
      | itemCount          |
      | orderTotal         |
      | message            |
      | totalQuantityAdded |
      | totalCartQuantity  |
      | checkoutURL        |
      | cartURL            |

  @All-R2 @C1-Cart @C2-GetCart @api @R2_AAST-05 @CR-VK
  Scenario: TC_5 - verify Get Cart without sign-in details
    Given "GetCartUrl" endpoint for getting cart
    Then Verify response status code as 200
    And validate jsonSchema "KER-725-MinicartSchema"

  @All-R2 @C1-Cart @C2-GetCart @api @R2_AAST-06 @CR-VK
  Scenario: TC_6 - verify Get Cart Summary without sign-in details
    Given "GetCartUrl" endpoint for getting cart summary
    Then Verify response status code as 200

  @All-R2 @C1-Cart @C2-GetCart @api @R2_AAST-07 @CR-VK
  Scenario: TC_7 - verify View Cart without sign-in details
    Given "GetCartUrl" endpoint for viewing cart details
    Then Verify response status code as 200
