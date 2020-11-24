Feature: To Verify user is be able to filter the products based on Price Ranges

  @1HR @Regression @Web @All @C-PLP @KER-552 @ZYP_PLP_K552-2726
  Scenario: Verify user is able to expand/collapse filter options
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User expands all Filter Options
    Then User should be able to see all Filter Options as expanded
    And User collapses all Filter Options
    Then User should be able to see all Filter Options as collapsed
    Then User closes the web application

  @Regression @Web @All @KER-552 @ZYP_PLP_K552-2908 @1HR @C-PLP
  Scenario: Verify As a User I should be able to select/deselect multiple price values
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User expands PRICE Filter Option
    When User selects multiple PRICE filter Options
    Then User should be able to see the selected PRICE filter Options in selected state
    When User deselects multiple PRICE filter Options
    Then User should be able to see the deselected PRICE filter Options in deselected state
    Then User closes the web application

  @Regression @Web @All @KER-552 @ZYP_PLP_K552-2900 @C-PLP @RegressionP2 @TC-OMNI-13419
  Scenario: Verify user is able to filter by price for search
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User expands PRICE Filter Option
    And user select the "PriceFilter" in filter
    Then Verify the selected price range product is "PriceFilter" displayed in product grid
    And user deselect the "PriceFilter" filter
    Then User closes the web application

  @Regression @Web @All @KER-552 @ZYP_PLP_K552-2902 @C-PLP @TC-OMNI-13419
  Scenario: Verify user is able to filter by price for search
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User expands PRICE Filter Option
    And user select the "PriceFilter" in filter
    Then Verify the selected price range product is "PriceFilter" displayed in product grid
    And user deselect the "PriceFilter" filter
    Then User closes the web application

  @Regression @Web @All @KER-552 @ZYP_PLP_K552-2897 @C-PLP @TC-OMNI-13419
  Scenario: Verify user is able to filter by price for search
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User expands PRICE Filter Option
    And user select the "PriceFilter" in filter

  @Regression @Web @All @KER-552 @ZYP_PLP_K552-3580 @C-PLP
  Scenario: As a customer I should also be able to see how many items will populate within each price value prior to selecting it
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User expands BRAND Filter Option
    Then Verify all the Brand filters have checkbox product count should be gatherthan zero
    Then Verify the Brand filters product count with checkboxs product count should be equal

  @Regression @Web @All @KER-552 @ZYP_PLP_K552-6128 @1HR @C-PLP
  Scenario: Verify user is able to expand/collapse filter options
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2
    And User expands BRAND Filter Option
    Then User closes the web application

  @Regression @Web @All @KER-552 @ZYP_PLP_K552-6130 @C-PLP
  Scenario: Verify As a User I should be able to select/deselect multiple price values
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2
    And User expands PRICE Filter Option
    Then User closes the web application

  @Regression @Web @All @KER-552 @ZYP_PLP_K552-6132 @1HR @C-PLP @TC-OMNI-13419
  Scenario: Verify user is able to filter by price for search
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2
    Then User closes the web application

  @RegressionP2 @Web @All @KER-552 @ZYP_PLP_K552-6134 @C-PLP  @TC-OMNI-13419
  Scenario: Verify user is able to filter by price for search
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2
	When user enters "SKUIdOfProductLs15" in the search box plcc
	And user click on search icon 
	Then User closes the web application

  @Regression @Web @All @KER-552 @ZYP_PLP_K552-6136 @C-PLP
  Scenario: As a customer I should also be able to see how many items will populate within each price value prior to selecting it
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2
    And User expands BRAND Filter Option
    Then Verify all the Brand filters have checkbox product count should be gatherthan zero
    Then Verify the Brand filters product count with checkboxs product count should be equal

  @Regression @Web @1HR @All @KER-552 @ZYP_PLP_K552-6129 @C-PLP
  Scenario: Verify user is able to expand/collapse filter options in Search Page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2
    And User expands PRICE Filter Option
    Then User closes the web application
    
  @Regression @Web @All @KER-552 @ZYP_PLP_K552-6131 @C-PLP
  Scenario: Verify As a User I should be able to select/deselect multiple price values in Search Page
    Given user launches the browser and navigates to "ASO_HOME" page
    When user enters "SKUIdOfProductLs15" in the search box plcc
	And user click on search icon 
	Then User closes the web application

  @Regression @Web @All @KER-552 @ZYP_PLP_K552-6133 @C-PLP @RBeta @TC-OMNI-13419
  Scenario: Verify user is able to filter by price for search in Search Page
    Given user launches the browser and navigates to "ASO_HOME" page
    When user enters "SKUIdOfProductLs15" in the search box plcc
	And user click on search icon 
	Then User closes the web application

  @Regression @Web @All @KER-552 @ZYP_PLP_K552-6135 @C-PLP @TC-OMNI-13419
  Scenario: Verify user is able to filter by price for search in Search Page
    Given user launches the browser and navigates to "ASO_HOME" page
   	When user enters "SKUIdOfProductLs15" in the search box plcc
	And user click on search icon 
	Then User closes the web application
    
  @Regression @Web @All @KER-552 @ZYP_PLP_K552-6137 @C-PLP
  Scenario: As a customer I should also be able to see how many items will populate within each price value prior to selecting it in Search Page
    Given user launches the browser and navigates to "ASO_HOME" page
    When user enters "SKUIdOfProductLs15" in the search box plcc
	And user click on search icon 
	Then User closes the web application

