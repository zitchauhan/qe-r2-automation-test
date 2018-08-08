Feature: [Desktop]Components - Header


  @C-HP @Web @Regression @KER-262 @ZYP_K262-4072 @1HR
   Scenario Outline: Desktop-To Verify the signout from MyAccount
    Given user launches the browser and navigates to "ASO_HOME" page
    When user to click on sing in and navigate to sign in page
    Then user to fill username "<username>" and password "<password>"
    And click sign in
    Then Verify signout from my account

    Examples: 
      | username       | password |
      | qaz2@gmail.com | qazlee   |

@C-HP @Web @Regression @KER-262 @ZYP_K262-1972
Scenario Outline: Desktop- To Verify user is able to Sign In with Valid user name and password by clicking in Sign In Link in the global header
 Given user launches the browser and navigates to "ASO_HOME" page
    When user to click on sing in and navigate to sign in page
    Then user to fill username "<username>" and password "<password>"
    And click sign in
    Then verify user to navigate to account summary page

    Examples: 
      | username       | password |
      | qaz2@gmail.com | qazlee   |

 


   @C-HP  @Web @Regression @KER-262 @ZYP_K262-4055
  Scenario Outline: user to verify sing in  as invalid email address
    Given user launches the browser and navigates to "ASO_HOME" page
    When user to click on sing in and navigate to sign in page
    Then user to fill username "<username>" and password "<password>"
    And click sign in
    Then verify the validation message as incorrect

    Examples: 
      | username          | password |
      | qaz1000@gmail.com | qazlee   |
      
      
    @C-HP @Web @Regression @KER-262 @ZYP_K262-4061
  Scenario Outline: user to verify sing in  as invalid password address
    Given user launches the browser and navigates to "ASO_HOME" page
    When user to click on sing in and navigate to sign in page
    Then user to fill username "<username>" and password "<password>"
    And click sign in
    Then verify the validation message as incorrect

    Examples: 
      | username       | password  |
      | qaz2@gmail.com | qazlee111 |
      
      
   @C-HP @Web @Regression @KER-262 @ZYP_K262-4063
  Scenario: user to very sign in by keeping username and password empty and clicking on signin
    Given user launches the browser and navigates to "ASO_HOME" page
    When user to click on sing in and navigate to sign in page
    And click sign in
    Then verify enter email and password message to come
    
    
    
    @C-HP @Web @Regression @KER-262 @ZYP_K262-4065
  Scenario: Desktop-Verify the forgot your password functionality
    Given user launches the browser and navigates to "ASO_HOME" page
    When user to click on sing in and navigate to sign in page
    When user to be able to click forget password
    When user to enter email
    Then verify user to click submit button
    
    
    @C-HP  @Web @Regression @KER-262 @ZYP_K262-4067
  Scenario Outline: user to verify personal information  form My Account
    Given user launches the browser and navigates to "ASO_HOME" page
    When user to click on sing in and navigate to sign in page
    Then user to fill username "<username>" and password "<password>"
    And click sign in
    Then verify personal information form My Account

    Examples: 
      | username       | password |
      | qaz2@gmail.com | qazlee   |

  @C-HP @Web @Regression @KER-262 @ZYP_K262-4069
  Scenario Outline: user to verify Address book  form My Account
    Given user launches the browser and navigates to "ASO_HOME" page
    When user to click on sing in and navigate to sign in page
    Then user to fill username "<username>" and password "<password>"
    And click sign in
    Then verify Address book form My Account

    Examples: 
      | username       | password |
      | qaz2@gmail.com | qazlee   |

  @C-HP @Web @Regression @KER-262 @ZYP_K262-4070
  Scenario Outline: user to verify WishList form My Account
    Given user launches the browser and navigates to "ASO_HOME" page
    When user to click on sing in and navigate to sign in page
    Then user to fill username "<username>" and password "<password>"
    And click sign in
    Then verify , WishList form My Account

    Examples: 
      | username       | password |
      | qaz2@gmail.com | qazlee   |
        
    
     @C-HP @Web @Regression @KER-262 @ZYP_K262-4066
  Scenario Outline: Desktop-Verify the Account Summary details from MyAccount
    Given user launches the browser and navigates to "ASO_HOME" page
    When user to click on sing in and navigate to sign in page
    Then user to fill username "<username>" and password "<password>"
    And click sign in
    Then verify account summary detail from my account
  
    Examples: 
      | username       | password |
      | qaz2@gmail.com | qazlee   |
     
      
      