Feature: To Verify the Cart Add item/Remove item/Increase and decrease qty & Apply promo code 


 @Sanity @C-Reskin @Web @All @Rerun @CR-SDK 
Scenario: Verify the Add To Cart functionality and validate the product. 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates to L3 
	And User selects Required product in Product Listing Page 
	Then User should be select the Quantity 
	And User clicks on AddToCart Button 
	Then User should be able to see ATC notification 
	When User clicks on View_Cart Button 
	Then User should be navigated to Cart Page 
	Then User should be able to see added product in cart 
	And User closes the web application 
	
 @Sanity @C-Reskin @Web @All @Rerun @CR-SDK 
Scenario: Verify the product added to the card is removed from cart 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates till PLP 
	And User click on the product image 
	Then user click on Add to cart button 
	And user click on view cart button 
	Then remove the product from cart 
	And User closes the web application 
	
	
 @Sanity @C-Reskin @Web @All @Rerun @CR-SDK 
Scenario: Verify the product is added to the card and able to increase the qty 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates till PLP 
	And User click on the product image 
	Then user click on Add to cart button 
	And user click on view cart button 
	Then user increase the qty by clicking plus button 
	Then user increase the qty by inputing the value 
	And User closes the web application 
	
 @Sanity @C-Reskin @Web @All @Rerun @CR-SDK 
Scenario: Verify the product is added to the card and able to decreace the qty 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates till PLP 
	And User click on the product image 
	Then user click on Add to cart button 
	And user click on view cart button 
	Then user decrease the qty by clicking minus button 
	Then user decrease the qty by inputing the value 
	And User closes the web application 
	
	
	
	
  