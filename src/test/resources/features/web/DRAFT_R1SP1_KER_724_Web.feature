Feature: To Verify the presence of "Search Box" in the Global Header

  @Web @KER-724
  Scenario Outline: Verify presence of seach box with search icon on Home page and PLP.
    # This is a partial compeleted scenario. Some part of it to be done manually and need to create test case in zephyr
    Given User launches the browser and navigates to Home page
    Then User should be able to see "Search_Box" on HomePage
    And User navigates to PLP via random search and able to see "Search_Box" on PLP
		Then User closes the web application
    Examples: 
      | pages    |
      | Homepage |
      | PLP      |
      # Search text will add after getting clarification from BA

      
    