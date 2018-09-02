Feature: To verify user selecting/unselecting one or multiple 'filter by' values on a given facet (check-box)

  @Sanity @Regression @Web @All @C-PLP  @KER-555  @ZYP_PLP_K555-2619
  Scenario Outline: Verify user is able to select/unselect one or multiple filter by values on  a given facet (check-box)
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User expands PRICE Filter Option
    And user select the "<price>" in filter
    And User expands BRAND Filter Option
    And user select the "<brand_name>" in filter
    And User expands COLOR Filter Option
    And user select the "<color_name>" in filter
    Then Verify the selected filtered products "<price>""<brand_name>""<color>"are displayed in product grid
    Then User should be able to unselect "<price>""<brand_name>""<color>" the same checkbox for all the filters
    Then User closes the web application

    Examples: 
      | price        | brand_name | color_name |
      | $10 - $19.99 | Adidas     | Black      |

  @Sanity @Regression @Web @All @KER-555  @ZYP_PLP_K555-6309 @C-PLP
  Scenario Outline: Verify user is able to select/unselect one or multiple filter by values from CLP Page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2
    And User expands PRICE Filter Option
    And user select the "<price>" in filter
    And User expands BRAND Filter Option
    And user select the "<brand_name>" in filter
    And User expands COLOR Filter Option
    And user select the "<color_name>" in filter
    Then Verify the selected filtered products "<price>""<brand_name>""<color>"are displayed in product grid
    Then User should be able to unselect "<price>""<brand_name>""<color>" the same checkbox for all the filters
    Then User closes the web application

    Examples: 
      | price        | brand_name | color_name |
      | $10 - $19.99 | Adidas     | Black      |

  @Sanity @Regression @Web @All @KER-555  @ZYP_PLP_K555-6310 @C-PLP
  Scenario Outline: Verify user is able to select/unselect one or multiple filter by values from Home Page search
    Given user launches the browser and navigates to "ASO_HOME" page
    When user enters "SearchTerm" in the search box
    And User expands PRICE Filter Option
    And user select the "<price>" in filter
    And User expands BRAND Filter Option
   And user select the "<brand_name>" in filter
    And User expands COLOR Filter Option
    And user select the "<color_name>" in filter
    Then Verify the selected filtered products "<price>""<brand_name>""<color>"are displayed in product grid
    Then User should be able to unselect "<price>""<brand_name>""<color>" the same checkbox for all the filters
    Then User closes the web application

  Examples: 
    | price        | brand_name | color_name |
    | $10 - $19.99 | Adidas     | Black      |
