Feature: To Verify the Add To Cart Functionality
          
           
 @Regression @Web @All @PDP @Sanity @KER-1955 @ZYP-3485 @Rerun
  Scenario: Verify the Add To Cart functionality
          Given user launches the browser and navigates to "ASO_HOME" page
    	   Then User navigates to L3
           And User selects Required product in Product Listing Page
           Then User should be select the color
           Then User should be select the size
           Then User should be select the Quantity
           And User clicks on AddToCart Button
           Then User should be able to see ATC notification
           When User clicks on View_Cart Button
           Then User should be navigated to Cart Page
           Then User should be able to see added product in cart
               
               
               
                 