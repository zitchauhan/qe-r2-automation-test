package com.aso.qe.test.pageobject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.text.SimpleDateFormat;
import java.util.List;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.aso.qe.framework.common.CommonActionHelper;
import java.util.Date;

public class R1_ReskinPO extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R1_ReskinPO.class);
	public R1_GlobalElementHeader_Home_PO globalElementHeader = PageFactory.initElements(driver,R1_GlobalElementHeader_Home_PO.class);
	public List<WebElement> allElementsInList;
	String timeStamp = new SimpleDateFormat("MM.dd.HH.mm.ss").format(new Date());

	// Sudhir 3-September
	@FindBy(xpath = "//input[@id='qty_1']")
	public WebElement inputcartqty;
	@FindBy(xpath = "//*[@class='item-price']")
	public WebElement itemprice;
	@FindBy(xpath = "//*[@class='item-total']")
	public WebElement totalitemprice;
	@FindBy(xpath = "//div[@class='qty-stepper']/button[2]")
	public WebElement btntoincreaseqty;
	@FindBy(xpath = "//div[@class='qty-stepper']/button[1]")
	public WebElement btntodecreaseqty;
	@FindBy(xpath = "//a[@id='removeitem_1']")
	public WebElement cartremove;
	@FindBy(xpath = "//h1[contains(text(),'The item was removed from the Shopping Cart.')][1]")
	public WebElement removecartmsg;

	// ENDS SUDHIR

	
	@FindBy(xpath = "//*[@class='leftNavLinks']/*[4]/*")
	public WebElement tabWishList;
	@FindBy(xpath = "//*[@id='myAccountPage']/div[1]/div/h1")
	public WebElement wishListHearder;
	@FindBy(xpath = "//*[@id='wishListControls']")
	public WebElement newWishListBtn;
	@FindBy(xpath = "//*[@id='createWishListInputField']")
	public WebElement createWishListInputField;
	@FindBy(xpath = "//*[@id='add_save']")
	public WebElement saveBtn;
	@FindBy(xpath = "//*[@id='wishListSelect']")
	public WebElement wishListDropDown;
	@FindBy(xpath = "//*[@id='deleteWishListBtn']")
	public WebElement deleteWishListBtn;
	@FindBy(xpath = "//*[@id='wishListSelect']")
	public WebElement wishListSelect;
	@FindBy(xpath = "//*[@id='delete_save']")
	public WebElement deleteBtn;
	@FindBy(xpath = "//*[@data-auid='myAccountCta']")
	public WebElement myAccount;
	@FindBy(xpath = "//*[@data-auid='Wish List']")
	public WebElement wishListFromMyAccount;
	@FindBy(xpath = "//*[@id='main-login-form']/div/p")
	public WebElement forgetPassLink;
	@FindBy(xpath = "//*[@id='forgot-pw-form-contents']/div[1]/h1")
	public WebElement forgetPassHeader;
	@FindBy(xpath = "//*[@id='forgot-email']")
	public WebElement forgetPassEmail;
	@FindBy(xpath = "//*[@id='btnForgotPassword']")
	public WebElement btnForgotPassword;
	@FindBy(xpath = "//*[@id='passwordResetErrorMessage']")
	public WebElement passwordResetErrorMessage;
	@FindBy(xpath = "//*[@id='forgot-pw-confirm-container']/div[1]/div/h1")
	public WebElement successMsgForgotPassword;
	@FindBy(xpath = "//*[@id='personalInformation']")
	public WebElement personalInformation;
	@FindBy(xpath = "//*[@id='genderField']")
	public WebElement genderField;
	@FindBy(xpath = "//*[@id='updatePersonalInformation']")
	public WebElement updatePersonalInformation;
	@FindBy(xpath = "//*[@id='personalInformationUpdateMessage']")
	public WebElement personalInformationUpdateMessage;
	
	public R1_ReskinPO(WebDriver webDriver) {
		super();
	}

	// Sudhir 3-September
		public boolean removeProductReskin() throws InterruptedException {
			Boolean flag = false;
			waitForElement(cartremove);
			assertTrue(clickOnButton(cartremove));
			Thread.sleep(3000);
			String cartmsg = getText(removecartmsg);
			String filtercartmsg = cartmsg.replace("'", "");
			String filterActualRemoveCartMsg = "THE ITEM WAS REMOVED FROM THE SHOPPING CART.";
			flag = filtercartmsg.contentEquals(filterActualRemoveCartMsg);
			return flag;
		}

		// Sudhir 3-September
		public boolean qtyIncreasePlusSignProductReskin() throws InterruptedException {
			Boolean flag = false;
			String qtyincrease1 = inputcartqty.getAttribute("value");
			int incqty1 = Integer.parseInt(qtyincrease1);
			waitForElement(btntoincreaseqty);
			assertTrue(clickOnButton(btntoincreaseqty));
			Thread.sleep(3000);
			String qtyincrease2 = inputcartqty.getAttribute("value");
			int incqty2 = Integer.parseInt(qtyincrease2);
			flag = incqty2 > incqty1;
			return flag;
		}

		// Sudhir 3-September
		public boolean qtyIncreaseInputProductReskin() throws InterruptedException {
			Boolean flag = false;
			String qtyincrease1 = inputcartqty.getAttribute("value");
			int incqty1 = Integer.parseInt(qtyincrease1);
			inputcartqty.clear();
			inputcartqty.sendKeys("4");
			Thread.sleep(3000);
			String qtyincrease2 = inputcartqty.getAttribute("value");
			System.err.println(qtyincrease2);
			int incqty2 = Integer.parseInt(qtyincrease2);
			flag = incqty2 > incqty1;
			return flag;
		}

		// Sudhir 3-September
		public boolean qtyDecreaseMinusSignProductReskin() throws InterruptedException {
			Boolean flag = false;
			inputcartqty.clear();
			inputcartqty.sendKeys("9");
			String qtydecreace1 = inputcartqty.getAttribute("value");
			int decqty1 = Integer.parseInt(qtydecreace1);
			waitForElement(btntodecreaseqty).isEnabled();
			Thread.sleep(3000);
			assertTrue(clickOnButton(btntodecreaseqty));
			String qtydecrease2 = inputcartqty.getAttribute("value");
			System.err.println(qtydecrease2);
			int decqty2 = Integer.parseInt(qtydecrease2);
			flag = decqty1 > decqty2;
			return flag;
		}
		
		// Sudhir 3-September
		public boolean qtyDecreaseInputProductReskin() throws InterruptedException {
			Boolean flag = false;
			String qtydecrease1 = inputcartqty.getAttribute("value");
			int incqty1 = Integer.parseInt(qtydecrease1);
		    inputcartqty.clear();
			inputcartqty.sendKeys("4");
			Thread.sleep(3000);
			String qtydecrease2 = inputcartqty.getAttribute("value");
			int incqty2 = Integer.parseInt(qtydecrease2);
			flag = incqty1 > incqty2;
			return flag;
		}
		

	
	// RK 30 August
	public boolean validatingWishListDisplayed() {

		boolean isDisplayed = isDisplayed(tabWishList);
		return isDisplayed;

	}

	// RK 30 August
	public String getWishlistHeaderText() {

		String wishListHearderText = getText(wishListHearder);
		clickOnLink(tabWishList);
		return wishListHearderText;

	}

	public void clickOnwishListLink() throws InterruptedException {
		clickOnLink(tabWishList);
		Thread.sleep(1000);
	}

	public boolean isWishListBtnDisplayed() {

		boolean isDisplayed = isDisplayed(newWishListBtn);
		return isDisplayed;

	}

	public void clickOnNewwishListBtn() throws InterruptedException {
		if (isWishListBtnDisplayed()) {
			clickOnButton(newWishListBtn);
			Thread.sleep(2000);
		} else {
			logger.debug("wish list button is not diplayed");
		}
	}

	public boolean isWishListCreated() {
		boolean result = false;
		WebElement sValue = null;

		setInputText(createWishListInputField, "Auto_" + timeStamp);
		clickOnButton(saveBtn);
		System.out.println("wishListSelect :: " + wishListSelect.getText());
		waitForElement(wishListSelect);
		if (isDisplayed(wishListSelect)) {
			Select oSelect = new Select(wishListSelect);
			List<WebElement> elementList = oSelect.getOptions();
			int elementCount = elementList.size();
			for (int i = 0; i < elementCount; i++) {
				sValue = oSelect.getOptions().get(i);
				if (elementList.contains(sValue)) {
					logger.debug("wishlist :: " + sValue.getText() + " got created");
					result = true;
				} else {
					logger.debug("wishlist not created");
					result = false;
				}

			}
		}

		return result;

	}

	public boolean isWishListDeleted() throws InterruptedException {
		boolean result = false;
		WebElement sValue = null;
		if (isDisplayed(wishListSelect)) {
			Select oSelect = new Select(wishListSelect);
			List<WebElement> elementList = oSelect.getOptions();
			int elementCount = elementList.size();
			int i = 0;
			for (i = 0; i < elementCount; i++) {
				sValue = oSelect.getOptions().get(i);
				clickOnButton(deleteWishListBtn);
				assertTrue(clickOnButton(deleteBtn));
				oSelect = new Select(wishListSelect);
				elementList = oSelect.getOptions();
				elementCount = elementList.size();
				if (elementList.contains(sValue)) {
					logger.debug("wishlist not deleted");
					result = false;
				} else {
					logger.debug("wishlist :: " + sValue + " got deleted");
					if (i == 2) {
						break;
					}
					result = true;
				}

			}
		}

		else {
			logger.debug("No wishlist available");
			result = false;
		}

		return result;
	}

	public boolean isPersonalInfoUpdated(String actualMsg) {
		boolean result = false;
		waitForElement(genderField);
		Select oSelect = new Select(genderField);
		String genderList = oSelect.getFirstSelectedOption().getText();
		if (genderList.equals("Male")) {
			oSelect.selectByValue("F");

		}
		if (genderList.equals("Female")) {
			oSelect.selectByValue("M");
		}

		if (isDisplayed(updatePersonalInformation)) {
			clickOnButton(updatePersonalInformation);
			waitForElement(personalInformationUpdateMessage);
			assertEquals(getText(personalInformationUpdateMessage), actualMsg);
			result = true;

		}

		return result;

	}
}
