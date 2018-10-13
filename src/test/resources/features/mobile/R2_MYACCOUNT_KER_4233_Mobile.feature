Feature: E02-100 - My Account, Wish List 

@R2_Mobile @R2_Regression @R2_All @P-Highest @1HR_R2 @C-MyAccount @KER-4233 
@ZYP_MYACCOUNT_K4233-10484 @ZYP_MYACCOUNT_K4233-11099 @CR-MS 
Scenario: Verify that Authenticated User is able to view the Wish List page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "emailWithOutPhonenumber" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User clicks on the burger menu 
	And user click on MyAccount 
	Then user click on WishList 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in wishlist|
		|WishlistPage_CreateANewWishlist_btn|
	Then Verify that Create Your First Wish List button 
	
	
@R2_Mobile @R2_Regression @R2_All @P-Highest @1HR_R2 @C-MyAccount @KER-4233 
@ZYP_MYACCOUNT_K4233-10504 @ZYP_MYACCOUNT_K4233-11113 @CR-MS 
Scenario: Verify that Authenticated user can create first wish list 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "emailWithOutPhonenumber" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User clicks on the burger menu 
	And user click on MyAccount 
	Then user click on WishList 
	And deletes all the existing wishlists 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following element in wishlist section|
		|WishlistPage_CreateANewWishlist_btn|
	And user clicks on create first wishlist button 
	Then user enters Wishlist name "WishlistName" 
	And user clicks on Create List 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following element in wishlist section|
		|WishlistItems_lnk|
	And verify the created list 
	
@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-4233 
@ZYP_MYACCOUNT_K4233-10488 @ZYP_MYACCOUNT_K4233-11103 @CR-MS 
Scenario: Verify that Authenticated User is able to rename a Wish List 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "emailWithOutPhonenumber" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User clicks on the burger menu 
	And user click on MyAccount 
	Then user click on WishList 
	And deletes all the existing wishlists 
	And user clicks on create first wishlist button 
	Then user enters Wishlist name "WishlistName" 
	And user clicks on Create List 
	And user clicks on WishListItems 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following element in wishlist section|
		|Rename_list_lnk_mob|
	Then user clicks on Rename List 
	Then user enters Wishlist name "WishlistName" 
	And user clicks on create 
	
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-MyAccount @KER-4233 
@ZYP_MYACCOUNT_K4233-10490 @ZYP_MYACCOUNT_K4233-11104 @CR-MS 
Scenario: Verify that Authenticated User is able to cancel deleting a Wish List 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User clicks on the burger menu 
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
	And user clicks on WishListItems 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following element in wishlist section|
		|Wishlist_icn|
	Then user clicks on Delete list 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following element in wishlist section|
		|DeleteWishList_btn|
		|Keep_Wishlist_btn|
	And user clicks on keep wishlist 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following element in wishlist section|
		|Wishlist_icn|			
		
@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-4233 
@ZYP_MYACCOUNT_K4233-10492 @ZYP_MYACCOUNT_K4233-11105 @CR-MS 
Scenario: Verify that Authenticated User is able to delete a Wish List 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "emailWithOutPhonenumber" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User clicks on the burger menu 
	And user click on MyAccount 
	Then user click on WishList 
	And deletes all the existing wishlists 
	And user clicks on create first wishlist button 
	Then user enters Wishlist name "WishlistName" 
	And user clicks on Create List 
	And user clicks on WishListItems 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following element in wishlist section|
		|Wishlist_icn|
	Then user clicks on Delete list 
	And user clicks on Delete WishList 
	
	
@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-4233 
@ZYP_MYACCOUNT_K4233-10505 @ZYP_MYACCOUNT_K4233-11114 @CR-MS 
Scenario: Verify that Authenticated user can create additional wish list 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User clicks on the burger menu 
	And user click on MyAccount 
	Then user click on WishList 
	And deletes all the existing wishlists 
	And user clicks on create first wishlist button 
	Then user enters Wishlist name "WishlistName" 
	And user clicks on Create List 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following element in wishlist section|
		|WishlistItems_lnk|
	And user clicks on WishListItems 
	
	
@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-4233 
@ZYP_MYACCOUNT_K4233-11102 @ZYP_MYACCOUNT_K4233-10487 @CR-MS 
Scenario: 
	Verify that Authenticated User is able to restore Removed item in Wish List 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User click on burger menu 
	And user navigates to wishlist in my account 
	And deletes all the existing wishlists 
	And user clicks on create first wishlist button 
	Then user enters Wishlist name "WishlistName" 
	And user clicks on Create List 
	And User searches a product "productName" and navigates to PDP 
	And user add an item to wishlist "WishlistName" and navigates to wishlist 
	And user click on remove on product card and click on undo 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following element in wishlist section|
		|WishList_Product_Eyebrow|
		|WishList_Product_Tittle|   
		
@R2_Mobile @R2_Regression @R2_All @P-Low @C-MyAccount @KER-4233 
@ZYP_MYACCOUNT_K4233-10486 @ZYP_MYACCOUNT_K4233-11101 @CR-MS 
Scenario: Verify that Authenticated User is able to Remove items from Wish List 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailWithoutShipDetails" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User searches a product "productName" and navigates to PDP 
	And user add an item to wishlist "WishlistName" and navigates to wishlist 
	And user click on remove on product card 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following element in wishlist section|
		|browse_products_btn|   
		
@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-4233 
@ZYP_MYACCOUNT_K4233-10485 @ZYP_MYACCOUNT_K4233-11100 @CR-MS 
Scenario: Verify that Authenticated User is able to view the Wish List Details 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "EmailWithoutPaymentDetails" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User clicks on the burger menu 
	And user click on MyAccount 
	Then user click on WishList 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following element in wishlist section|
		|Wishlist_createlist_lnk|
		|WishlistItems_lnk|
	And user clicks on WishListItems 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following element in wishlist section|
		|WishList_Product_Eyebrow|
		|WishList_Product_Tittle|
		
@R2_Mobile @R2_Regression @R2_All @P-Low @C-MyAccount @KER-4233 
@ZYP_MYACCOUNT_K4233-11111 @ZYP_MYACCOUNT_K4233-11109 
@ZYP_MYACCOUNT_K4233-10498 @CR-MS 
Scenario: Verify the User is able to move item from wish list to cart 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailWithoutShipDetails" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User searches a product "productName" and navigates to PDP 
	And user add an item to wishlist "WishlistName" and navigates to wishlist 
	And clicks on Move to Cart button 
	Then verify the item is moved to cart 
	