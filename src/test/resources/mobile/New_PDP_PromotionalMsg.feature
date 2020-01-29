Feature: To verify promotional messages on PDP page

@Web @CR-Anirudh @PDPFaceLift 
	Scenario: To verify presence of promotional messages - ship for fixed price
	Given user launches the browser and navigates to "ASO_HOME" page
     When user enters "shipFrFixedPriceSKU" in the search box
    And user should be able to see the sku and item numbers for the given image
	And user sets up cookie
	Then user navigates to new pdp page url "shipFrFixedPriceSKU"
	Then user should see prmotional message "Ships for $"
	
	
@Web @CR-Anirudh @PDPFaceLift 
	Scenario: Validate ToolTip present for detailed message
	Given user launches the browser and navigates to "ASO_HOME" page
     When user enters "shipFrFixedPriceSKU" in the search box
    And user should be able to see the sku and item numbers for the given image
	And user sets up cookie
	Then user navigates to new pdp page url "shipFrFixedPriceSKU"
	Then user should see prmotional message "Ships for $"
	And user should see ToolTip near promotional msg 
	
	
	@Web @CR-Anirudh @PDPFaceLift @unq
	Scenario: To verify presence of promotional messages stacking
	Given user launches the browser and navigates to "ASO_HOME" page
     When user enters "MultiplePromoMsgSku" in the search box
    And user should be able to see the sku and item numbers for the given image
	And user sets up cookie
	Then user navigates to new pdp page url "MultiplePromoMsgSku"
	Then user verifies promotional message stacking
	
#	@Web @CR-Anirudh @PDPFaceLift 
#	Scenario: To verify presence of promotional messages - ship for free
#	Given user launches the browser and navigates to "ASO_HOME" page
#     When user enters "shipForFreeMsgSKU" in the search box
#    And user should be able to see the sku and item numbers for the given image
#	And user sets up cookie
#	Then user navigates to new pdp page url "shipForFreeMsgSKU"
#	Then user should see prmotional message ""
	
#	@Web @CR-Anirudh @PDPFaceLift 
#	Scenario: To verify presence of promotional messages -buy1 get1 50% off 
#	Given user launches the browser and navigates to "ASO_HOME" page
#     When user enters "Buy1Get1offSKU" in the search box
#    And user should be able to see the sku and item numbers for the given image
#	And user sets up cookie
#	Then user navigates to new pdp page url "Buy1Get1offSKU"
#	Then user should see prmotional message ""