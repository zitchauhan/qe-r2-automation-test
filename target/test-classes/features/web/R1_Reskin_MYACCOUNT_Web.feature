Feature: [UI] - Verify R fueskin page nctionality for Desktop

@Web @All @C-Reskin @Sanity @CR-RK @KER-3821 
Scenario Outline: Desktop- Verify navigation to wishlist page after login 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user to click on sing in and navigate to sign in page 
	Then user to fill username "<username>" and password "<password>" 
	And click sign in 
	Then verify wishlist Link on my account dropdown and click 
	Then verify wishList header 
	
	Examples: 
		| username       | password |
		| ravijais5@gmail.com | Password1   |  
      
      
@Web @All @C-Reskin @Sanity @CR-RK @KER-3821 
Scenario Outline: Desktop- Verify wishlist header 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user to click on sing in and navigate to sign in page 
	Then user to fill username "<username>" and password "<password>" 
	And click sign in 
	And click wish list Link 
	Then verify wishList header 
	
	Examples: 
		| username       | password |
		| ravijais5@gmail.com | Password1   | 
      
@Web @All @C-Reskin @Sanity @CR-RK @KER-3821 
Scenario Outline: Desktop- Verify creation of wish list 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user to click on sing in and navigate to sign in page 
	Then user to fill username "<username>" and password "<password>" 
	And click sign in 
	And click wish list Link 
	And click wishList button 
	Then create a wishList and verify 

    Examples: 
      | username       | password |
      | ravijais5@gmail.com | Password1   |  
      
@Web @All @C-Reskin @Sanity @CR-RK @KER-3821 
Scenario Outline: Desktop- Verify deletion of wish list 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user to click on sing in and navigate to sign in page 
	Then user to fill username "<username>" and password "<password>" 
	And click sign in 
	And click wish list Link 
	Then delete the wishList and verify 
	Examples: 
		| username       | password |
		| ravijais5@gmail.com | Password1   |  
      
  #Forgot Password functionality     
@Web @All @C-Reskin @Sanity @CR-RK @KER-3821 
Scenario Outline: Desktop- Verify Forgot your password with valid email 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user to click on sing in and navigate to sign in page 
	Then click on Forgot your password link 
	And  user to fill valid email "<email>" 
	And click on submit 
	Then verify success message "YOUR PASSWORD HAS BEEN RESET" 
	Examples: 
		| email       |
		| qaz2@gmail.com |
      
@Web @All @C-Reskin @Sanity @CR-RK @KER-3821 
Scenario Outline: Desktop- Verify Forgot your password with blank email 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user to click on sing in and navigate to sign in page 
	Then click on Forgot your password link 
	And  user to fill invalid email "<email>" 
	And click on submit 
	Then verify error message "Please enter your email address." 
	Examples: 
		| email|
		| |
	      
 #Personal Information
 
  @Web @All @C-Reskin @Sanity @CR-RK @KER-3821
Scenario Outline: Desktop- Verify updation of Personal Information
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user to click on sing in and navigate to sign in page 
	Then user to fill username "<username>" and password "<password>" 
	And click sign in 
	And click Personal Information Link 
	Then update the Personal Information form and verify updation message "Your personal information has been successfully updated." 
	Examples: 
		| username       | password |
		| ravijais5@gmail.com | Password1   | 
 
