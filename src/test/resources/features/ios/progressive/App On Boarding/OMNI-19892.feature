Feature: App Onboarding - Notificationsd

  @Sprint6 @ST-OMNI-19892 @TC-OMNI-38089
  Scenario: Login > Login Screen > Notificaion Screen click on Allow User Should navigate to Location Screen
    Given User launches the application
    Then User verifies "USER ON Create Login and Sign up " option is displayed on the screen
    Then user click login button
    Then User is on account login page
    Then User Enters valid user name
    Then User Enters valid password
    And User click on Login
    Then User on Notification Screen
    And User  click On Allow Notification button
    Then User Get Alert Pop
    Then User click on allow notification
    Then User is on Location Page
