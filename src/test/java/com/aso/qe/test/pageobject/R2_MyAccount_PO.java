package com.aso.qe.test.pageobject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aso.qe.framework.common.CommonActionHelper;

public class R2_MyAccount_PO extends CommonActionHelper {

	/**************** START LOCAL OBJETCS AND DECLARATIONS ***********************/

	/*************** END LOCAL OBJETCS AND DECLARATIONS ************************/

	/***************************** START XPAHTS **********************************/
	// Start KER-4249 CR-RK
	@FindBy(xpath = "//li[@data-auid='MyAccount']")
	public WebElement lnkSignIn;

	@FindBy(xpath = "//*[@data-auid='signUp_btn']") // CR-SK 28-Aug-2018
	public WebElement lnkSignUp;

	@FindBy(xpath = "//h4")
	public WebElement txtdescription;

	@FindBy(xpath = "//*[@data-auid='firstname_input']")
	public WebElement inputFirstName;// Updated KER-6941 CR-RK

	@FindBy(xpath = "//*[@data-auid='lastname_input']")
	public WebElement inputLastName;// Updated KER-6941 CR-RK

	@FindBy(xpath = "//*[@data-auid='email_input']")
	public WebElement inputEmailAddress;// Updated KER-6941 CR-RK

	@FindBy(xpath = "(//div[.='Create Password']/following-sibling::div/input)[1]") // modified by CR- SK//
	public WebElement inputCreatePassword;

	@FindBy(xpath = "//input[@type='checkbox']")
	public WebElement inputOptIn;

	@FindBy(xpath = "//button[@data-auid='btnsignup_btn']")
	public WebElement btnSignUp; // KER-6941 Updated 27-8-18

	@FindBy(xpath = "//*[@data-auid='redirect_signin_btn']")
	public WebElement lnkSignInNow;

	@FindBy(xpath = "//*[contains(text(), 'Already have an Account')]")
	public WebElement txtAlreadyHaveAnAccountSignInNow;

	@FindBy(xpath = "//div[text()='Password Must Contain Label']")
	public WebElement txtPasswordMustContainLabel;

	@FindBy(xpath = "//div[text()='8 Characters Min']")
	public WebElement txtCharactersMin;

	@FindBy(xpath = "//i[@class='academyicon icon-close pr-1']")
	public WebElement iconCross;

	@FindBy(xpath = "//div[text()='Password Strength']")
	public WebElement txtPasswordStrength;

	@FindBy(xpath = "//div[text()='Weak']")
	public WebElement txtWeak;

	@FindBy(xpath = "//div[text()='Strong']")
	public WebElement txtStrong;

	@FindBy(xpath = "//div[text()='']")
	public WebElement txtsuccessMessage;

	@FindBy(xpath = "//button[@data-auid='btnemail-signin-button']")
	public WebElement btnSignIn;

	@FindBy(xpath = "//input[@data-auid='emailid_input']")
	public WebElement inputEmailAddress_SignIn;// KER-4232 CR-SK 28-8-18

	@FindBy(xpath = "//*[text()='PROFILE']")
	public WebElement txtMyAccountDescription; // KER-4249 CR-RK -Updated

	// End KER-4249 CR-RK

	// Start KER-4232 CR-MS
	@FindBy(xpath = "//*[@data-auid='signInCta']")
	public WebElement signIn;

	@FindBy(xpath = "//*[@data-auid='btnemail-signin-button']")
	public WebElement logIn;

	@FindBy(xpath = "//*[@data-auid='email_input']")
	public WebElement emailAddress;// KER-4023 CR-RK 3-Sep

	@FindBy(xpath = "//*[@data-auid='password_input']")
	public WebElement password;

	@FindBy(xpath = "//*[.='ADDRESS BOOK']/a")
	public WebElement addressBook;

	@FindBy(xpath = "//*[@data-auid='btnadd_address_empty_btn']")
	public WebElement addNewAddressBtn; // CR-SK, Date 28 Aug 2018

	@FindBy(xpath = "//*[@data-auid='btnundefined']")
	public WebElement setAsDefaultBtn;// RKA 3 aug added

	@FindBy(xpath = "//*[@auid='First Name-input']") // CR-SK, 28 Aug 2018
	public WebElement adr_inpFirstName;

	@FindBy(xpath = "//*[@auid='Last Name-input']") // CR-SK, 28 Aug 2018
	public WebElement adr_inpLastName;

	@FindBy(xpath = "//*[@auid='Address-input']") // CR-SK, 28 Aug 2018
	public WebElement adr_inpAddress1;

	@FindBy(xpath = "//*[@auid='ZIP Code-input']") // CR-SK, 28 Aug 2018
	public WebElement adr_inpzipCode;

	@FindBy(xpath = "//*[@auid='City-input']") // 27 Aug
	public WebElement adr_inpCity;

	@FindBy(xpath = "//*[@auid='Phone Number-input']")
	public WebElement adr_inpPhoneNumber;

	@FindBy(xpath = "//*[.='State']//parent::div//following-sibling::div//button")
	public WebElement btnState; // CR-SK; 24 Aug
	// End KER-4232 CR-MS

	// Start KER-3392 CR-RK
	@FindBy(xpath = "//h5")
	public WebElement txtWelcomeDescription;

	@FindBy(xpath = "//span[text()='Email Address']")
	public WebElement txtEmailAddressDescription;

	@FindBy(xpath = "//span[text()='Password']")
	public WebElement txtPasswordDescription;

	@FindBy(xpath = "//a[contains(text(),'Forgot Your Password')]")
	public WebElement txtForgotYourPasswordDescription;

	@FindBy(xpath = "//button[text()='Forgot Your Password']")
	public WebElement lnkForgotYourPassword;

	@FindBy(xpath = "//*[contains(text(),'Create Account')]")
	public WebElement txtCreateAccountDescription;

	@FindBy(xpath = "//*[contains(text(),'Create Account')]")
	public WebElement lnkCreateAccount;
	// End KER-3392 CR-RK

	// Start KER-4011 CR-SK
	@FindBy(xpath = "//*[@data-auid='emailid_input']")
	public WebElement txtEmailAddress; // CR - SK, Date : 28 Aug

	@FindBy(xpath = "//*[text()='SIGN IN']")
	public WebElement headerSignIn;

	@FindBy(xpath = "//*[contains(text(), 'Hello')]")
	public WebElement txtHelloMessage;

	@FindBy(xpath = "//p[.='The combination of Email Address and Password is incorrect. Please try again.']")
	public WebElement txtIncorrectCombinationError;

	@FindBy(xpath = "//span[.='Please enter the Email Address in a valid format (ex. abc@xyz.com)']")
	public WebElement txtInvalidEmailAddressError;

	@FindBy(xpath = "//span[.='Please enter an Email address and/or Password']")
	public WebElement txtInvalidPasswordError;

	@FindBy(xpath = "//div[@class='css-yg98kr mb-half px-3']")
	public WebElement address;
	// End KER-4011 CR-SK

	// Start KER-4023 CR-SK
	@FindBy(xpath = "//h4[.='FORGOT PASSWORD']")
	public WebElement headerForgotYourPassword;

	@FindBy(xpath = "//*[@data-auid='btnsubmit_btn']") // CR-SK 28 Aug-18
	public WebElement btnSubmit;

	@FindBy(xpath = "//*[@data-auid='forgot_password_btn']")
	public WebElement btnForgotYourPassword;
	// End KER-4023 CR-SK

	// Start KER-4230 CR-SK
	@FindBy(xpath = "//*[text()='Profile']") // CR-SK 28 Aug-18 // KER-4230 CR-RK Sep 6
	public WebElement lnkProfile;

	@FindBy(xpath = "//*[@data-auid='myAccountCta']")
	public WebElement lnkMyAccount;

	@FindBy(xpath = "//div[.='New Password']/preceding-sibling::input[@type='password']")
	public WebElement txtCurrentPassword;

	@FindBy(xpath = "//div[.='New Password']/following-sibling::input[@type='password']")
	public WebElement txtNewPassword;

	@FindBy(xpath = "//*[@data-auid='btnundefined']")
	public WebElement btnUpdate;
	// End KER-4230 CR-SK

	// Start KER-4249 CR-SK 23-Aug
	@FindBy(xpath = "//button[.='Show']")
	public WebElement btnShow;

	@FindBy(xpath = "//button[.='Hide']")
	public WebElement btnHide;
	// End KER-4249 CR-SK 23-Aug

	// Start KER-3092
	@FindBy(xpath = "//*[.='PAYMENT']/a ")
	public WebElement lnkPayment; //// CR-SK 29 Aug-18

	@FindBy(xpath = "//div[.='You have no gift cards listed.']")
	public WebElement txtNoGiftCardListed; // 25 Aug

	@FindBy(xpath = "//*[@data-auid='btnaddNew-giftCard-btn' and text()= 'ADD NEW GIFT CARD']")
	public WebElement btnAddNewGiftCard; // 25 Aug

	@FindBy(xpath = "//*[.='Gift Card Number']/following-sibling::input") // CR-SK,28-Aug 2018
	public WebElement txtGiftCardNumber; // 25 Aug

	@FindBy(xpath = "//*[.='PIN']/following-sibling::input")
	public WebElement txtGifCardPin; // 25 Aug

	@FindBy(xpath = "(//*[text()='ADD NEW GIFT CARD'])[1]")
	public WebElement btnAddGiftCardPlusIcon;

	@FindBy(xpath = "//*[@data-auid='btnundefined']")
	public WebElement btnAddGiftCard; // 25 Aug

	@FindBy(xpath = "//*[@data-auid='btnundefined']/following::*[1]")
	public WebElement btnCancelGiftCard; // CR-SK, 29 Aug
	// End KER-3092

	// Start KER-3152 CR-AKK
	@FindBy(xpath = "//input[@type='text']")
	public WebElement inputEmail;

	@FindBy(xpath = "//input[@data-auid='password_input']")
	public WebElement inputPassword;

	@FindBy(xpath = "(//*[@data-auid='btnc_btnCheckout'])[3]")
	public WebElement checkoutBtn;

	@FindBy(xpath = "//*[@data-auid='checkout_shipping_methods_collapsed']")
	public WebElement shippingMethodSection;

	@FindBy(xpath = "//*[@data-auid='checkout_edit_shipping_address']")
	public WebElement checkoutEditShippingBtn;

	@FindBy(xpath = "//input[@type='text'][@name='companyName']")
	public WebElement inputAdditionalAddress;

	@FindBy(xpath = "//input[@name='address']")
	public WebElement inputAddress;

	@FindBy(xpath = "//*[@data-auid='btncheckout_goto_shipping_method_btn']")
	public WebElement goToShippingMethod;

	@FindBy(xpath = "//*[@data-auid='myAccountCta']")
	public WebElement myAccount;

	@FindBy(xpath = "//*[@data-auid='Wish List']")
	public WebElement wishList;

	@FindBy(xpath = "//*[@name='phoneNumber']")
	public WebElement inputPhone;

	@FindBy(xpath = "//*[@data-auid='checkout_shipping_address_add_more_details_link']")
	public WebElement addMoreDetailsAddress;

	@FindBy(xpath = "//input[@name='companyName']")
	public WebElement inputCompanyName;

	@FindBy(xpath = "//*[text()='address']") // CR-SK, 28 Aug
	public WebElement clickAddress;

	@FindBy(xpath = "(//div[@class='col-12 col-md-8'])[2]/div[1]/div[2]/div[1]")
	public WebElement checkAddress;

	@FindBy(xpath = "(//div[@class='col-12 col-md-8'])[2]/div[1]/div[2]/div[4]")
	public WebElement checkPhone;

	// End KER-3152 CR-AKK

	// Start KER-4249 CR-RK

	@FindBy(xpath = "//span[text()='You have successfully registered with Academy.com']")
	public WebElement txtMyAccountRegisteredDescription;

	@FindBy(xpath = "//*[@data-auid='btnbutton-3']")
	public WebElement btnConfirmRegistered;

	// End KER-4249 CR-RK

	// Start KER-4232 CR-RK
	@FindBy(xpath = "//*[@data-auid='btnsubmit_btn']")
	public WebElement btnAdd;

	// End KER-4232 CR-RK

	// Start KER-4232 CR-RK
	@FindBy(xpath = "(//*[text()='Edit'])[1]")
	public WebElement btnEditDefaultAddress;

	@FindBy(xpath = "//*[text()='DEFAULT']")
	public WebElement txtDefaultDescription;
	@FindBy(xpath = "//*[text()='Set as Default']")
	public WebElement btnSetAsDefault;

	@FindBy(xpath = "//span[.='Required']")
	public List<WebElement> txtAllAddress;

	@FindBy(xpath = "//*[text()='Remove']")
	public WebElement btnRemove;

	@FindBy(xpath = "//*[text()='Edit']")
	public WebElement btnEdit;

	@FindBy(xpath = "//*[@data-auid='address_page']")
	public WebElement txtAddressDescription;

	// End KER-4232 CR-RK
	// Start KER-6941 CR-RK
	@FindBy(xpath = "//input[@name='logonPassword']")
	public WebElement inputPasswordSignIn;

	@FindBy(xpath = "//input[@name='logonId']")
	public WebElement inputEmailAddressSignIn;
	// End KER-6941 CR-RK

	// Start Page validation CR-SK
	@FindBy(xpath = "//h5[text()='PROFILE']")
	public WebElement headerProfile;

	@FindBy(xpath = "//span[text() = 'PROFILE INFORMATION']")
	public WebElement headerProileInformation;

	@FindBy(xpath = "//*[@data-auid='edit_info_btn']/i")
	public WebElement lnkEdit;

	@FindBy(xpath = "//div[text()='Name']")
	public WebElement labelName;

	@FindBy(xpath = "//div[text()='Name']/following-sibling::div")
	public WebElement txtName;

	@FindBy(xpath = "//div[text()='Email']")
	public WebElement labelEmail;

	@FindBy(xpath = "//div[text()='Email']/following-sibling::div")
	public WebElement txtEmail;

	@FindBy(xpath = "//span[text()='PASSWORD']")
	public WebElement headerPassword;

	@FindBy(xpath = "//*[@data-auid = 'edit_password_btn']")
	public WebElement btnChangePassword;

	@FindBy(xpath = "//*[text() = 'Your Password']")
	public WebElement labelYourPassword;

	@FindBy(xpath = "//*[text() = 'NOTIFICATIONS']")
	public WebElement headerNotifications;

	@FindBy(xpath = "//*[text() = 'NOTIFICATIONS']/..//input")
	public WebElement chkReceiveNotifications;

	@FindBy(xpath = "//*[text()='EDIT PROFILE']")
	public WebElement headerEditProfile;

	@FindBy(xpath = "(//*[text()='First Name']/following-sibling::input)[1]")
	public WebElement txtFirstName;

	@FindBy(xpath = "(//*[text()='Last Name']/following-sibling::input)[1]")
	public WebElement txtLastName;

	@FindBy(xpath = "(//*[text()='New Email']/following-sibling::div//input)[1]") // CR - RK Sep 6 KER-4230
	public WebElement txtNewEmail;

	@FindBy(xpath = "(//*[text()='Confirm Email']/following-sibling::div//input)[1]") // CR - RK Sep 6 KER-4230
	public WebElement txtConfirmEmail;

	@FindBy(xpath = "//h5[text()='PAYMENTS']")
	public WebElement headerPayments;

	@FindBy(xpath = "//*[text() = 'CREDIT CARDS']")
	public WebElement headerCreditCards;

	@FindBy(xpath = "//*[text() = 'You have no credit cards listed.']")
	public WebElement txtNoCreditCardListed;

	@FindBy(xpath = "//*[@data-auid='btnaddNew-giftCard-btn' and text()= 'ADD NEW CREDIT CARD']")
	public WebElement btnAddNewCreditCard;

	@FindBy(xpath = "//*[text() = 'GIFT CARDS']")
	public WebElement headerGiftCards;

	@FindBy(xpath = "//*[text() = 'ADD NEW CREDIT CARD']")
	public WebElement headerAddNewCreditCards;

	@FindBy(xpath = "//*[@auid = 'Credit Card Number-inputField'] | //*[@id='creditcardField'] |//*[@name ='creditcardField']") // CR-DPK Date 12-Sept
	public WebElement txtCreditCardNumber;

	@FindBy(xpath = "//*[@auid = 'Exp. Date-inputField'] | //*[@id='expirationDate'] |//*[@name ='expiryField']") // CR-DPK Date 12-Sept
	public WebElement txtExpiryDate;

	@FindBy(xpath = "//*[@auid = 'CVV-inputField'] | //*[@id='cvv'] | //*[@name ='cvvField']") // CR-SK Date 28-Aug, CR-DPK Date 12-Sept
	public WebElement txtCVV;

	@FindBy(xpath = "//*[text() = 'BILLING INFORMATION']")
	public WebElement headerBillingInformation;

	@FindBy(xpath = "//*[text()='Phone Number']/..//input")
	public WebElement txtPhoneNumberInAddCreditCard;

	@FindBy(xpath = "//*[@data-auid='btnsubmit-btn']")
	public WebElement btnAddInAddCreditCard;

	@FindBy(xpath = "//button[.='CANCEL']")
	public WebElement btnCancelInAddCreditCard; // CR-SK 29 Aug-18

	@FindBy(xpath = "//*[text()='wishlist']")
	public WebElement lnkWishlist;

	@FindBy(xpath = "//*[@data-auid='btnmodal_open_btn']")
	public WebElement btnCreateNewWishlist;

	@FindBy(xpath = "//*[@data-auid='wish_list_name_input']")
	public WebElement txtWishListName;

	@FindBy(xpath = "//*[@data-auid='btncreate_wish_list_btn']")
	public WebElement btnCreateWishList;

	@FindBy(xpath = "//*[text()='order']")
	public WebElement lnkOrder;

	@FindBy(xpath = "//h5[text()='ORDERS']")
	public WebElement headerOrder;

	@FindBy(xpath = "(//*[text()='order']/following-sibling::input)[1]")
	public WebElement txtOrderNumber;

	@FindBy(xpath = "(//*[text()='Shipping Zip Code']/following-sibling::input)[1]")
	public WebElement txtShippingZipCode;

	@FindBy(xpath = "//*[@data-auid='btnbutton-3']")
	public WebElement btnFind;

	@FindBy(xpath = "//*[text()='Set as Default']/../input")
	public WebElement chkBoxSetAsDefault;

	@FindBy(xpath = "//h5[text()='ADDRESS BOOK']")
	public WebElement headerAddressBook;

	@FindBy(xpath = "//*[@data-auid='btnsubmit_btn']")
	public WebElement btnAddInAddressField;

	@FindBy(xpath = "//*[text()='First Name']/..//input") // CR-SK 28 Aug
	public WebElement txtFirstNameInAddCreditCard;

	@FindBy(xpath = "//*[text()='Last Name']/..//input") // CR-SK 28 Aug
	public WebElement txtLastNameInAddCreditCard;

	@FindBy(xpath = "//*[text()='Address']/..//input") // CR-SK 28 Aug
	public WebElement txtAddressInAddCreditCard;

	@FindBy(xpath = "//*[text()='ZIP Code']/..//input") // CR-SK 28 Aug
	public WebElement txtZipCodeInAddCreditCard;

	@FindBy(xpath = "//*[text()='City']/..//input") // CR-SK 28 Aug
	public WebElement txtCityInAddCreditCard;

	@FindBy(xpath = "//div[text()= 'Gift Cards']/../following-sibling::div//*[text()='Remove']/i") // CR-SK 29 Aug Modified RKA 12 Sep
	public List<WebElement> btnRemoveGiftCardList;

	@FindBy(xpath = "//*[contains(text(),'Gift Card ending in')]") // CR-SK 29 Aug
	public List<WebElement> txtAddedGiftCardList;

	@FindBy(xpath = "//*[contains(text(),'AVAILABLE BALANCE')]") // CR-SK 29 Aug
	public WebElement txtAvailableBalance;

	// Start KER-2920 CR-RK

	@FindBy(xpath = "//span[.='Card removed']")
	public WebElement txtCreditCardRemoved;

	@FindBy(xpath = "//div[text()='CREDIT CARDS']")
	public List<WebElement> txtCreditCard;
	// End KER-2920 CR-RK

	// Start KER-4230 CR-RK
	@FindBy(xpath = "//span[.='Not a valid name']")
	public WebElement txtInvalidFirstNameError;

	@FindBy(xpath = "//span[.='Not a valid name']")
	public WebElement txtInvalidLastNameError;

	// End KER-4230 CR-RK

	// End Page validation CR-SK

	@FindBy(xpath = "//*[@data-auid='tooltipsample tooltip']")
	public WebElement iconCVVToolTip;// 28Aug danush

	@FindBy(xpath = "//*[@data-auid='tooltipsample tooltip']/div")
	public WebElement iconCVVToolTipFlyout;// 28Aug danush

	@FindBy(xpath = "//*[text()='Required']")
	public List<WebElement> inlineErrorMsg;// 28Aug danush

	@FindBy(xpath = "//*[@data-auid='add-new-Credit-Card-btn']")
	public WebElement addNewCardCta; // 28 Aug - GK

	@FindBy(xpath = "//*[text()='DEFAULT']")
	public WebElement default_txt;

	@FindBy(xpath = "//*[@data-auid='myAccountCta_m']")
	public WebElement myAccount_txt_Mobile;

	@FindBy(xpath = "//*[@data-auid='Address Book_m']")
	public WebElement addressBook_M;

	@FindBy(xpath = "//*[text()='payment']")
	public WebElement lnkPayment_Mobile; // CR-RK KER-2920 Sep 4

	@FindBy(xpath = "//*[@data-auid='Profile_m']")
	public WebElement lnkProfile_Mobile; // CR-RK KER-4230 Sep 5

	@FindBy(xpath = "//*[text()='CONGRATULATIONS']")
	public WebElement myAccount_SignUp_CongratulationsMessage_txt;

	@FindBy(xpath = "//*[@data-auid='Orders']")
	public WebElement myAccount_MyAccountList_Orders_lnk;
	
	@FindBy(xpath = "//*[@data-auid='Address Book']")
	public WebElement myAccount_MyAccountList_AddressBook_lnk;
	
	@FindBy(xpath = "//*[@data-auid='Payments']")//CR-RK 8 Sep
	public WebElement myAccount_MyAccountList_Payment_lnk; //Updated Cr-RK Sep12 KER-4230 
	
	@FindBy(xpath = "//*[@data-auid='Profile']") //CR-RK 8 Sep
	public WebElement myAccount_MyAccountList_Profile_lnk; 
	
	

	@FindBy(xpath = "//*[@auid='add_address_btn']")
	public WebElement myAccountPage_AddNewAddressPluIcon_btn; // CR-RK KER-4230 Sep 6

	@FindBy(xpath = "//*[@data-auid='tooltipsample tooltip']") // CR - RKA Sep 6
	public WebElement AddGiftCardPage_Pin_toolTip;

	// Start KER-4233 CR-MS 06 Sep
	@FindBy(xpath = "//*[@data-auid='Wish List_m']")
	public WebElement Wishlist_Mobile_lnk;

	@FindBy(xpath = "//*[@data-auid='show_wish_list_btn']")
	public WebElement WishlistItems_lnk;

	@FindBy(xpath = "//*[@data-auid='delete_list_btn']")
	public WebElement DeleteList_btn;

	@FindBy(xpath = "//*[@data-auid='btndelete_wish_list_btn']")
	public WebElement DeleteWishList_btn;

	@FindBy(xpath = "//*[@data-auid='pop_over_btn']")
	public WebElement Wishlist_icn;
	
	@FindBy(xpath = "//*[@data-auid='pop_over_toggle_btn']")
	public WebElement Wishlist_createlist_lnk;
	
	@FindBy(xpath = "//*[@data-auid='Wish_list_name_input']")
	public WebElement Wishlist_name_txt;
	
	@FindBy(xpath = "//*[text()='Rename List']")
	public WebElement Rename_list_lnk;
	
	@FindBy(xpath = "//*[@data-auid='btnbrowse_product_button']")
	public WebElement browse_products_btn; 
 
	@FindBy(xpath="//*[@data-auid='btnkeep_wish_list_btn']")
	public WebElement Keep_Wishlist_btn;
	
	@FindBy(xpath="//*[@data-auid='share_list_btn']")
	public WebElement Share_list_lnk;
	
	@FindBy(xpath="//*[@data-auid='email_list_input']")
	public WebElement Email_input_txt;
	
	@FindBy(xpath="//*[@data-auid='comment_input']")
	public WebElement Message_txt;
	
	@FindBy(xpath="//*[@data-auid='btnshare_whish_list_btn']")
	public WebElement Share_Wishlist_btn;
	
	@FindBy(xpath="//*[@data-auid='close_modal_btn']")
	public WebElement Cancel_btn; 
 


	// End KER-4233 CR-MS

	@FindBy(xpath = "//*[text()='Weak']/following-sibling::div/div")
	public WebElement SignUpPage_PasswordStrengthBar_txt;
	
	@FindBy(xpath = "//*[text()='Password Strength']//i")
	public WebElement SignUpPage_PasswordStrength_tooltip;
	
	@FindBy(xpath = "//*[@data-auid='Orders_m']")
	public WebElement burgerMenu_Orders_lnk;
	
	@FindBy(xpath = "//*[@data-auid='btnundefined']/preceding-sibling::button")
	public WebElement myAccount_ChangePassword_Cancel_btn; // CR-SK, 29 Aug
	
	

	/***************************** END XPAHTS ***********************************/

	/***************************** START METHODS ********************************/
	
	public boolean validatePasswordStrength(String expectedColor) {
		waitForElement(SignUpPage_PasswordStrengthBar_txt);
		String styleAttribute = SignUpPage_PasswordStrengthBar_txt.getAttribute("style");
		styleAttribute = styleAttribute.split("width:")[1];
        int paswwordStrengthPercentage = Integer.parseInt(styleAttribute.split("%")[0].trim());
		if(expectedColor.equalsIgnoreCase("Yellow")) {
			if(paswwordStrengthPercentage == 50) 
				return true;
			else 
				return false;
		}
		else if(expectedColor.equalsIgnoreCase("Green")) {
			if(paswwordStrengthPercentage == 100) 
				return true;
			else 
				return false;
		}else
			return false;
			
		
	}
	

	/***************************** END METHODS *********************************/

}
