Feature: Mobile Automation Sanity Test Cases Mimicing manual Scenarios

@AutomationSanity  
Scenario: Verify Home Page Launch
Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User will verify the presence of ASO Logo
    And User will verify the presence of search
    Then User clicks on the burger menu

@AutomationSanity  
Scenario: Verify  Global Header on All the pages(till PDP)
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
Scenario: Verify Global Footer on All the pages(till PDP)
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
Scenario: Verify Navigation from Homepage to L1
Given user launches the browser and navigates to "ASO_HOME" page
  Then User clicks on the burger menu
 Then User navigates to L1


@AutomationSanity  
Scenario: Verify Navigation from Homepage to L2
Given user launches the browser and navigates to "ASO_HOME" page
 Then User clicks on the burger menu
 Then User navigates to L2


@AutomationSanity  
Scenario: Verify Navigation from Homepage to L3
Given user launches the browser and navigates to "ASO_HOME" page
Then User clicks on the burger menu
 Then User navigates to L3


@AutomationSanity  
Scenario: Verify Navigation from Homepage to PDP
Given user launches the browser and navigates to "ASO_HOME" page
Then User clicks on the burger menu
Then User navigates to L3
 Then user clicks on the product card and navigates to PDP of the product


@AutomationSanity  
Scenario Outline: Verify Search from Home Page
   Given user launches the browser and navigates to "ASO_HOME" page
    When user enters "<SearchTerm>" in the search box
    And user should be able to see the sku and item numbers for the given image

    Examples: 
      | SearchTerm                                          |
      | Nike Women's Nike Cheer Scorpion Cheerleading Shoes |
      
      
@AutomationSanity  
Scenario Outline: Verify Search Result Page(Facets,  Sort and Pagination)
 Given user launches the browser and navigates to "ASO_HOME" page
    When user enters "<SearchTerm>" in the search box
     And user scroll till filter flyout
    Then User clicks on the filter flyout
    And User expands all Filter Options
    Then User should be able to see all Filter Options as expanded
    And User collapses all Filter Options
    Then User should be able to see all Filter Options as collapsed
    And user able to see all sorting options after clicking on sort by filter
   |Most Relevant|
     |Brand (A-Z)|
     |Price (Low-High)|
     |Price (High-Low)|
     |Top Rated|
     |Most Viewed|
     |Best Selling|
     |New Arrivals|

    Examples: 
      | SearchTerm |
      | Nike Shoe |

@AutomationSanity  
Scenario: Verify Navigation from L1 to L2
Given user launches the browser and navigates to "ASO_HOME" page
Then User navigates to L1
  Then user clicks on one of the subcategory and navigates to LTwo page


#@AutomationSanity  
#Scenario: Verify Breadcumb on L1
#Given user launches the browser and navigates to "ASO_HOME" page


@AutomationSanity  
Scenario: Verify Facets and Sorts on L2
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
    |Most Relevant|
     |Brand (A-Z)|
     |Price (Low-High)|
     |Price (High-Low)|
     |Top Rated|
     |Most Viewed|
     |Best Selling|
     |New Arrivals|

@AutomationSanity  
Scenario: Verify Pagination on L2
Given user launches the browser and navigates to "ASO_HOME" page
Then User clicks on the burger menu
    Then User navigates to L2
 And User scroll to pagination
 Then User should be able to see pagination links in L2 page
     
@AutomationSanity  
Scenario: Verify Product grid on L2
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
Scenario: Verify Breadcumb on L2
Given user launches the browser and navigates to "ASO_HOME" page
Then User clicks on the burger menu
    Then User navigates to L2
Then User click on the breadcrumb last link
    

@AutomationSanity  
Scenario: Verify Navigation from L2 to L3
Given user launches the browser and navigates to "ASO_HOME" page
Then User clicks on the burger menu
    Then User navigates to L2
  Then user clicks on one of the product category and navigates to LThree page

@AutomationSanity  
Scenario: Verify Facets and Sorts on L3
Given user launches the browser and navigates to "ASO_HOME" page
Then User navigates till PLP
 And user scroll till filter flyout
 Then User clicks on the filter flyout
    And User expands all Filter Options
    Then User should be able to see all Filter Options as expanded
    And User collapses all Filter Options
    Then User should be able to see all Filter Options as collapsed
    And user able to see all sorting options after clicking on sort by filter
    |Most Relevant|
     |Brand (A-Z)|
     |Price (Low-High)|
     |Price (High-Low)|
     |Top Rated|
     |Most Viewed|
     |Best Selling|
     |New Arrivals|
    
@AutomationSanity  
Scenario: Verify Pagination on L3
Given user launches the browser and navigates to "ASO_HOME" page
Then User navigates till PLP
And User scroll to pagination
Then User should be able to see pagination links in L3 page


@AutomationSanity  
Scenario: Verify Product grid on L3
Given user launches the browser and navigates to "ASO_HOME" page
Then User navigates till PLP
Then User clicks on the filter flyout
    And User expands PRICE Filter Option
    When User selects multiple PRICE filter Options
    Then User should be able to see the selected PRICE filter Options in selected state
    When User deselects multiple PRICE filter Options
    Then User should be able to see the deselected PRICE filter Options in deselected state
    

@AutomationSanity  
Scenario: Verify Breadcumb on L3
Given user launches the browser and navigates to "ASO_HOME" page
Then User navigates till PLP
Then User click on the breadcrumb last link


@AutomationSanity  
Scenario: Verify L3 to PDP
Given user launches the browser and navigates to "ASO_HOME" page
Then User navigates till PLP
Then user clicks on the product card and navigates to PDP of the product
 And user should be able to see PDP mention in the current url


@AutomationSanity  
Scenario: Verify PDP page
Given user launches the browser and navigates to "ASO_HOME" page
Then User clicks on the burger menu
    And User navigates to L3
    Then user clicks on the product card and navigates to PDP of the product
 And user should be able to see PDP mention in the current url
    Then user should be able to see Image of the product
    And user should be able to see the name of the product in title
    Then user should see different attribute and size of the product
    And user should be able to see Add to cart button and quantity section
    Then user should be able to see inventory status of the product

@AutomationSanity  
Scenario: Verify Navigation from PDP to Homepage by clicking on ASO logo
Given user launches the browser and navigates to "ASO_HOME" page
Then User clicks on the burger menu
    And User navigates to L3
    Then user clicks on the product card and navigates to PDP of the product
    And user should be able to see PDP mention in the current url
 Then User is able to see the ASO_Logo
    Then User clicks on ASO logo
    Then User should be navigated to Home_Page

@AutomationSanity  
Scenario: Verify Navigation from L3 to Homepage by clicking on ASO logo
Given user launches the browser and navigates to "ASO_HOME" page
Then User navigates till PLP
 Then User is able to see the ASO_Logo
    Then User clicks on ASO logo
    Then User should be navigated to Home_Page



@AutomationSanity  
Scenario: Verify Navigation from L2 to Homepage by clicking on ASO logo
Given user launches the browser and navigates to "ASO_HOME" page
Then User clicks on the burger menu
    Then User navigates to L2
 Then User is able to see the ASO_Logo
    Then User clicks on ASO logo
    Then User should be navigated to Home_Page

@AutomationSanity  
Scenario: Verify Navigation from L1 to Homepage by clicking on ASO logo
Given user launches the browser and navigates to "ASO_HOME" page
Then User navigates to L1
 Then User is able to see the ASO_Logo
    Then User clicks on ASO logo
    Then User should be navigated to Home_Page

