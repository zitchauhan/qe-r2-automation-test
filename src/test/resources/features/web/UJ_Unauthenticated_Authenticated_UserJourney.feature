Feature: To Verify Unauthenticated/Authenticated UserJourney

  @SIT_UserJourney @ZYP_UNA_K6809-7068 @KER-6809 @C-UnauthenticatedUJ @Web @CR-Danush
  Scenario: Verify Unauthenticated User Journey form Home Page to Header
    Given user launches the browser and navigates to "ASO_HOME" page
    When user clicks on one of the category and navigates to LOne page
    Then user clicks on one of the subcategory and navigates to LTwo page
    And user is able to see the product category name in section title.
    Then user clicks on one of the product category and navigates to LThree page
    Then User is navigated to pdp page
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    And user should be able to see Add to cart button and quantity section
    When user click on Add to cart button
    Then user click on Checkout as Guest button
    Then user should able to see shipping Address page
    And user verify order summary
    Then user should enter the shipping Address details
    Then user click on continue to shipping method button
    Then user click on continue checkout button
 	And user verify order summary
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
    And User will verify the presence of WeeklyAD
    And User will verify the presence of search
    Then User will verify the presence of add to cart icon
   And User will verify the presence of shop category
    Then User will verify the presence of trending category
    And User will verify the presence of deals category
    Then User closes the web application

 
  @SIT_UserJourney @ZYP_UNA_K6809-7069 @KER-6809 @C-UnauthenticatedUJ @Web @CR-Danush
  Scenario: Verify Unauthenticated User Journey form Home Page to Footer
    Given user launches the browser and navigates to "ASO_HOME" page
    When user clicks on one of the category and navigates to LOne page
    Then user clicks on one of the subcategory and navigates to LTwo page
    And user is able to see the product category name in section title.
    Then user clicks on one of the product category and navigates to LThree page
    Then User is navigated to pdp page
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    And  user should be able to see Add to cart button and quantity section
    When user click on Add to cart button
   Then user click on Checkout as Guest button
    Then user should able to see shipping Address page
    And user verify order summary
    Then user should enter the shipping Address details
    Then user click on continue to shipping method button
    Then user click on continue checkout button
 	And user verify order summary
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

   
  @SIT_UserJourney @ZYP_UNA_K6809-7070 @KER-6809 @C-UnauthenticatedUJ @Web @CR-Danush
  Scenario: Verify Unauthenticated User Journey form Home Page to Home Page
    Given user launches the browser and navigates to "ASO_HOME" page
    When user clicks on one of the category and navigates to LOne page
    Then user clicks on one of the subcategory and navigates to LTwo page
    And user is able to see the product category name in section title.
    Then user clicks on one of the product category and navigates to LThree page
    Then User is navigated to pdp page
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    And user should be able to see Add to cart button and quantity section
    When user click on Add to cart button
    Then user click on Checkout as Guest button
    Then user should able to see shipping Address page
    And user verify order summary
    Then user should enter the shipping Address details
    Then user click on continue to shipping method button
    Then user click on continue checkout button
 	And user verify order summary
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
    Then User closes the web application

     
  @SIT_UserJourney @ZYP_UNA_K6809-7097 @KER-6809 @C-UnauthenticatedUJ @Web @CR-Danush
  Scenario: Verify Unauthenticated User Journey form Home Page to Wishlist to Header
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user click on CTA in Shop Collection
    Then User is navigated to pdp page
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    Then user click on Add to Wish List/Sign In
     And user should be able to enter the signin details "Login_username" "Login_pwd"
    Then user click on Add to Wish List/Sign In
    Then user should create a WishList
    Then User is able to see the ASO_Logo
    And User will verify the presence of WeeklyAD
    And User will verify the presence of search
    Then User will verify the presence of add to cart icon
   And User will verify the presence of shop category
    Then User will verify the presence of trending category
    And User will verify the presence of deals category
    Then User closes the web application

  
  @SIT_UserJourney @ZYP_UNA_K6809-7072 @KER-6809 @C-UnauthenticatedUJ @Web @CR-Danush
  Scenario: Verify Unauthenticated User Journey form Home Page to Wishlist to Footer
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user click on CTA in Shop Collection
    Then User is navigated to pdp page
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    Then user click on Add to Wish List/Sign In
     And user should be able to enter the signin details "Login_username" "Login_pwd"
    Then user click on Add to Wish List/Sign In
    Then user should create a WishList
    Then User will verify the presence of footer links
    Then User closes the web application

   
  @SIT_UserJourney @ZYP_UNA_K6809-7073 @KER-6809 @C-UnauthenticatedUJ @Web @CR-Danush
  Scenario: Verify Unauthenticated User Journey form Home Page to Wishlist to HomePage
    Given user launches the browser and navigates to "ASO_HOME" page
    #When user click on Best Sellers product
    Then user click on CTA in Shop Collection
    Then User is navigated to pdp page
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    Then user click on Add to Wish List/Sign In
     And user should be able to enter the signin details "Login_username" "Login_pwd"
    Then user click on Add to Wish List/Sign In
    Then user should create a WishList
    Then user should delete the created WishList
    Then User is able to see the ASO_Logo
    Then User clicks on ASO Logo and should be navigated to Home Page
    Then User closes the web application

  
  @SIT_UserJourney @ZYP_UNA_K6809-7074 @KER-6809 @C-AuthenticatedUJ @Web @CR-Danush
  Scenario: Verify Authenticated User Journey form Home Page to L1/L2/L3 to Home Page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user should able to click on Signin button
     And user should be able to enter the signin details "Login_username" "Login_pwd"
    Then User clicks on ASO Logo and should be navigated to Home Page
    When user clicks on one of the category and navigates to LOne page
    Then user clicks on one of the subcategory and navigates to LTwo page
    And user is able to see the product category name in section title.
    Then user clicks on one of the product category and navigates to LThree page
    Then User is navigated to pdp page
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    And user should be able to see Add to cart button and quantity section
    Then user click on Add to Wish List/Sign In
    Then user should create a WishList
    Then user click on Add to Wish List/Sign In
    Then User is able to see the ASO_Logo
    Then User clicks on ASO Logo and should be navigated to Home Page
    Then User closes the web application

     
  @SIT_UserJourney @ZYP_UNA_K6809-7075 @KER-6809 @C-AuthenticatedUJ @Web @CR-Danush
  Scenario: Verify Authenticated User Journey form Home Page to Header
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user should able to click on Signin button
    And user should be able to enter the signin details "Login_username" "Login_pwd"
    Then User clicks on ASO Logo and should be navigated to Home Page
    When user clicks on one of the category and navigates to LOne page
    Then user clicks on one of the subcategory and navigates to LTwo page
    And user is able to see the product category name in section title.
    Then user clicks on one of the product category and navigates to LThree page
    Then User is navigated to pdp page
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    And user should be able to see Add to cart button and quantity section
    When user click on Add to cart button
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
    And User will verify the presence of WeeklyAD
    And User will verify the presence of search
    Then User will verify the presence of add to cart icon
   And User will verify the presence of shop category
    Then User will verify the presence of trending category
    And User will verify the presence of deals category
    Then User closes the web application

  @SIT_UserJourney @KER-7076 @KER-6809 @C-AuthenticatedUJ @Web @CR-Danush
  Scenario: Verify Authenticated User Journey form Home Page to Footer
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user should able to click on Signin button
     And user should be able to enter the signin details "Login_username" "Login_pwd"
    Then User clicks on ASO Logo and should be navigated to Home Page
    When user clicks on one of the category and navigates to LOne page
    Then user clicks on one of the subcategory and navigates to LTwo page
    And user is able to see the product category name in section title.
    Then user clicks on one of the product category and navigates to LThree page
    Then User is navigated to pdp page
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    And user should be able to see Add to cart button and quantity section
    When user click on Add to cart button
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
    And User will verify the presence of WeeklyAD
    And User will verify the presence of search
    Then User will verify the presence of add to cart icon
   And User will verify the presence of shop category
    Then User will verify the presence of trending category
    And User will verify the presence of deals category
    Then User closes the web application

  @SIT_UserJourney @ZYP_UNA_K6809-7076 @KER-6809 @C-AuthenticatedUJ @Web @CR-Danush
  Scenario: Verify Authenticated User Journey form Home Page to Footer
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user should able to click on Signin button
     And user should be able to enter the signin details "Login_username" "Login_pwd"
    Then User clicks on ASO Logo and should be navigated to Home Page
    When user clicks on one of the category and navigates to LOne page
    Then user clicks on one of the subcategory and navigates to LTwo page
    And user is able to see the product category name in section title.
    Then user clicks on one of the product category and navigates to LThree page
    Then User is navigated to pdp page
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    And user should be able to see Add to cart button and quantity section
    When user click on Add to cart button
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
    And User will verify the presence of WeeklyAD
    And User will verify the presence of search
    Then User will verify the presence of add to cart icon
   And User will verify the presence of shop category
    Then User will verify the presence of trending category
    And User will verify the presence of deals category
    Then User closes the web application

    @SIT_UserJourney @ZYP_UNA_K6809-7077 @KER-6809 @C-AuthenticatedUJ @Web @CR-Danush
  Scenario: Verify Authenticated User Journey form Home Page to Home Page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user should able to click on Signin button
    And user should be able to enter the signin details "Login_username" "Login_pwd"
    Then User clicks on ASO Logo and should be navigated to Home Page
    When user clicks on one of the category and navigates to LOne page
    Then user clicks on one of the subcategory and navigates to LTwo page
    And user is able to see the product category name in section title.
    Then user clicks on one of the product category and navigates to LThree page
    Then User is navigated to pdp page
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    And user should be able to see Add to cart button and quantity section
    When user click on Add to cart button
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
    Then User closes the web application
