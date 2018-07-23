Feature: Categories - products By Category

  @Regression @Sanity @All @api @KER-1962 @ZYP-3044
  Scenario Outline: : Verify for status code 200 for product
    Given "ProductsByCategory" endpoint for product "<CategoryID>"
    Then Verify response status code as 200

    Examples: 
      | CategoryID |
      |      15750 |

  @Regression @Sanity @All @api @KER-1962 @ZYP-5373
  Scenario Outline: : Validate ProductInfo Json schema
    Given "ProductsByCategory" endpoint for product "<CategoryID>"
    And validate jsonSchema "ProductSchema"

    Examples: 
      | CategoryID |
      |      15750 |

  @Regression @Sanity @All @api @KER-1962 @ZYP-5374
  Scenario Outline: : Validate ProductInfo Requried Property Values
    Given "ProductsByCategory" endpoint for product "<CategoryID>"
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
    And Validate sortByInfo Requried Property Value are not Null
      | name             |
      | id               |
      | selectedProperty |

    Examples: 
      | CategoryID |
      |      15750 |

  @Regression @Sanity @All @api @KER-1962 @ZYP-3064
  Scenario Outline: : Verify for status code 200 for facets
    Given "ProductsByCategory" endpoint for Facets "<CategoryID>"
    Then Verify response status code as 200

  @Regression @Sanity @All @api @KER-1962 @ZYP-5375
  Scenario Outline: : Validate facets Json Schema
    Given "ProductsByCategory" endpoint for Facets "<CategoryID>"
    And validate jsonSchema "facetsSchema"

  @Regression @Sanity @All @api @KER-1962 @ZYP-5376
  Scenario Outline: : Validate FacetsInfo Requried Property values
    Given "ProductsByCategory" endpoint for Facets "<CategoryID>"
    Then read the ProductsByCategory json response
    And Validate FacetsInfo Requried Property Value are not Null
      | id              |
      | totalCount      |
      | name            |
      #| facetExpanded   |
      | displaySequence |
      | property        |
    And Validate FacetsInfo labels Requried Property Value are not Null
      | seoUrl |
      | name   |
      | count  |
      | id     |
    And Validate sortByInfo Requried Property Value are not Null
      | name             |
      | id               |
      | selectedProperty |

    Examples: 
      | CategoryID |
      |      15750 |

  @Regression @Sanity @All @api @KER-1962 @ZYP-3603
  Scenario Outline: : Verify for status code 200 for product and facets
    Given "ProductsByCategory" endpoint for product and Facets with "<CategoryID>"
    Then Verify response status code as 200

    Examples: 
      | CategoryID |
      |      15750 |

  @Regression @Sanity @All @api @KER-1962 @ZYP-5378
  Scenario Outline: : Validate product and facets json schema
    Given "ProductsByCategory" endpoint for product and Facets with "<CategoryID>"
    And validate jsonSchema "ProdFacetSchema"

    Examples: 
      | CategoryID |
      |      15750 |

  @Regression @Sanity @All @api @KER-1962 @ZYP-5379
  Scenario Outline: : Validate product and facets Requried Property Values
    Given "ProductsByCategory" endpoint for product and Facets with "<CategoryID>"
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
    And Validate FacetsInfo Requried Property Value are not Null
      | id              |
      | totalCount      |
      | name            |
      | facetExpanded   |
      | displaySequence |
      | property        |
    And Validate FacetsInfo labels Requried Property Value are not Null
      | seoUrl |
      | name   |
      | count  |
      | id     |
    And Validate sortByInfo Requried Property Value are not Null
      | name             |
      | id               |
      | selectedProperty |

    Examples: 
      | CategoryID |
      |      15750 |

  @Regression @Sanity @All @api @KER-1962 @ZYP-3050
  Scenario: Verify for status code 400 for Bad Request
    Given "CategoryDetailFor400" endpoint for Category
    Then Verify Error response status code as 400 for Category

  @Regression @Sanity @All @api @KER-1962 @ZYP-3047
  Scenario Outline: : Verify for status code 404 for product
    Given "ProductsByCategory" endpoint for product with "<CategoryID>"
    Then Verify response status code as 404
    And Verify the response error "Not Found"
    And Verify the response message "No message available"

    Examples: 
      | CategoryID |
      |      15750 |

  @Regression @Sanity @All @api @KER-1962 @ZYP-3604
  Scenario Outline: : Verify for status code 404 for facets
    Given "ProductsByCategory" endpoint for facets with "<CategoryID>"
    Then Verify response status code as 404
    And Verify the response error "Not Found"
    And Verify the response message "No message available"

    Examples: 
      | CategoryID |
      |      15750 |
  #@api @KER-1962 @ZYP-3048
  #Scenario Outline: Verify for status code 500 for Internal server error
    #Given "CategoryDetailFor500" endpoint for Category "<CategoryID>"
    #Then Verify response status code as 500 for Category
    #And Verify the response error "Internal Server Error" for CategoryDetail
    #Then Verify the response message "GENERAL" for CategoryDetail
#
    #Examples: 
      #| CategoryID        |
      #| 15613,15157,15645 |
