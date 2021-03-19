Feature: Verify Details of PLP for product
  
  	@Sprint01 @TC-OMNI-20338_1
    Scenario Outline:: validate PLP 
  	Given User launches the application
  	And User continues as guest user
  	Then User sees the homepage
    When User taps on go to shop button
  	When I choose to navigate "L3Category" on page
    And  I choose to navigate at "ShopBycategory" landing page 
   # Then I choose to verify "PLP" landing page   
  Then verify the "<badge>" of product in PLP page
 Examples: 
     |    badge                      |	
#    |    Product Image              | 
#    |    Product Name               | 
#    |    Product Price              |
 #   |    Color Swatches             |
 #   |   Promotion Messaging         |
 #   |   Product Price-range         |      
 #   |single-colour                  |
  #  |item-level promotion           |
 #   |product-with-clearince Message |
 
 
   
 @Regression 	@Sprint01 @TC-OMNI-20338_2
    Scenario Outline:: validate PLP badges
  	Given User launches the application
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword"
   Then User sees all products related to search Keyword    
  Then verify the "<SearchKeyword>" of product in PLP page attributes
 Examples: 
|	 SearchKeyword                          | 
#|   colour_varient_prod                    |
#|   price_Prod                             |
|   Price_Range_Prod                        |
#|	clearence_Prod                          |	
#|	OurPriceIncart                          |
#|	Ammunication_prod                       |
|	specialprice                            |
|	Promotion-data                          | 
#|	Clearance_Styles_Available              |
#|	Some_styles_only_available_online_prod  |

 
 
 #wasPrice- price_Prod : title,price ,colour,ratings,
 
 