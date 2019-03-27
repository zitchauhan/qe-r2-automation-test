Feature: Mobile Automation Sanity Test Cases Mimicing manual Scenarios

  #@AutomationSanityR1 @AS1 @MAST-01 @AutomationSanity
   #Scenario: TC_1- Verify all broken URL's on Home page
    #Given user launches the browser and navigates to "ASO_HOME" page
    #Then verfy all link url's status code is 200
        
  @AutomationSanityR1 @AS1 @MAST-02 @AutomationSanity
  Scenario: TC_2-Login and Logout
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then user should able to click on Signin button
    Then user should be able to enter the signin details "Login_username" "Login_pwd"
    Then User clicks on the burger menu
    Then user sign out from the website

  @AutomationSanityR1 @AS1 @MAST-03 @1HR @AutomationSanity
Scenario: To verify add to cart functionality on PDP - Multiple SKU package 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then User navigates till PLP of multiple sku package 
	Then User clicks on the filter flyout 
	And user click on category tab
	And user click on football helmets
	And User click on the product image of sku package 
	Then verfiy the product details and features 
	And verfiy add to cart functionality 
	Then Add to cart modal is displayed
	
	
	@AutomationSanityR1 @AS1 @MAST-04 @1HR @AutomationSanity
Scenario: To verify Standard Gift Cards 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User will click on expand button for services
	Then User click on shop Gift Cards Link and navigate to Gift Card LAnding page 
	And user click on shop gift card CTA 
	Then user select the standard gift card and add it to cart
	


#  @AutomationSanityR1 @AS2 @MAST-04 @AutomationSanity
#  Scenario: TC_4-Guest user checkout process
#    Given user launches the browser and navigates to "ASO_HOME" page
#    Then User clicks on the burger menu
#    Then User navigates to L3
#    Then user clicks on the product card and navigates to PDP of the product
#    Then user click on Add to cart button
#    Then user click on checkout button
#    Then user should verify the Guest checkout Page
#    Then user click on Checkout as Guest button
#    Then user should able to see shipping Address page
#    Then user should be able verify the order summary details
#    Then user should enter the shipping Address details
#    Then user click on continue to shipping method button
#    Then user click on continue checkout button
#    Then user should able to verify the shipping address
#    And user should able to verify the shipping method
#    Then user should be able verify the order summary details
#    Then user should able to click on Continue to Payment button
#    When user should be able see the the payment method page and enter the creditcard details
#    Then user should click on continue to review button
#    And user enter verified by visa password and click on submit button
#    When user should should be able see Order summary page
#    Then user should able to verify the Review shipping address
#    And user should able to verify the Review shipping method
#    When user should able to verify the billing address
#    When user should able to verify the payment method
#    Then user should be able verify the order summary details
#    Then user should click on Place Order Now button

  @AutomationSanityR1 @AS1 @MAST-05 @AutomationSanity
  Scenario: TC_5-Verify  Home Page Launch
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User will verify the presence of ASO Logo
    And User will verify the presence of search
    Then User clicks on the burger menu

  @AutomationSanityR1 @AS2 @MAST-06 @1HR @AutomationSanity
  Scenario: TC_7-Verify  Global Header on All the pages(till PDP)
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
    Then User refresh the page
    Then user clicks on the product card and navigates to PDP of the product
    Then User clicks on the burger menu
    Then User should be able to see FindStore Navigation Categories and MyAccount links

  @AutomationSanityR1 @AS2 @MAST-07 @1HR @AutomationSanity
  Scenario: TC_8-Verify Global Footer on All the pages(till PDP)
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User will verify the presence of FIND A STORE
    Then User will verify the presence of sign up for more deals
    Then User will verify the presence of chat now
    And User will click on expand button
    Then User will verify the presence of Our history
    Then User will verify the presence of Careers
    Then User will verify the presence of Press Room
    Then User will verify the presence of Investors
    And User will click on expand button
    And User will click on expand button for needhelp
    Then User will verify the presence of Check Order
    Then User will verify the presence of Return Policy
    Then User will verify the presence of Product Recall
    Then User will verify the presence of Rebates
    Then User will verify the presence of Contact Us
    Then User will verify the presence of Customer Care
    And User will click on expand button for needhelp
    And User will click on expand button for services
    Then User will verify the presence of Gift Cards
    Then User will verify the presence of Academy Credit Card
    Then User will verify the presence of Store Services
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
     Then User will verify the presence of Investors
    And User will click on expand button
    And User will click on expand button for needhelp
    Then User will verify the presence of Check Order
    Then User will verify the presence of Return Policy
    Then User will verify the presence of Product Recall
    Then User will verify the presence of Rebates
    Then User will verify the presence of Contact Us
    Then User will verify the presence of Customer Care
    And User will click on expand button for needhelp
    And User will click on expand button for services
    Then User will verify the presence of Gift Cards
    Then User will verify the presence of Academy Credit Card
    Then User will verify the presence of Store Services
    Then User will verify the presence of Facebook icon
    Then User will verify the presence of twitter icon
    Then User will verify the presence of pinterest icon
    Then User will verify the presence of youtube icon
    Then User will verify the presence of instagram icon
    Then User clicks on the burger menu
    Then User navigates to L2
    Then Scroll till footer of the page
    And User will click on expand button
    Then User will verify the presence of Our history
    Then User will verify the presence of Careers
    Then User will verify the presence of Press Room
     Then User will verify the presence of Investors
    And User will click on expand button
    And User will click on expand button for needhelp
    Then User will verify the presence of Check Order
    Then User will verify the presence of Return Policy
    Then User will verify the presence of Product Recall
    Then User will verify the presence of Rebates
    Then User will verify the presence of Contact Us
    Then User will verify the presence of Customer Care
    And User will click on expand button for needhelp
    And User will click on expand button for services
    Then User will verify the presence of Gift Cards
    Then User will verify the presence of Academy Credit Card
    Then User will verify the presence of Store Services
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
    Then Scroll till footer of the page
    And User will click on expand button
    Then User will verify the presence of Our history
    Then User will verify the presence of Careers
    Then User will verify the presence of Press Room
    Then User will verify the presence of Investors
    And User will click on expand button
    And User will click on expand button for needhelp
    Then User will verify the presence of Check Order
    Then User will verify the presence of Return Policy
    Then User will verify the presence of Product Recall
    Then User will verify the presence of Rebates
    Then User will verify the presence of Contact Us
    Then User will verify the presence of Customer Care
    And User will click on expand button for needhelp
    And User will click on expand button for services
    Then User will verify the presence of Gift Cards
    Then User will verify the presence of Academy Credit Card
    Then User will verify the presence of Store Services
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
     Then User will verify the presence of Investors
    And User will click on expand button
    And User will click on expand button for needhelp
    Then User will verify the presence of Check Order
    Then User will verify the presence of Return Policy
    Then User will verify the presence of Product Recall
    Then User will verify the presence of Rebates
    Then User will verify the presence of Contact Us
    Then User will verify the presence of Customer Care
    And User will click on expand button for needhelp
    And User will click on expand button for services
    Then User will verify the presence of Gift Cards
    Then User will verify the presence of Academy Credit Card
    Then User will verify the presence of Store Services
    Then User will verify the presence of Facebook icon
    Then User will verify the presence of twitter icon
    Then User will verify the presence of pinterest icon
    Then User will verify the presence of youtube icon
    Then User will verify the presence of instagram icon

  @AutomationSanityR1 @AS1 @MAST-08 @AutomationSanity
  Scenario: TC_8-Verify Navigation from Homepage to L1
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L1

  @AutomationSanityR1 @AS1 @MAST-09 @AutomationSanity
  Scenario: TC_9-Verify Navigation from Homepage to L2
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L2

  @AutomationSanityR1 @AS1 @MAST-10 @AutomationSanity
  Scenario: TC_10-Verify Navigation from Homepage to L3
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L3

  @AutomationSanityR1 @AS1  @MAST-11 @AutomationSanity
  Scenario: TC_11-Verify Navigation from Homepage to PDP
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L3
    Then user clicks on the product card and navigates to PDP of the product

  @AutomationSanityR1 @AS1  @MAST-12 @AutomationSanity
  Scenario: TC_12-Verify Search from Home Page
    Given user launches the browser and navigates to "ASO_HOME" page
    When user enters "SearchPDP" in the searchbox
    And user should be able to see the sku and item numbers for the given image
 
  @AutomationSanityR1 @AS1 @MAST-13 @AutomationSanity
  Scenario: TC_13-Verify Search Result Page(Facets,  Sort and Pagination)
    Given user launches the browser and navigates to "ASO_HOME" page
    When user enters "SearchTerm" in the searchbox
    And user scroll till filter flyout
    Then User clicks on the filter flyout
    And User expands all Filter Options

  @AutomationSanityR1 @AS1 @MAST-14 @AutomationSanity
  Scenario: TC_14-Verify Navigation from L1 to L2
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L1
    Then user clicks on one of the subcategory and navigates to LTwo page

  @AutomationSanityR1 @AS1 @MAST-15 @1HR @AutomationSanity
  Scenario: TC_15-Verify Breadcumb on L1 
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L1
    Then User click on the breadcrumb last link

  @AutomationSanityR1 @AS1 @MAST-16 @1HR @AutomationSanity
  Scenario: TC_16-Verify Facets and Sorts on L2
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L2
    And user scroll till filter flyout
    Then User clicks on the filter flyout
    And User expands all Filter Options
  

  @AutomationSanityR1 @AS1 @MAST-17 @AutomationSanity
  Scenario: TC_17-Verify Pagination on L2
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L2
    And User scroll to pagination
    Then User should be able to see pagination links in L2 page

  @AutomationSanityR1 @AS1 @MAST-18 @AutomationSanity
  Scenario: TC_18-Verify Product grid on L2
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L2
   And user scroll till filter flyout
    Then User clicks on the filter flyout
    And User expands PRICE Filter Option
   

  @AutomationSanityR1 @AS1 @MAST-19 @AutomationSanity
  Scenario: TC_19-Verify Breadcrumb on L2
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L2
    Then User click on the breadcrumb last link

  @AutomationSanityR1 @AS1 @MAST-20 @AutomationSanity
  Scenario: TC_20-Verify Navigation from L2 to L3
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L2
    Then user clicks on one of the product category and navigates to LThree page

  @AutomationSanityR1 @AS1 @MAST-21 @AutomationSanity
  Scenario: TC_21-Verify Facets and Sorts on L3
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L3
#    And user navigate to L3 page
    And user scroll till filter flyout
    Then User clicks on the filter flyout
    And User expands all Filter Options
    
  

  @AutomationSanityR1 @AS1 @MAST-22 @AutomationSanity
  Scenario: TC_22-Verify Pagination on L3
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L3
#    And user navigate to L3 page
    And User scroll to pagination
    Then User should be able to see pagination links in L3 page

  @AutomationSanityR1 @AS1 @MAST-23 @AutomationSanity
  Scenario: TC_23-Verify Product grid on L3
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L3
#    And user navigate to L3 page
    Then User clicks on the filter flyout
    And User expands PRICE Filter Option
    When User selects multiple PRICE filter Options
    Then User should be able to see the selected PRICE filter Options in selected state
    When User deselects multiple PRICE filter Options
    Then User should be able to see the deselected PRICE filter Options in deselected state

  @AutomationSanityR1 @AS1 @MAST-24 @1HR @AutomationSanity
  Scenario: TC_24-Verify Breadcrumb on L3 
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L3
#    And user navigate to L3 page
    Then User click on the breadcrumb last link

  @AutomationSanityR1 @AS1 @MAST-25 @AutomationSanity
  Scenario: TC_25-Verify L3 to PDP
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L3
#    And user navigate to L3 page
    Then user clicks on the product card and navigates to PDP of the product
    And user should be able to see PDP mention in the current url

  @AutomationSanityR1 @AS1 @MAST-26 @1HR @AutomationSanity
  Scenario: TC_26-Verify PDP page 
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L3
#    And user navigate to L3 page
    Then user clicks on the product card and navigates to PDP of the product
    And user should be able to see PDP mention in the current url
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    And user should be able to see Add to cart button and quantity section
    Then user should be able to see inventory status of the product

  @AutomationSanityR1 @AS1 @MAST-27 @1HR @AutomationSanity
  Scenario: TC_27-Verify Navigation from PDP to Homepage by clicking on ASO logo
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L3
#    And user navigate to L3 page
    Then user clicks on the product card and navigates to PDP of the product
    And user should be able to see PDP mention in the current url
    Then User is able to see the ASO_Logo
    Then User clicks on ASO logo
    Then User should be navigated to Home_Page

  @AutomationSanityR1 @AS1 @MAST-28 @AutomationSanity
  Scenario: TC_28-Verify Navigation from L3 to Homepage by clicking on ASO logo
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L3
#    And user navigate to L3 page
    Then User is able to see the ASO_Logo
    Then User clicks on ASO logo
    Then User should be navigated to Home_Page

  @AutomationSanityR1 @AS1 @MAST-29 @AutomationSanity
  Scenario: TC_29-Verify Navigation from L2 to Homepage by clicking on ASO logo
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L2
    Then User is able to see the ASO_Logo
    Then User clicks on ASO logo
    Then User should be navigated to Home_Page

  @AutomationSanityR1 @AS1 @MAST-30 @AutomationSanity
  Scenario: TC_30-Verify Navigation from L1 to Homepage by clicking on ASO logo
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L1
    Then User is able to see the ASO_Logo
    Then User clicks on ASO logo
    Then User should be navigated to Home_Page
    
#
#  @AutomationSanityR1 @AS1 @MAST-01 
#   Scenario: TC_1- Verify all broken URL's on Home page
#    Given user launches the browser and navigates to "ASO_HOME" page
#    Then verfy all link url's status code is 200
#        
#  @AutomationSanityR1 @AS1 @MAST-02 
#  Scenario: TC_2-Login and Logout
#    Given user launches the browser and navigates to "ASO_HOME" page
#    Then User clicks on the burger menu
#    Then user should able to click on Signin button
#    Then user should be able to enter the signin details "Login_username" "Login_pwd"
#    Then User clicks on the burger menu
#    Then user sign out from the website
#
#  @AutomationSanityR1 @AS2  @MAST-03 
#  Scenario: TC_3-Registered user checkout process
#    Given user launches the browser and navigates to "ASO_HOME" page
#    Then User clicks on the burger menu
#    Then user should able to click on Signin button
#    And user should be able to enter the signin details
#    Then User will verify the presence of ASO Logo and click on Logo
#    Then User clicks on the burger menu
#    And User navigates to L3
#    Then user clicks on the product card and navigates to PDP of the product
#    Then user click on Add to cart button
#    Then user click on checkout button
#    Then user should able to see shipping Address page
#    Then user click on continue to shipping method button
#    Then user click on continue checkout button
#    And user should able to verify the shipping method
#    Then user should be able verify the order summary details
#    When user should be able see the the payment method page and enter the creditcard details
#    Then user should click on continue to review button
#    And user enter verified by visa password and click on submit button
#    When user should should be able see Order summary page
#    Then user should able to verify the Review shipping address
#    And user should able to verify the Review shipping method
#    When user should able to verify the billing address
#    When user should able to verify the payment method
#    Then user should be able verify the order summary details
#    Then user should click on Place Order Now button
#  
#
#  @AutomationSanityR1 @AS2 @MAST-04
#  Scenario: TC_4-Guest user checkout process
#    Given user launches the browser and navigates to "ASO_HOME" page
#    Then User clicks on the burger menu
#    Then User navigates to L3
#    Then user clicks on the product card and navigates to PDP of the product
#    Then user click on Add to cart button
#    Then user click on checkout button
#    Then user should verify the Guest checkout Page
#    Then user click on Checkout as Guest button
#    Then user should able to see shipping Address page
#    Then user should be able verify the order summary details
#    Then user should enter the shipping Address details
#    Then user click on continue to shipping method button
#    Then user click on continue checkout button
#    Then user should able to verify the shipping address
#    And user should able to verify the shipping method
#    Then user should be able verify the order summary details
#    Then user should able to click on Continue to Payment button
#    When user should be able see the the payment method page and enter the creditcard details
#    Then user should click on continue to review button
#    And user enter verified by visa password and click on submit button
#    When user should should be able see Order summary page
#    Then user should able to verify the Review shipping address
#    And user should able to verify the Review shipping method
#    When user should able to verify the billing address
#    When user should able to verify the payment method
#    Then user should be able verify the order summary details
#    Then user should click on Place Order Now button

        @AutomationSanityR1 @AS1 @WAST-31 @1HR  @AutomationSanity
Scenario: To verify Bulk Gift Cards 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User will click on expand button for services
	Then User click on shop Gift Cards Link and navigate to Gift Card LAnding page 
	And user click on shop bulk gift card CTA
	Then user add it to cart


  
    @AutomationSanityR1 @AS1 @MAST-33 @1HR @AutomationSanity
Scenario: To verify add to cart functionality on PDP - Multiple SKU package 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then User navigates till PLP of multiple sku 
	And User click on the product image of sku 
And verfiy add to cart functionality of multiple sku	
	Then Add to cart modal is displayed
	  
      @AutomationSanityR1 @AS1 @MAST-37 @AutomationSanity
  Scenario: TC_37-Verify the Bait Page
   Given user launches the browser and navigates to "ASO_HOME" page
   When user enters "SearchBait" in the searchbox
   And User selects Required product in Product Listing Page
   Then verify the ATC button is enabled
   And Increase the quanity in PDP
   And User clicks on bait AddToCart Button 
   Then User should be able to see ATC notification 
