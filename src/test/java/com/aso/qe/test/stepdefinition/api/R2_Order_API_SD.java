package com.aso.qe.test.stepdefinition.api;


import org.apache.log4j.Logger;

import com.aso.qe.framework.api.helpers.JSONValidationUtils;
import com.aso.qe.framework.api.helpers.MiniCartJsonResponseHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.path.json.JsonPath;

public class R2_Order_API_SD extends JSONValidationUtils{
	private static final Logger logger = Logger.getLogger(R2_Order_API_SD.class);
	public MiniCartJsonResponseHelper miniCartJsonResponseHelper;


	@Then("^\"(.*?)\" endpoint with \"(.*?)\" request and \"(.*?)\" extension$")
	public void endpoint_with_request_and_extension(String OrderUrl, String AddPromoCodeToOrder, String extension) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(OrderUrl)+System.getProperty("OrderId")+extension+loadProps.getTestDataProperty("PromoCode");
		logger.debug("END Point URL:"+endpoints);
		initiateRestPostAPICallWithCookies(endpoints, loadProps.getTestDataProperty(AddPromoCodeToOrder));
	}

	@Given("^\"(.*?)\" endpoint with \"(.*?)\" for getting promocode of an order$")
	public void endpoint_with_for_getting_promocode_of_an_order(String OrderUrl, String extension) throws Throwable {
		System.setProperty("PromoCode","");
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(OrderUrl)+System.getProperty("OrderId")+extension;
		logger.debug("END Point URL:"+endpoints);
		initiateRestAPICallWithCookie(endpoints);
		JsonPath jsonPathEvaluator = response.jsonPath();
		String promoCode = jsonPathEvaluator.get("getpromocode.promotionCode[0].code");
		logger.debug("Promo Code::"+ promoCode);
		System.setProperty("PromoCode", promoCode);
	}


	@Given("^\"(.*?)\" endpoint for removing \"(.*?)\" from an Order$")
	public void endpoint_for_removing_from_an_Order(String OrderUrl, String extension) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(OrderUrl)+System.getProperty("OrderId")+extension+loadProps.getTestDataProperty("PromoCode");
		logger.debug("END Point URL:"+endpoints);
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
		logger.debug("END Point URL:"+endpoints);
		initiateRestAPICallWithCookie(endpoints);
	}
	
	@Given("^\"(.*?)\" by \"(.*?)\" endpoint for get profile placed orders details$")
	public void by_endpoint_for_get_profile_placed_orders_details(String orderUrl, String extension) throws Throwable {
		System.setProperty("PlacedOrderId","");
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(orderUrl)+loadProps.getTestDataProperty(extension);
		logger.debug("END Point URL:"+endpoints);
		initiateRestAPICallWithCookie(endpoints);
		JsonPath jsonPathEvaluator = response.jsonPath();
		String placedOrderId = jsonPathEvaluator.get("orders[0].orderNumber");
		logger.debug("Placed orderNumber::"+ placedOrderId);
		System.setProperty("PlacedOrderId", placedOrderId);
	}

	@Given("^\"(.*?)\" endpoint for get profile order by id details$")
	public void endpoint_for_get_profile_order_by_id_details(String orderUrl) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(orderUrl)+System.getProperty("PlacedOrderId");
		logger.debug("END Point URL:"+endpoints);
		initiateRestAPICallWithCookie(endpoints);
	}
	
	@Given("^\"(.*?)\" by \"(.*?)\" endpoint for Search profile placed orders with order id and zip code$")
	public void by_endpoint_for_Search_profile_placed_orders_with_order_id_and_zip_code(String orderUrl, String extension) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(orderUrl)+System.getProperty("PlacedOrderId")+"?zipCode="+loadProps.getTestDataProperty(extension);
		logger.debug("END Point URL:"+endpoints);
		initiateRestAPICallWithCookie(endpoints);
	}

}