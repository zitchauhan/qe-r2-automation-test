package com.aso.qe.test.stepdefinition.api;

import org.apache.log4j.Logger;

import com.aso.qe.framework.api.helpers.JSONValidationUtils;

import cucumber.api.java.en.Given;

public class R1SP1_RouteSpecificationSD extends JSONValidationUtils
{
	private static final Logger logger = Logger.getLogger(R1SP1_RouteSpecificationSD.class);
	
	@Given("^\"(.*?)\" endpoint with variant\"(.*?)\"$")
	public void endpoint_with_variant(String endpoint, String RouteTypeAndValue) throws Throwable {
		String endpoints=loadProps.getConfigPropProperty("api.baseURL")+loadProps.getEndpointProProperty(endpoint)+RouteTypeAndValue;
		logger.debug("endpoints URL::"+endpoints);
		initiateRestAPICall(endpoints);
	}
	 
	
	@Given("^\"(.*?)\" endpoint with category\"(.*?)\"$")
	public void endpoint_with_category(String endpoint, String RouteCategoryId) throws Throwable {
		String endpoints=loadProps.getConfigPropProperty("api.baseURL")+loadProps.getEndpointProProperty(endpoint)+RouteCategoryId;
		logger.debug("endpoints URL::"+endpoints);
		initiateRestAPICall(endpoints);
	}
	
	@Given("^\"(.*?)\" endpoint with route SEO\"(.*?)\"$")
	public void endpoint_with_route_SEO(String endpoint, String pageSeoURL) throws Throwable {
		String endpoints=loadProps.getConfigPropProperty("api.baseURL")+loadProps.getEndpointProProperty(endpoint)+pageSeoURL;
		logger.debug("endpoints URL::"+endpoints);
		initiateRestAPICall(endpoints);
	}
}

