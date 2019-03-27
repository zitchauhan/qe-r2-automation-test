Feature: To Verify the functionality of "Mini Cart" in the Global Header


@Web @KER-725 @ZYP_HP_K725-2808 @Regression @C-HP @1HR 
Scenario: Sign in Guest User, Ability for customer to see number of items in minicart 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the minicart icon and navigated to minicart 
	Then User should be dispalyed with message Your Shopping Cart is Empty 
	
	
@Web @KER-725 @ZYP_HP_K725-6415 @Regression @C-HP 
Scenario: Guest user ,Ability for system to navigate to shopping cart when customer clicks on a minicart with items 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates to L3 from home page 
	And User clicks on required product in L3 Page 
	Then user click on Add to cart button 
	And user click on view cart 
	And User clicks on the minicart icon and navigated to minicart 
	Then user click on checkout button 
	
@Web @KER-725 @ZYP_HP_K725-1974 @Regression @C-HP 
Scenario: Sign In user, Ability for system to display No items in cart page with link to continue shopping when customer clicks on an empty minicart
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then user should able to click on Signin button
    And user should be able to enter the signin details "Login_username" "Login_pwd"
    And User clicks on the minicart icon and navigated to minicart 
	Then User should be dispalyed with message Your Shopping Cart is Empty 
	
   
