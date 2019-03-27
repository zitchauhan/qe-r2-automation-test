Feature: To Verify the Shop Collection to Home Page User Journeys

  @SIT_UserJourney @ZYP_HP_K6809-7055 @KER-6809 @C-HPUJ @Web @CR-Danush
  Scenario: Verify User Journey form Shop Collection to CTA to Home Page(through Brand Logo)
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user should able to click on Signin button
    And user should be able to enter the signin details "Login_username" "Login_pwd"
    Then User clicks on ASO Logo and should be navigated to Home Page
    Then user click on CTA in Shop Collection
    Then User is navigated to pdp page
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    #And user should be able to see Add to cart button and quantity section
    #When user click on Add to cart button
    And user should be able to see ship it button and quantity section
	And user click on ship it button
    Then user click on checkout button
    And user verify the shipping address
    And user verify order summary
    Then user click on continue shipping method button
    And user verify shipping method and order summary
    Then user click on continue payment button
    And user enter the payment details
    Then user should click on continue to review button
    And user enter verified by visa password and click on submit button
    And user verify order summary
    And user should able to verify the Review shipping address
    And user should able to verify the Review shipping method
    And user should able to verify the billing address
    And user should able to verify the payment method
    Then user should click on Place Order Now button
    Then User is able to see the ASO_Logo
    Then User clicks on ASO Logo and should be navigated to Home Page
    Then User is able to see the ASO_Logo
    Then User should be navigated to Home_Page
    Then User closes the web application

  
  @SIT_UserJourney @ZYP_HP_K6809-7057 @KER-6809 @C-HPUJ @Web @CR-Danush
  Scenario: Verify User Journey form Shop Collection to CTA to Footer
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user should able to click on Signin button
   And user should be able to enter the signin details "Login_username" "Login_pwd"
    Then User clicks on ASO Logo and should be navigated to Home Page
   Then user click on CTA in Shop Collection
    Then User is navigated to pdp page
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    #And user should be able to see Add to cart button and quantity section
    #When user click on Add to cart button
    And user should be able to see ship it button and quantity section
	And user click on ship it button
    Then user click on checkout button
    And user verify the shipping address
    And user verify order summary
    Then user click on continue shipping method button
    And user verify shipping method and order summary
    Then user click on continue payment button
    And user enter the payment details
    Then user should click on continue to review button
    And user enter verified by visa password and click on submit button
    And user verify order summary
    And user should able to verify the Review shipping address
    And user should able to verify the Review shipping method
    And user should able to verify the billing address
    And user should able to verify the payment method
    Then user should click on Place Order Now button
    Then User will verify the presence of footer links
    Then User closes the web application

  @SIT_UserJourney @ZYP_HP_K6809-7058 @KER-6809 @C-HPUJ @Web @CR-Danush
  Scenario: Verify User Journey form Shop Collection to CTA  to MyAccount
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user should able to click on Signin button
    And user should be able to enter the signin details "Login_username" "Login_pwd"
    Then User clicks on ASO Logo and should be navigated to Home Page
   Then user click on CTA in Shop Collection
    Then User is navigated to pdp page
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    #And user should be able to see Add to cart button and quantity section
    #When user click on Add to cart button
    And user should be able to see ship it button and quantity section
	And user click on ship it button
     Then user click on checkout button
    And user verify the shipping address
    And user verify order summary
    Then user click on continue shipping method button
    And user verify shipping method and order summary
    Then user click on continue payment button
    And user enter the payment details
    Then user should click on continue to review button
    And user enter verified by visa password and click on submit button
    And user verify order summary
    And user should able to verify the Review shipping address
    And user should able to verify the Review shipping method
    And user should able to verify the billing address
    And user should able to verify the payment method
    Then user should click on Place Order Now button
    Then User should be able to click on Find Store
    And Find Store Modal should pop-up
    When User select store with Postal Code
    Then User should be able to see Selected_Store in the place of Find a Store link
    When User select store with City
    Then User should be able to see Selected_Store in the place of Find a Store link
    When User select store with State
    Then User should be able to see Selected_Store in the place of Find a Store link
    Then user should verify MyAccount page
    Then User closes the web application

  @SIT_UserJourney @ZYP_HP_K6809-7059 @KER-6809 @C-HPUJ @Web @CR-Danush
  Scenario: Verify User Journey form Shop Collection to CTA to HomePage(through Brand Logo)
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user should able to click on Signin button
    And user should be able to enter the signin details "Login_username" "Login_pwd"
    Then User clicks on ASO Logo and should be navigated to Home Page
    Then user click on CTA in Shop Collection
    Then User is navigated to pdp page
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    #When user click on Add to cart button
    #And user should be able to see ship it button and quantity section
	And user click on ship it button
    Then user click on checkout button
    And user verify the shipping address
    And user verify order summary
    Then user click on continue shipping method button
    And user verify shipping method and order summary
    Then user click on continue payment button
    And user enter the payment details
    Then user should click on continue to review button
    And user enter verified by visa password and click on submit button
    And user verify order summary
    And user should able to verify the Review shipping address
    And user should able to verify the Review shipping method
    And user should able to verify the billing address
    And user should able to verify the payment method
    Then user should click on Place Order Now button
    Then User should be able to click on Find Store
    And Find Store Modal should pop-up
    When User select store with Postal Code
    Then User should be able to see Selected_Store in the place of Find a Store link
    When User select store with City
    Then User should be able to see Selected_Store in the place of Find a Store link
    When User select store with State
    Then User should be able to see Selected_Store in the place of Find a Store link
    Then User is able to see the ASO_Logo
    Then User clicks on ASO Logo and should be navigated to Home Page
    Then User is able to see the ASO_Logo
    Then User should be navigated to Home_Page
    Then User closes the web application
  
  @SIT_UserJourney @ZYP_HP_K6809-7060 @KER-6809 @C-HPUJ @Web @CR-Danush
  Scenario: Verify User Journey form Shop Collection to CTA to Academy Credit
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user should able to click on Signin button
    And user should be able to enter the signin details "Login_username" "Login_pwd"
    Then User clicks on ASO Logo and should be navigated to Home Page
    Then user click on CTA in Shop Collection
    Then User is navigated to pdp page
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    #And user should be able to see Add to cart button and quantity section
    #When user click on Add to cart button
    And user should be able to see ship it button and quantity section
	And user click on ship it button
    Then user click on checkout button
    And user verify the shipping address
    And user verify order summary
    Then user click on continue shipping method button
    And user verify shipping method and order summary
    Then user click on continue payment button
    And user enter the payment details
    Then user should click on continue to review button
    And user enter verified by visa password and click on submit button
    And user verify order summary
    And user should able to verify the Review shipping address
    And user should able to verify the Review shipping method
    And user should able to verify the billing address
    And user should able to verify the payment method
    Then user should click on Place Order Now button
    Then User should be able to click on Find Store
    And Find Store Modal should pop-up
    When User select store with Postal Code
    Then User should be able to see Selected_Store in the place of Find a Store link
    When User select store with City
    Then User should be able to see Selected_Store in the place of Find a Store link
    When User select store with State
    Then User should be able to see Selected_Store in the place of Find a Store link
    Then User clicks on AcademyCredit link and should be navigated to AcademyCreditPage
    Then User closes the web application
    
    @SIT_UserJourney @ZYP_HP_K6809-7061 @KER-6809 @C-HPUJ @Web @CR-Danush
  Scenario: Verify User Journey form Shop Collection to CTA to Header
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user should able to click on Signin button
   And user should be able to enter the signin details "Login_username" "Login_pwd"
    Then User clicks on ASO Logo and should be navigated to Home Page
    Then user click on CTA in Shop Collection
    Then User is navigated to pdp page
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    #And user should be able to see Add to cart button and quantity section
    #When user click on Add to cart button
    And user should be able to see ship it button and quantity section
	And user click on ship it button
     Then user click on checkout button
    And user verify the shipping address
    And user verify order summary
    Then user click on continue shipping method button
    And user verify shipping method and order summary
    Then user click on continue payment button
    And user enter the payment details
    Then user should click on continue to review button
    And user enter verified by visa password and click on submit button
    And user verify order summary
    And user should able to verify the Review shipping address
    And user should able to verify the Review shipping method
    And user should able to verify the billing address
    And user should able to verify the payment method
    Then user should click on Place Order Now button
    Then User should be able to click on Find Store
    And Find Store Modal should pop-up
    When User select store with Postal Code
    Then User should be able to see Selected_Store in the place of Find a Store link
    When User select store with City
    Then User should be able to see Selected_Store in the place of Find a Store link
    When User select store with State
    Then User should be able to see Selected_Store in the place of Find a Store link
    Then User is able to see the ASO_Logo
    And User will verify the presence of WeeklyAD
    And User will verify the presence of search
    Then User will verify the presence of add to cart icon
   And User will verify the presence of shop category
    Then User will verify the presence of trending category
    And User will verify the presence of deals category
    Then User closes the web application
     


 
    @SIT_UserJourney @ZYP_HP_K6809-7062 @KER-6809 @C-HPUJ @Web @CR-Danush
  Scenario: Verify User Journey form Shop Collection to ProductCard to Home Page(through Brand Logo)
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user should able to click on Signin button
    And user should be able to enter the signin details "Login_username" "Login_pwd"
    Then User clicks on ASO Logo and should be navigated to Home Page
    Then user click on Product Card in Shop Collection
    And user should be able to see PDP mention in the current url
    Then User is navigated to pdp page
    #Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    #Then user should see different attribute and size of the product
    #And user should be able to see Add to cart button and quantity section
    #When user click on Add to cart button
    And user should be able to see ship it button and quantity section
	And user click on ship it button
   Then user click on checkout button
    And user verify the shipping address
    And user verify order summary
    Then user click on continue shipping method button
    And user verify shipping method and order summary
    Then user click on continue payment button
    And user enter the payment details
    Then user should click on continue to review button
    And user enter verified by visa password and click on submit button
    And user verify order summary
    And user should able to verify the Review shipping address
    And user should able to verify the Review shipping method
    And user should able to verify the billing address
    And user should able to verify the payment method
    Then user should click on Place Order Now button
    Then User is able to see the ASO_Logo
    Then User clicks on ASO Logo and should be navigated to Home Page
    Then User is able to see the ASO_Logo
    Then User should be navigated to Home_Page
    Then User closes the web application

    @SIT_UserJourney @ZYP_HP_K6809-7063 @KER-6809 @C-HPUJ @Web @CR-Danush
  Scenario: Verify User Journey form Shop Collection to ProductCard to Footer
    Given user launches the browser and navigates to "ASO_HOME" page 
	Then user should able to click on Signin button 
	And user should be able to enter the signin details "Login_username" "Login_pwd" 
	Then User clicks on ASO Logo and should be navigated to Home Page 
	Then user click on Product Card in Shop Collection 
	#And user should be able to see PDP mention in the current url
	Then User is navigated to pdp page 
	Then user should be able to see Image of the product 
	And user should be able to see the name of the product in title 
	#Then user should see different attribute and size of the product
	#And user should be able to see Add to cart button and quantity section
	#When user click on Add to cart button
	And user should be able to see ship it button and quantity section 
	And user click on ship it button 
	Then user click on checkout button 
	And user verify the shipping address 
	And user verify order summary 
	Then user click on continue shipping method button 
	And user verify shipping method and order summary 
	Then user click on continue payment button 
	And user enter the payment details 
	Then user should click on continue to review button 
	And user enter verified by visa password and click on submit button 
	And user verify order summary 
	And user should able to verify the Review shipping address 
	And user should able to verify the Review shipping method 
	And user should able to verify the billing address 
	And user should able to verify the payment method 
	Then user should click on Place Order Now button 
	Then User will verify the presence of footer links 
	Then User closes the web application 

  @SIT_UserJourney @ZYP_HP_K6809-7064 @KER-6809 @C-HPUJ @Web @CR-Danush
  Scenario: Verify User Journey form Shop Collection to ProductCard to FindaStore to MyAccount
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user should able to click on Signin button
    And user should be able to enter the signin details "Login_username" "Login_pwd"
    Then User clicks on ASO Logo and should be navigated to Home Page
    Then user click on Product Card in Shop Collection
    #And user should be able to see PDP mention in the current url
    Then User is navigated to pdp page
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    #Then user should see different attribute and size of the product
    #And user should be able to see Add to cart button and quantity section
    #When user click on Add to cart button
    And user should be able to see ship it button and quantity section
	And user click on ship it button
     Then user click on checkout button
    And user verify the shipping address
    And user verify order summary
    Then user click on continue shipping method button
    And user verify shipping method and order summary
    Then user click on continue payment button
    And user enter the payment details
    Then user should click on continue to review button
    And user enter verified by visa password and click on submit button
    And user verify order summary
    And user should able to verify the Review shipping address
    And user should able to verify the Review shipping method
    And user should able to verify the billing address
    And user should able to verify the payment method
    Then user should click on Place Order Now button
    Then User should be able to click on Find Store
    And Find Store Modal should pop-up
    When User select store with Postal Code
    Then User should be able to see Selected_Store in the place of Find a Store link
    When User select store with City
    Then User should be able to see Selected_Store in the place of Find a Store link
    When User select store with State
    Then User should be able to see Selected_Store in the place of Find a Store link
    Then user should verify MyAccount page
    Then User closes the web application
     

 @SIT_UserJourney @ZYP_HP_K6809-7065 @KER-6809 @C-HPUJ @Web @CR-Danush
  Scenario: Verify User Journey form Shop Collection to ProductCard to Find a Store to Home Page(through Brand Logo)
    Given user launches the browser and navigates to "ASO_HOME" page 
	Then user should able to click on Signin button 
	And user should be able to enter the signin details "Login_username" "Login_pwd" 
	Then User clicks on ASO Logo and should be navigated to Home Page 
	Then user click on Product Card in Shop Collection 
	#And user should be able to see PDP mention in the current url
	Then User is navigated to pdp page 
	Then user should be able to see Image of the product 
	And user should be able to see the name of the product in title 
	#Then user should see different attribute and size of the product
	#And user should be able to see Add to cart button and quantity section
	#When user click on Add to cart button
	And user should be able to see ship it button and quantity section 
	And user click on ship it button 
	Then user click on checkout button 
	And user verify the shipping address 
	And user verify order summary 
	Then user click on continue shipping method button 
	And user verify shipping method and order summary 
	Then user click on continue payment button 
	And user enter the payment details 
	Then user should click on continue to review button 
	And user enter verified by visa password and click on submit button 
	And user verify order summary 
	And user should able to verify the Review shipping address 
	And user should able to verify the Review shipping method 
	And user should able to verify the billing address 
	And user should able to verify the payment method 
	Then user should click on Place Order Now button 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with Postal Code 
	Then User should be able to see Selected_Store in the place of Find a Store link 
	When User select store with City 
	Then User should be able to see Selected_Store in the place of Find a Store link 
	When User select store with State 
	Then User should be able to see Selected_Store in the place of Find a Store link 
	Then User is able to see the ASO_Logo 
	Then User clicks on ASO Logo and should be navigated to Home Page 
	Then User is able to see the ASO_Logo 
	Then User should be navigated to Home_Page 
	Then User closes the web application 
     

    @SIT_UserJourney @ZYP_HP_K6809-7066 @KER-6809 @C-HPUJ @Web @CR-Danush
  Scenario: Verify User Journey form Shop Collection to ProductCard to Academy Credit
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user should able to click on Signin button
    And user should be able to enter the signin details "Login_username" "Login_pwd"
    Then User clicks on ASO Logo and should be navigated to Home Page
    Then user click on Product Card in Shop Collection
    #And user should be able to see PDP mention in the current url
    Then User is navigated to pdp page
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    #Then user should see different attribute and size of the product
    #And user should be able to see Add to cart button and quantity section
    #When user click on Add to cart button
    And user should be able to see ship it button and quantity section
	And user click on ship it button
   Then user click on checkout button
    And user verify the shipping address
    And user verify order summary
    Then user click on continue shipping method button
    And user verify shipping method and order summary
    Then user click on continue payment button
    And user enter the payment details
    Then user should click on continue to review button
    And user enter verified by visa password and click on submit button
    And user verify order summary
    And user should able to verify the Review shipping address
    And user should able to verify the Review shipping method
    And user should able to verify the billing address
    And user should able to verify the payment method
    Then user should click on Place Order Now button
    Then User should be able to click on Find Store
    And Find Store Modal should pop-up
    When User select store with Postal Code
    Then User should be able to see Selected_Store in the place of Find a Store link
    When User select store with City
    Then User should be able to see Selected_Store in the place of Find a Store link
    When User select store with State
    Then User should be able to see Selected_Store in the place of Find a Store link
    Then User clicks on AcademyCredit link and should be navigated to AcademyCreditPage
    Then User closes the web application

  
  @SIT_UserJourney @ZYP_HP_K6809-7067 @KER-6809 @C-HPUJ @Web @CR-SG
Scenario: Verify User Journey form Shop Collection to ProductCard to Header 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then user should able to click on Signin button 
	And user should be able to enter the signin details "Login_username" "Login_pwd" 
	Then User clicks on ASO Logo and should be navigated to Home Page 
	Then user click on Product Card in Shop Collection 
	#Then User is navigated to pdp page
	Then user should be able to see Image of the product 
	And user should be able to see the name of the product in title 
	#Then user should see different attribute and size of the product
	#And user should be able to see Add to cart button and quantity section 
	#When user click on Add to cart button
	And user should be able to see ship it button and quantity section
	And user click on ship it button 
	Then user click on checkout button 
	And user verify the shipping address 
	And user verify order summary 
	Then user click on continue shipping method button 
	And user verify shipping method and order summary 
	Then user click on continue payment button 
	And user enter the payment details 
	Then user should click on continue to review button 
	And user enter verified by visa password and click on submit button 
	And user verify order summary 
	And user should able to verify the Review shipping address 
	And user should able to verify the Review shipping method 
	And user should able to verify the billing address 
	And user should able to verify the payment method 
	Then user should click on Place Order Now button 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with Postal Code 
	Then User should be able to see Selected_Store in the place of Find a Store link 
	When User select store with City 
	Then User should be able to see Selected_Store in the place of Find a Store link 
	When User select store with State 
	Then User should be able to see Selected_Store in the place of Find a Store link 
	Then User is able to see the ASO_Logo 
	And User will verify the presence of WeeklyAD 
	And User will verify the presence of search 
	Then User will verify the presence of add to cart icon 
	And User will verify the presence of shop category 
	Then User will verify the presence of trending category 
	And User will verify the presence of deals category 
	Then User closes the web application