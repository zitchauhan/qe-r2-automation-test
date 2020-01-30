Feature: To verify promotional messages on PDP page

#@Web @CR-Anirudh @PDPFaceLift 
#	Scenario: To verify presence of fulfilment message for BULK items
#	Given user launches the browser and navigates to "ASO_HOME" page
#     When user enters "SKUForProductMsg" in the searchbox
#    And user should be able to see the sku and item numbers for the given image
#	And user sets up cookie
#	Then user navigates to new pdp page url "SKUForProductMsg"
#	Then user should see product level message on PDP
	
	
#@Web @CR-Anirudh @PDPFaceLift 
#	Scenario: Validate ToolTip present for detailed message
#	Given user launches the browser and navigates to "ASO_HOME" page
#     When user enters "SKUForProductMsgMMdd" in the searchbox
#    And user should be able to see the sku and item numbers for the given image
#	And user sets up cookie
#	Then user navigates to new pdp page url "SKUForProductMsgMMdd"
#	Then user should see product level message on PDP Start ship on MM-dd
	
	
	 
#	@Web @CR-Anirudh @PDPFaceLift 
#	Scenario: Validate ToolTip present for detailed message
#	Given user launches the browser and navigates to "ASO_HOME" page
#     When user enters "SKUForProductMsgWillNtArrive" in the searchbox
#    And user should be able to see the sku and item numbers for the given image
#	And user sets up cookie
#	Then user navigates to new pdp page url "SKUForProductMsgWillNtArrive"
#	Then user should see product level message on PDP will not arrive by xmas
	
	
	@Web @CR-Anirudh @PDPFaceLift 
	Scenario: To verify presence of message for ammo items
		Given user launches the browser and navigates to "ASO_HOME" page 
	When user enters "ammoSKU" in the searchbox
	And user sets up cookie
	Then user navigates to new pdp page url "ammoSKU"
	And user verify the ammo disclaimer on new PDP
	Then user verifies fulfilment message present for bullk items
	
	
@Web @CR-Anirudh @PDPFaceLift 
	Scenario: Validate message for doorship items
	Given user launches the browser and navigates to "ASO_HOME" page
     When user enters "DoorShipItem" in the searchbox
    And user should be able to see the sku and item numbers for the given image
	And user sets up cookie
	Then user navigates to new pdp page url "DoorShipItem"
	And user verifies fulfilment message present for DoorshipItems items