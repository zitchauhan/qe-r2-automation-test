Feature: Verify Verients of the PDP product
@Sprint1 @TC-OMNI-29808 @ST-22047
Scenario Outline:  Verify User able to see  and change Product varient Size and color on PDP Page

    Given User launches the application
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "<Variant Type>"
    And user click on Product
    And User Sees the Variant of "<Variant Type>" Product
    Then User Change the variants of "<Variant Type>" to "<variantSize>" , "<variantColor>"
     And user click on Home Delivery
	When User taps on add to cart button
	And User sees the "<variantSize>" and "<variantColor>" of selected Product "<Variant Type>"
	
	
	  Examples:
    | Variant Type | variantSize | variantColor | 
    
    | SizeAndColor | Large | White |   |
    | color |  |  White |  |
    
	
	@Sprint1 @TC-OMNI-29808 @ST-22047
Scenario: Verify User able to See Size Chart

    Given User launches the application
    And User continues as guest user
    Then User sees the homepage
	 When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SizeAndColor"
    And user click on Product
	And user sees the size chart button
	When user click on size chart button
	Then user sees the size chart 
	When user click on cancel button
	Then user navigate to PDP Page
   
 

	
	
     


	
	
	
     
  
	

	
	
	
	
 	


