package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_SIT_PO;
import com.aso.qe.test.pageobject.R1_SearchProduct_PO;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_HomePage_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R1_SD_SIT extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R1_SD_SIT.class);
	R1_SIT_PO sit_po = PageFactory.initElements(driver, R1_SIT_PO.class);
	R1_HomePage_PO hp_p=PageFactory.initElements(getDriver(), R1_HomePage_PO.class);
	R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	// SD_SIT_AddtoWishList Addsit_po= new SD_SIT_AddtoWishList();

	@Then("^user click on Add to Wish List/Sign In$")
	public void user_click_on_Add_to_Wish_List_Sign_In() throws Throwable {
		assertTrue(clickOnButton(sit_po.lnkaddtowishlist));
	}

	@Then("^user click on MyAccount link$")
	public void user_click_on_MyAccount_link() throws Throwable {
		globalElementHeader.clickMyAccountDropDown();
	}

	@Then("^user click on WishList link$")
	public void user_click_on_WishList_link() throws Throwable {
		globalElementHeader.clickOnWishListsFromMyAccount();

	}

	@Then("^user should verify the WishList page and create new Wishlist$")
	public void user_should_verify_the_WishList_page_and_create_new_Wishlist() throws Throwable {
		assertTrue(clickOnButton(sit_po.btnNewWishlist));
		assertTrue(isDisplayed(sit_po.tltCreatewishlist));
		sit_po.enterListName();
		assertTrue(clickOnButton(sit_po.btnsave));
		assertTrue(clickOnButton(sit_po.btnNewWishlist));
		assertTrue(clickOnButton(sit_po.btncancel));
	}

	@Then("^user should verify the created WishList$")
	public void user_should_verify_the_created_WishList() throws Throwable {
		waitForElement(sit_po.txtwishlistselect);
		isDisplayed(sit_po.txtwishlistselect);
		String wishlist = getText(sit_po.txtwishlistselect);
		logger.info("Created Wishlist name " + wishlist);

	}

	@Then("^user should rename the created WishList$")
	public void user_should_rename_the_created_WishList() throws Throwable {
		Thread.sleep(Constants.thread_low); 
		isClickable(sit_po.btnrenamewishlist);
		waitForElement(sit_po.btnrenamewishlist);
		assertTrue(clickOnButton(sit_po.btnrenamewishlist));
		// Addsit_po.clearInputBox(sit_po.txtListname);
		waitForElement(sit_po.renameWishListModal);
		sit_po.txtrenamewishlistselect.click();
		sit_po.txtrenamewishlistselect.clear();
		sit_po.txtrenamewishlistselect.click();
		sit_po.renameWishListName(); // rename wishlist
		isClickable(sit_po.btnrenamesave);
		assertTrue(clickOnButton(sit_po.btnrenamesave));

	}

	@Then("^user should delete the created WishList$")
	public void user_should_delete_the_created_WishList() throws Throwable {
		Thread.sleep(Constants.thread_low); 
		isClickable(sit_po.btndeletewishlist);
		waitForElement(sit_po.btndeletewishlist);
		Thread.sleep(Constants.thread_low); 
		assertTrue(clickOnButton(sit_po.btndeletewishlist));
		assertTrue(isDisplayed(sit_po.tltDeletewishlist));
		assertTrue(clickOnButton(sit_po.btndeletecancel));
		Thread.sleep(Constants.thread_low); 
		isClickable(sit_po.btndeletewishlist);
		waitForElement(sit_po.btndeletewishlist);
		assertTrue(clickOnButton(sit_po.btndeletewishlist));
		assertTrue(clickOnButton(sit_po.btndelete));
	}

	@Then("^user click on Address Book link$")
	public void user_click_on_Address_Book_link() {
		assertTrue(clickOnButton(sit_po.clickAddressBook));
	}

	@Then("^user should create a WishList$")
	public void user_should_create_a_WishList() throws Throwable {
		sit_po.txtcreatenewwishlist.sendKeys("Mywish");
		assertTrue(clickOnButton(sit_po.btncreatenewwishlist));

	}

	@Then("^user should verify the Guest checkout Page$")
	public void user_should_verify_the_Guest_checkout_Page() throws Throwable 
	{
		waitForElement(sit_po.btncheckoutguest);
		assertTrue(isDisplayed(sit_po.btncheckoutguest));
		assertTrue(isDisplayed(sit_po.btnpaypalguest));
		assertTrue(isDisplayed(sit_po.btnsigninguest));

	}

	@Then("^user click on Checkout as Guest button$")
	public void user_click_on_Checkout_as_Guest_button() throws Throwable {
		assertTrue(clickOnButton(sit_po.btncheckoutguest));

	}

	@Then("^user validate the cart icon$")
	public void user_validate_the_cart_icon() throws Throwable {
		globalElementHeader.validatingAddtoCartIcon();
	}

	@Then("^user click on cart icon and verify the cart page$")
	public void user_click_on_cart_icon_and_verify_the_cart_page() throws Throwable {
		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(globalElementHeader.iconcart_m));

		} else {
			assertTrue(clickOnButton(globalElementHeader.iconcart));

		}

	}

	@Then("^user click on Account Summary link$")
	public void user_click_on_Account_Summary_link() throws Throwable {

		// globalElementHeader.clickOnAccountSummaryFromMyAccount();
		clickOnButton(sit_po.lnkAccountSummary);

	}

	@Then("^user should verify the Account Summary page$")
	public void user_should_verify_the_Account_Summary_page() throws Throwable {
		assertTrue(isDisplayed(sit_po.txtcantfindorder));
		assertTrue(isDisplayed(sit_po.labelordernumber));
		assertTrue(isDisplayed(sit_po.labelshippingzip));
	}

	@Then("^user should verify the Address Book page$")
	public void should_verify_the_Address_Book_page() throws Throwable {
		assertTrue(isDisplayed(sit_po.btnNewAddress));
		assertTrue(isDisplayed(sit_po.verifybtnedit));

	}

	@Then("^user click on Add New Address button$")
	public void user_click_on_Add_New_Address_button() throws Throwable {
		Thread.sleep(Constants.thread_low); 
		clickOnButton(sit_po.btnNewAddress);
	}

	@Then("^user enter new address details and click on save button$")
	public void user_enter_new_address_details_and_click_on_save_button() throws Throwable {
		assertTrue(isDisplayed(sit_po.txtNewAddress));
		sit_po.enterFirstName();
		sit_po.enterLastName();
		sit_po.enterPhoneNumber();
		sit_po.enterAddress();
		sit_po.enterZipCode();
		// sit_po.enterCity();
		// sit_po.SelectState();
		assertTrue(clickOnButton(sit_po.btnsavebutton));

	}

	@Then("^user verify the address and click on continue button and ok button$")
	public void user_verify_the_address_and_click_on_continue_button_and_ok_button() throws Throwable {
		waitForElement(sit_po.txtAddressverification);
		assertTrue(isDisplayed(sit_po.txtAddressverification));
		clickOnButton(sit_po.btncontinue);
		assertTrue(isDisplayed(sit_po.txtAddresssuccessmsg));
		Thread.sleep(Constants.thread_low); 
		clickOnButton(sit_po.btnok);

	}

	@Then("^user click on edit button$")
	public void user_click_on_edit_button() throws Throwable {
		Thread.sleep(Constants.thread_low); 
		clickOnButton(sit_po.btnedit);
		Thread.sleep(Constants.thread_low); 
	}

	@Then("^user modify the address and click on continue button and ok button$")
	public void user_modify_the_address_and_click_on_continue_button_and_ok_button() throws Throwable {
		Thread.sleep(Constants.thread_low); 
		sit_po.cleartext();
		Thread.sleep(Constants.thread_low); 
		// sit_po.enterPhoneNumber();
		sit_po.txtclearphonenumber.sendKeys("1234567890");
		assertTrue(clickOnButton(sit_po.btneditsavebutton));
		assertTrue(isDisplayed(sit_po.txtAddressverification));
		assertTrue(clickOnButton(sit_po.btncontinue));
		assertTrue(isDisplayed(sit_po.txteditAddresssuccessmsg));
		assertTrue(clickOnButton(sit_po.btneditok));
		System.out.println("123");
		Thread.sleep(Constants.thread_low); 

	}

	@Then("^user click on delete address button$")
	public void user_click_on_delete_address_button() throws Throwable {
		assertTrue(clickOnButton(sit_po.btndeleteAddressBook));
	}

	@Then("^user verify the delete address page and click on yes button$")
	public void user_verify_the_delete_address_page_and_click_on_yes_button() throws Throwable {
		assertTrue(isDisplayed(sit_po.txtDeletesmsg));
		assertTrue(clickOnButton(sit_po.btnyes));
	}

	@Then("^user click on continue checkout button$")
	public void user_click_on_continue_checkout_button() throws Throwable 
	{
		waitForElement(sit_po.btnContinueCheckout);
		isDisplayed(sit_po.btnContinueCheckout);
		assertTrue(clickOnButton(sit_po.btnContinueCheckout));
	}

	@Then("^User will click on Deals Link$")
	public void user_will_click_on_Deals_Link() throws Throwable {
		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(globalElementHeader.btnDEALS_m));
		} else {
			assertTrue(clickOnButton(globalElementHeader.btnDEALS));
		}

	}

	@Then("^User will click on Daily Deals and click on product$")
	public void user_will_click_on_Daily_Deals_and_click_on_product() throws Throwable {
		sit_po.navigateToDealsandclickonproduct();
	}

	@Then("^user should enter the shipping Address details$")
	public void user_should_enter_the_shipping_Address_details() throws Throwable {
		sit_po.enterFirstName();
		sit_po.enterLastName();
		sit_po.enterAddress();
		sit_po.enterZipCode();
		sit_po.enterPhoneNumber();
		sit_po.enterEmail();
	}

	@Then("^User clicks on AcademyCredit link and should be navigated to AcademyCreditPage$")
	public void User_clicks_on_AcademyCredit_link_and_should_be_navigated_to_AcademyCreditPage() throws Exception {

		sit_po.clickAcademycreditLink();
		sit_po.verifyTheAcademyCreditPage();

	}

	@Then("^user should verify the Product is not for sold in store$")
	public void user_should_verify_the_Product_is_not_for_sold_in_store() {
		assertTrue(isDisplayed(sit_po.inventoryMessage));
		boolean flag = sit_po.inventoryMessage.getText().toLowerCase().equalsIgnoreCase("Not Sold in Stores");
		if (!flag) {
			logger.debug(
					"Expected Message: 'Not Sold in Stores' but found '" + sit_po.inventoryMessage.getText() + "'");
			Assert.fail();
		}
	}

	@Then("^user should able to click on Signin button$")
	public void user_should_able_to_click_on_Signin_button() throws Throwable {
		if ("mobile".equalsIgnoreCase(testtype)) {
			Thread.sleep(Constants.thread_low); 
			clickOnButton(globalElementHeader.btnSHOPBurgerMenuMinusIcon);
			Thread.sleep(Constants.thread_low); 
			scrollPageToWebElement(globalElementHeader.btnSignIn_mobile);
			waitForElement(globalElementHeader.btnSignIn_mobile);
			clickOnButton(globalElementHeader.btnSignIn_mobile);
			Thread.sleep(Constants.thread_low); 
		} else {
			assertTrue(clickOnButton(globalElementHeader.btnSignIn));
		}

	}

	@Then("^user should be able to enter the signin details \"(.*?)\" \"(.*?)\"$")
	public void user_should_be_able_to_enter_the_signin_details(String arg1, String arg2) throws Throwable 
	{
		sit_po.verifySigninpage();
		globalElementHeader.enterEmailAddressandPassword(arg1, arg2);
		globalElementHeader.clickSubmitButton();
		if("mobile".equalsIgnoreCase(testtype)) 
		{
			waitForPageLoad(driver);
		}
		else 
		{
			waitForElement(globalElementHeader.btnMyAccount);
		assertTrue(isDisplayed(globalElementHeader.btnMyAccount));
			
		
		}
	} 

	/*@Then("^user should be able to enter the signin details$")
	public void user_should_be_able_to_enter_the_signin_details() throws Throwable {
		//sit_po.verifySigninpage();
		globalElementHeader.enterEmailAddressandPassword();
		globalElementHeader.clickSubmitButton();
	}*/

	@Then("^User will verify the presence of ASO Logo and click on Logo$")
	public void user_will_verify_the_presence_of_ASO_Logo() throws Throwable {
		// scrollPageToWebElement(globalElementHeader.btnSignIn);
		globalElementHeader.clickASO_LOGO();
	}

	@Then("^user should able to click on Signup button$")
	public void user_should_able_to_click_on_Signup_button() throws Throwable {
		 assertTrue(clickOnButton(globalElementHeader.lnkSignUp));
	}

	@And("^user should able to enter the Signup details$")
	public void user_should_able_to_enter_the_Signup_details() throws Throwable {
		globalElementHeader.enterFirstName();
		globalElementHeader.enterLastName();
		globalElementHeader.enterEmailAddress_signup();
		globalElementHeader.enterPasswordForSignUp();
		globalElementHeader.enterConfirmPassword();
		
	}
	@And("^user verify he is signed in$")
	public void user_verify_he_is_signed_in() {
		assertTrue(clickOnButton(globalElementHeader.btnSignUp));
		assertTrue(isDisplayed(globalElementHeader.txtWelcome));
	}

	@Then("^user sign out from the website$")
	public void user_sign_out_from_the_website() throws Throwable 
	{
		globalElementHeader.signOut();
	}
	
	@And("^user verify the shipping address$")
	public void user_verify_the_shipping_address() throws InterruptedException{
		waitForElement(sit_po.shippingAddress);
		isDisplayed(sit_po.shippingAddress);
	}
	
	@And("^user verify order summary$")
	public void user_verify_order_summary(){
		waitForElement(sit_po.txtordersummary);
		assertTrue(isDisplayed(sit_po.txtordersummary));
	}
	
	@Then("^user click on continue shipping method button$")
	public void user_click_on_continue_shipping_method_button(){
		waitForElement(sit_po.clickContinueShippingMethod);
		assertTrue(clickOnButton(sit_po.clickContinueShippingMethod));
	}
	
	@And("^user verify shipping method and order summary$")
	public void user_verify_shipping_method_and_order_summary() throws InterruptedException{
//		Thread.sleep(3000);
		waitForElement(sit_po.Shippingmethod);
		assertTrue(isDisplayed(sit_po.txtordersummary));
		assertTrue(isDisplayed(sit_po.Shippingmethod));
	}
	
	@Then("^user click on continue payment button$")
	public void user_click_on_continue_payment_button(){
		waitForElement(sit_po.btncontinuepayment);
		assertTrue(clickOnButton(sit_po.btncontinuepayment));
	}
	@And("^user enter the payment details$")
	public void user_enter_the_payment_details() throws Exception{
		sit_po.validatecreditcarddetails();
	}

	
	@Then("^user should click on continue to review button$")
	public void user_should_click_on_continue_to_review_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(clickOnButton(sit_po.btncontinuetoreview));
		Thread.sleep(Constants.thread_low); 
	}
	
	@Then("^user should able to see shipping Address page$")
	public void user_should_able_to_see_shipping_Address_page() throws Throwable {
		sit_po.verifyShippingAddressPage() ;
		
	}
	
	@Then("^user click on continue to shipping method button$")
	public void user_click_on_continue_to_shipping_method_button() throws Throwable {
		waitForElement(sit_po.btnContiuneToMethod);
		isDisplayed(sit_po.btnContiuneToMethod);
		assertTrue(clickOnButton(sit_po.btnContiuneToMethod));
		if (sit_po.checkContinueButton()) {
			clickOnButton(sit_po.clickContinuebtn);
		}
	}
	

	
	@And("^user enter verified by visa password and click on submit button$")
	public void user_enter_verified_by_visa_password_and_click_on_submit_button() throws Throwable 
	{
		Thread.sleep(Constants.thread_highest); 
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("Cardinal-CCA-IFrame"))));
		driver.switchTo().frame("Cardinal-CCA-IFrame");
		System.out.println("2222");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("authWindow"))));
		driver.switchTo().frame("authWindow");
		System.out.println("3333");
		Thread.sleep(Constants.thread_medium);
		getfindElementByXPath("//tr/td/img").isDisplayed();//SID 11-August-18
		setInputText(sit_po.txtpwd, "1234"); //SID 11-August-18
		System.out.println("4444");
		assertTrue(clickOnButton(sit_po.btnsubmit));
		System.out.println("555");
		Thread.sleep(Constants.thread_medium);
		getDriver().switchTo().defaultContent();
		Thread.sleep(Constants.thread_medium);

	}
	
	
	@And("^user should able to verify the Review shipping address$")
	public void user_should_able_to_verify_the_Review_shipping_address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		sit_po.verifyReviewShippingaddress();
	}
	
	@And("^user should able to verify the Review shipping method$")
	public void user_should_able_to_verify_the_Review_shipping_method() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		sit_po.verifyReviewShippingmethod();
	}

	@And("^user should able to verify the billing address$")
	public void user_should_able_to_verify_the_billing_address() throws Throwable {
		sit_po.verifyBillingaddress() ;
	}

	@And("^user should able to verify the payment method$")
	public void user_should_able_to_verify_the_payment_method() throws Throwable {
		
		sit_po.verifyPaymentmethod();
	   
	}
	
	@Then("^user should click on Place Order Now button$")
	public void on() throws Throwable {
		assertTrue(clickOnButton(sit_po.btnplaceordernow));
		Thread.sleep(Constants.thread_low); 
		if(isDisplayed(sit_po.noInventoryAtCheckout)) {
			if(clickOnButton(sit_po.btnplaceordernow)) {
				assertTrue(clickOnButton(sit_po.btnplaceordernow));
				assertTrue(isDisplayed(sit_po.orderPlaceSuccessMessage));
			}
		else {
			logger.debug("Cart is empty");
			Assert.fail();
		}
		}
		assertTrue(isDisplayed(sit_po.orderPlaceSuccessMessage));
		logger.debug("Order Number "+sit_po.orderPlaceSuccessMessage.getText());
	}
	
	@Then("^user clicks on product card and navigates to PDP page$")
	public void user_clicks_on_product_card_and_navigates_to_PDP_page(){
		waitForElement(sit_po.clickProuctCard);
		assertTrue(clickOnButton(sit_po.clickProuctCard));
	}
	@When("^User enters in Required_Product with search term and click on Go button$")
	public void user_enters_in_Required_Product_with_search_term_and_click_on_Go_button() throws Throwable {
		
		clickOnButton(R1_SearchProduct_PO.searchTextBox);
		setInputTextWithEnterKey(R1_SearchProduct_PO.searchTextBox, webPropHelper.getTestDataProperty("Not_Sold_in_Store"));
	}

	@Then("^user should verify MyAccount page$")
	public void user_should_verify_MyAccount_page() {
		assertTrue((clickOnButton(globalElementHeader.btnMyAccount)));
		globalElementHeader.verifyMyAccount();
	}
	
	
}
