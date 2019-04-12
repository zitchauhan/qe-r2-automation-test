Feature: Verify the Auto Correct in search and search suggestions

  @C-SLR @Web @All  @Regression @KER-3274  @ZYP_SLR_K3274-6334 @Rerun  @CR-AG @RBeta
  Scenario: Verify the user verifies the title for the closest matching term
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then user enters "SLRdata" in the searchbox
    Then User closes the web application


  @C-SLR @Web @All  @Regression @KER-3274  @ZYP_SLR_K3274-6338 @Rerun  @CR-AG @RBeta
   Scenario: Verify the user verifies the label for the closest matching term
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then user enters "SLRdata" in the searchbox
    Then User verifies the label for closest matching term
    Then User closes the web application


  @C-SLR @Web @All  @Regression @KER-3274  @ZYP_SLR_K3274-6339 @Rerun  @CR-AG @RBeta
   Scenario: Verify the user verifies the respective search results are displayed for the closest matching term
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then user enters "SLRdata" in the searchbox
    Then User closes the web application


  @C-SLR @Web @All  @Regression @KER-3274  @ZYP_SLR_K3274-6342 @Rerun @RBeta
   Scenario: Verify the user verifies the respective search results are clickable for the closest matching term
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then user enters "SLRdata" in the searchbox
    Then User closes the web application

