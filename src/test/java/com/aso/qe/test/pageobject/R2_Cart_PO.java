package com.aso.qe.test.pageobject;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;

public class R2_Cart_PO extends CommonActionHelper {

	/**************** START LOCAL OBJETCS AND DECLARATIONS ***********************/
	private static final Logger logger = Logger.getLogger(R2_Cart_PO.class);
	R2_Sanity_PO r2SanityPo = PageFactory.initElements(driver, R2_Sanity_PO.class);
	public R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver,
			R1_GlobalElementHeader_Home_PO.class);
	R1_FindStore_PO r1FindStorePO = PageFactory.initElements(driver, R1_FindStore_PO.class);
	/*************** END LOCAL OBJETCS AND DECLARATIONS **************************/

	/***************************** START XPAHTS **********************************/
	// Start KER-2911 CR-DPK
	@FindBy(xpath = "//button[@id='rh-icon-clicker']") public static WebElement cartIcon; //move to golbal header
//	@FindBy(xpath = "//h1[contains(text(),'Your Shopping Cart is Empty')]")
//	WebElement cartEmptyTxt;
//	@FindBy(xpath = "//.[@class='cont-shop-link']")25 aug
//	public	WebElement continueShoppingLink;
	@FindBy(xpath = "//a[@id='checkoutGuestButton']")//not clear not be their
	public WebElement btnBeginCheckout;

//	@FindBy(xpath = "//div[text()='Subtotal']/../div[2]")//***
//	public WebElement txtSubtotalCart;

//	@FindBy(xpath = "//div[text()='Estimated Shipping']/..")
//	public WebElement txtEstimatedShippingCart;

//	@FindBy(xpath = "//div[text()='Estimated Taxes']/../div[2]")
//	public WebElement txtEstimatedTaxesCart;

//	@FindBy(xpath = "//div[text()='Promocode']/../div[2]")
//	public WebElement txtPromocodeCart;

//	@FindBy(xpath = "//div[text()='Total']/../div[2]")
//	public WebElement txtTotalCart;

	@FindBy(xpath = "//div[@class='col-12 col-md-5 px-0 pl-md-1']")//remove
	public WebElement txtOrdersummaryCart;

//	@FindBy(xpath = "//*[@data-auid='btnc_btnCheckout']")
//	public WebElement btnCartCheckout;
	// End KER-2911 CR-DPK

	// Start KER-2942 CR-DPK
	@FindBy(xpath = "//*[@data-auid='PDP_QC_INC']/../span/input[@aria-label='Enter Desired Quantity']")//PDP
	public WebElement R2_iconQuantityIncrease;
	
	@FindBy(xpath ="(//*[contains(@data-auid,'crt_btnRmvFromCart_')])[1]") //27Aug
	public WebElement lnkRemoveCart; //27Aug
	// End KER-2942 CR-DPK

	// Start KER-3169 CR-DPK
//	@FindBy(xpath = "//*[@data-auid='c_btnInputPromo']/div")
//	public WebElement txtInvalidPromo;
	// End KER-3169 CR-DPK

	//Promo code related element
	// Start KER-2940 CR-DPK
//	@FindBy(xpath = "//*[contains(text(),'Promocode')]/..")// Duplicate Done
//	public WebElement txtPromocode;

	@FindBy(xpath = "//*[text()='$']/following::div")
	public WebElement txtActualPrice;

//	@FindBy(xpath = "(//*[text()='$'])[1]")//duplicate
//	public WebElement txtPromoPrice;

	@FindBy(xpath = "(//*[text()='$'])[2]")
	public WebElement txtActualPrice2;
	
	//Start CR-AKK 27Aug
	@FindBy(xpath = "//div[text()='Estimated Shipping']/../div[2]")
	public WebElement txtEstimatedFree;
	//End CR-AKK 27Aug
	// End KER-2940 CR-DPK
//****************************find a store**********************************
	// Start KER-2872 CR-DPK
	@FindBy(xpath = "(//*[@data-auid='findAStore'])[1]")
	public WebElement lnkFindaStoreHomePage;

	@FindBy(xpath = "//*[@data-auid='find-a-store']/input")
	public WebElement inputFindaStoreHomePage;

	@FindBy(xpath = "//*[@data-auid='submit-zip-code']")
	public WebElement btnZipcodeSubmit;

	@FindBy(xpath = "(//*[@data-auid='find-a-store-modal'])[2]/../div[1]/div[2]")
	public WebElement txtStoreResult;

	@FindBy(xpath = "//h2[text()='Find A Store']")
	public WebElement txtFindaStore;

	@FindBy(xpath = "//*[@data-auid='btnfind-a-store-see-more-button']")
	public WebElement btnViewTheNext5Stores;

	@FindBy(xpath = "//*[contains(text(),'Sorry')]")
	public WebElement txtStaticErrorMsg;

	@FindBy(xpath = "(//*[@class='academyicon icon-plus '])[1]")
	public WebElement iconPlusStoreAddressDrawer;

	@FindBy(xpath = "//*[@class='academyicon icon-plus ']")
	public List<WebElement> iconPlusAllStoreAddressDrawer;

	@FindBy(xpath = "//*[@class='academyicon icon-minus']")
	public WebElement iconMinusStoreAddressDrawer;

	@FindBy(xpath = "(//*[@data-auid='btnfind-a-store-mystore-button'])[1]")
	public WebElement btnMakeMyStore;

	@FindBy(xpath = "//*[@data-auid='btnfind-a-store-mystore-button']")
	public List<WebElement> btnAllMakeMyStore;

	@FindBy(xpath = "(//*[@data-auid='facetdrawerundefined'])/div/div/div/div/div")
	public WebElement txtAddress;

	@FindBy(xpath = "(//*[@data-auid='facetdrawerundefined'])/div/div/div/div[2]/div[1]")
	public WebElement txtPhoneNumber;

	@FindBy(xpath = "(//*[@data-auid='facetdrawerundefined'])/div/div/div/div[2]/div[2]")
	public WebElement txtDrivingDirection;

	@FindBy(xpath = "(//*[@data-auid='facetdrawerundefined'])/div/div/div/div/div[2]")
	public WebElement txtStoreOpendays_hours;

	@FindBy(xpath = "(//*[@data-auid='find-a-store-modal'])[2]/div/div")
	public WebElement googleMap;

	@FindBy(xpath = "//*[text()='Your Store']")
	public WebElement txtYourStore;

	@FindBy(xpath = "//*[@data-auid='facetdrawerundefined']//*[contains(text(),'mi')]")
	public List<WebElement> txtDistanceinMiles;
	
	@FindBy(xpath = "//*[text()='Change Location']")
	public WebElement lnkChangeLocationCart;//DPK 24 Aug
	
	@FindBy(xpath="(//*[text()='Find a Store'])[2]") 
	public WebElement cart_FindStore;
	
	
	@FindBy(xpath = "//*[contains(text(),'Items Not Available for Pickup')]")
	public List<WebElement> txtBopisAvailablity;//DPK 24 Aug
	
	@FindBy(xpath = "//*[text()='Item Available for Pickup']")
	public WebElement txtBopisAvailablityStoreModal;  //SID 11-Jan
	
	@FindBy(xpath = "//*[contains(text(),'limited')]")
	public WebElement txtLimitedStockPDP;  //SID 12-Jan
	
	@FindBy(xpath = "(//*[@data-auid='crt_inputQty'])[1]")
	public WebElement limitedQuantityAddedInCart;  //SID 12-Jan
	
	@FindBy(xpath = "//*[@data-auid='cart_radio_button_div']/*[2]/*[2]/*[2]")
	public WebElement storeNameOnCartPageInStorePickUp;  //SID 23-Jan
	
	@FindBy(xpath = "//*[text()='Change Location']/parent::*")
	public WebElement storeNameCartOrderSummary;  //SID 26-Jan
	
	@FindBy(xpath = "//*[text()='Change Location']/parent::*/following-sibling::*")
	public WebElement instoreShippingChargesCartPage;  //SID 27-Jan
	
	@FindBy(xpath = "//*[contains(text(),'Items Available')]")
	public List<WebElement> inventoryAvailabilityBOPISStores;  //SID 27-Jan
	
	@FindBy(xpath = "//*[@data-auid='facetdrawerundefined']")
	public List<WebElement> storeNamesCartPage;  //SID 27-Jan

	
	@FindBy(xpath = "//*[@role='tooltip']")
	public WebElement tooltip;  //SID 27-Jan
	
	@FindBy(xpath = "//*[@role='alert']")
	public WebElement messageFlyout;  //SID 27-Jan
	
	@FindBy(xpath = "//*[@data-auid='store_not_selected']")
	public WebElement bopisStoreNotSelectedErrorMessage;  //SID 27-Jan
	
	
	@FindBy(xpath = "//*[@data-auid='tooltip-close-crt_rdTooltip_1']/parent::*")
	public WebElement storeMessageFlyout;  //SID 27-Jan
	
	@FindBy(xpath = "//*[@data-auid='tooltipcrt_rdTooltip_1']/parent::* | //*[@data-auid='cart_radio_button_div']//div[2]/span") //Updated by MJR - 17/7/19
	public WebElement storeNameCart;  //SID 27-Jan
	
	
	@FindBy(xpath = "//*[@role='dialog']/*[2]/*[3]/*[1]")
	public WebElement outOfStockMesssageCart;  //SID 27-Jan
	
	@FindBy(xpath = "//*[@data-auid='tooltipcrt_rdTooltip_1']")
	public WebElement inStoreSelectedByDefault;  //SID 27-Jan
	
	@FindBy(xpath = "(//*[text()='Change Location']/parent::*/button)[1]")
	public WebElement changeLocationViewCart;  //SID 27-Jan
	
	@FindBy(xpath = "//*[contains(@class,'academyicon icon-store')]")
	public WebElement greyPickUpIcon;  //SID 27-Jan
	
	
	@FindBy(xpath = "//*[contains(text(),'Items Not Available for Pickup')]/div/img")
	public List<WebElement> txtBopisImageThumbnails;//DPK 24 Aug
	//KER-2872 CR-MS Added a webelement for find store link in cart 
	@FindBy(xpath = "//*[@data-auid='FOOTER_LINK_Find A Store']")
	public WebElement findStoreCart_Lnk;

	// End KER-2872 CR-DPK

	// Start KER-3613 Store Locator
	@FindBy(xpath = "//*[text()='Find a Store']")//duplicate lnkFindaStoreHomePage
	public WebElement linkStoreLocator;

	@FindBy(xpath = "(//*[@data-auid='find-a-store-modal'])[2]")
	public WebElement fieldStoreModal;

	@FindBy(xpath = "//*[@data-auid='submit-zip-code']/span")//duplicate btnZipcodeSubmit
	public WebElement submitZipCode;

	@FindBy(xpath = "//*[@name='zipcode'] | //*[@data-auid='find-a-store']/input")
	public WebElement textzipCode;  // SID Modified 8-Jan

	@FindBy(xpath = "//*[text()='Closest Stores to Your Location']")
	public WebElement storeDetails;
	
	@FindBy(xpath = "//*[@id='disclaimerMessaging']/*[1]")
	public WebElement leaglMessageAmmoCart;   //SID 7-Jan
	
	@FindBy(xpath = "//*[@data-auid='cart_radio_button_div']//div[2]//input[@radioname='shipmentOptions']/following-sibling::label")
	public List<WebElement> clickAllInStorePickUp;   //SID 8-Jan
	
	//@FindBy(xpath = "//p[@class='m-0']")
	@FindBy(xpath = "//*[@data-auid='freeShipValue'] | //*[contains(text(),'Standard')]")
	public WebElement shiptohomeshippingfee;
	
	

	//********************find a store  end ********************************
	
	// End KER-3613 Store Locator

	// Start KER-3511 CR-DPK
//	@FindBy(xpath = "//*[text()='Change ZIP code']")
//	public WebElement lnkChangeZipCode;

//	@FindBy(xpath = "//*[@data-auid='crt_inputZip']")
//	public WebElement inputZipCode;

//	@FindBy(xpath = "//*[@data-auid='btncrt_btnCalcShippingModal']")
//	public WebElement btnCartSubmit;

//	@FindBy(xpath = "//*[contains(text(),'Estimated Shipping')]/..")//duplicate
//	public WebElement txtEstimatedShipping;
	// End KER-3511 CR-DPK

	// Start KER-2927 CR-SK
//	@FindBy(xpath = "//div[contains(text(), 'Estimated Taxes')]/following-sibling::div[1]")
//	public WebElement txtEstimatedTax;

//	@FindBy(xpath = "//div[contains(text(), 'Total')]/following-sibling::div[1]")
//	public WebElement txtTotal;

//	@FindBy(xpath = "//input[@data-auid='crt_inputQty']")
//	public WebElement txtQuantity;

//	@FindBy(xpath = "//input[@data-auid='crt_rdOpt_0']")
//	public WebElement rbShipToMe;

//	@FindBy(xpath = "//input[@data-auid='crt_rdOpt_1']")
//	public WebElement rbInStorePickUp;

//	@FindBy(xpath = "(//*[@data-auid='btnc_btnCheckout'])[1]")//Duplicate btnCartCheckout
//	public WebElement btnCheckout;
	// End KER-2927 CR-SK

	// start KER-2939 CR-RK
//	@FindBy(xpath = "//button[contains(@data-auid,'crt_btnWlist')]")
//	public WebElement btnWlist;

//	@FindBy(xpath = "//button[text()='Change ZIP code']") //Duplicate
//	public WebElement changeZIPCode;

//	@FindBy(xpath = "//input[@data-auid='crt_inputZip']")//Duplicate
//	public WebElement inputZIPCode;

//	@FindBy(xpath = "//button[@data-auid='btncrt_btnCalcShippingModal']") // 22Aug &&&Duplicate
//	public WebElement submitZIPCode;

//	@FindBy(xpath = "//a[contains(@data-auid,'crt_lnkImgContainer')]")
//	public WebElement productName;

//	@FindBy(xpath = "//span[text()='Color']")
//	public WebElement txtColor;
//
//	@FindBy(xpath = "//span[contains(text(),'Size')]")
//	public WebElement txtSize;
	// End KER-2939 CR-RK

	// Start KER-2939 CR-AKK
//	@FindBy(xpath = "//a[contains(@data-auid, 'crt_lnkProdName_')]")
//	public WebElement lnkProducttext;

//	@FindBy(xpath = "(//*[contains(@data-auid, 'crt_lnkProdName_')]/../div/span[2])[1]")
//	public WebElement txtPrdColor;

//	@FindBy(xpath = "(//*[contains(@data-auid, 'crt_lnkProdName_')]/../div/span[2])[2]")
//	public WebElement txtPrdSize;

//	@FindBy(xpath = "//*[contains(@data-auid,'crt_btnRmvFromCart_')]")
//	public WebElement btnRemoveCart;

//	@FindBy(xpath = "(//*[contains(text(),'Promocode')]/.") //notclear
//	public WebElement txtPromoCode1;

//	@FindBy(xpath = "//button[@data-auid='btncrt_btnSignIn']")
//	public WebElement btnCrtSignIn;//Keep for guest

//	@FindBy(xpath = "(//*[contains(text(),'Est. Arrival')])")
//	public WebElement txtEstArrival;

//	@FindBy(xpath = "(//*[contains(@data-auid, 'tooltipcrt_rdTooltip_')])[1]")
//	public WebElement iconTolltip;

	@FindBy(xpath = "(//*[@data-auid='findAStore'])[1]")//*************find a store Duplicate 
	public WebElement lnkFindAStore;
	@FindBy(xpath = "//a[@data-auid='findAStore_m']//span[2]")
	public WebElement lnkFindAStore_M; 
	
	@FindBy(xpath = "//input[@name='zipcode']|//*[@data-auid='find-a-store']/input")//*************find a store Duplicate 
	public WebElement txtZipCode;

	@FindBy(xpath = "//*[@data-auid='submit-zip-code']//span")//*************find a store Duplicate 
	public WebElement btnZipCode;

	@FindBy(xpath = "//*[@data-auid='find-a-store-modal-close']")//*************find a store Duplicate 
	public WebElement btnFindStoreClose;
	
	@FindBy(xpath = "(//div[@data-auid='facetdrawerundefined'])[1]")
    public WebElement storeNames_txt;
    
    @FindBy(xpath = "//button[@data-auid='btnfind-a-store-mystore-button']")
    public WebElement makeMyStore_btn; 

	//CR-AKK 25Aug
	@FindBy(xpath = "//*[@data-auid='PDP_AddToWishList']")
	public WebElement lnkAddToWishList;
	
	@FindBy(xpath = "//input[@data-auid='input_newWishListName']")
	public WebElement inputNewWishList;
	
	@FindBy(xpath = "//*[@data-auid='btnwishListPopover_createList']")
	public WebElement btnCreatelist;
	//CR-AKK 25Aug
	
	@FindBy(xpath ="//*[contains(@data-auid, 'wishListPopover_add_to_wishList_')]")
	public WebElement lnkTextExistingList;	
	// End KER-2939 CR-AKK

	// Start KER-3127 CR-AKK
//	@FindBy(xpath = "//a[@data-auid='crt_lnkLegal_0']")
//	public WebElement lnkShippingPolicy;

//	@FindBy(xpath = "(//*[text()='Shipping Charges'])[2]")// keep it seperately click on shiiping policy
//	public WebElement txtShippingCharges;

//	@FindBy(xpath = "//a[@data-auid='crt_lnkLegal_1']")
//	public WebElement lnkReturnPolicy;

//	@FindBy(xpath = "(//*[text()='Return Policy'])[2]")
//	public WebElement txtReturnPolicy;
	
	//CR-AKK //24Aug

//	@FindBy(xpath = "//a[text()='Bikes & Cycling']")//PDP
//	public WebElement subCategoryCycling;
//
//	@FindBy(xpath = "//*[@data-auid='shopByCategory_2']")//PDP
//	public WebElement shopByCategory2;
//
//	@FindBy(xpath = "//*[@data-auid=\"facetdrawer_drawer_Gender\"]")//PDP
//	public WebElement facetDrawerGender;
//
//	@FindBy(xpath = "//*[@data-auid=\"drawer_Girls'\"]")//PDP
//	public WebElement selectGenderGirl;
//
//	@FindBy(xpath = "//*[@data-auid='facetdrawer_drawer_Brand']")//PDP
//	public WebElement facetDrawerBrand;
//
//	@FindBy(xpath = "//*[@data-auid='drawer_Diamondback']")//PDP
//	public WebElement selectBrandDiamondback;
//
//	@FindBy(xpath = "//*[@id='productCardListing']/div[3]")//PDP
//	public WebElement selectProductCycle;
//
//	@FindBy(xpath = "//div[text()=119.99]")
//	public WebElement lineItemDiscount;
//	
//	@FindBy(xpath = "//div[text()='-$42']")
//	public WebElement appliedTotalDisc;
	@FindBy(xpath = "//a[text()='Bikes & Cycling']")//PDP***************
    public WebElement subCategoryCycling;

    @FindBy(xpath = "//*[@data-auid='shopByCategory_2']")//PDP***************
    public WebElement shopByCategory2;

    @FindBy(xpath = "//*[@data-auid=\"facetdrawer_drawer_Gender\"]")//PDP****************
    public WebElement facetDrawerGender;

    @FindBy(xpath = "//*[@data-auid=\"drawer_Girls'\"]")//PDP********************
    public WebElement selectGenderGirl;

    @FindBy(xpath = "//*[@data-auid='facetdrawer_drawer_Brand']")//PDP**************
    public WebElement iconfacetDrawerBrand;

    @FindBy(xpath = "//*[@data-auid='drawer_Diamondback']")//PDP**********************
    public WebElement chboxBrandDiamondback;

    @FindBy(xpath = "//*[@id='productCardListing']/div[3]")//PDP*******************
    public WebElement selectProductCycle;

    @FindBy(xpath = "//*[@data-auid='crt_qtyField']/../following-sibling::div/section/div[1] ") //  CR-AKK 24Aug
    public WebElement txtLineItemDiscount;
    
    @FindBy(xpath = "//*[text()='Promocode']/../div[2]") //  CR-AKK 24Aug//dulicte
    public WebElement txtAppliedTotalDisc;
    
    @FindBy(xpath ="//div[@data-funding-source='paypal']") //  CR-AKK 24Aug//checkout page
    public WebElement btnPayPalCheckout;           //  CR-AKK 24Aug
    
    @FindBy(xpath ="//*[text()='Total:']/..//div[2]") //  CR-AKK 24Aug cartduplicet
    public WebElement txtDiscountTotal;   //  CR-AKK 24Aug
    
    @FindBy(xpath ="(//*[text()='Total'])[2]/../div") //  CR-AKK 25Aug duplicet
    public WebElement txtRemoveDiscountTotal;         //  CR-AKK 25Aug
    

	// End KER-3127 CR-AKK //24Aug
	
	// Start KER-3467 CR - SK
	@FindBy(xpath = "//div[.='Sorry! There are no stores within 250 miles. Please order online or try new ZIP code.']")//find a store ***duplicate
	public WebElement txtNoStoreErrorMessage; //CR-Rk KER-3467 Sep27
	// End KER-3467

	// Start KER-2946 CR-SK
//	@FindBy(xpath = "//img[@alt='Visa']")
//	public WebElement iconVisa;()

//	@FindBy(xpath = "//img[@alt='Master Card']")
//	public WebElement iconMasterCard;

//	@FindBy(xpath = "//img[@alt='Paypal']")
//	public WebElement iconPaypal;

//	@FindBy(xpath = "//img[@alt='Google Pay']")
//	public WebElement iconGooglePay;

//	@FindBy(xpath = "//img[@alt='Apple Pay']")
//	public WebElement iconApplePay;

//	@FindBy(xpath = "//img[@alt='Discover']")
//	public WebElement iconDiscover;

//	@FindBy(xpath = "//img[@alt='American Express']")
//	public WebElement iconAmericanExpress;
	// End KER-2946 CR-SK

	// Start KER-2871 CR-SK
	@FindBy(xpath = "(//*[@data-auid='findAStore'])[1]//span[2]")//*********find a store
	public WebElement txtStoreLocator;
	// End KER-2871 CR-SK

	// Start KER-2940 CR-AKK
	@FindBy(xpath = "//li[@data-auid='miniCart']/div/button")// global header //VSN updated on 07-10-19
	public WebElement iconMiniCart;
	// End KER-2940 CR-AKK

	// Start KER-2942 CR-AKK
//	@FindBy(xpath = "//*[contains(text(),'Promocode')]/../div[2]")Duplicate Done 2942
//	public WebElement txtPromoCodePrice;
	// End KER-2942 CR-AKK

	// Start KER-4231 CR-SK
	@FindBy(xpath = "//span[@class='mini-cart-count']")//golbal header
	public WebElement miniCartCount;
	// End KER-4231 CR-SK

	// Start KER-2926 CR-MS
//	@FindBy(xpath = "//*[text()='YOUR CART IS EMPTY']")//duplicate
//	public WebElement cartEmptyMsg;//keep it

	// End KER-2926 CR-MS
	@FindBy(xpath = "//*[@data-auid='findAStore']/a/span[1]")
	public WebElement selectStoreMiniBalloon;
	@FindBy(xpath = "//*[contains(text(),'Included')]")
	public WebElement cart_IncludedTxt;
	
	@FindBy(xpath = "//div[@data-auid='facetdrawerundefined']/button")
    public List<WebElement> selectStorePopUpStoreList;

    @FindBy(xpath = "//*[contains(text(),'Item Not Available')]")
    public WebElement selectStoreItemNotAvailable;

	// CR-RKA 10-Oct
	@FindBy(xpath = "//*[@data-auid='ContinueShopping']")
	public WebElement continueShoppingItemSuccessufllyAddedPopUP;

	/***************************** END XPAHTS ********************************/

	/***************************** START METHODS 
	 * @throws InterruptedException ********************************/
	
	public void navigateAndDeleteAllProductsInCart() throws InterruptedException {
		Thread.sleep(Constants.thread_high);
		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(globalElementHeader.iconcart_m));

		} else {
			assertTrue(clickOnButton(globalElementHeader.iconcart));

		}
		emptyCart();
	
	}
	public void compareCartEmptyTxt(String exceptedTxt) throws Exception {
		String actualCartTxt = getText(cartEmptyTxt);
		logger.debug("actualCartTxt:: " + actualCartTxt);
		Assert.assertEquals(actualCartTxt, exceptedTxt);
	}

	public void compareContinueShoppingLinkTxt(String exceptedTxt) throws Exception {
		String actualCartTxt = getText(ATC_ContinueShopping);
		logger.debug("continueShoppingBtnText:: " + actualCartTxt);
		Assert.assertEquals(actualCartTxt, exceptedTxt);
	}

	// Start KER-2911 CR-DPK
	public void verifyShippingPriceOnCartPage() 
	{
		assertTrue(isDisplayed(txtSubtotalCart));
		assertTrue(isDisplayed(txtEstimatedShippingCart));
		assertTrue(isDisplayed(txtEstimatedTaxesCart));
		assertTrue(isDisplayed(txtTotal));//txtTotalCart
	}
	// End KER-2911 CR-DPK

	// Start KER-2940 CR-DPK
	@SuppressWarnings("unlikely-arg-type")
	public void verifySubtotal() {
		int priceItem1 = 0;
		int priceItem2 = 0;
		try {
			if (txtActualPrice.isDisplayed()) {
				String itemPrice1 = txtActualPrice.getText();
				String price1 = "";

				for (int i = 0; i < itemPrice1.length(); i++) {
					char priceCheck = itemPrice1.charAt(i);
					if (Character.isDigit(priceCheck)) {
						price1 += priceCheck;
					}
					priceItem1 = Integer.parseInt(price1);
					System.out.println(priceItem1);

				}

			} else {
				String itemPrice1 = txtPromoPrice.getText();
				String price1 = "";

				for (int i = 0; i < itemPrice1.length(); i++) {
					char priceCheck = itemPrice1.charAt(i);
					if (Character.isDigit(priceCheck)) {
						price1 += priceCheck;
					}
					priceItem2 = Integer.parseInt(price1);
					System.out.println(priceItem1);

				}

			}
		} catch (NumberFormatException ex) {

		}

		try {
			String itemPrice2 = txtActualPrice2.getText();
			String price2 = "";

			for (int i = 0; i < itemPrice2.length(); i++) {
				char priceCheck1 = itemPrice2.charAt(i);
				if (Character.isDigit(priceCheck1)) {
					price2 += priceCheck1;
				}
				priceItem2 = Integer.parseInt(price2);
				System.out.println(priceItem2);
			}
		} catch (NumberFormatException ex) {

		}

		int Subtotal = priceItem1 + priceItem2;

		if (txtSubtotalCart.equals("$" + Subtotal)) {
			System.out.println("Pass");
			logger.info("Itemized subtotal for each item in cart is displayed properly");
		} else {
			System.out.println("Fail");
			logger.info("Itemized subtotal for each item in cart is not displayed properly");
		}

	}
	// End KER-2940 CR-DPK

	// Start KER-2927 CR-SK
	public float getEstimatedTaxOnCartPage() throws InterruptedException {
		Thread.sleep(Constants.thread_medium);
		String taxDisplayed = getText(txtEstimatedTaxesCart);// txtEstimatedTax
		taxDisplayed = taxDisplayed.replace("$", "");
		return Float.parseFloat(taxDisplayed);
	}

	public float getTotaAmountOnCartPage() {
		String totalAmountDisplayed = getText(txtTotal);
		totalAmountDisplayed = totalAmountDisplayed.replace("$", "");
		return Float.parseFloat(totalAmountDisplayed);
	}

	public void increaseQuantityOnCartPage(int differencValue) {
		assertTrue(isDisplayed(input_Quantity));//txtQuantity
		String quantityDisplayed = input_Quantity.getAttribute("value").toString();
		int increasedQuantity = Integer.parseInt(quantityDisplayed) + differencValue;
		setInputText(input_Quantity, Integer.toString(increasedQuantity));
		tabInputBox(input_Quantity);
		getDriver().navigate().refresh();
		waitForElement(input_Quantity);
	}

	public void selectShipToMe() {
		clickOnRadioButton(rbShipToMe);
	}

	public void selectInStorPickUp() {
		clickOnRadioButton(rbInStorePickUp);
	}

	public boolean clickOnCheckoutButton() {
		if("mobile".equalsIgnoreCase(testtype))
			return clickOnButton(btn_checkOut_OrderSummary);
		else
			return clickOnButton(btnCartCheckout);// btnCheckout
 
	}
	// End KER-2927 CR-SK

	// start KER-2939 CR-RK
	public void verifyDetailsOnCartPage() throws InterruptedException {
		assertTrue(isDisplayed(r2SanityPo.AS_productImage));
		assertTrue(isDisplayed(lnkProducttext));//img_ProductInCart 
		assertTrue(isDisplayed(txtColor));
		assertTrue(isDisplayed(txtSize));
		assertTrue(isDisplayed(r2SanityPo.AS_inputQty));
		assertTrue(isDisplayed(r2SanityPo.AS_txtQuantityPrice));
		assertTrue(isDisplayed(r2SanityPo.AS_btnRemoveFromCart));
		assertTrue(isDisplayed(btn_AddToWishList));
		assertTrue(isDisplayed(r2SanityPo.AS_txtSubtotalCart));
		assertTrue(isDisplayed(r2SanityPo.AS_txtEstimatedShippingCart));
		assertTrue(isDisplayed(r2SanityPo.AS_txtEstimatedTaxesCart));
		assertTrue(isDisplayed(r2SanityPo.AS_txtTotalCart));
	}
	// End KER-2939 CR-RK

	// Start KER-2939 CR-AKK
	public void selectStore(String zipCode) throws InterruptedException {
		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(lnkFindAStore_M));

		} else {
			assertTrue(clickOnButton(lnkFindAStore));
		}
		waitForElement(txtZipCode);
		txtZipCode.clear();
		setInputText(txtZipCode, zipCode);
		assertTrue(clickOnButton(btnZipCode));
		Thread.sleep(Constants.thread_high);
		for (WebElement selectStorefromList : selectStorePopUpStoreList) {
			assertTrue(clickOnButton(selectStorefromList));
			if (isDisplayed(selectStoreItemNotAvailable)) {
				assertTrue(clickOnButton(selectStorefromList));
				continue;
			} else {
				break;
			}
		}
		if (isDisplayed(makeMyStore_btn)) {
			assertTrue(clickOnButton(makeMyStore_btn));
		}
		assertTrue(clickOnButton(r1FindStorePO.ovly_btnCloseCross));
	}

	// End KER-2939 CR-AKK

	// Start KER-4231 CR-GK 5-Oct
	public void selectStoreWithZipAndStoreName(String zipCode, String storeName) throws InterruptedException {
		
		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(lnkFindAStore_M));
		} else {
			assertTrue(clickOnButton(selectStoreMiniBalloon));
		}
		waitForElement(txtZipCode);
		txtZipCode.clear();
		setInputText(txtZipCode, zipCode);
		assertTrue(clickOnButton(btnZipCode));
		Thread.sleep(3000);
		assertTrue(clickOnButton(driver.findElement(By.xpath("//*[text()='" + storeName + "']"))));
		if (isDisplayed(makeMyStore_btn)) {
			assertTrue(clickOnButton(makeMyStore_btn));
		}
		assertTrue(clickOnButton(btnFindStoreClose));
	}
	

	//This method selects the store and don't closes the findAStore Modal
	public void selectStoreWithModalOpen(String zipCode, String storeName) throws InterruptedException {
		if ("mobile".equalsIgnoreCase(testtype)) {
			assertTrue(clickOnButton(lnkFindAStore_M));
		} else {
			assertTrue(clickOnButton(selectStoreMiniBalloon));
		}
		waitForElement(txtZipCode);
		txtZipCode.clear();
		setInputText(txtZipCode, zipCode);
		assertTrue(clickOnButton(btnZipCode));
		Thread.sleep(3000);
		assertTrue(clickOnButton(driver.findElement(By.xpath("//*[text()='" + storeName + "']"))));
		if (isDisplayed(makeMyStore_btn)) {
			assertTrue(clickOnButton(makeMyStore_btn));
		}
		
	}
	public void emptyCart() throws InterruptedException {
		
		waitForPageLoad(driver);
		Thread.sleep(Constants.thread_low);
		if(isDisplayed(cartEmptyTxt)) {
			System.out.println("&&&&&&&&&&&&&&&&&&&& CART IS EMPTY  &&&&&&&&&&&&&&");
	}
		else {
			while(isDisplayed(btnRemoveCart)) {
				clickOnButton(btnRemoveCart);
				Thread.sleep(Constants.thread_highest);
				Thread.sleep(Constants.thread_medium);
				if(isDisplayed(cartEmptyTxt)) {
					break;
				}
			}
		}
		}
	/***************************** END METHODS *********************************/
	
	
	
	//&&&&&&&&&&&&&&&&&&&&&&&********@CR-RKA******&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
	//Your Cart (Start)
	//KER-3143 auid is changed @CR-MS
	@FindBy(xpath = "//*[@data-auid='crt_lnkCntShopping'] | //*[@data-auid='btncontinueShopping']")
	public WebElement ATC_ContinueShopping;
	
	@FindBy(xpath="//*[.='YOUR CART']")public WebElement txt_YourCart;
	@FindBy(xpath="//*[@data-auid='crt_btnCheckoutTop']/preceding::*[2]")public WebElement txt_items;
	@FindBy(xpath="//*[@data-auid='crt_btnCheckoutTop']/preceding::*[1]")public WebElement txt_totalYourCart;
	@FindBy(xpath="(//*[@data-auid='btnCheckout'])[3]")public WebElement btnCartCheckout;
	
	
	//Your Cart End
	
	// Your Cart item details  (Start) 
	
	@FindBy(xpath="(//*[contains(@data-auid,'crt_imgCard_')])[1]")public WebElement img_ProductInCart;
	@FindBy(xpath="(//*[contains(@data-auid,'crt_lnkProdName_')])[1]")public WebElement lnkProducttext;//lnkProducttextlink_ProductCartName
	@FindBy(xpath="(//*[text()='Color'])[1]/following::*[1]")public WebElement txtPrdColor;// txt_color input in color
	@FindBy(xpath="(//*[text()='Size'])[1]/following::*[1]")public WebElement txtPrdSize;//txtPrdSize  txt_size input in size
	@FindBy(xpath="//span[text()='Ship To Me']")public WebElement rbShipToMe;
	@FindBy(xpath="//span[text()='Store Pickup – FREE']")public WebElement rbInStorePickUp; //SID Modified 12-Jan
	@FindBy(xpath="//*[text()='Ship To Store'] | //*[text()='Special Order Ships to Store']") public WebElement ShipToStore_radioBtn;
	@FindBy(xpath="//input[@data-auid='crt_inputQty']")public WebElement input_Quantity;
	@FindBy(xpath="(//*[@data-auid='crt_qtyField'])[1]")public WebElement txt_Quantity;
	@FindBy(xpath="(//*[@data-auid='tooltipcrt_rdTooltip_0'])[1]") public WebElement iconTolltip;// toolTip
	@FindBy(xpath="(//*[@data-auid='PDP_AddToWishList'])[1] | (//*[contains(@data-auid,'crt_btnWlist')])[1]")public WebElement btn_AddToWishList;//btnWlist
	@FindBy(xpath="(//*[contains(@data-auid,'crt_btnRmvFromCart_')])[1]")public WebElement btnRemoveCart;//btnRemoveCart txt_RemoveFromCart
	@FindBy(xpath="//*[contains(@data-auid,'crt_btnRmvFromCart_')]")public List<WebElement> removeCart_lst_btn;
	@FindBy(xpath="//*[contains(@data-auid,'crt_btnRmvCartOos')]")public List<WebElement> removeCartforOOSProducts_lst_btn;
	
	
	@FindBy(xpath="(//*[contains(@data-auid,'crt_qtyField')])[1]/../following-sibling::*/*[1]")public WebElement txt_CartItemAmount;//txt_YourCartAmount
	@FindBy(xpath = "//span[text()='Color']")public WebElement txtColor;
	@FindBy(xpath = "//span[contains(text(),'Size')]")public WebElement txtSize;
	@FindBy(xpath = "(//*[contains(text(),'Est. Arrival')])")public WebElement txtEstArrival;
	@FindBy(xpath ="//*[contains(text(), \"We're sorry!\")]")public WebElement ErrorMsgLimitedStack;  // SID Modified 12-Jan
	@FindBy(xpath ="//*[@data-auid='miniCart']//button")public WebElement clickCartIconFromGlobalHeader;  // SID 12-Jan
	@FindBy(xpath ="//*[text()='Not available for In-Store pickup']") public WebElement Bopis_Rbn;
		
//	@FindBy(xpath = "//*[text()='$']/following::div")//duplicate Done
//	public WebElement txtActualPrice;
	//Your Cart item details Finish
	//****************************************************************************************************************
	// Order Summary (Start)
	
	@FindBy(xpath="//*[contains(text(),'ORDER SUMMARY')]")public WebElement txt_OrderSummary;
	@FindBy(xpath="//*[@data-auid='crt_btnAddPromo']")public WebElement btn_Plus_AddPromoCode;
	@FindBy(xpath="//*[@data-auid='crt_btnHidePromo']")public WebElement btn_Minus_HidePromo;
	@FindBy(xpath="//*[@data-auid='crt_inputPromo']")public WebElement input_EnterPromoCode;
	@FindBy(xpath="//*[@data-auid='btncrt_btnPromoSbmt']")public WebElement btn_Submit_PromoCode;
	@FindBy(xpath="(//*[@data-auid='btnc_btnCheckout'])[3] | (//*[@data-auid='btnCheckout'])[3]")public WebElement btn_checkOut_OrderSummary;
	@FindBy(xpath="//*[text()='Subtotal']/following-sibling::*")public WebElement txtSubtotalCart;
	@FindBy(xpath="//div[text()='Estimated Shipping']/../*[2]")public WebElement txtEstimatedShippingCart;//CR-RK Oct4 KER-2911
	@FindBy(xpath="//*[text()='Estimated Shipping']/following-sibling::*")public WebElement txt_EstimatedShipping;
	@FindBy(xpath="//*[text()='Change ZIP Code']")public WebElement  lnkChangeZipCode;
	@FindBy(xpath = "//div[text()='Estimated Taxes']/../div[2]")public WebElement txtEstimatedTaxesCart;
	@FindBy(xpath = "//div[text()='Total']/../div[2]")public WebElement txtTotal;
	//KER-3166 (06-Oct) | Discounts text is changed to Discount Sreekanth
	@FindBy(xpath="//div[text()='Discount']")public WebElement discount_Txt;
	@FindBy(xpath = "//button[@data-auid='crt_btnRmPromo_0']")public WebElement RemovePromocode_Btn; 
	@FindBy(xpath = "(//*[@data-auid='crt_qtyField'])[1]/following::*[18]")
	public WebElement FirstQuantityPrice_Txt;
	
	@FindBy(xpath = "(//*[@data-auid='crt_qtyField'])[2]/following::*[18]")
	public WebElement SecondQuantityPrice_Txt;
	// Order Summary Finish
	//****************************************************************************************************************
	//Calculate Shipping (Start)
	
	@FindBy(xpath="//*[@data-auid='crt_inputZip']")public WebElement inputZipCode;
	@FindBy(xpath="//*[@data-auid='btncrt_btnCalcShippingModal']")public WebElement btnCartSubmit;
	@FindBy(xpath="//*[.='CALCULATE SHIPPING']")public WebElement txt_CalculateShipping;
	@FindBy(xpath="//*[.='Enter your ZIP code for shipping cost']")public WebElement txt_EnterYourZIPcodeforShippingCost;
	@FindBy(xpath="//*[@data-auid='crt_inputZip']/preceding::*[4]")public WebElement btn_x;
	
	//Calculate Shipping Finish
	//*****************************************************************************************************************
	//Shop With Confidance (Start)
	
	@FindBy(xpath="//*[.='SHOP WITH CONFIDENCE']") public WebElement txt_ShopWithConfidance;
	
	//Shop With Confidance Finish
	//**************************************************************************************************************
	//Free In Store Return (Start)
	
	@FindBy(xpath="//*[.='FREE IN-STORE RETURNS']")public WebElement txt_FreeInStoreReturns;
	@FindBy(xpath="//*[@data-auid='crt_lnkLegal_0']")public WebElement lnkShippingPolicy; //lnkShippingPolicy link_ShippingPolicy
	@FindBy(xpath="//*[@data-auid='crt_lnkLegal_1']")public WebElement lnkReturnPolicy;//link_ReturnPolicy
	
	//Free In Store Return Finish
	//******************************************************************************************************************
	//We Accept (Start)
    
	@FindBy(xpath="(//*[.='WE ACCEPT'])[2]")public WebElement txt_WeAccept;
	@FindBy(xpath="(//*[.='WE ACCEPT'])[2]/following-sibling::*/*[1]") public WebElement iconVisa;
	@FindBy(xpath="(//*[.='WE ACCEPT'])[2]/following-sibling::*/*[2]") public WebElement iconMasterCard;
	@FindBy(xpath="(//*[.='WE ACCEPT'])[2]/following-sibling::*/*[3]") public WebElement iconPaypal;
	//@FindBy(xpath="(//*[.='WE ACCEPT'])[2]/following-sibling::*/*[4]") public WebElement iconGooglePay;//De-scoped KER-2946 CR-RK
	// De-scoped KER-2946 CR-MS
	//@FindBy(xpath="(//*[.='WE ACCEPT'])[2]/following-sibling::*/*[4]") public WebElement iconApplePay;
	@FindBy(xpath="(//*[.='WE ACCEPT'])[2]/following-sibling::*/*[4]") public WebElement iconAmericanExpress;
	@FindBy(xpath="(//*[.='WE ACCEPT'])[2]/following-sibling::*/*[5]") public WebElement iconDiscover;
	
	
	//We Accept Finish
	//************************************************************************************************************************

	//footer (Start)
	@FindBy(xpath = "(//*[text()='Return Policy'])[2]")public WebElement ReturnPolicy_txt;
	//footer (end)
	//****************************************************************************************************************
	//Promo Code (Start)
	@FindBy(xpath = "//div[text()='Promocode']/../div[2]")public WebElement txtPromoPrice;
	@FindBy(xpath = "//*[contains(text(),'Please enter a valid promotion code')]")public WebElement txtInvalidPromo;
	@FindBy(xpath = "//div[text()='Promocode'] | //*[text()='Enter Promo Code']")public WebElement txtPromocodeCart;
	
	
	
	//Promo Code end
//********************************************************************************************************************
	//When cart is empty (Start)
	
	@FindBy(xpath = "//*[contains(text(),'YOUR CART IS EMPTY')]")public WebElement cartEmptyTxt;
	@FindBy(xpath = "//button[@data-auid='btncrt_btnSignIn']")	public WebElement btnCrtSignIn;
	@FindBy(xpath="//button[@data-auid='btncrt_btnCntinueShop']")public WebElement continueShopping_btn;
	@FindBy(xpath="//*[@data-auid='cart_continue_shopping_link'] | //*[@data-auid='crt_lnkCntShopping']")public WebElement continueShoppingForEmptyCart_link;   //SID modified 30-November
	@FindBy(xpath="//*[text()='Email Address']/following::*[3]")public WebElement WelcomeBackEmailAddress_Input;
	@FindBy(xpath="//*[text()='Password']/following::*[2]")public WebElement WelcomeBackPassword_Input;
	@FindBy(xpath="//*[@data-auid='btnemail-signin-button']")public WebElement WelcomeBackSignIN_Btn;
	//When cart is empty(end)
	//*********************************************************
	//After clicking Shiping Policy(Start)
	
	@FindBy(xpath = "(//*[text()='Shipping Charges'])[2]")public WebElement txtShippingCharges;
	
	//After clicking Shiping Policy(End)
	//&&&&&&&&&&&&&&&&&&&&&&&**************END***********************&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
	
	
	//&&&&&&&&&&&&&&&&&&&&&&&********@CR-RKA**MOBILE****&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
	
	
	
		@FindBy(xpath="//*[@data-auid='crt_inputQty_m']")public WebElement input_Quantity_M;
		@FindBy(xpath="(//*[@data-auid='btnc_btnCheckout'])[2]")public WebElement checkOut_M_Btn;
		
	//&&&&&&&&&&&&&&&&&&&&&&&********@CR-RKA******&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		
	
		@FindBy(xpath = "//*[text()='X']")//CR-DPK 12-oct
		public WebElement closeOutOffStockItem;
		
		@FindBy(xpath = "//*[@data-auid='btncrt_editInCartbtn']")
		public WebElement editInCart_btn;
		
		@FindBy(xpath = "//*[@data-auid='btncrt_editInCartbtn']/parent::div/parent::div/h4")
		public WebElement outOfStockModal;  //SID 12-Jan
		
		@FindBy(xpath = "//*[@data-auid='btncrt_editInCartbtn']/parent::div/parent::div/parent::div/button")
		public WebElement outOfStockModalCloseButton;  //SID 12-Jan
		
		@FindBy(xpath = "//*[@data-component='cart']//*[contains(text(),'removed')]")
		public WebElement removedMessageCart;  //SID 27-Jan
		
		@FindBy(xpath = "//*[@data-component='cart']//*[contains(text(),'added')]")
		public WebElement moveToWishlistMessageCart;  //SID 27-Jan
		
		
		@FindBy(xpath = "//*[@data-component='cart']//*[contains(text(),'removed')]/*[2] | //*[@data-component='cart']//*[contains(text(),'added')]/*[2]")
		public WebElement removedproductUndo;  //SID 27-Jan
		
		
	
}
