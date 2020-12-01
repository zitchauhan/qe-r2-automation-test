package com.aso.qe.test.pageobject;

import java.util.List;
import static org.junit.Assert.assertTrue;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.stepdefinition.web.Common_Web_SD;

public class SEO_YEXT_PO extends CommonActionHelper {
	private static final Logger logger = Logger.getLogger(SEO_YEXT_PO.class);
	/*public static int productDisplayCount;
	
	@FindBys({ @FindBy(xpath = "//*[contains(@class,'c-price__sub')]") })
	public List<WebElement> productList;*/
	
	@FindBy(xpath="(//a[contains(text(),'Sign In')])[1]")
	public WebElement yextSignIn;
	
	@FindBy(xpath="//input[@id='username']")
	public WebElement username;

	@FindBy(xpath="//input[@id='password']")
	public WebElement password;
	
	@FindBy(xpath="//span[text()='Sign In']")
	public WebElement signInButton;
	
	@FindBy(xpath="//div[contains(text(),'Loading')]")
	public WebElement loader;
	
	/**
	 * Logs into YEXT.com
	 * @author mans5
	 * @throws Exception
	 */
	public void signIn() throws InterruptedException {
		logger.debug("Signing into Yext");
		clickOnButton(yextSignIn);
		setInputText(username, webPropHelper.getTestDataProperty("yextUsername"));
		setInputText(password, webPropHelper.getTestDataProperty("yextpassword"));
		clickOnButton(signInButton);
		logger.debug("Signed into Yext");
	}
	
	/**
	 * Selects an entity
	 * @author mans5
	 * @throws Exception
	 */
	public void selectExistingEntity(String entityFolder, String entity) throws InterruptedException {
		
		logger.debug("Selecting the entity");
		String entityFolderText = "//span[text()='"+entityFolder+"']";
		clickOnButton(getfindElementByXPath(entityFolderText));
		waitUntilLoadingFinishes(loader);
		Thread.sleep(5000);  //Mandatory wait time
		String entityText = "//strong[text()='"+entity+"']";
		clickOnButton(getfindElementByXPath(entityText));
		logger.debug("Selected the entity "+entity);
	}
	
	/**
	 * Modifies hours for the City
	 * @author mans5
	 * @throws Exception
	 */
	public void modifyHours(String day, String value) {
		
		
		
		
		
	}
	
	/*public boolean checkLoadedProductsPrices(int min, int max) {
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
					
					 * if(txt.contains("(")){ int index = txt.indexOf("("); txt = txt.substring(0,
					 * index); }
					 
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
	}*/
}
