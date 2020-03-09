package com.aso.qe.test.stepdefinition.web;
//import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.web.helpers.ASOBrokenURLsLinks;
import com.aso.qe.test.pageobject.R1_FindStore_PO;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_SearchProduct_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
//import io.appium.java_client.AppiumDriver;

public class Common_Web_SD extends CommonActionHelper
{
private static final Logger logger = Logger.getLogger(Common_Web_SD.class);
public R1_FindStore_PO findStorePO;
public static R1_GlobalElementHeader_Home_PO globalElementHeader;
public static R1_SearchProduct_PO searchProductPO;




@Given("^user launches the browser and navigates to \"(.*?)\" page$")
public void user_launches_the_browser_and_navigates_to_page(String url) throws Throwable {
	initializeDriver();
	/*if("mobile".equalsIgnoreCase(testtype)) {
// logger.debug("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% Mobile Launched ");
		initializeDriver();
	}
// {
 else {
	 initializeDriver();
 }
// getDriver().manage().window().setSize(new Dimension(1500,1700));
// }
 * 
 * 
*/
	openBaseURL(url);
	
	//try {
		 
		//driver.get("https://uat6www.academy.com/?debug=aso");
		//driver.switchTo().alert().accept();

	//}catch(Exception e){

	//}


//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	findStorePO= PageFactory.initElements(driver, R1_FindStore_PO.class);
	waitForPageLoad(driver);
	globalElementHeader= PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	searchProductPO = PageFactory.initElements(getDriver(), R1_SearchProduct_PO.class);
	System.err.println(webPropHelper.getConfigPropProperty(url));
	boolean flag = false;
	WebElement pop;
	try {
		Thread.sleep(200);
		pop = driver.findElement(By.xpath("//*[text()='Message text']/following-sibling::a"));
		flag = pop.isDisplayed();
		if (flag) {
			if (webPropHelper.getConfigPropProperty(url).contains("uat")) {
				pop = driver.findElement(By.xpath("//*[text()='Message text']/following-sibling::a"));
				waitForElement(pop);
				isDisplayed(pop);
				clickOnButton(pop);
			}
		}
	} catch (Exception e) {
		
	}

}

@Then("^User closes the web application$")
public void user_closes_the_web_application() throws Throwable {
try {
logger.debug("User closes the application & Browser.............");
close();
} catch (Exception e) {
logger.debug("User logged the Expection Message:"+e.getMessage());
}
}

@Then("^User navigates till PLP$")
public void User_navigates_till_PLP() throws Throwable {

if ("mobile".equalsIgnoreCase(testtype)) {
globalElementHeader.navigateToPLPViaClick_Mobile();
} else {
globalElementHeader.navigateToPLPViaClick_Desktop();
}


//globalElementHeader.navigateL2HeaderToPLP();
}

@Then("^User clicks on the burger menu$")
public void User_clicks_on_the_burger_menu() throws Throwable {
globalElementHeader.clickOnBurgerMenu();

}

@Then("^User clicks on the filter option$")
public void User_clicks_on_the_filter_option() throws Throwable{
assertTrue(clickOnButton(globalElementHeader.btnFilterFacet));

}

@Then ("^User navigates to L1$")
public void User_navigates_to_L1() throws InterruptedException {
if("mobile".equalsIgnoreCase(testtype)){

assertTrue(clickOnButton(globalElementHeader.btnClothingCategory_M));
Thread.sleep(2000);
assertTrue(clickOnButton(globalElementHeader.txtToNavigateClothingBurgerMenuMobile));
Thread.sleep(2000);
}
else
{
Thread.sleep(2000);
assertTrue(clickOnButton(globalElementHeader.btnShopCategory));
Thread.sleep(2000);
assertTrue(clickOnButton(globalElementHeader.btnClothingCategory));
Thread.sleep(2000);
}


}
@Then ("^User navigates to L2$")
public void User_navigate_to_L2() throws InterruptedException {
if("mobile".equalsIgnoreCase(testtype)){

assertTrue(clickOnButton(globalElementHeader.btnClothingCategory_M));
Thread.sleep(2000);
assertTrue(clickOnButton(globalElementHeader.btnMen_Clothing_Shop_M));
Thread.sleep(2000);
assertTrue(clickOnButton(globalElementHeader. txtToNavigateMensBurgerMenuMobile));
Thread.sleep(2000);

} else{
Thread.sleep(3000);
assertTrue(clickOnButton(globalElementHeader.btnShopCategory));
Thread.sleep(2000);
Actions hover = new Actions(getDriver());
hover.moveToElement(globalElementHeader.btnClothingCategory).build().perform();
Thread.sleep(2000);
assertTrue(clickOnButton(globalElementHeader.btnMen_Clothing_Shop));
Thread.sleep(2000);
}

}

@Then ("^User navigates to L2 Mens clothing$")
public void User_navigate_to_L2_Mens_clothing() throws InterruptedException {
if("mobile".equalsIgnoreCase(testtype)){
waitForPageLoad(getDriver());
assertTrue(clickOnButton(globalElementHeader.btnClothingCategory));
Thread.sleep(2000);
waitForPageLoad(getDriver());
assertTrue(clickOnButton(globalElementHeader.btnMenClothingShop));
Thread.sleep(2000);
waitForPageLoad(getDriver());
assertTrue(clickOnButton(globalElementHeader. txtToNavigateMensCategoryMobile));
Thread.sleep(2000);
waitForPageLoad(getDriver());

} else{
Thread.sleep(3000);
waitForPageLoad(getDriver());
assertTrue(clickOnButton(globalElementHeader.btnShopCategory));
Thread.sleep(2000);
waitForPageLoad(getDriver());
Actions hover = new Actions(getDriver());
hover.moveToElement(globalElementHeader.btnClothingCategory).build().perform();
Thread.sleep(2000);
assertTrue(clickOnButton(globalElementHeader.btnMenClothingShop));
Thread.sleep(2000);
}

}

@Then("^User navigates to DiscountLess product$")
public void User_navigates_to_DiscountLess_product() throws Exception {
Thread.sleep(2000);
assertTrue(clickOnButton(globalElementHeader.btnShopCategory));
waitForPageLoad(getDriver());
Actions hover = new Actions(getDriver());
hover.moveToElement(globalElementHeader.btnHomeBackyard).build().perform();
Thread.sleep(2000);
hover.moveToElement(globalElementHeader.btnGriddles).click().build().perform();
Thread.sleep(2000);
}



@Then ("^User navigates to L2 Womens clothing$")
public void User_navigate_to_L2_Womens_clothing() throws InterruptedException {
if("mobile".equalsIgnoreCase(testtype)){

assertTrue(clickOnButton(globalElementHeader.btnClothingCategory_M));
Thread.sleep(2000);
assertTrue(clickOnButton(globalElementHeader.txtToNavigateWoensCategoryMobile));
Thread.sleep(2000);
assertTrue(clickOnButton(globalElementHeader.burgerMenu_GoToWomen_btn ));
Thread.sleep(2000);

} else{
Thread.sleep(3000);
assertTrue(clickOnButton(globalElementHeader.btnShopCategory));
Thread.sleep(2000);
Actions hover = new Actions(getDriver());
hover.moveToElement(globalElementHeader.btnClothingCategory).build().perform();
Thread.sleep(2000);
assertTrue(clickOnButton(globalElementHeader.btnWommenClothingShop));
Thread.sleep(2000);
}

}

@Then ("^User navigates to L3$")
public void User_navigates_to_L3() throws Exception
{
if("mobile".equalsIgnoreCase(testtype)){

assertTrue(clickOnButton(globalElementHeader.btnClothingCategory_M));
Thread.sleep(2000);
assertTrue(clickOnButton(globalElementHeader.btnMen_Clothing_Shop_M));
Thread.sleep(2000);
assertTrue(clickOnButton(globalElementHeader.btnMensShirt_Men_Clothing_Shop_M));
Thread.sleep(2000);

}else{
Thread.sleep(2000);
assertTrue(clickOnButton(globalElementHeader.btnShopCategory));
Actions hover = new Actions(getDriver());
hover.moveToElement(globalElementHeader.btnClothingCategory).build().perform();
Thread.sleep(2000);
// hover.moveToElement(globalElementHeader.btnMensShirt_Men_Clothing_Shop).build().perform();
hover.moveToElement(globalElementHeader.btnMensShirt_Men_Clothing_Shop).click().build().perform();
Thread.sleep(2000);
}

// //globalElementHeader.navigateL2HeaderToPLP();

}
@And("^user navigate to L3 page$")
public void user_navigate_to_L3_page() {
waitForElement(globalElementHeader.CategoryL1);
assertTrue(clickOnButton(globalElementHeader.CategoryL1));
}

@Then("^User should be navigated to Search Result Page$")
public void user_should_be_navigated_to_Search_Result_Page() throws Throwable {
globalElementHeader.entertheSearchDataForResultsPage();
}

@Then("^User should be able to see BreadCrumb on L1 Page$")
public void user_should_be_able_to_see_BreadCrumb_on_L1_Page() throws Throwable {

}

@Then("^verfy all link url's status code is (\\d+)$")
public void verfy_all_link_url_s_status_code_is(int arg1) throws Throwable {
assertTrue(new ASOBrokenURLsLinks().getBrokenLinks(), ASOBrokenURLsLinks.errorText);
}

@Then("^verfy all Image link urls status code is (\\d+)$")
public void verfy_all_image_link_url_s_status_code_is(int arg1) throws Throwable {
assertTrue(new ASOBrokenURLsLinks().getBrokenImageLinks(), ASOBrokenURLsLinks.errorText);
}

@Then("^User navigates to Mens Clothing PLP$")
public void User_navigates_to_Mens_Clothing_PLP() throws Exception {
Thread.sleep(2000);
assertTrue(clickOnButton(globalElementHeader.btnShopCategory));
Actions hover = new Actions(getDriver());
hover.moveToElement(globalElementHeader.btnClothingCategory).build().perform();
Thread.sleep(2000);
hover.moveToElement(globalElementHeader.plpMensShirt).click().build().perform();
Thread.sleep(2000);

}
}