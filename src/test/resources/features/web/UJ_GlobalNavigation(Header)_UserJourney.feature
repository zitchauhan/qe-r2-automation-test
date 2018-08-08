Feature: To Verify user is be able to filter the products based on Price Ranges

  @SIT_UserJourney @ZYP_K6809-7078 @KER-6809 @C-GlobalNavigationUJ @Web @CR-Danush
  Scenario Outline: Verify user is able to select/unselect one or multiple filter by values from Home Page search
    Given user launches the browser and navigates to "ASO_HOME" page
    When User enters in Required_Product with "<SearchTerm>" and click on Go button
    Then user should verify the Grid view
    And User expands PRICE Filter Option
    And user select the "<price>" in filter
    And User expands COLOR Filter Option
    And user select the "<color_name>" in filter
    Then Verify the selected filtered products "<price>""<color_name>"are displayed in product grid
    Then User should be able to unselect "<price>""<color_name>" the same checkbox for all the filters
    Then User closes the web application

    Examples: 
      | SearchTerm | price        | color_name |
      | Nike Shoe  | $10 - $19.99 | Black      |

 

  @SIT_UserJourney @ZYP_K6809-7079 @KER-6809 @C-GlobalNavigationUJ @Web @CR-Danush
  Scenario Outline: Verify As a User I should be able to select/deselect multiple price values in Search Page
    Given user launches the browser and navigates to "ASO_HOME" page
    When User enters in Required_Product with "<SearchTerm>" and click on Go button
    And User expands PRICE Filter Option
    When User selects multiple PRICE filter Options
    Then User should be able to see the selected PRICE filter Options in selected state
    When User deselects multiple PRICE filter Options
    Then User should be able to see the deselected PRICE filter Options in deselected state
    Then User closes the web application

    Examples: 
      | SearchTerm |
      | Nike Shoe  |


    @SIT_UserJourney @ZYP_K6809-7081 @KER-6809 @C-GlobalNavigationUJ @Web @CR-Danush
  Scenario Outline: Verify the user should be shown a Null results page when the search term returns no matching relevant results
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    When User enters in Required_Product with "<SearchTerm>" and click on Go button
    Then User is navigated to null page
    Then User closes the web application
     Examples: 
      | SearchTerm |
      | Null  |

    @SIT_UserJourney @ZYP_K6809-7082 @KER-6809 @C-GlobalNavigationUJ @Web @CR-Danush
  Scenario: Verify the user enters two characters into the search box and see predictive suggestions for matching keyword
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User verifies the predictive suggestions for matching keyword
    #And User verifies the predictive suggestions for matching brand
    #Then User should not see duplicates within predictive suggestions
    Then User closes the web application

  


    @SIT_UserJourney @ZYP_K6809-7083 @KER-6809 @C-GlobalNavigationUJ @Web @CR-Danush
  Scenario Outline: Verify user is able to search for Product not sold
    Given user launches the browser and navigates to "ASO_HOME" page
    When User enters in Required_Product with "<SearchTerm>" and click on Go button
    Then User is navigated to pdp page
    And user should be able to see the name of the product in title
    #And  user should be able to see Add to cart button and quantity section
    Then user should verify the Product is not for sold online
    Then User closes the web application

    Examples: 
      | SearchTerm                              |
      | GLOCK G17 Gen5 9mm Semiautomatic Pistol |

    @SIT_UserJourney @ZYP_K6809-7084 @KER-6809 @C-GlobalNavigationUJ @Web @CR-Danush
  Scenario: Verify User Journey form Cart to Home Page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user validate the cart icon
    And user click on cart icon and verify the cart page
    Then User is able to see the ASO_Logo
    Then User clicks on ASO Logo and should be navigated to Home Page
    When user clicks on one of the category and navigates to LOne page
    #And user is able to see the product category name in section title.
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
    #Then user should be able to click on Begin Checkout button
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

     
  @SIT_UserJourney @ZYP_K6809-7085 @KER-6809 @C-GlobalNavigationUJ @Web @CR-Danush 
  Scenario: Verify the SignIn Page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user should able to click on Signin button
    And user should be able to enter the signin details
    Then User closes the web application

  
  @SIT_UserJourney @ZYP_K6809-7086 @KER-6809 @C-GlobalNavigationUJ @Web @CR-Danush
  Scenario: Verify the SignUp Page
    Given user launches the browser and navigates to "ASO_HOME" page
     Then user should able to click on Signin button
   Then user should able to click on Signup button
   And user should able to enter the Signup details
   Then User closes the web application

  
  @SIT_UserJourney @ZYP_K6809-7087 @KER-6809 @C-GlobalNavigationUJ @Web @CR-Danush
  Scenario: Verify the SignUp to WishList Page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user should able to click on Signin button
    And user should be able to enter the signin details
    Then user click on WishList link
    And user should verify the WishList page and create new Wishlist
    Then user should verify the created WishList
    Then user should rename the created WishList
    Then user should delete the created WishList
    Then User closes the web application

    @SIT_UserJourney @ZYP_K6809-7088 @KER-6809 @C-GlobalNavigationUJ @Web @CR-Danush
  Scenario: Verify the Signup to Account Summary page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user should able to click on Signin button
    And user should be able to enter the signin details
    Then user click on Account Summary link
    And user should verify the Account Summary page
    Then User closes the web application

    @SIT_UserJourney @ZYP_K6809-7089 @KER-6809 @C-GlobalNavigationUJ @Web @CR-Danush
  Scenario: Verify the Signup to Address Book page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user should able to click on Signin button
    And user should be able to enter the signin details
    Then user click on Address Book link
    And user should verify the Address Book page
    Then user click on Add New Address button
    Then user enter new address details and click on save button
    Then user verify the address and click on continue button and ok button
    Then user click on edit button
    And user modify the address and click on continue button and ok button
    Then user click on delete address button
    And user verify the delete address page and click on yes button
    Then User closes the web application

    @SIT_UserJourney @ZYP_K6809-7090 @KER-6809 @C-GlobalNavigationUJ @Web @CR-Danush
  Scenario: Verify User Journey form Shop to Home Page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user clicks on one of the category and navigates to LOne page
    #And user is able to see the product category name in section title.
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
    Then User is able to see the ASO_Logo
    Then User should be navigated to Home_Page
    Then User closes the web application

    @SIT_UserJourney @ZYP_K6809-7094 @KER-6809 @C-GlobalNavigationUJ @Web @CR-Danush
  Scenario: Verify User Journey form Deals to Home Page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User will verify the presence of deals category
    Then User will click on Deals Link
    Then User will click on Daily Deals and click on product
    Then User is navigated to pdp page
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    And user should be able to see Add to cart button and quantity section
    When user click on Add to cart button
    Then user click on checkout button
    #Then user should be able to click on Begin Checkout button
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
    Then User is able to see the ASO_Logo
    Then User should be navigated to Home_Page
    Then User closes the web application

    @SIT_UserJourney @ZYP_K6809-7095 @KER-6809 @C-GlobalNavigationUJ @Web @CR-Danush
  Scenario: Verify User Journey form Deals to PDP Page Home Page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User will verify the presence of deals category
    Then User will click on Deals Link
    Then User will click on Daily Deals and click on product
    Then User is navigated to pdp page
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    And user should be able to see Add to cart button and quantity section
    Then User is able to see the ASO_Logo
    Then User clicks on ASO Logo and should be navigated to Home Page
    Then User is able to see the ASO_Logo
    Then User should be navigated to Home_Page
    Then user should able to click on Signin button
    And user should be able to enter the signin details
    When user clicks on one of the category and navigates to LOne page
    #And user is able to see the product category name in section title.
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
    #Then user should able to see shipping Address page
    Then user should be able verify the order summary details
    #Then user should enter the shipping Address details
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
    Then User is able to see the ASO_Logo
    Then User should be navigated to Home_Page
    Then User closes the web application
