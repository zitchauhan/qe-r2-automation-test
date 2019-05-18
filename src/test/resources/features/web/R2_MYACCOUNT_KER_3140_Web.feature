Feature: Display Favorite Store Header- Authenticated User


@R2_Web @R2_Regression @R2_All @1HR_R2 @P1 @C-MyAccount @KER-3140 @ZYP_MyAccount_K3140-8696 @CR-SK @1HR_R2
Scenario: Verify the user is able to see their favorite store in ASO site home page
	Given user launches the browser and navigates to "ASO_HOME" page
	And user clicks on SignIn link from global header
	And user logs in as "EmailAddress"
	And user selects store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore"
	And user sign out from the website
	When user clicks on SignIn link from global header
	And user logs in as "EmailAddress"
	Then Authenticated user should see the Favorite store "FindStoreZipcodeNearestStore" details in home page
	