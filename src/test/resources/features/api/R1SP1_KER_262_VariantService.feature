Feature: Product Variant Service

  @api @Regression @Sanity @All @KER-262 @ZYP-3076
  Scenario Outline: : Verify status code 200 for success scenario for category SEO_Name
    Given "CategoryVariant" endpoint with SEO "<SEO_Name_Category>"
    Then Verify response status code as 200

    Examples: 
      | SEO_Name_Category |
      | apparel           |

  @api @Regression @Sanity @All @KER-262 @ZYP-5358
  Scenario Outline: : Validate Category SEO_Name json schema
    Given "CategoryVariant" endpoint with SEO "<SEO_Name_Category>"
    And validate jsonSchema "KER-262-CategoryVariantSchema" with jsonResponse

    Examples: 
      | SEO_Name_Category |
      | apparel           |

  #@api @Regression @Sanity @All @KER-262 @ZYP-5359
  #Scenario Outline: : Validate category SEO_Name Requried Property Values
    #Given "CategoryVariant" endpoint with SEO "<SEO_Name_Category>"
    #Then read the API json response
    #And Validate the API Requried Property Value are not Null
      #| seo-name |
#
    #Examples: 
      #| SEO_Name_Category |
      #| apparel           |

  #@api @Regression @Sanity @All @KER-262 @ZYP-3065
  #Scenario Outline: : Verify status code 200 for success scenario for Product SEO_Name
    #Given "ProductVariant" endpoint with SEO "<SEO_Name_Product>"
    #Then read the API json response
    #And Validate the API Requried Property Value are not Null
      #| seo-name |
#
    #Examples: 
      #| SEO_Name_Product                                    |
      #| magellan-outdoors-womens-laguna-madre-fishing-shirt |

  @api @Regression @Sanity @All @KER-262 @ZYP-5361
  Scenario Outline: : Validate ProductVariant json Schema
    Given "ProductVariant" endpoint with SEO "<SEO_Name_Product>"
    And validate jsonSchema "KER-262-ProductVariantSchema" with jsonResponse

    Examples: 
      | SEO_Name_Product                                    |
      | magellan-outdoors-womens-laguna-madre-fishing-shirt |

  #@api @Regression @Sanity @All @KER-262 @ZYP-5362
  #Scenario Outline: : Validate ProductVariant Requried Property Values
    #Given "ProductVariant" endpoint with SEO "<SEO_Name_Product>"
    #Then read the API json response
    #And Validate the API Requried Property Value are not Null
      #| seo-name |
#
    #Examples: 
      #| SEO_Name_Product                                    |
      #| magellan-outdoors-womens-laguna-madre-fishing-shirt |

       #@api @Regression @Sanity @All @KER-262 @ZYP-3088
  #Scenario Outline: Verify status code 400 for Bad Request for category SEO_Name
    #Given "CategoryVariant" endpoint with SEO "<SEO_Name_Category>"
    #Then Verify response status code as 400
#
    #Examples: 
      #| SEO_Name_Category |
      #|                   |
#
  #@api @Regression @Sanity @All @KER-262 @ZYP-3066
  #Scenario Outline: Verify status code 400 for Bad Request for product SEO_Name
    #Given "ProductVariant" endpoint with SEO "<SEO_Name_Product>"
    #Then Verify response status code as 400
#
    #Examples: 
      #| SEO_Name_Product |
      #|                  |

  
#  @validate500SEO @INTERNAL_SERVER_ERROR @api @Regression @Sanity @All @KER-262
#Scenario Outline: Verify status code 500 for Internal server error
#     Given "ProductVariant" endpoint with "<SEO_Name>"
#     Then Verify response status code as 500
#  #  And Verify the response error "Internal Server Error"
#  #  Then Verify the response message "GENERAL"   
#   Examples:
#    |SEO_Name|
#    |        |