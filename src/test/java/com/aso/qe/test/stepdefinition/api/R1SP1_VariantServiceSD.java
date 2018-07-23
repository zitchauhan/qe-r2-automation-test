package com.aso.qe.test.stepdefinition.api;

import org.apache.log4j.Logger;

import com.aso.qe.framework.api.helpers.JSONValidationUtils;

import cucumber.api.java.en.Given;

public class R1SP1_VariantServiceSD extends JSONValidationUtils
{
	private static final Logger logger = Logger.getLogger(R1SP1_VariantServiceSD.class);
	
	 
	
	
	@Given("^\"(.*?)\" endpoint with SEO \"(.*?)\"$")
	public void endpoint_with_SEO(String endpoint, String SEO_Name_Category) throws Throwable {
		String endpoints=loadProps.getConfigPropProperty("api.baseURL")+loadProps.getEndpointProProperty(endpoint)+SEO_Name_Category;
		logger.debug("endpoints URL::"+endpoints);
		initiateRestAPICall(endpoints);
	
	}
	 

	 
}

