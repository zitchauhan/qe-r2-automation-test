Feature: To verfiy Landing Page - Product Listing / Product Grid
 
 @Web @Regression @KER-714 @ZYP_K714-1991 @C-HP @CR-AK @UP_R
   Scenario: To verify user is able to navigate to product details page when product card is clicked
   Given user launches the browser and navigates to "ASO_HOME" page
   Then click on the prodct card in home page
   And user should be able to see Add to cart button and quantity section
   
   @Web @Regression @KER-714 @ZYP_K714-1984 @C-HP @CR-AK @UP_R
   Scenario: To verify user is able to view product cards as grids on product listing page
   Given user launches the browser and navigates to "ASO_HOME" page
   Then click on the prodct card in home page
   And user should be able to see Add to cart button and quantity section
   
    
    