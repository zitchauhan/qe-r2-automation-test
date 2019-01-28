package com.aso.qe.test.common;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.aso.qe.framework.common.CommonActionHelper;
import com.aso.qe.test.pageobject.R1_FindStore_PO;
import com.aso.qe.test.pageobject.R1_GlobalElementHeader_Home_PO;
import com.aso.qe.test.pageobject.R1_SearchProduct_PO;
public class Common_Web_PLCC extends CommonActionHelper
{
	private static final Logger logger = Logger.getLogger(Common_Web_PLCC.class);
	public R1_FindStore_PO findStorePO;
	public static R1_GlobalElementHeader_Home_PO globalElementHeader;
	public static R1_SearchProduct_PO searchProductPO;
	
	public static final long ELEMWAITTIME_FAST = 5;//wait 20 seconds for element to  load (between 10 to 20 Seconds) 
    public static final long ELEMWAITTIME_SLOW = 25;//wait 40 seconds for element to load (between 20 to 30 Seconds) 
    public static final long ELEMWAITTIME_MEDIUM = 17;//wait 40 seconds for element to load(above 40 but less than 70 Seconds) 
    public static final long PAGEWAITTIME = 10;//wait 30 seconds for page  load 
    public static final long PAGEWAITTIME_SLOW = 20;//wait 70 seconds for page load 

    /**
     * Converts WebElement to ByType element
     */
     public static By toByVal(WebElement element) {
         // By format = "[foundFrom] -> locator: term"
         // see RemoteWebElement toString() implementation
         String[] data = element.toString().split(" -> ")[1].replace("]", "").split(": ");
         String locator = data[0];
         String term = data[1];

         switch (locator) {
         case "xpath":
             return By.xpath(term);
         case "css selector":
             return By.cssSelector(term);
         case "id":
             return By.id(term);
         case "tag name":
             return By.tagName(term);
         case "name":
             return By.name(term);
         case "link text":
             return By.linkText(term);
         case "class name":
             return By.className(term);
         }
         return (By) element;
     }

     /**
     * @param driver
     * @param timeOutInSeconds
     * @throws InterruptedException
     */
     public static void waitUntilElePresent(WebDriver driver, WebElement Element, long timeOutInSeconds) throws InterruptedException {

           WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
           By element = toByVal(Element);
     wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
     } 



	}
