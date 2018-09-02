Feature:  Components: Results section Title - SRP & Null SRP

  @C-SLR @Web @All @Regression  @KER-1959  @ZYP_SLR_K1959-4217 @Rerun @1HR @CR-AG
  Scenario Outline: To verify display of zero search result message on Null Search Results page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User enter the invalid SKU search "<data>"
    And User click on search icon
    Then user verifies the error null search result page
     Examples:
    |data|
    |sachinetendulkar|
    
      @C-SLR @Web @All @Regression  @KER-1959  @ZYP_SLR_K1959-4295 @Rerun @1HR @CR-AG
  Scenario Outline: [SOLR] - To verify display of null search result message on Search Results page when product is not available
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User enter the invalid SKU search "<data>"
    And User click on search icon
    Then user verifies the error null search result page
     Examples:
    |data|
    |chacos|