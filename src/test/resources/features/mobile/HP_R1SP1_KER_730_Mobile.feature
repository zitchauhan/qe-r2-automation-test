Feature: To Verify the functionality of Find a Store link in the global header

#  @Mobile @All @Homepage @Regression @KER-730 @ZYP-7956
#  Scenario: As a User when clicked on Find a Store then user should be navigated to Store Locator Modal
#    Given User launches the browser and navigates to Home page
#    Then User clicks on the burger menu
#    Then User should be able to click on Find Store
#    And Find Store Modal should pop-up
#    Then User closes the web application
#
#  @Mobile @All @Homepage @Regression @KER-730 @ZYP-7957
#  Scenario Outline: As a user, if I have a saved/selected store, it should be displayed in the header in place of the Find a Store link
#    Given User launches the browser and navigates to Home page
#    Then User clicks on the burger menu
#    Then User should be able to click on Find Store
#     And Find Store Modal should pop-up
#    When User select store with Postal Code
#    Then User clicks on the burger menu
#    Then User should be able to see Selected_Store in the place of Find a Store link
#    Then User closes the web application
#
#    Examples: 
#      | Postal_Code |
#      | FL 32822    |
#      | FL 32904    |
    
  @Mobile @All @Homepage @Regression @KER-730 @ZYP-7958 
  Scenario Outline: As a user, if I have a saved/city store, it should be displayed in the header in place of the Find a Store link
    Given User launches the browser and navigates to Home page
    Then User clicks on the burger menu
    Then User should be able to click on Find Store
    When User select store with City
    Then User clicks on the burger menu
    Then User should be able to see Selected_Store in the place of Find a Store link
    Then User closes the web application
    
       Examples: 
       | City           |
       | The Crosslands |
       |                |

#  @Mobile @All @Homepage @Regression @KER-730 @ZYP-7959
#  Scenario Outline: As a user, if I have a saved/state store, it should be displayed in the header in place of the Find a Store link
#    Given User launches the browser and navigates to Home page
#    Then User clicks on the burger menu
#    Then User should be able to click on Find Store
#    When User select store with State
#    Then User clicks on the burger menu
#    Then User should be able to see Selected_Store in the place of Find a Store link
#    Then User closes the web application
#
#    Examples: 
#      | State   |
#      | Florida |
#      |         |
#      
#  @Mobile @All @Homepage @Regression @KER-730 @ZYP-7960
#  Scenario Outline: As a user, if I have enterted a special character to search a store, I should see correct messages
#    Given User launches the browser and navigates to Home page
#    Then User clicks on the burger menu
#    Then User should be able to click on Find Store
#    When User enters special character in Store Locator Modal
#    Then error message should be displayed
#    Then User closes the web application
#
#    Examples: 
#      | StoreValue |
#      | @		   |
#
# @Mobile @All @Homepage @Regression @KER-730 @ZYP-7961
#  Scenario Outline: As a user, if I have enterted a space to serach a store, I should see Zero stores message
#    Given User launches the browser and navigates to Home page
#    Then User clicks on the burger menu
#    Then User should be able to click on Find Store
#    When User enters space in Store Locator Modal
#    Then error message should be displayed
#    Then User closes the web application
#
#    Examples: 
#      | Postal_Code |
#      |             |
