Feature: Cart Page

@C-PLCC @Regression @All @PLCC-89 @CR-VS 
Scenario: Verify the display of PLCC card image under We Accept section  
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on My Account link 
	And user expect element Email Address to be present 
	And user enter Email address in sign-in page "Email_Address_2" 
	And user enter password in sign-in page "Password_2" 
	And user click on Signin-button 
	Then user navigates to ASO-Home page 
	When user enters "SKUIdOfProduct" in the search box 
	And user click on search icon 
	When user click on Add to cart button 
	And user click on viewcart button
	Then user navigates to Cart Page
	Scenario: Verify the display of PLCC card image under We Accept section on cart image
	And user expect element We Accept Label to be present
	And user expect element plcc card image to be present in footer
	
	
		