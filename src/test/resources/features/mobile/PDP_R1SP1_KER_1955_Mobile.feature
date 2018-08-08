Feature: To Verify the Add To Cart Functionality
          
           
 @Regression @Mobile @C-PDP @1HR @All @KER-1955  @ZYP_K1955-3483
  Scenario: Verify the Add To Cart functionality
           Given user launches the browser and navigates to "ASO_HOME" page
    	   Then User navigates till PLP
           And User selects Required product in Product Listing Page
           Then User should be select the color
           Then User should be select the size
           Then User should be select the Quantity
           And User clicks on AddToCart Button
           Then User should be able to see ATC notification
           When User clicks on View_Cart Button
           Then User should be navigated to Cart Page
           Then User should be able to see added product in cart
               
               