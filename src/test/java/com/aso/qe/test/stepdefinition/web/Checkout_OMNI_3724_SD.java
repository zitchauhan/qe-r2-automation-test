package com.aso.qe.test.stepdefinition.web;

import org.openqa.selenium.support.PageFactory;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.framework.common.Constants;
import com.aso.qe.test.pageobject.R1_SearchProduct_PO;
import com.aso.qe.test.pageobject.R2_CheckOut_PO;
import com.aso.qe.test.pageobject.R2_MyAccount_PO;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

public class Checkout_OMNI_3724_SD extends CommonActionHelper {
	
	R2_CheckOut_PO r2CheckOutPo = PageFactory.initElements(driver, R2_CheckOut_PO.class);
	R2_MyAccount_PO r2MyAccountPO = PageFactory.initElements(driver, R2_MyAccount_PO.class);
	R1_SearchProduct_PO r1_SearchPO = PageFactory.initElements(getDriver(), R1_SearchProduct_PO.class);

	@And("^user hit add to cart URL for \"(.*?)\" product$")
	public void user_hit_add_to_cart_URL(String arg1) throws Throwable{
		if(arg1.equalsIgnoreCase("one"))
		{
			driver.get(webPropHelper.getTestDataProperty("AddToCartURL_ForOne"));
			Thread.sleep(Constants.thread_highest);
		}
		else if(arg1.equalsIgnoreCase("two"))
		{
			driver.get(webPropHelper.getTestDataProperty("AddToCartURL_ForTwo"));
			Thread.sleep(Constants.thread_highest);
		}
		
	}
	
	@Then("^user verifies correct productID and quantity is visible on the cart page for \"(.*?)\" product$")
	public void user_verifies_correct_productID_and_quantity_is_visible_on_the_cart_page(String arg1) throws Throwable
	{
		if(arg1.equalsIgnoreCase("one")) {
			String currenturl = webPropHelper.getTestDataProperty("AddToCartURL_ForOne");
		
		//https://uat7www.academy.com/shop/cart?atcProducts=025438979_1&debug=aso
			String spliturl = currenturl.substring(50, currenturl.length()-10);
			System.out.println("product id and qt is " +spliturl);
		
			String[] prodandqty = spliturl.split("_");
			String urlproductid = prodandqty[0];
			String urlquantity = prodandqty[1];
			System.out.println("Product ID is " +urlproductid + " and Quantity is " +urlquantity);
		
			String actualqty = r2CheckOutPo.cartQtyValue.get(0).getAttribute("value");
			
			//String actualproductid = ; how to verify correct product is visible?
			
			try {
				assertEquals(urlquantity, actualqty); 	
			}
			catch(AssertionError e) {
				System.out.println("Quantity visible on the cart page is NOT equal to what is given in the add to cart via URL");
			}
			System.out.println("Quantity visible on cart page is Equal to what is in the add to cart URL");
		}
		
		else if(arg1.equalsIgnoreCase("two")) {
			String currenturlb = webPropHelper.getTestDataProperty("AddToCartURL_ForTwo");
			
			//https://uat7www.academy.com/shop/cart?atcProducts=117397048_1,103379341_2&debug=aso
			String spliturlb = currenturlb.substring(50, currenturlb.length()-10);	
			System.out.println("product id and qt is " +spliturlb);
			//117397048_1,103379341_2
			
			String[] prodandqty = spliturlb.split(",");
			ArrayList<String> arrayofqty = new ArrayList<String>();
			for(int i=0; i<prodandqty.length; i++)
			{
				//System.out.println(prodandqty[i]);
				String[] extractedproductid = prodandqty[i].split("_");
				//System.out.println(extractedproductid.length);
				
				for(int row=1; row<2; row++)
				{
					for(int col=1; col<2; col++ )
					{
					System.out.println(extractedproductid[col]);
				     
				     arrayofqty.add(extractedproductid[col]);
					}
				}
			}
			System.out.println(arrayofqty.get(0));
			System.out.println(arrayofqty.get(1));
			String urlqtyone = arrayofqty.get(0);
			String urlqtytwo = arrayofqty.get(1);
			
			String actualqtyone =r2CheckOutPo.cartQtyValue.get(0).getAttribute("value");
			String actualqtytwo = r2CheckOutPo.cartQtyValue.get(1).getAttribute("value");
			
			try {
			assertEquals(urlqtytwo, actualqtyone);
			assertEquals(urlqtyone, actualqtytwo);
			}
			catch(AssertionError e)
			{
				System.out.println("Quantity visible on the cart page is NOT equal to what is given in the add to cart via URL");
			}
			System.out.println("Quantity visible on the cart page is MATCHES to what is given in the add to cart via URL");
			
		}
	}
	
	

}
