Feature: To Verify Product Wish List - Signed In User Flow (PDP) 

@Mobile @All @C-HP @Regression @KER-1915 @ZYP_HP_K1915-3445 @CR-AKK 
Scenario Outline: To verfiy Create new wish list for signed in customer 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	When user to click on sing in and navigate to sign in page 
	Then user to fill username "<username>" and password "<password>" 
	And click sign in 
	Then User navigate to wishlist from burger menu 
	And user create new Wishlist "<wishlist>" 
	
	Examples: 
	
		|username       |password| wishlist |
		|qaz2@gmail.com |qazlee  | Nikee	|
		
		
@Mobile @All @C-HP @Regression @KER-1915 @ZYP_HP_K1915-3453 @CR-AKK 
Scenario Outline: To verify signed user is able to add product to the existing wish list 
Given user launches the browser and navigates to "ASO_HOME" page 
Then User clicks on the burger menu 
When user to click on sing in and navigate to sign in page 
Then user to fill username "<username>" and password "<password>" 
And click sign in 
Then User navigate to wishlist from burger menu 
And user create exsiting Wishlist "<wishlist>" 
Then verify error message 
			
	Examples: 
			
	|username       |password| wishlist |
	|qaz2@gmail.com |qazlee  | Test		|
						
@Mobile @All @C-PDP @Regression @KER-1915 @ZYP_HP_K1915-3454 @CR-AKK 
Scenario Outline: To verify no Wish list for gift cards and bundles 
Given user launches the browser and navigates to "ASO_HOME" page 
Then User clicks on the burger menu 
When user to click on sing in and navigate to sign in page 
Then user to fill username "<username>" and password "<password>" 
And click sign in 
Then User clicks on the burger menu 
Then User navigates to L3 
And User clicks on required product in L3 Page 
Then user should able to click on wishlist button 
					
  Examples: 
					
		|username       |password|
		|qaz2@gmail.com |qazlee  |