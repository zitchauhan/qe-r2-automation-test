Feature: To Verify the Add To Cart Functionality
          
   @Regression @Mobile @C-PLP @All  @ZYP_PLP_K1992-5532 @KER-1992 @Rerun @1HR
  Scenario: To verify "Related Categories" as links and are clickable & navigates to new landing page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L2
    And user scroll till filter flyout
    Then User clicks on the filter flyout
    And user is able to see Related Categories in the filters
    Then user clicks on the Related Categories drawer
    And user clicks on one of the links in the drawer
    Then user navigates to the respected link
