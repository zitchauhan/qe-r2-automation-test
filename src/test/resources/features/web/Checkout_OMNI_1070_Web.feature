Feature: OMNI-1062, OMNI-167 & OMNI-1070 

@OMNI-1070 
Scenario: Verify Free Shipping and BOPIS Messaging in the Header
	Given user launches the browser and navigates to "ASO_HOME" page
	Then verify Free Shipping and BOPIS Messaging is displayed in the Header
	When user clicks on "first" half of promotion message
	And user lands on free shipping promotional disclaimer page
	When user clicks on "second" half of promotion message
	And user lands on pick up for messaging page
	And when user clicks on select a store link on promtion message
	And Find Store Modal should pop-up





