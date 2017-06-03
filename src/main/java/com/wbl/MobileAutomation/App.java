package com.wbl.MobileAutomation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class App 
{
    public static void main( String[] args ) throws MalformedURLException
    {
    	//setting desired capabilities
    	DesiredCapabilities dc = new DesiredCapabilities();
    	dc.setCapability(MobileCapabilityType.VERSION, "23");
    	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
    	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
    	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus6");
    	dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\sibi\\workspace\\MobileAutomation\\MobileAutomation\\Resources\\yelp9.6.apk");
    	dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.yelp.android");
    	dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.yelp.android.ui.activities.RootActivity");
    	
    	AppiumDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.findElementById("accept_permission_button").click();
    	
    	//driver.findElementByXPath("android.widget.Button[@text='No, not now']").click();
    	driver.findElementById("deny_button").click();
    	driver.findElementById("login_button").click();
    	//driver.findElementById("sign_up_button").click();
    	driver.findElementById("activity_login_editUsername").sendKeys("sibi.mustapha@gmail.com");
    	driver.findElementById("activity_login_editPassword").sendKeys("rehman");
    	driver.findElementById("activity_login_btnLogin").click();
    	//driver.findElementByXPath("android.widget.Button[@text='Log In']").click();
    	//driver.closeApp();
    	////
    }
}
