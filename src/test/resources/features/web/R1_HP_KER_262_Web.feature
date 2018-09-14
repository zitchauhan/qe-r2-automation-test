Feature: [Desktop]Components - Header

  @C-HP @Web @Regression @KER-262 @ZYP_HP_K262-4072 @CR-RKA @1HR
  Scenario: Desktop-To Verify the signout from MyAccount
    Given user launches the browser and navigates to "ASO_HOME" page
    When user to click on sing in and navigate to sign in page
    And user should be able to enter the signin details "Login_username" "Login_pwd"
    Then Verify signout from my account

  @C-HP @Web @Regression @KER-262 @ZYP_HP_K262-1972 @CR-RKA
  Scenario: Desktop- To Verify user is able to Sign In with Valid user name and password by clicking in Sign In Link in the global header
    Given user launches the browser and navigates to "ASO_HOME" page
    When user to click on sing in and navigate to sign in page
    And user should be able to enter the signin details "Login_username" "Login_pwd"
    Then verify user to navigate to account summary page


  @C-HP @Web @Regression @KER-262 @ZYP_HP_K262-4055 @CR-RKA
  Scenario Outline: user to verify sing in  as invalid email address
    Given user launches the browser and navigates to "ASO_HOME" page
    When user to click on sing in and navigate to sign in page
    Then user to fill username "<username>" and password "<password>"
    And click sign in
    Then verify the validation message as incorrect

    Examples: 
      | username          | password |
      | qaz1000@gmail.com | qazlee   |

  @C-HP @Web @Regression @KER-262 @ZYP_HP_K262-4061 @CR-RKA
  Scenario Outline: user to verify sing in  as invalid password address
    Given user launches the browser and navigates to "ASO_HOME" page
    When user to click on sing in and navigate to sign in page
    Then user to fill username "<username>" and password "<password>"
    And click sign in
    Then verify the validation message as incorrect

    Examples: 
      | username       | password  |
      | qaz2@gmail.com | qazlee111 |

  @C-HP @Web @Regression @KER-262 @ZYP_HP_K262-4063 @CR-RKA
  Scenario: user to very sign in by keeping username and password empty and clicking on signin
    Given user launches the browser and navigates to "ASO_HOME" page
    When user to click on sing in and navigate to sign in page
    And click sign in
    Then verify enter email and password message to come

  @C-HP @Web @Regression @KER-262 @ZYP_HP_K262-4065 @CR-RKA
  Scenario: Desktop-Verify the forgot your password functionality
    Given user launches the browser and navigates to "ASO_HOME" page
    When user to click on sing in and navigate to sign in page
    When user to be able to click forget password
    When user to enter email
    Then verify user to click submit button

  @C-HP @Web @Regression @KER-262 @ZYP_HP_K262-4067 @CR-RKA
  Scenario: user to verify personal information  form My Account
    Given user launches the browser and navigates to "ASO_HOME" page
    When user to click on sing in and navigate to sign in page
    And user should be able to enter the signin details "Login_username" "Login_pwd"
    Then verify personal information form My Account


  @C-HP @Web @Regression @KER-262 @ZYP_HP_K262-4069 @CR-RKA
  Scenario: user to verify Address book  form My Account
    Given user launches the browser and navigates to "ASO_HOME" page
    When user to click on sing in and navigate to sign in page
    And user should be able to enter the signin details "Login_username" "Login_pwd"
    Then verify Address book form My Account

  @C-HP @Web @Regression @KER-262 @ZYP_HP_K262-4070 @CR-RKA
  Scenario: user to verify WishList form My Account
    Given user launches the browser and navigates to "ASO_HOME" page
    When user to click on sing in and navigate to sign in page
    And user should be able to enter the signin details "Login_username" "Login_pwd"
    Then verify , WishList form My Account


  @C-HP @Web @Regression @KER-262 @ZYP_HP_K262-4066 @CR-RKA
  Scenario: Desktop-Verify the Account Summary details from MyAccount
    Given user launches the browser and navigates to "ASO_HOME" page
    When user to click on sing in and navigate to sign in page
    And user should be able to enter the signin details "Login_username" "Login_pwd"
    Then verify account summary detail from my account

  
  @Web @All @C-HP @Regression @KER-262 @ZYP_HP_K262-2729 @CR-RKA
  Scenario Outline: Verify that the store details are displayed for guest user
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to click on Find Store
    When User select store with Postal Code

    #    Then User should be able to see Selected_Store in the place of Find a Store link
    Examples: 
      | Postal_Code |
      | FL 32822    |

  @Web @All @C-HP @Regression @KER-262 @ZYP_HP_K262-2730 @CR-RKA
  Scenario Outline: Verify that the store details are displayed for guest user
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to click on Find Store
    When User select store with Postal Code
    Then User verify hour of operation display in the place of find a store link

    Examples: 
      | Postal_Code |
      | FL 32822    |

  @Web @All @C-HP @Regression @KER-262 @ZYP_HP_K262-2734 @CR-RKA
  Scenario: Verify the UI for Find a store modal
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to click on Find Store
    And Find Store Modal should pop-up
    Then user verify element of find store popup

  @Web @All @C-HP @Regression @KER-262 @ZYP_HP_K262-6530 @CR-RKA
  Scenario Outline: Verify that the store details are displayed for Logged-in user
    Given user launches the browser and navigates to "ASO_HOME" page
    When user to click on sing in and navigate to sign in page
    And user should be able to enter the signin details "Login_username" "Login_pwd"
    Then User should be able to click on Find Store after sign in
    When User select store with Postal Code
    Then User verify hour of operation display in the place of find a store link

    Examples: 
      | Postal_Code |
      | FL 32822    |

 @Web @All @C-HP @Regression @KER-262 @ZYP_HP_K262-6533 @CR-SG @RBeta
  Scenario Outline: Verify find a store UI navigation functionality
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to click on Find Store
    When User select store with Postal Code
    Then User verify hour of operation display in the place of find a store link
    Then User verify have to verify change link with pencil icon

    Examples: 
      | Postal_Code |
      | FL 32822    |
      
 @Web @All @C-HP @Regression @KER-262 @ZYP_HP_K262 @CR-RKA @BrokenLink @Broken @TC_BL_01 
    Scenario: Verify all broken URL's on Home page
    Given user launches the browser and navigates to "ASO_HOME" page
		Then verfy all link url's status code is 200    

  @Web @All @C-HP @Regression @KER-262 @ZYP_HP_K262-11665 @CR-RKA @BrokenLink @Broken @TC_BL_02 
  Scenario: Verify all broken URL's on L1 page
    Given user launches the browser and navigates to "ASO_HOME" page
    When user clicks on one of the category and navigates to LOne page
    Then User should be able to see L1 Page
    Then verfy all link url's status code is 200

  @Web @All @C-HP @Regression @KER-262 @ZYP_HP_K262-11666 @CR-RKA @BrokenLink @Broken @TC_BL_03
  Scenario: Verify all broken URL's on L2 page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2 from home page
    Then User should be able to see L2 Page
    Then verfy all link url's status code is 200

  @Web @All @C-HP @Regression @KER-262 @ZYP_HP_K262-11667 @CR-RKA @BrokenLink @Broken @TC_BL_04
  Scenario: Verify all broken URL's on L3 page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L3 from home page
    Then User should be able to see L3 Page
    Then verfy all link url's status code is 200

  @Web @All @C-HP @Regression @KER-262 @ZYP_HP_K262-11668 @CR-RKA @BrokenLink @Broken @TC_BL_05
  Scenario: Verify all broken URL's on PDP page
    Given user launches the browser and navigates to "ASO_HOME" page
    When user navigates to PLP of any product
    Then user clicks on the product card and navigates to PDP of the product
    Then verfy all link url's status code is 200

  @Web @All @C-HP @Regression @KER-262 @ZYP_HP_K262-11669 @CR-RKA @BrokenLink @Broken @TC_BL_09
  Scenario: Verify all broken URL's on Reskin page
    Given user launches the browser and navigates to "ASO_HOME" page
    When user to click on sing in and navigate to sign in page
    Then verfy all link url's status code is 200
    
     
    
   @Web @All @C-HP @Regression @KER-262 @ZYP_HP_K262_Image @CR-RKA @BrokenImage @Broken @TC_BIM_01
    Scenario: TC_1- Verify all Image broken URL's on Home page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then verfy all Image link urls status code is 200
    
    
    @Web @All @C-HP @Regression @KER-262 @ZYP_HP_K262-11665_Image @CR-RKA @BrokenImage @Broken  @TC_BIM_02
  Scenario: Verify all broken Image on L1 page
    Given user launches the browser and navigates to "ASO_HOME" page
    When user clicks on one of the category and navigates to LOne page
    Then User should be able to see L1 Page
    Then verfy all Image link urls status code is 200

  @Web @All @C-HP @Regression @KER-262 @ZYP_HP_K262-11666_Image @CR-RKA @BrokenImage @Broken @TC_BIM_03
  Scenario: Verify all broken Images on L2 page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L2 from home page
    Then User should be able to see L2 Page
    Then verfy all Image link urls status code is 200

  @Web @All @C-HP @Regression @KER-262 @ZYP_HP_K262-11667_Image @CR-RKA @BrokenImage @Broken @TC_BIM_04
  Scenario: Verify all broken Images on L3 page
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates to L3 from home page
    Then User should be able to see L3 Page
    Then verfy all Image link urls status code is 200

  @Web @All @C-HP @Regression @KER-262 @ZYP_HP_K262-11668_Image @CR-RKA @BrokenImage @Broken @TC_BIM_05
  Scenario: Verify all broken Images on PDP page
    Given user launches the browser and navigates to "ASO_HOME" page
    When user navigates to PLP of any product
    Then user clicks on the product card and navigates to PDP of the product
    Then verfy all Image link urls status code is 200

  @Web @All @C-HP @Regression @KER-262 @ZYP_HP_K262-11669_Image @CR-RKA @BrokenImage @Broken @TC_BIM_09
  Scenario: Verify all broken Images on Reskin page
    Given user launches the browser and navigates to "ASO_HOME" page
    When user to click on sing in and navigate to sign in page
    Then verfy all Image link urls status code is 200
    

    
