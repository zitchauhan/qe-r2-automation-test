Feature: Verify presence of Socail Links from Homepage

  @Regression @Mobile @KER-262  @ZYP_HP_K262-7280 @C-HP @CR-RKA
  Scenario: Verify presence of Socail Links from Homepage
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User will verify the presence of Facebook icon
    Then User will verify the presence of twitter icon
    Then User will verify the presence of pinterest icon
    Then User will verify the presence of youtube icon
    Then User will verify the presence of instagram icon


   @Mobile @C-HP @KER-262  @ZYP_HP_K262-7281 @All @Regression @CR-RKA
  Scenario: Verify presence of Global Element Header
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User will verify the presence of FIND A STORE
    Then User will verify the presence of sign up for more deals
    Then User will verify the presence of chat now 
    Then User will click on expand button of this is academy
    Then User will verify the presence of Our history 
    Then User will verify the presence of Careers
    Then User will verify the presence of Press Release
    Then User will verify the presence of inventors  
    And User will click on expand button for services
    Then User will verify the presence of Shop Gift Cards
    Then User will verify the presence of Academy Credit Card
    Then User will verify the presence of Store Services
    And User will click on expand button for needhelp
    Then User will verify the presence of Check Order
    Then User will verify the presence of Return Policy
    Then User will verify the presence of Product Recalls 
    Then User will verify the presence of Rebates
    Then User will verify the presence of Contact Us
    Then User will verify the presence of Customer Care

  @Mobile @C-HP @KER-262  @ZYP_HP_K262-7283 @All @Regression @CR-RKA
  Scenario: Verify presence of Global Element Header
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User will verify the presence of ASO Logo
    Then User will verify the presence of search
    Then User clicks on the burger menu

  #  Then User will verify the presence of add to cart icon
  @Regression @Mobile @KER-262  @ZYP_HP_K262-4078 @C-HP @CR-RKA
  Scenario Outline: Verify the SignUp functionality for new customer
    Given user launches the browser and navigates to "ASO_HOME" page
#    Then User clicks on the burger menu
#    When user to click on sing in and navigate to sign in page
   Then User clicks on the burger menu
    Then user should able to click on Signin button
    Then user to fill username "<username>" and password "<password>"
    When click sign in

    Examples: 
      | username       | password |
      | qaz2@gmail.com | qazlee   |

  @Regression @Mobile @KER-262  @ZYP_HP_K262-4085 @C-HP @CR-RKA
  Scenario Outline: To Verify the signout from MyAccount
    Given user launches the browser and navigates to "ASO_HOME" page
#    Then User clicks on the burger menu
#    When user to click on sing in and navigate to sign in page
 Then User clicks on the burger menu
    Then user should able to click on Signin button
    Then user to fill username "<username>" and password "<password>"
    When click sign in
    Then User clicks on the burger menu
    Then click on singout

    Examples: 
      | username       | password |
      | qaz2@gmail.com | qazlee   |

  @Regression @Mobile @KER-262  @ZYP_HP_K262-6468 @C-HP @CR-RKA
  Scenario Outline: To verify user can view 'My Account' from a drop down account summary upon successful log in
    Given user launches the browser and navigates to "ASO_HOME" page
#    Then User clicks on the burger menu
#    When user to click on sing in and navigate to sign in page
  Then User clicks on the burger menu
    Then user should able to click on Signin button
    Then user to fill username "<username>" and password "<password>"
    And click sign in
    Then verify user to navigate to account summary page

    Examples: 
      | username       | password |
      | qaz2@gmail.com | qazlee   |

  @Regression @Mobile @KER-262  @ZYP_HP_K262-4073 @C-HP @CR-RKA
  Scenario Outline: Verify the Sign-in functionality for invalid email address
    Given user launches the browser and navigates to "ASO_HOME" page
#    Then User clicks on the burger menu
#    When user to click on sing in and navigate to sign in page
 Then User clicks on the burger menu
    Then user should able to click on Signin button
    Then user to fill username "<username>" and password "<password>"
    And click sign in
    Then verify the validation message as incorrect

    Examples: 
      | username         | password |
      | qaz222@gmail.com | qazlee   |

  @Regression @Mobile @KER-262  @ZYP_HP_K262-4074 @C-HP @CR-RKA
  Scenario Outline: To Verify the Sign-in functionality for invalid  password
    Given user launches the browser and navigates to "ASO_HOME" page
#    Then User clicks on the burger menu
#    When user to click on sing in and navigate to sign in page
   Then User clicks on the burger menu
    Then user should able to click on Signin button
    Then user to fill username "<username>" and password "<password>"
    And click sign in
    Then verify the validation message as incorrect

    Examples: 
      | username       | password   |
      | qaz2@gmail.com | qazlee1000 |

  @Regression @Mobile @KER-262  @ZYP_HP_K262-4077 @C-HP @CR-RKA
  Scenario: Verify the Signin functionality for empty email address and empty password
    Given user launches the browser and navigates to "ASO_HOME" page
#    Then User clicks on the burger menu
#    When user to click on sing in and navigate to sign in page
  Then User clicks on the burger menu
    Then user should able to click on Signin button
    And click sign in
    Then verify enter email and password message to come

  @C-HP @Mobile @Regression @KER-262  @ZYP_HP_K262-4079 @CR-RKA
  Scenario: Verify the forgot your password functionality
    Given user launches the browser and navigates to "ASO_HOME" page
#    Then User clicks on the burger menu
#    When user to click on sing in and navigate to sign in page
 Then User clicks on the burger menu
    Then user should able to click on Signin button
    When user to be able to click forget password
    When user to enter email
    Then verify user to click submit button

  @C-HP @Mobile @Regression @KER-262  @ZYP_HP_K262-4082 @CR-RKA
  Scenario Outline: Verify the Address Book details from MyAccount
    Given user launches the browser and navigates to "ASO_HOME" page
#    Then User clicks on the burger menu
#    When user to click on sing in and navigate to sign in page
  Then User clicks on the burger menu
    Then user should able to click on Signin button
    Then user to fill username "<username>" and password "<password>"
    And click sign in
    Then verify Address book form My Account

    Examples: 
      | username       | password |
      | qaz2@gmail.com | qazlee   |

  @C-HP @Mobile @Regression @KER-262  @ZYP_HP_K262-4083 @CR-RKA
  Scenario Outline: Verify the Wishlists details from MyAccount
    Given user launches the browser and navigates to "ASO_HOME" page
#    Then User clicks on the burger menu
#    When user to click on sing in and navigate to sign in page
   Then User clicks on the burger menu
    Then user should able to click on Signin button
    Then user to fill username "<username>" and password "<password>"
    And click sign in
    Then verify , WishList form My Account

    Examples: 
      | username       | password |
      | qaz2@gmail.com | qazlee   |

  @C-HP @Mobile @Regression @KER-262  @ZYP_HP_K262-2732 @CR-RKA
  Scenario: Mobile-Verify the Sign-In functionality for Guest User
    Given user launches the browser and navigates to "ASO_HOME" page
#    Then User clicks on the burger menu
#    When user to click on sing in and navigate to sign in page
 Then User clicks on the burger menu
    Then user should able to click on Signin button
    Then user verify signup and signin 
    When user to be able to click forget password
    When user to enter email
    Then verify user to click submit button

  @C-HP @Mobile @Regression @KER-262  @ZYP_HP_K262-2733 @CR-RKA
  Scenario Outline: Mobile-Verify the Sign-In functionality for Guest User before clicking on search button
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User to verify serch option box is available
    Then User to verify search for any requirement"<data>"

    Examples: 
      | data |
      | pant |

  #			extension of ZYP-2733
  @C-HP @Mobile @Regression @KER-262  @ZYP_HP_K262-9672 @CR-RKA
  Scenario Outline: Mobile-Verify the Sign-In functionality for Guest User after clicking on search button
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User to verify serch option box is available
    Then User to click on search button after putting data"<data>"

    Examples: 
      | data |
      | pant |




 @Mobile @Regression @KER-262  @ZYP_HP_K262-2736 @CR-RKA  @C-HP
 Scenario Outline: Verify the global search box functionality for Mobile
Given user launches the browser and navigates to "ASO_HOME" page
    Then User to verify serch option box is available
    Then User to navigate to bottom
    Then User to verify magnifying glass icon when scroll down
  Then User to check expansion and collapse of the magnifying search field 
    Then verify Auto scroll 
   Then user click on Auto scroll button 
  Then User to verify search for any requirement"<data>"    
      Then User to click on search button after putting data"<data>"
Examples: 
      | data |
      | pant |

@C-HP @Mobile @Regression @KER-262  @ZYP_HP_K262-2737 @CR-RKA
Scenario Outline: Verify the global navigation
   Given user launches the browser and navigates to "ASO_HOME" page
   Then User clicks on the burger menu
   And User navigates to L3
   And User clicks on the minicart icon and navigated to minicart 
   Then User should be dispalyed with message Your Shopping Cart is Empty   
#   Then User clicks on the burger menu
#   When user to click on sing in and navigate to sign in page
  Then User clicks on the burger menu
    Then user should able to click on Signin button
   Then user to fill username "<username>" and password "<password>"
   And click sign in
   Then User clicks on the burger menu
  Then user verify drawer like shop ,trending ,deal 
 Then User verify and click on weekly Ads  
 Then User clicks on the burger menu
 Then user verify myaccountlink from weekly Ads
Examples:  
      | username       | password |
      | qaz2@gmail.com | qazlee   |
      
      
      
      @C-HP @Mobile @Regression @KER-262  @ZYP_HP_K262-2738 @CR-RKA
      Scenario Outline:  Verify the global navigation
       Given user launches the browser and navigates to "ASO_HOME" page
      Then User will verify the presence of ASO Logo and click on Logo 
#      Then User clicks on the burger menu
#      When user to click on sing in and navigate to sign in page
 Then User clicks on the burger menu
    Then user should able to click on Signin button
     Then user to fill username "<username>" and password "<password>"
      And click sign in
      Then User clicks on the burger menu
      Then User verify and click on weekly Ads 
      And User clicks on the minicart icon and navigated to minicart

      
      
     Examples:  
      | username       | password |
      | qaz2@gmail.com | qazlee   |
      
      
      @C-HP @Mobile @Regression @KER-262  @ZYP_HP_K262-4080 @CR-RKA
       Scenario Outline: Mobile-Verify the Account Summary details from MyAccount
        Given user launches the browser and navigates to "ASO_HOME" page
#    Then User clicks on the burger menu
#    When user to click on sing in and navigate to sign in page
 Then User clicks on the burger menu
    Then user should able to click on Signin button
    Then user to fill username "<username>" and password "<password>"
    And click sign in
    Then verify Address book form My Account

    Examples: 
      | username       | password |
      | qaz2@gmail.com | qazlee   |
       
       
       
    @C-HP @Mobile @Regression @KER-262  @ZYP_HP_K262-4084 @CR-RKA
   Scenario Outline:To Verify the MyAccount dropdown
        Given user launches the browser and navigates to "ASO_HOME" page
#    Then User clicks on the burger menu
#    When user to click on sing in and navigate to sign in page
   Then User clicks on the burger menu
    Then user should able to click on Signin button
    Then user to fill username "<username>" and password "<password>"
    And click sign in
    Then verify Address book form My Account

    Examples: 
      | username       | password |
      | qaz2@gmail.com | qazlee   |
       
     
   @Mobile @All @C-HP @Regression @KER-262 @ZYP_HP_K262 @CR-RKA @BrokenLink
   Scenario: TC_1- Verify all broken URL's on Home page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then verfy all link url's status code is 200    
    
    @Mobile @All @C-HP @Regression @KER-262 @ZYP_HP_K262 @CR-RKA @BrokenImage
   Scenario: TC_1- Verify all broken URL's on Home page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then verfy all Image link urls status code is 200
    