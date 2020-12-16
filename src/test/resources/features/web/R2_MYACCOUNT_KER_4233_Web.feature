Feature: E02-100 - My Account, Wish List 

@R2_Web @ZYP_MYACCOUNT_K4233-10484 @CR-MS @RegressionP3 @MyAccount @TC-OMNI-13366
Scenario: Verify that Authenticated User is able to view the Wish List page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddressForChangePassword" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user click on MyAccount 
	Then user click on WishList 
	Then deletes all the existing wishlists 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in wishlist|
		|WishlistPage_CreateANewWishlist_btn|
	Then Verify that Create Your First Wish List button 
	
@R2_Web @R2_Regression @R2_All @P1 @1HR_R2 @C-MyAccount @KER-4233 
@ZYP_MYACCOUNT_K4233-10504 @ZYP_MYACCOUNT_K4233-11113 @CR-MS 
Scenario: Verify that Authenticated user can create first wish list 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "emailWithOutPhonenumber" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user click on MyAccount 
	Then user click on WishList 
	Then deletes all the existing wishlists 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in wishlist|
		|WishlistPage_CreateANewWishlist_btn|
	And user clicks on create first wishlist button 
	Then user enters Wishlist name "WishlistName" 
	And user clicks on Create List 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following element in wishlist section|
		|WishlistItems_lnk|
	And verify the created list 
	
@R2_Web @ZYP_MYACCOUNT_K4233-11103 @CR-MS @RegressionP3 @MyAccount @TC-OMNI-13371
Scenario: Verify that Authenticated User is able to rename a Wish List 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "emailWithOutPhonenumber" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user click on MyAccount 
	Then user click on WishList
	Then deletes all the existing wishlists 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in wishlist|
		|WishlistPage_CreateANewWishlist_btn|
	And user clicks on create first wishlist button 
	Then user enters Wishlist name "WishlistName" 
	And user clicks on Create List 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following element in wishlist section|
		|Wishlist_createlist_lnk|
		|WishlistItems_lnk|
	And user clicks on WishListItems 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following element in wishlist section|
		|Rename_list_lnk|
	Then user clicks on Rename List 
	Then user enters Wishlist name "WishListRename" 
	And user clicks on create 
	
@R2_Web @ZYP_MYACCOUNT_K4233-11104 @CR-MS @TC-KER-11104 
Scenario: Verify that Authenticated User is able to cancel deleting a Wish List 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "emailWithOutPhonenumber" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user click on MyAccount 
	Then user click on WishList 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following element in wishlist section|
		|Wishlist_createlist_lnk|
		|WishlistItems_lnk|
	And user clicks on WishListItems 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following element in wishlist section|
		|DeleteList_btn|
	Then user clicks on Delete list 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following element in wishlist section|
		|DeleteWishList_btn|
		|Keep_Wishlist_btn|
	And user clicks on keep wishlist 
	Then Verify that Wish List is displayed 
	
	
@R2_Web @ZYP_MYACCOUNT_K4233-10492 @ZYP_MYACCOUNT_K4233-11105 @MyAccount
Scenario: Verify that Authenticated User is able to delete a Wish List 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "emailWithOutPhonenumber" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user click on MyAccount 
	Then user click on WishList 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following element in wishlist section|
		|Wishlist_createlist_lnk|
		|WishlistItems_lnk|
	And user clicks on WishListItems 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following element in wishlist section|
		|DeleteList_btn|	
	Then user clicks on Delete list 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following element in wishlist section|
		|DeleteWishList_btn|	
	And user clicks on Delete WishList 
	Then Verify that Wish List is displayed 
	
	
	
@R2_Web @R2_Regression @R2_All @P2 @C-MyAccount @KER-4233 
@ZYP_MYACCOUNT_K4233-10505 @ZYP_MYACCOUNT_K4233-11114 @CR-MS 
Scenario: Verify that Authenticated user can create additional wish list 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user click on MyAccount 
	Then user click on WishList 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following element in wishlist section|
		|Wishlist_createlist_lnk|
	And user clicks on Create List 
	Then user enters Wishlist name "WishlistName" 
	And user clicks on create 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following element in wishlist section|
		|WishlistItems_lnk|
	And user clicks on WishListItems 
	
	
	
@R2_Web @R2_Regression @R2_All @P2 @C-MyAccount @KER-4233 
@ZYP_MYACCOUNT_K4233-10493 @ZYP_MYACCOUNT_K4233-11106 @CR-MS @C1-Message 
Scenario: Verify the elements of Share wishlist modal 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailWithoutPaymentDetails" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user click on MyAccount 
	Then user click on WishList 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following element in wishlist section|
		|Wishlist_createlist_lnk|
		|WishlistItems_lnk|
	And user clicks on WishListItems 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following element in wishlist section|
		|DeleteList_btn|
		|Share_list_lnk|
	When User Clicks on Share List Link 
	Then Verify the message on the page 
		|#Verify the message on the popup modal|
		#Updated by MJR - 17/7/19
		|SHARE YOUR WISH LIST|	 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following element in wishlist section|
		|Email_input_txt|
		|Message_txt|
		|Share_Wishlist_btn|
		|Cancel_btn|
		
@R2_Web @R2_Regression @R2_All @P-Low @C-MyAccount @KER-4233 
@ZYP_MYACCOUNT_K4233-10495 @ZYP_MYACCOUNT_K4233-11107 @CR-MS @C1-Message 
Scenario: Verify the User is able to cancel Sharing wishlist 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailWithoutPaymentDetails" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user click on MyAccount 
	Then user click on WishList 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following element in wishlist section|
		|Wishlist_createlist_lnk|
		|WishlistItems_lnk|
	And user clicks on WishListItems 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following element in wishlist section|
		|DeleteList_btn|
		|Share_list_lnk|
	When User Clicks on Share List Link 
	Then Verify the message on the page 
		|#Verify the message on the popup modal|
		|SHARE YOUR WISHLIST|	 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following element in wishlist section|
		|Email_input_txt|
		|Message_txt|
		|Share_Wishlist_btn|
		|Cancel_btn|
	And User Enters Emailaddress "EmailWithoutPaymentDetails" 
	And User Enter Optional message "WishlistName" 
	Then User Clicks clicks on Cancel button 
	And Verify that Wish List is displayed 
	
	
	
@R2_Web @R2_Regression @R2_All @P-Low @C-MyAccount @KER-4233 
@ZYP_MYACCOUNT_K4233-10497 @ZYP_MYACCOUNT_K4233-11108 @CR-MS @C1-Message 
Scenario: Verify the User is able to Share a wish list 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailWithoutPaymentDetails" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user click on MyAccount 
	Then user click on WishList 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following element in wishlist section|
		|Wishlist_createlist_lnk|
		|WishlistItems_lnk|
	And user clicks on WishListItems 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following element in wishlist section|
		|DeleteList_btn|
		|Share_list_lnk|
	When User Clicks on Share List Link 
	Then Verify the message on the page 
		|#Verify the message on the popup modal|
		|SHARE YOUR WISHLIST|	 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following element in wishlist section|
		|Email_input_txt|
		|Message_txt|
		|Share_Wishlist_btn|
		|Cancel_btn|
	And User Enters Emailaddress "EmailWithoutPaymentDetails" 
	And User Enter Optional message "WishlistName" 
	And User Clicks on Share Wishlist button 
	Then Verify that Wish List is displayed 
	
@R2_Web @R2_Regression @R2_All @P-Low @C-MyAccount @KER-4233 
@ZYP_MYACCOUNT_K4233-10486 @ZYP_MYACCOUNT_K4233-11101 @CR-MS 
Scenario: Verify that Authenticated User is able to Remove items from Wish List 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigates to wishlist in my account 
	And deletes all the existing wishlists 
	And User searches a product "productName" and navigates to PDP 
	#	And user add an item to wishlist "WishlistName" and navigates to wishlist 
	#	And user click on remove on product card 
	#	Then Verify below Sub/Main Module of My Account 
	#		|#Verify following element in wishlist section|
	#		|browse_products_btn|
	
	
@R2_Web @R2_Regression @R2_All @P2 @C-MyAccount @KER-4233 
@ZYP_MYACCOUNT_K4233-11102 @ZYP_MYACCOUNT_K4233-10487 @CR-MS 
Scenario: Verify that Authenticated User is able to restore Removed item in Wish List 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User searches a product "productName" and navigates to PDP 
	And user add an item to wishlist "WishlistName" and navigates to wishlist 
	And user click on remove on product card and click on undo 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following element in wishlist section|
		|WishList_Product_Img|
		|WishList_Product_Eyebrow|
		|WishList_Product_Tittle|
		|WishList_Product_Review|
		|WishList_Product_Price|
		
		
@R2_Web @ZYP_MYACCOUNT_K4233-10485 @CR-MS @RegressionP2 @MyAccount  @TC-OMNI-13368
Scenario: Verify that Authenticated User is able to view the Wish List Details 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailWithoutPaymentDetails" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user click on MyAccount 
	Then user click on WishList 
	And deletes all the existing wishlists 
	And user clicks on create first wishlist button 
	Then user enters Wishlist name "WishlistName" 
	And user clicks on Create List 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following element in wishlist section|
		|Wishlist_createlist_lnk|
		|WishlistItems_lnk|
	And User searches a product "productName" and navigates to PDP 
	And user click on ship it button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page
	And user add an item to wishlist "WishlistName" and navigates to wishlist 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following element in wishlist section|
		|WishList_Product_Img|
		|WishList_Product_Eyebrow|
		|WishList_Product_Tittle|
		|WishList_Product_Review|
		|WishList_Product_Price|	
		
@R2_Web @ZYP_MYACCOUNT_K4233-10498 @RegressionP2 @MyAccount @TC-OMNI-13372
Scenario: Verify the User is able to move item from wish list to cart 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "UserForWishlist" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user click on MyAccount 
	Then user click on WishList 
	And deletes all the existing wishlists 
	And user clicks on create first wishlist button 
	Then user enters Wishlist name "WishlistName" 
	And user clicks on Create List 
	And User searches a product "productName" and navigates to PDP
	And user click on ship it button
	And user click on viewcart button
	Then user navigates to Cart Page 
	And user add an item to wishlist "WishlistName" and navigates to wishlist 
	And clicks on Move to Cart button 
	Then verify the item is moved to cart 
@RegressionP3
Scenario: Verify whether user is able to add an item to wish list from cart page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailWithoutPaymentDetails" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user click on MyAccount 
	Then user click on WishList 
	And deletes all the existing wishlists 
	And user clicks on create first wishlist button 
	Then user enters Wishlist name "WishlistName" 
	And user clicks on Create List 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following element in wishlist section|
		|Wishlist_createlist_lnk|
		|WishlistItems_lnk|
	And User searches a product "productName" and navigates to PDP 
	And user click on ship it button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page
	And user add an item to wishlist "WishlistName" and navigates to wishlist 			 
  