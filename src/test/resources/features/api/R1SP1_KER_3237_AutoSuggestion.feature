Feature: To verify the Auto Suggestion API Services

  @Regression @Sanity @All @api @KER-3237 @ZYP-6771
  Scenario Outline: : Verify Auto Suggestion for status code 200
    Given "<AutoSuggestionSummaryUrl>" endpoint for Auto Suggestion
    Then Verify response status code as 200 for Auto Suggestion

    Examples: 
      | AutoSuggestionSummaryUrl      |
      | /api/search/autosuggest/shirt |

  @Regression @Sanity @All @api @KER-3237 @ZYP-6772
  Scenario Outline: : validate the Auto Suggestion json schema
    Given "<AutoSuggestionSummaryUrl>" endpoint for Auto Suggestion
    And validate jsonSchema "KER-3237-AutoSuggestionSchema" for Auto Suggestion

    Examples: 
      | AutoSuggestionSummaryUrl      |
      | /api/search/autosuggest/shirt |

  @Regression @Sanity @All @api @KER-3237 @ZYP-6773
  Scenario Outline: : Validate the Auto Suggestion Requried Property Values contains with shirt
    Given "<AutoSuggestionSummaryUrl>" endpoint for Auto Suggestion
    Then Read the Auto Suggestion json response
    And Validate the Auto Suggestion Requried Property Values contains with"<SuggestionText>"

    Examples: 
      | AutoSuggestionSummaryUrl      | SuggestionText |
      | /api/search/autosuggest/shirt | shirt          |

  @Regression @Sanity @All @api @KER-3237 @ZYP-6774
  Scenario Outline: : Validate the Auto Suggestion Requried Property Values contains with shoes
    Given "<AutoSuggestionSummaryUrl>" endpoint for Auto Suggestion
    Then Read the Auto Suggestion json response
    And Validate the Auto Suggestion Requried Property Values contains with"<SuggestionText>"

    Examples: 
      | AutoSuggestionSummaryUrl      | SuggestionText |
      | /api/search/autosuggest/shoes | shoes          |

  @Regression @Sanity @All @api @KER-3237 @ZYP-6775
  Scenario Outline: : Validate the Auto Suggestion Requried Property Values contains with nike
    Given "<AutoSuggestionSummaryUrl>" endpoint for Auto Suggestion
    Then Read the Auto Suggestion json response
    And Validate the Auto Suggestion Requried Property Values contains with"<SuggestionText>"

    Examples: 
      | AutoSuggestionSummaryUrl     | SuggestionText |
      | /api/search/autosuggest/nike | nike           |
      
      
  #@Regression @Sanity @All @api @KER-3237 @ZYP-??
  #Scenario Outline: Verify Auto Suggestion for status code 503 for Not Found
    #Given "<Auto SuggestionSummaryUrl>" endpoint for Auto Suggestion
    #Then Verify response status code as 503 for Auto Suggestion
    #And Verify the response message "operation failed" for Auto Suggestion
#
    #Examples: 
      #| Auto SuggestionSummaryUrl   | UserName             | Password     |
      #| /api/cart/440007001/summary | santoshqa4@gmail.com | sapient12433 |
#
  #@Regression @Sanity @All @api @KER-3237 @ZYP-??
  #Scenario Outline: Verify Auto Suggestion sign in user for status code 400 for Bad Request
    #Given "<Auto SuggestionSummaryUrl>" endpoint for Auto Suggestion with Sign-in user "<UserName>""<Password>"
    #Then Verify Error response status code as 400 for Category
#
    #Examples: 
      #| Auto SuggestionSummaryUrl          | UserName            | Password   |
      #| /api/cart/440007001/summary | santoshqa@gmail.com | sapient123 |
