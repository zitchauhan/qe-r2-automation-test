Feature: To verify the Search by SearchTerm API Services

  @Regression @Sanity @All @api @KER-1959 @ZYP-6825 @C-SLR
  Scenario Outline: : Verify Search by SearchTerm for status code 200
    Given "<SearchTermUrl>" endpoint for Search by SearchTerm
    Then Verify response status code as 200 for Search by SearchTerm

    Examples: 
      | SearchTermUrl                |
      | /api/search/sitesearch/shirt |

  @Regression @Sanity @All @api @KER-1959 @ZYP-6826 @C-SLR
  Scenario Outline: : validate the Search by SearchTerm json schema
    Given "<SearchTermUrl>" endpoint for Search by SearchTerm
    And validate jsonSchema "KER-1952_SearchTermSchema" for Search by SearchTerm

    Examples: 
      | SearchTermUrl                |
      | /api/search/sitesearch/shirt |

  @Regression @Sanity @All @api @KER-1959 @ZYP-6827 @C-SLR
  Scenario Outline: : Verify Search by SearchTerm by page size and page number for status code 200
    Given "<SearchTermUrl>" endpoint for Search by SearchTerm by page size and page number
    Then Verify response status code as 200 for Search by SearchTerm by page size and page number

    Examples: 
      | SearchTermUrl                                                         |
      | /api/search/sitesearch/shirt?orderBy=&pageSize=48&pageNumber=1&facet= |

  @Regression @Sanity @All @api @KER-1959 @ZYP-6828 @C-SLR
  Scenario Outline: : validate the Search by SearchTerm json schema by page size and page number
    Given "<SearchTermUrl>" endpoint for Search by SearchTerm by page size and page number
    And validate jsonSchema "KER-1952_SearchTermSchema" for Search by SearchTerm by page size and page number

    Examples: 
      | SearchTermUrl                                                         |
      | /api/search/sitesearch/shirt?orderBy=&pageSize=48&pageNumber=1&facet= |

  @Regression @Sanity @All @api @KER-1959 @ZYP-6829 @C-SLR
  Scenario Outline: : Validate the Search by SearchTerm with shirts Requried Property Values are not null
    Given "<SearchTermUrl>" endpoint for Search by SearchTerm
    Then read the ProductsByCategory json response
    And Validate the Search by SearchTerm "breadcrumb" Requried Property Values contains with "<SearchTermText>"
      | label |
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
    And Validate FacetsInfo Requried Property Value are not Null
      | id                          |
      | totalCount                  |
      | name                        |
      | displaySequence             |
      | property                    |
      | allowMultipleValueSelection |
    And Validate FacetsInfo labels Requried Property Value are not Null
      | seoUrl   |
      | name     |
      | count    |
      | id       |
      | property |
    And Validate sortByInfo Requried Property Value are not Null
      | name             |
      | id               |
      | selectedProperty |

    Examples: 
      | SearchTermUrl                | SearchTermText |
      | /api/search/sitesearch/shirt | shirt          |


  @Regression @Sanity @All @api @KER-1959 @ZYP-6830 @C-SLR
  Scenario Outline: : Validate the Search by searchTerm with shoes  Requried Property Values are not null
    Given "<SearchTermUrl>" endpoint for Search by SearchTerm
    Then read the ProductsByCategory json response
    And Validate the Search by SearchTerm "breadcrumb" Requried Property Values contains with "<SearchTermText>"
      | label |
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
    And Validate FacetsInfo Requried Property Value are not Null
      | id                          |
      | totalCount                  |
      | name                        |
      | displaySequence             |
      | property                    |
      | allowMultipleValueSelection |
    And Validate FacetsInfo labels Requried Property Value are not Null
      | seoUrl   |
      | name     |
      | count    |
      | id       |
      | property |
    And Validate sortByInfo Requried Property Value are not Null
      | name             |
      | id               |
      | selectedProperty |

    Examples: 
      | SearchTermUrl                | SearchTermText |
      | /api/search/sitesearch/shoe | shoe          |

  @Regression @Sanity @All @api @KER-1959 @ZYP-6831 @C-SLR
  Scenario Outline: : Validate the Search by SearchTerm with Nike Brand Requried Property Values are not null
    Given "<SearchTermUrl>" endpoint for Search by SearchTerm
    Then read the ProductsByCategory json response
    #And Validate the Search by SearchTerm "breadcrumb" Requried Property Values contains with "<SearchTermText>"
     # | label |
    And Validate the Search by SearchTerm "<PropertyType>" Requried Property Values contains with "<SearchTermText>"
      | label |
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
    And Validate FacetsInfo Requried Property Value are not Null
      | id                          |
      | totalCount                  |
      | name                        |
      | displaySequence             |
      | property                    |
      | allowMultipleValueSelection |
    And Validate FacetsInfo labels Requried Property Value are not Null
      | seoUrl   |
      | name     |
      | count    |
      | id       |
      | property |
    And Validate sortByInfo Requried Property Value are not Null
      | name             |
      | id               |
      | selectedProperty |

    Examples: 
      | SearchTermUrl               | PropertyType | SearchTermText |
      | /api/search/sitesearch/shirt | breadcrumb   | shirt           |

  @Regression @Sanity @All @api @KER-1959 @ZYP-6832 @C-SLR
  Scenario Outline: : Validate the Search by SearchTerm with adidas brand Requried Property Values are not null
    Given "<SearchTermUrl>" endpoint for Search by SearchTerm
    Then read the ProductsByCategory json response
    #And Validate the Search by SearchTerm "breadcrumb" Requried Property Values contains with "<SearchTermText>"
     # | label |
    And Validate the Search by SearchTerm "<PropertyType>" Requried Property Values contains with "<SearchTermText>"
      | label |
    #And Validate ProductInfo Requried Property Value are not Null
      #| name               |
      #| id                 |
      #| sellable           |
      #| skuCount           |
      #| manufacturer       |
      #| defaultSku         |
      #| isSingleSkuProduct |
      #| partNumber         |
      #| imageURL           |
    #And Validate ProductInfo defaultSkuPrice Requried Property Value are not Null
      #| salePrice |
    #And Validate FacetsInfo Requried Property Value are not Null
      #| id                          |
      #| totalCount                  |
      #| name                        |
      #| displaySequence             |
      #| property                    |
      #| allowMultipleValueSelection |
    #And Validate FacetsInfo labels Requried Property Value are not Null
      #| seoUrl   |
      #| name     |
      #| count    |
      #| id       |
      #| property |
    #And Validate sortByInfo Requried Property Value are not Null
      #| name             |
      #| id               |
      #| selectedProperty |

    Examples: 
      | SearchTermUrl                 | PropertyType | SearchTermText |
      | /api/search/sitesearch/adidas | breadcrumb   | adidas brand        |
