Feature: [Web]B05-350 Shipping Estimate in Cart
 
@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-3511 @ZYP_CART_K3511-7991 @CR-DPK @1HR_R2
Scenario: Verify if authenticated user can view updated estimated shipping when zip code updated on cart page in order summary section.
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header
 	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP
	Then user click on Add to Cart Button
	And user will click on View Cart button 
	And user navigate to Cart page 
	When user clicks on Change Zip Code link in Estimated shipping section of Order Summary section on Cart page
	And user enters new "Zipcode" in Change ZIP Code modal overlay 
	And user clicks on Submit button
	Then user verifies the estimated shipping cost based on updated zip code.
	
	
	
	@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3511 @ZYP_CART_K3511-7992 @CR-DPK
	Scenario: Verify if unauthenticated user can view estimated shipping cost based entered zip code
	And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP
	Then user click on Add to Cart Button
	And user will click on View Cart button 
	When user clicks on Change Zip Code link in Estimated shipping section of Order Summary section on Cart page
	And user enters new "Zipcode" in Change ZIP Code modal overlay 
	And user clicks on Submit button
	Then user verifies the estimated shipping cost based on updated zip code.
	
	

	@R2_Web @R2_Regression  @C-Cart @P-High @KER-3511 @ZYP_CART_K3511-7989 @CR-RKA	 
	Scenario: Verify if authenticated user can view estimated shipping based on zip code saved to their account
	 Given user launches the browser and navigates to "ASO_HOME" page 
     And clicks on SignIn button in home page
    And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	  And user lands on My Account page and click on adress
	 Then user fill the Address book details 
	 And user clicks on one of the category and navigates to LOne
	    And user clicks on one of the subcategory and navigates to LTwo
	    And user is able to see the product category name in section title
	    And user clicks on one of the product category and navigates to LThree
		And User is navigated to pdp page
		And user click on Add to Cart Button
		And user is navigated to Add to cart Notification popup  
		And user will click on View Cart button 
		Then Verify below Sub/Main Module of Cart Page
         |#Verify Estimated Shipping amount is displayed #|
         |EstimatedShippingPrice_Txt|
         
         
         
@R2_Web @R2_Regression  @C-Cart @P-Low @KER-3511 @ZYP_CART_K3511-7990 @CR-RKA	 
	Scenario: Verify if authenticated user can view updated estimated shipping based on updated zip code saved in account      
Given user launches the browser and navigates to "ASO_HOME" page 
     And clicks on SignIn button in home page
     And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	  And user lands on My Account page and click on adress
	 Then user fill the Address book details 
	 And user clicks on one of the category and navigates to LOne
	    And user clicks on one of the subcategory and navigates to LTwo
	    And user is able to see the product category name in section title
	    And user clicks on one of the product category and navigates to LThree
		And User is navigated to pdp page
		And user click on Add to Cart Button
		And user is navigated to Add to cart Notification popup  
		And user will click on View Cart button 
		Then user change zip code  
		Then Verify below Sub/Main Module of Cart Page
         |#Verify Estimated Shipping amount is displayed #|
         |EstimatedShippingPrice_Txt|
        
		
	
	
	