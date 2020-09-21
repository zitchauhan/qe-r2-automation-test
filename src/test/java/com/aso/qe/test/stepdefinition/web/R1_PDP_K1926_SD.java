package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import static org.junit.Assert.assertEquals;
import org.apache.log4j.Logger;
import org.junit.internal.matchers.StacktracePrintingMatcher;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_PDP_PO;
import com.aso.qe.test.pageobject.R1_PLCC_Generic_PO;
import com.aso.qe.test.pageobject.R1_PLP_PO;
import com.aso.qe.test.pageobject.R1_SearchProduct_PO;
import com.aso.qe.test.pageobject.R2_Sanity_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class R1_PDP_K1926_SD extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R1_PDP_K1926_SD.class);
	R1_PDP_PO pdp_po = PageFactory.initElements(getDriver(), R1_PDP_PO.class);
	R1_SearchProduct_PO r1_SearchPO = PageFactory.initElements(getDriver(), R1_SearchProduct_PO.class);
	R1_GlobalElementHeader_Home_PO globalElementHeader_HomePO = PageFactory.initElements(getDriver(),
			R1_GlobalElementHeader_Home_PO.class);
	R1_PLCC_Generic_PO generic_po = PageFactory.initElements(getDriver(), R1_PLCC_Generic_PO.class);
	R1_PLP_PO plp_po = PageFactory.initElements(getDriver(), R1_PLP_PO.class);
	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);
	String expectedSKU = "";
	String searchKey = "";

	@And("^user should be able to see PDP mention in the current url$")
	public void user_should_be_able_to_see_PDP_mention_in_the_current_url() throws Throwable {

		String currentURL = getCurrentPageURL();
		if (currentURL.contains("pdp")) {
			logger.debug("User is successfully navigated to PDP page with URL :: " + currentURL);
		} else {
			logger.debug("User is not able to navigate to PDP instead navigated to URL :: " + currentURL);
		}
	}

	@Then("^user should be able to see Image of the product$")
	public void user_should_be_able_to_see_Image_of_the_product() throws Throwable {
		// assert(isDisplayed(pdp_po.secSize2));//To have product in Stock
		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(pdp_po.imgProductMainMixedMedia_m));
		} else {
			assertTrue(isDisplayed(pdp_po.imgProductMainMixedMedia));
		}

	}

	@Then("^user should be able to see the name of the product in title$")
	public void user_should_be_able_to_see_the_name_of_the_product_in_title() throws Throwable {

		String productTitle = getText(pdp_po.txtProductTitle);
		logger.debug("Product title :: " + productTitle);

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
	
	@Then("^user should be able to see ship it button and quantity section$")
	public void user_should_be_able_to_see_ship_it_button_and_quantity_section() throws Throwable {
		pdp_po.addToCartAvailability();
		assertTrue(isDisplayed(generic_po.shipItButton));
		assertTrue(isDisplayed(pdp_po.btnQuantityDec));
		assertTrue(isDisplayed(pdp_po.btnQuantityInc));
		assertTrue(isDisplayed(pdp_po.txtDesiredQtyValue_1));

	}

	@Then("^user should be able to see inventory status of the product$")
	public void user_should_be_able_to_see_inventory_status_of_the_product() throws Throwable {

		if (isDisplayed(pdp_po.txtNotifiedBack)) {
			logger.debug("Product is in the stock");
		} else {
			logger.debug("Product is NOT in the stock");
		}
	}

	@When("^user clicks on the Details and specs tab$")
	public void user_clicks_on_the_Details_and_specs_tab() throws Throwable {
		scrollPageToWebElement(pdp_po.txtNotifiedBack);
		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(pdp_po.tabDetailsSpecsMobile));
		} else {
			assertTrue(clickOnButton(pdp_po.tabDetailsSpecs));
		}
	}

	@Then("^user should be able to see long description with feature and benefits section$")
	public void user_should_be_able_to_see_long_description_with_feature_and_benefits_section() throws Throwable {

		// assertTrue(isDisplayed(pdp_po.secLongDescription));
		assertTrue(isDisplayed(pdp_po.textFeatureBenefits));
		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(pdp_po.tabDetailsSpecsMobile));
		} else {
			waitForElement(pdp_po.tabDetailsSpecs);
			assertTrue(isDisplayed(pdp_po.tabDetailsSpecs));
		}

	}

	@Then("^user should be able to expand and colapse reading section with read more and read less button$")
	public void user_should_be_able_to_expand_and_colapse_reading_section_with_read_more_and_read_less_button()
			throws Throwable {
		// Functionality is removed from The project
		// if((isDisplayed(pdp_po.btnReadMore))){
		// scrollPageToWebElement(pdp_po.btnAddToCart);
		// assertTrue(clickOnButton(pdp_po.btnReadMore));
		//
		// logger.debug("Read More Button is displayed in the Details & Spec Tab");
		//
		// if(isDisplayed(pdp_po.btnReadLess)) {
		// logger.debug("Read Less Button is displayed in the Details & Spec Tab after
		// clicking on Read More button");
		//
		// }else {
		// logger.debug("Read Less Button is NOT displayed in the Details & Spec Tab
		// after clicking on Read More button");
		// }
		// }else {
		// logger.debug("Read More Button is NOT displayed in the Details & Spec Tab");
		// }
	}

	@When("^user clicks on Reviews tab$")
	public void user_clicks_on_Reviews_tab() throws Throwable {
		try {
			scrollPageToWebElement(pdp_po.txtNotifiedBack);
			if ("mobile".equalsIgnoreCase(testtype)) {
				assertTrue(clickOnButton(pdp_po.tabReviewsMobile));
			} else {
				assertTrue(clickOnButton(pdp_po.tabReviews));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Then("^user should be able to see the reviews heading and section$")
	public void user_should_be_able_to_see_the_reviews_heading_and_section() throws Throwable {

		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(pdp_po.tabReviewsMobile));
		} else {
			assertTrue(clickOnButton(pdp_po.tabReviews));
		}
	}

	@When("^user clicks on QandA tab$")
	public void user_clicks_on_QandA_tab() throws Throwable {
		scrollPageToWebElement(pdp_po.txtNotifiedBack);
		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(pdp_po.tabQAMobile));
		} else {
			assertTrue(clickOnButton(pdp_po.tabQA));
		}

	}

	@Then("^user clicks should be able to see QandA section$")
	public void user_clicks_should_be_able_to_see_QandA_section() throws Throwable {
		// scrollPageToWebElement(pdp_po.txtProductSKU);
		// assert(isDisplayed(pdp_po.textQuestions)); // Functionality is not displayed
		// without Host Enteries. Bazar voice
		assertTrue((clickOnButton(pdp_po.QALink)));
	}

	@Given("^user should be able to see the sku and item numbers for the given image$")
	public String user_should_be_able_to_see_the_sku_and_item_numbers_for_the_given_image() throws Throwable {
		String itemID = "";
		if(isDisplayed(pdp_po.GCOutOfStock))
		{
			expectedSKU = getText(pdp_po.txtProductSKU);
			itemID = getText(pdp_po.txtProductItemNumber);	
		}
		
		else
		{
		scrollPageToWebElement(pdp_po.btnAddToCart);
		expectedSKU = getText(pdp_po.txtProductSKU);
		itemID = getText(pdp_po.txtProductItemNumber);
		}
		
		logger.debug("This product SKU is " + expectedSKU + " and Item number is " + itemID);
		return expectedSKU;
	}

	@When("^user select any other size and color of the product varient$")
	public void user_select_any_other_size_and_color_of_the_product_varient() throws Throwable {
		try {
			scrollPageToWebElement((pdp_po.imgProductMainMixedMedia));
			assertTrue((clickOnButton(pdp_po.secSize1)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Then("^user should be able to see the changed value of the sku and item$")
	public void user_should_be_able_to_see_the_changed_value_of_the_sku_and_item() throws Throwable {
		String previousSKU = expectedSKU;
		String skuID = getText(pdp_po.txtProductSKU);
		String itemID = getText(pdp_po.txtProductItemNumber);

		if (previousSKU.equalsIgnoreCase(skuID)) {
			logger.debug("This product SKU is " + skuID + " and Item number is " + itemID
					+ " after selecting different size of the product it didn't change from " + previousSKU);
		} else {

			logger.debug("This product SKU is " + skuID + "and Item number is " + itemID
					+ " after selecting different size of the product");
		}
	}

	@Then("^user clicks on the product card and navigates to PDP of the product$")
	public void user_clicks_on_the_product_card_and_navigates_to_PDP_of_the_product() throws Throwable {
		if ("mobile".equalsIgnoreCase(testtype)) {
			scrollPageToWebElement(plp_po.drpdwnSortByScrollMobile);
			Thread.sleep(Constants.thread_low); 
			assertTrue(clickOnButton(plp_po.productPLP1_Mobile));
		} else {
			Thread.sleep(Constants.thread_low);
			waitForElement(plp_po.productPLP1);
			assertTrue(clickOnButton(plp_po.productPLP1));
			Thread.sleep(Constants.thread_low);
		}

	}
	
	
	
	//SID ADDED AS REQUIRED FOR R1 CODES
	@When("^user enters \"(.*?)\" in the searchbox$")
	public void user_enters_in_the_searchbox(String searchText) throws Throwable 
	{
		searchKey=webPropHelper.getTestDataProperty(searchText);   //SID 24-August;
		if("mobile".equalsIgnoreCase(testtype)) 
		{
			//assertTrue(isDisplayed(R1_SearchProduct_PO.submitGOBtnMobile));
			if(!isDisplayed(R1_SearchProduct_PO.searchTextBoxMobile)) 
			{
				//assertTrue(clickOnButton(globalElementHeader_HomePO.magnifying_M));
				clickOnButton(globalElementHeader_HomePO.magnifying_M);
				//Thread.sleep(1000);
			}
			setInputText(R1_SearchProduct_PO.searchTextBoxMobile, webPropHelper.getTestDataProperty(searchText)); 
			assertTrue(clickOnButton(R1_SearchProduct_PO.submitGOBtnMobile));
			logger.debug("User entered search key :: " + searchText);
			
		}else {
			waitForPageLoad(driver);
			//Thread.sleep(2000);
			assertTrue(isDisplayed(R1_SearchProduct_PO.submitGOBtn));
			R1_SearchProduct_PO.searchTextBox.sendKeys(webPropHelper.getTestDataProperty(searchText));
			Thread.sleep(2000);
			assertTrue(clickOnButton(R1_SearchProduct_PO.submitGOBtn));
			//Thread.sleep(2000);
//			assertTrue(clickOnButton(R1_SearchProduct_PO.submitGOBtn));//Due to existing defect clicking is required
			logger.debug("User entered search key :: " + searchText);
		}
	}


	@When("^user enters \"(.*?)\" in the search box$")
	@And("^User searches a product \"(.*?)\" and navigates to PDP$")
	public void user_enters_in_the_search_box(String searchText) throws Throwable {
		waitForPageLoad(driver);
		//Thread.sleep(2000);
		System.out.println("text to search =" +searchText);
		searchKey = webPropHelper.getTestDataProperty(searchText);
		String[] arrSearchKey = searchKey.split(",");

		WebElement searchTextBox = null;
		WebElement searchButton = null;
		

		if ("mobile".equalsIgnoreCase(testtype)) {
			// assertTrue(isDisplayed(R1_SearchProduct_PO.submitGOBtnMobile));
			if (!isDisplayed(R1_SearchProduct_PO.searchTextBoxMobile))
				System.out.println("clicking magnify symbol");
			System.out.println("magnify xpath=  "+globalElementHeader_HomePO.magnifying_M);
				assertTrue(clickOnButton(globalElementHeader_HomePO.magnifying_M));
			Thread.sleep(Constants.thread_low); 
			searchTextBox = R1_SearchProduct_PO.searchTextBoxMobile;
			searchButton = R1_SearchProduct_PO.submitGOBtnMobile;
		} else {
			waitForPageLoad(driver);
			Thread.sleep(Constants.thread_low); 
			//Verifying for the search text and search btn
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
			//setInputTextWithEnterKey(searchTextBox, searchWord);
			setInputText(searchTextBox, searchWord);
			assertTrue(clickOnButton(searchButton));
			/*boolean checkStock=false;
			checkStock=isDisplayed(globalElementHeader_HomePO.outOfStockMessage);//out of stock validation which returns boolean result
			System.out.println("priting the DOM value of Out of Stock"+globalElementHeader_HomePO.outOfStockMessage.getText());
			System.out.println("Printing boolean value"+ checkStock);
			if (r1_SearchPO.verifyTextDisplayedOnPage("We couldn't find anything for")) //if product is not available--invalid search
			{
				System.out.println("product is not available in the application");
			}
			else if(checkStock) 
			{
				System.out.println("out of stock scenario is verified successfully");
			} 
			else 
			{
				break;
			}*/

		}
		if (!(searchText.toLowerCase().contains("sku")))
			clickOnButton(r2SanityPo.AS_productPLP1);
		Thread.sleep(Constants.thread_medium);

	}
	
	
//	@When("^user adds \"(.*?)\" product to the cart$")
//	public void user_adds_product_to_the_cart(String arg1) throws Throwable {
//		boolean isAddtoCart= false;
//		try
//		{
//			waitForElement(selectedSwatchRepresentative);
//			isDisplayed(selectedSwatchRepresentative);
//
//			if (btnAddToCart.isDisplayed()) 
//			{
//				isAddtoCart=true;
//				
//			}
//			else
//			{
//				
//				for(WebElement colorElement: colorsAvailable)
//				{
//					clickOnButton(colorElement);
//					for(WebElement sizeElement:sizeAvailable)
//					{
//						logger.debug("Product Size Txt::"+sizeElement.getText());
//						clickOnButton(sizeElement);
//						if(isDisplayed(btnAddToCart))
//						{
//							isAddtoCart=true;
//							break;
//						}
//					}
//					if(isAddtoCart)
//					{
//						break;
//					}
//				}
//				
//			}
//		}
//		catch (NoSuchElementException e) 
//		{
//			for(WebElement colorElement: colorsAvailable)
//			{
//				clickOnButton(colorElement);
//				for(WebElement sizeElement:sizeAvailable)
//				{
//					logger.debug("Product Size Txt::"+sizeElement.getText());
//					clickOnButton(sizeElement);
//					if(isDisplayed(btnAddToCart))
//					{
//						isAddtoCart=true;
//						break;
//					}
//				}
//				if(isAddtoCart)
//				{
//					break;
//				}
//			}
//			//logger.error("addToCartAvailability exception msg::"+e.getMessage());
//		}
//		catch (Exception e) 
//		{
//			logger.error("addToCartAvailability exception msg::"+e.getMessage());
//		}
//		logger.debug("Add to Cart buttion is visable::"+isAddtoCart);
//		return isAddtoCart;
//	}
//	}

	@When("^user enters \"(.*?)\" in the search box and navigates to PLP$") // not navigating to PDP
	public void user_enters_in_the_search_box_and_navigate_tp_PLP(String searchText) throws Throwable {
		searchKey = webPropHelper.getTestDataProperty(searchText);
		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(R1_SearchProduct_PO.submitGOBtnMobile));
			if (!isDisplayed(R1_SearchProduct_PO.searchTextBoxMobile)) {
				assertTrue(clickOnButton(globalElementHeader_HomePO.magnifying_M));
				Thread.sleep(Constants.thread_low);
			}
			setInputTextWithEnterKey(R1_SearchProduct_PO.searchTextBoxMobile,
					webPropHelper.getTestDataProperty(searchText));
			logger.debug("User entered search key :: " + searchText);
		} else {
			waitForPageLoad(driver);
			Thread.sleep(Constants.thread_low);
			assertTrue(isDisplayed(R1_SearchProduct_PO.submitGOBtn));
			setInputTextWithEnterKey(R1_SearchProduct_PO.searchTextBox, webPropHelper.getTestDataProperty(searchText));
			Thread.sleep(Constants.thread_low);
			logger.debug("User entered search key :: " + searchText);
		}
	}

	@Then("^user should be able to see the search term in the product title$")
	public void user_should_be_able_to_see_the_search_term_in_the_product_title() throws Throwable {
		assertEquals(webPropHelper.getTestDataProperty("SearchPDP"), getText(pdp_po.txtProductTitle));
		logger.debug("User entered search key :: " + searchKey + "and the search title is :: "
				+ getText(pdp_po.txtProductTitle));
	}
	
	@When("^user Navigate to the shop Gift Card from footer$")
	public void user_Navigate_to_the_shop_Gift_Card_From_Footer() throws Throwable {
		
		assertTrue((clickOnButton(pdp_po.ShopGiftCardLink)));
	}
	
	@And("^user click on the available Gift Card$")
	public void user_click_on_the_available_Gift_Card() throws Throwable {
		
		assertTrue((clickOnButton(pdp_po.GiftCardAvailable)));
	}
	
	@And("^user click on the available Bulk Gift Card$")
	public void user_click_on_the_available_Bulk_Gift_Card() throws Throwable {
		
		assertTrue((clickOnButton(pdp_po.BulkGiftCardAvailable)));
	}

	@Given("^user is able to see three tabs in the detail content section$")
	public void user_is_able_to_see_three_tabs_in_the_detail_content_section() throws Throwable {
		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(isDisplayed(pdp_po.tabReviewsMobile));
			assertTrue(isDisplayed(pdp_po.tabDetailsSpecsMobile));
			assertTrue(isDisplayed(pdp_po.tabQAMobile));
		} else {

			assertTrue(isDisplayed(pdp_po.tabReviews));
			assertTrue(isDisplayed(pdp_po.tabDetailsSpecs));
			assertTrue(isDisplayed(pdp_po.tabQA));
		}
	}

	@Then("^user is able to see the Details and specs tab by default open$")
	public void user_is_able_to_see_the_Details_and_specs_tab_by_default_open() throws Throwable {
		// assertTrue(isDisplayed(pdp_po.secLongDescription));
		assertTrue(isDisplayed(pdp_po.textFeatureBenefits));
	}

	@Then("^user clicks should be able to see the closed reviews tab$")
	public void user_clicks_should_be_able_to_see_the_closed_reviews_tab() throws Throwable {
		assert (isDisplayed(pdp_po.textQuestions));

	}

	@Then("^user clicks should be able to see the closed QandA tab$")
	public void user_clicks_should_be_able_to_see_the_closed_QandA_tab() throws Throwable {
		assert (!(isDisplayed(pdp_po.textQuestions)));
	}

	@When("^user navigates to PLP of any product$")
	public void user_navigates_to_PLP_of_any_product() throws Throwable 
	{
		//globalElementHeader_HomePO.navigateToPLPViaClick_Desktop();
		
		globalElementHeader_HomePO.navigateL2HeaderToPLP();
	}

	@Then("^User refresh the page$")
	public void User_refresh_the_page() throws Throwable {
		driver.navigate().refresh();

	}
	

	/*
	 * // //KER-1926 Start CR-AKK // @Then("^verfiy the Ask a question button$") //
	 * public void verfiy_the_Ask_a_question_button() throws Throwable { //
	 * assertTrue(isDisplayed(pdp_po.btnAskQuestion)); // // } //
	 * // @Then("^verfiy the answer this question$") // public void
	 * verfiy_the_answer_this_question() throws Throwable { //
	 * assertTrue(isDisplayed(pdp_po.btnAnswerQuestion)); //
	 * pdp_po.cilckAnswerThisQuestion(); // } //
	 * // @Then("^close the answer this question popup$") // public void
	 * close_the_answer_this_question_popup() throws Throwable { //
	 * pdp_po.cilckOnCancel(); // } // //KER-1926 End CR-AKK // // //KER-1937 Start
	 * CR-AKK
	 * // @Then("^user to fill QuestionSummary \"(.*?)\" and Nickname \"(.*?)\" and Email \"(.*?)\"$"
	 * ) // public void user_to_fill_QuestionSummary_and_Nickname_and_Email(String
	 * questionSumarry, String nickName, String email) throws Throwable { //
	 * assertTrue(clickOnButton(pdp_po.btnAskQuestion)); //
	 * setInputText(pdp_po.inputQuestionSummary, questionSumarry); //
	 * setInputText(pdp_po.inputNickname, nickName); //
	 * setInputText(pdp_po.inputEmail, email); //
	 * assertTrue(clickOnButton(pdp_po.btnChecbox)); // } //
	 * // @Then("^click on post question$") // public void click_on_post_question()
	 * throws Throwable { // assertTrue(clickOnButton(pdp_po.btnPostQuesdtion)); //
	 * } // // @Then("^verfiy the answer is helpful$") // public void
	 * verfiy_the_answer_is_helpful() throws Throwable { //
	 * assertTrue(isDisplayed(pdp_po.btnYes)); //
	 * assertTrue(isDisplayed(pdp_po.btnNo)); // } // //KER-1937 End CR-AKK
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
	// KER-1926 End CR-AKK

	// KER-1937 Start CR-AKK
	@Then("^user to fill QuestionSummary \"(.*?)\" and Nickname \"(.*?)\" and Email \"(.*?)\"$")
	public void user_to_fill_QuestionSummary_and_Nickname_and_Email(String questionSumarry, String nickName,
			String email) throws Throwable {
		// assertTrue(clickOnButton(pdp_po.btnAskQuestion));
		// Fix by RKA 15 AUg
		Thread.sleep(Constants.thread_medium);
		waitForElement(pdp_po.inputQuestionSummary);
		setInputText(pdp_po.inputQuestionSummary, questionSumarry);
		setInputText(pdp_po.inputNickname, nickName);
		setInputText(pdp_po.inputEmail, email);
		assertTrue(clickOnButton(pdp_po.btnChecbox));
	}

	@Then("^click on post question$")
	public void click_on_post_question() throws Throwable {
		assertTrue(clickOnButton(pdp_po.btnPostQuesdtion));
		assertTrue(clickOnButton(pdp_po.click_XyourQuestionSubmitted));
	}

	@Then("^verfiy the answer is helpful$")
	public void verfiy_the_answer_is_helpful() throws Throwable {
		assertTrue(isDisplayed(pdp_po.btnYes));
		assertTrue(isDisplayed(pdp_po.btnNo));
	}
	// KER-1937 End CR-AKK

	@Then("^verfiy the Ask a question button$")
	public void verfiy_the_Ask_a_question_button() throws Throwable {
		// ADDED by RKA 15 Aug
		// assertTrue(clickOnButton(pdp_po.linkBetheFirstTOAskQuestion));
		// Thread.sleep(3000);
		// if(isDisplayed(pdp_po.linkBetheFirstTOAskQuestion)) {
		// clickOnButton(pdp_po.linkBetheFirstTOAskQuestion);
		// }
		// else {
		// assertTrue(clickOnButton(pdp_po.btnAskQuestion));
		// }

		Thread.sleep(Constants.thread_medium);
		if (isDisplayed(pdp_po.btnAskQuestion)) {
			clickOnButton(pdp_po.btnAskQuestion);

		} else {

			clickOnButton(pdp_po.linkBetheFirstTOAskQuestion);
		}

	}

}
