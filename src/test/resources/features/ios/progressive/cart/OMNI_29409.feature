Feature: Verify Gift card page for OOS and add to cart 

@Sprint04 @TC-OMNI-29409_01 
Scenario Outline: Validate the Out of Stock on  Gift card ( Standard/Bulk-GC ) page
    Given User launches the application 
	And User Goes to home page 
	When User Sees the Search Box 
	Then User clicks on the Search Box 
	And User search for the "<product>" 
	And I choose to navigate to PDP
	And User sees Product title
    Then User see the Out of stock on PDP page
Examples: 
		|    product            |
		|    FishingAcademyGiftCard| 
		|	 Academy_Bulk_Gift_Card|
		

@Sprint04 @TC-OMNI-29409_02 
Scenario Outline: Validate e-Gift card added in to the cart
Given User launches the application 
	And User Goes to home page 
	When User Sees the Search Box 
	Then User clicks on the Search Box 
	And User search for the "<product>" 
	And I choose to navigate to PDP
	And User sees Product title
	When User tap on Add to Cart button
	Then User see text "Added to Cart" on ATC page 
	Then User see shipping as label as "E-DELIVERY"
	Then User see product name on ATC page
	Then User see product sku on ATC page
	Then User see product qty on ATC page
	Then User see product price on ATC page
	Then User see View cart on ATC page
	Then User see Continue Shopping on ATC page
	
	Examples: 
		|    product            |	
		|    eGiftCard-Steak_On_Grill| 

@Sprint04 @TC-OMNI-29409_03
Scenario Outline: Validate standard/Bulk Gift card added in to the cart
Given User launches the application 
	And User Goes to home page 
	When User Sees the Search Box 
	Then User clicks on the Search Box 
	And User search for the "<product>" 
	And I choose to navigate to PDP
	And User sees Product title
	When User tap on Add to Cart button
	Then User see text "Added to Cart" on ATC page 
	Then User see shipping as label as "SHIPPING"
	Then User see product name on ATC page
	Then User see product sku on ATC page
	Then User see product qty on ATC page
	Then User see product price on ATC page
	Then User see View cart on ATC page
	Then User see Continue Shopping on ATC page
	
	Examples: 
		|    product            |	
		|    Academy_Bulk_Gift_Card|
		|Happy_Birthday_Academy_Gift_Card| 
	
	
	
	


  


   	