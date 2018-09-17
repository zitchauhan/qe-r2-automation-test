Feature: Debug Testing


@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-8124 @ZYP_CART_K2927-8124 @CR-SK
Scenario: To Verify Available Taxes and Tax is > $0.00 - Authenticated User
  Scenario: TC_31-Verify presence of search box with search icon on Home page.
    Given user launches the browser and navigates to "ASO_HOME" page
     Then User navigates to L3 from home page
     #Then User click on Quick view button
     Then verify addcart button is displayed 