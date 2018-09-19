package com.aso.qe.test.stepdefinition.api;


import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aso.qe.framework.api.helpers.JSONValidationUtils;
import com.aso.qe.framework.api.json.JsonReaderCommon;
import com.aso.qe.framework.common.CommonActionHelper;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.path.json.JsonPath;

public class R2_Cart_API_SD extends JSONValidationUtils{
	private static final Logger logger = Logger.getLogger(R2_Cart_API_SD.class);
	public static String cartItemID;

	@Given("^\"(.*?)\" endpoint for getting cart summary$")
	public void endpoint_for_getting_cart_summary(String url) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(url)+System.getProperty("OrderId")+"/summary";;
		logger.debug("END Point URL:"+endpoints);
		initiateRestAPICallWithCookie(endpoints);
	}

	@Then("^validate jsonSchema \"(.*?)\" for MiniCart with Guest$")
	public void validate_jsonSchema_for_MiniCart_with_Guest(String jsonSchemaFilePath)
	{
		try {
			boolean flag = isJsonValid(convertJsonFileToString(JsonReaderCommon.jsonSchemaFolderPath+ jsonSchemaFilePath+".json"), response.asString());
			logger.debug("JSON Schema Validate FLAG:: "+flag);
			assertTrue(flag);
		} catch (ProcessingException e) {
			logger.error("ProcessingException msg::"+e.getMessage());
		} catch (IOException e) {
			logger.error("IOException msg::"+e.getMessage());
		}

	}

	public List<io.restassured.http.Cookie> getGuestUserCookies_v1(){
		List<io.restassured.http.Cookie> restAssuredCookies = new ArrayList<io.restassured.http.Cookie>();
		RemoteWebDriver webdriver = null;
		try{
			CommonActionHelper webActionHelper = new CommonActionHelper();
			webdriver = webActionHelper.launchChromeBrowser(webActionHelper.getWebDriverFolderPath("chromedriver"));
			webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			webdriver.manage().window().maximize();
			webdriver.get(apiEndpointWebURL);
			CommonActionHelper.waitForPageLoad(webdriver);
			webdriver.manage();
			Set<Cookie> seleniumCookies = webdriver.manage().getCookies();
			logger.debug("Cookies:"+seleniumCookies);
			for (org.openqa.selenium.Cookie cookie : seleniumCookies) {
				logger.debug(cookie.getName()+" :: "+cookie.getValue());
				restAssuredCookies.add(new io.restassured.http.Cookie.Builder(cookie.getName(), cookie.getValue()).build());
			}
		}catch (Exception e) {
			logger.error("getBrowserCookies Exception MSG::"+e.getMessage());
		} catch (Throwable e) {
			logger.error("getBrowserCookies Throwable MSG::"+e.getMessage());
		}finally{
			if(webdriver != null){
				//webdriver.close();
				logger.debug("Web driver closed.");
			}
		}
		return restAssuredCookies;
	}

	@Then("^Verify response status code as (\\d+) for guest login$")
	public void verify_response_status_code_as_for_guest_login(int statusCodeExpected) throws Throwable {
		assertTrue(validateStatusCode(statusCodeExpected));
	}

	@Given("^\"(.*?)\" and post request \"(.*?)\" endpoint for Add to Cart with Guest user$")
	public void and_post_request_endpoint_for_Add_to_Cart_with_Guest_user(String AddToCartSummaryUrl, String addtocartRequestJson) throws Throwable {
		List<io.restassured.http.Cookie> restAssuredCookies = new R2_Cart_API_SD().getGuestUserCookies_v1();
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(AddToCartSummaryUrl);
		logger.debug("END Point URL:"+endpoints);
		initiateRestPostAPICallWithoutSignIn(endpoints, restAssuredCookies, loadProps.getTestDataProperty(addtocartRequestJson));
	}

	@Given("^\"(.*?)\" endpoint for getting cart$")
	public void endpoint_for_getting_cart(String GetCartUrl) throws Throwable {
		System.setProperty("OrderId","");
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(GetCartUrl);
		logger.debug("END Point URL:"+endpoints);
		initiateRestAPICallWithGuestUserCookies(endpoints);
		JsonPath jsonPathEvaluator = response.jsonPath();
		String orderID = jsonPathEvaluator.get("orderId");
		logger.debug("Order ID::"+ orderID);
		System.setProperty("OrderId", orderID);
	}

	@Given("^\"(.*?)\" endpoint for viewing cart details$")
	public void endpoint_for_viewing_cart_details(String url) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(url)+System.getProperty("OrderId");
		logger.debug("END Point URL:"+endpoints);
		initiateRestAPICallWithGuestUserCookies(endpoints);

		try{
			//if(org.springframework.util.StringUtils.isEmpty(cartItemID)){		
				JsonPath jsonPathEvaluator = response.jsonPath();
				/*List<Object> orderID = jsonPathEvaluator.getList("orders.orderItems.orderItemId");
					for(Object obj: orderID){}*/
				cartItemID = jsonPathEvaluator.get("orders[0].orderItems[0].orderItemId");
				logger.debug(" cartItemID::"+ cartItemID);
			//}
		}catch (Exception e) {
			logger.error("jsonPathEvaluator exception msg::"+e.getMessage());
		}
	}

	@Given("^\"(.*?)\" validating with \"(.*?)\"$")  //Anuj 23 Aug
	public void validating_with(String arg1, String arg2) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(arg1)+loadProps.getTestDataProperty(arg2);
		logger.debug("END Point URL:"+endpoints);
		initiateRestAPICall(endpoints);
	}

	@Given("^\"(.*?)\" validate with \"(.*?)\" entering \"(.*?)\" and \"(.*?)\"$")  //Anuj 23 Aug
	public void validate_with_entering_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(arg1)+loadProps.getTestDataProperty(arg3)+loadProps.getTestDataProperty(arg2)+loadProps.getTestDataProperty(arg4);
		logger.debug("END Point URL:"+endpoints);
		initiateRestAPICall(endpoints);
	}

	@Given("^\"(.*?)\" endpoint for Storelocator Find stores and findbyLatNLong StoreLocId$")
	public void endpoint_for_Storelocator_Find_stores_findbyLatNLong_StoreLocId(String findStoreUrl) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(findStoreUrl);
		logger.debug("END Point URL:"+endpoints);
		initiateRestAPICall(endpoints);
	}

	@Given("^\"(.*?)\" and post request \"(.*?)\" endpoint for Storelocator Find stores makemystore with SignIn user$")
	public void and_post_request_endpoint_for_Storelocator_Find_stores_makemystore_with_SignIn_user(String url, String requestJson) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(url);
		logger.debug("END Point URL:"+endpoints);
		initiateRestPostAPICallWithCookies(endpoints, requestJson);
	}

	@Given("^verify the Storelocator-Find stores-makemystore response data$")
	public void verify_the_Storelocator_Find_stores_makemystore_response_data() throws Throwable {
		JsonPath jsonPathEvaluator = response.jsonPath();
		String data = jsonPathEvaluator.get("data");
		logger.debug("Response Data::"+ data);
		assertNotNull(data);
	}

	@Given("^verify the Storelocator Find stores findbyLatNLong response data$")
	public void verify_the_Storelocator_Find_stores_findbyLatNLong_response_data() throws Throwable {
		JsonPath jsonPathEvaluator = response.jsonPath();
		String storeId = jsonPathEvaluator.get("stores[0].storeId");
		logger.debug("Response storeId::"+ storeId);
		assertNotNull(storeId);
	}

	@Given("^\"(.*?)\" with  \"(.*?)\" endpoint for Available Shipping Modes$")
	public void with_endpoint_for_Available_Shipping_Modes(String url, String extension) throws Throwable {
		//System.setProperty("OrderId", "422037");
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(url)+System.getProperty("OrderId")+loadProps.getTestDataProperty(extension);
		logger.debug("END Point URL:"+endpoints);
		initiateRestAPICallWithCookie(endpoints);
	}

	@Given("^\"(.*?)\" with \"(.*?)\" endpoint for Available Shipping Modes with StoreId$")
	public void with_endpoint_for_Available_Shipping_Modes_with_StoreId(String url, String extension) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(url)+System.getProperty("OrderId")+loadProps.getTestDataProperty(extension)+loadProps.getTestDataProperty("API-StoreId");
		logger.debug("END Point URL:"+endpoints);
		initiateRestAPICallWithCookie(endpoints);
	}

	@Then("^Validated response details of \"(.*?)\"$")
	public void validated_response_details_of(String key) throws Throwable {
		JsonPath jsonPathEvaluator = response.jsonPath();
		Object propObj = jsonPathEvaluator.get(key);
		logger.debug(key+"::"+ propObj);
		assertNotNull(JSONValidationUtils.isNotNull(propObj));
	}

	@Given("^\"(.*?)\" with \"(.*?)\" for Create store pickup inventory with skus and store$")
	public void with_for_Create_store_pickup_inventory_with_skus_and_store(String url, String requestJson) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(url);
		logger.debug("END Point URL:"+endpoints);
		initiateRestPostAPICallWithoutCookies(endpoints, loadProps.getTestDataProperty(requestJson));
	}

	@Given("^\"(.*?)\" by \"(.*?)\" with \"(.*?)\" endpoint for Cart-Update-Quantity$")
	public void by_with_endpoint_for_Cart_Update_Remove_Quantity(String url, String extension, String requestJson) throws Throwable {
		if(org.springframework.util.StringUtils.isEmpty(cartItemID)){
			cartItemID="750080875";
		}
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(url)+"PUT/"+System.getProperty("OrderId")+extension;
		logger.debug("END Point URL:"+endpoints);
		String postRequestStr = JSONValidationUtils.convertJsonFileToString(JsonReaderCommon.jsonRequestFolderPath+ requestJson+".json");
		postRequestStr = postRequestStr.replace("REPLACE_ITEMID", cartItemID).replace("REPLACE_QUANTITY", "1");
		logger.debug("POST Request JSON:"+postRequestStr);
		initiateRestPostAPICallWithCookiesAndRequestJsonStr(endpoints, postRequestStr);
	}

	@Given("^\"(.*?)\" and post request \"(.*?)\" endpoint for Add to Cart with Sign user$")
	public void and_post_request_endpoint_for_Add_to_Cart_with_Sign_user(String addToCartSummaryUrl, String addtocartRequestJson) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(addToCartSummaryUrl);
		logger.debug("END Point URL:"+endpoints);
		initiateRestPostAPICallWithCookies(endpoints, loadProps.getTestDataProperty(addtocartRequestJson));
		JsonPath jsonPathEvaluator = response.jsonPath();
		cartItemID = jsonPathEvaluator.get("addToCart.items[0].itemId");
		logger.debug("Cart ItemID::"+ cartItemID);
	}

	@Given("^\"(.*?)\" by \"(.*?)\" with \"(.*?)\" endpoint for Remove Item from Cart$")
	public void by_with_endpoint_for_Remove_Item_from_Cart(String url, String extension, String requestJson) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(url)+"PUT/"+extension;
		logger.debug("END Point URL:"+endpoints);
		String postRequestStr = JSONValidationUtils.convertJsonFileToString(JsonReaderCommon.jsonRequestFolderPath+ requestJson+".json");
		postRequestStr = postRequestStr.replace("REPLACE_ITEMID", cartItemID).replace("REPLACE_QUANTITY", "0");
		initiateRestPostAPICallWithCookiesAndRequestJsonStr(endpoints, postRequestStr);
	}

	@Given("^\"(.*?)\" by \"(.*?)\" endpoint for Get Available Shipping Methods for Cart Items$")
	public void by_endpoint_for_Get_Available_Shipping_Methods_for_Cart_Items(String url, String extension) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(url)+System.getProperty("OrderId")+extension+System.getProperty("OrderId");
		logger.debug("END Point URL:"+endpoints);
		initiateRestAPICallWithCookie(endpoints);
	}

	@Given("^\"(.*?)\" by \"(.*?)\" with \"(.*?)\" endpoint for Cart Items Initiate Checkout$")
	public void by_with_endpoint_for_Cart_Items_Initiate_Checkout(String url, String extension, String requestJson) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(url)+"PUT/"+System.getProperty("OrderId")+extension;
		logger.debug("END Point URL:"+endpoints);
		String postRequestStr = JSONValidationUtils.convertJsonFileToString(JsonReaderCommon.jsonRequestFolderPath+ requestJson+".json");
		postRequestStr = postRequestStr.replace("REPLACE_ORDERID", System.getProperty("OrderId"));
		initiateRestPostAPICallWithCookiesAndRequestJsonStr(endpoints, postRequestStr);
	}

	@Given("^\"(.*?)\" by \"(.*?)\" with \"(.*?)\" endpoint for Cart-Bopis-Update-Shipping-Mode$")
	public void by_with_endpoint_for_Cart_Bopis_Update_Shipping_Mode(String url, String extension, String requestJson) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(url)+extension;
		logger.debug("END Point URL:"+endpoints);
		String postRequestStr = JSONValidationUtils.convertJsonFileToString(JsonReaderCommon.jsonRequestFolderPath+ requestJson+".json");
		postRequestStr = postRequestStr.replace("REPLACE_ORDERID", System.getProperty("OrderId")).replace("REPLACE_ITEMID", cartItemID);
		initiateRestPostAPICallWithCookiesAndRequestJsonStr(endpoints, postRequestStr);
	}


}