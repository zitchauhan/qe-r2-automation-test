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
    	seoYextPage.selectExistingEntity("Bhavna_Test", "ASO_bhavna_Test19");
    }
    
    @And("^Modify store hour details$")
    public void modify_store_hour_details() throws Throwable{
    	seoYextPage.modifyHours("Mon", "Open","08:00 AM","09:00 PM","","");
    }
    
}
