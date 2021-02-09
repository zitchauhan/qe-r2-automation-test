Feature: Desktop Verify product in grid are sorted 

@Web @Regression @KER-710 @ZYP_HP_K710-3656 @C-HP @CR-SG @DevORIG
Scenario: [Web]Verify the product in grid are sorted by Price "Low-High" 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user enters "SearchForSort" in the searchbox 
	Then navigate to sort by and navigate to best selling 
	And user select the brand "brandName" 
	
	
@Web @Regression @KER-710 @ZYP_HP_K710-3655 @C-HP @CR-RKA 
Scenario: [Web]Verify the product in grid are sorted by Price "High-Low" 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user enters "SearchForSort" in the searchbox 
	Then navigate to sort by and navigate to best selling in high to low 
	And user select the brand "brandName" 
	
	
	
@Web @Regression @KER-710 @ZYP_HP_K710-3649 @C-HP @CR-RKA @RegressionP2 @TC-KER-3657 @TC-OMNI-13422
Scenario: [Web]Verify the product in grid are sorted by "Brand (A-Z)" 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then user enters "SearchForSort" in the searchbox 
	Then User should be able to sort by brand A to Z 
	Then User compare the product baised on A to Z 
	
	
@Web @Regression @KER-710 @ZYP_HP_K710-2621 @C-HP @CR-RKA 
Scenario: To verify user is able to sort on Product Listing/landing page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then user enters "SearchForSort" in the searchbox 
	Then navigate to sort by and navigate to best selling 
	And user select the brand "brandName" 
	
@Web @Regression @KER-710 @ZYP_HP_K710-2622 @C-HP @CR-RKA 
Scenario: To verify user is able to filter on Sub category landing page(L2) 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to see L2 Page of shoe 
	Then User Select the product from L2 
	Then User select the brand facet product from L2 
	Then User veriy brand facet 
	
@Web @Regression @KER-710 @ZYP_HP_K710-2722 @C-HP @CR-RKA 
Scenario: To verify user is able to sort & filter on Sub category landing page(L2) 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates to L2 from home page 
	
@Web @Regression @KER-710 @ZYP_HP_K710-2723 @C-HP @CR-RKA 
Scenario: To verify user is able to sort & filter on Product Listing/landing page(L3) 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates to L3 from home page 
	Then User should be able to see L3 Page for grid sorting 
	Then navigate to sort by and navigate to best selling 
	And user select the brand "brandNameBoys" 
	
	
	
@Web @Regression @KER-710 @ZYP_HP_K710-5533 @C-HP 
Scenario: To verify user is able to filter on Product Listing/landing page(L3) 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates to L3 from home page for grid sorting 
	Then User should be able to see L3 Page for grid sorting 
	Then User should be able to sort by brand A to Z 
	Then User compare the product baised on A to Z 
	
@Web @Regression @KER-710 @ZYP_HP_K710-3657 @C-HP 
Scenario: Verify the product in grid are sorted by"Brand (A-Z)L2 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates to L2 from home page 
	Then User should be able to see L2 Page 
	And user select the brand "brandName" 
	Then navigate to sort by and navigate to best selling in high to low 
