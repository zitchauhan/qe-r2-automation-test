Feature: To Verify Unauthenticated/Authenticated UserJourney

  @SIT_User @KER-7068
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
