Feature: To Verify Page Templates: PDP - No Diff Selection 

@Regression @C-PDP @Mobile @All @KER-3728 @ZYP_PDP_K3728-4887 @CR-SG @1HR @RBeta
Scenario: Verify the attributes on the PDP - No Different Selection- Mobile
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user navigate to No diff selection product PLP 
	Then User clicks on the filter flyout 
	And user click on category tab
	And user click on Inground basketball hoops
	And User click on the No diff selection product
	Then verfiy the product details and features 
	
@Regression @C-PDP @Mobile @All @KER-3728 @ZYP_PDP_K3728-4891_Mobile @CR-SG
Scenario: To verify add to cart functionality on PDP - No Different Selection- Mobile 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user navigate to No diff selection product PLP 
	Then User clicks on the filter flyout 
	And user click on category tab
	And user click on Inground basketball hoops
	And User click on the No diff selection product
	And user add the item to cart
	
	
