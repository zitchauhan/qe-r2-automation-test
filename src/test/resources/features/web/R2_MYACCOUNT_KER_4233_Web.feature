Feature: E02-100 - My Account, Wish List

@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4233 @ZYP_MYACCOUNT_K4233-10484 @CR-Ms
Scenario: Verify that Authenticated user can create first wish list
    Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "emailWithOutPhonenumber" 
	And user enter the valid password "Password" 
	And user click on signin button
	And user click on MyAccount
	Then user click on WishList
	Then Verify below Sub/Main Module of My Account
	|btnCreateNewWishlist|
	Then Verify that Create Your First Wish List button
	

@R2_Web @R2_Regression @R2_All @P-Highest @C-MyAccount @KER-4233 @ZYP_MYACCOUNT_K4233-10504 @CR-Ms
Scenario: Verify that Authenticated user can create first wish list
    Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	And user click on MyAccount	
	Then user click on WishList
	Then Verify below Sub/Main Module of My Account
	|btnCreateNewWishlist|
	And user clicks on Create a New Wish List	
	Then user enters Wishlist name "WishlistName" 
	Then Verify below Sub/Main Module of My Account
	|btnCreateWishList|
	And user click on create list
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4233 @ZYP_MYACCOUNT_K4233-10492 @CR-Ms
Scenario: Verify that Authenticated user can create first wish list
    Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	And user click on MyAccount
	Then user click on WishList
	Then Verify below Sub/Main Module of My Account
	|WishlistItems_lnk|
	And user clicks on WishListItems
	Then Verify below Sub/Main Module of My Account
	|DeleteList_btn|	
	Then user clicks on Delete list
	Then Verify below Sub/Main Module of My Account
	|DeleteWishList_btn|	
	And user clicks on Delete WishList
	Then Verify that Create Your First Wish List button
	Then Verify below Sub/Main Module of My Account
	|btnCreateNewWishlist|