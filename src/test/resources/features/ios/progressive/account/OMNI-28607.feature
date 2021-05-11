Feature: Manage Notification 

  @Sprint6 @ST-OMNI-28607 @TC-OMNI-37690
  Scenario: User selected “Don’t Allow” for notifications during onboarding
    Given User launches the application
    And User continues as guest user
    #And User Clicks On MaY Be Later
    #And User tap on Allow notification
    And User tap on don't allow On boarding
    Then User sees the homepage
    When User taps on account in bottom nav
    Then User sees the account page
    Then User sees the Notification prefrence
    When User Tap on Open Settings Button
    Then User navigate to Notificaion Setting
 @Sprint6 @ST-OMNI-28607 @TC-OMNI-37691
  Scenario: User selected “Maybe Later” for notifications during onboarding
    Given User launches the application
    And User continues as guest user
    And User Clicks On MaY Be Later
    And User Clicks On MaY Be Later
    Then User sees the homepage
    When User taps on account in bottom nav
    Then User sees the account page
    Then User sees the Notification prefrence
    And User sees the status as  toggled OFF
    #When User Tap on Open Settings Button
    #Then User navigate to Notificaion Setting
    When User Sees Order status and  Hot market OFF
    # And  User Sees togle is OFF
    Then User tap on Toggle  ON Order Status and HotMarket
    Then User sees the alert Msg Pop Up
    When User Tap on Don't allow
    Then User sees Toggle OFF in Notification
    Then User sees Message display
    When User Tap on Allow
    Then User seeToggle ON in Notification
    Then User see Status is ON
    
@Sprint6 @ST-OMNI-28607 @TC-OMNI-37692
  Scenario: User selected “Don’t Allow” or “Maybe Later” for notifications during onboarding BUT manually enabled the notification in the iOS Notification settings
    Given User launches the application
    And User continues as guest user
    And User Clicks On MaY Be Later
    Then User sees the homepage
    When User taps on account in bottom nav
    Then User sees the account page
    Then User sees the Notification prefrence
    When User Tap on Open Settings Button
    Then User navigate to Notificaion Setting
    Then User sees Toggle OFF in Notification
    When User Tap on Open Settings Button
    Then User seed  Order status and  Hot market Toogle OFF
    When User tap on Enable Notification Toggle OFF

  # Then User sees the Alert msg
  # Then User tap on Don't allow
  # Then User see the Toggle off In Notfication
  @Sprint6 @ST-OMNI-28607 @TC-OMNI-37697
  Scenario: Default toggle status when user allowed pushed notifications during app onboarding
    Given User launches the application
    And User continues as guest user
    And User Clicks On MaY Be Later
    Then User sees the homepage
    When User taps on account in bottom nav
    Then User sees the account page
    Then User sees the Notification prefrence
    Then User Sees Order status and  Hot market Toggle ON By deafault
