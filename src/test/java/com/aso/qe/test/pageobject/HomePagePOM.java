package com.aso.qe.test.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aso.qe.test.common.POMConstants;

import org.apache.log4j.Logger;

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
