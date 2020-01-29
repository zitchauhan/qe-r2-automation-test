Feature: Validate Presence of circle components
   
  @Web  @PDPFaceLift @CR-Anirudh  
Scenario: verify user is able to see size in text form
	Given user launches the browser and navigates to "ASO_HOME" page  
	When User searches a product "SingleColorItem" and navigates to PDP 
	And user sets up cookie
    Then user navigates to new pdp page url "SingleColorItem"
    And user verifies only colour text is present for single color item
