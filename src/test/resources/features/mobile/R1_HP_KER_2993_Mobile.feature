Feature: Components: Rebate Promo Component


 @Mobile @Regression @C-HP  @All @KER-2993 @ZYP_HP_K2993-4928  @1HR @CR-AG
  Scenario: Verify presence of Global Element Footer under this is Academy from Homepage
    Given user launches the browser and navigates to "ASO_HOME" page
     And User will click on expand button for needhelp
    And User will verify the presence of Rebates
    Then User navigate to rebates page
    And User able to see all neccessary details inside it
   