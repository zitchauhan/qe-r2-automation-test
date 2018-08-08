Feature: To verify the Search Suggestion API Services

  @Regression @Sanity @All @api @KER-3237 @ZYP-6777 @C-SLR
  Scenario Outline: : Verify Search Suggestion for status code 200
    Given "<SearchSuggestionUrl>" endpoint for Search Suggestion
    Then Verify response status code as 200 for Search Suggestion

    Examples: 
      | SearchSuggestionUrl            |
      | /api/search/sitecontent/shirts |

  @Regression @Sanity @All @api @KER-3237 @ZYP-6778 @C-SLR
  Scenario Outline: : validate the Search Suggestion json schema
    Given "<SearchSuggestionUrl>" endpoint for Search Suggestion
    And validate jsonSchema "KER-3237-SearchSuggestion" for Search Suggestion

    Examples: 
      | SearchSuggestionUrl            |
      | /api/search/sitecontent/shirts |

  @Regression @Sanity @All @api @KER-3237 @ZYP-6779 @C-SLR
  Scenario Outline: : Validate the Search with shirts Suggestion Requried Property Values are not null
    Given "<SearchSuggestionUrl>" endpoint for Search Suggestion
    Then Read the Search Suggestion json response
    And Validate the Search Suggestion "<suggestionType>" Requried Property Values are not Null
      | name |
      | url  |
    And Validate the Search Suggestion "<suggestionType>" Requried Property Values contains with "<SuggestionText>"
      | name |

    Examples: 
      | SearchSuggestionUrl            | suggestionType     | SuggestionText |
      | /api/search/sitecontent/shirts | categorysuggestion | shirts         |

  @Regression @Sanity @All @api @KER-3237 @ZYP-6780 @C-SLR
  Scenario Outline: : Validate the Search with shoes Suggestion Requried Property Values are not null
    Given "<SearchSuggestionUrl>" endpoint for Search Suggestion
    Then Read the Search Suggestion json response
    And Validate the Search Suggestion "<suggestionType>" Requried Property Values are not Null
      | name |
      | url  |
    And Validate the Search Suggestion "<suggestionType>" Requried Property Values contains with "<SuggestionText>"
      | name |

    Examples: 
      | SearchSuggestionUrl           | suggestionType     | SuggestionText |
      | /api/search/sitecontent/shoes | categorysuggestion | shoes          |

  @Regression @Sanity @All @api @KER-3237 @ZYP-6781 @C-SLR
  Scenario Outline: : Validate the Search with nike brand Suggestion Requried Property Values are not null
    Given "<SearchSuggestionUrl>" endpoint for Search Suggestion
    Then Read the Search Suggestion json response
    And Validate the Search Suggestion "<suggestionType>" Requried Property Values are not Null
      | name |
      | url  |
    And Validate the Search Suggestion "<suggestionType>" Requried Property Values contains with "<SuggestionText>"
      | name |

    Examples: 
      | SearchSuggestionUrl          | suggestionType     | SuggestionText |
      | /api/search/sitecontent/nike | brandsuggestion | nike           |
  #@Regression @Sanity @All @api @KER-3237 @ZYP-??
  #Scenario Outline: Verify Search Suggestion for status code 503 for Not Found
    #Given "<Search SuggestionSummaryUrl>" endpoint for Search Suggestion
    #Then Verify response status code as 503 for Search Suggestion
    #And Verify the response message "operation failed" for Search Suggestion
#
    #Examples: 
      #| Search SuggestionSummaryUrl   | UserName             | Password     |
      #| /api/cart/440007001/summary | santoshqa4@gmail.com | sapient12433 |
#
  #@Regression @Sanity @All @api @KER-3237 @ZYP-??
  #Scenario Outline: Verify Search Suggestion sign in user for status code 400 for Bad Request
    #Given "<Search SuggestionSummaryUrl>" endpoint for Search Suggestion with Sign-in user "<UserName>""<Password>"
    #Then Verify Error response status code as 400 for Category
#
    #Examples: 
      #| Search SuggestionSummaryUrl          | UserName            | Password   |
      #| /api/cart/440007001/summary | santoshqa@gmail.com | sapient123 |
