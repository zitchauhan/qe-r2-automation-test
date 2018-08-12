Feature: To verify all sorting options are available

  @Mobile @C-PLP @All @KER-615  @ZYP_PLP_K615-4749 @Regression @1HR @Rerun
    Scenario: Verify user is able to see all sorting option
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    Then user is able to Best selling as a default sort option
    And user able to see all sorting options after clicking on sort by filter
     |Most Relevant|
     |Brand (A-Z)|
     |Price (Low-High)|
     |Price (High-Low)|
     |Top Rated|
     |Most Viewed|
     |Best Selling|
     |New Arrivals|
  
   @Mobile  @C-PLP @All @KER-615  @ZYP_PLP_K615-5604 @Regression @Rerun
    Scenario: Verify user is able to see all sorting option CLP
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L2
    Then user is able to Best selling as a default sort option
    And user able to see all sorting options after clicking on sort by filter
     |Most Relevant|
     |Brand (A-Z)|
     |Price (Low-High)|
     |Price (High-Low)|
     |Top Rated|
     |Most Viewed|
     |Best Selling|
     |New Arrivals|
     
       
      @Mobile  @C-PLP @All @KER-615  @ZYP_PLP_K615-5606 @Regression @Rerun
    Scenario Outline: Verify user is able to see all sorting option CLP by search
    Given user launches the browser and navigates to "ASO_HOME" page
    When user enters "<SearchTerm>" in the search box 
    Then user is able to Most Relevant as a default sort option
    Examples:   
        |SearchTerm|
		|Nike shoe|
											     
     
  
