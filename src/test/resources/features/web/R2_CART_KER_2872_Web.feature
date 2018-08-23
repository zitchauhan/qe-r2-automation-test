Feature: Verify BOPIS PDP Store Selection

@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-2872 @ZYP_CHECKOUT_K2872-8706 @CR-DPK
Scenario: Verify that user is able to open the Find Store modal from the header
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store
	And user very Find a Store popup


@R2_Web @R2_Regression @R2_All @P-Highest @C-Cart @KER-2872 @ZYP_CHECKOUT_K2872-8710 @CR-DPK
Scenario: Verify that the user should be able to search the store details by entering ZIP code
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store
	Then user enter "zipCode" in Find a Store Model
	And user click on submit button
	Then user verify the results based on entering zipcode
	
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-2872 @ZYP_CHECKOUT_K2872-8717 @CR-DPK
Scenario: Verify the components user see on the 'Find a Store' modal with search input location
	Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on Find a Store
	Then user enter "zipCode" in Find a Store Model
	And user click on submit button
	Then verify the components in Find a Store Model



@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-2872 @ZYP_CHECKOUT_K2872-8718 @CR-DPK
Scenario: Verify that user is able to see the 'View Next 5 stores' button, if stores are available
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store
	Then user enter "zipCode" in Find a Store Model
	And user click on submit button
	Then user verify the results based on entering zipcode
	And user should be able to see the View Next five Stores button	


@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-2872 @ZYP_CHECKOUT_K2872-8725 @CR-DPK
Scenario: Verify that user is able to see the 'View Next 5 stores' button, if stores are available
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store
	Then user enter "zipCode" in Find a Store Model
	And user click on submit button
	Then user click on plus icon in Store Address drawer
	And user click on Make My store button	
	And user very Find a Store popup is closed
	When user clicks on Find a Store
	Then user verify the results based on entering zipcode


@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-2872 @ZYP_CHECKOUT_K2872-10652 @CR-DPK
Scenario: Verify if the user can search the store details by entering City & state
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store
	Then user enter "City-State" in Find a Store Model
	And user click on submit button
	Then user verify the results based on entering zipcode
	And user should be able to see the View Next five Stores button	
	And user click on View Next five Stores button
	And user verify the all the results 	


	
@R2_Web @R2_Regression @R2_All @P-Highest @C-Cart @KER-2872 @ZYP_CHECKOUT_K2872-10661 @CR-DPK
Scenario: Verify if the user can search the store details by entering City & state
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store
	Then user enter "City-State" in Find a Store Model
	And user click on submit button
	Then user verify the results based on entering zipcode


@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-2872 @ZYP_CHECKOUT_K2872-10665 @CR-DPK
Scenario: Verify the user is able to see the store address of any of the listed store in 'Find a Store' modal with search input location through Store accordion
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store
	Then user enter "zipCode" in Find a Store Model
	And user click on submit button
	Then user click on plus icon in Store Address drawer
	And user should be able to see the store Details including its address, phone number, Driving Directions link, Store Open days/hours
	And user click on minus icon in Store Address drawer
	
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-2872 @ZYP_CHECKOUT_K2872-10681 @CR-DPK
Scenario: Verify the user is able to see the store address of any of the listed store in 'Find a Store' modal with search input location through Store accordion
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store
	Then user enter "zipCode" in Find a Store Model
	And user click on submit button
	Then user click on plus icon in Store Address drawer
	And user should click on Driving Direction
	Then user should be redirected to the Google Maps in new tab/window	
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-2872 @ZYP_CHECKOUT_K2872-10715 @CR-DPK
Scenario: Verify the "Make My Store" CTA behavior for manually searched and input location
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store
	Then user enter "zipCode" in Find a Store Model
	And user click on submit button
	Then user click on all plus icon in Store Address drawer
	And user verify Make My store button	
	
@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-2872 @ZYP_CHECKOUT_K2872-10724 @CR-DPK
Scenario: Verify user is displayed with an error message when there is no store within 250 miles (or configured value)
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store
	Then user enter "WrongzipCode" in Find a Store Model
	And user click on submit button
	Then verify Static error message
	
	
	
	
	
	
	
	
