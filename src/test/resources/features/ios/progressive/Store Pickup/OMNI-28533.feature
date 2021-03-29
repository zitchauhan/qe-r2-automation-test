Feature: Location Services Setup - Partially automated
 
    
     @Sprint2 @ST-OMNI-28533 @TC-OMNI-31881
    Scenario: Verify user is navigated to home page after selecting "Allow all the time" option on location service page.
    Given User launches the application
    And User continues as guest user
	 When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword"
    And user click on Product
    Then User taps on change store link
    Then User navigated to find your nearest store page
    Then User verifies "allow location services" option is displayed on the screen
    And User verifies "Enter city or zip code" option is displayed on the screen
    And User verifies "Maybe later" option is displayed on the screen
    Then User taps on "allow location services" option
    And User verifies location service popup is displayed
    And User taps on "Allow all the time" option
    Then User sees the homepage
    
    @Sprint2 @ST-OMNI-28533 @TC-OMNI-31883
    Scenario: Verify user is navigated to home page after selecting "Allow while using the app" option on location service page.
    Given User launches the application
    And User continues as guest user
	 When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword"
    And user click on Product
    Then User taps on change store link
    Then User navigated to find your nearest store page
    Then User verifies "allow location services" option is displayed on the screen
    And User verifies "Enter city or zip code" option is displayed on the screen
    And User verifies "Maybe later" option is displayed on the screen
    Then User taps on "allow location services" option
    And User verifies location service popup is displayed
    And User taps on "Allow while using the app" option
    Then User sees the homepage
    
     @Sprint2 @ST-OMNI-28533 @TC-OMNI-31884
    Scenario: Verify user is navigated to home page after selecting "Don't allow" option on location service page.
    Given User launches the application
    And User continues as guest user
	 When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword"
    And user click on Product
    Then User taps on change store link
    Then User navigated to find your nearest store page
    Then User verifies "allow location services" option is displayed on the screen
    And User verifies "Enter city or zip code" option is displayed on the screen
    And User verifies "Maybe later" option is displayed on the screen
    Then User taps on "allow location services" option
    And User verifies location service popup is displayed
    And User taps on "Don't allow" option
    Then User sees the homepage
    