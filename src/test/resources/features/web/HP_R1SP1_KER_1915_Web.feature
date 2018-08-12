Feature: To Verify Product Wish List - Signed In User Flow (PDP)

  @Web @All @C-HP @Regression @KER-1915 @ZYP_HP_K1915-3445 @CR-AKK
  Scenario Outline: To verfiy Create new wish list for signed in customer
   Given user launches the browser and navigates to "ASO_HOME" page
   When user to click on sing in and navigate to sign in page 
   Then user to fill username "<username>" and password "<password>"
   And click sign in
   Then user click on WishList link
   And user create new Wishlist "<wishlist>"
     
Examples: 
	
		|username       |password| wishlist |
		|qaz2@gmail.com |qazlee  | Nike	|
   

   @Web @All @C-HP @Regression @KER-1915 @ZYP_HP_K1915-3453 @CR-AKK
  Scenario Outline: To verify signed user is able to add product to the existing wish list
   Given user launches the browser and navigates to "ASO_HOME" page
   When user to click on sing in and navigate to sign in page 
   Then user to fill username "<username>" and password "<password>"
   And click sign in
   Then user click on WishList link
   And user create exsiting Wishlist "<wishlist>"
   Then verify error message
     
Examples:  
	
		|username       |password| wishlist |
		|qaz2@gmail.com |qazlee  | Test		|
		
@Web @All @C-PDP @Regression @KER-1915 @ZYP_HP_K1915-3454 @CR-AKK
  Scenario Outline: To verify no Wish list for gift cards and bundles
   Given user launches the browser and navigates to "ASO_HOME" page
   When user to click on sing in and navigate to sign in page 
   Then user to fill username "<username>" and password "<password>"
   And click sign in
   Then User navigates till PLP
    And User click on the product image
   Then user click on Add WishList link
       
Examples:  
	
		|username       |password|
		|qaz2@gmail.com |qazlee  |