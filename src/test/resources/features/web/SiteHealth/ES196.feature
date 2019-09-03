Feature: PayPal on Cart:The existing state restriction must continue to block orders from proceeding


 @ES196 @CR-NN
Scenario: verify state restriction for user to block orders from proceeding

    Given user launches the browser and navigates to "ASO" page 
	When User searches a product "productNameSite_Health" and navigates to PDP
	And user click on ship it button 
	And user will click on View Cart button 
    When user navigate to Cart page 
	Then user click on checkout button in Cart page
	When user enter First name "CA_FirstName" 
	And user enter Last name "CA_LastName" 
	And user enter Phone number "CA_PhoneNumber" 
	And user enter Address "CA_Address" 
	And user enter Zipcode "CA_Zipcode" 
	Then user click on Go To Shipping Method button in Checkout page
	Then verify state restriction message in checkout page