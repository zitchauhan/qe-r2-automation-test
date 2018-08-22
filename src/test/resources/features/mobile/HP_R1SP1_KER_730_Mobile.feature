Feature: To Verify the functionality of Find a Store link in the global header

  @Mobile @All @C-HP @Regression @KER-730  @ZYP_HP_K730-1965 @1HR
  Scenario: As a User when clicked on Find a Store then user should be navigated to Store Locator Modal
   Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User should be able to click on Find Store
    And Find Store Modal should pop-up
    Then User closes the web application

  @Mobile @All @C-HP @Regression @KER-730  @ZYP_HP_K730-2821 @1HR
  Scenario Outline: As a user, if I have a saved/selected store, it should be displayed in the header in place of the Find a Store link
   Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User should be able to click on Find Store
     And Find Store Modal should pop-up
    When User select store with Postal Code
    Then close the find the store 
    Then User clicks on the burger menu
    Then User should be able to see Selected_Store in the place of Find a Store link
    Then User closes the web application

    Examples: 
      | Postal_Code |
      | FL 32822    |
      | FL 32904    |
      |		|
    
  @Mobile @All @C-HP @Regression @KER-730  @ZYP_HP_K730-2712
  Scenario Outline: As a user, if I have a saved/city store, it should be displayed in the header in place of the Find a Store link
   Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User should be able to click on Find Store
    When User select store with City
    Then close the find the store
    Then User clicks on the burger menu
    Then User should be able to see Selected_Store in the place of Find a Store link
    Then User closes the web application
    
       Examples: 
       | City           |
       | The Crosslands |
       | 34741         |

  @Mobile @All @C-HP @Regression @KER-730  @ZYP_HP_K730-7959
  Scenario Outline: As a user, if I have a saved/state store, it should be displayed in the header in place of the Find a Store link
   Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User should be able to click on Find Store
    When User select store with State
   Then close the find the store
    Then User clicks on the burger menu
    Then User should be able to see Selected_Store in the place of Find a Store link
    Then User closes the web application

    Examples: 
      | State   |
      | Florida |
      |         |
      
  @Mobile @All @C-HP @Regression @KER-730  @ZYP_HP_K730-2713 @1HR
  Scenario Outline: As a user, if I have enterted a special character to search a store, I should see correct messages
   Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User should be able to click on Find Store
    When User enters special character in Store Locator Modal
    Then error message should be displayed
    Then User closes the web application

    Examples: 
      | StoreValue |
      | @		   |

 @Mobile @All @C-HP @Regression @KER-730  @ZYP_HP_K730-2714 @1HR
  Scenario Outline: As a user, if I have enterted a space to serach a store, I should see Zero stores message
   Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User should be able to click on Find Store
    When User enters space in Store Locator Modal
    Then error message should be displayed
    Then User closes the web application

    Examples: 
      | Postal_Code |
      |             |
