package com.aso.qe.test.stepdefinition.web;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_HomePage_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class R1_SLR_K3274_SD extends CommonActionHelper{
	//private static final Logger logger = Logger.getLogger(R1SP1_KER_3274_Web_SD.class);

	R1_GlobalElementHeader_Home_PO globalElementHeader= PageFactory.initElements(driver, R1_GlobalElementHeader_Home_PO.class);
	//public ShoppingCartViewPO shoppingCartViewPO =  PageFactory.initElements(driver, ShoppingCartViewPO.class);
	public R1_HomePage_PO homePagePOM =  PageFactory.initElements(driver, R1_HomePage_PO.class);
	
	
	@Then("^User enter the search \"(.*?)\"$")
	public void User_enter_the_search(String str) throws Throwable {
		globalElementHeader.entertheSearchData(str);

	}
	@And("^User verifies the respective search results$")
	@Then("^User verifies the title for closest matching term$")
	public void User_verifies_the_title_for_closest_matching_termUser_verifies_the_title_for_closest_matching_term()
			throws Throwable {
		int sizeSuggestions = homePagePOM.SLRresults.size();
		int convertedResult = 0;
		String SLRdata = webPropHelper.getTestDataProperty("SLRdata");
		ArrayList<String> str = new ArrayList<String>();
		char[] searchData = SLRdata.toCharArray();
		for (WebElement SLRresult : homePagePOM.SLRresults) {
			int count = 0, j = 0, i = 0;
			char[] closestMatchData = SLRresult.getText().toCharArray();
			for (i = 0; i < searchData.length; i++) {
				if (i == j) {
					int SLRCal = searchData[i];
					int SLRResultCal = closestMatchData[j];
					if (SLRCal == SLRResultCal) {
						count++;
						j++;
					}
				} else {
					j++;
				}

			}
			if (count >= 2) {
				str.add(SLRresult.getText());
				convertedResult++;
			}
		}
		if (convertedResult == sizeSuggestions) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}

	}

	@Then("^User verifies the label for closest matching term$")
	public void User_verifies_the_label_for_closest_matching_term() throws Throwable {
		globalElementHeader.verifyTheLabelForSearch();

	}
	
//	@Then("^User verifies the respective search results$")
//	public void User_verifies_the_respective_search_results() throws Throwable {
//		assertTrue(isDisplayed(homePagePOM.result1));
//		assertTrue(isDisplayed(homePagePOM.result2));
//		assertTrue(isDisplayed(homePagePOM.result3));
//		assertTrue(isDisplayed(homePagePOM.result4));
//		assertTrue(isDisplayed(homePagePOM.result5));
//		
//
//	}
	
	@Then("^User verifies the respective search results clickable$")
	public void User_verifies_the_respective_search_results_clickable() throws Throwable {
		int sizeSuggestions = homePagePOM.SLRresults.size();
		int convertedResult = 0;
		String SLRdata = webPropHelper.getTestDataProperty("SLRdata");
		ArrayList<String> str = new ArrayList<String>();
		char[] searchData = SLRdata.toCharArray();
		for (WebElement SLRresult : homePagePOM.SLRresults) {
			int count = 0, j = 0, i = 0;
			char[] closestMatchData = SLRresult.getText().toCharArray();
			for (i = 0; i < searchData.length; i++) {
				if (i == j) {
					int SLRCal = searchData[i];
					int SLRResultCal = closestMatchData[j];
					if (SLRCal == SLRResultCal) {
						count++;
						j++;
					}
				} else {
					j++;
				}

			}
			if (count >= 2) {
				str.add(SLRresult.getText());
				convertedResult++;
			}
		}
		if (convertedResult == sizeSuggestions) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
		assertTrue(clickOnButton(driver.findElement(By.xpath("//*[text()='"+str.get(sizeSuggestions-1)+"']"))));
	}
	
				

}
