Feature: [UI] [Desktop ]To verify user can view 'My Account' from a drop down account summary upon successful log in 

 
 @C-HP @Web    @Regression   @KER-727  @1HR @ZYP_HP_K727-3206           
Scenario: user to verify Account summary after successful login from ASO_HOME page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user to click on sing in and navigate to sign in page 
	And user should be able to enter the signin details "Login_username" "Login_pwd"  
   Then verify user to navigate to account summary page
    
 
@C-HP @Web  @Regression @KER-727  @ZYP_HP_K727-4055
Scenario: user to verify sing in  as invalid email address
   Given user launches the browser and navigates to "ASO_HOME" page
   When user to click on sing in and navigate to sign in page
   And user should be able to enter the signin details "Wrong_username" "Login_pwd"
  	
  @C-HP @Web  @Regression @KER-727  @ZYP_HP_K727-4061
Scenario: user to verify sing in  as invalid password address
   Given user launches the browser and navigates to "ASO_HOME" page
   When user to click on sing in and navigate to sign in page
   And user should be able to enter the signin details "Login_username" "Wrong_password"
   Then verify the validation message as incorrect  
  			  
  		  
  @C-HP @Web  @Regression @KER-727  @ZYP_HP_K727-4063 @1HR
  Scenario: user to very sign in by keeping username and password empty and clicking on signin 
  Given user launches the browser and navigates to "ASO_HOME" page 
  When user to click on sing in and navigate to sign in page  		  
  And click sign in
  Then verify enter email and password message to come 		    
  
  
 @C-HP @Web  @Regression  @KER-727  @ZYP_HP_K727-4067 
 Scenario: user to verify personal information  form My Account
    
  Given user launches the browser and navigates to "ASO_HOME" page 
  When user to click on sing in and navigate to sign in page  		  
  And user should be able to enter the signin details "Login_username" "Login_pwd"
   Then verify personal information form My Account

@C-HP @Web  @Regression  @KER-727 @ZYP_HP_K727-4069 
 Scenario: user to verify Address book  form My Account
  	Given user launches the browser and navigates to "ASO_HOME" page
	When user click on My Account link 
	And  user click on Sign Up link 
	Then user expect element First Name to be present 	
	And user enter First Name "First_Name" 
	And user expect element Last Name to be present 
	And user enter Last Name "Last_Name" 
	And user expect element Email Address to be present 
	And user enter Email Address "Email_Address" 
	And user expect element Create Password to be present 
	And user enter Password "Create_Password" 
	And user expect element Add Address for Faster Checkout checkbox to be present 
	When user select Add Address for Faster Checkout checkbox 
	Then user expect element Address to be present 
	And user enter Address plcc "Address"
	And user expect element Zip Code to be present 
	And user enter Zip Code "Zip_Code" 
	And user expect element City to be present 
	And user expect element State to be present 
	And user expect element Phone number to be present 
	And user enters Phone Number "Phone_Number" 
	And user expect element SIGN UP to be present 
	And user click on SIGN UP
  	When user expect element User Select Address to be present 
	  	    
  	 @C-HP @Web  @Regression  @KER-727 @ZYP_HP_K727-4070 
	 Scenario: user to verify WishList form My Account
	  Given user launches the browser and navigates to "ASO_HOME" page 
	  When user to click on sing in and navigate to sign in page  		  
	  And user should be able to enter the signin details "Login_username" "Login_pwd"
	  Then verify , WishList form My Account

 	 @C-HP @Web  @Regression @KER-727 @ZYP_HP_K727-4065  
  	Scenario: Desktop-Verify the forgot your password functionality
     Given user launches the browser and navigates to "ASO_HOME" page
     When user to click on sing in and navigate to sign in page  		  
    When user to be able to click forget password
    When user to enter email
    Then verify user to click submit button  
  	 

 @C-HP @Web  @Regression @KER-727 @ZYP_HP_K727-4072  
  	Scenario: Desktop-To Verify the signout from MyAccount
     Given user launches the browser and navigates to "ASO_HOME" page
     When user to click on sing in and navigate to sign in page  		  
     And user should be able to enter the signin details "Login_username" "Login_pwd"
     Then click on singout

  	  
  	  @C-HP @Web  @Regression @KER-727 @ZYP_HP_K727-1972   
  	Scenario: To Verify user is able to Sign In with Valid user name and password by clicking in Sign In Link in the global header
     Given user launches the browser and navigates to "ASO_HOME" page
     When user to click on sing in and navigate to sign in page  		  
  	And user should be able to enter the signin details "Login_username" "Login_pwd"
 
	
	@C-HP @Web  @Regression @KER-727 @ZYP_HP_K727-8492 @CR-AKK
  	Scenario: To Verify user to verify Account summary after successful login from ASO_HOME page
     Given user launches the browser and navigates to "ASO_HOME" page
     When user to click on sing in and navigate to sign in page  		  
     And user should be able to enter the signin details "Login_username" "Login_pwd"
    Then User clicks on ASO logo
    Then User should be navigated to Home_Page

