Feature: [Desktop]Bundles - Add to Cart Notification

  @Web @C-HP @Regression @KER-2717 @ZYP_PDP_K2717-6514 @CR-RKA 
  Scenario: Verify Find a store when product is Not Sold in Store
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user search "NotSoldInStore" in search box 
    Then user verify not sold in store text on PDP 
    
    
   