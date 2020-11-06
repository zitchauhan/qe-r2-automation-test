package com.aso.qe.test.stepdefinition.web.plcc;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R1_PLCC_Generic_PO;
import com.aso.qe.test.pageobject.R1_PLCC_LandingPage_PO;
import com.aso.qe.test.pageobject.R1_SearchProduct_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R1_Checkout_87_Web extends CommonActionHelper {
	R2_CheckOut_PO r2CheckoutPo=PageFactory.initElements(driver, R2_CheckOut_PO.class);
	private static final Logger logger = Logger.getLogger(R1_GlobalElementHeader_Home_PO.class);
	R1_PLCC_Generic_PO genericPO = PageFactory.initElements(driver, R1_PLCC_Generic_PO.class);
	R2_CheckOut_PO checkout_po = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R1_SearchProduct_PO r1_SearchPO = PageFactory.initElements(getDriver(), R1_SearchProduct_PO.class);
	R1_GlobalElementHeader_Home_PO globalElementHeader_HomePO = PageFactory.initElements(getDriver(),
			R1_GlobalElementHeader_Home_PO.class);
	R1_PDP_PO pdpPageObj = PageFactory.initElements(getDriver(), R1_PDP_PO.class);
	R1_PLCC_LandingPage_PO plccLandingPageObjects = PageFactory.initElements(driver, R1_PLCC_LandingPage_PO.class);
	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);
	String expectedSKU = "";
	String searchKey = "";

	@Then("^user expect element plcc card image in footer to be present$")
	public void user_expect_element_plcc_card_image_in_footer_to_be_present() throws Throwable {
		genericPO.verifyPresenceOfPlccCreditCardInFooter();
	}

	@When("^user click on edit link of payment section$")
	public void user_click_on_edit_link_of_payment_section() throws Throwable {
		genericPO.verifyPresenceOfEditPayment_Link();
	}

	@When("^user enter expiry date \"(.*?)\"$")
	public void user_enter_expiry_date(String arg1) throws Throwable {
		genericPO.enterExpiryDateField(arg1);
		assertTrue(isDisplayed(checkout_po.txtExpirationDateInput));
		waitForElement(checkout_po.txtExpirationDateInput);
	}

	@When("^user enter cvv \"(.*?)\"$")
	public void user_enter_cvv(String arg1) throws Throwable {
		genericPO.enterCVVField(arg1);
		assertTrue(isDisplayed(checkout_po.txtCVVInput));
		waitForElement(checkout_po.txtCVVInput);
	}

	@When("^user click on REVIEW ORDER button$")
	public void user_click_on_REVIEW_ORDER_button() throws Throwable {
		try {
			genericPO.verifyPresenceOfReviewOrderButton();
		} catch (Exception e) {
			System.out.println("Exception Message:" + e.getMessage());
		}
		
		//for popup modal after review for SOF orders
		if(isDisplayed(r2CheckoutPo.ContinueReviewCTA))
		{
				assertTrue(clickOnButton(r2CheckoutPo.ContinueReviewCTA));
				Thread.sleep(Constants.thread_high);
			}
	}

	@When("^user click on PLACE ORDER button$")
	public void user_click_on_PLACE_ORDER_button() throws Throwable {
		try {
			genericPO.verifyPresenceOfPlaceOrderButton();
			clickOnButton(checkout_po.btnPlaceOrderPaymentPage);
		} catch (Exception e) {
			logger.debug("Exception Message: "+e.getMessage());
		}
	}

	@Then("^user navigates to order confirmation page$")
	public void user_navigates_to_order_confirmation_page() throws Throwable {
		try {
			genericPO.verifyPresenceOfOrderConfirmationPage();
			String confirmationPageDetails = genericPO.orderConfirmationPage.getText();
			System.out.println(confirmationPageDetails);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("^user expect element THANKS FOR SUBMITTING YOUR ORDER! to be present$")
	public void user_expect_element_THANKS_FOR_SUBMITTING_YOUR_ORDER_to_be_present() throws Throwable {
		try {
			genericPO.verifyPresenceOfOrderSuccesfullStatus();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("^user expect element Order Number to be present$")
	public void user_expect_element_Order_Number_to_be_present() throws Throwable {
		try {
			genericPO.verifyPresenceOfOrderNumber();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("^user expect element a confirmation email is on its way to be present$")
	public void user_expect_element_a_confirmation_email_is_on_its_way_to_be_present() throws Throwable {
		try {
			genericPO.verifyPresenceOfEmailOnItsWayTxt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("^user expect element print link to be present$")
	public void user_expect_element_print_link_to_be_present() throws Throwable {
		genericPO.verifyPresenceOfPrintLinkOnOrderConfirmationPage();
	}

	@Then("^user expect element my account link to be present$")
	public void user_expect_element_my_account_link_to_be_present() throws Throwable {
		genericPO.verifyPresenceOfMyAccountLinkOnOrderConfirmationPage();

	}

	@Then("^user place fifty orders and see the response with \"(.*?)\" with PLCC Card \"(.*?)\"$")
	public void user_place_fifty_orders_and_see_the_response_with_with_PLCC_Card(String searchText, String plccCard)
			throws Throwable {
		for (int n = 1; n <= 2; n++) {
			try {
				//plccLandingPageObjects.imgAcademyLogo.click();
				WebElement element = driver.findElement(By.xpath("//img[@src='/content/dam/academysports/Logo.png']"));
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", element);
				logger.debug("Academy Logo icon is displayed");

			} catch (Exception e) {
				e.printStackTrace();
			} 
			logger.debug("Number of Orders successfully Placed:" + n);
			waitForPageLoad(driver);
			searchKey = webPropHelper.getTestDataProperty(searchText);
			String[] arrSearchKey = searchKey.split(",");

			WebElement searchTextBox = null;
			WebElement searchButton = null;
			// WebElement

			if ("mobile".equalsIgnoreCase(testtype)) {
				// assertTrue(isDisplayed(R1_SearchProduct_PO.submitGOBtnMobile));
				if (!isDisplayed(R1_SearchProduct_PO.searchTextBoxMobile))
					assertTrue(clickOnButton(globalElementHeader_HomePO.magnifying_M));
				Thread.sleep(Constants.thread_low);
				searchTextBox = R1_SearchProduct_PO.searchTextBoxMobile;
				searchButton = R1_SearchProduct_PO.submitGOBtnMobile;
			} else {
				waitForPageLoad(driver);
				Thread.sleep(Constants.thread_low);
				assertTrue(isDisplayed(R1_SearchProduct_PO.submitGOBtn));
				searchTextBox = R1_SearchProduct_PO.searchTextBox;
				searchButton = R1_SearchProduct_PO.submitGOBtn;
			}

			for (String searchWord : arrSearchKey) {
				if ("mobile".equalsIgnoreCase(testtype)) {
					if (!isDisplayed(R1_SearchProduct_PO.searchTextBoxMobile))
						assertTrue(clickOnButton(globalElementHeader_HomePO.magnifying_M));
				}
				// clearText(searchTextBox);
				// setInputTextWithEnterKey(searchTextBox, searchWord);
				setInputText(searchTextBox, searchWord);
				Thread.sleep(Constants.thread_medium);
				assertTrue(clickOnButton(searchButton));
				Thread.sleep(Constants.thread_low);
				waitForPageLoad(driver);
				boolean checkStock = false;
				checkStock = isDisplayed(globalElementHeader_HomePO.outOfStockMessage);
				if (r1_SearchPO.verifyTextDisplayedOnPage("We couldn't find anything for")) {
				} else if (checkStock) {
				} else {
					break;
				}

			}
			if (!(searchText.toLowerCase().contains("sku")))
				clickOnButton(r2SanityPo.AS_productPLP1);
			Thread.sleep(Constants.thread_medium);
			assertTrue(isDisplayed(plccLandingPageObjects.searchBox));
			waitForElement(plccLandingPageObjects.searchBox);
			//pdpPageObj.addToCartAvailability();
			clickOnButton(genericPO.shipItButton);
			clickOnButton(genericPO.viewCartButton);
			Thread.sleep(15000);
			clickOnButton(genericPO.checkoutBtnATCCartPage);
			Thread.sleep(13000);
			try {
				if (genericPO.CreditCardNumber_Input.isDisplayed()) {
					genericPO.enterCardBinNumber(plccCard);
					Thread.sleep(8000);
					assertTrue(isDisplayed(genericPO.CreditCardNumber_Input));
			//		waitForElement(genericPO.CreditCardNumber_Input);

				} else {
					clickOnButton(genericPO.savedCardDropDown);
					clickOnButton(genericPO.addNewCardOption);
					genericPO.enterCardBinNumber(plccCard);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				clickOnButton(checkout_po.ReviewOrder_Btn);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Thread.sleep(6000);
			clickOnButton(checkout_po.btnPlaceOrderPaymentPage);
			Thread.sleep(8000);
/*			try {
				genericPO.verifyPresenceOfOrderConfirmationPage();
				String confirmationPageDetails = genericPO.orderConfirmationPage.getText();
				System.out.println(confirmationPageDetails);
				genericPO.verifyPresenceOfOrderSuccesfullStatus();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
	}

	@When("^user uncheck Save Payment Info for Later Checkbox$")
	public void user_uncheck_Save_Payment_Info_for_Later_Checkbox() throws Throwable {
		clickOnButton(genericPO.savePaymentInfoForLaterCheckBox);
	}

	@When("^user check same as shipping address$")
	public void user_check_same_as_shipping_address() throws Throwable {
		clickOnButton(genericPO.checkSameAsShippingAddress);
	}
	
	@Given("^user expect element Order Summary to be present$")
	public void user_expect_element_Order_Summary_to_be_present() throws Throwable {
		try {
			genericPO.verifyPresenceOfOrderSummary();
		} catch (Exception e) {
			logger.debug("Exception Message:"+e.getMessage());
		}
	}

	@When("^user expecte element Sign in link for guest user$")
	public void user_expecte_element_Sign_in_link_for_guest_user() throws Throwable {
		try {
			genericPO.verifyPresenceOfSignInLinkForGuestUser();
		} catch (Exception e) {
			System.out.println("Exception Message: "+e.getMessage());
		}
	}
	
}
