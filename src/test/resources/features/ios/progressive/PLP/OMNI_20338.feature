Feature: Verify Details of PLP for product
  
   
 @Regression @Sprint01 @TC-OMNI-20338_2
    Scenario Outline:: validate PLP badges
  	Given User launches the application
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "<SearchKeyword>"
#   Then User sees all products related to search Keyword    
    Then verify the "<SearchKeyword>" of product in PLP page attributes
 Examples: 
|	 SearchKeyword                          | 
|   colour_varient_prod                    |
#|   Unitprice_Prod                         |
#|   Price_Range_Prod                       |
#|	clearence_Prod                          |	
|	OurPriceIncart                          |
|	ammunitionProd                          |
#   |	specialprice                        |
# |	Promotion_data                          | 
| Clearance_Styles_Available             |
#|	Some_styles_only_available_online_prod  |

 
 
 #wasPrice- price_Prod : title,price ,colour,ratings,
 
 