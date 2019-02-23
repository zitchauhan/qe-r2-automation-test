Feature: To verify the Inventory Specification API Services

  @Regression @Sanity @All @api @KER-1926 @ZYP-6990 @C-PDP 
  Scenario Outline: : Verify Inventory Specification for status code 200
    Given "<InventorySpecificationUrl>" endpoint for Inventory Specification
    Then Verify response status code as 200 for Inventory Specification

    Examples: 
      | InventorySpecificationUrl |
      | /api/inventory/4134286    |

  @Regression @Sanity @All @api @KER-1926 @ZYP-6991 @C-PDP 
  Scenario Outline: : validate the Inventory Specification json schema
    Given "<InventorySpecificationUrl>" endpoint for Inventory Specification
    And validate jsonSchema "KER_1926_InventorySpecificationSchema" for Inventory Specification

    Examples: 
      | InventorySpecificationUrl |
      | /api/inventory/4134286    |

@Regression @Sanity @All @api @KER-1926 @ZYP-6992 @C-PDP 
  Scenario Outline: : Validate the Inventory Specification with inventory Requried Property Values are not null
    Given "<InventorySpecificationUrl>" endpoint for Inventory Specification
    Then read the API json response
    And Validate the Inventory Specification API Requried Property Value are not Null
      | skuId             |
      | availableQuantity |
      | inventoryStatus   |
      | onlineStoreName   |
      #| deliveryMessage   |

    Examples: 
      | InventorySpecificationUrl |
      | /api/inventory/4134286    |

  @Regression @Sanity @All @api @KER-1926 @ZYP-6993 @C-PDP 
  Scenario Outline: : Verify Inventory Store Specification for status code 200
    Given "<InventoryStoreUrl>" endpoint for Inventory Store Specification
    Then Verify response status code as 200 for Inventory Store Specification

    Examples: 
      | InventoryStoreUrl                            |
      | /api/inventory/store/66209?productId=4134286 |

  @Regression @Sanity @All @api @KER-1926 @ZYP-6994 @C-PDP 
  Scenario Outline: : validate the Inventory Store Specification json schema
    Given "<InventoryStoreUrl>" endpoint for Inventory Store Specification
    And validate jsonSchema "KER_1926_InventoryStoreSchema" for Inventory Store Specification

    Examples: 
      | InventoryStoreUrl                            |
      | /api/inventory/store/66209?productId=4134286 |

  @Regression @Sanity @All @api @KER-1926 @ZYP-6995 @C-PDP 
  Scenario Outline: : Validate the Inventory Store Specification with inventory Requried Property Values are not null
    Given "<InventoryStoreUrl>" endpoint for Inventory Store Specification
    Then read the API json response
    And Validate the Inventory Store Specification API Requried Property Value are not Null
      | skuId     |
     # | productId |
      #| storeId   |
      #| value     |
     # | key       |

    Examples: 
      | InventoryStoreUrl                            |
      | /api/inventory/store/66209?productId=4134286 |

  @Regression @Sanity @All @api @KER-1926 @ZYP-6996 @C-PDP 
  Scenario Outline: : Verify Inventory Product Store Specification for status code 200
    Given "<InventoryProductStoreUrl>" endpoint for Inventory Product Store Specification
    Then Verify response status code as 200 for Inventory Product Store Specification

    Examples: 
      | InventoryProductStoreUrl                       |
      | /api/inventory?productId=4134286&storeId=66209 |

  @Regression @Sanity @All @api @KER-1926 @ZYP-6998 @C-PDP 
  Scenario Outline: : validate the Inventory Product Store Specification json schema
    Given "<InventoryProductStoreUrl>" endpoint for Inventory Product Store Specification
    And validate jsonSchema "KER_1926_InventoryProductStoreSchema" for Inventory Product Store Specification

    Examples: 
      | InventoryProductStoreUrl                       |
      | /api/inventory?productId=4134286&storeId=66209 |

  @Regression @Sanity @All @api @KER-1926 @ZYP-6999 @C-PDP 
  Scenario Outline: : Validate the Inventory Product Store Specification with inventory Requried Property Values are not null
    Given "<InventoryProductStoreUrl>" endpoint for Inventory Product Store Specification
    Then read the API json response
    And Validate the Inventory Store Specification API Requried Property Value are not Null
      | skuId     |
      | inventoryStatus |
      #| storeId   |
      #| value     |
      #| key       |
    And Validate the Inventory Specification API Requried Property Value are not Null
      | skuId             |
      | availableQuantity |
      | inventoryStatus   |
      | onlineStoreName   |
      #| deliveryMessage   |

    Examples: 
      | InventoryProductStoreUrl                       |
      | /api/inventory?productId=4134286&storeId=66209 |
  #@Regression @Sanity @All @api @KER-1926 @ZYP-??
  #Scenario Outline: : Validate the Inventory Specification with shoes Requried Property Values are not null
    #Given "<InventorySpecificationUrl>" endpoint for Inventory Specification
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
      #| InventorySpecificationUrl                    | SearchProductText |
      #| /api/search/productSuggestions/shoes | shoes             |
#
  #@Regression @Sanity @All @api @KER-1926 @ZYP-??
  #Scenario Outline: : Validate the Inventory Specification with Nike Requried Property Values are not null
    #Given "<InventorySpecificationUrl>" endpoint for Inventory Specification
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
      #| InventorySpecificationUrl                    | SearchProductText |
      #| /api/search/productSuggestions/nike | nike             |
  #
