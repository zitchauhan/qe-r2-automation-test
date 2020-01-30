Feature: Prevent customers with a California shipping or billing state from purchasing online

#InProgress
  
  Scenario: Verify Global State Restriction message is displayed if user trying to move from shipping address
    			with state from restriction lists

    Given user launches the browser and navigates to "ASO_HOME" page
    #When user creates an account
    And User searches a product "productName" and navigates to PDP
    And user click on ship it button
    And user click on viewcart button
    Then user navigates to Cart Page
    And user clicks on checkout button on cart page
    And user adds restricted shipment address on checkout page for "guest" user
    Then global restriction error message is displayed

	@OMNI_165
  Scenario: Verify Global State Restriction message is displayed if user trying to move from billing address
    			with state from restriction lists

    Given user launches the browser and navigates to "ASO_HOME" page
    #When user creates an account
    And User searches a product "productName" and navigates to PDP
    And user click on ship it button
    And user click on viewcart button
    Then user navigates to Cart Page
    And user clicks on checkout button on cart page
    And user adds shipment address on checkout page for "guest" user
    And user selects shipment method on check out page for "guest" user
    And user click on go to payment present in shipping method
    And user uncheck the checkbox for Billing address different from shipping address
    And user adds restricted billing address on checkout page
    Then global restriction error message is displayed

  Scenario: Verify Global State Restriction message is displayed if user try to add address in my account with
    			state from restriction lists


  Scenario: Verify Global State Restriction message is displayed if user try to edit address in my account with
    			state from restriction lists


  Scenario: Verify Global State Restriction message is displayed if user try to add payment in my account with
    			state from restriction lists in billing address


  Scenario: Verify Global State Restriction message is displayed if user try to edit payment in my account with
    			state from restriction lists in billing address


  Scenario: Verify Global State Restriction message is displayed if user try to add shipping address on enable
    			buy now with state from restriction lists


  Scenario: Verify Global State Restriction message is displayed if user try to add billing address on enable
    			buy now with state from restriction lists

