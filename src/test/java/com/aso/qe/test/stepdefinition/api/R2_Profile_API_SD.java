package com.aso.qe.test.stepdefinition.api;


import org.apache.log4j.Logger;
import org.json.simple.JSONObject;

import com.aso.qe.framework.api.helpers.JSONValidationUtils;
import com.aso.qe.framework.api.helpers.MiniCartJsonResponseHelper;
import com.aso.qe.framework.api.json.JsonReaderCommon;
import com.aso.qe.framework.common.FrameWorkHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.path.json.JsonPath;

public class R2_Profile_API_SD extends JSONValidationUtils{
	private static final Logger logger = Logger.getLogger(R2_Profile_API_SD.class);
	public MiniCartJsonResponseHelper miniCartJsonResponseHelper;
	//private String url;
	private static String regEmailId;

	@Given("^\"(.*?)\" endpoint for guest identity$")
	public void endpoint_for_guest_identity(String Guestloginurl) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(Guestloginurl);
		logger.debug("END Point URL:"+endpoints);
		initiateRestAPIPostCallForGuestAuthen(endpoints);
	}

	@Given("^\"(.*?)\" with \"(.*?)\" endpoint for login authentication$")
	public void with_endpoint_for_login_authentication(String loginurl, String LoginRequest) throws Throwable {
		System.setProperty("ProfileId", "");
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(loginurl);
		logger.debug("END Point URL:"+endpoints);
		initiateRestPostAPICall(endpoints, loadProps.getTestDataProperty(LoginRequest));
		JsonPath jsonPathEvaluator = response.jsonPath();
		String  profileID = jsonPathEvaluator.get("identity.userId");
		logger.debug("Profile ID::"+ profileID);
		System.setProperty("ProfileId", profileID);
	}

	@Given("^\"(.*?)\" with \"(.*?)\" endpoint for Change Password login authentication$")
	public void with_endpoint_for_Change_Password_login_authentication(String loginurl, String loginRequest) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(loginurl);
		logger.debug("END Point URL:"+endpoints);

		String postRequestStr = JSONValidationUtils.convertJsonFileToString(JsonReaderCommon.jsonRequestFolderPath+ loginRequest+".json");
		postRequestStr = postRequestStr.replace("REPLACE_EMAILID", regEmailId)
				.replace("REPLACE_PASSWORD", loadProps.getTestDataProperty("RegistrationUserPassword"));

		initiateRestPostAPICallWithoutCookiesAndReqStr(endpoints, postRequestStr);
	}

	@Given("^\"(.*?)\" endpoint with \"(.*?)\" for user registration$")
	public void endpoint_with_for_user_registration(String RegistrationUrl, String registrationPostRequest) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(RegistrationUrl);
		logger.debug("END Point URL:"+endpoints);
		String postRequestStr = JSONValidationUtils.convertJsonFileToString(JsonReaderCommon.jsonRequestFolderPath+ registrationPostRequest+".json");
		logger.debug("POST Request JSON:"+postRequestStr);
		regEmailId= "test"+FrameWorkHelper.getRandomAlphabetic(6).toLowerCase()+"@yopmail.com";
		postRequestStr = postRequestStr.replace("REPLACE_LOGONID",regEmailId)
				.replaceAll("REPLACE_PASSWORD", loadProps.getTestDataProperty("RegistrationUserPassword"));

		initiateRestPostAPICallWithoutCookiesAndReqStr(endpoints, postRequestStr);
	}

	@Given("^\"(.*?)\" endpoint with \"(.*?)\" for shipping details$")
	public void endpoint_with_for_shipping_details(String url, String extension) throws Throwable {
		String endpoints=apiEndpointIP+url+System.getProperty("ProfileId")+extension;
		logger.debug("END Point URL:"+endpoints);
		initiateRestAPICallWithCookie(endpoints);
	}

	@Given("^\"(.*?)\" endpoint with \"(.*?)\" for getting address of a profile$")
	public void endpoint_with_for_getting_address_of_a_profile(String Addurl, String extension) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(Addurl)+System.getProperty("ProfileId")+extension;
		logger.debug("END Point URL:"+endpoints);
		initiateRestAPICallWithCookie(endpoints);
		JsonPath jsonPathEvaluator = response.jsonPath();
		String addressID = jsonPathEvaluator.get("addressId[0]");
		logger.debug("Add ID::"+ addressID);
		System.setProperty("AddressId", addressID);
	}

	@Given("^\"(.*?)\" endpoint with \"(.*?)\" for getting Wishlist of a profile$")
	public void endpoint_with_for_getting_Wishlist_of_a_profile(String Addurl, String extension) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(Addurl)+System.getProperty("ProfileId")+extension;
		logger.debug("END Point URL:"+endpoints);
		initiateRestAPICallWithCookie(endpoints);
		JsonPath jsonPathEvaluator = response.jsonPath();
		String wishlistId = jsonPathEvaluator.get("gifts[0].id");
		logger.debug("WishList ID::"+ wishlistId);
		System.setProperty("WishListId", wishlistId);
	}

	@Then("^\"(.*?)\" endpoint for removing \"(.*?)\" by \"(.*?)\"$")
	public void endpoint_for_removing_by(String Addurl, String extension, String Id) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(Addurl)+System.getProperty("ProfileId")+extension+System.getProperty(Id);
		logger.debug("END Point URL:"+endpoints);
		//initiateRestDeleteAPICall(endpoints);
		initiateRestPostAPICallWithCookiesAndWithOutBody(endpoints);
	}

	@Given("^\"(.*?)\" endpoint with \"(.*?)\" for getting gift card details of a profile$")
	public void endpoint_with_for_getting_gift_card_details_of_a_profile(String Addurl, String extension) throws Throwable {
		System.setProperty("GiftWalletId","");
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(Addurl)+System.getProperty("ProfileId")+extension;
		logger.debug("END Point URL:"+endpoints);
		initiateRestAPICallWithCookie(endpoints);
		JsonPath jsonPathEvaluator = response.jsonPath();
		String walletID = jsonPathEvaluator.get("xwalletId[0]");
		logger.debug("Wallet ID::"+ walletID);
		System.setProperty("GiftWalletId", walletID);
	}


	@Given("^\"(.*?)\" endpoint with \"(.*?)\" for getting credit card details of a profile$")
	public void endpoint_with_for_getting_credit_card_details_of_a_profile(String Addurl, String extension) throws Throwable {
		System.setProperty("WalletId","");
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(Addurl)+System.getProperty("ProfileId")+extension;
		logger.debug("END Point URL:"+endpoints);
		initiateRestAPICallWithCookie(endpoints);
		JsonPath jsonPathEvaluator = response.jsonPath();
		String walletID = jsonPathEvaluator.get("xwalletId[0]");
		logger.debug("Wallet ID::"+ walletID);
		System.setProperty("WalletId", walletID);
	}

	@Given("^\"(.*?)\" endpoint for getting profile details of a profile$")
	public void endpoint_for_getting_profile_details_of_a_profile(String Addurl) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(Addurl)+System.getProperty("ProfileId");
		logger.debug("END Point URL:"+endpoints);
		initiateRestAPICallWithCookie(endpoints);
	}

	@Then("^\"(.*?)\" endpoint for getting \"(.*?)\" by \"(.*?)\"$")
	public void endpoint_for_getting_by(String Addurl, String extension, String Id) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(Addurl)+System.getProperty("ProfileId")+extension+System.getProperty(Id);
		logger.debug("END Point URL:"+endpoints);
		initiateRestAPICallWithCookie(endpoints);
	}

	@Then("^\"(.*?)\" endpoint for getting \"(.*?)\" by \"(.*?)\" for a user profile$")
	public void endpoint_for_getting_by_for_a_user_profile(String Addurl, String extension, String Id) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(Addurl)+System.getProperty("ProfileId")+extension+System.getProperty(Id)+"/";
		logger.debug("END Point URL:"+endpoints);
		initiateRestAPICallWithCookie(endpoints);
	}

	@Given("^\"(.*?)\" endpoint with \"(.*?)\" request and \"(.*?)\"$")
	public void endpoint_with_request_and_for(String Addurl, String AddAddressRequest, String extension) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(Addurl)+System.getProperty("ProfileId")+extension;
		logger.debug("END Point URL:"+endpoints);
		initiateRestPostAPICallWithCookies(endpoints, loadProps.getTestDataProperty(AddAddressRequest));
	}


	@Given("^\"(.*?)\" endpoint for profile logout$")
	public void endpoint_for_profile_logout(String logouturl) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(logouturl);
		logger.debug("END Point URL:"+endpoints);
		initiateRestPostAPICallWithoutBody(endpoints);
	}

	@Given("^\"(.*?)\" endpoint with \"(.*?)\" for address verification$")
	public void endpoint_with_for_address_verification(String Addressurl, String AddressVerificationRequest) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(Addressurl);
		logger.debug("END Point URL:"+endpoints);
		initiateRestPostAPICallWithoutCookies(endpoints, loadProps.getTestDataProperty(AddressVerificationRequest));
	}

	@Given("^\"(.*?)\" with  \"(.*?)\" endpoint for Order Get GiftCard Details$")
	public void with_endpoint_for_Get_GiftCard_Details(String url, String extension) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(url)+System.getProperty("OrderId")+extension;
		logger.debug("END Point URL:"+endpoints);
		initiateRestAPICallWithCookie(endpoints);
	}

	@SuppressWarnings("unchecked")
	@Given("^\"(.*?)\" endpoint with \"(.*?)\" and \"(.*?)\" for Profile address update of user$")
	public void endpoint_with_and_for_Profile_address_update_of_user(String url, String extension, String storeId) throws Throwable {
		JSONObject addressjsonObject = getFirstAddressDetails();
		String addressId = (String) addressjsonObject.get("addressId");
		addressjsonObject.put("phone1", FrameWorkHelper.getRandomNumber(10));
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(url)+System.getProperty("ProfileId")+extension+addressId+storeId;
		logger.debug("END Point URL:"+endpoints);
		initiateRestPostAPICallWithCookiesAndRequestJsonStr(endpoints, addressjsonObject.toJSONString());
	}

	@Given("^\"(.*?)\" endpoint with \"(.*?)\" and \"(.*?)\" for MyAccount Edit Profile$")
	public void endpoint_with_and_for_MyAccount_Edit_Profile(String url, String extension, String jsonRequestFilePath) throws Throwable {
		httpCookies=response.getDetailedCookies();
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(url)+extension+System.getProperty("ProfileId");
		logger.debug("END Point URL:"+endpoints);
		String postRequestStr = JSONValidationUtils.convertJsonFileToString(JsonReaderCommon.jsonRequestFolderPath+ jsonRequestFilePath+".json");
		postRequestStr = postRequestStr.replace("REPLACE_FIRSTNAME", FrameWorkHelper.getRandomAlphabetic(8)).replace("REPLACE_LASTNAME", FrameWorkHelper.getRandomAlphabetic(8));
		initiateRestPostAPICallWithCookiesAndRequestJsonStr(endpoints, postRequestStr);
	}

	@Given("^\"(.*?)\" endpoint for get Store Details$")
	public void endpoint_for_get_Store_Details(String getStroreUrl) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(getStroreUrl);
		logger.debug("END Point URL:"+endpoints);
		initiateRestAPICall(endpoints);
	}

	@Given("^\"(.*?)\" with \"(.*?)\" endpoint for change password of profile$")
	public void with_endpoint_for_change_password_of_profile(String changepasswordurl, String requestPath) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(changepasswordurl);
		logger.debug("END Point URL:"+endpoints);
		String postRequestStr = JSONValidationUtils.convertJsonFileToString(JsonReaderCommon.jsonRequestFolderPath+ loadProps.getTestDataProperty(requestPath)+".json");
		postRequestStr = postRequestStr.replace("REPLACE_EMAILID", regEmailId)
				.replaceAll("REPLACE_PASSWORD", loadProps.getTestDataProperty("RegistrationUserPassword")
						.replaceAll("REPLACE_NEWPASSWORD", "Ravi@005@"));
		initiateRestPostAPICallWithoutCookiesAndReqStr(endpoints, postRequestStr);
	}


	@Given("^\"(.*?)\" by \"(.*?)\" endpoint with \"(.*?)\" for Add shipping Address of Order profile$")
	public void by_endpoint_with_for_Add_shipping_Address_of_Order_profile(String url, String extension, String requestPath) throws Throwable {
		String endpoints=apiEndpointIP+loadProps.getTestDataProperty(url)+System.getProperty("OrderId")+extension;
		logger.debug("END Point URL:"+endpoints);
		String postRequestStr = JSONValidationUtils.convertJsonFileToString(JsonReaderCommon.jsonRequestFolderPath+ requestPath+".json");
		postRequestStr = postRequestStr.replace("REPLACE_FIRSTNAME", FrameWorkHelper.getRandomAlphabetic(8))
				.replace("REPLACE_FIRSTNAME", FrameWorkHelper.getRandomAlphabetic(8))
				.replace("REPLACE_LASTNAME", FrameWorkHelper.getRandomAlphabetic(8))
				.replace("REPLACE_PHONENUMBER", FrameWorkHelper.getRandomNumber(10))
				.replace("REPLACE_ORDERID", System.getProperty("OrderId"))
				.replace("REPLACE_ADDRESS", FrameWorkHelper.getRandomAlphabetic(8))
				;

		initiateRestPostAPICallWithCookiesAndRequestJsonStr(endpoints, postRequestStr);
	}
}