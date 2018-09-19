Feature: Web Automation Sanity Test Cases Mimicing manual Scenarios

  #@AutomationSanityR1 @AS1 @WAST-01
  #Scenario: TC_1- Verify all broken URL's on Home page
    #Given user launches the browser and navigates to "ASO_HOME" page
    #Then verfy all link url's status code is 200
    #
  #@AutomationSanityR1 @AS1 @WAST-02 @1HR
  #Scenario: TC_2-Login and Logout
    #Given user launches the browser and navigates to "ASO_HOME" page
    #Then user should able to click on Signin button
    #And user should be able to enter the signin details "Login_username" "Login_pwd"
    #Then user sign out from the website

  #@AutomationSanityR1 @AS2 @WAST-03 @1HR
  #Scenario: TC_3-Registered user checkout process
    #Given user launches the browser and navigates to "ASO_HOME" page
    #Then user should able to click on Signin button
    #And user should be able to enter the signin details "Login_username" "Login_pwd"
    #When user enters "SearchTerm" in the search box
    #And User clicks on required product in L3 Page
     #When user click on Add to cart button
    #Then user click on checkout button
    #And user verify the shipping address
    #And user verify order summary
    #Then user click on continue shipping method button
    #And user verify shipping method and order summary
    #Then user click on continue payment button
    #And user enter the payment details
    #Then user should click on continue to review button
    #And user enter verified by visa password and click on submit button
    #And user verify order summary
    #And user should able to verify the Review shipping address
    #And user should able to verify the Review shipping method
    #And user should able to verify the billing address
    #And user should able to verify the payment method
    #Then user should click on Place Order Now button
#
#@AutomationSanityR1 @AS2 @WAST-04 @1HR
  #Scenario: TC_4-Guest user checkout process
    #Given user launches the browser and navigates to "ASO_HOME" page
    #When user enters "SearchTerm" in the search box
    #And User clicks on required product in L3 Page
    #Then user click on Add to cart button
    #Then user click on checkout button
    #Then user should verify the Guest checkout Page
    #Then user click on Checkout as Guest button
    #Then user should able to see shipping Address page
    #And user verify order summary
    #Then user should enter the shipping Address details
    #Then user click on continue to shipping method button
    #Then user click on continue checkout button
 #	And user verify order summary
    #And user enter the payment details
    #Then user should click on continue to review button
    #And user enter verified by visa password and click on submit button
    #And user verify order summary
    #And user should able to verify the Review shipping address
    #And user should able to verify the Review shipping method
    #And user should able to verify the billing address
    #And user should able to verify the payment method
    #Then user should click on Place Order Now button
   

  @AutomationSanityR1  @AS1 @WAST-05 @1HR
  Scenario: TC_5-Verify  Home Page Launch
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User will verify the presence of Sign In
    And User will verify the presence of WeeklyAD
    Then User will verify the presence of Find a Store
    And User will verify the presence of search
    Then User will verify the presence of add to cart icon
    And User will verify the presence of shop category
    Then User will verify the presence of trending category
    And User will verify the presence of deals category

  @AutomationSanityR1   @AS2 @WAST-06 @1HR
  Scenario: TC_6-Verify  Global Header on All the pages(till PDP)
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

  @AutomationSanityR1   @AS2 @WAST-07
  Scenario: TC_7-Verify Global Footer on All the pages(till PDP)
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User will verify the presence of footer links

  @AutomationSanityR1  @AS1 @WAST-08 @1HR
  Scenario: TC_8-Verify Navigation from Homepage to L1
    Given user launches the browser and navigates to "ASO_HOME" page
    When user clicks on one of the category and navigates to LOne page
    Then User should be able to see L1 Page

  @AutomationSanityR1 @AS1 @WAST-09 @1HR
  Scenario: TC_9-Verify Navigation from Homepage to L2
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2 from home page
    Then User should be able to see L2 Page

  @AutomationSanityR1 @AS1 @WAST-10 @1HR
  Scenario: TC_10-Verify Navigation from Homepage to L3
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L3 from home page
    Then User should be able to see L3 Page

  @AutomationSanityR1 @AS1 @WAST-11 @1HR
  Scenario: TC_11-Verify Navigation from Homepage to PDP
    Given user launches the browser and navigates to "ASO_HOME" page
    When User enters required value in search box
    And user should be able to see PDP mention in the current url

  @AutomationSanityR1 @AS1 @WAST-12 @1HR
  Scenario: TC_12-Verify Search from Home Page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User enter the search data
    And User click on search icon
    And user should be able to see PDP mention in the current url

  @AutomationSanityR1 @AS1 @WAST-13 @1HR
  Scenario: TC_13-Verify Search Result Page(Facets,Sort and Pagination)
    Given user launches the browser and navigates to "ASO_HOME" page
    When user enters "SearchTerm" in the search box and navigates to PLP
    And User expands PRICE Filter Option
    When User selects multiple PRICE filter Options
    Then User should be able to see the selected PRICE filter Options in selected state
    When User deselects multiple PRICE filter Options
    Then User should be able to see the deselected PRICE filter Options in deselected state


  @AutomationSanityR1 @AS1 @WAST-14 @1HR
  Scenario: TC_14-Verify Navigation from L1 to L2
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L1
    And User clicks on any of the subcategory in L1 Page
    Then User should be navigated to L2 Page

  @AutomationSanityR1 @AS1 @WAST-15 @1HR
  Scenario: TC_15-Verify Breadcumb on L1
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L1
    And User verify the last breadcrumb in the series should not be an active link for last link
	Then User click on the breadcrumb last active link in L1

  @AutomationSanityR1 @AS1 @WAST-16
  Scenario: TC_16-Verify Facets and Sorts on L2
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2
    And User expands all Filter Options
    Then User should be able to see all Filter Options as expanded
  
  
  @AutomationSanityR1 @AS1 @WAST-17 @1HR
  Scenario: TC_17-Verify Pagination on L2
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2
    And User scroll to pagination
    Then User should be able to see pagination links in L2 page

  @AutomationSanityR1 @AS1 @WAST-18
  Scenario: TC_18-Verify Product grid on L2
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2
    And User expands PRICE Filter Option
    When User selects multiple PRICE filter Options
    Then User should be able to see the selected PRICE filter Options in selected state
    When User deselects multiple PRICE filter Options
    Then User should be able to see the deselected PRICE filter Options in deselected state

  @AutomationSanityR1 @AS1 @WAST-19
  Scenario: TC_19-Verify Breadcumb on L2
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2
    	And User verify the last breadcrumb in the series should not be an active link for last link
	Then User click on the breadcrumb last active link in L2

  @AutomationSanityR1 @AS1 @WAST-20
  Scenario: TC_20-Verify Navigation from L2 to L3
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2
    When User clicks on required category in L2 Page
    Then User should be navigated to L3 Page

  @AutomationSanityR1 @AS1 @WAST-21 @1HR
  Scenario: TC_21-Verify Facets and Sorts on L3
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User expands PRICE Filter Option
    When User selects multiple PRICE filter Options
    Then User should be able to see the selected PRICE filter Options in selected state
    When User deselects multiple PRICE filter Options
    Then User should be able to see the deselected PRICE filter Options in deselected state
  

  @AutomationSanityR1 @AS1 @WAST-22 @1HR
  Scenario: TC_22-Verify Pagination on L3
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User scroll to pagination
    Then User should be able to see pagination links in L3 page

  @AutomationSanityR1 @AS1 @WAST-23
  Scenario: TC_23-Verify Product grid on L3
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User expands PRICE Filter Option
    When User selects multiple PRICE filter Options
    Then User should be able to see the selected PRICE filter Options in selected state
    When User deselects multiple PRICE filter Options
    Then User should be able to see the deselected PRICE filter Options in deselected state

  @AutomationSanityR1 @AS1 @WAST-24
  Scenario: TC_24-Verify Breadcrumb on L3
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    	And User verify the last breadcrumb in the series should not be an active link for last link
	Then User click on the breadcrumb last active link in L3

  @AutomationSanityR1 @AS1 @WAST-25 @1HR
  Scenario: TC_25-Verify L3 to PDP
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    And User clicks on required product in L3 Page
    And user should be able to see PDP mention in the current url

  @AutomationSanityR1 @AS1 @WAST-26
  Scenario: TC_26-Verify PDP page
    Given user launches the browser and navigates to "ASO_HOME" page
    When user navigates to PLP of any product
    Then user clicks on the product card and navigates to PDP of the product
    And user should be able to see PDP mention in the current url
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    And user should be able to see Add to cart button and quantity section
    Then user should be able to see inventory status of the product

  @AutomationSanityR1 @AS1 @WAST-27
  Scenario: TC_27-Verify Navigation from PDP to Homepage by clicking on ASO logo
    Given user launches the browser and navigates to "ASO_HOME" page
    When user navigates to PLP of any product
    Then user clicks on the product card and navigates to PDP of the product
    And user should be able to see PDP mention in the current url
    Then User is able to see the ASO_Logo
    Then User clicks on ASO logo
    Then User should be navigated to Home_Page

  @AutomationSanityR1 @AS1 @WAST-28 @1HR
  Scenario: TC_28-Verify Navigation from L3 to Homepage by clicking on ASO logo
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP
    Then User is able to see the ASO_Logo
    Then User clicks on ASO logo
    Then User should be navigated to Home_Page

  @AutomationSanityR1 @AS1 @WAST-29
  Scenario: TC_29-Verify Navigation from L2 to Homepage by clicking on ASO logo
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2
    Then User is able to see the ASO_Logo
    Then User clicks on ASO logo
    Then User should be navigated to Home_Page

  @AutomationSanityR1 @AS1 @WAST-30
  Scenario: TC_30-Verify Navigation from L1 to Homepage by clicking on ASO logo
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L1
    Then User is able to see the ASO_Logo
    Then User clicks on ASO logo
    Then User should be navigated to Home_Page

     @AutomationSanityR1 @AS1 @WAST-31 @1HR
  Scenario: TC_31-Verify presence of search box with search icon on Home page.
    Given user launches the browser and navigates to "ASO_HOME" page
     Then User navigates to L3 from home page
     Then User click on Quick view button
     Then verify addcart button is displayed 