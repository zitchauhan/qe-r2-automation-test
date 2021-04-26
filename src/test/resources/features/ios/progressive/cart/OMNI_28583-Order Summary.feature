
Feature: Validate that User see order summary on cart page 

	@P2 @OMNI-28583 @TC-OMNI-34424
	Scenario: Validate that user is able to See order summary when he reached to cart having at least one item 
	Given User launches the application
    When User continues as guest user
    Then User sees the homepage
	 When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword"
    And user click on Product
    When User taps on add to cart button
    And User taps on View Cart button
    And User is on "Cart" screen
    Then User scrolls down to the bottom
    And User sees "order summary" on cart page  
    Then User sees "OrderSummaryHeading" on OrderSummary
    Then User sees "SubTotalLabel" on OrderSummary
    Then User sees "OrderTotalLabel" on OrderSummary
    Then User sees "ShippingLabel" on OrderSummary
    Then User sees "ShippingToLabel" on OrderSummary
    #Then User sees "ShippingToZip" on OrderSummary
    #Then User sees "Storepickup" on OrderSummary
    #Then User sees "Changezipcodecta" on OrderSummary
    #Then User sees "Changestorecta" on OrderSummary
    #Then User sees "eDeliveryLabel" on OrderSummary
    Then User sees "TaxesLabel" on OrderSummary
    #Then User sees "DiscountsLabel" on OrderSummary
    #Then User sees "PromocodeLabel" on OrderSummary
    #Then User sees "Restrictionmessage" on OrderSummary
    Then User sees "SubTotalPrice" on OrderSummary
    Then User sees "OrderTotalPrice" on OrderSummary
    Then User sees "ShippingPrice" on OrderSummary
    #Then User sees "eDeliveryPrice" on OrderSummary
    Then User sees "TaxesPrice" on OrderSummary
    #Then User sees "DiscountsPrice" on OrderSummary
    #Then User sees "PromocodePrice" on OrderSummary
    #Then User sees "Storepickupatstorename" on OrderSummary
    #Then User sees "StorepickupPrice" on OrderSummary
    
    
    
