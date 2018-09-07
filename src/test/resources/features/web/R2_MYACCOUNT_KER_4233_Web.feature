Feature: E02-100 - My Account, Wish List

@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4233 @ZYP_MYACCOUNT_K4233-10484 @CR-MS
Scenario: Verify that Authenticated User is able to view the Wish List page 
    Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "emailWithOutPhonenumber" 
	And user enter the valid password "Password" 
	And user click on signin button
	And user click on MyAccount
	Then user click on WishList
	Then Verify below Sub/Main Module of My Account
    |#Verify following elements in wishlist|
	|WishlistPage_CreateANewWishlist_btn|
	Then Verify that Create Your First Wish List button
	

@R2_Web @R2_Regression @R2_All @P-Highest @C-MyAccount @KER-4233 @ZYP_MYACCOUNT_K4233-10504 @CR-MS
Scenario: Verify that Authenticated user can create first wish list
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
	|WishlistItems_lnk|
	And user clicks on Create List
	Then user enters Wishlist name "WishlistName" 
	And user clicks on create
	Then Verify below Sub/Main Module of My Account
	|#Verify following element in wishlist section|
	|WishlistItems_lnk|
	And verify the created list
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4233 @ZYP_MYACCOUNT_K4233-10492 @CR-MS
Scenario: Verify that Authenticated User is able to delete a Wish List 
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
	
	
@R2_Web @R2_Regression @R2_All @P-Highest @C-MyAccount @KER-4233 @ZYP_MYACCOUNT_K4233-11099 @CR-MS
Scenario: Verify that Authenticated User is able to view the Wish List page 
    Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "emailWithOutPhonenumber" 
	And user enter the valid password "Password" 
	And user click on signin button
	And user click on MyAccount
	Then user click on WishList
	Then Verify below Sub/Main Module of My Account
    |#Verify following elements in wishlist|
	|WishlistPage_CreateANewWishlist_btn|
	Then Verify that Create Your First Wish List button	

@R2_Web @R2_Regression @R2_All @P-Highest @C-MyAccount @KER-4233 @ZYP_MYACCOUNT_K4233-11113 @CR-MS
Scenario: Verify that Authenticated user can create first wish list
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
	|WishlistItems_lnk|
	And user clicks on Create List
	Then user enters Wishlist name "WishlistName" 
	And user clicks on create
	Then Verify below Sub/Main Module of My Account
	|#Verify following element in wishlist section|
	|WishlistItems_lnk|
	And verify the created list
	
@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4233 @ZYP_MYACCOUNT_K4233-10488 @CR-MS
Scenario: Verify that Authenticated User is able to rename a Wish List 
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
	|WishlistItems_lnk|
	And user clicks on WishListItems
	Then Verify below Sub/Main Module of My Account
	|#Verify following element in wishlist section|
	|Rename_list_lnk|
	Then user clicks on Rename List
	Then user enters Wishlist name "WishlistName"
	And user clicks on create	
	
@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4233 @ZYP_MYACCOUNT_K4233-10505 @CR-MS	
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
	Then Verify below Sub/Main Module of My Account
	|#Verify following element in wishlist section|
	|browse_products_btn|
	Then clicks on browse products
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	