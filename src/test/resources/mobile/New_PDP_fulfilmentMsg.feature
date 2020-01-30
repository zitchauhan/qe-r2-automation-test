Feature: To verify Fulfilment  messages on PDP page

@Web @CR-Anirudh @PDPFaceLift 
	Scenario: To verify presence of fulfilment message for BULK items
	Given user launches the browser and navigates to "ASO_HOME" page
    When user enters "BulkItemSKU" in the searchbox
    And user should be able to see the sku and item numbers for the given image
	And user sets up cookie
	Then user navigates to new pdp page url "BulkItemSKU"
	Then user verifies fulfilment message present for bullk items
	
	
@Web @CR-Anirudh @PDPFaceLift 
	Scenario: Validate fulfilment message for doorship items
	Given user launches the browser and navigates to "ASO_HOME" page
     When user enters "DoorShipItem" in the searchbox
    And user should be able to see the sku and item numbers for the given image
	And user sets up cookie
	Then user navigates to new pdp page url "DoorShipItem"
	And user verifies fulfilment message present for DoorshipItems items
	