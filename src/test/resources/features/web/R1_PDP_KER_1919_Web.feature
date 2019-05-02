Feature: Add to Cart - Error Messages (PDP) 

  @C-PDP @Web @Regression @KER-1919 @ZYP_HP_K1919-5040 @CR-AG 
  Scenario: [UI-Desktop]- Verify Add to Cart -message to inform the user that the item is OOS(Out of Stock)
    Given user launches the browser and navigates to "ASO_HOME" page
    #"OutOfStockProduct" needs to be a product that does not have diffs
    # This product may get dropped from WCS after being OOS for 3 or 7 days, so this is a constant data req
    When user enters "OutOfStockProduct" in the search box
      
  @C-PDP @Web @Regression @KER-1919 @ZYP_HP_K1919-5038 @CR-AG 
  Scenario: [UI-Desktop]- Verify Add to Cart -messaging to confirm the limited quantity was added
    Given user launches the browser and navigates to "ASO_HOME" page 
	#Then user search the data in search box "limitedQuantityRestriction_cmc"
	When user enters "limitedQuantityRestriction_cmc" in the search box 
	Then User to select the product 
	Then verify Sorry the selected item is limited to XYZ order. 
      
          
  @C-PDP @Web @Regression @KER-1919 @ZYP_HP_K1919-5039 @CR-AG @RBeta
  Scenario: [UI-Desktop]- Verify Add to Cart -messaging to confirm the quantity was added
     Given user launches the browser and navigates to "ASO_HOME" page 
	#Then user search the data in search box "limitedQuantityRestriction_cmc"
	When user enters "limitedQuantityRestriction_cmc" in the search box 
	Then User to select the product 
	Then verify Sorry the selected item is limited to XYZ order.

      
      
     @C-PDP @Web @Regression @KER-1919 @ZYP_HP_K1919-3443 @CR-RKA
      Scenario: Verify Add to Cart -messaging confirming the restriction
      Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates to L3 from home page 
	Then User should be able to see L3 Page 
	And User clicks on required product in L3 Page 
	

