Feature: To Verify Unauthenticated/Authenticated UserJourney

  @SIT_UserJourney_m @KER-7068 @KER-6809 @C-UnauthenticatedUJ @Mobile @CR-Danush 
  Scenario: Verify Unauthenticated User Journey form Home Page to Header
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    And User navigates to L3
    Then user clicks on the product card and navigates to PDP of the product
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    And user should be able to see Add to cart button and quantity section
    When user click on Add to cart button
    Then user click on checkout button
    Then user should verify the Guest checkout Page
    Then user click on Checkout as Guest button
    Then user should able to see shipping Address page
    Then user should be able verify the order summary details
    Then user should enter the shipping Address details
    Then user click on continue to shipping method button
    Then user click on continue checkout button
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
    Then User will verify the presence of ASO Logo
    And User will verify the presence of search
    Then User closes the web application
    
    
    
    @SIT_UserJourney_m @KER-7069 @KER-6809 @C-UnauthenticatedUJ @Mobile @CR-Danush 
  Scenario: Verify Unauthenticated User Journey form Home Page to Footer
    Given user launches the browser and navigates to "ASO_HOME" page
   Then User clicks on the burger menu
    And User navigates to L3
    Then user clicks on the product card and navigates to PDP of the product
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    And  user should be able to see Add to cart button and quantity section
    When user click on Add to cart button
    Then user click on checkout button
    Then user should verify the Guest checkout Page
    Then user click on Checkout as Guest button
    Then user should able to see shipping Address page
    Then user should be able verify the order summary details
    Then user should enter the shipping Address details
    Then user click on continue to shipping method button
    Then user click on continue checkout button
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
    And User will verify the presence of Giving Back
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
    
    
     @SIT_UserJourney_m @KER-7070 @KER-6809 @C-UnauthenticatedUJ @Mobile @CR-Danush 
  Scenario: Verify Unauthenticated User Journey form Home Page to Home Page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    And User navigates to L3
    Then user clicks on the product card and navigates to PDP of the product
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    And user should be able to see Add to cart button and quantity section
    When user click on Add to cart button
    Then user click on checkout button
    Then user should verify the Guest checkout Page
    Then user click on Checkout as Guest button
    Then user should able to see shipping Address page
    Then user should be able verify the order summary details
    Then user should enter the shipping Address details
    Then user click on continue to shipping method button
    Then user click on continue checkout button
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
    
    
    @SIT_UserJourney_m @KER-7097 @KER-6809 @C-UnauthenticatedUJ @Mobile @CR-Danush 
  Scenario: Verify Unauthenticated User Journey form Home Page to Wishlist to Header
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user click on CTA in Shop Collection
    Then User is navigated to pdp page
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    Then user click on Add to Wish List/Sign In
    And user should be able to enter the signin details
    Then user click on Add to Wish List/Sign In
    Then user should create a WishList
    Then User will verify the presence of ASO Logo
	And User will verify the presence of search
    Then User closes the web application
    
    
    @SIT_UserJourney_m @KER-7072 @KER-6809 @C-UnauthenticatedUJ @Mobile @CR-Danush 
  Scenario: Verify Unauthenticated User Journey form Home Page to Wishlist to Footer
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user click on CTA in Shop Collection
    Then User is navigated to pdp page
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    Then user click on Add to Wish List/Sign In
    And user should be able to enter the signin details
    Then user click on Add to Wish List/Sign In
    Then user should create a WishList
    And User will click on expand button
    Then User will verify the presence of Our history
    And User will verify the presence of Careers
    Then User will verify the presence of Press Room
    And User will verify the presence of Giving Back
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

   
  @SIT_UserJourney_m @KER-7073 @KER-6809 @C-UnauthenticatedUJ @Mobile @CR-Danush 
  Scenario: Verify Unauthenticated User Journey form Home Page to Wishlist to HomePage
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user click on CTA in Shop Collection
    Then User is navigated to pdp page
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    Then user click on Add to Wish List/Sign In
    And user should be able to enter the signin details
    Then user click on Add to Wish List/Sign In
    Then user should create a WishList
    Then user should delete a WishList
     Then User is able to see the ASO_Logo
    Then User clicks on ASO Logo and should be navigated to Home Page
    Then User closes the web application
    
    
    @SIT_UserJourney_m @KER-7074 @KER-6809 @C-AuthenticatedUJ @Mobile @CR-Danush 
  Scenario: Verify Authenticated User Journey form Home Page to L1/L2/L3 to Home Page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then user should able to click on Signin button
    And user should be able to enter the signin details
    Then User clicks on the burger menu
    And User navigates to L3
    Then user clicks on the product card and navigates to PDP of the product
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    And user should be able to see Add to cart button and quantity section
    Then user click on Add to Wish List/Sign In
    Then user should create a WishList
    Then User is able to see the ASO_Logo
    Then User clicks on ASO Logo and should be navigated to Home Page
    Then User closes the web application




	 @SIT_UserJourney_m @KER-7075 @KER-6809 @C-AuthenticatedUJ @Mobile @CR-Danush 
  Scenario: Verify Authenticated User Journey form Home Page to Header
   Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then user should able to click on Signin button
    And user should be able to enter the signin details
    Then User clicks on the burger menu
    And User navigates to L3
    Then user clicks on the product card and navigates to PDP of the product
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    And user should be able to see Add to cart button and quantity section
    When user click on Add to cart button
    Then user click on checkout button
    #Then user should able to see shipping Address page
    Then user should be able verify the order summary details
    #Then user should enter the shipping Address details
    Then user click on continue to shipping method button
   # Then user click on continue checkout button
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
    Then User will verify the presence of ASO Logo
    And User will verify the presence of search
    Then User closes the web application
    
    
    
     @SIT_UserJourney_m @KER-7075 @KER-6809 @C-AuthenticatedUJ @Mobile @CR-Danush 
  Scenario: Verify Authenticated User Journey form Home Page to Footer
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then user should able to click on Signin button
    And user should be able to enter the signin details
    Then User clicks on the burger menu
    And User navigates to L3
    Then user clicks on the product card and navigates to PDP of the product
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    And user should be able to see Add to cart button and quantity section
    When user click on Add to cart button
    Then user click on checkout button
    #Then user should able to see shipping Address page
    Then user should be able verify the order summary details
    #Then user should enter the shipping Address details
    Then user click on continue to shipping method button
   # Then user click on continue checkout button
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
    And User will verify the presence of Giving Back
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
    
    
     @SIT_UserJourney_m @KER-7077 @KER-6809 @C-AuthenticatedUJ @Mobile @CR-Danush 
  Scenario: Verify Authenticated User Journey form Home Page to Home Page
   Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then user should able to click on Signin button
    And user should be able to enter the signin details
    Then User clicks on the burger menu
    And User navigates to L3
    Then user clicks on the product card and navigates to PDP of the product
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    And user should be able to see Add to cart button and quantity section
    When user click on Add to cart button
    Then user click on checkout button
    #Then user should able to see shipping Address page
    Then user should be able verify the order summary details
    #Then user should enter the shipping Address details
    Then user click on continue to shipping method button
   # Then user click on continue checkout button
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
    
