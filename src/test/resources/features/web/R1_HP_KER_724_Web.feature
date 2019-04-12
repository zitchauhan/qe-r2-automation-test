Feature: To Verify the presence of "Search Box" in the Global Header

  @C-HP @Web @Regression @KER-724 @ZYP_HP_K724-8430 @CR-AG
  Scenario: Verify presence of search box with search icon on Home page.
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box

  @C-HP @Web @Regression @KER-724 @ZYP_HP_K724-8431 @CR-AG
  Scenario: Verify presence of search box with search icon on L1 page.
    Given user launches the browser and navigates to "ASO_HOME" page
    Then navigates to LOne page

  @C-HP @Web @Regression @KER-724 @ZYP_HP_K724-8433 @CR-AG
  Scenario: Verify presence of search box with search icon on L2 page.
    Given user launches the browser and navigates to "ASO_HOME" page
    Then navigates to LTwo page

  @C-HP @Web @Regression @KER-724 @ZYP_HP_K724-1975 @CR-AG
  Scenario: Verify presence of search box with search icon on L3 page.
    Given user launches the browser and navigates to "ASO_HOME" page
    Then navigates to LThree page
    
