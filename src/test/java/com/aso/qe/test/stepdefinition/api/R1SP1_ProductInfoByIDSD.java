package com.aso.qe.test.stepdefinition.api;

import com.aso.qe.framework.api.helpers.JSONValidationUtils;

import cucumber.api.java.en.Given;

public class R1SP1_ProductInfoByIDSD extends JSONValidationUtils
{
	//private static final Logger logger = Logger.getLogger(R1SP1_ProductInfoByIDSD.class);
	
	 
	
	
	@Given("^\"(.*?)\" endpoint with productId \"(.*?)\"$")
	public void endpoint_with_productId(String endpoint, String ProductID) throws Throwable {
		String endpoints=loadProps.getConfigPropProperty("api.baseURL")+loadProps.getEndpointProProperty(endpoint)+ProductID;
		initiateRestAPICall(endpoints);
	
	}
	 

	 
}

