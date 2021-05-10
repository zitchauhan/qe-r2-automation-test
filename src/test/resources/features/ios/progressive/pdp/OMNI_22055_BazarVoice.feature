Feature: PDP - Validate Bazar Voice feature  on PDP page

	@Sprint06 @OMNI-22055
    Scenario: Validate user is redirected to Question And Answer page when tap on QA link 
  	Given User launches the application
  	When User Clicks On MaY Be Later
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "115481781"
    And I choose to navigate to PDP 
    Then User sees "QA" on PDP page
    When User taps on "QA"
    Then User sees "Question" label on Bazar voice page
    
    
    @Sprint06 @OMNI-22055  
   Scenario: Validate various component on Bazarvoice page 
  	Given User launches the application
  	When User Clicks On MaY Be Later
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "115481781"
    And I choose to navigate to PDP 
    Then User sees "QA" on PDP page
    When User taps on "QA"
    Then User sees "Question" label on Bazar voice page
    Then User sees "Review" label on Bazar voice page
    Then User sees "Ask A Question" button on Bazar voice page
    Then User sees "Sort" button on Bazar voice page
    Then User sees "Answer This Question" button on Bazar voice page 
    
     @Sprint06 @OMNI-22055 
    Scenario: Validate Ask a Question screen on Bazarvoice page 
  	Given User launches the application
  	When User Clicks On MaY Be Later
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "115481781"
    And I choose to navigate to PDP 
    Then User sees "QA" on PDP page
    When User taps on "QA"
    Then User sees "Question" label on Bazar voice page
    Then User sees "Review" label on Bazar voice page
    Then User sees "Ask A Question" button on screen
    When User taps on "Ask A Question" button on screen
    Then User sees "ProductImage" label on screen
    Then User sees "ProductName" label on screen
    Then User sees "Questions" label on screen
    Then User sees "Nickname" label on screen
    Then User sees "Location" label on screen
    Then User sees "Email" label on screen
    Then User sees "Post Question" button on screen
    Then User sees "Questions input" field on screen
    Then User sees "Nickname input" field on screen
    Then User sees "Location input" field on screen
    Then User sees "Location" field on screen
    Then User sees "Post Question" button on screen
    
    
     @Sprint06 @OMNI-22055 @TestRun
    Scenario Outline: Validate user can post the questions on bazarvoice page 
  	Given User launches the application
  	When User Clicks On MaY Be Later
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "115481781"
    And I choose to navigate to PDP 
    Then User sees "QA" on PDP page
    When User taps on "QA"
    Then User sees "Question" label on Bazar voice page
    Then User sees "Review" label on Bazar voice page
    Then User sees "Ask A Question" button on screen
    When User taps on "Ask A Question" button on screen
    Then User sees "ProductImage" label on screen
    Then User sees "ProductName" label on screen
    When  User enter <question> in "Questions input"  on screen
    When  User enter <nickname> in "Nickname input"  on screen
    When  User enter <location> in "Location input"  on screen
    When  User enter <email> in "Email input"  on screen
    When User select Terms and condition checkbox
    Then User sees "Post Question" button on screen
     When User taps on "Post Question" button on screen
     Then User sees "Question" label on Bazar voice page
    Then User sees "Review" label on Bazar voice page
    Then User sees "Ask A Question" button on screen
   
   Examples:
   |question|nickname|location|email|
   |"is Quality good"|"Alex"|"NewYork"|"uat7.academyuser@hotmail.com"|
   
   
   