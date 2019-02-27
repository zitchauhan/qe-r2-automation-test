$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/plcc/workAround.feature");
formatter.feature({
  "line": 1,
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
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Common Pre-requisite steps",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user launches the browser and navigates to \"ASO_HOME\" page",
  "keyword": "Given "
});
formatter.step({
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
  "keyword": "And "
});
formatter.step({
  "line": 8,
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
formatter.match({
  "arguments": [
    {
      "val": "ASO_HOME",
      "offset": 44
    }
  ],
  "location": "Common_Web_SD_PLCC.user_launches_the_browser_and_navigates_to_page(String)"
});
formatter.result({
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
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
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
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
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
    }
  ]
});
formatter.step({
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
});
formatter.match({
  "arguments": [
    {
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
});
formatter.after({
  "duration": 960201300,
  "status": "passed"
});
formatter.after({
  "duration": 158600,
  "status": "passed"
});
});