Feature: To verify the Product Suggest API Services

  @Regression @Sanity @All @api @KER-3276 @ZYP-6833 @C-PDP
  Scenario Outline: : Verify Product Suggest for status code 200
    Given "<ProductSuggestUrl>" endpoint for Product Suggest
    Then Verify response status code as 200 for Product Suggest

    Examples: 
      | ProductSuggestUrl            |
      | /api/search/productSuggestions/shirt |

  @Regression @Sanity @All @api @KER-3276 @ZYP-6834 @C-PDP
  Scenario Outline: : validate the Product Suggest json schema
    Given "<ProductSuggestUrl>" endpoint for Product Suggest
    And validate jsonSchema "KER_3276_ProductSuggestSchema" for Product Suggest

    Examples: 
      | ProductSuggestUrl            |
      | /api/search/productSuggestions/shirt |

  @Regression @Sanity @All @api @KER-3276 @ZYP-6835 @C-PDP
  Scenario Outline: : Validate the Product Suggest with shirts Requried Property Values are not null
   Given "<ProductSuggestUrl>" endpoint for Product Suggest
    Then read the ProductsByCategory json response
    And Validate the Search by SearchTerm Requried Property Values contains with "<SearchProductText>"
      | name |
    And Validate ProductInfo Requried Property Value are not Null
      | name               |
      | id                 |
      | sellable           |
      | skuCount           |
      | manufacturer       |
      | defaultSku         |
      | isSingleSkuProduct |
      | partNumber         |
      | imageURL           |
    And Validate ProductInfo defaultSkuPrice Requried Property Value are not Null
      | salePrice |

    Examples: 
      | ProductSuggestUrl                    | SearchProductText |
      | /api/search/productSuggestions/shirt | shirt             |

  @Regression @Sanity @All @api @KER-3276 @ZYP-6836 @C-PDP
  Scenario Outline: : Validate the Product Suggest with shoes Requried Property Values are not null
    Given "<ProductSuggestUrl>" endpoint for Product Suggest
    Then read the ProductsByCategory json response
    #And Validate the Search by SearchTerm Requried Property Values contains with "<SearchProductText>"
     # | name |
    And Validate ProductInfo Requried Property Value are not Null
      | name               |
      | id                 |
      | sellable           |
      | skuCount           |
      | manufacturer       |
      | defaultSku         |
      | isSingleSkuProduct |
      | partNumber         |
      | imageURL           |
    And Validate ProductInfo defaultSkuPrice Requried Property Value are not Null
      | salePrice |


    Examples: 
      | ProductSuggestUrl                    | SearchProductText |
      | /api/search/productSuggestions/shoes | shoes             |

  @Regression @Sanity @All @api @KER-3276 @ZYP-6837 @C-PDP
  Scenario Outline: : Validate the Product Suggest with Nike Requried Property Values are not null
    Given "<ProductSuggestUrl>" endpoint for Product Suggest
    Then read the ProductsByCategory json response
    And Validate the Search by SearchTerm Requried Property Values contains with "<SearchProductText>"
      | name |
    And Validate ProductInfo Requried Property Value are not Null
      | name               |
      | id                 |
      | sellable           |
      | skuCount           |
      | manufacturer       |
      | defaultSku         |
      | isSingleSkuProduct |
      | partNumber         |
      | imageURL           |
    And Validate ProductInfo defaultSkuPrice Requried Property Value are not Null
      | salePrice |

    Examples: 
      | ProductSuggestUrl                    | SearchProductText |
      | /api/search/productSuggestions/nike | nike             |
  
