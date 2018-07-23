Feature: Verify presence of Socail Links

  @Sanity  @HomePage @KER-720 @ZYP-4342 @Regression @All @Mobile
  Scenario: Verify presence of Socail Links from Homepage
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User will verify the presence of Facebook icon
    And User will verify the presence of twitter icon
    Then User will verify the presence of pinterest icon
    And User will verify the presence of youtube icon
    Then User will verify the presence of instagram icon

    
     @Sanity @HomePage  @KER-720 @ZYP-5473 @Regression @All @Mobile
  Scenario: Verify presence of Socail Links from PLP
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    Then User will verify the presence of Facebook icon
    And User will verify the presence of twitter icon
    Then User will verify the presence of pinterest icon
    And User will verify the presence of youtube icon
    Then User will verify the presence of instagram icon
    
     @Sanity @HomePage  @KER-720 @ZYP-5472 @Regression @All @Mobile
  Scenario: Verify presence of Socail Links from PDP
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    Then User click on the product image
    And User will verify the presence of Facebook icon
    Then User will verify the presence of twitter icon
    And User will verify the presence of pinterest icon
    Then User will verify the presence of youtube icon
    And User will verify the presence of instagram icon