Feature: Registration 


Background:  Common Pre-requisite steps 
	Given user launches the browser and navigates to "ASO_HOME" page plcc
	When user click on My Account link
	
@PerfAccounts
Scenario:  Create Multiple Users
	Then user expect two thousand registrations to be done by entering "FN"  "LN"  "Email" "Pwd" "Address" "zip" "Phone"
	
	