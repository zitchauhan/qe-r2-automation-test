Feature: To verify Ammo disclaimer on PDP page
 
 @Web @PDPFaceLift @CR-Anirudh 
Scenario: Verify ammo disclaimer is present and I agree button is clickable
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user enters "ammoSKU" in the searchbox
	And user sets up cookie
	Then user navigates to new pdp page url "ammoSKU"
	And user verify the ammo disclaimer on new PDP
	And user verify I agree Button is present
	Then user clicks on I Agree
	And user verify I agree Button disappear
	
	
	@Web @PDPFaceLift @CR-Anirudh 
	Scenario: Verify disclaimer is present and I agree button is clickable for Firearm item
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user enters "Firearm_Item" in the searchbox
	And user sets up cookie
	Then user navigates to new pdp page url "Firearm_Item"
	And user verify the ammo disclaimer on new PDP
	And user verify I agree Button is present
	And user verifies disclaimer along with restocking msg
	Then user clicks on I Agree
	And user verify I agree Button disappear
