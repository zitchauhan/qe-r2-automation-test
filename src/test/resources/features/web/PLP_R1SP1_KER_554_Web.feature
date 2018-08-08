Feature:  [Web] User should be able to select/deselect multiple facets and verify facets value



@Regression @Web  @KER-554  @ZYP_K554-2875 @C-PLP
Scenario: Verify user is able to filter by price for search
    Given user launches the browser and navigates to "ASO_HOME" page
     Then User navigates till PLP
    And User expands PRICE Filter Option
    When User selects multiple PRICE filter Options
    Then User should be able to see the selected PRICE filter Options in selected state
    When User deselects multiple PRICE filter Options
    Then User should be able to see the deselected PRICE filter Options in deselected state
    Then User closes the web application
