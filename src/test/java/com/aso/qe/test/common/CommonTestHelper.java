package com.aso.qe.test.common;

public class CommonTestHelper {

	public static void main(String[] args) {
		String apiEndpointWebURL = "https://uat6www.academy.com/?debug=aso";
		
		System.out.println(getAPIEndpointWebURL(apiEndpointWebURL));

	}
	
	public static String getAPIEndpointWebURL(String apiEndpointWebURL){
		if(apiEndpointWebURL!= null && apiEndpointWebURL.contains("/?debug=aso")){
			apiEndpointWebURL = apiEndpointWebURL.substring(0,apiEndpointWebURL.indexOf("/?debug=aso"));
		}
		return apiEndpointWebURL;
	}

}
