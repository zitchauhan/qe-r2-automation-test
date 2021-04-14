Feature: Verify product detail page for Gift card and Bulk Gift card. 

@Sprint04 @OMNI-22048  @TC-OMNI-22048_01    	
Scenario Outline:  validate PDP for standard gift card  When user search with Sku ID 
	Given User launches the application
    And User Clicks On MaY Be Later
    And User continues as guest user
#    And User Goes to home page 
	When User Sees the Search Box 
	Then User clicks on the Search Box 
	And User search for the "<product>" 
	And I choose to navigate to PDP 
	And User sees Product title
	Then User sees gift card image 
	Then User see details and description	
	Then User sees "<GCDescription>" on the gift card detail page 	
	

	
	Examples: 
		|    product            |productSKU|GCDescription|	
		|Happy_Birthday_Academy_Gift_Card|114064918|please select our bulk quantity|
		
		
@Spint04 @OMNI-22048 @TC-OMNI-22048_02   
Scenario Outline: Validate PDP for bulk gift card When user search with Sku ID 
	Given User launches the application
    And User Clicks On MaY Be Later
    And User continues as guest user
#	And User Goes to home page 
	When User Sees the Search Box 
	Then User clicks on the Search Box 
	And User search for the "<product>" 
	And I choose to navigate to PDP 
	And User sees Product title
	Then User sees gift card image 
	Then User see details and description
	Then User sees "<GCDescription>" on the gift card detail page 	
	
	
	Examples: 
		|    product            |productSKU|GCDescription|	
		|    Academy_Bulk_Gift_Card| 121116819|please select our standard quantity|
		
@Spint04 @OMNI-22048 @TC-OMNI-22048_03
Scenario Outline:  validate PDP for e-gift card  When user search with Sku ID 
	Given User launches the application
    And User Clicks On MaY Be Later
    And User continues as guest user 
#	And User Goes to home page 
	When User Sees the Search Box 
	Then User clicks on the Search Box 
	And User search for the "<product>" 
	And I choose to navigate to PDP 
	And User sees Product title
	Then User sees gift card image 	
	Then User sees "<GCDescription>" on the gift card detail page 	
	

	
	Examples: 
		|    product            |productSKU|GCDescription|	
		|    eGiftCard-Steak_On_Grill| 129844861|please select our bulk quantity|
		
				
				
#				
#@Sprint04 @TC-OMNI-22048_03 	
#Scenario Outline:  Validate PDP for GC When user navigate to GC via menu option 
#	Given User launches the application 
#	And User continues as guest user 
#	Then User sees the homepage 
#	When User taps on Giftcard in bottom nav 
#	And User click on the standard gift card 
#	And I choose to navigate to PDP 
#	Then User sees gift card image 
#	Then User sees "<GCDescription>" on the gift card detail page 
#	Then USer see prouct title as "<product>"
#	Then User see details and description
#	Examples: 
#		|    product            |productSKU|GCDescription|	
#		|    FishingAcademyGiftCard| 114064889|please select our bulk quantity Academy Gift Card|
#		
#						
#@Sprint04 @TC-OMNI-22048_04 
#Scenario Outline:  Validate PDP for  Bulk-GC When user navigate via menu option 
#	Given User launches the application 
#	And User continues as guest user 
#	Then User sees the homepage 
#	When User taps on Giftcard in bottom nav 
#	And User click on the bulk gift card 
#	And I choose to navigate to PDP 
#	Then User sees gift card image 
#	Then User sees "<GCDescription>" on the gift card detail page 
#	Then USer see prouct title as "<product>"
#	Then User see details and description		
#	Examples: 
#		|    GiftCardProduct            |productSKU|GCDescription|	
#		|    Academy Bulk Gift Cards (Free Standard Shipping)| 121116819|please select our standard quantity Academy Gift Card|
#		
