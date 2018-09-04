package com.aso.qe.test.pageobject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.aso.qe.framework.common.CommonActionHelper;

public class R2_FindStore_PO extends CommonActionHelper {

	/**************** START LOCAL OBJETCS AND DECLARATIONS ***********************/

	/*************** END LOCAL OBJETCS AND DECLARATIONS ************************/

	/***************************** START XPAHTS **********************************/
	// Start KER-2872 CR-DPK

	@FindBy(xpath = "//*[@data-auid='PDP_FindAStore']")
	public WebElement lnkFindaStorePDP;// Area PDP
	
	@FindBy(xpath = "//*[@data-auid='submit-zip-code']/span")
    public WebElement btnZipcodeSubmit_m;//Area Cart

	// End KER-2872 CR-DPK
	
	
	


	/***************************** END XPAHTS ***********************************/

	/***************************** START METHODS ********************************/

	/***************************** END METHODS *********************************/

}
