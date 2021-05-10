package com.aso.qe.test.pageobject.ios;

import org.apache.log4j.Logger;

import com.aso.qe.test.common.GlobalMobileHelper;
import com.aso.qe.test.common.GlobalMobileHelper.Direction;
import com.aso.qe.test.common.Locators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BazzarVoicePage {
	
private AppiumDriver<MobileElement> driver;
	
	private static final Logger logger = Logger.getLogger(OrderHistoryDetailPage.class.getName());
	
	
	public BazzarVoicePage(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	
/* created by Nirmal - OMNI-22055 -07.05.2021 */

	
	public boolean isReviewElementDisplay(String element) {
		switch(element) {
		case "Review":
			return GlobalMobileHelper.isElementDisplayed(Locators.BazzarVoice.labelReview);
		case "Question":
			return GlobalMobileHelper.isElementDisplayed(Locators.BazzarVoice.labelQuestion);
		case "Sort":
			return GlobalMobileHelper.isElementDisplayed(Locators.BazzarVoice.buttonSort);
		case "Ask A Question":
			return GlobalMobileHelper.isElementDisplayed(Locators.BazzarVoice.buttonAskQuestion);
		case "Back":
			return GlobalMobileHelper.isElementDisplayed(Locators.BazzarVoice.buttonBack);
		case "QA":
			return GlobalMobileHelper.isElementDisplayed(Locators.BazzarVoice.linkQA);
		case "Answer This Question":
			return GlobalMobileHelper.isElementDisplayed(Locators.BazzarVoice.buttonAnswerThisQuestion);
		default:
			throw new IllegalStateException("Invalid Element");
		}
	}
	
	
	public boolean isAskAQuestionElementDisplay(String element) {
		switch(element) {
		case "ProductImage":
			return GlobalMobileHelper.isElementDisplayed(Locators.BazzarVoice.productImage);
		case "ProductName":
			return GlobalMobileHelper.isElementDisplayed(Locators.BazzarVoice.productName);
		case "Questions":
			return GlobalMobileHelper.isElementDisplayed(Locators.BazzarVoice.labelQuestion);
		case "Nickname":
			return GlobalMobileHelper.isElementDisplayed(Locators.BazzarVoice.labelNickname);
		case "Location":
			return GlobalMobileHelper.isElementDisplayed(Locators.BazzarVoice.labelLocation);
		case "Email":
			return GlobalMobileHelper.isElementDisplayed(Locators.BazzarVoice.labelEmail);
		case "Post Question":
			return GlobalMobileHelper.isElementDisplayed(Locators.BazzarVoice.buttonPostQuestion);
		case "Terms Condition":
			return GlobalMobileHelper.isElementDisplayed(Locators.BazzarVoice.chkBoxTermsCondition);
		case "Questions input":
			return GlobalMobileHelper.isElementDisplayed(Locators.BazzarVoice.inputBoxQuestion);
		case "Nickname input":
			return GlobalMobileHelper.isElementDisplayed(Locators.BazzarVoice.inputBoxNickName);
		case "Location input":
			return GlobalMobileHelper.isElementDisplayed(Locators.BazzarVoice.inputBoxLocation);
		case "Email input":
			return GlobalMobileHelper.isElementDisplayed(Locators.BazzarVoice.inputBoxEmail);
		default:
			throw new IllegalStateException("Invalid Element");
		}
	}
	
	public boolean isAnswerThisQuestionElementDisplay(String element) {
		switch(element) {
		case "Poster user name":
			return GlobalMobileHelper.isElementDisplayed(Locators.BazzarVoice.posterUsername);
		case "Question description":
			return GlobalMobileHelper.isElementDisplayed(Locators.BazzarVoice.labelQuestionDescription);
		case "Answer user name":
			return GlobalMobileHelper.isElementDisplayed(Locators.BazzarVoice.answerUsername);
		case "Answer description":
			return GlobalMobileHelper.isElementDisplayed(Locators.BazzarVoice.labelAnswerDescription);
		case "Yes Button":
			return GlobalMobileHelper.isElementDisplayed(Locators.BazzarVoice.buttonYes);
		case "No Button":
			return GlobalMobileHelper.isElementDisplayed(Locators.BazzarVoice.buttonNo);
		case "Report Button":
			return GlobalMobileHelper.isElementDisplayed(Locators.BazzarVoice.buttonReport);
		case "input box post":
			return GlobalMobileHelper.isElementDisplayed(Locators.BazzarVoice.inputBoxPostAnswer);
		case "Post Answer":
			return GlobalMobileHelper.isElementDisplayed(Locators.BazzarVoice.labelPostAnswer);
		default:
			throw new IllegalStateException("Invalid Element");
		}
	}
	
	public void tapOnButton(String element) {
		switch(element) {		
		case "Yes Button":
			 GlobalMobileHelper.tapOnElement(Locators.BazzarVoice.buttonYes);
		case "No Button":
			 GlobalMobileHelper.tapOnElement(Locators.BazzarVoice.buttonNo);
		case "QA":
			 GlobalMobileHelper.tapOnElement(Locators.BazzarVoice.linkQA);
		case "Sort":
			 GlobalMobileHelper.tapOnElement(Locators.BazzarVoice.buttonSort);
		case "Ask A Question":
			 GlobalMobileHelper.tapOnElement(Locators.BazzarVoice.buttonAskQuestion);
		case "Post Question":
			 GlobalMobileHelper.tapOnElement(Locators.BazzarVoice.buttonPostQuestion);	 
		case "Answer This Question":
			 GlobalMobileHelper.tapOnElement(Locators.BazzarVoice.buttonAnswerThisQuestion);
		case "Post Answer":
			 GlobalMobileHelper.tapOnElement(Locators.BazzarVoice.buttonPostAnswer);
		case "Terms Condition CheckBox":
			 GlobalMobileHelper.tapOnElement(Locators.BazzarVoice.buttonPostAnswer);
		default:
			throw new IllegalStateException("Invalid Element");
		}
	}
	
	public void enterText(String element,String text) {
		switch(element) {		
		case "Question":
		     GlobalMobileHelper.setText(Locators.BazzarVoice.inputBoxQuestion, text);			 
		case "Nickname":
			 GlobalMobileHelper.setText(Locators.BazzarVoice.inputBoxNickName,text);
		case "Location":
			 GlobalMobileHelper.setText(Locators.BazzarVoice.inputBoxLocation,text);
		case "Email":
			 GlobalMobileHelper.setText(Locators.BazzarVoice.inputBoxEmail,text);
		case "Answer":
			 GlobalMobileHelper.setText(Locators.BazzarVoice.inputBoxPostAnswer,text);
		default:
			throw new IllegalStateException("Invalid Element");
		
		}
	}
	
	public void screenDownTillPostAnswer() {
		
		
	    GlobalMobileHelper.swipeTillElementDisplayed(Direction.DOWN, Locators.BazzarVoice.buttonPostAnswer);
	}
	
}
