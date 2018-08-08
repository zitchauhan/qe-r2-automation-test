package com.aso.qe.test.pageobject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aso.qe.test.common.POMConstants;

public class HomePagePOM {
	//id, name, className, css, tagName, linkText, partialLinkText, xpath
	private static final Logger logger = Logger.getLogger(HomePagePOM.class);

	@FindBy(xpath = POMConstants.SubMenu) public WebElement submenu;
	@FindBy(xpath="//div[@data-component='featuredCategory']//h3[text()='FEATURED CATEGORIES']")public WebElement secFeaturedCategory;
	@FindBy(xpath="//div[@data-component='featuredCategory']//div[@class='container pb-5']/div")public WebElement prdTileFeaturedCategory_Row;
	@FindBy(xpath="//a[@data-auid='HP_FC_Anchor_2']/h6")public WebElement prdTileFeaturedCategory;
	@FindBy(xpath = "//a[text()='golf']") public WebElement result1;
	@FindBy(xpath = "//a[text()='goop']") public WebElement result2;
	@FindBy(xpath = "//a[text()='goal']") public WebElement result3;
	@FindBy(xpath = "//a[text()='good']") public WebElement result4;
	@FindBy(xpath = "//a[text()='goofy']") public WebElement result5;
	@FindBy(xpath="//*[contains(text(),'Sign In')]") public WebElement linkSignIn;
	@FindBy(xpath="//input[@id='logonId']")public WebElement inputEmail;
	@FindBy(xpath="//input[@id='logonPassword']") public WebElement inputPassword;
	@FindBy(xpath="//button[contains(text(),'Sign In')]") public WebElement buttonSignIn;
	@FindBy(xpath="//h1") public WebElement txtAccountSummary;
	@FindBy(xpath="//*[@id='logonErrorMessage']")public WebElement msgVerifyIncorrect;
	@FindBy(xpath="//*[@id='logonIdError") public WebElement msgVerifyEmail;
	@FindBy(xpath="//*[@id='logonPasswordError']")public WebElement msgVerifyPassword;
	@FindBy(xpath="//*[@class='leftNavLinks']/*[2]/*") public WebElement tabPersonalInformation;
	@FindBy(xpath="//*[@class='leftNavLinks']/*[3]/*") public WebElement tabAddressBook;
	@FindBy(xpath="//*[@class='leftNavLinks']/*[4]/*") public WebElement tabWishList;
	@FindBy(xpath="//*[contains(text(),'Forgot your password?')]") public WebElement textForgotPasword;
	@FindBy(xpath="//*[@id='forgot-email']") public WebElement inputForgetEmail;
	@FindBy(xpath="//*[@id='btnForgotPassword']") public WebElement btnSubmit;
	
	
	//RKA  KER-727 Mobile
	
	@FindBy(xpath="(//*[contains(text(),'Sign In')])[2]") public WebElement  linkSignIn_M;
	@FindBy(xpath="//*[contains(text(),'Sign Out')]") public WebElement signout_M;
	@FindBy(xpath="//*[contains(text(),'MY ACCOUNT MENU')]")public WebElement btnMyaccountMenu_M;
	// KER- 727 END
	//KER-710 Start
	@FindBy(xpath="//*[text()='SHOP']") public WebElement btnShop;
	@FindBy(xpath="(//*[text()='SHOES'])[1]") public WebElement btnShoe;
	@FindBy(xpath="//*[text()='Boys Shoes']")public WebElement btnBoysShoe;
	@FindBy(xpath="//*[@data-auid='shopByCategory_0']") public WebElement optionFirstClick;
	@FindBy(xpath="//*[contains(text(),'Sort by')]/following-sibling::*[1]")public WebElement sortByOption;
	@FindBy(xpath="//span[contains(text(),'Price (Low-High)')]") public WebElement selPriceLowToHigh;
	@FindBy(xpath="//span[contains(text(),'Price (High-Low)')]") public WebElement selPriceHighToLow;
	
	@FindBy(xpath="(//*[@class=\"mt-half\"]/*/*[2])[3]") public WebElement firstProductPrice;
	@FindBy(xpath="(//*[@class=\"mt-half\"]/*/*[2])[4]") public WebElement secondProductPrice;
	@FindBy(xpath="(//*[@class=\"mt-half\"]/*/*[2])[5]") public WebElement thirdProductPrice;
	@FindBy(xpath="(//*[@class=\"mt-half\"]/*/*[2])[6]") public WebElement forthProductPrice;
	
	
	
	//KER-710 Mobile
	@FindBy(xpath="(//*[text()='SHOES'])[2]")public WebElement btnShoe_M;
	@FindBy(xpath="(//*[text()='Boys Shoes'])[2]")public WebElement btnBoysShoe_M;
	@FindBy(xpath="(//h2)[1]") public WebElement headline_M;
	@FindBy(xpath="//*[@data-auid='sort_by']") public WebElement sortBy_M;
	@FindBy(xpath="//select")public WebElement selectbySortBy;
	
	
	
	//KER -710 END
	
	
	
	
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
