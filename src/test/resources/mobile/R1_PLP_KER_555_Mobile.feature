Feature: To verify user selecting/unselecting one or multiple 'filter by' values on a given facet (check-box)

  @1HR @Regression @C-PLP  @Mobile @All @KER-555  @ZYP_PLP_K555-3994 @Rerun
  Scenario Outline: Verify user is able to select/unselect one or multiple filter by values on  a given facet (check-box)
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    Then User clicks on the filter flyout
    And User expands COLOR Filter Option
    And user select the "<color_name>" in filter
    And User expands PRICE Filter Option
    And user selects the "<price>" in filter
    And User Click on apply filter button
    Then User clicks on the filter flyout
    And User expands COLOR Filter Option
    And User verify "<color_name>" Filter is selected
    And User expands PRICE Filter Option
    And User verify "<price>" Filter is selected
    And User Click on apply filter button
    Then Verify the selected filtered products "<price>""<brand_name>""<color>"are displayed in product grid
    Then User clicks on the filter flyout
    And User expands COLOR Filter Option
    And User unselect the "<color_name>" Filter
    And User expands PRICE Filter Option
    And User unselect the "<price>" Filter
    And User Click on apply filter button

    Examples: 
      | price        | brand_name | color_name |
      | $10 - $19.99 | Adidas     | Orange      |

   @Regression @C-PLP  @Mobile @All @KER-555  @ZYP_PLP_K555-6304 @Rerun
  Scenario Outline: Verify user is able to select/unselect one or multiple filter by values from CLP Page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L2
    And user scroll till filter flyout
    Then User clicks on the filter flyout
    And User expands COLOR Filter Option
    And user select the "<color_name>" in filter
    And User expands PRICE Filter Option
    And user select the "<price>" in filter
    And User Click on apply filter button
    Then User clicks on the filter flyout
    And User expands COLOR Filter Option
    And User verify "<color_name>" Filter is selected
    And User expands PRICE Filter Option
    And User verify "<price>" Filter is selected
    And User Click on apply filter button
    Then Verify the selected filtered products "<price>""<brand_name>""<color>"are displayed in product grid
    Then User clicks on the filter flyout
    And User expands COLOR Filter Option
    And User unselect the "<color_name>" Filter
    And User expands PRICE Filter Option
    And User unselect the "<price>" Filter
    And User Click on apply filter button

    Examples: 
      | price        | brand_name | color_name |
      | $10 - $19.99 | Adidas     | Orange      |

   @Regression  @C-PLP @Mobile @All @KER-555  @ZYP_PLP_K555-6306 @Rerun
  Scenario Outline: Verify user is able to select/unselect one or multiple filter by values from Home Page search
    Given user launches the browser and navigates to "ASO_HOME" page
    When user enters "productName" in the search box
    And user scroll till filter flyout
    Then User clicks on the filter flyout
    And User expands PRICE Filter Option
    And user select the "<price>" in filter
    And User expands COLOR Filter Option
    And user select the "<color_name>" in filter
    And User Click on apply filter button
    Then User clicks on the filter flyout
    And User expands PRICE Filter Option
    And User verify "<price>" Filter is selected
    And User expands COLOR Filter Option
    And User verify "<color_name>" Filter is selected
    And User Click on apply filter button
    Then Verify the selected filtered products "<price>""<brand_name>""<color>"are displayed in product grid
    Then User clicks on the filter flyout
    And User expands PRICE Filter Option
    And User unselect the "<price>" Filter
    And User expands COLOR Filter Option
    And User unselect the "<color_name>" Filter
    And User Click on apply filter button

    Examples: 
       | price        | brand_name | color_name |
       | $10 - $19.99 | Adidas     | Orange      |
