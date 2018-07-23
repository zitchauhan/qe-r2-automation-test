Feature: To verify all sorting options are available

  @Sanity @Web @All @KER-615 @ZYP-2605 @Regression @PLP 
    Scenario: Verify user is able to see all sorting option PLP
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
     
      @Web @All @KER-615 @ZYP-5603 @Regression @PLP 
    Scenario: Verify user is able to see all sorting option CLP by navigation
    Given user launches the browser and navigates to "ASO_HOME" page
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
     
       
      @Web @All @KER-615 @ZYP-5605 @Regression @PLP 
    Scenario Outline: Verify user is able to see all sorting option CLP by search
    Given user launches the browser and navigates to "ASO_HOME" page
    When user enters "<SearchTerm>" in the search box 
    Then user is able to Most Relevant as a default sort option
    Examples:   
        |SearchTerm|
		|Nike shoe|
											     

    
