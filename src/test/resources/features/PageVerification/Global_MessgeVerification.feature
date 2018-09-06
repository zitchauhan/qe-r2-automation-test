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
    |Please enter the First Name						|
    | Please Enter a Last Name|
	|Please enter a Password							|
 	|Please enter an Email address						|
	|The email address you entered already exists. Type a different email address and try again.|
 	|Please enter the Email Address in a valid format (ex. abc@xyz.com)	|
 	|*Minimum 8 characters								|	
 	|For maximum security, please enter a Password different from your Email Address|
    
		
	