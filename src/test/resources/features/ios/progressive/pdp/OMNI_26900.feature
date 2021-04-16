Feature: PDP- ATC Confirmation - With Variant + Haptic

    @TC-OMNI-34176 @TC-OMNI-34177 @ST-OMNI-26900
    Scenario Outline:  Verify ATC confirmation with Home  Delivery option
    Given User launches the application
    And User Clicks On MaY Be Later
    And User Goes to home page
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "<VariantType>"
    And user click on Product
    And User Sees the Variant of "<VariantType>" Product
    Then User Change the variants of "<VariantType>" to "<variantSize>" , "<variantColor>" , "<variantWidth>"
    When User selects Home Delivery checkbox
	When User taps on add to cart button
	Then I choose to verify "<VariantType>"
    Then I choose to verify "Shipping" label in Overlay
	
	  Examples:
	  | VariantType  | variantSize | variantColor| variantWidth|
   	  | SizeAndColor | Large       | White      |              |
      | color 		 |  		   |  White     |              |
      | width        |   8          |  Brown    |      D       |
    
    
    
    
    
    
    
    
    
    @TC-OMNI-34178 @TC-OMNI-34179 @ST-OMNI-26900
    Scenario Outline:  Verify ATC confirmation with Store Pick option
    Given User launches the application
    And User Clicks On MaY Be Later
    And User Goes to home page
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "<VariantType>"
    And user click on Product
    And User Sees the Variant of "<VariantType>" Product
    Then User Change the variants of "<VariantType>" to "<variantSize>" , "<variantColor>" , "<variantWidth>"
    When User selects Store Pick up Delivery option
    Then verify Store rado button selected
	When User taps on add to cart button
	Then I choose to verify "<VariantType>"
    Then I choose to verify "Store Pick Up" label in Overlay
	
	  Examples:
	  | VariantType | variantSize | variantColor| variantWidth|
   	  | SizeAndColor | Large       | White      |             |
     # | color 		 |  		   |  White     |             |
     # | width       |   8         |  Brown     |      D       |
    
    
    
