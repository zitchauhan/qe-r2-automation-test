Feature: To Verify user is be able to filter the products based on Price Ranges

  @Sanity @Regression @Web @All @PLP  @KER-552 @ZYP-2726
  Scenario: Verify user is able to expand/collapse filter options
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User expands all Filter Options
    Then User should be able to see all Filter Options as expanded
    And User collapses all Filter Options
    Then User should be able to see all Filter Options as collapsed
    Then User closes the web application

  @Regression @Web @All @KER-552 @ZYP-2908  @Sanity 
  Scenario: Verify As a User I should be able to select/deselect multiple price values
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User expands PRICE Filter Option
    When User selects multiple PRICE filter Options
    Then User should be able to see the selected PRICE filter Options in selected state
    When User deselects multiple PRICE filter Options
    Then User should be able to see the deselected PRICE filter Options in deselected state
    Then User closes the web application

   @Regression @Web @All @KER-552 @ZYP-2900
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

  @Regression @Web @All @KER-552 @ZYP-2902
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

  @Regression @Web @All @KER-552 @ZYP-2897
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

  @Regression @Web @All @KER-552 @ZYP-3580
  Scenario: As a customer I should also be able to see how many items will populate within each price value prior to selecting it
    Given user launches the browser and navigates to "ASO_HOME" page
   	Then User navigates till PLP
    And User expands PRICE Filter Option
    Then Verify all the price filters have checkbox product count should be gatherthan zero
    Then Verify the price filters product count with checkboxs product count should be equal
    
   
   @Regression @Web @All @KER-552 @ZYP-6128  @Sanity 
  Scenario: Verify user is able to expand/collapse filter options
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2
    #Then User navigates till PLP
    And User expands all Filter Options
    Then User should be able to see all Filter Options as expanded
    And User collapses all Filter Options
    Then User should be able to see all Filter Options as collapsed
    Then User closes the web application

  @Regression @Web @All @KER-552 @ZYP-6130
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

  @Regression @Web @All @KER-552 @ZYP-6132  @Sanity 
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

  @Regression @Web @All @KER-552 @ZYP-6134
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

  @Regression @Web @All @KER-552 @ZYP-6136
  Scenario: As a customer I should also be able to see how many items will populate within each price value prior to selecting it
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2
    #Then User navigates till PLP
    And User expands PRICE Filter Option
    Then Verify all the price filters have checkbox product count should be gatherthan zero
    Then Verify the price filters product count with checkboxs product count should be equal
    
    @Regression @Web @Sanity @All @KER-552 @ZYP-6129
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

  @Regression @Web @All @KER-552 @ZYP-6131
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

  @Regression @Web @All @KER-552 @ZYP-6133
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

  @Regression @Web @All @KER-552 @ZYP-6135
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

  @Regression @Web @All @KER-552 @ZYP-6137
 Scenario Outline: As a customer I should also be able to see how many items will populate within each price value prior to selecting it in Search Page
    Given user launches the browser and navigates to "ASO_HOME" page
   When user enters "<SearchTerm>" in the search box
    And User expands PRICE Filter Option
    Then Verify all the price filters have checkbox product count should be gatherthan zero
    Then Verify the price filters product count with checkboxs product count should be equal
 Examples: 
      | SearchTerm     |
      | Nike Shoe    |
    
   