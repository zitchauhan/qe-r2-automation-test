package com.aso.qe.test.stepdefinition.ios;

import java.net.MalformedURLException;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	public Hooks() {
	}
	 
	    @Before
	    public void beforeHookfunction() throws MalformedURLException, InterruptedException{
	    	System.out.println("Before Scenario");
//	        at.iosSetup();
	    }
	 
	    @After
	    public void afterHookfunction() {
//	        at.quitIOSDriver();
	    }
}