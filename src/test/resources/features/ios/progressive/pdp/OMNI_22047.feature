Feature: Verify Verients of the PDP product
@Sprint1 @TC-OMNI-29808 @ST-22047
Scenario Outline:  Verify User able to see  and change Product varient Size and color on PDP Page

    Given User launches the application
   And User Clicks On MaY Be Later
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "<VariantType>"
    And user click on Product
    And User Sees the Variant of "<VariantType>" Product
    Then User Change the variants of "<VariantType>" to "<variantSize>" , "<variantColor>" , "<variantWidth>"
    When User selects Home Delivery checkbox
	When User taps on add to cart button
	And User sees the "<variantSize>" and "<variantColor>" and "<variantWidth>" of selected Product "<VariantType>"
	
	  Examples:
	  | VariantType | variantSize | variantColor| variantWidth |
   	  | SizeAndColor | Large       | White      |           |
      | color 		 |  		   |  White     |           |
      | width        |   8         |  Brown     |      D    |
	
	@Sprint1 @TC-OMNI-29808 @ST-22047
Scenario: Verify User able to See Size Chart

    Given User launches the application
   And User Clicks On MaY Be Later
    And User Goes to home page
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
   
 

	
	
     


	
	
	
     
  
	

	
	
	
	
 	


