Feature: To verify "Related Categories" as links and are clickable & navigates to new landing page

  @Regression @Web @All @C-PLP   @ZYP_K1992-3181 @KER-1992
  Scenario: To verify "Related Categories" as links and are clickable & navigates to new landing page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2
    And user is able to see Related Categories in the filters
    Then user clicks on the Related Categories drawer
    And user clicks on one of the links in the drawer
    Then user navigates to the respected link
