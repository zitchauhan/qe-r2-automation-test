Feature: Home Page Search

@Dev 
Scenario Outline: From Home Page perform Keyword and SKU Search
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User enter the SKU search "<data>"
    And User click on search icon
    And user should be able to see PDP mention in the current url
    And user verifies the entered SKU id "<data>"
    Then User closes the web application
    Examples:
    |data|
    |112766238|
    |nike mens compression|
    