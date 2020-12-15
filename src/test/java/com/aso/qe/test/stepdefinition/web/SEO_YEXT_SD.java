package com.aso.qe.test.stepdefinition.web;

import java.util.ArrayList;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R2_Cart_PO;
import com.aso.qe.test.pageobject.SEO_YEXT_PO;
import cucumber.api.java.en.And;

public class SEO_YEXT_SD  extends CommonActionHelper {

	SEO_YEXT_PO seoYextPage = PageFactory.initElements(getDriver(), SEO_YEXT_PO.class);
	R2_Cart_PO cartR2PageObj = PageFactory.initElements(driver, R2_Cart_PO.class);
	ArrayList<String> arr = new ArrayList<>();
	
	public static String storeName = "";
	public static String mainPhone = "";
	public static String[] storeData = {};
	public static String[] yestStoreExistingAddress = {};
	
	
	@And("^User signs into YEXT$")
	public void user_signs_in() throws Throwable{
		seoYextPage.signIn();
	}

	@And("^User selects the entity$")
	public void user_selects_entity() throws Throwable{

		if(!webPropHelper.getTestDataProperty("YextEntity").equals("")) {
			yestStoreExistingAddress=seoYextPage.selectExistingEntity(webPropHelper.getTestDataProperty("YextEntityFolder"), webPropHelper.getTestDataProperty("YextEntity"));
		}
		else {
			//Create a new store location
			seoYextPage.selectAddSingleEntity();
			storeData=seoYextPage.createEntity(webPropHelper.getTestDataProperty("YextNewLocCountry"), 
					webPropHelper.getTestDataProperty("YextNewLocCategory"),
					webPropHelper.getTestDataProperty("YextNewLocAddressLine1"), webPropHelper.getTestDataProperty("YextNewLocAddressLine2"),
					webPropHelper.getTestDataProperty("YextNewLocAddressFloor"), webPropHelper.getTestDataProperty("YextNewLocAddressCity"),
					webPropHelper.getTestDataProperty("YextNewLocStateRegion"), webPropHelper.getTestDataProperty("YextNewLocAddressStateCode"),
					webPropHelper.getTestDataProperty("YextNewLocAddressPin"), webPropHelper.getTestDataProperty("YextNewLocMainPhoneCode"),
					webPropHelper.getTestDataProperty("YextNewLocMainPhoneNumber"));
			storeName = seoYextPage.fillMandatoryFields(webPropHelper.getTestDataProperty("YextNewLocFromHours"), webPropHelper.getTestDataProperty("YextNewLocToHours"));
		}
	}

	@And("^Modify store hour details$")
	public void modify_store_hour_details() throws Throwable{
		seoYextPage.modifyHours(webPropHelper.getTestDataProperty("YextDay1"), webPropHelper.getTestDataProperty("YextDayStatus1"),
				webPropHelper.getTestDataProperty("YextFromHours1"), webPropHelper.getTestDataProperty("YextToHours1"),"","");
	}

	@And("^Navigate to store locator page$")
	public void launch_store_locator_page() throws Throwable{
		seoYextPage.navigateStoreLocator();
	}

	@And("^Navigate to the store page with city \"(.*?)\", location \"(.*?)\" and store \"(.*?)\"$")
	public void navigate_to_store_page(String city,String location,String storeNameTxt) throws Throwable{
		seoYextPage.selectCityFromStorePage(webPropHelper.getTestDataProperty(city));
		seoYextPage.selectLocation(webPropHelper.getTestDataProperty(location));

		if(!storeName.equals("")) {
			seoYextPage.selectStore(storeName);
		}
		else {
			seoYextPage.selectStore(webPropHelper.getTestDataProperty(storeNameTxt));
		}
	}

	@And("^Verify Store hours in Store Locator page$")
	public void verify_store_hours() {
		seoYextPage.verifyStoreHoursInAcademy(webPropHelper.getTestDataProperty("YextDay1"),webPropHelper.getTestDataProperty("YextDayStatus1"));
	}

	@And("^Quit Browser$")
	public void quitBrowser() {
		driver.close();
	}

	@And("^Soft delete a store$")
	public void soft_delete_store() throws Throwable{
		seoYextPage.modifyHours(webPropHelper.getTestDataProperty("YextDay1"), webPropHelper.getTestDataProperty("YextDayStatus1"),
				webPropHelper.getTestDataProperty("YextFromHours1"), webPropHelper.getTestDataProperty("YextToHours1"),"","");
	}

	@And("^Delete the store$")
	public void delete_store_hours() {
		seoYextPage.closeStoreHoursAllDays();
	}

	@And("^Verify store close in PDP page$")
	public void verify_store_hours_PDP_page() {
		seoYextPage.verifyStoreCloseInPDP();
	}

	@And("^Verify store details in PDP page$")
	public void verify_store_details_PDP_page() {
		ArrayList<String> arr = new ArrayList<>();
		
		if(webPropHelper.getTestDataProperty("YextEntity").equals("")) {
			arr.add(webPropHelper.getTestDataProperty("YextNewLocAddressLine1"));
			arr.add(webPropHelper.getTestDataProperty("YextNewLocAddressLine2"));
			arr.add(webPropHelper.getTestDataProperty("YextNewLocAddressCity"));
			arr.add(webPropHelper.getTestDataProperty("YextNewLocAddressStateCode"));
			arr.add(webPropHelper.getTestDataProperty("YextNewLocAddressPin"));
		}
		else {
			arr.add(yestStoreExistingAddress[0]);
			arr.add(yestStoreExistingAddress[1]);
			arr.add(yestStoreExistingAddress[2]);
			arr.add(yestStoreExistingAddress[2]);
			arr.add(yestStoreExistingAddress[2]);
			
			/*arr.add(webPropHelper.getTestDataProperty("YextLine1"));
			arr.add(webPropHelper.getTestDataProperty("YextLine2"));
			arr.add(webPropHelper.getTestDataProperty("YextCity"));
			arr.add(webPropHelper.getTestDataProperty("YextState"));
			arr.add(webPropHelper.getTestDataProperty("YextZipcode"));*/
		}
		
		String storeNameVerify=null;
		String mainPhoneVerify=null;

		//Store Name validation
		if(!storeName.equals("")) 
			storeNameVerify=storeName;
		
		else if(!yestStoreExistingAddress[6].equals(""))
			storeNameVerify=yestStoreExistingAddress[6];
		else
			storeNameVerify=webPropHelper.getTestDataProperty("YextStoreName");
		
		//Main Phone Validation
		if(!mainPhone.equals(""))
			mainPhoneVerify=mainPhone;
		else if(!yestStoreExistingAddress[5].equals(""))
			mainPhoneVerify=yestStoreExistingAddress[5];

		seoYextPage.verifyStoreDetails(storeNameVerify,arr,mainPhoneVerify);
	}

	@And("^user selects store with \"(.*?)\" and \"(.*?)\" details$")
	public void user_selects_store_with_and(String zipCode, String storeNameText) throws Throwable {

		String storeNameSelect=null;

		if(webPropHelper.getTestDataProperty(storeNameText).equals("")) {
			storeNameSelect=storeName;
		}
		else {
			storeNameSelect=webPropHelper.getTestDataProperty(storeNameText);
		}
		cartR2PageObj.selectStoreWithZipAndStoreName(webPropHelper.getTestDataProperty(zipCode),storeNameSelect);
	}

	@And("^User creates new store location with \"(.*?)\",\"(.*?)\",\"(.*?)\",\"(.*?)\",\"(.*?)\",\"(.*?)\",\"(.*?)\",\"(.*?)\",\"(.*?)\",\"(.*?)\",\"(.*?)\"$")
	public String create_new_store(String country,String category,String addressLine1,String  addressLine2,String  floorTxt,
			String cityTxt,String  stateTxt,String  stateCodeTxt,String pinTxt,String mainPhoneCode,String mainPhoneNumber) throws Throwable {

		seoYextPage.selectAddSingleEntity();
		storeData=seoYextPage.createEntity(webPropHelper.getTestDataProperty(country), webPropHelper.getTestDataProperty(category),
				webPropHelper.getTestDataProperty(addressLine1), webPropHelper.getTestDataProperty(addressLine2),
				webPropHelper.getTestDataProperty(floorTxt), webPropHelper.getTestDataProperty(cityTxt),
				webPropHelper.getTestDataProperty(stateTxt), webPropHelper.getTestDataProperty(stateCodeTxt),
				webPropHelper.getTestDataProperty(pinTxt), webPropHelper.getTestDataProperty(mainPhoneCode),
				webPropHelper.getTestDataProperty(mainPhoneNumber));
		storeName = seoYextPage.fillMandatoryFields(webPropHelper.getTestDataProperty("YextNewLocFromHours"), webPropHelper.getTestDataProperty("YextNewLocToHours"));
		return storeName;
	}

	@And("^Verify Store created on ASO Page$")
	public void validate_store() {
		seoYextPage.validateStoreInASO(storeName);
	}

	@And("^Update store details$")
	public void update_store_details() throws Throwable {

		//Store name
		if(webPropHelper.getTestDataProperty("YextStoreNameUpdateYesNo").equalsIgnoreCase("Yes")) {
				storeName=seoYextPage.updateStoreName("Store Name "+RandomStringUtils.randomAlphabetic(5));
		}

		//Store Hours
		if(webPropHelper.getTestDataProperty("YextStoreHoursUpdateYesNo").equalsIgnoreCase("Yes"))
			seoYextPage.modifyHours(webPropHelper.getTestDataProperty("YextDay1"), webPropHelper.getTestDataProperty("YextDayStatus1"),
					webPropHelper.getTestDataProperty("YextFromHours1"), webPropHelper.getTestDataProperty("YextToHours1"),"","");

		//Store Address
		if(webPropHelper.getTestDataProperty("YextAddressUpdateYesNo").equalsIgnoreCase("Yes")) {
			arr.add(webPropHelper.getTestDataProperty("YextLine1"));
			arr.add(webPropHelper.getTestDataProperty("YextLine2"));
			arr.add(webPropHelper.getTestDataProperty("YextCity"));
			arr.add(webPropHelper.getTestDataProperty("YextState"));
			arr.add(webPropHelper.getTestDataProperty("YextZipcode"));
			seoYextPage.updateStoreAddress(arr);
		}

		//Store Main Phone
		if(webPropHelper.getTestDataProperty("YextMainPhoneUpdateYesNo").equalsIgnoreCase("Yes"))
			mainPhone=seoYextPage.updateStoreMainPhone(webPropHelper.getTestDataProperty("YextMainPhoneCode"), 
					webPropHelper.getTestDataProperty("YextMainPhoneNumber"));

		//Store Description
		if(webPropHelper.getTestDataProperty("YextDescriptionUpdateYesNo").equalsIgnoreCase("Yes"))
			seoYextPage.updateStoreDescription(webPropHelper.getTestDataProperty("YextStoreDescription"));

	}
}
