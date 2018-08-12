Feature: To Verify user is be able to filter the products based on Price Ranges

  @1HR @Regression @Web @All @C-PLP  @KER-552  @ZYP_PLP_K552-2726
  Scenario: Verify user is able to expand/collapse filter options
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User expands all Filter Options
    Then User should be able to see all Filter Options as expanded
    And User collapses all Filter Options
    Then User should be able to see all Filter Options as collapsed
    Then User closes the web application

  @Regression @Web @All @KER-552  @ZYP_PLP_K552-2908  @1HR @C-PLP
  Scenario: Verify As a User I should be able to select/deselect multiple price values
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User expands PRICE Filter Option
    When User selects multiple PRICE filter Options
    Then User should be able to see the selected PRICE filter Options in selected state
    When User deselects multiple PRICE filter Options
    Then User should be able to see the deselected PRICE filter Options in deselected state
    Then User closes the web application

   @Regression @Web @All @KER-552  @ZYP_PLP_K552-2900 @C-PLP
  Scenario Outline: Verify user is able to filter by price for search
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    #When user navigates to L2 page
    And User expands PRICE Filter Option
    And user select the "<price>" in filter
    Then Verify the selected price range product is "<price>" displayed in product grid
    And user deselect the "<price>" filter
    Then Verify the list of product is dispalyed are same as before filter
    Then User closes the web application

    Examples: 
      | price          |
      | $100 - $199.99 |

  @Regression @Web @All @KER-552  @ZYP_PLP_K552-2902 @C-PLP
  Scenario Outline: Verify user is able to filter by price for search
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User expands PRICE Filter Option
    And user select the "<price>" in filter
    Then Verify the selected price range product is "<price>" displayed in product grid
    And user deselect the "<price>" filter
    Then Verify the list of product is dispalyed are same as before filter
    Then User closes the web application

    Examples: 
      | price          |
      | $100 - $199.99 |

  @Regression @Web @All @KER-552  @ZYP_PLP_K552-2897 @C-PLP
  Scenario Outline: Verify user is able to filter by price for search
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    When User enters in Required_Product with "<search_Value>" and click on Go button
    And User expands PRICE Filter Option
    And user select the "<price>" in filter
    Then Verify the selected price range product is "<price>" displayed in product grid
    Then User closes the web application

    Examples: 
      | search_Value | price          |
      | Nike Shoe   | $100 - $199.99 |

  @Regression @Web @All @KER-552  @ZYP_PLP_K552-3580 @C-PLP
  Scenario: As a customer I should also be able to see how many items will populate within each price value prior to selecting it
    Given user launches the browser and navigates to "ASO_HOME" page
   	Then User navigates till PLP
    And User expands PRICE Filter Option
    Then Verify all the price filters have checkbox product count should be gatherthan zero
    Then Verify the price filters product count with checkboxs product count should be equal
    
   
   @Regression @Web @All @KER-552  @ZYP_PLP_K552-6128  @1HR  @C-PLP
  Scenario: Verify user is able to expand/collapse filter options
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2
    #Then User navigates till PLP
    And User expands all Filter Options
    Then User should be able to see all Filter Options as expanded
    And User collapses all Filter Options
    Then User should be able to see all Filter Options as collapsed
    Then User closes the web application

  @Regression @Web @All @KER-552  @ZYP_PLP_K552-6130 @C-PLP
  Scenario: Verify As a User I should be able to select/deselect multiple price values
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2
    #Then User navigates till PLP
    And User expands PRICE Filter Option
    When User selects multiple PRICE filter Options
    Then User should be able to see the selected PRICE filter Options in selected state
    When User deselects multiple PRICE filter Options
    Then User should be able to see the deselected PRICE filter Options in deselected state
    Then User closes the web application

  @Regression @Web @All @KER-552  @ZYP_PLP_K552-6132  @1HR @C-PLP
  Scenario Outline: Verify user is able to filter by price for search
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2
    #Then User navigates till PLP
    And User expands PRICE Filter Option
    And user select the "<price>" in filter
    Then Verify the selected price range product is "<price>" displayed in product grid
    And user deselect the "<price>" filter
    Then Verify the list of product is dispalyed are same as before filter
    Then User closes the web application

    Examples: 
      | price          |
      | $100 - $199.99 |

  @Regression @Web @All @KER-552  @ZYP_PLP_K552-6134 @C-PLP
  Scenario Outline: Verify user is able to filter by price for search
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2
    When User enters in Required_Product with "<search_Value>" and click on Go button
    And User expands PRICE Filter Option
    And user select the "<price>" in filter
    Then Verify the selected price range product is "<price>" displayed in product grid
    Then User closes the web application

    Examples: 
      | search_Value | price          |
      | Nike Shoe   | $100 - $199.99 |

  @Regression @Web @All @KER-552  @ZYP_PLP_K552-6136 @C-PLP
  Scenario: As a customer I should also be able to see how many items will populate within each price value prior to selecting it
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2
    #Then User navigates till PLP
    And User expands PRICE Filter Option
    Then Verify all the price filters have checkbox product count should be gatherthan zero
    Then Verify the price filters product count with checkboxs product count should be equal
    
    @Regression @Web @1HR @All @KER-552  @ZYP_PLP_K552-6129 @C-PLP
  Scenario Outline: Verify user is able to expand/collapse filter options in Search Page
    Given user launches the browser and navigates to "ASO_HOME" page
    When user enters "<SearchTerm>" in the search box
    And User expands all Filter Options
    Then User should be able to see all Filter Options as expanded
    And User collapses all Filter Options
    Then User should be able to see all Filter Options as collapsed
    Then User closes the web application
     Examples: 
      | SearchTerm     |
      | Nike Shoe    |

  @Regression @Web @All @KER-552  @ZYP_PLP_K552-6131 @C-PLP
  Scenario Outline: Verify As a User I should be able to select/deselect multiple price values in Search Page
    Given user launches the browser and navigates to "ASO_HOME" page
     When user enters "<SearchTerm>" in the search box
    And User expands PRICE Filter Option
    When User selects multiple PRICE filter Options
    Then User should be able to see the selected PRICE filter Options in selected state
    When User deselects multiple PRICE filter Options
    Then User should be able to see the deselected PRICE filter Options in deselected state
    Then User closes the web application
     Examples: 
      | SearchTerm     |
      | Nike Shoe    |

  @Regression @Web @All @KER-552  @ZYP_PLP_K552-6133 @C-PLP
  Scenario Outline: Verify user is able to filter by price for search in Search Page
    Given user launches the browser and navigates to "ASO_HOME" page
   When user enters "<SearchTerm>" in the search box
    And User expands PRICE Filter Option
    And user select the "<price>" in filter
    Then Verify the selected price range product is "<price>" displayed in product grid
    And user deselect the "<price>" filter
    Then Verify the list of product is dispalyed are same as before filter
    Then User closes the web application

    Examples: 
    | SearchTerm     |   | price          |
      | Nike Shoe    |   | $100 - $199.99 |

  @Regression @Web @All @KER-552  @ZYP_PLP_K552-6135 @C-PLP
  Scenario Outline: Verify user is able to filter by price for search in Search Page
    Given user launches the browser and navigates to "ASO_HOME" page
     When user enters "<SearchTerm>" in the search box
    When User enters in Required_Product with "<search_Value>" and click on Go button
    And User expands PRICE Filter Option
    And user select the "<price>" in filter
    Then Verify the selected price range product is "<price>" displayed in product grid
    Then User closes the web application

    Examples: 
       | SearchTerm     | | search_Value | price          |
      | Nike Shoe    | | Nike Shoe   | $100 - $199.99 |

  @Regression @Web @All @KER-552  @ZYP_PLP_K552-6137 @C-PLP
 Scenario Outline: As a customer I should also be able to see how many items will populate within each price value prior to selecting it in Search Page
    Given user launches the browser and navigates to "ASO_HOME" page
   When user enters "<SearchTerm>" in the search box
    And User expands PRICE Filter Option
    Then Verify all the price filters have checkbox product count should be gatherthan zero
    Then Verify the price filters product count with checkboxs product count should be equal
 Examples: 
      | SearchTerm     |
      | Nike Shoe    |
    
   