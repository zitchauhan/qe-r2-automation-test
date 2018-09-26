package com.aso.qe.test.stepdefinition.api;


import org.apache.log4j.Logger;

import com.aso.qe.framework.api.helpers.JSONValidationUtils;
import com.aso.qe.framework.api.helpers.MiniCartJsonResponseHelper;
import com.aso.qe.framework.api.json.JsonReaderCommon;
import com.aso.qe.framework.common.FrameWorkHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.path.json.JsonPath;

public class R2_Order_API_SD extends JSONValidationUtils{
	private static final Logger logger = Logger.getLogger(R2_Order_API_SD.class);
	public MiniCartJsonResponseHelper miniCartJsonResponseHelper;
	public static String billAddressId;
	public static String shippingAddressId;


	@Then("^\"(.*?)\" endpoint with \"(.*?)\" request and \"(.*?)\" extension$")
	public void endpoint_with_request_and_extension(String OrderUrl, String AddPromoCodeToOrder, String extension) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(OrderUrl)+System.getProperty("OrderId")+extension+loadProps.getTestDataProperty("PromoCode");
		initiateRestPostAPICallWithCookies(endpoints, loadProps.getTestDataProperty(AddPromoCodeToOrder));
	}

	@Given("^\"(.*?)\" endpoint with \"(.*?)\" for getting promocode of an order$")
	public void endpoint_with_for_getting_promocode_of_an_order(String OrderUrl, String extension) throws Throwable {
		System.setProperty("PromoCode","");
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(OrderUrl)+System.getProperty("OrderId")+extension;
		initiateRestAPICallWithCookie(endpoints);
		JsonPath jsonPathEvaluator = response.jsonPath();
		String promoCode = jsonPathEvaluator.get("getpromocode.promotionCode[0].code");
		logger.debug("Promo Code::"+ promoCode);
		System.setProperty("PromoCode", promoCode);
	}


	@Given("^\"(.*?)\" endpoint for removing \"(.*?)\" from an Order$")
	public void endpoint_for_removing_from_an_Order(String OrderUrl, String extension) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(OrderUrl)+System.getProperty("OrderId")+extension+loadProps.getTestDataProperty("PromoCode");
		initiateRestDeleteAPICall(endpoints);
	}

	@Given("^\"(.*?)\" with \"(.*?)\" endpoint for Change Store$")
	public void with_endpoint_for_Change_Store(String OrderUrl, String extension) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(OrderUrl)+System.getProperty("OrderId")+loadProps.getTestDataProperty(extension);
		logger.debug("END Point URL:"+endpoints);
		//initiateRestAPIPostCallForGuestAuthen(endpoints);
	}
	
	@Given("^\"(.*?)\" endpoint for order details$")
	public void endpoint_for_order_details(String OrderUrl) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(OrderUrl)+System.getProperty("OrderId");
		initiateRestAPICallWithCookie(endpoints);
	}
	
	@Given("^\"(.*?)\" by \"(.*?)\" endpoint for get profile placed orders details$")
	public void by_endpoint_for_get_profile_placed_orders_details(String orderUrl, String extension) throws Throwable {
		System.setProperty("PlacedOrderId","");
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(orderUrl)+loadProps.getTestDataProperty(extension);
		initiateRestAPICallWithCookie(endpoints);
		JsonPath jsonPathEvaluator = response.jsonPath();
		String placedOrderId = jsonPathEvaluator.get("orders[0].orderNumber");
		logger.debug("Placed orderNumber::"+ placedOrderId);
		System.setProperty("PlacedOrderId", placedOrderId);
	}

	@Given("^\"(.*?)\" endpoint for get profile order by id details$")
	public void endpoint_for_get_profile_order_by_id_details(String orderUrl) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(orderUrl)+System.getProperty("PlacedOrderId");
		initiateRestAPICallWithCookie(endpoints);
	}
	
	@Given("^\"(.*?)\" by \"(.*?)\" endpoint for Search profile placed orders with order id and zip code$")
	public void by_endpoint_for_Search_profile_placed_orders_with_order_id_and_zip_code(String orderUrl, String extension) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(orderUrl)+System.getProperty("PlacedOrderId")+"?zipCode="+loadProps.getTestDataProperty(extension);
		initiateRestAPICallWithCookie(endpoints);
	}
	
	@Given("^\"(.*?)\" with \"(.*?)\" endpoint for Place Order$")
	public void with_endpoint_for_Place_Order(String url, String requestJson) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(url)+System.getProperty("OrderId");
		String postRequestStr = JSONValidationUtils.convertJsonFileToString(JsonReaderCommon.jsonRequestFolderPath+ requestJson+".json");
		postRequestStr = postRequestStr.replace("REPLACE_ORDERID", System.getProperty("OrderId"));
		initiateRestPostAPICallWithCookiesAndRequestJsonStr(endpoints, postRequestStr);
	}

	@Given("^\"(.*?)\" by \"(.*?)\" endpoint with \"(.*?)\" for add Order Shipping Address details$")
	public void by_endpoint_with_for_add_Order_Shipping_Address_details(String orderUrl, String extension, String requestJson) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(orderUrl)+"PUT/"+System.getProperty("OrderId")+extension;
		String postRequestStr = JSONValidationUtils.convertJsonFileToString(JsonReaderCommon.jsonRequestFolderPath+ requestJson+".json");
		postRequestStr = postRequestStr.replace("REPLACE_ORDERID", System.getProperty("OrderId")).replace("REPLACE_LASTNAME", FrameWorkHelper.getRandomAlphabetic(6)).replace("REPLACE_FIRSTNAME", FrameWorkHelper.getRandomAlphabetic(7));
		initiateRestPostAPICallWithCookiesAndRequestJsonStr(endpoints, postRequestStr);
	}
	
	@Given("^\"(.*?)\" by \"(.*?)\" endpoint with \"(.*?)\" for Add shipping Address of Order profile$")
	public void by_endpoint_with_for_Add_shipping_Address_of_Order_profile(String url, String extension, String requestPath) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(url)+System.getProperty("OrderId")+extension;
		
		String postRequestStr = JSONValidationUtils.convertJsonFileToString(JsonReaderCommon.jsonRequestFolderPath+ requestPath+".json");
		postRequestStr = postRequestStr.replace("REPLACE_FIRSTNAME", FrameWorkHelper.getRandomAlphabetic(8))
				.replace("REPLACE_FIRSTNAME", FrameWorkHelper.getRandomAlphabetic(8))
				.replace("REPLACE_LASTNAME", FrameWorkHelper.getRandomAlphabetic(8))
				.replace("REPLACE_PHONENUMBER", FrameWorkHelper.getRandomNumber(10))
				.replace("REPLACE_ORDERID", System.getProperty("OrderId"))
				.replace("REPLACE_ADDRESS", FrameWorkHelper.getRandomAlphabetic(8));

		initiateRestPostAPICallWithCookiesAndRequestJsonStr(endpoints, postRequestStr);
		JsonPath jsonPathEvaluator = response.jsonPath();
		shippingAddressId = jsonPathEvaluator.get("addShippingAddress.addressId");
		logger.debug("ShippingAddressId::"+shippingAddressId);
	}
	
	
	@Given("^\"(.*?)\" by \"(.*?)\" endpoint with \"(.*?)\" for add Order Billing Address and PaymentMethod details$")
	public void by_endpoint_with_for_add_Order_Billing_Address_and_PaymentMethod_details(String orderUrl, String extension, String requestJson) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(orderUrl)+System.getProperty("OrderId")+extension;
		String postRequestStr = JSONValidationUtils.convertJsonFileToString(JsonReaderCommon.jsonRequestFolderPath+ requestJson+".json");
		postRequestStr = postRequestStr.replace("REPLACE_ORDERID", System.getProperty("OrderId"));
		initiateRestPostAPICallWithCookiesAndRequestJsonStr(endpoints, postRequestStr);
		JsonPath jsonPathEvaluator = response.jsonPath();
		billAddressId = jsonPathEvaluator.get("addBillingAddress.billAddressId");
		logger.debug("billAddressId::"+billAddressId);
	}
	
	@Given("^\"(.*?)\" by \"(.*?)\" endpoint with \"(.*?)\" for add Order Gift Card details$")
	public void by_endpoint_with_for_add_Order_Gift_Card_details(String orderUrl, String extension, String requestJson) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(orderUrl)+System.getProperty("OrderId")+extension;
		String postRequestStr = JSONValidationUtils.convertJsonFileToString(JsonReaderCommon.jsonRequestFolderPath+ requestJson+".json");
		postRequestStr = postRequestStr.replace("REPLACE_ORDERID", System.getProperty("OrderId"));
		
		initiateRestPostAPICallWithCookiesAndRequestJsonStr(endpoints, postRequestStr);
	}
	
	@Given("^\"(.*?)\" by \"(.*?)\" endpoint for Remove Order Gift Card$")
	public void by_endpoint_for_Remove_Order_Gift_Card(String orderUrl, String extension) throws Throwable {
		JsonPath jsonPathEvaluator = response.jsonPath();
		String gcPiId = jsonPathEvaluator.get("orders[0].giftCardDetails[0].gcPiId");
		logger.debug("gcPiId Code::"+ gcPiId);
		
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(orderUrl)+"DELETE/"+System.getProperty("OrderId")+extension+gcPiId;
		logger.debug("END Point URL:"+endpoints);
		initiateRestPostAPICallWithCookiesAndWithOutBody(endpoints);
	}


}