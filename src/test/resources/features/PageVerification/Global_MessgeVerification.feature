Feature: Message/Text Verification


	Scenario: Gloabl Message/Text Verification
    Given user launches the browser and navigates to "ASO_HOME" page
    Then Verify the message on the page
    |# Following Error Message should show on the page|
    |All Rights Reserved|
    |All Rights Reserved|
    |Please enter the Email Address in a valid format (ex. abc@xyz.com)|
    |Not a valid name|
    |CONGRATULATIONS|
    |You have successfully registered with Academy.com|
    |LET'S SHOP|
    
		
	