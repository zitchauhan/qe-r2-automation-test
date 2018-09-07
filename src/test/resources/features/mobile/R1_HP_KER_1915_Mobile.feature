Feature: To Verify Product Wish List - Signed In User Flow (PDP)

  @Mobile @All @C-HP @Regression @KER-1915 @ZYP_HP_K1915-3445 @CR-AKK
  Scenario: To verfiy Create new wish list for signed in customer
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    When user to click on sing in and navigate to sign in page
    And user should be able to enter the signin details "Login_username" "Login_pwd"
    Then User navigate to wishlist from burger menu
    And user create new Wishlist

  @Mobile @All @C-HP @Regression @KER-1915 @ZYP_HP_K1915-3453_M @CR-AKK
  Scenario Outline: To verify signed user is able to add product to the existing wish list
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    When user to click on sing in and navigate to sign in page
    And user should be able to enter the signin details "Login_username" "Login_pwd"
    Then User navigate to wishlist from burger menu
    And user create exsiting Wishlist "<wishlist>"
    Then verify error message

    Examples: 
      | wishlist |
      | Test     |
#						
#@Mobile @All @C-PDP @Regression @KER-1915 @ZYP_HP_K1915-3454 @CR-AKK 
#Scenario Outline: To verify no Wish list for gift cards and bundles 
#Given user launches the browser and navigates to "ASO_HOME" page 
#Then User clicks on the burger menu 
#When user to click on sing in and navigate to sign in page 
#And user should be able to enter the signin details "Login_username" "Login_pwd" 
#And click sign in 
#Then User clicks on the burger menu 
#Then User navigates to L3 
#And User clicks on required product in L3 Page 
#Then user should able to click on wishlist button 
#					
#  Examples: 
#					
#		|username       |password|
#		|qaz2@gmail.com |qazlee  |
