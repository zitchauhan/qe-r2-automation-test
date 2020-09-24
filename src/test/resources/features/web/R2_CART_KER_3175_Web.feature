Feature: B06-225- BOPIS Pickup Filter

@R2_Web @R2_All @C-PLP @KER-3175 @ZYP_PLP_K3175-10956 @C-BOPIS 
Scenario: Verify that the User is able to view the Shipping & Pickup drawer on the PLP 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When user clicks on one of the category and navigates to LOne page 
	And user verify the shipping and pickup drawer 
	And user verify that the shipping drawer is collaspsed by default
	
	
@R2_Web @R2_All @C-PLP @KER-3175 @ZYP_PLP_K3175-10957 @C-BOPIS 
Scenario: Verify that the User is able to expand the Shipping & Pickup drawer on the PLP
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When user clicks on one of the category and navigates to LOne page 
	And user verify the shipping and pickup drawer 
	And user should be able to click on shipping and pickup drawer
	Then user verify that shipping and in store options are displayed
	And user should be able to select the shipping "shipping" filter
	And user should be able to deselect the shipping "shipping" filter
	And user should be able to select the store pickup "store pickup" filter
	And user should be able to deselect the store pickup "store pickup" filter
	
	
@R2_Web @R2_All @C-PLP @KER-3175 @ZYP_PLP_K3175-10960 @C-BOPIS @RegressionP2
Scenario: Verify that the User is able to filter the PLP list by "Shipping" items
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	Then user navigate to GunStorageAndSafty L_Three   
	And user verify the shipping and pickup drawer 
	And user should be able to click on shipping and pickup drawer
	And user should be able to select the shipping "Home Delivery" filter
	And user verify that only shipping item are displayed

@R2_Web @R2_All @C-PLP @KER-3175 @ZYP_PLP_K3175-10961 @C-BOPIS @RegressionP2
Scenario: Verify that the User is able to change store pickup location on PLP under In-Store Pickup checkbox
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	Then user navigate to GunStorageAndSafty L_Three 
	And user should be able to click on shipping and pickup drawer
	And user click on change pickup location
	And Find Store Modal should pop-up 
	And User select another store "BOPIS_Store1"
	And user verify the new selected location is displayed	
	
@R2_Web @R2_All @C-PLP @KER-3175 @ZYP_PLP_K3175-10962 @C-BOPIS 
Scenario: Verify that the User is able to filter the PLP list by both In-Store Pickup AND Shipping items
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	Then user navigate to GunStorageAndSafty L_Three   
	And user verify the shipping and pickup drawer 
	And user should be able to click on shipping and pickup drawer
	And user should be able to select the store pickup "store pickup" filter
	And user should be able to select the shipping "shipping" filter
	Then user check for shipping only product "shippingProduct"
	And user should be able to see shipping message "shippingPDPMessage"
	Then user navigates back and check for BOPIS eligible product
	And user should be able to see store pickup message "storePickUpMessagePDP"
	
	

@R2_Web @R2_All @C-PLP @KER-3175 @ZYP_PLP_K3175-10963 @C-BOPIS 
Scenario: Verify that the User is able to filter the PLP list by In-Store Pickup items
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user logs in as "Bopis_Email" 
	Then user navigate to GunStorageAndSafty L_Three   
	And user verify the shipping and pickup drawer 
	And user should be able to click on shipping and pickup drawer
	And user should be able to select the store pickup "store pickup" filter
	Then user verify that only store pickup item are displayed
	Then user clicks on the product card and navigates to PDP of the product
	And user should be able to see store pickup message "storePickUpMessagePDP"	
	
@R2_Web @R2_All @C-PLP @KER-3175 @ZYP_PLP_K3175-10965 @C-BOPIS 
Scenario: Verify that the User is informed by on screen message if no items are available at a selected BOPIS store
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user logs in as "Bopis_Email" 
	Then User navigates to Mens Clothing PLP
	And user verify the shipping and pickup drawer 
	And user should be able to click on shipping and pickup drawer
	And user should be able to select the store pickup "store pickup" filter
	Then user verify that no item is available	
	
	
	