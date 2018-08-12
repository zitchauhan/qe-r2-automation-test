Feature: [UI] [Desktop ]To verify user can view 'My Account' from a drop down account summary upon successful log in 

 
 @C-HP @Web    @Regression   @KER-727  @1HR @ZYP_HP_K727-3206           
Scenario Outline: user to verify Account summary after successful login from ASO_HOME page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user to click on sing in and navigate to sign in page 
	Then user to fill username "<username>" and password "<password>"
   And click sign in  
   Then verify user to navigate to account summary page
	     
	Examples: 
	
		|username       |password|
		|qaz2@gmail.com |qazlee  |
				    
 
@C-HP @Web  @Regression @KER-727  @ZYP_HP_K727-4055
Scenario Outline: user to verify sing in  as invalid email address
   Given user launches the browser and navigates to "ASO_HOME" page
   When user to click on sing in and navigate to sign in page
   Then user to fill username "<username>" and password "<password>"
   And click sign in
   Then verify the validation message as incorrect  
  Examples: 
		   
		    |username          |password| 
		    |qaz1000@gmail.com |qazlee|
  	
  	
  @C-HP @Web  @Regression @KER-727  @ZYP_HP_K727-4061
Scenario Outline: user to verify sing in  as invalid password address
   Given user launches the browser and navigates to "ASO_HOME" page
   When user to click on sing in and navigate to sign in page
   Then user to fill username "<username>" and password "<password>"
   And click sign in
   Then verify the validation message as incorrect  
  Examples: 
		   
		    |username          |password| 
		    |qaz2@gmail.com |qazlee111|
  			  
  		  
  @C-HP @Web  @Regression @KER-727  @ZYP_HP_K727-4063 @1HR
  Scenario: user to very sign in by keeping username and password empty and clicking on signin 
  Given user launches the browser and navigates to "ASO_HOME" page 
  When user to click on sing in and navigate to sign in page  		  
  And click sign in
  Then verify enter email and password message to come 		    
  
  
 @C-HP @Web  @Regression  @KER-727  @ZYP_HP_K727-4067 
 Scenario Outline: user to verify personal information  form My Account
    
  Given user launches the browser and navigates to "ASO_HOME" page 
  When user to click on sing in and navigate to sign in page  		  
  Then user to fill username "<username>" and password "<password>"
  And click sign in   
   Then verify personal information form My Account
  Examples: 
		   
		    |username          |password|
		    |qaz2@gmail.com    |qazlee| 
	    
@C-HP @Web  @Regression  @KER-727 @ZYP_HP_K727-4069 
 Scenario Outline: user to verify Address book  form My Account
    
  Given user launches the browser and navigates to "ASO_HOME" page 
  When user to click on sing in and navigate to sign in page  		  
  Then user to fill username "<username>" and password "<password>"
  And click sign in 
  Then verify Address book form My Account
  
  Examples: 
		   
		    |username          |password|
		    |qaz2@gmail.com    |qazlee|
  	    
  	    
  	    
  	 @C-HP @Web  @Regression  @KER-727 @ZYP_HP_K727-4070 
 Scenario Outline: user to verify WishList form My Account
    
  Given user launches the browser and navigates to "ASO_HOME" page 
  When user to click on sing in and navigate to sign in page  		  
  Then user to fill username "<username>" and password "<password>"
   And click sign in 
  Then verify , WishList form My Account
  Examples: 
		   
		    |username          |password|
		    |qaz2@gmail.com    |qazlee|
  	   
  	   
  	   
 	 @C-HP @Web  @Regression @KER-727 @ZYP_HP_K727-4065  
  	Scenario: Desktop-Verify the forgot your password functionality
     Given user launches the browser and navigates to "ASO_HOME" page
     When user to click on sing in and navigate to sign in page  		  
    When user to be able to click forget password
    When user to enter email
    Then verify user to click submit button  
  	 

 @C-HP @Web  @Regression @KER-727 @ZYP_HP_K727-4072  
  	Scenario Outline: Desktop-To Verify the signout from MyAccount
     Given user launches the browser and navigates to "ASO_HOME" page
     When user to click on sing in and navigate to sign in page  		  
     Then user to fill username "<username>" and password "<password>"
     And click sign in 
     Then click on singout
     

  Examples: 
		   
		    |username          |password|
		    |qaz2@gmail.com    |qazlee|
  	  
  	  @C-HP @Web  @Regression @KER-727 @ZYP_HP_K727-1972   
  	Scenario Outline: To Verify user is able to Sign In with Valid user name and password by clicking in Sign In Link in the global header
     Given user launches the browser and navigates to "ASO_HOME" page
     When user to click on sing in and navigate to sign in page  		  
     Then user to fill username "<username>" and password "<password>"
     And click sign in 
     
     

     

  Examples: 
		   
		    |username          |password|
		    |qaz2@gmail.com    |qazlee|
		    
	
	@C-HP @Web  @Regression @KER-727 @ZYP_HP_K727-8492 @CR-AKK
  	Scenario Outline: To Verify user to verify Account summary after successful login from ASO_HOME page
     Given user launches the browser and navigates to "ASO_HOME" page
     When user to click on sing in and navigate to sign in page  		  
     Then user to fill username "<username>" and password "<password>"
     And click sign in 
    Then User clicks on ASO logo
    Then User should be navigated to Home_Page
     

     

  Examples: 
		   
		    |username          |password|
		    |qaz2@gmail.com    |qazlee|
  	  

