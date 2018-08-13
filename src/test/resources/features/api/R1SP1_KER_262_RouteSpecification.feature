Feature: API Route Specification


  @api @Regression @Sanity @All @KER-262 @ZYP-3079 @C-PDP
  Scenario Outline: : Verify status code 200 for success scenario for Route variantType and variantValue
    Given "RouteVariant" endpoint with variant"<RouteTypeAndValue>"
    Then Verify response status code as 200

    Examples: 
      | RouteTypeAndValue                        |
      | variantType=product&variantValue=regular |

  @api @Regression @Sanity @All @KER-262 @ZYP-5412 @C-PDP
  Scenario Outline: : Validate the RouteVariant json Schema for Route variantType and variantValue
    Given "RouteVariant" endpoint with variant"<RouteTypeAndValue>"
    And validate jsonSchema "KER-262-RouteVariantSchema"

    Examples: 
      | RouteTypeAndValue                        |
      | variantType=product&variantValue=regular |

  @api @Regression @Sanity @All @KER-262 @ZYP-5413 @C-PDP
  Scenario Outline: : Verify RouteVariant Requried Property Value for Route variantType and variantValue
    Given "RouteVariant" endpoint with variant"<RouteTypeAndValue>"
    Then read the API json response
    And Validate the API Requried Property Value are not Null
      | variantType |

    Examples: 
      | RouteTypeAndValue                        |
      | variantType=product&variantValue=regular |

  @api @Regression @Sanity @All @KER-262 @ZYP-5414 @C-PDP
  Scenario Outline: : Verify status code 200 for Route Category and variantValue
    Given "RouteVariant" endpoint with variant"<RouteTypeAndValue>"
    Then Verify response status code as 200

    Examples: 
      | RouteTypeAndValue                         |
      | variantType=Category&variantValue=default |

  @api @Regression @Sanity @All @KER-262 @ZYP-5415 @C-PDP
  Scenario Outline: : Validate RouteVariant json Schema for Route Category and variantValue
    Given "RouteVariant" endpoint with variant"<RouteTypeAndValue>"
    And validate jsonSchema "KER-262-RouteVariantSchema"

    Examples: 
      | RouteTypeAndValue                         |
      | variantType=Category&variantValue=default |

  @api @Regression @Sanity @All @KER-262 @ZYP-5416 @C-PDP
  Scenario Outline: : Verify Requried Property Values for Route Category and variantValue
    Given "RouteVariant" endpoint with variant"<RouteTypeAndValue>"
    Then read the API json response
    And Validate the API Requried Property Value are not Null
      | variantType |

    Examples: 
      | RouteTypeAndValue                         |
      | variantType=Category&variantValue=default |

  @api @Regression @Sanity @All @KER-262 @ZYP-5417 @C-PDP
  Scenario Outline: : Verify status code 200 for RouteVariant categoryId
    Given "RouteVariant" endpoint with variant"<RouteTypeAndValue>"
    Then Verify response status code as 200

    Examples: 
      | RouteTypeAndValue |
      | categoryId=15082  |

  @api @Regression @Sanity @All @KER-262 @ZYP-5418 @C-PDP
  Scenario Outline: : Validate RouteVariant json Schema for RouteVariant categoryId
    Given "RouteVariant" endpoint with variant"<RouteTypeAndValue>"
    And validate jsonSchema "KER-262-RouteVariantSchema"

    Examples: 
      | RouteTypeAndValue |
      | categoryId=15082  |

  @api @Regression @Sanity @All @KER-262 @ZYP-5419 @C-PDP
  Scenario Outline: : Verify Requried Property Values for RouteVariant categoryId
    Given "RouteVariant" endpoint with variant"<RouteTypeAndValue>"
    Then read the API json response
    And Validate the API Requried Property Value are not Null
      | id |

    Examples: 
      | RouteTypeAndValue |
      | categoryId=15082  |

  @api @Regression @Sanity @All @KER-262 @ZYP-3080 @C-PDP
  Scenario Outline: : Verify status code 200 for Category Id
    Given "RouteCategoryId" endpoint with category"<RouteCategoryId>"
    Then Verify response status code as 200

    Examples: 
      | RouteCategoryId  |
      | categoryId=15082 |

  @api @Regression @Sanity @All @KER-262 @ZYP-5420 @C-PDP
  Scenario Outline: : Verify RouteVariant Json Schema for Category Id
    Given "RouteCategoryId" endpoint with category"<RouteCategoryId>"
    And validate jsonSchema "KER-262-RouteVariantSchema"

    Examples: 
      | RouteCategoryId  |
      | categoryId=15082 |

  @api @Regression @Sanity @All @KER-262 @ZYP-5421 @C-PDP
  Scenario Outline: : Verify Requried Property Values for RouteCategory Id
    Given "RouteCategoryId" endpoint with category"<RouteCategoryId>"
    Then read the API json response
    And Validate the API Requried Property Value are not Null
      | categoryId  |
      #| parentCatId |

    Examples: 
      | RouteCategoryId  |
      | categoryId=15082 |

  @api @Regression @Sanity @All @KER-262 @ZYP-3081 @C-PDP
  Scenario Outline: : Verify status code 200 for success scenario for Route Page SEOUrl
    Given "RoutePageSEOURL" endpoint with route SEO"<pageSeoURL>"
    Then Verify response status code as 200

    Examples: 
      | pageSeoURL                  |
      | Brands |

  @api @Regression @Sanity @All @KER-262 @ZYP-5422 @C-PDP
  Scenario Outline: : Validate Route variant json schema for Route Page SEOUrl
    Given "RoutePageSEOURL" endpoint with route SEO"<pageSeoURL>"
    And validate jsonSchema "KER-262-RouteVariantSchema"

    Examples: 
      | pageSeoURL                  |
      | Brands |

  @api @Regression @Sanity @All @KER-262 @ZYP-5423 @C-PDP
  Scenario Outline: : Verify Requried Property Values for Route Page SEOUrl
    Given "RoutePageSEOURL" endpoint with route SEO"<pageSeoURL>"
    Then read the API json response
    And Validate the API Requried Property Value are not Null
      | seoURL |

    Examples: 
      | pageSeoURL                  |
      | Brands |

  @api @Regression @Sanity @All @KER-262 @ZYP-5424 @C-PDP
  Scenario Outline: : Verify status code 200 for Route Page default SEOUrl
    Given "RoutePageSEOURL" endpoint with route SEO"<pageSeoURL>"
    Then Verify response status code as 200

    Examples: 
      | pageSeoURL |
      | /          |

  @api @Regression @Sanity @All @KER-262 @ZYP-5425 @C-PDP
  Scenario Outline: : Validate route variant json schema for Route Page default SEOUrl
    Given "RoutePageSEOURL" endpoint with route SEO"<pageSeoURL>"
    And validate jsonSchema "KER-262-RouteVariantSchema"

    Examples: 
      | pageSeoURL |
      | /          |

  @api @Regression @Sanity @All @KER-262 @ZYP-5426 @C-PDP
  Scenario Outline: : Verify Requried Property Values for Route Page default SEOUrl
    Given "RoutePageSEOURL" endpoint with route SEO"<pageSeoURL>"
    Then read the API json response
    And Validate the API Requried Property Value are not Null
      | seoURL |

    Examples: 
      | pageSeoURL |
      | /          |
#  @validate500SEO @INTERNAL_SERVER_ERROR @api @Regression @Sanity @All @KER-262
#Scenario Outline: Verify status code 500 for Internal server error
#     Given "ProductVariant" endpoint with "<SEO_Name>"
#     Then Verify response status code as 500
#  #  And Verify the response error "Internal Server Error"
#  #  Then Verify the response message "GENERAL"   
#   Examples:
#    |SEO_Name|
#    |        |
#        
#        
