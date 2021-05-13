Feature: Back in Stock Get notified 

@ST-OMNI-33317  @TC-OMNI-37962
Scenario: user is able to see promotional message on search page 
		Given User launches the application
		And User continues as "guest user" on onboarding page
		Then User sees the homepage
		When User Sees the Search Box
    Then User clicks on the Search Box
		And i choose to enter "promotionalmessageSKU" In Search box
		And i choose to click on "promotionaltooltip" on Search page 
		And i choose to See "promotionalmessage" on Search page 