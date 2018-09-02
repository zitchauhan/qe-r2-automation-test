Feature: To Verify the presence of "Search Box" in the Global Header

#  @C-HP @Web @Regression @KER-724  @ZYP_HP_K724-8515
#  Scenario: Verify presence of search box with search icon on Home page.
#    Given user launches the browser and navigates to "ASO_HOME" page
#    Then User should be able to see Search Box
#
#  @C-HP @Web @Regression @KER-724  @ZYP_HP_K724-8514
#  Scenario: Verify presence of search box with search icon on L1 page.
#    Given user launches the browser and navigates to "ASO_HOME" page
#    Then User clicks on the burger menu
#    Then User navigates to L1
#    And User click on search icon
#    Then User should be able to see Search Box
#
#  @C-HP @Web @Regression @KER-724  @ZYP_HP_K724-8513
#  Scenario: Verify presence of search box with search icon on L2 page.
#    Given user launches the browser and navigates to "ASO_HOME" page
#    Then User clicks on the burger menu
#    Then User navigates to L2
#    And User click on search icon
#    Then User should be able to see Search Box

  @C-HP @Web @Regression @KER-724  @ZYP_HP_K724-2807
  Scenario: Verify presence of search box with search icon on L3 page.
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L3
    And User click on search icon
    Then User should be able to see Search Box
    Then verfiy PDP page is display
