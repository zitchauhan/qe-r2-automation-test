package com.aso.qe.test.pageobject.ios;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.Locators;

public class ProductlistingPage extends GlobalMobileHelper {
	public boolean verifyRatingsAndReview() {
		String ratingsAndReviewCount=driver.findElement(Locators.PLPPage.rating).getText();
		boolean stat =ratingsAndReviewCount.contains("Product rating 4 and reviews 7");
		return stat;	
	}

}
