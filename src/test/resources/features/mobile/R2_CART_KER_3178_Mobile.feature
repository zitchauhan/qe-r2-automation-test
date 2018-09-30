Feature: Verify BOPIS PDP Store Selection

	
@R2_Mobile @R2_Regression @R2_All  @P-Highest  @1HR_R2 @C-Cart @KER-3178 @ZYP_CART_K3178-9940 @CR-AG
Scenario: Verify that user view 'Find a Store' modal from Cart
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to cart button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	When Shipping radio button is selected by default 
	And in-stores radio button is deselected 

	  @R2_Mobile @R2_Regression @R2_All @P-Highest @C-Cart @KER-3178 @ZYP_CART_K3178-9941 @CR-AG
 Scenario: Verify that user view Find a Store modal from Change Location in Checkout
 Given user launches the browser and navigates to "ASO_HOME" page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user enter the valid emailaddress "login" 
	And user enter the valid password "password" 
	And user click on signin button
	And User clicks on the burger menu 
    And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to cart button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
   And click on Change Location link
   Then Find in Store modal should get open
    
    @R2_Mobile @R2_Regression @R2_All @P-Highest @C-Cart @KER-3178 @ZYP_CART_K3178-9942 @CR-AG
Scenario: Verify user can change the store using Find in Store modal
Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	When user clicks on SignIn link from global header  
	And user enter the valid emailaddress "login" 
	And user enter the valid password "password" 
	And user click on signin button
	And User clicks on the burger menu 
    And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to cart button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
     When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode"   
    When user navigates to checkout page
    
    
    @R2_Mobile @R2_Regression @R2_All @P-High @C-Cart @KER-3178 @ZYP_CART_K3178-9943 @CR-AG
Scenario: Verify the user is able to see the full inventory availability on Find a store modal
Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	When user clicks on SignIn link from global header  
	And user enter the valid emailaddress "login" 
	And user enter the valid password "password" 
	And user click on signin button
	And User clicks on the burger menu 
    And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to cart button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
     When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode"   

    
    @R2_Mobile @R2_Regression @R2_All @P-High @1HR_R2 @C-Cart @KER-3178 @ZYP_CART_K3178-9944 @CR-AG
Scenario: After searching for a couple of different keywords the header stops displaying
Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	When user clicks on SignIn link from global header  
	And user enter the valid emailaddress "login" 
	And user enter the valid password "password" 
	And user click on signin button
	And User clicks on the burger menu 
    And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to cart button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
     When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode"   
    
    
@R2_Mobile @R2_Regression @R2_All @P-Medium @C-Cart @KER-3178 @ZYP_CART_K3178-9945 @CR-AG
Scenario: Verify the user is able to see the partial inventory availability on Find a store modal
Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	When user clicks on SignIn link from global header  
	And user enter the valid emailaddress "login" 
	And user enter the valid password "password" 
	And user click on signin button
	And User clicks on the burger menu 
    And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to cart button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
     When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode"   

     
         
@R2_Mobile @R2_Regression @R2_All @P-Medium @C-Cart @KER-3178 @ZYP_CART_K3178-9946 @CR-AG
Scenario: Verify the user is able to see no inventory availability on Find a store modal
Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	When user clicks on SignIn link from global header  
	And user enter the valid emailaddress "login" 
	And user enter the valid password "password" 
	And user click on signin button
	And User clicks on the burger menu 
    And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to cart button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
     When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode"   
	
	
