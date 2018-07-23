Feature: Categories - category details

  @Regression @Sanity @All @api @KER-1603 @ZYP-3052
  Scenario Outline: : Verify for status code 200
    Given "CategoryDetail" endpoint for Category "<CategoryID>"
    Then Verify response status code as 200 for Category

    Examples: 
      | CategoryID        |
      | 15613,15157,15645 |

  @Regression @Sanity @All @api @KER-1603 @ZYP-5381
  Scenario Outline: : validate CategoryDetails json schema
    Given "CategoryDetail" endpoint for Category "<CategoryID>"
    And validate jsonSchema "CategoryDetailSchema" for CategoryDetail

    Examples: 
      | CategoryID        |
      | 15613,15157,15645 |

  @Regression @Sanity @All @api @KER-1603 @ZYP-5382
  Scenario Outline: : Validate the CategoryDetails Requried Property Values
    Given "CategoryDetail" endpoint for Category "<CategoryID>"
    Then Read the CategoryDetails json response
    And Validate the CategoryDetails Requried Property Value are not Null
      | categoryId       |
      | name             |
      | seoURL           |
      | shortDescription |
     # | thumbnail        |
    And Validate the Category SubCategory Requried Property Value are not Null
      | uniqueID         |
      | name             |
      | seoURL           |
      | shortDescription |

    Examples: 
      | CategoryID        |
      | 15613,15157,15645 |

  @Regression @Sanity @All @api @KER-1603 @ZYP-3054
  Scenario Outline: Verify for status code 404 for Not Found
    Given "CategoryDetailFor404" endpoint for Category "<CategoryID>"
    Then Verify response status code as 404 for Category
    And Verify the response error "Not Found" for CategoryDetail
    Then Verify the response message "No message available" for CategoryDetail

    Examples: 
      | CategoryID        |
      | 15613,15157,15645 |

  @Regression @Sanity @All @api @KER-1603 @ZYP-3053
  Scenario: Verify for status code 400 for Bad Request
    Given "CategoryDetailFor400" endpoint for Category
    Then Verify Error response status code as 400 for Category

     #@api @KER-1603 @ZYP-3055
#Scenario Outline: Verify for status code 500 for Internal server error
     #Given "CategoryDetailFor500" endpoint for Category "<CategoryID>"
     #Then Verify response status code as 500 for Category
    #And Verify the response error "Internal Server Error" for CategoryDetail
    #Then Verify the response message "GENERAL" for CategoryDetail    
   #Examples:
    #|CategoryID|
    #|15613,15157,15645| 
  	 
#@api @KER-1603 @ZYP-?
     #Scenario Outline: Verify for status code 401 for Unauthorized
       #Given "/api/category?categoryIds={c1,c2,c3}" endpoint for Category "<CategoryID>"
    #Then Verify response status code as 401
    #Then Verify the response message "<Message>" 
    #
   #Examples:
   #	|CategoryID|
    #|15613,15157,15645|
   
 #@api @KER-1603 @ZYP-?
     #Scenario Outline: Verify for status code 403 for Forbidden
     #Given "/api/category?categoryIds={c1,c2,c3}" endpoint for Category "<CategoryID>"
    #Then Verify response status code as 403
    #Then Verify the response message "<Message>" 
    #
   #Examples:
    #|CategoryID|
    #|15613,15157,15645|
    #
   #