package com.aso.qe.test.common;
import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aso.qe.framework.api.helpers.JSONValidationUtils;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_FindStore_PO;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_SearchProduct_PO;
import com.aso.qe.test.stepdefinition.api.R1SP1_Categories_ProductsByCategorySD;

import cucumber.api.java.en.Then;
public class Common_API_PLCC extends JSONValidationUtils
{
	//private static final Logger logger = Logger.getLogger(Common_API_PLCC.class);
	private static final Logger logger = Logger.getLogger(R1SP1_Categories_ProductsByCategorySD.class);
	public static String regEmailId;
	public R1_FindStore_PO findStorePO;
	public static R1_GlobalElementHeader_Home_PO globalElementHeader;
	public static R1_SearchProduct_PO searchProductPO;
	
	
    
    

	}
