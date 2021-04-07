Feature: PDP- ATC Confirmation - With Variant + Haptic
@TC_OMNI_26900_1 
Scenario:  Verify User able to see Product varient Size and color on PDP Page

    Given User launches the application
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SizeVariantProduct"
    And user click on Product
	And user sees the size varient
	And user sees the color variant
	When User selects home delivery option
	When User selects home delivery option
    And User taps on add to cart button
    And User taps on view cart button
	
	
 @TC_OMNI_26900_2
 Scenario: Verify user able to see Product variant of golf ball

    Given User launches the application
    And User continues as guest user
    Then User sees the homepage
     When User navigate to Home Page
     When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "FixVariantProduct"
    And user click on Product
    Then user sees the Variant on PDP
    And user sees the value of variant
    When User selects home delivery option
    And User taps on add to cart button
    And User taps on view cart button
     