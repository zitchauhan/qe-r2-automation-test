Feature: Verify presence of Social Links

  @Web @All @KER-720 @C-HP  @ZYP_HP_K720-4339 @Regression @Rerun
  Scenario: Verify presence of of Social Links on footer from Home page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User will verify the presence of Facebook icon
    And User will verify the presence of twitter icon
    Then User will verify the presence of pinterest icon
    And User will verify the presence of youtube icon
    Then User will verify the presence of instagram icon

   @Web @All @KER-720  @C-HP @ZYP_HP_K720-5470 @Regression @Rerun
  Scenario: Verify presence of of Social Links on footer from PLP page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    Then User will verify the presence of Facebook icon
    And User will verify the presence of twitter icon
    Then User will verify the presence of pinterest icon
    And User will verify the presence of youtube icon
    Then User will verify the presence of instagram icon
    
    @Web @All @KER-720 @C-HP  @ZYP_HP_K720-5471 @Regression @Rerun
  Scenario: Verify presence of of Social Links on footer from PDP page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    Then User click on the product image
    And User will verify the presence of Facebook icon
    Then User will verify the presence of twitter icon
    And User will verify the presence of pinterest icon
    Then User will verify the presence of youtube icon
    And User will verify the presence of instagram icon  
  