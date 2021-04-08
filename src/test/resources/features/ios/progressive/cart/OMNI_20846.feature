Feature: Verify that product restrictions and disclaimers are visible to the user

  @Sprint3 @ST-OMNI-20846 @TC-OMNI-33076
  Scenario Outline: Verify that the user sees product disclaimer based on age restriction
  	Given User launches the application
    And User continues as guest user
    When User navigates to pdp
    And User sees Product title
    And User taps on add to cart button
    And User taps on view cart button
    Then User is navigated To Cart Screen
    And User sees the product disclaimer "<product_disclaimer>"
    
    Examples:
    | product_code | error_message |
    | A_UNIQUE_CODE	   | This item may ship from a different location therefore only eligible for ground shipping. Standard delivery of 10-14 days. Additionally, this item is not eligble for APO/FPO delivery. |


  @Sprint3 @ST-OMNI-20846 @TC-OMNI-33077
  Scenario Outline: Verify that the user sees product disclaimer for Hazmat or Prop 65 product
  	Given User launches the application
    And User continues as guest user
    When User navigates to pdp
    And User sees Product title
    And User taps on add to cart button
    And User taps on view cart button
    Then User is navigated To Cart Screen
    And User sees the product disclaimer "<product_disclaimer>" 
    
    Examples:
    | product_code | error_message |
    | A_UNIQUE_CODE_Prop_65	   | The product disclaimer for Hazmat product |
    | A_UNIQUE_CODE_Hazmat	   | The product disclaimer for Prop 65 product |


  @Sprint3 @ST-OMNI-20846 @TC-OMNI-33078
 Scenario Outline: Verify that the user sees product disclaimer for restricted state Zip Code
  	Given User launches the application
    And User continues as guest user
    When User navigates to pdp
    And User sees Product title
    And User taps on add to cart button
    And User taps on view cart button
    Then User is navigated To Cart Screen
    When User changes the zip code to "<zip_code>"
    Then User sees the product disclaimer "<product_disclaimer>"
     
    
    Examples:
    | product_code | zip_code | error_message |
    | A_UNIQUE_CODE_Prop_65	   | 12345 | The product disclaimer for the restricted state zip code |

  @Sprint3 @ST-OMNI-20846 @TC-OMNI-33079
 Scenario Outline: Verify that the user sees wrapped product disclaimer for restricted state Zip Code
  	Given User launches the application
    And User continues as guest user
    When User navigates to pdp
    And User sees Product title
    And User taps on add to cart button
    And User taps on view cart button
    Then User is navigated To Cart Screen
    When User changes the zip code to "<zip_code>"
    Then User sees the product disclaimer "<product_disclaimer>"
    And User sees longer product disclaimer with elipses
     
    Examples:
    | product_code | zip_code | error_message |
    | A_UNIQUE_CODE_Prop_65	   | 12345 | This item may ship from a different location therefore only eligible for ground shipping. Standard delivery of 10-14 days. Additionally, this item is not eligble for APO/FPO delivery. |

  @Sprint3 @ST-OMNI-20846 @TC-OMNI-33080
 Scenario Outline: Verify that the user sees the product disclaimer for qty restriction
    Given User launches the application
    And User continues as guest user
    When User navigates to pdp
    And User sees Product title
    And User taps on add to cart button
    And User taps on view cart button
    Then User is navigated To Cart Screen
    And User sees the product disclaimer "<product disclaimer>" 
    
    Examples:
    | product_code | error_message |
    | A_UNIQUE_CODE_Qty_1	   | The product disclaimer for Qty 1 product |
    | A_UNIQUE_CODE_Qty_5   | The product disclaimer for Qty 5 product |
    
    
 