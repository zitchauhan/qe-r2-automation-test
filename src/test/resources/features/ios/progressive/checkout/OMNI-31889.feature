Feature: Feature for adding new ASO credit card for Signed-In and Guest user

  @Sprint5 @ST-OMNI-31889 @TC-OMNI-35915
  Scenario: As an ASO mobile app signed-in   user
  I want to see add ASO credit card screen should display with all the required input field on tapping on add credit card button 
    Given User launches the application
    And User Logs into the application
    And User taps on home in bottom nav
    And User Sees the Search Box
    And User clicks on the Search Box
    And User search for the "WhiteGlove"
    And user click on Product
    And User selects home delivery option
    And User taps on add to cart button
    When User taps on view cart button
    Then User is navigated To Cart Screen
    When User sees the checkout button
    And User taps on checkout button
    Then User sees Shipping Method label
    When user clicks on "Add new Academy card tile" on my account payment page
    Then user is taken to "add new Aso card" on aso card page 
    Then User sees the "Card InforMation" at ASO card Page
     Then User sees the "CardNumberEditBox" at ASO card Page
   Then User sees Save For Future checkbox as default selected
    Then User sees Billing address section
    Then User sees option as Shipping address as billing address
    Then User sees option as Add new billing address
    Then User sees save credit card button as disabled
    Then User sees back button on credit card screen 
    
     Scenario: As an ASO mobile app signed-in usr 
  I want to see an error message when i enter invalid Aso credit card number
    Given User launches the application
    And User Logs into the application
    And User taps on home in bottom nav
    And User Sees the Search Box
    And User clicks on the Search Box
    And User search for the "WhiteGlove"
    And user click on Product
    And User selects home delivery option
    And User taps on add to cart button
    When User taps on view cart button
    Then User is navigated To Cart Screen
    When User sees the checkout button
    And User taps on checkout button
    Then User sees Shipping Method label
    When user clicks on "Add new Academy card tile" on my account payment page
    Then user is taken to "add new Aso card" on aso card page 
    Then User sees the "Card InforMation" at ASO card Page
     Then User sees the "CardNumberEditBox" at ASO card Page
       Then i choose to enter "AsoCard" on aso card page 
   Then User sees invalid card error message
   
   Scenario: As an ASO mobile app signed-in usr 
  I want to see the Save Credit Card button as enabled once i have entered valid credit cards detail
    Given User launches the application
    And User Logs into the application
    And User taps on home in bottom nav
    And User Sees the Search Box
    And User clicks on the Search Box
    And User search for the "WhiteGlove"
    And user click on Product
    And User selects home delivery option
    And User taps on add to cart button
    When User taps on view cart button
    Then User is navigated To Cart Screen
    When User sees the checkout button
    And User taps on checkout button
    Then User sees Shipping Method label
    When user clicks on "Add new Academy card tile" on my account payment page 
    Then user is taken to "add new Aso card" on aso card page 
    Then User sees the "Card InforMation" at ASO card Page
     Then User sees the "CardNumberEditBox" at ASO card Page
   Then i choose to enter "AsoCard" on aso card page 
   Then User click on "Same as shipping address" checkbox
   Then User sees save credit card button as enabled
   
   Scenario: As an ASO mobile app signed-in usr 
  I want to see the Billing cards detail when i select Add Billing section after enter valid credit card detail
    Given User launches the application
    And User Logs into the application
    And User taps on home in bottom nav
    And User Sees the Search Box
    And User clicks on the Search Box
    And User search for the "WhiteGlove"
    And user click on Product
    And User selects home delivery option
    And User taps on add to cart button
    When User taps on view cart button
    Then User is navigated To Cart Screen
    When User sees the checkout button
    And User taps on checkout button
    Then User sees Shipping Method label
    When user clicks on "Add new Academy card tile" on my account payment page 
    Then user is taken to "add new Aso card" on aso card page 
    Then User sees the "Card InforMation" at ASO card Page
     Then User sees the "CardNumberEditBox" at ASO card Page
   Then i choose to enter "AsoCard" on aso card page 
   Then User click on "Same as shipping address" checkbox
    Then User sees save credit card button as enabled
    When user tap on Add billing address  
    Then i choose to enter "ccfirstname" on aso card page 
	Then i choose to enter "ccLastname" on aso card page 
	Then i choose to enter "ccAddress" on aso card page
	Then i choose to enter "ccaprtname" on aso card page
	And i choose to enter "cczipcode" on aso card page
	Then i choose to enter "entercccity" on aso card page
	And i choose to enter "ccmobilenumber" on aso card page
   
  Scenario: As an ASO mobile app signed-in usr 
  I want to see the alert pop up message when user tap on the back button 
  
    Given User launches the application
    And User Logs into the application
    And User taps on home in bottom nav
    And User Sees the Search Box
    And User clicks on the Search Box
    And User search for the "WhiteGlove"
    And user click on Product
    And User selects home delivery option
    And User taps on add to cart button
    When User taps on view cart button
    Then User is navigated To Cart Screen
    When User sees the checkout button
    And User taps on checkout button
    Then User sees Shipping Method label
    When user clicks on "Add new Academy card tile" on my account payment page
    Then user is taken to "add new Aso card" on aso card page 
    Then User sees the "Card InforMation" at ASO card Page
     Then User sees the "CardNumberEditBox" at ASO card Page
 Then i choose to enter "AsoCard" on aso card page 
    Then User sees save credit card button as enabled
    When User taps on back button
    Then User sees alertPopup with message
    Then User sees Continue button on alert popup
    Then User Sees Cancel button on alert popup
     When User taps on "Cancel" button from alert popup
     Then User sees the "Card InforMation" at ASO card Page
     When User taps on back button
    Then User sees alertPopup with message
    Then User sees Continue button on alert popup
    When User taps on "Continue" button from alert popup
    Then User is on Payment screen page
    
    Scenario: As an ASP mobile app signed-in user
    I want to navigate to Payment screen when i tap on Save Aso credit card button once i filled all 
    the detail and no error present on add ASO credit card screen
    Given User launches the application
    And User Logs into the application
    And User taps on home in bottom nav
    And User Sees the Search Box
    And User clicks on the Search Box
    And User search for the "WhiteGlove"
    And user click on Product
    And User selects home delivery option
    And User taps on add to cart button
    When User taps on view cart button
    Then User is navigated To Cart Screen
    When User sees the checkout button
    And User taps on checkout button
    Then User sees Shipping Method label
    When user clicks on "Add new Academy card tile" on my account payment page
    Then user is taken to "add new Aso card" on aso card page 
    Then User sees the "Card InforMation" at ASO card Page
     Then User sees the "CardNumberEditBox" at ASO card Page
 Then i choose to enter "AsoCard" on aso card page 
    Then User sees save credit card button as enabled
  When user clicks on "save card button" on aso card page
		And user see "payment header" on my account payment page
		And user see "existing aso card" on my account payment page
		
		
     Scenario: As an ASP mobile app signed-in user with saved address 
    I want to see the saved address list  
    the detail and no error present on add credit card screen
    Given User launches the application
    And User Logs into the application
    And User taps on home in bottom nav
    And User Sees the Search Box
    And User clicks on the Search Box
    And User search for the "WhiteGlove"
    And user click on Product
    And User selects home delivery option
    And User taps on add to cart button
    When User taps on view cart button
    Then User is navigated To Cart Screen
    When User sees the checkout button
    And User taps on checkout button
    Then User sees Shipping Method label
     When user clicks on "Add new Academy card tile" on my account payment page
    Then user is taken to "add new Aso card" on aso card page 
    Then User sees the "Card InforMation" at ASO card Page
     Then User sees the "CardNumberEditBox" at ASO card Page
 Then i choose to enter "AsoCard" on aso card page 
    Then User sees save credit card button as enabled
    Then User sees saved address in billing section 
    
     Scenario: As as ASP mobile app signed-in user with saved address in account 
   I want to see Save For Future option as unselected default
    Given User launches the application
    And User Logs into the application
    And User taps on home in bottom nav
    And User Sees the Search Box
    And User clicks on the Search Box
    And User search for the "WhiteGlove"
    And user click on Product
    And User selects home delivery option
    And User taps on add to cart button
    When User taps on view cart button
    Then User is navigated To Cart Screen
    When User sees the checkout button
    And User taps on checkout button
    Then User sees Shipping Method label
     When user clicks on "Add new Academy card tile" on my account payment page
    Then user is taken to "add new Aso card" on aso card page 
    Then User sees the "Card InforMation" at ASO card Page
     Then User sees the "CardNumberEditBox" at ASO card Page
    Then User sees save credit card button as enabled
    Then User sees saved address in billing section 
    Then User sees Save For Future checkbox as default un-selected
    
     Scenario: As an ASP mobile app signed-in user
   I want to see the field level error messages on billing address fields.
    Given User launches the application
    And User Logs into the application
    And User taps on home in bottom nav
    And User Sees the Search Box
    And User clicks on the Search Box
    And User search for the "WhiteGlove"
    And user click on Product
    And User selects home delivery option
    And User taps on add to cart button
    When User taps on view cart button
    Then User is navigated To Cart Screen
    When User sees the checkout button
    And User taps on checkout button
    Then User sees Shipping Method label
    When user clicks on "Add new Academy card tile" on my account payment page
    Then user is taken to "add new Aso card" on aso card page 
    Then User sees the "Card InforMation" at ASO card Page
     Then User sees the "CardNumberEditBox" at ASO card Page
    Then User sees save credit card button as enabled
    When user tap on Add billing address
    When User taps on save credit card button
    Then User see an error message for "First Name"
    Then User see an error message for "Last Name"
    Then User see an error message for "ZIP Code"
    Then User see an error message for "State"
    Then User see an error message for "Phone"
      
  
    
    
    
    
       