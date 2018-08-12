Feature: To verify Product Badging and Status - Ad Feature Display

  @Web @All @KER-621  @ZYP_PLP_K621-6174 @Regression @C-PLP @CR-SG 
    Scenario: Verify the color of CLEARANCE BADGE
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2
    And user expands the Ad badge filter
    Then user click on clearance badge
    And user verify the clearance badge color
    
    @Web @All @KER-621  @ZYP_PLP_K621-6175 @Regression @C-PLP @CR-SG 
    Scenario: Verify the color of ONLINE BADGE
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2
    And user expands the Ad badge filter
    Then user click on price badge
    And user verify the price badge color
    
    @Web @All @KER-621  @ZYP_PLP_K621-6182 @Regression @C-PLP @CR-SG 
    Scenario Outline: Verify the color of SHIP TO STORE BADGE
    Given user launches the browser and navigates to "ASO_HOME" page 
	Then User enter the search "<data>"
    And User click on search icon
    And user verify the ship to store badge color
   Examples:
   |data|
   |guns|
   
    @Web @All @KER-621  @ZYP_PLP_K621-6183 @Regression @C-PLP @CR-SG 
    Scenario: Verify the color of ONLINE BADGE
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2
    And user expands the Ad badge filter
    Then user click on online badge
    And user verify the online badge color
    
      