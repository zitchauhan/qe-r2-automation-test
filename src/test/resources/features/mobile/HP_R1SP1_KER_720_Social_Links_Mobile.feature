Feature: Verify presence of Socail Links

  @1HR  @C-HP @KER-720  @ZYP_K720-4342 @Regression @All @Mobile
  Scenario: Verify presence of Socail Links from Homepage
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User will verify the presence of Facebook icon
    And User will verify the presence of twitter icon
    Then User will verify the presence of pinterest icon
    And User will verify the presence of youtube icon
    Then User will verify the presence of instagram icon

    
      @C-HP  @KER-720  @ZYP_K720-5473 @Regression @All @Mobile
  Scenario: Verify presence of Socail Links from PLP
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    Then User will verify the presence of Facebook icon
    And User will verify the presence of twitter icon
    Then User will verify the presence of pinterest icon
    And User will verify the presence of youtube icon
    Then User will verify the presence of instagram icon
    
      @C-HP  @KER-720  @ZYP_K720-5472 @Regression @All @Mobile
  Scenario: Verify presence of Socail Links from PDP
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    Then User click on the product image
    And User will verify the presence of Facebook icon
    Then User will verify the presence of twitter icon
    And User will verify the presence of pinterest icon
    Then User will verify the presence of youtube icon
    And User will verify the presence of instagram icon