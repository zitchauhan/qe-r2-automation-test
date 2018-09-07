Feature: [UI] [Mobile]To verify user can view 'My Account' from a drop down account summary upon successful log in 


 @C-HP @Mobile @Regression  @KER-727 @ZYP_HP_K727-7419 @1HR
  Scenario: To Verify the signout from MyAccount
	Given user launches the browser and navigates to "ASO_HOME" page 
#	 Then User clicks on the burger menu
#	 When user to click on sing in and navigate to sign in page
	Then User clicks on the burger menu
    Then user should able to click on Signin button
	And user should be able to enter the signin details "Login_username" "Login_pwd"
	 Then User clicks on the burger menu
	 Then user sign out from the website

	 
	 
	 @C-HP @Mobile @Regression  @KER-727   @ZYP_HP_K727-7420
	 Scenario: To verify user can view 'My Account' from a drop down account summary upon successful log in
	 
	 Given user launches the browser and navigates to "ASO_HOME" page 
#	 Then User clicks on the burger menu
#	 When user to click on sing in and navigate to sign in page
     Then User clicks on the burger menu
    Then user should able to click on Signin button
	And user should be able to enter the signin details "Login_username" "Login_pwd"
	Then verify user to navigate to account summary page
	




 @C-HP @Mobile @Regression  @KER-727   @ZYP_HP_K727-7421
Scenario Outline: To Verify the Sign-in functionality for invalid email address
 Given user launches the browser and navigates to "ASO_HOME" page 
#	 Then User clicks on the burger menu
#	 When user to click on sing in and navigate to sign in page
	Then User clicks on the burger menu
    Then user should able to click on Signin button
	Then user to fill username "<username>" and password "<password>"
	And click sign in
	Then verify the validation message as incorrect
	Examples: 
	
		|username         |password   |
		|qaz222@gmail.com |pass1234  |
	
 @C-HP @Mobile @Regression  @KER-727   @ZYP_HP_K727-7422
Scenario Outline:To Verify the Sign-in functionality for invalid  password
 Given user launches the browser and navigates to "ASO_HOME" page 
#	 Then User clicks on the burger menu
#	 When user to click on sing in and navigate to sign in page
	Then User clicks on the burger menu
    Then user should able to click on Signin button
	Then user to fill username "<username>" and password "<password>"
	And click sign in
	Then verify the validation message as incorrect
	Examples: 
	
		|username         |password   |
		|mondayacademy@mailinator.com |qazlee1000  |


  @C-HP  @Mobile  @Regression  @KER-727   @ZYP_HP_K727-7423
 Scenario: Verify the Signin functionality for empty email address and empty password
 Given user launches the browser and navigates to "ASO_HOME" page 
#  Then User clicks on the burger menu
#  When user to click on sing in and navigate to sign in page  		  
  Then User clicks on the burger menu
    Then user should able to click on Signin button
  And click sign in
  Then verify enter email and password message to come 	
 


  @C-HP  @Mobile  @Regression  @KER-727   @ZYP_HP_K727-8434
   Scenario: Verify the forgot your password functionality
   Given user launches the browser and navigates to "ASO_HOME" page 
#   Then User clicks on the burger menu
#    When user to click on sing in and navigate to sign in page
   Then User clicks on the burger menu
    Then user should able to click on Signin button
    When user to be able to click forget password
    When user to enter email
    Then verify user to click submit button 
    
    
     @C-HP  @Mobile  @Regression  @KER-727   @ZYP_HP_K727-8554
    Scenario:  To Verify user is able to Sign In with Valid user name and password by clicking in Sign In Link 
    Given user launches the browser and navigates to "ASO_HOME" page 
#    Then User clicks on the burger menu
#    When user to click on sing in and navigate to sign in page
    Then User clicks on the burger menu
    Then user should able to click on Signin button
    And user should be able to enter the signin details "Login_username" "Login_pwd"
  	 Then verify user to navigate to account summary page


 @C-HP  @Mobile  @Regression  @KER-727   @ZYP_HP_K727-8557 @1HR
    Scenario:  Verify the Personal Information details from MyAccount 
    Given user launches the browser and navigates to "ASO_HOME" page 
#    Then User clicks on the burger menu
#    When user to click on sing in and navigate to sign in page
   Then User clicks on the burger menu
    Then user should able to click on Signin button
   And user should be able to enter the signin details "Login_username" "Login_pwd"
	Then verify personal information form My Account
  


 @C-HP  @Mobile  @Regression  @KER-727   @ZYP_HP_K727-8558 
    Scenario:  Verify the Address Book details from MyAccount 
    Given user launches the browser and navigates to "ASO_HOME" page 
#    Then User clicks on the burger menu
#    When user to click on sing in and navigate to sign in page
    Then User clicks on the burger menu
    Then user should able to click on Signin button
    And user should be able to enter the signin details "Login_username" "Login_pwd"
	Then verify Address book form My Account
	  


 @C-HP  @Mobile  @Regression  @KER-727   @ZYP_HP_K727-8559 
    Scenario:  Verify the Wishlists details from MyAccount
    Given user launches the browser and navigates to "ASO_HOME" page 
#    Then User clicks on the burger menu
#    When user to click on sing in and navigate to sign in page
    Then User clicks on the burger menu
    Then user should able to click on Signin button
    And user should be able to enter the signin details "Login_username" "Login_pwd"
	Then verify , WishList form My Account
 
   @C-HP  @Mobile  @Regression  @KER-727   @ZYP_HP_K727-4081 @CR-AKK
    Scenario:  Verify the Personal Information details from MyAccount 
    Given user launches the browser and navigates to "ASO_HOME" page 
#    Then User clicks on the burger menu
#    When user to click on sing in and navigate to sign in page
    Then User clicks on the burger menu
    Then user should able to click on Signin button
    And user should be able to enter the signin details "Login_username" "Login_pwd"
	Then verify personal information form My Account

		
   @C-HP @Mobile @Regression @KER-727 @ZYP_HP_K727-6466 @CR-AG 
Scenario: To verify user can view 'My Account' from a drop down account summary upon successful log in 

	Given user launches the browser and navigates to "ASO_HOME" page 
	#	 Then User clicks on the burger menu
	#	 When user to click on sing in and navigate to sign in page
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user should be able to enter the signin details "Login_username" "Login_pwd" 
	Then verify user to navigate to account summary page 
	
	
