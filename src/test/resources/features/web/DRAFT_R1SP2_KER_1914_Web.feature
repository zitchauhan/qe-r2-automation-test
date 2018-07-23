Feature: To Verify signin/Signup from PDP as Guest user to Create new wish list and select saved wish list

 @Web @KER-1914
  Scenario Outline: Verify user is able to sign in on PDP by clicking Add To Wish List/Sign in and add product to wish list
    Given User launches the browser and navigates to Home page
    #Navigate to any category PDP page
    Then User navigates to PDP page
    #Clicking on Add To Wish List/Sign in user should navigate to sign in page
    And User click on Add To Wish List/Sign in 
    Then User enters the "<username>" & "<Password>"
    #Clicking on submit button user should redirected back to the same PDP
    And User clicks on the submit button
    Then User click on Add To Wish List
    And User click on Select list
    Then Verify the dropdown displayed all existing lists 
    Then User clicks on existing wish list
    And Verify the SKU is added to the Wish list on confirmation modal
    And Verify the confirmation modal "<contain>"
    And Verify the product image on confirmation modal
    Then User click on the wish list link on the confirmation modal
    And Verify user navigates to the corresponding wish list page
    Then User closes the web application

    Examples: 
      |username|Password| contain | 
      |sudhir  |********| This item has been added to your wish list   |  
      
  @Web @KER-1914
  Scenario Outline: Verify user is able to signup on PDP by clicking Add To Wish List/Sign in and add product to wish list
    Given User launches the browser and navigates to Home page
    #Navigate to any category PDP page
    Then User navigates to PDP page
    #Clicking on Add To Wish List/Sign in user should navigate to signin page
    And User click on Add To Wish List/Sign in 
    Then User click on signup
    Then User enters the "<firstname>" "<lastname>" "<email>" "<Password>" and "<CPassword>"
    #Clicking on signup button user should redirected back to the same PDP
    And  User clicks on the signup button
    Then User click on Add To Wish List
    And User click on Select list
    Then If no existing Wish lists, user clicks on Create New List
    And User enter the wish list name in Create New Wish List modal and click on submit button
    Then Verify the SKU is added to the Wish list on confirmation modal
    And Verify the confirmation modal "<contain>"
    And Verify the product image on confirmation modal
    Then User click on the wish list link on the confirmation modal
    And Verify user navigates to the corresponding wish list page
    Then User closes the web application

    Examples: 
      |firstname|lastname   |email           |Password|CPassword| contain | 
      |sudhir   |Dhanaskotti|sudhir@gmail.com|********|*********| This item has been added to your wish list   |  