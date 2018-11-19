Feature: To Verify Product Wish List - Signed In User Flow (PDP)

    @Web @All @C-HP @Regression @KER-1915 @ZYP_HP_K1915-3445 @CR-AKK
  Scenario: To verfiy Create new wish list for signed in customer
   Given user launches the browser and navigates to "ASO_HOME" page
   When user to click on sing in and navigate to sign in page 
   And user should be able to enter the signin details "Login_username" "Login_pwd"
   Then User navigate to wishlist from header
   And user create new Wishlist
   

@Web @All @C-PDP @Regression @KER-1915 @ZYP_HP_K1915-3454 @CR-AKK
  Scenario: To verify no Wish list for gift cards and bundles
   Given user launches the browser and navigates to "ASO_HOME" page
   When user to click on sing in and navigate to sign in page 
   And user should be able to enter the signin details "Login_username" "Login_pwd"
   When user enters "SKUForGiftCard" in the searchbox
   Then user should not be able to see Add WishList link

		
@Web @All @C-PDP @Regression @KER-1915 @ZYP_HP_K1915-3453 @CR-AKK
  Scenario: To verify no Wish list for gift cards and bundles
   Given user launches the browser and navigates to "ASO_HOME" page
   When user to click on sing in and navigate to sign in page 
   And user should be able to enter the signin details "Login_username" "Login_pwd"
   Then User navigates till PLP
    And User click on the product image
   Then user click on Add WishList link
