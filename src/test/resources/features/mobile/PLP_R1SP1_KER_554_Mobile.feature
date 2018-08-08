Feature:  [Mobile] User should be able to select/deselect multiple facets and verify facets value




@Regression @Web  @KER-554  @ZYP_K554-9074  @C-PLP
 Scenario: Verify As a User I should be able to select/deselect multiple price values
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L2
    And user scroll till filter flyout
    Then User clicks on the filter flyout
    And User expands PRICE Filter Option
    When User selects multiple PRICE filter Options
    Then User should be able to see the selected PRICE filter Options in selected state
    When User deselects multiple PRICE filter Options
    Then User should be able to see the deselected PRICE filter Options in deselected state
    Then User closes the web application



  