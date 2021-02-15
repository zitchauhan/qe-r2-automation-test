Feature: To add balance to exhausted GC

@AddGCBalance
Scenario Outline: Add balance to GC using First Data
	Given user launches the browser and navigates to "FD_HOME" page
	And user clicks on logs in with valid user
	And user clicks on Account tab
	Then user clicks on Account text box and enters "<GC>" number
	Then user clicks on default merchant checbox and clicks submit
	Then verify whether the lock icon is visible and unlock all 
	Examples:
	|GC|
	|GC_One|
	|GC_Two|
	|GC_Three|
	|GC_Four|
