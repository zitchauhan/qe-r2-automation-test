Feature: Validate quantity selector on pdp

  @Sprint1 @ST-22010
  Scenario: User can see the quantity selector on pdp
    Given User launches the application
    And User Logs into the application
    When User navigates to pdp
    Then User sees quantity stepper
  
  @Sprint1 @ST-22010
  Scenario: User increases the product quantity and the same is updated in the qty box
    Given User launches the application
    And User Logs into the application
    When User navigates to pdp
    Then User sees quantity stepper
		When User taps on increment quantity stepper
		Then Quantity is changed to "2"
		
	@Sprint1 @ST-22010
  Scenario: User should not be able to set qty to zero
    Given User launches the application
    And User Logs into the application
    When User navigates to pdp
    Then User sees quantity stepper
		When User taps on decrement quantity stepper
		Then Quantity is changed to "1"
		
	@Sprint1 @ST-22010
	Scenario: User should not be able to increase the qty to more than 999
    Given User launches the application
    And User Logs into the application
    When User navigates to pdp
    Then User sees quantity stepper
		When User sets qty to "999"
		Then Quantity is changed to "999"
		When User taps on increment quantity stepper
		Then Quantity is changed to "999"