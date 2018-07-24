Feature: To Verify Unauthenticated/Authenticated UserJourney

  @SIT_UserJourney @KER-7068 @KER-6809
  Scenario: Verify Unauthenticated User Journey form Home Page to Header
    Given user launches the browser and navigates to "ASO_HOME" page
    When user clicks on one of the category and navigates to LOne page
    And user is able to see the product category name in section title.
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
    Then User will verify the presence of ASO Logo in Header
    Then User will verify the presence of Sign In in Header
    Then User will verify the presence of WeeklyAD in Header
    Then User will verify the presence of Find a Store in Header
    Then User will verify the presence of search in Header
    Then User will verify the presence of add to cart icon in Header
    Then User will verify the presence of shop category in Header
    Then User will verify the presence of trending category in Header
    Then User will verify the presence of deals category in Header
    Then User closes the web application

 
  @SIT_UserJourney @KER-7069 @KER-6809
  Scenario: Verify Unauthenticated User Journey form Home Page to Footer
    Given user launches the browser and navigates to "ASO_HOME" page
    When user clicks on one of the category and navigates to LOne page
    And user is able to see the product category name in section title.
    Then user clicks on one of the subcategory and navigates to LTwo page
    And user is able to see the product category name in section title.
    Then user clicks on one of the product category and navigates to LThree page
    Then User is navigated to pdp page
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
    Then User will verify the presence of Our history in Footer
    Then User will verify the presence of Careers in Footer
    Then User will verify the presence of Press Room in Footer
    Then User will verify the presence of Giving Back in Footer
    Then User will verify the presence of Check Order in Footer
    Then User will verify the presence of Return Policy in Footer
    Then User will verify the presence of Product Recall in Footer
    Then User will verify the presence of Rebates in Footer
    Then User will verify the presence of Contact Us in Footer
    Then User will verify the presence of Customer Care in Footer
    Then User will verify the presence of Gift Cards in Footer
    Then User will verify the presence of Academy Credit Card in Footer
    Then User will verify the presence of Store Services in Footer
    Then User will verify the presence of FIND A STORE in Footer
    Then User will verify the presence of sign up for more deals in Footer
    Then User will verify the presence of chat now in Footer
    Then User closes the web application

   
  @SIT_UserJourney @KER-7070 @KER-6809
  Scenario: Verify Unauthenticated User Journey form Home Page to Home Page
    Given user launches the browser and navigates to "ASO_HOME" page
    When user clicks on one of the category and navigates to LOne page
    And user is able to see the product category name in section title.
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

     
  @SIT_UserJourney @KER-7097 @KER-6809
  Scenario: Verify Unauthenticated User Journey form Home Page to Wishlist to Header
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user click on CTA in Shop Collection
    Then User is navigated to pdp page
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    Then user click on Add to Wish List/Sign In
    And user should be able to enter the signin details
    Then user should create a WishList
    Then User will verify the presence of ASO Logo in Header
    Then User will verify the presence of Sign In in Header
    Then User will verify the presence of WeeklyAD in Header
    Then User will verify the presence of Find a Store in Header
    Then User will verify the presence of search in Header
    Then User will verify the presence of add to cart icon in Header
    Then User will verify the presence of shop category in Header
    Then User will verify the presence of trending category in Header
    Then User will verify the presence of deals category in Header
    Then User closes the web application

  
  @SIT_UserJourney @KER-7072 @KER-6809
  Scenario: Verify Unauthenticated User Journey form Home Page to Wishlist to Footer
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user click on CTA in Shop Collection
    Then User is navigated to pdp page
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    Then user click on Add to Wish List/Sign In
    And user should be able to enter the signin details
    Then user should create a WishList
    Then User will verify the presence of Our history in Footer
    Then User will verify the presence of Careers in Footer
    Then User will verify the presence of Press Room in Footer
    Then User will verify the presence of Giving Back in Footer
    Then User will verify the presence of Check Order in Footer
    Then User will verify the presence of Return Policy in Footer
    Then User will verify the presence of Product Recall in Footer
    Then User will verify the presence of Rebates in Footer
    Then User will verify the presence of Contact Us in Footer
    Then User will verify the presence of Customer Care in Footer
    Then User will verify the presence of Gift Cards in Footer
    Then User will verify the presence of Academy Credit Card in Footer
    Then User will verify the presence of Store Services in Footer
    Then User will verify the presence of FIND A STORE in Footer
    Then User will verify the presence of sign up for more deals in Footer
    Then User will verify the presence of chat now in Footer
    Then User closes the web application

   
  @SIT_UserJourney @KER-7073 @KER-6809
  Scenario: Verify Unauthenticated User Journey form Home Page to Wishlist to HomePage
    Given user launches the browser and navigates to "ASO_HOME" page
    #When user click on Best Sellers product
    Then user click on CTA in Shop Collection
    Then User is navigated to pdp page
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    Then user click on Add to Wish List/Sign In
    And user should be able to enter the signin details
    Then user should create a WishList
    Then user should delete a WishList
    Then User is able to see the ASO_Logo
    Then User clicks on ASO Logo and should be navigated to Home Page
    Then User closes the web application

 
  @SIT_UserJourney @KER-7074 @KER-6809
  Scenario: Verify Authenticated User Journey form Home Page to L1/L2/L3 to Home Page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user should able to click on Signin button
    And user should be able to enter the signin details
    Then User clicks on ASO Logo and should be navigated to Home Page
    When user clicks on one of the category and navigates to LOne page
    And user is able to see the product category name in section title.
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
    Then User is able to see the ASO_Logo
    Then User clicks on ASO Logo and should be navigated to Home Page
    Then User closes the web application

     
  @SIT_UserJourney @KER-7075 @KER-6809
  Scenario: Verify Authenticated User Journey form Home Page to Footer
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user should able to click on Signin button
    And user should be able to enter the signin details
    Then User clicks on ASO Logo and should be navigated to Home Page
    When user clicks on one of the category and navigates to LOne page
    And user is able to see the product category name in section title.
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
    Then User will verify the presence of ASO Logo in Header
    Then User will verify the presence of Sign In in Header
    Then User will verify the presence of WeeklyAD in Header
    Then User will verify the presence of Find a Store in Header
    Then User will verify the presence of search in Header
    Then User will verify the presence of add to cart icon in Header
    Then User will verify the presence of shop category in Header
    Then User will verify the presence of trending category in Header
    Then User will verify the presence of deals category in Header
    Then User closes the web application

  @SIT_UserJourney @KER-7076 @KER-6809
  Scenario: Verify Authenticated User Journey form Home Page to Footer
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user should able to click on Signin button
    And user should be able to enter the signin details
    Then User clicks on ASO Logo and should be navigated to Home Page
    When user clicks on one of the category and navigates to LOne page
    And user is able to see the product category name in section title.
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
    Then User will verify the presence of ASO Logo in Header
    Then User will verify the presence of Sign In in Header
    Then User will verify the presence of WeeklyAD in Header
    Then User will verify the presence of Find a Store in Header
    Then User will verify the presence of search in Header
    Then User will verify the presence of add to cart icon in Header
    Then User will verify the presence of shop category in Header
    Then User will verify the presence of trending category in Header
    Then User will verify the presence of deals category in Header
    Then User closes the web application

    @SIT_UserJourney @KER-7077 @KER-6809
  Scenario: Verify Authenticated User Journey form Home Page to Home Page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user should able to click on Signin button
    And user should be able to enter the signin details
    Then User clicks on ASO Logo and should be navigated to Home Page
    When user clicks on one of the category and navigates to LOne page
    And user is able to see the product category name in section title.
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
