Feature: Add to Cart - Special Order Firearms

@Regression @Web @All @C-PDP @1HR @KER-3849 @ZYP_PDP_K3849-4865 
Scenario: Verify SOF functionality when item is out of stock for Desktop
	Given user launches the browser and navigates to "ASO_HOME" page 
	When clicks on the Select Store link in the header	
	When User select store with "SOF_OutofStock"
	Then User to click on search button after putting data "Gun_Out_Of_Stock" 
	And user verify the inventory message
