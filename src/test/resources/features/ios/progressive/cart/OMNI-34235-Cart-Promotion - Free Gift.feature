Feature: Validate that User see Free gift item  on cart page 

	@P2 @OMNI-20331 @TC-OMNI-34481
	Scenario: Validate that User see Free gift item  on cart page  when added free gift item
	Given User launches the application
    When User continues as guest user
    Then User sees the homepage
	 When User Sees the Search Box
    Then User clicks on the Search Box
    #change the "SearchKeyword " with gift applicable item while running the script 
    And User search for the "SearchKeyword"
    And user click on Product
    When User taps on add to cart button
    And User taps on View Cart button
    And User is on "Cart" screen
    And User sees "“Free with purchase label" on cart page 
    And User sees "“Free with purchase item title" on cart page 
    And User sees "“Free with purchase item image" on cart page 
    And User sees "Free with purchase item price" on cart page 
     And User sees "Free with purchase item discounted price" on cart page
     And User sees "Free with purchase tool tip" on cart page
     And User sees "Free with purchase tool tip modal" on cart page
      
    