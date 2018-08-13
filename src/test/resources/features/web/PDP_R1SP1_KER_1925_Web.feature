Feature: To verify Product Pricing Display on PDP

@Regression @Sanity @C-PDP  @Web @ZYP_PDP_K1925-3428 @KER-1925 @All  @CR-AKK @1HR
  Scenario: To verify Product price on PDP
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2
    Then Navigate to PLP and select one product with regular price(without any promotion)
    And  Verfiy selected product price 
    
    @Regression @Sanity @C-PDP  @Web @ZYP_PDP_K1925-10340 @KER-1925 @All  @CR-AKK @1HR
    Scenario: To verify Celarance Product price on PDP
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2
    Then Navigate to PLP and select one product with clearance
    And User should able to see Strike Through Price with Actual price 