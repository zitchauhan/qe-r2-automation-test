Feature: Registration 
Background:  Common Pre-requisite steps @PerfAccounts
	Given user launches the browser and navigates to "ASO_HOME" page
	When user click on My Account link
Scenario:  Create Multiple Users
	Then user expect two thousand registrations to be done by entering "FN"  "LN"  "Email" "Pwd" "Address"  "zip" "Phone"
	
	