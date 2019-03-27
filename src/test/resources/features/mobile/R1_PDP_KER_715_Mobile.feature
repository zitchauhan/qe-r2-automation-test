Feature: To verify user is able to navigate to product details page by clicking product card Mobile
 
 @Mobile @Regression @KER-715 @ZYP_PDP_K715-10539 @C-PDP @CR-AG
   Scenario: To verify user is able to navigate to product details page when product card is clicked
   Given user launches the browser and navigates to "ASO_HOME" page
   Then User navigates till PLP
   And User click on the product image
   And user should be able to see PDP mention in the current url
   #And user should be able to see Add to cart button and quantity section
   And user should be able to see ship it button and quantity section
    
   
    