package com.aso.qe.test.pageobject;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;

public class R2_Sanity_PO extends CommonActionHelper {
	
	/**************** START LOCAL OBJETCS AND DECLARATIONS ***********************/
	
	/*************** END LOCAL OBJETCS AND DECLARATIONS ************************/

	/***************************** START XPAHTS**********************************/
	@FindBy(xpath = "//*[@data-auid='btnAddToCart']")
	public WebElement AS_btnAddToCart;
	@FindBy(xpath = "//*[@data-auid='crt_btnCheckoutTop']")
	public WebElement AS_btnCheckOutTop;

	// Start Sanity CR-DPK
	@FindBy(xpath = "//button[@data-auid='hamburgerMenuToggleBtn_m']")
	public WebElement AS_btnXBurgerMenu;
	@FindBy(xpath = "//*[@data-auid='level1Category-SHOP']")
	public WebElement AS_btnShopCategory;
	@FindBy(xpath = "//*[@data-auid='level2Category-CLOTHING_m'] | //*[@data-auid='level2Category-CLOTHING'] | //*[@data-auid='level2Category-Clothing'] | //*[@data-auid='go-to-Clothing_m'] | //*[@data-auid='level2Category-Clothing_m']") //4Sep
	public WebElement AS_btnClothingCategory;
	@FindBy(xpath = "//*[@data-auid='level3Category-Mens']")
	public WebElement AS_btnMens_Clothing_Shop;
	@FindBy(xpath = "//*[@data-auid='level3Category-Mens']|//*[@data-auid='level3Category-Mens_m'] | //*[@data-auid='shopByCategory_1'] | //*[@data-auid=\"level3Category-Men's Clothing_m\"]") //12Sep
	public WebElement AS_btnMen_Clothing_Shop;
	@FindBy(xpath = "//*[@data-auid='level3Category-Mens_m'] | //*[@data-auid=\"level3Category-Men's Clothing_m\"]") 
	public WebElement AS_btnMen_Clothing_Shop_M;  //SID 15-Nov
	@FindBy(xpath = "//*[@data-auid='level3Category-Womens_m']")
	public WebElement AS_btnWomen_Clothing_Shop;
	@FindBy(xpath = "//*[@data-auid='search-input']")
	public WebElement AS_txtSearchBox;
	@FindBy(xpath = "//button[@data-auid='submitSearchButton'] | //*[@data-auid='search-clear-button']")
	public WebElement AS_btnGO;
	@FindBy(xpath = "//*[@data-auid='level4Category-Shirts_m'] | //*[@data-auid='go-to-Mens_m'] | //*[@data-auid='level4Category-Shirts'] | //*[@data-auid='shopByCategory_3'] | //*[@data-auid=\"go-to-Men's Clothing_m\"]/a") //12sep
	public WebElement AS_btnMensShirt_Men_Clothing_Shop;
	@FindBy(xpath = "//*[@data-auid='shopByCategory_0']")
	public WebElement AS_btnWomensTops_Women_Clothing_Shop;
	
	@FindBy(xpath = "//*[@data-auid='shopbycategorysection']//*[@data-auid='shopByCategory_1']")
	public WebElement AS_secCategory_CLP;
	
	//@FindBy(xpath = "//*[contains(@data-auid,'productCard_')]")
	@FindBy(xpath = "//*[contains(@data-auid,'productCard_') and not (contains(@type,'button'))]")
	public WebElement AS_productPLP1;

	@FindBy(xpath = "//*[contains(@data-auid,'productCard_')]") //28 Aug2018
	public WebElement AS_productPLP1_Mobile;

	@FindBy(xpath = "//*[@data-auid='btnviewCart']")
	public WebElement AS_btnViewCart;

	@FindBy(xpath = "(//*[@data-auid='btnc_btnCheckout'])[3]")  
	public WebElement AS_btnCheckout;

	@FindBy(xpath = "//div[contains(@data-component,'sectionTitle')]")
	public WebElement AS_txtSectionTitle;

	@FindBy(xpath = "//a[contains(@data-auid,'crt_lnkImgContainer')]")
	public WebElement AS_productImage;

	@FindBy(xpath = "//*[@data-auid='crt_inputQty']")
	public WebElement AS_inputQty;
	@FindBy(xpath = "//*[@data-auid='crt_inputQty_m']")
	public WebElement AS_inputQty_m;
	@FindBy(xpath = "(//div[text()='$'])[1]")
	public WebElement AS_txtQuantityPrice;
	//@FindBy(xpath = "(//div[text()='$'])[1]")
	@FindBy(xpath = "(//*[contains(@data-auid,'crt_qtyField')])[1]/../following-sibling::*/*[1]") 
	public WebElement AS_clkOutside;
	@FindBy(xpath = "//*[@data-auid='crt_btnAddPromo']")
	public WebElement AS_btnAddPromo;
	@FindBy(xpath = "//*[@data-auid='crt_btnHidePromo']")
	public WebElement AS_btnHidePromo;
	@FindBy(xpath = "//*[@data-auid='crt_inputPromo']")
	public WebElement AS_inputPromo;
	@FindBy(xpath = "//*[@data-auid='crt_btnPromoSbmt']")
	public WebElement AS_btnPromoSbmt;
	@FindBy(xpath = "//*[text()='Remove from Cart'] | //*[@data-auid='crt_btnRmvFromCart_${1}']")
	public WebElement AS_btnRemoveFromCart;

	@FindBy(xpath = "(//*[contains(text(),'Item Added Successfully')])[2] | //*[contains(text(),'Item Added Successfully')]") //4Sep
	public WebElement AS_txtItemAddedSuccessfully; // 4Ssep

	@FindBy(xpath = "//div[text()='Subtotal']/..")
	public WebElement AS_txtSubtotalCart;

	@FindBy(xpath = "//div[text()='Estimated Shipping']/..")
	public WebElement AS_txtEstimatedShippingCart;

	@FindBy(xpath = "//div[text()='Estimated Taxes']/..")
	public WebElement AS_txtEstimatedTaxesCart;

	@FindBy(xpath = "//div[text()='Total']/..")
	public WebElement AS_txtTotalCart;

	@FindBy(xpath = "//div[@class='col-12 col-md-5 px-0 pl-md-1']")
	public WebElement AS_txtOrdersummaryCart;

	@FindBy(xpath = "//*[@data-auid='crt_btnAddPromo']")
	public WebElement AS_txtAddPromoCode;

	@FindBy(xpath = "//*[@data-auid='crt_btnAddPromo']/span")
	public WebElement AS_iconPlusPromoCode;

	@FindBy(xpath = "//*[@data-auid='crt_inputPromo']")
	public WebElement AS_inputPromoCode;

	@FindBy(xpath = "//*[@data-auid='btncrt_btnPromoSbmt']")
	public WebElement AS_btnCartSubmit;

	@FindBy(xpath = "//*[@data-auid='crt_btnHidePromo']")
	public WebElement AS_iconMinusPromoCode;

	@FindBy(xpath = "//*[contains(text(),'YOUR CART')]")
	public WebElement AS_txtYourCart;
	
	@FindBy(xpath = "//*[text()='CHECKOUT']")   
	public WebElement headerCheckout; //Anuj 09-Oct
	
	
	// End Sanity CR-DPK
	/***************************** END XPAHTS***********************************/

	/***************************** START METHODS********************************/
	public void clickAddToCart() throws Exception {
		assertTrue(clickOnButton(AS_btnAddToCart));
	}

	public void verifyOrderSummaryOnCartPage() throws InterruptedException {
		Thread.sleep(Constants.thread_low);
		assertTrue(isDisplayed(AS_txtSubtotalCart));
		Thread.sleep(Constants.thread_low);
		assertTrue(isDisplayed(AS_txtEstimatedShippingCart));
		Thread.sleep(Constants.thread_low);
		assertTrue(isDisplayed(AS_txtEstimatedTaxesCart));
		Thread.sleep(Constants.thread_low);
		assertTrue(isDisplayed(AS_txtTotalCart));

	}

	public void verifyRecalculatedOrderSummaryOnCartPage() throws InterruptedException {
		Thread.sleep(Constants.thread_low);
		assertTrue(isDisplayed(AS_txtSubtotalCart));
		Thread.sleep(Constants.thread_low);
		assertTrue(isDisplayed(AS_txtEstimatedShippingCart));
		Thread.sleep(Constants.thread_low);
		assertTrue(isDisplayed(AS_txtEstimatedTaxesCart));
		Thread.sleep(Constants.thread_low);
		assertTrue(isDisplayed(AS_txtTotalCart));

	}

	public void verifyAppliedPromoOnCartPage(String arg1) throws InterruptedException {
		assertTrue(isDisplayed(AS_txtAddPromoCode));
		assertTrue(clickOnButton(AS_iconPlusPromoCode));
		setInputText(AS_inputPromoCode, webPropHelper.getTestDataProperty(arg1));
		assertTrue(clickOnButton(AS_btnCartSubmit));
		Thread.sleep(2000);
	}
	/***************************** END METHODS*********************************/

}
