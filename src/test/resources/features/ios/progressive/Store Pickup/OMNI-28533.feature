Feature: Location Services Setup - Partially automated
 
    
     @Sprint2 @ST-OMNI-28533 @TC-OMNI-31881
    Scenario: Verify user is navigated to home page after selecting "Allow all the time" option on location service page.
    Given User launches the application
    Then User verifies "ALLOW LOCATION SERVICES" option is displayed on the screen
    And User verifies "ENTER CITY OR ZIPCODE" option is displayed on the screen
    And User verifies "Maybe later" option is displayed on the screen
    Then User taps on "ALLOW LOCATION SERVICES" option
    And User verifies location service popup is displayed
    And User taps on "Allow Once" option
    And User continues as guest user
    Then User sees the homepage
    
    @Sprint2 @ST-OMNI-28533 @TC-OMNI-31883
    Scenario: Verify user is navigated to home page after selecting "Allow while using the app" option on location service page.
    Given User launches the application
    Then User verifies "ALLOW LOCATION SERVICES" option is displayed on the screen
    And User verifies "ENTER CITY OR ZIPCODE" option is displayed on the screen
    And User verifies "Maybe later" option is displayed on the screen
    Then User taps on "ALLOW LOCATION SERVICES" option
    And User verifies location service popup is displayed
    And User taps on "Allow while using app" option
    And User continues as guest user
    Then User sees the homepage
    
     @Sprint2 @ST-OMNI-28533 @TC-OMNI-31884
    Scenario: Verify user is navigated to home page after selecting "Don't allow" option on location service page.
    Given User launches the application
    Then User verifies "ALLOW LOCATION SERVICES" option is displayed on the screen
    And User verifies "ENTER CITY OR ZIPCODE" option is displayed on the screen
    And User verifies "Maybe later" option is displayed on the screen
    Then User taps on "ALLOW LOCATION SERVICES" option
    And User verifies location service popup is displayed
    And User taps on "Don't allow" option
    And User continues as guest user
    Then User sees the homepage
    
     @Sprint2 @ST-OMNI-28533 @TC-OMNI-33098
    Scenario: Verify user is navigated to home page after selecting "Don't allow" option on location service page.
    Given User launches the application
    Then User verifies "ALLOW LOCATION SERVICES" option is displayed on the screen
    And User verifies "ENTER CITY OR ZIPCODE" option is displayed on the screen
    And User verifies "Maybe later" option is displayed on the screen
    Then User taps on "Maybe later" option
    And User continues as guest user
    Then User sees the homepage
    
     @Sprint2 @ST-OMNI-28533 @TC-OMNI-33099
    Scenario: Verify user is navigated to home page after selecting "Don't allow" option on location service page.
    Given User launches the application
    Then User verifies "ALLOW LOCATION SERVICES" option is displayed on the screen
    And User verifies "ENTER CITY OR ZIPCODE" option is displayed on the screen
    And User verifies "Maybe later" option is displayed on the screen
    Then User taps on "ENTER CITY OR ZIPCODE" option
    
    