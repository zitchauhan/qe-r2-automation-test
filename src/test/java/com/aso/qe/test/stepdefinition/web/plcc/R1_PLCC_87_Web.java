package com.aso.qe.test.stepdefinition.web.plcc;

import static org.junit.Assert.assertTrue;

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

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R1_PLCC_87_Web extends CommonActionHelper {
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
		genericPO.verifyPresenceOfReviewOrderButton();
		checkout_po.ReviewOrder_Btn.click();
	}

	@When("^user click on PLACE ORDER button$")
	public void user_click_on_PLACE_ORDER_button() throws Throwable {
		genericPO.verifyPresenceOfPlaceOrderButton();
		checkout_po.btnPlaceOrderPaymentPage.click();
	}

	@Then("^user navigates to order confirmation page$")
	public void user_navigates_to_order_confirmation_page() throws Throwable {
		genericPO.verifyPresenceOfOrderConfirmationPage();
		String confirmationPageDetails = genericPO.orderConfirmationPage.getText();
		System.out.println(confirmationPageDetails);
	}

	@Then("^user expect element THANKS FOR SUBMITTING YOUR ORDER! to be present$")
	public void user_expect_element_THANKS_FOR_SUBMITTING_YOUR_ORDER_to_be_present() throws Throwable {
		genericPO.verifyPresenceOfOrderSuccesfullStatus();
	}

	@Then("^user expect element Order Number to be present$")
	public void user_expect_element_Order_Number_to_be_present() throws Throwable {
		genericPO.verifyPresenceOfOrderNumber();
	}

	@Then("^user expect element a confirmation email is on its way to be present$")
	public void user_expect_element_a_confirmation_email_is_on_its_way_to_be_present() throws Throwable {
		genericPO.verifyPresenceOfEmailOnItsWayTxt();
	}

	@Then("^user expect element print link to be present$")
	public void user_expect_element_print_link_to_be_present() throws Throwable {
		genericPO.verifyPresenceOfPrintLinkOnOrderConfirmationPage();
	}

	@Then("^user expect element my account link to be present$")
	public void user_expect_element_my_account_link_to_be_present() throws Throwable {
		genericPO.verifyPresenceOfMyAccountLinkOnOrderConfirmationPage();
	
	}

	@Then("^user place fifty orders and see the response with \"(.*?)\"$")
	public void user_place_fifty_orders_and_see_the_response_with(String searchText) throws Throwable {
		for(int n=1;n<=50;n++)
		{
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
//			clearText(searchTextBox);
//			setInputTextWithEnterKey(searchTextBox, searchWord);
			setInputText(searchTextBox, searchWord);
			Thread.sleep(Constants.thread_medium);
			assertTrue(clickOnButton(searchButton));
			Thread.sleep(Constants.thread_low);
			waitForPageLoad(driver);
			boolean checkStock=false;
			checkStock=isDisplayed(globalElementHeader_HomePO.outOfStockMessage);
			if (r1_SearchPO.verifyTextDisplayedOnPage("We couldn't find anything for")) {
			}else if(checkStock) {
			} else {
				break;
			}

		}
		if (!(searchText.toLowerCase().contains("sku")))
			clickOnButton(r2SanityPo.AS_productPLP1);
			Thread.sleep(Constants.thread_medium);
			assertTrue(isDisplayed(plccLandingPageObjects.searchBox));
			waitForElement(plccLandingPageObjects.searchBox);
			pdpPageObj.addToCartAvailability();
			waitForElement(pdpPageObj.btnAddToCart);
			assertTrue(clickOnButton(pdpPageObj.btnAddToCart));
			genericPO.clickOnCheckoutButton();
			genericPO.verifyPresenceOfCheckoutPage();
			genericPO.verifyPresenceOfPlaceOrderButton();
			checkout_po.btnPlaceOrderPaymentPage.click();
			genericPO.verifyPresenceOfOrderConfirmationPage();
			String confirmationPageDetails = genericPO.orderConfirmationPage.getText();
			System.out.println(confirmationPageDetails);
			genericPO.verifyPresenceOfOrderSuccesfullStatus();
			genericPO.verifyPresenceOfOrderNumber();
			genericPO.verifyPresenceOfEmailOnItsWayTxt();
			genericPO.verifyPresenceOfPrintLinkOnOrderConfirmationPage();
			genericPO.verifyPresenceOfMyAccountLinkOnOrderConfirmationPage();
	}


	}}
