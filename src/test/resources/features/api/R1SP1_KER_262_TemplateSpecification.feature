Feature: Template Specification

  Background: 

  @api @Regression @Sanity @All @KER-262 @ZYP-3085
  Scenario Outline: : Verify status code 200 for success scenario for category SEO_Name
    Given "TemplateSpecifation" endpoint with SEO "<SEO_URL>"
    Then Verify response status code as 200

    Examples: 
      | SEO_URL                                                 |
      | /shop/browse/apparel/mens-apparel/mens-shirts--t-shirts |

  @api @Regression @Sanity @All @KER-262 @ZYP-5364
  Scenario Outline: : Validate RouteVariant json Schema for category SEO_Name
    Given "TemplateSpecifation" endpoint with SEO "<SEO_URL_Schema>"
    And validate jsonSchema "KER-262-RouteVariantSchema" with jsonResponse

    Examples: 
      | SEO_URL_Schema                                          |
      | /shop/browse/apparel/mens-apparel/mens-shirts--t-shirts |

  #@api @Regression @Sanity @All @KER-262 @ZYP-5365
  #Scenario Outline: : Validate RouteVariant Requried Property Value for category SEO_Name
    #Given "TemplateSpecifation" endpoint with SEO "<SEO_URL>"
    #Then read the API json response
    #And Validate the API Requried Property Value are not Null
      #| seoURL |
#
    #Examples: 
      #| SEO_URL                                                 |
      #| /shop/browse/apparel/mens-apparel/mens-shirts--t-shirts |

  @api @Regression @Sanity @All @KER-262 @ZYP-3086
  Scenario Outline: Verify for status code 404 for Non Found for category SEO_Name
    Given "TemplateSpecifation" endpoint with SEO "<SEO_URL>"
    Then Verify response status code as 404

    Examples: 
      | SEO_URL                                                  |
      | /shopbrowse/apparel/mens-apparel/mens-shirts--t-shirts34 |
