Feature: To verify the Product PDP Specification API Services

    Scenario Outline: Verify for status code 404 for Not Found
    Given "CategoryDetailFor404" endpoint for Category "<CategoryID>"
    Then Verify response status code as 404 for Category
    And Verify the response error "Not Found" for CategoryDetail
    Then Verify the response message "No message available" for CategoryDetail 
    #Then Verify response status code as 404 for Category
    #And Verify the response error "Not Found" for CategoryDetail
    #Then Verify the response message "No message available" for CategoryDetail

    Examples: 
      | CategoryID        |
      | 15613,15157,15645 |
 
  #@Regression @Sanity @All @api @KER-2606 @ZYP-7053 @C-PDP
  #Scenario Outline: : validate the Product PDP Specification json schema
    #Given "<ProductPDPUrl>" endpoint for Product PDP Specification
    #And validate jsonSchema "KER_2606_ProductPDPSchema" for Product PDP Specification
#
    #Examples: 
      #| ProductPDPUrl                      |
      #| /api/product/4134286?storeId=66209 |

  #@Regression @Sanity @All @api @KER-2606 @ZYP-7054 @C-PDP
  #Scenario Outline: : Validate the Product PDP Specification with inventory Requried Property Values are not null
    #Given "<ProductPDPUrl>" endpoint for Product PDP Specification
    #Then read the API json response
    #And Validate the Product PDP "inventory" API Requried Property Value are not Null
      #| productId |
    #And Validate the "inventory" with "online" API Requried Property Value are not Null
      #| skuId             |
      #| availableQuantity |
      #| inventoryStatus   |
      #| onlineStoreName   |
      #| inventoryStatus   |
      #And Validate the "inventory" with "store" API Requried Property Value are not Null
      #| skuId |
#
    #Examples: 
      #| ProductPDPUrl                      |
      #| /api/product/4134286?storeId=66209 |

 