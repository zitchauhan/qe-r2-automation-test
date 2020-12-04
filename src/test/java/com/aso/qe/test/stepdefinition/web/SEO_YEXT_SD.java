package com.aso.qe.test.stepdefinition.web;

import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.SEO_YEXT_PO;

import cucumber.api.java.en.And;

public class SEO_YEXT_SD  extends CommonActionHelper {

	SEO_YEXT_PO seoYextPage = PageFactory.initElements(getDriver(), SEO_YEXT_PO.class);
	
    @And("^User signs into YEXT$")
    public void user_signs_in() throws Throwable{
    	seoYextPage.signIn();
    }
    
    @And("^User selects the entity$")
    public void user_selects_entity() throws Throwable{
    	seoYextPage.selectExistingEntity(webPropHelper.getTestDataProperty("YextEntityFolder"), webPropHelper.getTestDataProperty("YextEntity"));
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
    
    @And("^Navigate to the store page$")
    public void navigate_to_store_page() throws Throwable{
    	seoYextPage.selectCityFromStorePage(webPropHelper.getTestDataProperty("YextCity1"));
    	seoYextPage.selectLocation(webPropHelper.getTestDataProperty("YextLocation1"));
    	seoYextPage.selectStore(webPropHelper.getTestDataProperty("YextStoreName1"));
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
    
}
