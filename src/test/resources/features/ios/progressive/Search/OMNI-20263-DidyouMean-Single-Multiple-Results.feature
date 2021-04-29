Feature: Did you Mean - Single & Multiple Results

@Sprint5 @ST-OMNI-20263 
Scenario: Validate  the user see single configured did u mean search suggestion on search result page when searched for configurable keyword
Given User launches the application
    And User Clicks On MaY Be Later
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword"
    Then user see "showing result for label" on search result page 
    Then user see "related keywords" on search result page 
    Then user see "search insteed of label" on search result page 
    Then user see "searched keyword button" on search result page 
    #Then i choose to validate that value of "search keyword" and "search suggestion button" is same on search result page
    Then i choose to click on "searched keyword button" on search result page 
    #Then user "see No product found" page 
    #And User sees all products related to search keyword