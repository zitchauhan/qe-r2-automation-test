package com.aso.qe.test.pageobject;

import static org.junit.Assert.assertTrue;

import java.util.List;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.stepdefinition.web.Common_Web_SD;

public class R2_MyAccount_PO extends CommonActionHelper {
	//R2_MyAccount_PO r2MyAccountPo = PageFactory.initElements(driver, R2_MyAccount_PO.class);  //-venkat

	/**************** START LOCAL OBJETCS AND DECLARATIONS ***********************/
	private static final Logger logger = Logger.getLogger(Common_Web_SD.class);
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

	// @FindBy(xpath = "(//div[.='Create
	// Password']/following-sibling::div/input)[1]") // modified by CR- SK//
	@FindBy(xpath = "//*[@id='signup-passwordfield'] | //*[@data-auid='Password']") // RKA 8 oct
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

	@FindBy(xpath = "//input[@data-auid='emailid_input'] | //*[@data-auid='Email Address']")
	public WebElement inputEmailAddress_SignIn;// KER-4232 CR-SK 28-8-18 //CR-RK Oct4

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

	// @FindBy(xpath = "//*[@data-auid='setAsDefault_btn']")
	// public WebElement setAsDefaultBtn;// RKA 3 aug added //GK 17Sept

	@FindBy(xpath = "//h5[text()='PAYMENT']") // CR-RK KER-2920 Sep18
	public WebElement headerPayments;

	@FindBy(xpath = "//*[@data-auid='defaultAddress'] | //*[text()='DEFAULT']")
	public WebElement setAsDefaultBtn;// RKA 3 aug added //GK 17Sept //CR-RK KER-3151 Sep 18 //CR-DPK 09-oct

	@FindBy(xpath = "//*[@data-auid='firstName']") // CR-SK, 28 Aug 2018 //CR-RK KER-3151 Sep 18
	public WebElement adr_inpFirstName;

	@FindBy(xpath = "//*[text()='DEFAULT']/../div/div/div[1]/div/div[1]") // CR-SK, 28 Aug 2018 //CR-RK KER-3151 Sep 18
	public WebElement adr_inpFirstNameLastName;
	
	@FindBy(xpath = "//*[@data-auid='lastName']") // CR-SK, 28 Aug 2018 //CR-RK KER-3151 Sep 18
	public WebElement adr_inpLastName;

	@FindBy(xpath = "//*[@data-auid='addressLine1']") // CR-SK, 28 Aug 2018 //CR-RK KER-3151 Sep 18
	public WebElement adr_inpAddress1;

	@FindBy(xpath = "//*[@data-auid='zipCode']") // CR-SK, 28 Aug 2018 //CR-RK KER-3151 Sep 18
	public WebElement adr_inpzipCode;

	@FindBy(xpath = "//*[@data-auid='city']") // 27 Aug //CR-RK KER-3151 Sep 18
	public WebElement adr_inpCity;

	@FindBy(xpath = "//*[@name='phone1'] | //*[@data-auid='phone1']|//*[text()='Phone Number']/following::*[2]")
	public WebElement adr_inpPhoneNumber; // CR-RK KER-3151 Sep 18

	// Start KER-3172 CR-RK Sep20
	@FindBy(xpath = "//*[.='Print a Receipt']")
	public WebElement Order_Print_Receipt;
	// End KER-3172 CR-RK Sep20

	@FindBy(xpath = "//*[.='State']//parent::div//following-sibling::div//button")
	public WebElement btnState; // CR-SK; 24 Aug
	// End KER-4232 CR-MS

	// Start KER-3392 CR-RK
	@FindBy(xpath = "//h4")
	public WebElement txtWelcomeDescription; // Cr-RK SEp20 KER-3392

	@FindBy(xpath = "//*[@data-auid='Email Address']")
	public WebElement txtEmailAddressDescription; // Cr-RK SEp20 KER-3392 //CR-RK Oct4 KER-3392

	@FindBy(xpath = "//*[@data-auid='Password']")
	public WebElement txtPasswordDescription; // Cr-RK SEp20 KER-3392 //CR-RK Oct4 KER-3392

	@FindBy(xpath = "//*[contains(text(),'Forgot your password')]")
	public WebElement txtForgotYourPasswordDescription; // Cr-RK SEp20 KER-3392

	@FindBy(xpath = "//button[text()='Forgot Your Password']")
	public WebElement lnkForgotYourPassword;

	@FindBy(xpath = "//*[contains(text(),'Create Account')] | //*[contains(text(),'Create an account')]")
	public WebElement txtCreateAccountDescription;

	@FindBy(xpath = "//*[contains(text(),'Create Account')] | //*[contains(text(),'Create an account')]") // 4-Oct CR_GK
	public WebElement lnkCreateAccount;

	// Start KER-4011 CR-SK
	@FindBy(xpath = "//*[@data-auid='emailid_input'] | //*[@type='email']")
	public WebElement txtEmailAddress; // Sid Modified 28-Jan
	
	@FindBy(xpath = "//*[contains(text(),'CANCEL THIS ORDER')]")
	public WebElement cancelOrderModal; // Sid 28-Jan
	

	@FindBy(xpath = "//*[text()='SIGN IN']")
	public WebElement headerSignIn;

	@FindBy(xpath = "//*[contains(text(), 'Hello')] | //*[contains(text(), 'HELLO')]")
	public WebElement txtHelloMessage; // modified GK - 4 Oct

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

	@FindBy(xpath = "//*[@data-auid='btnsubmit_btn'] | //*[@data-auid='btnundefined']") // CR-SK 28 Aug-18 //CR-DPK
																						// oct-09
	public WebElement btnSubmit;

	@FindBy(xpath = "//*[@data-auid='forgot_password_btn']")
	public WebElement btnForgotYourPassword;
	// End KER-4023 CR-SK

	// Start KER-4230 CR-SK
	@FindBy(xpath = "//*[text()='Profile']") // CR-SK 28 Aug-18 // KER-4230 CR-RK Sep 6
	public WebElement lnkProfile;

	@FindBy(xpath = "//*[@data-auid='myAccountCta'] | //*[@data-auid='signInCta']")
	public WebElement lnkMyAccount;

	@FindBy(xpath = "//*[contains(text(),'Current Password')]/following-sibling::div/input | //*[contains(text(),'Current Password')]/../following-sibling::div/input | //*[@name='currentPassword']")
	public WebElement txtCurrentPassword;// modified GK 06 - Oct

	// @FindBy(xpath = "//div[.='New
	// Password']/following-sibling::input[@type='password']")/RKA 18 sept
	@FindBy(xpath = "(//*[@data-auid='undefined_inline_button'])[1]/preceding::*[1]")
	public WebElement txtNewPassword;

	@FindBy(xpath = "//*[@data-auid='updatePassword']")
	public WebElement btnUpdate;

	// Start KER-4249 CR-SK 23-Aug
	@FindBy(xpath = "//button[.='SHOW']")
	public WebElement btnShow;

	@FindBy(xpath = "//button[.='Hide'] | //button[.='HIDE']")
	public WebElement btnHide;
	// End KER-4249 CR-GK 3-Oct

	// Start KER-3092
	@FindBy(xpath = "//*[.='PAYMENT']/a ")
	public WebElement lnkPayment; //// CR-SK 29 Aug-18

	@FindBy(xpath = "//div[.='You have no gift cards listed.']")
	public WebElement txtNoGiftCardListed; // 25 Aug

	@FindBy(xpath = "//*[@data-auid='btnaddNew-giftCard-btn' and text()= 'ADD NEW GIFT CARD'] | //*[text()= 'ADD NEW GIFT CARD']") // CR-DPK
																																	// 10oct
	public WebElement btnAddNewGiftCard; // 25 Aug

	@FindBy(xpath = "//*[text()='Gift Card Number']//following-sibling::div/input") // CR-SK,28-Aug 2018 //updated
																					// 25/9/18
	public WebElement txtGiftCardNumber; // 25 Aug

	@FindBy(xpath = " //*[.='PIN']/following-sibling::div/input") // updated 25/9/18
	public WebElement txtGifCardPin; // 25 Aug

	@FindBy(xpath = "(//*[text()='ADD NEW GIFT CARD'])[1]")
	public WebElement btnAddGiftCardPlusIcon;

	@FindBy(xpath = "//*[@data-auid='btnundefined']")
	public WebElement btnAddGiftCard; // 25 Aug

	@FindBy(xpath = "//*[@data-auid='btnundefined']/preceding::*[1]")
	public WebElement btnCancelGiftCard; // CR-SK, 29 Aug Modified CR-RKA 3 Oct
	// End KER-3092

	// Start KER-3152 CR-AKK
	@FindBy(xpath = "//input[@type='text']")
	public WebElement inputEmail;

	@FindBy(xpath = "//input[@data-auid='password_input'] | //*[@data-auid='Password']")
	public WebElement inputPassword; // CR-RK Oct4

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

	@FindBy(xpath = "//*[@data-auid='Sign Out']")
	public WebElement signOut_lnk;

	@FindBy(xpath = "//*[@data-auid='Sign Out_m']")
	public WebElement signOut_Mobile_lnk;
	
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

	final String removeBtnForAddress = "//*[text()='Remove']";
	@FindBy(xpath = removeBtnForAddress)
	public WebElement btnRemove;
	
	@FindBy(xpath = "(//*[text()='Remove'])[2]")
	public WebElement removeBtnForGiftCard;
	
	@FindBy(xpath = "//*[contains(text(),'Academy Sports + Outdoors Credit Card ending in')]/../../../div[2]/div/button[2]")
	public WebElement btnAccRemove;		

	@FindBy(xpath = "//*[text()='Edit']")
	public WebElement btnEdit;

	@FindBy(xpath = "//*[@data-auid='address_page']")
	public WebElement txtAddressDescription;

	// End KER-4232 CR-RK
	// Start KER-6941 CR-RK
	@FindBy(xpath = "//input[@data-auid='Password']")
	public WebElement inputPasswordSignIn; // CR-Rk Sep20 KER-3392

	@FindBy(xpath = "//input[@data-auid='Email Address']")
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

	// @FindBy(xpath = "//h5[text()='PAYMENTS']")
	// public WebElement headerPayments;
	
	@FindBy(xpath="//*[text()='DEFAULT']/following::div[5]")public WebElement defaultCreditCard;
	
	@FindBy(xpath="//button[@class='css-7frz9w']")public WebElement defaultCreditCardChkoutPayment;

	@FindBy(xpath = "//*[text() = 'CREDIT CARDS']")
	public WebElement headerCreditCards;

	@FindBy(xpath = "//*[text() = 'You have no credit cards listed.']")
	public WebElement txtNoCreditCardListed;

	@FindBy(xpath = "//*[@data-auid='btnaddNew-giftCard-btn' and text()= 'ADD NEW CREDIT CARD']")
	public WebElement btnAddNewCreditCard;

	@FindBy(xpath = "//*[@data-auid='btnaddNew-giftCard-btn' and text()= 'ADD NEW CREDIT CARD']")
	public WebElement btnAddInAddCreditCard;

	@FindBy(xpath = "//*[text() = 'GIFT CARDS'] | //*[text() = 'Gift Card']") // CR-DPK 10oct
	public WebElement headerGiftCards;

	@FindBy(xpath = "//*[text() = 'ADD NEW CREDIT CARD']")
	public WebElement headerAddNewCreditCards;

	@FindBy(xpath = "//*[@auid = 'Credit Card Number-inputField'] | //*[@id='creditcardField'] |//*[@name ='creditcardField'] | //*[@data-auid='creditcardField']") // CR-GK
																																									// //
																																									// Date
																																									// //
																																									// 3-oct
	public WebElement txtCreditCardNumber;

	@FindBy(xpath = "//*[@auid = 'Exp. Date-inputField'] | //*[@id='expirationDate'] |//*[@name ='expiryField']") // CR-DPK
																													// Date
																													// 12-Sept
	public WebElement txtExpiryDate;

	@FindBy(xpath = "//*[@auid = 'CVV-inputField'] | //*[@id='cvv'] | //*[@name ='cvvField']") // CR-SK Date 28-Aug,
																								// CR-DPK Date 12-Sept
	public WebElement txtCVV;

	@FindBy(xpath = "//*[text() = 'BILLING INFORMATION']")
	public WebElement headerBillingInformation;

	@FindBy(xpath = "//*[text()='Phone Number']/..//input")
	public WebElement txtPhoneNumberInAddCreditCard;

	@FindBy(xpath = "//*[@data-auid='btnsubmit-btn']")
	public WebElement PaymentPage_AddCreditCard_Add_btn;

	@FindBy(xpath = "//button[.='CANCEL']")
	public WebElement btnCancelInAddCreditCard; // CR-SK 29 Aug-18

	@FindBy(xpath = "//*[text()='WISH LIST']")
	public WebElement lnkWishlist;

	@FindBy(xpath = "//*[@data-auid='btnmodal_open_btn']")
	public WebElement btnCreateNewWishlist;

	@FindBy(xpath = "//*[@data-auid='wish_list_name_input'] | //*[@data-auid='Wish_list_name_input']") // CR-DPK 05-oct
	public WebElement txtWishListName;

	@FindBy(xpath = "//*[@data-auid='btncreate_wish_list_btn'] | //*[@data-auid='pop_over_toggle_btn']")
	public WebElement btnCreateWishList;

	@FindBy(xpath = "//*[@data-auid='btnundefined']/ancestor::*[2]/preceding-sibling::*[1]/*[1]")
	public WebElement WishList_Product_Eyebrow;

	@FindBy(xpath = "//*[@data-auid='btnundefined']/ancestor::*[2]/preceding-sibling::*[1]/*[2]")
	public WebElement WishList_Product_Tittle;

	@FindBy(xpath = "//*[@data-auid='btnundefined']/ancestor::*[2]/preceding-sibling::*[1]/*[3]")
	public WebElement WishList_Product_Review;

	@FindBy(xpath = "//*[@data-auid='btnundefined']/ancestor::*[2]/preceding-sibling::*[1]/*[5]")
	public WebElement WishList_Product_Price;

	@FindBy(xpath = "//*[@data-auid='btnundefined']/ancestor::*[2]/preceding-sibling::*[2]")
	public WebElement WishList_Product_Img;

	@FindBy(xpath = "//a[text()='ORDERS']")
	public WebElement lnkOrder;

	@FindBy(xpath = "//h5[text()='ORDERS']")
	public WebElement headerOrder;

	@FindBy(xpath = "(//*[text()='order']/following-sibling::input)[1]")
	public WebElement txtOrderNumber;

	@FindBy(xpath = "(//*[text()='PAYMENT'])[2]")
	public WebElement Order_Payment_txt;

	@FindBy(xpath = "(//*[text()='PAYMENT'])[2]/following-sibling::*[2]")
	public WebElement Order_Payment_Section;

	@FindBy(xpath = "(//*[text()='Shipping Zip Code']/following-sibling::input)[1]")
	public WebElement txtShippingZipCode;

	@FindBy(xpath = "//*[@data-auid='btnbutton-3']")
	public WebElement btnFind;

	@FindBy(xpath = "//*[text()='Set as Default']/..//label") // CR-DPK oct-08
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

	final String xpathForDeleteGiftCardButton = "//div[text()= 'GIFT CARDS']/../following-sibling::div//*[text()='Remove']/i | //*[contains(text(),'Remove')] | //*[text()= 'Gift Card']/../following-sibling::*//*[text()='Remove']";
	@FindBy(xpath = xpathForDeleteGiftCardButton) // CR-SK
													// 29
													// Aug
													// //
	// Modified RKA 12
	// // Sep Modified
	// CR-GK 9-Oct

	public List<WebElement> btnRemoveGiftCardList;
	
	final String xpathForDeleteGiftCardButtonNew = "//*[text()= 'Gift Card']/../following-sibling::*//*[text()='Remove']";
	@FindBy(xpath = xpathForDeleteGiftCardButtonNew) // CR-SK
													// 29
													// Aug
													// //
	// Modified RKA 12
	// // Sep Modified
	// CR-GK 9-Oct

	public List<WebElement> btnRemoveGiftCardOptionList;

	final String xpathForDeleteCreditCardButton = "//*[text()= 'CREDIT CARDS']/../following-sibling::div//*[text()='Remove']/i | //*[text()= 'CREDIT CARDS']/../following-sibling::*//*[text()='Remove']/preceding-sibling::i";
	@FindBy(xpath = xpathForDeleteCreditCardButton) // CR-SK
													// 29
													// Aug
													// //
													// //
	// Modified RKA 12
	// // // Sep
	// Modified // GK //
	// 17Sep
	public List<WebElement> PaymentPage_CreditCard_Remove_list;

	@FindBy(xpath = "//*[contains(text(),'Gift Card ending in')]") // CR-SK 29 Aug
	public List<WebElement> txtAddedGiftCardList;

	@FindBy(xpath = "//*[contains(text(),'Available Balance')]") // CR-SK 29 Aug //Modified 25/9 Anuj
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

	@FindBy(xpath = "//*[@data-auid='tooltipmyAct_payment_crdtCard_cvv']")
	public WebElement iconCVVToolTip;// 28Aug danush

	@FindBy(xpath = "//*[@data-auid='tooltipsample tooltip']/div")
	public WebElement iconCVVToolTipFlyout;// 28Aug danush

	@FindBy(xpath = "//*[text()='Required']")
	public List<WebElement> inlineErrorMsg;// 28Aug danush

	@FindBy(xpath = "//*[text()='ADD NEW CREDIT CARD'] | //*[@data-auid='add-new-Credit-Card-btn']")
	public WebElement addNewCardCta; // 28 Aug - GK, 20 Sept CR-DPK

	@FindBy(xpath = "//*[text()='DEFAULT']")
	public WebElement default_txt;

	@FindBy(xpath = "//*[@data-auid='signInCta_m'] | //*[@data-auid='myAccountCta_m']") //MJR-11/28/19
	public WebElement myAccount_txt_Mobile;
	
	@FindBy(xpath = "//*[@data-auid='Address Book_m']")
	public WebElement addressBook_M;

	@FindBy(xpath = "//*[@data-auid='Payments_m']")
	public WebElement lnkPayment_Mobile; // CR-RK KER-2920 Sep 4 //CR-Rk Sep24 KER-2920

	@FindBy(xpath = "//*[@data-auid='Profile_m']")
	public WebElement lnkProfile_Mobile; // CR-RK KER-4230 Sep 5

	@FindBy(xpath = "//*[text()='Play Ball!'] | //*[text()='CONGRATULATIONS']")
	public WebElement myAccount_SignUp_CongratulationsMessage_txt;

	@FindBy(xpath = "//*[@data-auid='Orders']")
	public WebElement myAccount_MyAccountList_Orders_lnk;

	@FindBy(xpath = "//*[@data-auid='Address Book']")
	public WebElement myAccount_MyAccountList_AddressBook_lnk;

	@FindBy(xpath = "//*[@data-auid='Payments']|//*[text()='Payments']") // CR-RK 8 Sep
	//@FindBy(xpath = "//*[@id='headerForScroll']")
	public WebElement myAccount_MyAccountList_Payment_lnk; // Updated Cr-RK Sep12 KER-4230

	@FindBy(xpath = "//*[@data-auid='Profile']") // CR-RK 8 Sep
	public WebElement myAccount_MyAccountList_Profile_lnk;

	@FindBy(xpath = "//*[@auid='add_address_btn']")
	public WebElement myAccountPage_AddNewAddressPluIcon_btn; // CR-RK KER-4230 Sep 6

	@FindBy(xpath = "//*[@data-auid='tooltipsample tooltip'] | //*[@data-auid='tooltipundefined']") // CR - RKA Sep 6
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

	@FindBy(xpath = "//*[@data-auid='pop_over_toggle_btn'] | //*[@data-auid='btnmodal_open_btn']")
	public WebElement Wishlist_createlist_lnk;

	@FindBy(xpath = "//*[@data-auid='Wish_list_name_input']")
	public WebElement Wishlist_name_txt;

	@FindBy(xpath = "(//*[text()='Rename List'])[2]")
	public WebElement Rename_list_lnk;

	@FindBy(xpath = "//*[text()='Rename List']")
	public WebElement Rename_list_lnk_mob;

	@FindBy(xpath = "//*[@data-auid='btnbrowse_product_button']")
	public WebElement browse_products_btn;

	@FindBy(xpath = "//*[@data-auid='btnkeep_wish_list_btn']")
	public WebElement Keep_Wishlist_btn;

	@FindBy(xpath = "//*[@data-auid='share_list_btn']")
	public WebElement Share_list_lnk;

	@FindBy(xpath = "//*[@data-auid='email_list_input']")
	public WebElement Email_input_txt;

	@FindBy(xpath = "//*[@data-auid='comment_input']")
	public WebElement Message_txt;

	@FindBy(xpath = "//*[@data-auid='btnshare_whish_list_btn']")
	public WebElement Share_Wishlist_btn;

	@FindBy(xpath = "//*[@data-auid='close_modal_btn']")
	public WebElement Cancel_btn;

	// End KER-4233 CR-MS

	@FindBy(xpath = "//*[text()='Weak']/following-sibling::div/div")
	public WebElement SignUpPage_PasswordStrengthBar_txt;

	@FindBy(xpath = "//*[text()='Password Strength']//i | //*[@data-auid='tooltipmyAct_passwordStrengthMeter']") // CR-DPK
																													// oct-09
	public WebElement SignUpPage_PasswordStrength_tooltip;

	@FindBy(xpath = "//*[@data-auid='Orders_m']")
	public WebElement burgerMenu_Orders_lnk;

	@FindBy(xpath = "//*[@data-auid='btnundefined']/preceding-sibling::button | //*[@data-auid='backToProfilePage']")
	public WebElement myAccount_ChangePassword_Cancel_btn; // CR-SK, 29 Aug

	@FindBy(xpath = "//*[text()='DEFAULT']/..") // CR-DPK 14-Sept
	public WebElement txtCreditCardDetails;

	// Start KER-4229 CR-GK 16 Sep
	@FindBy(xpath = "//*[contains(text(),'VIEW DETAILS')]")
	public List<WebElement> viewOrderDetailsBtn;

	@FindBy(xpath = "//*[@data-auid='act_page']//*[contains(text(),'ORDERS')]")
	public WebElement ordersHeading;
	
	
	@FindBy(xpath = "//*[contains(text(),'Total Orders')]")
	public WebElement totalNumberOfOrder;

	@FindBy(xpath = "//a[contains(text(),'Customer Care')]")
	public WebElement customerCareLink;

	@FindBy(xpath = "//*[contains(text(),'Newest')]")
	public WebElement ordersDropDownNewest;

	@FindBy(xpath = "//*[contains(text(),'Oldest')]")
	public WebElement ordersDropDownOldest;

	@FindBy(xpath = "//*[contains(text(),'Your Password')]/../div[2]")
	public WebElement maskedPasswordInProfile;

	@FindBy(xpath = "//a[text()='PROFILE']")
	public WebElement myAccountProfilecta;
	// End KER-4233 CR-GK

	@FindBy(xpath = "//*[contains(text(),'Password Strength')]//i")
	public WebElement ChangePasswordPage_toolTip_Btn;

	// Start KER-4237 CR-MS

	@FindBy(xpath = "//*[text()='Cancel Order']")
	public WebElement Order_Cancel_lnk;

	@FindBy(xpath = "//*[text()='VIEW DETAILS']")
	public WebElement Order_View_Details_Btn;

	// SID Modified 22-September
	@FindBy(xpath = "//*[text()='Back to order'] | //*[@data-component='myaccount']//*[text()='Back to Orders']")
	public WebElement Order_Back_To_Order_Lnk;

	// SID 22-September
	@FindBy(xpath = "//*[text()='ORDER CANCELLATION'] | //*[text()='Order Cancellation']")
	public WebElement Order_Cancellation_page;

	// SID 22-September
	@FindBy(xpath = "//*[text()='Your order cancellation request has been received']")
	public WebElement Order_Cancellaton_Message;

	// SID 22-September
	@FindBy(xpath = "//*[@data-component='myaccount']//*[text()='Refund Amount:'] | //*[@data-component='myaccount']//*[text()='REFUND PAYMENT']")
	public WebElement Cancellation_Page_Refund_Payment_Details;

	@FindBy(xpath = "//a//*[text()='Back to order'] | //*[@data-auid='Orders_m']")
	public WebElement Order_Back_To_Order_Lnk_M;

	@FindBy(xpath = "//*[text()='After your item is ready for pickup, it will be held in our store for 7 days.']")
	public WebElement Order_Note_Txt;

	// End KER-4237 CR-MS

	// Start KER-3129 CR-RK Sep18
	@FindBy(xpath = "//*[text()= 'Total']/following-sibling::*[1]")
	public WebElement txtTotal;
	@FindBy(xpath = "//*[contains(text(),'Taxes')]/following-sibling::*[1]")
	public WebElement TaxesPrice_Txt;// taxprice
	// End KER-3129 CR-RK Sep18

	@FindBy(xpath = "//*[@data-auid='btnundefined']/ancestor::*[3]/descendant::button[1]")
	public WebElement WhishList_Remove_Lnk;

	@FindBy(xpath = "//*[@data-auid='btnundefined']/ancestor::*[3]/descendant::button[2]")
	public WebElement WhishList_Remove_Lnk_M;

	@FindBy(xpath = "//*[@data-auid='undo_click_btn']")
	public WebElement Wishlist_Undo;

	@FindBy(xpath = "//*[text()='MOVE TO CART']")
	public WebElement Wishlist_MoveToACart_Btn;

	@FindBy(xpath = "//*[contains(text(),'ARE YOU SURE')]/following-sibling::*[1]/*[2]")
	public WebElement Order_Number_Txt;

	@FindBy(xpath = "//*[contains(text(),'Total Items')]/following-sibling::*[1]")
	public WebElement Total_Items_Txt;

	@FindBy(xpath = "//*[text()='YES, CANCEL MY ORDER']")
	public WebElement Cancel_Yes_Order_Btn;

	@FindBy(xpath = "//*[text()='NO']")
	public WebElement Cancel_NO_Order_Btn;

	@FindBy(xpath = "//*[@data-auid='phone1']")
	public WebElement AddressBook_inpPhoneNumber; // 19sept CR-GK

	@FindBy(xpath = removeBtnForAddress) // CR-DPK 21-sept //CR-GK 15-Oct
	public List<WebElement> addresRemove_Btn;

	@FindBy(xpath = "//*[text()='Order Number']/../*[2] | //*[text()='Order Number']/../../*[2] | //*[contains(text(),'ORDER NUMBER')]") 
	public WebElement OrderNumber_Input; //SID Modified 28-Jan
	
	@FindBy(xpath = "//*[contains(text(),'CANCELATION PLACED ON')]/parent::*/*[2]") 
	public WebElement orderCancelationDate; //SID  28-Jan
	

	@FindBy(xpath = "//*[text()='Billing Zip Code']/../*[2] | //*[text()='Billing Zip Code']/../../*[2]") // CR-DPK
																											// 10oct
	public WebElement BillindZipCode_Input;

	@FindBy(xpath = "//*[@data-auid='btnbutton-3']")
	public WebElement Check_Btn;

	// SID 22-September
	@FindBy(xpath = "//*[contains(text(),'ORDER DETAILS')]")
	public WebElement Order_Details_page;

	@FindBy(xpath = "//*[contains(text(),'ORDER PLACED')][1]")
	public WebElement MyAccount_OrderPage_OrderPlacedOnDate_txt;

	@FindBy(xpath = "//*[contains(text(),'ORDER NUMBER')]")
	public WebElement MyAccount_OrderPage_OrderNumber_txt;

	@FindBy(xpath = "//*[contains(text(),'ORDER TOTAL')] | //*[contains(text(),'Total')]")
	public WebElement MyAccount_OrderPage_OrderTotal_txt;  //SID Modified 28-Jan

	@FindBy(xpath = "//*[contains(text(),'ORDER PLACED')]/../span[2]")
	public WebElement MyAccount_OrderDetailsPage_OrderDate;

	@FindBy(xpath = "//*[contains(text(),'ORDER NUMBER')]/../span[2]")
	public WebElement MyAccount_OrderDetailsPage_OrderNumber;

	@FindBy(xpath = "//*[contains(text(),'ORDER NUMBER')]/../../../div[2]")
	public WebElement MyAccount_OrderDetailsPage_OrderStatus;

	@FindBy(xpath = "//span[contains(text(),'Shipping')]/following-sibling::span")
	public WebElement MyAccount_OrderDetailsPage_ShippingAmount;

	@FindBy(xpath = "//*[contains(text(),'Subtotal')]/../span[2]")
	public WebElement MyAccount_OrderDetailsPage_SubTotalAmount;

	@FindBy(xpath = "//*[contains(text(),'SHIPPING ADDRESS')]")
	public WebElement MyAccount_OrderDetailsPage_ShippingAddress;

	@FindBy(xpath = "//div[contains(text(),'SHIPPING ADDRESS')]//parent::div/following-sibling::div/div[5]")
	public WebElement MyAccount_OrderDetailsPage_EmailOrPhone;

	// Start KER-4330 CR-MS Sep25

	//@FindBy(xpath = "//*[contains(text(),'IN-STORE PICKUP')]")
	@FindBy(xpath = "//*[contains(text(),'Store Pickup from')]")//Modified by HP 04/11/19 to fix KER-4237
	public WebElement Order_Bopis_In_Store_Pickup_txt;

	@FindBy(xpath = "//*[contains(text(),'PICKUP INFORMATION')]")
	public WebElement Order_Bopis_Pickup_txt;

	@FindBy(xpath = "//*[contains(text(),'Store Hours')]")
	public WebElement Order_Bopis_Store_Hours_txt;

	@FindBy(xpath = "//*[contains(text(),'PICKUP INFORMATION')]/following-sibling::*/*[2]")
	public WebElement Order_Bopis_Pickup_Information_Person_Details_Txt;

	@FindBy(xpath = "//*[contains(text(),'View Store Details')]")
	public WebElement Order_Bopis_View_Store_Btn;

	@FindBy(xpath = "//*[text()= 'Print a Receipt']")
	public WebElement Order_Bopis_Print_Receipt_lnk;

	@FindBy(xpath = "//*[contains(text(),'Store Pickup from')]") //updated by MJR on 16/7/19
	public WebElement Order_Bopis_InStore_Pickup_Msg;

	@FindBy(xpath = " //*[@data-auid='btnundefined']/../following-sibling::*[1]/*/*[1]")
	public WebElement Order_Bopis_Item_Img;

	@FindBy(xpath = " //*[@data-auid='btnundefined']/../following-sibling::*[1]/*/*[2]")
	public WebElement Order_Bopis_Item_Details;

	@FindBy(xpath = "//*[@data-auid='show_wish_list_btn']")
	public List<WebElement> openWishListBtn;

	// CR-GK 9-Oct
	@FindBy(xpath = xpathForDeleteCreditCardButton)
	public WebElement MyAccount_CreditCardRemoveBtn;

	// CR-GK 9-Oct
	@FindBy(xpath = xpathForDeleteGiftCardButtonNew)
	public WebElement MyAccount_GiftCardRemoveBtn;
	
	@FindBy(xpath = "//*[@name='orderId']")
	public WebElement orderIdCheckOrderStatus;  //SID 28-Jan
	
	@FindBy(xpath = "//*[@name='zipCode']")
	public WebElement zipCodeCheckOrderStatus;  //SID 28-Jan
	
	@FindBy(xpath = "//span[text()='Academy Credit Card']")
	public WebElement plcc_Radio_Button;
	
	@FindBy(xpath = "//input[@id='creditcardField']")
	public WebElement plccCreditCardTextBox;
	
	@FindBy(xpath = "//img[@class='loadcardInfo']")
	public WebElement plccLogoImg;
	
	@FindBy(xpath = "//span[text()='Unrecognized card number']")
	public WebElement plccErrorUnrecognizedCardNo;
	
	@FindBy(xpath = "//input[@id='firstName']")
	public WebElement billingAddressFirstName;
	
	@FindBy(xpath = "//input[@id='lastName']")
	public WebElement billingAddressLastName;
	
	@FindBy(xpath = "//input[@id='address']")
	public WebElement billingAddressAddress;
	
	@FindBy(xpath = "//input[@id='zipCode']")
	public WebElement billingAddressZipCode;
	
	@FindBy(xpath = "//input[@id='city']")
	public WebElement billingAddressCity;
	
	@FindBy(xpath = "//input[@id='phoneNumber']")
	public WebElement billingPhoneNumber;
	
	@FindBy(xpath = "//button[@data-auid='btnsubmit-btn']")
	public WebElement addAccButton;
		
	@FindBy(xpath = "//div[text()=\"Clarissa Alter\"]")
	public WebElement plccValidateName;
	
	@FindBy(xpath = "//p[contains(text(),\"8 Kiko Pl\")]")
	public WebElement plccValidateAddress;
	
	@FindBy(xpath = "//p[text()=\"12524\"]")
	public WebElement plccValidateZip;
	
	
	@FindBy(xpath = "//span[text()='Credit Card']")
	public WebElement cc_Radio_Button;
	
	@FindBy(xpath = "//*[text()='Cardholder Name']/following::*[1]")
	public WebElement ccCardHolderName;
	
	@FindBy(xpath = "//*[text()='Credit Card Number']/following::*[1] | //input[@id='card']")
	public WebElement ccCreditCardNumber;
	
	@FindBy(xpath = "//*[text()='Exp. Date']/following::*[1]")
	public WebElement ccCreditCardExpiry;
	
	@FindBy(xpath = "//*[text()='CVV']/following::*[3]")
	public WebElement ccCreditCardCvv;
	
	@FindBy(xpath = "//span[@class='creditCardImage']/img")
	public WebElement ccLogoImg;
	
	@FindBy(id="first-data-payment-field-card")public WebElement CardField_Frame;
	

	// *********** Venkat **************
	
		@FindBy(xpath= "//div[@class='p-1']//p[@class='o-copy__14bold mb-0 text-capitalize']") public WebElement shippingAddressNameConfirmationPage; 
		@FindBy(xpath= "//div[@class='p-1']//p[@class='o-copy__14reg mb-0 pb-0 text-capitalize'][1]") public WebElement shippingaddress1ConfirmationPage;
		@FindBy(xpath= "//div[@class='p-1']//p[@class='o-copy__14reg mb-0 pb-0 text-capitalize'][2]") public WebElement shippingaddress2ConfirmationPage;
		@FindBy(xpath= "//div[@class='p-1']//p[@class='o-copy__14reg mb-0 pb-0']") public WebElement shippingPhoneEmailConfirmationPage;
		
		@FindBy(xpath= "//div[@class='col-12 col-md-8']") public WebElement shippingAddressAddressPage;
		
		@FindBy(xpath = "//i[@class='academyicon icon-pencil pr-half css-1uwna80'][1]")public WebElement btnEditNonDefaultAddress;
		@FindBy(xpath = "//input[@id='myaccount-firstname']")public WebElement NonDefaultFName;
		@FindBy(xpath = "//input[@id='myaccount-lastname']")public WebElement NonDefaultLName;
		@FindBy(xpath = "//input[@id='myaccount-address']")public WebElement NonDefaultAddress;
		@FindBy(xpath = "//input[@id='myaccount-zipcode']")public WebElement NonDefaultZip;
		@FindBy(xpath = "//input[@id='myaccount-city']")public WebElement btnEditNonDefaultPhNumber;
		@FindBy(xpath = "//button[@data-auid='btnsubmit_btn']")public WebElement btnUpdateNonDefault;
		@FindBy(xpath = "(//div[@class='col-12 col-md-8'])[2]")public WebElement NonDefaultShippingAddress;
		
		
	// ***************** End Venkat	**************************	
	
	// End KER-4330 CR-MS Sep25

	/***************************** END XPAHTS ***********************************/

	/***************************** START METHODS ********************************/

	// Venkat	
	public void retriveAddressOnConfirmationPageAndVerifyOnMyAccountPage(){
		
		String AddName = shippingAddressNameConfirmationPage.getText();
		String ConfAddress1 = shippingaddress1ConfirmationPage.getText();
		String ConfAddress2 = shippingaddress2ConfirmationPage.getText();
		String ConfMobile = shippingPhoneEmailConfirmationPage.getText();		
		clickOnButton(lnkMyAccount);
		clickOnButton(myAccount_MyAccountList_AddressBook_lnk);
		String ShippingAddress = NonDefaultShippingAddress.getText();
		if(ShippingAddress.contains(AddName)){
			   System.out.println("Shipping Name is"+AddName);
		 }
		if(ShippingAddress.contains(ConfAddress1)){
			   System.out.println("Shipping Address is"+ConfAddress1);
		 }
		if(ShippingAddress.contains(ConfAddress2)){
			   System.out.println("Shipping Address is"+ConfAddress2);
		 }
		if(ShippingAddress.contains(ConfMobile)){
			   System.out.println("Shipping Address is"+ConfMobile);
		 }
	}
	
	public void editNonDefaultShippingAddressAndVerify(String FName,String LName,String Address,String zip,String PhNumber){
	
		NonDefaultFName.sendKeys(FName);	
		NonDefaultLName.sendKeys(LName);
		NonDefaultAddress.sendKeys(Address);
		NonDefaultZip.sendKeys(zip);
		btnEditNonDefaultPhNumber.sendKeys(PhNumber);
		clickOnButton(btnUpdateNonDefault);
		String ShippingAddress = shippingAddressAddressPage.getText();
		if(ShippingAddress.contains(FName)){
			   System.out.println("Shipping Name is"+FName);
		 }
		if(ShippingAddress.contains(LName)){
			   System.out.println("Shipping Address is"+LName);
		 }
		if(ShippingAddress.contains(Address)){
			   System.out.println("Shipping Address is"+Address);
		 }
		if(ShippingAddress.contains(zip)){
			   System.out.println("Shipping Address is"+zip);
		 }
		if(ShippingAddress.contains(PhNumber)){
			   System.out.println("Shipping Address is"+PhNumber);
		 }
		
	}
	// Venkat End
	
	public boolean validatePasswordStrength(String expectedColor) {
		waitForElement(SignUpPage_PasswordStrengthBar_txt);
		String styleAttribute = SignUpPage_PasswordStrengthBar_txt.getAttribute("style");
		styleAttribute = styleAttribute.split("width:")[1];
		int paswwordStrengthPercentage = Integer.parseInt(styleAttribute.split("%")[0].trim());
		if (expectedColor.equalsIgnoreCase("Yellow")) {
			if (paswwordStrengthPercentage == 50)
				return true;
			else
				return false;
		} else if (expectedColor.equalsIgnoreCase("Green")) {
			if (paswwordStrengthPercentage == 100)
				return true;
			else
				return false;
		} else
			return false;

	}

	public String generateRandomEmailId() {

		String randomGeneratedString = RandomStringUtils.randomAlphanumeric(10);
		String head = "test";
		String tail = "@deleteme.com";
		String newGeneratedEmail = head + randomGeneratedString + tail;
		logger.debug("The new random generated email address is " + newGeneratedEmail);
		return newGeneratedEmail;

	}

	public String generateRandomMobileNumber() {

		String randomGeneratedMobileNumber = RandomStringUtils.randomNumeric(9);
		randomGeneratedMobileNumber = "6" + randomGeneratedMobileNumber;
		logger.debug("The new random generated mobile number is " + randomGeneratedMobileNumber);
		return randomGeneratedMobileNumber;

	}
	
	public String generateRandomString() {

		String randomGeneratedString = RandomStringUtils.randomAlphabetic(10);
		logger.debug("The new random generated string is " + randomGeneratedString);
		return randomGeneratedString;

	}

	// CR-GK 5-Oct
	public void deleteAllWishList() {
		int listCount = openWishListBtn.size();
		while (listCount > 0) {
			assertTrue(clickOnButton(WishlistItems_lnk));
			if ("mobile".equalsIgnoreCase(testtype)) {
				assertTrue(clickOnButton(Wishlist_icn));
			}
			assertTrue(clickOnButton(DeleteList_btn));
			assertTrue(clickOnButton(DeleteWishList_btn));
			listCount--;
		}
	}

	// CR-GK 9-Oct
	public void deleteAllCreditCardsFromMyAccount() throws InterruptedException {
		int cardsCount = PaymentPage_CreditCard_Remove_list.size();
		while (cardsCount > 0) {
			assertTrue(clickOnButton(MyAccount_CreditCardRemoveBtn));
			Thread.sleep(Constants.thread_highest);
			cardsCount--;
		}
	}

	// CR-GK 9-Oct
	public void deleteAllGiftCardsFromMyAccount() throws InterruptedException {
		Thread.sleep(Constants.thread_low);
		int giftCardsCount = btnRemoveGiftCardOptionList.size();
		while (giftCardsCount > 0) {
			assertTrue(clickOnButton(MyAccount_GiftCardRemoveBtn));
			Thread.sleep(Constants.thread_medium);
			giftCardsCount--;
		}
	}

	// CR-GK 15-Oct
	public void deleteAllNonDefaultSavedAddressFromProfile() throws InterruptedException {
		Thread.sleep(Constants.thread_low);
		int nonDefaultaddressCountInProfile = addresRemove_Btn.size();
		while (nonDefaultaddressCountInProfile > 0) {
			assertTrue(clickOnButton(btnRemove));
			Thread.sleep(Constants.thread_high);
			nonDefaultaddressCountInProfile--;
		}
	}

	/***************************** END METHODS *********************************/

}