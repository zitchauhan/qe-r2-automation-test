package com.aso.qe.test.stepdefinition.web;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R1_PDP_K1920_SD extends CommonActionHelper{
	//private static final Logger logger = Logger.getLogger(R1SP1_KER_1920_Web_SD.class);
	R1_PDP_PO pdpPageObj = PageFactory.initElements(getDriver(), R1_PDP_PO.class);
	public R1_GlobalElementHeader_Home_PO globalElementHeader= PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);

	String productTitle = "";
	String productPrice= "";

	@Then("^user click on Add to cart button$")
	public void user_click_on_Add_to_cart_button() throws Throwable {
		pdpPageObj.addToCartAvailability();
		waitForElement(pdpPageObj.btnAddToCart);
		assertTrue(clickOnButton(pdpPageObj.btnAddToCart));
	}

	@Then("^user click on continue shopping link$")
	public void user_click_on_continue_shopping_link() throws Throwable {

		if("mobile".equalsIgnoreCase(testtype)){

			scrollPageToWebElement(pdpPageObj.lnkconitnueshopping);
			waitForElement(pdpPageObj.lnkconitnueshopping);
			assertTrue(clickOnButton(pdpPageObj.lnkconitnueshopping));
		}
		else
		{
			//driver.navigate().refresh();
			waitForElement(pdpPageObj.lnkconitnueshopping);
			assertTrue(clickOnButton(pdpPageObj.lnkconitnueshopping));
		}


	}

	@Then("^user click on view cart button$")
	public void user_click_on_view_cart_button() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)){
			scrollPageToWebElement(pdpPageObj.btnViewCart);
			Thread.sleep(10000);
			waitForElement(pdpPageObj.btnViewCart);
			assertTrue(clickOnButton(pdpPageObj.btnViewCart));
		}
		else
		{
			waitForElement(pdpPageObj.btnViewCart);
			assertTrue(clickOnButton(pdpPageObj.btnViewCart));
		}
	}

	@Then("^user click on checkout button$")
	public void user_click_on_checkout_button() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)){
			scrollPageToWebElement(pdpPageObj.btnCheckout);
			Thread.sleep(10000);
			waitForElement(pdpPageObj.btnCheckout);
			assertTrue(clickOnButton(pdpPageObj.btnCheckout));
		}else
		{
			waitForElement(pdpPageObj.btnCheckout);
			assertTrue(clickOnButton(pdpPageObj.btnCheckout));
		}

	}
	@Then("^User check for the Add to cart title$")
	public void User_check_for_the_Add_to_cart_title() throws Throwable {
		assertTrue(isDisplayed(pdpPageObj.addtocarttitle));

	}
	@Then("^User check for product name in popup$")
	public void User_check_for_product_name_in_popup() throws Throwable {
		assertTrue(isDisplayed(pdpPageObj.productname));

	}
	@Then("^User check for product price in popup$")
	public void User_check_for_product_price_in_popup() throws Throwable {
		waitForElement(pdpPageObj.productprice);
		assertTrue(isDisplayed(pdpPageObj.productprice));

	}
	@Then("^User check for product image in popup$")
	public void User_check_for_product_image_in_popup() throws Throwable {
		waitForElement(pdpPageObj.productimage);
		assertTrue(isDisplayed(pdpPageObj.productimage));

	}@Then("^User click on close button in popup$")
	public void User_click_on_close_in_popup() throws Throwable {
		waitForElement(pdpPageObj.closeicon);
		assertTrue(isDisplayed(pdpPageObj.closeicon));

	}
	@Then("^User check for the view cart title$")
	public void User_check_for_the_view_cart_title() throws Throwable {
		//		waitForElement(pdpPageObj.viewcarttitle);
		//		assertTrue(isDisplayed(pdpPageObj.viewcarttitle));
		assertTrue("Shopping Cart".equalsIgnoreCase(getTitle()));

	}

	@Then("^User check for the title of checkout$")
	public void User_check_for_the_title_of_checkout() throws Throwable {
		waitForElement(pdpPageObj.checkouttitle);
		assertTrue(isDisplayed(pdpPageObj.checkouttitle));

	}


	@Then("^User able to see the product image in the PDP$")
	public void user_able_to_see_the_product_image_in_the_PDP() throws Throwable {

		assertTrue(isDisplayed(pdpPageObj.pdpImage));
	}

	@Then("^User able to see the product price in the PDP$")
	public void user_able_to_see_the_product_price_in_the_PDP() throws Throwable {
		productPrice = getText(pdpPageObj.txtPdpprice);
	}

	@Then("^User able to see the product name in the PDP$")
	public void user_able_to_see_the_product_name_in_the_PDP() throws Throwable {
		productTitle = getText(pdpPageObj.txtProductTitle);

	}

	@Then("^then user close the add to cart popup$")
	public void then_user_close_the_add_to_cart_popup() throws Throwable {
		assertTrue(clickOnButton(pdpPageObj.btnCloseCrossAddToCartModel));
	}

	@Then("^User add product to cart and validate the price title and image of the product$")
	public void User_add_product_to_cart_and_validate_the_price_title_and_image_of_the_product() throws Throwable{
		if("mobile".equalsIgnoreCase(testtype)) {
			pdpPageObj.addToCartProductValidationMobile();
		}
		else {
			pdpPageObj.addToCartProductValidationDesktop();
		}
	}
		 @And("^user able to see item added in the cart$")
		 public void user_able_to_see_item_added_in_the_cart() throws Throwable{
			 assertTrue(isDisplayed(pdpPageObj.addtocarttitle));
		 }
	
}

