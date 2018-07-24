Feature: Mobile Automation Sanity Test Cases Mimicing manual Scenarios

  @AutomationSanity
  Scenario: TC_1-Login and Logout
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then user should able to click on Signin button
    And user should be able to enter the signin details
    Then User clicks on the burger menu
    Then user sign out from the website

  @AutomationSanity
  Scenario: TC_2-Registered user checkout process
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then user should able to click on Signin button
    And user should be able to enter the signin details
    Then User will verify the presence of ASO Logo and click on Logo
    Then User clicks on the burger menu
    And User navigates to L3
    Then user clicks on the product card and navigates to PDP of the product
    Then user click on Add to cart button
    Then user click on checkout button
    Then user should able to see shipping Address page
    # Then user should be able verify the order summary details
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
    Then user sign out from the website

  @AutomationSanity
  Scenario: TC_3-Guest user checkout process
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L3
    Then user clicks on the product card and navigates to PDP of the product
    Then user click on Add to cart button
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

  @AutomationSanity
  Scenario: TC_4-Verify  Home Page Launch
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User will verify the presence of ASO Logo
    And User will verify the presence of search
    Then User clicks on the burger menu

  @AutomationSanity
  Scenario: TC_5-Verify  Global Header on All the pages(till PDP)
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User should be able to see FindStore Navigation Categories and MyAccount links
    Then User navigates to L1
    Then User clicks on the burger menu
    Then User should be able to see FindStore Navigation Categories and MyAccount links
    Then User navigates to L2
    Then User clicks on the burger menu
    Then User should be able to see FindStore Navigation Categories and MyAccount links
    Then User navigates to L3
    Then User clicks on the burger menu
    Then User should be able to see FindStore Navigation Categories and MyAccount links
    Then User clicks on the burger menu
    Then user clicks on the product card and navigates to PDP of the product
    Then User clicks on the burger menu
    Then User should be able to see FindStore Navigation Categories and MyAccount links

  @AutomationSanity
  Scenario: TC_6-Verify Global Footer on All the pages(till PDP)
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User will verify the presence of FIND A STORE
    Then User will verify the presence of sign up for more deals
    Then User will verify the presence of chat now
    And User will click on expand button
    Then User will verify the presence of Our history
    Then User will verify the presence of Careers
    Then User will verify the presence of Press Room
    Then User will verify the presence of Giving Back
    And User will click on expand button for services
    Then User will verify the presence of Gift Cards
    Then User will verify the presence of Academy Credit Card
    Then User will verify the presence of Store Services
    And User will click on expand button for needhelp
    Then User will verify the presence of Check Order
    Then User will verify the presence of Return Policy
    Then User will verify the presence of Product Recall
    Then User will verify the presence of Rebates
    Then User will verify the presence of Contact Us
    Then User will verify the presence of Customer Care
    Then User will verify the presence of Facebook icon
    Then User will verify the presence of twitter icon
    Then User will verify the presence of pinterest icon
    Then User will verify the presence of youtube icon
    Then User will verify the presence of instagram icon
    Then User clicks on the burger menu
    Then User navigates to L1
    Then User will verify the presence of FIND A STORE
    Then User will verify the presence of sign up for more deals
    Then User will verify the presence of chat now
    And User will click on expand button
    Then User will verify the presence of Our history
    Then User will verify the presence of Careers
    Then User will verify the presence of Press Room
    Then User will verify the presence of Giving Back
    And User will click on expand button for services
    Then User will verify the presence of Gift Cards
    Then User will verify the presence of Academy Credit Card
    Then User will verify the presence of Store Services
    And User will click on expand button for needhelp
    Then User will verify the presence of Check Order
    Then User will verify the presence of Return Policy
    Then User will verify the presence of Product Recall
    Then User will verify the presence of Rebates
    Then User will verify the presence of Contact Us
    Then User will verify the presence of Customer Care
    Then User will verify the presence of Facebook icon
    Then User will verify the presence of twitter icon
    Then User will verify the presence of pinterest icon
    Then User will verify the presence of youtube icon
    Then User will verify the presence of instagram icon
    Then User clicks on the burger menu
    Then User navigates to L2
    Then User will verify the presence of FIND A STORE
    Then User will verify the presence of sign up for more deals
    Then User will verify the presence of chat now
    And User will click on expand button
    Then User will verify the presence of Our history
    Then User will verify the presence of Careers
    Then User will verify the presence of Press Room
    Then User will verify the presence of Giving Back
    And User will click on expand button for services
    Then User will verify the presence of Gift Cards
    Then User will verify the presence of Academy Credit Card
    Then User will verify the presence of Store Services
    And User will click on expand button for needhelp
    Then User will verify the presence of Check Order
    Then User will verify the presence of Return Policy
    Then User will verify the presence of Product Recall
    Then User will verify the presence of Rebates
    Then User will verify the presence of Contact Us
    Then User will verify the presence of Customer Care
    Then User will verify the presence of Facebook icon
    Then User will verify the presence of twitter icon
    Then User will verify the presence of pinterest icon
    Then User will verify the presence of youtube icon
    Then User will verify the presence of instagram icon
    Then User clicks on the burger menu
    Then User navigates to L3
    Then User will verify the presence of FIND A STORE
    Then User will verify the presence of sign up for more deals
    Then User will verify the presence of chat now
    And User will click on expand button
    Then User will verify the presence of Our history
    Then User will verify the presence of Careers
    Then User will verify the presence of Press Room
    Then User will verify the presence of Giving Back
    And User will click on expand button for services
    Then User will verify the presence of Gift Cards
    Then User will verify the presence of Academy Credit Card
    Then User will verify the presence of Store Services
    And User will click on expand button for needhelp
    Then User will verify the presence of Check Order
    Then User will verify the presence of Return Policy
    Then User will verify the presence of Product Recall
    Then User will verify the presence of Rebates
    Then User will verify the presence of Contact Us
    Then User will verify the presence of Customer Care
    Then User will verify the presence of Facebook icon
    Then User will verify the presence of twitter icon
    Then User will verify the presence of pinterest icon
    Then User will verify the presence of youtube icon
    Then User will verify the presence of instagram icon
    Then user clicks on the product card and navigates to PDP of the product
    Then User will verify the presence of FIND A STORE
    Then User will verify the presence of sign up for more deals
    Then User will verify the presence of chat now
    And User will click on expand button
    Then User will verify the presence of Our history
    Then User will verify the presence of Careers
    Then User will verify the presence of Press Room
    Then User will verify the presence of Giving Back
    And User will click on expand button for services
    Then User will verify the presence of Gift Cards
    Then User will verify the presence of Academy Credit Card
    Then User will verify the presence of Store Services
    And User will click on expand button for needhelp
    Then User will verify the presence of Check Order
    Then User will verify the presence of Return Policy
    Then User will verify the presence of Product Recall
    Then User will verify the presence of Rebates
    Then User will verify the presence of Contact Us
    Then User will verify the presence of Customer Care
    Then User will verify the presence of Facebook icon
    Then User will verify the presence of twitter icon
    Then User will verify the presence of pinterest icon
    Then User will verify the presence of youtube icon
    Then User will verify the presence of instagram icon

  @AutomationSanity
  Scenario: TC_7-Verify Navigation from Homepage to L1
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L1

  @AutomationSanity
  Scenario: TC_8-Verify Navigation from Homepage to L2
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L2

  @AutomationSanity
  Scenario: TC_9-Verify Navigation from Homepage to L3
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L3

  @AutomationSanity
  Scenario: TC_10-Verify Navigation from Homepage to PDP
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L3
    Then user clicks on the product card and navigates to PDP of the product

  @AutomationSanity
  Scenario Outline: TC_11-Verify Search from Home Page
    Given user launches the browser and navigates to "ASO_HOME" page
    When user enters "<SearchTerm>" in the search box
    And user should be able to see the sku and item numbers for the given image

    Examples: 
      | SearchTerm                                          |
      | Nike Women's Nike Cheer Scorpion Cheerleading Shoes |

  @AutomationSanity
  Scenario Outline: TC_12-Verify Search Result Page(Facets,  Sort and Pagination)
    Given user launches the browser and navigates to "ASO_HOME" page
    When user enters "<SearchTerm>" in the search box
    And user scroll till filter flyout
    Then User clicks on the filter flyout
    And User expands all Filter Options
    Then User should be able to see all Filter Options as expanded
    And User collapses all Filter Options
    Then User should be able to see all Filter Options as collapsed
    And user able to see all sorting options after clicking on sort by filter
      | Most Relevant    |
      | Brand (A-Z)      |
      | Price (Low-High) |
      | Price (High-Low) |
      | Top Rated        |
      | Most Viewed      |
      | Best Selling     |
      | New Arrivals     |

    Examples: 
      | SearchTerm |
      | Nike Shoe  |

  @AutomationSanity
  Scenario: TC_13-Verify Navigation from L1 to L2
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L1
    Then user clicks on one of the subcategory and navigates to LTwo page

  @AutomationSanity
  Scenario: TC_14-Verify Breadcumb on L1
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L1
    Then User click on the breadcrumb last link

  @AutomationSanity
  Scenario: TC_15-Verify Facets and Sorts on L2
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L2
    And user scroll till filter flyout
    Then User clicks on the filter flyout
    And User expands all Filter Options
    Then User should be able to see all Filter Options as expanded
    And User collapses all Filter Options
    Then User should be able to see all Filter Options as collapsed
    And user able to see all sorting options after clicking on sort by filter
      | Most Relevant    |
      | Brand (A-Z)      |
      | Price (Low-High) |
      | Price (High-Low) |
      | Top Rated        |
      | Most Viewed      |
      | Best Selling     |
      | New Arrivals     |

  @AutomationSanity
  Scenario: TC_16-Verify Pagination on L2
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L2
    And User scroll to pagination
    Then User should be able to see pagination links in L2 page

  @AutomationSanity
  Scenario: TC_17-Verify Product grid on L2
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L2
    And user scroll till filter flyout
    Then User clicks on the filter flyout
    And User expands PRICE Filter Option
    When User selects multiple PRICE filter Options
    Then User should be able to see the selected PRICE filter Options in selected state
    When User deselects multiple PRICE filter Options
    Then User should be able to see the deselected PRICE filter Options in deselected state

  @AutomationSanity
  Scenario: TC_18-Verify Breadcumb on L2
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L2
    Then User click on the breadcrumb last link

  @AutomationSanity
  Scenario: TC_19-Verify Navigation from L2 to L3
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L2
    Then user clicks on one of the product category and navigates to LThree page

  @AutomationSanity
  Scenario: TC_20-Verify Facets and Sorts on L3
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L3
    And user scroll till filter flyout
    Then User clicks on the filter flyout
    And User expands all Filter Options
    Then User should be able to see all Filter Options as expanded
    And User collapses all Filter Options
    Then User should be able to see all Filter Options as collapsed
    And user able to see all sorting options after clicking on sort by filter
      | Most Relevant    |
      | Brand (A-Z)      |
      | Price (Low-High) |
      | Price (High-Low) |
      | Top Rated        |
      | Most Viewed      |
      | Best Selling     |
      | New Arrivals     |

  @AutomationSanity
  Scenario: TC_21-Verify Pagination on L3
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L3
    And User scroll to pagination
    Then User should be able to see pagination links in L3 page

  @AutomationSanity
  Scenario: TC_22-Verify Product grid on L3
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L3
    Then User clicks on the filter flyout
    And User expands PRICE Filter Option
    When User selects multiple PRICE filter Options
    Then User should be able to see the selected PRICE filter Options in selected state
    When User deselects multiple PRICE filter Options
    Then User should be able to see the deselected PRICE filter Options in deselected state

  @AutomationSanity
  Scenario: TC_23-Verify Breadcumb on L3
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L3
    Then User click on the breadcrumb last link

  @AutomationSanity
  Scenario: TC_24-Verify L3 to PDP
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L3
    Then user clicks on the product card and navigates to PDP of the product
    And user should be able to see PDP mention in the current url

  @AutomationSanity
  Scenario: TC_25-Verify PDP page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L3
    Then user clicks on the product card and navigates to PDP of the product
    And user should be able to see PDP mention in the current url
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    And user should be able to see Add to cart button and quantity section
    Then user should be able to see inventory status of the product

  @AutomationSanity
  Scenario: TC_26-Verify Navigation from PDP to Homepage by clicking on ASO logo
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L3
    Then user clicks on the product card and navigates to PDP of the product
    And user should be able to see PDP mention in the current url
    Then User is able to see the ASO_Logo
    Then User clicks on ASO logo
    Then User should be navigated to Home_Page

  @AutomationSanity
  Scenario: TC_27-Verify Navigation from L3 to Homepage by clicking on ASO logo
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L3
    Then User is able to see the ASO_Logo
    Then User clicks on ASO logo
    Then User should be navigated to Home_Page

  @AutomationSanity
  Scenario: TC_28-Verify Navigation from L2 to Homepage by clicking on ASO logo
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L2
    Then User is able to see the ASO_Logo
    Then User clicks on ASO logo
    Then User should be navigated to Home_Page

  @AutomationSanity
  Scenario: TC_29-Verify Navigation from L1 to Homepage by clicking on ASO logo
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L1
    Then User is able to see the ASO_Logo
    Then User clicks on ASO logo
    Then User should be navigated to Home_Page
