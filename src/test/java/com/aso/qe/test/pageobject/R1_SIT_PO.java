package com.aso.qe.test.pageobject;

import static org.testng.Assert.assertTrue;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;

public class R1_SIT_PO extends CommonActionHelper{
	private static final Logger logger = Logger.getLogger(R1_SIT_PO.class);
	String timeStamp = new SimpleDateFormat("MM.dd.HH.mm.ss").format(new Date());  //Sid
	

	//***SID********************************************************//
	
	//My Account Page SID 22-August
	@FindBy(xpath="//a[@id='accountSummary']") public WebElement lnkAccountSummary;
	@FindBy(xpath="//a[@id='personalInformation']") public WebElement personalInformation;
	@FindBy(xpath="//a[@id='addressBook']") public WebElement addressBook;
	@FindBy(xpath="//a[@id='wishLists']") public WebElement wishLists;
	//Address Book
	@FindBy(xpath="//*[@id='addressBook']") public WebElement clickAddressBook;
	@FindBy(xpath="//button[@id='newAddressBtn']") public WebElement btnNewAddress;
	@FindBy(xpath="//*[@id='addAddressModalTitle']") public WebElement txtNewAddress;
	@FindBy(xpath = "//input[@name='firstName']")	public WebElement txtFirstName;
	@FindBy(xpath = "//input[@name='lastName']")	public WebElement txtLastName;
	@FindBy(xpath = "//input[@name='phone1']")	public WebElement txtphonenumber;
	@FindBy(xpath = "//input[@name='address1']")	public WebElement txtAddress1;
	@FindBy(xpath = "//input[@name='address2']")	public WebElement txtAddress2;
	@FindBy(xpath = "//input[@name='zipCode']")	public WebElement txtZipCode;
		@FindBy(xpath = "//input[@name='city']")	public WebElement txtCity;
		@FindBy(xpath = "//*[@name='state']")	public WebElement txtState;
	
	
	//SHOP COLLECTION
	@FindBy(xpath="//*[@data-auid='btnbtn1']")public WebElement ShopCollectionCTA;
	
	
	//@FindBy(xpath="(//*[@id='productCardListing']/*/a)[3]") public WebElement clickProuctCard;
	@FindBy(xpath="//*[@id='productCardListing']/*[1]") public WebElement clickProuctCard; //Updated by HP 03_31_2019
	
	
	@FindBy(xpath="//h3[text()='Order Summary']") public WebElement ordersummary;
	@FindBy(xpath="//h2[contains(text(),'Shipping Address')]") public WebElement ReviewShippingaddress;
	@FindBy(xpath="//h2[contains(text(),'Shipping Method')]") public WebElement ReviewShippingmethod;
	@FindBy(xpath="//h2[contains(text(),'Billing Address')]") public WebElement billingaddress;
	@FindBy(xpath="//h2[contains(text(),'Payment Method')]") public WebElement paymentmethod;
	@FindBy(xpath="//button[@id='placeOrder']") public WebElement btnplaceordernow;
	
	@FindBy(xpath="(//*[@id='coSelectAddress']//*[@name='addressId']/parent::label)[1]") public WebElement shippingAddress; //SID 9-August-18
	@FindBy(xpath="//*[@id='rwdGuestShippingContinue_Btn']") public WebElement clickContinueShippingMethod;
	@FindBy(xpath="//h1[contains(text(),'Shipping Method')]") public WebElement Shippingmethod;
	@FindBy(xpath="//*[@id='continuePaymentButton']//*[text()='Continue To Payment']") public WebElement btncontinuepayment; //SID 9-August-18
	@FindBy(xpath="//*[@data-auid='PDP_IventoryMessage']") public WebElement inventoryMessage;
	
	@FindBy(xpath="(//*[@data-target='#deleteQuestionModal'])[1]") public WebElement btndeleteAddressBook;
	//SID 15-August
	@FindBy(xpath="//*[@id='continueChkPop']") public WebElement clickContinuebtn;
	@FindBy(xpath="//*[@id='avsModifyAddressLink']") public WebElement txtModifyAddress;
	
	@FindBy(xpath="//*[@id='coShipAddr'] | //*[@id='editAddressModalLink']") public WebElement address;
	@FindBy(xpath="(//button[@class='form-continue-btn btn z-btn-checkout btn-lg btn-block'])[1] |  (//*[@id='rwdGuestShippingContinue_Btn'])[1]") public WebElement btnContiuneToMethod;
	@FindBy(xpath="//h3[text()='Order Summary']") public WebElement txtordersummary;
	@FindBy(xpath="//h3/../div/ol/li/dl/dd[2]/a/div") public WebElement tltproduct;
	@FindBy(xpath="//abbr[text()='SKU:']/..") public WebElement txtskuid;
	@FindBy(xpath="//abbr[text()='Item:']/..") public WebElement txtitem;
	@FindBy(xpath="//a[text()='Academy Credit Card']") public static WebElement lnkacademycredit;
	@FindBy(xpath="//strong[text()='Limited time offer.']") public static WebElement txtLimitedoffer;
	
	@FindBy(xpath="//h2[contains(text(),'Can')]") public WebElement txtcantfindorder;
	@FindBy(xpath="//label[@for='orderNumberField']") public WebElement labelordernumber;
	@FindBy(xpath="//input[@id='orderNumberField']") public WebElement txtordernumber;
	@FindBy(xpath="//label[@for='shippingZipField']") public WebElement labelshippingzip;
	@FindBy(xpath="//input[@id='shippingZipField']") public WebElement txtshippingzip;
	@FindBy(xpath="//input[@id='submitOrderInfo']") public WebElement btnsubmitOrderInfo;

	@FindBy(xpath="(//div[@class='addressControls']/button[1])") public WebElement verifybtnedit;
	@FindBy(xpath="(//div[@class='addressControls']/following::button[1])[1]") public WebElement btnedit;
	
	@FindBy(xpath="(//button[contains(text(),'SAVE')])[1]") public WebElement btnsavebutton;
	@FindBy(xpath="(//button[contains(text(),'SAVE')])[2]") public WebElement btneditsavebutton;
	@FindBy(xpath="//h2[contains(text(),'Address Verification')]") public WebElement txtAddressverification;
	@FindBy(xpath="//button[@id='continueMyAccAVS']") public WebElement btncontinue;
	@FindBy(xpath="//p[@id='addConfirmMessage']") public WebElement txtAddresssuccessmsg;
	@FindBy(xpath="//p[@id='editConfirmMessage']") public WebElement txteditAddresssuccessmsg;
	@FindBy(xpath="//button[@id='footerAddConfirmationClose']") public WebElement btnok;
	@FindBy(xpath="//button[@id='footerEditConfirmationClose']") public WebElement btneditok;
	@FindBy(xpath="//p[@id='deleteQuestionMessage']") public WebElement txtDeletesmsg;
	@FindBy(xpath="//button[@id='confirmDelete']") public WebElement btnyes;
	@FindBy(xpath="//div[@data-auid='PDP_AddToWishList']") public WebElement lnkaddtowishlist;
	@FindBy(xpath="//button[@id='newWishListBtn'] | //*[@data-auid='btnmodal_open_btn'] | //*[text()='Create a New Wish List'] | //*[text()='Create a List']") public  WebElement btnNewWishlist;  //SID 19-September
	@FindBy(xpath="//h2[@id='createWishListModalTitle']") public  WebElement tltCreatewishlist;
	@FindBy(xpath="//input[@id='createWishListInputField'] | //*[@data-auid='wish_list_name_input'] | //*[@data-auid='Wish_list_name_input']") public  WebElement txtListname;  //SID 19-September
	@FindBy(xpath="//button[@id='add_cancel']") public  WebElement btncancel;
	@FindBy(xpath="//input[@id='add_save'] | //*[@data-auid='btnsubmit_btn'] | //*[@data-auid='btncreate_wish_list_btn']") public  WebElement btnsave;  //SID 19-September
	@FindBy(xpath="//select[@id='wishListSelect']//*[@selected='selected']") public  WebElement txtwishlistselect; //sid 14-Aug
	@FindBy(xpath="//*[@id='renamewishListModalTitle']") public  WebElement renameWishListModal;
	
	@FindBy(xpath="//button[@id='renameWishListBtn']") public  WebElement btnrenamewishlist;
	@FindBy(xpath="//input[@id='renameWishListInputField']") public  WebElement txtrenamewishlistselect;
	@FindBy(xpath="//input[@id='edit_save']") public  WebElement btnrenamesave;
	@FindBy(xpath="//button[@id='deleteWishListBtn']") public  WebElement btndeletewishlist;
	@FindBy(xpath="//h2[@id='deletewishListModalTitle']") public  WebElement tltDeletewishlist;
	@FindBy(xpath="//input[@id='delete_save']") public  WebElement btndelete;
	
	@FindBy(xpath="//button[@id='delete_cancel']") public  WebElement btndeletecancel;
	@FindBy(xpath="//div[text()='Create a New Wish List']/../../..//tr[2]/td/input | //div[text()='Create a New Wish List']/../input") public  WebElement txtcreatenewwishlist;
	@FindBy(xpath="//button[@data-auid='btnwishListPopover_createList'] | //button[@data-auid='btnwishListPopover_createList_m'] ") public  WebElement btncreatenewwishlist;
	@FindBy(xpath="//div[contains(text(),'Choose your list')]/following::ul/li") public  WebElement txtcreatedwishlist;
	@FindBy(xpath="//*[@id=\"orginalAddrChecked\"]/div/label/span[2]") public static WebElement txtAddressVerification;
	@FindBy(xpath="//*[@id='continuePaymentButton'] | //*[text()='Continue To Payment'] | //*[@id='continueChkPop']") public WebElement btnContinueCheckout ;
	
	@FindBy(xpath="//a[@data-auid='deals category Women's Clothing']") public  WebElement btnWomensclothingDeals;
	@FindBy(xpath="//a[@data-auid='deals category Clothing']") public  WebElement btnClothingDeals;
	@FindBy(xpath="//a[@data-auid='deals category Boys' Clothing']") public  WebElement btnBoyslothingDeals;
//	@FindBy(xpath="//a[@data-auid='level2Category-Daily Deals']") public  WebElement btnDailyDeals;
	@FindBy(xpath="//*[@data-auid='level1Category-DEALS']//ul/li[@idx='0']") public  WebElement btnDailyDeals;//SID 14 -August
	
	@FindBy(xpath="//a[@data-auid='level2Category-Daily Deals_m']") public  WebElement btnDailyDeals_m;
	
//	@FindBy(xpath="(//p[@class='m-0 pl-1'])[1]") public  WebElement lnkProductDeals;
	@FindBy(xpath="//*[contains(@data-auid,'level')]/parent::li//ul/li[1]") public  WebElement lnkProductDeals;//SID 14 -August
	@FindBy(xpath="(//*[contains(@data-auid,'level3Category-')])[1]") public  WebElement lnkProductDeals_m;
	
	@FindBy(xpath="//h2[@id='slModalTitle']//ancestor::div[@class='modal-content']") 
	public WebElement ovly_FindStore;

	@FindBy(xpath="//*[@id='searchText']") public WebElement ovly_searchTextBox;
	@FindBy(xpath="//*[@id='slModalCloses']") public WebElement ovly_btnCloseCross;
	@FindBy(xpath="//*[@id='loadStores']") public WebElement ovly_btnGO;

	@FindBy(xpath="(//button[@class='z-btn z-btn-blue make-my-store'])[2]") public WebElement ovly_btnMakeMyStore_1;

	@FindBy(xpath="(//button[@class='z-btn z-btn-blue make-my-store']//ancestor::ul//ul/li[@class='store-name-container'])[2]") public WebElement ovly_secStore ;
	
	@FindBy(xpath="//*[@data-auid='btncheckout'] | //*[@id='checkoutGuestButton']") public WebElement btncheckoutguest;  //SID 20-August
	@FindBy(xpath=" //i[@class='paypal-button']") public WebElement btnpaypalguest;
	@FindBy(xpath="//*[@id='checkoutSignInToggle']") public WebElement btnsigninguest;
	
	@FindBy(xpath = "(//input[@name='phone1'])[3]")	public WebElement txteditphonenumber;
		@FindBy(xpath = "(//input[@name='phone1'])[2]")	public WebElement txtclearphonenumber;
		
	
	@FindBy(xpath = "//input[@name='logonId']")	public WebElement txtEmail;	
	@FindBy(xpath="//h1[text()='Welcome Back!'] | //*[text()='SIGN IN']") public WebElement txtwelcomeback;
	@FindBy(xpath="//*[text()='Forgot your password?'] | //*[text()='Forgot your password ?'] ") public WebElement lnkforgotpwd;  //SID 19-September
	@FindBy(xpath="//*[contains(text(),'Don')]") public WebElement txtdonthaveanaccount;
	@FindBy(xpath="//a[text()='Sign Up']") public WebElement txtdonthaveanaccounttxtdonthaveanaccount;
	
	
	
	public void verifySigninpage() throws Exception
	{
		assertTrue(isDisplayed(txtwelcomeback));
		assertTrue(isDisplayed(lnkforgotpwd));
		assertTrue(isDisplayed(txtdonthaveanaccount));
	}
	
	public void verifyShippingAddressPage() throws Exception
	{
		if("mobile".equalsIgnoreCase(testtype)){
			waitForElement(address);
			assertTrue(isDisplayed(address));
			logger.debug("Shipping Address is displayed");
		}else {
			waitForElement(address);
			assertTrue(isDisplayed(address));
			logger.debug("Shipping Address is displayed");
		}
		
		
	}
	
	
	
	public void clickAcademycreditLink() throws Exception {

		assertTrue(clickOnButton(lnkacademycredit));

	}
	
	public void verifyTheAcademyCreditPage() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(isDisplayed(txtLimitedoffer));
			logger.debug("Description is displayed");
		}else {
			
			assertTrue(isDisplayed(txtLimitedoffer));
			logger.debug("Description is displayed");
		}
	}
	
	public void enterListName() throws Exception {
		setInputText(txtListname, timeStamp);
	}
	
	public void renameWishListName() throws Exception {
		timeStamp = new SimpleDateFormat("MM.dd.HH.mm.ss").format(new Date());
		setInputText(txtrenamewishlistselect, timeStamp);
	}
		
	public void verifyOrdersummarydetails(){
		waitForElement(txtordersummary);
		assertTrue(isDisplayed(txtordersummary));
	}

	@FindBy(xpath="//button[@id='rh-icon-clicker']")
	public static WebElement  cartIcon;
	@FindBy(xpath="//h1[contains(text(),'Your Shopping Cart is Empty')]") WebElement cartEmptyTxt;
	@FindBy(xpath="//.[@class='cont-shop-link']") WebElement continueShoppingLink;
	@FindBy(xpath="//a[@id='checkoutGuestButton']")
	public WebElement btnBeginCheckout;

	public void clickOnCartIcon() throws Exception{

		if(isDisplayed(cartIcon)) {
			clickOnLink(cartIcon);

		}else
			logger.debug("can't displayed Cart Icon");	

	}

	public void compareCartEmptyTxt(String exceptedTxt) throws Exception{
		String actualCartTxt = getText(cartEmptyTxt);
		logger.debug("actualCartTxt:: "+actualCartTxt);
		Assert.assertEquals(actualCartTxt, exceptedTxt);
	}

	public void compareContinueShoppingLinkTxt(String exceptedTxt) throws Exception{
		String actualCartTxt = getText(continueShoppingLink);
		logger.debug("continueShoppingLinkText:: "+actualCartTxt);
		Assert.assertEquals(actualCartTxt, exceptedTxt);
	}
	
	public void verifyAddress(String exceptedAddTxt) throws Exception{
		String actualAddTxt = getText(txtAddressVerification);
		logger.debug("continueShoppingLinkText:: "+actualAddTxt);
		Assert.assertEquals(actualAddTxt,exceptedAddTxt );
	}

	
	
public void navigateToDealsandclickonproduct() throws Exception{
		
	if("mobile".equalsIgnoreCase(testtype)){
		assertTrue(clickOnButton(btnDailyDeals_m));
		assertTrue(clickOnButton(lnkProductDeals_m));
	}else{
		Actions hover = new Actions(getDriver());
		hover.moveToElement(btnDailyDeals).build().perform();
		assertTrue(clickOnButton(lnkProductDeals));
//		waitForElement(clickProuctCard);
//		assertTrue(clickOnButton(clickProuctCard));
	}
		
	}

	
public boolean validatingFindStoreDisplayed() {
	
	boolean isDisplayed = isDisplayed(ovly_FindStore);
	return isDisplayed;
	
}
		   

//Enter data
// click on Go
// search for link "Make my store"
// get the store name 
// Click on close 
		
public String selectAStore(String value){
	
	setInputText(ovly_searchTextBox,value);
	clickOnButton(ovly_btnGO);
	String selectedStoreTitle = getText(ovly_secStore);
	clickOnButton(ovly_btnMakeMyStore_1);
	return selectedStoreTitle;	
}


public void enterFirstName() throws Exception {

	setInputText(txtFirstName, "Test");
	
}

public void enterLastName() throws Exception {

	setInputText(txtLastName, "Academy");

}

public void enterAddress() throws Exception {

	setInputText(txtAddress1, "4735  Glen Falls Road");
	setInputText(txtAddress2, "Bensalem");

}
public void enterZipCode() throws Exception {
	txtZipCode.clear();
	setInputText(txtZipCode, "76001");
	
}

public void enterCity() throws Exception {

	setInputText(txtCity, "Bensalem");
	
}

public void SelectState() throws Exception {
	
	selectByText(txtState, "Pennsylvania");
	
}
public void enterPhoneNumber() throws Exception {

	setInputText(txtphonenumber, "9426012345");
	
}
public void enterEmail() throws Exception {
	setInputText(txtEmail, "aaa@gmail.com");

}

public void cleartext() throws Exception{
	txtclearphonenumber.clear();
	
}


	public int getCategoryTileCount(WebElement categoryTileCount){
		int tileCount = 0;
		try{
						String tileCategoryText = categoryTileCount.getText();
						logger.debug("tileCategoryText::"+tileCategoryText);
					 	if(tileCategoryText != null && tileCategoryText.contains("(")){
							int index = tileCategoryText.indexOf("(");
							String tileName = tileCategoryText.substring(index+1, tileCategoryText.length()-1);;
							logger.debug("Fianal Product Count:: "+tileName);
			
							tileCount = tileCount +  Integer.parseInt(tileName);
			}
		}catch (Exception e) {
			logger.error("getCategoryTileCount exception msg:: "+e.getMessage());
		}
		return tileCount;
	}
	
	

//	 SID 11-August-18
	public void verifyShippingaddress() throws InterruptedException {
		waitForElement(shippingAddress);
		isDisplayed(shippingAddress);
		Thread.sleep(Constants.thread_high);
		clickOnLink(shippingAddress);
	}

	// SID 11-August-18
	public void verifyShippingmethod() {
		waitForElement(Shippingmethod);
		isDisplayed(Shippingmethod);
	}
	
	//SID 15-August
	public boolean checkContinueButton(){
    	boolean flag=false;
    	if(isDisplayed(txtModifyAddress)){
    		flag=true;
    	}    	
    	return flag;
    }
	
	@FindBy(xpath="//h2[text()='Payment Method']") public WebElement payment;
	@FindBy(xpath="//*[@id='coPaymentMethodCC']") public WebElement rdbntcreditcard; //SID 11-August-18
	@FindBy(xpath="//input[@id='creditCardInput']") public WebElement cardnumber;
	@FindBy(xpath="//input[@id='expInput']") public WebElement expiration;
	@FindBy(xpath="//input[@id='CVVInput']") public WebElement cvv;
	@FindBy(xpath="//button[@id='rwdBillingContinue_Btn'] | //*[text()='Continue to Review']") public WebElement btncontinuetoreview;
	@FindBy(xpath="//*[text()='Continue to Review']") public WebElement continuetoreviewbtn;
	@FindBy(xpath="//font[text()='test1']") public WebElement txtusername;
	@FindBy(xpath="//input[@type='password']") public WebElement txtpwd;
	@FindBy(xpath="//input[@type='submit']") public WebElement btnsubmit;
	@FindBy(xpath="//*[@id='placeOrder']") public WebElement btnPlaceOrder;
	
	//SID 20-August
	@FindBy(xpath="//*[contains(text(),'We apologize')]") public WebElement noInventoryAtCheckout;
	@FindBy(xpath="//*[contains(text(),'Order Number: ')]") public WebElement orderPlaceSuccessMessage;
	
	
	
	
	
	public void verifyPaymentmethodPage() throws Exception{
		if("mobile".equalsIgnoreCase(testtype)){
			assertTrue(isDisplayed(payment));
			logger.debug("Payment Method is displayed");
		}else {
			
			assertTrue(isDisplayed(payment));
			logger.debug("Payment Method is displayed");
		}
	}
	
	//SID 11-August-18
		public void validatecreditcarddetails() throws Exception {
			assertTrue(isSelected(rdbntcreditcard));		
			setInputText(cardnumber, "4111  1111  1111  1111");
			setInputText(expiration, "1123");
			setInputText(cvv, "345");
		}
		
		public void verifyVisapwd() throws Exception {
			Thread.sleep(Constants.thread_low); 
			driver.switchTo().frame("Cardinal-CCA-IFrame");
			driver.switchTo().frame("authWindow");
			Thread.sleep(Constants.thread_medium);
			getDriver().findElement(By.xpath("//tr/td/img")).isDisplayed();
			setInputText(txtpwd, "1234");
			Thread.sleep(Constants.thread_medium);
			btnsubmit.click();
			Thread.sleep(Constants.thread_medium);
			getDriver().switchTo().defaultContent();
			Thread.sleep(Constants.thread_medium);
			
		}
		
		public void verifyOrdersummaryPage() throws Exception{
			if("mobile".equalsIgnoreCase(testtype)){
				assertTrue(isDisplayed(ordersummary));
				logger.debug("Order Summary is displayed");
			}else {
				
				assertTrue(isDisplayed(ordersummary));
				logger.debug("Order Summary is displayed");
			}
			
			}
		public void verifyReviewShippingaddress(){
			assertTrue(isDisplayed(ReviewShippingaddress));
		}
		
		public void verifyReviewShippingmethod(){
			assertTrue(isDisplayed(ReviewShippingmethod));
		}
		//SID 11-August-18
		public void verifyBillingaddress(){
			assertTrue(isDisplayed(billingaddress));
		}
		public void verifyPaymentmethod(){
			assertTrue(isDisplayed(paymentmethod));
		}
		
}
