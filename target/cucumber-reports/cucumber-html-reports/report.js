$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("R1_HP_KER_1400_Web.feature");
formatter.feature({
  "line": 1,
<<<<<<< HEAD
  "name": "PLCC: Checkout - Payment Using PLCC",
  "description": "",
  "id": "plcc:-checkout---payment-using-plcc",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6693700,
  "status": "passed"
});
formatter.before({
  "duration": 15123600,
=======
  "name": "[UI]- To Verify the Footer Email link functionality",
  "description": "",
  "id": "[ui]--to-verify-the-footer-email-link-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 351880100,
  "status": "passed"
});
formatter.before({
  "duration": 376100,
>>>>>>> f5bcfb54798f18775d019879fc276f7377b53a47
  "status": "passed"
});
formatter.before({
  "duration": 9857800,
  "status": "passed"
});
formatter.before({
  "duration": 594300,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "To Verify the Footer Email link functionality",
  "description": "",
  "id": "[ui]--to-verify-the-footer-email-link-functionality;to-verify-the-footer-email-link-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Web"
    },
    {
      "line": 3,
      "name": "@All"
    },
    {
      "line": 3,
      "name": "@C-HP"
    },
    {
      "line": 3,
      "name": "@Regression"
    },
    {
      "line": 3,
      "name": "@KER-1400"
    },
    {
      "line": 3,
      "name": "@ZYP_HP_K1400-6801"
    },
    {
      "line": 3,
      "name": "@CR-SG"
    },
    {
      "line": 3,
      "name": "@1HR"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user launches the browser and navigates to \"ASO_HOME\" page",
  "keyword": "Given "
});
formatter.step({
<<<<<<< HEAD
  "line": 5,
  "name": "user click on My Account link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user expect element Email Address to be present",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user enter Email address in sign-in page \"UserWithSavedAddressAndPayment\"",
=======
  "line": 6,
  "name": "User will verify the presence of sign up for more deals",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User click on sign up for more deals and verify the modal",
>>>>>>> f5bcfb54798f18775d019879fc276f7377b53a47
  "keyword": "And "
});
formatter.step({
  "line": 8,
<<<<<<< HEAD
  "name": "user enter password in sign-in page \"BuynowPwd\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user click on Signin-button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user navigates to ASO-Home page",
  "keyword": "Then "
});
=======
  "name": "user enter the data and click on submit",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user verify the success message",
  "keyword": "And "
});
>>>>>>> f5bcfb54798f18775d019879fc276f7377b53a47
formatter.match({
  "arguments": [
    {
      "val": "ASO_HOME",
      "offset": 44
    }
  ],
  "location": "Common_Web_SD.user_launches_the_browser_and_navigates_to_page(String)"
});
formatter.result({
  "duration": 11705498800,
  "status": "passed"
});
formatter.match({
  "location": "R1_HP_K262_Global_Footer_SD.user_will_verify_the_presence_of_sign_up_for_more_deals()"
});
formatter.result({
  "duration": 3333129800,
  "status": "passed"
});
formatter.match({
  "location": "R1_HP_K1400_SD.User_click_on_sign_up_for_more_deals_and_verify_the_modal()"
});
formatter.result({
  "duration": 3510069400,
  "status": "passed"
});
formatter.match({
  "location": "R1_HP_K1400_SD.user_enter_the_data_and_click_on_submit()"
});
formatter.result({
<<<<<<< HEAD
  "duration": 8992008300,
  "status": "passed"
});
formatter.match({
  "location": "R1_REG_79_Web.user_click_on_My_Account_link()"
});
formatter.result({
  "duration": 14493953500,
  "status": "passed"
});
formatter.match({
  "location": "R1_REG_79_Web.user_expect_element_Email_Address_to_be_present()"
});
formatter.result({
  "duration": 30443477200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "UserWithSavedAddressAndPayment",
      "offset": 42
    }
  ],
  "location": "R1_LP_34_Web.user_enter_Email_address_in_sign_in_page(String)"
});
formatter.result({
  "duration": 3824507200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BuynowPwd",
      "offset": 37
    }
  ],
  "location": "R1_LP_34_Web.user_enter_password_in_sign_in_page(String)"
});
formatter.result({
  "duration": 3643587500,
  "status": "passed"
});
formatter.match({
  "location": "R1_LP_34_Web.user_click_on_Signin_button()"
});
formatter.result({
  "duration": 10864836100,
  "status": "passed"
});
formatter.match({
  "location": "R1_LP_34_Web.user_navigates_to_ASO_Home_page()"
});
formatter.result({
  "duration": 17636843900,
=======
  "duration": 11882658200,
  "status": "passed"
});
formatter.match({
  "location": "R1_HP_K1400_SD.user_verify_the_success_message()"
});
formatter.result({
  "duration": 5980323700,
  "status": "passed"
});
formatter.after({
  "duration": 829584100,
  "status": "passed"
});
formatter.after({
  "duration": 1140200,
  "status": "passed"
});
formatter.after({
  "duration": 184800,
  "status": "passed"
});
formatter.after({
  "duration": 147000,
  "status": "passed"
});
formatter.uri("R1_HP_KER_1915_Web.feature");
formatter.feature({
  "line": 1,
  "name": "To Verify Product Wish List - Signed In User Flow (PDP)",
  "description": "",
  "id": "to-verify-product-wish-list---signed-in-user-flow-(pdp)",
  "keyword": "Feature"
});
formatter.before({
  "duration": 178900,
  "status": "passed"
});
formatter.before({
  "duration": 161400,
  "status": "passed"
});
formatter.before({
  "duration": 451600,
  "status": "passed"
});
formatter.before({
  "duration": 339700,
>>>>>>> f5bcfb54798f18775d019879fc276f7377b53a47
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "To verfiy Create new wish list for signed in customer",
  "description": "",
  "id": "to-verify-product-wish-list---signed-in-user-flow-(pdp);to-verfiy-create-new-wish-list-for-signed-in-customer",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Web"
    },
    {
      "line": 3,
      "name": "@All"
    },
    {
      "line": 3,
      "name": "@C-HP"
    },
    {
      "line": 3,
      "name": "@Regression"
    },
    {
      "line": 3,
      "name": "@KER-1915"
    },
    {
<<<<<<< HEAD
      "line": 12,
      "value": "#@C-PLCC @Regression @All @PLCC-99 @CR-Manju"
    },
    {
      "line": 13,
      "value": "#Scenario: Verify user is able to get Free shipping offer with Item value greater than 15$"
    },
    {
      "line": 14,
      "value": "#    When user enters \"SKUIdOfProductGr15\" in the search box"
    },
    {
      "line": 15,
      "value": "#\tAnd user click on search icon"
    },
    {
      "line": 16,
      "value": "#\tAnd user click on Add an Item to cart Button"
    },
    {
      "line": 17,
      "value": "#\tAnd user click on checkout from ATC pop up"
    },
    {
      "line": 18,
      "value": "#\tAnd user clicks on checkout button and navigates to checkout page"
    },
    {
      "line": 19,
      "value": "#\tAnd user click on REVIEW ORDER button"
    },
    {
      "line": 20,
      "value": "#\tAnd user expect element free shipping should be available"
    },
    {
      "line": 21,
      "value": "#\tAnd user expect discount text to be present"
    },
    {
      "line": 22,
      "value": "#\tWhen user click on edit my cart link"
    },
    {
      "line": 23,
      "value": "#\tThen user click on remove from cart"
    }
  ],
  "line": 26,
  "name": "Verify user is unable to get Free shipping offer with Item value lesser than 15$",
  "description": "",
  "id": "plcc:-checkout---payment-using-plcc;verify-user-is-unable-to-get-free-shipping-offer-with-item-value-lesser-than-15$",
=======
      "line": 3,
      "name": "@ZYP_HP_K1915-3445"
    },
    {
      "line": 3,
      "name": "@CR-AKK"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user launches the browser and navigates to \"ASO_HOME\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user to click on sing in and navigate to sign in page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should be able to enter the signin details \"Login_username\" \"Login_pwd\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User navigate to wishlist from header",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user create new Wishlist",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "ASO_HOME",
      "offset": 44
    }
  ],
  "location": "Common_Web_SD.user_launches_the_browser_and_navigates_to_page(String)"
});
formatter.result({
  "duration": 6515680900,
  "status": "passed"
});
formatter.match({
  "location": "R1_HP_K727_SD.user_to_click_on_sing_in_and_navigate_to_sign_in_page()"
});
formatter.result({
  "duration": 8544221000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login_username",
      "offset": 49
    },
    {
      "val": "Login_pwd",
      "offset": 66
    }
  ],
  "location": "R1_SD_SIT.user_should_be_able_to_enter_the_signin_details(String,String)"
});
formatter.result({
  "duration": 69313611200,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.xpath: //*[@data-auid\u003d\u0027myAccountCta\u0027] (tried for 30 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:81)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:271)\r\n\tat com.aso.qe.framework.common.CommonActionHelper.waitForElement(CommonActionHelper.java:139)\r\n\tat com.aso.qe.test.stepdefinition.web.R1_SD_SIT.user_should_be_able_to_enter_the_signin_details(R1_SD_SIT.java:312)\r\n\tat ✽.And user should be able to enter the signin details \"Login_username\" \"Login_pwd\"(R1_HP_KER_1915_Web.feature:7)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Cannot locate an element using By.xpath: //*[@data-auid\u003d\u0027myAccountCta\u0027]\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027VDI-SQA007E\u0027, ip: \u002710.1.243.108\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.lambda$findElement$0(ExpectedConditions.java:896)\r\n\tat java.util.Optional.orElseThrow(Optional.java:290)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:895)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:44)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:183)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:180)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:248)\r\n\tat com.aso.qe.framework.common.CommonActionHelper.waitForElement(CommonActionHelper.java:139)\r\n\tat com.aso.qe.test.stepdefinition.web.R1_SD_SIT.user_should_be_able_to_enter_the_signin_details(R1_SD_SIT.java:312)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:37)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:298)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:48)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:538)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:760)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:460)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:206)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "R1_PDP_K1914_SD.User_navigate_to_wishlist_from_header()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "R1_HP_K1915_SD.user_create_new_Wishlist()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1462629500,
  "status": "passed"
});
formatter.after({
  "duration": 2136900,
  "status": "passed"
});
formatter.after({
  "duration": 204900,
  "status": "passed"
});
formatter.after({
  "duration": 192700,
  "status": "passed"
});
formatter.before({
  "duration": 222400,
  "status": "passed"
});
formatter.before({
  "duration": 210600,
  "status": "passed"
});
formatter.before({
  "duration": 691900,
  "status": "passed"
});
formatter.before({
  "duration": 1077800,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "To verify signed user is able to add product to the existing wish list",
  "description": "",
  "id": "to-verify-product-wish-list---signed-in-user-flow-(pdp);to-verify-signed-user-is-able-to-add-product-to-the-existing-wish-list",
>>>>>>> f5bcfb54798f18775d019879fc276f7377b53a47
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
<<<<<<< HEAD
      "line": 25,
      "name": "@C-PLCC"
    },
    {
      "line": 25,
      "name": "@Regression"
    },
    {
      "line": 25,
      "name": "@All"
    },
    {
      "line": 25,
      "name": "@PLCC-99"
    },
    {
      "line": 25,
      "name": "@CR-Manju"
=======
      "line": 13,
      "name": "@Web"
    },
    {
      "line": 13,
      "name": "@All"
    },
    {
      "line": 13,
      "name": "@C-HP"
    },
    {
      "line": 13,
      "name": "@Regression"
    },
    {
      "line": 13,
      "name": "@KER-1915"
    },
    {
      "line": 13,
      "name": "@ZYP_HP_K1915-3453"
    },
    {
      "line": 13,
      "name": "@CR-AKK"
    },
    {
      "line": 13,
      "name": "@RBeta"
>>>>>>> f5bcfb54798f18775d019879fc276f7377b53a47
    }
  ]
});
formatter.step({
<<<<<<< HEAD
  "line": 27,
  "name": "user enters \"SKUIdOfProductLs15\" in the search box",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "user click on search icon",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user click on Add an Item to cart Button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user click on checkout from ATC pop up",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user clicks on checkout button and navigates to checkout page",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user click on REVIEW ORDER button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user expect element free shipping should not be available",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user expect discount text to be present",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user click on edit my cart link",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "user click on remove from cart",
  "keyword": "Then "
=======
  "line": 15,
  "name": "user launches the browser and navigates to \"ASO_HOME\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user to click on sing in and navigate to sign in page",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user should be able to enter the signin details \"Login_username\" \"Login_pwd\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User navigate to wishlist from header",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user create exsiting Wishlist \"existing_wishlist\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "verify error message",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ASO_HOME",
      "offset": 44
    }
  ],
  "location": "Common_Web_SD.user_launches_the_browser_and_navigates_to_page(String)"
});
formatter.result({
  "duration": 6568640000,
  "status": "passed"
});
formatter.match({
  "location": "R1_HP_K727_SD.user_to_click_on_sing_in_and_navigate_to_sign_in_page()"
});
formatter.result({
  "duration": 8246397600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login_username",
      "offset": 49
    },
    {
      "val": "Login_pwd",
      "offset": 66
    }
  ],
  "location": "R1_SD_SIT.user_should_be_able_to_enter_the_signin_details(String,String)"
});
formatter.result({
  "duration": 69119622800,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.xpath: //*[@data-auid\u003d\u0027myAccountCta\u0027] (tried for 30 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:81)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:271)\r\n\tat com.aso.qe.framework.common.CommonActionHelper.waitForElement(CommonActionHelper.java:139)\r\n\tat com.aso.qe.test.stepdefinition.web.R1_SD_SIT.user_should_be_able_to_enter_the_signin_details(R1_SD_SIT.java:312)\r\n\tat ✽.And user should be able to enter the signin details \"Login_username\" \"Login_pwd\"(R1_HP_KER_1915_Web.feature:17)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Cannot locate an element using By.xpath: //*[@data-auid\u003d\u0027myAccountCta\u0027]\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027VDI-SQA007E\u0027, ip: \u002710.1.243.108\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.lambda$findElement$0(ExpectedConditions.java:896)\r\n\tat java.util.Optional.orElseThrow(Optional.java:290)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:895)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:44)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:183)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:180)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:248)\r\n\tat com.aso.qe.framework.common.CommonActionHelper.waitForElement(CommonActionHelper.java:139)\r\n\tat com.aso.qe.test.stepdefinition.web.R1_SD_SIT.user_should_be_able_to_enter_the_signin_details(R1_SD_SIT.java:312)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:37)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:298)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:48)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:538)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:760)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:460)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:206)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "R1_PDP_K1914_SD.User_navigate_to_wishlist_from_header()"
});
formatter.result({
  "status": "skipped"
>>>>>>> f5bcfb54798f18775d019879fc276f7377b53a47
});
formatter.match({
  "arguments": [
    {
<<<<<<< HEAD
      "val": "SKUIdOfProductLs15",
      "offset": 13
    }
  ],
  "location": "R1_Checkout_80_Web.user_enters_in_the_search_box(String)"
});
formatter.result({
  "duration": 4039638500,
  "status": "passed"
});
formatter.match({
  "location": "R1_Checkout_80_Web.user_click_on_search_icon()"
});
formatter.result({
  "duration": 6334498700,
  "status": "passed"
});
formatter.match({
  "location": "R1_Checkout_80_Web.user_click_on_Add_an_Item_to_cart_Button()"
});
formatter.result({
  "duration": 8640455700,
  "status": "passed"
});
formatter.match({
  "location": "R1_Checkout_80_Web.user_click_on_checkout_from_ATC_pop_up()"
});
formatter.result({
  "duration": 15925268800,
  "status": "passed"
});
formatter.match({
  "location": "R1_Checkout_80_Web.user_clicks_on_checkout_button_and_navigates_to_checkout_page()"
});
formatter.result({
  "duration": 50742000,
  "status": "passed"
});
formatter.match({
  "location": "R1_Checkout_87_Web.user_click_on_REVIEW_ORDER_button()"
});
formatter.result({
  "duration": 1421239100,
  "status": "passed"
});
formatter.match({
  "location": "R1_Checkout_Discounts_101_Web.user_expect_element_free_shipping_should_not_be_available()"
});
formatter.result({
  "duration": 1286653500,
  "status": "passed"
});
formatter.match({
  "location": "R1_Checkout_Discounts_103_Web.user_expect_discount_text_to_be_present()"
});
formatter.result({
  "duration": 6394625800,
  "status": "passed"
});
formatter.match({
  "location": "R1_Checkout_80_Web.user_click_on_edit_my_cart_link()"
});
formatter.result({
  "duration": 3434354400,
  "status": "passed"
});
formatter.match({
  "location": "R1_Checkout_80_Web.user_click_on_remove_from_cart()"
});
formatter.result({
  "duration": 2699052500,
  "status": "passed"
=======
      "val": "existing_wishlist",
      "offset": 31
    }
  ],
  "location": "R1_HP_K1915_SD.user_create_exsiting_Wishlist(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "R1_HP_K1915_SD.verify_error_message()"
});
formatter.result({
  "status": "skipped"
>>>>>>> f5bcfb54798f18775d019879fc276f7377b53a47
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
<<<<<<< HEAD
  "duration": 960201300,
  "status": "passed"
});
formatter.after({
  "duration": 158600,
=======
  "duration": 1451107400,
  "status": "passed"
});
formatter.after({
  "duration": 1287900,
>>>>>>> f5bcfb54798f18775d019879fc276f7377b53a47
  "status": "passed"
});
formatter.after({
  "duration": 186200,
  "status": "passed"
});
formatter.after({
  "duration": 167300,
  "status": "passed"
});
formatter.before({
  "duration": 180600,
  "status": "passed"
});
formatter.before({
  "duration": 159900,
  "status": "passed"
});
formatter.before({
  "duration": 384300,
  "status": "passed"
});
formatter.before({
  "duration": 297500,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "To verify no Wish list for gift cards and bundles",
  "description": "",
  "id": "to-verify-product-wish-list---signed-in-user-flow-(pdp);to-verify-no-wish-list-for-gift-cards-and-bundles",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@Web"
    },
    {
      "line": 22,
      "name": "@All"
    },
    {
      "line": 22,
      "name": "@C-PDP"
    },
    {
      "line": 22,
      "name": "@Regression"
    },
    {
      "line": 22,
      "name": "@KER-1915"
    },
    {
      "line": 22,
      "name": "@ZYP_HP_K1915-3454"
    },
    {
      "line": 22,
      "name": "@CR-AKK"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "user launches the browser and navigates to \"ASO_HOME\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "user to click on sing in and navigate to sign in page",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "user should be able to enter the signin details \"Login_username\" \"Login_pwd\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User navigates till PLP",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "User click on the product image",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user click on Add WishList link",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ASO_HOME",
      "offset": 44
    }
  ],
  "location": "Common_Web_SD.user_launches_the_browser_and_navigates_to_page(String)"
});
formatter.result({
  "duration": 7384654300,
  "status": "passed"
});
formatter.match({
  "location": "R1_HP_K727_SD.user_to_click_on_sing_in_and_navigate_to_sign_in_page()"
});
formatter.result({
  "duration": 8928994200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login_username",
      "offset": 49
    },
    {
      "val": "Login_pwd",
      "offset": 66
    }
  ],
  "location": "R1_SD_SIT.user_should_be_able_to_enter_the_signin_details(String,String)"
});
formatter.result({
  "duration": 68913664500,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.xpath: //*[@data-auid\u003d\u0027myAccountCta\u0027] (tried for 30 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:81)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:271)\r\n\tat com.aso.qe.framework.common.CommonActionHelper.waitForElement(CommonActionHelper.java:139)\r\n\tat com.aso.qe.test.stepdefinition.web.R1_SD_SIT.user_should_be_able_to_enter_the_signin_details(R1_SD_SIT.java:312)\r\n\tat ✽.And user should be able to enter the signin details \"Login_username\" \"Login_pwd\"(R1_HP_KER_1915_Web.feature:26)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Cannot locate an element using By.xpath: //*[@data-auid\u003d\u0027myAccountCta\u0027]\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027VDI-SQA007E\u0027, ip: \u002710.1.243.108\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.lambda$findElement$0(ExpectedConditions.java:896)\r\n\tat java.util.Optional.orElseThrow(Optional.java:290)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:895)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:44)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:183)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:180)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:248)\r\n\tat com.aso.qe.framework.common.CommonActionHelper.waitForElement(CommonActionHelper.java:139)\r\n\tat com.aso.qe.test.stepdefinition.web.R1_SD_SIT.user_should_be_able_to_enter_the_signin_details(R1_SD_SIT.java:312)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:37)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:298)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:48)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:538)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:760)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:460)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:206)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Common_Web_SD.User_navigates_till_PLP()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "R1_PDP_K2339_SD.user_click_on_the_productimage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "R1_HP_K1915_SD.user_click_on_Add_WishList_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "duration": 1500907000,
  "status": "passed"
});
formatter.after({
  "duration": 1313900,
  "status": "passed"
});
formatter.after({
  "duration": 152800,
  "status": "passed"
});
formatter.after({
  "duration": 162900,
  "status": "passed"
});
formatter.uri("R1_HP_KER_215_Web.feature");
formatter.feature({
  "line": 1,
  "name": "To Verify the functionality of \"ASO - Logo\" in the Global Header",
  "description": "",
  "id": "to-verify-the-functionality-of-\"aso---logo\"-in-the-global-header",
  "keyword": "Feature"
});
formatter.before({
  "duration": 263800,
  "status": "passed"
});
formatter.before({
  "duration": 150500,
  "status": "passed"
});
formatter.before({
  "duration": 2357400,
  "status": "passed"
});
formatter.before({
  "duration": 299800,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "As a user I want to navigate to Home page from PLP",
  "description": "",
  "id": "to-verify-the-functionality-of-\"aso---logo\"-in-the-global-header;as-a-user-i-want-to-navigate-to-home-page-from-plp",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Web"
    },
    {
      "line": 3,
      "name": "@All"
    },
    {
      "line": 3,
      "name": "@C-HP"
    },
    {
      "line": 3,
      "name": "@Regression"
    },
    {
      "line": 3,
      "name": "@KER-215"
    },
    {
      "line": 3,
      "name": "@ZYP_HP_K215-1969"
    },
    {
      "line": 3,
      "name": "@CR-AG"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user launches the browser and navigates to \"ASO_HOME\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User is able to see the ASO_Logo",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ASO_HOME",
      "offset": 44
    }
  ],
  "location": "Common_Web_SD.user_launches_the_browser_and_navigates_to_page(String)"
});
formatter.result({
  "duration": 6887219200,
  "status": "passed"
});
formatter.match({
  "location": "R1_HP_K728_SD.User_is_able_to_see_the_ASO_logo()"
});
formatter.result({
  "duration": 1133407400,
  "status": "passed"
});
formatter.after({
  "duration": 805379300,
  "status": "passed"
});
formatter.after({
  "duration": 991100,
  "status": "passed"
});
formatter.after({
  "duration": 139400,
  "status": "passed"
});
formatter.after({
  "duration": 144600,
  "status": "passed"
});
formatter.uri("R1_HP_KER_244_Web.feature");
formatter.feature({
  "line": 1,
  "name": "[UI] - Verify the UI Behavior for Featured Category Component for Desktop",
  "description": "",
  "id": "[ui]---verify-the-ui-behavior-for-featured-category-component-for-desktop",
  "keyword": "Feature"
});
formatter.before({
  "duration": 189600,
  "status": "passed"
});
formatter.before({
  "duration": 151800,
  "status": "passed"
});
formatter.before({
  "duration": 360800,
  "status": "passed"
});
formatter.before({
  "duration": 316200,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "To verify user able to see Featured Category Component for Desktop",
  "description": "",
  "id": "[ui]---verify-the-ui-behavior-for-featured-category-component-for-desktop;to-verify-user-able-to-see-featured-category-component-for-desktop",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Web"
    },
    {
      "line": 3,
      "name": "@All"
    },
    {
      "line": 3,
      "name": "@C-HP"
    },
    {
      "line": 3,
      "name": "@Regression"
    },
    {
      "line": 3,
      "name": "@KER-244"
    },
    {
      "line": 3,
      "name": "@ZYP_HP_K244-2742"
    },
    {
      "line": 3,
      "name": "@1HR"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user launches the browser and navigates to \"ASO_HOME\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is able to scroll till Featured categroy component",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user is able to see number of category card displayed in a row",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on one of the category card and navigates to category",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ASO_HOME",
      "offset": 44
    }
  ],
  "location": "Common_Web_SD.user_launches_the_browser_and_navigates_to_page(String)"
});
formatter.result({
  "duration": 6659014700,
  "status": "passed"
});
formatter.match({
  "location": "R1_HP_K244_SD.user_is_able_to_scroll_till_Featured_categroy_component()"
});
formatter.result({
  "duration": 6522598100,
  "status": "passed"
});
formatter.match({
  "location": "R1_HP_K244_SD.user_is_able_to_see_number_of_category_card_displayed_in_a_row()"
});
formatter.result({
  "duration": 23564400,
  "status": "passed"
});
formatter.match({
  "location": "R1_HP_K244_SD.user_clicks_on_one_of_the_category_card_and_navigates_to_category()"
});
formatter.result({
  "duration": 34376028600,
  "error_message": "java.lang.AssertionError: expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:513)\r\n\tat org.testng.Assert.assertTrue(Assert.java:42)\r\n\tat org.testng.Assert.assertTrue(Assert.java:52)\r\n\tat com.aso.qe.test.stepdefinition.web.R1_HP_K244_SD.user_clicks_on_one_of_the_category_card_and_navigates_to_category(R1_HP_K244_SD.java:40)\r\n\tat ✽.Then user clicks on one of the category card and navigates to category(R1_HP_KER_244_Web.feature:8)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded3.png");
formatter.after({
  "duration": 2203010400,
  "status": "passed"
});
formatter.after({
  "duration": 2014200,
  "status": "passed"
});
formatter.after({
  "duration": 157700,
  "status": "passed"
});
formatter.after({
  "duration": 139500,
  "status": "passed"
});
formatter.uri("R1_HP_KER_262_Web.feature");
formatter.feature({
  "line": 1,
  "name": "[Desktop]Components - Header",
  "description": "",
  "id": "[desktop]components---header",
  "keyword": "Feature"
});
formatter.before({
  "duration": 208000,
  "status": "passed"
});
formatter.before({
  "duration": 147200,
  "status": "passed"
});
formatter.before({
  "duration": 538100,
  "status": "passed"
});
formatter.before({
  "duration": 297700,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Desktop-To Verify the signout from MyAccount",
  "description": "",
  "id": "[desktop]components---header;desktop-to-verify-the-signout-from-myaccount",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@C-HP"
    },
    {
      "line": 3,
      "name": "@Web"
    },
    {
      "line": 3,
      "name": "@Regression"
    },
    {
      "line": 3,
      "name": "@KER-262"
    },
    {
      "line": 3,
      "name": "@ZYP_HP_K262-4072"
    },
    {
      "line": 3,
      "name": "@CR-RKA"
    },
    {
      "line": 3,
      "name": "@1HR"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user launches the browser and navigates to \"ASO_HOME\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user to click on sing in and navigate to sign in page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should be able to enter the signin details \"Login_username\" \"Login_pwd\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Verify signout from my account",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ASO_HOME",
      "offset": 44
    }
  ],
  "location": "Common_Web_SD.user_launches_the_browser_and_navigates_to_page(String)"
});
formatter.result({
  "duration": 6679967300,
  "status": "passed"
});
formatter.match({
  "location": "R1_HP_K727_SD.user_to_click_on_sing_in_and_navigate_to_sign_in_page()"
});
formatter.result({
  "duration": 9021810000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login_username",
      "offset": 49
    },
    {
      "val": "Login_pwd",
      "offset": 66
    }
  ],
  "location": "R1_SD_SIT.user_should_be_able_to_enter_the_signin_details(String,String)"
});
formatter.result({
  "duration": 68530031400,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.xpath: //*[@data-auid\u003d\u0027myAccountCta\u0027] (tried for 30 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:81)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:271)\r\n\tat com.aso.qe.framework.common.CommonActionHelper.waitForElement(CommonActionHelper.java:139)\r\n\tat com.aso.qe.test.stepdefinition.web.R1_SD_SIT.user_should_be_able_to_enter_the_signin_details(R1_SD_SIT.java:312)\r\n\tat ✽.And user should be able to enter the signin details \"Login_username\" \"Login_pwd\"(R1_HP_KER_262_Web.feature:7)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Cannot locate an element using By.xpath: //*[@data-auid\u003d\u0027myAccountCta\u0027]\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027VDI-SQA007E\u0027, ip: \u002710.1.243.108\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.lambda$findElement$0(ExpectedConditions.java:896)\r\n\tat java.util.Optional.orElseThrow(Optional.java:290)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:895)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:44)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:183)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:180)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:248)\r\n\tat com.aso.qe.framework.common.CommonActionHelper.waitForElement(CommonActionHelper.java:139)\r\n\tat com.aso.qe.test.stepdefinition.web.R1_SD_SIT.user_should_be_able_to_enter_the_signin_details(R1_SD_SIT.java:312)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:37)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:298)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:48)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:538)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:760)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:460)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:206)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "R1_HP_K262_Global_Header_SD.verify_signout_from_my_account()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded4.png");
formatter.after({
  "duration": 1421588500,
  "status": "passed"
});
formatter.after({
  "duration": 1945700,
  "status": "passed"
});
formatter.after({
  "duration": 129000,
  "status": "passed"
});
formatter.after({
  "duration": 134800,
  "status": "passed"
});
formatter.before({
  "duration": 1912500,
  "status": "passed"
});
formatter.before({
  "duration": 149500,
  "status": "passed"
});
formatter.before({
  "duration": 316000,
  "status": "passed"
});
formatter.before({
  "duration": 294000,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Desktop- To Verify user is able to Sign In with Valid user name and password by clicking in Sign In Link in the global header",
  "description": "",
  "id": "[desktop]components---header;desktop--to-verify-user-is-able-to-sign-in-with-valid-user-name-and-password-by-clicking-in-sign-in-link-in-the-global-header",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@C-HP"
    },
    {
      "line": 10,
      "name": "@Web"
    },
    {
      "line": 10,
      "name": "@Regression"
    },
    {
      "line": 10,
      "name": "@KER-262"
    },
    {
      "line": 10,
      "name": "@ZYP_HP_K262-1972"
    },
    {
      "line": 10,
      "name": "@CR-RKA"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user launches the browser and navigates to \"ASO_HOME\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user to click on sing in and navigate to sign in page",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user should be able to enter the signin details \"Login_username\" \"Login_pwd\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "verify user to navigate to account summary page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ASO_HOME",
      "offset": 44
    }
  ],
  "location": "Common_Web_SD.user_launches_the_browser_and_navigates_to_page(String)"
});
formatter.result({
  "duration": 7019804900,
  "status": "passed"
});
formatter.match({
  "location": "R1_HP_K727_SD.user_to_click_on_sing_in_and_navigate_to_sign_in_page()"
});
formatter.result({
  "duration": 8414762800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login_username",
      "offset": 49
    },
    {
      "val": "Login_pwd",
      "offset": 66
    }
  ],
  "location": "R1_SD_SIT.user_should_be_able_to_enter_the_signin_details(String,String)"
});
formatter.result({
  "duration": 69001771800,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.xpath: //*[@data-auid\u003d\u0027myAccountCta\u0027] (tried for 30 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:81)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:271)\r\n\tat com.aso.qe.framework.common.CommonActionHelper.waitForElement(CommonActionHelper.java:139)\r\n\tat com.aso.qe.test.stepdefinition.web.R1_SD_SIT.user_should_be_able_to_enter_the_signin_details(R1_SD_SIT.java:312)\r\n\tat ✽.And user should be able to enter the signin details \"Login_username\" \"Login_pwd\"(R1_HP_KER_262_Web.feature:14)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Cannot locate an element using By.xpath: //*[@data-auid\u003d\u0027myAccountCta\u0027]\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027VDI-SQA007E\u0027, ip: \u002710.1.243.108\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.lambda$findElement$0(ExpectedConditions.java:896)\r\n\tat java.util.Optional.orElseThrow(Optional.java:290)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:895)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:44)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:183)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:180)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:248)\r\n\tat com.aso.qe.framework.common.CommonActionHelper.waitForElement(CommonActionHelper.java:139)\r\n\tat com.aso.qe.test.stepdefinition.web.R1_SD_SIT.user_should_be_able_to_enter_the_signin_details(R1_SD_SIT.java:312)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:37)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:298)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:48)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:538)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:760)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:460)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:206)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "R1_HP_K727_SD.verify_user_to_navigate_to_account_summary_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded5.png");
formatter.after({
  "duration": 1414616300,
  "status": "passed"
});
formatter.after({
  "duration": 1267700,
  "status": "passed"
});
formatter.after({
  "duration": 128500,
  "status": "passed"
});
formatter.after({
  "duration": 131000,
  "status": "passed"
});
formatter.before({
  "duration": 145400,
  "status": "passed"
});
formatter.before({
  "duration": 132300,
  "status": "passed"
});
formatter.before({
  "duration": 468500,
  "status": "passed"
});
formatter.before({
  "duration": 3883200,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "user to verify sing in  as invalid email address",
  "description": "",
  "id": "[desktop]components---header;user-to-verify-sing-in--as-invalid-email-address",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@C-HP"
    },
    {
      "line": 18,
      "name": "@Web"
    },
    {
      "line": 18,
      "name": "@Regression"
    },
    {
      "line": 18,
      "name": "@KER-262"
    },
    {
      "line": 18,
      "name": "@ZYP_HP_K262-4055"
    },
    {
      "line": 18,
      "name": "@CR-RKA"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "user launches the browser and navigates to \"ASO_HOME\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "user to click on sing in and navigate to sign in page",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user should be able to enter the signin details \"Wrong_username\" \"Login_pwd\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "verify the validation message as incorrect",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ASO_HOME",
      "offset": 44
    }
  ],
  "location": "Common_Web_SD.user_launches_the_browser_and_navigates_to_page(String)"
});
formatter.result({
  "duration": 7302594900,
  "status": "passed"
});
formatter.match({
  "location": "R1_HP_K727_SD.user_to_click_on_sing_in_and_navigate_to_sign_in_page()"
});
formatter.result({
  "duration": 8878869800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Wrong_username",
      "offset": 49
    },
    {
      "val": "Login_pwd",
      "offset": 66
    }
  ],
  "location": "R1_SD_SIT.user_should_be_able_to_enter_the_signin_details(String,String)"
});
formatter.result({
  "duration": 68840002100,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.xpath: //*[@data-auid\u003d\u0027myAccountCta\u0027] (tried for 30 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:81)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:271)\r\n\tat com.aso.qe.framework.common.CommonActionHelper.waitForElement(CommonActionHelper.java:139)\r\n\tat com.aso.qe.test.stepdefinition.web.R1_SD_SIT.user_should_be_able_to_enter_the_signin_details(R1_SD_SIT.java:312)\r\n\tat ✽.And user should be able to enter the signin details \"Wrong_username\" \"Login_pwd\"(R1_HP_KER_262_Web.feature:22)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Cannot locate an element using By.xpath: //*[@data-auid\u003d\u0027myAccountCta\u0027]\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027VDI-SQA007E\u0027, ip: \u002710.1.243.108\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.lambda$findElement$0(ExpectedConditions.java:896)\r\n\tat java.util.Optional.orElseThrow(Optional.java:290)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:895)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:44)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:183)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:180)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:248)\r\n\tat com.aso.qe.framework.common.CommonActionHelper.waitForElement(CommonActionHelper.java:139)\r\n\tat com.aso.qe.test.stepdefinition.web.R1_SD_SIT.user_should_be_able_to_enter_the_signin_details(R1_SD_SIT.java:312)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:37)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:298)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:48)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:538)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:760)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:460)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:206)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "R1_HP_K727_SD.verify_the_validation_message_as_incorrect()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded6.png");
formatter.after({
  "duration": 1451273500,
  "status": "passed"
});
formatter.after({
  "duration": 1266000,
  "status": "passed"
});
formatter.after({
  "duration": 132900,
  "status": "passed"
});
formatter.after({
  "duration": 136300,
  "status": "passed"
});
formatter.before({
  "duration": 200300,
  "status": "passed"
});
formatter.before({
  "duration": 146400,
  "status": "passed"
});
formatter.before({
  "duration": 308300,
  "status": "passed"
});
formatter.before({
  "duration": 280700,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "user to verify sing in  as invalid password address",
  "description": "",
  "id": "[desktop]components---header;user-to-verify-sing-in--as-invalid-password-address",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@C-HP"
    },
    {
      "line": 26,
      "name": "@Web"
    },
    {
      "line": 26,
      "name": "@Regression"
    },
    {
      "line": 26,
      "name": "@KER-262"
    },
    {
      "line": 26,
      "name": "@ZYP_HP_K262-4061"
    },
    {
      "line": 26,
      "name": "@CR-RKA"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "user launches the browser and navigates to \"ASO_HOME\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "user to click on sing in and navigate to sign in page",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user should be able to enter the signin details \"Login_username\" \"Wrong_password\"",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "verify the validation message as incorrect",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ASO_HOME",
      "offset": 44
    }
  ],
  "location": "Common_Web_SD.user_launches_the_browser_and_navigates_to_page(String)"
});
formatter.result({
  "duration": 6239602600,
  "status": "passed"
});
formatter.match({
  "location": "R1_HP_K727_SD.user_to_click_on_sing_in_and_navigate_to_sign_in_page()"
});
formatter.result({
  "duration": 8486819200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login_username",
      "offset": 49
    },
    {
      "val": "Wrong_password",
      "offset": 66
    }
  ],
  "location": "R1_SD_SIT.user_should_be_able_to_enter_the_signin_details(String,String)"
});
formatter.result({
  "duration": 69023801500,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.xpath: //*[@data-auid\u003d\u0027myAccountCta\u0027] (tried for 30 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:81)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:271)\r\n\tat com.aso.qe.framework.common.CommonActionHelper.waitForElement(CommonActionHelper.java:139)\r\n\tat com.aso.qe.test.stepdefinition.web.R1_SD_SIT.user_should_be_able_to_enter_the_signin_details(R1_SD_SIT.java:312)\r\n\tat ✽.And user should be able to enter the signin details \"Login_username\" \"Wrong_password\"(R1_HP_KER_262_Web.feature:30)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Cannot locate an element using By.xpath: //*[@data-auid\u003d\u0027myAccountCta\u0027]\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027VDI-SQA007E\u0027, ip: \u002710.1.243.108\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.lambda$findElement$0(ExpectedConditions.java:896)\r\n\tat java.util.Optional.orElseThrow(Optional.java:290)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:895)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:44)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:183)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:180)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:248)\r\n\tat com.aso.qe.framework.common.CommonActionHelper.waitForElement(CommonActionHelper.java:139)\r\n\tat com.aso.qe.test.stepdefinition.web.R1_SD_SIT.user_should_be_able_to_enter_the_signin_details(R1_SD_SIT.java:312)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:37)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:298)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:48)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:538)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:760)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:460)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:206)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "R1_HP_K727_SD.verify_the_validation_message_as_incorrect()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded7.png");
formatter.after({
  "duration": 1455129500,
  "status": "passed"
});
formatter.after({
  "duration": 1193700,
  "status": "passed"
});
formatter.after({
  "duration": 119300,
  "status": "passed"
});
formatter.after({
  "duration": 123900,
  "status": "passed"
});
formatter.before({
  "duration": 243700,
  "status": "passed"
});
formatter.before({
  "duration": 138900,
  "status": "passed"
});
formatter.before({
  "duration": 305300,
  "status": "passed"
});
formatter.before({
  "duration": 293600,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "user to very sign in by keeping username and password empty and clicking on signin",
  "description": "",
  "id": "[desktop]components---header;user-to-very-sign-in-by-keeping-username-and-password-empty-and-clicking-on-signin",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 34,
      "name": "@C-HP"
    },
    {
      "line": 34,
      "name": "@Web"
    },
    {
      "line": 34,
      "name": "@Regression"
    },
    {
      "line": 34,
      "name": "@KER-262"
    },
    {
      "line": 34,
      "name": "@ZYP_HP_K262-4063"
    },
    {
      "line": 34,
      "name": "@CR-RKA"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "user launches the browser and navigates to \"ASO_HOME\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "user to click on sing in and navigate to sign in page",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "click sign in",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "verify enter email and password message to come",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ASO_HOME",
      "offset": 44
    }
  ],
  "location": "Common_Web_SD.user_launches_the_browser_and_navigates_to_page(String)"
});
formatter.result({
  "duration": 6356852700,
  "status": "passed"
});
formatter.match({
  "location": "R1_HP_K727_SD.user_to_click_on_sing_in_and_navigate_to_sign_in_page()"
});
formatter.result({
  "duration": 9002810800,
  "status": "passed"
});
formatter.match({
  "location": "R1_HP_K727_SD.click_sign_in()"
});
formatter.result({
  "duration": 7708723800,
  "status": "passed"
});
formatter.match({
  "location": "R1_HP_K727_SD.verify_enter_email_and_password_message_to_come()"
});
formatter.result({
  "duration": 6201340100,
  "status": "passed"
});
formatter.after({
  "duration": 778762100,
  "status": "passed"
});
formatter.after({
  "duration": 1020800,
  "status": "passed"
});
formatter.after({
  "duration": 127900,
  "status": "passed"
});
formatter.after({
  "duration": 129100,
  "status": "passed"
});
formatter.before({
  "duration": 176700,
  "status": "passed"
});
formatter.before({
  "duration": 131000,
  "status": "passed"
});
formatter.before({
  "duration": 339500,
  "status": "passed"
});
formatter.before({
  "duration": 277800,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "Desktop-Verify the forgot your password functionality",
  "description": "",
  "id": "[desktop]components---header;desktop-verify-the-forgot-your-password-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 41,
      "name": "@C-HP"
    },
    {
      "line": 41,
      "name": "@Web"
    },
    {
      "line": 41,
      "name": "@Regression"
    },
    {
      "line": 41,
      "name": "@KER-262"
    },
    {
      "line": 41,
      "name": "@ZYP_HP_K262-4065"
    },
    {
      "line": 41,
      "name": "@CR-RKA"
    }
  ]
});
formatter.step({
  "line": 43,
  "name": "user launches the browser and navigates to \"ASO_HOME\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 44,
  "name": "user to click on sing in and navigate to sign in page",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "user to be able to click forget password",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "user to enter email",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "verify user to click submit button",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ASO_HOME",
      "offset": 44
    }
  ],
  "location": "Common_Web_SD.user_launches_the_browser_and_navigates_to_page(String)"
});
formatter.result({
  "duration": 6800518000,
  "status": "passed"
});
formatter.match({
  "location": "R1_HP_K727_SD.user_to_click_on_sing_in_and_navigate_to_sign_in_page()"
});
formatter.result({
  "duration": 8474633300,
  "status": "passed"
});
formatter.match({
  "location": "R1_HP_K727_SD.user_to_be_able_to_click_forget_password()"
});
formatter.result({
  "duration": 2735343100,
  "status": "passed"
});
formatter.match({
  "location": "R1_HP_K727_SD.user_to_enter_email()"
});
formatter.result({
  "duration": 1208824900,
  "status": "passed"
});
formatter.match({
  "location": "R1_HP_K727_SD.verify_user_to_click_submit_button()"
});
formatter.result({
  "duration": 2283394900,
  "status": "passed"
});
formatter.after({
  "duration": 772181800,
  "status": "passed"
});
formatter.after({
  "duration": 776100,
  "status": "passed"
});
formatter.after({
  "duration": 134900,
  "status": "passed"
});
formatter.after({
  "duration": 152200,
  "status": "passed"
});
formatter.before({
  "duration": 143900,
  "status": "passed"
});
formatter.before({
  "duration": 127900,
  "status": "passed"
});
formatter.before({
  "duration": 278600,
  "status": "passed"
});
formatter.before({
  "duration": 264600,
  "status": "passed"
});
formatter.scenario({
  "line": 50,
  "name": "user to verify personal information  form My Account",
  "description": "",
  "id": "[desktop]components---header;user-to-verify-personal-information--form-my-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 49,
      "name": "@C-HP"
    },
    {
      "line": 49,
      "name": "@Web"
    },
    {
      "line": 49,
      "name": "@Regression"
    },
    {
      "line": 49,
      "name": "@KER-262"
    },
    {
      "line": 49,
      "name": "@ZYP_HP_K262-4067"
    },
    {
      "line": 49,
      "name": "@CR-RKA"
    }
  ]
});
formatter.step({
  "line": 51,
  "name": "user launches the browser and navigates to \"ASO_HOME\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 52,
  "name": "user to click on sing in and navigate to sign in page",
  "keyword": "When "
});
formatter.step({
  "line": 53,
  "name": "user should be able to enter the signin details \"Login_username\" \"Login_pwd\"",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "verify personal information form My Account",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ASO_HOME",
      "offset": 44
    }
  ],
  "location": "Common_Web_SD.user_launches_the_browser_and_navigates_to_page(String)"
});
formatter.result({
  "duration": 6198801900,
  "status": "passed"
});
formatter.match({
  "location": "R1_HP_K727_SD.user_to_click_on_sing_in_and_navigate_to_sign_in_page()"
});
formatter.result({
  "duration": 8155555000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login_username",
      "offset": 49
    },
    {
      "val": "Login_pwd",
      "offset": 66
    }
  ],
  "location": "R1_SD_SIT.user_should_be_able_to_enter_the_signin_details(String,String)"
});
formatter.result({
  "duration": 69069057300,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.xpath: //*[@data-auid\u003d\u0027myAccountCta\u0027] (tried for 30 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:81)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:271)\r\n\tat com.aso.qe.framework.common.CommonActionHelper.waitForElement(CommonActionHelper.java:139)\r\n\tat com.aso.qe.test.stepdefinition.web.R1_SD_SIT.user_should_be_able_to_enter_the_signin_details(R1_SD_SIT.java:312)\r\n\tat ✽.And user should be able to enter the signin details \"Login_username\" \"Login_pwd\"(R1_HP_KER_262_Web.feature:53)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Cannot locate an element using By.xpath: //*[@data-auid\u003d\u0027myAccountCta\u0027]\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027VDI-SQA007E\u0027, ip: \u002710.1.243.108\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.lambda$findElement$0(ExpectedConditions.java:896)\r\n\tat java.util.Optional.orElseThrow(Optional.java:290)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:895)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:44)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:183)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:180)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:248)\r\n\tat com.aso.qe.framework.common.CommonActionHelper.waitForElement(CommonActionHelper.java:139)\r\n\tat com.aso.qe.test.stepdefinition.web.R1_SD_SIT.user_should_be_able_to_enter_the_signin_details(R1_SD_SIT.java:312)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:37)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:298)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:48)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:538)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:760)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:460)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:206)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "R1_HP_K727_SD.verify_personal_information_form_My_Account()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded8.png");
formatter.after({
  "duration": 1465685600,
  "status": "passed"
});
formatter.after({
  "duration": 1273700,
  "status": "passed"
});
formatter.after({
  "duration": 133600,
  "status": "passed"
});
formatter.after({
  "duration": 149600,
  "status": "passed"
});
formatter.before({
  "duration": 377600,
  "status": "passed"
});
formatter.before({
  "duration": 222400,
  "status": "passed"
});
formatter.before({
  "duration": 416300,
  "status": "passed"
});
formatter.before({
  "duration": 1493400,
  "status": "passed"
});
formatter.scenario({
  "line": 58,
  "name": "user to verify Address book  form My Account",
  "description": "",
  "id": "[desktop]components---header;user-to-verify-address-book--form-my-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 57,
      "name": "@C-HP"
    },
    {
      "line": 57,
      "name": "@Web"
    },
    {
      "line": 57,
      "name": "@Regression"
    },
    {
      "line": 57,
      "name": "@KER-262"
    },
    {
      "line": 57,
      "name": "@ZYP_HP_K262-4069"
    },
    {
      "line": 57,
      "name": "@CR-RKA"
    }
  ]
});
formatter.step({
  "line": 59,
  "name": "user launches the browser and navigates to \"ASO_HOME\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 60,
  "name": "user to click on sing in and navigate to sign in page",
  "keyword": "When "
});
formatter.step({
  "line": 61,
  "name": "user should be able to enter the signin details \"Login_username\" \"Login_pwd\"",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "verify Address book form My Account",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ASO_HOME",
      "offset": 44
    }
  ],
  "location": "Common_Web_SD.user_launches_the_browser_and_navigates_to_page(String)"
});
formatter.result({
  "duration": 6617890500,
  "status": "passed"
});
formatter.match({
  "location": "R1_HP_K727_SD.user_to_click_on_sing_in_and_navigate_to_sign_in_page()"
});
formatter.result({
  "duration": 8499947100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login_username",
      "offset": 49
    },
    {
      "val": "Login_pwd",
      "offset": 66
    }
  ],
  "location": "R1_SD_SIT.user_should_be_able_to_enter_the_signin_details(String,String)"
});
formatter.result({
  "duration": 68973141600,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.xpath: //*[@data-auid\u003d\u0027myAccountCta\u0027] (tried for 30 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:81)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:271)\r\n\tat com.aso.qe.framework.common.CommonActionHelper.waitForElement(CommonActionHelper.java:139)\r\n\tat com.aso.qe.test.stepdefinition.web.R1_SD_SIT.user_should_be_able_to_enter_the_signin_details(R1_SD_SIT.java:312)\r\n\tat ✽.And user should be able to enter the signin details \"Login_username\" \"Login_pwd\"(R1_HP_KER_262_Web.feature:61)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Cannot locate an element using By.xpath: //*[@data-auid\u003d\u0027myAccountCta\u0027]\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027VDI-SQA007E\u0027, ip: \u002710.1.243.108\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.lambda$findElement$0(ExpectedConditions.java:896)\r\n\tat java.util.Optional.orElseThrow(Optional.java:290)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:895)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:44)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:183)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:180)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:248)\r\n\tat com.aso.qe.framework.common.CommonActionHelper.waitForElement(CommonActionHelper.java:139)\r\n\tat com.aso.qe.test.stepdefinition.web.R1_SD_SIT.user_should_be_able_to_enter_the_signin_details(R1_SD_SIT.java:312)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:37)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:298)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:48)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:538)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:760)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:460)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:206)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "R1_HP_K727_SD.verify_Address_book_form_My_Account()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded9.png");
formatter.after({
  "duration": 1523034100,
  "status": "passed"
});
formatter.after({
  "duration": 1130700,
  "status": "passed"
});
formatter.after({
  "duration": 108600,
  "status": "passed"
});
formatter.after({
  "duration": 107300,
  "status": "passed"
});
formatter.before({
  "duration": 165800,
  "status": "passed"
});
formatter.before({
  "duration": 147400,
  "status": "passed"
});
formatter.before({
  "duration": 265000,
  "status": "passed"
});
formatter.before({
  "duration": 264900,
  "status": "passed"
});
formatter.scenario({
  "line": 65,
  "name": "user to verify WishList form My Account",
  "description": "",
  "id": "[desktop]components---header;user-to-verify-wishlist-form-my-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 64,
      "name": "@C-HP"
    },
    {
      "line": 64,
      "name": "@Web"
    },
    {
      "line": 64,
      "name": "@Regression"
    },
    {
      "line": 64,
      "name": "@KER-262"
    },
    {
      "line": 64,
      "name": "@ZYP_HP_K262-4070"
    },
    {
      "line": 64,
      "name": "@CR-RKA"
    }
  ]
});
formatter.step({
  "line": 66,
  "name": "user launches the browser and navigates to \"ASO_HOME\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 67,
  "name": "user to click on sing in and navigate to sign in page",
  "keyword": "When "
});
formatter.step({
  "line": 68,
  "name": "user should be able to enter the signin details \"Login_username\" \"Login_pwd\"",
  "keyword": "And "
});
formatter.step({
  "line": 69,
  "name": "verify , WishList form My Account",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ASO_HOME",
      "offset": 44
    }
  ],
  "location": "Common_Web_SD.user_launches_the_browser_and_navigates_to_page(String)"
});
formatter.result({
  "duration": 6761782100,
  "status": "passed"
});
formatter.match({
  "location": "R1_HP_K727_SD.user_to_click_on_sing_in_and_navigate_to_sign_in_page()"
});
formatter.result({
  "duration": 12218524800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login_username",
      "offset": 49
    },
    {
      "val": "Login_pwd",
      "offset": 66
    }
  ],
  "location": "R1_SD_SIT.user_should_be_able_to_enter_the_signin_details(String,String)"
});
formatter.result({
  "duration": 69351330000,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.xpath: //*[@data-auid\u003d\u0027myAccountCta\u0027] (tried for 30 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:81)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:271)\r\n\tat com.aso.qe.framework.common.CommonActionHelper.waitForElement(CommonActionHelper.java:139)\r\n\tat com.aso.qe.test.stepdefinition.web.R1_SD_SIT.user_should_be_able_to_enter_the_signin_details(R1_SD_SIT.java:312)\r\n\tat ✽.And user should be able to enter the signin details \"Login_username\" \"Login_pwd\"(R1_HP_KER_262_Web.feature:68)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Cannot locate an element using By.xpath: //*[@data-auid\u003d\u0027myAccountCta\u0027]\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027VDI-SQA007E\u0027, ip: \u002710.1.243.108\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.lambda$findElement$0(ExpectedConditions.java:896)\r\n\tat java.util.Optional.orElseThrow(Optional.java:290)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:895)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:44)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:183)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:180)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:248)\r\n\tat com.aso.qe.framework.common.CommonActionHelper.waitForElement(CommonActionHelper.java:139)\r\n\tat com.aso.qe.test.stepdefinition.web.R1_SD_SIT.user_should_be_able_to_enter_the_signin_details(R1_SD_SIT.java:312)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:37)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:298)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:48)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:538)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:760)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:460)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:206)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "R1_HP_K727_SD.verify_WishList_form_My_Account()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded10.png");
formatter.after({
  "duration": 1465052300,
  "status": "passed"
});
formatter.after({
  "duration": 1318800,
  "status": "passed"
});
formatter.after({
  "duration": 155200,
  "status": "passed"
});
formatter.after({
  "duration": 133700,
  "status": "passed"
});
formatter.before({
  "duration": 689600,
  "status": "passed"
});
formatter.before({
  "duration": 514800,
  "status": "passed"
});
formatter.before({
  "duration": 593200,
  "status": "passed"
});
formatter.before({
  "duration": 499100,
  "status": "passed"
});
formatter.scenario({
  "line": 73,
  "name": "Desktop-Verify the Account Summary details from MyAccount",
  "description": "",
  "id": "[desktop]components---header;desktop-verify-the-account-summary-details-from-myaccount",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 72,
      "name": "@C-HP"
    },
    {
      "line": 72,
      "name": "@Web"
    },
    {
      "line": 72,
      "name": "@Regression"
    },
    {
      "line": 72,
      "name": "@KER-262"
    },
    {
      "line": 72,
      "name": "@ZYP_HP_K262-4066"
    },
    {
      "line": 72,
      "name": "@CR-RKA"
    }
  ]
});
formatter.step({
  "line": 74,
  "name": "user launches the browser and navigates to \"ASO_HOME\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 75,
  "name": "user to click on sing in and navigate to sign in page",
  "keyword": "When "
});
formatter.step({
  "line": 76,
  "name": "user should be able to enter the signin details \"Login_username\" \"Login_pwd\"",
  "keyword": "And "
});
formatter.step({
  "line": 77,
  "name": "user navigates to profile in my account",
  "keyword": "And "
});
formatter.step({
  "line": 78,
  "name": "verify account summary detail from my account",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ASO_HOME",
      "offset": 44
    }
  ],
  "location": "Common_Web_SD.user_launches_the_browser_and_navigates_to_page(String)"
});
formatter.result({
  "duration": 6965306200,
  "status": "passed"
});
formatter.match({
  "location": "R1_HP_K727_SD.user_to_click_on_sing_in_and_navigate_to_sign_in_page()"
});
formatter.result({
  "duration": 8797347100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login_username",
      "offset": 49
    },
    {
      "val": "Login_pwd",
      "offset": 66
    }
  ],
  "location": "R1_SD_SIT.user_should_be_able_to_enter_the_signin_details(String,String)"
});
formatter.result({
  "duration": 68981396900,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.xpath: //*[@data-auid\u003d\u0027myAccountCta\u0027] (tried for 30 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:81)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:271)\r\n\tat com.aso.qe.framework.common.CommonActionHelper.waitForElement(CommonActionHelper.java:139)\r\n\tat com.aso.qe.test.stepdefinition.web.R1_SD_SIT.user_should_be_able_to_enter_the_signin_details(R1_SD_SIT.java:312)\r\n\tat ✽.And user should be able to enter the signin details \"Login_username\" \"Login_pwd\"(R1_HP_KER_262_Web.feature:76)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Cannot locate an element using By.xpath: //*[@data-auid\u003d\u0027myAccountCta\u0027]\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027VDI-SQA007E\u0027, ip: \u002710.1.243.108\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.lambda$findElement$0(ExpectedConditions.java:896)\r\n\tat java.util.Optional.orElseThrow(Optional.java:290)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:895)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:44)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:183)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:180)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:248)\r\n\tat com.aso.qe.framework.common.CommonActionHelper.waitForElement(CommonActionHelper.java:139)\r\n\tat com.aso.qe.test.stepdefinition.web.R1_SD_SIT.user_should_be_able_to_enter_the_signin_details(R1_SD_SIT.java:312)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:37)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:298)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:48)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:538)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:760)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:460)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:206)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "R2_MYACCOUNT_K4229_SD.user_navigates_to_profile_in_my_account()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "R1_HP_K262_Global_Header_SD.verify_account_summary_detail_from_my_account()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded11.png");
formatter.after({
  "duration": 1500641400,
  "status": "passed"
});
formatter.after({
  "duration": 1569900,
  "status": "passed"
});
formatter.after({
  "duration": 331500,
  "status": "passed"
});
formatter.after({
  "duration": 325200,
  "status": "passed"
});
formatter.before({
  "duration": 157600,
  "status": "passed"
});
formatter.before({
  "duration": 156200,
  "status": "passed"
});
formatter.before({
  "duration": 267000,
  "status": "passed"
});
formatter.before({
  "duration": 277100,
  "status": "passed"
});
formatter.scenario({
  "line": 82,
  "name": "Verify that the store details are displayed for guest user",
  "description": "",
  "id": "[desktop]components---header;verify-that-the-store-details-are-displayed-for-guest-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 81,
      "name": "@Web"
    },
    {
      "line": 81,
      "name": "@All"
    },
    {
      "line": 81,
      "name": "@C-HP"
    },
    {
      "line": 81,
      "name": "@Regression"
    },
    {
      "line": 81,
      "name": "@KER-262"
    },
    {
      "line": 81,
      "name": "@ZYP_HP_K262-2729"
    },
    {
      "line": 81,
      "name": "@CR-RKA"
    }
  ]
});
formatter.step({
  "line": 83,
  "name": "user launches the browser and navigates to \"ASO_HOME\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 84,
  "name": "User should be able to click on Find Store",
  "keyword": "Then "
});
formatter.step({
  "line": 85,
  "name": "User select store with \"Postal_Code\"",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "ASO_HOME",
      "offset": 44
    }
  ],
  "location": "Common_Web_SD.user_launches_the_browser_and_navigates_to_page(String)"
});
formatter.result({
  "duration": 6605957300,
  "status": "passed"
});
formatter.match({
  "location": "R1_HP_K730_SD.User_should_be_able_to_see_Find_Store()"
});
formatter.result({
  "duration": 5391798200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Postal_Code",
      "offset": 24
    }
  ],
  "location": "R1_HP_K730_SD.User_select_store_with(String)"
});
formatter.result({
  "duration": 30370792600,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.xpath: //input[@name\u003d\u0027zipcode\u0027] | //*[@data-auid\u003d\u0027find-a-store\u0027]/input (tried for 30 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:81)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:271)\r\n\tat com.aso.qe.framework.common.CommonActionHelper.waitForElement(CommonActionHelper.java:139)\r\n\tat com.aso.qe.test.pageobject.R1_FindStore_PO.selectAStore(R1_FindStore_PO.java:70)\r\n\tat com.aso.qe.test.stepdefinition.web.R1_HP_K730_SD.User_select_store_with(R1_HP_K730_SD.java:58)\r\n\tat ✽.When User select store with \"Postal_Code\"(R1_HP_KER_262_Web.feature:85)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Cannot locate an element using By.xpath: //input[@name\u003d\u0027zipcode\u0027] | //*[@data-auid\u003d\u0027find-a-store\u0027]/input\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027VDI-SQA007E\u0027, ip: \u002710.1.243.108\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.lambda$findElement$0(ExpectedConditions.java:896)\r\n\tat java.util.Optional.orElseThrow(Optional.java:290)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:895)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:44)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:183)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:180)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:248)\r\n\tat com.aso.qe.framework.common.CommonActionHelper.waitForElement(CommonActionHelper.java:139)\r\n\tat com.aso.qe.test.pageobject.R1_FindStore_PO.selectAStore(R1_FindStore_PO.java:70)\r\n\tat com.aso.qe.test.stepdefinition.web.R1_HP_K730_SD.User_select_store_with(R1_HP_K730_SD.java:58)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:37)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:298)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:48)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:538)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:760)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:460)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:206)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded12.png");
formatter.after({
  "duration": 3507389400,
  "status": "passed"
});
formatter.after({
  "duration": 2140100,
  "status": "passed"
});
formatter.after({
  "duration": 216100,
  "status": "passed"
});
formatter.after({
  "duration": 222100,
  "status": "passed"
});
formatter.before({
  "duration": 210500,
  "status": "passed"
});
formatter.before({
  "duration": 204100,
  "status": "passed"
});
formatter.before({
  "duration": 434800,
  "status": "passed"
});
formatter.before({
  "duration": 427200,
  "status": "passed"
});
formatter.scenario({
  "line": 89,
  "name": "Verify that the store details are displayed for guest user",
  "description": "",
  "id": "[desktop]components---header;verify-that-the-store-details-are-displayed-for-guest-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 88,
      "name": "@Web"
    },
    {
      "line": 88,
      "name": "@All"
    },
    {
      "line": 88,
      "name": "@C-HP"
    },
    {
      "line": 88,
      "name": "@Regression"
    },
    {
      "line": 88,
      "name": "@KER-262"
    },
    {
      "line": 88,
      "name": "@ZYP_HP_K262-2730"
    },
    {
      "line": 88,
      "name": "@CR-RKA"
    }
  ]
});
formatter.step({
  "line": 90,
  "name": "user launches the browser and navigates to \"ASO_HOME\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 91,
  "name": "User should be able to click on Find Store",
  "keyword": "Then "
});
formatter.step({
  "line": 92,
  "name": "User select store with \"Postal_Code\"",
  "keyword": "When "
});
formatter.step({
  "line": 93,
  "name": "User verify hour of operation display in the place of find a store link",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ASO_HOME",
      "offset": 44
    }
  ],
  "location": "Common_Web_SD.user_launches_the_browser_and_navigates_to_page(String)"
});
formatter.result({
  "duration": 6871665800,
  "status": "passed"
});
formatter.match({
  "location": "R1_HP_K730_SD.User_should_be_able_to_see_Find_Store()"
});
formatter.result({
  "duration": 5401957200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Postal_Code",
      "offset": 24
    }
  ],
  "location": "R1_HP_K730_SD.User_select_store_with(String)"
});
formatter.result({
  "duration": 30245426300,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.xpath: //input[@name\u003d\u0027zipcode\u0027] | //*[@data-auid\u003d\u0027find-a-store\u0027]/input (tried for 30 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:81)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:271)\r\n\tat com.aso.qe.framework.common.CommonActionHelper.waitForElement(CommonActionHelper.java:139)\r\n\tat com.aso.qe.test.pageobject.R1_FindStore_PO.selectAStore(R1_FindStore_PO.java:70)\r\n\tat com.aso.qe.test.stepdefinition.web.R1_HP_K730_SD.User_select_store_with(R1_HP_K730_SD.java:58)\r\n\tat ✽.When User select store with \"Postal_Code\"(R1_HP_KER_262_Web.feature:92)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Cannot locate an element using By.xpath: //input[@name\u003d\u0027zipcode\u0027] | //*[@data-auid\u003d\u0027find-a-store\u0027]/input\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027VDI-SQA007E\u0027, ip: \u002710.1.243.108\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.lambda$findElement$0(ExpectedConditions.java:896)\r\n\tat java.util.Optional.orElseThrow(Optional.java:290)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:895)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:44)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:183)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:180)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:248)\r\n\tat com.aso.qe.framework.common.CommonActionHelper.waitForElement(CommonActionHelper.java:139)\r\n\tat com.aso.qe.test.pageobject.R1_FindStore_PO.selectAStore(R1_FindStore_PO.java:70)\r\n\tat com.aso.qe.test.stepdefinition.web.R1_HP_K730_SD.User_select_store_with(R1_HP_K730_SD.java:58)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:37)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:298)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:48)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:538)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:760)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:460)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:206)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "R1_HP_K262_Global_Header_SD.user_verify_hour_of_operation_display_in_the_place_of_find_a_store_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded13.png");
formatter.after({
  "duration": 3423054700,
  "status": "passed"
});
formatter.after({
  "duration": 1262400,
  "status": "passed"
});
formatter.after({
  "duration": 123600,
  "status": "passed"
});
formatter.after({
  "duration": 120100,
  "status": "passed"
});
formatter.before({
  "duration": 236600,
  "status": "passed"
});
formatter.before({
  "duration": 189700,
  "status": "passed"
});
formatter.before({
  "duration": 428800,
  "status": "passed"
});
formatter.before({
  "duration": 1088200,
  "status": "passed"
});
formatter.scenario({
  "line": 97,
  "name": "Verify the UI for Find a store modal",
  "description": "",
  "id": "[desktop]components---header;verify-the-ui-for-find-a-store-modal",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 96,
      "name": "@Web"
    },
    {
      "line": 96,
      "name": "@All"
    },
    {
      "line": 96,
      "name": "@C-HP"
    },
    {
      "line": 96,
      "name": "@Regression"
    },
    {
      "line": 96,
      "name": "@KER-262"
    },
    {
      "line": 96,
      "name": "@ZYP_HP_K262-2734"
    },
    {
      "line": 96,
      "name": "@CR-RKA"
    }
  ]
});
formatter.step({
  "line": 98,
  "name": "user launches the browser and navigates to \"ASO_HOME\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 99,
  "name": "User should be able to click on Find Store",
  "keyword": "Then "
});
formatter.step({
  "line": 100,
  "name": "Find Store Modal should pop-up",
  "keyword": "And "
});
formatter.step({
  "line": 101,
  "name": "user verify element of find store popup",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ASO_HOME",
      "offset": 44
    }
  ],
  "location": "Common_Web_SD.user_launches_the_browser_and_navigates_to_page(String)"
});
formatter.result({
  "duration": 7144343100,
  "status": "passed"
});
formatter.match({
  "location": "R1_HP_K730_SD.User_should_be_able_to_see_Find_Store()"
});
formatter.result({
  "duration": 5395782400,
  "status": "passed"
});
formatter.match({
  "location": "R1_HP_K730_SD.Find_Store_Modal_should_pop_up()"
});
formatter.result({
  "duration": 1102551000,
  "status": "passed"
});
formatter.match({
  "location": "R1_HP_K262_Global_Header_SD.user_verify_element_of_find_store_popup()"
});
formatter.result({
  "duration": 31389778200,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat com.aso.qe.test.stepdefinition.web.R1_HP_K262_Global_Header_SD.user_verify_element_of_find_store_popup(R1_HP_K262_Global_Header_SD.java:153)\r\n\tat ✽.Then user verify element of find store popup(R1_HP_KER_262_Web.feature:101)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded14.png");
formatter.after({
  "duration": 3473778700,
  "status": "passed"
});
formatter.after({
  "duration": 1218300,
  "status": "passed"
});
formatter.after({
  "duration": 118900,
  "status": "passed"
});
formatter.after({
  "duration": 124200,
  "status": "passed"
});
formatter.before({
  "duration": 128900,
  "status": "passed"
});
formatter.before({
  "duration": 117000,
  "status": "passed"
});
formatter.before({
  "duration": 420800,
  "status": "passed"
});
formatter.before({
  "duration": 743900,
  "status": "passed"
});
formatter.scenario({
  "line": 104,
  "name": "Verify that the store details are displayed for Logged-in user",
  "description": "",
  "id": "[desktop]components---header;verify-that-the-store-details-are-displayed-for-logged-in-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 103,
      "name": "@Web"
    },
    {
      "line": 103,
      "name": "@All"
    },
    {
      "line": 103,
      "name": "@C-HP"
    },
    {
      "line": 103,
      "name": "@Regression"
    },
    {
      "line": 103,
      "name": "@KER-262"
    },
    {
      "line": 103,
      "name": "@ZYP_HP_K262-6530"
    },
    {
      "line": 103,
      "name": "@CR-RKA"
    }
  ]
});
formatter.step({
  "line": 105,
  "name": "user launches the browser and navigates to \"ASO_HOME\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 106,
  "name": "user to click on sing in and navigate to sign in page",
  "keyword": "When "
});
formatter.step({
  "line": 107,
  "name": "user should be able to enter the signin details \"Login_username\" \"Login_pwd\"",
  "keyword": "And "
});
formatter.step({
  "line": 108,
  "name": "User should be able to click on Find Store after sign in",
  "keyword": "Then "
});
formatter.step({
  "line": 109,
  "name": "User select store with \"Postal_Code\"",
  "keyword": "When "
});
formatter.step({
  "line": 110,
  "name": "User verify hour of operation display in the place of find a store link",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ASO_HOME",
      "offset": 44
    }
  ],
  "location": "Common_Web_SD.user_launches_the_browser_and_navigates_to_page(String)"
});
formatter.result({
  "duration": 10384009000,
  "status": "passed"
});
formatter.match({
  "location": "R1_HP_K727_SD.user_to_click_on_sing_in_and_navigate_to_sign_in_page()"
});
formatter.result({
  "duration": 8643643100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login_username",
      "offset": 49
    },
    {
      "val": "Login_pwd",
      "offset": 66
    }
  ],
  "location": "R1_SD_SIT.user_should_be_able_to_enter_the_signin_details(String,String)"
});
formatter.result({
  "duration": 68929380200,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.xpath: //*[@data-auid\u003d\u0027myAccountCta\u0027] (tried for 30 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:81)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:271)\r\n\tat com.aso.qe.framework.common.CommonActionHelper.waitForElement(CommonActionHelper.java:139)\r\n\tat com.aso.qe.test.stepdefinition.web.R1_SD_SIT.user_should_be_able_to_enter_the_signin_details(R1_SD_SIT.java:312)\r\n\tat ✽.And user should be able to enter the signin details \"Login_username\" \"Login_pwd\"(R1_HP_KER_262_Web.feature:107)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Cannot locate an element using By.xpath: //*[@data-auid\u003d\u0027myAccountCta\u0027]\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027VDI-SQA007E\u0027, ip: \u002710.1.243.108\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.lambda$findElement$0(ExpectedConditions.java:896)\r\n\tat java.util.Optional.orElseThrow(Optional.java:290)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:895)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:44)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:183)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:180)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:248)\r\n\tat com.aso.qe.framework.common.CommonActionHelper.waitForElement(CommonActionHelper.java:139)\r\n\tat com.aso.qe.test.stepdefinition.web.R1_SD_SIT.user_should_be_able_to_enter_the_signin_details(R1_SD_SIT.java:312)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:37)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:298)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:48)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:538)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:760)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:460)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:206)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "R1_HP_K262_Global_Header_SD.user_should_be_able_to_click_on_Find_Store_after_sign_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Postal_Code",
      "offset": 24
    }
  ],
  "location": "R1_HP_K730_SD.User_select_store_with(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "R1_HP_K262_Global_Header_SD.user_verify_hour_of_operation_display_in_the_place_of_find_a_store_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded15.png");
formatter.after({
  "duration": 1430275500,
  "status": "passed"
});
formatter.after({
  "duration": 1308700,
  "status": "passed"
});
formatter.after({
  "duration": 130300,
  "status": "passed"
});
formatter.after({
  "duration": 152900,
  "status": "passed"
});
formatter.before({
  "duration": 157300,
  "status": "passed"
});
formatter.before({
  "duration": 119700,
  "status": "passed"
});
formatter.before({
  "duration": 261800,
  "status": "passed"
});
formatter.before({
  "duration": 339200,
  "status": "passed"
});
formatter.scenario({
  "line": 114,
  "name": "Verify find a store UI navigation functionality",
  "description": "",
  "id": "[desktop]components---header;verify-find-a-store-ui-navigation-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 113,
      "name": "@Web"
    },
    {
      "line": 113,
      "name": "@All"
    },
    {
      "line": 113,
      "name": "@C-HP"
    },
    {
      "line": 113,
      "name": "@Regression"
    },
    {
      "line": 113,
      "name": "@KER-262"
    },
    {
      "line": 113,
      "name": "@ZYP_HP_K262-6533"
    },
    {
      "line": 113,
      "name": "@CR-SG"
    },
    {
      "line": 113,
      "name": "@RBeta"
    }
  ]
});
formatter.step({
  "line": 115,
  "name": "user launches the browser and navigates to \"ASO_HOME\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 116,
  "name": "User should be able to click on Find Store",
  "keyword": "Then "
});
formatter.step({
  "line": 117,
  "name": "User select store with \"Postal_Code\"",
  "keyword": "When "
});
formatter.step({
  "line": 118,
  "name": "User verify hour of operation display in the place of find a store link",
  "keyword": "Then "
});
formatter.step({
  "line": 119,
  "name": "User verify have to verify change link with pencil icon",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ASO_HOME",
      "offset": 44
    }
  ],
  "location": "Common_Web_SD.user_launches_the_browser_and_navigates_to_page(String)"
});
formatter.result({
  "duration": 7960409800,
  "status": "passed"
});
formatter.match({
  "location": "R1_HP_K730_SD.User_should_be_able_to_see_Find_Store()"
});
formatter.result({
  "duration": 5408103900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Postal_Code",
      "offset": 24
    }
  ],
  "location": "R1_HP_K730_SD.User_select_store_with(String)"
});
formatter.result({
  "duration": 30431962400,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.xpath: //input[@name\u003d\u0027zipcode\u0027] | //*[@data-auid\u003d\u0027find-a-store\u0027]/input (tried for 30 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:81)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:271)\r\n\tat com.aso.qe.framework.common.CommonActionHelper.waitForElement(CommonActionHelper.java:139)\r\n\tat com.aso.qe.test.pageobject.R1_FindStore_PO.selectAStore(R1_FindStore_PO.java:70)\r\n\tat com.aso.qe.test.stepdefinition.web.R1_HP_K730_SD.User_select_store_with(R1_HP_K730_SD.java:58)\r\n\tat ✽.When User select store with \"Postal_Code\"(R1_HP_KER_262_Web.feature:117)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Cannot locate an element using By.xpath: //input[@name\u003d\u0027zipcode\u0027] | //*[@data-auid\u003d\u0027find-a-store\u0027]/input\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027VDI-SQA007E\u0027, ip: \u002710.1.243.108\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.lambda$findElement$0(ExpectedConditions.java:896)\r\n\tat java.util.Optional.orElseThrow(Optional.java:290)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:895)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:44)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:183)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:180)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:248)\r\n\tat com.aso.qe.framework.common.CommonActionHelper.waitForElement(CommonActionHelper.java:139)\r\n\tat com.aso.qe.test.pageobject.R1_FindStore_PO.selectAStore(R1_FindStore_PO.java:70)\r\n\tat com.aso.qe.test.stepdefinition.web.R1_HP_K730_SD.User_select_store_with(R1_HP_K730_SD.java:58)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:37)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:298)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:48)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:538)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:760)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:460)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:206)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "R1_HP_K262_Global_Header_SD.user_verify_hour_of_operation_display_in_the_place_of_find_a_store_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "R1_HP_K262_Global_Header_SD.user_verify_have_to_verify_change_link_with_pencil_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded16.png");
formatter.after({
  "duration": 3571431700,
  "status": "passed"
});
formatter.after({
  "duration": 1673700,
  "status": "passed"
});
formatter.after({
  "duration": 176300,
  "status": "passed"
});
formatter.after({
  "duration": 165100,
  "status": "passed"
});
formatter.before({
  "duration": 135200,
  "status": "passed"
});
formatter.before({
  "duration": 118700,
  "status": "passed"
});
formatter.before({
  "duration": 263900,
  "status": "passed"
});
formatter.before({
  "duration": 240200,
  "status": "passed"
});
formatter.scenario({
  "line": 122,
  "name": "Verify all broken URL\u0027s on Home page",
  "description": "",
  "id": "[desktop]components---header;verify-all-broken-url\u0027s-on-home-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 121,
      "name": "@Web"
    },
    {
      "line": 121,
      "name": "@All"
    },
    {
      "line": 121,
      "name": "@C-HP"
    },
    {
      "line": 121,
      "name": "@Regression"
    },
    {
      "line": 121,
      "name": "@KER-262"
    },
    {
      "line": 121,
      "name": "@ZYP_HP_K262"
    },
    {
      "line": 121,
      "name": "@CR-RKA"
    },
    {
      "line": 121,
      "name": "@BrokenLink"
    },
    {
      "line": 121,
      "name": "@Broken"
    },
    {
      "line": 121,
      "name": "@TC_BL_01"
    }
  ]
});
formatter.step({
  "line": 123,
  "name": "user launches the browser and navigates to \"ASO_HOME\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 124,
  "name": "verfy all link url\u0027s status code is 200",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ASO_HOME",
      "offset": 44
    }
  ],
  "location": "Common_Web_SD.user_launches_the_browser_and_navigates_to_page(String)"
});
formatter.result({
  "duration": 6341058000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 36
    }
  ],
  "location": "Common_Web_SD.verfy_all_link_url_s_status_code_is(int)"
});
formatter.result({
  "duration": 158025838000,
  "error_message": "java.lang.AssertionError: URL \u003d https://uat7www.academy.com/categories/index.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/shopping-index.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/brands.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/content/academysports :\u003d: is a broken link\nURL \u003d tel:1-888-922-2336 :\u003d: is a broken link\nURL \u003d http://careers.academy.com/ :\u003d: is a broken link\nURL \u003d https://www.pinterest.com/academy/m :\u003d: is a broken link\nSummary:- Total URL Count:138 Valid URL Count:131  Broken URL Count:7 expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:513)\r\n\tat org.testng.Assert.assertTrue(Assert.java:42)\r\n\tat com.aso.qe.test.stepdefinition.web.Common_Web_SD.verfy_all_link_url_s_status_code_is(Common_Web_SD.java:246)\r\n\tat ✽.Then verfy all link url\u0027s status code is 200(R1_HP_KER_262_Web.feature:124)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1179400,
  "status": "passed"
});
formatter.after({
  "duration": 1066300,
  "status": "passed"
});
formatter.after({
  "duration": 120300,
  "status": "passed"
});
formatter.after({
  "duration": 114100,
  "status": "passed"
});
formatter.before({
  "duration": 194000,
  "status": "passed"
});
formatter.before({
  "duration": 1405000,
  "status": "passed"
});
formatter.before({
  "duration": 280000,
  "status": "passed"
});
formatter.before({
  "duration": 249400,
  "status": "passed"
});
formatter.scenario({
  "line": 127,
  "name": "Verify all broken URL\u0027s on L1 page",
  "description": "",
  "id": "[desktop]components---header;verify-all-broken-url\u0027s-on-l1-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 126,
      "name": "@Web"
    },
    {
      "line": 126,
      "name": "@All"
    },
    {
      "line": 126,
      "name": "@C-HP"
    },
    {
      "line": 126,
      "name": "@Regression"
    },
    {
      "line": 126,
      "name": "@KER-262"
    },
    {
      "line": 126,
      "name": "@ZYP_HP_K262-11665"
    },
    {
      "line": 126,
      "name": "@CR-RKA"
    },
    {
      "line": 126,
      "name": "@BrokenLink"
    },
    {
      "line": 126,
      "name": "@Broken"
    },
    {
      "line": 126,
      "name": "@TC_BL_02"
    }
  ]
});
formatter.step({
  "line": 128,
  "name": "user launches the browser and navigates to \"ASO_HOME\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 129,
  "name": "user clicks on one of the category and navigates to LOne page",
  "keyword": "When "
});
formatter.step({
  "line": 130,
  "name": "User should be able to see L1 Page",
  "keyword": "Then "
});
formatter.step({
  "line": 131,
  "name": "verfy all link url\u0027s status code is 200",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ASO_HOME",
      "offset": 44
    }
  ],
  "location": "Common_Web_SD.user_launches_the_browser_and_navigates_to_page(String)"
});
formatter.result({
  "duration": 6927497300,
  "status": "passed"
});
formatter.match({
  "location": "R1_PLP_K263_SD.user_clicks_on_one_of_the_category_and_navigates_to_LOne_page()"
});
formatter.result({
  "duration": 9870008800,
  "status": "passed"
});
formatter.match({
  "location": "R1_Sanity.user_should_be_able_to_see_L1_Page()"
});
formatter.result({
  "duration": 1128509300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 36
    }
  ],
  "location": "Common_Web_SD.verfy_all_link_url_s_status_code_is(int)"
});
formatter.result({
  "duration": 289905542200,
  "error_message": "java.lang.AssertionError: URL \u003d https://uat7www.academy.com/categories/nike-sweatpants.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/brands.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/workout-shorts.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/toddler-clothes.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/school-uniforms.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/tank-tops.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/under-armour-clothing.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/fishing-clothes.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/yoga-pants.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/north-face-clothing.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/index.jsp :\u003d: is a broken link\nURL \u003d https://localhost/shop/pdp/monarch-9-round-steel-market-umbrella :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/content/academysports :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/winter-clothes.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/accessories.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/magellan-clothing.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/womens-clothes.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-clothes.jsp :\u003d: is a broken link\nURL \u003d tel:1-888-922-2336 :\u003d: is a broken link\nURL \u003d http://localhost/shop/pdp/salomon-mens-xa-pro-3-d-gtx-trail-running-shoes :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/workout-clothes.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/shopping-index.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/columbia-clothing.jsp :\u003d: is a broken link\nURL \u003d https://localhost/shop/pdp/rawlings-mens-3-4-sleeve-t-shirt :\u003d: is a broken link\nURL \u003d http://localhost/shop/pdp/taylormade-mens-aeroburner-hl-irons-set :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/workwear.jsp :\u003d: is a broken link\nURL \u003d https://www.pinterest.com/academy/m :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-hunting-clothes.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/boys-clothes.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/graphic-tees-clothing-C239203.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/girls-clothes.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/compression-clothing-C239158.jsp :\u003d: is a broken link\nURL \u003d http://careers.academy.com/ :\u003d: is a broken link\nURL \u003d https://localhost/shop/pdp/high-road-clothes-bar :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/swimwear-clothing-C238955.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/hunting-clothes.jsp :\u003d: is a broken link\nSummary:- Total URL Count:231 Valid URL Count:195  Broken URL Count:36 expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:513)\r\n\tat org.testng.Assert.assertTrue(Assert.java:42)\r\n\tat com.aso.qe.test.stepdefinition.web.Common_Web_SD.verfy_all_link_url_s_status_code_is(Common_Web_SD.java:246)\r\n\tat ✽.Then verfy all link url\u0027s status code is 200(R1_HP_KER_262_Web.feature:131)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1182200,
  "status": "passed"
});
formatter.after({
  "duration": 1038000,
  "status": "passed"
});
formatter.after({
  "duration": 111500,
  "status": "passed"
});
formatter.after({
  "duration": 106000,
  "status": "passed"
});
formatter.before({
  "duration": 133300,
  "status": "passed"
});
formatter.before({
  "duration": 116700,
  "status": "passed"
});
formatter.before({
  "duration": 246700,
  "status": "passed"
});
formatter.before({
  "duration": 436600,
  "status": "passed"
});
formatter.scenario({
  "line": 134,
  "name": "Verify all broken URL\u0027s on L2 page",
  "description": "",
  "id": "[desktop]components---header;verify-all-broken-url\u0027s-on-l2-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 133,
      "name": "@Web"
    },
    {
      "line": 133,
      "name": "@All"
    },
    {
      "line": 133,
      "name": "@C-HP"
    },
    {
      "line": 133,
      "name": "@Regression"
    },
    {
      "line": 133,
      "name": "@KER-262"
    },
    {
      "line": 133,
      "name": "@ZYP_HP_K262-11666"
    },
    {
      "line": 133,
      "name": "@CR-RKA"
    },
    {
      "line": 133,
      "name": "@BrokenLink"
    },
    {
      "line": 133,
      "name": "@Broken"
    },
    {
      "line": 133,
      "name": "@TC_BL_03"
    }
  ]
});
formatter.step({
  "line": 135,
  "name": "user launches the browser and navigates to \"ASO_HOME\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 136,
  "name": "User navigates to L2 from home page",
  "keyword": "Then "
});
formatter.step({
  "line": 137,
  "name": "User should be able to see L2 Page",
  "keyword": "Then "
});
formatter.step({
  "line": 138,
  "name": "verfy all link url\u0027s status code is 200",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ASO_HOME",
      "offset": 44
    }
  ],
  "location": "Common_Web_SD.user_launches_the_browser_and_navigates_to_page(String)"
});
formatter.result({
  "duration": 6370351700,
  "status": "passed"
});
formatter.match({
  "location": "R1_Sanity.user_navigates_to_L2_from_home_page()"
});
formatter.result({
  "duration": 20511326500,
  "status": "passed"
});
formatter.match({
  "location": "R1_Sanity.user_should_be_able_to_see_L2_Page()"
});
formatter.result({
  "duration": 1124094400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 36
    }
  ],
  "location": "Common_Web_SD.verfy_all_link_url_s_status_code_is(int)"
});
formatter.result({
  "duration": 177922118400,
  "error_message": "java.lang.AssertionError: URL \u003d https://uat7www.academy.com/categories/nike-sweatpants.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/brands.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/workout-shorts.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-drake-waterfowl-clothes-clothing-Chc-15054-af696b6d.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-cca-clothes.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-pants.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-ray-ban-clothes-clothing-brands-Chc-15054-4f0f5997.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-magellan-outdoors-clothes.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-oakley-clothes-clothing-brands-Chc-15054-bb58677c.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-coveralls.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/index.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-underwear.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/content/academysports :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-jeans.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-shorts.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-fleece-jackets.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-jackets.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-thermals.jsp :\u003d: is a broken link\nURL \u003d tel:1-888-922-2336 :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-swimsuits.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-compression-clothing-C239167.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/columbia-mens-clothing.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/shopping-index.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-shirts.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-hoodies-sweatshirts-clothing-C15060.jsp :\u003d: is a broken link\nURL \u003d https://www.pinterest.com/academy/m :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-accessories.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-hunting-clothes.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-rawlings-clothes.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-carhartt-clothes-clothing-brands-Chc-15054-74060f1a.jsp :\u003d: is a broken link\nURL \u003d http://careers.academy.com/ :\u003d: is a broken link\nSummary:- Total URL Count:202 Valid URL Count:171  Broken URL Count:31 expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:513)\r\n\tat org.testng.Assert.assertTrue(Assert.java:42)\r\n\tat com.aso.qe.test.stepdefinition.web.Common_Web_SD.verfy_all_link_url_s_status_code_is(Common_Web_SD.java:246)\r\n\tat ✽.Then verfy all link url\u0027s status code is 200(R1_HP_KER_262_Web.feature:138)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1094500,
  "status": "passed"
});
formatter.after({
  "duration": 1145500,
  "status": "passed"
});
formatter.after({
  "duration": 174700,
  "status": "passed"
});
formatter.after({
  "duration": 119500,
  "status": "passed"
});
formatter.before({
  "duration": 132700,
  "status": "passed"
});
formatter.before({
  "duration": 121500,
  "status": "passed"
});
formatter.before({
  "duration": 308400,
  "status": "passed"
});
formatter.before({
  "duration": 843000,
  "status": "passed"
});
formatter.scenario({
  "line": 141,
  "name": "Verify all broken URL\u0027s on L3 page",
  "description": "",
  "id": "[desktop]components---header;verify-all-broken-url\u0027s-on-l3-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 140,
      "name": "@Web"
    },
    {
      "line": 140,
      "name": "@All"
    },
    {
      "line": 140,
      "name": "@C-HP"
    },
    {
      "line": 140,
      "name": "@Regression"
    },
    {
      "line": 140,
      "name": "@KER-262"
    },
    {
      "line": 140,
      "name": "@ZYP_HP_K262-11667"
    },
    {
      "line": 140,
      "name": "@CR-RKA"
    },
    {
      "line": 140,
      "name": "@BrokenLink"
    },
    {
      "line": 140,
      "name": "@Broken"
    },
    {
      "line": 140,
      "name": "@TC_BL_04"
    }
  ]
});
formatter.step({
  "line": 142,
  "name": "user launches the browser and navigates to \"ASO_HOME\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 143,
  "name": "User navigates to L3 from home page",
  "keyword": "Then "
});
formatter.step({
  "line": 144,
  "name": "User should be able to see L3 Page",
  "keyword": "Then "
});
formatter.step({
  "line": 145,
  "name": "verfy all link url\u0027s status code is 200",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ASO_HOME",
      "offset": 44
    }
  ],
  "location": "Common_Web_SD.user_launches_the_browser_and_navigates_to_page(String)"
});
formatter.result({
  "duration": 6569010900,
  "status": "passed"
});
formatter.match({
  "location": "R1_Sanity.user_navigates_to_L3_from_home_page()"
});
formatter.result({
  "duration": 14104802200,
  "status": "passed"
});
formatter.match({
  "location": "R1_Sanity.user_should_be_able_to_see_L3_Page()"
});
formatter.result({
  "duration": 1130983700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 36
    }
  ],
  "location": "Common_Web_SD.verfy_all_link_url_s_status_code_is(int)"
});
formatter.result({
  "duration": 212068224500,
  "error_message": "java.lang.AssertionError: URL \u003d https://uat7www.academy.com/categories/mens-ariat-shirts-clothes-clothing-Chc-15055-d8f9516.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-flannel-shirts.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-bcg-shirts.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-5-11-tactical-shirts-clothes-Chc-15055-3219faf5.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-adidas-shirts.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/brands.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/workout-shorts.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-dickies-shirts-clothes-brands-Chc-15055-77059dd5.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/nike-shirts-mens.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/wolverine-work-shirts.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-short-sleeve-t-shirts-shirts-C3074457345616924136.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-the-north-face-shirts-Chc-15055-fab1e7bc.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-carhartt-shirts-clothes-clothing-Chc-15055-74060f1a.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-browning-shirts-clothing-by-Chc-15055-8b296e81.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-huk-shirts-clothes-clothing-Chc-15055-e8928049.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/index.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/content/academysports :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/magellan-shirts-mens.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-columbia-sportswear-shirts-clothing-Chc-15055-c7f661e7.jsp :\u003d: is a broken link\nURL \u003d tel:1-888-922-2336 :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-costa-del-mar-shirts-Chc-15055-13f3d328.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-camo-shirts.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/shopping-index.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-copper-fit-shirts-clothes-Chc-15055-8498d6bf.jsp :\u003d: is a broken link\nURL \u003d https://www.pinterest.com/academy/m :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-tank-tops.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-plaid-shirts.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-walls-shirts-clothes-brands-Chc-15055-ebdec74.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-drake-waterfowl-shirts-clothes-Chc-15055-af696b6d.jsp :\u003d: is a broken link\nURL \u003d http://careers.academy.com/ :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/mens-champion-shirts.jsp :\u003d: is a broken link\nSummary:- Total URL Count:196 Valid URL Count:165  Broken URL Count:31 expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:513)\r\n\tat org.testng.Assert.assertTrue(Assert.java:42)\r\n\tat com.aso.qe.test.stepdefinition.web.Common_Web_SD.verfy_all_link_url_s_status_code_is(Common_Web_SD.java:246)\r\n\tat ✽.Then verfy all link url\u0027s status code is 200(R1_HP_KER_262_Web.feature:145)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 2072200,
  "status": "passed"
});
formatter.after({
  "duration": 1714300,
  "status": "passed"
});
formatter.after({
  "duration": 112000,
  "status": "passed"
});
formatter.after({
  "duration": 110900,
  "status": "passed"
});
formatter.before({
  "duration": 117000,
  "status": "passed"
});
formatter.before({
  "duration": 241600,
  "status": "passed"
});
formatter.before({
  "duration": 237500,
  "status": "passed"
});
formatter.before({
  "duration": 271700,
  "status": "passed"
});
formatter.scenario({
  "line": 148,
  "name": "Verify all broken URL\u0027s on PDP page",
  "description": "",
  "id": "[desktop]components---header;verify-all-broken-url\u0027s-on-pdp-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 147,
      "name": "@Web"
    },
    {
      "line": 147,
      "name": "@All"
    },
    {
      "line": 147,
      "name": "@C-HP"
    },
    {
      "line": 147,
      "name": "@Regression"
    },
    {
      "line": 147,
      "name": "@KER-262"
    },
    {
      "line": 147,
      "name": "@ZYP_HP_K262-11668"
    },
    {
      "line": 147,
      "name": "@CR-RKA"
    },
    {
      "line": 147,
      "name": "@BrokenLink"
    },
    {
      "line": 147,
      "name": "@Broken"
    },
    {
      "line": 147,
      "name": "@TC_BL_05"
    }
  ]
});
formatter.step({
  "line": 149,
  "name": "user launches the browser and navigates to \"ASO_HOME\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 150,
  "name": "user navigates to PLP of any product",
  "keyword": "When "
});
formatter.step({
  "line": 151,
  "name": "user clicks on the product card and navigates to PDP of the product",
  "keyword": "Then "
});
formatter.step({
  "line": 152,
  "name": "verfy all link url\u0027s status code is 200",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ASO_HOME",
      "offset": 44
    }
  ],
  "location": "Common_Web_SD.user_launches_the_browser_and_navigates_to_page(String)"
});
formatter.result({
  "duration": 6441509700,
  "status": "passed"
});
formatter.match({
  "location": "R1_PDP_K1926_SD.user_navigates_to_PLP_of_any_product()"
});
formatter.result({
  "duration": 19262989300,
  "status": "passed"
});
formatter.match({
  "location": "R1_PDP_K1926_SD.user_clicks_on_the_product_card_and_navigates_to_PDP_of_the_product()"
});
formatter.result({
  "duration": 10290816700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 36
    }
  ],
  "location": "Common_Web_SD.verfy_all_link_url_s_status_code_is(int)"
});
formatter.result({
  "duration": 25852263000,
  "error_message": "java.lang.AssertionError: URL \u003d javascript:void(0) :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/shopping-index.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/shoes.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/sports-equipment.jsp :\u003d: is a broken link\nURL \u003d https://www.pinterest.com/academy/m :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/index.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/accessories-more.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/content/academysports :\u003d: is a broken link\nURL \u003d tel:1-888-922-2336 :\u003d: is a broken link\nURL \u003d http://careers.academy.com/ :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/clothing.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/outdoors.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/fan-shop.jsp :\u003d: is a broken link\nSummary:- Total URL Count:127 Valid URL Count:114  Broken URL Count:13 expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:513)\r\n\tat org.testng.Assert.assertTrue(Assert.java:42)\r\n\tat com.aso.qe.test.stepdefinition.web.Common_Web_SD.verfy_all_link_url_s_status_code_is(Common_Web_SD.java:246)\r\n\tat ✽.Then verfy all link url\u0027s status code is 200(R1_HP_KER_262_Web.feature:152)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1112200,
  "status": "passed"
});
formatter.after({
  "duration": 1071400,
  "status": "passed"
});
formatter.after({
  "duration": 110600,
  "status": "passed"
});
formatter.after({
  "duration": 109200,
  "status": "passed"
});
formatter.before({
  "duration": 116800,
  "status": "passed"
});
formatter.before({
  "duration": 108800,
  "status": "passed"
});
formatter.before({
  "duration": 231100,
  "status": "passed"
});
formatter.before({
  "duration": 219000,
  "status": "passed"
});
formatter.scenario({
  "line": 155,
  "name": "Verify all broken URL\u0027s on Reskin page",
  "description": "",
  "id": "[desktop]components---header;verify-all-broken-url\u0027s-on-reskin-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 154,
      "name": "@Web"
    },
    {
      "line": 154,
      "name": "@All"
    },
    {
      "line": 154,
      "name": "@C-HP"
    },
    {
      "line": 154,
      "name": "@Regression"
    },
    {
      "line": 154,
      "name": "@KER-262"
    },
    {
      "line": 154,
      "name": "@ZYP_HP_K262-11669"
    },
    {
      "line": 154,
      "name": "@CR-RKA"
    },
    {
      "line": 154,
      "name": "@BrokenLink"
    },
    {
      "line": 154,
      "name": "@Broken"
    },
    {
      "line": 154,
      "name": "@TC_BL_09"
    }
  ]
});
formatter.step({
  "line": 156,
  "name": "user launches the browser and navigates to \"ASO_HOME\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 157,
  "name": "user to click on sing in and navigate to sign in page",
  "keyword": "When "
});
formatter.step({
  "line": 158,
  "name": "verfy all link url\u0027s status code is 200",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ASO_HOME",
      "offset": 44
    }
  ],
  "location": "Common_Web_SD.user_launches_the_browser_and_navigates_to_page(String)"
});
formatter.result({
  "duration": 6058276400,
  "status": "passed"
});
formatter.match({
  "location": "R1_HP_K727_SD.user_to_click_on_sing_in_and_navigate_to_sign_in_page()"
});
formatter.result({
  "duration": 8816945200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 36
    }
  ],
  "location": "Common_Web_SD.verfy_all_link_url_s_status_code_is(int)"
});
formatter.result({
  "duration": 30820174300,
  "error_message": "java.lang.AssertionError: URL \u003d https://uat7www.academy.com/categories/index.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/shopping-index.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/accessories-more.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/shoes.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/content/academysports :\u003d: is a broken link\nURL \u003d tel:1-888-922-2336 :\u003d: is a broken link\nURL \u003d http://careers.academy.com/ :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/sports-equipment.jsp :\u003d: is a broken link\nURL \u003d https://www.pinterest.com/academy/m :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/clothing.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/outdoors.jsp :\u003d: is a broken link\nURL \u003d https://uat7www.academy.com/categories/fan-shop.jsp :\u003d: is a broken link\nSummary:- Total URL Count:126 Valid URL Count:114  Broken URL Count:12 expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:513)\r\n\tat org.testng.Assert.assertTrue(Assert.java:42)\r\n\tat com.aso.qe.test.stepdefinition.web.Common_Web_SD.verfy_all_link_url_s_status_code_is(Common_Web_SD.java:246)\r\n\tat ✽.Then verfy all link url\u0027s status code is 200(R1_HP_KER_262_Web.feature:158)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1291500,
  "status": "passed"
});
formatter.after({
  "duration": 1051600,
  "status": "passed"
});
formatter.after({
  "duration": 117600,
  "status": "passed"
});
formatter.after({
  "duration": 114100,
  "status": "passed"
});
formatter.before({
  "duration": 120700,
  "status": "passed"
});
formatter.before({
  "duration": 115400,
  "status": "passed"
});
formatter.before({
  "duration": 256900,
  "status": "passed"
});
formatter.before({
  "duration": 220300,
  "status": "passed"
});
formatter.scenario({
  "line": 163,
  "name": "TC_1- Verify all Image broken URL\u0027s on Home page",
  "description": "",
  "id": "[desktop]components---header;tc-1--verify-all-image-broken-url\u0027s-on-home-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 162,
      "name": "@Web"
    },
    {
      "line": 162,
      "name": "@All"
    },
    {
      "line": 162,
      "name": "@C-HP"
    },
    {
      "line": 162,
      "name": "@Regression"
    },
    {
      "line": 162,
      "name": "@KER-262"
    },
    {
      "line": 162,
      "name": "@ZYP_HP_K262_Image"
    },
    {
      "line": 162,
      "name": "@CR-RKA"
    },
    {
      "line": 162,
      "name": "@BrokenImage"
    },
    {
      "line": 162,
      "name": "@Broken"
    },
    {
      "line": 162,
      "name": "@TC_BIM_01"
    }
  ]
});
formatter.step({
  "line": 164,
  "name": "user launches the browser and navigates to \"ASO_HOME\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 165,
  "name": "verfy all Image link urls status code is 200",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ASO_HOME",
      "offset": 44
    }
  ],
  "location": "Common_Web_SD.user_launches_the_browser_and_navigates_to_page(String)"
});
formatter.result({
  "duration": 6199068600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 41
    }
  ],
  "location": "Common_Web_SD.verfy_all_image_link_url_s_status_code_is(int)"
});
formatter.result({
  "duration": 1942372600,
  "status": "passed"
});
formatter.after({
  "duration": 694100,
  "status": "passed"
});
formatter.after({
  "duration": 676300,
  "status": "passed"
});
formatter.after({
  "duration": 102900,
  "status": "passed"
});
formatter.after({
  "duration": 110400,
  "status": "passed"
});
formatter.before({
  "duration": 116700,
  "status": "passed"
});
formatter.before({
  "duration": 121700,
  "status": "passed"
});
formatter.before({
  "duration": 234300,
  "status": "passed"
});
formatter.before({
  "duration": 224400,
  "status": "passed"
});
formatter.scenario({
  "line": 169,
  "name": "Verify all broken Image on L1 page",
  "description": "",
  "id": "[desktop]components---header;verify-all-broken-image-on-l1-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 168,
      "name": "@Web"
    },
    {
      "line": 168,
      "name": "@All"
    },
    {
      "line": 168,
      "name": "@C-HP"
    },
    {
      "line": 168,
      "name": "@Regression"
    },
    {
      "line": 168,
      "name": "@KER-262"
    },
    {
      "line": 168,
      "name": "@ZYP_HP_K262-11665_Image"
    },
    {
      "line": 168,
      "name": "@CR-RKA"
    },
    {
      "line": 168,
      "name": "@BrokenImage"
    },
    {
      "line": 168,
      "name": "@Broken"
    },
    {
      "line": 168,
      "name": "@TC_BIM_02"
    }
  ]
});
formatter.step({
  "line": 170,
  "name": "user launches the browser and navigates to \"ASO_HOME\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 171,
  "name": "user clicks on one of the category and navigates to LOne page",
  "keyword": "When "
});
formatter.step({
  "line": 172,
  "name": "User should be able to see L1 Page",
  "keyword": "Then "
});
formatter.step({
  "line": 173,
  "name": "verfy all Image link urls status code is 200",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ASO_HOME",
      "offset": 44
    }
  ],
  "location": "Common_Web_SD.user_launches_the_browser_and_navigates_to_page(String)"
});
formatter.result({
  "duration": 6587973100,
  "status": "passed"
});
formatter.match({
  "location": "R1_PLP_K263_SD.user_clicks_on_one_of_the_category_and_navigates_to_LOne_page()"
});
formatter.result({
  "duration": 9462191000,
  "status": "passed"
});
formatter.match({
  "location": "R1_Sanity.user_should_be_able_to_see_L1_Page()"
});
formatter.result({
  "duration": 1215742000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 41
    }
  ],
  "location": "Common_Web_SD.verfy_all_image_link_url_s_status_code_is(int)"
});
formatter.result({
  "duration": 5383946300,
  "error_message": "java.lang.AssertionError: URL \u003d http://s7d2.scene7.com/is/image/academy/10812855?wid\u003d500\u0026hei\u003d500 :\u003d: is a broken link\nSummary:- Total URL Count:82 Valid URL Count:81  Broken URL Count:1 expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:513)\r\n\tat org.testng.Assert.assertTrue(Assert.java:42)\r\n\tat com.aso.qe.test.stepdefinition.web.Common_Web_SD.verfy_all_image_link_url_s_status_code_is(Common_Web_SD.java:251)\r\n\tat ✽.Then verfy all Image link urls status code is 200(R1_HP_KER_262_Web.feature:173)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1266400,
  "status": "passed"
});
formatter.after({
  "duration": 1030300,
  "status": "passed"
});
formatter.after({
  "duration": 111400,
  "status": "passed"
});
formatter.after({
  "duration": 110100,
  "status": "passed"
});
formatter.before({
  "duration": 126900,
  "status": "passed"
});
formatter.before({
  "duration": 118700,
  "status": "passed"
});
formatter.before({
  "duration": 246100,
  "status": "passed"
});
formatter.before({
  "duration": 230600,
  "status": "passed"
});
formatter.scenario({
  "line": 176,
  "name": "Verify all broken Images on L2 page",
  "description": "",
  "id": "[desktop]components---header;verify-all-broken-images-on-l2-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 175,
      "name": "@Web"
    },
    {
      "line": 175,
      "name": "@All"
    },
    {
      "line": 175,
      "name": "@C-HP"
    },
    {
      "line": 175,
      "name": "@Regression"
    },
    {
      "line": 175,
      "name": "@KER-262"
    },
    {
      "line": 175,
      "name": "@ZYP_HP_K262-11666_Image"
    },
    {
      "line": 175,
      "name": "@CR-RKA"
    },
    {
      "line": 175,
      "name": "@BrokenImage"
    },
    {
      "line": 175,
      "name": "@Broken"
    },
    {
      "line": 175,
      "name": "@TC_BIM_03"
    }
  ]
});
formatter.step({
  "line": 177,
  "name": "user launches the browser and navigates to \"ASO_HOME\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 178,
  "name": "User navigates to L2 from home page",
  "keyword": "Then "
});
formatter.step({
  "line": 179,
  "name": "User should be able to see L2 Page",
  "keyword": "Then "
});
formatter.step({
  "line": 180,
  "name": "verfy all Image link urls status code is 200",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ASO_HOME",
      "offset": 44
    }
  ],
  "location": "Common_Web_SD.user_launches_the_browser_and_navigates_to_page(String)"
});
