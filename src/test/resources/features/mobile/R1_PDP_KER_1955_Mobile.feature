Feature: To Verify the Add To Cart Functionality
          
@Regression @Web @All @C-PDP @1HR @KER-1955 @ZYP_PDP_K1955-3483 @Rerun @CR-SG
  Scenario: Verify the Add To Cart functionality mobile
          Given user launches the browser and navigates to "ASO_HOME" page
          Then User clicks on the burger menu
    	   Then User navigates to L3
           And User selects Required product in Product Listing Page
           Then User should be select the color
           Then User should be select the size
           Then User should be select the Quantity
           #And User clicks on AddToCart Button
           And user click on ship it button
           Then User should be able to see ATC notification
           When User clicks on View_Cart Button
           Then User should be navigated to Cart Page
           Then User should be able to see added product in cart
