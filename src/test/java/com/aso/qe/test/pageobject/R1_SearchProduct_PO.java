package com.aso.qe.test.pageobject;

import java.util.List;
import static org.junit.Assert.assertTrue;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.stepdefinition.web.Common_Web_SD;

public class R1_SearchProduct_PO extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(R1_SearchProduct_PO.class);
	public static int productDisplayCount;
	@FindBy(xpath = "//*[@class='col-4 o-copy__16bold']")
	public static WebElement itemscount;
	@FindBy(xpath = "//*[@data-auid='search-input']")
	public static WebElement searchTextBox;
	@FindBy(xpath = "//*[@data-auid='search-input_m']")
	public static WebElement searchTextBoxMobile;
	@FindBy(xpath = "//span[contains(text(),'Filters')]")
	public WebElement filterTitleBtn;
	@FindBy(xpath = "//*[@data-auid='search-clear-button']/span | //*[@data-auid='submitSearchButton']")
	public static WebElement submitGOBtn;
	@FindBy(xpath = "//*[@data-auid='search-clear-button_m']")
	public static WebElement submitGOBtnMobile;
	@FindBy(xpath = "//a[@title='Close Message']")
	public WebElement popupCloseBtn;
	@FindBy(xpath = "//*[@data-auid='shopByCategory_11']")
	public WebElement btnBuyNowHeroImage;
	@FindBy(xpath = "//*[@id='catalogEntry_img756331']")
	public WebElement img_men_pant;
	@FindBy(xpath = "//*[contains(@data-auid,'facetdrawer_drawer_Category')]//i[@class='academyicon icon-minus']")
	public WebElement txtCategoryFacetOpen;
	@FindBy(xpath = "//*[contains(@data-auid,'facetdrawer_drawer_Category_m')]//i[@class='academyicon icon-minus']")
	public WebElement txtCategoryFacetOpenMobile;
	@FindBy(xpath = "//*[contains(@data-auid,'facetdrawer_drawer_Category_m')]//i[@class='academyicon icon-plus']")
	public WebElement openCategoryFacetMobile; // SID 28-August
	@FindBys({ @FindBy(xpath = "//div[@class='selectedfacet-container']") })
	public List<WebElement> selectedfacet_containerList;
	@FindBy(xpath = "//*[contains(text(),'Clear All')]")
	public WebElement clearAllfacet_containerMobile;
	@FindBy(xpath = "//*[contains(text(),'Apply')]")
	public WebElement applyFilterfacet_containerMobile;
	@FindBy(xpath = "//div[starts-with(@id, 'offerPrice_')]")
	public WebElement productPrice;
	@FindBys({ @FindBy(xpath = "//div[@class='css-13vdsd2']//following-sibling::span") })
	public List<WebElement> productPriceList;
	@FindBys({ @FindBy(xpath = "//*[contains(@class,'c-price__sub')]") })
	public List<WebElement> productList;
	@FindBy(xpath = "(//*[@data-auid='facetdrawer_drawer_Brand'])[2]")
	public WebElement brandBtn;
	@FindBy(xpath = "//label[@for='-10026583736783']")
	public WebElement brandCheckBoxASICS;
	@FindBys({ @FindBy(xpath = "//*[@class='product-grid-container col-12']")// "//section[@id='facet_price']/ul/li")
	})
	public List<WebElement> facet_Brand_Names_List;
	@FindBy(xpath = "//*[@data-auid='facetdrawer_drawer_Brand']//i")
	public WebElement filterBrandPlusBtn;
	@FindBys({ @FindBy(xpath = "//ul[@class='filter-list-item']") })
	public List<WebElement> facet_price_CheckBox_List;
	@FindBys({ @FindBy(xpath = "//*[@data-auid='facetdrawer_drawer_Price_m']//ul/li") })
	public List<WebElement> facet_Price_CheckBox_ListMobile;
	@FindBys({ @FindBy(xpath = "//*[@data-auid='facetdrawer_drawer_Color_m']//ul") })
	public List<WebElement> facet_Color_CheckBox_ListMobile;
	@FindBys({ @FindBy(xpath = "//*[@data-auid='facetdrawer_drawer_Price']//ul/li") })
	public List<WebElement> facet_Price_CheckBox_List; // SID 8-August-18
	@FindBys({ @FindBy(xpath = "//*[@data-auid='facetdrawer_drawer_Gender']//ul") })
	public List<WebElement> facet_Gender_CheckBox_List;
	@FindBys({ @FindBy(xpath = "//*[@data-auid='facetdrawer_drawer_Brand']//ul") })
	public List<WebElement> facet_Brand_CheckBox_List;
	@FindBys({ @FindBy(xpath = "//*[@data-auid='facetdrawer_drawer_Color']//ul") })
	public List<WebElement> facet_Color_CheckBox_List;

	@FindBy(xpath = "//*[@data-auid='facetdrawer_drawer_Color']//i")
	public WebElement filterColorPlusBtn;
	@FindBy(xpath = "//*[@data-auid='facetdrawer_drawer_Price']//i")
	public WebElement filterPricePlusBtn;
	@FindBy(xpath = "//*[@data-auid='facetdrawer_drawer_Gender']//i")
	public WebElement filterGenderPlusBtn;
	@FindBy(xpath = "//*[@data-auid='facetdrawer_drawer_Price_m']//span")
	public WebElement filterPriceBtn;
	@FindBy(xpath = "//span[@data-facet-id='1000349']")
	public WebElement priceCheckBoxUnder10;
	@FindBy(xpath = "//span[@id='counter_1000349']")
	public WebElement priceCheckBoxUnder10Count;
	@FindBy(xpath = "//span[contains(text(),'$10 - $19.99')]")
	public WebElement priceCheckBoxFrom10to20;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[7]/div[1]/section[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/label[1]/span[2]")
	public WebElement priceCheckBoxFrom10to20Count;
	@FindBy(xpath = "//span[@data-facet-id='1000351']")
	public WebElement priceCheckBoxFrom20to50;
	@FindBy(xpath = "//span[@data-facet-id='1000352']")
	public WebElement priceCheckBoxFrom100to200;
	@FindBy(xpath = "//section[@id='facet_gender']//button[@type='button']")
	public WebElement genderBtn;
	@FindBy(xpath = "//span[@data-facet-id='-187376510011710811611539']")
	public WebElement genderFilterAdults;
	@FindBy(xpath = "//span[@id='counter_-187376510011710811611539']")
	public WebElement genderFilterAdultsCount;
	@FindBy(xpath = "//section[@id='facet_color']//button[@type='button']")
	public WebElement colorBtn;
	// @FindBy(xpath="//*[contains(text(), \"We couldn't find anything for\")]")
	// public WebElement productNotFound;

	@FindBy(xpath = "//span[@data-facet-id='-3716661089799107']")
	public WebElement blackColour;
	@FindBy(xpath = "//span[@id='counter_-3716661089799107']")
	public WebElement blackColourProductCount;
	@FindBys({ @FindBy(xpath = "//i[@class='academyicon icon-plus']") })
	public List<WebElement> filterIconPlusList;
	@FindBys({ @FindBy(xpath = "//i[@class='academyicon icon-minus']") })
	public List<WebElement> filterIconMinusList;
	@FindBys({ @FindBy(xpath = "//ui[@class='filter-list-item']") })
	public List<WebElement> chkbox_price;
	@FindBys({
			@FindBy(xpath = "//*[@data-auid='facetdrawer_drawer_Price_m']//label[contains(@class,'icon-checkbox-active')] | //*[@data-auid='facetdrawer_drawer_Price']//*[contains(@class,'checkbox-active')]") })
	public List<WebElement> chkbox_price_selected;
	@FindBys({
			@FindBy(xpath = "//*[@data-auid='facetdrawer_drawer_Price_m']//label[contains(@class,'icon-checkbox-inactive')]|//*[@data-auid='facetdrawer_drawer_Price']//*[contains(@class,'checkbox-inactive')]") })
	public List<WebElement> chkbox_price_deselected;
	@FindBy(xpath = "//*[@data-auid='drawer_$20 - $49.99']")
	public WebElement chkbox_PriceOption1;
	@FindBy(xpath = "//*[@data-auid='drawer_$50 - $99.99']")
	public WebElement chkbox_PriceOption2;
	@FindBy(xpath = "//*[@data-auid='drawer_$100 - $199.99']")
	public WebElement chkbox_PriceOption3;
	@FindBy(xpath = "(//i[@class='academyicon icon-checkbox-active'])[1]")
	public WebElement chkbox_PriceOption1_Selected;
	@FindBy(xpath = "(//i[@class='academyicon icon-checkbox-active'])[2]")
	public WebElement chkbox_PriceOption2_Selected;
	@FindBy(xpath = "(//i[@class='academyicon icon-checkbox-active'])[1]")
	public WebElement chkbox_PriceOption3_Selected;
	@FindBy(xpath = "(//i[@class='academyicon icon-checkbox-inactive'])[1]")
	public WebElement chkbox_PriceOption1_deSelected;
	@FindBy(xpath = "(//i[@class='academyicon icon-checkbox-inactive'])[2]")
	public WebElement chkbox_PriceOption2_deSelected;
	@FindBy(xpath = "(//i[@class='academyicon icon-checkbox-inactive'])[1]")
	public WebElement chkbox_PriceOption3_deSelected;
	@FindBy(xpath = "//*[@data-auid='facetdrawerdrawer_-1000']")
	public WebElement chkbox_RelatedCategories;
	@FindBy(xpath = "//span[contains(text(),'Filters')]")
	public WebElement btnFilterFlyoutMobile;
	@FindBy(xpath = "//*[@data-auid='shopByCategory_tiles']")
	public WebElement imgHero_CLP;
	@FindBys({
			@FindBy(xpath = "//*[@data-auid='facetsModalContent_m']//div[contains(@data-auid,'facetdrawer_')]//i[contains(@class,'academyicon icon-plus')]") })
	public List<WebElement> filterIconPlusListMobile;
	@FindBys({
			@FindBy(xpath = "//*[@data-auid='facetsModalContent_m']//div[contains(@data-auid,'facetdrawer_')]//i[contains(@class,'academyicon icon-minus')]") })
	public List<WebElement> filterIconMinusListMobile;
	@FindBy(xpath = "//*[@data-auid='facetdrawer_drawer_Price_m']//i[@class='academyicon icon-plus']")
	public WebElement filterPricePlusBtnMobile;
	@FindBy(xpath = "//*[@data-auid='facetdrawer_drawer_Gender_m']//i[@class='academyicon icon-plus']")
	public WebElement filterGenderPlusBtnMobile;
	@FindBy(xpath = "//span[contains(text(),'CATEGORY')]//ancestor::div[contains(@data-auid,'facetdrawerdrawer')]")
	public WebElement filterCategoryPlusBtnMobile;
	@FindBy(xpath = "//*[@data-auid='facetdrawer_drawer_Brand_m']//i[@class='academyicon icon-plus']")
	public WebElement filterBrandPlusBtnMobile;
	@FindBy(xpath = "//*[@data-auid='facetdrawer_drawer_Color_m']//i[@class='academyicon icon-plus']")
	public WebElement filterColorPlusBtnMobile;
	@FindBy(xpath = "(//*[@data-auid='facetdrawer_drawer_Color_m']")
	public WebElement filterColorBtnMobile;
	@FindBy(xpath = "(//p[contains(text(),'Red')])[1]")
	public WebElement productname;
	@FindBy(xpath = "(//p[contains(text(),'Red')])[1]")
	public WebElement productname_mobile;
	@FindBy(xpath = "(//div[@class='row mt-1 justify-content-center']/div)")
	public WebElement countProductCardSuggestion; // ProductCount

	public boolean checkLoadedProductsPrices(int min, int max) {
		boolean flag = false;

		for (WebElement ele : productPriceList) {
			String priceTxt = ele.getText();
			logger.debug("Filtered Product Price::" + priceTxt);
			if (priceTxt != null && priceTxt.matches("-?\\d+")) {
				int productPrice = Integer.valueOf(priceTxt);
				if (min > productPrice && max <= productPrice) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}

		}

		/*
		 * if(!productPriceList.isEmpty() && productPriceList.size()>1 ){ int
		 * productSize = productPriceList.size();
		 * logger.debug("Filtered Product Result Size::"+productSize);
		 * 
		 * String firstProductPrice = productPriceList.get(0).getText(); String
		 * middleProductPrice =
		 * productPriceList.get(Math.round(productSize/2)).getText(); String
		 * lastProductPrice = productPriceList.get(productSize-1).getText();
		 * 
		 * logger.debug("Filtered Product Price: First:"+firstProductPrice);
		 * logger.debug("Filtered Product Price: Middle:"+middleProductPrice);
		 * logger.debug("Filtered Product Price: Last:"+lastProductPrice); }
		 */
		return flag;
	}

	public void checkLoadedProductsBrandName() {
		if (!facet_Brand_Names_List.isEmpty() && facet_Brand_Names_List.size() >= 1) {
			int productSize = facet_Brand_Names_List.size();
			logger.debug("Filtered Product Result Size::" + productSize);

			String firstProductPrice = facet_Brand_Names_List.get(0).getText();
			String middleProductPrice = facet_Brand_Names_List.get(Math.round(productSize / 2)).getText();
			String lastProductPrice = facet_Brand_Names_List.get(productSize - 1).getText();

			logger.debug("Filtered Product Brand: First:" + firstProductPrice);
			logger.debug("Filtered Product Brand: Middle:" + middleProductPrice);
			logger.debug("Filtered Product Brand: Last:" + lastProductPrice);
		}
	}

	public boolean checkedselectedfacet_container(List<WebElement> selectedfacet_containerList, String price,
			String brandName, String color) {
		boolean flag = false;
		for (WebElement element : selectedfacet_containerList) {
			String selectedfacetTxt = element.getText();
			logger.debug("checkedselectedfacet_container:: " + selectedfacetTxt);
			if (selectedfacetTxt != null && (selectedfacetTxt.contains(price) && selectedfacetTxt.contains(color))) {
				flag = true;
			}
		}
		return flag;
	}

	public boolean checkedselectedfacet_containerClearAll(List<WebElement> selectedfacet_containerList) {
		boolean flag = false;
		for (WebElement element : selectedfacet_containerList) {
			String selectedfacetTxt = element.getText();
			logger.debug("checkedselectedfacet_containerClearAll:: " + selectedfacetTxt);
			String str[] = selectedfacetTxt.split("\\r?\\n");
			for (String txt : str) {
				if (txt != null && txt.contains("Clear")) {
					String xpath = "//span[contains(text(),'" + txt + "')]"; // span[contains(text(),'$20 - $49.99')]
					flag = clickOnButton(getfindElementByXPath(xpath));
					logger.debug("price check clicked.....");
					break;

				}
			}
		}
		return flag;
	}

	public void expandFacetDrawer(WebElement facetDrawerElement) {
		scrollPageToWebElement(facetDrawerElement);

		clickOnButton(facetDrawerElement);
		clickOnButton(facetDrawerElement);
		clickOnButton(facetDrawerElement);
	}

	public void selectUnselectFacetCheckBox(List<WebElement> facet_price_CheckBox_List, String checkBoxName) {
		logger.debug(checkBoxName + "  ::__CheckBox_List Size:: " + facet_price_CheckBox_List.size());
		for (WebElement element : facet_price_CheckBox_List) {
			String checkBoxTxt = element.getText();
			logger.debug("Text::" + checkBoxTxt);
			if (checkBoxName != null && checkBoxTxt != null && checkBoxTxt.contains(checkBoxName)) {
				clickOnButton(element);
				break;
			}
		}
	}

	public void selectUnselectFacetCheckBoxByIndex(List<WebElement> facet_price_CheckBox_List, String checkBoxIndex) {

		logger.debug("  ::__CheckBox_List Size:: " + facet_price_CheckBox_List.size());
		for (WebElement element : facet_price_CheckBox_List) {
			String checkBoxTxt = element.getText();
			logger.debug("Text::" + checkBoxTxt);
			String str[] = checkBoxTxt.split("\\r?\\n");
			for (String txt : str) {
				if (txt != null && !txt.contains("Clear")) {
					/*
					 * if(txt.contains("(")){ int index = txt.indexOf("("); txt = txt.substring(0,
					 * index); }
					 */
					logger.debug(txt + ":Fianal:: " + txt);
					if (txt != null && txt.contains(checkBoxIndex)) {
						// String xpath ="//span[contains(text(),'"+checkBoxIndex+"')]";
						// //span[contains(text(),'$20 - $49.99')]
						clickOnButton(element);
						logger.debug("price check clicked.....");
						break;
					}
				}
			}

		}
	}

	public boolean checkCategoryIsExpand(List<WebElement> facet_price_CheckBox_List) {

		boolean isCategoryMinus = false;
		boolean isothersFacetsPlus = false;
		boolean flag = false;
		for (WebElement element : facet_price_CheckBox_List) {
			String facetsTxt = element.getText();
			logger.debug("&&&&&&&&&&& Filter Facets Txt:" + facetsTxt);
			String str[] = facetsTxt.split("\\r?\\n");
			for (String facetTxt : str) {
				if (facetTxt != null && !facetTxt.contains("Clear")) {
					if (facetTxt.contains("(")) {
						int index = facetTxt.indexOf("(");
						facetTxt = facetTxt.substring(0, index);
					}
					logger.debug("Final:: " + facetTxt);
					String xpath = "//span[text()='" + facetTxt + "']//following-sibling::i";
					logger.debug("facets plusMinus xpath::" + xpath);
					// WebElement ele =getDriver().findElementByXPath(xpath);
					WebElement ele = getfindElementByXPath(xpath);
					if (ele != null) {
						String plusMinusTxt = ele.getAttribute("class");
						logger.debug("facets plusMinusTxt::" + plusMinusTxt);
						if (facetTxt.contains("CATEGORY") && plusMinusTxt.contains("icon-minus")) {
							isCategoryMinus = true;
						}

						if (!facetTxt.contains("CATEGORY") && plusMinusTxt.contains("icon-minus")) {
							isothersFacetsPlus = false;
							break;
						} else {
							isothersFacetsPlus = true;
						}
					}

				}
			}

		}

		if (isCategoryMinus && isothersFacetsPlus) {
			flag = true;
		}
		logger.debug("checkCategoryIsExpand validation flag is::" + flag);
		return flag;
	}

	public void clickexpandFilterOption1(List<WebElement> facet_brand_CheckBox_List, String checkBoxName) {

		logger.debug("_______Size of Checkbox_____" + facet_brand_CheckBox_List.size());

		for (WebElement element : facet_price_CheckBox_List) {
			String checkBoxTxt = element.getText();
			logger.debug("Text::" + checkBoxTxt);
			if (checkBoxName != null && checkBoxTxt != null && checkBoxTxt.contains(checkBoxName)) {
				clickOnButton(element);
				break;
			}
		}
	}

	public boolean clickAllPlusFilterOptions() throws InterruptedException {
		Thread.sleep(Constants.thread_low);
		if ("mobile".equalsIgnoreCase(testtype)) {
			boolean flag = false;
			for (WebElement plusElement : filterIconPlusListMobile) {
				scrollPageToWebElement(plusElement);
				flag = clickOnButton(plusElement);
				if (!flag) {
					// break;
				} else {
					flag = true;
				}
			}

			return flag;
		} else {

			boolean flag = false;
			for (WebElement plusElement : filterIconPlusList) {
				flag = clickOnButton(plusElement);
				if (!flag) {
					break;
				} else {
					flag = true;
				}
			}
			return flag;
		}
	}

	public boolean checkAllfilterOptionsExpandedIsDisplayed() throws InterruptedException {
		Thread.sleep(Constants.thread_low);

		if ("mobile".equalsIgnoreCase(testtype)) {

			boolean flag = false;
			for (WebElement element : filterIconMinusListMobile) {
				scrollPageToWebElement(element);
				flag = isDisplayed(element);
				if (!flag) {
					// break;
				} else {
					flag = true;
				}
			}

			return flag;

		} else {

			boolean flag = false;
			for (WebElement element : filterIconMinusList) {
				flag = isDisplayed(element);
				if (!flag) {
					break;
				} else {
					flag = true;
				}
			}
			return flag;
		}
	}

	public boolean clickAllMinusFilterOptions() throws InterruptedException {
		Thread.sleep(Constants.thread_low);
		if ("mobile".equalsIgnoreCase(testtype)) {
			boolean flag = false;
			for (WebElement minusElement : filterIconMinusListMobile) {
				scrollPageToWebElement(minusElement);
				flag = clickOnButton(minusElement);
				if (!flag) {
					// break;
				} else {
					flag = true;
				}
			}

			return flag;

		} else {

			boolean flag = false;
			for (WebElement minusElement : filterIconMinusList) {
				flag = clickOnButton(minusElement);
				if (!flag) {
					break;
				} else {
					flag = true;
				}
			}
			return flag;
		}
	}

	public boolean checkAllfilterOptionCollapsedIsDisplayed() {
		if ("mobile".equalsIgnoreCase(testtype)) {

			boolean flag = false;
			for (WebElement element : filterIconPlusListMobile) {
				scrollPageToWebElement(element);
				flag = isDisplayed(element);
				if (!flag) {
					break;
				} else {
					flag = true;
				}
			}
			return flag;
		} else {

			boolean flag = false;
			for (WebElement element : filterIconPlusList) {
				flag = isDisplayed(element);
				if (!flag) {
					break;
				} else {
					flag = true;
				}
			}
			return flag;
		}
	}

	public void selectMultiplePriceOption() {

	}

	public boolean selectAllUnselectFacetCheckBox(List<WebElement> facet_price_CheckBox_List)
			throws InterruptedException {
		Thread.sleep(Constants.thread_low);
		boolean flag = false;
		logger.debug("CheckBox_List Size:: " + facet_price_CheckBox_List.size());
		for (WebElement element : facet_price_CheckBox_List) {
			String checkBoxTxt = element.getText();
			logger.debug("Text::" + checkBoxTxt);
			// clickOnButton(element);
			if (!clickOnButton(element)) {
				flag = false;
				break;
			} else {
				flag = true;
			}
			/*
			 * String str[]=checkBoxTxt.split("\\r?\\n"); for(String txt: str){ if(txt !=
			 * null && !txt.contains("Clear")){ if(txt.contains("(")){ int index =
			 * txt.indexOf("("); txt = txt.substring(0, index); }
			 * 
			 * logger.debug("Fianal:: "+txt); WebElement chkbox =
			 * getfindElementByXPath("//span[contains(text(),'"+txt+"')]");
			 * scrollPageToWebElement(chkbox); Thread.sleep(500); flag =
			 * clickOnButton(chkbox); //span[contains(text(),'$20 - $49.99')] if(!flag){ //
			 * break; }else{ flag = true; } } }
			 */
		}
		return flag;
	}

	public boolean checkboxProductCount(List<WebElement> facet_price_CheckBox_List) throws InterruptedException {
		boolean flag = false;
		Thread.sleep(Constants.thread_low);
		try {
			logger.debug("  ::__CheckBox_List Size:: " + facet_price_CheckBox_List.size());
			for (WebElement element : facet_price_CheckBox_List) {
				String checkBoxTxt = element.getText();
				logger.debug("Text::" + checkBoxTxt);
				String str[] = checkBoxTxt.split("\\r?\\n");
				for (String txt : str) {
					if (txt != null && !txt.contains("Clear")) {
						int productCount = Integer.parseInt(txt.substring(txt.indexOf("(") + 1, txt.indexOf(")")));
						logger.debug("Fianal Product Count:: " + productCount);
						if (productCount <= 0) {
							captureScreenShot(Constants.FAIL);
							flag = false;
							break;
						} else {
							flag = true;
						}
					}
				}

			}
		} catch (Exception e) {
			flag = false;
			logger.error("checkboxProductCount exception msg:: " + e.getMessage());
		}
		return flag;
	}

	public int getFilterCheckBoxsProductCount(List<WebElement> facet_price_CheckBox_List) throws InterruptedException {
		Thread.sleep(Constants.thread_low);
		int productCount = 0;
		try {
			logger.debug("  ::__CheckBox_List Size:: " + facet_price_CheckBox_List.size());
			for (WebElement element : facet_price_CheckBox_List) {
				String checkBoxTxt = element.getText();
				logger.debug("Text::" + checkBoxTxt);
				String str[] = checkBoxTxt.split("\\r?\\n");
				for (String txt : str) {
					if (txt != null && !txt.contains("Clear")) {
						if (txt.contains("(")) {
							txt = txt.substring(txt.indexOf("(") + 1, txt.indexOf(")"));
						}

						logger.debug("Fianal Product Count:: " + txt);

						productCount = productCount + Integer.parseInt(txt);
					}
				}

			}
		} catch (Exception e) {
			logger.error("checkboxProductCount exception msg:: " + e.getMessage());
		}
		return productCount;
	}

	public int getFacetProductCount(WebElement facetProductCount) throws InterruptedException {
		Thread.sleep(Constants.thread_low);
		int productCount = 0;
		try {
			String facetFilterTxt = getText(facetProductCount);
			logger.debug("facetFilterTxt::" + facetFilterTxt);
			if (facetFilterTxt != null && facetFilterTxt.contains("(")) {
				int index = facetFilterTxt.indexOf("(");
				String checkBoxstr = facetFilterTxt.substring(index + 1, facetFilterTxt.length() - 1);
				;
				logger.debug("Fianal Product Count:: " + checkBoxstr);

				productCount = productCount + Integer.parseInt(checkBoxstr);
			}
		} catch (Exception e) {
			logger.error("getFilterProductCount exception msg:: " + e.getMessage());
		}
		return productCount;
	}

	public boolean isPriceOptionSelected() throws InterruptedException {
		Thread.sleep(Constants.thread_low);
		boolean flag = false;
		for (WebElement element : chkbox_price_selected) {
			flag = isDisplayed(element);
			if (!flag) {
				break;
			} else {
				flag = true;
			}
		}
		return flag;
	}

	public void deSelectMultiplePriceOption() throws InterruptedException {
		Thread.sleep(Constants.thread_low);
		clickOnButton(chkbox_PriceOption1);
		clickOnButton(chkbox_PriceOption2);
		clickOnButton(chkbox_PriceOption3);
	}

	public boolean isPriceOptionDeSelected() throws InterruptedException {
		Thread.sleep(Constants.thread_low);
		boolean flag = false;
		for (WebElement element : chkbox_price_deselected) {
			flag = isDisplayed(element);
			if (!flag) {
				break;
			} else {
				flag = true;
			}
		}
		return flag;
	}

	public void verifyProductName() throws Exception {
		Thread.sleep(Constants.thread_low);
		if ("mobile".equalsIgnoreCase(testtype)) {
			String actualProductNameTxt = getText(Common_Web_SD.searchProductPO.productname_mobile);
			logger.debug("actualProductNameTxt:: " + actualProductNameTxt);
			assertTrue(actualProductNameTxt.contains("Red"));

		} else {
			String actualProductNameTxt = getText(Common_Web_SD.searchProductPO.productname);
			logger.debug("actualProductNameTxt:: " + actualProductNameTxt);

			assertTrue(actualProductNameTxt.contains("Red"));
		}
	}

	public boolean isFilterSelected(String xpath) {
		boolean flag = false;
		try {
			flag = isDisplayed(getfindElementByXPath(xpath));
		} catch (Exception e) {
			flag = false;
		}
		return flag;
	}

	public boolean checkedselectedfacet_container(List<WebElement> selectedfacet_containerList, String price,
			String color) {
		boolean flag = false;
		for (WebElement element : selectedfacet_containerList) {
			String selectedfacetTxt = element.getText();
			logger.debug("checkedselectedfacet_container:: " + selectedfacetTxt);
			if (selectedfacetTxt != null && (selectedfacetTxt.contains(price) && selectedfacetTxt.contains(color))) {
				flag = true;
			}
		}
		return flag;
	}

	public static int getItemsCount() {
		int count = 0;
		try {
			String strcount = itemscount.getText();
			if (strcount != null && strcount.matches(".*\\d+.*")) {
				count = Integer.parseInt(strcount.replaceAll("([,a-zA-Z ])", "").trim());
			}
		} catch (Exception e) {

		}
		return count;
	}

	public boolean verifyTextDisplayedOnPage(String expectedText) {
		waitForPageLoad(getDriver());
		String pageText = driver.getPageSource();
		return pageText.contains(expectedText);
	}
}
