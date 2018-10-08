Feature: To verify all sorting options are available

  @1HR @Web @All @KER-615 @ZYP_PLP_K615-2605 @Regression @C-PLP @1HR @CR-RKA
  Scenario: Verify user is able to see all sorting option PLP
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    Then user is able to Best selling as a default sort option
    And user able to see all sorting options after clicking on sort by filter
      | Most Relevant    |
      | Brand (A-Z)      |
      | Price (Low-High) |
      | Price (High-Low) |
      | Top Rated        |
      | Most Viewed      |
      | Best Selling     |
      | New Arrivals     |

  @Web @All @KER-615 @ZYP_PLP_K615-5603 @Regression @C-PLP @CR-RKA
  Scenario: Verify user is able to see all sorting option CLP by navigation
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2
    Then user is able to Best selling as a default sort option
    And user able to see all sorting options after clicking on sort by filter
      | Most Relevant    |
      | Brand (A-Z)      |
      | Price (Low-High) |
      | Price (High-Low) |
      | Top Rated        |
      | Most Viewed      |
      | Best Selling     |
      | New Arrivals     |

  @Web @All @KER-615 @ZYP_PLP_K615-5605 @Regression @C-PLP @CR-RKA
  Scenario: Verify user is able to see all sorting option CLP by search
    Given user launches the browser and navigates to "ASO_HOME" page
    When user enters "productName" in the search box
    Then user is able to Most Relevant as a default sort option


  @Web @KER-615 @ZYP_PLP_K615-2896 @Regression @C-PLP @CR-RKA
  Scenario: Verify user is shown default sort option as Most Relevent for search
    Given user launches the browser and navigates to "ASO_HOME" page
    When user enters "productName" in the search box
    Then user is able to Most Relevant as a default sort option


  @Web @KER-615 @ZYP_PLP_K615-2898 @Regression @C-PLP @CR-RKA
  Scenario: Verify user is shown default sort option as BEST SELLING for PLP/CLP
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L3 from home page for grid sorting
    Then User should be able to see L3 Page for grid sorting
    Then User Check for the by default value as Best Selling
