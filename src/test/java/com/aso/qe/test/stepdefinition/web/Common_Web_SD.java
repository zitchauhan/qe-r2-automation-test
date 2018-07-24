package com.aso.qe.test.stepdefinition.web;
import static org.junit.Assert.assertTrue;
import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.FindStorePO;
import com.aso.qe.test.pageobject.GlobalElementHeader_HomePO;
import com.aso.qe.test.pageobject.SearchProductPO;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Common_Web_SD extends CommonActionHelper{
	private static final Logger logger = Logger.getLogger(Common_Web_SD.class);
	public FindStorePO findStorePO;
	public static GlobalElementHeader_HomePO globalElementHeader;
	public static SearchProductPO searchProductPO;
	@Given("^User launches the browser and navigates to Home page$")
	public void user_launches_the_browser_and_navigates_to_ASO_page() throws Throwable
	{
		logger.debug("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& loading WebDriver");
		initializeDriver();
		homeURL = webPropHelper.getConfigPropProperty("ASO");
		logger.debug("Open Chrome browser with URL::"+homeURL);
		logger.debug("HomeURL:: "+homeURL);
		driver.get(homeURL);
		//openBaseURL("ASO");//webPropHelper.getConfigPropProperty("ASO"));
		findStorePO= PageFactory.initElements(driver, FindStorePO.class);
		globalElementHeader= PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
		searchProductPO = PageFactory.initElements(getDriver(), SearchProductPO.class);
		//logger.debug("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% HOME Page Cart isDisplayed::"+isDisplayed(globalElementHeader.homePageCart));
	}


	@Given("^user launches the browser and navigates to \"(.*?)\" page$")
	public void user_launches_the_browser_and_navigates_to_page(String url) throws Throwable {
		initializeDriver();
//		if("mobile".equalsIgnoreCase(testtype)) {
//			logger.debug("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% Mobile Launched ");
//		}else{
//			getDriver().manage().window().setSize(new Dimension(1400,1500));	
//		}


		if(url.equalsIgnoreCase("https://uat6www.academy.com/?debug=aso")) {
			openBaseURL(url);
		}else {
		openBaseURL("ASO");
		openBaseURL(url);
		}
		findStorePO= PageFactory.initElements(driver, FindStorePO.class);
		globalElementHeader= PageFactory.initElements(driver, GlobalElementHeader_HomePO.class);
		searchProductPO = PageFactory.initElements(getDriver(), SearchProductPO.class);
	}

	@Then("^User closes the web application$")
	public void user_closes_the_web_application() throws Throwable {
		logger.debug("User closes the application & Browser.............");
		close();
	}

	@Then("^User navigates till PLP$")
	public void User_navigates_till_PLP() throws Throwable {

		if("mobile".equalsIgnoreCase(testtype)){
			globalElementHeader.navigateToPLPViaClick_Mobile();
		} else{
			globalElementHeader.navigateToPLPViaClick_Desktop();
		}
	}


	@Then("^User clicks on the burger menu$")
	public void User_clicks_on_the_burger_menu() throws Throwable {
		assertTrue(clickOnButton(globalElementHeader.btnBurgerMenu));
	}

	@Then("^User clicks on the filter option$")
	public void User_clicks_on_the_filter_option() throws Throwable{
		assertTrue(clickOnButton(globalElementHeader.btnFilterFacet));

	}

	@Then ("^User navigates to L1$")
	public void User_navigates_to_L1() throws InterruptedException {
		if("mobile".equalsIgnoreCase(testtype)){
			Thread.sleep(2000);
			assertTrue(clickOnButton(globalElementHeader.btnClothingCategory));
			Thread.sleep(2000);
			assertTrue(clickOnButton(globalElementHeader.txtToNavigateClothingBurgerMenuMobile));
			Thread.sleep(2000);
		}
		else
		{
			assertTrue(clickOnButton(globalElementHeader.btnShopCategory));
			assertTrue(clickOnButton(globalElementHeader.btnClothingCategory));
		}


	}
	@Then ("^User navigates to L2$")
	public void User_navigate_to_L2() throws InterruptedException {
		if("mobile".equalsIgnoreCase(testtype)){
			Thread.sleep(2000);
			assertTrue(clickOnButton(globalElementHeader.btnClothingCategory));
			Thread.sleep(2000);
			assertTrue(clickOnButton(globalElementHeader.btnMen_Clothing_Shop));
			Thread.sleep(2000);
			assertTrue(clickOnButton(globalElementHeader. txtToNavigateMensBurgerMenuMobile));
			Thread.sleep(2000);
			
		} else{

			assertTrue(clickOnButton(globalElementHeader.btnShopCategory));
			Actions hover = new Actions(getDriver());
			hover.moveToElement(globalElementHeader.btnClothingCategory).build().perform();
			assertTrue(clickOnButton(globalElementHeader.btnMens_Clothing_Shop));
		}

	}

	@Then ("^User navigates to L3$")
	public void User_navigates_to_L3() throws InterruptedException {
		if("mobile".equalsIgnoreCase(testtype)){
			Thread.sleep(2000);
			assertTrue(clickOnButton(globalElementHeader.btnClothingCategory));
			Thread.sleep(2000);
			assertTrue(clickOnButton(globalElementHeader.btnMen_Clothing_Shop));
			Thread.sleep(2000);
			assertTrue(clickOnButton(globalElementHeader.btnMensShirt_Men_Clothing_Shop));
			Thread.sleep(4000);
			
		}else{
			assertTrue(clickOnButton(globalElementHeader.btnShopCategory));
			Actions hover = new Actions(getDriver());
			hover.moveToElement(globalElementHeader.btnClothingCategory).build().perform();
			assertTrue(clickOnButton(globalElementHeader.btnMensShirt_Men_Clothing_Shop));
		}

	}

	@Then("^User should be navigated to Search Result Page$")
	public void user_should_be_navigated_to_Search_Result_Page() throws Throwable {
		globalElementHeader.entertheSearchDataForResultsPage();
	}

	@Then("^User should be able to see BreadCrumb on L1 Page$")
	public void user_should_be_able_to_see_BreadCrumb_on_L1_Page() throws Throwable {

	}
}
