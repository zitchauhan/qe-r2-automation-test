Feature: To verify the MiniCart API Services

  @Regression @Sanity @All @api @KER-275 @ZYP-3058 @C-PDP
  Scenario Outline: : Verify MiniCart with sign-in user for status code 200
    Given "<minicartSummaryUrl>" endpoint for MiniCart with Sign-in user "<UserName>""<Password>"
    Then Verify response status code as 200 for Minicart

    Examples: 
      | minicartSummaryUrl          | UserName                     | Password   |
      | /api/cart/440007001/summary | qaautomationtest@yopmail.com | Qwerty@123 |

  @Regression @Sanity @All @api @KER-275 @ZYP-6580 @C-PDP
  Scenario Outline: : validate the MiniCart sign-in user json schema
    Given "<minicartSummaryUrl>" endpoint for MiniCart with Sign-in user "<UserName>""<Password>"
    And validate jsonSchema "KER-725-MinicartSchema" for MiniCart with SignIn

    Examples: 
      | minicartSummaryUrl          | UserName                     | Password   |
      | /api/cart/440007001/summary | qaautomationtest@yopmail.com | Qwerty@123 |

  @Regression @Sanity @All @api @KER-275 @ZYP-6581 @C-PDP
  Scenario Outline: : Validate the MiniCart sign-in user Requried Property Values
    Given "<minicartSummaryUrl>" endpoint for MiniCart with Sign-in user "<UserName>""<Password>"
    Then Read the MiniCartSignIn json response
    And Validate the MiniCartSignIn Requried Property Value are not Null
      | orderId  |
      | currency |
    And Validate the MiniCartSignIn quantity Requried Property Value are not Null
      | totalCartQuantity |

    Examples: 
      | minicartSummaryUrl          | UserName                     | Password   |
      | /api/cart/440007001/summary | qaautomationtest@yopmail.com | Qwerty@123 |

  @Regression @Sanity @All @api @KER-275 @ZYP-6582 @C-PDP
  Scenario Outline: Verify MiniCart user for status code 503 for Not Found
    Given "<minicartSummaryUrl>" endpoint for Product PDP Specification
    Then Verify response status code as 200 for Minicart

    Examples: 
      | minicartSummaryUrl          |
      | /api/cart/440007001/summary |
#
  #@Regression @Sanity @All @api @KER-275 @ZYP-??
  #Scenario Outline: Verify MiniCart sign in user for status code 400 for Bad Request
    #Given "<minicartSummaryUrl>" endpoint for MiniCart with Sign-in user "<UserName>""<Password>"
    #Then Verify Error response status code as 400 for Category
#
    #Examples: 
      #| minicartSummaryUrl          | UserName            | Password   |
      #| /api/cart/440007001/summary | qaautomationtest@yopmail.com | Qwerty@123 |
