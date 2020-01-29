Feature: Validate Product recommendations on PDP page 
   
 #   @Web  @PDPFaceLift @CR-Anirudh
Scenario: Verify that user can see product recommendations
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User searches a product "RecommendationPresent" and navigates to PDP
	And user sets up cookie
    Then user navigates to new pdp page url "RecommendationPresent"
    Then user verifies product recommendations are present

    
   #    @Web  @PDPFaceLift @CR-Anirudh
Scenario: Verify that no product recommendations are present on PDP page
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User searches a product "Recommendation_not_presentSKU" and navigates to PDP
	And user sets up cookie
    Then user navigates to new pdp page url "Recommendation_not_presentSKU"
    Then user verifies product recommendations are not present
    