package com.aso.qe.test.stepdefinition.web;

import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.SearchProductPO;

import cucumber.api.java.en.Then;

public class SD_SIT_SearchFilter extends CommonActionHelper{
	private static final Logger logger = Logger.getLogger(SD_SIT_SearchFilter.class);
	SearchProductPO searchProductPO = PageFactory.initElements(getDriver(), SearchProductPO.class);

	@Then("^Verify the selected filtered products \"(.*?)\"\"(.*?)\"are displayed in product grid$")
	public void verify_the_selected_filtered_products_are_displayed_in_product_grid(String price, String color) throws Throwable {

		boolean flag = searchProductPO.checkedselectedfacet_container(searchProductPO.selectedfacet_containerList,price,color);
		logger.debug("selected filters are found:"+flag);
	}

	@Then("^User should be able to unselect \"(.*?)\"\"(.*?)\" the same checkbox for all the filters$")
	public void user_should_be_able_to_unselect_the_same_checkbox_for_all_the_filters(String price, String color) throws Throwable {
		if("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(searchProductPO.clearAllfacet_containerMobile));
			//clickOnButton(searchProductPO.applyFilterfacet_containerMobile);
		}else{
			searchProductPO.checkedselectedfacet_containerClearAll(searchProductPO.selectedfacet_containerList);	
		}
	}

}


