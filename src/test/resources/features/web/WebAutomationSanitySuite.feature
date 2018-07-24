Feature: Web Automation Sanity Test Cases Mimicing manual Scenarios

  @AutomationSanity
  Scenario: TC_1-Login and Logout
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user should able to click on Signin button
    And user should be able to enter the signin details
    Then user sign out from the website

  @AutomationSanity
  Scenario Outline: TC_2-Registered user checkout process
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user should able to click on Signin button
    And user should be able to enter the signin details
    When user enters "<SearchTerm>" in the search box
    And User clicks on required product in L3 Page
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

    Examples: 
      | SearchTerm |
      | shirt      |

  @AutomationSanity
  Scenario: TC_3-Guest user checkout process
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L3 from home page
    And User clicks on required product in L3 Page
    Then user click on Add to cart button
    Then user click on checkout button
    Then user should verify the Guest checkout Page
    Then user click on Checkout as Guest button
    Then user should able to see shipping Address page
    Then user should be able verify the order summary details
    Then user should enter the shipping Address details
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

  @AutomationSanity
  Scenario: TC_4-Verify  Home Page Launch
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User will verify the presence of Sign In
    And User will verify the presence of WeeklyAD
    Then User will verify the presence of Find a Store
    And User will verify the presence of search
    Then User will verify the presence of add to cart icon
    And User will verify the presence of shop category
    Then User will verify the presence of trending category
    And User will verify the presence of deals category

  @AutomationSanity
  Scenario: TC_5-Verify  Global Header on All the pages(till PDP)
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User will verify the presence of Sign In
    And User will verify the presence of WeeklyAD
    Then User will verify the presence of Find a Store
    And User will verify the presence of search
    Then User will verify the presence of add to cart icon
    And User will verify the presence of shop category
    Then User will verify the presence of trending category
    And User will verify the presence of deals category
    When user clicks on one of the category and navigates to LOne page
    And User will verify the presence of WeeklyAD
    Then User will verify the presence of Find a Store
    And User will verify the presence of search
    Then User will verify the presence of add to cart icon
    And User will verify the presence of shop category
    Then User will verify the presence of trending category
    And User will verify the presence of deals category
    Then User navigates to L2 from home page
    Then User will verify the presence of Find a Store
    And User will verify the presence of search
    Then User will verify the presence of add to cart icon
    And User will verify the presence of shop category
    Then User will verify the presence of trending category
    And User will verify the presence of deals category
    Then User navigates to L3 from home page
    And User will verify the presence of WeeklyAD
    Then User will verify the presence of Find a Store
    And User will verify the presence of search
    Then User will verify the presence of add to cart icon
    And User will verify the presence of shop category
    Then User will verify the presence of trending category
    And User will verify the presence of deals category
    And User clicks on required product in L3 Page
    And User will verify the presence of WeeklyAD
    Then User will verify the presence of Find a Store
    And User will verify the presence of search
    Then User will verify the presence of add to cart icon
    And User will verify the presence of shop category
    Then User will verify the presence of trending category
    And User will verify the presence of deals category

  @AutomationSanity
  Scenario: TC_6-Verify Global Footer on All the pages(till PDP)
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User will verify the presence of Our history
    And User will verify the presence of Careers
    Then User will verify the presence of Press Room
    And User will verify the presence of Giving Back
    Then User will verify the presence of Check Order
    And User will verify the presence of Return Policy
    Then User will verify the presence of Product Recall
    And User will verify the presence of Rebates
    Then User will verify the presence of Contact Us
    And User will verify the presence of Customer Care
    Then User will verify the presence of Gift Cards
    And User will verify the presence of Academy Credit Card
    Then User will verify the presence of Store Services
    Then User will verify the presence of FIND A STORE
    And User will verify the presence of sign up for more deals
    Then User will verify the presence of chat now
    Then User will verify the presence of privacy policy
    And User will verify the presence of Terms and Conditions
    Then User will verify the presence of legal policy
    Then User will verify the presence of Facebook icon
    And User will verify the presence of twitter icon
    Then User will verify the presence of pinterest icon
    And User will verify the presence of youtube icon
    Then User will verify the presence of instagram icon
    When user clicks on one of the category and navigates to LOne page
    Then User will verify the presence of Our history
    And User will verify the presence of Careers
    Then User will verify the presence of Press Room
    And User will verify the presence of Giving Back
    Then User will verify the presence of Check Order
    And User will verify the presence of Return Policy
    Then User will verify the presence of Product Recall
    And User will verify the presence of Rebates
    Then User will verify the presence of Contact Us
    And User will verify the presence of Customer Care
    Then User will verify the presence of Gift Cards
    And User will verify the presence of Academy Credit Card
    Then User will verify the presence of Store Services
    Then User will verify the presence of FIND A STORE
    And User will verify the presence of sign up for more deals
    Then User will verify the presence of chat now
    Then User will verify the presence of privacy policy
    And User will verify the presence of Terms and Conditions
    Then User will verify the presence of legal policy
    Then User will verify the presence of Facebook icon
    And User will verify the presence of twitter icon
    Then User will verify the presence of pinterest icon
    And User will verify the presence of youtube icon
    Then User will verify the presence of instagram icon
    Then User navigates to L2 from home page
    Then User will verify the presence of Our history
    And User will verify the presence of Careers
    Then User will verify the presence of Press Room
    And User will verify the presence of Giving Back
    Then User will verify the presence of Check Order
    And User will verify the presence of Return Policy
    Then User will verify the presence of Product Recall
    And User will verify the presence of Rebates
    Then User will verify the presence of Contact Us
    And User will verify the presence of Customer Care
    Then User will verify the presence of Gift Cards
    And User will verify the presence of Academy Credit Card
    Then User will verify the presence of Store Services
    Then User will verify the presence of FIND A STORE
    And User will verify the presence of sign up for more deals
    Then User will verify the presence of chat now
    Then User will verify the presence of privacy policy
    And User will verify the presence of Terms and Conditions
    Then User will verify the presence of legal policy
    Then User will verify the presence of Facebook icon
    And User will verify the presence of twitter icon
    Then User will verify the presence of pinterest icon
    And User will verify the presence of youtube icon
    Then User will verify the presence of instagram icon
    Then User navigates to L3 from home page
    Then User will verify the presence of Our history
    And User will verify the presence of Careers
    Then User will verify the presence of Press Room
    And User will verify the presence of Giving Back
    Then User will verify the presence of Check Order
    And User will verify the presence of Return Policy
    Then User will verify the presence of Product Recall
    And User will verify the presence of Rebates
    Then User will verify the presence of Contact Us
    And User will verify the presence of Customer Care
    Then User will verify the presence of Gift Cards
    And User will verify the presence of Academy Credit Card
    Then User will verify the presence of Store Services
    Then User will verify the presence of FIND A STORE
    And User will verify the presence of sign up for more deals
    Then User will verify the presence of chat now
    Then User will verify the presence of privacy policy
    And User will verify the presence of Terms and Conditions
    Then User will verify the presence of legal policy
    Then User will verify the presence of Facebook icon
    And User will verify the presence of twitter icon
    Then User will verify the presence of pinterest icon
    And User will verify the presence of youtube icon
    Then User will verify the presence of instagram icon
    And User clicks on required product in L3 Page
    Then User will verify the presence of Our history
    And User will verify the presence of Careers
    Then User will verify the presence of Press Room
    And User will verify the presence of Giving Back
    Then User will verify the presence of Check Order
    And User will verify the presence of Return Policy
    Then User will verify the presence of Product Recall
    And User will verify the presence of Rebates
    Then User will verify the presence of Contact Us
    And User will verify the presence of Customer Care
    Then User will verify the presence of Gift Cards
    And User will verify the presence of Academy Credit Card
    Then User will verify the presence of Store Services
    Then User will verify the presence of FIND A STORE
    And User will verify the presence of sign up for more deals
    Then User will verify the presence of chat now
    Then User will verify the presence of privacy policy
    And User will verify the presence of Terms and Conditions
    Then User will verify the presence of legal policy
    Then User will verify the presence of Facebook icon
    And User will verify the presence of twitter icon
    Then User will verify the presence of pinterest icon
    And User will verify the presence of youtube icon
    Then User will verify the presence of instagram icon

  @AutomationSanity
  Scenario: TC_7-Verify Navigation from Homepage to L1
    Given user launches the browser and navigates to "ASO_HOME" page
    When user clicks on one of the category and navigates to LOne page
    Then User should be able to see L1 Page

  @AutomationSanity
  Scenario: TC_8-Verify Navigation from Homepage to L2
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2 from home page
    Then User should be able to see L2 Page

  @AutomationSanity
  Scenario: TC_9-Verify Navigation from Homepage to L3
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L3 from home page
    Then User should be able to see L3 Page

  @AutomationSanity
  Scenario: TC_10-Verify Navigation from Homepage to PDP
    Given user launches the browser and navigates to "ASO_HOME" page
    When User enters required value in search box
    And user should be able to see PDP mention in the current url

  @AutomationSanity
  Scenario: TC_11-Verify Search from Home Page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User enter the search data
    And User click on search icon
    And user should be able to see PDP mention in the current url

  @AutomationSanity
  Scenario Outline: TC_12-Verify Search Result Page(Facets,  Sort and Pagination)
    Given user launches the browser and navigates to "ASO_HOME" page
    When user enters "<SearchTerm>" in the search box
    And User expands PRICE Filter Option
    When User selects multiple PRICE filter Options
    Then User should be able to see the selected PRICE filter Options in selected state
    When User deselects multiple PRICE filter Options
    Then User should be able to see the deselected PRICE filter Options in deselected state
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
    Then User navigates to L1
    And User clicks on any of the subcategory in L1 Page
    Then User should be navigated to L2 Page

  @AutomationSanity
  Scenario: TC_14-Verify Breadcumb on L1
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L1
    Then User verify the last breadcrumb in the series should not be an active link
    Then User click on the breadcrumb last link

  @AutomationSanity
  Scenario: TC_15-Verify Facets and Sorts on L2
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2
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
    Then User navigates to L2
    And User scroll to pagination
    Then User should be able to see pagination links in L2 page

  @AutomationSanity
  Scenario: TC_17-Verify Product grid on L2
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2
    And User expands PRICE Filter Option
    When User selects multiple PRICE filter Options
    Then User should be able to see the selected PRICE filter Options in selected state
    When User deselects multiple PRICE filter Options
    Then User should be able to see the deselected PRICE filter Options in deselected state

  @AutomationSanity
  Scenario: TC_18-Verify Breadcumb on L2
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2
    Then User verify the last breadcrumb in the series should not be an active link
    Then User click on the breadcrumb last link

  @AutomationSanity
  Scenario: TC_19-Verify Navigation from L2 to L3
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2
    When User clicks on required category in L2 Page
    Then User should be navigated to L3 Page

  @AutomationSanity
  Scenario: TC_20-Verify Facets and Sorts on L3
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User expands PRICE Filter Option
    When User selects multiple PRICE filter Options
    Then User should be able to see the selected PRICE filter Options in selected state
    When User deselects multiple PRICE filter Options
    Then User should be able to see the deselected PRICE filter Options in deselected state
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
    Then User navigates till PLP
    And User scroll to pagination
    Then User should be able to see pagination links in L3 page

  @AutomationSanity
  Scenario: TC_22-Verify Product grid on L3
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User expands PRICE Filter Option
    When User selects multiple PRICE filter Options
    Then User should be able to see the selected PRICE filter Options in selected state
    When User deselects multiple PRICE filter Options
    Then User should be able to see the deselected PRICE filter Options in deselected state

  @AutomationSanity
  Scenario: TC_23-Verify Breadcumb on L3
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    Then User verify the last breadcrumb in the series should not be an active link
    Then User click on the breadcrumb last link

  @AutomationSanity
  Scenario: TC_24-Verify L3 to PDP
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User clicks on required product in L3 Page
    And user should be able to see PDP mention in the current url

  @AutomationSanity
  Scenario: TC_25-Verify PDP page
    Given user launches the browser and navigates to "ASO_HOME" page
    When user navigates to PLP of any product
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
    When user navigates to PLP of any product
    Then user clicks on the product card and navigates to PDP of the product
    And user should be able to see PDP mention in the current url
    Then User is able to see the ASO_Logo
    Then User clicks on ASO logo
    Then User should be navigated to Home_Page

  @AutomationSanity
  Scenario: TC_27-Verify Navigation from L3 to Homepage by clicking on ASO logo
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    Then User is able to see the ASO_Logo
    Then User clicks on ASO logo
    Then User should be navigated to Home_Page

  @AutomationSanity
  Scenario: TC_28-Verify Navigation from L2 to Homepage by clicking on ASO logo
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2
    Then User is able to see the ASO_Logo
    Then User clicks on ASO logo
    Then User should be navigated to Home_Page

  @AutomationSanity
  Scenario: TC_29-Verify Navigation from L1 to Homepage by clicking on ASO logo
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L1
    Then User is able to see the ASO_Logo
    Then User clicks on ASO logo
    Then User should be navigated to Home_Page
