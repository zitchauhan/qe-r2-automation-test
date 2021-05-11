Feature: Back in Stock Get notified 

@ST-OMNI-23445  @TC-OMNI-37754
Scenario: user is able to add him self in oos notification list 
		Given User launches the application
		And User continues as "guest user" on onboarding page
		Then User sees the homepage
		When User Sees the Search Box
    Then User clicks on the Search Box
		And i choose to enter "BOPISOOSSKU" In Search box
		And i choose to click on "Searcheditem" on Search page 
		
		#And I choose to navigate to PDP
		#And user click on Product
		Then User scrolls down to the bottom in "1" swipe
		#Then i Choose to validate that "Store Delivery Heading" Shown on PDP under Store Section
		Then i Choose to validate that "PICKUPanddeliveryheading" Shown on PDP under Store Section
		#Then User taps on Find Store link
		And user click on "SelectStorebutton" on PDP
		#And user click on "ChangeStorebutton" on PDP
		And i choose to enter "OOSStore" In Search box
		#Then User selects the store 3
		Then User scrolls down to the bottom in "1" swipe
		And user click on "getnotifiedBOPIS" on PDP
		And user see "getnotifiedheading" on getnotify page 
		#And user see "lbl_register_sub_title" on getnotify page 
		#And user see "emailtextbox" on getnotify page 
		Then i choose to enter "Validemail" on getnotify page
		And user see "BOPISdeliverymethode" on getnotify page 
		And user see "producttitle" on getnotify page 
		And user see "productprice" on getnotify page 
		And user see "productimage" on getnotify page 
		And user see "Selectedstorename" on getnotify page 
		And user see "storeaddress" on getnotify page 
		And user see "storetiming" on getnotify page 
		And user see "storephone" on getnotify page 
		#Then i choose to enter "Validemail" on getnotify page
		Then i click on "submitgetnotifiedbutton" on getnotify page
		And user see "userisnotifiedmessage" on getnotify page 
		
		
		
		
		
		
