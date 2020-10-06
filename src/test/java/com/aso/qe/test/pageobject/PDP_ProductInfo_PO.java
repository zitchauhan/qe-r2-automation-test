package com.aso.qe.test.pageobject;

import com.aso.qe.framework.api.helpers.APIJsonHelper;

import io.restassured.path.json.JsonPath;
import static org.hamcrest.Matchers.*;

public class PDP_ProductInfo_PO extends APIJsonHelper {

	
	
	public void validateAttributeRegular()
	{
JsonPath  jsonPathEvaluator = response.jsonPath();
		
		System.out.println(jsonPathEvaluator.getBoolean("product-info"));
		
		//response.then().assertThat().body(jsonPathEvaluator.getString("hits[0].Pname"), equalTo("Car"));
		
	}
	
	
}
