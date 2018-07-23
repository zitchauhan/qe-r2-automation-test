Feature: To Verify user is be able to filter the products based on Price Ranges

  @Sanity @Regression @PLP  @Mobile @All @KER-552 @ZYP-2894 @Rerun
  Scenario: Verify user is able to expand/collapse filter options
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    Then User clicks on the filter flyout
    And User expands all Filter Options
    Then User should be able to see all Filter Options as expanded
    And User collapses all Filter Options
    Then User should be able to see all Filter Options as collapsed
    Then User closes the web application

  @Regression @Mobile  @PLP @All @KER-552 @ZYP-2899  @Sanity @Rerun
  Scenario: Verify As a User I should be able to select/deselect multiple price values
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    Then User clicks on the filter flyout
    And User expands PRICE Filter Option
    When User selects multiple PRICE filter Options
    Then User should be able to see the selected PRICE filter Options in selected state
    When User deselects multiple PRICE filter Options
    Then User should be able to see the deselected PRICE filter Options in deselected state
    Then User closes the web application

  @Regression @Mobile @PLP  @All @KER-552 @ZYP-2904 @Rerun
  Scenario Outline: Verify user is able to filter by price for search
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    Then User clicks on the burger menu
    When User navigates to L2
    And user scroll till filter flyout
    Then User clicks on the filter flyout
    And User expands PRICE Filter Option
    And user select the "<price>" in filter
    #Then Verify the selected price range product is displayed in product grid
    And user deselect the "<price>" filter
    Then Verify the list of product is dispalyed are same as before filter
    Then User closes the web application

    Examples: 
      | price          |
      | $100 - $199.99 |

  @Regression @Mobile  @PLP @All @KER-552 @ZYP-2901 @Rerun
  Scenario Outline: Verify user is able to filter by price for search
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    Then User clicks on the filter flyout
    And User expands PRICE Filter Option
    And user select the "<price>" in filter
    #Then Verify the selected price range product is displayed in product grid
    And user deselect the "<price>" filter
    Then Verify the list of product is dispalyed are same as before filter
    Then User closes the web application

    Examples: 
      | price        |
      | $10 - $19.99 |

  @Regression @Mobile @PLP  @All @KER-552 @ZYP-3997 @Rerun
  Scenario Outline: Verify user is able to filter by price for search
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    #    When User enters in Required_Product with "<search_Value>" and click on Go button
    #    Then User should be navigated to Search_Page
    #  Then User navigates till PLP
    Then User clicks on the filter flyout
    And user select the "<price>" in filter
    # Then Verify the selected price range product is displayed in product grid
    Then User closes the web application

    Examples: 
      | search_Value | price          |
      | Nike Shoes   | $100 - $199.99 |

  @Regression @Mobile @PLP  @All @KER-552 @ZYP-3995  @Sanity @Rerun 
  Scenario Outline: As a customer I should also be able to see how many items will populate within each price value prior to selecting it
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    Then User clicks on the filter flyout
    And User expands PRICE Filter Option
    And user select the "<price>" in filter
    And User Click on apply filter button
    Then User clicks on the filter flyout
    #Then Verify all the price filters have checkbox product count should be gatherthan zero
    Then Verify the price filters product count with checkboxs product count should be equal

    Examples: 
      | price        |
      | $10 - $19.99 |

 
 @Regression @Mobile  @PLP @All @KER-552 @ZYP-6138 @Rerun
  Scenario: Verify user is able to expand/collapse filter options
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L2
    And user scroll till filter flyout
    Then User clicks on the filter flyout
    And User expands all Filter Options
    Then User should be able to see all Filter Options as expanded
    And User collapses all Filter Options
    Then User should be able to see all Filter Options as collapsed
    Then User closes the web application

  @Regression @Mobile @PLP  @All @KER-552 @ZYP-6140 @Rerun
  Scenario: Verify As a User I should be able to select/deselect multiple price values
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L2
    #Then User navigates till PLP
    And user scroll till filter flyout
    Then User clicks on the filter flyout
    And User expands PRICE Filter Option
    When User selects multiple PRICE filter Options
    Then User should be able to see the selected PRICE filter Options in selected state
    When User deselects multiple PRICE filter Options
    Then User should be able to see the deselected PRICE filter Options in deselected state
    Then User closes the web application

  @Regression @Mobile  @PLP @All @KER-552 @ZYP-6142  @Sanity  @Rerun
  Scenario Outline: Verify user is able to filter by price for search
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L2
    # Then User navigates till PLP
    And user scroll till filter flyout
    Then User clicks on the filter flyout
    And User expands PRICE Filter Option
    And user select the "<price>" in filter
    #Then Verify the selected price range product is displayed in product grid
    And user deselect the "<price>" filter
    Then Verify the list of product is dispalyed are same as before filter
    Then User closes the web application

    Examples: 
      | price        |
      | $10 - $19.99 |

  @Regression @Mobile  @PLP @All @KER-552 @ZYP-6144 @Rerun
  Scenario Outline: Verify user is able to filter by price for search
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L2
    #    When User enters in Required_Product with "<search_Value>" and click on Go button
    #    Then User should be navigated to Search_Page
    #  Then User navigates till PLP
    And user scroll till filter flyout
    Then User clicks on the filter flyout
    And user select the "<price>" in filter
    # Then Verify the selected price range product is displayed in product grid
    Then User closes the web application

    Examples: 
      | search_Value | price          |
      | Nike Shoe   | $100 - $199.99 |

  @Regression @Mobile @PLP  @All @KER-552 @ZYP-6146  @Sanity  @Rerun
  Scenario Outline: As a customer I should also be able to see how many items will populate within each price value prior to selecting it
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L2
    # Then User navigates till PLP
    And user scroll till filter flyout
    Then User clicks on the filter flyout
    And User expands PRICE Filter Option
    And user select the "<price>" in filter
    And User Click on apply filter button
    Then User clicks on the filter flyout
    #  Then Verify all the price filters have checkbox product count should be gatherthan zero
    Then Verify the price filters product count with checkboxs product count should be equal

    Examples: 
      | price        |
      | $10 - $19.99 |


  @Regression @Mobile  @PLP @All @KER-552 @ZYP-6139  @Sanity @Rerun
  Scenario Outline: Verify user is able to expand/collapse filter options in Search Page Mobile
    Given user launches the browser and navigates to "ASO_HOME" page
    When user enters "<SearchTerm>" in the search box
    Then User clicks on the filter flyout
    And User expands all Filter Options
    Then User should be able to see all Filter Options as expanded
    And User collapses all Filter Options
    Then User should be able to see all Filter Options as collapsed
    Then User closes the web application

    Examples: 
      | SearchTerm |
      | Nike Shoe |

  @Regression @Mobile  @PLP @All @KER-552 @ZYP-6141 @Rerun
  Scenario Outline: Verify As a User I should be able to select/deselect multiple price values in Search Page Mobile
    Given user launches the browser and navigates to "ASO_HOME" page
    When user enters "<SearchTerm>" in the search box
    Then User clicks on the filter flyout
    And User expands PRICE Filter Option
    When User selects multiple PRICE filter Options
    Then User should be able to see the selected PRICE filter Options in selected state
    When User deselects multiple PRICE filter Options
    Then User should be able to see the deselected PRICE filter Options in deselected state
    Then User closes the web application

    Examples: 
      | SearchTerm |
      | Nike Shoe |

  @Regression @Mobile  @PLP @All @KER-552 @ZYP-6143 @Rerun
  Scenario Outline: Verify user is able to filter by price for search in Search Page Mobile
    Given user launches the browser and navigates to "ASO_HOME" page
    When user enters "<SearchTerm>" in the search box
    Then User clicks on the filter flyout
    And User expands PRICE Filter Option
    And user select the "<price>" in filter
    #Then Verify the selected price range product is displayed in product grid
    And user deselect the "<price>" filter
    Then Verify the list of product is dispalyed are same as before filter
    Then User closes the web application

    Examples: 
      | SearchTerm |  | price        |
      | Nike Shoe |  | $10 - $19.99 |

  @Regression @Mobile @PLP  @All @KER-552 @ZYP-6145 @Rerun
  Scenario Outline: Verify user is able to filter by price for search in Search Page Mobile
    Given user launches the browser and navigates to "ASO_HOME" page
    #    When User enters in Required_Product with "<search_Value>" and click on Go button
    #    Then User should be navigated to Search_Page
    When user enters "<SearchTerm>" in the search box
    Then User clicks on the filter flyout
    And user select the "<price>" in filter
    # Then Verify the selected price range product is displayed in product grid
    Then User closes the web application

    Examples: 
      | SearchTerm |  | search_Value | price          |
      | Nike Shoe |  | Nike Shoes   | $100 - $199.99 |

  @Regression @Mobile @PLP  @All @KER-552 @ZYP-6147 @Rerun
  Scenario Outline: As a customer I should also be able to see how many items will populate within each price value prior to selecting it in Search Page Mobile
    Given user launches the browser and navigates to "ASO_HOME" page
    When user enters "<SearchTerm>" in the search box
    Then User clicks on the filter flyout
    And User expands PRICE Filter Option
    And user select the "<price>" in filter
    And User Click on apply filter button
    Then User clicks on the filter flyout
    #Then Verify all the price filters have checkbox product count should be gatherthan zero
    Then Verify the price filters product count with checkboxs product count should be equal

    Examples: 
      | SearchTerm |  | price        |
      | Nike Shoe |  | $10 - $19.99 |
