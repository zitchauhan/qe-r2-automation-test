Feature: Verify Authenticated Customer Store Priority 

@C-BOPIS @R2_Mobile @R2_Regression @R2_All @P-High @1HR_R2 @C-Cart @KER-4231 @ZYP_CART_K4231-8894 
@CR-GK 
Scenario: Verify Authenticated user able to see the BOPIS items for pickup 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigate and deletes existing items in cart 
	And User clicks on the burger menu 
	And user selects store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore" 
	And User searches a product "SKUForBopisProduct" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	Then user navigate to Cart page 
	
@C-BOPIS @R2_Mobile @R2_Regression @R2_All @P-Medium @C-Cart @KER-4231 
@ZYP_CART_K4231-8896 @CR-GK 
Scenario: 
	Verify Authenticated user can see the BOPIS item available message in newly selected store 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigate and deletes existing items in cart 
	And User clicks on the burger menu 
	And user selects store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore" 
	And User searches a product "SKUForBopisProduct" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	Then user should be able to see In-Store Pick up enabled 
	
	
@C-BOPIS @R2_Mobile @R2_Regression @R2_All @P-High @C-Cart @KER-4231 @ZYP_CART_K4231-8898 
@CR-GK 
Scenario: Verify Authenticated user able to see the BOPIS items for pickup 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigate and deletes existing items in cart 
	And User clicks on the burger menu 
	And user selects store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore" 
	And User searches a product "SKUForBopisProduct" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	Then user should be able to see In-Store Pick up enabled 
	
	
@C-BOPIS @R2_Mobile @R2_Regression @R2_All @P-High @C-Cart @KER-4231 @ZYP_CART_K4231-8891 
@CR-GK 
Scenario: 
	Verify Authenticated user can add BOPIS item for newly selected store to cart 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigate and deletes existing items in cart 
	And User clicks on the burger menu 
	And user selects store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore" 
	And User searches a product "SKUForBopisProduct" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	
	
@C-BOPIS @R2_Mobile @R2_Regression @R2_All @P-High @C-Cart @KER-4231 @ZYP_CART_K4231-8887 
@CR-GK 
Scenario: Verify Authenticated user can change their favorite store in PLP 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigate and deletes existing items in cart 
	And User clicks on the burger menu 
	And user selects store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore" 
	And User searches a product "SKUForBopisProduct" and navigates to PDP 
	And User clicks on the burger menu 
	And user selects store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore" 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	Then user should be able to see In-Store Pick up enabled 