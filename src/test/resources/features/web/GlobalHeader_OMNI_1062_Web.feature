Feature: Free shipping and Bopis messaging banner in header

@OMNI-1062 @C-Order @Regression @CR-NS @C-GlobalHeader
Scenario: Verify Free Shipping and BOPIS Messaging in the Header
	Given user launches the browser and navigates to "ASO_HOME" page
	Then verify Free Shipping and BOPIS Messaging is displayed in the Header
	When user clicks on "first" half of promotion message
	And user lands on free shipping promotional disclaimer page
	When user clicks on "second" half of promotion message
	And user lands on pick up for messaging page
	And when user clicks on select a store link on promtion message
	And Find Store Modal should pop-up





