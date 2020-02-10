Feature: Prevent customers with a California shipping or billing state from purchasing online

#InProgress
 
	@test21 
	Scenario: Verify Global State Restriction message is displayed if guest user tries to proceed from shipping address 
	with state from restriction lists
	
  	Given user launches the browser and navigates to "ASO_HOME" page 
	#	When user creates an account
		And User searches a product "productName" and navigates to PDP 
	#	And user click on Add to Cart Button 
	#	And user is navigated to Add to cart Notification popup 
	#	When user click on checkout button 
		And user click on ship it button
		And user click on viewcart button
		Then user navigates to Cart Page
		And user clicks on checkout button on cart page
  	And user adds restricted shipment address on checkout page for "guest" user
  	Then global restriction error message is displayed for "CA" on "shipping" section

	@OMNI_165
  Scenario: Verify Global State Restriction message is displayed if guest user tries to proceed from billing address 
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
    And user uncheck the checkbox for Billing address different from shipping address
    And user adds restricted billing address on checkout page
    Then global restriction error message is displayed for "CA" on "payment" section
    

  Scenario: Verify Global State Restriction message is displayed if registered user try to add address in my account 
  with state from restriction lists
  
  Given user launches the browser and navigates to "ASO_HOME" page 
	When user creates an account


  Scenario: Verify Global State Restriction message is displayed if registered user try to edit address in my account 
  with state from restriction lists


  Scenario: Verify Global State Restriction message is displayed if regsitered user try to add payment in my account 
  with state from restriction lists 
  in billing address


  Scenario: Verify Global State Restriction message is displayed if registered user try to edit payment in my account 
  with state from restriction lists in billing address


#Buy Now not visible on New PDP
  Scenario: Verify Global State Restriction message is displayed if user try to add shipping address on enable
    			buy now with state from restriction lists

#Buy Now not visible on New PDP
  Scenario: Verify Global State Restriction message is displayed if user try to add billing address on enable
    			buy now with state from restriction lists

