Feature: Promotional messaging on PDP

#This test case will only we pass if page will have any promo content

@Regression @C-PDP @Web @All @KER-3728 @ZYP_PDP_K3728-4889 @CR-AG 
Scenario: Verify that the user should be able to see promotional /marketing message on PDP if any
	Given user launches the browser and navigates to "ASO_HOME" page 
	 Then User navigates to page having promo content
	 And user able to see promo offer in grid and navigate to pdp of the product and see the same promocode in PDP
	
	 