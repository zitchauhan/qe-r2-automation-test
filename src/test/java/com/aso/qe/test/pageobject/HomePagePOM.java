package com.aso.qe.test.pageobject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aso.qe.test.common.POMConstants;

public class HomePagePOM {
	//id, name, className, css, tagName, linkText, partialLinkText, xpath
	private static final Logger logger = Logger.getLogger(HomePagePOM.class);
	//@CacheLookup
	@FindBy(xpath = POMConstants.Clothing)
	public WebElement menuClothing;

	@FindBy(xpath = POMConstants.Shoes)
	public WebElement menuShoes;

	@FindBy(xpath = POMConstants.Go)
	public WebElement go;

	@FindBy(xpath = POMConstants.SearchPage)
	public WebElement Search_Page;
	@FindBy(xpath = POMConstants.SubMenu) public WebElement submenu;

	@FindBy(xpath="//div[@data-component='featuredCategory']//h3[text()='FEATURED CATEGORIES']")public WebElement secFeaturedCategory;

	@FindBy(xpath="//div[@data-component='featuredCategory']//div[@class='container pb-5']/div")public WebElement prdTileFeaturedCategory_Row;

	@FindBy(xpath="//a[@data-auid='HP_FC_Anchor_2']/h6")public WebElement prdTileFeaturedCategory;

	@FindBy(xpath = "//a[text()='golf']") public WebElement result1;
	@FindBy(xpath = "//a[text()='goop']") public WebElement result2;
	@FindBy(xpath = "//a[text()='goal']") public WebElement result3;
	@FindBy(xpath = "//a[text()='good']") public WebElement result4;
	@FindBy(xpath = "//a[text()='gold']") public WebElement result5;



	// RKA KER- 727 Start Web
	
	@FindBy(xpath="//*[contains(text(),'Sign In')]") public WebElement linkSignIn;
	@FindBy(xpath="//input[@id='logonId']")public WebElement inputEmail;
	@FindBy(xpath="//input[@id='logonPassword']") public WebElement inputPassword;
	@FindBy(xpath="//button[contains(text(),'Sign In')]") public WebElement buttonSignIn;
	@FindBy(xpath="//h1") public WebElement txtAccountSummary;
	@FindBy(xpath="//*[@id='logonErrorMessage']")public WebElement msgVerifyIncorrect;
	@FindBy(id="logonIdError") public WebElement msgVerifyEmail;
	@FindBy(id="logonPasswordError")public WebElement msgVerifyPassword;
	@FindBy(xpath="//*[@class='leftNavLinks']/*[2]/*") public WebElement tabPersonalInformation;
	@FindBy(xpath="//*[@class='leftNavLinks']/*[3]/*") public WebElement tabAddressBook;
	@FindBy(xpath="//*[@class='leftNavLinks']/*[4]/*") public WebElement tabWishList;
	@FindBy(xpath="//*[contains(text(),'Forgot your password?')]") public WebElement textForgotPasword;
	@FindBy(id="forgot-email") public WebElement inputForgetEmail;
	@FindBy(id="btnForgotPassword") public WebElement btnSubmit;
	
	
	//RKA  KER-727 Mobile
	
	@FindBy(xpath="(//*[contains(text(),'Sign In')])[2]") public WebElement  linkSignIn_M;
	@FindBy(xpath="//span[contains(text(),'Sign Out')]") public WebElement signout_M;
	@FindBy(xpath="//label[contains(text(),'MY ACCOUNT MENU')]")public WebElement btnMyaccountMenu_M;
	// KER- 727 END
	
	
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
	
	

}
