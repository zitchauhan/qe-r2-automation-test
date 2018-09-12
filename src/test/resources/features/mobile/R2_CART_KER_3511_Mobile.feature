Feature: [Mobile] B05-350 Shipping Estimate in Cart
	@R2_Mobile @R2_Regression  @C-Cart @P-High @KER-3511 @ZYP_CART_K3511-7989 @CR-RKA	 
	Scenario: Verify if authenticated user can view estimated shipping based on zip code saved to their account
	 Given user launches the browser and navigates to "ASO_HOME" page 
	 Then User clicks on the burger menu
    Then user should able to click on Signin button
    Then user able to signin
    Then User clicks on the burger menu
	  And user lands on My Account page and click on adress
	 Then user fill the Address book details 
	Then User clicks on the burger menu
	And User navigates to LThree
   	Then user clicks on the product card and navigates to PDP
		And user click on Add to Cart Button
		And user is navigated to Add to cart Notification popup  
		And user will click on View Cart button 
		Then Verify below Sub/Main Module of Cart Page
         |#Verify Estimated Shipping amount is displayed #|
         |EstimatedShippingPrice_Txt|
         
  
	
  
@R2_Mobile @R2_Regression  @C-Cart @P-Low @KER-3511 @ZYP_CART_K3511-7990 @CR-RKA	 
	Scenario: Verify if authenticated user can view updated estimated shipping based on updated zip code saved in account      
Given user launches the browser and navigates to "ASO_HOME" page 
    Then User clicks on the burger menu
    Then user should able to click on Signin button
    Then user able to signin
     Then User clicks on the burger menu
	  And user lands on My Account page and click on adress
	 Then user fill the Address book details 
	Then User clicks on the burger menu
	And User navigates to LThree
   	Then user clicks on the product card and navigates to PDP
			And user click on Add to Cart Button
		And user is navigated to Add to cart Notification popup  
		And user will click on View Cart button 
		Then user change zip code  
		Then Verify below Sub/Main Module of Cart Page
         |#Verify Estimated Shipping amount is displayed #|
         |EstimatedShippingPrice_Txt|
        
@R2_Mobile @R2_Regression  @C-Cart @P-High @KER-3511 @ZYP_CART_K3511-7991 @CR-RKA	 
 Scenario: Verify if authenticated user can view updated estimated shipping when zip code updated on cart page in order summary section.
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
    Then user should able to click on Signin button
    Then user able to signin
   Then User clicks on the burger menu
	And User navigates to LThree
   	Then user clicks on the product card and navigates to PDP
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When user clicks on Change Zip Code link in Estimated shipping section of Order Summary section on Cart page
	And user enters new "Zipcode" in Change ZIP Code modal overlay 
	And user clicks on Submit button
	Then Verify below Sub/Main Module of Cart Page
         |#Verify Estimated Shipping amount is displayed #|
         |EstimatedShippingPrice_Txt|
	       


@R2_Mobile @R2_Regression  @C-Cart @P-Low @KER-3511 @ZYP_CART_K3511-7992 @CR-RKA
	Scenario: Verify if unauthenticated user can view estimated shipping cost based entered zip code
	Given user launches the browser and navigates to "ASO_HOME" page 
	 Then User clicks on the burger menu
	And User navigates to LThree
   	Then user clicks on the product card and navigates to PDP 
	
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When user clicks on Change Zip Code link in Estimated shipping section of Order Summary section on Cart page
	And user enters new "Zipcode" in Change ZIP Code modal overlay 
	And user clicks on Submit button
	Then Verify below Sub/Main Module of Cart Page
         |#Verify Estimated Shipping amount is displayed #|
         |EstimatedShippingPrice_Txt|
	
        