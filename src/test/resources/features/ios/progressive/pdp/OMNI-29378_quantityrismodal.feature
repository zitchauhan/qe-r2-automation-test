Feature: PD - Gift/e-Gift Card - Quantity Selector (Restrictions)

	@Sprint05 @OMNI-29378 @TC-OMNI-35456
    Scenario: Validate that user gets alert modal on Bulk Gift card PDP when not added minimum Qty 
  	Given User launches the application
  	When User Clicks On MaY Be Later
    And User continues as guest user
 Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "Bulkgiftcard"
    #//121116819
#   Then User sees all products related to search Keyword  
    And I choose to navigate to PDP 
    When User sets qty to "2"
    #And user click on "addtocart" on PDP
    Then i Choose to validate that "Standered Gift card modal" Shown on PDP
    Then i Choose to validate that "Standered Gift card modal generic message" Shown on PDP
    Then i Choose to validate that "Open STD Gift card button" Shown on PDP
    Then i Choose to validate that "Cancelbutton" Shown on PDP
    
    
    
    @Sprint05 @OMNI-29378 @TC-OMNI-35457
    Scenario: Validate that user gets alert modal on Gift card PDP when added maximum Qty 
  	Given User launches the application
  	When User Clicks On MaY Be Later
    And User continues as guest user
 Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "giftcard"
    #114064918
#   Then User sees all products related to search Keyword  
    And I choose to navigate to PDP 
    When User sets qty to "99"
    #And user click on "addtocart" on PDP
    #Then i Choose to validate that "Standered Gift card modal" Shown on PDP
    #Then i Choose to validate that "Standered Gift card modal generic message" Shown on PDP
    #Then i Choose to validate that "Open STD Gift card button" Shown on PDP
   
  	Then i Choose to validate that "Bulk Gift card modal" Shown on PDP
    Then i Choose to validate that "Bulk Gift card modal generic message" Shown on PDP
    Then i Choose to validate that "Open Bulk Gift card button" Shown on PDP
    Then i Choose to validate that "Cancelbutton" Shown on PDP