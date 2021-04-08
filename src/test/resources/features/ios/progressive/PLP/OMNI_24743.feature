Feature: Product Listing and Homescreen - Free Shipping with Sign-in Banner


  @TC-OMNI-24743 @Sprint3 
  Scenario: validate user is able to navigate to different categories
      Given User launches the application
      And User continues as guest user
      Then User sees the homepage
      When User taps on shop in bottom nav
      Then User sees the shop page
      And User sees the categories list is not empty
      And User verifies the level One category list
      Then User navigates to "clothing" category in the list
      Then User verifies the level two category list
      Then User navigates to "Men's Clothing" category in the list
      Then User verifies the level three category list
      Then User navigates to "shorts" category in the list
      Then User sees "clothing" PLP page
      Then I chose to verify "free_Shipping_Banner" in PLP Page
      And  I Choose to click on "SeeDetail_FreeShipping" Link 
      Then I choose to verify navigated to "Mobile_Web_FreeShipping"
      And User taps on back button
      Then I chose to verify "free_Shipping_Banner" in PLP Page
      
  @TC-OMNI-24743_2 @Sprint3 
  Scenario: validate followings when user taps on shop all link from L2 category
  1. shop by L2 categories are displaying on PLP L1 
  2. shop by L3 categories are displaying on PLP L2
  3. There is no further categories displayed on PLP L3
  	Given User launches the application
  	And User continues as guest user
  	Then User sees the homepage
  	When User taps on shop in bottom nav
  	Then User sees the shop page
  	And User sees the categories list is not empty
  	And User fetch the "L1 category" list
  	Then User navigates to "clothing" category in the list
  	And User fetch the "L2 category" list
  	Then User navigates to "Boys' clothing" category in the list
  	And User fetch the "L3 category" list
  	Then User taps on back button
  	And User taps on shop all link
  	Then User sees "clothing" PLP page
  	Then User sees Shop By Category title on PLP
  	Then User verifies "L2 categories" are displaying on PLP
  #	Then User verifies "L3 categories" are displaying on PLP
  #	Then User navigates to "Boys' shirts" category on PLP Page
  #	Then User verifies "No categories" are displaying on PLP
  	
     Then I chose to verify "free_Shipping_Banner" in PLP Page
     And  I Choose to click on "SeeDetail_FreeShipping" Link 
     Then I choose to verify navigated to "Mobile_Web_FreeShipping"
      And User taps on back button
      Then I chose to verify "free_Shipping_Banner" in PLP Page
  	