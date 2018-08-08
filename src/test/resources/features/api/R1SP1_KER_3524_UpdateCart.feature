Feature: To verify the Update to Cart API Services

  @Regression @Sanity @All @api @KER-3524 @ZYP-7164 @C-PDP 
  Scenario Outline: : Verify Update to Cart with sign-in user for status code 200
    Given "<UpdateToCartUrl>" and post request "<updatetocartRequestJson>" endpoint for Update to Cart with Sign-in user "<UserName>""<Password>"
    Then Verify response status code as 200 for Update to Cart


    Examples: 
      | UpdateToCartUrl | updatetocartRequestJson | UserName                     | Password   |
      | /api/cart/sku   | AddToCartPostRequest | qaautomationtest@yopmail.com | Qwerty@123 |

  @Regression @Sanity @All @api @KER-3524 @ZYP-7165 @C-PDP 
  Scenario Outline: : validate the Update to Cart sign-in user json schema
    Given "<UpdateToCartUrl>" and post request "<updatetocartRequestJson>" endpoint for Update to Cart with Sign-in user "<UserName>""<Password>"
    And validate jsonSchema "KER-3524-AddtoCartSchema" for Update to Cart with SignIn

    Examples: 
      | UpdateToCartUrl | updatetocartRequestJson | UserName                     | Password   |
      | /api/cart/sku   | AddToCartPostRequest | qaautomationtest@yopmail.com | Qwerty@123 |

  @Regression @Sanity @All @api @KER-3524 @ZYP-7166 @C-PDP 
  Scenario Outline: : Validate the Update to Cart sign-in user Requried Property Values
    Given "<UpdateToCartUrl>" and post request "<updatetocartRequestJson>" endpoint for Update to Cart with Sign-in user "<UserName>""<Password>"
    Then read the API json response
    And Validate the Add to Cart API Requried Property Value are not Null
      | itemCount          |
      | orderTotal         |
      | message            |
      | totalQuantityAdded |
      | totalCartQuantity  |
      | checkoutURL        |
      | cartURL            |
    And Validate the "addToCart" with "items" API Requried Property Value are not Null
      | price       |
      | skuId       |
      | itemId      |
      | productName |
      | quantity    |

    Examples: 
      | UpdateToCartUrl | updatetocartRequestJson | UserName                     | Password   |
      | /api/cart/sku   | AddToCartPostRequest | qaautomationtest@yopmail.com | Qwerty@123 |

  @Regression @Sanity @All @api @KER-3524 @ZYP-7167 @C-PDP 
  Scenario Outline: Verify Update to Cart user for status code 503 for Not Found
    Given "<UpdateToCartUrl>" endpoint for Product PDP Specification
    Then Verify response status code as 503 for Add to Cart

    Examples: 
      | UpdateToCartUrl |
      | /api/cart/sku   |
