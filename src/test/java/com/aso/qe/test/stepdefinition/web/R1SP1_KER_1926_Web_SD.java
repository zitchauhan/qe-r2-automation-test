package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.PDP_PO;
import com.aso.qe.test.pageobject.PLP_PO;
import com.aso.qe.test.pageobject.SearchProductPO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R1SP1_KER_1926_Web_SD extends CommonActionHelper{
	private static final Logger logger = Logger.getLogger(R1SP1_KER_1926_Web_SD.class);
	PDP_PO pdp_po = PageFactory.initElements(getDriver(), PDP_PO.class);
	GlobalElementHeader_HomePO globalElementHeader_HomePO = PageFactory.initElements(getDriver(), GlobalElementHeader_HomePO.class);
	PLP_PO plp_po = PageFactory.initElements(getDriver(), PLP_PO.class);
	String expectedSKU = "";
	String searchKey = "";

	@And("^user should be able to see PDP mention in the current url$")
	public void user_should_be_able_to_see_PDP_mention_in_the_current_url() throws Throwable{

		String currentURL = getCurrentPageURL();
		if(currentURL.contains("pdp")) {
			logger.debug("User is successfully navigated to PDP page with URL :: " + currentURL  );
		}
		else {
			logger.debug("User is not able to navigate to PDP instead navigated to URL :: " + currentURL  );
		}
	}


	@Then("^user should be able to see Image of the product$")
	public void user_should_be_able_to_see_Image_of_the_product() throws Throwable {
		//assert(isDisplayed(pdp_po.secSize2));//To have product in Stock
		if("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(pdp_po.imgProductMainMixedMedia_m));
		}
		else {
			assertTrue(isDisplayed(pdp_po.imgProductMainMixedMedia));
		}

	}

	@Then("^user should be able to see the name of the product in title$")
	public void user_should_be_able_to_see_the_name_of_the_product_in_title() throws Throwable {

		String productTitle = getText(pdp_po.txtProductTitle);
		logger.debug("Product title :: " + productTitle  );

	}

	@Then("^user should see different attribute and size of the product$")
	public void user_should_see_different_attribute_and_size_of_the_product() throws Throwable {
		assertTrue(isDisplayed(pdp_po.secProductAttributeSizes));
	}

	@Then("^user should be able to see Add to cart button and quantity section$")
	public void user_should_be_able_to_see_Add_to_cart_button_and_quantity_section() throws Throwable {
		pdp_po.addToCartAvailability();
		assertTrue(isDisplayed(pdp_po.btnAddToCart));
		assertTrue(isDisplayed(pdp_po.btnQuantityDec));
		assertTrue(isDisplayed(pdp_po.btnQuantityInc));
		assertTrue(isDisplayed(pdp_po.txtDesiredQtyValue_1));

	}

	@Then("^user should be able to see inventory status of the product$")
	public void user_should_be_able_to_see_inventory_status_of_the_product() throws Throwable {


		if(isDisplayed(pdp_po.txtNotifiedBack))
		{
			logger.debug("Product is in the stock");
		}else {
			logger.debug("Product is NOT in the stock");
		}
	}

	@When("^user clicks on the Details and specs tab$")
	public void user_clicks_on_the_Details_and_specs_tab() throws Throwable {
		scrollPageToWebElement(pdp_po.txtNotifiedBack);
		assertTrue(clickOnButton(pdp_po.tabDetailsSpecs));

	}

	@Then("^user should be able to see long description with feature and benefits section$")
	public void user_should_be_able_to_see_long_description_with_feature_and_benefits_section() throws Throwable {

		assertTrue(isDisplayed(pdp_po.secLongDescription));
		assertTrue(isDisplayed(pdp_po.textFeatureBenefits));
		assertTrue(clickOnButton(pdp_po.tabDetailsSpecs));

	}

	@Then("^user should be able to expand and colapse reading section with read more and read less button$")
	public void user_should_be_able_to_expand_and_colapse_reading_section_with_read_more_and_read_less_button() throws Throwable {
		// Functionality is removed from The project
		//		if((isDisplayed(pdp_po.btnReadMore))){
		//			scrollPageToWebElement(pdp_po.btnAddToCart);
		//			assertTrue(clickOnButton(pdp_po.btnReadMore));
		//
		//			logger.debug("Read More Button is displayed in the Details & Spec Tab");
		//
		//			if(isDisplayed(pdp_po.btnReadLess)) {
		//				logger.debug("Read Less Button is displayed in the Details & Spec Tab after clicking on Read More button");
		//
		//			}else {
		//				logger.debug("Read Less Button is NOT displayed in the Details & Spec Tab after clicking on Read More button");
		//			}
		//		}else {
		//			logger.debug("Read More Button is NOT displayed in the Details & Spec Tab");
		//		}
	}

	@When("^user clicks on Reviews tab$")
	public void user_clicks_on_Reviews_tab() throws Throwable {
		scrollPageToWebElement(pdp_po.txtNotifiedBack);
		assertTrue(clickOnButton(pdp_po.tabReviews));

	}

	@Then("^user should be able to see the reviews heading and section$")
	public void user_should_be_able_to_see_the_reviews_heading_and_section() throws Throwable {

		//		assertTrue(isDisplayed(pdp_po.ImgHallmark));
		//		assertTrue(isDisplayed(pdp_po.textReviews)); Functionality is not displayed without Host Enteries. Bazar voice

		assertTrue(clickOnButton(pdp_po.tabReviews));//Closing the drawer
	}

	@When("^user clicks on QandA tab$")
	public void user_clicks_on_QandA_tab() throws Throwable {
		scrollPageToWebElement(pdp_po.txtNotifiedBack);
		assertTrue(clickOnButton(pdp_po.tabQA)); 
	}

	@Then("^user clicks should be able to see QandA section$")
	public void user_clicks_should_be_able_to_see_QandA_section() throws Throwable {
		//	scrollPageToWebElement(pdp_po.txtProductSKU);
		//assert(isDisplayed(pdp_po.textQuestions)); // Functionality is not displayed without Host Enteries. Bazar voice

	}

	@Given("^user should be able to see the sku and item numbers for the given image$")
	public String user_should_be_able_to_see_the_sku_and_item_numbers_for_the_given_image() throws Throwable {
		scrollPageToWebElement(pdp_po.btnAddToCart);
		expectedSKU = getText(pdp_po.txtProductSKU);
		String itemID = getText(pdp_po.txtProductItemNumber);

		logger.debug("This product SKU is "+expectedSKU +" and Item number is "+itemID);
		return expectedSKU;
	}

	@When("^user select any other size and color of the product varient$")
	public void user_select_any_other_size_and_color_of_the_product_varient() throws Throwable {
		scrollPageToWebElement((pdp_po.imgProductMainMixedMedia));
		assertTrue((clickOnButton(pdp_po.secSize1)));

	}

	@Then("^user should be able to see the changed value of the sku and item$")
	public void user_should_be_able_to_see_the_changed_value_of_the_sku_and_item() throws Throwable {
		String previousSKU = expectedSKU;
		String skuID = getText(pdp_po.txtProductSKU);
		String itemID = getText(pdp_po.txtProductItemNumber);

		if(previousSKU.equalsIgnoreCase(skuID)) {
			logger.debug("This product SKU is " +skuID +" and Item number is " +itemID +" after selecting different size of the product it didn't change from "+previousSKU);
		}else {

			logger.debug("This product SKU is " +skuID + "and Item number is " +itemID +" after selecting different size of the product");
		}
	}

	@Then("^user clicks on the product card and navigates to PDP of the product$")
	public void user_clicks_on_the_product_card_and_navigates_to_PDP_of_the_product() throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)) {
			scrollPageToWebElement(plp_po.drpdwnSortByScrollMobile);
			Thread.sleep(1000);
			assertTrue(clickOnButton(plp_po.productPLP1_Mobile));
		}else {
			assertTrue(clickOnButton(plp_po.productPLP1));
		}


	}

	@When("^user enters \"(.*?)\" in the search box$")
	public void user_enters_in_the_search_box(String searchText) throws Throwable {
		searchKey=searchText;
		if("mobile".equalsIgnoreCase(testtype)) 
		{
			//Thread.sleep(1000);
			setInputText(SearchProductPO.searchTextBoxMobile, searchText); 
			//SearchProductPO.searchTextBoxMobile.sendKeys(searchText);
			assertTrue(clickOnButton(SearchProductPO.submitGOBtnMobile));
			logger.debug("User entered search key :: " + searchText);
			Thread.sleep(3000);
		}else {
			Thread.sleep(2000);
			SearchProductPO.searchTextBox.sendKeys(searchText);
			Thread.sleep(2000);
			assertTrue(clickOnButton(SearchProductPO.submitGOBtn));
			Thread.sleep(2000);
			assertTrue(clickOnButton(SearchProductPO.submitGOBtn));//Due to existing defect clicking is required
			logger.debug("User entered search key :: " + searchText);
		}
	}

	@Then("^user should be able to see the search term in the product title$")
	public void user_should_be_able_to_see_the_search_term_in_the_product_title() throws Throwable {
		assertEquals(searchKey, getText(pdp_po.txtProductTitle));
		logger.debug("User entered search key :: " + searchKey+ "and the search title is :: " + getText(pdp_po.txtProductTitle));
	}

	@Given("^user is able to see three tabs in the detail content section$")
	public void user_is_able_to_see_three_tabs_in_the_detail_content_section() throws Throwable {
		assertTrue(isDisplayed(pdp_po.tabReviews));
		assertTrue(isDisplayed(pdp_po.tabDetailsSpecs));
		assertTrue(isDisplayed(pdp_po.tabQA));

	}

	@Then("^user is able to see the Details and specs tab by default open$")
	public void user_is_able_to_see_the_Details_and_specs_tab_by_default_open() throws Throwable {
		assertTrue(isDisplayed(pdp_po.secLongDescription));
		assertTrue(isDisplayed(pdp_po.textFeatureBenefits));
	}

	@Then("^user clicks should be able to see the closed reviews tab$")
	public void user_clicks_should_be_able_to_see_the_closed_reviews_tab() throws Throwable {
		assert(isDisplayed(pdp_po.textQuestions));

	}

	@Then("^user clicks should be able to see the closed QandA tab$")
	public void user_clicks_should_be_able_to_see_the_closed_QandA_tab() throws Throwable {
		assert(!(isDisplayed(pdp_po.textQuestions))); 
	}

	@When("^user navigates to PLP of any product$")
	public void user_navigates_to_PLP_of_any_product() throws Throwable {
		globalElementHeader_HomePO.navigateToPLPViaClick_Desktop();
	}

	 @Then("^User refresh the page$")
	public void User_refresh_the_page() throws Throwable {
		 driver.navigate().refresh();
	 }
	 
/*	 //KER-1926 Start CR-AKK
	 @Then("^verfiy the Ask a question button$")
	 public void verfiy_the_Ask_a_question_button() throws Throwable {
		 assertTrue(isDisplayed(pdp_po.btnAskQuestion));
		 
	 }

	 @Then("^verfiy the answer this question$")
	 public void verfiy_the_answer_this_question() throws Throwable {
		 assertTrue(isDisplayed(pdp_po.btnAnswerQuestion));
		 pdp_po.cilckAnswerThisQuestion();
	 }

	 @Then("^close the answer this question popup$")
	 public void close_the_answer_this_question_popup() throws Throwable {
		 pdp_po.cilckOnCancel();
	 }
	//KER-1926 End CR-AKK
	 
	//KER-1937 Start CR-AKK	 
	 @Then("^user to fill QuestionSummary \"(.*?)\" and Nickname \"(.*?)\" and Email \"(.*?)\"$")
	 public void user_to_fill_QuestionSummary_and_Nickname_and_Email(String questionSumarry, String nickName, String email) throws Throwable {
		 assertTrue(clickOnButton(pdp_po.btnAskQuestion));
	     setInputText(pdp_po.inputQuestionSummary, questionSumarry);
	     setInputText(pdp_po.inputNickname, nickName);
	     setInputText(pdp_po.inputEmail, email);
	     assertTrue(clickOnButton(pdp_po.btnChecbox));
	 }

	 @Then("^click on post question$")
	 public void click_on_post_question() throws Throwable {
		 assertTrue(clickOnButton(pdp_po.btnPostQuesdtion));
	 }

	 @Then("^verfiy the answer is helpful$")
	 public void verfiy_the_answer_is_helpful() throws Throwable {
		 assertTrue(isDisplayed(pdp_po.btnYes)); 
		 assertTrue(isDisplayed(pdp_po.btnNo)); 
	 }
	//KER-1937 End CR-AKK
*/
	 @Then("^verfiy the answer this question$")
	 public void verfiy_the_answer_this_question() throws Throwable {
		 assertTrue(isDisplayed(pdp_po.btnAnswerQuestion));
		 pdp_po.cilckAnswerThisQuestion();
	 }

	 @Then("^close the answer this question popup$")
	 public void close_the_answer_this_question_popup() throws Throwable {
		 pdp_po.cilckOnCancel();
	 }
	//KER-1926 End CR-AKK
	 
	//KER-1937 Start CR-AKK	 
	 @Then("^user to fill QuestionSummary \"(.*?)\" and Nickname \"(.*?)\" and Email \"(.*?)\"$")
	 public void user_to_fill_QuestionSummary_and_Nickname_and_Email(String questionSumarry, String nickName, String email) throws Throwable {
		 assertTrue(clickOnButton(pdp_po.btnAskQuestion));
	     setInputText(pdp_po.inputQuestionSummary, questionSumarry);
	     setInputText(pdp_po.inputNickname, nickName);
	     setInputText(pdp_po.inputEmail, email);
	     assertTrue(clickOnButton(pdp_po.btnChecbox));
	 }

	 @Then("^click on post question$")
	 public void click_on_post_question() throws Throwable {
		 assertTrue(clickOnButton(pdp_po.btnPostQuesdtion));
	 }

	 @Then("^verfiy the answer is helpful$")
	 public void verfiy_the_answer_is_helpful() throws Throwable {
		 assertTrue(isDisplayed(pdp_po.btnYes)); 
		 assertTrue(isDisplayed(pdp_po.btnNo)); 
	 }
	//KER-1937 End CR-AKK

}

