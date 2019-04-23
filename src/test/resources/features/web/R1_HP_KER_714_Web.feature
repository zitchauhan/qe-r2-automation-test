Feature: To verfiy Landing Page - Product Listing / Product Grid 

@Web @Regression @KER-714 @ZYP_HP_K714-1991 @C-PDP @CR-RKA @1HR @RBeta 
Scenario: To verify user is able to navigate to product details page when product card is clicked 
	Given user launches the browser and navigates to "ASO_HOME" page 
#	Then click on the prodct card in home page 
#	And user should be able to see PDP mention in the current url 
	When user enters "SKUIdOfProductLs15" in the search box plcc
	And user click on search icon 
	And user click on ship it button 
	And user click on viewcart button 
	Then user navigates to Cart Page 
	And user should be able to see ship it button and quantity section 
	#And user should be able to see Add to cart button and quantity section 
	
	
@Web @Regression @KER-714 @ZYP_HP_K714-1984 @C-HP @CR-RKA @RBeta 
Scenario: To verify user is able to view product cards as grids on product listing page 
	Given user launches the browser and navigates to "ASO_HOME" page 
#	Then click on the prodct card in home page 
	When user enters "SKUIdOfProductLs15" in the search box plcc
	And user click on search icon 
	And user click on ship it button 
	And user click on viewcart button 
	Then user navigates to Cart Page 
	And user should be able to see ship it button and quantity section 
	
	
	
