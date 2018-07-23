Feature: To verify the Add to Cart API Services

  @Regression @Sanity @All @api @KER-3524 @ZYP-7159
  Scenario Outline: : Verify Add to Cart with sign-in user for status code 200
    Given "<AddToCartSummaryUrl>" and post request "<addtocartRequestJson>" endpoint for Add to Cart with Sign-in user "<UserName>""<Password>"
    Then Verify response status code as 200 for Add to Cart

    Examples: 
      | AddToCartSummaryUrl | addtocartRequestJson | UserName                     | Password   |
      | /api/cart/sku       | AddToCartPostRequest | qaautomationtest@yopmail.com | Qwerty@123 |

  @Regression @Sanity @All @api @KER-3524 @ZYP-7161
  Scenario Outline: : validate the Add to Cart sign-in user json schema
    Given "<AddToCartSummaryUrl>" and post request "<addtocartRequestJson>" endpoint for Add to Cart with Sign-in user "<UserName>""<Password>"
    And validate jsonSchema "KER-3524-AddtoCartSchema" for Add to Cart with SignIn

    Examples: 
      | AddToCartSummaryUrl | addtocartRequestJson | UserName                     | Password   |
      | /api/cart/sku       | AddToCartPostRequest | qaautomationtest@yopmail.com | Qwerty@123 |

  @Regression @Sanity @All @api @KER-3524 @ZYP-7162
  Scenario Outline: : Validate the Add to Cart sign-in user Requried Property Values
    Given "<AddToCartSummaryUrl>" and post request "<addtocartRequestJson>" endpoint for Add to Cart with Sign-in user "<UserName>""<Password>"
    Then read the API json response
    And Validate the Add to Cart API Requried Property Value are not Null
      | itemCount          |
      | orderTotal         |
      | message            |
      | totalQuantityAdded |
      | totalCartQuantity  |
      | checkoutURL        |
      | cartURL            |
    And Validate the Product PDP "addToCart" with "items" API Requried Property Value are not Null
      | price       |
      | skuId       |
      | itemId      |
      | productName |
      | quantity    |

    Examples: 
      | AddToCartSummaryUrl | addtocartRequestJson | UserName                     | Password   |
      | /api/cart/sku       | AddToCartPostRequest | qaautomationtest@yopmail.com | Qwerty@123 |

  @Regression @Sanity @All @api @KER-3524 @ZYP-7163
  Scenario Outline: Verify Add to Cart user for status code 503 for Not Found
    Given "<AddToCartSummaryUrl>" endpoint for Product PDP Specification
    Then Verify response status code as 503 for Add to Cart

    Examples: 
      | AddToCartSummaryUrl |
      | /api/cart/sku       |
