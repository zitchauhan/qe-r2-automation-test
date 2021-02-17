package com.aso.qe.test.common;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.aso.qe.framework.common.PropertiesHelper;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class GlobalMobileHelper {
	
	private PropertiesHelper propHelper = PropertiesHelper.getInstance();
	public static AppiumDriver<MobileElement> driver;
	
	public void initializeDriver() throws MalformedURLException {
		String platform = propHelper.getConfigPropProperty("i.platform");
//		String udid = propHelper.getConfigPropProperty("i.udid");
		String platformVersion = propHelper.getConfigPropProperty("i.platformVersion");
		String deviceName = propHelper.getConfigPropProperty("i.deviceName");
		String url = propHelper.getConfigPropProperty("appiumServerURL");
		String app = propHelper.getConfigPropProperty("i.app");
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME,platform);
//		caps.setCapability(MobileCapabilityType.UDID,udid);
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,platformVersion);
		caps.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
		
	    if(platform.equalsIgnoreCase("iOS")) {
	    	driver = new IOSDriver<MobileElement>(new URL(url),caps);
	    }
	    else if(platform.equalsIgnoreCase("android")) {
	    	driver = new AndroidDriver<MobileElement>(new URL(url),caps);
	    }
	}
}
