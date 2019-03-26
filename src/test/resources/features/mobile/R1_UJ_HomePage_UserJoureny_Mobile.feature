Feature: To Verify the Shop Collection to Home Page User Journeys

  @SIT_UserJourney_m @ZYP_HP_K6809-7055 @KER-6809 @C-HPUJ @Mobile @CR-Danush 
  Scenario: Verify User Journey form Shop Collection to CTA to Home Page(through Brand Logo)
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then user should able to click on Signin button
    And user should be able to enter the signin details
    Then User clicks on ASO Logo and should be navigated to Home Page
    Then user click on CTA in Shop Collection
    Then User is navigated to pdp page
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    #And user should be able to see Add to cart button and quantity section
    And user should be able to see ship it button and quantity section
#    When user click on Add to cart button
#    Then user click on checkout button
    And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
    #Then user should able to see shipping Address page
    Then user should be able verify the order summary details
    #Then user should enter the shipping Address details
    Then user click on continue to shipping method button
    #Then user click on continue checkout button
    Then user should able to verify the shipping address
    And user should able to verify the shipping method
    Then user should be able verify the order summary details
    Then user should able to click on Continue to Payment button
    When user should be able see the the payment method page and enter the creditcard details
    Then user should click on continue to review button
    And user enter verified by visa password and click on submit button
    When user should should be able see Order summary page
    Then user should able to verify the Review shipping address
    And user should able to verify the Review shipping method
    When user should able to verify the billing address
    When user should able to verify the payment method
    Then user should be able verify the order summary details
    Then user should click on Place Order Now button
   Then User is able to see the ASO_Logo
    Then User clicks on ASO Logo and should be navigated to Home Page
    Then User closes the web application

  
  @SIT_UserJourney_m @ZYP_HP_K6809-7057 @KER-6809 @C-HPUJ @Mobile @CR-Danush 
  Scenario: Verify User Journey form Shop Collection to CTA to Footer
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then user should able to click on Signin button
    And user should be able to enter the signin details
    Then User clicks on ASO Logo and should be navigated to Home Page
   Then user click on CTA in Shop Collection
    Then User is navigated to pdp page
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    #And user should be able to see Add to cart button and quantity section
    And user should be able to see ship it button and quantity section
#    When user click on Add to cart button
#    Then user click on checkout button
    And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
    #Then user should able to see shipping Address page
    Then user should be able verify the order summary details
    #Then user should enter the shipping Address details
    Then user click on continue to shipping method button
    #Then user click on continue checkout button
    Then user should able to verify the shipping address
    And user should able to verify the shipping method
    Then user should be able verify the order summary details
    Then user should able to click on Continue to Payment button
    When user should be able see the the payment method page and enter the creditcard details
    Then user should click on continue to review button
    And user enter verified by visa password and click on submit button
    When user should should be able see Order summary page
    Then user should able to verify the Review shipping address
    And user should able to verify the Review shipping method
    When user should able to verify the billing address
    When user should able to verify the payment method
    Then user should be able verify the order summary details
    Then user should click on Place Order Now button
    And User will click on expand button
    Then User will verify the presence of Our history
    And User will verify the presence of Careers
    Then User will verify the presence of Press Room
    And User will verify the presence of Investors
    And User will click on expand button for needhelp
    Then User will verify the presence of Check Order
    And User will verify the presence of Return Policy
    Then User will verify the presence of Product Recall
    And User will verify the presence of Rebates
    Then User will verify the presence of Contact Us
   And User will verify the presence of Customer Care
   And User will click on expand button for services
    Then User will verify the presence of Gift Cards
    And User will verify the presence of Academy Credit Card 
    Then User will verify the presence of Store Services
     Then User will verify the presence of FIND A STORE
   Then User will verify the presence of sign up for more deals
    Then User will verify the presence of chat now
    Then User will verify the presence of privacy policy
    And User will verify the presence of Terms and Conditions
    Then User will verify the presence of legal policy
    Then User closes the web application

  @SIT_UserJourney_m @ZYP_HP_K6809-7058 @KER-6809 @C-HPUJ @Mobile @CR-Danush 
  Scenario Outline: : Verify User Journey form Shop Collection to CTA to Find a Store to MyAccount
    Given user launches the browser and navigates to "ASO_HOME" page
   Then User clicks on the burger menu
    Then user should able to click on Signin button
    And user should be able to enter the signin details
    Then User clicks on ASO Logo and should be navigated to Home Page
   Then user click on CTA in Shop Collection
    Then User is navigated to pdp page
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
     #And user should be able to see Add to cart button and quantity section
    And user should be able to see ship it button and quantity section
#    When user click on Add to cart button
#    Then user click on checkout button
    And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
    #Then user should able to see shipping Address page
    Then user should be able verify the order summary details
    #Then user should enter the shipping Address details
    Then user click on continue to shipping method button
    #Then user click on continue checkout button
    Then user should able to verify the shipping address
    And user should able to verify the shipping method
    Then user should be able verify the order summary details
    Then user should able to click on Continue to Payment button
    When user should be able see the the payment method page and enter the creditcard details
    Then user should click on continue to review button
    And user enter verified by visa password and click on submit button
    When user should should be able see Order summary page
    Then user should able to verify the Review shipping address
    And user should able to verify the Review shipping method
    When user should able to verify the billing address
    When user should able to verify the payment method
    Then user should be able verify the order summary details
    Then user should click on Place Order Now button
    Then User clicks on the burger menu
    Then User should be able to click on Find Store
    When User select store with Postal Code
    Then User clicks on the burger menu
    Then User should be able to see Selected_Store in the place of Find a Store link
    Then User clicks on the burger menu
    Then user should verify MyAccount page
    Then User closes the web application

    Examples: 
      | Postal_Code | 
      | FL 34741    |
      

  
  @SIT_UserJourney_m @ZYP_HP_K6809-7059 @KER-6809 @C-HPUJ @Mobile @CR-Danush 
  Scenario Outline: : Verify User Journey form Shop Collection to CTA to Find a Store to HomePage(through Brand Logo)
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then user should able to click on Signin button
    And user should be able to enter the signin details
    Then User clicks on ASO Logo and should be navigated to Home Page
    Then user click on CTA in Shop Collection
    Then User is navigated to pdp page
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    #And user should be able to see Add to cart button and quantity section
    And user should be able to see ship it button and quantity section
#    When user click on Add to cart button
#    Then user click on checkout button
    And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
    #Then user should able to see shipping Address page
    Then user should be able verify the order summary details
    #Then user should enter the shipping Address details
    Then user click on continue to shipping method button
    #Then user click on continue checkout button
    Then user should able to verify the shipping address
    And user should able to verify the shipping method
    Then user should be able verify the order summary details
    Then user should able to click on Continue to Payment button
    When user should be able see the the payment method page and enter the creditcard details
    Then user should click on continue to review button
    And user enter verified by visa password and click on submit button
    When user should should be able see Order summary page
    Then user should able to verify the Review shipping address
    And user should able to verify the Review shipping method
    When user should able to verify the billing address
    When user should able to verify the payment method
    Then user should be able verify the order summary details
    Then user should click on Place Order Now button
    Then User clicks on the burger menu
    Then User should be able to click on Find Store
    When User select store with Postal Code
    Then User clicks on the burger menu
    Then User should be able to see Selected_Store in the place of Find a Store link
    Then User is able to see the ASO_Logo
    Then User clicks on ASO Logo and should be navigated to Home Page
    Then User closes the web application

    Examples: 
      | Postal_Code |
      | FL 34741    |

  
  @SIT_UserJourney_m @ZYP_HP_K6809-7060 @KER-6809 @C-HPUJ @Mobile @CR-Danush 
  Scenario Outline: Verify User Journey form Shop Collection to CTA to Find a Store to Academy Credit
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then user should able to click on Signin button
    And user should be able to enter the signin details
    Then User clicks on ASO Logo and should be navigated to Home Page
    Then user click on CTA in Shop Collection
    Then User is navigated to pdp page
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    #And user should be able to see Add to cart button and quantity section
    And user should be able to see ship it button and quantity section
#    When user click on Add to cart button
#    Then user click on checkout button
    And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
    #Then user should able to see shipping Address page
    Then user should be able verify the order summary details
    #Then user should enter the shipping Address details
    Then user click on continue to shipping method button
    #Then user click on continue checkout button
    Then user should able to verify the shipping address
    And user should able to verify the shipping method
    Then user should be able verify the order summary details
    Then user should able to click on Continue to Payment button
    When user should be able see the the payment method page and enter the creditcard details
    Then user should click on continue to review button
    And user enter verified by visa password and click on submit button
    When user should should be able see Order summary page
    Then user should able to verify the Review shipping address
    And user should able to verify the Review shipping method
    When user should able to verify the billing address
    When user should able to verify the payment method
    Then user should be able verify the order summary details
    Then user should click on Place Order Now button
     Then User clicks on the burger menu
    Then User should be able to click on Find Store
    When User select store with Postal Code
    Then User clicks on the burger menu
    Then User should be able to see Selected_Store in the place of Find a Store link
    Then User clicks on AcademyCredit link and should be navigated to AcademyCreditPage
    Then User closes the web application

    Examples: 
      | Postal_Code | 
      | FL 34741    | 
      

    @SIT_UserJourney_m @ZYP_HP_K6809-7061 @KER-6809 @C-HPUJ @Mobile @CR-Danush 
  Scenario Outline: Verify User Journey form Shop Collection to CTA to Find a Store to Header
    Given user launches the browser and navigates to "ASO_HOME" page
   Then User clicks on the burger menu
    Then user should able to click on Signin button
    And user should be able to enter the signin details
    Then User clicks on ASO Logo and should be navigated to Home Page
    Then user click on CTA in Shop Collection
    Then User is navigated to pdp page
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
     #And user should be able to see Add to cart button and quantity section
    And user should be able to see ship it button and quantity section
#    When user click on Add to cart button
#    Then user click on checkout button
    And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
    #Then user should able to see shipping Address page
    Then user should be able verify the order summary details
    #Then user should enter the shipping Address details
    Then user click on continue to shipping method button
    #Then user click on continue checkout button
    Then user should able to verify the shipping address
    And user should able to verify the shipping method
    Then user should be able verify the order summary details
    Then user should able to click on Continue to Payment button
    When user should be able see the the payment method page and enter the creditcard details
    Then user should click on continue to review button
    And user enter verified by visa password and click on submit button
    When user should should be able see Order summary page
    Then user should able to verify the Review shipping address
    And user should able to verify the Review shipping method
    When user should able to verify the billing address
    When user should able to verify the payment method
    Then user should be able verify the order summary details
    Then user should click on Place Order Now button
     Then User clicks on the burger menu
    Then User should be able to click on Find Store
    When User select store with Postal Code
    Then User clicks on the burger menu
    Then User should be able to see Selected_Store in the place of Find a Store link
   	Then User will verify the presence of ASO Logo
    And User will verify the presence of search
    Then User closes the web application

    Examples: 
      | Postal_Code | 
      | FL 34741    | 
     



    @SIT_UserJourney_m @ZYP_HP_K6809-7062 @KER-6809 @C-HPUJ @Mobile @CR-Danush 
  Scenario: Verify User Journey form Shop Collection to ProductCard to Home Page(through Brand Logo)
    Given user launches the browser and navigates to "ASO_HOME" page
   Then User clicks on the burger menu
    Then user should able to click on Signin button
    And user should be able to enter the signin details
    Then User clicks on ASO Logo and should be navigated to Home Page
    Then user click on Product Card in Shop Collection
    And user should be able to see PDP mention in the current url
    Then User is navigated to pdp page
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
  #And user should be able to see Add to cart button and quantity section
    And user should be able to see ship it button and quantity section
#    When user click on Add to cart button
#    Then user click on checkout button
    And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
    #Then user should able to see shipping Address page
    Then user should be able verify the order summary details
    #Then user should enter the shipping Address details
    Then user click on continue to shipping method button
    #Then user click on continue checkout button
    Then user should able to verify the shipping address
    And user should able to verify the shipping method
    Then user should be able verify the order summary details
    Then user should able to click on Continue to Payment button
    When user should be able see the the payment method page and enter the creditcard details
    Then user should click on continue to review button
    And user enter verified by visa password and click on submit button
    When user should should be able see Order summary page
    Then user should able to verify the Review shipping address
    And user should able to verify the Review shipping method
    When user should able to verify the billing address
    When user should able to verify the payment method
    Then user should be able verify the order summary details
    Then user should click on Place Order Now button
    Then User is able to see the ASO_Logo
    Then User clicks on ASO Logo and should be navigated to Home Page
    Then User closes the web application

    @SIT_UserJourney_m @ZYP_HP_K6809-7063 @KER-6809 @C-HPUJ @Mobile @CR-Danush 
  Scenario: Verify User Journey form Shop Collection to ProductCard to Footer
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then user should able to click on Signin button
    And user should be able to enter the signin details
    Then User clicks on ASO Logo and should be navigated to Home Page
    Then user click on Product Card in Shop Collection
    #And user should be able to see PDP mention in the current url
    Then User is navigated to pdp page
     Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    #And user should be able to see Add to cart button and quantity section
    And user should be able to see ship it button and quantity section
#    When user click on Add to cart button
#    Then user click on checkout button
    And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
#    Then user click on checkout button
    #Then user should able to see shipping Address page
    Then user should be able verify the order summary details
    #Then user should enter the shipping Address details
    Then user click on continue to shipping method button
    #Then user click on continue checkout button
    Then user should able to verify the shipping address
    And user should able to verify the shipping method
    Then user should be able verify the order summary details
    Then user should able to click on Continue to Payment button
    When user should be able see the the payment method page and enter the creditcard details
    Then user should click on continue to review button
    And user enter verified by visa password and click on submit button
    When user should should be able see Order summary page
    Then user should able to verify the Review shipping address
    And user should able to verify the Review shipping method
    When user should able to verify the billing address
    When user should able to verify the payment method
    Then user should be able verify the order summary details
    Then user should click on Place Order Now button
    And User will click on expand button
    Then User will verify the presence of Our history
    And User will verify the presence of Careers
    Then User will verify the presence of Press Room
    And User will verify the presence of Investors
    And User will click on expand button for needhelp
    Then User will verify the presence of Check Order
    And User will verify the presence of Return Policy
    Then User will verify the presence of Product Recall
    And User will verify the presence of Rebates
    Then User will verify the presence of Contact Us
   And User will verify the presence of Customer Care
   And User will click on expand button for services
    Then User will verify the presence of Gift Cards
    And User will verify the presence of Academy Credit Card 
    Then User will verify the presence of Store Services
     Then User will verify the presence of FIND A STORE
   Then User will verify the presence of sign up for more deals
    Then User will verify the presence of chat now
    Then User will verify the presence of privacy policy
    And User will verify the presence of Terms and Conditions
    Then User will verify the presence of legal policy
    Then User closes the web application

  @SIT_UserJourney_m @ZYP_HP_K6809-7064 @KER-6809 @C-HPUJ @Mobile @CR-Danush 
  Scenario Outline: : Verify User Journey form Shop Collection to ProductCard to FindaStore to MyAccount
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then user should able to click on Signin button
    And user should be able to enter the signin details
    Then User clicks on ASO Logo and should be navigated to Home Page
    Then user click on Product Card in Shop Collection
    #And user should be able to see PDP mention in the current url
    Then User is navigated to pdp page
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
 #And user should be able to see Add to cart button and quantity section
    And user should be able to see ship it button and quantity section
#    When user click on Add to cart button
#    Then user click on checkout button
    And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
	   #Then user should able to see shipping Address page
    Then user should be able verify the order summary details
    #Then user should enter the shipping Address details
    Then user click on continue to shipping method button
    #Then user click on continue checkout button
    Then user should able to verify the shipping address
    And user should able to verify the shipping method
    Then user should be able verify the order summary details
    Then user should able to click on Continue to Payment button
    When user should be able see the the payment method page and enter the creditcard details
    Then user should click on continue to review button
    And user enter verified by visa password and click on submit button
    When user should should be able see Order summary page
    Then user should able to verify the Review shipping address
    And user should able to verify the Review shipping method
    When user should able to verify the billing address
    When user should able to verify the payment method
    Then user should be able verify the order summary details
    Then user should click on Place Order Now button
    Then User clicks on the burger menu
    Then User should be able to click on Find Store
    When User select store with Postal Code
    Then User clicks on the burger menu
    Then User should be able to see Selected_Store in the place of Find a Store link
    Then User clicks on the burger menu
    Then user should verify MyAccount page
    Then User closes the web application

    Examples: 
      | Postal_Code | 
      | FL 34741    |
     

    @SIT_UserJourney_m @ZYP_HP_K6809-7065 @KER-6809 @C-HPUJ @Mobile @CR-Danush 
  Scenario Outline: Verify User Journey form Shop Collection to ProductCard to Find a Store to Home Page(through Brand Logo)
    Given user launches the browser and navigates to "ASO_HOME" page
 	Then User clicks on the burger menu
    Then user should able to click on Signin button
    And user should be able to enter the signin details
    Then User clicks on ASO Logo and should be navigated to Home Page
    Then user click on Product Card in Shop Collection
    #And user should be able to see PDP mention in the current url
    Then User is navigated to pdp page
     Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    #And user should be able to see Add to cart button and quantity section
    And user should be able to see ship it button and quantity section
#    When user click on Add to cart button
#    Then user click on checkout button
    And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
    #Then user should able to see shipping Address page
    Then user should be able verify the order summary details
    #Then user should enter the shipping Address details
    Then user click on continue to shipping method button
    #Then user click on continue checkout button
    Then user should able to verify the shipping address
    And user should able to verify the shipping method
    Then user should be able verify the order summary details
    Then user should able to click on Continue to Payment button
    When user should be able see the the payment method page and enter the creditcard details
    Then user should click on continue to review button
    And user enter verified by visa password and click on submit button
    When user should should be able see Order summary page
    Then user should able to verify the Review shipping address
    And user should able to verify the Review shipping method
    When user should able to verify the billing address
    When user should able to verify the payment method
    Then user should be able verify the order summary details
    Then user should click on Place Order Now button
    Then User clicks on the burger menu
    Then User should be able to click on Find Store
    When User select store with Postal Code
    Then User clicks on the burger menu
    Then User should be able to see Selected_Store in the place of Find a Store link
    Then User is able to see the ASO_Logo
    Then User clicks on ASO Logo and should be navigated to Home Page
    Then User closes the web application

    Examples: 
      | Postal_Code |
      | FL 34741    |
     

    @SIT_UserJourney_m @ZYP_HP_K6809-7066 @KER-6809 @C-HPUJ @Mobile @CR-Danush 
  Scenario Outline: Verify User Journey form Shop Collection to ProductCard to Find a Store to Academy Credit
    Given user launches the browser and navigates to "ASO_HOME" page
	Then User clicks on the burger menu
    Then user should able to click on Signin button
    And user should be able to enter the signin details
    Then User clicks on ASO Logo and should be navigated to Home Page
    Then user click on Product Card in Shop Collection
    #And user should be able to see PDP mention in the current url
    Then User is navigated to pdp page
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    #And user should be able to see Add to cart button and quantity section
    And user should be able to see ship it button and quantity section
#    When user click on Add to cart button
#    Then user click on checkout button
    And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
    #Then user should able to see shipping Address page
    Then user should be able verify the order summary details
    #Then user should enter the shipping Address details
    Then user click on continue to shipping method button
    #Then user click on continue checkout button
    Then user should able to verify the shipping address
    And user should able to verify the shipping method
    Then user should be able verify the order summary details
    Then user should able to click on Continue to Payment button
    When user should be able see the the payment method page and enter the creditcard details
    Then user should click on continue to review button
    And user enter verified by visa password and click on submit button
    When user should should be able see Order summary page
    Then user should able to verify the Review shipping address
    And user should able to verify the Review shipping method
    When user should able to verify the billing address
    When user should able to verify the payment method
    Then user should be able verify the order summary details
    Then user should click on Place Order Now button
     Then User clicks on the burger menu
    Then User should be able to click on Find Store
    When User select store with Postal Code
    Then User clicks on the burger menu
    Then User should be able to see Selected_Store in the place of Find a Store link
    Then User clicks on AcademyCredit link and should be navigated to AcademyCreditPage
    Then User closes the web application

    Examples: 
      | Postal_Code | 
      | FL 34741    | 

  
  @SIT_UserJourney_m @ZYP_HP_K6809-7067 @KER-6809 @C-HPUJ @Mobile @CR-Danush 
  Scenario Outline: Verify User Journey form Shop Collection to ProductCard to Find a Store to Header
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then user should able to click on Signin button
    And user should be able to enter the signin details
    Then User clicks on ASO Logo and should be navigated to Home Page
    Then user click on Product Card in Shop Collection
    Then User is navigated to pdp page
   Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
     #And user should be able to see Add to cart button and quantity section
    And user should be able to see ship it button and quantity section
#    When user click on Add to cart button
#    Then user click on checkout button
    And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page
    #Then user should able to see shipping Address page
    Then user should be able verify the order summary details
    #Then user should enter the shipping Address details
    Then user click on continue to shipping method button
    #Then user click on continue checkout button
    Then user should able to verify the shipping address
    And user should able to verify the shipping method
    Then user should be able verify the order summary details
    Then user should able to click on Continue to Payment button
    When user should be able see the the payment method page and enter the creditcard details
    Then user should click on continue to review button
    And user enter verified by visa password and click on submit button
    When user should should be able see Order summary page
    Then user should able to verify the Review shipping address
    And user should able to verify the Review shipping method
    When user should able to verify the billing address
    When user should able to verify the payment method
    Then user should be able verify the order summary details
    Then user should click on Place Order Now button
     Then User clicks on the burger menu
    Then User should be able to click on Find Store
    When User select store with Postal Code
    Then User clicks on the burger menu
    Then User should be able to see Selected_Store in the place of Find a Store link
   	Then User will verify the presence of ASO Logo
    And User will verify the presence of search
    Then User closes the web application

    Examples: 
      | Postal_Code | 
      | FL 34741    | 
