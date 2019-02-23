Feature: To Verify the Sanity of the ASO build

@Sanity
Scenario Outline: Login in as a Registered User
 Given user launches the browser and navigates to "ASO_HOME" page
 Then user should able to click on Signin button
 And user should be able to enter the signin details
 When user enters "<SearchTerm>" in the search box
 Then user sign out from the website
    
 Examples: 
      | SearchTerm     |
      | Nike Shoe    |

#
#
#  @Sanity  
#  Scenario: Verify Navigation from Homepage to L1
#    Given user launches the browser and navigates to "ASO_HOME" page
#    When user clicks on one of the category and navigates to LOne page 
#    Then User should be able to see L1 Page
#    
#  @Sanity  
#  Scenario: Verify Navigation from Homepage to L2
#    Given user launches the browser and navigates to "ASO_HOME" page
#    Then User navigates to L2 from home page
#    Then User should be able to see L2 Page
# 
# 
#  @Sanity  
#  Scenario: Verify Navigation from Homepage to L3
#    Given user launches the browser and navigates to "ASO_HOME" page
#    Then User navigates to L3 from home page
#    Then User should be able to see L3 Page
#  
#    
# @Sanity
#    Scenario: Verify Navigation from Homepage to PDP
#     Given user launches the browser and navigates to "ASO_HOME" page
#     When User enters required value in search box 
#     Then User should be navigated to PDP Page
# 
# 
#   @Sanity
#     Scenario: Verify Search from Home Page
#       Given user launches the browser and navigates to "ASO_HOME" page
#       When User enters required value in search box to navigate to search Results page
#       Then User should be navigated to Search Results Page
#   
#  
#  
#   @Sanity
#    Scenario: Verify Navigation from L1 to L2
#      Given user launches the browser and navigates to "ASO_HOME" page
#      When user clicks on one of the category and navigates to LOne page
#      And User clicks on any of the subcategory in L1 Page
#      Then User should be navigated to L2 Page
#      
#       
#       
#  @Sanity
#    Scenario: Verify Navigation from L2 to L3
#      Given user launches the browser and navigates to "ASO_HOME" page
#      When user clicks on one of the category and navigates to LOne page
#      And User clicks on any of the subcategory in L1 Page
#      Then User should be navigated to L2 Page
#      When User clicks on required category in L2 Page
#      Then User should be navigated to L3 Page
#      
#      
#           
# @Sanity
#    Scenario: Verify Navigation from L3 to PDP
#      Given user launches the browser and navigates to "ASO_HOME" page
#      When user clicks on one of the category and navigates to LOne page
#      And User clicks on any of the subcategory in L1 Page
#      Then User should be navigated to L2 Page
#      When User clicks on required category in L2 Page
#      Then User should be navigated to L3 Page
#      And User clicks on required product in L3 Page
#      Then User should be navigated to PDP Page
#    
#    
# @Sanity
#    Scenario: Verify Product grid on L3 
#      Given user launches the browser and navigates to "ASO_HOME" page
#      When user clicks on one of the category and navigates to LOne page
#      And User clicks on any of the subcategory in L1 Page
#      Then User should be navigated to L2 Page
#      When User clicks on required category in L2 Page
#      Then User should be navigated to L3 Page
#      Then User should be able to see product grid in L3 Page
#      
#     
#     @Sanity
#    Scenario: Verify Product grid on L2
#      Given user launches the browser and navigates to "ASO_HOME" page
#      When user clicks on one of the category and navigates to LOne page
#      And User clicks on any of the subcategory in L1 Page
#      Then User should be navigated to L2 Page
#      Then User should be able to see product grid in L2 Page
#       
#    @Sanity  
#   Scenario: Verify Breadcumb on L1
#    Given user launches the browser and navigates to "ASO_HOME" page
#    When user clicks on one of the category and navigates to LOne page 
#    Then User should be able to see L1 Page 
#    Then User should be able to see BreadCrumb in L1 page
#        
#       
    
@Sanity
    Scenario: Verify Pagination on L2
      Given user launches the browser and navigates to "ASO_HOME" page
      When user clicks on one of the category and navigates to LOne page
      And User clicks on any of the subcategory in L1 Page
      Then User should be navigated to L2 Page
      And User scroll to pagination
      Then User should be able to see pagination links in L2 page
 
#        
# @Sanity
#    Scenario: Verify Pagination on L3
#      Given user launches the browser and navigates to "ASO_HOME" page
#      When user clicks on one of the category and navigates to LOne page
#      And User clicks on any of the subcategory in L1 Page
#      Then User should be navigated to L2 Page
#      When User clicks on required category in L2 Page
#      Then User should be navigated to L3 Page
#     And User scroll to pagination
#      Then User should be able to see pagination links in L3 page