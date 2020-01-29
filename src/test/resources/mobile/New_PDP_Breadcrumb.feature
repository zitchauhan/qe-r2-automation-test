Feature: Validate Breadcrumb on PDP page  
   
    @Web @PDPFaceLift @CR-Anirudh 
Scenario: Verify that user view breadcrumb 
	Given user launches the browser and navigates to "ASO_HOME" page 
#	Then User should be able to click on Find Store 
#	And verify discount is displayed Test
#	And Find Store Modal should pop-up 
#	When User select store with "BOPIS_Store2" 
	And User searches a product "BOPIS_Regular_Product" and navigates to PDP
	And user sets up cookie
    Then user navigates to new pdp page url "BOPIS_Regular_Product"
    Then User verifies breadcrumb is present for the product
    Then User verifies breadcrumb starts with root node and click on root
    And user verifies can navigate to subcategory on breadcrumb
