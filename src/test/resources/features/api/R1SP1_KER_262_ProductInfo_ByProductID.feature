Feature: Product Infos- by productIds

  @api @Regression @Sanity @All @KER-262 @ZYP-3073 @C-PLP
  Scenario Outline: : Verify status code 200 for success scenario for different Product Ids
    Given "ProductInfoByProdID" endpoint with productId "<ProductID>"
    Then Verify response status code as 200

    Examples: 
      | ProductID                       |
      | 3237689,1042114,3692779,4134286 |

  @api @Regression @Sanity @All @KER-262 @ZYP-5368 @C-PLP
  Scenario Outline: : Validate ProductInfoByProdID json Schema  for success scenario for different Product Ids
    Given "ProductInfoByProdID" endpoint with productId "<ProductID>"
    And validate jsonSchema "KER-262-ProductInfoByProdIDSchema" with jsonResponse

    Examples: 
      | ProductID                       |
      | 3237689,1042114|

  @api @Regression @Sanity @All @KER-262 @ZYP-5370 @C-PLP
  Scenario Outline: : Verify ProductInfoByProdIDSchema Requried Property Value for different Product Ids
    Given "ProductInfoByProdID" endpoint with productId "<ProductID>"
    Then read the ProductsByCategory json response
    And Validate ProductInfo Requried Property Value are not Null
      | name               |
      | id                 |
      | shortDescription   |
      | sellable           |
      | skuCount           |
      | manufacturer       |
      | defaultSku         |
      | isSingleSkuProduct |
      | partNumber         |
      | imageURL           |
    And Validate ProductInfo defaultSkuPrice Requried Property Value are not Null
      | salePrice |
    #And Validate sortByInfo Requried Property Value are not Null
      #| name             |
      #| id               |
      #| selectedProperty |
    #And Validate FacetsInfo Requried Property Value are not Null
      #| id              |
      #| totalCount      |
      #| name            |
      #| displaySequence |
      #| property        |
    #And Validate FacetsInfo labels Requried Property Value are not Null
      #| property |
      #| seoUrl   |
      #| name     |
      #| count    |
      #| id       |

    Examples: 
      | ProductID                       |
      | 3237689,1042114,3692779,4134286 |

  @api @Regression @Sanity @All @KER-262 @ZYP-3075 @C-PLP
  Scenario Outline: : Verify status code 404 for Resource not found /Cart for the user is not found for MiniCart
    Given "ProductInfoByProdID" endpoint with productId "<ProductID>"
    Then Verify response status code as 404

    Examples: 
      | ProductID |
      | 12345     |

  @api @Regression @Sanity @All @KER-262 @ZYP-3599 @C-PLP
  Scenario Outline: Verify status code 400 for Bad Request
    Given "ProductInfoByProdID" endpoint with productId "<ProductID>"
    Then Verify response status code as 400

    Examples: 
      | ProductID |
      |           |

      # @api @Regression @Sanity @All @KER-262
#Scenario Outline: Verify status code 500 for Internal server error
#    Given "ProductInfoByProdID" endpoint with productId "<ProductID>"
#     Then Verify response status code as 500
#  #  And Verify the response error "Internal Server Error"
#  #  Then Verify the response message "GENERAL"   
#   Examples:
#    |ProductID|
#    |        |
#    