Feature: To verify promotional messages on PDP page

@Web @CR-Anirudh @PDPFaceLift 
	Scenario: To verify presence of promotional messages
	Given user launches the browser and navigates to "ASO_HOME" page
     When user enters "SKUForPromotionalMSg" in the search box
    And user should be able to see the sku and item numbers for the given image
	And user sets up cookie
	Then user navigates to new pdp page url "SKUForPromotionalMSg"
	Then user should see prmotional message
	
	
@Web @CR-Anirudh @PDPFaceLift
	Scenario: Validate ToolTip present for detailed message
	Given user launches the browser and navigates to "ASO_HOME" page
     When user enters "SKUForPromotionalMSg" in the search box
    And user should be able to see the sku and item numbers for the given image
	And user sets up cookie
	Then user navigates to new pdp page url "SKUForPromotionalMSg"
	Then user should see prmotional message
	And user should see ToolTip near promotional msg
	