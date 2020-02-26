Feature: Validate Presence of size and size-chart
   
   @Web  @PDPFaceLift @CR-Anirudh 
Scenario: verify new tab is opened on clicking size chart 
	Given user launches the browser and navigates to "ASO_HOME" page 
#	Then User should be able to click on Find Store 
#	And Find Store Modal should pop-up 
#	When User select store with "BOPIS_Store2" 
	When User searches a product "BOPIS_Regular_Product" and navigates to PDP 
	And user sets up cookie 
    Then user navigates to new pdp page url "BOPIS_Regular_Product"
    And user clicks on Size-chart and expects chart in new Tab
    
       
    @Web @PDPFaceLift @CR-Anirudh 
Scenario: verify user is able to see size in text form
	Given user launches the browser and navigates to "ASO_HOME" page 
#	Then User should be able to click on Find Store 
#	And Find Store Modal should pop-up 
#	When User select store with "BOPIS_Store2" 
	When User searches a product "SingleSizeItem" and navigates to PDP 
	And user sets up cookie
    Then user navigates to new pdp page url "SingleSizeItem"
    And user verifies size text available for single size item
    