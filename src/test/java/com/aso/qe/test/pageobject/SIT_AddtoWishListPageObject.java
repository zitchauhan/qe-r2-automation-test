package com.aso.qe.test.pageobject;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aso.qe.framework.common.CommonActionHelper;

public class SIT_AddtoWishListPageObject extends CommonActionHelper{
	
	String timeStamp = new SimpleDateFormat("MM.dd.HH.mm.ss").format(new Date());  //Sid
	
	@FindBy(xpath="//div[@data-auid='PDP_AddToWishList']") public WebElement lnkaddtowishlist;
	@FindBy(xpath="//button[@id='newWishListBtn']") public  WebElement btnNewWishlist;
	@FindBy(xpath="//h2[@id='createWishListModalTitle']") public  WebElement tltCreatewishlist;
	@FindBy(xpath="//input[@id='createWishListInputField']") public  WebElement txtListname;
	@FindBy(xpath="//button[@id='add_cancel']") public  WebElement btncancel;
	@FindBy(xpath="//input[@id='add_save']") public  WebElement btnsave;
//	@FindBy(xpath="//select[@id='wishListSelect']") public  WebElement txtwishlistselect;
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
	
	
	public void enterListName() throws Exception {
		setInputText(txtListname, timeStamp);
	}
	
	public void renameWishListName() throws Exception {
		timeStamp = new SimpleDateFormat("MM.dd.HH.mm.ss").format(new Date());
		setInputText(txtrenamewishlistselect, timeStamp);
	}
	
		

}
