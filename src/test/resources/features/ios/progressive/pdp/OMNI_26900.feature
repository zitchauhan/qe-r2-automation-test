Feature: PDP- ATC Confirmation - With Variant + Haptic

 @TC_OMNI_26900_1 
 Scenario:  Verify User able to see Product varient Size and color on PDP Page

    Given User launches the application
    When User Clicks On MaY Be Later
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SizeVariantProduct"
    And user click on Product
	And user sees the size varient
	And user sees the color variant
	When User selects home delivery option
    And User taps on add to cart button
    Then I choose to verify "SizeVariantProduct"
    Then I choose to verify "Shipping" label in Overlay
 #  Examples: 
 #    |    Attributes    |	
 #    |    SKU           | 
 #    |    Size          |
  #   |    Qty           |
  #   |    Price         |
	
	
 @TC_OMNI_26900_2
 Scenario: Verify user able to see Product variant of golf ball
  Given User launches the application
    When User Clicks On MaY Be Later
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "FixVariantProduct"
    And user click on Product
	And user sees the size varient
	And user sees the color variant
	When User selects home delivery option
    And User taps on add to cart button
    Then I choose to verify "FixVariantProduct"
    Then I choose to verify "Shipping" label in Overlay
 #  Examples: 
  #   |    Attributes    |	
   #  |    SKU           | 
   #  |    Qty           |
   #  |    Price         |
   
    @TC_OMNI_26900_3 
 Scenario:  Verify User able to see Product varient Size and color on PDP Page with find a store

    Given User launches the application
    When User Clicks On MaY Be Later
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SizeVariantProduct"
    And user click on Product
	And user sees the size varient
	And user sees the color variant
	#When User selects home delivery option->select store from PDP
	When User selects "Store Pick Up" delivery option
    And User taps on add to cart button
    Then I choose to verify "SizeVariantProduct"
    Then I choose to verify "store" label in Overlay
