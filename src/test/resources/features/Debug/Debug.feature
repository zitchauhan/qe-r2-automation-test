Feature: Debug Testing 

 @Web @Regression @KER-1933 @ZYP_PDP_K1933-3329 @C-PDP @CR-AG @1HR
   Scenario Outline: To verify user is able to navigate to product details page when product card is clicked
   Given user launches the browser and navigates to "ASO_HOME" page
   Then User enter the search "<data>"
    And User click on search icon
#    And User click on the product image
   And user should be able to see PDP mention in the current url
   Then user able to see shipping/delivery related message in bulky product
   Examples:
   |data|
   |Body-Solid EXM3000LPS Gym System|