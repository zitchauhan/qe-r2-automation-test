package com.aso.qe.test.pageobject;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.aso.qe.test.common.POMConstants;

public class R1_HomePage_PO {
	//id, name, className, css, tagName, linkText, partialLinkText, xpath
	private static final Logger logger = Logger.getLogger(R1_HomePage_PO.class);

	@FindBy(xpath = POMConstants.SubMenu) public WebElement submenu;
	@FindBy(xpath="//div[@data-component='featuredCategory']//h3[text()='FEATURED CATEGORIES']")public WebElement secFeaturedCategory;
	@FindBy(xpath="//div[@data-component='featuredCategory']//div[@class='container pb-5']/div")public WebElement prdTileFeaturedCategory_Row;
	@FindBy(xpath="//a[@data-auid='HP_FC_Anchor_2']/h6")public WebElement prdTileFeaturedCategory;
	@FindBy(xpath = "//*[contains(text(),'You might try')]//following-sibling::div//a") public List<WebElement> SLRresults;   //SID 19-October
	
	@FindBy(xpath = "//a[text()='golf']") public WebElement result1;
	@FindBy(xpath = "//a[text()='good']") public WebElement result2;
	@FindBy(xpath = "//a[text()='glo']") public WebElement result3;
	@FindBy(xpath = "//a[text()='geo']") public WebElement result4;
	@FindBy(xpath = "//a[text()='goose']") public WebElement result5;
	@FindBy(xpath="//*[contains(text(),'Sign In')] | //*[contains(text(),'My Account')]") public WebElement linkSignIn;  //SID 19-September
	@FindBy(xpath="//input[@id='logonId']")public WebElement inputEmail;
	@FindBy(xpath="//input[@id='logonPassword']") public WebElement inputPassword;
	@FindBy(xpath="//button[contains(text(),'Sign In')]  | //button[contains(text(),'Sign in')]") public WebElement buttonSignIn;  //SID 19-September
	@FindBy(xpath="//*[@data-auid='Sign Out']") public WebElement buttonSignOut;// Added by HP 18 June_2019
	@FindBy(xpath="//*[@data-auid='Orders']") public WebElement txtAccountSummary;  //SID 19-September
	@FindBy(xpath="//*[@id='logonErrorMessage'] | //*[contains(@role,'alert') and contains(text(),'incorrect')]")public WebElement msgVerifyIncorrect;  //SID 19-September
	@FindBy(xpath="//*[@id='logonIdError'] | //*[contains(@role,'alert') and contains(text(),'Please enter email address')] | //*[@id='logonIdError'] | //*[contains(@role,'alert') and contains(text(),'Please enter an email address')]") public WebElement msgVerifyEmail; //SID modified 14-November
	@FindBy(xpath="//*[@id='logonPasswordError'] | //*[contains(@role,'alert') and contains(text(),'Please enter the Password')] | //*[@id='logonPasswordError'] | //*[contains(@role,'alert') and contains(text(),'Please enter the password')]")public WebElement msgVerifyPassword;  //SID modified 14-November
	@FindBy(xpath="//*[@data-auid='Profile']") public WebElement tabPersonalInformation;
	@FindBy(xpath="//h5[text()='PROFILE']") public WebElement headerProfile;
	@FindBy(xpath="//*[@data-auid='Profile_m']") public WebElement tabPersonalInformation_Mobile;//upadte anuj gupta 16 Oct
	@FindBy(xpath="//*[@data-auid='Address Book_m']") public WebElement tabAddressBookMobile;
	@FindBy(xpath="//*[@data-auid='Address Book']") public WebElement tabAddressBook;
	@FindBy(xpath="//h5[text()='ADDRESS BOOK']") public WebElement myAddressBook;
	@FindBy(xpath="//*[@data-auid='Wish List_m']") public WebElement tabWishListMobile;
	@FindBy(xpath="//*[@data-auid='Wish List']") public WebElement tabWishList;
	@FindBy(xpath="//h5[text()='WISH LIST']") public WebElement myWishList;
	@FindBy(xpath="//*[contains(text(),'Forgot your password?')] | //*[text()='Forgot your password ?']") public WebElement textForgotPasword; //SID 19-September
	@FindBy(xpath="//*[@id='forgot-email'] | //*[@data-auid='email_input']") public WebElement inputForgetEmail; //SID 19-September
	@FindBy(xpath="//*[@id='btnForgotPassword'] | //*[@data-auid='btnsubmit_btn']") public WebElement btnSubmit;  //SID 19-September
	
	
	//RKA  KER-727 Mobile
	
	//@FindBy(xpath="(//*[contains(text(),'Sign In')])[4]") public WebElement  linkSignIn_M;/RKA 8 aug
	@FindBy(xpath="//*[@data-auid='signInCta_m']")public WebElement  linkSignIn_M;
	@FindBy(xpath="//*[contains(text(),'Sign Out')]") public WebElement signout_M;
	@FindBy(xpath="//*[@data-auid='myAccountCta_m']")public WebElement btnMyaccountMenu_M;
	// KER- 727 END
	//KER-710 Start
	//@FindBy(xpath="//*[text()='SHOP']") public WebElement btnShop;/RKA 8 aug
		@FindBy(xpath="//*[@data-auid='level1Category-SHOP']/*[1] | //*[@data-auid='level1Category-Shop']")public WebElement btnShop;
		
		//@FindBy(xpath="(//*[text()='SHOES'])[1]") public WebElement btnShoe;/RKA 8 aug
		@FindBy(xpath="//*[@data-auid='level2Category-Shoes'] | //*[@data-auid='level2Category-Shoes & Boots']  | //*[@data-auid='level2Category-Shoes + Boots'] ")public WebElement btnShoe;  //SID 1-Sept
		//@FindBy(xpath="//*[text()='Boys Shoes']")public WebElement btnBoysShoe;/RKA 8 aug
		@FindBy(xpath="//*[@data-auid=\"level3Category-Boys' Shoes\"]/a | //*[@data-auid=\"level3Category-Boys' Shoes_m\"]")public WebElement btnBoysShoe; //SID 19-Nov
	
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
	@FindBy(xpath="(//*[@class='c-price__sub css-1f28zyy e1xaasfo1'])/*[2]") public List<WebElement> productPrices;    //SID 25-October
	@FindBy(xpath="(//*[@class='c-price__sub css-1f28zyy e1xaasfo1'])/*[2]/following-sibling::sup") public List<WebElement> productPricesCent;  //SID 25-October
	
	
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
	@FindBy(xpath="//*[@data-auid='level2Category-Shoes_m'] | //*[@data-auid='level2Category-Shoes & Boots_m']")public WebElement btnShop_M;  //SID Modified 14-Nov
	@FindBy(xpath="//*[contains(@data-auid,\"level3Category-Men's Shoes_m\")]")public WebElement btnMenShoe_M;  //SID Modified 14-Nov
	@FindBy(xpath="//*[@data-auid=\"go-to-Men's Shoes_m\"]") public WebElement btnMenShoe_M_landing;  //SID 28-August
	@FindBy(xpath="//*[@data-auid='level4Category-Athletic & Sneakers_m']")public WebElement btnAtheletic_Sneker_M; //SID 14-Nov
	@FindBy(xpath="//*[@data-auid=\"level3Category-Boys' Shoes\"]//*[@data-auid='level4Category-Athletic & Sneakers'] | //*[@data-auid='level4Category-Athletic & Sneakers']")public WebElement btnAthleticBoyShoe; //Sid 14-Nov
	@FindBy(xpath="//*[@data-auid='level4Category-Athletic & Sneakers_m']")public WebElement btnAthleticBoyShoe_M; //Sid 14-Nov
	
	
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
	
	@FindBy(xpath="//*[@data-component='recommendations']//button/parent::div//a") public WebElement productCarousel; //SID 4-September
	@FindBy(xpath="//*[contains(@class,'ReactModal__Content ReactModa')]//*[contains(@id,'evergage')]//*[contains(@class,'swiper-slide-active')] | //*[contains(@id,'evergage')]//*[contains(@class,'swiper-slide-active')]") public WebElement productRecommendation; //SID Modified 21-October
	
	
//	@FindBy(xpath="//*[contains(@class,'swiper-container d')]/*[1]/*[1]")public WebElement productCarousel_1; //SID 4-September
//	@FindBy(xpath="//*[contains(@class,'swiper-container d')]/*[1]/*[2]")public WebElement productCarousel_2; //SID 4-September
//	@FindBy(xpath="//*[contains(@class,'swiper-container d')]/*[1]/*[3]")public WebElement productCarousel_3; //SID 4-September
//	@FindBy(xpath="//*[contains(@class,'swiper-container d')]/../preceding-sibling::*[2]")public WebElement productCarousel_right; //SID 4-September
//	@FindBy(xpath="//*[contains(@class,'swiper-container d')]/../preceding-sibling::*[1]")public WebElement productCarousel_left; //SID 4-September
	@FindBy(xpath="(//*[@data-component='recommendations']//button)[2]") public WebElement productCarousel_right;  //SID 4-September
	@FindBy(xpath="(//*[@data-component='recommendations']//button)[1]") public WebElement productCarousel_left; //SID 4-September
	
	
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

	@FindBy(xpath="//*[@data-component='recommendations']//button/parent::div//span[@role='button']")public WebElement productRecommendationIndicator; //SID 4-September
//	@FindBy(xpath="//*[contains(@class,'swiper-container d')]/*[2]/*[1]")public WebElement productCarouselIndicator_1;  //SID 4-September
	
	@FindBy(xpath="//*[@class='css-bqgxsk']")public WebElement BranditemCount; 	
	

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
		int min=0,price,count=0,cent=99,prevCent;
		for(WebElement productPrice:productPrices) {
			String priceString = productPrice.getText();
		System.err.println(priceString);
		price = Integer.parseInt(priceString);
		prevCent = cent;
		cent = Integer.parseInt(productPricesCent.get(count).getText());
		System.err.println(price +"."+cent);
		// System.err.println(third_t);
		// System.err.println(forth_f);
		if (min <= price) {
			if (min == price) {
				boolean flag1 = false;
				if (prevCent <= cent) {
					flag1 = true;
					min = price;
				}
				else {
					Assert.fail();
				}
			} else {
				min = price;
				flag = true;
			}
		}
		else {
			flag = false;
			break;
		}
		count++;
	}
	return flag;
		
		
		
	}
	
	
	
	// SID 1-September
	public boolean comparePriceHighToLow() throws Exception {
		Boolean flag = false;
		int max = 999999, price,count=0,cent=99,prevCent;
		for (WebElement productPrice : productPrices) {
			String priceString = productPrice.getText();
			System.err.println(priceString);
			price = Integer.parseInt(priceString);
			prevCent = cent;
			cent = Integer.parseInt(productPricesCent.get(count).getText());
			System.err.println(price +"."+cent);
			// System.err.println(third_t);
			// System.err.println(forth_f);
			if (max >= price) {
				if (max == price) {
					boolean flag1 = false;
					if (prevCent >= cent) {
						flag1 = true;
						max = price;
						
					}
					else {
						Assert.fail();
					}
				} else {
					max = price;
					flag = true;
				}
			}
			else {
				flag = false;
				break;
			}
			count++;
			Thread.sleep(3000);
		}
		return flag;
	}
}
