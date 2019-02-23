Feature: To verify the Search Faceted Search API Services

  @Regression @Sanity @All @api @KER-556 @ZYP-6900 @C-SLR
  Scenario Outline: : Verify Search Faceted Search for status code 200
    Given "<FacetedSearchUrl>" endpoint for Search Faceted Search
    Then Verify response status code as 200 for Search Faceted Search

    Examples: 
      | FacetedSearchUrl                                                                                                                                          |
      | Faceted.Search.Url |

  @Regression @Sanity @All @api @KER-556 @ZYP-6901 @C-SLR
  Scenario Outline: : validate the Search Faceted Search json schema
    Given "<FacetedSearchUrl>" endpoint for Search Faceted Search
    And validate jsonSchema "KER_556_SearchFacetedSearch" for Search Faceted Search

    Examples: 
      | FacetedSearchUrl                                                                                                                                          |
      | Faceted.Search.Url |

  @Regression @Sanity @All @api @KER-556 @ZYP-6902 @C-SLR
  Scenario Outline: : Validate the Search Faceted Search with Mens Clothing Requried Property Values are not null
    Given "<FacetedSearchUrl>" endpoint for Search Faceted Search
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
    #And Validate FacetsInfo Requried Property Value are not Null
      #| id              |
      #| totalCount      |
      #| name            |
      #| facetExpanded   |
      #| displaySequence |
      #| property        |
    #And Validate FacetsInfo labels Requried Property Value are not Null
      #| seoUrl |
      #| name   |
      #| count  |
      #| id     |

    Examples: 
      | FacetedSearchUrl                                                                                                                                          |
      | Faceted.Search.Url |
  #@Regression @Sanity @All @api @KER-556 @ZYP-??
  #Scenario Outline: : Validate the Search Faceted Search with shoes Requried Property Values are not null
    #Given "<FacetedSearchUrl>" endpoint for Search Faceted Search
    #Then read the ProductsByCategory json response
    #And Validate the Search by SearchTerm Requried Property Values contains with "<SearchProductText>"
      #| name |
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
#
    #Examples: 
      #| FacetedSearchUrl                    | SearchProductText |
      #| /api/search/productSuggestions/shoes | shoes             |
#
  #@Regression @Sanity @All @api @KER-556 @ZYP-??
  #Scenario Outline: : Validate the Search Faceted Search with Nike Requried Property Values are not null
    #Given "<FacetedSearchUrl>" endpoint for Search Faceted Search
    #Then read the ProductsByCategory json response
    #And Validate the Search by SearchTerm Requried Property Values contains with "<SearchProductText>"
      #| name |
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
#
    #Examples: 
      #| FacetedSearchUrl                    | SearchProductText |
      #| /api/search/productSuggestions/nike | nike             |
  #
