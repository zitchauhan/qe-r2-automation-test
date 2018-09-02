package com.aso.qe.test.pageobject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.aso.qe.test.common.POMConstants;

public class R1_HomePage_PO {
	//id, name, className, css, tagName, linkText, partialLinkText, xpath
	private static final Logger logger = Logger.getLogger(R1_HomePage_PO.class);

	@FindBy(xpath = POMConstants.SubMenu) public WebElement submenu;
	@FindBy(xpath="//div[@data-component='featuredCategory']//h3[text()='FEATURED CATEGORIES']")public WebElement secFeaturedCategory;
	@FindBy(xpath="//div[@data-component='featuredCategory']//div[@class='container pb-5']/div")public WebElement prdTileFeaturedCategory_Row;
	@FindBy(xpath="//a[@data-auid='HP_FC_Anchor_2']/h6")public WebElement prdTileFeaturedCategory;
	@FindBy(xpath = "//a[text()='golf']") public WebElement result1;
	@FindBy(xpath = "//a[text()='good']") public WebElement result2;
	@FindBy(xpath = "//a[text()='glo']") public WebElement result3;
	@FindBy(xpath = "//a[text()='geo']") public WebElement result4;
	@FindBy(xpath = "//a[text()='goose']") public WebElement result5;
	@FindBy(xpath="//*[contains(text(),'Sign In')]") public WebElement linkSignIn;
	@FindBy(xpath="//input[@id='logonId']")public WebElement inputEmail;
	@FindBy(xpath="//input[@id='logonPassword']") public WebElement inputPassword;
	@FindBy(xpath="//button[contains(text(),'Sign In')]") public WebElement buttonSignIn;
	@FindBy(xpath="//h1[@id='landingTitle' and text()='Account Summary']") public WebElement txtAccountSummary;
	@FindBy(xpath="//*[@id='logonErrorMessage']")public WebElement msgVerifyIncorrect;
	@FindBy(xpath="//*[@id='logonIdError']") public WebElement msgVerifyEmail;
	@FindBy(xpath="//*[@id='logonPasswordError']")public WebElement msgVerifyPassword;
	@FindBy(xpath="//*[@class='leftNavLinks']/*[2]/*") public WebElement tabPersonalInformation;
	@FindBy(xpath="//*[@class='leftNavLinks']/*[3]/*") public WebElement tabAddressBook;
	@FindBy(xpath="//*[@class='leftNavLinks']/*[4]/*") public WebElement tabWishList;
	@FindBy(xpath="//*[contains(text(),'Forgot your password?')]") public WebElement textForgotPasword;
	@FindBy(xpath="//*[@id='forgot-email']") public WebElement inputForgetEmail;
	@FindBy(xpath="//*[@id='btnForgotPassword']") public WebElement btnSubmit;
	
	
	//RKA  KER-727 Mobile
	
	//@FindBy(xpath="(//*[contains(text(),'Sign In')])[4]") public WebElement  linkSignIn_M;/RKA 8 aug
	@FindBy(xpath="//*[@data-auid='signInCta_m']")public WebElement  linkSignIn_M;
	@FindBy(xpath="//*[contains(text(),'Sign Out')]") public WebElement signout_M;
	@FindBy(xpath="//*[contains(text(),'MY ACCOUNT MENU')]")public WebElement btnMyaccountMenu_M;
	// KER- 727 END
	//KER-710 Start
	//@FindBy(xpath="//*[text()='SHOP']") public WebElement btnShop;/RKA 8 aug
		@FindBy(xpath="//*[@data-auid='level1Category-SHOP']/*[1]")public WebElement btnShop;
		
		//@FindBy(xpath="(//*[text()='SHOES'])[1]") public WebElement btnShoe;/RKA 8 aug
		@FindBy(xpath="//*[@data-auid='level2Category-Shoes'] | //*[@data-auid='level2Category-Shoes & Boots']")public WebElement btnShoe;  //SID 1-Sept
		//@FindBy(xpath="//*[text()='Boys Shoes']")public WebElement btnBoysShoe;/RKA 8 aug
		@FindBy(xpath="//*[contains(@data-auid,'level3Category-Boys')]/*[1]")public WebElement btnBoysShoe;
	
	@FindBy(xpath="//*[@data-auid='shopByCategory_0']") public WebElement optionFirstClick;
	@FindBy(xpath="//*[contains(text(),'Sort by')]/following-sibling::*[1]")public WebElement sortByOption;
	@FindBy(xpath="//span[contains(text(),'Price (Low-High)')]") public WebElement selPriceLowToHigh;
	@FindBy(xpath="//span[contains(text(),'Price (High-Low)')]") public WebElement selPriceHighToLow;
	@FindBy(xpath="//span[contains(text(),'Brand (A-Z)')]")public WebElement selAtoB;
	@FindBy(xpath="//span[contains(text(),'Best Selling')]")public WebElement selBestSelling;  //SID 16-August
//	@FindBy(xpath="(//*[@class=\"mt-half\"]/*/*[2])[3]") public WebElement firstProductPrice;/RKA 8 july
//	@FindBy(xpath="(//*[@class=\"mt-half\"]/*/*[2])[4]") public WebElement secondProductPrice;/RKA 8 july
//	@FindBy(xpath="(//*[@class=\"mt-half\"]/*/*[2])[5]") public WebElement thirdProductPrice;/RKA 8 july
//	@FindBy(xpath="(//*[@class=\"mt-half\"]/*/*[2])[6]") public WebElement forthProductPrice;/RKA 8 july

	@FindBy(xpath="(//*[@class='c-price__sub css-1f28zyy e1xaasfo1'])[1]/*[2]") public WebElement firstProductPrice;
	@FindBy(xpath="(//*[@class='c-price__sub css-1f28zyy e1xaasfo1'])[2]/*[2]") public WebElement secondProductPrice;
	@FindBy(xpath="(//*[@class='c-price__sub css-1f28zyy e1xaasfo1'])[3]/*[2]") public WebElement thirdProductPrice;
	@FindBy(xpath="(//*[@class='c-price__sub css-1f28zyy e1xaasfo1'])[4]/*[2]") public WebElement forthProductPrice;
	
	@FindBy(xpath="(//*[contains(@class,'c-product__title')])[1]")public WebElement firstBrandName;
	@FindBy(xpath="(//*[contains(@class,'c-product__title')])[2]")public WebElement secondBrandName;
	@FindBy(xpath="(//*[contains(@class,'c-product__title')])[3]")public WebElement thirdBrandName;
	@FindBy(xpath="(//*[contains(@class,'c-product__title')])[4]")public WebElement forthBrandName;
	@FindBy(xpath="//*[@data-auid='facetdrawer_drawer_Brand']")public WebElement brandFacet;
	@FindBy(xpath="(//*[@data-auid='facetdrawer_drawer_Brand']//*[contains(@data-auid,'drawer_')])[2]")public WebElement brandFacetAddidas;  //SID 24-August
	
	@FindBy(xpath="//*[@data-auid='shopByCategory_tiles']/*[1]")public WebElement firstItemL2;
	@FindBy(xpath="//*[@data-auid='clearAll']/preceding-sibling::*")public WebElement verifyAddidasFromClearAll;
	//KER-710 Mobile
	//@FindBy(xpath="(//*[text()='SHOES'])[2]")public WebElement btnShoe_M;/RKA 9 aug
	@FindBy(xpath="//*[@data-auid='level2Category-Shoes_m']")public WebElement btnShoe_M;
	//@FindBy(xpath="(//*[text()='Boys Shoes'])[2]")public WebElement btnBoysShoe_M;/RKA 9 aug
	@FindBy(xpath="//*[@data-auid='level4Category-Boots_m']")public WebElement btnBoysShoe_M;
	@FindBy(xpath="(//h2)[1]") public WebElement headline_M;
	@FindBy(xpath="//*[@data-auid='sort_by']") public WebElement sortBy_M;
	@FindBy(xpath="//select")public WebElement selectbySortBy;
	
	@FindBy(xpath="//*[@data-auid='facetdrawer_drawer_Brand_m']")public WebElement brandFacet_M;
//	@FindBy(xpath="//*[@data-auid='facetdrawer_drawer_Brand_m']//*[@data-auid='drawer_Adidas_m']")public WebElement brandFacetAddidas_M;/RKA 24 aug
	@FindBy(xpath="//*[@data-auid='facetdrawer_drawer_Brand_m']//*[@data-auid='drawer_adidas_m']")public WebElement brandFacetAddidas_M;
	@FindBy(xpath="//*[@data-auid='level2Category-Shoes_m']")public WebElement btnShop_M;
	@FindBy(xpath="//*[contains(@data-auid,'level3Category-Men')]")public WebElement btnMenShoe_M;
	@FindBy(xpath="//*[@data-auid=\"go-to-Men's Shoes_m\"]") public WebElement btnMenShoe_M_landing;  //SID 28-August
	@FindBy(xpath="//*[@data-auid='level4Category-Athletic & Sneakers_m']")public WebElement btnAtheletic_Sneker_M;
	
	
	
	
	//KER -710 END
	
	
	//KER-3184
	@FindBy(xpath="(//*[contains(text(),'SHOP GIFT CARDS')])[1]")public WebElement btnShopGiftCards;
	@FindBy(xpath="//*[contains(text(),'Shop Bulk Gift Cards')]")public WebElement btnShopBulkGiftCards;
	@FindBy(xpath="(//*[contains(text(),'Check Balance')])[2]") public WebElement btnCheckBalance_CTA;
	@FindBy(xpath="(//*[contains(text(),'Shop Bulk Gift Cards')])[2]")public WebElement btnShopBulkGiftCards_M;
	@FindBy(xpath="(//*[contains(text(),'Check Balance')])[3]") public WebElement btnCheckBalance_CTA_M;
	@FindBy(xpath="(//*[contains(text(),'SHOP GIFT CARDS')])[2]")public WebElement btnShopGiftCards_M;
	//KER-3184 end	
	
	//KER-258 Start 
//	@FindBy(xpath="(//*[@data-auid='HP_PC_A_0'])[1]/ancestor::*[1]/following-sibling::*[5]")public WebElement productCarousel_1;/RKA 16 aug
//	@FindBy(xpath="(//*[@data-auid='HP_PC_A_0'])[1]/ancestor::*[1]/following-sibling::*[6]")public WebElement productCarousel_2;/RKA 16 aug
//	@FindBy(xpath="(//*[@data-auid='HP_PC_A_0'])[1]/ancestor::*[1]/following-sibling::*[7]")public WebElement productCarousel_3;/RKA 16 aug
//	@FindBy(xpath="(//*[@data-auid='HP_PC_A_0'])[1]/ancestor::*[4]/following-sibling::*[2]")public WebElement productCarousel_right;/RKA 16 AUG
//	@FindBy(xpath="(//*[@data-auid='HP_PC_A_0'])[1]/ancestor::*[4]/following-sibling::*[1]")public WebElement productCarousel_left;/RKA 16 AUG
	
	
	@FindBy(xpath="//*[contains(@class,'swiper-container d')]/*[1]/*[1]")public WebElement productCarousel_1;
	@FindBy(xpath="//*[contains(@class,'swiper-container d')]/*[1]/*[2]")public WebElement productCarousel_2;
	@FindBy(xpath="//*[contains(@class,'swiper-container d')]/*[1]/*[3]")public WebElement productCarousel_3;
	@FindBy(xpath="//*[contains(@class,'swiper-container d')]/../preceding-sibling::*[2]")public WebElement productCarousel_right;
	@FindBy(xpath="//*[contains(@class,'swiper-container d')]/../preceding-sibling::*[1]")public WebElement productCarousel_left;
	//Mobile
	//@FindBy(xpath="(//*[@data-auid='HP_PC_A_0'])[4]/*/*[1]")public WebElement imgProductCarousel_M;/RKA 16 aug
	@FindBy(xpath="//*[contains(@class,'col-8 col-md-4 pc')]")public WebElement imgProductCarousel_M;
	//KER-258 End
	
	//KER-260 Start
	@FindBy(xpath="(//*[@data-component='heroImage'])[1]")public WebElement imgHero;
	@FindBy(xpath="(//*[@data-auid='btnHP_HI_A_0'])[1]")public WebElement btnShopNowHeroImage;
	@FindBy(xpath="//*[@data-auid='sectionTitle']")public WebElement txtSectionTitle;
	//KER- 260 End
	
	//KER-259 Start
//	@FindBy(xpath="(//*[@data-auid='HP_PC_A_0'])[1]/ancestor::*[4]/*/*[2]/*[2]")public WebElement productCarouselIndicator_2;/RKA 16 aug
//	@FindBy(xpath="(//*[@data-auid='HP_PC_A_0'])[1]/ancestor::*[4]/*/*[2]/*[1]")public WebElement productCarouselIndicator_1;/RKA 16 aug

	@FindBy(xpath="//*[contains(@class,'swiper-container d')]/*[2]/*[2]")public WebElement productCarouselIndicator_2;
	@FindBy(xpath="//*[contains(@class,'swiper-container d')]/*[2]/*[1]")public WebElement productCarouselIndicator_1;
	
	//KER-259 End
	
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
	
	
	// SID 1-September
	public boolean comparePriceLowtohigh() {
		Boolean flag = false;
		String first = firstProductPrice.getText();
		String Second = secondProductPrice.getText();
		String third = thirdProductPrice.getText();
		String forth = forthProductPrice.getText();
		Integer first_f = Integer.parseInt(first);
		Integer second_s = Integer.parseInt(Second);
		Integer third_t = Integer.parseInt(third);
		Integer forth_f = Integer.parseInt(forth);
		System.out.println(first_f + " " + second_s + " " + third_t + "  " + forth_f);
		if ((first_f <= second_s) && (second_s <= third_t) && (third_t <= forth_f)) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}
	
	// SID 1-September
	public boolean comparePriceHighToLow() {
		Boolean flag = false;
		String first = firstProductPrice.getText();
		String Second = secondProductPrice.getText();
		String third = thirdProductPrice.getText();
		String forth = forthProductPrice.getText();
		Integer first_f = Integer.parseInt(first);
		Integer second_s = Integer.parseInt(Second);
		Integer third_t = Integer.parseInt(third);
		Integer forth_f = Integer.parseInt(forth);
		System.out.println(first_f + " " + second_s + " " + third_t + "  " + forth_f);
		if ((first_f >= second_s) && (second_s >= third_t) && (third_t >= forth_f)) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}
}
