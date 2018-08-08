package com.aso.qe.test.pageobject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.common.POMConstants;

public class SIT_HomePagePageObject extends CommonActionHelper {

	private static final Logger logger = Logger.getLogger(SIT_HomePagePageObject.class);
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

	@FindBy(xpath="//div[@class='col-4 sc-product-card'][2]")public static WebElement ShopCollectionProductcard;
	@FindBy(xpath="//*[@data-auid='btnbtn1']")public static WebElement ShopCollectionCTA;
	
	//@FindBy(xpath="//div[text()='Clearance']//following-sibling::img")public static WebElement BestSellerproduct;
	
	@FindBy(xpath="//*[contains(@data-auid,'data-auiddata-auid')]/div/div[2]")public static WebElement ShopCollectionL3;
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

